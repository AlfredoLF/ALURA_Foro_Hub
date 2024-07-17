package com.alura.forohub.databaseRepositories;

import com.alura.forohub.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
