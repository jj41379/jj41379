
import java.util.List;
import java.util.ArrayList;

public class Student extends Person
{
    private String groupId;
    private List<Double> grades = new ArrayList<>();
    public Student(String firstName, String lastName, String emailAddress, String groupId) {
    super(firstName, lastName, emailAddress);
    this.groupId = groupId;
    }
    
    public String getGroupId() {
    return groupId;
}

    public void setGroupId(String groupId) {
    this.groupId = groupId;
}
    
    public List<Double> getGrades() {
    return grades;
}

    public void addGrade(double grade) {
    grades.add(grade);
}
    
    public double getGradesAverage(){
        double sum = 0;
        for(int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        return sum/grades.size();
    }
}
