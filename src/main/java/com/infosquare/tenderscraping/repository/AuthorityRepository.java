package com.infosquare.tenderscraping.repository;

import com.infosquare.tenderscraping.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
