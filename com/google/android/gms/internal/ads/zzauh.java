/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzauf;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzauh
extends Enum
implements zzhbs {
    public static final /* enum */ zzauh zza;
    public static final /* enum */ zzauh zzb;
    public static final /* enum */ zzauh zzc;
    public static final /* enum */ zzauh zzd;
    public static final /* enum */ zzauh zze;
    public static final /* enum */ zzauh zzf;
    public static final /* enum */ zzauh zzg;
    public static final /* enum */ zzauh zzh;
    public static final /* enum */ zzauh zzi;
    public static final /* enum */ zzauh zzj;
    public static final /* enum */ zzauh zzk;
    public static final /* enum */ zzauh zzl;
    public static final /* enum */ zzauh zzm;
    public static final /* enum */ zzauh zzn;
    private static final zzhbt zzo;
    private static final /* synthetic */ zzauh[] zzp;
    private final int zzq;

    static {
        zzauh zzauh2;
        zzauh zzauh3;
        zzauh zzauh4;
        zzauh zzauh5;
        zzauh zzauh6;
        zzauh zzauh7;
        zzauh zzauh8;
        zzauh zzauh9;
        zzauh zzauh10;
        zzauh zzauh11;
        zzauh zzauh12;
        zzauh zzauh13;
        zzauh zzauh14;
        Object object = new zzauh("TRIGGER_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzauh14 = new zzauh("NO_TRIGGER", n3, n3);
        int n4 = 2;
        zzc = zzauh13 = new zzauh("ON_BACK_PRESSED", n4, n4);
        int n7 = 3;
        zzd = zzauh12 = new zzauh("HANDLE_ON_BACK_PRESSED", n7, n7);
        int n8 = 4;
        zze = zzauh11 = new zzauh("ON_KEY_DOWN", n8, n8);
        int n10 = 5;
        zzf = zzauh10 = new zzauh("ON_BACK_INVOKED", n10, n10);
        int n14 = 6;
        zzg = zzauh9 = new zzauh("ON_CREATE", n14, n14);
        n14 = 7;
        zzh = zzauh8 = new zzauh("ON_START", n14, n14);
        n10 = 8;
        zzi = zzauh7 = new zzauh("ON_RESUME", n10, n10);
        n8 = 9;
        zzj = zzauh6 = new zzauh("ON_RESTART", n8, n8);
        n7 = 10;
        zzk = zzauh5 = new zzauh("ON_PAUSE", n7, n7);
        n4 = 11;
        zzl = zzauh4 = new zzauh("ON_STOP", n4, n4);
        n3 = 12;
        zzm = zzauh3 = new zzauh("ON_DESTROY", n3, n3);
        int n15 = 13;
        zzn = zzauh2 = new zzauh("ERROR_EMPTY_STACK_TRACE", n15, n15);
        zzauh[] zzauhArray = new zzauh[14];
        zzauhArray[0] = object;
        zzauhArray[1] = zzauh14;
        zzauhArray[2] = zzauh13;
        zzauhArray[3] = zzauh12;
        zzauhArray[4] = zzauh11;
        zzauhArray[5] = zzauh10;
        zzauhArray[6] = zzauh9;
        zzauhArray[7] = zzauh8;
        zzauhArray[8] = zzauh7;
        zzauhArray[9] = zzauh6;
        zzauhArray[10] = zzauh5;
        zzauhArray[11] = zzauh4;
        zzauhArray[12] = zzauh3;
        zzauhArray[n15] = zzauh2;
        zzp = zzauhArray;
        zzo = object = new zzauf();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzauh() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzq = var3_2;
    }

    public static zzauh[] values() {
        return (zzauh[])zzp.clone();
    }

    public static zzauh zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 13: {
                return zzn;
            }
            case 12: {
                return zzm;
            }
            case 11: {
                return zzl;
            }
            case 10: {
                return zzk;
            }
            case 9: {
                return zzj;
            }
            case 8: {
                return zzi;
            }
            case 7: {
                return zzh;
            }
            case 6: {
                return zzg;
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return zze;
            }
            case 3: {
                return zzd;
            }
            case 2: {
                return zzc;
            }
            case 1: {
                return zzb;
            }
            case 0: 
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzq);
    }

    public final int zza() {
        return this.zzq;
    }
}

