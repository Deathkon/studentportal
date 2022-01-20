package com.studentportal.studentportal.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Course_tbl")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer coId;
    @Column(unique = true, nullable = false, length = 30)
    String coName;
    String coMentor;
    String coPeriod;
}
