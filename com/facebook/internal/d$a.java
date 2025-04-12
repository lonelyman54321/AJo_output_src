/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.internal;

import com.facebook.FacebookException;

public final class d$a {
    public static final void a(boolean bl2) {
        if (bl2) {
            return;
        }
        FacebookException facebookException = new FacebookException("Validation failed");
        throw facebookException;
    }
}

