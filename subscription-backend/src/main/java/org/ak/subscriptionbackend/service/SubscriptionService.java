package org.ak.subscriptionbackend.service;

import org.ak.subscriptionbackend.model.Subscriptions;
import org.ak.subscriptionbackend.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public List<Subscriptions> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    public Optional<Subscriptions> getSubscriptionById(Long id) {
        return subscriptionRepository.findById(id);
    }

    public Subscriptions createSubscription(Subscriptions subscription) {
        return subscriptionRepository.save(subscription);
    }

    public Subscriptions updateSubscription(Long id, Subscriptions subscriptionDetails) {
        Subscriptions subscription = subscriptionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subscription not found with id: " + id));

        subscription.setName(subscriptionDetails.getName());
        subscription.setAmount(subscriptionDetails.getAmount());
        subscription.setBillingCycle(subscriptionDetails.getBillingCycle());
        subscription.setNextBillingDate(subscriptionDetails.getNextBillingDate());
        subscription.setCategory(subscriptionDetails.getCategory());

        return subscriptionRepository.save(subscription);
    }

    public void deleteSubscription(Long id) {
        Subscriptions subscription = subscriptionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subscription not found with id: " + id));
        subscriptionRepository.delete(subscription);
    }
}