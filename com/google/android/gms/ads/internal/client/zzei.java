/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.internal.ads.zzbnt;
import java.util.ArrayList;
import java.util.List;

final class zzei
extends zzbnt {
    final /* synthetic */ zzej zza;

    public /* synthetic */ zzei(zzej zzej2, zzeh zzeh2) {
        this.zza = zzej2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(List object) {
        Object object2;
        int n3;
        ArrayList arrayList;
        Object object3 = zzej.zzg(this.zza);
        synchronized (object3) {
            arrayList = this.zza;
            n3 = 0;
            zzej.zzk((zzej)((Object)arrayList), false);
            arrayList = this.zza;
            boolean bl2 = true;
            zzej.zzj((zzej)((Object)arrayList), bl2);
            object2 = this.zza;
            object2 = zzej.zzi((zzej)object2);
            arrayList = new ArrayList(object2);
            object2 = this.zza;
            object2 = zzej.zzi((zzej)object2);
            ((ArrayList)object2).clear();
        }
        object = zzej.zzd((List)object);
        int n4 = arrayList.size();
        while (n3 < n4) {
            object2 = (OnInitializationCompleteListener)arrayList.get(n3);
            object2.onInitializationComplete((InitializationStatus)object);
            ++n3;
        }
        return;
    }
}

