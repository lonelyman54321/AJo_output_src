/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import com.google.android.gms.common.internal.Preconditions;

public final class IdentityProviders {
    public static final String FACEBOOK = "https://www.facebook.com";
    public static final String GOOGLE = "https://accounts.google.com";
    public static final String LINKEDIN = "https://www.linkedin.com";
    public static final String MICROSOFT = "https://login.live.com";
    public static final String PAYPAL = "https://www.paypal.com";
    public static final String TWITTER = "https://twitter.com";
    public static final String YAHOO = "https://login.yahoo.com";

    private IdentityProviders() {
    }

    public static final String getIdentityProviderForAccount(Account object) {
        Preconditions.checkNotNull(object, "account cannot be null");
        String string2 = object.type;
        String string3 = "com.google";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            return GOOGLE;
        }
        string2 = "com.facebook.auth.login";
        object = object.type;
        boolean bl3 = string2.equals(object);
        if (bl3) {
            return FACEBOOK;
        }
        return null;
    }
}

