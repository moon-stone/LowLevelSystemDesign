public class School {
    private int schoolId;
    private String schoolName;

    School(int id, String name){
        this.schoolId = id;
        this.schoolName = name;
    }

    public void schoolDetails(){
        System.out.println("School name and Id : " +this.schoolName+ " : " + this.schoolId);
    }
}
