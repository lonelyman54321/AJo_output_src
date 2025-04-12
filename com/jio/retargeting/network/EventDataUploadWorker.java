/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.retargeting.network;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c$a;
import androidx.work.c$a$c;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.util.Utility;
import com.jio.retargeting.datastore.RetargetPref;
import com.jio.retargeting.network.NetworkTask;
import com.jio.retargeting.network.a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class EventDataUploadWorker
extends Worker {
    public final Context a;

    public EventDataUploadWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        super(context, workerParameters);
        this.a = context;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c$a doWork() {
        Object object;
        block12: {
            Object object2 = "tms";
            object = "gzipEnablePayloadSize";
            String string2 = "going payload : ";
            String string3 = this.getInputData().c("payload");
            b b2 = this.getInputData();
            int n3 = b2.b("index");
            Object object3 = this.getInputData();
            String string4 = "timeout";
            int n4 = ((b)object3).b(string4);
            if (string3 != null) {
                void var15_24;
                boolean bl2;
                Object object4;
                int n7;
                Object object5;
                try {
                    int n8;
                    boolean bl3;
                    object3 = RetargetPref.INSTANCE;
                    string4 = ((RetargetPref)object3).getConfigs();
                    object5 = "domain";
                    Object var11_11 = null;
                    string4 = string4 != null && (n7 = string4.has((String)object5)) != 0 ? string4.getString((String)object5) : null;
                    n7 = 0;
                    object4 = "/";
                    if (string4 != null && !(bl3 = kotlin.text.b.h(string4, (String)object4, false))) {
                        string4 = string4.concat((String)object4);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string4);
                    string4 = "v1/retarget/data";
                    stringBuilder.append(string4);
                    string4 = stringBuilder.toString();
                    JSONObject jSONObject = ((RetargetPref)object3).getConfigs();
                    long l2 = jSONObject != null && (bl2 = jSONObject.has((String)object)) ? jSONObject.getLong((String)object) : 1L;
                    object = string2.concat(string3);
                    string2 = "message";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = new JSONObject(string3);
                    boolean bl4 = object.has((String)object2);
                    if (bl4) {
                        object2 = object.getString((String)object2);
                    } else {
                        n8 = 0;
                        object2 = null;
                    }
                    object = Utility.INSTANCE;
                    ((Utility)object).toMillis((String)object2);
                    long l3 = string3.length();
                    n8 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (n8 >= 0) {
                        void var11_15;
                        void var11_13;
                        object2 = ((RetargetPref)object3).getConfigs();
                        if (object2 != null && (bl4 = object2.has((String)object5))) {
                            String string5 = object2.getString((String)object5);
                        }
                        if (var11_13 != null && (n8 = (int)(kotlin.text.b.h((String)var11_13, (String)object4, false) ? 1 : 0)) == 0) {
                            String string6 = var11_13.concat((String)object4);
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)var11_15);
                        string2 = "v1/retarget/data/compressed";
                        ((StringBuilder)object2).append(string2);
                        object2 = ((StringBuilder)object2).toString();
                        string3 = ((Utility)object).compress(string3);
                        object4 = object2;
                        String string7 = string3;
                        bl2 = true;
                    } else {
                        String string8 = string3;
                        object4 = string4;
                        bl2 = false;
                    }
                    object2 = this;
                }
                catch (JSONException jSONException) {}
                Context context = this.a;
                a a2 = new a(n3);
                n7 = 1;
                object5 = new NetworkTask(context, n7, (String)object4, (String)var15_24, bl2, n4, a2);
                break block12;
            }
            object2 = this;
            break block12;
            catch (JSONException jSONException) {}
        }
        object = new c$a$c();
        Intrinsics.checkNotNullExpressionValue(object, "success(...)");
        return object;
    }
}

