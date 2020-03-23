
public class Teacher extends Person
{
    private String CourseName;
    public Teacher(String firstName, String lastName, String emailAddress, String CourseName){
        super(firstName, lastName, emailAddress);
        this.CourseName=CourseName;
    }
    
    public String getCourseName() {
    return CourseName;
}

    public void setCourseName(String CourseName) {
    this.CourseName = CourseName;
}
    
}
