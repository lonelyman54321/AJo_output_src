/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.retargeting;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.b$b;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.util.k;
import com.jio.retargeting.JioAdsEventService$AsyncEventHandler;
import com.jio.retargeting.TrackerType;
import com.jio.retargeting.controller.ConfigController;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.data.ConversionDataModel;
import com.jio.retargeting.data.CustomerDetails;
import com.jio.retargeting.data.Filters;
import com.jio.retargeting.datastore.RetargetPref;
import com.jio.retargeting.events.AddToCartEvent;
import com.jio.retargeting.events.AddToWishListEvent;
import com.jio.retargeting.events.AppLaunchEvent;
import com.jio.retargeting.events.AppUserDetailsEvent;
import com.jio.retargeting.events.CartViewEvent;
import com.jio.retargeting.events.CustomDataEvent;
import com.jio.retargeting.events.DeepLinkLaunchEvent;
import com.jio.retargeting.events.DeviceInformationEvent;
import com.jio.retargeting.events.LocationEvent;
import com.jio.retargeting.events.PageViewEvent;
import com.jio.retargeting.events.ProductCancelledEvent;
import com.jio.retargeting.events.ProductListViewEvent;
import com.jio.retargeting.events.ProductSearchViewEvent;
import com.jio.retargeting.events.ProductViewEvent;
import com.jio.retargeting.events.PurchaseCompleteEvent;
import com.jio.retargeting.events.PurchaseReturnEvent;
import com.jio.retargeting.events.RemoveFromCartEvent;
import com.jio.retargeting.events.RemoveFromWishListEvent;
import com.jio.retargeting.events.a;
import com.jio.retargeting.network.EventDataUploadWorker;
import com.jio.retargeting.network.NetworkTaskListener;
import com.jio.retargeting.refelction.AdsSdkReflection;
import com.jio.retargeting.util.Event;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JioAdsEventService
implements NetworkTaskListener {
    private String appPackageName;
    private final Map ccbToProductIdMap;
    private final Context context;
    private ExecutorService executor;
    private boolean isConfigCalled;
    private boolean isInitialized;
    private final bk3_2 jsonSerializer;
    private li3_1 mWorkManager;
    private List oneTimeWorkRequestList;
    private int requestTimeOut;

    public JioAdsEventService(Context object) {
        boolean bl2;
        int n3;
        int n4;
        boolean bl3;
        int n7;
        Object object2;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        this.context = object;
        this.jsonSerializer = object2;
        this.executor = object2 = Executors.newSingleThreadExecutor();
        object2 = new LinkedHashMap();
        this.ccbToProductIdMap = object2;
        this.requestTimeOut = n7 = 20;
        j.a("Retargeting SDK version 2.1.10");
        object2 = Utility.INSTANCE;
        ((Utility)object2).setContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object);
        Object object3 = RetargetPref.INSTANCE;
        Object object4 = ((RetargetPref)object3).getConfigInit();
        if (object4 != null && !(bl3 = ((ConfigController)(object4 = new ConfigController((Context)object, this, n4 = this.getRequestTimeout()))).isConfigExpired())) {
            object3 = ((RetargetPref)object3).getConfigInit();
            object4 = Boolean.TRUE;
            n3 = (int)(Intrinsics.areEqual(object3, object4) ? 1 : 0);
        } else {
            n3 = 0;
            object3 = null;
        }
        ((Utility)object2).setConfigInit(n3 != 0);
        object2 = this.appPackageName;
        n7 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n7 == 0) {
            n3 = this.getRequestTimeout();
            object2 = new ConfigController((Context)object, this, n3);
            object3 = String.valueOf(this.appPackageName);
            ((ConfigController)object2).fetchConfig((String)object3);
        } else {
            n3 = this.getRequestTimeout();
            object2 = new ConfigController((Context)object, this, n3);
            object3 = object.getPackageName().toString();
            ((ConfigController)object2).fetchConfig((String)object3);
        }
        Intrinsics.checkNotNullParameter(object, string2);
        object = ni3_1.i(object);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(context)");
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(...)");
        this.mWorkManager = object;
        this.isInitialized = bl2 = true;
        this.isConfigCalled = bl2;
    }

    public static final /* synthetic */ void access$sendBatchedEvents(JioAdsEventService jioAdsEventService) {
        jioAdsEventService.sendBatchedEvents();
    }

    public static final /* synthetic */ void access$setOneTimeWorkRequestList$p(JioAdsEventService jioAdsEventService, List list) {
        jioAdsEventService.oneTimeWorkRequestList = list;
    }

    private final List createUrls(List object, xs3_0 xs3_02, String string2, int n3, Integer n4) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            int n7;
            Object object2 = (CartProduct)object.next();
            Object object3 = (Map)xs3_02.b;
            Object object4 = ((CartProduct)object2).getProductId();
            if ((object3 = (CharSequence)object3.get(object4)) == null || (n7 = object3.length()) == 0) continue;
            object3 = new Object();
            object4 = this.getConversionDomainUrl();
            ((k)object3).a = object4;
            object4 = (Map)xs3_02.b;
            String string3 = ((CartProduct)object2).getProductId();
            if ((object4 = (String)object4.get(string3)) == null) {
                object4 = "";
            }
            ((k)object3).d = object4;
            ((k)object3).A = n4;
            ((k)object3).B = object4 = Integer.valueOf(n3);
            ((k)object3).y = string2;
            int n8 = ((CartProduct)object2).getQuantity();
            int n10 = ((CartProduct)object2).getPrice() * n8;
            ((k)object3).C = object4 = Integer.valueOf(n10);
            ((k)object3).D = object4 = Integer.valueOf(((CartProduct)object2).getQuantity());
            n8 = ((CartProduct)object2).getPrice();
            ((k)object3).E = object4 = Integer.valueOf(n8);
            ((k)object3).z = object2 = String.valueOf(((CartProduct)object2).getProductId());
            object2 = Utility.INSTANCE.replaceMacros((k)object3);
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static /* synthetic */ List createUrls$default(JioAdsEventService jioAdsEventService, List list, xs3_0 xs3_02, String string2, int n3, Integer n4, int n7, Object object) {
        int n8;
        if ((n7 &= 8) != 0) {
            n3 = 0;
            n8 = 0;
        } else {
            n8 = n3;
        }
        return jioAdsEventService.createUrls(list, xs3_02, string2, n8, n4);
    }

    private final void createUrlsAndFireUrl(Pair object, CartProduct object2, String object3, Integer n3, boolean bl2) {
        RetargetPref retargetPref = RetargetPref.INSTANCE;
        Object object4 = (Boolean)((Pair)object).a;
        boolean n4 = (Boolean)object4;
        if (n4) {
            int n7;
            object4 = object = ((Pair)object).b;
            object4 = (CharSequence)object;
            if (object4 != null && (n7 = object4.length()) != 0) {
                object4 = new Object();
                Object object5 = this.getConversionDomainUrl();
                ((k)object4).a = object5;
                object5 = object;
                object5 = (String)object;
                if (object5 == null) {
                    object5 = "";
                }
                ((k)object4).d = object5;
                ((k)object4).A = n3;
                ((k)object4).B = object5 = Integer.valueOf(0);
                ((k)object4).y = object3;
                int n8 = ((CartProduct)object2).getQuantity();
                int n10 = ((CartProduct)object2).getPrice() * n8;
                ((k)object4).C = object3 = Integer.valueOf(n10);
                ((k)object4).D = object3 = Integer.valueOf(((CartProduct)object2).getQuantity());
                n8 = ((CartProduct)object2).getPrice();
                ((k)object4).E = object3 = Integer.valueOf(n8);
                ((k)object4).z = object3 = String.valueOf(((CartProduct)object2).getProductId());
                object5 = kotlin.collections.a.b(Utility.INSTANCE.replaceMacros((k)object4));
                object3 = this.context;
                object4 = new AdsSdkReflection((Context)object3);
                object3 = new StringBuilder("Conversion Level ");
                ((StringBuilder)object3).append(n3);
                String string2 = ((StringBuilder)object3).toString();
                int n14 = 44;
                AdsSdkReflection.callFireUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((AdsSdkReflection)object4, (List)object5, null, null, false, string2, null, n14, null);
                if (bl2) {
                    object3 = Event.PURCHASE_COMPLETED;
                    int n15 = 2;
                    bl2 = false;
                    object3 = RetargetPref.getEventConversionData$default(retargetPref, (Event)((Object)object3), null, n15, null);
                    object = (String)object;
                    object2 = ((CartProduct)object2).getProductId();
                    if (object3 != null) {
                        object3 = ((ConversionDataModel)object3).b;
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    retargetPref.storeClickIds((String)object, (String)object2, (Integer)object3, null);
                }
            }
        }
    }

    public static /* synthetic */ void createUrlsAndFireUrl$default(JioAdsEventService jioAdsEventService, Pair pair, CartProduct cartProduct, String string2, Integer n3, boolean bl2, int n4, Object object) {
        boolean bl3;
        if ((n4 &= 0x10) != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        jioAdsEventService.createUrlsAndFireUrl(pair, cartProduct, string2, n3, bl3);
    }

    public static /* synthetic */ void fireTracker$default(JioAdsEventService jioAdsEventService, String string2, TrackerType trackerType, String string3, String string4, JSONObject jSONObject, int n3, Object object) {
        if ((n3 &= 0x10) != 0) {
            jSONObject = null;
        }
        jioAdsEventService.fireTracker(string2, trackerType, string3, string4, jSONObject);
    }

    private final String getConversionDomainUrl() {
        String string2;
        boolean bl2;
        Object object = RetargetPref.INSTANCE.getConfigs();
        object = object != null && (bl2 = object.has(string2 = "conversionUrl")) ? object.getString(string2) : null;
        if (object != null) {
            string2 = null;
            String string3 = "/";
            boolean bl3 = kotlin.text.b.h((String)object, string3, false);
            if (!bl3) {
                object = ((String)object).concat(string3);
            }
        }
        return Ft2.a((String)object, "delivery/cn.php?cid=[CID]&level=[LEVEL]&revenue=[PURCHASE_VALUE]&currency=[CURRENCY]&prdrevenue=[PRODUCT_LIST_PRICE]&prdcount=[PRODUCT_QUANTITY]&prdprice=[PRODUCT_VALUE]&prdid=[PRODUCT_ID]");
    }

    private final int getRequestTimeout() {
        return this.requestTimeOut;
    }

    private final void readEventsConfigInProgress() {
        JSONArray jSONArray = RetargetPref.INSTANCE.getBatchData();
        Object object = new StringBuilder("Batch data before config API call complete: ");
        object.append(jSONArray);
        object = object.toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        if (jSONArray != null) {
            int n3 = jSONArray.length();
            string2 = null;
            block8: for (int i3 = 0; i3 < n3; ++i3) {
                JSONObject jSONObject;
                block12: {
                    block11: {
                        jSONObject = jSONArray.optJSONObject(i3);
                        if (jSONObject == null) break block11;
                        String string3 = "commonPayload";
                        jSONObject = jSONObject.optJSONObject(string3);
                        if (jSONObject == null) break block11;
                        string3 = "data";
                        jSONObject = jSONObject.getJSONArray(string3);
                        break block12;
                    }
                    jSONObject = null;
                }
                if (jSONObject == null) continue;
                int n4 = jSONObject.length();
                if (n4 <= 0) continue;
                n4 = jSONObject.length();
                for (int i8 = 0; i8 < n4; ++i8) {
                    JSONObject jSONObject2;
                    try {
                        jSONObject2 = jSONObject.optJSONObject(i8);
                    }
                    catch (Exception exception) {}
                    this.sendSerializedEvent(jSONObject2);
                    continue;
                    continue block8;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void sendBatchedEvents() {
        Object object = "build(...)";
        Object object2 = "tid";
        String string2 = "payload";
        String string3 = "key";
        JSONArray jSONArray = RetargetPref.INSTANCE.getBatchData();
        String string4 = "message";
        if (jSONArray != null) {
            int n3 = jSONArray.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                Exception exception2;
                Object object3;
                block9: {
                    int n4;
                    JSONObject jSONObject;
                    String string5;
                    String string6;
                    Object object4;
                    int n7;
                    Object object5;
                    block8: {
                        block7: {
                            try {
                                object3 = bk3_2.a();
                                object5 = jSONArray.optJSONObject(i3);
                                n7 = 0;
                                object4 = null;
                                string6 = "commonPayload";
                                string5 = "data";
                                if (object5 == null || (jSONObject = object5.optJSONObject(string6)) == null) break block7;
                                jSONObject = jSONObject.getJSONArray(string5);
                                break block8;
                            }
                            catch (Exception exception2) {
                                break block9;
                            }
                        }
                        n4 = 0;
                        jSONObject = null;
                    }
                    if (jSONObject != null && (n4 = jSONObject.length()) > 0) {
                        if (object5 != null && (string6 = object5.optJSONObject(string6)) != null) {
                            object4 = string6.getJSONArray(string5);
                        }
                        Intrinsics.checkNotNullParameter(object3, string2);
                        object3.put(string5, object4);
                        object4 = object3.get((String)object2);
                        object5.put((String)object2, object4);
                        object5 = new LinkedHashMap();
                        object3 = String.valueOf(object3);
                        Intrinsics.checkNotNullParameter(string2, string3);
                        object5.put(string2, object3);
                        object3 = "index";
                        Intrinsics.checkNotNullParameter(object3, string3);
                        object4 = i3;
                        object5.put(object3, object4);
                        object3 = "timeout";
                        n7 = this.getRequestTimeout();
                        Intrinsics.checkNotNullParameter(object3, string3);
                        object4 = n7;
                        object5.put(object3, object4);
                        object3 = new b((Map)object5);
                        b$b.b((b)object3);
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                        object4 = EventDataUploadWorker.class;
                        string6 = "workerClass";
                        Intrinsics.checkNotNullParameter(object4, string6);
                        object5 = new CI3$a((Class)object4);
                        object3 = ((CI3$a)object5).e((b)object3);
                        object3 = (y92$a)object3;
                        object3 = ((CI3$a)object3).a();
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                        object3 = (y92)object3;
                        object5 = this.oneTimeWorkRequestList;
                        if (object5 == null) continue;
                        object5.add(object3);
                        continue;
                    }
                    jSONArray.remove(i3);
                    continue;
                }
                Intrinsics.checkNotNullParameter(String.valueOf(exception2.getMessage()), string4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
            }
        }
        object = new JSONObject();
        object.put("batchData", (Object)jSONArray);
        string2 = "Updated Batch Data with Transaction id : ";
        object2 = new StringBuilder(string2);
        ((StringBuilder)object2).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = RetargetPref.INSTANCE;
        ((RetargetPref)object2).updateBatch((JSONObject)object);
        object = this.oneTimeWorkRequestList;
        if (object != null) {
            object2 = this.mWorkManager;
            object = ((li3_1)object2).a((List)object);
            ((qh3_2)object).Q();
        }
    }

    private final void sendSerializedEvent(JSONObject jSONObject) {
        Object object = this.context;
        int n3 = this.getRequestTimeout();
        ConfigController configController = new ConfigController((Context)object, this, n3);
        object = this.appPackageName;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = String.valueOf(this.appPackageName);
            configController.fetchConfig((String)object);
        } else {
            object = this.context.getPackageName().toString();
            configController.fetchConfig((String)object);
        }
        if (jSONObject == null) {
            return;
        }
        object = this.executor;
        long l2 = configController.getMaxStorageTime();
        JioAdsEventService$AsyncEventHandler jioAdsEventService$AsyncEventHandler = new JioAdsEventService$AsyncEventHandler(this, jSONObject, l2);
        object.execute(jioAdsEventService$AsyncEventHandler);
    }

    public final void appPackageName(String object) {
        String string2 = "appName";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            object = this.context.getPackageName();
        }
        this.appPackageName = object;
        string2 = this.context;
        int n3 = this.getRequestTimeout();
        object = new ConfigController((Context)string2, this, n3);
        string2 = String.valueOf(this.appPackageName);
        ((ConfigController)object).fetchConfig(string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void fireTracker(String string2, TrackerType trackerType, String string3, String string4, JSONObject jSONObject) {
        Object object;
        Object object2;
        Object object3;
        int n3;
        Object object4;
        String string5;
        TrackerType trackerType2;
        Object object5;
        JioAdsEventService jioAdsEventService;
        block27: {
            boolean bl2;
            int n4;
            String string6;
            String string7;
            block26: {
                Object object6;
                String string8;
                int n7;
                jioAdsEventService = this;
                object5 = string2;
                trackerType2 = trackerType;
                string5 = string3;
                object4 = jSONObject;
                n3 = 1;
                object3 = "ads";
                Intrinsics.checkNotNullParameter(string2, (String)object3);
                object2 = "trackerType";
                Intrinsics.checkNotNullParameter((Object)trackerType, (String)object2);
                Intrinsics.checkNotNullParameter(string3, "productId");
                Intrinsics.checkNotNullParameter(string4, "adSize");
                object = new StringBuilder("Calling ");
                ((StringBuilder)object).append((Object)trackerType);
                ((StringBuilder)object).append(" fire tracker");
                j.a(((StringBuilder)object).toString());
                object = new StringBuilder("Ads Tracker JSON ");
                ((StringBuilder)object).append(string2);
                j.a(((StringBuilder)object).toString());
                object = new StringBuilder("Tracker type ");
                ((StringBuilder)object).append((Object)trackerType);
                j.a(((StringBuilder)object).toString());
                object = new StringBuilder("Product ID ");
                ((StringBuilder)object).append(string3);
                j.a(((StringBuilder)object).toString());
                Object object7 = "Ad Size ";
                object = new StringBuilder((String)object7);
                ((StringBuilder)object).append(string4);
                object = ((StringBuilder)object).toString();
                j.a((String)object);
                if (jSONObject != null) {
                    object7 = "Product options ";
                    object = new StringBuilder((String)object7);
                    ((StringBuilder)object).append(jSONObject);
                    object4 = ((StringBuilder)object).toString();
                    j.a((String)object4);
                }
                object = jioAdsEventService.context;
                object4 = new AdsSdkReflection((Context)object);
                object = new JSONObject((String)object5);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter((Object)trackerType2, (String)object2);
                object5 = "config";
                int n8 = object.has((String)object5);
                int n10 = 0;
                object2 = null;
                if (n8 != 0 && (n7 = (object5 = object.getJSONObject((String)object5)).has((String)(object3 = "cid"))) != 0) {
                    object5 = object5.getString((String)object3);
                } else {
                    boolean bl3 = false;
                    object5 = null;
                }
                object3 = "ad";
                n7 = object.has((String)object3);
                string7 = "message";
                if (n7 != 0) {
                    int n14;
                    int n15;
                    TrackerType trackerType3;
                    object3 = object.getString((String)object3);
                    object7 = new JSONObject((String)object3);
                    object3 = new ArrayList();
                    object = "viewableimptrackers";
                    int n16 = object7.has((String)object);
                    string8 = "getString(...)";
                    if (n16 != 0 && trackerType2 == (trackerType3 = TrackerType.VIEWABLE)) {
                        object = object7.getJSONArray((String)object);
                        n16 = object.length();
                        string6 = null;
                        for (n4 = 0; n4 < n16; n4 += n3) {
                            object6 = object.getString(n4);
                            Intrinsics.checkNotNullExpressionValue(object6, string8);
                            ((ArrayList)object3).add(object6);
                        }
                    }
                    if ((n15 = object7.has((String)(object = "imptrackers"))) != 0 && trackerType2 == (object6 = TrackerType.IMPRESSION)) {
                        object = object7.getJSONArray((String)object);
                        n15 = object.length();
                        Object var23_35 = null;
                        for (n16 = 0; n16 < n15; n16 += n3) {
                            string6 = object.getString(n16);
                            Intrinsics.checkNotNullExpressionValue(string6, string8);
                            ((ArrayList)object3).add(string6);
                        }
                    }
                    if (object5 != null && (n14 = ((String)object5).length()) != 0 && (n15 = (int)(object7.has((String)(object = "clktrackers")) ? 1 : 0)) != 0 && trackerType2 == (object6 = TrackerType.CLICK)) {
                        object = object7.getJSONArray((String)object);
                        n7 = object.length();
                        object6 = null;
                        for (n15 = 0; n15 < n7; n15 += n3) {
                            String string9 = object.getString(n15);
                            Intrinsics.checkNotNullExpressionValue(string9, string8);
                            ((ArrayList)object3).add(string9);
                        }
                    }
                    object = new Pair(object3, object5);
                } else {
                    Intrinsics.checkNotNullParameter("ad object not found", string7);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object = new Pair(null, object5);
                }
                object5 = dk3_2.$EnumSwitchMapping$0;
                n8 = trackerType.ordinal();
                Object object8 = object5[n8];
                object3 = ((Pair)object).b;
                object = ((Pair)object).a;
                if (object8 == n3) break block26;
                n7 = 2;
                if (object8 != n7) {
                    n10 = 3;
                    if (object8 == n10) {
                        boolean bl4;
                        object5 = object;
                        object5 = (Collection)object;
                        if (object5 == null || (bl4 = object5.isEmpty())) {
                            Intrinsics.checkNotNullParameter("Viewable tracker not found", string7);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object5 = JioAds$LogLevel.NONE;
                        }
                    }
                    n4 = 0;
                    string6 = null;
                    break block27;
                } else {
                    boolean bl5;
                    int n17;
                    object5 = object3;
                    object5 = (CharSequence)object3;
                    if (object5 == null || (n17 = object5.length()) == 0) {
                        n4 = 0;
                        string6 = null;
                    } else {
                        object5 = object3;
                        object5 = (String)object3;
                        object6 = RetargetPref.INSTANCE;
                        Event event = Event.ADD_TO_CART;
                        object7 = RetargetPref.getEventConversionData$default((RetargetPref)object6, event, null, n7, null);
                        if (object7 != null) {
                            object7 = ((ConversionDataModel)object7).b;
                        } else {
                            n7 = 0;
                            object7 = null;
                        }
                        Object v4 = jioAdsEventService.ccbToProductIdMap.get(string5);
                        if (v4 != null && object5 != null) {
                            String string10 = String.valueOf(jioAdsEventService.ccbToProductIdMap.get(string5));
                            string8 = "[ccb]";
                            n4 = 0;
                            string6 = null;
                            object5 = kotlin.text.b.n((String)object5, string8, string10, false);
                        } else {
                            n4 = 0;
                            string6 = null;
                        }
                        ((RetargetPref)object6).storeClickIds((String)object5, string5, (Integer)object7, null);
                    }
                    object5 = object;
                    object5 = (Collection)object;
                    if (object5 == null || (bl5 = object5.isEmpty())) {
                        Intrinsics.checkNotNullParameter("Click tracker not found", string7);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object5 = JioAds$LogLevel.NONE;
                    }
                }
                break block27;
            }
            n4 = 0;
            string6 = null;
            boolean bl6 = kotlin.text.b.k(string3) ^ n3;
            if (bl6 && (object5 = ((AdsSdkReflection)object4).getCCBValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                object2 = jioAdsEventService.ccbToProductIdMap;
                object2.put(string5, object5);
            }
            object5 = object;
            object5 = (Collection)object;
            if (object5 == null || (bl2 = object5.isEmpty())) {
                Intrinsics.checkNotNullParameter("Impression tracker not found", string7);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
            }
        }
        object5 = object;
        object5 = (Collection)object;
        if (object5 == null) return;
        boolean bl7 = object5.isEmpty();
        if (bl7) {
            return;
        }
        Intrinsics.checkNotNull(object);
        object2 = object;
        object2 = (List)object;
        Object object9 = object5 = jioAdsEventService.ccbToProductIdMap.get(string5);
        String string11 = (String)object5;
        object3 = (String)object3;
        object = ((Object)((Object)trackerType)).toString();
        object5 = TrackerType.CLICK;
        if (trackerType2 != object5) {
            n3 = 0;
        }
        object5 = object4;
        Object object10 = object2;
        object4 = object3;
        object3 = object;
        ((AdsSdkReflection)object5).callFireUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)object2, string11, (String)object4, n3 != 0, (String)object, string4);
    }

    public final String getConfigEnv() {
        return RetargetPref.INSTANCE.getConfigEnvironment();
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public void onError(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "error");
        Intrinsics.checkNotNullParameter("Config onError at JioAdsService", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onSuccess(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "response");
        Intrinsics.checkNotNullParameter("Config onSuccess at JioAdsService", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void release() {
        this.ccbToProductIdMap.clear();
    }

    public final void setConfigEnvironment(String object) {
        Intrinsics.checkNotNullParameter(object, "environment");
        Object object2 = this.getConfigEnv();
        boolean bl2 = Intrinsics.areEqual(object2, object);
        if (!bl2) {
            object2 = Utility.INSTANCE;
            boolean bl3 = true;
            ((Utility)object2).setConfigEnvUpdated(bl3);
        }
        bl2 = this.isConfigCalled;
        String string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (bl2) {
            object2 = RetargetPref.INSTANCE;
            Locale locale = Locale.ROOT;
            object = object.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ((RetargetPref)object2).storeConfigEnvironment((String)object);
            this.isConfigCalled = false;
            return;
        }
        object2 = this.getConfigEnv();
        if (object2 != null && !(bl2 = Intrinsics.areEqual(object2 = this.getConfigEnv(), object))) {
            object2 = RetargetPref.INSTANCE;
            Object object3 = Locale.ROOT;
            object3 = object.toLowerCase((Locale)object3);
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            ((RetargetPref)object2).storeConfigEnvironment((String)object3);
            object2 = this.appPackageName;
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                string2 = this.context;
                int n3 = this.getRequestTimeout();
                object2 = new ConfigController((Context)string2, this, n3);
                string2 = String.valueOf(this.appPackageName);
                ((ConfigController)object2).fetchConfig(string2);
            } else {
                string2 = this.context;
                int n4 = this.getRequestTimeout();
                object2 = new ConfigController((Context)string2, this, n4);
                string2 = this.context.getPackageName().toString();
                ((ConfigController)object2).fetchConfig(string2);
            }
            object = "Config Environment Updated ".concat((String)object);
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void setRequestTimeout(int n3) {
        this.requestTimeOut = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final List trackEvent(PurchaseCompleteEvent var1_1) {
        block27: {
            block23: {
                var2_2 = this;
                var3_3 = var1_1;
                Intrinsics.checkNotNullParameter(var1_1, "event");
                var4_4 = RetargetPref.INSTANCE;
                var5_5 = Event.PURCHASE_COMPLETED;
                var6_6 = 2;
                var7_7 = false;
                var8_8 = null;
                var5_5 = RetargetPref.getEventConversionData$default(var4_4, (Event)var5_5, null, var6_6, null);
                if (var5_5 != null) {
                    var5_5 = var5_5.b;
                    var9_9 /* !! */  = var5_5;
                } else {
                    var9_9 /* !! */  = null;
                }
                var5_5 = var1_1.getCartProductList();
                var10_10 = "getCartProductList(...)";
                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var10_10);
                var12_12 = yx_2.o((Iterable)var5_5, 10);
                var11_11 /* !! */  = new ArrayList<String>(var12_12);
                var5_5 = var5_5.iterator();
                while ((var12_12 = (int)var5_5.hasNext()) != 0) {
                    var13_13 /* !! */  = ((CartProduct)var5_5.next()).getProductId();
                    var11_11 /* !! */ .add((String)var13_13 /* !! */ );
                }
                var5_5 = Event.PURCHASE_COMPLETED;
                var11_11 /* !! */  = var4_4.checkProductAvailbleForConversionLevel1(var11_11 /* !! */ , (Event)var5_5);
                var14_14 = new ArrayList<E>();
                var5_5 = (Map)var11_11 /* !! */ .b;
                var15_15 = var5_5.isEmpty();
                var12_12 = 1;
                var16_16 = "clickId";
                var17_17 = var11_11 /* !! */ .c;
                if ((var15_15 ^= var12_12) == 0) break block23;
                var5_5 = var1_1.getCartProductList();
                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var10_10);
                var18_18 = new ArrayList();
                var5_5 = var5_5.iterator();
                block1: while (var19_19 = var5_5.hasNext()) {
                    block24: {
                        var21_21 = var20_20 = var5_5.next();
                        var21_21 = (CartProduct)var20_20;
                        var22_22 = var17_17;
                        var22_22 = (Iterable)var17_17;
                        var7_7 = var22_22 instanceof Collection;
                        if (!var7_7) break block24;
                        var8_8 = var22_22;
                        var8_8 = (Collection)var22_22;
                        var7_7 = var8_8.isEmpty();
                        if (var7_7) ** GOTO lbl59
                    }
                    var8_8 = ((Iterable)var22_22).iterator();
                    while (true) {
                        block26: {
                            block25: {
                                if ((var23_23 = var8_8.hasNext()) == 0) break block25;
                                var22_22 = (String)var8_8.next();
                                var13_13 /* !! */  = var21_21.getProductId();
                                if (var13_13 /* !! */  == null || (var12_12 = (int)var13_13 /* !! */ .equals(var22_22)) != (var23_23 = 1)) break block26;
                                var18_18.add(var20_20);
                            }
                            var7_7 = false;
                            var8_8 = null;
                            var12_12 = 1;
                            continue block1;
                        }
                        var12_12 = 1;
                    }
                }
                var5_5 = var18_18.iterator();
                while (var7_7 = var5_5.hasNext()) {
                    var8_8 = (CartProduct)var5_5.next();
                    var18_18 = var13_13 /* !! */  = var11_11 /* !! */ .b;
                    var18_18 = (Map)var13_13 /* !! */ ;
                    var20_20 = var8_8.getProductId();
                    if ((var18_18 = (CharSequence)var18_18.get(var20_20)) == null || (var24_24 = var18_18.length()) == 0) continue;
                    var2_2.jsonSerializer.getClass();
                    var18_18 = bk3_2.b(var1_1);
                    if (var18_18 != null) {
                        var13_13 /* !! */  = (Map)var13_13 /* !! */ ;
                        var8_8 = var8_8.getProductId();
                        var8_8 = var13_13 /* !! */ .get(var8_8);
                        Intrinsics.checkNotNull(var8_8);
                        var8_8 = var18_18.put((String)var16_16, var8_8);
                    } else {
                        var7_7 = false;
                        var8_8 = null;
                    }
                    var2_2.sendSerializedEvent((JSONObject)var8_8);
                }
                break block27;
            }
            var2_2.jsonSerializer.getClass();
            var5_5 = bk3_2.b(var1_1);
            if (var5_5 != null) {
                var8_8 = "";
                var5_5 = var5_5.put((String)var16_16, var8_8);
            } else {
                var15_15 = 0;
                var5_5 = null;
            }
            var2_2.sendSerializedEvent((JSONObject)var5_5);
        }
        if ((var15_15 = (int)(var5_5 = (Boolean)var11_11 /* !! */ .a).booleanValue()) != 0) {
            var5_5 = var1_1.getCartProductList();
            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var10_10);
            var8_8 = new ArrayList();
            var5_5 = var5_5.iterator();
            block4: while ((var12_12 = (int)var5_5.hasNext()) != 0) {
                var16_16 = var13_13 /* !! */  = var5_5.next();
                var16_16 = (CartProduct)var13_13 /* !! */ ;
                var18_18 = var17_17;
                var18_18 = (Iterable)var17_17;
                var19_19 = var18_18 instanceof Collection;
                if (var19_19) {
                    var20_20 = var18_18;
                    var20_20 = (Collection)var18_18;
                    var19_19 = var20_20.isEmpty();
                    if (var19_19) {
                        while (true) {
                            var25_25 = true;
                            continue block4;
                            break;
                        }
                    }
                }
                var18_18 = ((Iterable)var18_18).iterator();
                while (true) {
                    if (!(var19_19 = var18_18.hasNext())) ** continue;
                    var20_20 = (String)var18_18.next();
                    var21_21 = var16_16.getProductId();
                    if (var21_21 != null) {
                        var19_19 = var21_21.equals(var20_20);
                        if (var19_19 != (var25_25 = true)) ** continue;
                        var8_8.add(var13_13 /* !! */ );
                        continue block4;
                    }
                    var25_25 = true;
                }
            }
            var5_5 = var1_1.getCurrency();
            if (var5_5 != null) {
                var5_5 = var5_5.getCurrencyCode();
            } else {
                var15_15 = 0;
                var5_5 = null;
            }
            var13_13 /* !! */  = String.valueOf(var5_5);
            var5_5 = var1_1.getCartProductList();
            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var10_10);
            var5_5 = var5_5.iterator();
            var26_26 = 0;
            var3_3 = null;
            var27_27 = 0;
            var16_16 = null;
            while ((var26_26 = var5_5.hasNext()) != 0) {
                var3_3 = (CartProduct)var5_5.next();
                var6_6 = var3_3.getPrice();
                var26_26 = var3_3.getQuantity() * var6_6;
                var27_27 += var26_26;
            }
            var5_5 = this;
            var3_3 = var8_8;
            var10_10 = var11_11 /* !! */ ;
            var8_8 = var13_13 /* !! */ ;
            var13_13 /* !! */  = var9_9 /* !! */ ;
            var20_20 = this.createUrls((List)var3_3, (xs3_0)var11_11 /* !! */ , (String)var8_8, var27_27, (Integer)var9_9 /* !! */ );
            var5_5 = var2_2.context;
            var18_18 = new AdsSdkReflection((Context)var5_5);
            var3_3 = "Conversion Level ";
            var5_5 = new StringBuilder((String)var3_3);
            var5_5.append((Object)var9_9 /* !! */ );
            var28_28 = var5_5.toString();
            var29_29 = 44;
            var25_25 = false;
            var21_21 = null;
            var23_23 = 0;
            var22_22 = null;
            AdsSdkReflection.callFireUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((AdsSdkReflection)var18_18, (List)var20_20, null, null, false, var28_28, null, var29_29, null);
            var17_17 = (List)var17_17;
            var4_4.removeConversionClicks((List)var17_17);
        }
        return var14_14;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(AddToCartEvent object) {
        int n3;
        Pair pair;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        String string2;
        Object object6;
        String string3;
        Object object7;
        String string4;
        block13: {
            JSONException jSONException2;
            block12: {
                int n4;
                JSONObject jSONObject;
                String string5;
                int n7;
                Object object8;
                block11: {
                    string4 = "clickId";
                    object7 = "message";
                    string3 = "event";
                    Intrinsics.checkNotNullParameter(object, string3);
                    object6 = ((AddToCartEvent)object).getCartProductList();
                    string2 = null;
                    object5 = object6 != null ? (object6 = (CartProduct)CollectionsKt.S((List)object6)) : null;
                    object4 = RetargetPref.INSTANCE;
                    object8 = Event.ADD_TO_CART;
                    int n8 = 2;
                    object6 = RetargetPref.getEventConversionData$default((RetargetPref)object4, (Event)((Object)object8), null, n8, null);
                    if (object6 != null) {
                        object6 = ((ConversionDataModel)object6).b;
                    } else {
                        n8 = 0;
                        object6 = null;
                    }
                    object3 = object5 != null ? ((CartProduct)object5).getProductId() : null;
                    object2 = String.valueOf(object3);
                    int n10 = 4;
                    n7 = 0;
                    string5 = null;
                    jSONObject = null;
                    pair = RetargetPref.checkProductAvailbleForConversionLevel$default((RetargetPref)object4, (String)object2, (Event)((Object)object8), false, n10, null);
                    this.jsonSerializer.getClass();
                    object3 = "time stamp : ";
                    Intrinsics.checkNotNullParameter(object, string3);
                    try {
                        string3 = new JSONObject();
                        object4 = "tms";
                        object2 = Utility.INSTANCE;
                        object8 = ((a)object).getTimestamp();
                        object2 = ((Utility)object2).getTimeStamp((Date)object8);
                        string3.put((String)object4, object2);
                        object4 = new StringBuilder((String)object3);
                        object3 = ((a)object).getTimestamp();
                        ((StringBuilder)object4).append(object3);
                        object3 = ((StringBuilder)object4).toString();
                        Intrinsics.checkNotNullParameter(object3, object7);
                        object3 = JioAds.Companion;
                        object3 = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        object3 = "eventId";
                        n4 = 3;
                        string3.put((String)object3, n4);
                        object3 = "";
                        string3.put(string4, object3);
                        object3 = new JSONObject();
                        object4 = ((AddToCartEvent)object).getCurrency();
                        if (object4 == null) break block11;
                        object4 = "currency";
                        object2 = ((AddToCartEvent)object).getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object3.put((String)object4, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block12;
                    }
                }
                if ((object4 = ((AddToCartEvent)object).getCartProductList()) != null) {
                    object4 = ((AddToCartEvent)object).getCartProductList();
                    Intrinsics.checkNotNull(object4);
                    n4 = (int)(((CopyOnWriteArrayList)object4).isEmpty() ? 1 : 0);
                    if (n4 == 0) {
                        object4 = new JSONArray();
                        object2 = ((AddToCartEvent)object).getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n3 = object2.hasNext()) != 0) {
                            object8 = object2.next();
                            object8 = (CartProduct)object8;
                            jSONObject = new JSONObject();
                            String string6 = "id";
                            string5 = ((CartProduct)object8).getProductId();
                            jSONObject.put(string6, (Object)string5);
                            string6 = "price";
                            n7 = ((CartProduct)object8).getPrice();
                            jSONObject.put(string6, n7);
                            string6 = "vertical";
                            string5 = ((CartProduct)object8).getVertical();
                            jSONObject.put(string6, (Object)string5);
                            string6 = "segment";
                            string5 = ((CartProduct)object8).getSegment();
                            jSONObject.put(string6, (Object)string5);
                            string6 = "brickname";
                            string5 = ((CartProduct)object8).getBrickname();
                            jSONObject.put(string6, (Object)string5);
                            string6 = "sku";
                            string5 = ((CartProduct)object8).getSkuName();
                            jSONObject.put(string6, (Object)string5);
                            string6 = "quantity";
                            n3 = ((CartProduct)object8).getQuantity();
                            jSONObject.put(string6, n3);
                            object4.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object3.put((String)object2, object4);
                    }
                }
                object4 = "productDetails";
                string3.put((String)object4, object3);
                bk3_2.c((a)object, (JSONObject)string3);
                break block13;
            }
            object3 = "Error in JSON serialisation";
            Intrinsics.checkNotNullParameter(object3, object7);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object7 = JioAds$LogLevel.NONE;
            string3 = null;
        }
        if (string3 != null) {
            object7 = pair.b;
            string4 = string3.put(string4, object7);
        } else {
            string4 = null;
        }
        this.sendSerializedEvent((JSONObject)string4);
        if (object5 != null) {
            if ((object = ((AddToCartEvent)object).getCurrency()) != null) {
                string2 = ((Currency)object).getCurrencyCode();
            }
            object4 = string2;
            n3 = 1;
            object3 = this;
            object2 = object6;
            this.createUrlsAndFireUrl(pair, (CartProduct)object5, string2, (Integer)object6, n3 != 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(AddToWishListEvent addToWishListEvent) {
        String string2;
        block7: {
            JSONException jSONException2;
            Object object;
            block6: {
                int n3;
                Object object2;
                Object object3;
                block5: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(addToWishListEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(addToWishListEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object3 = Utility.INSTANCE;
                        object2 = addToWishListEvent.getTimestamp();
                        object3 = ((Utility)object3).getTimeStamp((Date)object2);
                        string2.put((String)object, object3);
                        object = "eventId";
                        n3 = 5;
                        string2.put((String)object, n3);
                        object = new JSONObject();
                        object3 = addToWishListEvent.getCurrency();
                        if (object3 == null) break block5;
                        object3 = "currency";
                        object2 = addToWishListEvent.getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object.put((String)object3, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                }
                if ((object3 = addToWishListEvent.getCartProductList()) != null) {
                    object3 = addToWishListEvent.getCartProductList();
                    Intrinsics.checkNotNull(object3);
                    n3 = (int)(((CopyOnWriteArrayList)object3).isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        int n4;
                        object3 = new JSONArray();
                        object2 = addToWishListEvent.getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            Object object4 = object2.next();
                            object4 = (CartProduct)object4;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "id";
                            String string4 = ((CartProduct)object4).getProductId();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "price";
                            int n7 = ((CartProduct)object4).getPrice();
                            jSONObject.put(string3, n7);
                            string3 = "vertical";
                            string4 = ((CartProduct)object4).getVertical();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "segment";
                            string4 = ((CartProduct)object4).getSegment();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "brickname";
                            string4 = ((CartProduct)object4).getBrickname();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "sku";
                            string4 = ((CartProduct)object4).getSkuName();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "quantity";
                            n4 = ((CartProduct)object4).getQuantity();
                            jSONObject.put(string3, n4);
                            object3.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object.put((String)object2, object3);
                    }
                }
                object3 = "productDetails";
                string2.put((String)object3, object);
                bk3_2.c(addToWishListEvent, (JSONObject)string2);
                break block7;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(AppLaunchEvent appLaunchEvent) {
        String string2;
        block12: {
            JSONException jSONException222;
            String string3 = "message";
            string2 = "event";
            Intrinsics.checkNotNullParameter(appLaunchEvent, string2);
            Object object = new DeviceInformationEvent();
            this.trackEvent((DeviceInformationEvent)object);
            this.jsonSerializer.getClass();
            object = "Error while getting App Version ";
            Object object2 = "Error while getting App Name ";
            Intrinsics.checkNotNullParameter(appLaunchEvent, string2);
            string2 = new JSONObject();
            Object object3 = "tms";
            Object object4 = Utility.INSTANCE;
            Object object5 = appLaunchEvent.getTimestamp();
            object5 = ((Utility)object4).getTimeStamp((Date)object5);
            string2.put((String)object3, object5);
            object3 = "eventId";
            int n3 = 1;
            string2.put((String)object3, n3);
            boolean bl2 = appLaunchEvent.isFirstLaunch();
            String string4 = "firstLaunch";
            if (bl2) {
                string2.put(string4, n3);
            } else {
                string2.put(string4, 0);
            }
            try {
                object3 = ((Utility)object4).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object3);
                object3 = object3.getPackageManager();
                object5 = "getPackageManager(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                object4 = ((Utility)object4).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object4);
                object4 = object4.getPackageName();
                object4 = object3.getApplicationInfo((String)object4, 0);
                object5 = "getApplicationInfo(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                object3 = object3.getApplicationLabel((ApplicationInfo)object4);
                object4 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object3, (String)object4);
                object4 = "appName";
                string2.put((String)object4, object3);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object4 = new StringBuilder((String)object2);
                object2 = nameNotFoundException.getStackTrace();
                ((StringBuilder)object4).append(object2);
                object2 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object2, string3);
                object2 = JioAds.Companion;
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
            }
            {
                catch (JSONException jSONException222) {}
            }
            try {
                object2 = Utility.INSTANCE;
                object3 = ((Utility)object2).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object3);
                object3 = object3.getPackageName();
                object4 = "getPackageName(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                object2 = ((Utility)object2).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object2);
                object2 = object2.getPackageManager();
                object2 = object2.getPackageInfo((String)object3, 0);
                object2 = ((PackageInfo)object2).versionName;
                object3 = "versionName";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                object3 = "appSdkVer";
                string2.put((String)object3, object2);
            }
            catch (Exception exception) {
                object3 = new StringBuilder((String)object);
                object = exception.getStackTrace();
                ((StringBuilder)object3).append(object);
                object = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object, string3);
                object = JioAds.Companion;
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            object = "language";
            object2 = Utility.INSTANCE;
            object2 = ((Utility)object2).getLanguage();
            string2.put((String)object, object2);
            object = "country";
            object2 = "IN";
            string2.put((String)object, object2);
            object = appLaunchEvent.getCustomerDetailsList();
            if (object != null) {
                object = appLaunchEvent.getCustomerDetailsList();
                Intrinsics.checkNotNull(object);
                boolean bl3 = ((CopyOnWriteArrayList)object).isEmpty();
                if (!bl3) {
                    object = new JSONArray();
                    object2 = appLaunchEvent.getCustomerDetailsList();
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CopyOnWriteArrayList)object2).iterator();
                    while (bl2 = object2.hasNext()) {
                        object3 = object2.next();
                        object3 = (CustomerDetails)object3;
                        object4 = new JSONObject();
                        object5 = "type";
                        int n4 = ((CustomerDetails)object3).getType();
                        object4.put((String)object5, n4);
                        object5 = "idValue";
                        string4 = ((CustomerDetails)object3).getIdValue();
                        object4.put((String)object5, (Object)string4);
                        object5 = "hashMethod";
                        object3 = ((CustomerDetails)object3).getHashMethod();
                        object4.put((String)object5, object3);
                        object.put(object4);
                    }
                    object2 = "customerDetails";
                    string2.put((String)object2, object);
                }
            }
            bk3_2.c(appLaunchEvent, (JSONObject)string2);
            break block12;
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", string3);
            string3 = "throwable";
            Intrinsics.checkNotNullParameter((Object)jSONException222, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(AppUserDetailsEvent appUserDetailsEvent) {
        String string2;
        block5: {
            JSONException jSONException2;
            Object object;
            block4: {
                block3: {
                    Object object2;
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(appUserDetailsEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(appUserDetailsEvent, string2);
                    try {
                        boolean bl2;
                        string2 = new JSONObject();
                        object = "tms";
                        object2 = Utility.INSTANCE;
                        Object object3 = appUserDetailsEvent.getTimestamp();
                        object2 = ((Utility)object2).getTimeStamp((Date)object3);
                        string2.put((String)object, object2);
                        object = "eventId";
                        int n3 = 16;
                        string2.put((String)object, n3);
                        object = appUserDetailsEvent.getCustomerDetailsList();
                        if (object == null) break block3;
                        object = appUserDetailsEvent.getCustomerDetailsList();
                        Intrinsics.checkNotNull(object);
                        boolean bl3 = ((CopyOnWriteArrayList)object).isEmpty();
                        if (bl3) break block3;
                        object = new JSONArray();
                        object2 = appUserDetailsEvent.getCustomerDetailsList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while (bl2 = object2.hasNext()) {
                            object3 = object2.next();
                            object3 = (CustomerDetails)object3;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "type";
                            int n4 = ((CustomerDetails)object3).getType();
                            jSONObject.put(string3, n4);
                            string3 = "idValue";
                            String string4 = ((CustomerDetails)object3).getIdValue();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "hashMethod";
                            object3 = ((CustomerDetails)object3).getHashMethod();
                            jSONObject.put(string3, object3);
                            object.put((Object)jSONObject);
                        }
                    }
                    catch (JSONException jSONException2) {
                        break block4;
                    }
                    object2 = "customerDetails";
                    string2.put((String)object2, object);
                }
                bk3_2.c(appUserDetailsEvent, (JSONObject)string2);
                break block5;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(CartViewEvent cartViewEvent) {
        String string2;
        block9: {
            JSONException jSONException2;
            Object object;
            block8: {
                int n3;
                Object object2;
                Object object3;
                block7: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(cartViewEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(cartViewEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object3 = Utility.INSTANCE;
                        object2 = cartViewEvent.getTimestamp();
                        object3 = ((Utility)object3).getTimeStamp((Date)object2);
                        string2.put((String)object, object3);
                        object = "eventId";
                        n3 = 8;
                        string2.put((String)object, n3);
                        object = new JSONObject();
                        object3 = cartViewEvent.getCurrency();
                        if (object3 == null) break block7;
                        object3 = "currency";
                        object2 = cartViewEvent.getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object.put((String)object3, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block8;
                    }
                }
                if ((object3 = cartViewEvent.getStartTime()) != null) {
                    object3 = "startTime";
                    object2 = cartViewEvent.getStartTime();
                    string2.put((String)object3, object2);
                }
                if ((object3 = cartViewEvent.getEndTime()) != null) {
                    object3 = "endTime";
                    object2 = cartViewEvent.getEndTime();
                    string2.put((String)object3, object2);
                }
                if ((object3 = cartViewEvent.getCartProductList()) != null) {
                    object3 = cartViewEvent.getCartProductList();
                    Intrinsics.checkNotNull(object3);
                    n3 = (int)(((CopyOnWriteArrayList)object3).isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        int n4;
                        object3 = new JSONArray();
                        object2 = cartViewEvent.getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            Object object4 = object2.next();
                            object4 = (CartProduct)object4;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "id";
                            String string4 = ((CartProduct)object4).getProductId();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "price";
                            int n7 = ((CartProduct)object4).getPrice();
                            jSONObject.put(string3, n7);
                            string3 = "vertical";
                            string4 = ((CartProduct)object4).getVertical();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "segment";
                            string4 = ((CartProduct)object4).getSegment();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "brickname";
                            string4 = ((CartProduct)object4).getBrickname();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "sku";
                            string4 = ((CartProduct)object4).getSkuName();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "quantity";
                            n4 = ((CartProduct)object4).getQuantity();
                            jSONObject.put(string3, n4);
                            object3.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object.put((String)object2, object3);
                    }
                }
                object3 = "productDetails";
                string2.put((String)object3, object);
                bk3_2.c(cartViewEvent, (JSONObject)string2);
                break block9;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(CustomDataEvent customDataEvent) {
        String string2;
        block4: {
            JSONException jSONException2;
            Object object;
            block3: {
                block2: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(customDataEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(customDataEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        Utility utility = Utility.INSTANCE;
                        Object object2 = customDataEvent.getTimestamp();
                        object2 = utility.getTimeStamp((Date)object2);
                        string2.put((String)object, object2);
                        object = "eventId";
                        int n3 = 14;
                        string2.put((String)object, n3);
                        object = customDataEvent.getCustomData();
                        if (object == null) break block2;
                        object = "customData";
                        object2 = customDataEvent.getCustomData();
                        Intrinsics.checkNotNull(object2);
                        utility = utility.convertHashMapToJSONArray((HashMap)object2);
                        string2.put((String)object, (Object)utility);
                    }
                    catch (JSONException jSONException2) {
                        break block3;
                    }
                }
                bk3_2.c(customDataEvent, (JSONObject)string2);
                break block4;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(DeepLinkLaunchEvent deepLinkLaunchEvent) {
        String string2;
        block6: {
            JSONException jSONException2;
            Object object;
            String string3;
            block5: {
                int n3;
                Object object2;
                block4: {
                    block3: {
                        string3 = "event";
                        Intrinsics.checkNotNullParameter(deepLinkLaunchEvent, string3);
                        object = RetargetPref.INSTANCE;
                        object2 = Event.ADD_TO_CART;
                        string2 = null;
                        int n4 = 2;
                        object2 = RetargetPref.getEventConversionData$default((RetargetPref)object, (Event)((Object)object2), null, n4, null);
                        object2 = object2 != null ? ((ConversionDataModel)object2).b : null;
                        Object object3 = Uri.parse((String)deepLinkLaunchEvent.getDeeplinkUrl());
                        ((RetargetPref)object).storeClickIds(null, null, (Integer)object2, (Uri)object3);
                        object = this.jsonSerializer;
                        object.getClass();
                        Intrinsics.checkNotNullParameter(deepLinkLaunchEvent, string3);
                        try {
                            string3 = new JSONObject();
                            object = "tms";
                            object2 = Utility.INSTANCE;
                            object3 = deepLinkLaunchEvent.getTimestamp();
                            object2 = ((Utility)object2).getTimeStamp((Date)object3);
                            string3.put((String)object, object2);
                            object = "eventId";
                            string3.put((String)object, n4);
                            n3 = deepLinkLaunchEvent.isFirstLaunch();
                            object2 = "firstLaunch";
                            if (n3 == 0) break block3;
                            n3 = 1;
                            string3.put((String)object2, n3);
                            break block4;
                        }
                        catch (JSONException jSONException2) {
                            break block5;
                        }
                    }
                    n3 = 0;
                    object = null;
                    string3.put((String)object2, 0);
                }
                object = "deeplinkUri";
                object2 = deepLinkLaunchEvent.getDeeplinkUrl();
                string3.put((String)object, object2);
                object = deepLinkLaunchEvent.getReferrerApp();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n3 == 0) {
                    object = "referrerApp";
                    object2 = deepLinkLaunchEvent.getReferrerApp();
                    string3.put((String)object, object2);
                }
                bk3_2.c(deepLinkLaunchEvent, (JSONObject)string3);
                string2 = string3;
                break block6;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            string3 = "throwable";
            Intrinsics.checkNotNullParameter((Object)jSONException2, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(DeviceInformationEvent object) {
        String string2;
        block5: {
            JSONException jSONException2;
            String string3;
            block6: {
                int n3;
                Utility utility;
                Object object2;
                block4: {
                    string3 = "android";
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object2 = this.jsonSerializer;
                    object2.getClass();
                    Intrinsics.checkNotNullParameter(object, string2);
                    try {
                        string2 = new JSONObject();
                        object2 = "tms";
                        utility = Utility.INSTANCE;
                        object = ((a)object).getTimestamp();
                        object = utility.getTimeStamp((Date)object);
                        string2.put((String)object2, object);
                        object = "eventId";
                        int n4 = 15;
                        string2.put((String)object, n4);
                        object = "manufacturer";
                        object2 = utility.getManufacturer();
                        string2.put((String)object, object2);
                        object = "model";
                        object2 = utility.getModel();
                        string2.put((String)object, object2);
                        object = "platform";
                        string2.put((String)object, (Object)string3);
                        object = "osName";
                        string2.put((String)object, (Object)string3);
                        object = "osVersion";
                        string3 = utility.getAndroidVersion();
                        string2.put((String)object, (Object)string3);
                        object = utility.getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        Intrinsics.checkNotNull(object);
                        n3 = utility.getCurrentUIModeType((Context)object);
                        int n7 = -1;
                        object2 = "devicetype";
                        if (n3 == n7) break block4;
                        object = utility.getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        Intrinsics.checkNotNull(object);
                        n3 = utility.getCurrentUIModeType((Context)object);
                        n7 = 4;
                        if (n3 != n7) break block4;
                        n3 = 0;
                        object = null;
                        string2.put((String)object2, 0);
                        break block5;
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                }
                object = utility.getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object);
                n3 = (int)(utility.isDeviceTypeTablet((Context)object) ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1;
                    string2.put((String)object2, n3);
                    break block5;
                } else {
                    n3 = 2;
                    string2.put((String)object2, n3);
                }
                break block5;
            }
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", "message");
            string3 = "throwable";
            Intrinsics.checkNotNullParameter((Object)jSONException2, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(LocationEvent locationEvent) {
        String string2;
        block7: {
            JSONException jSONException2;
            Object object;
            block6: {
                int n3;
                Object object2;
                Object object3;
                block5: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(locationEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(locationEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object3 = Utility.INSTANCE;
                        object2 = locationEvent.getTimestamp();
                        object3 = ((Utility)object3).getTimeStamp((Date)object2);
                        string2.put((String)object, object3);
                        object = "eventId";
                        n3 = 13;
                        string2.put((String)object, n3);
                        object = "pincode";
                        object3 = locationEvent.getPincode();
                        string2.put((String)object, object3);
                        object = "lat";
                        object3 = locationEvent.getLatitude();
                        string2.put((String)object, object3);
                        object = "long";
                        object3 = locationEvent.getLongitude();
                        string2.put((String)object, object3);
                        object = new JSONObject();
                        object3 = locationEvent.getCurrency();
                        if (object3 == null) break block5;
                        object3 = "currency";
                        object2 = locationEvent.getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object.put((String)object3, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                }
                if ((object3 = locationEvent.getCartProductList()) != null) {
                    object3 = locationEvent.getCartProductList();
                    Intrinsics.checkNotNull(object3);
                    n3 = (int)(((CopyOnWriteArrayList)object3).isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        int n4;
                        object3 = new JSONArray();
                        object2 = locationEvent.getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            Object object4 = object2.next();
                            object4 = (CartProduct)object4;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "id";
                            String string4 = ((CartProduct)object4).getProductId();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "price";
                            int n7 = ((CartProduct)object4).getPrice();
                            jSONObject.put(string3, n7);
                            string3 = "vertical";
                            string4 = ((CartProduct)object4).getVertical();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "segment";
                            string4 = ((CartProduct)object4).getSegment();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "brickname";
                            string4 = ((CartProduct)object4).getBrickname();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "sku";
                            string4 = ((CartProduct)object4).getSkuName();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "quantity";
                            n4 = ((CartProduct)object4).getQuantity();
                            jSONObject.put(string3, n4);
                            object3.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object.put((String)object2, object3);
                    }
                }
                object3 = "productDetails";
                string2.put((String)object3, object);
                bk3_2.c(locationEvent, (JSONObject)string2);
                break block7;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(PageViewEvent pageViewEvent) {
        String string2;
        block5: {
            JSONException jSONException2;
            Object object;
            block4: {
                Object object2;
                block3: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(pageViewEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(pageViewEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object2 = Utility.INSTANCE;
                        Date date = pageViewEvent.getTimestamp();
                        object2 = ((Utility)object2).getTimeStamp(date);
                        string2.put((String)object, object2);
                        object = "eventId";
                        int n3 = 9;
                        string2.put((String)object, n3);
                        object = "pageName";
                        object2 = pageViewEvent.getPageName();
                        string2.put((String)object, object2);
                        object = pageViewEvent.getStartTime();
                        if (object == null) break block3;
                        object = "startTime";
                        object2 = pageViewEvent.getStartTime();
                        string2.put((String)object, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block4;
                    }
                }
                if ((object = pageViewEvent.getEndTime()) != null) {
                    object = "endTime";
                    object2 = pageViewEvent.getEndTime();
                    string2.put((String)object, object2);
                }
                bk3_2.c(pageViewEvent, (JSONObject)string2);
                break block5;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(ProductCancelledEvent productCancelledEvent) {
        String string2;
        block7: {
            JSONException jSONException2;
            Object object;
            block6: {
                int n3;
                Object object2;
                Object object3;
                block5: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(productCancelledEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(productCancelledEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object3 = Utility.INSTANCE;
                        object2 = productCancelledEvent.getTimestamp();
                        object3 = ((Utility)object3).getTimeStamp((Date)object2);
                        string2.put((String)object, object3);
                        object = "eventId";
                        n3 = 17;
                        string2.put((String)object, n3);
                        object = "transactionId";
                        object3 = productCancelledEvent.getTransactionId();
                        string2.put((String)object, object3);
                        object = "clickId";
                        object3 = "";
                        string2.put((String)object, object3);
                        object = new JSONObject();
                        object3 = productCancelledEvent.getCurrency();
                        if (object3 == null) break block5;
                        object3 = "currency";
                        object2 = productCancelledEvent.getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object.put((String)object3, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                }
                if ((object3 = productCancelledEvent.getCartProductList()) != null) {
                    object3 = productCancelledEvent.getCartProductList();
                    Intrinsics.checkNotNull(object3);
                    n3 = (int)(((CopyOnWriteArrayList)object3).isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        int n4;
                        object3 = new JSONArray();
                        object2 = productCancelledEvent.getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            Object object4 = object2.next();
                            object4 = (CartProduct)object4;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "id";
                            String string4 = ((CartProduct)object4).getProductId();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "price";
                            int n7 = ((CartProduct)object4).getPrice();
                            jSONObject.put(string3, n7);
                            string3 = "vertical";
                            string4 = ((CartProduct)object4).getVertical();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "segment";
                            string4 = ((CartProduct)object4).getSegment();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "brickname";
                            string4 = ((CartProduct)object4).getBrickname();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "sku";
                            string4 = ((CartProduct)object4).getSkuName();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "quantity";
                            n4 = ((CartProduct)object4).getQuantity();
                            jSONObject.put(string3, n4);
                            object3.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object.put((String)object2, object3);
                    }
                }
                object3 = "productDetails";
                string2.put((String)object3, object);
                bk3_2.c(productCancelledEvent, (JSONObject)string2);
                break block7;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(ProductListViewEvent productListViewEvent) {
        String string2;
        block13: {
            JSONException jSONException2;
            Object object;
            block12: {
                String string3;
                String string4;
                JSONObject jSONObject;
                Object object2;
                int n3;
                int n4;
                Object object3;
                Object object4;
                block11: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(productListViewEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(productListViewEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object4 = Utility.INSTANCE;
                        object3 = productListViewEvent.getTimestamp();
                        object4 = ((Utility)object4).getTimeStamp((Date)object3);
                        string2.put((String)object, object4);
                        object = "eventId";
                        n4 = 10;
                        string2.put((String)object, n4);
                        object = new JSONObject();
                        object4 = productListViewEvent.getCurrency();
                        if (object4 == null) break block11;
                        object4 = "currency";
                        object3 = productListViewEvent.getCurrency();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((Currency)object3).getCurrencyCode();
                        object.put((String)object4, object3);
                    }
                    catch (JSONException jSONException2) {
                        break block12;
                    }
                }
                if ((object4 = productListViewEvent.getListName()) != null) {
                    object4 = "listName";
                    object3 = productListViewEvent.getListName();
                    object.put((String)object4, object3);
                }
                if ((object4 = productListViewEvent.getStartTime()) != null) {
                    object4 = "startTime";
                    object3 = productListViewEvent.getStartTime();
                    string2.put((String)object4, object3);
                }
                if ((object4 = productListViewEvent.getEndTime()) != null) {
                    object4 = "endTime";
                    object3 = productListViewEvent.getEndTime();
                    string2.put((String)object4, object3);
                }
                if ((object4 = productListViewEvent.getCartProductList()) != null) {
                    object4 = productListViewEvent.getCartProductList();
                    Intrinsics.checkNotNull(object4);
                    n4 = (int)(((CopyOnWriteArrayList)object4).isEmpty() ? 1 : 0);
                    if (n4 == 0) {
                        object4 = new JSONArray();
                        object3 = productListViewEvent.getCartProductList();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((CopyOnWriteArrayList)object3).iterator();
                        while ((n3 = object3.hasNext()) != 0) {
                            object2 = object3.next();
                            object2 = (CartProduct)object2;
                            jSONObject = new JSONObject();
                            string4 = "id";
                            string3 = ((CartProduct)object2).getProductId();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "price";
                            int n7 = ((CartProduct)object2).getPrice();
                            jSONObject.put(string4, n7);
                            string4 = "vertical";
                            string3 = ((CartProduct)object2).getVertical();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "segment";
                            string3 = ((CartProduct)object2).getSegment();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "brickname";
                            string3 = ((CartProduct)object2).getBrickname();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "sku";
                            string3 = ((CartProduct)object2).getSkuName();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "quantity";
                            n3 = ((CartProduct)object2).getQuantity();
                            jSONObject.put(string4, n3);
                            object4.put((Object)jSONObject);
                        }
                        object3 = "productList";
                        object.put((String)object3, object4);
                    }
                }
                if ((object4 = productListViewEvent.getFiltersList()) != null) {
                    object4 = productListViewEvent.getFiltersList();
                    Intrinsics.checkNotNull(object4);
                    n4 = (int)(((CopyOnWriteArrayList)object4).isEmpty() ? 1 : 0);
                    if (n4 == 0) {
                        object4 = new JSONArray();
                        object3 = productListViewEvent.getFiltersList();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((CopyOnWriteArrayList)object3).iterator();
                        while ((n3 = object3.hasNext()) != 0) {
                            object2 = object3.next();
                            object2 = (Filters)object2;
                            jSONObject = new JSONObject();
                            string4 = "name";
                            string3 = ((Filters)object2).getName();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "value";
                            object2 = ((Filters)object2).getValue();
                            string3 = new JSONArray((Collection)object2);
                            jSONObject.put(string4, (Object)string3);
                            object4.put((Object)jSONObject);
                        }
                        object3 = "filters";
                        object.put((String)object3, object4);
                    }
                }
                object4 = "productDetails";
                string2.put((String)object4, object);
                bk3_2.c(productListViewEvent, (JSONObject)string2);
                break block13;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(ProductSearchViewEvent productSearchViewEvent) {
        String string2;
        block11: {
            JSONException jSONException2;
            Object object;
            block10: {
                String string3;
                String string4;
                JSONObject jSONObject;
                Object object2;
                int n3;
                int n4;
                Object object3;
                Object object4;
                block9: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(productSearchViewEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(productSearchViewEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object4 = Utility.INSTANCE;
                        object3 = productSearchViewEvent.getTimestamp();
                        object4 = ((Utility)object4).getTimeStamp((Date)object3);
                        string2.put((String)object, object4);
                        object = "eventId";
                        n4 = 12;
                        string2.put((String)object, n4);
                        object = new JSONObject();
                        object4 = productSearchViewEvent.getCurrency();
                        if (object4 == null) break block9;
                        object4 = "currency";
                        object3 = productSearchViewEvent.getCurrency();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((Currency)object3).getCurrencyCode();
                        object.put((String)object4, object3);
                    }
                    catch (JSONException jSONException2) {
                        break block10;
                    }
                }
                if ((object4 = productSearchViewEvent.getSearchString()) != null) {
                    object4 = "searchString";
                    object3 = productSearchViewEvent.getSearchString();
                    object.put((String)object4, object3);
                }
                if ((object4 = productSearchViewEvent.getCartProductList()) != null) {
                    object4 = productSearchViewEvent.getCartProductList();
                    Intrinsics.checkNotNull(object4);
                    n4 = (int)(((CopyOnWriteArrayList)object4).isEmpty() ? 1 : 0);
                    if (n4 == 0) {
                        object4 = new JSONArray();
                        object3 = productSearchViewEvent.getCartProductList();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((CopyOnWriteArrayList)object3).iterator();
                        while ((n3 = object3.hasNext()) != 0) {
                            object2 = object3.next();
                            object2 = (CartProduct)object2;
                            jSONObject = new JSONObject();
                            string4 = "id";
                            string3 = ((CartProduct)object2).getProductId();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "price";
                            int n7 = ((CartProduct)object2).getPrice();
                            jSONObject.put(string4, n7);
                            string4 = "vertical";
                            string3 = ((CartProduct)object2).getVertical();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "segment";
                            string3 = ((CartProduct)object2).getSegment();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "brickname";
                            string3 = ((CartProduct)object2).getBrickname();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "sku";
                            string3 = ((CartProduct)object2).getSkuName();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "quantity";
                            n3 = ((CartProduct)object2).getQuantity();
                            jSONObject.put(string4, n3);
                            object4.put((Object)jSONObject);
                        }
                        object3 = "productList";
                        object.put((String)object3, object4);
                    }
                }
                if ((object4 = productSearchViewEvent.getFiltersList()) != null) {
                    object4 = productSearchViewEvent.getFiltersList();
                    Intrinsics.checkNotNull(object4);
                    n4 = (int)(((CopyOnWriteArrayList)object4).isEmpty() ? 1 : 0);
                    if (n4 == 0) {
                        object4 = new JSONArray();
                        object3 = productSearchViewEvent.getFiltersList();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((CopyOnWriteArrayList)object3).iterator();
                        while ((n3 = object3.hasNext()) != 0) {
                            object2 = object3.next();
                            object2 = (Filters)object2;
                            jSONObject = new JSONObject();
                            string4 = "name";
                            string3 = ((Filters)object2).getName();
                            jSONObject.put(string4, (Object)string3);
                            string4 = "value";
                            object2 = ((Filters)object2).getValue();
                            string3 = new JSONArray((Collection)object2);
                            jSONObject.put(string4, (Object)string3);
                            object4.put((Object)jSONObject);
                        }
                        object3 = "filters";
                        object.put((String)object3, object4);
                    }
                }
                object4 = "searchDetails";
                string2.put((String)object4, object);
                bk3_2.c(productSearchViewEvent, (JSONObject)string2);
                break block11;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(ProductViewEvent productViewEvent) {
        String string2;
        block9: {
            JSONException jSONException2;
            Object object;
            block8: {
                int n3;
                Object object2;
                Object object3;
                block7: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(productViewEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(productViewEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object3 = Utility.INSTANCE;
                        object2 = productViewEvent.getTimestamp();
                        object3 = ((Utility)object3).getTimeStamp((Date)object2);
                        string2.put((String)object, object3);
                        object = "eventId";
                        n3 = 11;
                        string2.put((String)object, n3);
                        object = new JSONObject();
                        object3 = productViewEvent.getCurrency();
                        if (object3 == null) break block7;
                        object3 = "currency";
                        object2 = productViewEvent.getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object.put((String)object3, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block8;
                    }
                }
                if ((object3 = productViewEvent.getStartTime()) != null) {
                    object3 = "startTime";
                    object2 = productViewEvent.getStartTime();
                    object.put((String)object3, object2);
                }
                if ((object3 = productViewEvent.getEndTime()) != null) {
                    object3 = "endTime";
                    object2 = productViewEvent.getEndTime();
                    object.put((String)object3, object2);
                }
                if ((object3 = productViewEvent.getCartProductList()) != null) {
                    object3 = productViewEvent.getCartProductList();
                    Intrinsics.checkNotNull(object3);
                    n3 = (int)(((CopyOnWriteArrayList)object3).isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        int n4;
                        object3 = new JSONArray();
                        object2 = productViewEvent.getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            Object object4 = object2.next();
                            object4 = (CartProduct)object4;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "id";
                            String string4 = ((CartProduct)object4).getProductId();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "price";
                            int n7 = ((CartProduct)object4).getPrice();
                            jSONObject.put(string3, n7);
                            string3 = "vertical";
                            string4 = ((CartProduct)object4).getVertical();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "segment";
                            string4 = ((CartProduct)object4).getSegment();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "brickname";
                            string4 = ((CartProduct)object4).getBrickname();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "sku";
                            string4 = ((CartProduct)object4).getSkuName();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "quantity";
                            n4 = ((CartProduct)object4).getQuantity();
                            jSONObject.put(string3, n4);
                            object3.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object.put((String)object2, object3);
                    }
                }
                object3 = "productDetails";
                string2.put((String)object3, object);
                bk3_2.c(productViewEvent, (JSONObject)string2);
                break block9;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(PurchaseReturnEvent purchaseReturnEvent) {
        String string2;
        block7: {
            JSONException jSONException2;
            Object object;
            block6: {
                int n3;
                Object object2;
                Object object3;
                block5: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(purchaseReturnEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(purchaseReturnEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object3 = Utility.INSTANCE;
                        object2 = purchaseReturnEvent.getTimestamp();
                        object3 = ((Utility)object3).getTimeStamp((Date)object2);
                        string2.put((String)object, object3);
                        object = "eventId";
                        n3 = 18;
                        string2.put((String)object, n3);
                        object = "transactionId";
                        object3 = purchaseReturnEvent.getTransactionId();
                        string2.put((String)object, object3);
                        object = "clickId";
                        object3 = "";
                        string2.put((String)object, object3);
                        object = new JSONObject();
                        object3 = purchaseReturnEvent.getCurrency();
                        if (object3 == null) break block5;
                        object3 = "currency";
                        object2 = purchaseReturnEvent.getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object.put((String)object3, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                }
                if ((object3 = purchaseReturnEvent.getCartProductList()) != null) {
                    object3 = purchaseReturnEvent.getCartProductList();
                    Intrinsics.checkNotNull(object3);
                    n3 = (int)(((CopyOnWriteArrayList)object3).isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        int n4;
                        object3 = new JSONArray();
                        object2 = purchaseReturnEvent.getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            Object object4 = object2.next();
                            object4 = (CartProduct)object4;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "id";
                            String string4 = ((CartProduct)object4).getProductId();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "price";
                            int n7 = ((CartProduct)object4).getPrice();
                            jSONObject.put(string3, n7);
                            string3 = "vertical";
                            string4 = ((CartProduct)object4).getVertical();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "segment";
                            string4 = ((CartProduct)object4).getSegment();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "brickname";
                            string4 = ((CartProduct)object4).getBrickname();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "sku";
                            string4 = ((CartProduct)object4).getSkuName();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "quantity";
                            n4 = ((CartProduct)object4).getQuantity();
                            jSONObject.put(string3, n4);
                            object3.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object.put((String)object2, object3);
                    }
                }
                object3 = "productDetails";
                string2.put((String)object3, object);
                bk3_2.c(purchaseReturnEvent, (JSONObject)string2);
                break block7;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(RemoveFromCartEvent object) {
        int n3;
        String string2;
        JSONObject jSONObject;
        Object object2;
        int n4;
        Object object3;
        Pair pair;
        Object object4;
        Object object5;
        int n7;
        Object object6;
        RetargetPref retargetPref;
        Object object7;
        Object object8;
        block17: {
            JSONException jSONException2;
            block16: {
                int n8;
                block15: {
                    object8 = "event";
                    Intrinsics.checkNotNullParameter(object, object8);
                    object7 = ((RemoveFromCartEvent)object).getCartProductList();
                    object7 = object7 != null ? (CartProduct)CollectionsKt.S((List)object7) : null;
                    retargetPref = RetargetPref.INSTANCE;
                    object6 = Event.REMOVE_FROM_CART;
                    n7 = 2;
                    object5 = RetargetPref.getEventConversionData$default(retargetPref, (Event)((Object)object6), null, n7, null);
                    object4 = object5 != null ? (object5 = ((ConversionDataModel)object5).b) : null;
                    if (object7 != null) {
                        object5 = ((CartProduct)object7).getProductId();
                    } else {
                        n8 = 0;
                        object5 = null;
                    }
                    object5 = String.valueOf(object5);
                    boolean bl2 = true;
                    pair = retargetPref.checkProductAvailbleForConversionLevel((String)object5, (Event)((Object)object6), bl2);
                    object6 = this.jsonSerializer;
                    object6.getClass();
                    Intrinsics.checkNotNullParameter(object, object8);
                    try {
                        object8 = new JSONObject();
                        object6 = "tms";
                        object5 = Utility.INSTANCE;
                        object3 = ((a)object).getTimestamp();
                        object5 = ((Utility)object5).getTimeStamp((Date)object3);
                        object8.put((String)object6, object5);
                        object6 = "eventId";
                        n8 = 4;
                        object8.put((String)object6, n8);
                        object6 = new JSONObject();
                        object5 = ((RemoveFromCartEvent)object).getCurrency();
                        if (object5 == null) break block15;
                        object5 = "currency";
                        object3 = ((RemoveFromCartEvent)object).getCurrency();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((Currency)object3).getCurrencyCode();
                        object6.put((String)object5, object3);
                    }
                    catch (JSONException jSONException2) {
                        break block16;
                    }
                }
                if ((object5 = ((RemoveFromCartEvent)object).getCartProductList()) != null) {
                    object5 = ((RemoveFromCartEvent)object).getCartProductList();
                    Intrinsics.checkNotNull(object5);
                    n8 = (int)(((CopyOnWriteArrayList)object5).isEmpty() ? 1 : 0);
                    if (n8 == 0) {
                        object5 = new JSONArray();
                        object3 = ((RemoveFromCartEvent)object).getCartProductList();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((CopyOnWriteArrayList)object3).iterator();
                        while ((n4 = object3.hasNext()) != 0) {
                            object2 = object3.next();
                            object2 = (CartProduct)object2;
                            jSONObject = new JSONObject();
                            String string3 = "id";
                            string2 = ((CartProduct)object2).getProductId();
                            jSONObject.put(string3, (Object)string2);
                            string3 = "price";
                            n3 = ((CartProduct)object2).getPrice();
                            jSONObject.put(string3, n3);
                            string3 = "vertical";
                            string2 = ((CartProduct)object2).getVertical();
                            jSONObject.put(string3, (Object)string2);
                            string3 = "segment";
                            string2 = ((CartProduct)object2).getSegment();
                            jSONObject.put(string3, (Object)string2);
                            string3 = "brickname";
                            string2 = ((CartProduct)object2).getBrickname();
                            jSONObject.put(string3, (Object)string2);
                            string3 = "sku";
                            string2 = ((CartProduct)object2).getSkuName();
                            jSONObject.put(string3, (Object)string2);
                            string3 = "quantity";
                            n4 = ((CartProduct)object2).getQuantity();
                            jSONObject.put(string3, n4);
                            object5.put((Object)jSONObject);
                        }
                        object3 = "productList";
                        object6.put((String)object3, object5);
                    }
                }
                object5 = "productDetails";
                object8.put((String)object5, object6);
                bk3_2.c((a)object, (JSONObject)object8);
                break block17;
            }
            object5 = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object5);
            object6 = "throwable";
            Intrinsics.checkNotNullParameter((Object)jSONException2, (String)object6);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object8 = JioAds$LogLevel.NONE;
            object8 = null;
        }
        if (object8 != null) {
            object6 = pair.b;
            object5 = "clickId";
            object8 = object8.put((String)object5, object6);
        } else {
            object8 = null;
        }
        this.sendSerializedEvent((JSONObject)object8);
        if (object7 != null) {
            if ((object = ((RemoveFromCartEvent)object).getCurrency()) != null) {
                object2 = object = ((Currency)object).getCurrencyCode();
            } else {
                n4 = 0;
                object2 = null;
            }
            int n10 = 16;
            n3 = 0;
            string2 = null;
            jSONObject = null;
            object6 = this;
            object5 = pair;
            object3 = object7;
            JioAdsEventService.createUrlsAndFireUrl$default(this, pair, (CartProduct)object7, (String)object2, (Integer)object4, false, n10, null);
        }
        object = (String)pair.b;
        object = (Boolean)pair.a;
        boolean bl3 = (Boolean)object;
        if (!bl3) {
            object = Event.PURCHASE_COMPLETED;
            object = RetargetPref.getEventConversionData$default(retargetPref, (Event)((Object)object), null, n7, null);
            object8 = (String)pair.b;
            object7 = object7 != null ? ((CartProduct)object7).getProductId() : null;
            if (object != null) {
                object = ((ConversionDataModel)object).b;
            } else {
                bl3 = false;
                object = null;
            }
            retargetPref.storeClickIds((String)object8, (String)object7, (Integer)object, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackEvent(RemoveFromWishListEvent removeFromWishListEvent) {
        String string2;
        block7: {
            JSONException jSONException2;
            Object object;
            block6: {
                int n3;
                Object object2;
                Object object3;
                block5: {
                    string2 = "event";
                    Intrinsics.checkNotNullParameter(removeFromWishListEvent, string2);
                    object = this.jsonSerializer;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(removeFromWishListEvent, string2);
                    try {
                        string2 = new JSONObject();
                        object = "tms";
                        object3 = Utility.INSTANCE;
                        object2 = removeFromWishListEvent.getTimestamp();
                        object3 = ((Utility)object3).getTimeStamp((Date)object2);
                        string2.put((String)object, object3);
                        object = "eventId";
                        n3 = 6;
                        string2.put((String)object, n3);
                        object = new JSONObject();
                        object3 = removeFromWishListEvent.getCurrency();
                        if (object3 == null) break block5;
                        object3 = "currency";
                        object2 = removeFromWishListEvent.getCurrency();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Currency)object2).getCurrencyCode();
                        object.put((String)object3, object2);
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                }
                if ((object3 = removeFromWishListEvent.getCartProductList()) != null) {
                    object3 = removeFromWishListEvent.getCartProductList();
                    Intrinsics.checkNotNull(object3);
                    n3 = (int)(((CopyOnWriteArrayList)object3).isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        int n4;
                        object3 = new JSONArray();
                        object2 = removeFromWishListEvent.getCartProductList();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CopyOnWriteArrayList)object2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            Object object4 = object2.next();
                            object4 = (CartProduct)object4;
                            JSONObject jSONObject = new JSONObject();
                            String string3 = "id";
                            String string4 = ((CartProduct)object4).getProductId();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "price";
                            int n7 = ((CartProduct)object4).getPrice();
                            jSONObject.put(string3, n7);
                            string3 = "vertical";
                            string4 = ((CartProduct)object4).getVertical();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "segment";
                            string4 = ((CartProduct)object4).getSegment();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "brickname";
                            string4 = ((CartProduct)object4).getBrickname();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "sku";
                            string4 = ((CartProduct)object4).getSkuName();
                            jSONObject.put(string3, (Object)string4);
                            string3 = "quantity";
                            n4 = ((CartProduct)object4).getQuantity();
                            jSONObject.put(string3, n4);
                            object3.put((Object)jSONObject);
                        }
                        object2 = "productList";
                        object.put((String)object2, object3);
                    }
                }
                object3 = "productDetails";
                string2.put((String)object3, object);
                bk3_2.c(removeFromWishListEvent, (JSONObject)string2);
                break block7;
            }
            object = "message";
            Intrinsics.checkNotNullParameter("Error in JSON serialisation", (String)object);
            Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            string2 = null;
        }
        this.sendSerializedEvent((JSONObject)string2);
    }
}

