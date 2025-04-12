/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.fj;
import java.util.Arrays;

final class bv
extends fj {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    public bv(String string2, long l2, int n3, boolean bl2, boolean bl3, byte[] byArray) {
        this.a = string2;
        this.b = l2;
        this.c = n3;
        this.d = bl2;
        this.e = bl3;
        this.f = byArray;
    }

    public final int a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof fj;
        if (n3 != 0) {
            String string2;
            object = (fj)object;
            Object object2 = this.a;
            if (object2 == null ? (object2 = ((fj)object).c()) == null : (n3 = ((String)object2).equals(string2 = ((fj)object).c())) != 0) {
                boolean bl3;
                int n4;
                long l2 = this.b;
                long l3 = ((fj)object).b();
                n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (n3 == 0 && (n3 = this.c) == (n4 = ((fj)object).a()) && (n3 = (int)(this.d ? 1 : 0)) == (n4 = (int)(((fj)object).e() ? 1 : 0)) && (n3 = (int)(this.e ? 1 : 0)) == (n4 = (int)(((fj)object).d() ? 1 : 0)) && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.f), (byte[])(object = (n4 = object instanceof bv) != 0 ? (Object)((bv)object).f : (Object)((fj)object).f())))) {
                    return bl2;
                }
            }
        }
        return false;
    }

    public final byte[] f() {
        return this.f;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        long l2 = this.b;
        int n4 = this.c;
        int n7 = this.d;
        int n8 = 1231;
        int n10 = 1;
        n7 = n10 != n7 ? 1237 : 1231;
        long l3 = l2 >>> 32;
        int n14 = 1000003;
        n3 = (n3 ^ n14) * n14;
        int n15 = (int)(l2 ^= l3);
        n3 = (n3 ^ n15) * n14 ^ n4;
        int n16 = this.e;
        if (n10 != n16) {
            n8 = 1237;
        }
        n3 = ((n3 * n14 ^ n7) * n14 ^ n8) * n14;
        n16 = Arrays.hashCode(this.f);
        return n3 ^ n16;
    }

    public final String toString() {
        String string2 = Arrays.toString(this.f);
        StringBuilder stringBuilder = new StringBuilder("ZipEntry{name=");
        String string3 = this.a;
        stringBuilder.append(string3);
        stringBuilder.append(", size=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", compressionMethod=");
        int bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", isPartial=");
        boolean bl3 = this.d;
        stringBuilder.append(bl3);
        stringBuilder.append(", isEndOfArchive=");
        boolean bl4 = this.e;
        stringBuilder.append(bl4);
        stringBuilder.append(", headerBytes=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

