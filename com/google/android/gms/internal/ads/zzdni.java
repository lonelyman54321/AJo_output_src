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

public final class zzdni
implements zzblp {
    public final /* synthetic */ zzdnn zza;
    public final /* synthetic */ WindowManager zzb;
    public final /* synthetic */ View zzc;

    public /* synthetic */ zzdni(zzdnn zzdnn2, WindowManager windowManager, View view) {
        this.zza = zzdnn2;
        this.zzb = windowManager;
        this.zzc = view;
    }

    public final void zza(Object object, Map map2) {
        zzdnn zzdnn2 = this.zza;
        WindowManager windowManager = this.zzb;
        View view = this.zzc;
        object = (zzchd)object;
        zzdnn2.zzc(windowManager, view, (zzchd)object, map2);
    }
}

