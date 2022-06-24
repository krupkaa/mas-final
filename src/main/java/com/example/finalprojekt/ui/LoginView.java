package com.example.finalprojekt.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

@Route()
public class LoginView extends Composite<LoginOverlay> {

    public LoginView() {
        LoginOverlay loginOverlay = getContent();
        loginOverlay.setTitle("Projekt końcowy MAS");
        loginOverlay.setDescription("Aplikacja zarzadzajaca wypożyczalnią samochodów");
        loginOverlay.setOpened(true);


        loginOverlay.addLoginListener(event -> {
            if ("klient".equals(event.getUsername()) && "klient".equals(event.getPassword())) {
                UI.getCurrent().navigate("clientView");
            } else if ("pracownik".equals(event.getUsername()) && "pracownik".equals(event.getPassword())) {
                UI.getCurrent().navigate("employeeView");
            } else if ("właściciel".equals(event.getUsername()) && "właściciel".equals(event.getPassword())) {
                UI.getCurrent().navigate("ownerView");
            } else {
                Notification.show("Błędne dane użytkownika");
            }
        });
    }
}

