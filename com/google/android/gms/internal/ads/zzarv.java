/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaru;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzarv {
    protected static final Comparator zza;
    private final List zzb;
    private final List zzc;
    private int zzd;

    static {
        zzaru zzaru2 = new zzaru();
        zza = zzaru2;
    }

    public zzarv(int n3) {
        ArrayList arrayList;
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList(64);
        this.zzd = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void zzc() {
        int n3;
        int n4;
        // MONITORENTER : this
        while ((n4 = this.zzd) > (n3 = 4096)) {
            Object object = this.zzb;
            n3 = 0;
            List list = null;
            object = object.remove(0);
            object = (byte[])object;
            list = this.zzc;
            list.remove(object);
            n3 = this.zzd;
            n4 = ((Object)object).length;
            this.zzd = n3 -= n4;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(byte[] byArray) {
        synchronized (this) {
            int n3;
            int n4;
            if (byArray != null && (n4 = byArray.length) <= (n3 = 4096)) {
                int n7;
                List list = this.zzb;
                list.add(byArray);
                list = this.zzc;
                Object object = zza;
                n3 = Collections.binarySearch(list, byArray, object);
                if (n3 < 0) {
                    n3 = -n3 + -1;
                }
                object = this.zzc;
                object.add(n3, byArray);
                this.zzd = n7 = this.zzd + n4;
                this.zzc();
                return;
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zzb(int n3) {
        synchronized (this) {
            Throwable throwable2;
            int n4 = 0;
            while (true) {
                block6: {
                    Object object;
                    try {
                        object = this.zzc;
                        int n7 = object.size();
                        if (n4 >= n7) return new byte[n3];
                        object = this.zzc;
                        object = object.get(n4);
                        int n8 = ((Object)(object = (Object)((byte[])object))).length;
                        if (n8 < n3) break block6;
                        n3 = this.zzd - n8;
                    }
                    catch (Throwable throwable2) {
                        break;
                    }
                    this.zzd = n3;
                    List list = this.zzc;
                    list.remove(n4);
                    list = this.zzb;
                    list.remove(object);
                    return object;
                }
                ++n4;
            }
            throw throwable2;
        }
    }
}

