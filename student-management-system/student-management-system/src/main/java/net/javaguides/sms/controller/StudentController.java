package net.javaguides.sms.controller;

import jakarta.validation.Valid;
import net.javaguides.sms.dto.StudentDto;
import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    //handler methods to handle list students request.
    @GetMapping("/students")
    public String listStudents(Model model){
        List<StudentDto> students_dto = studentService.getAllStudents();
        model.addAttribute("students",students_dto); //in thymeleaf template we will acess with returned string of handler method.
        return "students";
    }

    //A handler method to handle new students
    @GetMapping("/students/new")
    public String newStudent(Model model){

        //Student model object to store student form data.
        StudentDto studentDto = new StudentDto();
        model.addAttribute("student",studentDto);
        return "create_student";
    }


    //handler method to save student from form.
    @PostMapping("/students")
    public String saveStudent(@Valid @ModelAttribute("student") StudentDto studentDto, BindingResult result,Model model)
    { //We use model attribute to map from html object to java object using post request.
        if(result.hasErrors()){
            model.addAttribute("student",studentDto);         //if incoming details are not valid we are using has errors function and returning to form page only.
            return "create_student";

        }
        studentService.createStudent(studentDto);
        return "redirect:/students";
    }

    @GetMapping("/students/{studentId}/edit")
    public String editStudent(@PathVariable Long studentId, Model model){
        StudentDto studentDto = studentService.getStudentById(studentId);
        model.addAttribute("student",studentDto);
        return "edit_student";

    }

    @PostMapping("/students/{studentId}")
    public String updateStudent(@PathVariable("studentId") Long studentId, @Valid @ModelAttribute("student") StudentDto studentDto, BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("student",studentDto);
            return "edit_student";
        }

        studentDto.setId(studentId);
        studentService.updateStudent(studentDto);
        return "redirect:/students";
    }

    //handler method to delete a record from db.
    @GetMapping("/students/{studentId}/delete")
    public String deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
        return "redirect:/students";
    }

    @GetMapping("/students/{studentId}/view")
    public String viewStudent(@PathVariable("studentId") Long studentId, Model model){
        StudentDto studentDto = studentService.getStudentById(studentId);
        model.addAttribute("student",studentDto);
        return "view_student";
    }


}
