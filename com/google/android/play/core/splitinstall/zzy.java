/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.zzaa;
import com.google.android.play.core.splitinstall.zzx;
import java.util.ArrayList;

final class zzy
implements Runnable {
    final /* synthetic */ SplitInstallRequest zza;
    final /* synthetic */ zzaa zzb;

    public zzy(zzaa zzaa2, SplitInstallRequest splitInstallRequest) {
        this.zzb = zzaa2;
        this.zza = splitInstallRequest;
    }

    public final void run() {
        boolean bl2;
        zzx zzx2 = zzaa.zzc(this.zzb);
        Object object = this.zza.getModuleNames();
        Object object2 = zzaa.zzd(this.zza.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        int n3 = 5;
        bundle.putInt("status", n3);
        ArrayList arrayList = "error_code";
        bundle.putInt((String)((Object)arrayList), 0);
        boolean bl3 = object.isEmpty();
        if (!bl3) {
            arrayList = new ArrayList(object);
            object = "module_names";
            bundle.putStringArrayList(object, arrayList);
        }
        if (!(bl2 = object2.isEmpty())) {
            object = new ArrayList(object2);
            object2 = "languages";
            bundle.putStringArrayList((String)object2, object);
        }
        long l2 = 0L;
        bundle.putLong("total_bytes_to_download", l2);
        bundle.putLong("bytes_downloaded", l2);
        object = SplitInstallSessionState.zzd(bundle);
        zzx2.zzk((SplitInstallSessionState)object);
    }
}

