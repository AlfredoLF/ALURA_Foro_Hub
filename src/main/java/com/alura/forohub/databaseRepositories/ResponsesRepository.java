package com.alura.forohub.databaseRepositories;

import com.alura.forohub.models.Responses;
import com.alura.forohub.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResponsesRepository extends JpaRepository<Responses, Long>
{
    @Query("SELECT r from Responses r WHERE r.topic=:codeTopic")
    List<Responses> findByTopic(Topic codeTopic);

    @Query(nativeQuery = true, value = """
            SELECT r.code,
            r.message,
            r.topic,
            r.creationdate,
            r.author,
            r.solution
            FROM responses as r
            WHERE r.topic = :codeTopic
            """)
    List<Responses> findByTopicId(Integer codeTopic);
}
