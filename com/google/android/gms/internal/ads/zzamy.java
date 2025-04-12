/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 */
package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.google.android.gms.internal.ads.zzamr;

final class zzamy {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private String zzl;
    private int zzm;
    private int zzn;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private int zzq;
    private zzamr zzr;
    private float zzs;

    public zzamy() {
        int n3;
        this.zzf = n3 = -1;
        this.zzg = n3;
        this.zzh = n3;
        this.zzi = n3;
        this.zzj = n3;
        this.zzm = n3;
        this.zzn = n3;
        this.zzq = n3;
        this.zzs = Float.MAX_VALUE;
    }

    public final zzamy zzA(boolean bl2) {
        this.zzq = (int)(bl2 ? 1 : 0);
        return this;
    }

    public final zzamy zzB(zzamr zzamr2) {
        this.zzr = zzamr2;
        return this;
    }

    public final zzamy zzC(boolean bl2) {
        this.zzg = (int)(bl2 ? 1 : 0);
        return this;
    }

    public final String zzD() {
        return this.zza;
    }

    public final String zzE() {
        return this.zzl;
    }

    public final boolean zzF() {
        int n3 = this.zzq;
        int n4 = 1;
        if (n3 == n4) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzG() {
        return this.zze;
    }

    public final boolean zzH() {
        return this.zzc;
    }

    public final boolean zzI() {
        int n3 = this.zzf;
        int n4 = 1;
        if (n3 == n4) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzJ() {
        int n3 = this.zzg;
        int n4 = 1;
        if (n3 == n4) {
            return n4 != 0;
        }
        return false;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        boolean bl2 = this.zze;
        if (bl2) {
            return this.zzd;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Background color has not been defined.");
        throw illegalStateException;
    }

    public final int zzd() {
        boolean bl2 = this.zzc;
        if (bl2) {
            return this.zzb;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Font color has not been defined.");
        throw illegalStateException;
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int n3;
        int n4 = this.zzh;
        int n7 = -1;
        if (n4 == n7 && (n3 = this.zzi) == n7) {
            return n7;
        }
        n7 = 0;
        n3 = 1;
        n4 = n4 == n3 ? 1 : 0;
        int n8 = this.zzi;
        if (n8 == n3) {
            n7 = 2;
        }
        return n4 | n7;
    }

    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    public final zzamr zzk() {
        return this.zzr;
    }

    public final zzamy zzl(zzamy zzamy2) {
        if (zzamy2 != null) {
            int n3;
            float f5;
            float f6;
            float f7;
            Object object;
            int n4;
            int n7 = this.zzc;
            if (n7 == 0 && (n7 = zzamy2.zzc) != 0) {
                n7 = zzamy2.zzb;
                this.zzo(n7);
            }
            if ((n7 = this.zzh) == (n4 = -1)) {
                this.zzh = n7 = zzamy2.zzh;
            }
            if ((n7 = this.zzi) == n4) {
                this.zzi = n7 = zzamy2.zzi;
            }
            if ((object = this.zza) == null && (object = zzamy2.zza) != null) {
                this.zza = object;
            }
            if ((n7 = this.zzf) == n4) {
                this.zzf = n7 = zzamy2.zzf;
            }
            if ((n7 = this.zzg) == n4) {
                this.zzg = n7 = zzamy2.zzg;
            }
            if ((n7 = this.zzn) == n4) {
                this.zzn = n7 = zzamy2.zzn;
            }
            if ((object = this.zzo) == null && (object = zzamy2.zzo) != null) {
                this.zzo = object;
            }
            if ((object = this.zzp) == null && (object = zzamy2.zzp) != null) {
                this.zzp = object;
            }
            if ((n7 = this.zzq) == n4) {
                this.zzq = n7 = zzamy2.zzq;
            }
            if ((n7 = this.zzj) == n4) {
                this.zzj = n7 = zzamy2.zzj;
                this.zzk = f7 = zzamy2.zzk;
            }
            if ((object = this.zzr) == null) {
                this.zzr = object = zzamy2.zzr;
            }
            if ((n7 = (int)((f6 = (f7 = this.zzs) - (f5 = Float.MAX_VALUE)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) == 0) {
                this.zzs = f7 = zzamy2.zzs;
            }
            if ((n7 = (int)(this.zze ? 1 : 0)) == 0 && (n7 = (int)(zzamy2.zze ? 1 : 0)) != 0) {
                n7 = zzamy2.zzd;
                this.zzm(n7);
            }
            if ((n7 = this.zzm) == n4 && (n3 = zzamy2.zzm) != n4) {
                this.zzm = n3;
            }
        }
        return this;
    }

    public final zzamy zzm(int n3) {
        this.zzd = n3;
        this.zze = true;
        return this;
    }

    public final zzamy zzn(boolean bl2) {
        this.zzh = (int)(bl2 ? 1 : 0);
        return this;
    }

    public final zzamy zzo(int n3) {
        this.zzb = n3;
        this.zzc = true;
        return this;
    }

    public final zzamy zzp(String string2) {
        this.zza = string2;
        return this;
    }

    public final zzamy zzq(float f5) {
        this.zzk = f5;
        return this;
    }

    public final zzamy zzr(int n3) {
        this.zzj = n3;
        return this;
    }

    public final zzamy zzs(String string2) {
        this.zzl = string2;
        return this;
    }

    public final zzamy zzt(boolean bl2) {
        this.zzi = (int)(bl2 ? 1 : 0);
        return this;
    }

    public final zzamy zzu(boolean bl2) {
        this.zzf = (int)(bl2 ? 1 : 0);
        return this;
    }

    public final zzamy zzv(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzamy zzw(int n3) {
        this.zzn = n3;
        return this;
    }

    public final zzamy zzx(int n3) {
        this.zzm = n3;
        return this;
    }

    public final zzamy zzy(float f5) {
        this.zzs = f5;
        return this;
    }

    public final zzamy zzz(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}

