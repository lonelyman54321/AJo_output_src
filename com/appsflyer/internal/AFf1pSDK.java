/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback
 *  com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk
 */
package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1cSDK;
import com.appsflyer.internal.AFa1cSDK$AFa1uSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFf1pSDK$2;
import com.appsflyer.internal.AFf1pSDK$5;
import com.appsflyer.internal.AFf1pSDK$AFa1uSDK;
import com.appsflyer.internal.AFf1pSDK$AFa1vSDK;
import com.appsflyer.internal.AFf1pSDK$AFa1ySDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1pSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class AFf1pSDK
extends AFe1eSDK {
    public static final AFf1pSDK$AFa1ySDK AFa1ySDK;
    private final rq1_2 areAllFieldsValid;
    private final AFh1pSDK component1;
    private final AFd1nSDK component2;
    private final AFd1tSDK component3;
    private final AFd1qSDK component4;
    private final rq1_2 equals;

    static {
        AFf1pSDK$AFa1ySDK aFf1pSDK$AFa1ySDK;
        AFa1ySDK = aFf1pSDK$AFa1ySDK = new AFf1pSDK$AFa1ySDK(null);
    }

    public AFf1pSDK(AFd1kSDK object) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = AFf1zSDK.AFAdRevenueData;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{};
        super((AFf1zSDK)((Object)object2), aFf1zSDKArray, "FetchAdvertisingIdTask");
        object2 = object.values();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.component2 = object2;
        object2 = object.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.component4 = object2;
        object = object.e();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.component3 = object;
        object2 = object;
        this.component1 = object = new AFh1pSDK(null, null, null, null, null, null, null, null, 255, null);
        object = new AFf1pSDK$5(this);
        this.areAllFieldsValid = object = yr1_2.b((Function0)object);
        object = new AFf1pSDK$2(this);
        this.equals = object = yr1_2.b((Function0)object);
    }

    public static final /* synthetic */ AFd1qSDK AFAdRevenueData(AFf1pSDK aFf1pSDK) {
        return aFf1pSDK.component4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean AFAdRevenueData(Context object, AFf1pSDK$AFa1vSDK object2) {
        Throwable throwable2;
        block6: {
            Object object3;
            block5: {
                try {
                    object = AFa1cSDK.getCurrencyIso4217Code((Context)object);
                    object3 = ((AFa1cSDK$AFa1uSDK)object).getMonetizationNetwork;
                    ((AFf1pSDK$AFa1vSDK)object2).setAdvertisingId((String)object3);
                    boolean bl2 = ((AFa1cSDK$AFa1uSDK)object).getMediationNetwork();
                    object = bl2;
                    ((AFf1pSDK$AFa1vSDK)object2).setLimitAdTrackingEnabled((Boolean)object);
                    object = ((AFf1pSDK$AFa1vSDK)object2).getAdvertisingId();
                    if (object != null && (bl2 = object.length())) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object = ((AFf1pSDK$AFa1vSDK)object2).getGaidError();
                object3 = "emptyOrNull (bypass) |";
                ((StringBuilder)object).append((String)object3);
            }
            if ((object = Unit.a) != null) {
                return true;
            }
            object = ((AFf1pSDK$AFa1vSDK)object2).getGaidError();
            object3 = "gpsAdInfo-null (bypass) |";
            ((StringBuilder)object).append((String)object3);
            object = "GpsAdInfo is null (bypass)";
            object = object.toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
        Object object4 = throwable2.getMessage();
        Object object5 = kp1_0.c("Failed to fetch GAID: ", (String)object4);
        int n3 = 64;
        int n4 = 1;
        object4 = aFLogger;
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, (String)object5, throwable2, n4 != 0, false, false, false, n3, null);
        object2 = ((AFf1pSDK$AFa1vSDK)object2).getGaidError();
        object4 = throwable2.getClass().getSimpleName();
        ((StringBuilder)object2).append((String)object4);
        object4 = " |";
        ((StringBuilder)object2).append((String)object4);
        object2 = throwable2.getLocalizedMessage();
        if (object2 == null) {
            String string2 = ((Object)throwable2).toString();
            object5 = string2;
        } else {
            object5 = object2;
        }
        n4 = 4;
        object4 = aFLogger;
        AFh1uSDK.i$default(aFLogger, aFh1vSDK, (String)object5, false, n4, null);
        return false;
    }

    private final boolean areAllFieldsValid() {
        return (Boolean)this.equals.getValue();
    }

    private static boolean component4() {
        boolean bl2;
        String string2 = "com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk";
        try {
            Class.forName(string2);
            bl2 = true;
        }
        catch (Throwable throwable) {
            Object object;
            String string3;
            Throwable throwable2 = throwable;
            bl2 = throwable instanceof ClassNotFoundException;
            if (bl2) {
                string3 = "CloudDevSdk not found";
            } else {
                string3 = throwable.getMessage();
                object = "Unexpected exception while checking if running in cloud environment: ";
                string3 = kp1_0.c((String)object, string3);
            }
            object = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
            int n3 = 112;
            boolean bl3 = true;
            AFh1uSDK.e$default((AFh1uSDK)object, aFh1vSDK, string3, throwable2, bl3, false, false, false, n3, null);
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    private final boolean copydefault() {
        var1_1 = this;
        var3_3 = null;
        var4_4 = false;
        for (var2_2 = 2; var2_2 > 0; var2_2 += -1) {
            var4_4 = this.areAllFieldsValid();
            if (var4_4 && (var4_4 = var1_1.getCurrencyIso4217Code(var2_2))) {
                var5_5 = AFLogger.INSTANCE;
                var6_6 = AFh1vSDK.equals;
                var7_7 = 4;
                var8_8 = "GAID fetched using Samsung Cloud dev SDK";
                AFh1uSDK.v$default(var5_5, var6_6, var8_8, false, var7_7, null);
lbl12:
                // 2 sources

                while (true) {
                    var4_4 = true;
                    break;
                }
            } else {
                var4_4 = var1_1.getMediationNetwork(var2_2);
                if (var4_4) {
                    var5_5 = AFLogger.INSTANCE;
                    var6_6 = AFh1vSDK.equals;
                    var7_7 = 4;
                    var8_8 = "GAID fetched using GMS";
                    AFh1uSDK.v$default(var5_5, var6_6, var8_8, false, var7_7, null);
                    ** continue;
                }
                var9_9 = AFLogger.INSTANCE;
                var10_10 = AFh1vSDK.equals;
                var11_11 = 4;
                var12_12 = "Failed to fetch GAID";
                AFh1uSDK.v$default(var9_9, var10_10, var12_12, false, var11_11, null);
                var4_4 = false;
            }
            if (var4_4) break;
        }
        var13_13 = var1_1.component3;
        var13_13.component4 = var3_3 = var1_1.component1;
        return var4_4;
    }

    private final boolean getCurrencyIso4217Code(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            return this.getRevenue(n3);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean getCurrencyIso4217Code(Context object, AFf1pSDK$AFa1vSDK object2) {
        Throwable throwable2;
        block5: {
            boolean bl2;
            block6: {
                block3: {
                    block4: {
                        String string2;
                        try {
                            object = AdvertisingIdClient.getAdvertisingIdInfo((Context)object);
                            bl2 = true;
                            if (object == null) break block3;
                            string2 = ((AdvertisingIdClient$Info)object).getId();
                            ((AFf1pSDK$AFa1vSDK)object2).setAdvertisingId(string2);
                            int n3 = ((AdvertisingIdClient$Info)object).isLimitAdTrackingEnabled();
                            object = n3 != 0;
                            ((AFf1pSDK$AFa1vSDK)object2).setLimitAdTrackingEnabled((Boolean)object);
                            ((AFf1pSDK$AFa1vSDK)object2).setAdvertisingIdWithGps(bl2);
                            object = ((AFf1pSDK$AFa1vSDK)object2).getAdvertisingId();
                            if (object != null && (n3 = object.length()) != 0) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        object = ((AFf1pSDK$AFa1vSDK)object2).getGaidError();
                        string2 = "emptyOrNull |";
                        ((StringBuilder)object).append(string2);
                    }
                    object = Unit.a;
                    break block6;
                }
                boolean bl3 = false;
                object = null;
            }
            if (object != null) {
                return bl2;
            }
            object = ((AFf1pSDK$AFa1vSDK)object2).getGaidError();
            Object object3 = "gpsAdInfo-null |";
            ((StringBuilder)object).append((String)object3);
            object = "GpsAdIndo is null";
            object = object.toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
        Object object4 = throwable2.getMessage();
        String string3 = kp1_0.c("Google Play Services is missing ", (String)object4);
        int n4 = 88;
        object4 = aFLogger;
        AFh1vSDK aFh1vSDK2 = aFh1vSDK;
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, throwable2, false, false, false, false, n4, null);
        object2 = ((AFf1pSDK$AFa1vSDK)object2).getGaidError();
        String string4 = throwable2.getClass().getSimpleName();
        ((StringBuilder)object2).append(string4);
        string4 = " |";
        ((StringBuilder)object2).append(string4);
        int n7 = 4;
        string3 = "WARNING: Google Play Services is missing.";
        AFh1uSDK.i$default(aFLogger, aFh1vSDK, string3, false, n7, null);
        return false;
    }

    private static int getMediationNetwork(Context context) {
        int n3;
        Object object = GoogleApiAvailability.getInstance();
        try {
            n3 = ((GoogleApiAvailability)object).isGooglePlayServicesAvailable(context);
        }
        catch (Throwable throwable) {
            object = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
            int n4 = 96;
            String string2 = "isGooglePlayServicesAvailable error";
            AFh1uSDK.e$default((AFh1uSDK)object, aFh1vSDK, string2, throwable, false, false, false, false, n4, null);
            n3 = -1;
        }
        return n3;
    }

    private static void getMediationNetwork(AFh1pSDK aFh1pSDK, String string2) {
        String string3;
        if (string2 == null) {
            return;
        }
        String string4 = aFh1pSDK.component3;
        if (string4 != null && (string4 = n1.a(string4, string3 = " | ", string2)) != null) {
            string2 = string4;
        }
        aFh1pSDK.component3 = string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final boolean getMediationNetwork(int var1_1) {
        block7: {
            var2_2 = AFLogger.INSTANCE;
            var3_3 /* !! */  = AFh1vSDK.equals;
            var4_4 = null;
            var5_5 = false;
            AFh1uSDK.i$default((AFh1uSDK)var2_2, var3_3 /* !! */ , "Trying to fetch GAID...", false, 4, null);
            var6_6 = 15;
            var7_7 = var2_2;
            var2_2 = new AFf1pSDK$AFa1vSDK(null, null, false, null, var6_6, null);
            var3_3 /* !! */  = this.component2.AFAdRevenueData;
            Intrinsics.checkNotNull((Object)var3_3 /* !! */ );
            var8_8 = AFf1pSDK.getMediationNetwork((Context)var3_3 /* !! */ );
            var9_9 = this.component2.AFAdRevenueData;
            Intrinsics.checkNotNull(var9_9);
            var10_10 = this.getCurrencyIso4217Code((Context)var9_9, (AFf1pSDK$AFa1vSDK)var2_2);
            var11_11 = true;
            if (var10_10) break block7;
            var9_9 = AppsFlyerProperties.getInstance();
            var10_10 = var9_9.getBoolean(var4_4 = "enableGpsFallback", var11_11);
            if (!var10_10) ** GOTO lbl-1000
            var9_9 = this.component2.AFAdRevenueData;
            Intrinsics.checkNotNull(var9_9);
            var10_10 = this.AFAdRevenueData((Context)var9_9, (AFf1pSDK$AFa1vSDK)var2_2);
            if (var10_10) {
                var10_10 = true;
            } else lbl-1000:
            // 2 sources

            {
                var10_10 = false;
                var9_9 = null;
            }
            var4_4 = var2_2.getGaidError().toString();
            if (var4_4 != null && !(var12_12 = b.k(var4_4))) {
                var4_4 = StringsKt.m0(var4_4).toString();
                var7_7 = new StringBuilder();
                var7_7.append(var8_8);
                var3_3 /* !! */  = ": ";
                var7_7.append((String)var3_3 /* !! */ );
                var7_7.append(var4_4);
                var4_4 = var7_7.toString();
            }
            var3_3 /* !! */  = this.component1;
            AFf1pSDK.getMediationNetwork((AFh1pSDK)var3_3 /* !! */ , var4_4);
            if (!var10_10) {
                return false;
            }
        }
        var3_3 /* !! */  = this.component1;
        var9_9 = var2_2.getAdvertisingId();
        var3_3 /* !! */ .getMonetizationNetwork = var9_9;
        var9_9 = var2_2.isLimitAdTrackingEnabled();
        var3_3 /* !! */ .AFAdRevenueData = var9_9;
        var9_9 = var2_2.isLimitAdTrackingEnabled();
        if (var9_9 != null) {
            var10_10 = var9_9.booleanValue() ^ var11_11;
            var9_9 = var10_10;
        } else {
            var10_10 = false;
            var9_9 = null;
        }
        var3_3 /* !! */ .getCurrencyIso4217Code = var9_9;
        var3_3 /* !! */ .getRevenue = var2_2 = Boolean.valueOf(var2_2.getAdvertisingIdWithGps());
        var3_3 /* !! */ .getMediationNetwork = var2_2 = Boolean.FALSE;
        var13_13 = 2;
        if (var1_1 != var13_13) {
            var5_5 = true;
        }
        var3_3 /* !! */ .areAllFieldsValid = var14_14 = Boolean.valueOf(var5_5);
        return var11_11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean getRevenue(int n3) {
        AFf1pSDK aFf1pSDK = this;
        Object object = "Unexpected exception while fetching GAID using Samsung Cloud Dev ";
        Object object2 = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
        int n4 = 4;
        AFf1pSDK$AFa1uSDK aFf1pSDK$AFa1uSDK = null;
        Object object3 = "Trying to fetch GAID using Samsung Cloud Dev...";
        Object object4 = null;
        Object object5 = object2;
        AFh1vSDK aFh1vSDK2 = aFh1vSDK;
        AFh1uSDK.i$default((AFh1uSDK)object2, aFh1vSDK, (String)object3, false, n4, null);
        int n7 = AFf1pSDK.component4();
        boolean bl2 = false;
        if (n7 != 0) {
            object5 = CloudDevSdk.INSTANCE;
            aFh1vSDK2 = this.component2.AFAdRevenueData;
            Intrinsics.checkNotNull((Object)aFh1vSDK2);
            n7 = object5.isCloudEnvironment((Context)aFh1vSDK2);
            if (n7 != 0) {
                Throwable throwable3;
                block13: {
                    int n8;
                    boolean bl3;
                    block12: {
                        int n10 = 15;
                        AFh1vSDK aFh1vSDK3 = null;
                        boolean bl4 = false;
                        Object object6 = object5;
                        object5 = new AFf1pSDK$AFa1vSDK(null, null, false, null, n10, null);
                        bl3 = true;
                        object2 = new CountDownLatch((int)(bl3 ? 1 : 0));
                        try {
                            object3 = CloudDevSdk.INSTANCE;
                            object4 = this.component2;
                            object4 = ((AFd1nSDK)object4).AFAdRevenueData;
                            Intrinsics.checkNotNull(object4);
                            Object object7 = "gaid";
                            object7 = a.b(object7);
                            aFf1pSDK$AFa1uSDK = new AFf1pSDK$AFa1uSDK((AFf1pSDK$AFa1vSDK)object5, (CountDownLatch)object2);
                            aFf1pSDK$AFa1uSDK = aFf1pSDK$AFa1uSDK;
                            object3.request((Context)object4, (List)object7, (CloudDevCallback)aFf1pSDK$AFa1uSDK);
                            object3 = this.areAllFieldsValid;
                            object3 = object3.getValue();
                            object3 = (Number)object3;
                            long l2 = ((Number)object3).longValue();
                            object7 = TimeUnit.MILLISECONDS;
                            ((CountDownLatch)object2).await(l2, (TimeUnit)((Object)object7));
                            object2 = ((AFf1pSDK$AFa1vSDK)object5).getGaidError();
                            n8 = object2.length();
                            if (n8 <= 0) break block12;
                        }
                        catch (Throwable throwable2) {
                            boolean bl5 = throwable2 instanceof InterruptedException;
                            if (bl5) {
                                object = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                            } else {
                                bl5 = throwable2 instanceof ClassNotFoundException;
                                if (bl5) {
                                    object = "CloudDevSdk not found";
                                } else {
                                    try {
                                        object3 = throwable2.getMessage();
                                        object4 = new StringBuilder((String)object);
                                        ((StringBuilder)object4).append((String)object3);
                                        object = ((StringBuilder)object4).toString();
                                    }
                                    catch (Throwable throwable3) {
                                        break block13;
                                    }
                                }
                            }
                            object6 = AFLogger.INSTANCE;
                            aFh1vSDK3 = AFh1vSDK.equals;
                            int n14 = 112;
                            bl4 = true;
                            n10 = 0;
                            AFh1uSDK.e$default((AFh1uSDK)object6, aFh1vSDK3, (String)object, throwable2, bl4, false, false, false, n14, null);
                            object = ((AFf1pSDK$AFa1vSDK)object5).getGaidError();
                            object2 = throwable2.getClass();
                            object2 = ((Class)object2).getSimpleName();
                            ((StringBuilder)object).append((String)object2);
                            object2 = " |";
                            ((StringBuilder)object).append((String)object2);
                            object2 = ((AFf1pSDK$AFa1vSDK)object5).getGaidError();
                            n8 = object2.length();
                            if (n8 <= 0) break block12;
                        }
                        object2 = aFf1pSDK.component1;
                        object = ((Object)((AFf1pSDK$AFa1vSDK)object5).getGaidError()).toString();
                        AFf1pSDK.getMediationNetwork((AFh1pSDK)object2, (String)object);
                    }
                    if ((object2 = ((AFf1pSDK$AFa1vSDK)object5).getAdvertisingId()) == null) return false;
                    n8 = object2.length();
                    if (n8 == 0) {
                        return false;
                    }
                    object2 = aFf1pSDK.component1;
                    ((AFh1pSDK)object2).getMonetizationNetwork = object = ((AFf1pSDK$AFa1vSDK)object5).getAdvertisingId();
                    ((AFh1pSDK)object2).AFAdRevenueData = object = Boolean.FALSE;
                    ((AFh1pSDK)object2).getCurrencyIso4217Code = object5 = Boolean.TRUE;
                    ((AFh1pSDK)object2).getRevenue = object;
                    ((AFh1pSDK)object2).getMediationNetwork = object5;
                    int n15 = 2;
                    n7 = n3;
                    if (n3 != n15) {
                        bl2 = true;
                    }
                    ((AFh1pSDK)object2).areAllFieldsValid = object = Boolean.valueOf(bl2);
                    return bl3;
                }
                object = ((AFf1pSDK$AFa1vSDK)object5).getGaidError();
                int n16 = object.length();
                if (n16 <= 0) throw throwable3;
                object = aFf1pSDK.component1;
                object5 = ((Object)((AFf1pSDK$AFa1vSDK)object5).getGaidError()).toString();
                AFf1pSDK.getMediationNetwork((AFh1pSDK)object, (String)object5);
                throw throwable3;
            }
        }
        object5 = object2;
        aFh1vSDK2 = aFh1vSDK;
        AFh1uSDK.i$default((AFh1uSDK)object2, aFh1vSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    public final AFe1cSDK AFAdRevenueData() {
        AFd1tSDK aFd1tSDK = this.component3;
        boolean bl2 = aFd1tSDK.getMonetizationNetwork();
        if (bl2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
            AFh1uSDK.v$default(aFLogger, aFh1vSDK, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1cSDK.getMonetizationNetwork;
        }
        long l2 = System.currentTimeMillis();
        Object object = this.copydefault();
        int n3 = 3;
        Object object2 = new Boolean[n3];
        object2[0] = object;
        object = Boolean.FALSE;
        object2[1] = object;
        int n4 = 2;
        object2[n4] = object;
        object = xx_2.i((Object[])object2);
        boolean bl3 = object.contains(object2 = Boolean.TRUE);
        object = bl3 ? AFe1cSDK.getRevenue : AFe1cSDK.getMonetizationNetwork;
        object2 = this.component3;
        long l3 = System.currentTimeMillis();
        AFe1nSDK aFe1nSDK = new AFe1nSDK(l3 -= l2);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
        String string2 = Ov2.a(aFe1nSDK.getRevenue, "QUEUE: FetchAdvertisingIdTask: took ", "ms");
        AFh1uSDK.v$default(aFLogger, aFh1vSDK, string2, false, 4, null);
        ((AFd1tSDK)object2).getRevenue(aFe1nSDK);
        return object;
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return ((Number)this.areAllFieldsValid.getValue()).longValue();
    }
}

