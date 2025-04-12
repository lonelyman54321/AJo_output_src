/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhdt;
import com.google.android.gms.internal.ads.zzhdy;
import java.util.ArrayDeque;
import java.util.Arrays;

final class zzhdu {
    private final ArrayDeque zza;

    private zzhdu() {
        ArrayDeque arrayDeque;
        this.zza = arrayDeque = new ArrayDeque();
    }

    public /* synthetic */ zzhdu(zzhdt arrayDeque) {
        this.zza = arrayDeque = new ArrayDeque();
    }

    public static /* bridge */ /* synthetic */ zzhac zza(zzhdu zzhdu2, zzhac zzhac2, zzhac iterable) {
        boolean bl2;
        zzhdu2.zzb(zzhac2);
        zzhdu2.zzb((zzhac)iterable);
        zzhac2 = (zzhac)zzhdu2.zza.pop();
        while (!(bl2 = ((ArrayDeque)(iterable = zzhdu2.zza)).isEmpty())) {
            iterable = (zzhac)zzhdu2.zza.pop();
            zzhdy zzhdy2 = new zzhdy((zzhac)iterable, zzhac2, null);
            zzhac2 = zzhdy2;
        }
        return zzhac2;
    }

    private final void zzb(zzhac object) {
        boolean n3 = ((zzhac)object).zzh();
        if (n3) {
            int n4;
            int n7 = zzhdu.zzc(((zzhac)object).zzd());
            int n8 = n7 + 1;
            Iterable iterable = this.zza;
            n8 = zzhdy.zzc(n8);
            boolean bl2 = ((ArrayDeque)iterable).isEmpty();
            if (!bl2 && (n4 = ((zzhac)(iterable = (zzhac)this.zza.peek())).zzd()) < n8) {
                int n10;
                int n14;
                int n15 = zzhdy.zzc(n7);
                Iterable iterable2 = (zzhac)this.zza.pop();
                while ((n14 = ((ArrayDeque)(iterable = this.zza)).isEmpty()) == 0 && (n14 = ((zzhac)(iterable = (zzhac)this.zza.peek())).zzd()) < n15) {
                    iterable = (zzhac)this.zza.pop();
                    zzhdy zzhdy2 = new zzhdy((zzhac)iterable, (zzhac)iterable2, null);
                    iterable2 = zzhdy2;
                }
                Iterable iterable3 = new zzhdy((zzhac)iterable2, (zzhac)object, null);
                while ((n10 = ((ArrayDeque)(object = this.zza)).isEmpty()) == 0) {
                    n10 = zzhdu.zzc(iterable3.zzd()) + 1;
                    iterable2 = this.zza;
                    n10 = zzhdy.zzc(n10);
                    n8 = ((zzhac)(iterable2 = (zzhac)((ArrayDeque)iterable2).peek())).zzd();
                    if (n8 >= n10) break;
                    object = (zzhac)this.zza.pop();
                    iterable2 = new zzhdy((zzhac)object, (zzhac)iterable3, null);
                    iterable3 = iterable2;
                }
                this.zza.push(iterable3);
                return;
            }
            this.zza.push(object);
            return;
        }
        boolean bl3 = object instanceof zzhdy;
        if (bl3) {
            object = (zzhdy)object;
            zzhac zzhac2 = zzhdy.zzg((zzhdy)object);
            this.zzb(zzhac2);
            object = zzhdy.zzC((zzhdy)object);
            this.zzb((zzhac)object);
            return;
        }
        object = String.valueOf(object.getClass());
        object = "Has a new type of ByteString been created? Found ".concat((String)object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    private static final int zzc(int n3) {
        int[] nArray = zzhdy.zza;
        if ((n3 = Arrays.binarySearch(nArray, n3)) < 0) {
            n3 = -(n3 + 1) + -1;
        }
        return n3;
    }
}

