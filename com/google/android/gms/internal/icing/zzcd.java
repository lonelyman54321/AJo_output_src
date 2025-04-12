/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbw;
import com.google.android.gms.internal.icing.zzca;
import com.google.android.gms.internal.icing.zzcc;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzck;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzfr;
import java.nio.charset.Charset;

class zzcd
extends zzcc {
    protected final byte[] zza;

    public zzcd(byte[] byArray) {
        byArray.getClass();
        this.zza = byArray;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzcf;
        StringBuilder stringBuilder = null;
        if (n3 == 0) {
            return false;
        }
        n3 = this.zzc();
        Object object2 = object;
        object2 = (zzcf)object;
        int n4 = ((zzcf)object2).zzc();
        if (n3 != n4) {
            return false;
        }
        n3 = this.zzc();
        if (n3 == 0) {
            return bl2;
        }
        n3 = object instanceof zzcd;
        if (n3 != 0) {
            object = (zzcd)object;
            n3 = this.zzl();
            n4 = ((zzcf)object).zzl();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.zzc();
            if (n3 <= (n4 = ((zzcd)object).zzc())) {
                n4 = ((zzcd)object).zzc();
                if (n3 <= n4) {
                    boolean bl3;
                    object2 = this.zza;
                    byte[] byArray = ((zzcd)object).zza;
                    ((zzcd)object).zzd();
                    int n7 = 0;
                    object = null;
                    int n8 = 0;
                    while (n7 < n3) {
                        Object object3 = object2[n7];
                        byte by2 = byArray[n8];
                        if (object3 != by2) {
                            bl3 = false;
                            Object string2 = null;
                            break;
                        }
                        ++n7;
                        ++n8;
                    }
                    return bl3;
                }
                int n10 = ((zzcd)object).zzc();
                object = C12.a(59, n3, n10, "Ran off end of other: 0, ", ", ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            int n14 = this.zzc();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(n3);
            stringBuilder.append(n14);
            String string2 = stringBuilder.toString();
            object = new IllegalArgumentException(string2);
            throw object;
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
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    public final zzcf zze(int n3, int n4) {
        n3 = this.zzc();
        zzcf.zzm(0, n4, n3);
        if (n4 == 0) {
            return zzcf.zzb;
        }
        byte[] byArray = this.zza;
        zzca zzca2 = new zzca(byArray, 0, n4);
        return zzca2;
    }

    public final void zzf(zzbw zzbw2) {
        byte[] byArray = this.zza;
        int n3 = this.zzc();
        ((zzck)zzbw2).zzp(byArray, 0, n3);
    }

    public final String zzg(Charset charset) {
        byte[] byArray = this.zza;
        int n3 = this.zzc();
        String string2 = new String(byArray, 0, n3, charset);
        return string2;
    }

    public final boolean zzh() {
        byte[] byArray = this.zza;
        int n3 = this.zzc();
        return zzfr.zzb(byArray, 0, n3);
    }

    public final int zzi(int n3, int n4, int n7) {
        byte[] byArray = this.zza;
        return zzdh.zzh(n3, byArray, 0, n7);
    }
}

