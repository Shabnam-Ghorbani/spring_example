package ir.maktab.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person extends BaseEntity {
    String name;
    String family;
    String nationalCode;
}
