package pietro.deperon.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pietro.deperon.springsecurity.entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,Long> {
}
