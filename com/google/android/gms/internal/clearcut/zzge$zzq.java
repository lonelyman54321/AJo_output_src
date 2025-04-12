/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzb;
import com.google.android.gms.internal.clearcut.zzcg$zzd;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzcn;
import com.google.android.gms.internal.clearcut.zzdq;
import com.google.android.gms.internal.clearcut.zzdz;
import com.google.android.gms.internal.clearcut.zzge$zzg;
import com.google.android.gms.internal.clearcut.zzge$zzh;
import com.google.android.gms.internal.clearcut.zzge$zzj;
import com.google.android.gms.internal.clearcut.zzge$zzl;
import com.google.android.gms.internal.clearcut.zzge$zzo;
import com.google.android.gms.internal.clearcut.zzge$zzq$zza;
import com.google.android.gms.internal.clearcut.zzge$zzq$zzb;
import com.google.android.gms.internal.clearcut.zzge$zzq$zzc;
import com.google.android.gms.internal.clearcut.zzge$zzv$zzb;
import com.google.android.gms.internal.clearcut.zzgf;

public final class zzge$zzq
extends zzcg$zzd
implements zzdq {
    private static volatile zzdz zzbg;
    private static final zzge$zzq zzzr;
    private int zzbb;
    private byte zzsf = (byte)2;
    private long zzzd;
    private long zzze;
    private zzge$zzg zzzf;
    private int zzzg = -1;
    private String zzzh;
    private String zzzi;
    private zzcn zzzj;
    private zzcn zzzk;
    private long zzzl;
    private int zzzm;
    private int zzzn;
    private zzge$zzj zzzo;
    private zzge$zzl zzzp;
    private zzge$zzh zzzq;

    static {
        zzge$zzq zzge$zzq;
        zzzr = zzge$zzq = new zzge$zzq();
        zzcg.zza(zzge$zzq.class, zzge$zzq);
    }

    private zzge$zzq() {
        Object object = "";
        this.zzzh = object;
        this.zzzi = object;
        this.zzzj = object = zzcg.zzbb();
        this.zzzk = object = zzcg.zzbb();
    }

    public static /* synthetic */ zzge$zzq zzfj() {
        return zzzr;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int n3, Object clazz, Object object) {
        boolean bl2 = false;
        object = null;
        Object object2 = zzgf.zzba;
        int n4 = 1;
        n3 -= n4;
        n3 = object2[n3];
        object2 = null;
        switch (n3) {
            default: {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                throw unsupportedOperationException;
            }
            case 7: {
                if (clazz != null) {
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
                Object object3 = zzbg;
                if (object3 != null) return object3;
                clazz = zzge$zzq.class;
                synchronized (clazz) {
                    try {
                        object3 = zzbg;
                        if (object3 != null) return object3;
                        object = zzzr;
                        zzbg = object3 = new zzcg$zzb((zzcg)object);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzzr;
            }
            case 3: {
                zzck zzck2 = zzge$zzq$zzb.zzd();
                clazz = zzge$zzv$zzb.zzd();
                object2 = zzge$zzq$zzc.zzd();
                Object[] objectArray = new Object[19];
                objectArray[0] = "zzbb";
                objectArray[n4] = "zzzf";
                objectArray[2] = "zzzg";
                objectArray[3] = zzck2;
                objectArray[4] = "zzzj";
                objectArray[5] = zzge$zzo.class;
                objectArray[6] = "zzzd";
                objectArray[7] = "zzzk";
                objectArray[8] = "zzzh";
                objectArray[9] = "zzzi";
                objectArray[10] = "zzze";
                objectArray[11] = "zzzm";
                objectArray[12] = clazz;
                objectArray[13] = "zzzn";
                objectArray[14] = object2;
                objectArray[15] = "zzzo";
                objectArray[16] = "zzzp";
                objectArray[17] = "zzzq";
                objectArray[18] = "zzzl";
                return zzcg.zza(zzzr, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u000f\u0000\u0002\u0002\u0001\u0409\u0002\u0002\f\u0003\u0003\u041b\u0004\u0002\u0000\u0005\u001c\u0006\b\u0004\u0007\b\u0005\b\u0002\u0001\t\f\u0007\n\f\b\u000b\t\t\f\t\n\r\t\u000b\u000e\u0002\u0006", objectArray);
            }
            case 2: {
                return new zzge$zzq$zza(null);
            }
            case 1: 
        }
        return new zzge$zzq();
    }
}

