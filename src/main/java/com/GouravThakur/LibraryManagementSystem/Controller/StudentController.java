package com.GouravThakur.LibraryManagementSystem.Controller;

import com.GouravThakur.LibraryManagementSystem.Pojo.Students;
import com.GouravThakur.LibraryManagementSystem.Service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {


    @Autowired
    private StudentsService studentsService;

    @GetMapping("/list/students")
    public List<Students> printStudent() {
        return studentsService.printStudent();
    }

    @RequestMapping(method= RequestMethod.POST, value = "/list/add/students")
    public  Students addStudent(@RequestBody Students students) {
        return studentsService.addStudent(students);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/list/update/students")
    public Students updateStudent( @RequestBody Students students ){
        return studentsService.updateStudent(students);
    }

    @RequestMapping(method= RequestMethod.DELETE, value = "/list/delete/students/{id}")
    public Students deleteStudent(@RequestBody Students students, @PathVariable int id){
        return studentsService.deleteStudent(students, id);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/defaultersList/{date}")
    public Students checkingDefaulters(@RequestBody Students students, @PathVariable String date){
        LocalDate currentDate = LocalDate.parse(date);
        int day = currentDate.getDayOfMonth();
        System.out.println(day);
        return studentsService.checkingDefaulters(students,day);
    }


}
