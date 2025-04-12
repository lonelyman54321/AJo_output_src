/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.retargeting.controller;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.f;
import com.jio.retargeting.controller.a;
import com.jio.retargeting.controller.b;
import com.jio.retargeting.controller.c;
import com.jio.retargeting.datastore.RetargetPref;
import com.jio.retargeting.network.NetworkTask;
import com.jio.retargeting.network.NetworkTaskListener;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ConfigController {
    public final Context a;
    public final NetworkTaskListener b;
    public final int c;
    public long d;
    public HashMap e;
    public HashMap f;

    public ConfigController(Context context, NetworkTaskListener networkTaskListener, int n3) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(networkTaskListener, "networkListener");
        this.a = context;
        this.b = networkTaskListener;
        this.c = n3;
    }

    public static final void a(ConfigController configController, String string2, String string3, long l2, Ref$ObjectRef ref$ObjectRef) {
        Intrinsics.checkNotNullParameter(configController, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$configUrl");
        String string4 = string3;
        Intrinsics.checkNotNullParameter(string3, "$appPackageName");
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$fibonacciTimer");
        Object object = configController.a;
        int n3 = configController.c;
        b b2 = new b(configController, string3, l2, ref$ObjectRef);
        string4 = object;
        object = b2;
        NetworkTask networkTask = new NetworkTask((Context)string4, 0, string2, null, false, n3, b2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(JSONObject jSONObject) {
        Object object = jSONObject;
        Object object2 = "tms";
        String string2 = "commonPayload";
        String string3 = "batchData";
        ArrayList<String> arrayList = "eventExpiry";
        String string4 = "queueCount";
        try {
            long l2;
            boolean bl2;
            RetargetPref retargetPref = RetargetPref.INSTANCE;
            retargetPref = retargetPref.getBatchDataObj();
            if (jSONObject != null && (bl2 = jSONObject.has((String)((Object)arrayList)))) {
                Utility utility = Utility.INSTANCE;
                long l3 = jSONObject.optLong((String)((Object)arrayList));
                object = l3;
                l2 = utility.convertMinToMillis((Long)object);
            } else {
                l2 = 0L;
            }
            if (retargetPref == null) return;
            int n3 = retargetPref.has(string3);
            if (n3 == 0) return;
            object = retargetPref.optJSONArray(string3);
            if (object == null) return;
            int n4 = object.length();
            if (n4 <= 0) return;
            n4 = object.length();
            int n7 = 0;
            Object var17_15 = null;
            int n8 = 0;
            while (true) {
                int n10;
                String string5;
                String string6;
                Object object3;
                block16: {
                    Object object4;
                    void var17_16;
                    JSONObject jSONObject2;
                    String string7;
                    JSONObject jSONObject3;
                    block15: {
                        int n14;
                        if (n7 >= n4) {
                            object = RetargetPref.INSTANCE;
                            ((RetargetPref)object).updateBatch((JSONObject)retargetPref);
                            return;
                        }
                        jSONObject3 = object.getJSONObject(n7);
                        boolean bl3 = jSONObject3.has(string2);
                        string7 = "data";
                        if (bl3) {
                            jSONObject2 = jSONObject3.getJSONObject(string2);
                            boolean bl4 = jSONObject2.has(string7);
                            if (bl4) {
                                JSONArray jSONArray = jSONObject2.optJSONArray(string7);
                            }
                        } else {
                            bl3 = false;
                            jSONObject2 = null;
                        }
                        if ((n14 = (arrayList = object.getJSONObject(n7)).has(string4)) != 0) {
                            n8 = jSONObject3.getInt(string4);
                        }
                        if (var17_16 != null && (n14 = var17_16.length()) > 0) break block15;
                        object3 = object;
                        string6 = object2;
                        string5 = string2;
                        n10 = n4;
                        break block16;
                    }
                    arrayList = new ArrayList<String>();
                    int n15 = var17_16.length();
                    object3 = object;
                    object = null;
                    for (n3 = 0; n3 < n15; ++n3) {
                        block19: {
                            block17: {
                                long l4;
                                block18: {
                                    int n16;
                                    string5 = string2;
                                    string2 = var17_16.getJSONObject(n3);
                                    n10 = (int)(string2.has((String)object2) ? 1 : 0);
                                    if (n10 == 0) break block17;
                                    n10 = n4;
                                    string3 = string2.optString((String)object2);
                                    if (string3 != null && (n16 = string3.length()) != 0) break block18;
                                    string6 = object2;
                                    break block19;
                                }
                                string6 = object2;
                                object2 = Utility.INSTANCE;
                                long l7 = ((Utility)object2).toMillis(string3) + l2;
                                long l8 = l7 - (l4 = ((Utility)object2).getCurrentTime());
                                object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                if (object4 >= 0) {
                                    arrayList.add(string2);
                                    break block19;
                                } else if (n8 > 0) {
                                    n8 += -1;
                                }
                                break block19;
                            }
                            string6 = object2;
                            n10 = n4;
                        }
                        string2 = string5;
                        n4 = n10;
                        object2 = string6;
                    }
                    string6 = object2;
                    string5 = string2;
                    n10 = n4;
                    object = new JSONArray(arrayList);
                    jSONObject3.put(string4, n8);
                    if (jSONObject2 != null && (object4 = jSONObject2.has(string7)) != 0) {
                        jSONObject2.put(string7, object);
                    }
                    Object object5 = object;
                }
                ++n7;
                object = object3;
                string2 = string5;
                n4 = n10;
                object2 = string6;
            }
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    public static final /* synthetic */ HashMap access$getAdFetchInProgressMap$p(ConfigController configController) {
        return configController.e;
    }

    public static final /* synthetic */ HashMap access$getFiboTimerMap$p(ConfigController configController) {
        return configController.f;
    }

    public static final /* synthetic */ void access$startFiboTimer(ConfigController configController, String string2, f f5) {
        configController.a(string2, f5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2) {
        ConfigController configController = this;
        String string3 = string2;
        Object object = "stg";
        Object object2 = "sit";
        Object object3 = "appPackageName: ";
        Object object4 = "Fibotimer is already running for requested package: ";
        RetargetPref retargetPref = RetargetPref.INSTANCE;
        ConfigController.a(retargetPref.getConfigs());
        String string4 = this.a.getPackageName();
        Object object5 = Utility.INSTANCE;
        long l2 = ((Utility)object5).getCurrentTime();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        boolean bl2 = true;
        try {
            a a2;
            boolean bl3;
            boolean bl4;
            Object object6;
            block20: {
                block18: {
                    block19: {
                        block17: {
                            object5 = this.f;
                            object6 = "message";
                            if (object5 != null) {
                                Intrinsics.checkNotNull(object5);
                                boolean bl5 = ((HashMap)object5).containsKey(string2);
                                if (bl5) {
                                    object5 = this.f;
                                    Intrinsics.checkNotNull(object5);
                                    ref$ObjectRef.element = object5 = ((HashMap)object5).get(string2);
                                    object5 = new StringBuilder((String)object4);
                                    ((StringBuilder)object5).append(string2);
                                    object4 = ((StringBuilder)object5).toString();
                                    Intrinsics.checkNotNullParameter(object4, (String)object6);
                                    object4 = JioAds.Companion;
                                    object4 = ((JioAds$Companion)object4).getInstance();
                                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object4 = JioAds$LogLevel.NONE;
                                }
                            }
                            if ((object4 = retargetPref.getConfigEnvironment()) == null) break block17;
                            object4 = retargetPref.getConfigEnvironment();
                            boolean bl6 = ((String)(object4 = String.valueOf(object4))).equalsIgnoreCase((String)object2);
                            if (bl6) break block18;
                        }
                        if ((object2 = retargetPref.getConfigEnvironment()) == null) break block19;
                        object2 = retargetPref.getConfigEnvironment();
                        bl4 = ((String)(object2 = String.valueOf(object2))).equalsIgnoreCase((String)object);
                        if (bl4) break block20;
                    }
                    object = retargetPref.getConfigEnvironment();
                    object2 = "prod";
                    if (object != null) {
                        object = retargetPref.getConfigEnvironment();
                        object = String.valueOf(object);
                        object4 = "Prod";
                        bl3 = ((String)object).equalsIgnoreCase((String)object4);
                    }
                }
                object = object2;
            }
            long l3 = System.currentTimeMillis();
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append(string3);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object2, (String)object6);
            object2 = JioAds.Companion;
            object2 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            bl4 = TextUtils.isEmpty((CharSequence)string2);
            object3 = ".json?t=";
            object5 = "/an/";
            object6 = "https://mercury.akamaized.net/jioads/retargeting/";
            if (!bl4) {
                object2 = new StringBuilder((String)object6);
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append((String)object5);
                ((StringBuilder)object2).append(string3);
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(l3);
                object = ((StringBuilder)object2).toString();
            } else {
                object2 = new StringBuilder((String)object6);
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append((String)object5);
                ((StringBuilder)object2).append(string4);
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(l3);
                object = ((StringBuilder)object2).toString();
            }
            object3 = object;
            object = configController.e;
            if (object != null && (bl3 = ((HashMap)object).containsKey(string3)) == bl2) {
                object = configController.b;
                this.a(string3, (NetworkTaskListener)object);
                return;
            }
            object = configController.b;
            this.a(string3, (NetworkTaskListener)object);
            object = a2;
            object2 = this;
            object4 = string2;
            object5 = ref$ObjectRef;
            a2 = new a(this, (String)object3, string2, l2, ref$ObjectRef);
            object6 = new Thread(a2);
            ((Thread)object6).start();
            return;
        }
        catch (Exception exception) {}
        object = (f)ref$ObjectRef.element;
        this.a(string3, (f)object);
        object = configController.e;
        if (object != null) {
            object = (ArrayList)((HashMap)object).get(string3);
        } else {
            boolean bl7 = false;
            object = null;
        }
        object2 = configController.e;
        if (object2 != null) {
            object2 = (ArrayList)((HashMap)object2).remove(string3);
        }
        if (object == null) return;
        object2 = ((ArrayList)object).iterator();
        while (true) {
            boolean bl8;
            if (!(bl8 = object2.hasNext())) {
                ((ArrayList)object).clear();
                return;
            }
            object3 = (NetworkTaskListener)object2.next();
            object4 = "config error";
            object3.onError(bl2, (String)object4);
        }
    }

    public final void a(String string2, f f5) {
        boolean bl2;
        l_0.h("Starting/Continuing fibotimer for package ", string2);
        Object object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.f;
        if (object2 == null) {
            object2 = new HashMap();
            this.f = object2;
        }
        if (f5 == null) {
            f5 = new f();
            object2 = new StringBuilder("Created new fibotimer for package ");
            ((StringBuilder)object2).append(string2);
            char c2 = ' ';
            ((StringBuilder)object2).append(c2);
            ((StringBuilder)object2).append(f5);
            object2 = ((StringBuilder)object2).toString();
            String string3 = "message";
            Intrinsics.checkNotNullParameter(object2, string3);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((object = this.f) != null && !(bl2 = object.isEmpty())) {
            object = this.f;
            Intrinsics.checkNotNull(object);
            object.put(string2, f5);
            object = new c(string2, this);
            f5.a((com.jio.jioads.util.c)object);
        }
    }

    public final void a(String string2, NetworkTaskListener object) {
        Cloneable cloneable = this.e;
        if (cloneable == null) {
            cloneable = new HashMap();
            this.e = cloneable;
        }
        cloneable = this.e;
        Intrinsics.checkNotNull(cloneable);
        boolean bl2 = ((HashMap)cloneable).containsKey(string2);
        if (bl2) {
            cloneable = this.e;
            Intrinsics.checkNotNull(cloneable);
            cloneable = (ArrayList)((HashMap)cloneable).get(string2);
            if (cloneable == null) {
                cloneable = new ArrayList();
            }
            ((ArrayList)cloneable).add(object);
            object = this.e;
            Intrinsics.checkNotNull(object);
            object.put(string2, cloneable);
        } else {
            cloneable = this.e;
            Intrinsics.checkNotNull(cloneable);
            int n3 = 1;
            Object[] objectArray = new NetworkTaskListener[n3];
            objectArray[0] = object;
            object = xx_2.d(objectArray);
            cloneable.put(string2, object);
        }
    }

    public final void fetchConfig(String object) {
        Intrinsics.checkNotNullParameter(object, "appPackageName");
        Object object2 = RetargetPref.INSTANCE;
        JSONObject jSONObject = ((RetargetPref)object2).getConfigs();
        ConfigController.a(jSONObject);
        String string2 = this.a.getPackageName();
        Utility utility = Utility.INSTANCE;
        long l2 = utility.getCurrentTime();
        boolean bl2 = Intrinsics.areEqual(object, string2);
        String string3 = "message";
        if (bl2 && !(bl2 = utility.isConfigEnvUpdated()) && !(bl2 = this.isConfigExpired())) {
            object = ((RetargetPref)object2).getConfigs();
            Intrinsics.checkNotNull(object);
            long l3 = object.optLong("configExpiry") - l2;
            string2 = "Config is not expired yet, remaining :";
            object = new StringBuilder(string2);
            object2 = utility.getTime(l3);
            ((StringBuilder)object).append((String)object2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            bl2 = false;
            string2 = null;
            utility.setConfigEnvUpdated(false);
            ((RetargetPref)object2).storeConfigInit(false);
            if (jSONObject != null && (bl2 = jSONObject.has((String)(object2 = "maxStorageTime")))) {
                long l4;
                this.d = l4 = jSONObject.getLong((String)object2);
            }
            Intrinsics.checkNotNullParameter("Fetching New Config", string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            this.a((String)object);
        }
    }

    public final long getMaxStorageTime() {
        return this.d;
    }

    public final boolean isConfigExpired() {
        boolean bl2;
        long l2;
        JSONObject jSONObject = RetargetPref.INSTANCE.getConfigs();
        if (jSONObject != null) {
            String string2 = "configExpiry";
            l2 = jSONObject.optLong(string2);
        } else {
            l2 = 0L;
        }
        Utility utility = Utility.INSTANCE;
        long l3 = utility.getCurrentTime();
        Object object = D70.c(l2, "expiry: ", ", current :");
        object.append(l3);
        object.append(", diff :");
        long l4 = l2 - l3;
        object.append(l4);
        object = object.toString();
        String string3 = "message";
        Intrinsics.checkNotNullParameter(object, string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        long l7 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l7 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public final void setMaxStorageTime(long l2) {
        this.d = l2;
    }
}

