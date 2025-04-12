/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzccv;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgu;
import org.json.JSONObject;

public final class zzcub
extends FrameLayout
implements ViewTreeObserver.OnScrollChangedListener,
ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcub(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcub zza(Context object, View object2, zzfgt zzfgt2) {
        int n3;
        float f5;
        zzcub zzcub2 = new zzcub((Context)object);
        object = zzfgt2.zzv;
        int n4 = object.isEmpty();
        if (n4 == 0 && (object = zzcub2.zza.getResources()) != null && (object = object.getDisplayMetrics()) != null) {
            zzfgu zzfgu2 = (zzfgu)zzfgt2.zzv.get(0);
            int n7 = zzfgu2.zza;
            float f6 = n7;
            float f7 = ((DisplayMetrics)object).density;
            f5 = (float)zzfgu2.zzb * f7;
            n4 = (int)(f6 *= f7);
            n3 = (int)f5;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n4, n3);
            zzcub2.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        zzcub2.zzb = object2;
        zzcub2.addView((View)object2);
        zzu.zzx();
        zzccv.zzb((View)zzcub2, zzcub2);
        zzu.zzx();
        zzccv.zza((View)zzcub2, zzcub2);
        object = zzfgt2.zzai;
        object2 = zzcub2.zza;
        zzfgt2 = new RelativeLayout((Context)object2);
        object2 = object.optJSONObject("header");
        if (object2 != null) {
            n3 = 10;
            f5 = 1.4E-44f;
            zzcub2.zzc((JSONObject)object2, (RelativeLayout)zzfgt2, n3);
        }
        if ((object = object.optJSONObject((String)(object2 = "footer"))) != null) {
            int n8 = 12;
            zzcub2.zzc((JSONObject)object, (RelativeLayout)zzfgt2, n8);
        }
        zzcub2.addView((View)zzfgt2);
        return zzcub2;
    }

    private final int zzb(double d2) {
        zzay.zzb();
        Context context = this.zza;
        int n3 = (int)d2;
        return zzf.zzy(context, n3);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int n3) {
        Context context = this.zza;
        TextView textView = new TextView(context);
        int n4 = -1;
        textView.setTextColor(n4);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        String string2 = jSONObject.optString("text", "");
        textView.setText((CharSequence)string2);
        float f5 = (float)jSONObject.optDouble("text_size", 11.0);
        textView.setTextSize(f5);
        double d2 = jSONObject.optDouble("padding", 0.0);
        int n7 = this.zzb(d2);
        textView.setPadding(0, n7, 0, n7);
        double d5 = jSONObject.optDouble("height", 15.0);
        int n8 = this.zzb(d5);
        string2 = new RelativeLayout.LayoutParams(n4, n8);
        string2.addRule(n3);
        relativeLayout.addView((View)textView, (ViewGroup.LayoutParams)string2);
    }

    public final void onGlobalLayout() {
        int[] nArray = new int[2];
        this.getLocationInWindow(nArray);
        View view = this.zzb;
        float f5 = -nArray[1];
        view.setY(f5);
    }

    public final void onScrollChanged() {
        int[] nArray = new int[2];
        this.getLocationInWindow(nArray);
        View view = this.zzb;
        float f5 = -nArray[1];
        view.setY(f5);
    }
}

