/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

public class HashAccumulator {
    private int zaa = 1;

    public HashAccumulator addObject(Object object) {
        int n3;
        int n4 = this.zaa * 31;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        this.zaa = n4 += n3;
        return this;
    }

    public int hash() {
        return this.zaa;
    }

    public final HashAccumulator zaa(boolean bl2) {
        int n3;
        this.zaa = n3 = this.zaa * 31 + bl2;
        return this;
    }
}

