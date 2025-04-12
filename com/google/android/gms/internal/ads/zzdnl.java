/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.IBinder
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzchd;

public final class zzdnl
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzchd zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ WindowManager.LayoutParams zzd;
    public final /* synthetic */ int zze;
    public final /* synthetic */ WindowManager zzf;

    public /* synthetic */ zzdnl(View view, zzchd zzchd2, String string2, WindowManager.LayoutParams layoutParams, int n3, WindowManager windowManager) {
        this.zza = view;
        this.zzb = zzchd2;
        this.zzc = string2;
        this.zzd = layoutParams;
        this.zze = n3;
        this.zzf = windowManager;
    }

    public final void onScrollChanged() {
        IBinder iBinder;
        Object object = this.zza;
        Rect rect = new Rect();
        boolean bl2 = object.getGlobalVisibleRect(rect);
        if (bl2 && (iBinder = (object = this.zzb).zzF().getWindowToken()) != null) {
            int n3;
            int n4;
            boolean bl3;
            int n7 = this.zze;
            WindowManager.LayoutParams layoutParams = this.zzd;
            String string2 = "1";
            String string3 = this.zzc;
            boolean bl4 = string2.equals(string3);
            layoutParams.y = !bl4 && !(bl3 = (string2 = "2").equals(string3)) ? (n4 = rect.top - n7) : (n3 = rect.bottom - n7);
            rect = this.zzf;
            object = object.zzF();
            rect.updateViewLayout((View)object, (ViewGroup.LayoutParams)layoutParams);
        }
    }
}

