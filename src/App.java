import java.util.ArrayList;
import java.util.List;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {
        StudentRepository studentRepository = new StudentRepository();

        // StudentEntity entity = new StudentEntity();
        // entity.setNic("923360139V");
        // entity.setName(new StudentName("DEF", "UVW"));
        // List<String> mobiles = new ArrayList<>();
        // mobiles.add("0746556782");
        // mobiles.add("0746566689");
        // entity.setMobiles(mobiles);

        // Integer id = studentRepository.saveStudent(entity);
        // System.out.println(id);

        StudentEntity s1 = studentRepository.getStudent(1);
        System.out.println(s1);

        s1.setNic("923350149V");
        s1.getName().setFName("ABC");
        s1.getName().setLName("XYZ");

        studentRepository.saveStudent(s1);

        s1 = studentRepository.getStudent(2);
        System.out.println(s1);

        studentRepository.deleteStudent(s1);
    }
}