/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 *  android.view.View
 *  com.iab.omid.library.ril.adsession.AdEvents
 *  com.iab.omid.library.ril.adsession.AdSession
 *  com.iab.omid.library.ril.adsession.AdSessionConfiguration
 *  com.iab.omid.library.ril.adsession.AdSessionContext
 *  com.iab.omid.library.ril.adsession.CreativeType
 *  com.iab.omid.library.ril.adsession.ImpressionType
 *  com.iab.omid.library.ril.adsession.Owner
 *  com.iab.omid.library.ril.adsession.Partner
 *  com.iab.omid.library.ril.adsession.media.MediaEvents
 *  com.iab.omid.library.ril.adsession.media.Position
 *  com.iab.omid.library.ril.adsession.media.VastProperties
 */
package com.jio.jioads.iab;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.iab.omid.library.ril.adsession.AdEvents;
import com.iab.omid.library.ril.adsession.AdSession;
import com.iab.omid.library.ril.adsession.AdSessionConfiguration;
import com.iab.omid.library.ril.adsession.AdSessionContext;
import com.iab.omid.library.ril.adsession.CreativeType;
import com.iab.omid.library.ril.adsession.ImpressionType;
import com.iab.omid.library.ril.adsession.Owner;
import com.iab.omid.library.ril.adsession.Partner;
import com.iab.omid.library.ril.adsession.media.MediaEvents;
import com.iab.omid.library.ril.adsession.media.Position;
import com.iab.omid.library.ril.adsession.media.VastProperties;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.iab.c;
import com.jio.jioads.iab.h;
import com.jio.jioads.multiad.A;
import com.jio.jioads.util.Utility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class d
implements A {
    public final /* synthetic */ h a;
    public final /* synthetic */ JioAdView$AD_TYPE b;
    public final /* synthetic */ b c;
    public final /* synthetic */ Ref$ObjectRef d;

    public d(h h3, JioAdView$AD_TYPE jioAdView$AD_TYPE, b b2, Ref$ObjectRef ref$ObjectRef) {
        this.a = h3;
        this.b = jioAdView$AD_TYPE;
        this.c = b2;
        this.d = ref$ObjectRef;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(Ref$ObjectRef var0, h var1_1, JioAdView$AD_TYPE var2_2, b var3_3, Ref$ObjectRef var4_4) {
        block21: {
            block20: {
                Intrinsics.checkNotNullParameter(var0 /* !! */ , "$jsResponse");
                Intrinsics.checkNotNullParameter(var1_1, "this$0");
                Intrinsics.checkNotNullParameter((Object)var2_2 /* !! */ , "$mAdType");
                Intrinsics.checkNotNullParameter(var3_3, "$iJioAdView");
                Intrinsics.checkNotNullParameter(var4_4, "$vProps");
                var5_5 = (CharSequence)var0 /* !! */ .element;
                var6_6 = TextUtils.isEmpty((CharSequence)var5_5);
                if (var6_6 != 0 || (var6_6 = (var5_5 = var1_1.c).size()) <= 0) break block21;
                var5_5 = var1_1.d.getValue();
                var7_7 = "getValue(...)";
                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var7_7);
                var5_5 = (Partner)var5_5;
                if (var5_5 == null) break block21;
                var5_5 = var1_1.d.getValue();
                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var7_7);
                var5_5 = (Partner)var5_5;
                var0 /* !! */  = (String)var0 /* !! */ .element;
                var7_7 = var1_1.c;
                var8_8 = null;
                var0 /* !! */  = AdSessionContext.createNativeAdSessionContext((Partner)var5_5, (String)var0 /* !! */ , (List)var7_7, null, null);
                var5_5 = CreativeType.VIDEO;
                var7_7 = ImpressionType.BEGIN_TO_RENDER;
                var9_9 = Owner.NATIVE;
                var5_5 = AdSessionConfiguration.createAdSessionConfiguration((CreativeType)var5_5, (ImpressionType)var7_7, (Owner)var9_9, (Owner)var9_9, (boolean)false);
                var0 /* !! */  = AdSession.createAdSession((AdSessionConfiguration)var5_5, (AdSessionContext)var0 /* !! */ );
                var1_1.e = var0 /* !! */ ;
                try {
                    var0 /* !! */  = JioAdView$AD_TYPE.CONTENT_STREAM;
                    if (var2_2 /* !! */  != var0 /* !! */ ) {
                    }
                    ** GOTO lbl-1000
                }
                catch (Exception v0) {
                    break block20;
                }
                {
                    var0 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                }
                {
                    if (var2_2 /* !! */  != var0 /* !! */  && var2_2 /* !! */  != (var0 /* !! */  = JioAdView$AD_TYPE.CUSTOM_NATIVE)) break block20;
                }
lbl-1000:
                // 2 sources

                {
                    if ((var0 /* !! */  = var3_3.A()) == null) {
                        var0 /* !! */  = var1_1.b;
                        if (var0 /* !! */  != null) {
                            var0 /* !! */  = (f)var0 /* !! */ ;
                            var0 /* !! */  = var0 /* !! */ .a;
                            var0 /* !! */  = var0 /* !! */ .q;
                        } else {
                            var10_10 = 0;
                            var0 /* !! */  = null;
                            var11_11 = 0.0f;
                        }
                    }
                    if (var0 /* !! */  == null || (var5_5 = var1_1.e) == null) break block20;
                    var5_5.registerAdView((View)var0 /* !! */ );
                }
            }
            var0 /* !! */  = MediaEvents.createMediaEvents((AdSession)var1_1.e);
            var1_1.g = var0 /* !! */ ;
            var0 /* !! */  = AdEvents.createAdEvents((AdSession)var1_1.e);
            var1_1.f = var0 /* !! */ ;
            var0 /* !! */  = var1_1.e;
            if (var0 /* !! */  != null) {
                var0 /* !! */ .start();
            }
            if (var2_2 /* !! */  != (var0 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO)) ** GOTO lbl-1000
            if ((var3_3 = var3_3.b0()) != null) {
                var12_12 = var3_3.intValue();
            } else {
                var12_12 = 0;
                var3_3 = null;
            }
            if (var12_12 > 0) {
                var0 /* !! */  = Position.MIDROLL;
                var0 /* !! */  = VastProperties.createVastPropertiesForNonSkippableMedia((boolean)false, (Position)var0 /* !! */ );
            } else if (var2_2 /* !! */  != var0 /* !! */  && var2_2 /* !! */  != (var0 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL)) {
                var0 /* !! */  = Position.STANDALONE;
                var13_13 = true;
                var0 /* !! */  = VastProperties.createVastPropertiesForNonSkippableMedia((boolean)var13_13, (Position)var0 /* !! */ );
            } else {
                var10_10 = Utility.convertTimeToSec(var1_1.h);
                var11_11 = var10_10;
                var2_2 /* !! */  = Position.STANDALONE;
                var0 /* !! */  = VastProperties.createVastPropertiesForSkippableMedia((float)var11_11, (boolean)false, (Position)var2_2 /* !! */ );
            }
            var4_4.element = var0 /* !! */ ;
            try {
                var2_2 /* !! */  = var1_1.f;
                if (var2_2 /* !! */  != null) {
                    Intrinsics.checkNotNull(var0 /* !! */ );
                    var2_2 /* !! */ .loaded((VastProperties)var0 /* !! */ );
                }
            }
            catch (IllegalArgumentException v1) {}
            var2_2 /* !! */  = "Omid adSession: ";
            var0 /* !! */  = new StringBuilder((String)var2_2 /* !! */ );
            var1_1 = var1_1.e;
            if (var1_1 != null) {
                var8_8 = var1_1.getAdSessionId();
            }
            l_0.i(var8_8, (StringBuilder)var0 /* !! */ );
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var0 /* !! */  = JioAds$LogLevel.NONE;
        }
    }

    public final void a(String string2) {
        Object object = "jscript";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = string2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        h h3 = this.a;
        if (!bl2) {
            string2 = h3.a;
            boolean bl3 = string2 instanceof Activity;
            if (bl3) {
                string2 = (Activity)string2;
                JioAdView$AD_TYPE jioAdView$AD_TYPE = this.b;
                b b2 = this.c;
                Ref$ObjectRef ref$ObjectRef2 = this.d;
                object = new c(ref$ObjectRef, h3, jioAdView$AD_TYPE, b2, ref$ObjectRef2);
                string2.runOnUiThread((Runnable)object);
            }
            return;
        }
        Intrinsics.checkNotNull(null);
        Intrinsics.checkNotNullExpressionValue(h3.a.getAssets(), "getAssets(...)");
        throw null;
    }
}

