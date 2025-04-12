/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

abstract class zzme {
    public abstract int zza(int var1, byte[] var2, int var3, int var4);

    public abstract int zza(CharSequence var1, byte[] var2, int var3, int var4);

    public final boolean zza(byte[] byArray, int n3, int n4) {
        int n7 = this.zza(0, byArray, n3, n4);
        return n7 == 0;
    }

    public abstract String zzb(byte[] var1, int var2, int var3);
}

