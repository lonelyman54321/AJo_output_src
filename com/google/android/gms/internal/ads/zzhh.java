/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhg;
import java.util.Collections;
import java.util.Map;

public final class zzhh {
    public static final /* synthetic */ int zzh;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzbv.zzb("media3.datasource");
    }

    private zzhh(Uri object, long l2, int n3, byte[] byArray, Map map2, long l3, long l4, String string2, int n4, Object object2) {
        int n7;
        boolean bl2;
        block3: {
            block2: {
                bl2 = false;
                n7 = 1;
                long l7 = 0L;
                Object object3 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
                object3 = object3 >= 0 ? (Object)1 : (Object)0;
                zzeq.zzd((boolean)object3);
                zzeq.zzd((boolean)object3);
                object3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                if (object3 > 0) break block2;
                l7 = -1;
                long l8 = l4 - l7;
                object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object3 != false) break block3;
                l4 = l7;
            }
            bl2 = true;
        }
        zzeq.zzd(bl2);
        object.getClass();
        this.zza = object;
        this.zzb = n7;
        this.zzc = null;
        super(map2);
        object = Collections.unmodifiableMap(object);
        this.zzd = object;
        this.zze = l3;
        this.zzf = l4;
        this.zzg = n4;
    }

    public /* synthetic */ zzhh(Uri uri, long l2, int n3, byte[] byArray, Map map2, long l3, long l4, String string2, int n4, Object object, zzhg zzhg2) {
        this(uri, 0L, 1, null, map2, l3, l4, null, n4, null);
    }

    public zzhh(Uri uri, long l2, long l3, String string2) {
        Map map2 = Collections.emptyMap();
        this(uri, 0L, 1, null, map2, l2, l3, null, 0, null);
    }

    public final String toString() {
        CharSequence charSequence = this.zza.toString();
        String string2 = ", ";
        charSequence = Gn.a("DataSpec[GET ", (String)charSequence, string2);
        long l2 = this.zze;
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(string2);
        long l3 = this.zzf;
        ((StringBuilder)charSequence).append(l3);
        ((StringBuilder)charSequence).append(", null, ");
        return g30.a(this.zzg, "]", (StringBuilder)charSequence);
    }

    public final zzhf zza() {
        zzhf zzhf2 = new zzhf(this, null);
        return zzhf2;
    }

    public final boolean zzb(int n3) {
        int n4 = this.zzg & n3;
        return n4 == n3;
    }
}

