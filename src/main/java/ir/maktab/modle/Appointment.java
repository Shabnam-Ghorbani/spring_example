package ir.maktab.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Appointment extends BaseEntity {
    @OneToOne
    Patient patient;
    @Temporal(TemporalType.TIMESTAMP)
    Date date;
    @Column(columnDefinition = "boolean default false")
    boolean isReserved;
}
