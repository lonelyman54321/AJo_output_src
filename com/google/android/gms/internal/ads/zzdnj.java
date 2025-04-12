/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.WindowManager
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdnn;
import java.util.Map;

public final class zzdnj
implements zzblp {
    public final /* synthetic */ zzdnn zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ WindowManager zzc;

    public /* synthetic */ zzdnj(zzdnn zzdnn2, View view, WindowManager windowManager) {
        this.zza = zzdnn2;
        this.zzb = view;
        this.zzc = windowManager;
    }

    public final void zza(Object object, Map map2) {
        zzdnn zzdnn2 = this.zza;
        View view = this.zzb;
        WindowManager windowManager = this.zzc;
        object = (zzchd)object;
        zzdnn2.zze(view, windowManager, (zzchd)object, map2);
    }
}

