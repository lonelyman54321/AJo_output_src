/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzcdu;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzcdv {
    private static final AtomicInteger zza;
    private static final AtomicInteger zzb;

    static {
        AtomicInteger atomicInteger;
        zza = atomicInteger = new AtomicInteger(0);
        zzb = atomicInteger = new AtomicInteger(0);
    }

    public static AtomicInteger zzD() {
        return zza;
    }

    public static AtomicInteger zzE() {
        return zzb;
    }

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract Integer zzC();

    public abstract void zzF(Uri[] var1, String var2);

    public abstract void zzG(Uri[] var1, String var2, ByteBuffer var3, boolean var4);

    public abstract void zzH();

    public abstract void zzI(long var1);

    public abstract void zzJ(int var1);

    public abstract void zzK(int var1);

    public abstract void zzL(zzcdu var1);

    public abstract void zzM(int var1);

    public abstract void zzN(int var1);

    public abstract void zzO(boolean var1);

    public abstract void zzP(Integer var1);

    public abstract void zzQ(boolean var1);

    public abstract void zzR(int var1);

    public abstract void zzS(Surface var1, boolean var2);

    public abstract void zzT(float var1, boolean var2);

    public abstract void zzU();

    public abstract boolean zzV();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}

