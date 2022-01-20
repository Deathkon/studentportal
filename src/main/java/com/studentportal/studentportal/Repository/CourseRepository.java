package com.studentportal.studentportal.Repository;

import com.studentportal.studentportal.Entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity , Integer> {

}
