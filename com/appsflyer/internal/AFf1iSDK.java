/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult$Error;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1iSDK$AFa1uSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1oSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1jSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import com.appsflyer.internal.AFj1uSDK;
import com.appsflyer.internal.o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AFf1iSDK
extends AFf1oSDK {
    private final CountDownLatch AFInAppEventParameterName;
    private final List AFInAppEventType;
    private int AFKeystoreWrapper;
    private final AFc1qSDK component3;
    private final AFd1qSDK copy;
    private final AFh1oSDK copydefault;
    private final AFd1tSDK equals;
    private final AFc1kSDK hashCode;
    private final AFj1uSDK toString;
    private int valueOf;
    private int values;

    public AFf1iSDK(AFc1qSDK object, AFd1kSDK object2) {
        boolean bl2;
        int n3;
        Object object3;
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, string2);
        Object object4 = AFf1zSDK.component3;
        int n4 = 2;
        Object object5 = new AFf1zSDK[n4];
        Object object6 = AFf1zSDK.getRevenue;
        object5[0] = object6;
        object6 = AFf1zSDK.AFAdRevenueData;
        int n7 = 1;
        object5[n7] = object6;
        object6 = "DdlSdk";
        super((AFf1zSDK)((Object)object4), (AFf1zSDK[])object5, (AFd1kSDK)object2, (String)object6);
        this.component3 = object;
        this.AFInAppEventParameterName = object = new CountDownLatch(n7);
        object = new ArrayList();
        this.AFInAppEventType = object;
        object = object2.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.copy = object;
        object = object2.e();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.equals = object;
        object = object2.d();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.hashCode = object;
        object = object2.component3();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.copydefault = object;
        object = object2.equals();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.toString = object;
        object = ((AFj1uSDK)object).getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object2 = new ArrayList();
        Object object7 = ((AFj1sSDK[])object).length;
        for (int i3 = 0; i3 < object7; i3 += n7) {
            object5 = object[i3];
            if (object5 == null || (object6 = ((AFj1sSDK)object5).component2) == (object3 = AFj1sSDK$AFa1zSDK.getMediationNetwork)) continue;
            object2.add(object5);
        }
        this.valueOf = n3 = object2.size();
        object = object2.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (AFj1sSDK)object.next();
            object4 = ((AFj1sSDK)object2).component2;
            if (object4 == null) {
                object7 = -1;
            } else {
                object5 = AFf1iSDK$AFa1uSDK.getCurrencyIso4217Code;
                object7 = ((Enum)object4).ordinal();
                object7 = (Object)object5[object7];
            }
            if (object7 != n7) {
                if (object7 != n4) continue;
                object4 = new o((AFj1sSDK)object2, this);
                ((Observable)object2).addObserver((Observer)object4);
                continue;
            }
            object3 = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.copy;
            object4 = ((AFj1sSDK)object2).getMediationNetwork.get("source");
            super();
            ((StringBuilder)object5).append(object4);
            object4 = " referrer collected earlier";
            ((StringBuilder)object5).append((String)object4);
            String string3 = ((StringBuilder)object5).toString();
            int n8 = 4;
            AFh1uSDK.d$default((AFh1uSDK)object3, aFh1vSDK, string3, false, n8, null);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            this.getMediationNetwork((AFj1sSDK)object2);
        }
    }

    public static /* synthetic */ void a(AFj1sSDK aFj1sSDK, AFf1iSDK aFf1iSDK, Observable observable, Object object) {
        AFf1iSDK.getRevenue(aFj1sSDK, aFf1iSDK, observable, object);
    }

    private final boolean copy() {
        int n3;
        Object object = this.component3.getMonetizationNetwork();
        String string2 = "referrers";
        boolean bl2 = (object = object.get(string2)) instanceof List;
        if (bl2) {
            object = (List)object;
        } else {
            n3 = 0;
            object = null;
        }
        bl2 = false;
        if (object != null) {
            n3 = object.size();
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = this.valueOf;
        return n3 < n4 && (n3 = (int)((object = this.component3.getMonetizationNetwork()).containsKey(string2) ? 1 : 0)) == 0;
    }

    private static Map getCurrencyIso4217Code(AFb1tSDK object) {
        Pair[] pairArray;
        if (object != null && (pairArray = ((AFb1tSDK)object).getRevenue) != null) {
            boolean bl2;
            Object object2 = "";
            Intrinsics.checkNotNullExpressionValue(pairArray, (String)object2);
            object = ((AFb1tSDK)object).AFAdRevenueData;
            if (object == null || !(bl2 = ((Boolean)object).booleanValue())) {
                object = new Pair("type", "unhashed");
                object2 = new Pair("value", pairArray);
                pairArray = new Pair[]{object, object2};
                return fh1_2.i(pairArray);
            }
        }
        return null;
    }

    private final void getMediationNetwork(AFj1sSDK object) {
        int n3;
        int n4 = AFf1iSDK.getMonetizationNetwork((AFj1sSDK)object);
        if (n4 != 0) {
            this.AFInAppEventType.add(object);
            this.AFInAppEventParameterName.countDown();
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.copy;
            object = object.getClass().getSimpleName();
            String string2 = "Added non-organic ".concat((String)object);
            AFh1uSDK.d$default(aFLogger, aFh1vSDK, string2, false, 4, null);
            return;
        }
        this.values = n3 = this.values + 1;
        n4 = this.valueOf;
        if (n3 == n4) {
            object = this.AFInAppEventParameterName;
            ((CountDownLatch)object).countDown();
        }
    }

    private static boolean getMonetizationNetwork(AFj1sSDK object) {
        Object object2;
        object = ((AFj1sSDK)object).getMediationNetwork;
        String string2 = "click_ts";
        boolean bl2 = (object = object.get(string2)) instanceof Long;
        if (bl2) {
            object = (Long)object;
        } else {
            object2 = 0;
            object = null;
        }
        bl2 = false;
        string2 = null;
        if (object != null) {
            long l2 = ((Number)object).longValue();
            long l3 = System.currentTimeMillis();
            l2 = TimeUnit.SECONDS.toMillis(l2);
            object = TimeUnit.DAYS;
            long l4 = (l3 -= l2) - (l2 = ((TimeUnit)((Object)object)).toMillis(1L));
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 < 0) {
                return true;
            }
        }
        return false;
    }

    private static final void getRevenue(AFj1sSDK aFj1sSDK, AFf1iSDK aFf1iSDK, Observable observable, Object object) {
        object = "";
        Intrinsics.checkNotNullParameter(aFf1iSDK, (String)object);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.copy;
        aFj1sSDK = aFj1sSDK.getMediationNetwork.get("source");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(aFj1sSDK);
        charSequence.append(" referrer collected via observer");
        charSequence = charSequence.toString();
        AFh1uSDK.d$default(aFLogger, aFh1vSDK, (String)charSequence, false, 4, null);
        Intrinsics.checkNotNull(observable, (String)object);
        observable = (AFj1sSDK)observable;
        aFf1iSDK.getMediationNetwork((AFj1sSDK)observable);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1cSDK AFAdRevenueData() {
        Object object;
        String string2;
        long l2;
        AFLogger aFLogger;
        int n3;
        Object object2;
        int n4;
        String string3;
        Object object3;
        int n7;
        Object object4;
        Object object5;
        AFf1iSDK aFf1iSDK;
        block24: {
            Object object6;
            block21: {
                block23: {
                    block22: {
                        aFf1iSDK = this;
                        object6 = "";
                        object5 = "Error occurred. Server response code = ";
                        object4 = AFe1cSDK.getMonetizationNetwork;
                        n7 = 1;
                        object3 = super.AFAdRevenueData();
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
                        try {
                            Object object7;
                            long[] lArray;
                            Object object8;
                            object4 = this.copydefault;
                            Object object9 = this.AFKeystoreWrapper;
                            string3 = "ddl";
                            long l3 = 0L;
                            n4 = 2;
                            if (object9 > 0 && object9 <= n4) {
                                object8 = ((AFh1oSDK)object4).component2;
                                long l4 = System.currentTimeMillis();
                                object8[object9 -= n7] = l4;
                                object8 = ((AFh1oSDK)object4).component1;
                                l4 = (long)object8[object9];
                                long l7 = l4 - l3;
                                Object object10 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                if (object10 != false) {
                                    object8 = ((AFh1oSDK)object4).component4;
                                    lArray = ((AFh1oSDK)object4).component2;
                                    long l8 = lArray[object9] - l4;
                                    object8[object9] = l8;
                                    object2 = ((AFh1oSDK)object4).getRevenue;
                                    object7 = "net";
                                    object2.put(object7, object8);
                                    object2 = ((AFh1oSDK)object4).getRevenue;
                                    object8 = new JSONObject((Map)object2);
                                    object4 = ((AFh1oSDK)object4).AFAdRevenueData;
                                    object2 = object8.toString();
                                    object4.AFAdRevenueData(string3, (String)object2);
                                } else {
                                    object8 = "Metrics: ddlStart[";
                                    object4 = new StringBuilder((String)object8);
                                    ((StringBuilder)object4).append((int)object9);
                                    object2 = "] ts is missing";
                                    ((StringBuilder)object4).append((String)object2);
                                    object4 = object4.toString();
                                    AFLogger.afInfoLog((String)object4);
                                }
                            } else {
                                object4 = "Unexpected ddl requestCount - end";
                                object7 = "Metrics: Unexpected ddl requestCount = ";
                                object2 = String.valueOf(object9);
                                object2 = object7.concat((String)object2);
                                object8 = new IllegalStateException((String)object2);
                                AFLogger.afErrorLogForExcManagerOnly((String)object4, (Throwable)object8);
                            }
                            object4 = AFf1iSDK$AFa1uSDK.AFAdRevenueData;
                            object9 = object3.ordinal();
                            AFe1cSDK aFe1cSDK = object4[object9];
                            if (aFe1cSDK != n7) {
                                if (aFe1cSDK != n4) {
                                    return object3;
                                }
                                object8 = AFLogger.INSTANCE;
                                object7 = AFh1vSDK.copy;
                                object6 = aFf1iSDK.component4;
                                if (object6 != null) {
                                    int n8 = ((AFe1kSDK)object6).getStatusCode();
                                    object6 = n8;
                                } else {
                                    boolean bl2 = false;
                                    object6 = null;
                                }
                                object4 = new StringBuilder((String)object5);
                                ((StringBuilder)object4).append(object6);
                                String string4 = ((StringBuilder)object4).toString();
                                int n10 = 4;
                                boolean bl3 = false;
                                lArray = null;
                                AFh1uSDK.d$default((AFh1uSDK)object8, (AFh1vSDK)((Object)object7), string4, false, n10, null);
                                object5 = DeepLinkResult$Error.HTTP_STATUS_CODE;
                                object6 = new DeepLinkResult(null, (DeepLinkResult$Error)((Object)object5));
                                object5 = aFf1iSDK.copydefault;
                                object4 = aFf1iSDK.hashCode;
                                long l12 = ((AFc1kSDK)object4).component3;
                                ((AFh1oSDK)object5).getRevenue((DeepLinkResult)object6, l12);
                                object5 = aFf1iSDK.hashCode;
                                ((AFc1kSDK)object5).getMonetizationNetwork((DeepLinkResult)object6);
                                return object3;
                            }
                            object5 = aFf1iSDK.component4;
                            Intrinsics.checkNotNull(object5);
                            object5 = ((AFe1kSDK)object5).getBody();
                            Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
                            object5 = (AFc1pSDK)object5;
                            object6 = ((AFc1pSDK)object5).getCurrencyIso4217Code;
                            if (object6 != null) {
                                object5 = new DeepLinkResult((DeepLink)object6, null);
                                object6 = aFf1iSDK.copydefault;
                                object4 = aFf1iSDK.hashCode;
                                long l14 = ((AFc1kSDK)object4).component3;
                                ((AFh1oSDK)object6).getRevenue((DeepLinkResult)object5, l14);
                                object6 = aFf1iSDK.hashCode;
                                ((AFc1kSDK)object6).getMonetizationNetwork((DeepLinkResult)object5);
                                return object3;
                            }
                            n3 = aFf1iSDK.AFKeystoreWrapper;
                            if (n3 > n7 || (n3 = (int)(((AFc1pSDK)object5).getCurrencyIso4217Code() ? 1 : 0)) == 0 || (n3 = (int)(this.copy() ? 1 : 0)) == 0) break block21;
                            aFLogger = AFLogger.INSTANCE;
                            object8 = AFh1vSDK.copy;
                            object7 = "Waiting for referrers...";
                            int n14 = 4;
                            boolean bl4 = false;
                            Object var23_29 = null;
                            AFh1uSDK.d$default(aFLogger, (AFh1vSDK)((Object)object8), object7, false, n14, null);
                            object6 = aFf1iSDK.AFInAppEventParameterName;
                            ((CountDownLatch)object6).await();
                            object6 = aFf1iSDK.copydefault;
                            l2 = System.currentTimeMillis();
                            object2 = ((AFh1oSDK)object6).component2;
                            n4 = 0;
                            aFLogger = null;
                            AFh1vSDK aFh1vSDK = object2[0];
                            object9 = aFh1vSDK == l3 ? 0 : (aFh1vSDK < l3 ? -1 : 1);
                            if (object9 == 0) break block22;
                            object2 = ((AFh1oSDK)object6).getRevenue;
                            string2 = "rfr_wait";
                            l2 -= aFh1vSDK;
                        }
                        catch (Exception exception) {
                            object4 = object3;
                            break block24;
                        }
                        object5 = l2;
                        object2.put(string2, object5);
                        object5 = ((AFh1oSDK)object6).getRevenue;
                        object4 = new JSONObject((Map)object5);
                        object6 = ((AFh1oSDK)object6).AFAdRevenueData;
                        object5 = object4.toString();
                        object6.AFAdRevenueData(string3, (String)object5);
                        break block23;
                    }
                    object6 = "Metrics: ddlEnd[0] ts is missing";
                    AFLogger.afInfoLog((String)object6);
                }
                n3 = aFf1iSDK.values;
                int n15 = aFf1iSDK.valueOf;
                if (n3 != n15) return this.AFAdRevenueData();
                object6 = new DeepLinkResult(null, null);
                object5 = aFf1iSDK.copydefault;
                object4 = aFf1iSDK.hashCode;
                long l15 = ((AFc1kSDK)object4).component3;
                ((AFh1oSDK)object5).getRevenue((DeepLinkResult)object6, l15);
                object5 = aFf1iSDK.hashCode;
                ((AFc1kSDK)object5).getMonetizationNetwork((DeepLinkResult)object6);
                return AFe1cSDK.getRevenue;
            }
            object6 = new DeepLinkResult(null, null);
            object5 = aFf1iSDK.copydefault;
            object4 = aFf1iSDK.hashCode;
            long l16 = ((AFc1kSDK)object4).component3;
            ((AFh1oSDK)object5).getRevenue((DeepLinkResult)object6, l16);
            object5 = aFf1iSDK.hashCode;
            ((AFc1kSDK)object5).getMonetizationNetwork((DeepLinkResult)object6);
            return object3;
            catch (Exception exception) {
                // empty catch block
            }
        }
        object5 = ((Throwable)object).getCause();
        boolean bl5 = object5 instanceof InterruptedException;
        if (!bl5) {
            n7 = object5 instanceof InterruptedIOException;
        }
        if (n7 != 0) {
            object = new TimeoutException();
            AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", (Throwable)object);
            object3 = AFLogger.INSTANCE;
            object2 = AFh1vSDK.copy;
            n3 = aFf1iSDK.AFKeystoreWrapper;
            l2 = aFf1iSDK.hashCode.component3;
            StringBuilder stringBuilder = new StringBuilder("Timeout, didn't manage to find deferred deeplink after ");
            stringBuilder.append(n3);
            stringBuilder.append(" attempt(s) within ");
            stringBuilder.append(l2);
            stringBuilder.append(" milliseconds");
            string3 = stringBuilder.toString();
            int n16 = 4;
            n4 = 0;
            aFLogger = null;
            string2 = null;
            AFh1uSDK.d$default((AFh1uSDK)object3, (AFh1vSDK)((Object)object2), string3, false, n16, null);
            object5 = DeepLinkResult$Error.TIMEOUT;
            object = new DeepLinkResult(null, (DeepLinkResult$Error)((Object)object5));
            object5 = aFf1iSDK.copydefault;
            object4 = aFf1iSDK.hashCode;
            long l17 = ((AFc1kSDK)object4).component3;
            ((AFh1oSDK)object5).getRevenue((DeepLinkResult)object, l17);
            object5 = aFf1iSDK.hashCode;
            ((AFc1kSDK)object5).getMonetizationNetwork((DeepLinkResult)object);
            return AFe1cSDK.getMediationNetwork;
        }
        boolean bl6 = object5 instanceof IOException;
        if (bl6) {
            object3 = AFLogger.INSTANCE;
            object2 = AFh1vSDK.copy;
            int n17 = 4;
            n4 = 0;
            aFLogger = null;
            string3 = "Http Exception: the request was not sent to the server";
            string2 = null;
            AFh1uSDK.d$default((AFh1uSDK)object3, (AFh1vSDK)((Object)object2), string3, false, n17, null);
            object5 = DeepLinkResult$Error.NETWORK;
            object = new DeepLinkResult(null, (DeepLinkResult$Error)((Object)object5));
            object5 = aFf1iSDK.copydefault;
            AFc1kSDK aFc1kSDK = aFf1iSDK.hashCode;
            long l18 = aFc1kSDK.component3;
            ((AFh1oSDK)object5).getRevenue((DeepLinkResult)object, l18);
            object5 = aFf1iSDK.hashCode;
            ((AFc1kSDK)object5).getMonetizationNetwork((DeepLinkResult)object);
            return object4;
        } else {
            object3 = AFLogger.INSTANCE;
            object2 = AFh1vSDK.copy;
            object5 = new StringBuilder("Unexpected Exception: ");
            ((StringBuilder)object5).append(object);
            string3 = ((StringBuilder)object5).toString();
            int n18 = 4;
            n4 = 0;
            aFLogger = null;
            string2 = null;
            AFh1uSDK.d$default((AFh1uSDK)object3, (AFh1vSDK)((Object)object2), string3, false, n18, null);
            object5 = DeepLinkResult$Error.UNEXPECTED;
            object = new DeepLinkResult(null, (DeepLinkResult$Error)((Object)object5));
            object5 = aFf1iSDK.copydefault;
            AFc1kSDK aFc1kSDK = aFf1iSDK.hashCode;
            long l19 = aFc1kSDK.component3;
            ((AFh1oSDK)object5).getRevenue((DeepLinkResult)object, l19);
            object5 = aFf1iSDK.hashCode;
            ((AFc1kSDK)object5).getMonetizationNetwork((DeepLinkResult)object);
        }
        return object4;
    }

    public final boolean a_() {
        return false;
    }

    public final boolean copydefault() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final AFe1tSDK getMediationNetwork(String var1_1) {
        var2_2 = 2;
        var3_3 = 0;
        var4_4 = null;
        var5_5 = "";
        Intrinsics.checkNotNullParameter(var1_1, var5_5);
        var6_6 = this.AFKeystoreWrapper;
        var7_7 = 1;
        this.AFKeystoreWrapper = var6_6 += var7_7;
        var8_8 = AFLogger.INSTANCE;
        var9_9 /* !! */  = AFh1vSDK.copy;
        var10_10 = hj0_0.a(var6_6, "Preparing request ");
        var11_11 = 4;
        var12_12 /* !! */  = null;
        var13_13 = 0;
        var14_14 = null;
        AFh1uSDK.d$default((AFh1uSDK)var8_8, var9_9 /* !! */ , (String)var10_10, false, var11_11, null);
        var1_1 = this.component3.getMonetizationNetwork();
        var15_15 = this.AFKeystoreWrapper;
        var16_16 = 0;
        var9_9 /* !! */  = null;
        if (var15_15 == var7_7) {
            var8_8 = this.copy.getRevenue;
            var10_10 = "appsFlyerCount";
            var15_15 = var8_8.getMediationNetwork((String)var10_10, 0);
            if (var15_15 == 0) {
                var15_15 = 1;
            } else {
                var15_15 = 0;
                var8_8 = null;
            }
            var8_8 = (boolean)var15_15;
            var1_1.put("is_first", var8_8);
            var8_8 = Locale.getDefault().getLanguage();
            var10_10 = Locale.getDefault().getCountry();
            var14_14 = new StringBuilder();
            var14_14.append((String)var8_8);
            var14_14.append("-");
            var14_14.append((String)var10_10);
            var8_8 = var14_14.toString();
            var1_1.put("lang", var8_8);
            var10_10 = Build.VERSION.RELEASE;
            var1_1.put("os", var10_10);
            var10_10 = Build.MODEL;
            var1_1.put("type", var10_10);
            var8_8 = this.copy;
            var10_10 = var8_8.getMonetizationNetwork;
            var8_8 = var8_8.getRevenue;
            var8_8 = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)var10_10, (AFd1rSDK)var8_8);
            var10_10 = "request_id";
            var1_1.put(var10_10, var8_8);
            var8_8 = this.equals.getMediationNetwork;
            if (var8_8 != null && (var8_8 = var8_8.getCurrencyIso4217Code) != null) {
                Intrinsics.checkNotNullExpressionValue(var8_8, var5_5);
                var10_10 = "sharing_filter";
                var1_1.put(var10_10, var8_8);
            }
            if ((var8_8 = this.copy.AFAdRevenueData.component4) != null) {
                var14_14 = var8_8.getMonetizationNetwork;
                var8_8 = var8_8.AFAdRevenueData;
                var10_10 = new AFb1tSDK((String)var14_14, (Boolean)var8_8);
            } else {
                var10_10 = null;
            }
            var8_8 = AFf1iSDK.getCurrencyIso4217Code((AFb1tSDK)var10_10);
            if (var8_8 != null) {
                var10_10 = "gaid";
                var1_1.put(var10_10, var8_8);
            }
            if ((var8_8 = AFf1iSDK.getCurrencyIso4217Code(AFb1vSDK.getCurrencyIso4217Code(this.copy.getMonetizationNetwork.AFAdRevenueData))) != null) {
                var10_10 = "oaid";
                var1_1.put(var10_10, var8_8);
            }
        }
        var17_17 /* !! */  = System.currentTimeMillis();
        var19_18 = Locale.US;
        var12_12 /* !! */  = "yyyy-MM-dd'T'HH:mm:ss.SSS";
        var8_8 = new SimpleDateFormat((String)var12_12 /* !! */ , (Locale)var19_18);
        var19_18 = TimeZone.getTimeZone("UTC");
        var8_8.setTimeZone((TimeZone)var19_18);
        var19_18 = new Date(var17_17 /* !! */ );
        var8_8 = var8_8.format((Date)var19_18);
        var10_10 = "timestamp";
        var1_1.put(var10_10, var8_8);
        var15_15 = this.AFKeystoreWrapper;
        var8_8 = var15_15;
        var1_1.put("request_count", var8_8);
        var8_8 = this.AFInAppEventType;
        var14_14 = new ArrayList();
        var8_8 = var8_8.iterator();
        while ((var11_11 = (int)var8_8.hasNext()) != 0) {
            var19_18 = (AFj1sSDK)var8_8.next();
            var12_12 /* !! */  = var19_18.component2;
            var20_19 /* !! */  = AFj1sSDK$AFa1zSDK.getRevenue;
            if (var12_12 /* !! */  != var20_19 /* !! */ ) ** GOTO lbl-1000
            var12_12 /* !! */  = var19_18.getMediationNetwork;
            var20_19 /* !! */  = "referrer";
            var21_20 = (var12_12 /* !! */  = var12_12 /* !! */ .get((Object)var20_19 /* !! */ )) instanceof String;
            if (!var21_20) {
                var12_12 /* !! */  = null;
            }
            if (var12_12 /* !! */  != null) {
                var19_18 = var19_18.getMediationNetwork;
                var20_19 /* !! */  = "source";
                var19_18 = var19_18.get((Object)var20_19 /* !! */ );
                Intrinsics.checkNotNull(var19_18, var5_5);
                var19_18 = (String)var19_18;
                var22_21 = new Pair((Object)var20_19 /* !! */ , var19_18);
                var20_19 /* !! */  = "value";
                var19_18 = new Pair((Object)var20_19 /* !! */ , var12_12 /* !! */ );
                var12_12 /* !! */  = new Pair[var2_2];
                var12_12 /* !! */ [0] = var22_21;
                var12_12 /* !! */ [var7_7] = var19_18;
                var19_18 = fh1_2.i(var12_12 /* !! */ );
            } else lbl-1000:
            // 2 sources

            {
                var11_11 = 0;
                var19_18 = null;
            }
            if (var19_18 == null) continue;
            var14_14.add(var19_18);
        }
        var15_15 = var14_14.isEmpty() ^ var7_7;
        if (var15_15 != 0) {
            var8_8 = "referrers";
            var1_1.put(var8_8, var14_14);
        }
        var1_1 = this.component3;
        var14_14 = this.copy;
        var8_8 = new AFj1jSDK((AFd1qSDK)var14_14, null, var2_2, null);
        var9_9 /* !! */  = this.component1;
        var23_22 /* !! */  = new Object[var7_7];
        var23_22 /* !! */ [0] = var9_9 /* !! */ ;
        var3_3 = System.identityHashCode((Object)var9_9 /* !! */ );
        var16_16 = -1684451992;
        var13_13 = 1684451992;
        var4_4 = (String)AFg1wSDK.getCurrencyIso4217Code(var23_22 /* !! */ , var16_16, var13_13, var3_3);
        var23_22 /* !! */  = this.component3.getMonetizationNetwork().get(var10_10);
        Intrinsics.checkNotNull(var23_22 /* !! */ , var5_5);
        var23_22 /* !! */  = (String)var23_22 /* !! */ ;
        var4_4 = var8_8.getRevenue((String)var4_4, (String)var23_22 /* !! */ );
        var1_1.getRevenue((String)var4_4);
        var1_1 = this.copydefault;
        var3_3 = this.AFKeystoreWrapper;
        if (var3_3 > 0 && var3_3 <= var2_2) {
            var24_23 = var1_1.component1;
            var25_24 = System.currentTimeMillis();
            var24_23[var3_3 += -1] = var25_24;
            if (var3_3 == 0) {
                var25_24 = var1_1.areAllFieldsValid;
                var27_25 = 0L;
                cfr_temp_0 = var25_24 - var27_25;
                var2_2 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var2_2 != 0) {
                    var24_23 = var1_1.getRevenue;
                    var9_9 /* !! */  = (AFh1vSDK)var1_1.component1;
                    var17_17 /* !! */  = (long)(var9_9 /* !! */ [var3_3] - var25_24);
                    var4_4 = var17_17 /* !! */ ;
                    var23_22 /* !! */  = "from_fg";
                    var24_23.put(var23_22 /* !! */ , var4_4);
                    var24_23 = var1_1.getRevenue;
                    var4_4 = new JSONObject((Map)var24_23);
                    var1_1 = var1_1.AFAdRevenueData;
                    var24_23 = var4_4.toString();
                    var4_4 = "ddl";
                    var1_1.AFAdRevenueData((String)var4_4, (String)var24_23);
                } else {
                    var1_1 = "Metrics: fg ts is missing";
                    AFLogger.afInfoLog((String)var1_1);
                }
            }
        } else {
            var4_4 = String.valueOf(var3_3);
            var24_23 = "Metrics: Unexpected ddl requestCount = ".concat((String)var4_4);
            var1_1 = new IllegalStateException((String)var24_23);
            var24_23 = "Unexpected ddl requestCount - start";
            AFLogger.afErrorLogForExcManagerOnly((String)var24_23, (Throwable)var1_1);
        }
        var1_1 = this.component2;
        var24_23 = this.component3;
        var1_1 = var1_1.getRevenue((AFc1qSDK)var24_23);
        Intrinsics.checkNotNullExpressionValue(var1_1, var5_5);
        return var1_1;
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return this.hashCode.component3;
    }
}

