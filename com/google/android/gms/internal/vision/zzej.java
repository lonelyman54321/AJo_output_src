/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzeb;
import com.google.android.gms.internal.vision.zzee;
import com.google.android.gms.internal.vision.zzey;
import java.util.Iterator;
import java.util.Set;

public abstract class zzej
extends zzeb
implements Set {
    private transient zzee zza;

    public static int zza(int n3) {
        n3 = Math.max(n3, 2);
        int n4 = 0x2CCCCCCC;
        int n7 = 1;
        if (n3 < n4) {
            double d2;
            double d5;
            double d7;
            double d9;
            n4 = Integer.highestOneBit(n3 + -1) << n7;
            while ((d9 = (d7 = (d5 = (double)n4 * 0.7) - (d2 = (double)n3)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
                n4 <<= 1;
            }
            return n4;
        }
        n4 = 0x40000000;
        if (n3 >= n4) {
            n7 = 0;
        }
        zzde.zza(n7 != 0, (Object)"collection too large");
        return n4;
    }

    public boolean equals(Object object) {
        boolean bl2;
        if (object == this) {
            return true;
        }
        boolean n3 = object instanceof zzej;
        if (n3 && (bl2 = this.zzg())) {
            int n4;
            int n7;
            Object object2 = object;
            object2 = (zzej)object;
            boolean bl3 = ((zzej)object2).zzg();
            if (bl3 && (n7 = this.hashCode()) != (n4 = object.hashCode())) {
                return false;
            }
        }
        return zzey.zza(this, object);
    }

    public int hashCode() {
        return zzey.zza(this);
    }

    public /* synthetic */ Iterator iterator() {
        return this.zza();
    }

    public zzee zze() {
        zzee zzee2 = this.zza;
        if (zzee2 == null) {
            this.zza = zzee2 = this.zzh();
        }
        return zzee2;
    }

    public boolean zzg() {
        return false;
    }

    public zzee zzh() {
        return zzee.zza(this.toArray());
    }
}

