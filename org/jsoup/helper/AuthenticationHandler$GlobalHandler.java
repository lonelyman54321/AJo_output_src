/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.net.Authenticator;
import java.net.HttpURLConnection;
import org.jsoup.helper.AuthenticationHandler;
import org.jsoup.helper.AuthenticationHandler$AuthShim;
import org.jsoup.helper.RequestAuthenticator;

class AuthenticationHandler$GlobalHandler
implements AuthenticationHandler$AuthShim {
    static ThreadLocal authenticators;

    static {
        Object object = new ThreadLocal();
        authenticators = object;
        object = new AuthenticationHandler();
        Authenticator.setDefault((Authenticator)object);
    }

    public void enable(RequestAuthenticator requestAuthenticator, HttpURLConnection object) {
        object = authenticators;
        AuthenticationHandler authenticationHandler = new AuthenticationHandler(requestAuthenticator);
        ((ThreadLocal)object).set(authenticationHandler);
    }

    public AuthenticationHandler get(AuthenticationHandler authenticationHandler) {
        return (AuthenticationHandler)authenticators.get();
    }

    public void remove() {
        authenticators.remove();
    }
}

