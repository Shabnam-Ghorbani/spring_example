package ir.maktab.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Doctor extends Person{
    @Id
    long id;
    String fullName;
    String code;
    @OneToOne
    Clinic clinic;
    @OneToMany
    Set<Appointment> appointments=new HashSet<>();
}
