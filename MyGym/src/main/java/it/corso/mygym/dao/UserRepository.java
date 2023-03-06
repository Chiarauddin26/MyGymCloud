package it.corso.mygym.dao;

import it.corso.mygym.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByActivatedTrue();

    /*
    @Query(value = "SELECT u " +
            "FROM User u, Subscription s " +
            "WHERE u.activated = true AND " +
            "u.id = s.user.id AND s.endSubscription >= CURRENT_DATE " +
            "GROUP BY u.id")
    List<User> findByActivatedTrueAndActiveSub();
     */
}
