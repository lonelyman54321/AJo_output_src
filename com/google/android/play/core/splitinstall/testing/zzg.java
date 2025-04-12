/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.testing.zzr;
import java.util.ArrayList;
import java.util.List;

public final class zzg
implements zzr {
    public final /* synthetic */ Integer zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ Long zzd;
    public final /* synthetic */ Long zze;
    public final /* synthetic */ List zzf;
    public final /* synthetic */ List zzg;

    public /* synthetic */ zzg(Integer n3, int n4, int n7, Long l2, Long l3, List list, List list2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = l2;
        this.zze = l3;
        this.zzf = list;
        this.zzg = list2;
    }

    public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
        SplitInstallSessionState splitInstallSessionState2;
        long l2;
        Integer n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        Object object = this.zzd;
        Long l3 = this.zze;
        List list = this.zzf;
        List list2 = this.zzg;
        if (splitInstallSessionState == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            l2 = 0L;
            long l4 = 0L;
            splitInstallSessionState2 = SplitInstallSessionState.create(0, 0, 0, l2, l4, arrayList, arrayList2);
        } else {
            splitInstallSessionState2 = splitInstallSessionState;
        }
        int n8 = n3 == null ? splitInstallSessionState2.sessionId() : n3.intValue();
        long l7 = object == null ? splitInstallSessionState2.bytesDownloaded() : ((Long)object).longValue();
        l2 = l3 == null ? splitInstallSessionState2.totalBytesToDownload() : l3.longValue();
        Object object2 = list == null ? (object = splitInstallSessionState2.moduleNames()) : list;
        Object object3 = list2 == null ? (object = splitInstallSessionState2.languages()) : list2;
        return SplitInstallSessionState.create(n8, n4, n7, l7, l2, (List)object2, (List)object3);
    }
}

