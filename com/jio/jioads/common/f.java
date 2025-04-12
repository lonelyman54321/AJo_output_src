/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 */
package com.jio.jioads.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsIntent;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.a;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.e;
import com.jio.jioads.controller.o;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.util.k;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public final b a;
    public final c b;
    public String c;
    public String d;
    public String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final e l;
    public final int m;

    public f(b object, c object2, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, e e2, int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        Intrinsics.checkNotNullParameter(object, "iJioAdView");
        String string10 = "mClickListener";
        Intrinsics.checkNotNullParameter(e2, string10);
        this.a = object;
        this.b = object2;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        int n14 = 0;
        object = null;
        this.f = null;
        this.g = string5;
        this.h = string6;
        this.i = string7;
        this.j = string8;
        this.k = string9;
        this.l = e2;
        this.m = n3;
        int n15 = 1;
        string3 = null;
        int n16 = 32;
        if (string2 != null) {
            n10 = string2.length() - n15;
            n8 = 0;
            string6 = null;
            n7 = 0;
            string7 = null;
            while (n8 <= n10) {
                n4 = n7 == 0 ? n8 : n10;
                if ((n4 = Intrinsics.compare(string2.charAt(n4), n16)) <= 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    string8 = null;
                }
                if (n7 == 0) {
                    if (n4 == 0) {
                        n7 = 1;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n4 == 0) break;
                n10 += -1;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n10, n15, n8, string2);
        } else {
            string2 = null;
        }
        this.c = string2;
        string2 = this.d;
        if (string2 != null) {
            n10 = string2.length() - n15;
            n8 = 0;
            string6 = null;
            n7 = 0;
            string7 = null;
            while (n8 <= n10) {
                n4 = n7 == 0 ? n8 : n10;
                if ((n4 = Intrinsics.compare(string2.charAt(n4), n16)) <= 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    string8 = null;
                }
                if (n7 == 0) {
                    if (n4 == 0) {
                        n7 = 1;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n4 == 0) break;
                n10 += -1;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n10, n15, n8, string2);
        } else {
            string2 = null;
        }
        this.d = string2;
        string2 = this.e;
        if (string2 != null) {
            n10 = string2.length() - n15;
            n8 = 0;
            string6 = null;
            n7 = 0;
            string7 = null;
            while (n8 <= n10) {
                n4 = n7 == 0 ? n8 : n10;
                if ((n4 = Intrinsics.compare(string2.charAt(n4), n16)) <= 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    string8 = null;
                }
                if (n7 == 0) {
                    if (n4 == 0) {
                        n7 = 1;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n4 == 0) break;
                n10 += -1;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n10, n15, n8, string2);
        } else {
            string2 = null;
        }
        this.e = string2;
        string2 = this.f;
        if (string2 != null) {
            n14 = string2.length() - n15;
            n10 = 0;
            string5 = null;
            n8 = 0;
            string6 = null;
            while (n10 <= n14) {
                n7 = n8 == 0 ? n10 : n14;
                if ((n7 = Intrinsics.compare(string2.charAt(n7), n16)) <= 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    string7 = null;
                }
                if (n8 == 0) {
                    if (n7 == 0) {
                        n8 = 1;
                        continue;
                    }
                    ++n10;
                    continue;
                }
                if (n7 == 0) break;
                n14 += -1;
            }
            object = com.jio.jioads.adinterfaces.a.a(n14, n15, n10, string2);
        }
        this.f = object;
        object2 = new StringBuilder("brandUrl = ");
        string2 = this.c;
        ((StringBuilder)object2).append(string2);
        com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
        object2 = new StringBuilder("clickThroughUrl = ");
        string2 = this.d;
        ((StringBuilder)object2).append(string2);
        com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
        object2 = new StringBuilder("fallbackUrl = ");
        string2 = this.e;
        ((StringBuilder)object2).append(string2);
        com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
        object2 = new StringBuilder("fallbackUrl2 = ");
        ((StringBuilder)object2).append((String)object);
        com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
    }

    /*
     * Exception decompiling
     */
    public final void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 41[TRYBLOCK] [51 : 830->835)] java.lang.Exception
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
     */
    public final void b(String object) {
        boolean bl2;
        object = Intent.parseUri((String)object, (int)1);
        int n3 = 0x10000000;
        object.setFlags(n3);
        Object object2 = this.a;
        JioAdView$AdState jioAdView$AdState = object2.k0();
        Object object3 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == object3) {
            return;
        }
        jioAdView$AdState = object2.Y();
        if (jioAdView$AdState != null) {
            object3 = Utility.INSTANCE;
            Intrinsics.checkNotNull(object);
            bl2 = ((Utility)object3).canHandleIntent((Context)jioAdView$AdState, (Intent)object);
        } else {
            bl2 = false;
            object3 = null;
        }
        Object object4 = new StringBuilder();
        String string2 = object2.P();
        ((StringBuilder)object4).append(string2);
        ((StringBuilder)object4).append(": Deeplink ifdeviceCanHandleIntent=");
        ((StringBuilder)object4).append(bl2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        if (bl2) {
            if (jioAdView$AdState != null) {
                jioAdView$AdState.startActivity((Intent)object);
            }
            object = this.l;
            object.a();
            return;
        }
        object = object.getStringExtra("browser_fallback_url");
        object3 = new StringBuilder();
        String string3 = ": checking if Deeplink fallbackUrl available: ";
        l_0.d((b)object2, (StringBuilder)object3, string3, (String)object);
        object2 = ((JioAds$Companion)object4).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (jioAdView$AdState != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) == 0) {
            object2 = Utility.INSTANCE;
            Intrinsics.checkNotNull(object);
            n3 = (int)(((Utility)object2).isIntentActivityPresent((Context)jioAdView$AdState, (String)object) ? 1 : 0);
            if (n3 != 0) {
                this.c((String)object);
                return;
            }
        }
        object = null;
        this.d = null;
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(String string2) {
        Object object;
        Object object2 = this.a;
        JioAdView$AdState jioAdView$AdState = object2.k0();
        if (jioAdView$AdState == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        jioAdView$AdState = object2.Y();
        int n3 = this.m;
        Object object3 = jioAdView$AdState != null ? Utility.INSTANCE.isCustomChromeTabAvailable((Context)jioAdView$AdState, string2, n3) : null;
        Utility utility = Utility.INSTANCE;
        boolean bl2 = utility.isChromecustomTabDependancyAvailable();
        int n4 = 1;
        if (bl2 && (bl2 = object3 instanceof CustomTabsIntent) && ((bl2 = URLUtil.isHttpsUrl((String)string2)) || (bl2 = URLUtil.isHttpUrl((String)string2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            Object var7_8 = null;
        }
        Object object4 = new StringBuilder();
        String string3 = object2.P();
        ((StringBuilder)object4).append(string3);
        ((StringBuilder)object4).append(": isChrometab available: ");
        ((StringBuilder)object4).append(bl2);
        object4 = ((StringBuilder)object4).toString();
        string3 = "message";
        Intrinsics.checkNotNullParameter(object4, string3);
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        int n7 = 0x10000000;
        String string4 = "android.intent.action.VIEW";
        String string5 = ": opening click url in available app for: ";
        e e2 = this.l;
        if (bl2 && n3 == n4 && (n3 = jioAdView$AdState instanceof Activity) != 0) {
            try {
                object = new StringBuilder();
                String string6 = object2.P();
                ((StringBuilder)object).append(string6);
                String string7 = ": Opening in Custom tab";
                ((StringBuilder)object).append(string7);
                object = ((StringBuilder)object).toString();
                Intrinsics.checkNotNullParameter(object, string3);
                object = ((JioAds$Companion)object4).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = object3;
                object = (CustomTabsIntent)object3;
                if (object != null) {
                    Uri uri = Uri.parse((String)string2);
                    ((CustomTabsIntent)object).launchUrl((Context)jioAdView$AdState, uri);
                }
                e2.a();
                return;
            }
            catch (Exception exception) {
                com.jio.jioads.audioplayer.b.a((b)object2, ": Exception while opening custom tab");
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                StringBuilder stringBuilder = new StringBuilder();
                l_0.d((b)object2, stringBuilder, string5, string2);
                object2 = ((JioAds$Companion)object).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                boolean bl3 = object3 instanceof Intent;
                object3 = bl3 ? (Intent)object3 : new Intent(string4);
                string2 = Uri.parse((String)string2);
                object3.setData((Uri)string2);
                object3.setFlags(n7);
                jioAdView$AdState = (Activity)jioAdView$AdState;
                jioAdView$AdState.startActivity((Intent)object3);
                e2.a();
                return;
            }
        }
        object = new StringBuilder();
        l_0.d((b)object2, (StringBuilder)object, string5, string2);
        object = ((JioAds$Companion)object4).getInstance();
        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        n3 = object3 instanceof Intent;
        object3 = n3 != 0 ? (Intent)object3 : new Intent(string4);
        object = new StringBuilder();
        object2 = object2.P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": intent from ClickHandler=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(" and data=");
        object2 = object3.getData();
        ((StringBuilder)object).append(object2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string3);
        object2 = ((JioAds$Companion)object4).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        string2 = Uri.parse((String)string2);
        object3.setData((Uri)string2);
        object3.setFlags(n7);
        if (jioAdView$AdState != null) {
            jioAdView$AdState.startActivity((Intent)object3);
        }
        e2.a();
    }

    public final String d(String object) {
        Object object2 = this.a;
        Object object3 = object2.k0();
        Object object4 = JioAdView$AdState.DESTROYED;
        String string2 = null;
        if (object3 == object4) {
            return null;
        }
        object3 = object2.Y();
        object4 = new Object();
        ((k)object4).p = object3;
        Object object5 = object2.P();
        ((k)object4).q = object5;
        ((k)object4).a = object;
        object = Utility.INSTANCE;
        object5 = object2.P();
        object5 = ((Utility)object).getCcbValue((String)object5);
        ((k)object4).b = object5;
        if (object3 != null) {
            Intrinsics.checkNotNullParameter(object3, "context");
            object5 = "common_prefs";
            String string3 = "advid";
            String string4 = "";
            object5 = j_0.d((Context)object3, (String)object5, 0, string4, string3);
            string3 = "null cannot be cast to non-null type kotlin.String";
            try {
                Intrinsics.checkNotNull(object5, string3);
                object5 = (String)object5;
            }
            catch (Exception exception) {
                object5 = null;
            }
            ((k)object4).r = object5;
            object3 = ((Utility)object).getUidFromPreferences((Context)object3);
            ((k)object4).s = object3;
        }
        if ((object3 = this.b) != null) {
            object3 = ((com.jio.jioads.controller.f)object3).a;
            string2 = o.o((o)object3, null, null, null);
        }
        ((k)object4).d = string2;
        object3 = Boolean.TRUE;
        ((k)object4).e = object3;
        object3 = 1;
        ((k)object4).l = object3;
        object3 = object2.q0();
        ((k)object4).w = object3;
        object3 = this.g;
        ((k)object4).v = object3;
        object3 = this.j;
        ((k)object4).j = object3;
        object3 = this.k;
        ((k)object4).k = object3;
        object3 = Boolean.FALSE;
        ((k)object4).n = object3;
        ((k)object4).o = object3;
        ((k)object4).m = object3;
        object3 = object2.R();
        ((k)object4).t = object3;
        object2.L();
        object3 = object2.W();
        ((k)object4).F = object3;
        object2 = object2.K();
        ((k)object4).u = object2;
        return ((Utility)object).replaceMacros((k)object4);
    }
}

