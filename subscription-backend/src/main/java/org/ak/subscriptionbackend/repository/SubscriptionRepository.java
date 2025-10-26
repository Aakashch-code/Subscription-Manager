package org.ak.subscriptionbackend.repository;

import org.ak.subscriptionbackend.model.Subscriptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscriptions, Long> {
}