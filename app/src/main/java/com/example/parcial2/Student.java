package com.example.parcial2;

public class Student {

    private String Name;
    private String LastName;
    private String ID;
    private double GradeOne;
    private double GradeTwo;
    private double GradeThree;
    private double FinalGrade;

    public Student(String name, String lastName, String ID, double gradeOne, double gradeTwo, double gradeThree, double finalGrade) {
        Name = name;
        LastName = lastName;
        this.ID = ID;
        GradeOne = gradeOne;
        GradeTwo = gradeTwo;
        GradeThree = gradeThree;
        FinalGrade = finalGrade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getGradeOne() {
        return GradeOne;
    }

    public void setGradeOne(double gradeOne) {
        GradeOne = gradeOne;
    }

    public double getGradeTwo() {
        return GradeTwo;
    }

    public void setGradeTwo(double gradeTwo) {
        GradeTwo = gradeTwo;
    }

    public double getGradeThree() {
        return GradeThree;
    }

    public void setGradeThree(double gradeThree) {
        GradeThree = gradeThree;
    }

    public double getFinalGrade() {
        return FinalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        FinalGrade = finalGrade;
    }

    public void SaveStudent(){
        Data.Save(this);
    }
}
