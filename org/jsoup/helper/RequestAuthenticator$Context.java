/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

public class RequestAuthenticator$Context {
    private final String realm;
    private final Authenticator.RequestorType type;
    private final URL url;

    public RequestAuthenticator$Context(URL uRL, Authenticator.RequestorType requestorType, String string2) {
        this.url = uRL;
        this.type = requestorType;
        this.realm = string2;
    }

    public PasswordAuthentication credentials(String string2, String object) {
        object = ((String)object).toCharArray();
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication(string2, (char[])object);
        return passwordAuthentication;
    }

    public boolean isProxy() {
        boolean bl2;
        Authenticator.RequestorType requestorType = this.type;
        Authenticator.RequestorType requestorType2 = Authenticator.RequestorType.PROXY;
        if (requestorType == requestorType2) {
            bl2 = true;
        } else {
            bl2 = false;
            requestorType = null;
        }
        return bl2;
    }

    public boolean isServer() {
        boolean bl2;
        Authenticator.RequestorType requestorType = this.type;
        Authenticator.RequestorType requestorType2 = Authenticator.RequestorType.SERVER;
        if (requestorType == requestorType2) {
            bl2 = true;
        } else {
            bl2 = false;
            requestorType = null;
        }
        return bl2;
    }

    public String realm() {
        return this.realm;
    }

    public Authenticator.RequestorType type() {
        return this.type;
    }

    public URL url() {
        return this.url;
    }
}

