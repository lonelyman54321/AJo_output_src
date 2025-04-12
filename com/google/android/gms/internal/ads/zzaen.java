/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaeo;

public final class zzaen {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int n3) {
        int n4 = zzaeo.zzd(n3);
        if (n4 != 0) {
            int n7;
            n4 = n3 >>> 19;
            int n8 = 3;
            int n10 = 1;
            if ((n4 &= n8) != n10 && (n7 = n3 >>> 17 & n8) != 0) {
                int n14 = n3 >>> 12;
                Object object = 15;
                if ((n14 &= object) != 0 && n14 != object && (object = n3 >>> 10 & n8) != n8) {
                    int n15;
                    n14 += -1;
                    this.zza = n4;
                    int n16 = 3 - n7;
                    String[] stringArray = zzaeo.zzk();
                    Object object2 = stringArray[n16];
                    this.zzb = object2;
                    object2 = zzaeo.zzj();
                    this.zzd = object = (Object)object2[object];
                    n16 = 2;
                    if (n4 == n16) {
                        this.zzd = object /= 2;
                    } else if (n4 == 0) {
                        this.zzd = object /= 4;
                    }
                    int n17 = n3 >>> 9 & n10;
                    this.zzg = n15 = zzaeo.zza(n4, n7);
                    if (n7 == n8) {
                        if (n4 == n8) {
                            int[] nArray = zzaeo.zze();
                            n4 = nArray[n14];
                        } else {
                            int[] nArray = zzaeo.zzi();
                            n4 = nArray[n14];
                        }
                        this.zzf = n4;
                        this.zzc = n4 = (n4 * 12 / object + n17) * 4;
                    } else {
                        n15 = 144;
                        if (n4 == n8) {
                            if (n7 == n16) {
                                int[] nArray = zzaeo.zzf();
                                n4 = nArray[n14];
                            } else {
                                int[] nArray = zzaeo.zzg();
                                n4 = nArray[n14];
                            }
                            this.zzf = n4;
                            this.zzc = n4 = zy_2.a(n4, n15, object, n17);
                        } else {
                            int[] nArray = zzaeo.zzh();
                            this.zzf = n4 = nArray[n14];
                            if (n7 == n10) {
                                n15 = 72;
                            }
                            this.zzc = n4 = zy_2.a(n15, n4, object, n17);
                        }
                    }
                    n3 = n3 >> 6 & n8;
                    if (n3 == n8) {
                        n16 = 1;
                    }
                    this.zze = n16;
                    return n10 != 0;
                }
            }
        }
        return false;
    }
}

