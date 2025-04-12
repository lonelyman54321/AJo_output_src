/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.PopupWindow
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.util.PlatformVersion;

public final class zzdsh {
    private Context zza;
    private PopupWindow zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Context context, View view) {
        View view2;
        Context context2;
        boolean bl2 = PlatformVersion.isAtLeastKitKat();
        if (!bl2) return;
        bl2 = PlatformVersion.isAtLeastLollipop();
        if (bl2) {
            return;
        }
        bl2 = context instanceof Activity;
        if (bl2) {
            context2 = context;
            context2 = ((Activity)context).getWindow();
        } else {
            bl2 = false;
            context2 = null;
        }
        if (context2 != null && (view2 = context2.getDecorView()) != null) {
            Context context3 = context;
            Activity activity = (Activity)context;
            boolean bl3 = activity.isDestroyed();
            if (!bl3) {
                FrameLayout frameLayout = new FrameLayout(context);
                int n3 = -1;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n3, n3);
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.addView(view, n3, n3);
                boolean bl4 = true;
                view = new PopupWindow((View)frameLayout, (int)(bl4 ? 1 : 0), (int)(bl4 ? 1 : 0), false);
                view.setOutsideTouchable(bl4);
                view.setClippingEnabled(false);
                String string2 = "Displaying the 1x1 popup off the screen.";
                zzm.zze(string2);
                try {
                    context2 = context2.getDecorView();
                    view.showAtLocation((View)context2, 0, n3, n3);
                }
                catch (Exception exception) {}
            }
        }
        view = null;
        this.zzb = view;
        if (view == null) {
            context = null;
        }
        this.zza = context;
    }

    public final void zzb() {
        PopupWindow popupWindow;
        Context context = this.zza;
        if (context != null && (popupWindow = this.zzb) != null) {
            boolean bl2;
            boolean bl3 = context instanceof Activity;
            if (!(bl3 && (bl2 = (context = (Activity)context).isDestroyed()) || !(bl2 = (context = this.zzb).isShowing()))) {
                context = this.zzb;
                context.dismiss();
            }
            bl2 = false;
            context = null;
            this.zza = null;
            this.zzb = null;
        }
    }
}

