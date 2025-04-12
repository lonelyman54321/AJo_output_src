/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.Uri
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.retargeting.datastore;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.util.Utility;
import com.jio.retargeting.data.ConversionDataModel;
import com.jio.retargeting.util.Event;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlin.time.a;
import kotlin.time.a$a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class RetargetPref {
    private static final String CLICKS_DATA = "clicksData";
    private static final String CONFIGS = "configData";
    private static final String CONFIG_ENVIRONMENT = "environment";
    private static final String CONFIG_INIT = "configInit";
    public static final RetargetPref INSTANCE;
    private static final String RETARGETING_DATA = "retargetingData";
    private static int maxEventSize = 0;
    private static SharedPreferences preferences;
    private static final String sharedPrefs = "JioAdsRetargetingSDK";

    static {
        RetargetPref retargetPref;
        INSTANCE = retargetPref = new RetargetPref();
        retargetPref = Utility.INSTANCE.getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (retargetPref != null) {
            String string2 = sharedPrefs;
            retargetPref = retargetPref.getSharedPreferences(string2, 0);
        } else {
            retargetPref = null;
        }
        preferences = retargetPref;
    }

    private RetargetPref() {
    }

    public static /* synthetic */ Pair checkProductAvailbleForConversionLevel$default(RetargetPref retargetPref, String string2, Event event, boolean bl2, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        return retargetPref.checkProductAvailbleForConversionLevel(string2, event, bl2);
    }

    private final Pair checkProductIdExists(JSONArray object, String object2) {
        int n3 = object.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3;
            Object object4;
            try {
                object4 = object.getJSONObject(i3);
                object3 = "productId";
            }
            catch (JSONException jSONException) {}
            object4 = object4.getString((String)object3);
            boolean bl2 = true;
            boolean bl3 = b.i((String)object4, (String)object2, bl2);
            if (!bl3) continue;
            object3 = Boolean.TRUE;
            Integer n4 = i3;
            object4 = new Pair(object3, n4);
            return object4;
        }
        object2 = Boolean.FALSE;
        Integer n7 = -1;
        object = new Pair(object2, n7);
        return object;
    }

    private final void createNewBatch(JSONArray object, JSONObject object2) {
        JSONObject jSONObject = new JSONObject();
        String string2 = "retryCount";
        int n3 = 1;
        jSONObject.put(string2, n3);
        string2 = "queueCount";
        jSONObject.put(string2, n3);
        string2 = "updatedTimeStamp";
        Object object3 = new Date();
        long l2 = ((Date)object3).getTime();
        jSONObject.put(string2, l2);
        string2 = new JSONArray();
        string2.put(object2);
        object2 = new JSONObject();
        object3 = "data";
        object2.put((String)object3, (Object)string2);
        string2 = "commonPayload";
        jSONObject.put(string2, object2);
        try {
            object.put((Object)jSONObject);
        }
        catch (Exception exception) {
            object = String.valueOf(exception.getMessage());
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void deleteQueue(int n3) {
        Exception exception2;
        String string2;
        block9: {
            JSONObject jSONObject;
            JSONArray jSONArray;
            String string3;
            Object object;
            Object object2;
            String string4;
            block8: {
                boolean bl2;
                string4 = "After deleting queue batchDataObj: ";
                object2 = new StringBuilder("Deleting index: ");
                ((StringBuilder)object2).append(n3);
                object2 = ((StringBuilder)object2).toString();
                string2 = "message";
                Intrinsics.checkNotNullParameter(object2, string2);
                object2 = JioAds.Companion;
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = preferences;
                if (object == null) return;
                string3 = RETARGETING_DATA;
                boolean bl3 = object.contains(string3);
                if (bl3 != (bl2 = true)) return;
                object = preferences;
                bl2 = false;
                jSONArray = null;
                if (object != null) {
                    object = object.getString(string3, null);
                } else {
                    bl3 = false;
                    object = null;
                }
                boolean bl4 = TextUtils.isEmpty((CharSequence)object);
                if (bl4) return;
                if (object != null) {
                    try {
                        jSONObject = new JSONObject((String)object);
                        break block8;
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                bl4 = false;
                jSONObject = null;
            }
            object = "batchData";
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray((String)object);
            }
            if (jSONArray != null) {
                jSONArray.remove(n3);
            }
            if (jSONObject != null) {
                jSONObject.put((String)object, (Object)jSONArray);
            }
            Object object3 = new StringBuilder(string4);
            ((StringBuilder)object3).append(jSONObject);
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object3, string2);
            object3 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = preferences;
            if (object3 == null) return;
            if ((object3 = object3.edit()) == null) return;
            string4 = String.valueOf(jSONObject);
            if ((object3 = object3.putString(string3, string4)) == null) return;
            object3.apply();
            return;
        }
        Intrinsics.checkNotNullParameter(String.valueOf(exception2.getMessage()), string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final JSONObject getClicksData() {
        void var2_5;
        String string2;
        String string3;
        block7: {
            block6: {
                SharedPreferences sharedPreferences2;
                string3 = null;
                try {
                    sharedPreferences2 = preferences;
                    if (sharedPreferences2 == null) break block6;
                    string2 = CLICKS_DATA;
                }
                catch (JSONException jSONException) {
                    return string3;
                }
                String string4 = sharedPreferences2.getString(string2, null);
                break block7;
            }
            Object var2_4 = null;
        }
        if (var2_5 == null) return string3;
        string2 = new JSONObject((String)var2_5);
        return string2;
    }

    public static /* synthetic */ ConversionDataModel getEventConversionData$default(RetargetPref retargetPref, Event event, Integer n3, int n4, Object object) {
        if ((n4 &= 2) != 0) {
            n3 = 0;
        }
        return retargetPref.getEventConversionData(event, n3);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final long getEventTimeout(Event object, Integer object2) {
        long l2;
        block40: {
            int n3;
            String string2;
            Object object3;
            block37: {
                block38: {
                    block39: {
                        StringBuilder stringBuilder;
                        void var2_16;
                        String string3 = "TimeOut Level of ";
                        object3 = this.getEventConversionData((Event)((Object)object), (Integer)var2_16);
                        string2 = null;
                        object3 = object3 != null ? ((ConversionDataModel)object3).e : null;
                        ConversionDataModel conversionDataModel = this.getEventConversionData((Event)((Object)object), (Integer)var2_16);
                        if (conversionDataModel != null) {
                            string2 = conversionDataModel.f;
                        }
                        l2 = 0L;
                        try {
                            stringBuilder = new StringBuilder(string3);
                        }
                        catch (JSONException jSONException) {
                            return l2;
                        }
                        stringBuilder.append(var2_16);
                        String string4 = " is : ";
                        stringBuilder.append(string4);
                        stringBuilder.append(object3);
                        stringBuilder.append(string2);
                        String string5 = stringBuilder.toString();
                        String string6 = "message";
                        Intrinsics.checkNotNullParameter(string5, string6);
                        JioAds$Companion jioAds$Companion = JioAds.Companion;
                        JioAds jioAds = jioAds$Companion.getInstance();
                        jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                        if (string2 == null) return l2;
                        n3 = string2.hashCode();
                        int n4 = 100;
                        if (n3 == n4) break block37;
                        n4 = 104;
                        if (n3 == n4) break block38;
                        n4 = 109;
                        if (n3 == n4) break block39;
                        n4 = 115;
                        if (n3 != n4) break block40;
                        String string7 = "s";
                        n3 = (int)(string2.equals(string7) ? 1 : 0);
                        if (n3 == 0) break block40;
                        if (object3 == null) return l2;
                        a$a a$a = a.b;
                        n3 = (Integer)object3;
                        aw0_1 aw0_12 = aw0_1.SECONDS;
                        long l3 = kotlin.time.b.f(n3, aw0_12);
                        return a.c(l3);
                    }
                    String string8 = "m";
                    n3 = (int)(string2.equals(string8) ? 1 : 0);
                    if (n3 == 0) break block40;
                    if (object3 == null) return l2;
                    a$a a$a = a.b;
                    n3 = (Integer)object3;
                    aw0_1 aw0_13 = aw0_1.MINUTES;
                    long l4 = kotlin.time.b.f(n3, aw0_13);
                    return a.c(l4);
                }
                String string9 = "h";
                n3 = (int)(string2.equals(string9) ? 1 : 0);
                if (n3 == 0) break block40;
                if (object3 == null) return l2;
                a$a a$a = a.b;
                n3 = (Integer)object3;
                aw0_1 aw0_14 = aw0_1.HOURS;
                long l7 = kotlin.time.b.f(n3, aw0_14);
                return a.c(l7);
            }
            String string10 = "d";
            n3 = (int)(string2.equals(string10) ? 1 : 0);
            if (n3 == 0) break block40;
            if (object3 == null) return l2;
            a$a a$a = a.b;
            n3 = (Integer)object3;
            aw0_1 aw0_15 = aw0_1.DAYS;
            long l8 = kotlin.time.b.f(n3, aw0_15);
            return a.c(l8);
        }
        return l2;
    }

    public static /* synthetic */ long getEventTimeout$default(RetargetPref retargetPref, Event event, Integer n3, int n4, Object object) {
        if ((n4 &= 1) != 0) {
            event = null;
        }
        return retargetPref.getEventTimeout(event, n3);
    }

    private final boolean isStorageTimeReached(long l2, long l3) {
        boolean bl2;
        Utility utility = Utility.INSTANCE;
        long l4 = (l3 += l2) - (l2 = utility.getCurrentTime());
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            utility = null;
        }
        return bl2;
    }

    private final Pair removeExpiredAddAndRemoveCartClick(String string2, Integer n3, boolean bl2) {
        Object object;
        RetargetPref retargetPref = this;
        Object object2 = this.getClicksData();
        Boolean bl3 = null;
        if (object2 != null) {
            object = "clicks";
            JSONArray jSONArray = object2.getJSONArray((String)object);
            JSONArray jSONArray2 = new JSONArray();
            int n4 = jSONArray.length();
            for (int i3 = 0; i3 < n4; ++i3) {
                boolean bl4;
                boolean bl5;
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                long l2 = jSONObject.getLong("timeStamp");
                Object object3 = new Date(l2);
                Object object4 = new Date();
                l2 = ((Date)object4).getTime();
                long l3 = ((Date)object3).getTime();
                object3 = jSONObject.getString("productId");
                boolean bl6 = true;
                long l4 = RetargetPref.getEventTimeout$default(retargetPref, null, n3, (int)(bl6 ? 1 : 0), null);
                long l7 = (l2 -= l3) - l4;
                long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                object4 = string2;
                if (l8 >= 0 && (bl5 = b.i(string2, (String)object3, bl6)) && (bl4 = jSONObject.has((String)(object3 = "clickId")))) {
                    if (!bl2) continue;
                    bl3 = Boolean.TRUE;
                    object = jSONObject.getString((String)object3);
                    object2 = new Pair(bl3, object);
                    return object2;
                }
                jSONArray2.put((Object)jSONObject);
            }
            object2.put((String)object, (Object)jSONArray2);
            retargetPref.storeClicks((JSONObject)object2);
        }
        object = Boolean.FALSE;
        object2 = new Pair(object, null);
        return object2;
    }

    public static /* synthetic */ Pair removeExpiredAddAndRemoveCartClick$default(RetargetPref retargetPref, String string2, Integer n3, boolean bl2, int n4, Object object) {
        if ((n4 &= 4) != 0) {
            bl2 = false;
        }
        return retargetPref.removeExpiredAddAndRemoveCartClick(string2, n3, bl2);
    }

    private final void removeExpiredPurchaseClick(Integer n3) {
        JSONObject jSONObject = this.getClicksData();
        if (jSONObject != null) {
            String string2 = "clicks";
            JSONArray jSONArray = jSONObject.getJSONArray(string2);
            JSONArray jSONArray2 = new JSONArray();
            int n4 = jSONArray.length();
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                Object object = "conversionLevel";
                int n8 = jSONObject2.getInt((String)object);
                if (n3 == null || n8 != (n7 = n3.intValue())) continue;
                long l2 = jSONObject2.getLong("timeStamp");
                object = new Date(l2);
                Date date = new Date();
                l2 = date.getTime();
                long l3 = ((Date)object).getTime();
                l2 -= l3;
                object = null;
                int n10 = 1;
                l3 = RetargetPref.getEventTimeout$default(this, null, n3, n10, null);
                long l4 = l2 - l3;
                n8 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                if (n8 >= 0) continue;
                jSONArray2.put((Object)jSONObject2);
            }
            jSONObject.put(string2, (Object)jSONArray2);
            this.storeClicks(jSONObject);
        }
    }

    private final void storeClicks(JSONObject object) {
        SharedPreferences sharedPreferences2 = preferences;
        if (sharedPreferences2 != null && (sharedPreferences2 = sharedPreferences2.edit()) != null) {
            object = object.toString();
            String string2 = CLICKS_DATA;
            if ((object = sharedPreferences2.putString(string2, (String)object)) != null) {
                object.apply();
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean addEventData(JSONObject jSONObject, long l2) {
        Object object = jSONObject;
        synchronized (this) {
            Throwable throwable2;
            block35: {
                boolean bl2;
                block33: {
                    Object object2 = "First event logged at: ";
                    String string2 = "batchDataObj: ";
                    Object object3 = "eventObject: ";
                    bl2 = false;
                    try {
                        long l3;
                        long l4;
                        int n3;
                        int n4;
                        long l7;
                        String string3;
                        Object object4;
                        int n7;
                        String string4;
                        boolean bl3;
                        JSONObject jSONObject2 = this.getConfigs();
                        if (jSONObject == null) break block33;
                        Object object5 = new StringBuilder((String)object3);
                        ((StringBuilder)object5).append(jSONObject);
                        object3 = ((StringBuilder)object5).toString();
                        object5 = "message";
                        Intrinsics.checkNotNullParameter(object3, (String)object5);
                        object3 = JioAds.Companion;
                        object5 = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object5 = JioAds$LogLevel.NONE;
                        object5 = preferences;
                        int n8 = 0;
                        String string5 = null;
                        if (object5 != null && !(bl3 = object5.contains(string4 = RETARGETING_DATA))) {
                            object5 = new JSONArray();
                            string4 = new JSONObject();
                        } else {
                            object5 = preferences;
                            if (object5 != null) {
                                string4 = RETARGETING_DATA;
                                object5 = object5.getString(string4, null);
                            } else {
                                bl3 = false;
                                object5 = null;
                            }
                            boolean bl4 = TextUtils.isEmpty((CharSequence)object5);
                            if (!bl4) {
                                if (object5 != null) {
                                    string4 = new JSONObject((String)object5);
                                } else {
                                    bl4 = false;
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    object5 = "batchData";
                                    object5 = string4.optJSONArray((String)object5);
                                } else {
                                    bl3 = false;
                                    object5 = null;
                                }
                            } else {
                                bl3 = false;
                                object5 = null;
                                bl4 = false;
                                string4 = null;
                            }
                        }
                        if (jSONObject2 != null && (n7 = jSONObject2.has((String)(object4 = "maxEvents"))) != 0) {
                            object4 = this.getConfigs();
                            Intrinsics.checkNotNull(object4);
                            string3 = "maxEvents";
                            maxEventSize = n7 = object4.optInt(string3);
                        }
                        if ((object4 = preferences) != null) {
                            string3 = "firstLoggedTime";
                            l7 = -1;
                            long l8 = object4.getLong(string3, l7);
                            object4 = l8;
                        } else {
                            n7 = 0;
                            object4 = null;
                        }
                        int n10 = 1;
                        if (object5 != null && (n4 = object5.length()) == 0) {
                            string5 = "tms";
                            n8 = object.has(string5);
                            if (n8 != 0) {
                                string5 = "tms";
                                string5 = object.optString(string5);
                                object4 = Utility.INSTANCE;
                                l7 = ((Utility)object4).toMillis(string5);
                                object4 = l7;
                                StringBuilder stringBuilder = new StringBuilder((String)object2);
                                stringBuilder.append(string5);
                                object2 = stringBuilder.toString();
                                string5 = "message";
                                Intrinsics.checkNotNullParameter(object2, string5);
                                object2 = ((JioAds$Companion)object3).getInstance();
                                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object2 = preferences;
                                if (object2 != null && (object2 = object2.edit()) != null && (object2 = object2.putLong(string5 = "firstLoggedTime", l7)) != null) {
                                    object2.apply();
                                }
                            }
                            this.createNewBatch((JSONArray)object5, (JSONObject)object);
                        } else {
                            Intrinsics.checkNotNull(object5);
                            int n14 = object5.length() - n10;
                            object2 = object5.optJSONObject(n14);
                            String string6 = "queueCount";
                            n4 = object2.optInt(string6);
                            int n15 = maxEventSize;
                            if (n4 < n15) {
                                string6 = "commonPayload";
                                if ((string6 = object2.optJSONObject(string6)) != null) {
                                    string5 = "data";
                                    string5 = string6.optJSONArray(string5);
                                }
                                if (string5 != null) {
                                    string5.put(object);
                                }
                                if (string6 != null) {
                                    object = "data";
                                    string6.put((String)object, (Object)string5);
                                }
                                object = "commonPayload";
                                object2.put((String)object, (Object)string6);
                                object = "queueCount";
                                string5 = "queueCount";
                                n8 = object2.optInt(string5) + n10;
                                object2.put((String)object, n8);
                                object = "queueCount";
                                n3 = object2.optInt((String)object);
                                n14 = maxEventSize;
                                if (n3 == n14) {
                                    bl2 = true;
                                }
                            } else {
                                this.createNewBatch((JSONArray)object5, (JSONObject)object);
                            }
                        }
                        Intrinsics.checkNotNull(string4);
                        object = "batchData";
                        string4.put((String)object, object5);
                        object = new StringBuilder(string2);
                        ((StringBuilder)object).append((Object)string4);
                        object = ((StringBuilder)object).toString();
                        object2 = "message";
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        object = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = preferences;
                        if (object != null && (object = object.edit()) != null && (object = object.putString((String)(object2 = RETARGETING_DATA), string2 = string4.toString())) != null) {
                            object.apply();
                        }
                        if (jSONObject2 != null && (n3 = jSONObject2.has((String)(object = "maxStorageTime"))) != 0) {
                            object = "maxStorageTime";
                            l4 = jSONObject2.getLong((String)object);
                        } else {
                            l4 = l2;
                        }
                        if (object4 != null && (n3 = (int)(this.isStorageTimeReached(l4, l3 = ((Long)object4).longValue()) ? 1 : 0)) != 0) {
                            object = "storage time limit reached";
                            object2 = "message";
                            Intrinsics.checkNotNullParameter(object, (String)object2);
                            object = ((JioAds$Companion)object3).getInstance();
                            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            return n10 != 0;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block35;
                    }
                    catch (JSONException jSONException) {}
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    public final Pair checkProductAvailbleForConversionLevel(String object, Event object2, boolean bl2) {
        Object object3;
        int n3;
        int n4 = 1;
        String string2 = "productId";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "eventName");
        int n7 = 2;
        Object object4 = RetargetPref.getEventConversionData$default(this, object2, null, n7, null);
        if (object4 != null) {
            object4 = ((ConversionDataModel)object4).b;
        } else {
            n7 = 0;
            object4 = null;
        }
        Object object5 = this.removeExpiredAddAndRemoveCartClick((String)object, (Integer)object4, bl2);
        JSONObject jSONObject = this.getClicksData();
        if (jSONObject != null && (n3 = ((Boolean)(object3 = (Boolean)((Pair)object5).a)).booleanValue()) == 0) {
            object3 = "clicks";
            jSONObject = jSONObject.getJSONArray((String)object3);
            n3 = jSONObject.length();
            for (int i3 = 0; i3 < n3; i3 += n4) {
                JSONObject jSONObject2;
                try {
                    jSONObject2 = jSONObject.getJSONObject(i3);
                }
                catch (JSONException jSONException) {}
                String string3 = jSONObject2.getString(string2);
                boolean bl3 = b.i(string3, (String)object, n4 != 0);
                if (!bl3) continue;
                String string4 = "timeStamp";
                long l2 = jSONObject2.getLong(string4);
                object = new Date(l2);
                l2 = ((Date)object).getTime();
                long l3 = this.getEventTimeout((Event)((Object)object2), (Integer)object4);
                l2 += l3;
                object2 = new StringBuilder();
                object4 = "duration : ";
                ((StringBuilder)object2).append((String)object4);
                l3 = ((Date)object).getTime();
                ((StringBuilder)object2).append(l3);
                object4 = " and timeOutDuration : ";
                ((StringBuilder)object2).append((String)object4);
                ((StringBuilder)object2).append(l2);
                object2 = ((StringBuilder)object2).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object2 = JioAds.Companion;
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                long l4 = ((Date)object).getTime();
                n7 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
                if (n7 <= 0) {
                    object2 = Boolean.TRUE;
                    string4 = "clickId";
                    string4 = jSONObject2.getString(string4);
                    object = new Pair(object2, string4);
                } else {
                    object2 = Boolean.FALSE;
                    object = new Pair(object2, null);
                }
                return object;
                break;
            }
        }
        object2 = Boolean.FALSE;
        object5 = ((Pair)object5).b;
        object = new Pair(object2, object5);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final xs3_0 checkProductAvailbleForConversionLevel1(List var1_1, Event var2_2) {
        block36: {
            block37: {
                block32: {
                    var3_3 = this;
                    var4_4 /* !! */  = var2_2;
                    var5_5 = var1_1;
                    Intrinsics.checkNotNullParameter(var1_1, "productIds");
                    Intrinsics.checkNotNullParameter((Object)var2_2, "eventName");
                    var6_6 = 2;
                    var7_7 = null;
                    var8_8 = RetargetPref.getEventConversionData$default(this, var2_2, null, var6_6, null);
                    if (var8_8 != null) {
                        var7_7 = var8_8.b;
                    }
                    var3_3.removeExpiredPurchaseClick(var7_7);
                    var8_8 = this.getClicksData();
                    var9_9 = new ArrayList<E>();
                    var10_10 = new LinkedHashMap<E, String>();
                    if (var8_8 == null) break block37;
                    var11_11 = "clicks";
                    var8_8 = var8_8.getJSONArray(var11_11);
                    try {
                        var5_5 = var1_1.iterator();
                        var12_12 = false;
                        var13_13 = 0.0f;
                        var11_11 = null;
                    }
                    catch (JSONException v4) {}
                    while (true) {
                        var14_14 = var5_5.hasNext();
                        if (!var14_14) break block32;
                        var15_15 /* !! */  = var5_5.next();
                        var15_15 /* !! */  = (String)var15_15 /* !! */ ;
                        var16_16 = var8_8.length();
                        for (var17_17 = 0; var17_17 < var16_16; ++var17_17) {
                            block35: {
                                block34: {
                                    block33: {
                                        var18_18 = var8_8.getJSONObject(var17_17);
                                        var19_19 = "productId";
                                        var19_19 = var18_18.getString((String)var19_19);
                                        var20_20 = true;
                                        var21_21 = b.i((String)var19_19, var15_15 /* !! */ , var20_20);
                                        if (var21_21 == 0) break block33;
                                        var19_19 = "conversionLevel";
                                        var21_21 = var18_18.getInt((String)var19_19);
                                        if (var7_7 != null) break block34;
                                    }
                                    while (true) {
                                        var22_22 = var12_12;
                                        var23_23 = var13_13;
                                        break block35;
                                        break;
                                    }
                                }
                                if (var21_21 != (var24_24 = var7_7.intValue())) ** continue;
                                var25_25 = "timeStamp";
                                var22_22 = var12_12;
                                var23_23 = var13_13;
                                var26_26 = var18_18.getLong((String)var25_25);
                                var19_19 = new Date(var26_26);
                                var26_26 = var19_19.getTime();
                                var25_25 = RetargetPref.INSTANCE;
                                var28_27 = super.getEventTimeout(var4_4 /* !! */ , var7_7);
                                var26_26 += var28_27;
                                try {
                                    var28_27 = var19_19.getTime();
                                }
                                catch (JSONException v1) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var31_30 = var22_22;
                                        break block36;
                                        break;
                                    }
                                }
                                var21_21 = (int)(var28_27 == var26_26 ? 0 : (var28_27 < var26_26 ? -1 : 1));
                                if (var21_21 <= 0) {
                                    try {
                                        var9_9.add(var15_15 /* !! */ );
                                        var30_28 = "clickId";
                                    }
                                    catch (JSONException v0) {
                                        var31_30 = true;
                                        break block36;
                                    }
                                    var30_28 = var18_18.getString(var30_28);
                                    var11_11 = "getString(...)";
                                    Intrinsics.checkNotNullExpressionValue(var30_28, var11_11);
                                    var10_10.put(var15_15 /* !! */ , var30_28);
                                    var12_12 = true;
                                    var13_13 = 1.4E-45f;
                                    continue;
                                }
                                break block35;
                                catch (JSONException v2) {
                                    var22_22 = var12_12;
                                    var23_23 = var13_13;
                                    ** continue;
                                }
                            }
                            var12_12 = var22_22;
                            var13_13 = var23_23;
                        }
                        var22_22 = var12_12;
                        var23_23 = var13_13;
                    }
                    catch (JSONException v3) {}
                }
                var31_30 = var12_12;
                break block36;
            }
            var31_30 = false;
            var30_29 = null;
        }
        var8_8 = var31_30;
        var4_4 /* !! */  = new xs3_0(var8_8, var10_10, var9_9);
        return var4_4 /* !! */ ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void deleteSuccessEvent(String object) {
        Exception exception2;
        String string2;
        block10: {
            String string3;
            JSONObject jSONObject;
            String string4;
            Object object2;
            JioAds$Companion jioAds$Companion;
            Object object3;
            Object object4;
            int n3;
            block9: {
                n3 = 1;
                object4 = "batchDataArr: ";
                Intrinsics.checkNotNullParameter(object, "response");
                object3 = new JSONObject((String)object);
                object = "tid";
                object3 = object3.optString((String)object);
                l_0.h("Deleting successfully events with Transaction id: ", (String)object3);
                jioAds$Companion = JioAds.Companion;
                jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = preferences;
                if (object2 == null) return;
                string4 = RETARGETING_DATA;
                int n4 = (int)(object2.contains(string4) ? 1 : 0);
                if (n4 != n3) return;
                object2 = preferences;
                if (object2 != null) {
                    object2 = object2.getString(string4, null);
                } else {
                    n4 = 0;
                    object2 = null;
                }
                boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (bl2) return;
                string2 = "message";
                if (object2 != null) {
                    try {
                        jSONObject = new JSONObject((String)object2);
                        break block9;
                    }
                    catch (Exception exception2) {
                        break block10;
                    }
                }
                jSONObject = null;
            }
            object2 = "batchData";
            JSONArray jSONArray = jSONObject != null ? jSONObject.optJSONArray((String)object2) : null;
            CharSequence charSequence = new StringBuilder((String)object4);
            ((StringBuilder)charSequence).append(jSONArray);
            object4 = ((StringBuilder)charSequence).toString();
            Intrinsics.checkNotNullParameter(object4, string2);
            object4 = jioAds$Companion.getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (jSONArray != null) {
                int n7 = jSONArray.length();
                jioAds$Companion = null;
                for (int i3 = 0; i3 < n7; i3 += n3) {
                    int n8;
                    boolean bl3;
                    charSequence = jSONArray.optJSONObject(i3);
                    if (charSequence != null) {
                        charSequence = charSequence.optString((String)object);
                    } else {
                        bl3 = false;
                        charSequence = null;
                    }
                    Object object5 = new StringBuilder();
                    String string5 = "existingTransactionId: ";
                    ((StringBuilder)object5).append(string5);
                    ((StringBuilder)object5).append((String)charSequence);
                    object5 = ((StringBuilder)object5).toString();
                    Intrinsics.checkNotNullParameter(object5, string2);
                    object5 = JioAds.Companion;
                    object5 = ((JioAds$Companion)object5).getInstance();
                    ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object5 = JioAds$LogLevel.NONE;
                    if (charSequence == null || (n8 = ((String)charSequence).length()) == 0 || !(bl3 = Intrinsics.areEqual(charSequence, object3))) continue;
                    jSONArray.remove(i3);
                }
                jSONObject.put((String)object2, (Object)jSONArray);
                object = new StringBuilder();
                string3 = "After deleting queue batchDataObj with matching Transaction id: ";
                ((StringBuilder)object).append(string3);
                ((StringBuilder)object).append(jSONObject);
                object = ((StringBuilder)object).toString();
                Intrinsics.checkNotNullParameter(object, string2);
                object = JioAds.Companion;
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            if ((object = preferences) == null) return;
            if ((object = object.edit()) == null) return;
            string3 = String.valueOf(jSONObject);
            if ((object = object.putString(string4, string3)) == null) return;
            object.apply();
            return;
        }
        Intrinsics.checkNotNullParameter(String.valueOf(exception2.getMessage()), string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final boolean editSharedPref(String string2, int n3) {
        synchronized (this) {
            boolean bl2;
            Throwable throwable2;
            block7: {
                Object object = preferences;
                object = object != null ? object.edit() : null;
                catch (Throwable throwable2) {
                    break block7;
                }
                if (object != null) {
                    object.putInt(string2, n3);
                }
                if (object != null) {
                    object.apply();
                }
                bl2 = true;
            }
            throw throwable2;
            {
                catch (Exception exception) {
                    bl2 = false;
                    string2 = null;
                }
            }
            return bl2;
        }
    }

    public final boolean fireIfQueueFull() {
        int n3;
        block15: {
            int n4;
            Object object = preferences;
            String string2 = RETARGETING_DATA;
            n3 = 1;
            if (object != null && (n4 = object.contains(string2)) == n3) break block15;
            object = preferences;
            JSONArray jSONArray = null;
            if (object != null) {
                object = object.getString(string2, null);
            } else {
                n4 = 0;
                object = null;
            }
            int n7 = TextUtils.isEmpty((CharSequence)object);
            if (n7 != 0) break block15;
            if (object != null) {
                string2 = new JSONObject((String)object);
            } else {
                n7 = 0;
                string2 = null;
            }
            if (string2 != null) {
                object = "batchData";
                jSONArray = string2.optJSONArray((String)object);
            }
            if (jSONArray == null) break block15;
            n4 = jSONArray.length();
            string2 = null;
            for (n7 = 0; n7 < n4; ++n7) {
                String string3;
                JSONObject jSONObject;
                try {
                    jSONObject = jSONArray.optJSONObject(n7);
                    string3 = "queueCount";
                }
                catch (Exception exception) {}
                int n8 = jSONObject.optInt(string3);
                int n10 = maxEventSize;
                if (n8 < n10) {
                    continue;
                }
                break;
            }
        }
        n3 = 0;
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final JSONArray getBatchData() {
        void var1_5;
        boolean bl2;
        SharedPreferences sharedPreferences2 = preferences;
        JSONArray jSONArray = null;
        if (sharedPreferences2 == null) return jSONArray;
        String string2 = RETARGETING_DATA;
        boolean bl3 = sharedPreferences2.contains(string2);
        if (bl3 != (bl2 = true)) return jSONArray;
        SharedPreferences sharedPreferences3 = preferences;
        if (sharedPreferences3 != null) {
            String string3 = sharedPreferences3.getString(string2, null);
        } else {
            bl3 = false;
            Object var1_4 = null;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)var1_5);
        if (bl4) return jSONArray;
        if (var1_5 != null) {
            string2 = new JSONObject((String)var1_5);
        } else {
            bl4 = false;
            string2 = null;
        }
        if (string2 == null) return jSONArray;
        String string4 = "batchData";
        try {
            return string2.optJSONArray(string4);
        }
        catch (Exception exception) {
            return jSONArray;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final JSONObject getBatchDataObj() {
        SharedPreferences sharedPreferences2;
        boolean bl2;
        SharedPreferences sharedPreferences3 = preferences;
        String string2 = null;
        if (sharedPreferences3 == null) return string2;
        String string3 = RETARGETING_DATA;
        boolean bl3 = sharedPreferences3.contains(string3);
        if (bl3 != (bl2 = true)) return string2;
        try {
            sharedPreferences2 = preferences;
            if (sharedPreferences2 == null) return string2;
        }
        catch (JSONException jSONException) {
            return string2;
        }
        String string4 = sharedPreferences2.getString(string3, null);
        if (string4 == null) return string2;
        string3 = new JSONObject(string4);
        return string3;
    }

    public final String getConfigEnvironment() {
        boolean bl2;
        String string2;
        boolean bl3;
        Object object = preferences;
        Object object2 = null;
        if (object != null && (bl3 = object.contains(string2 = CONFIG_ENVIRONMENT)) == (bl2 = true)) {
            object = preferences;
            if (object != null && (object = object.getString(string2, null)) != null) {
                object2 = object;
            }
            return String.valueOf(object2);
        }
        return null;
    }

    public final Boolean getConfigInit() {
        boolean bl2;
        String string2;
        boolean bl3;
        SharedPreferences sharedPreferences2 = preferences;
        Boolean bl4 = null;
        if (sharedPreferences2 != null && (bl3 = sharedPreferences2.contains(string2 = CONFIG_INIT)) == (bl2 = true) && (sharedPreferences2 = preferences) != null) {
            bl3 = sharedPreferences2.getBoolean(string2, bl2);
            bl4 = bl3;
        }
        return bl4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final JSONObject getConfigs() {
        SharedPreferences sharedPreferences2;
        boolean bl2;
        SharedPreferences sharedPreferences3 = preferences;
        String string2 = null;
        if (sharedPreferences3 == null) return string2;
        String string3 = CONFIGS;
        boolean bl3 = sharedPreferences3.contains(string3);
        if (bl3 != (bl2 = true)) return string2;
        try {
            sharedPreferences2 = preferences;
            if (sharedPreferences2 == null) return string2;
        }
        catch (JSONException jSONException) {
            return string2;
        }
        String string4 = sharedPreferences2.getString(string3, null);
        if (string4 == null) return string2;
        string3 = new JSONObject(string4);
        return string3;
    }

    public final ConversionDataModel getEventConversionData(Event event, Integer n3) {
        String string2;
        boolean bl2;
        Object object = n3;
        JSONObject jSONObject = this.getConfigs();
        if (jSONObject != null && (bl2 = jSONObject.has(string2 = "ecommConfig"))) {
            jSONObject = jSONObject.getJSONObject(string2);
            string2 = "attribution";
            if ((jSONObject = jSONObject.optJSONArray(string2)) != null) {
                int n4 = jSONObject.length();
                bl2 = false;
                for (int i3 = 0; i3 < n4; ++i3) {
                    int n7;
                    Object object2;
                    Object object3;
                    boolean bl3;
                    String string3;
                    Object object4;
                    String string4;
                    Integer n8;
                    int n10;
                    Object object5 = jSONObject.optJSONObject(i3);
                    Object object6 = "event";
                    String string5 = object5 != null ? object5.optString((String)object6) : null;
                    Object object7 = "value";
                    if (object5 != null) {
                        n10 = object5.optInt((String)object7);
                        n8 = n10;
                    } else {
                        n10 = 0;
                        n8 = null;
                    }
                    String string6 = object5 != null ? (string4 = object5.optString("level")) : null;
                    if (object5 != null) {
                        int n14 = object5.optInt((String)object7);
                        object4 = object7 = Integer.valueOf(n14);
                    } else {
                        object4 = null;
                    }
                    Object object8 = object5 != null ? (object7 = object5.optString("linkedTo")) : null;
                    if (object5 != null) {
                        object6 = object5.optString((String)object6);
                        string3 = object6;
                    } else {
                        string3 = null;
                    }
                    if (object5 != null) {
                        bl3 = object5.optInt("timeout");
                        object3 = object6 = Integer.valueOf((int)(bl3 ? 1 : 0));
                    } else {
                        object3 = null;
                    }
                    if (object5 != null) {
                        object6 = "unitOfTime";
                        object2 = object5 = object5.optString((String)object6);
                    } else {
                        object2 = null;
                    }
                    if (object != null) {
                        n7 = n3;
                    } else {
                        n7 = 0;
                        object5 = null;
                    }
                    if (n7 > 0) {
                        n7 = (int)(Intrinsics.areEqual(object, n8) ? 1 : 0);
                        if (n7 == 0) continue;
                        object = new ConversionDataModel(string6, (Integer)object4, (String)object8, string3, (String)object2, (Integer)object3);
                        return object;
                    }
                    if (event != null) {
                        object5 = event.name();
                    } else {
                        n7 = 0;
                        object5 = null;
                    }
                    bl3 = true;
                    n7 = (int)(b.i((String)object5, string5, bl3) ? 1 : 0);
                    if (n7 == 0) continue;
                    object = new ConversionDataModel(string6, (Integer)object4, (String)object8, string3, (String)object2, (Integer)object3);
                    return object;
                }
            }
        }
        return null;
    }

    public final int isFirstLaunch() {
        SharedPreferences sharedPreferences2 = preferences;
        if (sharedPreferences2 == null) {
            return -1;
        }
        Intrinsics.checkNotNull(sharedPreferences2);
        return sharedPreferences2.getInt("firstLaunch", 0);
    }

    public final void removeConversionClicks(List iterator) {
        Intrinsics.checkNotNullParameter(iterator, "productIds");
        JSONObject jSONObject = this.getClicksData();
        if (jSONObject != null) {
            boolean bl2;
            String string2 = "clicks";
            JSONArray jSONArray = jSONObject.getJSONArray(string2);
            Serializable serializable = new ArrayList();
            iterator = iterator.iterator();
            block0: while (true) {
                boolean bl3 = iterator.hasNext();
                bl2 = true;
                if (!bl3) break;
                String string3 = (String)iterator.next();
                int n3 = jSONArray.length();
                int n4 = 0;
                while (true) {
                    if (n4 >= n3) continue block0;
                    Object object = jSONArray.getJSONObject(n4);
                    String string4 = "productId";
                    boolean bl4 = b.i((String)(object = object.getString(string4)), string3, bl2);
                    if (bl4) {
                        object = n4;
                        ((ArrayList)serializable).add(object);
                    }
                    ++n4;
                }
                break;
            }
            boolean bl5 = ((ArrayList)serializable).isEmpty() ^ bl2;
            if (bl5) {
                int n7;
                iterator = ((ArrayList)serializable).iterator();
                while ((n7 = iterator.hasNext()) != 0) {
                    serializable = (Number)iterator.next();
                    n7 = ((Number)serializable).intValue();
                    jSONArray.remove(n7);
                }
                jSONObject.put(string2, (Object)jSONArray);
            }
            this.storeClicks(jSONObject);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void storeClickIds(String object, String object2, Integer n3, Uri object3) {
        Object object4;
        Object object5;
        String string2;
        String string3;
        JSONObject jSONObject;
        block33: {
            block32: {
                try {
                    jSONObject = this.getClicksData();
                    if (object3 == null) break block32;
                    object = "cid";
                }
                catch (JSONException jSONException) {
                    return;
                }
                object = object3.getQueryParameter((String)object);
                string3 = "utm_id";
                String string4 = object3.getQueryParameter(string3);
                if (string4 == null) break block32;
                boolean bl2 = b.k(string4);
                if (bl2) break block32;
                object2 = string4;
            }
            string2 = "clicks";
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                string3 = new JSONArray();
                break block33;
            }
            string3 = jSONObject.getJSONArray(string2);
            object5 = "getJSONArray(...)";
            Intrinsics.checkNotNullExpressionValue(string3, (String)object5);
            if (object2 == null) break block33;
            object5 = this.checkProductIdExists((JSONArray)string3, (String)object2);
            object4 = ((Pair)object5).a;
            object4 = (Boolean)object4;
            boolean bl3 = (Boolean)object4;
            if (!bl3) break block33;
            object5 = ((Pair)object5).b;
            object5 = (Number)object5;
            int n4 = ((Number)object5).intValue();
            string3.remove(n4);
        }
        object5 = new JSONObject();
        object4 = "clickId";
        object5.put((String)object4, object);
        object = "productId";
        object5.put((String)object, object2);
        object = "conversionLevel";
        object5.put((String)object, (Object)n3);
        object = "timeStamp";
        object2 = new Date();
        long l2 = ((Date)object2).getTime();
        object5.put((String)object, l2);
        string3.put(object5);
        jSONObject.put(string2, (Object)string3);
        this.storeClicks(jSONObject);
        object = new Date();
        ((Date)object).getTime();
        int n7 = 1;
        object2 = null;
        RetargetPref.getEventTimeout$default(this, null, n3, n7, null);
    }

    public final void storeConfig(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "jsonData");
        SharedPreferences sharedPreferences2 = preferences;
        if (sharedPreferences2 != null && (sharedPreferences2 = sharedPreferences2.edit()) != null) {
            object = object.toString();
            String string2 = CONFIGS;
            if ((object = sharedPreferences2.putString(string2, (String)object)) != null) {
                object.apply();
            }
        }
    }

    public final void storeConfigEnvironment(String string2) {
        String string3 = CONFIG_ENVIRONMENT;
        Intrinsics.checkNotNullParameter(string2, string3);
        SharedPreferences sharedPreferences2 = preferences;
        if (sharedPreferences2 != null && (sharedPreferences2 = sharedPreferences2.edit()) != null && (string2 = sharedPreferences2.putString(string3, string2)) != null) {
            string2.apply();
        }
    }

    public final void storeConfigInit(boolean bl2) {
        String string2;
        SharedPreferences.Editor editor;
        SharedPreferences sharedPreferences2 = preferences;
        if (sharedPreferences2 != null && (sharedPreferences2 = sharedPreferences2.edit()) != null && (editor = sharedPreferences2.putBoolean(string2 = CONFIG_INIT, bl2)) != null) {
            editor.apply();
        }
    }

    public final void updateBatch(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "batchObj");
        SharedPreferences sharedPreferences2 = preferences;
        if (sharedPreferences2 != null && (sharedPreferences2 = sharedPreferences2.edit()) != null) {
            object = object.toString();
            String string2 = RETARGETING_DATA;
            if ((object = sharedPreferences2.putString(string2, (String)object)) != null) {
                object.apply();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void updateRetryCount(int n3) {
        Exception exception2;
        String string2;
        block14: {
            int n4;
            JSONObject jSONObject;
            Integer n7;
            int n8;
            int n10;
            int n14;
            String string3;
            Object object;
            Object object2;
            Object object3;
            String string4;
            Object object4;
            block13: {
                object4 = "maxRetries";
                string4 = "Max retry attempts are done for batch: ";
                object3 = "currCount: ";
                object2 = new StringBuilder("Updating Retry Count of index: ");
                ((StringBuilder)object2).append(n3);
                object2 = ((StringBuilder)object2).toString();
                string2 = "message";
                Intrinsics.checkNotNullParameter(object2, string2);
                object2 = JioAds.Companion;
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = preferences;
                if (object == null) return;
                string3 = RETARGETING_DATA;
                n14 = (int)(object.contains(string3) ? 1 : 0);
                if (n14 != (n10 = 1)) return;
                object = preferences;
                n8 = 0;
                n7 = null;
                if (object != null) {
                    object = object.getString(string3, null);
                } else {
                    n14 = 0;
                    object = null;
                }
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) return;
                if (object != null) {
                    try {
                        jSONObject = new JSONObject((String)object);
                        break block13;
                    }
                    catch (Exception exception2) {
                        break block14;
                    }
                }
                bl2 = false;
                jSONObject = null;
            }
            if (jSONObject != null) {
                object = "batchData";
                object = jSONObject.optJSONArray((String)object);
            } else {
                n14 = 0;
                object = null;
            }
            if (object != null) {
                object = object.optJSONObject(n3);
            } else {
                n14 = 0;
                object = null;
            }
            String string5 = "retryCount";
            if (object != null) {
                n8 = object.optInt(string5);
                n7 = n8;
            }
            StringBuilder stringBuilder = new StringBuilder((String)object3);
            stringBuilder.append(n7);
            object3 = stringBuilder.toString();
            Intrinsics.checkNotNullParameter(object3, string2);
            object3 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = this.getConfigs();
            Intrinsics.checkNotNull(object3);
            int n15 = object3.has((String)object4);
            if (n15 != 0) {
                object3 = this.getConfigs();
                Intrinsics.checkNotNull(object3);
                n4 = object3.optInt((String)object4);
            } else {
                n4 = 0;
                object4 = null;
            }
            if (n7 == null) return;
            n15 = n7;
            if (n15 < n4) {
                Object object5 = "Incrementing Retry Count";
                Intrinsics.checkNotNullParameter(object5, string2);
                object5 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                n3 = n7 + n10;
                object.put(string5, n3);
                object5 = preferences;
                if (object5 == null) return;
                if ((object5 = object5.edit()) == null) return;
                object4 = jSONObject.toString();
                if ((object5 = object5.putString(string3, (String)object4)) == null) return;
                object5.apply();
                return;
            }
            object4 = new StringBuilder(string4);
            ((StringBuilder)object4).append(n3);
            string4 = ", so deleting from storage";
            ((StringBuilder)object4).append(string4);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, string2);
            object4 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.deleteQueue(n3);
            return;
        }
        Intrinsics.checkNotNullParameter(String.valueOf(exception2.getMessage()), string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

