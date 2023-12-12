import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school1 = new School(1, "school1");
        School school2 = new School(2, "school2");
        School school3 = new School(3, "school3");
        List<School> schoolList = Arrays.asList(school1, school2, school3);

        Aggregate<School> schools = new Aggregate<School>(schoolList);

        Iterator<School> iterator =  schools.createIterator();

        while(iterator.hasNext()){
            School school = iterator.next();
            school.schoolDetails();
        }
    }
}