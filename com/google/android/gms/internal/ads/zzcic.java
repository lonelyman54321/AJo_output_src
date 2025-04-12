/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Canvas
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.WindowManager
 *  android.webkit.DownloadListener
 *  android.webkit.ValueCallback
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zzco;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcdt;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzchw;
import com.google.android.gms.internal.ads.zzchx;
import com.google.android.gms.internal.ads.zzchy;
import com.google.android.gms.internal.ads.zzchz;
import com.google.android.gms.internal.ads.zzcia;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcii;
import com.google.android.gms.internal.ads.zzcij;
import com.google.android.gms.internal.ads.zzcio;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzciw;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdpr;
import com.google.android.gms.internal.ads.zzdpt;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

final class zzcic
extends WebView
implements DownloadListener,
ViewTreeObserver.OnGlobalLayoutListener,
zzchd {
    public static final /* synthetic */ int zza;
    private final String zzA;
    private zzcif zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbhj zzE;
    private zzbhh zzF;
    private zzbca zzG;
    private int zzH;
    private int zzI;
    private zzbfb zzJ;
    private final zzbfb zzK;
    private zzbfb zzL;
    private final zzbfc zzM;
    private int zzN;
    private zzm zzO;
    private boolean zzP;
    private final zzco zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbdm zzX;
    private boolean zzY;
    private final zzciw zzb;
    private final zzaxd zzc;
    private final zzfhs zzd;
    private final zzbfs zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzm zzg;
    private final zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfgt zzk;
    private zzfgw zzl;
    private boolean zzm;
    private boolean zzn;
    private zzchl zzo;
    private zzm zzp;
    private zzehg zzq;
    private zzehe zzr;
    private zzcix zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcic(zzciw zzciw2, zzcix zzcix2, String string2, boolean bl2, boolean bl3, zzaxd zzaxd2, zzbfs zzbfs2, VersionInfoParcel versionInfoParcel, zzbfe zzbfe2, com.google.android.gms.ads.internal.zzm zzm2, zza zza2, zzbdm zzbdm2, zzfgt zzfgt2, zzfgw zzfgw2, zzfhs zzfhs2) {
        float f5;
        int n3;
        boolean bl4;
        zzcic zzcic2 = this;
        Object object = versionInfoParcel;
        super((Context)zzciw2);
        Object object2 = null;
        this.zzm = false;
        this.zzn = false;
        this.zzz = bl4 = true;
        this.zzA = "";
        this.zzR = n3 = -1;
        this.zzS = n3;
        this.zzT = n3;
        this.zzU = n3;
        this.zzb = zzciw2;
        Object object3 = zzcix2;
        this.zzs = zzcix2;
        object3 = string2;
        this.zzt = string2;
        n3 = (int)(bl2 ? 1 : 0);
        this.zzw = bl2;
        object3 = zzaxd2;
        this.zzc = zzaxd2;
        object3 = zzfhs2;
        this.zzd = zzfhs2;
        object3 = zzbfs2;
        this.zze = zzbfs2;
        this.zzf = versionInfoParcel;
        object3 = zzm2;
        this.zzg = zzm2;
        object3 = zza2;
        this.zzh = zza2;
        object3 = (WindowManager)this.getContext().getSystemService("window");
        this.zzW = object3;
        com.google.android.gms.ads.internal.zzu.zzp();
        object3 = com.google.android.gms.ads.internal.util.zzt.zzt((WindowManager)object3);
        this.zzi = object3;
        this.zzj = f5 = ((DisplayMetrics)object3).density;
        object3 = zzbdm2;
        this.zzX = zzbdm2;
        object3 = zzfgt2;
        this.zzk = zzfgt2;
        object3 = zzfgw2;
        this.zzl = zzfgw2;
        Object object4 = zzciw2.zza();
        this.zzQ = object3 = new zzco((Activity)object4, (View)this, this, null);
        this.zzY = false;
        this.setBackgroundColor(0);
        object4 = this.getSettings();
        object4.setAllowFileAccess(false);
        try {
            object4.setJavaScriptEnabled(bl4);
        }
        catch (NullPointerException nullPointerException) {
            object3 = "Unable to enable Javascript.";
            com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object3, nullPointerException);
        }
        object4.setSavePassword(false);
        object4.setSupportMultipleWindows(bl4);
        object4.setJavaScriptCanOpenWindowsAutomatically(bl4);
        object3 = zzbep.zzlF;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
        if (n3 != 0) {
            object4.setMixedContentMode((int)(bl4 ? 1 : 0));
        } else {
            n3 = 2;
            f5 = 2.8E-45f;
            object4.setMixedContentMode(n3);
        }
        object3 = com.google.android.gms.ads.internal.zzu.zzp();
        object = ((VersionInfoParcel)object).afmaVersion;
        object3 = ((zzt)object3).zzc((Context)zzciw2, (String)object);
        object4.setUserAgentString((String)object3);
        com.google.android.gms.ads.internal.zzu.zzp();
        object3 = this.getContext();
        object = new zzk((WebSettings)object4, (Context)object3);
        zzch.zza((Context)object3, (Callable)object);
        object4.setAllowFileAccessFromFileURLs(false);
        object4.setAllowUniversalAccessFromFileURLs(false);
        object4.setMediaPlaybackRequiresUserGesture(false);
        this.setDownloadListener(this);
        this.zzba();
        object = new zzcii(this);
        object3 = new zzcij(this, (zzcii)object);
        this.addJavascriptInterface(object3, "googleAdsJsInterface");
        this.removeJavascriptInterface("accessibility");
        this.removeJavascriptInterface("accessibilityTraversal");
        this.zzbi();
        object2 = zzcic2.zzt;
        object4 = "make_wv";
        object = new zzbfe(bl4, (String)object4, (String)object2);
        zzcic2.zzM = object3 = new zzbfc((zzbfe)object);
        ((zzbfc)object3).zza().zzc(null);
        object = zzbep.zzbR;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl5 = (Boolean)object;
        if (bl5 && (object = zzcic2.zzl) != null && (object = ((zzfgw)object).zzb) != null) {
            object = ((zzbfc)object3).zza();
            object2 = zzcic2.zzl.zzb;
            String string3 = "gqi";
            ((zzbfe)object).zzd(string3, (String)object2);
        }
        ((zzbfc)object3).zza();
        zzcic2.zzK = object = zzbfe.zzf();
        ((zzbfc)object3).zzb("native:view_create", (zzbfb)object);
        zzcic2.zzL = null;
        zzcic2.zzJ = null;
        zzck.zza().zzb((Context)zzciw2);
        com.google.android.gms.ads.internal.zzu.zzo().zzt();
    }

    public static /* bridge */ /* synthetic */ int zzaI(zzcic zzcic2) {
        return zzcic2.zzI;
    }

    public static /* bridge */ /* synthetic */ void zzaQ(zzcic zzcic2, int n3) {
        zzcic2.zzI = n3;
    }

    public static /* synthetic */ void zzaR(zzcic zzcic2) {
        super.destroy();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzba() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                Object object;
                try {
                    object = this.zzk;
                    if (object != null && (bl2 = ((zzfgt)object).zzan)) {
                        object = "Disabling hardware acceleration on an overlay.";
                        com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
                        this.zzbc();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                bl2 = this.zzw;
                if (!bl2 && !(bl2 = ((zzcix)(object = this.zzs)).zzi())) {
                    object = "Enabling hardware acceleration on an AdView.";
                    com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
                    this.zzbe();
                    return;
                }
                object = "Enabling hardware acceleration on an overlay.";
                com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
                this.zzbe();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzbb() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzP;
                    if (!bl2) {
                        this.zzP = bl2 = true;
                        zzcby zzcby2 = com.google.android.gms.ads.internal.zzu.zzo();
                        zzcby2.zzr();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
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
    private final void zzbc() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                int n3;
                block3: {
                    try {
                        boolean bl2 = this.zzx;
                        n3 = 1;
                        if (bl2) break block3;
                        bl2 = false;
                        Object var3_3 = null;
                        this.setLayerType(n3, null);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zzx = n3;
                return;
            }
            throw throwable2;
        }
    }

    private final void zzbd(boolean bl2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        boolean bl3 = true;
        String string2 = bl3 != bl2 ? "0" : "1";
        hashMap.put("isVisible", string2);
        this.zzd("onAdVisibilityChanged", hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzbe() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2 = this.zzx;
                        if (!bl2) break block3;
                        bl2 = false;
                        Object var2_2 = null;
                        this.setLayerType(0, null);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zzx = false;
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
    private final void zzbf(String object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2;
                try {
                    object = zzbep.zzll;
                    object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    object2 = "about:blank";
                    if (bl2) {
                        object = com.google.android.gms.ads.internal.util.zzt.zza;
                        zzchx zzchx2 = new zzchx(this, (String)object2);
                        object.post((Runnable)zzchx2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                super.loadUrl((String)object2);
                return;
            }
            String string2 = "AdWebViewImpl.loadUrlUnsafe";
            try {
                zzcby zzcby2 = com.google.android.gms.ads.internal.zzu.zzo();
                zzcby2.zzw(throwable2, string2);
                string2 = "Could not call loadUrl in destroy(). ";
                com.google.android.gms.ads.internal.util.client.zzm.zzk(string2, throwable2);
                return;
            }
            catch (Throwable throwable3) {}
            throw throwable3;
        }
    }

    private final void zzbg() {
        zzbfe zzbfe2 = this.zzM.zza();
        String[] stringArray = new String[]{"aeh2"};
        zzbfb zzbfb2 = this.zzK;
        zzbew.zza(zzbfe2, zzbfb2, stringArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzbh() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Iterator iterator;
                block4: {
                    try {
                        boolean bl2;
                        iterator = this.zzV;
                        if (iterator == null) break block4;
                        iterator = iterator.values();
                        iterator = iterator.iterator();
                        while (bl2 = iterator.hasNext()) {
                            Object object = iterator.next();
                            object = (zzcfp)object;
                            ((zzcfp)object).release();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                iterator = null;
                this.zzV = null;
                return;
            }
            throw throwable2;
        }
    }

    private final void zzbi() {
        Object object = this.zzM;
        if (object != null) {
            object = ((zzbfc)object).zza();
            zzbeu zzbeu2 = com.google.android.gms.ads.internal.zzu.zzo().zzg();
            if (zzbeu2 != null) {
                zzbeu2.zzf((zzbfe)object);
            }
        }
    }

    /*
     * Exception decompiling
     */
    private final void zzbj() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [9 : 47->50)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void destroy() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                zzben zzben2;
                Object object;
                block6: {
                    try {
                        this.zzbi();
                        object = this.zzQ;
                        ((zzco)object).zza();
                        object = this.zzp;
                        zzben2 = null;
                        if (object != null) {
                            ((zzm)object).zzb();
                            object = this.zzp;
                            ((zzm)object).zzm();
                            this.zzp = null;
                        }
                        this.zzq = null;
                        this.zzr = null;
                        object = this.zzo;
                        ((zzchl)object).zzh();
                        this.zzG = null;
                        this.zzg = null;
                        this.setOnClickListener(null);
                        this.setOnTouchListener(null);
                        bl2 = this.zzv;
                        if (!bl2) break block6;
                    }
                    catch (Throwable throwable2) {}
                    return;
                }
                object = com.google.android.gms.ads.internal.zzu.zzy();
                ((zzcfi)object).zzd(this);
                this.zzbh();
                this.zzv = bl2 = true;
                object = zzbep.zzkN;
                zzben2 = zzba.zzc();
                object = zzben2.zza((zzbeg)object);
                object = (Boolean)object;
                bl2 = (Boolean)object;
                if (bl2) {
                    object = "Initiating WebView self destruct sequence in 3...";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object);
                    object = "Loading blank page in WebView, 2...";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object);
                    object = "about:blank";
                    this.zzbf((String)object);
                    return;
                }
                break block7;
                object = "Destroying the WebView immediately...";
                com.google.android.gms.ads.internal.util.zze.zza((String)object);
                this.zzX();
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
    public final void evaluateJavascript(String string2, ValueCallback valueCallback) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    boolean bl2;
                    block5: {
                        block6: {
                            try {
                                bl2 = this.zzaE();
                                if (!bl2) break block5;
                                string2 = "#004 The webview is destroyed. Ignoring action.";
                                bl2 = false;
                                Object var4_5 = null;
                                com.google.android.gms.ads.internal.util.client.zzm.zzl(string2, null);
                                if (valueCallback == null) break block6;
                                valueCallback.onReceiveValue(null);
                                return;
                            }
                            catch (Throwable throwable2) {}
                        }
                        return;
                    }
                    Object object = zzbep.zzkO;
                    Object object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    object = (Boolean)object;
                    bl2 = (Boolean)object;
                    if (!bl2) break block7;
                    object = Looper.getMainLooper();
                    if ((object = object.getThread()) == (object2 = Thread.currentThread())) break block7;
                    object = zzcci.zze;
                    object2 = new zzchw(this, string2, valueCallback);
                    object.zza((Runnable)object2);
                    return;
                    break block8;
                }
                super.evaluateJavascript(string2, valueCallback);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void finalize() {
        Throwable throwable2;
        block8: {
            block7: {
                try {
                    boolean bl2 = this.zzv;
                    if (bl2) break block7;
                    Object object = this.zzo;
                    ((zzchl)object).zzh();
                    object = com.google.android.gms.ads.internal.zzu.zzy();
                    ((zzcfi)object).zzd(this);
                    this.zzbh();
                    this.zzbb();
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            // MONITOREXIT : this
            super.finalize();
            return;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            super.finalize();
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void loadData(String string2, String string3, String string4) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzaE();
                    if (!bl2) {
                        super.loadData(string2, string3, string4);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                string2 = "#004 The webview is destroyed. Ignoring action.";
                com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
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
    public final void loadDataWithBaseURL(String string2, String string3, String string4, String string5, String string6) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzaE();
                    if (!bl2) {
                        super.loadDataWithBaseURL(string2, string3, string4, string5, string6);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                string2 = "#004 The webview is destroyed. Ignoring action.";
                com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
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
    public final void loadUrl(String string2) {
        synchronized (this) {
            Throwable throwable3;
            block8: {
                block7: {
                    Throwable throwable22;
                    block9: {
                        boolean bl2;
                        try {
                            bl2 = this.zzaE();
                            if (bl2) break block7;
                        }
                        catch (Throwable throwable3) {
                            break block8;
                        }
                        try {
                            Object object = zzbep.zzll;
                            Object object2 = zzba.zzc();
                            object = ((zzben)object2).zza((zzbeg)object);
                            object = (Boolean)object;
                            bl2 = (Boolean)object;
                            if (bl2) {
                                object = com.google.android.gms.ads.internal.util.zzt.zza;
                                object2 = new zzchz(this, string2);
                                object.post((Runnable)object2);
                                return;
                            }
                        }
                        catch (Throwable throwable22) {
                            break block9;
                        }
                        super.loadUrl(string2);
                        return;
                    }
                    String string3 = "AdWebViewImpl.loadUrl";
                    zzcby zzcby2 = com.google.android.gms.ads.internal.zzu.zzo();
                    zzcby2.zzw(throwable22, string3);
                    string3 = "Could not call loadUrl. ";
                    com.google.android.gms.ads.internal.util.client.zzm.zzk(string3, throwable22);
                    return;
                }
                string2 = "#004 The webview is destroyed. Ignoring action.";
                com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
                return;
            }
            throw throwable3;
        }
    }

    public final void onAdClicked() {
        zzchl zzchl2 = this.zzo;
        if (zzchl2 != null) {
            zzchl2.onAdClicked();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAttachedToWindow() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                Object object;
                boolean bl3;
                block6: {
                    try {
                        super.onAttachedToWindow();
                        bl3 = this.zzaE();
                        if (bl3) break block6;
                        object = this.zzQ;
                        ((zzco)object).zzc();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if (bl3 = this.zzY) {
                    this.onResume();
                    bl3 = false;
                    object = null;
                    this.zzY = false;
                }
                bl3 = this.zzC;
                zzchl zzchl2 = this.zzo;
                if (zzchl2 != null && (bl2 = zzchl2.zzQ())) {
                    bl3 = this.zzD;
                    bl2 = true;
                    if (!bl3) {
                        object = this.zzo;
                        ((zzchl)object).zza();
                        object = this.zzo;
                        ((zzchl)object).zzb();
                        this.zzD = bl2;
                    }
                    this.zzaZ();
                    bl3 = true;
                }
                this.zzbd(bl3);
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
    public final void onDetachedFromWindow() {
        synchronized (this) {
            try {
                Object object;
                boolean bl2 = this.zzaE();
                if (!bl2) {
                    object = this.zzQ;
                    ((zzco)object).zzd();
                }
                super.onDetachedFromWindow();
                bl2 = this.zzD;
                if (bl2 && (object = this.zzo) != null && (bl2 = ((zzchl)object).zzQ()) && (object = this.getViewTreeObserver()) != null && (bl2 = (object = this.getViewTreeObserver()).isAlive())) {
                    object = this.zzo;
                    ((zzchl)object).zza();
                    object = this.zzo;
                    ((zzchl)object).zzb();
                    this.zzD = false;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl17 : MonitorExitStatement: MONITOREXIT : this
                this.zzbd(false);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDownloadStart(String string2, String string3, String object, String string4, long l2) {
        ActivityNotFoundException activityNotFoundException2;
        block3: {
            block2: {
                try {
                    object = "android.intent.action.VIEW";
                    string3 = new Intent((String)object);
                    object = Uri.parse((String)string2);
                    string3.setDataAndType((Uri)object, string4);
                    object = zzbep.zzkZ;
                    zzben zzben2 = zzba.zzc();
                    object = zzben2.zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (!bl2 || (object = this.getContext()) == null) break block2;
                    object = this.getContext();
                    object = object.getPackageName();
                    string3.setPackage((String)object);
                }
                catch (ActivityNotFoundException activityNotFoundException2) {
                    break block3;
                }
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            object = this.getContext();
            com.google.android.gms.ads.internal.util.zzt.zzT((Context)object, (Intent)string3);
            return;
        }
        object = new StringBuilder("Couldn't find an Activity to view url/mimetype: ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" / ");
        ((StringBuilder)object).append(string4);
        com.google.android.gms.ads.internal.util.client.zzm.zze(((StringBuilder)object).toString());
        string2 = String.valueOf(string2);
        string2 = "AdWebViewImpl.onDownloadStart: ".concat(string2);
        com.google.android.gms.ads.internal.zzu.zzo().zzw(activityNotFoundException2, string2);
    }

    public final void onDraw(Canvas canvas) {
        int n3;
        int n4 = this.zzaE();
        if (n4 != 0 || (n4 = Build.VERSION.SDK_INT) == (n3 = 21) && (n4 = (int)(canvas.isHardwareAccelerated() ? 1 : 0)) != 0 && (n4 = (int)(this.isAttachedToWindow() ? 1 : 0)) == 0) {
            return;
        }
        super.onDraw(canvas);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        block2: {
            block3: {
                float f5;
                float f6;
                int n3;
                int n4 = 9;
                float f7 = motionEvent.getAxisValue(n4);
                int n7 = 10;
                float f8 = motionEvent.getAxisValue(n7);
                int n8 = motionEvent.getActionMasked();
                if (n8 != (n3 = 8)) break block2;
                n8 = -1;
                n3 = 0;
                float f11 = f7 - 0.0f;
                Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (object > 0 && (object = (Object)this.canScrollVertically(n8)) == false) break block3;
                object = true;
                float f12 = f7 - 0.0f;
                n4 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                if (!(n4 < 0 && (n4 = (int)(this.canScrollVertically((int)object) ? 1 : 0)) == 0 || (n4 = (int)((f6 = f8 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0 && (n4 = (int)(this.canScrollHorizontally(n8) ? 1 : 0)) == 0) && ((n4 = (int)((f5 = f8 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) >= 0 || (n4 = (int)(this.canScrollHorizontally((int)object) ? 1 : 0)) != 0)) break block2;
            }
            return false;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean bl2 = this.zzaZ();
        zzm zzm2 = this.zzL();
        if (zzm2 != null && bl2) {
            zzm2.zzn();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onMeasure(int var1_1, int var2_2) {
        var3_3 = "Not enough space to show ad. Needs ";
        synchronized (this) {
            block35: {
                block34: {
                    block38: {
                        block39: {
                            block36: {
                                block37: {
                                    try {
                                        var4_4 = this.zzaE();
                                        var5_5 = 0;
                                        if (var4_4 != 0) {
                                            this.setMeasuredDimension(0, 0);
                                            return;
                                        }
                                    }
                                    catch (Throwable var6_6) {
                                        break block35;
                                    }
                                    var4_4 = this.isInEditMode();
                                    if (var4_4 != 0 || (var4_4 = this.zzw) != 0 || (var4_4 = (var7_10 = this.zzs).zzf()) != 0) ** GOTO lbl229
                                    var7_10 = this.zzs;
                                    var4_4 = var7_10.zzh();
                                    if (var4_4 != 0) {
                                        super.onMeasure(var1_1, var2_2);
                                        return;
                                    }
                                    var7_10 = this.zzs;
                                    var4_4 = var7_10.zzj();
                                    if (var4_4 == 0) ** GOTO lbl81
                                    var3_3 = zzbep.zzdQ;
                                    var7_10 = zzba.zzc();
                                    var3_3 = var7_10.zza((zzbeg)var3_3);
                                    var8_11 = (var3_3 = (Boolean)var3_3).booleanValue();
                                    if (var8_11) {
                                        super.onMeasure(var1_1, var2_2);
                                        return;
                                    }
                                    var3_3 = this.zzq();
                                    var4_4 = 0;
                                    var9_14 = 0.0f;
                                    var7_10 = null;
                                    if (var3_3 != null) {
                                        var10_16 = var3_3.zze();
                                    } else {
                                        var8_11 = false;
                                        var10_16 = 0.0f;
                                        var3_3 = null;
                                    }
                                    var4_4 = (int)((cfr_temp_0 = var10_16 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                    if (var4_4 != 0) ** GOTO lbl43
                                    {
                                        super.onMeasure(var1_1, var2_2);
                                        return;
lbl43:
                                        // 1 sources

                                        var1_1 = View.MeasureSpec.getSize((int)var1_1);
                                        var2_2 = View.MeasureSpec.getSize((int)var2_2);
                                    }
                                    var9_14 = (float)var2_2 * var10_16;
                                    var11_18 = (float)var1_1 / var10_16;
                                    var12_20 = (int)var11_18;
                                    if (var2_2 != 0) break block36;
                                    if (var12_20 == 0) break block37;
                                    var13_22 = (float)var12_20 * var10_16;
                                    var2_2 = (int)var13_22;
                                    var5_5 = var1_1;
                                    var1_1 = var12_20;
                                    ** GOTO lbl-1000
                                }
                                var2_2 = 0;
                                var13_23 = 0.0f;
                                var14_26 = null;
                            }
                            var4_4 = (int)var9_14;
                            if (var1_1 != 0) break block38;
                            if (var4_4 == 0) break block39;
                            var15_29 = (float)var4_4 / var10_16;
                            var12_20 = (int)var15_29;
                            var1_1 = var2_2;
                            var2_2 = var4_4;
                            var5_5 = var4_4;
                            ** GOTO lbl-1000
                        }
lbl70:
                        // 2 sources

                        while (true) {
                            var1_1 = var2_2;
                            var2_2 = var4_4;
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    var5_5 = var1_1;
                    ** continue;
lbl-1000:
                    // 3 sources

                    {
                        var2_2 = Math.min(var2_2, var5_5);
                        var1_1 = Math.min(var12_20, var1_1);
                        this.setMeasuredDimension(var2_2, var1_1);
                        return;
lbl81:
                        // 1 sources

                        var7_10 = this.zzs;
                        var4_4 = var7_10.zzg();
                        if (var4_4 == 0) ** GOTO lbl108
                        var3_3 = zzbep.zzdV;
                        var7_10 = zzba.zzc();
                        var3_3 = var7_10.zza((zzbeg)var3_3);
                        var8_12 = (var3_3 = (Boolean)var3_3).booleanValue();
                        if (var8_12) {
                            super.onMeasure(var1_1, var2_2);
                            return;
                        }
                        var3_3 = new zzcia(this);
                        var7_10 = "/contentHeight";
                        this.zzag((String)var7_10, (zzblp)var3_3);
                        var3_3 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();";
                        this.zzaT((String)var3_3);
                        var3_3 = this.zzi;
                        var10_17 = var3_3.density;
                        var1_1 = View.MeasureSpec.getSize((int)var1_1);
                        var4_4 = this.zzI;
                        var5_5 = -1;
                        if (var4_4 == var5_5) ** GOTO lbl-1000
                    }
                    var13_24 = (float)var4_4 * var10_17;
                    var2_2 = (int)var13_24;
                    ** GOTO lbl106
lbl-1000:
                    // 1 sources

                    {
                        var2_2 = View.MeasureSpec.getSize((int)var2_2);
lbl106:
                        // 2 sources

                        this.setMeasuredDimension(var1_1, var2_2);
                        return;
lbl108:
                        // 1 sources

                        var7_10 = this.zzs;
                        var4_4 = var7_10.zzi();
                        if (var4_4 != 0) {
                            var6_7 = this.zzi;
                            var2_2 = var6_7.widthPixels;
                            var1_1 = var6_7.heightPixels;
                            this.setMeasuredDimension(var2_2, var1_1);
                            return;
                        }
                        var4_4 = View.MeasureSpec.getMode((int)var1_1);
                        var1_1 = View.MeasureSpec.getSize((int)var1_1);
                        var12_21 = View.MeasureSpec.getMode((int)var2_2);
                        var2_2 = View.MeasureSpec.getSize((int)var2_2);
                        var16_31 = -1 >>> 1;
                    }
                    var17_32 = 0.0f / 0.0f;
                    var18_33 = 0x40000000;
                    var19_34 = 2.0f;
                    var20_35 = -1 << -1;
                    if (var4_4 != var20_35 && var4_4 != var18_33) {
                        var4_4 = -1 >>> 1;
                        var9_15 = 0.0f / 0.0f;
                    } else {
                        var4_4 = var1_1;
                    }
                    if (var12_21 != var20_35 && var12_21 != var18_33) ** GOTO lbl-1000
                    var16_31 = var2_2;
lbl-1000:
                    // 2 sources

                    {
                        var21_36 = this.zzs;
                        var18_33 = var21_36.zzb;
                        var20_35 = 1;
                        if (var18_33 > var4_4 || (var12_21 = var21_36.zza) > var16_31) {
                            var12_21 = 1;
                            var11_19 = 1.4E-45f;
                        } else {
                            var12_21 = 0;
                            var11_19 = 0.0f;
                            var21_36 = null;
                        }
                        var22_37 = zzbep.zzfy;
                        var23_38 = zzba.zzc();
                        var22_37 = var23_38.zza((zzbeg)var22_37);
                        var22_37 = (Boolean)var22_37;
                        var18_33 = (int)var22_37.booleanValue();
                        if (var18_33 == 0) break block34;
                        var22_37 = this.zzs;
                        var24_39 = var22_37.zzb;
                    }
                    var25_40 = var24_39;
                    {
                        var26_41 = this.zzj;
                    }
                    var9_15 = var4_4;
                    cfr_temp_1 = (var25_40 /= var26_41) - (var9_15 /= var26_41);
                    var4_4 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                    if (var4_4 <= 0 && (var4_4 = (int)((cfr_temp_2 = (var9_15 = (float)var22_37.zza / var26_41) - (var17_32 = (float)var16_31 / var26_41)) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) <= 0) {
                        var4_4 = 1;
                        var9_15 = 1.4E-45f;
                    } else {
                        var4_4 = 0;
                        var9_15 = 0.0f;
                        var7_10 = null;
                    }
                    var12_21 &= var4_4;
                }
                var4_4 = 8;
                var9_15 = 1.1E-44f;
                if (var12_21 == 0) ** GOTO lbl216
                {
                    var21_36 = this.zzs;
                    var16_31 = var21_36.zzb;
                }
                var17_32 = var16_31;
                {
                    var19_34 = this.zzj;
                    var12_21 = var21_36.zza;
                }
                var11_19 = var12_21;
                var15_30 = var1_1;
                var13_25 = var2_2;
                {
                    var23_38 = new StringBuilder((String)var3_3);
                }
                var8_13 = (int)(var17_32 /= var19_34);
                {
                    var23_38.append(var8_13);
                    var3_3 = "x";
                    var23_38.append((String)var3_3);
                }
                var8_13 = (int)(var11_19 /= var19_34);
                {
                    var23_38.append(var8_13);
                    var3_3 = " dp, but only has ";
                    var23_38.append((String)var3_3);
                }
                var1_1 = (int)(var15_30 /= var19_34);
                {
                    var23_38.append(var1_1);
                    var6_8 = "x";
                    var23_38.append((String)var6_8);
                }
                var1_1 = (int)(var13_25 /= var19_34);
                {
                    var23_38.append(var1_1);
                    var6_8 = " dp.";
                    var23_38.append((String)var6_8);
                    var6_8 = var23_38.toString();
                    com.google.android.gms.ads.internal.util.client.zzm.zzj((String)var6_8);
                    var1_1 = this.getVisibility();
                    if (var1_1 != var4_4) {
                        var1_1 = 4;
                        var15_30 = 5.6E-45f;
                        this.setVisibility(var1_1);
                    }
                    this.setMeasuredDimension(0, 0);
                    var1_1 = (int)this.zzm;
                    if (var1_1 == 0) {
                        var6_8 = this.zzX;
                        var14_27 = zzbdo.zzR;
                        var6_8.zzb(var14_27);
                        this.zzm = var20_35;
                        return;
                    }
                    return;
lbl216:
                    // 1 sources

                    var1_1 = this.getVisibility();
                    if (var1_1 != var4_4) {
                        this.setVisibility(0);
                    }
                    if ((var1_1 = (int)this.zzn) == 0) {
                        var6_9 = this.zzX;
                        var14_28 = zzbdo.zzS;
                        var6_9.zzb(var14_28);
                        this.zzn = var20_35;
                    }
                    var6_9 = this.zzs;
                    var2_2 = var6_9.zzb;
                    var1_1 = var6_9.zza;
                    this.setMeasuredDimension(var2_2, var1_1);
                    return;
lbl229:
                    // 1 sources

                    super.onMeasure(var1_1, var2_2);
                    return;
                }
            }
            throw var6_6;
        }
    }

    public final void onPause() {
        block15: {
            boolean n3 = this.zzaE();
            if (!n3) {
                boolean bl2;
                Object object;
                Object object2;
                block16: {
                    super.onPause();
                    object2 = zzbep.zzmz;
                    object = zzba.zzc();
                    object2 = ((zzben)object).zza((zzbeg)object2);
                    object2 = (Boolean)object2;
                    boolean bl3 = (Boolean)object2;
                    if (!bl3) break block15;
                    object2 = "MUTE_AUDIO";
                    boolean bl4 = h83.c((String)object2);
                    if (!bl4) break block15;
                    object2 = "Muting webview";
                    com.google.android.gms.ads.internal.util.client.zzm.zze((String)object2);
                    int n4 = BF3.a;
                    object2 = CF3.d;
                    boolean bl5 = ((mm)object2).c();
                    if (!bl5) break block16;
                    object2 = DF3$a.a;
                    object2 = object2.createWebView(this);
                    bl2 = true;
                    object2.setAudioMuted(bl2);
                    return;
                }
                object = "This method is not supported by the current version of the framework and the current WebView APK";
                try {
                    object2 = new UnsupportedOperationException((String)object);
                    throw object2;
                }
                catch (Exception exception) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not pause webview.", exception);
                    object = zzbep.zzmC;
                    Object object3 = zzba.zzc();
                    object = (Boolean)((zzben)object3).zza((zzbeg)object);
                    bl2 = (Boolean)object;
                    if (!bl2) break block15;
                    object = "AdWebViewImpl.onPause";
                    object3 = com.google.android.gms.ads.internal.zzu.zzo();
                    ((zzcby)object3).zzw(exception, (String)object);
                }
            }
        }
    }

    public final void onResume() {
        block15: {
            boolean n3 = this.zzaE();
            if (!n3) {
                boolean bl2;
                Object object;
                Object object2;
                block16: {
                    super.onResume();
                    object2 = zzbep.zzmz;
                    object = zzba.zzc();
                    object2 = ((zzben)object).zza((zzbeg)object2);
                    object2 = (Boolean)object2;
                    boolean bl3 = (Boolean)object2;
                    if (!bl3) break block15;
                    object2 = "MUTE_AUDIO";
                    boolean bl4 = h83.c((String)object2);
                    if (!bl4) break block15;
                    object2 = "Unmuting webview";
                    com.google.android.gms.ads.internal.util.client.zzm.zze((String)object2);
                    int n4 = BF3.a;
                    object2 = CF3.d;
                    boolean bl5 = ((mm)object2).c();
                    if (!bl5) break block16;
                    object2 = DF3$a.a;
                    object2 = object2.createWebView(this);
                    bl2 = false;
                    object = null;
                    object2.setAudioMuted(false);
                    return;
                }
                object = "This method is not supported by the current version of the framework and the current WebView APK";
                try {
                    object2 = new UnsupportedOperationException((String)object);
                    throw object2;
                }
                catch (Exception exception) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not resume webview.", exception);
                    object = zzbep.zzmC;
                    Object object3 = zzba.zzc();
                    object = (Boolean)((zzben)object3).zza((zzbeg)object);
                    bl2 = (Boolean)object;
                    if (!bl2) break block15;
                    object = "AdWebViewImpl.onResume";
                    object3 = com.google.android.gms.ads.internal.zzu.zzo();
                    ((zzcby)object3).zzw(exception, (String)object);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        block9: {
            Object object;
            block8: {
                object = this.zzo;
                bl2 = ((zzchl)object).zzQ();
                if (!bl2 || (bl2 = ((zzchl)(object = this.zzo)).zzO())) break block8;
                synchronized (this) {
                    Throwable throwable2;
                    block7: {
                        block6: {
                            try {
                                object = this.zzE;
                                if (object == null) break block6;
                                object.zzd(motionEvent);
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        break block9;
                    }
                    throw throwable2;
                }
            }
            object = this.zzc;
            if (object != null) {
                ((zzaxd)object).zzd(motionEvent);
            }
            if ((object = this.zze) != null) {
                ((zzbfs)object).zzb(motionEvent);
            }
        }
        bl2 = this.zzaE();
        if (bl2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        boolean bl2 = webViewClient instanceof zzchl;
        if (bl2) {
            webViewClient = (zzchl)webViewClient;
            this.zzo = webViewClient;
        }
    }

    public final void stopLoading() {
        boolean bl2 = this.zzaE();
        if (bl2) {
            return;
        }
        try {
            super.stopLoading();
            return;
        }
        catch (Exception exception) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not stop loading webview.", exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzA(int n3) {
        synchronized (this) {
            this.zzN = n3;
            return;
        }
    }

    public final void zzB(int n3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzC(zzcif object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    zzcif zzcif2 = this.zzB;
                    if (zzcif2 != null) {
                        object = "Attempt to create multiple AdWebViewVideoControllers.";
                        com.google.android.gms.ads.internal.util.client.zzm.zzg((String)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.zzB = object;
                return;
            }
            throw throwable2;
        }
    }

    public final zzfgt zzD() {
        return this.zzk;
    }

    public final Context zzE() {
        return this.zzb.zzb();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return this;
    }

    public final WebViewClient zzH() {
        return this.zzo;
    }

    public final zzaxd zzI() {
        return this.zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbca zzJ() {
        synchronized (this) {
            return this.zzG;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbhj zzK() {
        synchronized (this) {
            return this.zzE;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzm zzL() {
        synchronized (this) {
            return this.zzp;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzm zzM() {
        synchronized (this) {
            return this.zzO;
        }
    }

    public final /* synthetic */ zzciv zzN() {
        return this.zzo;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcix zzO() {
        synchronized (this) {
            return this.zzs;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzehe zzP() {
        synchronized (this) {
            return this.zzr;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzehg zzQ() {
        synchronized (this) {
            return this.zzq;
        }
    }

    public final zzfgw zzR() {
        return this.zzl;
    }

    public final zzfhs zzS() {
        return this.zzd;
    }

    public final ListenableFuture zzT() {
        zzbfs zzbfs2 = this.zze;
        if (zzbfs2 == null) {
            return zzgft.zzh(null);
        }
        return zzbfs2.zza();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzU() {
        synchronized (this) {
            return this.zzt;
        }
    }

    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public final void zzW(zzfgt zzfgt2, zzfgw zzfgw2) {
        this.zzk = zzfgt2;
        this.zzl = zzfgw2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzX() {
        synchronized (this) {
            Object object = "Destroying WebView!";
            com.google.android.gms.ads.internal.util.zze.zza(object);
            this.zzbb();
            object = com.google.android.gms.ads.internal.util.zzt.zza;
            zzcib zzcib2 = new zzcib(this);
            object.post((Runnable)zzcib2);
            return;
        }
    }

    public final void zzY() {
        this.zzbg();
        HashMap<String, String> hashMap = new HashMap<String, String>(1);
        String string2 = this.zzf.afmaVersion;
        hashMap.put("version", string2);
        this.zzd("onhide", hashMap);
    }

    public final void zzZ(int n3) {
        String[] stringArray;
        HashMap<String, String> hashMap;
        if (n3 == 0) {
            hashMap = this.zzM;
            zzbfb zzbfb2 = this.zzK;
            hashMap = ((zzbfc)((Object)hashMap)).zza();
            stringArray = new String[]{"aebb2"};
            zzbew.zza((zzbfe)((Object)hashMap), zzbfb2, stringArray);
        }
        this.zzbg();
        this.zzM.zza();
        hashMap = this.zzM.zza();
        stringArray = String.valueOf(n3);
        ((zzbfe)((Object)hashMap)).zzd("close_type", (String)stringArray);
        hashMap = new HashMap<String, String>(2);
        String string2 = String.valueOf(n3);
        hashMap.put("closetype", string2);
        string2 = this.zzf.afmaVersion;
        hashMap.put("version", string2);
        this.zzd("onhide", hashMap);
    }

    public final void zza(String string2) {
        throw null;
    }

    public final void zzaA(String string2, Predicate predicate) {
        zzchl zzchl2 = this.zzo;
        if (zzchl2 != null) {
            zzchl2.zzN(string2, predicate);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaB() {
        synchronized (this) {
            return this.zzu;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaC() {
        synchronized (this) {
            int n3 = this.zzH;
            return n3 > 0;
        }
    }

    public final boolean zzaD(boolean bl2, int n3) {
        this.destroy();
        zzchy zzchy2 = new zzchy(bl2, n3);
        this.zzX.zzc(zzchy2);
        zzbdm zzbdm2 = this.zzX;
        zzbdo zzbdo2 = zzbdo.zzT;
        zzbdm2.zzb(zzbdo2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaE() {
        synchronized (this) {
            return this.zzv;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaF() {
        synchronized (this) {
            return this.zzw;
        }
    }

    public final boolean zzaG() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaH() {
        synchronized (this) {
            return this.zzz;
        }
    }

    public final void zzaJ(zzc zzc2, boolean bl2, boolean bl3) {
        this.zzo.zzu(zzc2, bl2, bl3);
    }

    public final void zzaK(String string2, String string3, int n3) {
        this.zzo.zzv(string2, string3, 14);
    }

    public final void zzaL(boolean bl2, int n3, boolean bl3) {
        this.zzo.zzw(bl2, n3, bl3);
    }

    public final void zzaM(boolean bl2, int n3, String string2, String string3, boolean bl3) {
        this.zzo.zzy(bl2, n3, string2, string3, bl3);
    }

    public final void zzaN(boolean bl2, int n3, String string2, boolean bl3, boolean bl4) {
        this.zzo.zzz(bl2, n3, string2, bl3, bl4);
    }

    public final zzchl zzaO() {
        return this.zzo;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Boolean zzaP() {
        synchronized (this) {
            return this.zzy;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaS(String string2, ValueCallback valueCallback) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzaE();
                    if (!bl2) {
                        bl2 = false;
                        this.evaluateJavascript(string2, null);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                string2 = "#004 The webview is destroyed. Ignoring action.";
                com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzaT(String string2) {
        boolean bl2 = PlatformVersion.isAtLeastKitKat();
        String string3 = "javascript:";
        if (bl2) {
            Boolean bl3 = this.zzaP();
            if (bl3 == null) {
                this.zzbj();
            }
            if (bl2 = (bl3 = this.zzaP()).booleanValue()) {
                this.zzaS(string2, null);
                return;
            }
            string2 = string3.concat(string2);
            this.zzaX(string2);
            return;
        }
        string2 = string3.concat(string2);
        this.zzaX(string2);
    }

    public final /* synthetic */ void zzaU(String string2, ValueCallback valueCallback) {
        super.evaluateJavascript(string2, valueCallback);
    }

    public final /* synthetic */ void zzaV(String string2) {
        super.loadUrl(string2);
    }

    public final /* synthetic */ void zzaW(String string2) {
        super.loadUrl("about:blank");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaX(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzaE();
                    if (!bl2) {
                        this.loadUrl(string2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                string2 = "#004 The webview is destroyed. Ignoring action.";
                com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
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
    public final void zzaY(Boolean bl2) {
        synchronized (this) {
            this.zzy = bl2;
        }
        com.google.android.gms.ads.internal.zzu.zzo().zzy(bl2);
    }

    public final boolean zzaZ() {
        int n3;
        Object object;
        Object object2;
        int n4;
        int n7;
        boolean bl2;
        Object object3;
        Object object4;
        block7: {
            block6: {
                Object object5;
                object4 = this.zzo;
                object3 = ((zzchl)object4).zzP();
                bl2 = false;
                if (object3 == 0 && (object3 = ((zzchl)(object4 = this.zzo)).zzQ()) == 0) break block6;
                zzay.zzb();
                object4 = this.zzi;
                int n8 = ((DisplayMetrics)object4).widthPixels;
                n7 = com.google.android.gms.ads.internal.util.client.zzf.zzw((DisplayMetrics)object4, n8);
                zzay.zzb();
                object4 = this.zzi;
                n8 = ((DisplayMetrics)object4).heightPixels;
                n4 = com.google.android.gms.ads.internal.util.client.zzf.zzw((DisplayMetrics)object4, n8);
                object4 = this.zzb.zza();
                n8 = 1;
                if (object4 != null && (object2 = object4.getWindow()) != null) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    object4 = com.google.android.gms.ads.internal.util.zzt.zzQ((Activity)object4);
                    zzay.zzb();
                    object2 = this.zzi;
                    object = object4[0];
                    object5 = com.google.android.gms.ads.internal.util.client.zzf.zzw((DisplayMetrics)object2, object);
                    zzay.zzb();
                    DisplayMetrics displayMetrics = this.zzi;
                    object3 = object4[n8];
                    n3 = object3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, object3);
                    object = object5;
                } else {
                    object = n7;
                    n3 = n4;
                }
                object3 = this.zzS;
                if (object3 != n7 || (object5 = this.zzR) != n4 || (object5 = this.zzT) != object || (object5 = this.zzU) != n3) break block7;
            }
            return false;
        }
        if (object3 != n7 || (object3 = this.zzR) != n4) {
            bl2 = true;
        }
        this.zzS = n7;
        this.zzR = n4;
        this.zzT = object;
        this.zzU = n3;
        object2 = new zzbuj(this, "");
        object4 = this.zzi;
        WindowManager windowManager = this.zzW;
        float f5 = ((DisplayMetrics)object4).density;
        int n10 = windowManager.getDefaultDisplay().getRotation();
        ((zzbuj)object2).zzj(n7, n4, (int)object, n3, f5, n10);
        return bl2;
    }

    public final void zzaa() {
        Object object;
        Object object2 = this.zzJ;
        if (object2 == null) {
            object2 = this.zzM;
            object = this.zzK;
            object2 = ((zzbfc)object2).zza();
            Object object3 = new String[]{"aes2"};
            zzbew.zza((zzbfe)object2, (zzbfb)object, object3);
            this.zzM.zza();
            this.zzJ = object2 = zzbfe.zzf();
            object = this.zzM;
            object3 = "native:view_show";
            ((zzbfc)object).zzb((String)object3, (zzbfb)object2);
        }
        object2 = new HashMap(1);
        object = this.zzf.afmaVersion;
        ((HashMap)object2).put("version", object);
        this.zzd("onshow", (Map)object2);
    }

    public final void zzab() {
        throw null;
    }

    public final void zzac(boolean bl2) {
        this.zzo.zzi(bl2);
    }

    public final void zzad() {
        this.zzQ.zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzae(String string2, String string3, String object) {
        object = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return ";
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string4;
                String string5;
                Object object2;
                Object object3;
                block6: {
                    try {
                        boolean bl2 = this.zzaE();
                        if (bl2) {
                            string2 = "#004 The webview is destroyed. Ignoring action.";
                            com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
                            return;
                        }
                        object3 = zzbep.zzO;
                        object2 = zzba.zzc();
                        object3 = ((zzben)object2).zza((zzbeg)object3);
                        object3 = (String)object3;
                        object2 = new JSONObject();
                        string5 = "12.4.51-000";
                        string4 = "version";
                        try {
                            object2.put(string4, object3);
                            object3 = "sdk";
                            string4 = "Google Mobile Ads";
                            object2.put((String)object3, (Object)string4);
                            object3 = "sdkVersion";
                            object2.put((String)object3, (Object)string5);
                            object3 = new StringBuilder((String)object);
                        }
                        catch (JSONException jSONException) {
                            object3 = "Unable to build MRAID_ENV";
                            com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object3, jSONException);
                            object = null;
                            break block6;
                        }
                        object = object2.toString();
                        ((StringBuilder)object3).append((String)object);
                        object = "}});</script>";
                        ((StringBuilder)object3).append((String)object);
                        object = ((StringBuilder)object3).toString();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object = new String[]{object};
                string5 = zzcio.zzb(string3, object);
                string4 = "text/html";
                String string6 = "UTF-8";
                object3 = this;
                object2 = string2;
                super.loadDataWithBaseURL(string2, string5, string4, string6, null);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzaf() {
        zzbfb zzbfb2 = this.zzL;
        if (zzbfb2 == null) {
            this.zzM.zza();
            this.zzL = zzbfb2 = zzbfe.zzf();
            zzbfc zzbfc2 = this.zzM;
            String string2 = "native:view_load";
            zzbfc2.zzb(string2, zzbfb2);
        }
    }

    public final void zzag(String string2, zzblp zzblp2) {
        zzchl zzchl2 = this.zzo;
        if (zzchl2 != null) {
            zzchl2.zzA(string2, zzblp2);
        }
    }

    public final void zzah() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzai(zzm zzm2) {
        synchronized (this) {
            this.zzp = zzm2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaj(zzcix zzcix2) {
        synchronized (this) {
            this.zzs = zzcix2;
            this.requestLayout();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzak(zzbca zzbca2) {
        synchronized (this) {
            this.zzG = zzbca2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzal(boolean bl2) {
        synchronized (this) {
            this.zzz = bl2;
            return;
        }
    }

    public final void zzam() {
        this.setBackgroundColor(0);
    }

    public final void zzan(Context object) {
        this.zzb.setBaseContext((Context)object);
        object = this.zzQ;
        Activity activity = this.zzb.zza();
        ((zzco)object).zze(activity);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzao(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    zzm zzm2 = this.zzp;
                    if (zzm2 != null) {
                        zzchl zzchl2 = this.zzo;
                        boolean bl3 = zzchl2.zzP();
                        zzm2.zzy(bl3, bl2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.zzu = bl2;
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
    public final void zzap(zzbhh zzbhh2) {
        synchronized (this) {
            this.zzF = zzbhh2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaq(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    Object object;
                    Object object2;
                    boolean bl3;
                    try {
                        bl3 = this.zzw;
                        this.zzw = bl2;
                        this.zzba();
                        if (bl2 == bl3) break block3;
                        object2 = zzbep.zzP;
                        object = zzba.zzc();
                        object2 = ((zzben)object).zza((zzbeg)object2);
                        bl3 = (Boolean)(object2 = (Boolean)object2);
                        if (bl3 && (bl3 = ((zzcix)(object2 = this.zzs)).zzi())) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    object2 = "";
                    object = new zzbuj(this, (String)object2);
                    bl3 = true;
                    String string2 = bl3 != bl2 ? "default" : "expanded";
                    ((zzbuj)object).zzl(string2);
                    return;
                }
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
    public final void zzar(zzbhj zzbhj2) {
        synchronized (this) {
            this.zzE = zzbhj2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzas(zzehe zzehe2) {
        synchronized (this) {
            this.zzr = zzehe2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzat(zzehg zzehg2) {
        synchronized (this) {
            this.zzq = zzehg2;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzau(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzm zzm2 = this.zzp;
                    if (zzm2 != null) {
                        zzm2.zzA(n3);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzav(boolean bl2) {
        this.zzY = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaw(zzm zzm2) {
        synchronized (this) {
            this.zzO = zzm2;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzax(boolean n3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    zzm zzm2;
                    int n4 = this.zzH;
                    int n7 = 1;
                    if (n7 != n3) {
                        n7 = -1;
                    }
                    this.zzH = n4 += n7;
                    if (n4 <= 0 && (zzm2 = this.zzp) != null) {
                        zzm2.zzE();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
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
    public final void zzay(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                zzm zzm2;
                if (bl2) {
                    zzm2 = null;
                    try {
                        this.setBackgroundColor(0);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((zzm2 = this.zzp) != null) {
                    zzm2.zzB(bl2);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzaz(String string2, zzblp zzblp2) {
        zzchl zzchl2 = this.zzo;
        if (zzchl2 != null) {
            zzchl2.zzM(string2, zzblp2);
        }
    }

    public final void zzb(String string2, String string3) {
        string2 = y02.a(string2, "(", string3, ");");
        this.zzaT(string2);
    }

    public final void zzd(String string2, Map map2) {
        zzf zzf2;
        try {
            zzf2 = zzay.zzb();
        }
        catch (JSONException jSONException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
            return;
        }
        map2 = zzf2.zzj(map2);
        this.zze(string2, (JSONObject)map2);
    }

    public final void zzdG() {
        zzchl zzchl2 = this.zzo;
        if (zzchl2 != null) {
            zzchl2.zzdG();
        }
    }

    public final void zzdf() {
        zzchl zzchl2 = this.zzo;
        if (zzchl2 != null) {
            zzchl2.zzdf();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdg() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    com.google.android.gms.ads.internal.zzm zzm2 = this.zzg;
                    if (zzm2 != null) {
                        zzm2.zzdg();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdh() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    com.google.android.gms.ads.internal.zzm zzm2 = this.zzg;
                    if (zzm2 != null) {
                        zzm2.zzdh();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
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
    public final String zzdi() {
        synchronized (this) {
            return this.zzA;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdp(zzbam zzbam2) {
        boolean bl2;
        synchronized (this) {
            this.zzC = bl2 = zzbam2.zzj;
        }
        this.zzbd(bl2);
    }

    public final void zze(String charSequence, JSONObject object) {
        if (object == null) {
            object = new JSONObject();
        }
        object = object.toString();
        charSequence = og_1.a("(window.AFMA_ReceiveMessage || function() {})('", (String)charSequence, "',", (String)object, ");");
        object = ((StringBuilder)charSequence).toString();
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat((String)object));
        charSequence = ((StringBuilder)charSequence).toString();
        this.zzaT((String)charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzf() {
        synchronized (this) {
            return this.zzN;
        }
    }

    public final int zzg() {
        return this.getMeasuredHeight();
    }

    public final int zzh() {
        return this.getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zzb.zza();
    }

    public final zza zzj() {
        return this.zzh;
    }

    public final zzbfb zzk() {
        return this.zzK;
    }

    public final void zzl(String string2, JSONObject object) {
        object = object.toString();
        this.zzb(string2, (String)object);
    }

    public final zzbfc zzm() {
        return this.zzM;
    }

    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    public final zzcdt zzo() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcfp zzp(String object) {
        synchronized (this) {
            Map map2 = this.zzV;
            if (map2 == null) {
                return null;
            }
            object = map2.get(object);
            return (zzcfp)object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcif zzq() {
        synchronized (this) {
            return this.zzB;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzr() {
        synchronized (this) {
            try {
                zzfgw zzfgw2 = this.zzl;
                if (zzfgw2 == null) return null;
                return zzfgw2.zzb;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzt(String string2, zzcfp zzcfp2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                HashMap<String, zzcfp> hashMap;
                block3: {
                    try {
                        hashMap = this.zzV;
                        if (hashMap != null) break block3;
                        this.zzV = hashMap = new HashMap<String, zzcfp>();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                hashMap = this.zzV;
                hashMap.put(string2, zzcfp2);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzu() {
        zzm zzm2 = this.zzL();
        if (zzm2 != null) {
            zzm2.zzd();
        }
    }

    public final void zzv(boolean bl2, long l2) {
        HashMap<String, String> hashMap = new HashMap<String, String>(2);
        boolean bl3 = true;
        String string2 = bl3 != bl2 ? "0" : "1";
        hashMap.put("success", string2);
        String string3 = Long.toString(l2);
        hashMap.put("duration", string3);
        this.zzd("onCacheAccessComplete", hashMap);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzw() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzbhh zzbhh2 = this.zzF;
                    if (zzbhh2 != null) {
                        zzfuv zzfuv2 = com.google.android.gms.ads.internal.util.zzt.zza;
                        zzbhh2 = (zzdpt)zzbhh2;
                        zzdpr zzdpr2 = new zzdpr((zzdpt)zzbhh2);
                        zzfuv2.post(zzdpr2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzx(int n3) {
    }

    public final void zzy(int n3) {
    }

    public final void zzz(boolean bl2) {
        this.zzo.zzD(false);
    }
}

