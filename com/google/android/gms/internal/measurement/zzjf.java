/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziv;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjc;
import com.google.android.gms.internal.measurement.zzjg;
import com.google.android.gms.internal.measurement.zzkj;

class zzjf
extends zzjg {
    protected final byte[] zzb;

    public zzjf(byte[] byArray) {
        super(null);
        byArray.getClass();
        this.zzb = byArray;
    }

    public final boolean equals(Object object) {
        int n3 = 1;
        if (object == this) {
            return n3 != 0;
        }
        int n4 = object instanceof zziy;
        if (n4 == 0) {
            return false;
        }
        n4 = this.zzb();
        Object object2 = object;
        object2 = (zziy)object;
        int n7 = ((zziy)object2).zzb();
        if (n4 != n7) {
            return false;
        }
        n4 = this.zzb();
        if (n4 == 0) {
            return n3 != 0;
        }
        n3 = object instanceof zzjf;
        if (n3 != 0) {
            object = (zzjf)object;
            n3 = this.zza();
            n4 = ((zziy)object).zza();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.zzb();
            return this.zza((zziy)object, 0, n3);
        }
        return object.equals(this);
    }

    public byte zza(int n3) {
        return this.zzb[n3];
    }

    public final zziy zza(int n3, int n4) {
        int n7 = this.zzb();
        n3 = zziy.zza(0, n4, n7);
        if (n3 == 0) {
            return zziy.zza;
        }
        byte[] byArray = this.zzb;
        int n8 = this.zzc();
        zzjc zzjc2 = new zzjc(byArray, n8, n3);
        return zzjc2;
    }

    public final void zza(zziv zziv2) {
        byte[] byArray = this.zzb;
        int n3 = this.zzc();
        int n4 = this.zzb();
        zziv2.zza(byArray, n3, n4);
    }

    public final boolean zza(zziy object, int n3, int n4) {
        n3 = ((zziy)object).zzb();
        if (n4 <= n3) {
            n3 = ((zziy)object).zzb();
            if (n4 <= n3) {
                n3 = object instanceof zzjf;
                Object var4_4 = null;
                if (n3 != 0) {
                    object = (zzjf)object;
                    byte[] byArray = this.zzb;
                    byte[] byArray2 = ((zzjf)object).zzb;
                    int n7 = this.zzc() + n4;
                    n4 = this.zzc();
                    int n8 = ((zzjf)object).zzc();
                    while (n4 < n7) {
                        byte by2 = byArray[n4];
                        byte by4 = byArray2[n8];
                        if (by2 != by4) {
                            return false;
                        }
                        ++n4;
                        ++n8;
                    }
                    return true;
                }
                object = ((zziy)object).zza(0, n4);
                zziy zziy2 = this.zza(0, n4);
                return ((zziy)object).equals(zziy2);
            }
            int n10 = ((zziy)object).zzb();
            object = D70.b(n4, n10, "Ran off end of other: 0, ", ", ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        n3 = this.zzb();
        StringBuilder stringBuilder = new StringBuilder("Length too large: ");
        stringBuilder.append(n4);
        stringBuilder.append(n3);
        String string2 = stringBuilder.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public byte zzb(int n3) {
        return this.zzb[n3];
    }

    public int zzb() {
        return this.zzb.length;
    }

    public final int zzb(int n3, int n4, int n7) {
        byte[] byArray = this.zzb;
        int n8 = this.zzc();
        return zzkj.zza(n3, byArray, n8, n7);
    }

    public int zzc() {
        return 0;
    }
}

