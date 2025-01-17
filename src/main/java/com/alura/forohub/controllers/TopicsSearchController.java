package com.alura.forohub.controllers;

import com.alura.forohub.DtoGetData.topics.DtoTopicSearchTitleAndYear;
import com.alura.forohub.Services.ServiceTopic;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicssearch")
@SecurityRequirement(name = "bearer-key")
public class TopicsSearchController
{
    @Autowired
    ServiceTopic serviceTopic;

    @GetMapping
    @Operation(summary = "Find some topics by title and year", tags = "Get")
    public ResponseEntity getAllTopics(@RequestBody DtoTopicSearchTitleAndYear dtoTopicSearchTitleAndYear)
    {
        return ResponseEntity.ok(serviceTopic.findTopicByTitleAndYear(dtoTopicSearchTitleAndYear));
    }
}
