/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.net.HttpURLConnection;
import org.jsoup.helper.AuthenticationHandler;
import org.jsoup.helper.RequestAuthenticator;

interface AuthenticationHandler$AuthShim {
    public void enable(RequestAuthenticator var1, HttpURLConnection var2);

    public AuthenticationHandler get(AuthenticationHandler var1);

    public void remove();
}

