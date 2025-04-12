/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdau;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzekn;
import com.google.android.gms.internal.ads.zzemu;
import com.google.android.gms.internal.ads.zzemv;
import com.google.android.gms.internal.ads.zzemw;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzfkx;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzemx
implements zzehl {
    private final zzehn zza;
    private final zzehr zzb;
    private final zzflt zzc;
    private final zzgge zzd;

    public zzemx(zzflt zzflt2, zzgge zzgge2, zzehn zzehn2, zzehr zzehr2) {
        this.zzc = zzflt2;
        this.zzd = zzgge2;
        this.zzb = zzehr2;
        this.zza = zzehn2;
    }

    public static final String zze(String string2, int n3) {
        StringBuilder stringBuilder = new StringBuilder("Error from: ");
        stringBuilder.append(string2);
        stringBuilder.append(", code: ");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final ListenableFuture zza(zzfhf object, zzfgt zzfgt2) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        block8: {
            boolean bl2;
            object6 = zzfgt2.zzu.iterator();
            while (bl2 = object6.hasNext()) {
                object5 = (String)object6.next();
                try {
                    object4 = this.zza;
                }
                catch (zzfhv zzfhv2) {
                    continue;
                }
                object3 = zzfgt2.zzw;
                object6 = object4.zza((String)object5, (JSONObject)object3);
                break block8;
            }
            object6 = null;
        }
        if (object6 == null) {
            object = new zzekn("Unable to instantiate mediation adapter class.");
            return zzgft.zzg((Throwable)object);
        }
        object5 = new zzccn();
        object4 = new zzemw(this, (zzeho)object6, (zzccn)object5);
        object3 = ((zzeho)object6).zzc;
        object3.zza((zzdau)object4);
        boolean bl3 = zzfgt2.zzN;
        if (bl3) {
            object4 = ((zzfhf)object).zza.zza.zzd.zzm;
            object3 = AdMobAdapter.class;
            object2 = object3.getName();
            if ((object2 = object4.getBundle((String)object2)) == null) {
                object2 = new Bundle();
                object3 = object3.getName();
                object4.putBundle((String)object3, (Bundle)object2);
            }
            object4 = "render_test_ad_label";
            boolean bl4 = true;
            object2.putBoolean((String)object4, bl4);
        }
        object4 = this.zzc;
        object3 = zzfln.zzq;
        object2 = new zzemu(this, (zzfhf)object, zzfgt2, (zzeho)object6);
        zzgge zzgge2 = this.zzd;
        object4 = zzfld.zzd((zzfkx)object2, zzgge2, object3, (zzfll)object4);
        object3 = zzfln.zzr;
        object5 = ((zzflk)object4).zzb(object3).zzd((ListenableFuture)object5);
        object4 = zzfln.zzs;
        object5 = ((zzflk)object5).zzb(object4);
        object4 = new zzemv(this, (zzfhf)object, zzfgt2, (zzeho)object6);
        return ((zzflk)object5).zze((zzfkw)object4).zza();
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = zzfgt2.zzu;
        boolean bl2 = object.isEmpty();
        return !bl2;
    }

    public final /* synthetic */ Object zzc(zzfhf zzfhf2, zzfgt zzfgt2, zzeho zzeho2, Void void_) {
        return this.zzb.zza(zzfhf2, zzfgt2, zzeho2);
    }

    public final /* synthetic */ void zzd(zzfhf zzfhf2, zzfgt zzfgt2, zzeho zzeho2) {
        this.zzb.zzb(zzfhf2, zzfgt2, zzeho2);
    }
}

