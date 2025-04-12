/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafa;

final class zzaom {
    private final zzafa zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaom(zzafa zzafa2) {
        this.zza = zzafa2;
    }

    private final void zze(int n3) {
        long l2 = this.zzl;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        int n4 = this.zzm;
        long l7 = this.zzb;
        long l8 = this.zzk;
        zzafa zzafa2 = this.zza;
        int n7 = (int)(l7 -= l8);
        zzafa2.zzs(l2, n4, n7, n3, null);
    }

    public final void zza(long l2, int n3, boolean bl2) {
        boolean bl3;
        boolean bl4 = this.zzj;
        if (bl4 && (bl4 = this.zzg)) {
            boolean bl5;
            this.zzm = bl5 = this.zzc;
            this.zzj = false;
            return;
        }
        bl4 = this.zzh;
        if (!bl4 && !(bl4 = this.zzg)) {
            return;
        }
        if (bl2 && (bl2 = this.zzi)) {
            long l3 = this.zzb;
            int n4 = (int)(l2 -= l3);
            this.zze(n3 += n4);
        }
        this.zzk = l2 = this.zzb;
        this.zzl = l2 = this.zze;
        this.zzm = bl3 = this.zzc;
        this.zzi = true;
    }

    public final void zzb(byte[] byArray, int n3, int n4) {
        int n7 = this.zzf;
        if (n7 != 0) {
            n7 = n3 + 2;
            int n8 = this.zzd;
            if ((n7 -= n8) < n4) {
                int n10 = byArray[n7] & 0x80;
                n3 = 0;
                if (n10 != 0) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    byArray = null;
                }
                this.zzg = n10;
                this.zzf = false;
                return;
            }
            this.zzd = n4 = n4 - n3 + n8;
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long l2, int n3, int n4, long l3, boolean bl2) {
        boolean bl3 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = l3;
        this.zzd = 0;
        this.zzb = l2;
        int n7 = 32;
        int n8 = 1;
        if (n4 >= n7 && n4 != (n7 = 40)) {
            n7 = (int)(this.zzi ? 1 : 0);
            if (n7 != 0 && (n7 = (int)(this.zzj ? 1 : 0)) == 0) {
                if (bl2) {
                    this.zze(n3);
                }
                this.zzi = false;
            }
            if (n4 <= (n7 = 35) || n4 == (n7 = 39)) {
                n7 = this.zzj ^ n8;
                this.zzh = n7;
                this.zzj = n8;
            }
        }
        n7 = n4 >= (n7 = 16) && n4 <= (n7 = 21) ? 1 : 0;
        this.zzc = n7;
        if (n7 != 0 || n4 <= (n7 = 9)) {
            bl3 = true;
        }
        this.zzf = bl3;
    }
}

