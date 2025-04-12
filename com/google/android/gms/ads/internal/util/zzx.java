/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.ads.internal.util.zzy;

public final class zzx
implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ zzy zza;
    public final /* synthetic */ Activity zzb;

    public /* synthetic */ zzx(zzy zzy2, Activity activity) {
        this.zza = zzy2;
        this.zzb = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzy.zzl(this.zzb, view, windowInsets);
    }
}

