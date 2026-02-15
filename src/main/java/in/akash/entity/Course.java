package in.akash.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.classfile.attribute.LineNumberInfo;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {

    @Id
    private Integer courseId;
    private String coursename;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "courses")
    List<Student> students = new ArrayList<>();

}
