/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.jio.jioads.network;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.c0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import org.json.JSONObject;

public final class a
implements NetworkTaskListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ c0 e;

    public a(Context context, ArrayList arrayList, String string2, ArrayList arrayList2, c0 c02) {
        this.a = context;
        this.b = arrayList;
        this.c = string2;
        this.d = arrayList2;
        this.e = c02;
    }

    public final void onError(int n3, Object object, Map object2) {
        Object object3 = new StringBuilder("tracker json for cid: ");
        object = this.c;
        object2 = " failed";
        j_0.k((StringBuilder)object3, (String)object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.b;
        ((ArrayList)object3).add(object);
        n3 = ((ArrayList)object3).size();
        object = this.d;
        int n4 = ((ArrayList)object).size();
        if (n3 == n4) {
            object3 = this.e;
            n4 = 0;
            object = null;
            ((c0)object3).onSuccess(null, null);
        }
    }

    public final void onSuccess(String object, Map object2) {
        object2 = this.c;
        Context context = this.a;
        if (context != null) {
            Object object3 = new JSONObject();
            Calendar calendar = Calendar.getInstance();
            int n3 = 10;
            int n4 = 24;
            calendar.add(n3, n4);
            String string2 = "tj";
            object3.put(string2, object);
            long l2 = calendar.getTimeInMillis();
            object3.put("ex", l2);
            object = new StringBuilder("Fetched tracker json for cid: ");
            ir3_0.b((StringBuilder)object, (String)object2, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = object3.toString();
            object3 = "vmap_cache_pref";
            calendar = null;
            j_0.p(context, (String)object3, 0, object, (String)object2);
        }
        object = this.b;
        ((ArrayList)object).add(object2);
        int n7 = ((ArrayList)object).size();
        object2 = this.d;
        int n8 = ((ArrayList)object2).size();
        if (n7 == n8) {
            object = this.e;
            n8 = 0;
            object2 = null;
            ((c0)object).onSuccess(null, null);
        }
    }
}

