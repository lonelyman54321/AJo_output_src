/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetLocation;

final class bq
extends AssetLocation {
    private final String a;
    private final long b;
    private final long c;

    public bq(String object, long l2, long l3) {
        if (object != null) {
            this.a = object;
            this.b = l2;
            this.c = l3;
            return;
        }
        object = new NullPointerException("Null path");
        throw object;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        String string2;
        String string3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof AssetLocation;
        if (bl3 && (bl3 = (string3 = this.a).equals(string2 = ((AssetLocation)(object = (AssetLocation)object)).path())) && !(bl3 = (l8 = (l7 = this.b) - (l4 = ((AssetLocation)object).offset())) == 0L ? 0 : (l8 < 0L ? -1 : 1)) && (l3 = (l2 = (l7 = this.c) - (l4 = ((AssetLocation)object).size())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 1000003;
        n3 ^= n4;
        long l2 = this.c;
        int n7 = 32;
        long l3 = l2 >>> n7;
        l2 ^= l3;
        l3 = this.b;
        long l4 = l3 >>> n7 ^ l3;
        n3 *= n4;
        int n8 = (int)l4;
        n3 = (n3 ^ n8) * n4;
        n4 = (int)l2;
        return n3 ^ n4;
    }

    public final long offset() {
        return this.b;
    }

    public final String path() {
        return this.a;
    }

    public final long size() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AssetLocation{path=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", offset=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", size=");
        l2 = this.c;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

