/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.webkit.URLUtil
 */
package com.jio.jioads.jioreel.ssai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsIntent;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.jioreel.ssai.a;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public final String e;
    public final a f;
    public final String g;
    public final int h;

    public b(Context object, String string2, String string3, String string4, String string5, a a2, String string6, int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        Intrinsics.checkNotNullParameter(object, "mContext");
        Intrinsics.checkNotNullParameter(a2, "mClickListener");
        String string7 = "adId";
        Intrinsics.checkNotNullParameter(string6, string7);
        this.a = object;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = a2;
        this.g = string6;
        this.h = n3;
        int n14 = 0;
        object = null;
        int n15 = 32;
        string4 = null;
        int n16 = 1;
        if (string2 != null) {
            n10 = string2.length() - n16;
            n8 = 0;
            string6 = null;
            n3 = 0;
            while (n8 <= n10) {
                n7 = n3 == 0 ? n8 : n10;
                if ((n7 = Intrinsics.compare(string2.charAt(n7), n15)) <= 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    string7 = null;
                }
                if (n3 == 0) {
                    if (n7 == 0) {
                        n3 = 1;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n7 == 0) break;
                n10 += -1;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n10, n16, n8, string2);
        } else {
            n4 = 0;
            string2 = null;
        }
        this.b = string2;
        string2 = this.c;
        if (string2 != null) {
            n10 = string2.length() - n16;
            n8 = 0;
            string6 = null;
            n3 = 0;
            while (n8 <= n10) {
                n7 = n3 == 0 ? n8 : n10;
                if ((n7 = Intrinsics.compare(string2.charAt(n7), n15)) <= 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    string7 = null;
                }
                if (n3 == 0) {
                    if (n7 == 0) {
                        n3 = 1;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n7 == 0) break;
                n10 += -1;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n10, n16, n8, string2);
        } else {
            n4 = 0;
            string2 = null;
        }
        this.c = string2;
        string2 = this.d;
        if (string2 != null) {
            n10 = string2.length() - n16;
            n8 = 0;
            string6 = null;
            n3 = 0;
            while (n8 <= n10) {
                n7 = n3 == 0 ? n8 : n10;
                if ((n7 = Intrinsics.compare(string2.charAt(n7), n15)) <= 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    string7 = null;
                }
                if (n3 == 0) {
                    if (n7 == 0) {
                        n3 = 1;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n7 == 0) break;
                n10 += -1;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n10, n16, n8, string2);
        } else {
            n4 = 0;
            string2 = null;
        }
        this.d = string2;
        string2 = this.e;
        if (string2 != null) {
            n14 = string2.length() - n16;
            n10 = 0;
            a2 = null;
            n8 = 0;
            string6 = null;
            while (n10 <= n14) {
                n3 = n8 == 0 ? n10 : n14;
                n3 = Intrinsics.compare(string2.charAt(n3), n15);
                n3 = n3 <= 0 ? 1 : 0;
                if (n8 == 0) {
                    if (n3 == 0) {
                        n8 = 1;
                        continue;
                    }
                    ++n10;
                    continue;
                }
                if (n3 == 0) break;
                n14 += -1;
            }
            object = com.jio.jioads.adinterfaces.a.a(n14, n16, n10, string2);
        }
        this.e = object;
        super("brandUrl = ");
        string2 = this.b;
        ((StringBuilder)object).append(string2);
        j.a(((StringBuilder)object).toString());
        object = new StringBuilder("clickThroughUrl = ");
        string2 = this.c;
        ((StringBuilder)object).append(string2);
        j.a(((StringBuilder)object).toString());
        object = new StringBuilder("fallbackUrl = ");
        string2 = this.d;
        ((StringBuilder)object).append(string2);
        j.a(((StringBuilder)object).toString());
        object = new StringBuilder("isInApp = ");
        n4 = this.h;
        ((StringBuilder)object).append(n4);
        j.a(((StringBuilder)object).toString());
    }

    /*
     * Exception decompiling
     */
    public final void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [17 : 266->271)] java.lang.Exception
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

    public final void b(String object) {
        object = Intent.parseUri((String)object, (int)1);
        int n3 = 0x10000000;
        object.setFlags(n3);
        Utility utility = Utility.INSTANCE;
        Intrinsics.checkNotNull(object);
        Context context = this.a;
        int n4 = utility.canHandleIntent(context, (Intent)object);
        Object object2 = new StringBuilder(": Deeplink ifdeviceCanHandleIntent=");
        ((StringBuilder)object2).append(n4 != 0);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (n4 != 0) {
            context.startActivity((Intent)object);
            object = this.f;
            object.a();
        } else {
            object = object.getStringExtra("browser_fallback_url");
            l_0.h(": checking if Deeplink fallbackUrl available: ", (String)object);
            JioAds jioAds = ((JioAds$Companion)object2).getInstance();
            jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object != null && (n4 = ((String)object).length()) != 0 && (n3 = (int)(utility.isIntentActivityPresent(context, (String)object) ? 1 : 0)) != 0) {
                this.c((String)object);
            } else {
                object = null;
                this.c = null;
                this.a();
            }
        }
    }

    public final void c(String string2) {
        Object object = Utility.INSTANCE;
        Context context = this.a;
        int n3 = this.h;
        Object object2 = ((Utility)object).isCustomChromeTabAvailable(context, string2, n3);
        boolean bl2 = ((Utility)object).isChromecustomTabDependancyAvailable();
        int n4 = 1;
        if (bl2 && (bl2 = object2 instanceof CustomTabsIntent) && ((bl2 = URLUtil.isHttpsUrl((String)string2)) || (bl2 = URLUtil.isHttpUrl((String)string2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Object object3 = new StringBuilder(": isChrometab available: ");
        ((StringBuilder)object3).append(bl2);
        String string3 = ". context= ";
        ((StringBuilder)object3).append(string3);
        boolean bl3 = context instanceof Activity;
        ((StringBuilder)object3).append(bl3);
        object3 = ((StringBuilder)object3).toString();
        String string4 = "message";
        Intrinsics.checkNotNullParameter(object3, string4);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = this.f;
        if (bl2 && n3 == n4 && bl3) {
            object = "Opening in Custom tab";
            v12.a((String)object, string4, (JioAds$Companion)object3);
            object2 = (CustomTabsIntent)object2;
            if (object2 != null) {
                string2 = Uri.parse((String)string2);
                ((CustomTabsIntent)object2).launchUrl(context, (Uri)string2);
            }
            object4.a();
            return;
        }
        l_0.h("opening click url in available app for: ", string2);
        object = ((JioAds$Companion)object3).getInstance();
        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        bl2 = object2 instanceof Intent;
        if (bl2) {
            object2 = (Intent)object2;
        } else {
            object = "android.intent.action.VIEW";
            object2 = new Intent((String)object);
        }
        string2 = Uri.parse((String)string2);
        object2.setData((Uri)string2);
        object2.setFlags(0x10000000);
        context.startActivity((Intent)object2);
        object4.a();
    }
}

