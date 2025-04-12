/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzp {
    public static final zzp zza;

    static {
        zzp zzp2;
        zza = zzp2 = new zzp();
    }

    public final zzl zza(Context context, zzdx zzdx2) {
        zzl zzl2;
        List<String> list;
        zzfh zzfh2;
        Object object;
        List list2;
        StackTraceElement[] stackTraceElementArray;
        zzdx zzdx3 = zzdx2;
        String string2 = zzdx2.zzk();
        Object object2 = zzdx2.zzp();
        boolean bl2 = object2.isEmpty();
        ArrayList arrayList = null;
        if (!bl2) {
            stackTraceElementArray = new ArrayList(object2);
            list2 = Collections.unmodifiableList(stackTraceElementArray);
            object2 = context;
        } else {
            object2 = context;
            list2 = null;
        }
        boolean bl3 = zzdx3.zzr((Context)object2);
        Bundle bundle = zzdx3.zzf(AdMobAdapter.class);
        String string3 = zzdx2.zzl();
        stackTraceElementArray = zzdx2.zzi();
        if (stackTraceElementArray != null) {
            object = new zzfh((SearchAdRequest)stackTraceElementArray);
            zzfh2 = object;
        } else {
            zzfh2 = null;
        }
        object2 = context.getApplicationContext();
        if (object2 != null) {
            object2 = object2.getPackageName();
            zzay.zzb();
            stackTraceElementArray = Thread.currentThread().getStackTrace();
            object2 = zzf.zzr(stackTraceElementArray, (String)object2);
            list = object2;
        } else {
            list = null;
        }
        boolean bl4 = zzdx2.zzq();
        stackTraceElementArray = zzej.zzf().zzc();
        int n3 = zzdx2.zzb();
        int n4 = stackTraceElementArray.getTagForChildDirectedTreatment();
        int n7 = Math.max(n3, n4);
        object2 = stackTraceElementArray.getMaxAdContentRating();
        object2 = Arrays.asList(null, object2);
        arrayList = new ArrayList();
        Object object3 = object2 = Collections.max(object2, arrayList);
        object3 = (String)object2;
        List list3 = zzdx2.zzn();
        object2 = zzl2;
        Bundle bundle2 = zzdx2.zzg();
        Bundle bundle3 = zzdx2.zze();
        object = zzdx2.zzo();
        arrayList = new ArrayList(object);
        List list4 = Collections.unmodifiableList(arrayList);
        String string4 = zzdx2.zzm();
        int n8 = stackTraceElementArray.getTagForUnderAgeOfConsent();
        int n10 = zzdx2.zza();
        String string5 = zzdx2.zzj();
        int n14 = stackTraceElementArray.getPublisherPrivacyPersonalizationState().getValue();
        long l2 = zzdx2.zzc();
        zzl2 = new zzl(8, -1, bundle, -1, list2, bl3, n7, false, string3, zzfh2, null, string2, bundle2, bundle3, list4, string4, (String)((Object)list), bl4, null, n8, (String)object3, list3, n10, string5, n14, l2);
        return zzl2;
    }
}

