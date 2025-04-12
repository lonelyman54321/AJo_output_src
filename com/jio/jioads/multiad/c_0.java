/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.d_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.e;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.h;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from com.jio.jioads.multiad.c
 */
public final class c_0
implements NetworkTaskListener {
    public final /* synthetic */ e a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ com.jio.jioads.multiad.model.e d;
    public final /* synthetic */ String e;
    public final /* synthetic */ h f;
    public final /* synthetic */ JSONArray g;

    public c_0(e e2, Context context, Ref$ObjectRef ref$ObjectRef, com.jio.jioads.multiad.model.e e5, String string2, h h3, JSONArray jSONArray) {
        this.a = e2;
        this.b = context;
        this.c = ref$ObjectRef;
        this.d = e5;
        this.e = string2;
        this.f = h3;
        this.g = jSONArray;
    }

    public final void onError(int n3, Object object, Map iterator) {
        Object object2;
        boolean bl2;
        Object object3 = new StringBuilder();
        Object object4 = this.c;
        String string2 = (String)((Ref$ObjectRef)object4).element;
        String string3 = ": Prefetching failed for";
        j_0.k((StringBuilder)object3, string2, string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = (String)((Ref$ObjectRef)object4).element;
        iterator = (HashMap)((Object)iterator);
        object4 = this.a;
        string2 = this.b;
        com.jio.jioads.multiad.e.b((e)object4, (Context)string2, (String)object3, (HashMap)((Object)iterator));
        iterator = com.jio.jioads.multiad.e.e;
        if (iterator != null && !(bl2 = ((ArrayList)((Object)iterator)).isEmpty())) {
            iterator = com.jio.jioads.multiad.e.e;
            Intrinsics.checkNotNull(iterator);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while (true) {
                boolean bl3 = iterator.hasNext();
                string3 = null;
                if (!bl3) break;
                object3 = (NetworkTaskListener)iterator.next();
                Intrinsics.checkNotNull(object3);
                object3.onError(n3, object, null);
            }
            object2 = com.jio.jioads.multiad.e.e;
            if (object2 != null) {
                ((ArrayList)object2).clear();
            }
            com.jio.jioads.multiad.e.e = null;
        }
        object2 = this.g;
        object = this.e;
        iterator = this.f;
        ((e)object4).a((Context)string2, (String)object, (h)((Object)iterator), (JSONArray)object2);
    }

    public final void onSuccess(String object, Map object2) {
        Object object3;
        Object object4;
        boolean bl2;
        e e2 = this.a;
        Context context = this.b;
        Object object5 = this.c;
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            object4 = (String)((Ref$ObjectRef)object5).element;
            object3 = object2;
            object3 = (HashMap)object2;
            com.jio.jioads.multiad.e.b(e2, context, (String)object4, (HashMap)object3);
        }
        object4 = com.jio.jioads.multiad.e.e;
        object3 = null;
        if (object4 != null && !(bl2 = ((ArrayList)object4).isEmpty())) {
            object4 = new StringBuilder();
            object5 = (String)((Ref$ObjectRef)object5).element;
            String string2 = ": Prefetching received";
            j_0.k((StringBuilder)object4, (String)object5, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            object5 = com.jio.jioads.multiad.e.e;
            Intrinsics.checkNotNull(object5);
            object5 = ((ArrayList)object5).iterator();
            while (bl2 = object5.hasNext()) {
                object4 = (NetworkTaskListener)object5.next();
                object4.onSuccess((String)object, (Map)object2);
            }
            object = com.jio.jioads.multiad.e.e;
            if (object != null) {
                ((ArrayList)object).clear();
            }
            com.jio.jioads.multiad.e.e = null;
        } else {
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (!bl3) {
                boolean bl4;
                Intrinsics.checkNotNull(object);
                object2 = new JSONObject((String)object);
                object = "success";
                bl2 = object2.has((String)object);
                if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = object2.optString((String)object)))) && (bl4 = Boolean.parseBoolean((String)object)) && (bl2 = object2.has((String)(object = "result")))) {
                    object = object2.getJSONObject((String)object);
                    object2 = this.d.b;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((c)object2).b;
                    if (object2 != null) {
                        object3 = ((Integer)object2).toString();
                    }
                    object.putOpt("vr", object3);
                    object2 = "multiad_pref";
                    j_0.f(context, (String)object2, "loc");
                    object4 = new StringBuilder();
                    object3 = (String)((Ref$ObjectRef)object5).element;
                    j_0.k((StringBuilder)object4, (String)object3, ": Clearing Weightage Preference");
                    object4 = JioAds.Companion;
                    ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = new StringBuilder("playedAdWithWeight_");
                    String string3 = (String)((Ref$ObjectRef)object5).element;
                    ((StringBuilder)object3).append(string3);
                    object3 = ((StringBuilder)object3).toString();
                    j_0.f(context, (String)object2, (String)object3);
                    object2 = (String)((Ref$ObjectRef)object5).element;
                    object = object.toString();
                    j_0.g(context, (String)object2, (String)object2, (String)object);
                    object = new StringBuilder();
                    object2 = (String)((Ref$ObjectRef)object5).element;
                    object5 = ": Prefetching successful";
                    d_0.a((StringBuilder)object, (String)object2, (String)object5, (JioAds$Companion)object4);
                }
            }
        }
        object = this.g;
        object2 = this.e;
        object5 = this.f;
        e2.a(context, (String)object2, (h)object5, (JSONArray)object);
    }
}

