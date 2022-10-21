package ru.tutorials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tutorials.entities.SpeakerEntity;

import java.util.Optional;

@Repository
public interface SpeakersRepository extends JpaRepository<SpeakerEntity, Long> {

    Optional<SpeakerEntity> findByTalkName(String talkName);

}
