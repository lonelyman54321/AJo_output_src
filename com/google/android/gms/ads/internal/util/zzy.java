/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Rect
 *  android.media.AudioManager
 *  android.text.TextUtils
 *  android.view.DisplayCutout
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 *  android.view.WindowManager$LayoutParams
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzw;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.Locale;

public class zzy
extends zzw {
    public static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        Object object = zzu.zzo().zzi().zzm();
        if (object == null) {
            object = FG3.a(windowInsets);
            String string2 = "";
            if (object != null) {
                int n3;
                zzg zzg2 = zzu.zzo().zzi();
                object = il3_1.a((DisplayCutout)object).iterator();
                while ((n3 = object.hasNext()) != 0) {
                    Object object2 = (Rect)object.next();
                    Object object3 = Locale.US;
                    int n4 = object2.left;
                    int n7 = object2.top;
                    int n8 = object2.right;
                    n3 = object2.bottom;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(n4);
                    object3 = ",";
                    stringBuilder.append((String)object3);
                    stringBuilder.append(n7);
                    stringBuilder.append((String)object3);
                    stringBuilder.append(n8);
                    stringBuilder.append((String)object3);
                    stringBuilder.append(n3);
                    object2 = stringBuilder.toString();
                    n4 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                    if (n4 == 0) {
                        object3 = "|";
                        string2 = string2.concat((String)object3);
                    }
                    string2 = string2.concat((String)object2);
                }
                zzg2.zzD(string2);
            } else {
                object = zzu.zzo().zzi();
                object.zzD(string2);
            }
        }
        zzy.zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean n3, Activity activity) {
        activity = activity.getWindow();
        WindowManager.LayoutParams layoutParams = activity.getAttributes();
        int n4 = kl3_1.a(layoutParams);
        int n7 = 1;
        if (n7 != n3) {
            n7 = 2;
        }
        if (n7 != n4) {
            ll3_1.a(layoutParams, n7);
            activity.setAttributes(layoutParams);
        }
    }

    public final int zzj(AudioManager audioManager) {
        return jl3_1.a(audioManager);
    }

    public final void zzk(Activity activity) {
        Object object = zzbep.zzbg;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = zzu.zzo().zzi().zzm()) == null && !(bl2 = d3.a(activity))) {
            bl2 = true;
            zzy.zzn(bl2, activity);
            object = activity.getWindow().getDecorView();
            object2 = new zzx(this, activity);
            object.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)object2);
        }
    }
}

