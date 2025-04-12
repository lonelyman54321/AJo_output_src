/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.NetworkSecurityPolicy
 */
package com.jio.jioads.user;

import android.security.NetworkSecurityPolicy;

public final class f {
    public static /* bridge */ /* synthetic */ boolean a(NetworkSecurityPolicy networkSecurityPolicy) {
        return networkSecurityPolicy.isCleartextTrafficPermitted("api.jio.com");
    }
}

