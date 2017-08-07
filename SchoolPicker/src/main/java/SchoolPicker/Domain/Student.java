package SchoolPicker.Domain;

/**
 * Created by Kino on 2017-08-07.
 */
public class Student
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFocusArea() {
        return focusArea;
    }

    public void setFocusArea(String focusArea) {
        this.focusArea = focusArea;
    }



    public String getStudenID() {
        return studenID;
    }

    public void setStudenID(String studenID) {
        this.studenID = studenID;
    }

    private Student(Builder builder)
    {
        this.studenID = builder.studentID;

    }

    private String studenID;
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String grade;
    private String focusArea;


    public static class Builder
    {
        private String name, surname, age, gender, grade, focusArea, studentID;

        public Builder name(String n)
        {
            this.name = n;
            return this;
        }

        public Builder studentID(String n)
        {
            this.studentID = n;
            return this;
        }

        public Builder surname(String sn)
        {
            this.surname = sn;
            return this;
        }

        public Builder age(String a)
        {
            this.age = a;
            return this;
        }

        public Builder gender(String g)
        {
            this.gender = g;
            return this;
        }

        public Builder grade(String g)
        {
            this.grade = g;
            return this;
        }

        public Builder focusArea(String f)
        {
            this.focusArea = f;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }

    }

}
