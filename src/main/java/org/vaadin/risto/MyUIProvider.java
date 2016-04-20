package org.vaadin.risto;

import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.UIProvider;
import com.vaadin.ui.UI;

public class MyUIProvider extends UIProvider {
    @Override
    public Class<? extends UI> getUIClass(UIClassSelectionEvent event) {
        if (event.getRequest().getPathInfo().endsWith("ui1")) {
            return MyUI1.class;
        } else if (event.getRequest().getPathInfo().endsWith("ui2")) {
            return MyUI2.class;
        }else {
            return null;
        }
    }
}
