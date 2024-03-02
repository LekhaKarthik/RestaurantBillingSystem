package dev.lekha.factory;

import dev.lekha.model.Restaurant;

import java.util.ArrayList;
import java.util.UUID;

public class RestaurantFactory {
    public Restaurant defaultRestaurant(final String name) {
        UUID restaurantUUID = UUID.randomUUID();
        String restaurantId = restaurantUUID.toString();
        return new Restaurant(restaurantId, name, new ArrayList<>(), new ArrayList<>());
    }
}
