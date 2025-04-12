/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.View$OnTouchListener
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.jio.jioads.interstitial;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.b;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.interstitial.q;
import com.jio.jioads.interstitial.u;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class x {
    public final WebView a;
    public final o b;
    public final b c;
    public boolean d;
    public final GestureDetector e;
    public boolean f;

    public x(Context object, WebView webView, o object2, b object3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(object2, "callbacks");
        this.a = webView;
        this.b = object2;
        this.c = object3;
        object2 = webView.getSettings();
        int n3 = 1;
        object2.setJavaScriptEnabled(n3 != 0);
        object2 = webView.getSettings();
        int n4 = 2;
        object2.setCacheMode(n4);
        boolean bl2 = false;
        object2 = null;
        webView.setVerticalScrollBarEnabled(false);
        webView.setFocusableInTouchMode(n3 != 0);
        webView.setFocusable(n3 != 0);
        webView.getSettings().setMixedContentMode(0);
        Object object4 = webView.getSettings();
        object4.setUseWideViewPort(n3 != 0);
        n3 = 100;
        webView.setInitialScale(n3);
        webView.getSettings().setSupportZoom(false);
        Object object5 = new u(this);
        webView.setWebViewClient((WebViewClient)object5);
        if (object3 != null) {
            object5 = object3.k0();
        } else {
            n3 = 0;
            object5 = null;
        }
        object4 = JioAdView$AdState.DESTROYED;
        if (object5 != object4) {
            if (object3 != null) {
                object2 = object3.y();
                object3 = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(object2, object3);
            }
            if (bl2) {
                object3 = new q(this);
                object2 = new GestureDetector(object, (GestureDetector.OnGestureListener)object3);
                this.e = object2;
            }
        }
        super(this);
        webView.setOnTouchListener((View.OnTouchListener)object);
    }

    /*
     * Exception decompiling
     */
    public static final void a(x var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [7 : 82->85)] java.lang.Exception
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
    public final void b(String string2) {
        Exception exception2;
        String string3;
        Object object;
        Object object2;
        block3: {
            String string4;
            CharSequence charSequence;
            object2 = "message";
            object = this.c;
            string3 = null;
            try {
                charSequence = new StringBuilder();
                string4 = object != null ? object.P() : null;
            }
            catch (Exception exception2) {
                break block3;
            }
            charSequence.append(string4);
            string4 = ": Inside evaluateJavascript.Header: ";
            charSequence.append(string4);
            charSequence.append(string2);
            charSequence = charSequence.toString();
            Intrinsics.checkNotNullParameter(charSequence, (String)object2);
            object2 = JioAds.Companion;
            object2 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = this.a;
            Intrinsics.checkNotNull(string2);
            object2.evaluateJavascript(string2, null);
            return;
        }
        object2 = new StringBuilder();
        if (object != null) {
            string3 = object.P();
        }
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(":  Catch exception inside evaluateJavascript() : ");
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, (StringBuilder)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "data");
        this.a.loadDataWithBaseURL("", string2, "text/html", "UTF-8", null);
    }
}

