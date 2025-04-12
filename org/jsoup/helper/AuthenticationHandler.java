/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.lang.reflect.Constructor;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import org.jsoup.helper.AuthenticationHandler$AuthShim;
import org.jsoup.helper.AuthenticationHandler$GlobalHandler;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.helper.RequestAuthenticator$Context;

class AuthenticationHandler
extends Authenticator {
    static final int MaxAttempts = 5;
    static AuthenticationHandler$AuthShim handler;
    int attemptCount = 0;
    RequestAuthenticator auth;

    static {
        Object object = "org.jsoup.helper.RequestAuthHandler";
        object = Class.forName((String)object);
        IllegalStateException illegalStateException = null;
        object = ((Class)object).getConstructor(null);
        object = ((Constructor)object).newInstance(null);
        object = (AuthenticationHandler$AuthShim)object;
        try {
            handler = object;
        }
        catch (Exception exception) {
            illegalStateException = new IllegalStateException(exception);
            throw illegalStateException;
        }
        catch (ClassNotFoundException classNotFoundException) {
            handler = object = new AuthenticationHandler$GlobalHandler();
        }
    }

    public AuthenticationHandler() {
    }

    public AuthenticationHandler(RequestAuthenticator requestAuthenticator) {
        this.auth = requestAuthenticator;
    }

    public final PasswordAuthentication getPasswordAuthentication() {
        int n3;
        AuthenticationHandler authenticationHandler = handler.get(this);
        RequestAuthenticator$Context requestAuthenticator$Context = null;
        if (authenticationHandler == null) {
            return null;
        }
        authenticationHandler.attemptCount = n3 = authenticationHandler.attemptCount + 1;
        int n4 = 5;
        if (n3 > n4) {
            return null;
        }
        Object object = authenticationHandler.auth;
        if (object == null) {
            return null;
        }
        object = this.getRequestingURL();
        Authenticator.RequestorType requestorType = this.getRequestorType();
        String string2 = this.getRequestingPrompt();
        requestAuthenticator$Context = new RequestAuthenticator$Context((URL)object, requestorType, string2);
        return authenticationHandler.auth.authenticate(requestAuthenticator$Context);
    }
}

