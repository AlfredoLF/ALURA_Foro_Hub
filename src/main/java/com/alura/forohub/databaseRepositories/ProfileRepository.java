package com.alura.forohub.databaseRepositories;

import com.alura.forohub.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
