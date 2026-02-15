package in.akash.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
            @JoinTable(name = "STUDENT_COURSE",
                    joinColumns = @JoinColumn(name = "SID_FK"),
                    inverseJoinColumns = @JoinColumn(name = "CID_FK")
            )
    List<Course> courses = new ArrayList<>();

}
