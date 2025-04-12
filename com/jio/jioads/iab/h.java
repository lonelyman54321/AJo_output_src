/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.iab.omid.library.ril.adsession.AdEvents
 *  com.iab.omid.library.ril.adsession.AdSession
 *  com.iab.omid.library.ril.adsession.VerificationScriptResource
 *  com.iab.omid.library.ril.adsession.media.MediaEvents
 */
package com.jio.jioads.iab;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ril.adsession.AdEvents;
import com.iab.omid.library.ril.adsession.AdSession;
import com.iab.omid.library.ril.adsession.VerificationScriptResource;
import com.iab.omid.library.ril.adsession.media.MediaEvents;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.iab.g;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class h {
    public final Context a;
    public final c b;
    public final ArrayList c;
    public final hh3_2 d;
    public AdSession e;
    public AdEvents f;
    public MediaEvents g;
    public String h;

    public h(Context object, c c2) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.a = object;
        this.b = c2;
        this.c = object;
        object = yr1_2.b(com.jio.jioads.iab.g.c);
        this.d = object;
        this.a();
    }

    public final void a() {
        block3: {
            boolean bl2;
            Object object;
            String string2;
            Object object2;
            block2: {
                boolean bl3;
                Intrinsics.checkNotNullParameter("Preparing measurement for OMID", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = this.c;
                string2 = "next(...)";
                object = this.b;
                if (object == null) break block2;
                Iterator iterator = object;
                iterator = ((f)object).a.c;
                Intrinsics.checkNotNull(iterator);
                iterator = ((HashMap)((Object)iterator)).keySet().iterator();
                while (bl3 = iterator.hasNext()) {
                    Object object3 = iterator.next();
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                    object3 = (String)object3;
                    Object object4 = object;
                    object4 = ((f)object).a.c;
                    Intrinsics.checkNotNull(object4);
                    object3 = (com.jio.jioads.instreamads.vastparser.model.h)((HashMap)object4).get(object3);
                    Intrinsics.checkNotNull(object3);
                    object4 = ((com.jio.jioads.instreamads.vastparser.model.h)object3).a;
                    boolean bl4 = TextUtils.isEmpty((CharSequence)object4);
                    if (bl4 || (bl4 = TextUtils.isEmpty((CharSequence)(object4 = ((com.jio.jioads.instreamads.vastparser.model.h)object3).c))) || (bl4 = TextUtils.isEmpty((CharSequence)(object4 = ((com.jio.jioads.instreamads.vastparser.model.h)object3).b)))) continue;
                    this.h = object4 = ((com.jio.jioads.instreamads.vastparser.model.h)object3).d;
                    object4 = ((com.jio.jioads.instreamads.vastparser.model.h)object3).a;
                    String string3 = ((com.jio.jioads.instreamads.vastparser.model.h)object3).c;
                    URL uRL = new URL(string3);
                    object3 = ((com.jio.jioads.instreamads.vastparser.model.h)object3).b;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((Object)StringsKt.m0(object3)).toString();
                    object3 = VerificationScriptResource.createVerificationScriptResourceWithParameters((String)object4, (URL)uRL, object3);
                    Intrinsics.checkNotNull(object3);
                    ((ArrayList)object2).add(object3);
                }
                break block3;
            }
            object = l_0.a;
            object = object != null && (object = ((HashMap)object).keySet()) != null ? object.iterator() : null;
            if (object == null) break block3;
            while (bl2 = object.hasNext()) {
                Object object5 = object.next();
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                object5 = (String)object5;
                Object object6 = l_0.a;
                Intrinsics.checkNotNull(object6);
                object5 = (com.jio.jioads.instreamads.vastparser.model.h)((HashMap)object6).get(object5);
                Intrinsics.checkNotNull(object5);
                object6 = ((com.jio.jioads.instreamads.vastparser.model.h)object5).a;
                boolean bl5 = TextUtils.isEmpty((CharSequence)object6);
                if (bl5 || (bl5 = TextUtils.isEmpty((CharSequence)(object6 = ((com.jio.jioads.instreamads.vastparser.model.h)object5).c))) || (bl5 = TextUtils.isEmpty((CharSequence)(object6 = ((com.jio.jioads.instreamads.vastparser.model.h)object5).b)))) continue;
                this.h = object6 = ((com.jio.jioads.instreamads.vastparser.model.h)object5).d;
                object6 = ((com.jio.jioads.instreamads.vastparser.model.h)object5).a;
                String string4 = ((com.jio.jioads.instreamads.vastparser.model.h)object5).c;
                URL uRL = new URL(string4);
                object5 = ((com.jio.jioads.instreamads.vastparser.model.h)object5).b;
                Intrinsics.checkNotNull(object5);
                object5 = ((Object)StringsKt.m0(object5)).toString();
                object5 = VerificationScriptResource.createVerificationScriptResourceWithParameters((String)object6, (URL)uRL, object5);
                Intrinsics.checkNotNull(object5);
                ((ArrayList)object2).add(object5);
            }
        }
    }
}

