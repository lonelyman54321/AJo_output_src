/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdy;
import com.google.android.gms.internal.auth.zzea;
import com.google.android.gms.internal.auth.zzee;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzhm;
import java.nio.charset.Charset;

class zzeb
extends zzea {
    protected final byte[] zza;

    public zzeb(byte[] byArray) {
        byArray.getClass();
        this.zza = byArray;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzee;
        StringBuilder stringBuilder = null;
        if (n3 == 0) {
            return false;
        }
        n3 = this.zzd();
        Object object2 = object;
        object2 = (zzee)object;
        int n4 = ((zzee)object2).zzd();
        if (n3 != n4) {
            return false;
        }
        n3 = this.zzd();
        if (n3 == 0) {
            return bl2;
        }
        n3 = object instanceof zzeb;
        if (n3 != 0) {
            object = (zzeb)object;
            n3 = this.zzj();
            n4 = ((zzee)object).zzj();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.zzd();
            if (n3 <= (n4 = ((zzeb)object).zzd())) {
                n4 = ((zzeb)object).zzd();
                if (n3 <= n4) {
                    boolean bl3;
                    object2 = this.zza;
                    byte[] byArray = ((zzeb)object).zza;
                    ((zzeb)object).zzc();
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
                int n10 = ((zzeb)object).zzd();
                object = D70.b(n3, n10, "Ran off end of other: 0, ", ", ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            int n14 = this.zzd();
            stringBuilder = new StringBuilder("Length too large: ");
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
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public final int zze(int n3, int n4, int n7) {
        byte[] byArray = this.zza;
        return zzez.zzd(n3, byArray, 0, n7);
    }

    public final zzee zzf(int n3, int n4) {
        n3 = this.zzd();
        if ((n3 = zzee.zzi(0, n4, n3)) == 0) {
            return zzee.zzb;
        }
        byte[] byArray = this.zza;
        zzdy zzdy2 = new zzdy(byArray, 0, n3);
        return zzdy2;
    }

    public final String zzg(Charset charset) {
        byte[] byArray = this.zza;
        int n3 = this.zzd();
        String string2 = new String(byArray, 0, n3, charset);
        return string2;
    }

    public final boolean zzh() {
        byte[] byArray = this.zza;
        int n3 = this.zzd();
        return zzhm.zzd(byArray, 0, n3);
    }
}

