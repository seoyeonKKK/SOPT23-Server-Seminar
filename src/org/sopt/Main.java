package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final ArrayList<University> universityArrayList = new ArrayList<>();
        final ArrayList<Department> departmentArrayList = new ArrayList<>();
        final ArrayList<Professor> professorArrayList = new ArrayList<>();
        final ArrayList<Student> studentArrayList = new ArrayList<>();


        final Student student1 = new Student(1,"덕성여자대학교","02-000-0000","서울시",
                0,"IT미디어공학","02-123-4567","공과대학",
                0,"권서연",3,"IT미디어공학","syeon0204@naver.com","서울시",22,"재학");
        final Student student2 = new Student(2,"덕성대학교","02-111-1111","서울시",
                0,"IT공학","02-123-1234","공과대학",
                1,"권재림",4,"IT공학","jaeleum@gmail.com","서울시",24,"재학");
        final Student student3 = new Student(3,"성신여자대학교","02-222-2222","서울시",
                0,"피아노학과","02-765-4321","예술대학",
                77,"임수정",4,"피아노학과","crystal@gmail.com","서울시",27,"재학");

        final University university1 = new University(1,"덕성여자대학교","02-000-0000","서울시");
        final University university2 = new University(2,"덕성대학교","02-111-1111","서울시");
        final University university3 = new University( 3,"성신여자대학교","02-222-2222","서울시");

        final Department department1 = new Department(1,"덕성여자대학교","02-000-0000","서울시",
                0,"IT미디어공학","02-123-4567","공과대학");
        final Department department2 = new Department(2,"덕성대학교","02-111-1111","서울시",
                0,"IT공학","02-123-1234","공과대학");
        final Department department3 = new Department(3,"성신여자대학교","02-222-2222","서울시",
                0,"피아노학과","02-432-4321","예술대학");

        final Professor professor1 = new Professor(1,"덕성여자대학교","02-000-0000","서울시",
                0,"IT미디어공학","02-123-4567","공과대학",
                0,"송현주","IT미디어공학","010-000-0000","HCI");
        final Professor professor2 = new Professor(2,"덕성대학교","02-111-1111","서울시",
                0,"IT공학","02-123-1234","공과대학",
                1,"송송송","IT공학","010-111-1111","파이썬");
        final Professor professor3 = new Professor(1,"성신여자대학교","02-222-2222","서울시",
                0,"피아노학과","02-765-4321","예술대학",
                2,"현현현","피아노","010-333-3333","클래식");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        universityArrayList.add(university1);
        universityArrayList.add(university2);
        universityArrayList.add(university3);

        professorArrayList.add(professor1);
        professorArrayList.add(professor2);
        professorArrayList.add(professor3);

        departmentArrayList.add(department1);
        departmentArrayList.add(department2);
        departmentArrayList.add(department3);


        for(final University u : universityArrayList) {
            System.out.println(u.toString());
        }

        for(final Student s : studentArrayList) {
            System.out.println(s.toString());
        }

        for(final Department d : departmentArrayList) {
            System.out.println(d.toString());
        }

        for(final Professor p : professorArrayList) {
            System.out.println(p.toString());
        }
    }
}
