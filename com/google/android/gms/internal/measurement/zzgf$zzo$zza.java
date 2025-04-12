/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgf$zzo$zza
extends Enum
implements zzki {
    public static final /* enum */ zzgf$zzo$zza zza;
    public static final /* enum */ zzgf$zzo$zza zzb;
    public static final /* enum */ zzgf$zzo$zza zzc;
    public static final /* enum */ zzgf$zzo$zza zzd;
    public static final /* enum */ zzgf$zzo$zza zze;
    public static final /* enum */ zzgf$zzo$zza zzf;
    public static final /* enum */ zzgf$zzo$zza zzg;
    public static final /* enum */ zzgf$zzo$zza zzh;
    public static final /* enum */ zzgf$zzo$zza zzi;
    public static final /* enum */ zzgf$zzo$zza zzj;
    public static final /* enum */ zzgf$zzo$zza zzk;
    public static final /* enum */ zzgf$zzo$zza zzl;
    private static final /* synthetic */ zzgf$zzo$zza[] zzm;
    private final int zzn;

    static {
        zzgf$zzo$zza zzgf$zzo$zza;
        zzgf$zzo$zza zzgf$zzo$zza2;
        zzgf$zzo$zza zzgf$zzo$zza3;
        zzgf$zzo$zza zzgf$zzo$zza4;
        zzgf$zzo$zza zzgf$zzo$zza5;
        zzgf$zzo$zza zzgf$zzo$zza6;
        zzgf$zzo$zza zzgf$zzo$zza7;
        zzgf$zzo$zza zzgf$zzo$zza8;
        zzgf$zzo$zza zzgf$zzo$zza9;
        zzgf$zzo$zza zzgf$zzo$zza10;
        zzgf$zzo$zza zzgf$zzo$zza11;
        zzgf$zzo$zza zzgf$zzo$zza12;
        zza = zzgf$zzo$zza12 = new zzgf$zzo$zza("CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN", 0, 0);
        int n3 = 1;
        zzb = zzgf$zzo$zza11 = new zzgf$zzo$zza("CLIENT_UPLOAD_ELIGIBLE", n3, n3);
        int n4 = 2;
        zzc = zzgf$zzo$zza10 = new zzgf$zzo$zza("MEASUREMENT_SERVICE_NOT_ENABLED", n4, n4);
        int n7 = 3;
        zzd = zzgf$zzo$zza9 = new zzgf$zzo$zza("ANDROID_TOO_OLD", n7, n7);
        int n8 = 4;
        zze = zzgf$zzo$zza8 = new zzgf$zzo$zza("NON_PLAY_MODE", n8, n8);
        int n10 = 5;
        zzf = zzgf$zzo$zza7 = new zzgf$zzo$zza("SDK_TOO_OLD", n10, n10);
        int n14 = 6;
        zzg = zzgf$zzo$zza6 = new zzgf$zzo$zza("MISSING_JOB_SCHEDULER", n14, n14);
        n14 = 7;
        zzh = zzgf$zzo$zza5 = new zzgf$zzo$zza("NOT_ENABLED_IN_MANIFEST", n14, n14);
        n10 = 8;
        zzi = zzgf$zzo$zza4 = new zzgf$zzo$zza("CLIENT_FLAG_OFF", n10, n10);
        zzj = zzgf$zzo$zza3 = new zzgf$zzo$zza("SERVICE_FLAG_OFF", 9, 20);
        zzk = zzgf$zzo$zza2 = new zzgf$zzo$zza("PINNED_TO_SERVICE_UPLOAD", 10, 21);
        n10 = 11;
        zzl = zzgf$zzo$zza = new zzgf$zzo$zza("MISSING_SGTM_SERVER_URL", n10, 22);
        zzgf$zzo$zza[] zzgf$zzo$zzaArray = new zzgf$zzo$zza[12];
        zzgf$zzo$zzaArray[0] = zzgf$zzo$zza12;
        zzgf$zzo$zzaArray[1] = zzgf$zzo$zza11;
        zzgf$zzo$zzaArray[2] = zzgf$zzo$zza10;
        zzgf$zzo$zzaArray[3] = zzgf$zzo$zza9;
        zzgf$zzo$zzaArray[4] = zzgf$zzo$zza8;
        zzgf$zzo$zzaArray[5] = zzgf$zzo$zza7;
        zzgf$zzo$zzaArray[6] = zzgf$zzo$zza6;
        zzgf$zzo$zzaArray[7] = zzgf$zzo$zza5;
        zzgf$zzo$zzaArray[8] = zzgf$zzo$zza4;
        zzgf$zzo$zzaArray[9] = zzgf$zzo$zza3;
        zzgf$zzo$zzaArray[10] = zzgf$zzo$zza2;
        zzgf$zzo$zzaArray[n10] = zzgf$zzo$zza;
        zzm = zzgf$zzo$zzaArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgf$zzo$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzn = var3_2;
    }

    public static zzgf$zzo$zza[] values() {
        return (zzgf$zzo$zza[])zzm.clone();
    }

    public static zzgf$zzo$zza zza(int n3) {
        switch (n3) {
            default: {
                switch (n3) {
                    default: {
                        return null;
                    }
                    case 22: {
                        return zzl;
                    }
                    case 21: {
                        return zzk;
                    }
                    case 20: 
                }
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

    public static zzkl zzb() {
        return zzgm.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgf$zzo$zza.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzn;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzn;
    }
}

