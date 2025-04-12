/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeah;
import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzeag
implements zzgfp {
    final /* synthetic */ zzeah zza;

    public zzeag(zzeah zzeah2) {
        this.zza = zzeah2;
    }

    public final void zza(Throwable object) {
        Object object2 = zzbep.zzgs;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean n3 = (Boolean)object2;
        if (n3) {
            object2 = zzeah.zzd();
            object = ((Throwable)object).getMessage();
            boolean bl2 = ((Matcher)(object = ((Pattern)object2).matcher((CharSequence)object))).matches();
            if (bl2) {
                int n4 = 1;
                object = ((Matcher)object).group(n4);
                object2 = zzeah.zza(this.zza);
                int n7 = Integer.parseInt((String)object);
                ((zzeev)object2).zzi(n7);
            }
        }
    }
}

