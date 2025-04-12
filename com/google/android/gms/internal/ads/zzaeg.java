/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzafg;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Collections;
import java.util.List;

public final class zzaeg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzaef zzk;
    private final zzcd zzl;

    private zzaeg(int n3, int n4, int n7, int n8, int n10, int n14, int n15, long l2, zzaef zzaef2, zzcd zzcd2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = n10;
        this.zzf = n3 = zzaeg.zzi(n10);
        this.zzg = n14;
        this.zzh = n15;
        this.zzi = n3 = zzaeg.zzh(n15);
        this.zzj = l2;
        this.zzk = zzaef2;
        this.zzl = zzcd2;
    }

    public zzaeg(byte[] byArray, int n3) {
        int n4 = byArray.length;
        zzft zzft2 = new zzft(byArray, n4);
        zzft2.zzk(n3 *= 8);
        int n7 = 16;
        this.zza = n3 = zzft2.zzd(n7);
        this.zzb = n7 = zzft2.zzd(n7);
        n7 = 24;
        this.zzc = n3 = zzft2.zzd(n7);
        this.zzd = n7 = zzft2.zzd(n7);
        this.zze = n7 = zzft2.zzd(20);
        this.zzf = n7 = zzaeg.zzi(n7);
        this.zzg = n7 = zzft2.zzd(3) + 1;
        this.zzh = n7 = zzft2.zzd(5) + 1;
        this.zzi = n7 = zzaeg.zzh(n7);
        n7 = zzft2.zzd(4);
        n3 = 32;
        int n8 = zzft2.zzd(n3);
        n4 = zzgd.zza;
        long l2 = n8;
        long l3 = n7;
        long l4 = 0xFFFFFFFFL;
        long l7 = (l3 & l4) << n3;
        this.zzj = l7 |= (l2 &= l4);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int n3) {
        int n4 = 8;
        if (n3 != n4) {
            n4 = 12;
            if (n3 != n4) {
                n4 = 16;
                if (n3 != n4) {
                    n4 = 20;
                    if (n3 != n4) {
                        n4 = 24;
                        if (n3 != n4) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int n3) {
        switch (n3) {
            default: {
                return -1;
            }
            case 192000: {
                return 3;
            }
            case 176400: {
                return 2;
            }
            case 96000: {
                return 11;
            }
            case 88200: {
                return 1;
            }
            case 48000: {
                return 10;
            }
            case 44100: {
                return 9;
            }
            case 32000: {
                return 8;
            }
            case 24000: {
                return 7;
            }
            case 22050: {
                return 6;
            }
            case 16000: {
                return 5;
            }
            case 8000: 
        }
        return 4;
    }

    public final long zza() {
        long l2 = this.zzj;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return -9223372036854775807L;
        }
        l3 = this.zze;
        return (l2 *= 1000000L) / l3;
    }

    public final long zzb(long l2) {
        long l3 = this.zze;
        l2 *= l3;
        l3 = this.zzj;
        l2 /= 1000000L;
        l2 = Math.min(l2, l3 += (long)-1);
        return Math.max(0L, l2);
    }

    public final zzan zzc(byte[] object, zzcd zzcd2) {
        int n3 = 4;
        object[n3] = -128;
        zzcd2 = this.zzd(zzcd2);
        zzal zzal2 = new zzal();
        String string2 = "audio/flac";
        zzal2.zzX(string2);
        int n4 = this.zzd;
        if (n4 <= 0) {
            n4 = -1;
        }
        zzal2.zzP(n4);
        n4 = this.zzg;
        zzal2.zzy(n4);
        n4 = this.zze;
        zzal2.zzY(n4);
        n4 = zzgd.zzl(this.zzh);
        zzal2.zzR(n4);
        object = Collections.singletonList(object);
        zzal2.zzL((List)object);
        zzal2.zzQ(zzcd2);
        return zzal2.zzad();
    }

    public final zzcd zzd(zzcd zzcd2) {
        zzcd zzcd3 = this.zzl;
        if (zzcd3 == null) {
            return zzcd2;
        }
        return zzcd3.zzd(zzcd2);
    }

    public final zzaeg zze(List object) {
        zzcd zzcd2 = new zzcd((List)object);
        zzcd zzcd3 = this.zzd(zzcd2);
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        int n8 = this.zzd;
        int n10 = this.zze;
        int n14 = this.zzg;
        int n15 = this.zzh;
        long l2 = this.zzj;
        zzaef zzaef2 = this.zzk;
        object = new zzaeg(n3, n4, n7, n8, n10, n14, n15, l2, zzaef2, zzcd3);
        return object;
    }

    public final zzaeg zzf(zzaef zzaef2) {
        zzcd zzcd2 = this.zzl;
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        int n8 = this.zzd;
        int n10 = this.zze;
        int n14 = this.zzg;
        int n15 = this.zzh;
        long l2 = this.zzj;
        zzaeg zzaeg2 = new zzaeg(n3, n4, n7, n8, n10, n14, n15, l2, zzaef2, zzcd2);
        return zzaeg2;
    }

    public final zzaeg zzg(List object) {
        object = zzafg.zzb((List)object);
        zzcd zzcd2 = this.zzd((zzcd)object);
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        int n8 = this.zzd;
        int n10 = this.zze;
        int n14 = this.zzg;
        int n15 = this.zzh;
        long l2 = this.zzj;
        zzaef zzaef2 = this.zzk;
        object = new zzaeg(n3, n4, n7, n8, n10, n14, n15, l2, zzaef2, zzcd2);
        return object;
    }
}

