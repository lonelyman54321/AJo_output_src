/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1hSDK$AFa1vSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1kSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1jSDK;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class AFf1hSDK
extends AFe1eSDK {
    private final AFd1nSDK areAllFieldsValid;
    private final String component1;
    private final AFd1qSDK component2;
    private final ExecutorService component3;
    private final AFg1kSDK component4;
    private final AFg1wSDK hashCode;

    public AFf1hSDK(AFd1kSDK object, String object2) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, string2);
        AFf1zSDK aFf1zSDK = AFf1zSDK.component1;
        AFf1zSDK aFf1zSDK2 = AFf1zSDK.getRevenue;
        aFf1zSDK2 = AFf1zSDK.getMonetizationNetwork;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{aFf1zSDK2, aFf1zSDK2};
        super(aFf1zSDK, aFf1zSDKArray, "RegisterTrigger");
        this.component1 = object2;
        object2 = object.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.component3 = object2;
        object2 = object.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.component2 = object2;
        object2 = object.values();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.areAllFieldsValid = object2;
        object2 = object.component1();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.component4 = object2;
        object = object.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.hashCode = object;
    }

    public static final /* synthetic */ void getMonetizationNetwork(Throwable throwable) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMediationNetwork;
        String string2 = throwable.getMessage();
        string2 = kp1_0.c("Error occurred: ", string2);
        aFLogger.e(aFh1vSDK, string2, throwable, false, false, false, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1cSDK AFAdRevenueData() {
        Throwable throwable;
        Throwable throwable22;
        Object object;
        Ref$ObjectRef ref$ObjectRef;
        block8: {
            block6: {
                Object object2;
                Object object3;
                String string2;
                Object object4;
                Object object5;
                int n3;
                AFf1hSDK aFf1hSDK;
                block7: {
                    aFf1hSDK = this;
                    int n4 = 2;
                    ref$ObjectRef = new Ref$ObjectRef();
                    object = AFe1cSDK.getMonetizationNetwork;
                    ref$ObjectRef.element = object;
                    n3 = 1;
                    object = new CountDownLatch(n3);
                    try {
                        object5 = this.areAllFieldsValid;
                        object5 = ((AFd1nSDK)object5).AFAdRevenueData;
                        if (object5 == null) break block6;
                        object5 = gl1_1.a((Context)object5);
                        if ((object5 = (ll1_0)object5) == null) break block6;
                        object4 = this.component2;
                        string2 = null;
                        object5 = new AFj1jSDK((AFd1qSDK)object4, null, n4, null);
                        object5 = AFj1jSDK.getCurrencyIso4217Code();
                        object5 = Uri.parse((String)object5);
                        object5 = object5.buildUpon();
                        object4 = this.component2;
                        object4 = object4.getMonetizationNetwork();
                        string2 = "";
                        if (object4 == null) {
                            object4 = string2;
                        }
                        String string3 = "event_name";
                        Object object6 = aFf1hSDK.component1;
                        Pair pair = new Pair(string3, object6);
                        string3 = "app_id";
                        object6 = aFf1hSDK.component2;
                        object6 = ((AFd1qSDK)object6).getMonetizationNetwork;
                        object6 = ((AFd1nSDK)object6).AFAdRevenueData;
                        object6 = object6.getPackageName();
                        Pair pair2 = new Pair(string3, object6);
                        string3 = "app_version";
                        object6 = aFf1hSDK.component2;
                        object6 = ((AFd1qSDK)object6).getMonetizationNetwork;
                        object6 = ((AFd1nSDK)object6).AFAdRevenueData;
                        Object object7 = object6.getPackageName();
                        object6 = AFb1qSDK.getMediationNetwork((Context)object6, (String)object7);
                        object7 = new Pair(string3, object6);
                        string3 = "sdk_version";
                        object6 = AFd1qSDK.getRevenue();
                        Pair pair3 = new Pair(string3, object6);
                        string3 = "api_version";
                        object6 = AFd1qSDK.getCurrencyIso4217Code();
                        Pair pair4 = new Pair(string3, object6);
                        string3 = "timestamp";
                        object6 = aFf1hSDK.component4;
                        long l2 = object6.getCurrencyIso4217Code();
                        object6 = String.valueOf(l2);
                        Pair pair5 = new Pair(string3, object6);
                        string3 = "request_id";
                        object6 = AFd1qSDK.getMediationNetwork();
                        object3 = new Pair(string3, object6);
                        string3 = "gaid";
                        object6 = new Pair(string3, object4);
                        int n7 = 8;
                        object4 = new Pair[n7];
                        string3 = null;
                        object4[0] = pair;
                        object4[n3] = pair2;
                        n3 = 2;
                        object4[n3] = object7;
                        n3 = 3;
                        object4[n3] = pair3;
                        n3 = 4;
                        object4[n3] = pair4;
                        n3 = 5;
                        object4[n3] = pair5;
                        n3 = 6;
                        object4[n3] = object3;
                        n4 = 7;
                        object4[n4] = object6;
                        object3 = fh1_2.j(object4);
                        object2 = aFf1hSDK.component2;
                        object4 = ((AFd1qSDK)object2).getMonetizationNetwork;
                        object2 = ((AFd1qSDK)object2).getRevenue;
                        if ((object2 = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object4, (AFd1rSDK)object2)) == null) break block7;
                        object4 = "appsflyer_id";
                        object3.put(object4, object2);
                    }
                    catch (Throwable throwable22) {
                        throwable = throwable22;
                        break block8;
                    }
                }
                object2 = aFf1hSDK.component4;
                if ((object2 = object2.AFAdRevenueData()) != null) {
                    long l3 = ((Number)object2).longValue();
                    object2 = "install_time";
                    object4 = String.valueOf(l3);
                    object3.put(object2, object4);
                }
                object3 = object3.entrySet();
                object3 = object3.iterator();
                while (true) {
                    if ((n3 = (int)(object3.hasNext() ? 1 : 0)) == 0) {
                        object3 = object5.build();
                        Intrinsics.checkNotNullExpressionValue(object3, string2);
                        object3 = new AFf1hSDK$AFa1vSDK(ref$ObjectRef, (CountDownLatch)object, aFf1hSDK);
                        object = "Stub!";
                        object3 = new RuntimeException((String)object);
                        throw object3;
                    }
                    object2 = object3.next();
                    object2 = (Map.Entry)object2;
                    object4 = object2.getKey();
                    object4 = (String)object4;
                    object2 = object2.getValue();
                    object2 = (String)object2;
                    object5.appendQueryParameter((String)object4, (String)object2);
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long l4 = 4;
            ((CountDownLatch)object).await(l4, timeUnit);
            return (AFe1cSDK)((Object)ref$ObjectRef.element);
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMediationNetwork;
        String string4 = throwable22.getMessage();
        object = "Error occurred: ";
        String string5 = kp1_0.c((String)object, string4);
        Object var11_16 = null;
        Object var12_18 = null;
        Object var13_20 = null;
        boolean bl2 = true;
        aFLogger.e(aFh1vSDK, string5, throwable, false, false, false, bl2);
        return (AFe1cSDK)((Object)ref$ObjectRef.element);
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return 20000L;
    }
}

