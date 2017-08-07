package SchoolPicker.Domain;

/**
 * Created by Kino on 2017-08-07.
 */
public class School
{
    public String getSchoolId() {
        return schoolId;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getGradeOffered() {
        return gradeOffered;
    }



    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGradeOffered(String gradeOffered) {
        this.gradeOffered = gradeOffered;
    }

    private String schoolId;
    private String schoolType;
    private String country;
    private String province;
    private String contact;
    private String email;
    private String gradeOffered;

    private School(Builder builder)
    {
        this.schoolId = builder.schoolId;
        this.email = builder.email;
    }

    public static class Builder
    {
        private String schoolId, schoolType, country, province, contact, email, gradeOffered;

        public Builder schoolid(String id)
        {
            this.schoolId = id;
            return this;
        }

        public Builder schoolType(String type)
        {
            this.schoolType = type;
            return this;
        }

        public Builder country(String c)
        {
            this.country = c;
            return this;
        }

        public Builder province(String p)
        {
            this.province = p;
            return this;
        }

        public Builder contact(String c)
        {
            this.contact = c;
            return this;
        }

        public Builder email(String e)
        {
            this.email = e;
            return this;
        }

        public Builder gradeOffered(String g)
        {
            this.gradeOffered = g;
            return this;
        }

        public School build()
        {
            return new School(this);
        }

    }


}
