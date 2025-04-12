/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzq;
import com.google.android.gms.internal.ads.zzgzu;
import com.google.android.gms.internal.ads.zzgzx;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhff;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

class zzgzy
extends zzgzx {
    protected final byte[] zza;

    public zzgzy(byte[] byArray) {
        super(null);
        byArray.getClass();
        this.zza = byArray;
    }

    public final boolean equals(Object object) {
        int n3 = 1;
        if (object == this) {
            return n3 != 0;
        }
        int n4 = object instanceof zzhac;
        if (n4 == 0) {
            return false;
        }
        n4 = this.zzd();
        Object object2 = object;
        object2 = (zzhac)object;
        int n7 = ((zzhac)object2).zzd();
        if (n4 != n7) {
            return false;
        }
        n4 = this.zzd();
        if (n4 == 0) {
            return n3 != 0;
        }
        n3 = object instanceof zzgzy;
        if (n3 != 0) {
            object = (zzgzy)object;
            n3 = this.zzr();
            n4 = ((zzhac)object).zzr();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.zzd();
            return this.zzg((zzhac)object, 0, n3);
        }
        return object.equals(this);
    }

    public byte zza(int n3) {
        return this.zza[n3];
    }

    public byte zzb(int n3) {
        return this.zza[n3];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public void zze(byte[] byArray, int n3, int n4, int n7) {
        System.arraycopy(this.zza, n3, byArray, n4, n7);
    }

    public final boolean zzg(zzhac object, int n3, int n4) {
        int n7 = ((zzhac)object).zzd();
        if (n4 <= n7) {
            n7 = n3 + n4;
            int n8 = ((zzhac)object).zzd();
            if (n7 <= n8) {
                n8 = object instanceof zzgzy;
                Object var6_6 = null;
                if (n8 != 0) {
                    object = (zzgzy)object;
                    byte[] byArray = this.zza;
                    byte[] byArray2 = ((zzgzy)object).zza;
                    int n10 = this.zzc() + n4;
                    n4 = this.zzc();
                    int n14 = ((zzgzy)object).zzc() + n3;
                    while (n4 < n10) {
                        n3 = byArray[n4];
                        byte by2 = byArray2[n14];
                        if (n3 != by2) {
                            return false;
                        }
                        ++n4;
                        ++n14;
                    }
                    return true;
                }
                object = ((zzhac)object).zzk(n3, n7);
                zzhac zzhac2 = this.zzk(0, n4);
                return ((zzhac)object).equals(zzhac2);
            }
            int n15 = ((zzhac)object).zzd();
            String string2 = ", ";
            StringBuilder stringBuilder = fQ2.a("Ran off end of other: ", string2, string2, n3, n4);
            stringBuilder.append(n15);
            object = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        n3 = this.zzd();
        StringBuilder stringBuilder = new StringBuilder("Length too large: ");
        stringBuilder.append(n4);
        stringBuilder.append(n3);
        String string3 = stringBuilder.toString();
        object = new IllegalArgumentException(string3);
        throw object;
    }

    public final int zzi(int n3, int n4, int n7) {
        int n8 = this.zzc() + n4;
        byte[] byArray = this.zza;
        return zzhcb.zzb(n3, byArray, n8, n7);
    }

    public final int zzj(int n3, int n4, int n7) {
        int n8 = this.zzc() + n4;
        byte[] byArray = this.zza;
        return zzhff.zzf(n3, byArray, n8, n7 += n8);
    }

    public final zzhac zzk(int n3, int n4) {
        int n7 = this.zzd();
        if ((n4 = zzhac.zzq(n3, n4, n7)) == 0) {
            return zzhac.zzb;
        }
        byte[] byArray = this.zza;
        int n8 = this.zzc() + n3;
        zzgzu zzgzu2 = new zzgzu(byArray, n8, n4);
        return zzgzu2;
    }

    public final zzham zzl() {
        byte[] byArray = this.zza;
        int n3 = this.zzc();
        int n4 = this.zzd();
        return zzham.zzJ(byArray, n3, n4, true);
    }

    public final String zzm(Charset charset) {
        byte[] byArray = this.zza;
        int n3 = this.zzc();
        int n4 = this.zzd();
        String string2 = new String(byArray, n3, n4, charset);
        return string2;
    }

    public final ByteBuffer zzn() {
        byte[] byArray = this.zza;
        int n3 = this.zzc();
        int n4 = this.zzd();
        return ByteBuffer.wrap(byArray, n3, n4).asReadOnlyBuffer();
    }

    public final void zzo(zzgzq zzgzq2) {
        byte[] byArray = this.zza;
        int n3 = this.zzc();
        int n4 = this.zzd();
        zzgzq2.zza(byArray, n3, n4);
    }

    public final boolean zzp() {
        int n3 = this.zzc();
        int n4 = this.zzd() + n3;
        return zzhff.zzj(this.zza, n3, n4);
    }
}

