/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.udea.dao;

import javax.ejb.Stateless;

/**
 *
 * @author USUARIO
 */
@Stateless
public class ClienteDAO implements ClienteDAOLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public void addStudent(Student student) {
    }

    @Override
    public void editStudent(Student student) {
    }

    @Override
    public void deleteStudent(int studentId) {
    }

    @Override
    public Student getStudent(int studentId) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

}
