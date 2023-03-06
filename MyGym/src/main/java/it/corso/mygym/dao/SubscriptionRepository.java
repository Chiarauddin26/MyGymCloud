package it.corso.mygym.dao;

import it.corso.mygym.model.Subscription;
import it.corso.mygym.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<User> findByPaidTrue();
/*
    @Query(value = "SELECT u " +
            "FROM User u, Subscription s " +
            "WHERE u.id = s.user.id AND s.endSubscription >= CURRENT_DATE " +
            "GROUP BY u.id")
    List<User> findByActiveSub();
 */
}
