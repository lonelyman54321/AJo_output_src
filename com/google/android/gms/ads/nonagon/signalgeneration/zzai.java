/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

final class zzai
implements zzgfp {
    final /* synthetic */ zzaj zza;

    public zzai(zzaj zzaj2) {
        this.zza = zzaj2;
    }

    public final void zza(Throwable object) {
        boolean bl2;
        zzu.zzo().zzw((Throwable)object, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Object object2 = zzaj.zzp(this.zza);
        String string2 = ((Throwable)object).getMessage();
        Object object3 = new Pair((Object)"sgf_reason", (Object)string2);
        string2 = new Pair((Object)"se", (Object)"query_g");
        String string3 = AdFormat.BANNER.name();
        Pair pair = new Pair((Object)"ad_format", (Object)string3);
        int n3 = 6;
        String string4 = Integer.toString(n3);
        string3 = new Pair((Object)"rtype", (Object)string4);
        string4 = new Pair((Object)"scar", (Object)"true");
        String string5 = Integer.toString(zzaj.zzE(this.zza).get());
        String string6 = "sgi_rn";
        Pair pair2 = new Pair((Object)string6, (Object)string5);
        Pair[] pairArray = new Pair[n3];
        string5 = null;
        pairArray[0] = object3;
        pairArray[1] = string2;
        pairArray[2] = pair;
        pairArray[3] = string3;
        pairArray[4] = string4;
        pairArray[5] = pair2;
        object3 = null;
        string2 = "sgf";
        zzp.zzd((zzdvh)object2, null, string2, pairArray);
        zzm.zzh("Failed to initialize webview for loading SDKCore. ", (Throwable)object);
        object = zzbep.zzjI;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean n4 = (Boolean)object;
        if (n4 && !(bl2 = ((AtomicBoolean)(object = zzaj.zzD(this.zza))).get())) {
            object = zzaj.zzE(this.zza);
            int n7 = ((AtomicInteger)object).getAndIncrement();
            object2 = zzbep.zzjJ;
            object3 = zzba.zzc();
            object2 = (Integer)((zzben)object3).zza((zzbeg)object2);
            int n8 = (Integer)object2;
            if (n7 < n8) {
                object = this.zza;
                zzaj.zzI((zzaj)object);
            }
        }
    }
}

