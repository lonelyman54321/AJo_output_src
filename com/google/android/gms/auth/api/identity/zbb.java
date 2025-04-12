/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.zba;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.internal.Preconditions;

public final class zbb {
    private String zba;

    private zbb() {
    }

    public /* synthetic */ zbb(zba zba2) {
    }

    public static final zbb zbc(zbc object) {
        object = ((zbc)object).zbb();
        zbb zbb2 = new zbb();
        if (object != null) {
            zbb2.zba = object = Preconditions.checkNotEmpty((String)object);
        }
        return zbb2;
    }

    public final zbb zba(String string2) {
        this.zba = string2 = Preconditions.checkNotEmpty(string2);
        return this;
    }

    public final zbc zbb() {
        String string2 = this.zba;
        zbc zbc2 = new zbc(string2);
        return zbc2;
    }
}

