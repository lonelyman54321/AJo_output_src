/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaae;
import com.google.android.gms.internal.gtm.zzaaf;
import com.google.android.gms.internal.gtm.zzaag;
import com.google.android.gms.internal.gtm.zzaai;
import com.google.android.gms.internal.gtm.zzaak;
import com.google.android.gms.internal.gtm.zzaal;
import com.google.android.gms.internal.gtm.zzaam;
import com.google.android.gms.internal.gtm.zzaan;
import com.google.android.gms.internal.gtm.zzaap;
import com.google.android.gms.internal.gtm.zzabl;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacg;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzyj;

public final class zzaaq
extends zzacc
implements zzadm {
    private static final zzaaq zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private zzacn zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private zzack zzs;
    private zzacn zzt;
    private zzaae zzu;
    private zzaak zzv;
    private zzacn zzw;
    private byte zzx = (byte)2;

    static {
        zzaaq zzaaq2;
        zzd = zzaaq2 = new zzaaq();
        zzacf.zzao(zzaaq.class, zzaaq2);
    }

    private zzaaq() {
        zzyj zzyj2 = zzadu.zze();
        this.zzm = zzyj2;
        this.zzo = true;
        zzyj2 = zzacg.zzf();
        this.zzs = zzyj2;
        zzyj2 = zzadu.zze();
        this.zzt = zzyj2;
        zzyj2 = zzadu.zze();
        this.zzw = zzyj2;
    }

    public static /* bridge */ /* synthetic */ zzaaq zzc() {
        return zzd;
    }

    public static zzaaq zze() {
        return zzd;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 5;
        int n8 = 4;
        int n10 = 3;
        int n14 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n14) {
                if (n3 != n10) {
                    n10 = 0;
                    if (n3 != n8) {
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                                object2 = null;
                            }
                            this.zzx = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzaaf zzaaf2 = new zzaaf(null);
                    return zzaaf2;
                }
                zzaaq zzaaq2 = new zzaaq();
                return zzaaq2;
            }
            Object[] objectArray = new Object[26];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n14] = object = zzaag.zza;
            objectArray[n10] = "zzg";
            objectArray[n8] = "zzk";
            objectArray[n7] = "zzi";
            objectArray[6] = "zzh";
            objectArray[7] = object = zzaal.zza;
            objectArray[8] = "zzl";
            objectArray[9] = "zzm";
            objectArray[10] = zzaap.class;
            objectArray[11] = "zzn";
            objectArray[12] = "zzo";
            objectArray[13] = "zzp";
            objectArray[14] = "zzj";
            objectArray[15] = "zzq";
            objectArray[16] = "zzr";
            objectArray[17] = object = zzaam.zza;
            objectArray[18] = "zzs";
            objectArray[19] = object = zzaan.zza;
            objectArray[20] = "zzt";
            objectArray[21] = zzaai.class;
            objectArray[22] = "zzu";
            objectArray[23] = "zzv";
            objectArray[24] = "zzw";
            objectArray[25] = zzabl.class;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\u0012\u0000\u0001\u0001\u03e7\u0012\u0000\u0004\u0002\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1007\u0005\u0005\u1007\u0003\u0006\u180c\u0002\n\u1007\u0006\u000b\u001b\f\u1007\u0007\r\u1007\b\u000e\u1007\t\u000f\u1007\u0004\u0010\u1007\n\u0011\u180c\u000b\u0013\u081e\u0014\u001b\u0015\u1409\f\u0016\u1009\r\u03e7\u041b", objectArray);
            return object2;
        }
        return this.zzx;
    }
}

