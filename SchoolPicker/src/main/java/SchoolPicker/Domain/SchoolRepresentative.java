package SchoolPicker.Domain;

/**
 * Created by Kino on 2017-08-07.
 */
public class SchoolRepresentative
{
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSchool() {
        return school;
    }

    public String getJobType() {
        return jobType;
    }

    public String getRepid() {
        return repid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setRepid(String repid) {
        this.repid = repid;
    }

    private String name;
    private String surname;
    private String school;
    private String jobType;
    private String repid;

    private SchoolRepresentative(Builder builder)
    {
        this.repid = builder.repid;

    }

    public static class Builder
    {
        private String name, surname, school, jobType, repid;

        public Builder name(String n)
        {
            this.name = n;
            return this;
        }

        public Builder surname(String sn)
        {
            this.surname = sn;
            return this;
        }

        public Builder school(String s)
        {
            this.school = s;
            return this;
        }

        public Builder jobType(String j)
        {
            this.jobType = j;
            return this;
        }

        public Builder repid(String r)
        {
            this.repid = r;
            return this;
        }

        public SchoolRepresentative build()
        {
            return new SchoolRepresentative(this);
        }
    }

}
