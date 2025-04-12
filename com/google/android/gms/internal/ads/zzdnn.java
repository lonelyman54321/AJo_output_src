/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdnj;
import com.google.android.gms.internal.ads.zzdnk;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzdnm;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzdsd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdnn {
    private final zzdsd zza;
    private final zzdqs zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc;

    public zzdnn(zzdsd zzdsd2, zzdqs zzdqs2) {
        this.zza = zzdsd2;
        this.zzb = zzdqs2;
        this.zzc = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final int zzf(Context context, String string2, int n3) {
        try {
            n3 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {}
        zzay.zzb();
        return zzf.zzy(context, n3);
    }

    public final View zza(View object, WindowManager object2) {
        Object object3 = this.zza;
        WeakReference<Object> weakReference = zzq.zzc();
        object3 = ((zzdsd)object3).zza((zzq)((Object)weakReference), null, null);
        weakReference = object3;
        weakReference = (View)object3;
        weakReference.setVisibility(4);
        weakReference.setContentDescription("policy_validator");
        weakReference = new WeakReference<Object>(this);
        object3.zzag("/sendMessageToSdk", (zzblp)((Object)weakReference));
        weakReference = new WeakReference<Object>(this, object2, object);
        object3.zzag("/hideValidatorOverlay", (zzblp)((Object)weakReference));
        weakReference = new WeakReference<Object>(null, null, null, null, null);
        object3.zzag("/open", (zzblp)((Object)weakReference));
        weakReference = new WeakReference<Object>(object3);
        zzdnj zzdnj2 = new zzdnj(this, (View)object, (WindowManager)object2);
        this.zzb.zzm(weakReference, "/loadNativeAdPolicyViolations", zzdnj2);
        object = new WeakReference(object3);
        object2 = new zzdnk();
        this.zzb.zzm((WeakReference)object, "/showValidatorOverlay", (zzblp)object2);
        return (View)object3;
    }

    public final /* synthetic */ void zzb(zzchd zzchd2, Map map2) {
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzchd zzchd2, Map map2) {
        boolean bl2;
        zzm.zze("Hide native ad policy validator overlay.");
        map2 = zzchd2.zzF();
        int n3 = 8;
        map2.setVisibility(n3);
        map2 = zzchd2.zzF().getWindowToken();
        if (map2 != null) {
            map2 = zzchd2.zzF();
            windowManager.removeView((View)map2);
        }
        zzchd2.destroy();
        windowManager = view.getViewTreeObserver();
        view = this.zzc;
        if (view != null && windowManager != null && (bl2 = windowManager.isAlive())) {
            view = this.zzc;
            windowManager.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)view);
        }
    }

    public final /* synthetic */ void zzd(Map object, boolean bl2, int n3, String string2, String string3) {
        HashMap hashMap = p3.a("messageType", "validatorHtmlLoaded");
        String string4 = "id";
        object = (String)object.get(string4);
        hashMap.put(string4, object);
        this.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zze(View object, WindowManager windowManager, zzchd zzchd2, Map map2) {
        boolean bl2;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        void var4_7;
        void var3_6;
        Object object2 = var3_6.zzN();
        Object object3 = new zzdnm(this, (Map)var4_7);
        object2.zzB((zzcit)object3);
        if (var4_7 == null) {
            return;
        }
        object2 = object.getContext();
        object3 = (String)var4_7.get("validator_width");
        Object object4 = zzbep.zzig;
        int n3 = (Integer)zzba.zzc().zza((zzbeg)object4);
        int n4 = zzdnn.zzf((Context)object2, (String)object3, n3);
        object4 = (String)var4_7.get("validator_height");
        Object object5 = zzbep.zzih;
        int n7 = (Integer)zzba.zzc().zza((zzbeg)object5);
        int n8 = zzdnn.zzf((Context)object2, (String)object4, n7);
        object5 = (String)var4_7.get("validator_x");
        Object object6 = null;
        n7 = zzdnn.zzf((Context)object2, (String)object5, 0);
        String string2 = (String)var4_7.get("validator_y");
        int n10 = zzdnn.zzf((Context)object2, string2, 0);
        object3 = zzcix.zzb(n4, n8);
        var3_6.zzaj((zzcix)object3);
        try {
            object3 = var3_6.zzG();
            object3 = object3.getSettings();
            object4 = zzbep.zzii;
            object6 = zzba.zzc();
            object4 = ((zzben)object6).zza((zzbeg)object4);
            object4 = (Boolean)object4;
            boolean bl3 = (Boolean)object4;
            object3.setUseWideViewPort(bl3);
            object3 = var3_6.zzG();
            object3 = object3.getSettings();
            object4 = zzbep.zzij;
            object6 = zzba.zzc();
            object4 = ((zzben)object6).zza((zzbeg)object4);
            object4 = (Boolean)object4;
            boolean bl4 = (Boolean)object4;
            object3.setLoadWithOverviewMode(bl4);
        }
        catch (NullPointerException nullPointerException) {}
        WindowManager.LayoutParams layoutParams = zzbz.zzb();
        layoutParams.x = n7;
        layoutParams.y = n10;
        object3 = var3_6.zzF();
        onScrollChangedListener.updateViewLayout((View)object3, (ViewGroup.LayoutParams)layoutParams);
        Object object7 = object3 = var4_7.get("orientation");
        object7 = (String)object3;
        object3 = new Rect();
        boolean bl5 = object.getGlobalVisibleRect((Rect)object3);
        if (bl5) {
            boolean bl6;
            object4 = "1";
            boolean bl7 = ((String)object4).equals(object7);
            n4 = !bl7 && !(bl6 = ((String)(object4 = "2")).equals(object7)) ? ((Rect)object3).top : ((Rect)object3).bottom;
            object6 = object2;
            string2 = object;
            object2 = new zzdnl((View)object, (zzchd)var3_6, (String)object7, layoutParams, n4 -= n10, (WindowManager)onScrollChangedListener);
            this.zzc = object2;
            ViewTreeObserver viewTreeObserver = object.getViewTreeObserver();
            if (viewTreeObserver != null && (bl2 = viewTreeObserver.isAlive())) {
                onScrollChangedListener = this.zzc;
                viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            }
        }
        String string3 = (String)var4_7.get("overlay_url");
        bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (bl2) return;
        var3_6.loadUrl(string3);
    }
}

