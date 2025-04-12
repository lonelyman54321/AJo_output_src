/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;

public final class CustomEventExtras {
    private final HashMap zza;

    public CustomEventExtras() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public Object getExtra(String string2) {
        return this.zza.get(string2);
    }

    public void setExtra(String string2, Object object) {
        this.zza.put(string2, object);
    }
}

