/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1oSDK;

public abstract class AFh1kSDK
extends AFa1oSDK {
    private final boolean copy;
    private final boolean copydefault;

    public AFh1kSDK() {
        this((String)null, (Boolean)null, (Boolean)null);
    }

    public AFh1kSDK(String string2, Boolean bl2, Boolean bl3) {
        boolean bl4;
        if (bl3 != null) {
            bl4 = bl3;
        } else {
            bl4 = false;
            bl3 = null;
        }
        bl3 = bl4;
        super(string2, null, bl3);
        boolean bl5 = true;
        boolean bl6 = bl2 != null ? bl2 : true;
        this.copy = bl6;
        this.copydefault = bl5;
    }
}

