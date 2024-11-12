package com.wicakson0.crud.service;

import com.wicakson0.crud.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wicakson0.crud.model.Student;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAllEntities() {
        return studentRepository.findAll();
    }

    public Student findEntityById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveEntity(Student entity) {
        return studentRepository.save(entity);
    }

    public void deleteEntity(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateEntity(Long Id, String newName, Integer newAge) {
        Optional<Student> studentOptional = studentRepository.findById(Id);
        if (studentOptional.isPresent()){
            Student student = studentOptional.get();
            student.setName(newName);
            student.setAge(newAge);
            return studentRepository.save(student);
        } else {
            throw new EntityNotFoundException("Student with the following Id not Found: " + Id);
        }
    }
}
