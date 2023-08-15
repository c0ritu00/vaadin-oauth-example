package com.example.application;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("login")
@AnonymousAllowed
public class LoginView extends VerticalLayout {
   /**
    * URL that Spring uses to connect to Google services
    */
   private static final String OAUTH_URL = "/oauth2/authorization/azure";

   public LoginView() {
       Anchor loginLink = new Anchor(OAUTH_URL, "Login with Azure");
       // Set router-ignore attribute so that Vaadin router doesn't handle the login request
       loginLink.getElement().setAttribute("router-ignore", true);
       add(loginLink);
       getStyle().set("padding", "200px");
       setAlignItems(Alignment.CENTER);
   }
}
