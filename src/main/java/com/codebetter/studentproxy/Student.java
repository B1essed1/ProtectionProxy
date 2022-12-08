package com.codebetter.studentproxy;

public class Student implements DailySession{

    private Attendance attendance;

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public Student(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public void attendLesson() {
        System.out.println("Student is present: "+attendance.getDate());
    }
}
