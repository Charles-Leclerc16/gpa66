package cuz.gpa.model;

public class Student {
    private String id;
    private String name;
    private String gender;
    private double gpa;

    public Student(String id, String name, String gender, double gpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Student)) return false;
        final Student other = (Student) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        if (Double.compare(this.getGpa(), other.getGpa()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Student;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final long $gpa = Double.doubleToLongBits(this.getGpa());
        result = result * PRIME + (int) ($gpa >>> 32 ^ $gpa);
        return result;
    }

    public String toString() {
        return "Student(id=" + this.getId() + ", name=" + this.getName() + ", gender=" + this.getGender() + ", gpa=" + this.getGpa() + ")";
    }
}
