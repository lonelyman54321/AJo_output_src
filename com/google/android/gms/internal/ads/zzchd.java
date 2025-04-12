/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcig;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzcin;
import com.google.android.gms.internal.ads.zzciq;
import com.google.android.gms.internal.ads.zzcir;
import com.google.android.gms.internal.ads.zzcis;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

public interface zzchd
extends com.google.android.gms.ads.internal.client.zza,
zzdhi,
zzcgu,
zzbok,
zzcig,
zzcik,
zzbox,
zzban,
zzcin,
com.google.android.gms.ads.internal.zzm,
zzciq,
zzcir,
zzcee,
zzcis {
    public boolean canGoBack();

    public void destroy();

    public Context getContext();

    public int getHeight();

    public ViewGroup.LayoutParams getLayoutParams();

    public void getLocationOnScreen(int[] var1);

    public int getMeasuredHeight();

    public int getMeasuredWidth();

    public ViewParent getParent();

    public int getWidth();

    public void goBack();

    public boolean isAttachedToWindow();

    public void loadData(String var1, String var2, String var3);

    public void loadDataWithBaseURL(String var1, String var2, String var3, String var4, String var5);

    public void loadUrl(String var1);

    public void measure(int var1, int var2);

    public void onPause();

    public void onResume();

    public void setBackgroundColor(int var1);

    public void setOnClickListener(View.OnClickListener var1);

    public void setOnTouchListener(View.OnTouchListener var1);

    public void setWebChromeClient(WebChromeClient var1);

    public void setWebViewClient(WebViewClient var1);

    public void zzC(zzcif var1);

    public zzfgt zzD();

    public Context zzE();

    public View zzF();

    public WebView zzG();

    public WebViewClient zzH();

    public zzaxd zzI();

    public zzbca zzJ();

    public zzbhj zzK();

    public zzm zzL();

    public zzm zzM();

    public zzciv zzN();

    public zzcix zzO();

    public zzehe zzP();

    public zzehg zzQ();

    public zzfgw zzR();

    public zzfhs zzS();

    public ListenableFuture zzT();

    public String zzU();

    public List zzV();

    public void zzW(zzfgt var1, zzfgw var2);

    public void zzX();

    public void zzY();

    public void zzZ(int var1);

    public void zzaA(String var1, Predicate var2);

    public boolean zzaB();

    public boolean zzaC();

    public boolean zzaD(boolean var1, int var2);

    public boolean zzaE();

    public boolean zzaF();

    public boolean zzaG();

    public boolean zzaH();

    public void zzaa();

    public void zzab();

    public void zzac(boolean var1);

    public void zzad();

    public void zzae(String var1, String var2, String var3);

    public void zzaf();

    public void zzag(String var1, zzblp var2);

    public void zzah();

    public void zzai(zzm var1);

    public void zzaj(zzcix var1);

    public void zzak(zzbca var1);

    public void zzal(boolean var1);

    public void zzam();

    public void zzan(Context var1);

    public void zzao(boolean var1);

    public void zzap(zzbhh var1);

    public void zzaq(boolean var1);

    public void zzar(zzbhj var1);

    public void zzas(zzehe var1);

    public void zzat(zzehg var1);

    public void zzau(int var1);

    public void zzav(boolean var1);

    public void zzaw(zzm var1);

    public void zzax(boolean var1);

    public void zzay(boolean var1);

    public void zzaz(String var1, zzblp var2);

    public Activity zzi();

    public zza zzj();

    public zzbfc zzm();

    public VersionInfoParcel zzn();

    public zzcif zzq();

    public void zzt(String var1, zzcfp var2);
}

