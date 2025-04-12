/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.TrafficStats
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.webkit.RenderProcessGoneDetail
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzchi;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzchk;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzciu;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfhw;
import com.google.android.gms.internal.ads.zzfhx;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class zzchl
extends WebViewClient
implements zzciv {
    public static final /* synthetic */ int zzb;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final HashSet zzD;
    private final zzegk zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzcaf zza;
    private final zzchd zzc;
    private final zzbdm zzd;
    private final HashMap zze;
    private final Object zzf;
    private zza zzg;
    private zzp zzh;
    private zzcit zzi;
    private zzciu zzj;
    private zzbkf zzk;
    private zzbkh zzl;
    private zzdhi zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private String zzq;
    private String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private zzaa zzv;
    private zzbui zzw;
    private zzb zzx;
    private zzbud zzy;
    private boolean zzz;

    public zzchl(zzchd hashSet, zzbdm list, boolean bl2, zzbui zzbui2, zzbud object, zzegk zzegk2) {
        object = new HashMap();
        this.zze = object;
        this.zzf = object = new Object();
        this.zzp = 0;
        this.zzq = object = "";
        this.zzr = object;
        this.zzd = list;
        this.zzc = hashSet;
        this.zzs = bl2;
        this.zzw = zzbui2;
        this.zzy = null;
        list = zzbep.zzfM;
        list = Arrays.asList(((String)zzba.zzc().zza((zzbeg)((Object)list))).split(","));
        this.zzD = hashSet = new HashSet<String>(list);
        this.zzE = zzegk2;
    }

    private static WebResourceResponse zzS() {
        Object object = zzbep.zzaK;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            Object object3 = new byte[]{};
            object2 = new ByteArrayInputStream((byte[])object3);
            object3 = "";
            object = new WebResourceResponse((String)object3, (String)object3, (InputStream)object2);
            return object;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final WebResourceResponse zzT(String var1_1, Map var2_3) {
        block17: {
            var3_4 = new URL((String)var1_1);
            var4_5 = 264;
            try {
                TrafficStats.setThreadStatsTag((int)var4_5);
                var4_5 = 0;
                var1_1 = null;
                var5_6 = 0;
                var6_7 /* !! */  = null;
lbl9:
                // 2 sources

                while (true) {
                    var7_8 = 1;
                    var8_9 = 20;
                    if ((var5_6 += var7_8) > var8_9) ** break block16
                    var9_10 = var3_4.openConnection();
                    var10_11 = 10000;
                    var9_10.setConnectTimeout(var10_11);
                    var9_10.setReadTimeout(var10_11);
                    var11_12 = var2_3.entrySet();
                    var11_12 = var11_12.iterator();
                    while ((var12_13 = var11_12.hasNext()) != 0) {
                        var13_14 = var11_12.next();
                        var13_14 = (Map.Entry)var13_14;
                        var14_15 /* !! */  = var13_14.getKey();
                        var14_15 /* !! */  = (String)var14_15 /* !! */ ;
                        var13_14 = var13_14.getValue();
                        var13_14 = (String)var13_14;
                        var9_10.addRequestProperty((String)var14_15 /* !! */ , (String)var13_14);
                    }
                    break;
                }
            }
            catch (Throwable var1_2) {
                ** GOTO lbl132
            }
            {
                TrafficStats.clearThreadStatsTag();
                var1_1 = new IOException("Too many redirects (20)");
                throw var1_1;
            }
            var10_11 = var9_10 instanceof HttpURLConnection;
            if (var10_11 == 0) ** GOTO lbl-1000
            {
                block18: {
                    var9_10 = (HttpURLConnection)var9_10;
                    var13_14 = com.google.android.gms.ads.internal.zzu.zzp();
                    var11_12 = this.zzc;
                    var14_15 /* !! */  = var11_12.getContext();
                    var11_12 = this.zzc;
                    var11_12 = var11_12.zzn();
                    var15_16 = var11_12.afmaVersion;
                    var16_17 = null;
                    var17_18 = 60000;
                    var18_19 = 0;
                    var19_20 = var9_10;
                    var13_14.zzf((Context)var14_15 /* !! */ , (String)var15_16, false, (HttpURLConnection)var9_10, false, var17_18);
                    var12_13 = 0;
                    var13_14 = null;
                    var11_12 = new zzl(null);
                    var11_12.zzc((HttpURLConnection)var9_10, null);
                    var20_21 = var9_10.getResponseCode();
                    var11_12.zze((HttpURLConnection)var9_10, var20_21);
                    var10_11 = 300;
                    if (var20_21 >= var10_11 && var20_21 < (var10_11 = 400)) {
                        var21_22 = "Location";
                        if ((var21_22 = var9_10.getHeaderField(var21_22)) == null) {
                            var2_3 = "Missing Location header in redirect";
                            var1_1 = new IOException((String)var2_3);
                            throw var1_1;
                        }
                        var11_12 = "tel:";
                        var10_11 = (int)var21_22.startsWith((String)var11_12);
                        if (var10_11 != 0) break block17;
                        var11_12 = new URL((URL)var3_4, var21_22);
                        if ((var3_4 = var11_12.getProtocol()) == null) {
                            var1_1 = "Protocol is null";
                            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)var1_1);
                            var13_14 = zzchl.zzS();
                            break block17;
                        }
                        var13_14 = "http";
                        var12_13 = var3_4.equals(var13_14);
                        if (var12_13 == 0 && (var12_13 = var3_4.equals(var13_14 = "https")) == 0) {
                            var1_1 = new StringBuilder();
                            var2_3 = "Unsupported scheme: ";
                            var1_1.append((String)var2_3);
                            var1_1.append((String)var3_4);
                            var1_1 = var1_1.toString();
                            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)var1_1);
                            var13_14 = zzchl.zzS();
                            break block17;
                        } else {
                            var3_4 = new StringBuilder();
                            var13_14 = "Redirecting to ";
                            var3_4.append((String)var13_14);
                            var3_4.append(var21_22);
                            var3_4 = var3_4.toString();
                            com.google.android.gms.ads.internal.util.client.zzm.zze((String)var3_4);
                            var9_10.disconnect();
                            var3_4 = var11_12;
                            ** continue;
                        }
                    }
                    com.google.android.gms.ads.internal.zzu.zzp();
                    com.google.android.gms.ads.internal.zzu.zzp();
                    var2_3 = var9_10.getContentType();
                    var22_23 = TextUtils.isEmpty((CharSequence)var2_3);
                    var6_7 /* !! */  = ";";
                    var11_12 = "";
                    if (var22_23 != 0) {
                        var14_15 /* !! */  = var11_12;
                    } else {
                        var2_3 = var2_3.split((String)var6_7 /* !! */ );
                        var2_3 = var2_3[0];
                        var2_3 = var2_3.trim();
                        var14_15 /* !! */  = var2_3;
                    }
                    com.google.android.gms.ads.internal.zzu.zzp();
                    var2_3 = var9_10.getContentType();
                    var22_23 = TextUtils.isEmpty((CharSequence)var2_3);
                    if (var22_23 == 0 && (var22_23 = ((Object)(var2_3 = var2_3.split((String)var6_7 /* !! */ ))).length) != var7_8) {
                        for (var22_23 = 1; var22_23 < (var5_6 = ((Object)var2_3).length); ++var22_23) {
                            var6_7 /* !! */  = var2_3[var22_23];
                            var5_6 = (int)(var6_7 /* !! */  = var6_7 /* !! */ .trim()).startsWith((String)(var13_14 = "charset"));
                            if (var5_6 == 0) continue;
                            var6_7 /* !! */  = var2_3[var22_23];
                            var6_7 /* !! */  = var6_7 /* !! */ .trim();
                            var13_14 = "=";
                            var12_13 = (var6_7 /* !! */  = var6_7 /* !! */ .split((String)var13_14)).length;
                            if (var12_13 <= var7_8) continue;
                            var2_3 = var6_7 /* !! */ [var7_8];
                            var11_12 = var2_3.trim();
                            break block18;
                        }
                        {
                            break block18;
                        }
                    }
                    break block18;
lbl-1000:
                    // 1 sources

                    {
                        var2_3 = "Invalid protocol.";
                        var1_1 = new IOException((String)var2_3);
                        throw var1_1;
                    }
lbl132:
                    // 1 sources

                    TrafficStats.clearThreadStatsTag();
                    throw var1_2;
                }
                var15_16 = var11_12;
                var2_3 = var9_10.getHeaderFields();
                var22_23 = var2_3.size();
                var16_17 = new HashMap<String[], Object>(var22_23);
                var2_3 = var2_3.entrySet();
                var2_3 = var2_3.iterator();
                while ((var22_23 = (int)var2_3.hasNext()) != 0) {
                    var3_4 = var2_3.next();
                    var6_7 /* !! */  = (var3_4 = (Map.Entry)var3_4).getKey();
                    if (var6_7 /* !! */  == null || (var6_7 /* !! */  = var3_4.getValue()) == null) continue;
                    var6_7 /* !! */  = var3_4.getValue();
                    var5_6 = (int)(var6_7 /* !! */  = (List)var6_7 /* !! */ ).isEmpty();
                    if (var5_6 != 0) continue;
                    var6_7 /* !! */  = var3_4.getKey();
                    var6_7 /* !! */  = (String)var6_7 /* !! */ ;
                    var3_4 = var3_4.getValue();
                    var3_4 = (List)var3_4;
                    var3_4 = var3_4.get(0);
                    var3_4 = (String)var3_4;
                    var16_17.put(var6_7 /* !! */ , var3_4);
                }
                var13_14 = com.google.android.gms.ads.internal.zzu.zzq();
                var18_19 = var9_10.getResponseCode();
                var19_20 = var9_10.getResponseMessage();
                var23_24 = var9_10.getInputStream();
                var13_14 = var13_14.zzb((String)var14_15 /* !! */ , (String)var15_16, var18_19, (String)var19_20, var16_17, var23_24);
            }
        }
        TrafficStats.clearThreadStatsTag();
        return var13_14;
    }

    private final void zzU(Map map2, List object, String object2) {
        boolean bl2;
        Object object3;
        boolean bl3 = com.google.android.gms.ads.internal.util.zze.zzc();
        if (bl3) {
            object3 = "Received GMSG: ";
            com.google.android.gms.ads.internal.util.zze.zza(((String)object3).concat((String)object2));
            object2 = map2.keySet().iterator();
            while (bl3 = object2.hasNext()) {
                object3 = (String)object2.next();
                String string2 = (String)map2.get(object3);
                String string3 = "  ";
                StringBuilder stringBuilder = new StringBuilder(string3);
                stringBuilder.append((String)object3);
                stringBuilder.append(": ");
                stringBuilder.append(string2);
                object3 = stringBuilder.toString();
                com.google.android.gms.ads.internal.util.zze.zza((String)object3);
            }
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzblp)object.next();
            object3 = this.zzc;
            object2.zza(object3, map2);
        }
    }

    private final void zzV() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View)this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private final void zzW(View view, zzcaf zzcaf2, int n3) {
        boolean bl2 = zzcaf2.zzi();
        if (bl2 && n3 > 0) {
            zzcaf2.zzg(view);
            bl2 = zzcaf2.zzi();
            if (bl2) {
                zzfuv zzfuv2 = com.google.android.gms.ads.internal.util.zzt.zza;
                zzche zzche2 = new zzche(this, view, zzcaf2, n3);
                long l2 = 100;
                zzfuv2.postDelayed(zzche2, l2);
            }
        }
    }

    private static final boolean zzX(zzchd zzchd2) {
        zzfgt zzfgt2 = zzchd2.zzD();
        if (zzfgt2 != null) {
            return zzchd2.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzY(boolean bl2, zzchd object) {
        Object object2;
        return bl2 && !(bl2 = ((zzcix)(object2 = object.zzO())).zzi()) && !(bl2 = ((String)(object2 = object.zzU())).equals(object = "interstitial_mb"));
    }

    public static /* bridge */ /* synthetic */ void zze(zzchl zzchl2, Map map2, List list, String string2) {
        zzchl2.zzU(map2, list, string2);
    }

    public static /* bridge */ /* synthetic */ void zzf(zzchl zzchl2, View view, zzcaf zzcaf2, int n3) {
        zzchl2.zzW(view, zzcaf2, 10);
    }

    public final void onAdClicked() {
        zza zza2 = this.zzg;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final void onLoadResource(WebView object, String string2) {
        object = String.valueOf(string2);
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat((String)object));
        object = Uri.parse((String)string2);
        string2 = object.getScheme();
        String string3 = "gmsg";
        boolean bl2 = string3.equalsIgnoreCase(string2);
        if (bl2 && (bl2 = (string3 = "mobileads.google.com").equalsIgnoreCase(string2 = object.getHost()))) {
            this.zzj((Uri)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onPageFinished(WebView object, String object2) {
        boolean bl2;
        object = this.zzf;
        // MONITORENTER : object
        Object object3 = this.zzc;
        boolean bl3 = object3.zzaE();
        if (bl3) {
            object2 = "Blank page loaded, 1...";
            com.google.android.gms.ads.internal.util.zze.zza((String)object2);
            object2 = this.zzc;
            object2.zzX();
            // MONITOREXIT : object
            return;
        }
        this.zzz = bl2 = true;
        object = this.zzj;
        if (object != null) {
            object.zza();
            bl2 = false;
            object = null;
            this.zzj = null;
        }
        this.zzg();
        object = this.zzc.zzL();
        if (object == null) return;
        object = zzbep.zzlR;
        object3 = zzba.zzc();
        object = (Boolean)((zzben)object3).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (!bl2) return;
        object = this.zzc.zzL();
        ((zzm)object).zzG((String)object2);
    }

    public final void onReceivedError(WebView webView, int n3, String string2, String string3) {
        this.zzo = true;
        this.zzp = n3;
        this.zzq = string2;
        this.zzr = string3;
    }

    public final boolean onRenderProcessGone(WebView object, RenderProcessGoneDetail renderProcessGoneDetail) {
        object = this.zzc;
        boolean bl2 = fk3_1.a(renderProcessGoneDetail);
        int n3 = gk3_1.a(renderProcessGoneDetail);
        return object.zzaD(bl2, n3);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView object, String string2) {
        object = Collections.emptyMap();
        return this.zzc(string2, (Map)object);
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int n3;
        int n4 = keyEvent.getKeyCode();
        if (n4 != (n3 = 79) && n4 != (n3 = 222)) {
            switch (n4) {
                default: {
                    switch (n4) {
                        default: {
                            return false;
                        }
                        case 126: 
                        case 127: 
                        case 128: 
                        case 129: 
                        case 130: 
                    }
                }
                case 85: 
                case 86: 
                case 87: 
                case 88: 
                case 89: 
                case 90: 
                case 91: 
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView object, String string2) {
        boolean bl2;
        block33: {
            block34: {
                Object object2;
                boolean bl3;
                Object object3;
                Object object4;
                block31: {
                    boolean bl4;
                    Object object5;
                    block30: {
                        boolean bl5;
                        block32: {
                            object4 = String.valueOf(string2);
                            com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat((String)object4));
                            object4 = Uri.parse((String)string2);
                            object5 = object4.getScheme();
                            String string3 = "gmsg";
                            bl4 = string3.equalsIgnoreCase((String)object5);
                            bl2 = true;
                            if (!bl4 || !(bl4 = ((String)(object3 = "mobileads.google.com")).equalsIgnoreCase((String)(object5 = object4.getHost())))) break block32;
                            this.zzj((Uri)object4);
                            break block33;
                        }
                        bl4 = this.zzn;
                        if (bl4 && object == (object5 = this.zzc.zzG()) && ((bl5 = ((String)(object3 = "http")).equalsIgnoreCase((String)(object5 = object4.getScheme()))) || (bl4 = ((String)(object3 = "https")).equalsIgnoreCase((String)object5)))) {
                            object4 = this.zzg;
                            bl4 = false;
                            object5 = null;
                            if (object4 != null) {
                                object4.onAdClicked();
                                object4 = this.zza;
                                if (object4 != null) {
                                    object4.zzh(string2);
                                }
                                this.zzg = null;
                            }
                            if ((object4 = this.zzm) != null) {
                                object4.zzdG();
                                this.zzm = null;
                            }
                            return super.shouldOverrideUrlLoading((WebView)object, string2);
                        }
                        object = this.zzc.zzG();
                        bl3 = object.willNotDraw();
                        if (bl3) break block34;
                        object = this.zzc;
                        object = object.zzI();
                        object5 = this.zzc;
                        object5 = object5.zzS();
                        object3 = zzbep.zzlW;
                        object2 = zzba.zzc();
                        object3 = ((zzben)object2).zza((zzbeg)object3);
                        object3 = (Boolean)object3;
                        bl5 = (Boolean)object3;
                        if (!bl5 || object5 == null) break block30;
                        if (object == null) break block31;
                        bl3 = ((zzaxd)object).zzf((Uri)object4);
                        if (!bl3) break block31;
                        object = this.zzc;
                        object = object.getContext();
                        object3 = this.zzc;
                        object2 = object3.zzi();
                        object3 = (View)object3;
                        object4 = ((zzfhs)object5).zza((Uri)object4, (Context)object, (View)object3, (Activity)object2);
                    }
                    if (object == null) break block31;
                    bl4 = ((zzaxd)object).zzf((Uri)object4);
                    if (!bl4) break block31;
                    object5 = this.zzc;
                    object5 = object5.getContext();
                    object3 = this.zzc;
                    object2 = object3.zzi();
                    object3 = (View)object3;
                    try {
                        object4 = ((zzaxd)object).zza((Uri)object4, (Context)object5, (View)object3, (Activity)object2);
                    }
                    catch (zzaxe zzaxe2) {
                        object = String.valueOf(string2);
                        object5 = "Unable to append parameter to URL: ";
                        object = ((String)object5).concat((String)object);
                        com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
                    }
                }
                if ((object = this.zzx) != null && !(bl3 = ((zzb)object).zzc())) {
                    object = this.zzx;
                    ((zzb)object).zzb(string2);
                } else {
                    String string4 = object4.toString();
                    object2 = "android.intent.action.VIEW";
                    object3 = object;
                    object = new zzc((String)object2, string4, null, null, null, null, null, null);
                    string2 = null;
                    this.zzu((zzc)object, bl2, false);
                }
                break block33;
            }
            object = String.valueOf(string2);
            string2 = "AdWebView unable to handle URL: ";
            object = string2.concat((String)object);
            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzA(String string2, zzblp zzblp2) {
        Object object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                CopyOnWriteArrayList<zzblp> copyOnWriteArrayList;
                block3: {
                    try {
                        copyOnWriteArrayList = this.zze;
                        copyOnWriteArrayList = ((HashMap)((Object)copyOnWriteArrayList)).get(string2);
                        copyOnWriteArrayList = copyOnWriteArrayList;
                        if (copyOnWriteArrayList != null) break block3;
                        copyOnWriteArrayList = new CopyOnWriteArrayList<zzblp>();
                        HashMap hashMap = this.zze;
                        hashMap.put(string2, copyOnWriteArrayList);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                copyOnWriteArrayList.add(zzblp2);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzB(zzcit zzcit2) {
        this.zzi = zzcit2;
    }

    public final void zzC(int n3, int n4) {
        zzbud zzbud2 = this.zzy;
        if (zzbud2 != null) {
            zzbud2.zze(n3, n4);
        }
    }

    public final void zzD(boolean bl2) {
        this.zzn = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzE(boolean bl2) {
        Object object = this.zzf;
        synchronized (object) {
            this.zzu = bl2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzF() {
        Object object = this.zzf;
        synchronized (object) {
            boolean bl2 = false;
            zzgge zzgge2 = null;
            this.zzn = false;
            this.zzs = bl2 = true;
            zzgge2 = zzcci.zze;
            zzchf zzchf2 = new zzchf(this);
            zzgge2.execute(zzchf2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzG(boolean bl2) {
        Object object = this.zzf;
        synchronized (object) {
            boolean bl3;
            this.zzt = bl3 = true;
            return;
        }
    }

    public final void zzH(zzciu zzciu2) {
        this.zzj = zzciu2;
    }

    public final void zzI(zzcqd zzcqd2, zzefz object, zzfoe object2) {
        String string2 = "/click";
        this.zzL(string2);
        if (object != null && object2 != null) {
            zzdhi zzdhi2 = this.zzm;
            zzfhw zzfhw2 = new zzfhw(zzdhi2, zzcqd2, (zzfoe)object2, (zzefz)((Object)object));
            this.zzA(string2, zzfhw2);
            return;
        }
        object = this.zzm;
        object2 = new zzbkn((zzdhi)object, zzcqd2);
        this.zzA(string2, (zzblp)object2);
    }

    public final void zzJ(zzcqd zzcqd2) {
        String string2 = "/click";
        this.zzL(string2);
        zzdhi zzdhi2 = this.zzm;
        zzbkn zzbkn2 = new zzbkn(zzdhi2, zzcqd2);
        this.zzA(string2, zzbkn2);
    }

    public final void zzK(zzcqd zzcqd2, zzefz zzefz2, zzdvc zzdvc2) {
        String string2 = "/open";
        this.zzL(string2);
        zzb zzb2 = this.zzx;
        zzbud zzbud2 = this.zzy;
        zzbmb zzbmb2 = new zzbmb(zzb2, zzbud2, zzefz2, zzdvc2, zzcqd2);
        this.zzA(string2, zzbmb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzL(String object) {
        Object object2 = this.zzf;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    HashMap hashMap = this.zze;
                    object = hashMap.get(object);
                    object = (List)object;
                    if (object == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object.clear();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzM(String object, zzblp zzblp2) {
        Object object2 = this.zzf;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    HashMap hashMap = this.zze;
                    object = hashMap.get(object);
                    object = (List)object;
                    if (object == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object.remove(zzblp2);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzN(String object, Predicate predicate) {
        Object object2 = this.zzf;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                Cloneable cloneable;
                try {
                    cloneable = this.zze;
                    object = ((HashMap)cloneable).get(object);
                    object = (List)object;
                    if (object == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                cloneable = new ArrayList();
                Iterator iterator = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        object.removeAll((Collection<?>)((Object)cloneable));
                        return;
                    }
                    Object object3 = iterator.next();
                    boolean bl3 = predicate.apply(object3 = (zzblp)object3);
                    if (!bl3) continue;
                    ((ArrayList)cloneable).add(object3);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzO() {
        Object object = this.zzf;
        synchronized (object) {
            return this.zzu;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzP() {
        Object object = this.zzf;
        synchronized (object) {
            return this.zzs;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzQ() {
        Object object = this.zzf;
        synchronized (object) {
            return this.zzt;
        }
    }

    public final void zzR(zza zza2, zzbkf zzbkf2, zzp zzp2, zzbkh zzbkh2, zzaa zzaa2, boolean bl2, zzbls zzbls2, zzb zzb2, zzbuk zzbuk2, zzcaf zzcaf2, zzefz zzefz2, zzfoe zzfoe2, zzdvc zzdvc2, zzbmj zzbmj2, zzdhi zzdhi2, zzbmi zzbmi2, zzbmc zzbmc2, zzblq zzblq2, zzcqd zzcqd2) {
        Object object;
        Object object2;
        zzchl zzchl2 = this;
        Object object3 = zzbkf2;
        Object object4 = zzbkh2;
        zzbls zzbls3 = zzbls2;
        Object object5 = zzbuk2;
        Object object6 = zzcaf2;
        zzefz zzefz3 = zzefz2;
        zzfoe zzfoe3 = zzfoe2;
        zzbmj zzbmj3 = zzbmj2;
        zzdhi zzdhi3 = zzdhi2;
        zzbmi zzbmi3 = zzbmi2;
        zzbmc zzbmc3 = zzbmc2;
        Object object7 = zzcqd2;
        if (zzb2 == null) {
            object2 = this.zzc;
            object2 = object2.getContext();
            object7 = object = new zzb((Context)object2, zzcaf2, null);
        } else {
            object7 = zzb2;
        }
        object2 = zzchl2.zzc;
        zzchl2.zzy = object = new zzbud((zzchd)object2, (zzbuk)object5);
        zzchl2.zza = object6;
        object6 = zzbep.zzaS;
        object2 = zzba.zzc();
        object6 = (Boolean)((zzben)object2).zza((zzbeg)object6);
        boolean bl3 = (Boolean)object6;
        if (bl3) {
            object6 = new zzbke((zzbkf)object3);
            object2 = "/adMetadata";
            zzchl2.zzA((String)object2, (zzblp)object6);
        }
        if (object4 != null) {
            object6 = new zzbkg((zzbkh)object4);
            object2 = "/appEvent";
            zzchl2.zzA((String)object2, (zzblp)object6);
        }
        object2 = zzblo.zzj;
        zzchl2.zzA("/backButton", (zzblp)object2);
        object2 = zzblo.zzk;
        zzchl2.zzA("/refresh", (zzblp)object2);
        object2 = zzblo.zzb;
        zzchl2.zzA("/canOpenApp", (zzblp)object2);
        object2 = zzblo.zza;
        zzchl2.zzA("/canOpenURLs", (zzblp)object2);
        object2 = zzblo.zzc;
        zzchl2.zzA("/canOpenIntents", (zzblp)object2);
        object2 = zzblo.zzd;
        zzchl2.zzA("/close", (zzblp)object2);
        object2 = zzblo.zze;
        zzchl2.zzA("/customClose", (zzblp)object2);
        object2 = zzblo.zzn;
        zzchl2.zzA("/instrument", (zzblp)object2);
        object2 = zzblo.zzp;
        zzchl2.zzA("/delayPageLoaded", (zzblp)object2);
        object2 = zzblo.zzq;
        zzchl2.zzA("/delayPageClosed", (zzblp)object2);
        object2 = zzblo.zzr;
        zzchl2.zzA("/getLocationInfo", (zzblp)object2);
        object2 = zzblo.zzg;
        zzchl2.zzA("/log", (zzblp)object2);
        object2 = zzchl2.zzy;
        object6 = new zzblw((zzb)object7, (zzbud)object2, (zzbuk)object5);
        zzchl2.zzA("/mraid", (zzblp)object6);
        object5 = zzchl2.zzw;
        if (object5 != null) {
            object6 = "/mraidLoaded";
            zzchl2.zzA((String)object6, (zzblp)object5);
        }
        object2 = zzchl2.zzy;
        object5 = object;
        object6 = object7;
        object4 = object;
        object = zzefz2;
        object3 = zzcqd2;
        Object object8 = object7;
        object7 = zzdvc2;
        ((zzbmb)object5)((zzb)object6, (zzbud)object2, zzefz2, zzdvc2, zzcqd2);
        zzchl2.zzA("/open", (zzblp)object5);
        object4 = new zzcfq();
        zzchl2.zzA("/precache", (zzblp)object4);
        object5 = zzblo.zzi;
        zzchl2.zzA("/touch", (zzblp)object5);
        object5 = zzblo.zzl;
        zzchl2.zzA("/video", (zzblp)object5);
        object5 = zzblo.zzm;
        zzchl2.zzA("/videoMeta", (zzblp)object5);
        object4 = "/httpTrack";
        object5 = "/click";
        if (zzefz3 != null && zzfoe3 != null) {
            object6 = new zzfhw(zzdhi3, zzcqd2, zzfoe3, zzefz3);
            zzchl2.zzA((String)object5, (zzblp)object6);
            object3 = new zzfhx(zzfoe3, zzefz3);
            zzchl2.zzA((String)object4, (zzblp)object3);
        } else {
            object6 = new zzbkn(zzdhi3, (zzcqd)object3);
            zzchl2.zzA((String)object5, (zzblp)object6);
            object3 = zzblo.zzf;
            zzchl2.zzA((String)object4, (zzblp)object3);
        }
        object3 = zzchl2.zzc;
        object4 = com.google.android.gms.ads.internal.zzu.zzn();
        object3 = object3.getContext();
        boolean bl4 = ((zzcau)object4).zzp((Context)object3);
        if (bl4) {
            object3 = new HashMap();
            object4 = zzchl2.zzc.zzD();
            if (object4 != null) {
                object3 = zzchl2.zzc.zzD().zzax;
            }
            object4 = zzchl2.zzc;
            object4 = object4.getContext();
            object5 = new zzblv((Context)object4, (Map)object3);
            object3 = "/logScionEvent";
            zzchl2.zzA((String)object3, (zzblp)object5);
        }
        if (zzbls3 != null) {
            object3 = new zzblr(zzbls3);
            object4 = "/setInterstitialProperties";
            zzchl2.zzA((String)object4, (zzblp)object3);
        }
        if (zzbmj3 != null) {
            object3 = zzbep.zziU;
            object4 = zzba.zzc();
            object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
            bl4 = (Boolean)object3;
            if (bl4) {
                object3 = "/inspectorNetworkExtras";
                zzchl2.zzA((String)object3, zzbmj3);
            }
        }
        object3 = zzbep.zzjn;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        bl4 = (Boolean)object3;
        if (bl4 && zzbmi3 != null) {
            object3 = "/shareSheet";
            zzchl2.zzA((String)object3, zzbmi3);
        }
        object3 = zzbep.zzjs;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        bl4 = (Boolean)object3;
        if (bl4 && zzbmc3 != null) {
            object3 = "/inspectorOutOfContextTest";
            zzchl2.zzA((String)object3, zzbmc3);
        }
        object3 = zzbep.zzjw;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        bl4 = (Boolean)object3;
        if (bl4) {
            object3 = zzblq2;
            if (zzblq2 != null) {
                object4 = "/inspectorStorage";
                zzchl2.zzA((String)object4, zzblq2);
            }
        }
        object3 = zzbep.zzlz;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        bl4 = (Boolean)object3;
        if (bl4) {
            object4 = zzblo.zzu;
            zzchl2.zzA("/bindPlayStoreOverlay", (zzblp)object4);
            object4 = zzblo.zzv;
            zzchl2.zzA("/presentPlayStoreOverlay", (zzblp)object4);
            object4 = zzblo.zzw;
            zzchl2.zzA("/expandPlayStoreOverlay", (zzblp)object4);
            object4 = zzblo.zzx;
            zzchl2.zzA("/collapsePlayStoreOverlay", (zzblp)object4);
            object3 = "/closePlayStoreOverlay";
            object4 = zzblo.zzy;
            zzchl2.zzA((String)object3, (zzblp)object4);
        }
        object3 = zzbep.zzdi;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        bl4 = (Boolean)object3;
        if (bl4) {
            object4 = zzblo.zzA;
            zzchl2.zzA("/setPAIDPersonalizationEnabled", (zzblp)object4);
            object3 = "/resetPAID";
            object4 = zzblo.zzz;
            zzchl2.zzA((String)object3, (zzblp)object4);
        }
        object3 = zzbep.zzlQ;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        bl4 = (Boolean)object3;
        if (bl4 && (object4 = (object3 = zzchl2.zzc).zzD()) != null) {
            object3 = object3.zzD();
            bl4 = ((zzfgt)object3).zzas;
            if (bl4) {
                object4 = zzblo.zzB;
                zzchl2.zzA("/writeToLocalStorage", (zzblp)object4);
                object3 = "/clearLocalStorageKeys";
                object4 = zzblo.zzC;
                zzchl2.zzA((String)object3, (zzblp)object4);
            }
        }
        object3 = zza2;
        zzchl2.zzg = zza2;
        object3 = zzp2;
        zzchl2.zzh = zzp2;
        object3 = zzbkf2;
        zzchl2.zzk = zzbkf2;
        object3 = zzbkh2;
        zzchl2.zzl = zzbkh2;
        object3 = zzaa2;
        zzchl2.zzv = zzaa2;
        object = object8;
        zzchl2.zzx = object8;
        zzchl2.zzm = zzdhi3;
        bl4 = bl2;
        zzchl2.zzn = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        Object object = this.zzf;
        // MONITORENTER : object
        // MONITOREXIT : object
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        Object object = this.zzf;
        // MONITORENTER : object
        // MONITOREXIT : object
        return null;
    }

    /*
     * Exception decompiling
     */
    public final WebResourceResponse zzc(String var1_1, Map var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [15, 14 : 85->89)] java.lang.NoClassDefFoundError
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final zzb zzd() {
        return this.zzx;
    }

    public final void zzdG() {
        zzdhi zzdhi2 = this.zzm;
        if (zzdhi2 != null) {
            zzdhi2.zzdG();
        }
    }

    public final void zzdf() {
        zzdhi zzdhi2 = this.zzm;
        if (zzdhi2 != null) {
            zzdhi2.zzdf();
        }
    }

    public final void zzg() {
        int n3;
        Object object = this.zzi;
        if (object != null && ((n3 = this.zzz) != 0 && (n3 = this.zzB) <= 0 || (n3 = (int)(this.zzA ? 1 : 0)) != 0 || (n3 = (int)(this.zzo ? 1 : 0)) != 0)) {
            String[] stringArray;
            object = zzbep.zzbR;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
            if (n3 != 0 && (object = this.zzc.zzm()) != null) {
                object = this.zzc.zzm().zza();
                object2 = this.zzc.zzk();
                stringArray = new String[]{"awfllc"};
                zzbew.zza((zzbfe)object, (zzbfb)object2, stringArray);
            }
            object = this.zzi;
            int n4 = this.zzA;
            boolean bl2 = false;
            stringArray = null;
            if (n4 == 0 && (n4 = this.zzo) == 0) {
                bl2 = true;
            }
            n4 = this.zzp;
            String string2 = this.zzq;
            String string3 = this.zzr;
            object.zza(bl2, n4, string2, string3);
            n3 = 0;
            object = null;
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh() {
        Object object = this.zza;
        Object var2_2 = null;
        if (object != null) {
            object.zze();
            this.zza = null;
        }
        this.zzV();
        object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = this.zze;
                        ((HashMap)object2).clear();
                        this.zzg = null;
                        this.zzh = null;
                        this.zzi = null;
                        this.zzj = null;
                        this.zzk = null;
                        this.zzl = null;
                        object2 = null;
                        this.zzn = false;
                        this.zzs = false;
                        this.zzt = false;
                        this.zzv = null;
                        this.zzx = null;
                        this.zzw = null;
                        object2 = this.zzy;
                        if (object2 == null) break block4;
                        boolean bl2 = true;
                        ((zzbud)object2).zza(bl2);
                        this.zzy = null;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzi(boolean bl2) {
        this.zzC = bl2;
    }

    public final void zzj(Uri object) {
        Object object2 = String.valueOf(object);
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat((String)object2));
        object2 = this.zze;
        Object object3 = object.getPath();
        object2 = (List)((HashMap)object2).get(object3);
        if (object3 != null && object2 != null) {
            boolean bl2;
            Object object4 = object.getEncodedQuery();
            Object object5 = zzbep.zzfL;
            zzben zzben2 = zzba.zzc();
            object5 = (Boolean)zzben2.zza((zzbeg)object5);
            boolean n3 = (Boolean)object5;
            if (n3 && (bl2 = ((HashSet)(object5 = this.zzD)).contains(object3)) && object4 != null) {
                object5 = zzbep.zzfN;
                zzben2 = zzba.zzc();
                object5 = (Integer)zzben2.zza((zzbeg)object5);
                int n4 = (Integer)object5;
                int n7 = ((String)object4).length();
                if (n7 >= n4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat((String)object3));
                    object4 = com.google.android.gms.ads.internal.zzu.zzp().zzb((Uri)object);
                    object5 = new zzchj(this, (List)object2, (String)object3, (Uri)object);
                    object = zzcci.zze;
                    zzgft.zzr((ListenableFuture)object4, (zzgfp)object5, (Executor)object);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            object = com.google.android.gms.ads.internal.util.zzt.zzP((Uri)object);
            this.zzU((Map)object, (List)object2, (String)object3);
            return;
        }
        object = String.valueOf(object);
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat((String)object));
        object = zzbep.zzgV;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3 && (object = com.google.android.gms.ads.internal.zzu.zzo().zzg()) != null) {
            int n8;
            int n10;
            if (object3 != null && (n10 = ((String)object3).length()) >= (n8 = 2)) {
                int n14 = 1;
                object = ((String)object3).substring(n14);
            } else {
                object = "null";
            }
            object2 = zzcci.zza;
            object3 = new zzchg((String)object);
            object2.execute((Runnable)object3);
        }
    }

    public final void zzk() {
        int n3;
        zzbdm zzbdm2 = this.zzd;
        if (zzbdm2 != null) {
            zzbdo zzbdo2 = zzbdo.zzV;
            zzbdm2.zzb(zzbdo2);
        }
        this.zzA = true;
        this.zzp = n3 = zzbdo.zzV.zza();
        this.zzq = "Page loaded delay cancel.";
        this.zzg();
        this.zzc.destroy();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzl() {
        int n3;
        Object object = this.zzf;
        // MONITORENTER : object
        // MONITOREXIT : object
        this.zzB = n3 = this.zzB + 1;
        this.zzg();
    }

    public final void zzm() {
        int n3;
        this.zzB = n3 = this.zzB + -1;
        this.zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.zzad();
        zzm zzm2 = this.zzc.zzL();
        if (zzm2 != null) {
            zzm2.zzz();
        }
    }

    public final /* synthetic */ void zzo(boolean bl2, long l2) {
        this.zzc.zzv(bl2, l2);
    }

    public final /* synthetic */ void zzp(View view, zzcaf zzcaf2, int n3) {
        this.zzW(view, zzcaf2, n3 += -1);
    }

    public final void zzq(int n3, int n4, boolean bl2) {
        zzbuj zzbuj2 = this.zzw;
        if (zzbuj2 != null) {
            ((zzbui)zzbuj2).zzb(n3, n4);
        }
        if ((zzbuj2 = this.zzy) != null) {
            ((zzbud)zzbuj2).zzd(n3, n4, false);
        }
    }

    public final void zzr() {
        zzcaf zzcaf2 = this.zza;
        if (zzcaf2 != null) {
            Object object = this.zzc.zzG();
            boolean bl2 = object.isAttachedToWindow();
            if (bl2) {
                this.zzW((View)object, zzcaf2, 10);
                return;
            }
            this.zzV();
            object = new zzchi(this, zzcaf2);
            this.zzF = object;
            zzcaf2 = (View)this.zzc;
            zzcaf2.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        }
    }

    public final void zzu(zzc zzc2, boolean bl2, boolean bl3) {
        zza zza2;
        Object object;
        zzchd zzchd2 = this.zzc;
        boolean bl4 = zzchd2.zzaF();
        boolean bl5 = zzchl.zzY(bl4, zzchd2);
        boolean bl6 = false;
        if (bl5 || bl3) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        if (bl3 || !bl2) {
            bl6 = true;
        }
        bl5 = false;
        zzchd2 = null;
        if (bl3) {
            zza2 = null;
        } else {
            object = this.zzg;
            zza2 = object;
        }
        Object object2 = bl4 ? null : (object = this.zzh);
        zzaa zzaa2 = this.zzv;
        zzchd zzchd3 = this.zzc;
        VersionInfoParcel versionInfoParcel = zzchd3.zzn();
        Object object3 = bl6 ? null : (object = this.zzm);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc2, zza2, (zzp)object2, zzaa2, versionInfoParcel, zzchd3, (zzdhi)object3);
        this.zzx(adOverlayInfoParcel);
    }

    public final void zzv(String string2, String string3, int n3) {
        zzegk zzegk2 = this.zzE;
        zzchd zzchd2 = this.zzc;
        VersionInfoParcel versionInfoParcel = zzchd2.zzn();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzchd2, versionInfoParcel, string2, string3, 14, zzegk2);
        this.zzx(adOverlayInfoParcel);
    }

    public final void zzw(boolean bl2, int n3, boolean bl3) {
        zza zza2;
        Object object = this.zzc;
        boolean bl4 = zzchl.zzY(object.zzaF(), (zzchd)object);
        boolean bl5 = true;
        if (!bl4 && bl3) {
            bl5 = false;
        }
        if (bl4) {
            zza2 = null;
        } else {
            object = this.zzg;
            zza2 = object;
        }
        zzp zzp2 = this.zzh;
        zzaa zzaa2 = this.zzv;
        zzchd zzchd2 = this.zzc;
        VersionInfoParcel versionInfoParcel = zzchd2.zzn();
        Object object2 = bl5 ? null : (object = this.zzm);
        object = this.zzc;
        bl4 = zzchl.zzX((zzchd)object);
        Object object3 = bl4 ? (object = this.zzE) : null;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zza2, zzp2, zzaa2, zzchd2, bl2, n3, versionInfoParcel, (zzdhi)object2, (zzbuz)object3);
        this.zzx(adOverlayInfoParcel);
    }

    public final void zzx(AdOverlayInfoParcel abstractSafeParcelable) {
        boolean bl2;
        Object object = this.zzy;
        if (object != null) {
            bl2 = ((zzbud)object).zzf();
        } else {
            bl2 = false;
            object = null;
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        Object object2 = this.zzc.getContext();
        com.google.android.gms.ads.internal.overlay.zzn.zza(object2, abstractSafeParcelable, bl2 ^= true);
        object = this.zza;
        if (object != null) {
            object2 = abstractSafeParcelable.zzl;
            if (object2 == null && (abstractSafeParcelable = abstractSafeParcelable.zza) != null) {
                object2 = ((zzc)abstractSafeParcelable).zzb;
            }
            object.zzh((String)object2);
        }
    }

    public final void zzy(boolean bl2, int n3, String string2, String string3, boolean bl3) {
        Object object;
        Object object2;
        zzp zzp2;
        zza zza2;
        zzchl zzchl2 = this;
        Object object3 = this.zzc;
        boolean bl4 = object3.zzaF();
        boolean bl5 = zzchl.zzY(bl4, (zzchd)object3);
        boolean bl6 = true;
        if (!bl5 && bl3) {
            bl6 = false;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = null;
        if (bl5) {
            zza2 = null;
        } else {
            object3 = zzchl2.zzg;
            zza2 = object3;
        }
        if (bl4) {
            zzp2 = null;
        } else {
            object3 = zzchl2.zzc;
            zzp2 = zzchl2.zzh;
            object2 = new zzchk((zzchd)object3, zzp2);
            zzp2 = object2;
        }
        zzbkf zzbkf2 = zzchl2.zzk;
        zzbkh zzbkh2 = zzchl2.zzl;
        zzaa zzaa2 = zzchl2.zzv;
        zzchd zzchd2 = zzchl2.zzc;
        object3 = zzchd2.zzn();
        Object object4 = bl6 ? null : (object2 = zzchl2.zzm);
        object2 = zzchl2.zzc;
        bl4 = zzchl.zzX((zzchd)object2);
        Object object5 = bl4 ? (object2 = zzchl2.zzE) : null;
        adOverlayInfoParcel = object;
        object2 = object;
        object = object3;
        adOverlayInfoParcel(zza2, zzp2, zzbkf2, zzbkh2, zzaa2, zzchd2, bl2, n3, string2, string3, (VersionInfoParcel)object3, (zzdhi)object4, (zzbuz)object5);
        zzchl2.zzx(adOverlayInfoParcel);
    }

    public final void zzz(boolean bl2, int n3, String string2, boolean bl3, boolean bl4) {
        Object object;
        Object object2;
        zzp zzp2;
        zza zza2;
        zzchl zzchl2 = this;
        Object object3 = this.zzc;
        boolean bl5 = object3.zzaF();
        boolean bl6 = zzchl.zzY(bl5, (zzchd)object3);
        boolean bl7 = true;
        if (!bl6 && bl3) {
            bl7 = false;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = null;
        if (bl6) {
            zza2 = null;
        } else {
            object3 = zzchl2.zzg;
            zza2 = object3;
        }
        if (bl5) {
            zzp2 = null;
        } else {
            object3 = zzchl2.zzc;
            zzp2 = zzchl2.zzh;
            object2 = new zzchk((zzchd)object3, zzp2);
            zzp2 = object2;
        }
        zzbkf zzbkf2 = zzchl2.zzk;
        zzbkh zzbkh2 = zzchl2.zzl;
        zzaa zzaa2 = zzchl2.zzv;
        zzchd zzchd2 = zzchl2.zzc;
        VersionInfoParcel versionInfoParcel = zzchd2.zzn();
        if (bl7) {
            bl6 = false;
            object3 = null;
        } else {
            object3 = zzchl2.zzm;
        }
        object2 = zzchl2.zzc;
        bl5 = zzchl.zzX((zzchd)object2);
        Object object4 = bl5 ? (object2 = zzchl2.zzE) : null;
        adOverlayInfoParcel = object;
        object2 = object;
        object = object3;
        adOverlayInfoParcel(zza2, zzp2, zzbkf2, zzbkh2, zzaa2, zzchd2, bl2, n3, string2, versionInfoParcel, (zzdhi)object3, (zzbuz)object4, bl4);
        zzchl2.zzx(adOverlayInfoParcel);
    }
}

