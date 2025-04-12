/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.jioreel.ssai;

import android.content.Context;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.instreamads.vastparser.model.CtaUrl;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import com.jio.jioads.jioreel.network.b;
import com.jio.jioads.jioreel.ssai.a;
import com.jio.jioads.jioreel.ssai.k;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements a {
    public final /* synthetic */ p a;
    public final /* synthetic */ JioReelAdMetaData b;
    public final /* synthetic */ boolean c;

    public l(p p2, JioReelAdMetaData jioReelAdMetaData, boolean bl2) {
        this.a = p2;
        this.b = jioReelAdMetaData;
        this.c = bl2;
    }

    public final void a() {
        boolean bl2;
        int n3;
        Object object;
        int n4;
        Object object2;
        Integer n7;
        int n8;
        p p2 = this.a;
        p2.getClass();
        Object object3 = this.b;
        String string2 = object3 != null ? ((JioReelAdMetaData)object3).getAdId() : null;
        if (object3 != null) {
            n8 = ((JioReelAdMetaData)object3).getAdIndex();
            n7 = n8;
        } else {
            n8 = 0;
            n7 = null;
        }
        boolean bl3 = true;
        n8 = n7 != null ? ((JioReelAdMetaData)object3).getAdIndex() : 1;
        Object object4 = new ArrayList();
        boolean bl4 = this.c;
        if (bl4) {
            block18: {
                object4 = p2.a();
                object4.getClass();
                object2 = new ArrayList();
                object4 = ((com.jio.jioads.jioreel.vast.a)object4).b;
                n4 = ((HashMap)object4).size();
                if (n4 <= 0) break block18;
                object = ((HashMap)object4).get(string2);
                if (object == null) break block18;
                object4 = ((HashMap)object4).get(string2);
                Intrinsics.checkNotNull(object4);
                object4 = (Collection)object4;
                try {
                    object2.addAll(object4);
                }
                catch (Exception exception) {
                    object4 = Utility.INSTANCE.printStacktrace(exception);
                    object = "message";
                    Intrinsics.checkNotNullParameter(object4, (String)object);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = JioAds$LogLevel.NONE;
                }
            }
            if ((n3 = object2.isEmpty()) != 0 && object3 != null && (object3 = ((JioReelAdMetaData)object3).getJioReelAdParameter()) != null && (object3 = ((AdMetaData$AdParams)object3).getCtaUrl()) != null && (object3 = ((CtaUrl)object3).getClickTrackers()) != null) {
                object2.addAll(object3);
            }
            object4 = object2;
        } else {
            if (object3 != null && (object3 = ((JioReelAdMetaData)object3).getJioReelAdParameter()) != null) {
                object3 = ((AdMetaData$AdParams)object3).getSecondaryCtaUrlTracker();
            } else {
                bl2 = false;
                object3 = null;
            }
            ((ArrayList)object4).add(object3);
        }
        bl2 = object4.isEmpty() ^ bl3;
        if (bl2) {
            object3 = object4.iterator();
            while (bl3 = object3.hasNext()) {
                Object object5 = (String)object3.next();
                if (object5 == null || (n3 = ((String)object5).length()) == 0) continue;
                object4 = new Object();
                ((com.jio.jioads.util.k)object4).p = object2 = p2.a;
                ((com.jio.jioads.util.k)object4).a = object5;
                object5 = p2.f(string2);
                ((com.jio.jioads.util.k)object4).b = object5;
                Intrinsics.checkNotNullParameter(object2, "context");
                object5 = "common_prefs";
                object = "advid";
                String string3 = "";
                object5 = j_0.d(object2, (String)object5, 0, string3, (String)object);
                object = "null cannot be cast to non-null type kotlin.String";
                try {
                    Intrinsics.checkNotNull(object5, (String)object);
                    object5 = (String)object5;
                }
                catch (Exception exception) {
                    bl3 = false;
                    object5 = null;
                }
                ((com.jio.jioads.util.k)object4).r = object5;
                object5 = Utility.INSTANCE;
                object = ((Utility)object5).getUidFromPreferences((Context)object2);
                ((com.jio.jioads.util.k)object4).s = object;
                ((com.jio.jioads.util.k)object4).t = object = p2.r;
                ((com.jio.jioads.util.k)object4).e = object = Boolean.TRUE;
                ((com.jio.jioads.util.k)object4).l = object = Integer.valueOf(n8);
                object2 = object2.getPackageName();
                ((com.jio.jioads.util.k)object4).w = object2;
                object2 = "video";
                ((com.jio.jioads.util.k)object4).f = object2;
                if ((object5 = ((Utility)object5).replaceMacros((com.jio.jioads.util.k)object4)) == null) continue;
                object4 = new b();
                object2 = new k((String)object5);
                n4 = 8;
                ((b)object4).a(n4, (String)object5, (Function1)object2);
            }
        }
    }
}

