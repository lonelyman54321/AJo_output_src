/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzvw;
import com.google.android.gms.internal.gtm.zzvx;
import com.google.android.gms.internal.gtm.zzvz;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class zzwa
extends AbstractMap {
    private static final Comparator zza;
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd;
    private Integer zze;
    private String zzf;

    static {
        zzvx zzvx2 = new zzvx();
        zza = zzvx2;
    }

    public zzwa(List object) {
        int n3 = -1;
        Object object2 = new zzvz(this, n3);
        this.zzd = object2;
        object2 = null;
        this.zze = null;
        this.zzf = null;
        Iterator iterator = object.iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            n3 = object.size();
            Object[] objectArray = new Object[n3];
            int n4 = (object = object.iterator()).hasNext();
            if (n4 == 0) {
                object = null;
                object2 = new int[]{0};
                n4 = 16;
                if (n3 > n4 && (n3 *= 9) > 0) {
                    objectArray = Arrays.copyOf(objectArray, 0);
                }
                this.zzb = objectArray;
                this.zzc = (int[])object2;
                return;
            }
            zzvw.zza((zzvw)object.next());
            throw null;
        }
        zzvw.zza((zzvw)iterator.next());
        throw null;
    }

    public static /* bridge */ /* synthetic */ Comparator zza() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ int[] zzb(zzwa zzwa2) {
        return zzwa2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object[] zzc(zzwa zzwa2) {
        return zzwa2.zzb;
    }

    public final Set entrySet() {
        return this.zzd;
    }

    public final int hashCode() {
        Integer n3 = this.zze;
        if (n3 == null) {
            int n4 = super.hashCode();
            this.zze = n3 = Integer.valueOf(n4);
        }
        return this.zze;
    }

    public final String toString() {
        String string2 = this.zzf;
        if (string2 == null) {
            this.zzf = string2 = super.toString();
        }
        return this.zzf;
    }
}

