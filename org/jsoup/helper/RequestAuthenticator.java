/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.net.PasswordAuthentication;
import org.jsoup.helper.RequestAuthenticator$Context;

public interface RequestAuthenticator {
    public PasswordAuthentication authenticate(RequestAuthenticator$Context var1);
}

