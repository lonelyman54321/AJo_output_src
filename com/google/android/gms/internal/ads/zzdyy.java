/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TableRow$LayoutParams
 *  android.widget.TextView
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzfyv;

public final class zzdyy {
    public static final void zza(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag((Object)"layout");
        int n3 = -1;
        zzdyy.zzf((View)linearLayout, n3, n3);
        linearLayout.setGravity(17);
        linearLayout.addView((View)adView);
        adView.setTag("ad_view");
        viewGroup.addView((View)linearLayout);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        int n3 = -1;
        zzdyy.zzf((View)nativeAdView, n3, n3);
        viewGroup.addView((View)nativeAdView);
        viewGroup = new LinearLayout(context);
        String string2 = "layout_tag";
        viewGroup.setTag((Object)string2);
        int n4 = 1;
        viewGroup.setOrientation(n4);
        zzdyy.zzf((View)viewGroup, n3, n3);
        viewGroup.setBackgroundColor(n3);
        nativeAdView.addView((View)viewGroup);
        Object object = zzu.zzo().zze();
        if (object == null) {
            string2 = "Headline";
        } else {
            n4 = R$string.native_headline;
            string2 = object.getString(n4);
        }
        string2 = zzdyy.zzc(context, string2, "headline_header_tag");
        viewGroup.addView((View)string2);
        string2 = zzfyv.zzc(nativeAd.getHeadline());
        String string3 = "headline_tag";
        string2 = zzdyy.zzd(context, string2, string3);
        nativeAdView.setHeadlineView((View)string2);
        viewGroup.addView((View)string2);
        if (object == null) {
            string2 = "Body";
        } else {
            n4 = R$string.native_body;
            string2 = object.getString(n4);
        }
        string2 = zzdyy.zzc(context, string2, "body_header_tag");
        viewGroup.addView((View)string2);
        string2 = zzfyv.zzc(nativeAd.getBody());
        string3 = "body_tag";
        string2 = zzdyy.zzd(context, string2, string3);
        nativeAdView.setBodyView((View)string2);
        viewGroup.addView((View)string2);
        if (object == null) {
            object = "Media View";
        } else {
            n4 = R$string.native_media_view;
            object = object.getString(n4);
        }
        object = zzdyy.zzc(context, (String)object, "media_view_header_tag");
        viewGroup.addView((View)object);
        object = new MediaView(context);
        object.setTag((Object)"media_view_tag");
        nativeAdView.setMediaView((MediaView)((Object)object));
        viewGroup.addView((View)object);
        nativeAdView.setNativeAd(nativeAd);
    }

    private static TextView zzc(Context context, String string2, String string3) {
        return zzdyy.zze(context, string2, 16973894, -9210245, 0.0f, string3);
    }

    private static TextView zzd(Context context, String string2, String string3) {
        return zzdyy.zze(context, string2, 16973892, -16777216, 12.0f, string3);
    }

    private static TextView zze(Context context, String string2, int n3, int n4, float f5, String string3) {
        int n7;
        TextView textView = new TextView(context);
        textView.setTag((Object)string3);
        int n8 = -2;
        zzdyy.zzf((View)textView, n8, n8);
        string3 = textView.getLayoutParams();
        if (string3 == null) {
            string3 = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.LayoutParams)string3);
        string3 = textView.getResources().getDisplayMetrics();
        marginLayoutParams.bottomMargin = n7 = (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)string3);
        textView.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
        textView.setTextAppearance(context, n3);
        textView.setTextColor(n4);
        textView.setText((CharSequence)string2);
        return textView;
    }

    private static void zzf(View view, int n3, int n4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = n3;
        layoutParams2.width = n4;
        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
    }
}

