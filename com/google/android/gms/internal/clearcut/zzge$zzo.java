/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzb;
import com.google.android.gms.internal.clearcut.zzcg$zzd;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzcl;
import com.google.android.gms.internal.clearcut.zzcn;
import com.google.android.gms.internal.clearcut.zzdq;
import com.google.android.gms.internal.clearcut.zzdz;
import com.google.android.gms.internal.clearcut.zzge$zza;
import com.google.android.gms.internal.clearcut.zzge$zzd;
import com.google.android.gms.internal.clearcut.zzge$zzk;
import com.google.android.gms.internal.clearcut.zzge$zzo$zza;
import com.google.android.gms.internal.clearcut.zzge$zzo$zzb;
import com.google.android.gms.internal.clearcut.zzge$zzp;
import com.google.android.gms.internal.clearcut.zzge$zzs;
import com.google.android.gms.internal.clearcut.zzgf;

public final class zzge$zzo
extends zzcg$zzd
implements zzdq {
    private static volatile zzdz zzbg;
    private static final zzge$zzo zzyv;
    private int zzbb;
    private byte zzsf = (byte)2;
    private long zzxw;
    private long zzxx;
    private long zzxy;
    private String zzxz;
    private int zzya;
    private String zzyb;
    private int zzyc;
    private boolean zzyd;
    private zzcn zzye;
    private zzbb zzyf;
    private zzge$zzd zzyg;
    private zzbb zzyh;
    private String zzyi;
    private String zzyj;
    private zzge$zza zzyk;
    private String zzyl;
    private long zzym;
    private zzge$zzk zzyn;
    private zzbb zzyo;
    private String zzyp;
    private int zzyq;
    private zzcl zzyr;
    private long zzys;
    private zzge$zzs zzyt;
    private boolean zzyu;

    static {
        zzge$zzo zzge$zzo;
        zzyv = zzge$zzo = new zzge$zzo();
        zzcg.zza(zzge$zzo.class, zzge$zzo);
    }

    private zzge$zzo() {
        Iterable iterable;
        Object object = "";
        this.zzxz = object;
        this.zzyb = object;
        this.zzye = iterable = zzcg.zzbb();
        iterable = com.google.android.gms.internal.clearcut.zzbb.zzfi;
        this.zzyf = iterable;
        this.zzyh = iterable;
        this.zzyi = object;
        this.zzyj = object;
        this.zzyl = object;
        this.zzym = 180000L;
        this.zzyo = iterable;
        this.zzyp = object;
        this.zzyr = object = zzcg.zzaz();
    }

    public static /* synthetic */ zzge$zzo zzfh() {
        return zzyv;
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
                objectArray = zzge$zzo.class;
                synchronized (objectArray) {
                    try {
                        object2 = zzbg;
                        if (object2 != null) return object2;
                        object = zzyv;
                        zzbg = object2 = new zzcg$zzb((zzcg)object);
                        return object2;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzyv;
            }
            case 3: {
                zzck zzck2 = zzge$zzo$zzb.zzd();
                objectArray = new Object[28];
                objectArray[0] = "zzbb";
                objectArray[n4] = "zzxw";
                objectArray[2] = "zzxz";
                objectArray[3] = "zzye";
                objectArray[4] = zzge$zzp.class;
                objectArray[5] = "zzyf";
                objectArray[6] = "zzyh";
                objectArray[7] = "zzyk";
                objectArray[8] = "zzyi";
                objectArray[9] = "zzyg";
                objectArray[10] = "zzyd";
                objectArray[11] = "zzya";
                objectArray[12] = "zzyc";
                objectArray[13] = "zzyj";
                objectArray[14] = "zzyl";
                objectArray[15] = "zzym";
                objectArray[16] = "zzyn";
                objectArray[17] = "zzxx";
                objectArray[18] = "zzyo";
                objectArray[19] = "zzyq";
                objectArray[20] = zzck2;
                objectArray[21] = "zzyr";
                objectArray[22] = "zzxy";
                objectArray[23] = "zzys";
                objectArray[24] = "zzyt";
                objectArray[25] = "zzyp";
                objectArray[26] = "zzyu";
                objectArray[27] = "zzyb";
                return zzcg.zza(zzyv, "\u0001\u0019\u0000\u0001\u0001\u001a\u001a\u001b\u0000\u0002\u0000\u0001\u0002\u0000\u0002\b\u0003\u0003\u001b\u0004\n\b\u0006\n\n\u0007\t\r\b\b\u000b\t\t\t\n\u0007\u0007\u000b\u0004\u0004\f\u0004\u0006\r\b\f\u000e\b\u000e\u000f\u0010\u000f\u0010\t\u0010\u0011\u0002\u0001\u0012\n\u0011\u0013\f\u0013\u0014\u0016\u0015\u0002\u0002\u0016\u0002\u0014\u0017\t\u0015\u0018\b\u0012\u0019\u0007\u0016\u001a\b\u0005", objectArray);
            }
            case 2: {
                return new zzge$zzo$zza(null);
            }
            case 1: 
        }
        return new zzge$zzo();
    }
}

