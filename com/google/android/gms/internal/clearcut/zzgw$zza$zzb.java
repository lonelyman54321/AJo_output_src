/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zza;
import com.google.android.gms.internal.clearcut.zzcg$zzb;
import com.google.android.gms.internal.clearcut.zzcg$zzg;
import com.google.android.gms.internal.clearcut.zzdq;
import com.google.android.gms.internal.clearcut.zzdz;
import com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza;
import com.google.android.gms.internal.clearcut.zzgx;

public final class zzgw$zza$zzb
extends zzcg
implements zzdq {
    private static volatile zzdz zzbg;
    private static final zzgw$zza$zzb zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        zzgw$zza$zzb zzgw$zza$zzb;
        zzbiv = zzgw$zza$zzb = new zzgw$zza$zzb();
        zzcg.zza(zzgw$zza$zzb.class, zzgw$zza$zzb);
    }

    private zzgw$zza$zzb() {
    }

    public static /* synthetic */ void zza(zzgw$zza$zzb zzgw$zza$zzb, long l2) {
        zzgw$zza$zzb.zzp(l2);
    }

    public static /* synthetic */ void zza(zzgw$zza$zzb zzgw$zza$zzb, String string2) {
        zzgw$zza$zzb.zzm(string2);
    }

    public static /* synthetic */ void zzb(zzgw$zza$zzb zzgw$zza$zzb, long l2) {
        zzgw$zza$zzb.zzq(l2);
    }

    public static zzgw$zza$zzb$zza zzfz() {
        zzgw$zza$zzb zzgw$zza$zzb = zzbiv;
        int n3 = zzcg$zzg.zzkh;
        return (zzgw$zza$zzb$zza)((zzcg$zza)zzgw$zza$zzb.zza(n3, null, null));
    }

    public static /* synthetic */ zzgw$zza$zzb zzga() {
        return zzbiv;
    }

    private final void zzm(String string2) {
        int n3;
        string2.getClass();
        this.zzbb = n3 = this.zzbb | 2;
        this.zzbis = string2;
    }

    private final void zzp(long l2) {
        int n3;
        this.zzbb = n3 = this.zzbb | 4;
        this.zzbit = l2;
    }

    private final void zzq(long l2) {
        int n3;
        this.zzbb = n3 = this.zzbb | 8;
        this.zzbiu = l2;
    }

    public final int getEventCode() {
        return this.zzya;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgw$zza$zzb>)zzgx.zzba;
        byte by2 = 1;
        object -= by2;
        object = clazz[object];
        clazz = null;
        switch (object) {
            default: {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                throw unsupportedOperationException;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                Object object3 = zzbg;
                if (object3 != null) return object3;
                clazz = zzgw$zza$zzb.class;
                synchronized (clazz) {
                    try {
                        object3 = zzbg;
                        if (object3 != null) return object3;
                        object2 = zzbiv;
                        zzbg = object3 = new zzcg$zzb((zzcg)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzbiv;
            }
            case 3: {
                Object[] objectArray = new Object[5];
                objectArray[0] = "zzbb";
                objectArray[by2] = "zzya";
                objectArray[2] = "zzbis";
                objectArray[3] = "zzbit";
                objectArray[4] = "zzbiu";
                return zzcg.zza(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", objectArray);
            }
            case 2: {
                return new zzgw$zza$zzb$zza(null);
            }
            case 1: 
        }
        return new zzgw$zza$zzb();
    }

    public final boolean zzfv() {
        int bl2 = this.zzbb;
        int n3 = 1;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            return n3 != 0;
        }
        return false;
    }

    public final String zzfw() {
        return this.zzbis;
    }

    public final long zzfx() {
        return this.zzbit;
    }

    public final long zzfy() {
        return this.zzbiu;
    }
}

