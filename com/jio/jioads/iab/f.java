/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
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
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.iab.e;
import com.jio.jioads.iab.h;
import com.jio.jioads.multiad.A;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class f
implements A {
    public final /* synthetic */ h a;
    public final /* synthetic */ Ref$ObjectRef b;

    public f(h h3, Ref$ObjectRef ref$ObjectRef) {
        this.a = h3;
        this.b = ref$ObjectRef;
    }

    public static final void b(Ref$ObjectRef object, h h3, Ref$ObjectRef object2) {
        Intrinsics.checkNotNullParameter(object, "$jsResponse");
        Intrinsics.checkNotNullParameter(h3, "this$0");
        Intrinsics.checkNotNullParameter(object2, "$vProps");
        Object object3 = (CharSequence)((Ref$ObjectRef)object).element;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl2 && (bl2 = ((ArrayList)(object3 = h3.c)).size()) > false) {
            object3 = h3.d.getValue();
            Object object4 = "getValue(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object3 = (Partner)object3;
            if (object3 != null) {
                String string2;
                block8: {
                    object3 = h3.d.getValue();
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    object3 = (Partner)object3;
                    object = (String)((Ref$ObjectRef)object).element;
                    object4 = h3.c;
                    string2 = null;
                    object = AdSessionContext.createNativeAdSessionContext((Partner)object3, (String)object, (List)object4, null, null);
                    object3 = CreativeType.VIDEO;
                    object4 = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    object3 = AdSessionConfiguration.createAdSessionConfiguration((CreativeType)object3, (ImpressionType)object4, (Owner)owner, (Owner)owner, (boolean)false);
                    object = AdSession.createAdSession((AdSessionConfiguration)object3, (AdSessionContext)object);
                    h3.e = object;
                    object = MediaEvents.createMediaEvents((AdSession)object);
                    h3.g = object;
                    object = AdEvents.createAdEvents((AdSession)h3.e);
                    h3.f = object;
                    object = h3.e;
                    if (object != null) {
                        object.start();
                    }
                    object = Position.STANDALONE;
                    bl2 = true;
                    ((Ref$ObjectRef)object2).element = object = VastProperties.createVastPropertiesForNonSkippableMedia((boolean)bl2, (Position)object);
                    try {
                        object2 = h3.f;
                        if (object2 == null) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {}
                    Intrinsics.checkNotNull(object);
                    object2.loaded((VastProperties)object);
                }
                object2 = "Omid SSAI adSession: ";
                object = new StringBuilder((String)object2);
                h3 = h3.e;
                if (h3 != null) {
                    string2 = h3.getAdSessionId();
                }
                l_0.i(string2, (StringBuilder)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "jscript");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = string2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        h h3 = this.a;
        if (!bl2) {
            string2 = h3.a;
            boolean bl3 = string2 instanceof Activity;
            if (bl3) {
                string2 = (Activity)string2;
                Ref$ObjectRef ref$ObjectRef2 = this.b;
                e e2 = new e(ref$ObjectRef, h3, ref$ObjectRef2);
                string2.runOnUiThread((Runnable)e2);
            }
            return;
        }
        Intrinsics.checkNotNull(null);
        Intrinsics.checkNotNullExpressionValue(h3.a.getAssets(), "getAssets(...)");
        throw null;
    }
}

