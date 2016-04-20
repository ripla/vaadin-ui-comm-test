package org.vaadin.risto;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@Theme(ValoTheme.THEME_NAME)
@Push
public class MyUI2 extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Button("Send message to UI1", event -> {
            getSession().getUIs().forEach(ui -> {
                if (ui instanceof MyUI1) {
                    ui.access(() -> Notification.show("Hi from UI2"));
                }
            });
        }));
    }

}
