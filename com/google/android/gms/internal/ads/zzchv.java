/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcdt;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzcic;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzchv
extends FrameLayout
implements zzchd {
    private final zzchd zza;
    private final zzcdt zzb;
    private final AtomicBoolean zzc;

    public zzchv(zzchd zzchd2) {
        Object object = zzchd2.getContext();
        super(object);
        super();
        this.zzc = object;
        this.zza = zzchd2;
        Context context = zzchd2.zzE();
        super(context, (ViewGroup)this, this);
        this.zzb = object;
        zzchd2 = (View)zzchd2;
        this.addView((View)zzchd2);
    }

    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    public final void destroy() {
        Object object = this.zzQ();
        if (object != null) {
            zzfuv zzfuv2 = zzt.zza;
            Runnable runnable2 = new zzcht((zzehg)object);
            zzfuv2.post(runnable2);
            object = this.zza;
            Objects.requireNonNull(object);
            runnable2 = new zzchr((zzchd)object);
            object = zzbep.zzfa;
            long l2 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
            zzfuv2.postDelayed(runnable2, l2);
            return;
        }
        object = zzbep.zzfc;
        Object object2 = zzba.zzc();
        object = (Boolean)object2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zzP()) != null) {
            object2 = zzt.zza;
            zzchu zzchu2 = new zzchu(this, (zzehe)object);
            object2.post(zzchu2);
            return;
        }
        this.zza.destroy();
    }

    public final void goBack() {
        this.zza.goBack();
    }

    public final void loadData(String string2, String string3, String string4) {
        this.zza.loadData(string2, "text/html", string4);
    }

    public final void loadDataWithBaseURL(String string2, String string3, String string4, String string5, String string6) {
        this.zza.loadDataWithBaseURL(string2, string3, "text/html", "UTF-8", null);
    }

    public final void loadUrl(String string2) {
        this.zza.loadUrl(string2);
    }

    public final void onAdClicked() {
        zzchd zzchd2 = this.zza;
        if (zzchd2 != null) {
            zzchd2.onAdClicked();
        }
    }

    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    public final void onResume() {
        this.zza.onResume();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    public final void zzA(int n3) {
        this.zza.zzA(n3);
    }

    public final void zzB(int n3) {
        this.zzb.zzg(n3);
    }

    public final void zzC(zzcif zzcif2) {
        this.zza.zzC(zzcif2);
    }

    public final zzfgt zzD() {
        return this.zza.zzD();
    }

    public final Context zzE() {
        return this.zza.zzE();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return (WebView)this.zza;
    }

    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    public final zzaxd zzI() {
        return this.zza.zzI();
    }

    public final zzbca zzJ() {
        return this.zza.zzJ();
    }

    public final zzbhj zzK() {
        return this.zza.zzK();
    }

    public final zzm zzL() {
        return this.zza.zzL();
    }

    public final zzm zzM() {
        return this.zza.zzM();
    }

    public final zzciv zzN() {
        return ((zzcic)this.zza).zzaO();
    }

    public final zzcix zzO() {
        return this.zza.zzO();
    }

    public final zzehe zzP() {
        return this.zza.zzP();
    }

    public final zzehg zzQ() {
        return this.zza.zzQ();
    }

    public final zzfgw zzR() {
        return this.zza.zzR();
    }

    public final zzfhs zzS() {
        return this.zza.zzS();
    }

    public final ListenableFuture zzT() {
        return this.zza.zzT();
    }

    public final String zzU() {
        return this.zza.zzU();
    }

    public final List zzV() {
        int n3;
        ArrayList<View> arrayList = new ArrayList<View>();
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            zzchd zzchd2;
            View view = this.getChildAt(i3);
            if (view == (zzchd2 = this.zza)) continue;
            arrayList.add(view);
        }
        return arrayList;
    }

    public final void zzW(zzfgt zzfgt2, zzfgw zzfgw2) {
        this.zza.zzW(zzfgt2, zzfgw2);
    }

    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    public final void zzY() {
        this.zza.zzY();
    }

    public final void zzZ(int n3) {
        this.zza.zzZ(n3);
    }

    public final void zza(String string2) {
        ((zzcic)this.zza).zzaT(string2);
    }

    public final void zzaA(String string2, Predicate predicate) {
        this.zza.zzaA(string2, predicate);
    }

    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    public final boolean zzaD(boolean bl2, int n3) {
        Object object = this.zzc;
        View view = null;
        boolean bl3 = true;
        boolean bl4 = ((AtomicBoolean)object).compareAndSet(false, bl3);
        if (!bl4) {
            return bl3;
        }
        object = zzbep.zzaM;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl4 = (Boolean)object;
        if (bl4) {
            return false;
        }
        object = this.zza.getParent();
        bl4 = object instanceof ViewGroup;
        if (bl4) {
            object = (ViewGroup)this.zza.getParent();
            view = (View)this.zza;
            object.removeView(view);
        }
        this.zza.zzaD(bl2, n3);
        return bl3;
    }

    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    public final boolean zzaG() {
        return this.zzc.get();
    }

    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    public final /* synthetic */ void zzaI(boolean bl2) {
        zzchd zzchd2 = this.zza;
        zzfuv zzfuv2 = zzt.zza;
        Objects.requireNonNull(zzchd2);
        zzchr zzchr2 = new zzchr(zzchd2);
        zzfuv2.post(zzchr2);
    }

    public final void zzaJ(zzc zzc2, boolean bl2, boolean bl3) {
        this.zza.zzaJ(zzc2, bl2, bl3);
    }

    public final void zzaK(String string2, String string3, int n3) {
        this.zza.zzaK(string2, string3, 14);
    }

    public final void zzaL(boolean bl2, int n3, boolean bl3) {
        this.zza.zzaL(bl2, n3, bl3);
    }

    public final void zzaM(boolean bl2, int n3, String string2, String string3, boolean bl3) {
        this.zza.zzaM(bl2, n3, string2, string3, bl3);
    }

    public final void zzaN(boolean bl2, int n3, String string2, boolean bl3, boolean bl4) {
        this.zza.zzaN(bl2, n3, string2, bl3, bl4);
    }

    public final void zzaa() {
        this.zza.zzaa();
    }

    public final void zzab() {
        HashMap<String, String> hashMap = new HashMap<String, String>(3);
        Object object = String.valueOf(zzu.zzr().zze());
        hashMap.put("app_muted", (String)object);
        object = String.valueOf(zzu.zzr().zza());
        hashMap.put("app_volume", (String)object);
        object = (zzcic)this.zza;
        String string2 = String.valueOf(zzac.zzb(object.getContext()));
        hashMap.put("device_volume", string2);
        ((zzcic)object).zzd("volume", hashMap);
    }

    public final void zzac(boolean bl2) {
        this.zza.zzac(bl2);
    }

    public final void zzad() {
        this.zza.zzad();
    }

    public final void zzae(String string2, String string3, String string4) {
        this.zza.zzae(string2, string3, null);
    }

    public final void zzaf() {
        this.zza.zzaf();
    }

    public final void zzag(String string2, zzblp zzblp2) {
        this.zza.zzag(string2, zzblp2);
    }

    public final void zzah() {
        Object object = this.getContext();
        TextView textView = new TextView((Context)object);
        zzu.zzp();
        object = zzt.zzy();
        textView.setText((CharSequence)object);
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        int n3 = 5;
        textView.setPadding(n3, 0, n3, 0);
        object = new GradientDrawable();
        object.setShape(0);
        object.setColor(-12303292);
        object.setCornerRadius(8.0f);
        textView.setBackground((Drawable)object);
        int n4 = -2;
        int n7 = 49;
        object = new FrameLayout.LayoutParams(n4, n4, n7);
        this.addView((View)textView, (ViewGroup.LayoutParams)object);
        this.bringChildToFront((View)textView);
        object = zzbep.zzfc;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        if (n3 != 0 && (object = this.zzP()) != null) {
            ((zzehe)object).zza((View)textView);
            return;
        }
        object = zzbep.zzfb;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        if (n3 != 0 && (object = this.zzQ()) != null && (n4 = (int)(((zzehg)object).zzb() ? 1 : 0)) != 0) {
            object2 = zzu.zzA();
            object = ((zzehg)object).zza();
            object2.zzg((zzfoj)object, (View)textView);
        }
    }

    public final void zzai(zzm zzm2) {
        this.zza.zzai(zzm2);
    }

    public final void zzaj(zzcix zzcix2) {
        this.zza.zzaj(zzcix2);
    }

    public final void zzak(zzbca zzbca2) {
        this.zza.zzak(zzbca2);
    }

    public final void zzal(boolean bl2) {
        this.zza.zzal(bl2);
    }

    public final void zzam() {
        this.setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    public final void zzao(boolean bl2) {
        this.zza.zzao(bl2);
    }

    public final void zzap(zzbhh zzbhh2) {
        this.zza.zzap(zzbhh2);
    }

    public final void zzaq(boolean bl2) {
        this.zza.zzaq(bl2);
    }

    public final void zzar(zzbhj zzbhj2) {
        this.zza.zzar(zzbhj2);
    }

    public final void zzas(zzehe zzehe2) {
        this.zza.zzas(zzehe2);
    }

    public final void zzat(zzehg zzehg2) {
        this.zza.zzat(zzehg2);
    }

    public final void zzau(int n3) {
        this.zza.zzau(n3);
    }

    public final void zzav(boolean bl2) {
        this.zza.zzav(true);
    }

    public final void zzaw(zzm zzm2) {
        this.zza.zzaw(zzm2);
    }

    public final void zzax(boolean bl2) {
        this.zza.zzax(bl2);
    }

    public final void zzay(boolean bl2) {
        this.zza.zzay(bl2);
    }

    public final void zzaz(String string2, zzblp zzblp2) {
        this.zza.zzaz(string2, zzblp2);
    }

    public final void zzb(String string2, String string3) {
        this.zza.zzb("window.inspectorInfo", string3);
    }

    public final void zzd(String string2, Map map2) {
        this.zza.zzd(string2, map2);
    }

    public final void zzdG() {
        zzchd zzchd2 = this.zza;
        if (zzchd2 != null) {
            zzchd2.zzdG();
        }
    }

    public final void zzdf() {
        zzchd zzchd2 = this.zza;
        if (zzchd2 != null) {
            zzchd2.zzdf();
        }
    }

    public final void zzdg() {
        this.zza.zzdg();
    }

    public final void zzdh() {
        this.zza.zzdh();
    }

    public final String zzdi() {
        return this.zza.zzdi();
    }

    public final void zzdp(zzbam zzbam2) {
        this.zza.zzdp(zzbam2);
    }

    public final void zze(String string2, JSONObject jSONObject) {
        this.zza.zze(string2, jSONObject);
    }

    public final int zzf() {
        return this.zza.zzf();
    }

    public final int zzg() {
        Object object = zzbep.zzdR;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            return this.zza.getMeasuredHeight();
        }
        return this.getMeasuredHeight();
    }

    public final int zzh() {
        Object object = zzbep.zzdR;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            return this.zza.getMeasuredWidth();
        }
        return this.getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zza.zzi();
    }

    public final zza zzj() {
        return this.zza.zzj();
    }

    public final zzbfb zzk() {
        return this.zza.zzk();
    }

    public final void zzl(String string2, JSONObject object) {
        object = object.toString();
        ((zzcic)this.zza).zzb(string2, (String)object);
    }

    public final zzbfc zzm() {
        return this.zza.zzm();
    }

    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    public final zzcdt zzo() {
        return this.zzb;
    }

    public final zzcfp zzp(String string2) {
        return this.zza.zzp(string2);
    }

    public final zzcif zzq() {
        return this.zza.zzq();
    }

    public final String zzr() {
        return this.zza.zzr();
    }

    public final void zzt(String string2, zzcfp zzcfp2) {
        this.zza.zzt(string2, zzcfp2);
    }

    public final void zzu() {
        this.zza.zzu();
    }

    public final void zzv(boolean bl2, long l2) {
        this.zza.zzv(bl2, l2);
    }

    public final void zzw() {
        this.zza.zzw();
    }

    public final void zzx(int n3) {
    }

    public final void zzy(int n3) {
    }

    public final void zzz(boolean bl2) {
        this.zza.zzz(false);
    }
}

