/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1qSDK$AFa1tSDK;
import com.appsflyer.internal.AFf1vSDK;
import com.appsflyer.internal.AFf1wSDK;
import com.appsflyer.internal.AFf1ySDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFj1dSDK;
import com.appsflyer.internal.AFj1hSDK;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AFf1qSDK
extends AFf1vSDK {
    private final AppsFlyerProperties component3;
    private final AFj1hSDK copy;
    private final Map copydefault;
    private final AppsFlyerInAppPurchaseValidationCallback equals;
    private final AFPurchaseDetails toString;

    public AFf1qSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map2, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFd1kSDK, string2);
        Intrinsics.checkNotNullParameter(appsFlyerProperties, string2);
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, string2);
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map2, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
    }

    private AFf1qSDK(AFd1kSDK object, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map2, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, object2);
        Intrinsics.checkNotNullParameter(appsFlyerProperties, object2);
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, object2);
        Intrinsics.checkNotNullParameter(aFj1hSDK, object2);
        AFf1zSDK aFf1zSDK = AFf1zSDK.values;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[2];
        object2 = AFf1zSDK.getRevenue;
        aFf1zSDKArray[0] = object2;
        object2 = AFf1zSDK.AFAdRevenueData;
        aFf1zSDKArray[1] = object2;
        nz0_2 nz0_22 = fh1_2.f();
        super(aFf1zSDK, aFf1zSDKArray, (AFd1kSDK)object, null, nz0_22);
        this.component3 = appsFlyerProperties;
        this.toString = aFPurchaseDetails;
        this.copydefault = map2;
        this.equals = appsFlyerInAppPurchaseValidationCallback;
        this.copy = aFj1hSDK;
        object = AFf1zSDK.getMonetizationNetwork;
        this.getCurrencyIso4217Code.add(object);
    }

    public /* synthetic */ AFf1qSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map2, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 0x20) != 0) {
        }
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map2, appsFlyerInAppPurchaseValidationCallback, aFj1hSDK);
    }

    private final void getMediationNetwork(String object, int n3) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            Serializable serializable = n3;
            Pair pair = new Pair("error_code", serializable);
            serializable = new Pair("error_message", object);
            int n4 = 2;
            object = new Pair[n4];
            object[0] = pair;
            int n7 = 1;
            object[n7] = serializable;
            object = fh1_2.i(object);
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError((Map)object);
        }
    }

    public final AFe1tSDK AFAdRevenueData(Map map2, String string2, String string3) {
        string3 = "";
        Intrinsics.checkNotNullParameter(map2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        return this.component2.getMonetizationNetwork(map2, string2);
    }

    public final String AFAdRevenueData(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        return this.copy.AFAdRevenueData();
    }

    public final void AFAdRevenueData(Map object, String object2) {
        boolean bl2;
        int n3;
        Object object3;
        block8: {
            block7: {
                Intrinsics.checkNotNullParameter(object, "");
                super.AFAdRevenueData((Map)object, (String)object2);
                object2 = this.toString.getPurchaseToken();
                object3 = this.toString.getProductId();
                String string2 = this.toString.getPrice();
                String string3 = this.toString.getCurrency();
                object2 = xx_2.i(object2, object3, string2, string3);
                n3 = object2 instanceof Collection;
                if (n3 == 0) break block7;
                object3 = object2;
                object3 = (Collection)object2;
                n3 = object3.isEmpty();
                if (n3 != 0) break block8;
            }
            object2 = ((Iterable)object2).iterator();
            while ((n3 = object2.hasNext()) != 0) {
                object3 = (String)object2.next();
                n3 = ((String)object3).length();
                if (n3 != 0) continue;
                object = new AFf1qSDK$AFa1tSDK();
                throw object;
            }
        }
        object2 = this.toString.getPurchaseToken();
        object.put("purchase_token", object2);
        object2 = this.toString.getProductId();
        object.put("product_id", object2);
        object2 = this.toString.getPrice();
        object.put("revenue", object2);
        object2 = this.toString.getCurrency();
        object.put("currency", object2);
        object2 = this.toString.getPurchaseType().getValue();
        object3 = "purchase_type";
        object.put(object3, object2);
        object2 = this.copydefault;
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            object2 = "extra_event_values";
            object3 = this.copydefault;
            object.put(object2, object3);
        }
        object2 = this.component3;
        object3 = "additionalCustomData";
        if ((object2 = ((AppsFlyerProperties)object2).getString((String)object3)) != null && (n3 = ((String)object2).length()) != 0) {
            object3 = new JSONObject((String)object2);
            object2 = AFj1dSDK.AFAdRevenueData((JSONObject)object3);
        } else {
            object2 = fh1_2.f();
        }
        object.put("custom_data", object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getRevenue() {
        block12: {
            AFe1kSDK aFe1kSDK;
            int n3;
            int n4;
            block13: {
                Object object;
                block10: {
                    Throwable throwable3;
                    block11: {
                        int n7;
                        block9: {
                            super.getRevenue();
                            Throwable throwable2 = this.component1();
                            if (throwable2 != null && (n7 = throwable2 instanceof AFf1ySDK) == 0) {
                                n7 = throwable2 instanceof AFf1wSDK;
                                n4 = -1;
                                if (n7 != 0) {
                                    String string2 = "No dev key";
                                    this.getMediationNetwork(string2, n4);
                                } else {
                                    n3 = throwable2 instanceof AFf1qSDK$AFa1tSDK;
                                    if (n3 != 0) {
                                        String string3 = "One or more of provided arguments is empty";
                                        this.getMediationNetwork(string3, n4);
                                    } else {
                                        String string4 = "Error while sending request to server";
                                        this.getMediationNetwork(string4, n4);
                                    }
                                }
                            }
                            if ((aFe1kSDK = this.component4) == null) break block12;
                            n7 = aFe1kSDK.getStatusCode();
                            if (n7 != (n4 = 200)) break block13;
                            try {
                                object = tl2_2.b;
                                object = this.equals;
                                if (object == null) break block9;
                                Object object2 = aFe1kSDK.getBody();
                                object2 = (String)object2;
                                JSONObject jSONObject = new JSONObject((String)object2);
                                Map map2 = AFj1dSDK.AFAdRevenueData(jSONObject);
                                object.onInAppPurchaseValidationFinished(map2);
                                object = Unit.a;
                                break block10;
                            }
                            catch (Throwable throwable3) {
                                break block11;
                            }
                        }
                        n7 = 0;
                        object = null;
                        break block10;
                    }
                    tL2$a tL2$a = tl2_2.b;
                    object = vl2_2.a(throwable3);
                }
                object = tl2_2.a(object);
                if (object != null) {
                    object = "Error while trying to parse JSON response";
                    n3 = aFe1kSDK.getStatusCode();
                    this.getMediationNetwork((String)object, n3);
                }
                return;
            }
            AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
            if (appsFlyerInAppPurchaseValidationCallback != null) {
                n4 = aFe1kSDK.getStatusCode();
                Integer n8 = n4;
                Pair pair = new Pair("error_code", n8);
                Object object = aFe1kSDK.getBody();
                Pair pair2 = new Pair("error_message", object);
                n3 = 2;
                Pair[] pairArray = new Pair[n3];
                pairArray[0] = pair;
                int n10 = 1;
                pairArray[n10] = pair2;
                Map map3 = fh1_2.i(pairArray);
                appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(map3);
            }
        }
    }
}

