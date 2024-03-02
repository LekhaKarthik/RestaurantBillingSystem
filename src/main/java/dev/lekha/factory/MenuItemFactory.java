package dev.lekha.factory;

import dev.lekha.model.MenuItem;

import java.util.UUID;

public class MenuItemFactory {
    public MenuItem defaultMenuItem(final String name, final float price) {
        String menuId = UUID.randomUUID().toString();
        return new MenuItem(menuId, name, price);
    }
}
