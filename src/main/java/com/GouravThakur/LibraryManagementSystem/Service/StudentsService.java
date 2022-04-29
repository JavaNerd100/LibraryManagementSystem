package com.GouravThakur.LibraryManagementSystem.Service;


import com.GouravThakur.LibraryManagementSystem.Pojo.Students;
import com.GouravThakur.LibraryManagementSystem.Repo.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public StudentsService(StudentsRepository studentsRepository) {
        this.studentsRepository= studentsRepository;
    }

    public List<Students> printStudent() {
        List<Students> students = new ArrayList<>();
        studentsRepository.findAll().forEach(students::add);
        return students;
    }

    public Students updateStudent(Students students) {
        return studentsRepository.save(students);
    }

    public Students deleteStudent(Students students, int id) {
        studentsRepository.delete(students);
        return students;
    }

    public void save(List<Students> students) {
        studentsRepository.saveAll(students);
    }

    public Students addStudent(Students students) {
        return studentsRepository.save(students);
    }

    public Students checkingDefaulters(Students students, int day) {
        if (day > 7){
            System.out.println("this student is defaulter " + "  "+ students);
        }
        else{
            System.out.println("this student is not defaulter" + " " + students);
        }
        return students;
    }
}
