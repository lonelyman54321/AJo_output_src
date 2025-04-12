/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzb;
import com.google.android.gms.internal.clearcut.zzcg$zzf;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzdq;
import com.google.android.gms.internal.clearcut.zzdz;
import com.google.android.gms.internal.clearcut.zzfl;
import com.google.android.gms.internal.clearcut.zzgc;
import com.google.android.gms.internal.clearcut.zzge$zzb;
import com.google.android.gms.internal.clearcut.zzge$zze;
import com.google.android.gms.internal.clearcut.zzge$zzf;
import com.google.android.gms.internal.clearcut.zzge$zzg$zza;
import com.google.android.gms.internal.clearcut.zzge$zzg$zzb;
import com.google.android.gms.internal.clearcut.zzge$zzi;
import com.google.android.gms.internal.clearcut.zzge$zzm;
import com.google.android.gms.internal.clearcut.zzge$zzn;
import com.google.android.gms.internal.clearcut.zzge$zzr;
import com.google.android.gms.internal.clearcut.zzge$zzt;
import com.google.android.gms.internal.clearcut.zzge$zzu;
import com.google.android.gms.internal.clearcut.zzge$zzw;
import com.google.android.gms.internal.clearcut.zzge$zzx;
import com.google.android.gms.internal.clearcut.zzgf;

public final class zzge$zzg
extends zzcg
implements zzdq {
    private static volatile zzdz zzbg;
    private static final zzge$zzg zzva;
    private static final zzcg$zzf zzvb;
    private int zzbb;
    private byte zzsf = (byte)2;
    private int zzty;
    private String zzum;
    private String zzun;
    private zzge.zzb zzuo;
    private zzge.zzi zzup;
    private zzge.zzm zzuq;
    private zzge.zzu zzur;
    private zzge.zzw zzus;
    private zzge.zzt zzut;
    private zzge.zzr zzuu;
    private zzge.zzx zzuv;
    private zzge$zzf zzuw;
    private zzge.zzn zzux;
    private zzge$zze zzuy;
    private long zzuz;

    static {
        zzge$zzg zzge$zzg;
        zzva = zzge$zzg = new zzge$zzg();
        zzcg.zza(zzge$zzg.class, zzge$zzg);
        zzgc zzgc2 = zzgc.zzer();
        zzfl zzfl2 = zzfl.zzqm;
        zzvb = zzcg.zza(zzgc2, (Object)zzge$zzg, zzge$zzg, null, 66321687, zzfl2, zzge$zzg.class);
    }

    private zzge$zzg() {
        String string2;
        this.zzum = string2 = "";
        this.zzun = string2;
    }

    public static /* synthetic */ zzge$zzg zzez() {
        return zzva;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int n3, Object objectArray, Object object) {
        boolean bl2 = false;
        object = null;
        int[] nArray = zzgf.zzba;
        int n4 = 1;
        n3 -= n4;
        n3 = nArray[n3];
        nArray = null;
        switch (n3) {
            default: {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                throw unsupportedOperationException;
            }
            case 7: {
                if (objectArray != null) {
                    bl2 = true;
                }
                n3 = (byte)(bl2 ? 1 : 0);
                this.zzsf = (byte)n3;
                return null;
            }
            case 6: {
                return this.zzsf;
            }
            case 5: {
                Object object2 = zzbg;
                if (object2 != null) return object2;
                objectArray = zzge$zzg.class;
                synchronized (objectArray) {
                    try {
                        object2 = zzbg;
                        if (object2 != null) return object2;
                        object = zzva;
                        zzbg = object2 = new zzcg$zzb((zzcg)object);
                        return object2;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzva;
            }
            case 3: {
                zzck zzck2 = zzge$zzg$zzb.zzd();
                objectArray = new Object[17];
                objectArray[0] = "zzbb";
                objectArray[n4] = "zzty";
                objectArray[2] = zzck2;
                objectArray[3] = "zzuo";
                objectArray[4] = "zzup";
                objectArray[5] = "zzuq";
                objectArray[6] = "zzur";
                objectArray[7] = "zzum";
                objectArray[8] = "zzun";
                objectArray[9] = "zzus";
                objectArray[10] = "zzuw";
                objectArray[11] = "zzut";
                objectArray[12] = "zzux";
                objectArray[13] = "zzuz";
                objectArray[14] = "zzuu";
                objectArray[15] = "zzuy";
                objectArray[16] = "zzuv";
                return zzcg.zza(zzva, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0010\u0000\u0000\u0001\u0001\f\u0000\u0002\u0409\u0003\u0003\t\u0004\u0004\t\u0005\u0005\t\u0006\u0006\b\u0001\u0007\b\u0002\b\t\u0007\t\t\u000b\n\t\b\u000b\t\f\f\u0002\u000e\r\t\t\u000e\t\r\u000f\t\n", objectArray);
            }
            case 2: {
                return new zzge$zzg$zza(null);
            }
            case 1: 
        }
        return new zzge$zzg();
    }
}

