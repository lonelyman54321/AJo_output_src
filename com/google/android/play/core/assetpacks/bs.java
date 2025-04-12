/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetPackState;

final class bs
extends AssetPackState {
    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final int f;
    private final int g;
    private final String h;
    private final String i;

    public bs(String object, int n3, int n4, long l2, long l3, int n7, int n8, String string2, String string3) {
        if (object != null) {
            this.a = object;
            this.b = n3;
            this.c = n4;
            this.d = l2;
            this.e = l3;
            this.f = n7;
            this.g = n8;
            if (string2 != null) {
                this.h = string2;
                if (string3 != null) {
                    this.i = string3;
                    return;
                }
                object = new NullPointerException("Null installedVersionTag");
                throw object;
            }
            object = new NullPointerException("Null availableVersionTag");
            throw object;
        }
        object = new NullPointerException("Null name");
        throw object;
    }

    public final String availableVersionTag() {
        return this.h;
    }

    public final long bytesDownloaded() {
        return this.d;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        long l2;
        long l3;
        long l4;
        long l7;
        int n3;
        String string2;
        String string3;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        int n4 = object instanceof AssetPackState;
        if (n4 != 0 && (n4 = (string3 = this.a).equals(string2 = ((AssetPackState)(object = (AssetPackState)object)).name())) != 0 && (n4 = this.b) == (n3 = ((AssetPackState)object).status()) && (n4 = this.c) == (n3 = ((AssetPackState)object).errorCode()) && (n4 = (int)((l7 = (l4 = this.d) - (l3 = ((AssetPackState)object).bytesDownloaded())) == 0L ? 0 : (l7 < 0L ? -1 : 1))) == 0 && (n4 = (int)((l2 = (l4 = this.e) - (l3 = ((AssetPackState)object).totalBytesToDownload())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) == 0 && (n4 = this.f) == (n3 = ((AssetPackState)object).transferProgressPercentage()) && (n4 = this.g) == (n3 = ((AssetPackState)object).updateAvailability()) && (n4 = (int)((string3 = this.h).equals(string2 = ((AssetPackState)object).availableVersionTag()) ? 1 : 0)) != 0 && (bl2 = (string3 = this.i).equals(object = ((AssetPackState)object).installedVersionTag()))) {
            return bl3;
        }
        return false;
    }

    public final int errorCode() {
        return this.c;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 1000003;
        n3 ^= n4;
        long l2 = this.e;
        String string2 = this.h;
        int n7 = 32;
        long l3 = l2 >>> n7;
        l2 ^= l3;
        l3 = this.d;
        long l4 = l3 >>> n7 ^ l3;
        n3 *= n4;
        int n8 = this.b;
        n3 = (n3 ^ n8) * n4;
        n8 = this.c;
        n3 = (n3 ^ n8) * n4;
        int n10 = (int)l4;
        n3 = (n3 ^ n10) * n4;
        int n14 = (int)l2;
        n3 = (n3 ^ n14) * n4;
        int n15 = this.f;
        n3 = (n3 ^ n15) * n4;
        n15 = this.g;
        n3 = (n3 ^ n15) * n4;
        n15 = string2.hashCode();
        n3 ^= n15;
        String string3 = this.i;
        n3 *= n4;
        n4 = string3.hashCode();
        return n3 ^ n4;
    }

    public final String installedVersionTag() {
        return this.i;
    }

    public final String name() {
        return this.a;
    }

    public final int status() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AssetPackState{name=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", status=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", errorCode=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", bytesDownloaded=");
        long l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", totalBytesToDownload=");
        l2 = this.e;
        stringBuilder.append(l2);
        stringBuilder.append(", transferProgressPercentage=");
        n3 = this.f;
        stringBuilder.append(n3);
        stringBuilder.append(", updateAvailability=");
        n3 = this.g;
        stringBuilder.append(n3);
        stringBuilder.append(", availableVersionTag=");
        string2 = this.h;
        stringBuilder.append(string2);
        stringBuilder.append(", installedVersionTag=");
        string2 = this.i;
        return h30_0.a(stringBuilder, string2, "}");
    }

    public final long totalBytesToDownload() {
        return this.e;
    }

    public final int transferProgressPercentage() {
        return this.f;
    }

    public final int updateAvailability() {
        return this.g;
    }
}

