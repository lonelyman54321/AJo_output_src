/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.FacebookSdk;

public final class g$a$a
implements yi1 {
    public final void a(String string2) {
        FacebookSdk.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", string2).apply();
    }
}

