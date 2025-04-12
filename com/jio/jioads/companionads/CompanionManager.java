/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.jio.jioads.companionads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.p_0;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.companionads.CompanionManager$Companion;
import com.jio.jioads.companionads.a;
import com.jio.jioads.companionads.b;
import com.jio.jioads.companionads.c;
import com.jio.jioads.companionads.d;
import com.jio.jioads.companionads.e;
import com.jio.jioads.companionads.f;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class CompanionManager {
    public static final CompanionManager$Companion Companion;
    private static CompanionManager companionManager;
    private List activeAdViewList;
    private List companionAdviews;
    private HashMap companionMap;
    private q_0 companionTrackerReceiver;
    private final Map currentViewGroups;
    private HashMap hybridAdslotCacheMap;
    private com.jio.jioads.common.b iJioAdView;
    private HashMap jioCompanionCacheMap;
    private JioCompanionListener jioCompanionListener;
    private boolean onCloseCalled;
    private JioAdView primaryAdView;

    static {
        CompanionManager$Companion companionManager$Companion;
        Companion = companionManager$Companion = new CompanionManager$Companion(null);
    }

    private CompanionManager() {
        Cloneable cloneable;
        this.currentViewGroups = cloneable = new Cloneable();
        this.companionAdviews = cloneable;
    }

    public /* synthetic */ CompanionManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void a(CompanionManager companionManager, String string2, String string3) {
        CompanionManager.closeCompanionAd$lambda$21(companionManager, string2, string3, null);
    }

    public static final /* synthetic */ CompanionManager access$getCompanionManager$cp() {
        return companionManager;
    }

    public static final /* synthetic */ q_0 access$getCompanionTrackerReceiver$p(CompanionManager companionManager) {
        return companionManager.companionTrackerReceiver;
    }

    public static final /* synthetic */ JioCompanionListener access$getJioCompanionListener$p(CompanionManager companionManager) {
        return companionManager.jioCompanionListener;
    }

    public static final /* synthetic */ JioAdView access$getPrimaryAdView$p(CompanionManager companionManager) {
        return companionManager.primaryAdView;
    }

    public static final /* synthetic */ void access$setCompanionManager$cp(CompanionManager companionManager) {
        CompanionManager.companionManager = companionManager;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static final void attachCompanionAd$lambda$20(Context var0, CompanionManager var1_1, f var2_2, String var3_3, ViewGroup var4_4, Pair var5_5) {
        block15: {
            Intrinsics.checkNotNullParameter(var1_1, "this$0");
            Intrinsics.checkNotNullParameter(var3_3, "$adslotOrSize");
            Intrinsics.checkNotNullParameter(var4_4, "$viewGroup");
            var0 = var0 != null ? var1_1.getCompanionWebView((f)var2_2, (Context)var0, (String)var3_3) : null;
            if (var0 == null) break block15;
            var6_6 = var1_1.onCloseCalled;
            if (var6_6 != 0) {
                return;
            }
            var6_6 = var2_2.e;
            var7_7 = var2_2.f;
            var8_8 = -1;
            if (var6_6 == var8_8) {
                var6_6 = -1;
                var9_9 = 0.0f / 0.0f;
            } else {
                var10_10 /* !! */  = Utility.INSTANCE;
                var9_9 = var6_6;
                var6_6 = var10_10 /* !! */ .convertDpToPixel(var9_9);
            }
            if (var7_7 != var8_8) {
                var11_11 = Utility.INSTANCE;
                var12_12 = var7_7;
                var8_8 = var11_11.convertDpToPixel(var12_12);
            }
            var2_2 = new RelativeLayout.LayoutParams(var6_6, var8_8);
            var2_2.addRule(17);
            var2_2.addRule(13);
            var4_4.removeAllViews();
            var6_6 = 0;
            var9_9 = 0.0f;
            var3_3 = null;
            var0.setVisibility(0);
            var4_4.addView((View)var0, (ViewGroup.LayoutParams)var2_2);
            if (var5_5 == null) ** GOTO lbl-1000
            var2_2 = var0 = var5_5.a;
            var2_2 = (Collection)var0;
            var7_7 = var2_2.isEmpty() ^ 1;
            if (var7_7 != 0) {
                var2_2 = var1_1.jioCompanionListener;
                if (var2_2 != null) {
                    var3_3 = var0;
                    var3_3 = (JioAdView$JioAdCompanion)CollectionsKt.L((List)var0);
                    var2_2.onCompanionRender((JioAdView$JioAdCompanion)var3_3);
                }
                var0 = ((Iterable)var0).iterator();
                while ((var7_7 = (int)var0.hasNext()) != 0) {
                    var2_2 = (JioAdView$JioAdCompanion)var0.next();
                    var3_3 = var5_5.b;
                    var4_4 = var3_3;
                    var4_4 = (Map)var3_3;
                    if (var4_4 == null || (var13_13 = var4_4.isEmpty())) continue;
                    var4_4 = var3_3;
                    var4_4 = (Map)var3_3;
                    if (var4_4 != null) {
                        var11_11 = var2_2.getAdSlotId();
                        var4_4 = (ArrayList)var4_4.get(var11_11);
                    } else {
                        var13_13 = false;
                        var4_4 = null;
                    }
                    if (var4_4 == null || (var8_8 = (int)var4_4.isEmpty()) != 0) {
                        if ((var3_3 = (Map)var3_3) != null) {
                            var4_4 = var2_2.getDisplaySize().getDynamicSize();
                            var3_3 = var3_3.get(var4_4);
                            var4_4 = var3_3;
                            var4_4 = (ArrayList)var3_3;
                        } else {
                            var13_13 = false;
                            var4_4 = null;
                        }
                    }
                    if (var4_4 == null) continue;
                    var3_3 = var4_4.iterator();
                    while (var13_13 = var3_3.hasNext()) {
                        var4_4 = (f)var3_3.next();
                        var11_11 = var1_1.iJioAdView;
                        if (var11_11 == null || (var11_11 = var1_1.companionTrackerReceiver) == null) continue;
                        var4_4 = var4_4.d;
                        var10_10 /* !! */  = var2_2.getDisplaySize();
                        kotlin.collections.a.b(var10_10 /* !! */ );
                        var11_11.c((List)var4_4);
                    }
                }
            } else if (var5_5 != null && (var0 = (List)var5_5.a) != null && (var0 = (JioAdView$JioAdCompanion)CollectionsKt.firstOrNull((List)var0)) != null && (var1_1 = var1_1.jioCompanionListener) != null) {
                var2_2 = "Companion not found";
                var1_1.onCompanionError((JioAdView$JioAdCompanion)var0, (String)var2_2);
            }
        }
    }

    public static /* synthetic */ void b(Context context, CompanionManager companionManager, f f5, String string2, ViewGroup viewGroup, Pair pair) {
        CompanionManager.attachCompanionAd$lambda$20(context, companionManager, f5, string2, viewGroup, pair);
    }

    public static /* synthetic */ void c(d d2) {
        CompanionManager.doCloseCompanion$lambda$15$lambda$14(d2);
    }

    private final void closeCompanionAd(String string2, String string3, p_0 object) {
        Object object2;
        Object object3;
        boolean bl2;
        object = this.getJioAdCache(string2, string3);
        Intrinsics.checkNotNull(object);
        long l2 = ((f)object).b;
        int n3 = (int)l2;
        this.onCloseCalled = bl2 = true;
        if (n3 > 0) {
            object3 = new StringBuilder("companion will close after ");
            object3.append(n3);
            object3.append(" sec");
            object3 = object3.toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
        object2 = Looper.getMainLooper();
        object3 = new Handler(object2);
        object2 = new c(this, string3, string2);
        long l3 = n3 * 1000;
        object3.postDelayed((Runnable)object2, l3);
    }

    private static final void closeCompanionAd$lambda$21(CompanionManager object, String string2, String object2, p_0 p_02) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$adSlotId");
        Intrinsics.checkNotNullParameter(object2, "$masterAdViewId");
        Object object3 = (ViewGroup)((CompanionManager)object).currentViewGroups.get(string2);
        if (object3 != null) {
            object3 = "firing onCompanionClosed for masterAdId: ";
            l_0.h((String)object3, object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            if (p_02 != null) {
                p_02.a();
            }
            object = ((CompanionManager)object).currentViewGroups;
            object.remove(string2);
        }
    }

    private static final void doCloseCompanion$lambda$15$lambda$14(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$block");
        function0.invoke();
    }

    private final WebView getCompanionWebView(f object, Context context, String object2) {
        WebView webView = new WebView(context);
        int n3 = -2;
        Object object3 = new RelativeLayout.LayoutParams(n3, n3);
        n3 = 13;
        int n4 = -1;
        object3.addRule(n3, n4);
        webView.setLayoutParams((ViewGroup.LayoutParams)object3);
        e e2 = new e(this, (f)object, (String)object2);
        object2 = this.iJioAdView;
        object3 = new x(context, webView, e2, (com.jio.jioads.common.b)object2);
        object = ((f)object).c;
        if (object == null) {
            object = "";
        }
        ((x)object3).c((String)object);
        return webView;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final f getJioAdCache(String object, String string2) {
        Cloneable cloneable = this.jioCompanionCacheMap;
        Intrinsics.checkNotNull(cloneable);
        boolean bl2 = ((HashMap)cloneable).containsKey(object);
        if (!bl2) return null;
        cloneable = this.jioCompanionCacheMap;
        Intrinsics.checkNotNull(cloneable);
        cloneable = ((HashMap)cloneable).get(object);
        if (cloneable == null) return null;
        cloneable = this.jioCompanionCacheMap;
        Intrinsics.checkNotNull(cloneable);
        cloneable = ((HashMap)cloneable).get(object);
        Intrinsics.checkNotNull(cloneable);
        cloneable = (ArrayList)((HashMap)cloneable).get(string2);
        if (cloneable == null) return null;
        bl2 = cloneable.isEmpty();
        boolean bl3 = true;
        if ((bl2 ^= bl3) != bl3) return null;
        cloneable = this.jioCompanionCacheMap;
        Intrinsics.checkNotNull(cloneable);
        object = ((HashMap)cloneable).get(object);
        Intrinsics.checkNotNull(object);
        object = (ArrayList)((HashMap)object).get(string2);
        if (object == null) return null;
        string2 = null;
        return (f)((ArrayList)object).get(0);
    }

    public final void attachCompanionAd(Context context, ViewGroup viewGroup, String object, String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(object, "masterAdspotId");
        Intrinsics.checkNotNullParameter(string2, "adslotOrSize");
        this.currentViewGroups.put(string2, viewGroup);
        Object object2 = null;
        this.onCloseCalled = false;
        f f5 = this.getJioAdCache((String)object, string2);
        Pair pair = this.jioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
        if (f5 != null && (n3 = ((Utility)(object = Utility.INSTANCE)).isWebViewEnabled()) != 0) {
            a a2;
            Object object3;
            long l2 = f5.a;
            n3 = (int)l2;
            if (n3 > 0) {
                object2 = new StringBuilder("companion will show after ");
                object2.append(n3);
                object2.append(" sec");
                object2 = object2.toString();
                object3 = "message";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
            }
            object3 = Looper.getMainLooper();
            object2 = new Handler(object3);
            object3 = a2;
            a2 = new a(context, this, f5, string2, viewGroup, pair);
            long l3 = n3 *= 1000;
            object2.postDelayed(a2, l3);
        }
    }

    public final void doCloseCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        block18: {
            boolean bl2;
            boolean bl3;
            String string3;
            Object object;
            block17: {
                Object object2;
                Intrinsics.checkNotNullParameter(string2, "masterAdID");
                object = new StringBuilder("doCloseCompanion: masterAdId: ");
                ((StringBuilder)object).append(string2);
                object = ((StringBuilder)object).toString();
                string3 = "message";
                Intrinsics.checkNotNullParameter(object, string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.companionMap;
                bl3 = true;
                if (object != null) break block17;
                object = this.jioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
                if (object == null) break block18;
                Object object3 = object2 = ((Pair)object).a;
                object3 = (Collection)object2;
                int n3 = object3.isEmpty();
                if (bl3 ^= n3) {
                    int n4;
                    object2 = (Iterable)object2;
                    Iterator iterator = object2.iterator();
                    while ((n4 = iterator.hasNext()) != 0) {
                        long l2;
                        boolean bl4;
                        int n7;
                        Object object4;
                        object2 = (JioAdView$JioAdCompanion)iterator.next();
                        object3 = (Map)((Pair)object).b;
                        if (object3 != null) {
                            object4 = ((JioAdView$JioAdCompanion)object2).getAdSlotId();
                            object4 = (ArrayList)object3.get(object4);
                        } else {
                            n7 = 0;
                            object4 = null;
                        }
                        if (object4 == null || (bl4 = object4.isEmpty())) {
                            if (object3 != null) {
                                object4 = ((JioAdView$JioAdCompanion)object2).getDisplaySize().getDynamicSize();
                                object4 = object3 = object3.get(object4);
                                object4 = (ArrayList)object3;
                            } else {
                                n7 = 0;
                                object4 = null;
                            }
                        }
                        if (object4 != null && (object3 = (f)CollectionsKt.firstOrNull((List)object4)) != null) {
                            l2 = ((f)object3).b;
                            n7 = (int)l2;
                            object3 = n7;
                        } else {
                            n3 = 0;
                            object3 = null;
                        }
                        object4 = new d((JioAdView$JioAdCompanion)object2, this, string2);
                        n4 = object3 != null ? (Integer)object3 : -1;
                        if (n4 > 0) {
                            object2 = new StringBuilder("companion will close after ");
                            ((StringBuilder)object2).append(object3);
                            ((StringBuilder)object2).append(" sec");
                            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string3);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = JioAds$LogLevel.NONE;
                            Object object5 = Looper.getMainLooper();
                            object2 = new Handler(object5);
                            object5 = new b((d)object4);
                            Intrinsics.checkNotNull(object3);
                            n3 = (Integer)object3 * 1000;
                            l2 = n3;
                            object2.postDelayed((Runnable)object5, l2);
                            continue;
                        }
                        ((d)object4).invoke();
                    }
                }
                break block18;
            }
            object = this.jioCompanionCacheMap;
            boolean bl5 = false;
            string3 = null;
            if (object != null && !(bl2 = object.isEmpty())) {
                bl2 = false;
                object = null;
            } else {
                bl2 = true;
            }
            if (!bl2) {
                HashMap hashMap;
                object = this.companionMap;
                if (object != null && !(bl2 = object.isEmpty())) {
                    bl3 = false;
                    hashMap = null;
                }
                if (!bl3) {
                    object = this.jioCompanionCacheMap;
                    Intrinsics.checkNotNull(object);
                    object = (HashMap)((HashMap)object).get(string2);
                    if (object != null && (object = ((HashMap)object).keySet()) != null) {
                        object = object.iterator();
                        while (bl5 = object.hasNext()) {
                            string3 = (String)object.next();
                            hashMap = this.companionMap;
                            Intrinsics.checkNotNull(hashMap);
                            hashMap = hashMap.get(string3);
                            com.jio.jioads.jioreel.tracker.model.b.f(hashMap);
                            Intrinsics.checkNotNull(string3);
                            this.closeCompanionAd(string2, string3, null);
                        }
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void doShowCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String var1_1, String var2_2) {
        block20: {
            var3_3 = this;
            var4_4 /* !! */  = var1_1;
            var5_5 = "JioCache adview length: ";
            Intrinsics.checkNotNullParameter(var2_2, "ccb");
            var6_8 = new StringBuilder("doshowcompanion: masterAdId: ");
            var6_8.append(var1_1);
            var6_8 = var6_8.toString();
            var7_9 = "message";
            Intrinsics.checkNotNullParameter(var6_8, var7_9);
            var6_8 = JioAds.Companion;
            var6_8.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var8_10 = JioAds$LogLevel.NONE;
            try {
                var8_10 = this.jioCompanionCacheMap;
                if (var8_10 != null && ((var8_10 = this.companionMap) == null || (var9_11 = var8_10.isEmpty()))) {
                }
                ** GOTO lbl151
            }
            catch (Exception var5_6) {
                break block20;
            }
            var8_10 = var3_3.jioCompanionCacheMap;
            Intrinsics.checkNotNull(var8_10);
            var8_10 = var8_10.get(var4_4 /* !! */ );
            if (var8_10 == null) return;
            var8_10 = var3_3.jioCompanionCacheMap;
            Intrinsics.checkNotNull(var8_10);
            var8_10 = var8_10.get(var4_4 /* !! */ );
            var8_10 = (HashMap)var8_10;
            if (var8_10 == null) return;
            var8_10 = Utility.INSTANCE;
            var9_11 = var8_10.isWebViewEnabled();
            if (var9_11 == false) return;
            var8_10 = "cache map available for master id";
            Intrinsics.checkNotNullParameter(var8_10, var7_9);
            var8_10 = var6_8.getInstance();
            var8_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var8_10 = this.jioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var1_1);
            if (var8_10 == null) return;
            var10_12 = var8_10.a;
            var11_13 = var8_10.b;
            var8_10 = var10_12;
            var8_10 = (Collection)var10_12;
            var9_11 = var8_10.isEmpty() ^ true;
            if (var9_11 == false) return;
            {
                var8_10 = new StringBuilder((String)var5_5);
                var5_5 = var10_12;
                var5_5 = (List)var10_12;
                var12_14 = var5_5.size();
                var8_10.append(var12_14);
                var5_5 = ", companion obj available: ";
                var8_10.append((String)var5_5);
                var5_5 = var11_13;
                var5_5 = (Map)var11_13;
                if (var5_5 != null) {
                    var12_14 = var5_5.size();
                    var5_5 = var12_14;
                } else {
                    var12_14 = 0;
                    var5_5 = null;
                }
                var8_10.append(var5_5);
                var5_5 = var8_10.toString();
                Intrinsics.checkNotNullParameter(var5_5, var7_9);
                var5_5 = var6_8.getInstance();
                var5_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var10_12 = (Iterable)var10_12;
                var5_5 = var10_12.iterator();
                block4: while ((var13_16 = var5_5.hasNext()) != false) {
                    var6_8 = var5_5.next();
                    var6_8 = (JioAdView$JioAdCompanion)var6_8;
                    var8_10 = var11_13;
                    var8_10 = (Map)var11_13;
                    if (var8_10 != null && !(var9_11 = var8_10.isEmpty())) {
                        var8_10 = "jio cache available for masterid";
                        Intrinsics.checkNotNullParameter(var8_10, var7_9);
                        var14_18 = JioAds.Companion;
                        var8_10 = var14_18.getInstance();
                        var8_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var8_10 = JioAds$LogLevel.NONE;
                        var8_10 = var11_13;
                        var8_10 = (Map)var11_13;
                        if (var8_10 != null) {
                            var10_12 = var6_8.getAdSlotId();
                            var8_10 = var8_10.get(var10_12);
                            var8_10 = (ArrayList)var8_10;
                        } else {
                            var9_11 = false;
                            var8_10 = null;
                        }
                        if (var8_10 != null && !(var15_19 = var8_10.isEmpty())) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var16_20 = var8_10;
                                break;
                            }
                        } else {
                            var8_10 = var11_13;
                            var8_10 = (Map)var11_13;
                            if (var8_10 != null) {
                                var10_12 = var6_8.getDisplaySize();
                                var10_12 = var10_12.getDynamicSize();
                                var8_10 = var8_10.get(var10_12);
                                var8_10 = (ArrayList)var8_10;
                                ** continue;
                            }
                            var16_20 = null;
                        }
                        var10_12 = var3_3.primaryAdView;
                        var17_21 = var3_3.iJioAdView;
                        var18_22 /* !! */  = var3_3.jioCompanionListener;
                        var19_23 = var3_3.companionTrackerReceiver;
                        var8_10 = var6_8;
                        var6_8.loadSyncHtmlCompanionAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdView)var10_12, (com.jio.jioads.common.b)var17_21, var18_22 /* !! */ , (ArrayList)var16_20, var2_2, var19_23);
                        var8_10 = "firing onCompanionRender from Companion Manager";
                        Intrinsics.checkNotNullParameter(var8_10, var7_9);
                        var8_10 = var14_18.getInstance();
                        var8_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var16_20 == null) continue;
                        var8_10 = var16_20.iterator();
                        while (true) {
                            if (!(var15_19 = var8_10.hasNext())) continue block4;
                            var10_12 = var8_10.next();
                            var10_12 = (f)var10_12;
                            var17_21 = var6_8.getContainer();
                            var17_21.getContext();
                            var10_12.getClass();
                            var17_21 = var3_3.iJioAdView;
                            if (var17_21 == null || (var17_21 = var3_3.companionTrackerReceiver) == null) continue;
                            var10_12 = var10_12.d;
                            var18_22 /* !! */  = var6_8.getDisplaySize();
                            kotlin.collections.a.b(var18_22 /* !! */ );
                            var17_21.c((List)var10_12);
                        }
                    }
                    var8_10 = var3_3.jioCompanionListener;
                    if (var8_10 != null) {
                        var10_12 = "Companion not found";
                        var8_10.onCompanionError((JioAdView$JioAdCompanion)var6_8, (String)var10_12);
                    }
                    var6_8 = "jioAdCacheList null";
                    Intrinsics.checkNotNullParameter(var6_8, var7_9);
                    var6_8 = JioAds.Companion;
                    var6_8 = var6_8.getInstance();
                    var6_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var6_8 = JioAds$LogLevel.NONE;
                }
                return;
lbl151:
                // 1 sources

                var5_5 = var3_3.jioCompanionCacheMap;
                if (var5_5 == null) return;
                var12_15 = var5_5.isEmpty();
                if (var12_15) {
                    return;
                }
                var5_5 = var3_3.companionMap;
                if (var5_5 == null) return;
                var12_15 = var5_5.isEmpty();
                if (var12_15) {
                    return;
                }
                var5_5 = var3_3.jioCompanionCacheMap;
                Intrinsics.checkNotNull(var5_5);
                var5_5 = var5_5.get(var4_4 /* !! */ );
                var5_5 = (HashMap)var5_5;
                if (var5_5 == null) return;
                if ((var5_5 = var5_5.keySet()) == null) return;
                var5_5 = var5_5.iterator();
                while ((var13_17 = var5_5.hasNext()) != false) {
                    var6_8 = var5_5.next();
                    var6_8 = (String)var6_8;
                    var8_10 = var3_3.companionMap;
                    Intrinsics.checkNotNull(var8_10);
                    var6_8 = var8_10.get(var6_8);
                    com.jio.jioads.jioreel.tracker.model.b.f(var6_8);
                }
                return;
            }
        }
        var8_10 = ": ";
        var4_4 /* !! */  = Gn.a("exception with master ad id", var4_4 /* !! */ , (String)var8_10);
        var6_8 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var6_8, var5_6, (StringBuilder)var4_4 /* !! */ );
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var5_7 = JioAds$LogLevel.NONE;
    }

    public final f getAdCacheForHybridAdslot$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String object) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "adslotId");
        HashMap hashMap = this.hybridAdslotCacheMap;
        if (hashMap != null && (bl3 = hashMap.containsKey(object)) == (bl2 = true)) {
            hashMap = this.hybridAdslotCacheMap;
            Intrinsics.checkNotNull(hashMap);
            object = (f)hashMap.get(object);
        } else {
            object = null;
        }
        return object;
    }

    public final Pair jioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String object) {
        Object object2 = this.jioCompanionCacheMap;
        Object object3 = "message";
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            object2 = (HashMap)object2.get(object);
            if (object2 != null) {
                CharSequence charSequence;
                Object object4;
                boolean bl2;
                Object object5;
                Object object6;
                boolean bl3;
                int n3;
                Object object7;
                Object object8;
                int n4;
                object = this.companionAdviews;
                Object object9 = new ArrayList();
                object = object.iterator();
                while ((n4 = object.hasNext()) != 0) {
                    object7 = object8 = object.next();
                    object7 = ((JioAdView$JioAdCompanion)object8).getAdSlotId();
                    n3 = kotlin.text.b.k(object7) ^ 1;
                    if (n3 == 0) continue;
                    ((ArrayList)object9).add(object8);
                }
                n4 = 10;
                n3 = yx_2.o(object9, n4);
                object = new ArrayList(n3);
                object9 = ((ArrayList)object9).iterator();
                while ((n3 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
                    object7 = ((JioAdView$JioAdCompanion)object9.next()).getAdSlotId();
                    ((ArrayList)object).add(object7);
                }
                object9 = new StringBuilder("Publisher requested adslotids : ");
                n3 = 0;
                object7 = null;
                Object object10 = new String[]{};
                object10 = qp_1.c(((ArrayList)object).toArray((T[])object10));
                ((StringBuilder)object9).append((String)object10);
                Intrinsics.checkNotNullParameter(((StringBuilder)object9).toString(), (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object9 = JioAds$LogLevel.NONE;
                object9 = new LinkedHashMap();
                object10 = object2.entrySet().iterator();
                while (bl3 = object10.hasNext()) {
                    object6 = (String[])object10.next();
                    object5 = object6.getKey();
                    bl2 = ((ArrayList)object).contains(object5);
                    if (!bl2) continue;
                    object5 = object6.getKey();
                    object6 = object6.getValue();
                    object9.put(object5, object6);
                }
                object = new StringBuilder("adslots available in response: ");
                object10 = ((LinkedHashMap)object9).keySet();
                object6 = new String[]{};
                object10 = qp_1.c(object10.toArray((T[])object6));
                ((StringBuilder)object).append((String)object10);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.companionAdviews;
                object10 = new ArrayList();
                object = object.iterator();
                block3: while (bl3 = object.hasNext()) {
                    object6 = object.next();
                    object5 = object6;
                    object5 = (JioAdView$JioAdCompanion)object6;
                    object4 = ((LinkedHashMap)object9).keySet();
                    boolean bl4 = object4 instanceof Collection;
                    if (bl4 && (bl4 = ((Collection)object4).isEmpty())) continue;
                    object4 = ((Iterable)object4).iterator();
                    while (bl4 = object4.hasNext()) {
                        String string2;
                        charSequence = (String)object4.next();
                        bl4 = Intrinsics.areEqual(charSequence, string2 = ((JioAdView$JioAdCompanion)object5).getAdSlotId());
                        if (!bl4) continue;
                        ((ArrayList)object10).add(object6);
                        continue block3;
                    }
                }
                object = this.companionAdviews;
                n4 = yx_2.o((Iterable)object, n4);
                object6 = new ArrayList(n4);
                object = object.iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object8 = ((JioAdView$JioAdCompanion)object.next()).getDisplaySize().getDynamicSize();
                    object6.add(object8);
                }
                object = new StringBuilder("Publisher requested sizes : ");
                object8 = new String[]{};
                object8 = qp_1.c(object6.toArray((T[])object8));
                ((StringBuilder)object).append((String)object8);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = new LinkedHashMap();
                object2 = object2.entrySet().iterator();
                block6: while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    boolean bl5;
                    object8 = object2.next();
                    bl2 = object6.isEmpty();
                    if (bl2) continue;
                    object5 = object6.iterator();
                    while (bl5 = object5.hasNext()) {
                        object4 = (String)object5.next();
                        bl5 = StringsKt.F((CharSequence)object4, charSequence = (CharSequence)object8.getKey(), false);
                        if (!bl5) continue;
                        object5 = object8.getKey();
                        object8 = object8.getValue();
                        object.put(object5, object8);
                        continue block6;
                    }
                }
                object2 = new StringBuilder("sizes available in response: ");
                object8 = ((LinkedHashMap)object9).keySet();
                object7 = new String[]{};
                object8 = qp_1.c(object8.toArray((T[])object7));
                ((StringBuilder)object2).append((String)object8);
                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                boolean bl6 = object.isEmpty() ^ true;
                if (bl6) {
                    object2 = this.companionAdviews;
                    object3 = new ArrayList();
                    object2 = object2.iterator();
                    block8: while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        object7 = object8 = object2.next();
                        object7 = (JioAdView$JioAdCompanion)object8;
                        object6 = ((LinkedHashMap)object).keySet();
                        bl2 = object6 instanceof Collection;
                        if (bl2 && (bl2 = ((Collection)object6).isEmpty())) continue;
                        object6 = ((Iterable)object6).iterator();
                        while (bl2 = object6.hasNext()) {
                            object5 = (String)object6.next();
                            bl2 = Intrinsics.areEqual(object5, object4 = ((JioAdView$JioAdCompanion)object7).getDisplaySize().getDynamicSize());
                            if (!bl2) continue;
                            ((ArrayList)object3).add(object8);
                            continue block8;
                        }
                    }
                    object2 = new HashSet();
                    object8 = new ArrayList();
                    object3 = ((ArrayList)object3).iterator();
                    while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                        object7 = object3.next();
                        object6 = object7;
                        object6 = ((JioAdView$JioAdCompanion)object7).getDisplaySize().getDynamicSize();
                        bl3 = ((HashSet)object2).add(object6);
                        if (!bl3) continue;
                        ((ArrayList)object8).add((Object)object7);
                    }
                } else {
                    object8 = mz0_2.a;
                }
                object2 = CollectionsKt.m0((Collection)object10);
                object3 = new HashSet(object8);
                ((ArrayList)object2).removeAll((Collection<?>)object3);
                object3 = CollectionsKt.W(object8, (Collection)object10);
                object = fh1_2.k((Map)object9, (Map)object);
                object2 = new Pair(object3, object);
                return object2;
            }
            object2 = "no companion for master ad id: ";
            l_0.h((String)object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            Intrinsics.checkNotNullParameter("jiocompanioncache is null", (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        return null;
    }

    public final void registerCompanionView(String string2, p_0 p_02) {
        HashMap hashMap = this.companionMap;
        if (hashMap == null) {
            this.companionMap = hashMap = new HashMap();
        }
        if (string2 != null && p_02 != null) {
            hashMap = this.companionMap;
            Intrinsics.checkNotNull(hashMap);
            hashMap.put(string2, p_02);
        }
    }

    public final void release() {
        this.jioCompanionCacheMap = null;
        this.companionMap = null;
        this.primaryAdView = null;
        this.jioCompanionListener = null;
        this.iJioAdView = null;
        this.hybridAdslotCacheMap = null;
        this.activeAdViewList = null;
        this.companionTrackerReceiver = null;
        this.companionAdviews.clear();
        this.currentViewGroups.clear();
        Intrinsics.checkNotNullParameter("Releasing Companion Manager", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void removeCompanionCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String object) {
        Intrinsics.checkNotNullParameter(object, "adspotId");
        Object object2 = new StringBuilder("removing companion cache for ");
        ((StringBuilder)object2).append((String)object);
        object2 = ((StringBuilder)object2).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.jioCompanionCacheMap;
        if (object2 != null) {
            object2 = (HashMap)((HashMap)object2).remove(object);
        }
        if ((object2 = this.hybridAdslotCacheMap) != null) {
            object = (f)((HashMap)object2).remove(object);
        }
    }

    public final void setCompanionAdview$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdView$JioAdCompanion jioAdView$JioAdCompanion) {
        if (jioAdView$JioAdCompanion != null) {
            List list = this.companionAdviews;
            list.add(jioAdView$JioAdCompanion);
        }
    }

    public final void setCompanionTrackerReceiver$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(q_0 q_02) {
        this.companionTrackerReceiver = q_02;
    }

    public final void setJioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(f list, String object, String hashMap, String string2, String hashMap2) {
        Cloneable cloneable = "masterAdId";
        Intrinsics.checkNotNullParameter(hashMap, (String)((Object)cloneable));
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            boolean bl3 = TextUtils.isEmpty((CharSequence)((Object)hashMap2));
            if (!bl3) {
                object = hashMap2;
            } else {
                bl3 = false;
                object = null;
            }
        }
        if ((hashMap2 = this.jioCompanionCacheMap) == null) {
            hashMap2 = new HashMap();
            this.jioCompanionCacheMap = hashMap2;
        }
        if (list != null && object != null) {
            hashMap2 = this.jioCompanionCacheMap;
            Intrinsics.checkNotNull(hashMap2);
            hashMap2 = hashMap2.get(hashMap);
            if (hashMap2 != null) {
                boolean bl4;
                hashMap2 = this.jioCompanionCacheMap;
                Intrinsics.checkNotNull(hashMap2);
                hashMap2 = (HashMap)hashMap2.get(hashMap);
                if (hashMap2 != null && (bl2 = hashMap2.containsKey(object)) == (bl4 = true)) {
                    cloneable = (ArrayList<f>)hashMap2.get(object);
                    if (cloneable != null) {
                        ((ArrayList)cloneable).add(list);
                    }
                    String string3 = "null cannot be cast to non-null type java.util.ArrayList<com.jio.jioads.companionads.JioCompanionCache>{ kotlin.collections.TypeAliasesKt.ArrayList<com.jio.jioads.companionads.JioCompanionCache> }";
                    Intrinsics.checkNotNull(cloneable, string3);
                    hashMap2.put(object, cloneable);
                    cloneable = this.jioCompanionCacheMap;
                    Intrinsics.checkNotNull(cloneable);
                    cloneable.put(hashMap, hashMap2);
                } else {
                    cloneable = new ArrayList();
                    ((ArrayList)cloneable).add(list);
                    if (hashMap2 != null) {
                        cloneable = hashMap2.put(object, cloneable);
                    }
                    cloneable = this.jioCompanionCacheMap;
                    Intrinsics.checkNotNull(cloneable);
                    cloneable.put(hashMap, hashMap2);
                }
            } else {
                hashMap2 = new HashMap();
                cloneable = new ArrayList();
                ((ArrayList)cloneable).add(list);
                hashMap2.put(object, cloneable);
                cloneable = this.jioCompanionCacheMap;
                Intrinsics.checkNotNull(cloneable);
                cloneable.put(hashMap, hashMap2);
            }
            hashMap = this.hybridAdslotCacheMap;
            if (hashMap == null) {
                this.hybridAdslotCacheMap = hashMap = new HashMap<Object, f>();
            }
            hashMap = this.hybridAdslotCacheMap;
            Intrinsics.checkNotNull(hashMap);
            hashMap.put(object, (f)((Object)list));
            list = this.activeAdViewList;
            if (list == null) {
                this.activeAdViewList = list = new List<String>();
            }
            if (string2 != null && (list = this.activeAdViewList) != null) {
                list.add(string2);
            }
        }
    }

    public final void setParams(JioCompanionListener jioCompanionListener, com.jio.jioads.common.b b2) {
        Intrinsics.checkNotNullParameter(jioCompanionListener, "jioCompanionListener");
        this.jioCompanionListener = jioCompanionListener;
        this.iJioAdView = b2;
    }

    public final void setPrimaryAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdView jioAdView) {
        this.primaryAdView = jioAdView;
    }
}

