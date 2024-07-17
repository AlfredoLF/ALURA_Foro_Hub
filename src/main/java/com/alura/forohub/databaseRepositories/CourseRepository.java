package com.alura.forohub.databaseRepositories;

import com.alura.forohub.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>
{
}
