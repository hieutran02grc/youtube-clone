package com.programming.hieuxuog.youtubeClone.repository;


import com.programming.hieuxuog.youtubeClone.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
