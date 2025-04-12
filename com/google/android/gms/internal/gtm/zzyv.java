/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzyp;
import com.google.android.gms.internal.gtm.zzys;
import com.google.android.gms.internal.gtm.zzyu;
import com.google.android.gms.internal.gtm.zzyx;

class zzyv
extends zzyu {
    protected final byte[] zza;

    public zzyv(byte[] byArray) {
        super(null);
        byArray.getClass();
        this.zza = byArray;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzyx;
        StringBuilder stringBuilder = null;
        if (n3 == 0) {
            return false;
        }
        n3 = this.zzd();
        Object object2 = object;
        object2 = (zzyx)object;
        int n4 = ((zzyx)object2).zzd();
        if (n3 != n4) {
            return false;
        }
        n3 = this.zzd();
        if (n3 == 0) {
            return bl2;
        }
        n3 = object instanceof zzyv;
        if (n3 != 0) {
            object = (zzyv)object;
            n3 = this.zzi();
            n4 = ((zzyx)object).zzi();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.zzd();
            if (n3 <= (n4 = ((zzyv)object).zzd())) {
                n4 = ((zzyv)object).zzd();
                if (n3 <= n4) {
                    boolean bl3;
                    object2 = this.zza;
                    byte[] byArray = ((zzyv)object).zza;
                    ((zzyv)object).zzc();
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
                int n10 = ((zzyv)object).zzd();
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
        return zzaco.zzb(n3, byArray, 0, n7);
    }

    public final zzyx zzf(int n3, int n4) {
        n3 = this.zzd();
        if ((n3 = zzyx.zzh(0, n4, n3)) == 0) {
            return zzyx.zzb;
        }
        byte[] byArray = this.zza;
        zzys zzys2 = new zzys(byArray, 0, n3);
        return zzys2;
    }

    public final void zzg(zzyp zzyp2) {
        int n3 = this.zzd();
        byte[] byArray = this.zza;
        zzyp2.zza(byArray, 0, n3);
    }
}

