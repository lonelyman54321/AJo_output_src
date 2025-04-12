/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.PackageManager$PackageInfoFlags
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.Process
 *  android.os.StatFs
 *  android.os.SystemClock
 *  android.provider.Settings$Secure
 *  android.telephony.cdma.CdmaCellLocation
 *  android.text.TextUtils
 *  android.view.View
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1vSDK$AFa1zSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1iSDK$3;
import com.appsflyer.internal.AFg1iSDK$4;
import com.appsflyer.internal.AFg1jSDK;
import com.appsflyer.internal.AFg1kSDK;
import com.appsflyer.internal.AFg1rSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1gSDK;
import com.appsflyer.internal.AFh1oSDK;
import com.appsflyer.internal.AFh1pSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFh1zSDK;
import com.appsflyer.internal.AFi1oSDK;
import com.appsflyer.internal.AFi1pSDK;
import com.appsflyer.internal.AFi1qSDK;
import com.appsflyer.internal.AFi1rSDK;
import com.appsflyer.internal.AFj1oSDK;
import com.appsflyer.internal.AFk1kSDK;
import com.appsflyer.internal.p;
import com.appsflyer.internal.q;
import com.appsflyer.internal.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

public final class AFg1iSDK
implements AFg1kSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 2115549242;
    private static int AFKeystoreWrapper = 1;
    private static int values;
    private final AFi1oSDK AFAdRevenueData;
    private final rq1_2 AFInAppEventType;
    private final AFa1aSDK areAllFieldsValid;
    private final AFd1rSDK component1;
    private final AFi1qSDK component2;
    private final AFd1qSDK component3;
    private final AFh1oSDK component4;
    private final AFd1nSDK copy;
    private final AFg1rSDK copydefault;
    private final AFd1tSDK equals;
    private final AFj1oSDK getCurrencyIso4217Code;
    private final AFd1vSDK getMediationNetwork;
    private final Context getMonetizationNetwork;
    private final String getRevenue;
    private final rq1_2 hashCode;
    private final AFg1wSDK toString;

    public AFg1iSDK(String object, Context context, AFi1oSDK aFi1oSDK, AFd1vSDK aFd1vSDK, AFj1oSDK aFj1oSDK, AFa1aSDK aFa1aSDK, AFh1oSDK aFh1oSDK, AFd1rSDK aFd1rSDK, AFd1qSDK aFd1qSDK, AFi1qSDK aFi1qSDK, AFg1wSDK aFg1wSDK, AFd1nSDK aFd1nSDK, AFg1rSDK aFg1rSDK, AFd1tSDK aFd1tSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(context, string2);
        Intrinsics.checkNotNullParameter(aFi1oSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1vSDK, string2);
        Intrinsics.checkNotNullParameter(aFj1oSDK, string2);
        Intrinsics.checkNotNullParameter(aFa1aSDK, string2);
        Intrinsics.checkNotNullParameter(aFh1oSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1rSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1qSDK, string2);
        Intrinsics.checkNotNullParameter(aFi1qSDK, string2);
        Intrinsics.checkNotNullParameter(aFg1wSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1nSDK, string2);
        Intrinsics.checkNotNullParameter(aFg1rSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1tSDK, string2);
        this.getRevenue = object;
        this.getMonetizationNetwork = context;
        this.AFAdRevenueData = aFi1oSDK;
        this.getMediationNetwork = aFd1vSDK;
        this.getCurrencyIso4217Code = aFj1oSDK;
        this.areAllFieldsValid = aFa1aSDK;
        this.component4 = aFh1oSDK;
        this.component1 = aFd1rSDK;
        this.component3 = aFd1qSDK;
        this.component2 = aFi1qSDK;
        this.toString = aFg1wSDK;
        this.copy = aFd1nSDK;
        this.copydefault = aFg1rSDK;
        this.equals = aFd1tSDK;
        this.hashCode = object = yr1_2.b(AFg1iSDK$3.getMediationNetwork);
        this.AFInAppEventType = object = yr1_2.b(AFg1iSDK$4.AFAdRevenueData);
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] object) {
        block15: {
            String string2;
            int n3;
            Map map2;
            int n4;
            int n7;
            block17: {
                AFd1rSDK aFd1rSDK;
                block16: {
                    int n8;
                    String string3;
                    int n10;
                    int n14;
                    int n15;
                    AFg1iSDK aFg1iSDK;
                    block13: {
                        block14: {
                            block12: {
                                n7 = 17;
                                n4 = 0;
                                aFg1iSDK = (AFg1iSDK)object[0];
                                n15 = 1;
                                map2 = (Map)object[n15];
                                n3 = 2;
                                object = (String)object[n3];
                                n14 = values + 71;
                                AFKeystoreWrapper = n10 = n14 % 128;
                                string3 = "";
                                string2 = "referrer";
                                if ((n14 %= n3) != 0) break block12;
                                Intrinsics.checkNotNullParameter(map2, string3);
                                n14 = 58 / 0;
                                if (object == null) break block13;
                                break block14;
                            }
                            Intrinsics.checkNotNullParameter(map2, string3);
                            if (object == null) break block13;
                        }
                        n14 = object.length();
                        if (n14 != 0) {
                            map2.put(string2, object);
                        }
                    }
                    object = aFg1iSDK.component1;
                    String string4 = "extraReferrers";
                    n10 = 0;
                    string3 = null;
                    if ((object = object.getMonetizationNetwork(string4, null)) != null) {
                        int n16;
                        int n17 = values + n7;
                        AFKeystoreWrapper = n16 = n17 % 128;
                        if ((n17 %= n3) == 0) {
                            map2.put(string4, object);
                            n7 /= 0;
                        } else {
                            map2.put(string4, object);
                        }
                    }
                    object = new Object[n15];
                    object[0] = aFg1iSDK;
                    n7 = System.identityHashCode(aFg1iSDK);
                    n15 = 1273246331;
                    n14 = -1273246327;
                    object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n15, n14, n7);
                    aFd1rSDK = aFg1iSDK.component1;
                    if ((object = ((AppsFlyerProperties)object).getReferrer(aFd1rSDK)) == null || (n7 = object.length()) == 0) break block15;
                    n7 = AFKeystoreWrapper + 11;
                    values = n8 = n7 % 128;
                    if ((n7 %= n3) == 0) break block16;
                    aFd1rSDK = map2.get(string2);
                    n8 = 74 / 0;
                    if (aFd1rSDK != null) break block15;
                    break block17;
                }
                aFd1rSDK = map2.get(string2);
                if (aFd1rSDK != null) break block15;
            }
            n7 = values + 75;
            AFKeystoreWrapper = n4 = n7 % 128;
            if ((n7 %= n3) != 0) {
                map2.put(string2, object);
            } else {
                map2.put(string2, object);
                throw null;
            }
        }
        return null;
    }

    private static String AFAdRevenueData(String object) {
        String string2;
        String string3 = null;
        int n3 = 1;
        AFKeystoreWrapper = (values + 103) % 128;
        Object object2 = "android.os.SystemProperties";
        try {
            object2 = Class.forName((String)object2);
            string2 = "get";
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog(throwable.getMessage(), throwable);
            return null;
        }
        Class[] classArray = new Class[n3];
        Class<String> clazz = String.class;
        classArray[0] = clazz;
        object2 = ((Class)object2).getMethod(string2, classArray);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = ((Method)object2).invoke(null, objectArray);
        string3 = "";
        Intrinsics.checkNotNull(object, string3);
        object = (String)object;
        AFKeystoreWrapper = (values + 67) % 128;
        return object;
    }

    private void AFAdRevenueData(Map map2, String object) {
        Object object2;
        int n3;
        int n4 = 0;
        LinkedHashMap<Object, Object> linkedHashMap = null;
        int n7 = 1;
        values = n3 = (AFKeystoreWrapper + 91) % 128;
        String string2 = "";
        Intrinsics.checkNotNullParameter(map2, string2);
        Object object3 = new Object[n7];
        object3[0] = this;
        int n8 = System.identityHashCode(this);
        int n10 = 1273246331;
        int n14 = -1273246327;
        object3 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object3, n10, n14, n8);
        Object object4 = "deviceTrackingDisabled";
        boolean bl2 = ((AppsFlyerProperties)object3).getBoolean((String)object4, false);
        if (bl2) {
            int n15 = AFKeystoreWrapper + 29;
            values = n7 = n15 % 128;
            String string3 = "true";
            if ((n15 %= 2) != 0) {
                map2.put(object4, string3);
                int cfr_ignored_0 = 7 / 0;
            } else {
                map2.put(object4, string3);
            }
            return;
        }
        object3 = this.toString;
        object4 = this.component1;
        if ((object3 = ((AFg1wSDK)object3).getRevenue((AFd1rSDK)object4)) == null || (n8 = object3.length()) == 0) {
            values = (AFKeystoreWrapper + 93) % 128;
            n4 = 1;
        }
        if (n4 == 0) {
            linkedHashMap = "imei";
            map2.put(linkedHashMap, object3);
        }
        object = this.getCurrencyIso4217Code((String)object);
        if (object != null) {
            AFKeystoreWrapper = n4 = (values + 5) % 128;
            linkedHashMap = this.component1;
            object2 = "androidIdCached";
            linkedHashMap.AFAdRevenueData((String)object2, (String)object);
            linkedHashMap = "android_id";
            map2.put(linkedHashMap, object);
        } else {
            int n16;
            object = "Android ID was not collected.";
            AFLogger.afInfoLog((String)object);
            values = n16 = (AFKeystoreWrapper + 31) % 128;
        }
        object = AFb1vSDK.getCurrencyIso4217Code(this.getMonetizationNetwork);
        if (object != null) {
            linkedHashMap = new LinkedHashMap<Object, Object>();
            object2 = ((AFb1tSDK)object).getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object3 = "isManual";
            linkedHashMap.put(object3, object2);
            object2 = ((AFb1tSDK)object).getRevenue;
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            string2 = "val";
            linkedHashMap.put(string2, object2);
            object = ((AFb1tSDK)object).AFAdRevenueData;
            if (object != null) {
                object2 = "isLat";
                linkedHashMap.put(object2, object);
            }
            object = "oaid";
            map2.put(object, linkedHashMap);
        }
    }

    private void AFInAppEventParameterName(Map map2) {
        int n3;
        int n4 = AFKeystoreWrapper + 33;
        values = n3 = n4 % 128;
        String string2 = "";
        if ((n4 %= 2) != 0) {
            Intrinsics.checkNotNullParameter(map2, string2);
            Map map3 = this.copydefault.getRevenue();
            map2.putAll(map3);
            int cfr_ignored_0 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map2, string2);
            Map map4 = this.copydefault.getRevenue();
            map2.putAll(map4);
        }
        values = (AFKeystoreWrapper + 67) % 128;
    }

    private final String AFInAppEventType() {
        int n3;
        int n4;
        Object[] objectArray;
        int n7;
        int n8;
        block14: {
            long l2;
            Object object;
            int n10;
            int n14;
            block13: {
                int n15;
                block11: {
                    long l3;
                    block12: {
                        block10: {
                            n14 = 2;
                            n8 = 1;
                            n7 = 0;
                            n15 = values + 23;
                            AFKeystoreWrapper = n10 = n15 % 128;
                            objectArray = "ro.appsflyer.preinstall.path";
                            n4 = -1393711457;
                            n3 = 1393711468;
                            if ((n15 %= n14) != 0) break block10;
                            object = AFg1iSDK.AFAdRevenueData((String)objectArray);
                            objectArray = new Object[n8];
                            objectArray[0] = object;
                            l3 = System.currentTimeMillis();
                            n15 = (int)l3;
                            object = (File)AFg1iSDK.getCurrencyIso4217Code(objectArray, n3, n4, n15);
                            n10 = (int)(AFg1iSDK.getCurrencyIso4217Code((File)object) ? 1 : 0);
                            int cfr_ignored_0 = 91 / 0;
                            if (n10 == 0) break block11;
                            break block12;
                        }
                        object = AFg1iSDK.AFAdRevenueData((String)objectArray);
                        objectArray = new Object[n8];
                        objectArray[0] = object;
                        l3 = System.currentTimeMillis();
                        n15 = (int)l3;
                        object = (File)AFg1iSDK.getCurrencyIso4217Code(objectArray, n3, n4, n15);
                        n10 = (int)(AFg1iSDK.getCurrencyIso4217Code((File)object) ? 1 : 0);
                        if (n10 == 0) break block11;
                    }
                    n15 = values + 73;
                    AFKeystoreWrapper = n10 = n15 % 128;
                    objectArray = "AF_PRE_INSTALL_PATH";
                    if ((n15 %= n14) == 0) {
                        object = this.getMediationNetwork((String)objectArray);
                        objectArray = new Object[n8];
                        objectArray[0] = object;
                        l3 = System.currentTimeMillis();
                        n15 = (int)l3;
                        object = (File)AFg1iSDK.getCurrencyIso4217Code(objectArray, n3, n4, n15);
                        n10 = 6 / 0;
                    } else {
                        object = this.getMediationNetwork((String)objectArray);
                        objectArray = new Object[n8];
                        objectArray[0] = object;
                        l3 = System.currentTimeMillis();
                        n15 = (int)l3;
                        object = (File)AFg1iSDK.getCurrencyIso4217Code(objectArray, n3, n4, n15);
                    }
                }
                if ((n10 = AFg1iSDK.getCurrencyIso4217Code((File)object) ^ n8) != 0) break block13;
                n15 = values + 39;
                AFKeystoreWrapper = n10 = n15 % 128;
                objectArray = "/data/local/tmp/pre_install.appsflyer";
                if ((n15 %= n14) == 0) break block14;
                object = new Object[n8];
                object[0] = objectArray;
                l2 = System.currentTimeMillis();
                n10 = (int)l2;
                object = (File)AFg1iSDK.getCurrencyIso4217Code(object, n3, n4, n10);
            }
            n10 = AFg1iSDK.getCurrencyIso4217Code((File)object) ^ n8;
            if (n10 == 0) {
                object = new Object[n8];
                object[0] = objectArray = "/etc/pre_install.appsflyer";
                l2 = System.currentTimeMillis();
                n10 = (int)l2;
                object = (File)AFg1iSDK.getCurrencyIso4217Code(object, n3, n4, n10);
            }
            n10 = (int)(AFg1iSDK.getCurrencyIso4217Code((File)object) ? 1 : 0);
            if (n10 != 0) {
                return null;
            }
            objectArray = this.getMonetizationNetwork.getPackageName();
            Intrinsics.checkNotNullExpressionValue(objectArray, "");
            Object[] objectArray2 = new Object[n14];
            objectArray2[0] = object;
            objectArray2[n8] = objectArray;
            n7 = (int)System.currentTimeMillis();
            return (String)AFg1iSDK.getCurrencyIso4217Code(objectArray2, 2000545293, -2000545286, n7);
        }
        Object object = new Object[n8];
        object[0] = objectArray;
        n7 = (int)System.currentTimeMillis();
        object = (File)AFg1iSDK.getCurrencyIso4217Code(object, n3, n4, n7);
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    private void AFInAppEventType(Map var1_1) {
        var2_2 = 0;
        var3_3 = 1;
        Intrinsics.checkNotNullParameter(var1_1, "");
        var4_4 = new Object[var3_3];
        var4_4[0] = this;
        var5_5 = System.identityHashCode(this);
        var6_6 = 1273246331;
        var7_7 = -1273246327;
        var4_4 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])var4_4, var6_6, var7_7, var5_5);
        var8_8 = "sdkExtension";
        var4_4 = var4_4.getString(var8_8);
        if (var4_4 == null) ** GOTO lbl-1000
        AFg1iSDK.AFKeystoreWrapper = (AFg1iSDK.values + 73) % 128;
        var6_6 = var4_4.length();
        if (var6_6 != 0) {
            AFg1iSDK.values = var6_6 = (AFg1iSDK.AFKeystoreWrapper + 63) % 128;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = 1;
        }
        if ((var2_2 ^= var3_3) == var3_3) {
            AFg1iSDK.values = var2_2 = (AFg1iSDK.AFKeystoreWrapper + 105) % 128;
            var1_1.put(var8_8, var4_4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void AFKeystoreWrapper(Map map2) {
        long l2;
        Intrinsics.checkNotNullParameter(map2, "");
        Object object = this.component1;
        String string2 = "AppsFlyerTimePassedSincePrevLaunch";
        long l3 = 0L;
        long l4 = object.getMediationNetwork(string2, l3);
        long l7 = System.currentTimeMillis();
        object = this.component1;
        object.getMonetizationNetwork(string2, l7);
        long l8 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (l8 > 0) {
            l8 = AFKeystoreWrapper + 69;
            long l12 = l8 % 128;
            values = (int)l12;
            if ((l8 %= 2) != false) {
                object = TimeUnit.MILLISECONDS;
                l7 *= l4;
            } else {
                object = TimeUnit.MILLISECONDS;
                l7 -= l4;
            }
            l2 = ((TimeUnit)((Object)object)).toSeconds(l7);
        } else {
            l2 = -1;
        }
        String string3 = "timepassedsincelastlaunch";
        object = String.valueOf(l2);
        map2.put(string3, object);
        int n3 = values + 5;
        l8 = n3 % 128;
        AFKeystoreWrapper = (int)l8;
        if ((n3 %= 2) == 0) {
            n3 = 72 / 0;
        }
    }

    private final boolean AFKeystoreWrapper() {
        String string2;
        int n3 = 1;
        values = (AFKeystoreWrapper + 73) % 128;
        Object object = new Object[n3];
        object[0] = this;
        int n4 = 1273246331;
        int n7 = -1273246327;
        int n8 = System.identityHashCode(this);
        boolean n10 = ((AppsFlyerProperties)(object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n4, n7, n8))).getBoolean(string2 = "collectAndroidIdForceByUser", false);
        if (!n10) {
            AFKeystoreWrapper = (values + 125) % 128;
            object = new Object[n3];
            object[0] = this;
            n8 = System.identityHashCode(this);
            boolean bl2 = ((AppsFlyerProperties)(object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n4, n7, n8))).getBoolean(string2 = "collectIMEIForceByUser", false);
            if (!bl2) {
                AFb1rSDK.getRevenue();
                object = this.getMonetizationNetwork;
                boolean bl3 = AFb1rSDK.getRevenue((Context)object);
                if (bl3) {
                    int n14;
                    n3 = values + 13;
                    AFKeystoreWrapper = n14 = n3 % 128;
                    if ((n3 %= 2) != 0) {
                        return false;
                    }
                    throw null;
                }
            }
        }
        return n3 != 0;
    }

    private static void AFLogger(Map map2) {
        int n3;
        values = n3 = (AFKeystoreWrapper + 7) % 128;
        Intrinsics.checkNotNullParameter(map2, "");
        String string2 = "lang";
        Object object = Locale.getDefault();
        object = ((Locale)object).getDisplayLanguage();
        try {
            map2.put(string2, object);
            values = n3 = (AFKeystoreWrapper + 73) % 128;
        }
        catch (Exception exception) {
            object = "Exception while collecting display language name. ";
            AFLogger.afErrorLog((String)object, exception);
        }
        string2 = "lang_code";
        object = Locale.getDefault();
        object = ((Locale)object).getLanguage();
        try {
            map2.put(string2, object);
        }
        catch (Exception exception) {
            object = "Exception while collecting display language code. ";
            AFLogger.afErrorLog((String)object, exception);
        }
        string2 = "country";
        try {
            object = Locale.getDefault();
        }
        catch (Exception exception) {
            AFLogger.afErrorLog("Exception while collecting country name. ", exception);
            return;
        }
        object = ((Locale)object).getCountry();
        map2.put(string2, object);
    }

    private static void a(int n3, int n4, String object, boolean bl2, int n7, Object[] objectArray) {
        int n8;
        char[] cArray;
        int n10;
        int n14;
        int n15;
        $10 = n15 = ($11 + 121) % 128;
        if (object != null) {
            $11 = n15 = (n15 + 49) % 128;
            object = ((String)object).toCharArray();
        }
        object = (char[])object;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArray2 = new char[n3];
        aFk1kSDK.getMediationNetwork = 0;
        while ((n14 = aFk1kSDK.getMediationNetwork) < n3) {
            $10 = ($11 + 29) % 128;
            Object object2 = object[n14];
            aFk1kSDK.getCurrencyIso4217Code = (int)object2;
            object2 = (char)(object2 + n4);
            cArray2[n14] = (char)object2;
            int n16 = AFInAppEventParameterName;
            long l2 = n16;
            long l3 = -5894730465753384902L;
            int n17 = (int)(l2 ^= l3);
            object2 = (char)(object2 - n17);
            cArray2[n14] = (char)object2;
            aFk1kSDK.getMediationNetwork = ++n14;
        }
        if (n10 > 0) {
            aFk1kSDK.getRevenue = n10;
            cArray = new char[n3];
            System.arraycopy(cArray2, 0, cArray, 0, n3);
            n8 = aFk1kSDK.getRevenue;
            n10 = n3 - n8;
            System.arraycopy(cArray, 0, cArray2, n10, n8);
            n8 = aFk1kSDK.getRevenue;
            n10 = n3 - n8;
            System.arraycopy(cArray, n8, cArray2, 0, n10);
        }
        if (bl2) {
            cArray = new char[n3];
            aFk1kSDK.getMediationNetwork = 0;
            while ((n8 = aFk1kSDK.getMediationNetwork) < n3) {
                int n18 = n3 - n8 + -1;
                cArray[n8] = n18 = cArray2[n18];
                aFk1kSDK.getMediationNetwork = ++n8;
            }
            cArray2 = cArray;
        }
        String string2 = new String(cArray2);
        n4 = $10 + 1;
        $11 = n8 = n4 % 128;
        if ((n4 %= 2) == 0) {
            n4 = 70 / 0;
            var5_6[0] = string2;
            return;
        }
        var5_6[0] = string2;
    }

    private void afInfoLog(Map map2) {
        int n3;
        int n4 = values + 41;
        AFKeystoreWrapper = n3 = n4 % 128;
        String string2 = "";
        String string3 = "is_stop_tracking_used";
        if ((n4 %= 2) != 0) {
            Intrinsics.checkNotNullParameter(map2, string2);
            Object object = this.component1;
            n4 = (int)(object.getMonetizationNetwork(string3) ? 1 : 0);
            if (n4 != 0) {
                values = (AFKeystoreWrapper + 83) % 128;
                n4 = (int)(this.component1.getMediationNetwork(string3) ? 1 : 0);
                string2 = "istu";
                object = String.valueOf(n4 != 0);
                map2.put(string2, object);
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map2, string2);
        this.component1.getMonetizationNetwork(string3);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Object areAllFieldsValid(Object[] object) {
        AFf1zSDK aFf1zSDK;
        int n3 = 2;
        int n4 = 0;
        Object object2 = null;
        AFg1iSDK aFg1iSDK = (AFg1iSDK)object[0];
        int n7 = 1;
        object = (AFa1oSDK)object[n7];
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Map map2 = ((AFa1oSDK)object).getMonetizationNetwork();
        int n8 = ((AFa1oSDK)object).getRevenue();
        if (n8 != 0) {
            int n10;
            n8 = values + 5;
            AFKeystoreWrapper = n10 = n8 % 128;
            if ((n8 %= n3) == 0) {
                String string3 = ((AFa1oSDK)object).component2;
                object2 = aFg1iSDK.equals;
                String string4 = ((AFd1tSDK)object2).getCurrencyIso4217Code;
                object2 = ((AFd1tSDK)object2).getMonetizationNetwork;
                aFg1iSDK.getRevenue((AFa1oSDK)object, string3, string4, (AFc1aSDK)object2);
                throw null;
            }
            String string5 = ((AFa1oSDK)object).component2;
            AFd1tSDK aFd1tSDK = aFg1iSDK.equals;
            String string6 = aFd1tSDK.getCurrencyIso4217Code;
            AFc1aSDK aFc1aSDK = aFd1tSDK.getMonetizationNetwork;
            aFg1iSDK.getRevenue((AFa1oSDK)object, string5, string6, aFc1aSDK);
        } else {
            n8 = object instanceof AFh1gSDK;
            if (n8 == 0) {
                int n14;
                n8 = AFKeystoreWrapper + 99;
                values = n14 = n8 % 128;
                if ((n8 %= n3) != 0) {
                    Intrinsics.checkNotNullExpressionValue(map2, string2);
                    String string7 = ((AFa1oSDK)object).areAllFieldsValid;
                    Intrinsics.checkNotNullExpressionValue(string7, string2);
                    aFg1iSDK.getMonetizationNetwork(map2, string7);
                    n8 = 36 / 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(map2, string2);
                    String string8 = ((AFa1oSDK)object).areAllFieldsValid;
                    Intrinsics.checkNotNullExpressionValue(string8, string2);
                    aFg1iSDK.getMonetizationNetwork(map2, string8);
                }
            }
        }
        n8 = 3;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[n8];
        aFf1zSDKArray[0] = aFf1zSDK = AFf1zSDK.getMonetizationNetwork;
        object2 = AFf1zSDK.equals;
        aFf1zSDKArray[n7] = object2;
        object2 = AFf1zSDK.copy;
        aFf1zSDKArray[n3] = object2;
        object2 = xx_2.i((Object[])aFf1zSDKArray);
        AFf1zSDK aFf1zSDK2 = ((AFa1oSDK)object).getCurrencyIso4217Code();
        n4 = object2.contains((Object)aFf1zSDK2);
        if (n4 != 0) {
            Intrinsics.checkNotNullExpressionValue(map2, string2);
            aFg1iSDK.copy(map2);
        }
        if ((n4 = ((AFa1oSDK)object).areAllFieldsValid()) != 0) {
            n4 = AFKeystoreWrapper + 19;
            values = n7 = n4 % 128;
            if ((n4 %= n3) != 0) {
                Intrinsics.checkNotNullExpressionValue(map2, string2);
                aFg1iSDK.component4(map2);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(map2, string2);
            aFg1iSDK.component4(map2);
        }
        Intrinsics.checkNotNullExpressionValue(map2, string2);
        aFg1iSDK.force(map2);
        AFg1iSDK.values(map2);
        aFg1iSDK.AFInAppEventParameterName(map2);
        aFg1iSDK.AFInAppEventType(map2);
        aFg1iSDK.registerClient(map2);
        n4 = (int)(((AFa1oSDK)object).getRevenue() ? 1 : 0);
        aFg1iSDK.getRevenue(map2, n4 != 0);
        aFg1iSDK.unregisterClient(map2);
        aFg1iSDK.afInfoLog(map2);
        AFg1iSDK.getRevenue(map2, (AFa1oSDK)object);
        object = "af_events_api";
        object2 = "1";
        map2.put(object, object2);
        int n15 = AFKeystoreWrapper + 31;
        values = n4 = n15 % 128;
        if ((n15 %= n3) == 0) {
            return null;
        }
        throw null;
    }

    private static String areAllFieldsValid() {
        int n3;
        String string2 = Environment.getDataDirectory().getAbsolutePath();
        Object object = new StatFs(string2);
        long l2 = object.getBlockSizeLong();
        long l3 = object.getAvailableBlocksLong() * l2;
        long l4 = object.getBlockCountLong() * l2;
        double d2 = 20.0;
        double d5 = Math.pow(2.0, d2);
        double d7 = (double)l3 / d5;
        long l7 = (long)d7;
        double d9 = (double)l4 / d5;
        long l8 = (long)d9;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l7);
        String string3 = "/";
        stringBuilder.append(string3);
        stringBuilder.append(l8);
        object = stringBuilder.toString();
        int n4 = AFKeystoreWrapper + 107;
        values = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return object;
        }
        throw null;
    }

    private final void areAllFieldsValid(Map map2) {
        block3: {
            Object object;
            String string2;
            block4: {
                block2: {
                    int n3;
                    int n4 = AFKeystoreWrapper + 93;
                    values = n3 = n4 % 128;
                    string2 = "btl";
                    if ((n4 %= 2) == 0) break block2;
                    object = this.getMediationNetwork;
                    Object object2 = this.getMonetizationNetwork;
                    object = object.AFAdRevenueData((Context)object2);
                    float f5 = ((AFd1vSDK$AFa1zSDK)object).getCurrencyIso4217Code;
                    object = ((AFd1vSDK$AFa1zSDK)object).AFAdRevenueData;
                    object2 = String.valueOf(f5);
                    map2.put(string2, object2);
                    n3 = 80 / 0;
                    if (object == null) break block3;
                    break block4;
                }
                object = this.getMediationNetwork;
                Object object3 = this.getMonetizationNetwork;
                object = object.AFAdRevenueData((Context)object3);
                float f6 = ((AFd1vSDK$AFa1zSDK)object).getCurrencyIso4217Code;
                object = ((AFd1vSDK$AFa1zSDK)object).AFAdRevenueData;
                object3 = String.valueOf(f6);
                map2.put(string2, object3);
                if (object == null) break block3;
            }
            string2 = "btch";
            map2.put(string2, object);
        }
        AFKeystoreWrapper = (values + 5) % 128;
    }

    private static /* synthetic */ Object component1(Object[] object) {
        int n3;
        Object object2 = (AFg1iSDK)object[0];
        int n4 = 1;
        object = (Map)object[n4];
        int n7 = values + 21;
        AFKeystoreWrapper = n3 = n7 % 128;
        String string2 = "";
        if ((n7 %= 2) != 0) {
            Intrinsics.checkNotNullParameter(object, string2);
            object2 = AFb1vSDK.b_(((AFg1iSDK)object2).getMonetizationNetwork.getContentResolver());
            if (object2 != null) {
                AFKeystoreWrapper = n7 = (values + n4) % 128;
                String string3 = ((AFb1tSDK)object2).getRevenue;
                String string4 = "amazon_aid";
                object.put(string4, string3);
                object2 = String.valueOf(((AFb1tSDK)object2).AFAdRevenueData);
                string3 = "amazon_aid_limit";
                object.put(string3, object2);
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(object, string2);
        AFb1vSDK.b_(((AFg1iSDK)object2).getMonetizationNetwork.getContentResolver());
        throw null;
    }

    private String component1() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (String)AFg1iSDK.getCurrencyIso4217Code(objectArray, -505986928, 505986930, n3);
    }

    private final void component1(Map map2) {
        Object[] objectArray = new Object[]{this, map2};
        int n3 = System.identityHashCode(this);
        AFg1iSDK.getCurrencyIso4217Code(objectArray, -1208384822, 1208384822, n3);
    }

    private static /* synthetic */ Object component2(Object[] object) {
        int n3;
        Map map2 = (Map)object[0];
        object = (String)object[1];
        values = n3 = (AFKeystoreWrapper + 65) % 128;
        String string2 = "";
        Intrinsics.checkNotNullParameter(map2, string2);
        if (object != null) {
            int n4;
            int n7;
            n3 = values + 15;
            AFKeystoreWrapper = n7 = n3 % 128;
            String string3 = "phone";
            if ((n3 %= 2) == 0) {
                map2.put(string3, object);
                int cfr_ignored_0 = 0 / 0;
            } else {
                map2.put(string3, object);
            }
            values = n4 = (AFKeystoreWrapper + 49) % 128;
        }
        return null;
    }

    private void component2(Map map2) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(map2, string2);
        Object object = this.component4;
        Object object2 = ((AFh1oSDK)object).getMonetizationNetwork;
        HashMap hashMap = new HashMap(object2);
        ((AFh1oSDK)object).getMonetizationNetwork.clear();
        object = this.component4.AFAdRevenueData;
        object2 = "gcd";
        object.AFAdRevenueData((String)object2);
        Intrinsics.checkNotNullExpressionValue(hashMap, string2);
        int n3 = hashMap.isEmpty();
        int n4 = 1;
        if (n3 != n4) {
            n3 = AFKeystoreWrapper;
            values = (n3 + 39) % 128;
            values = n4 = (n3 += 13) % 128;
            if ((n3 %= 2) != 0) {
                map2 = AFb1rSDK.getCurrencyIso4217Code(map2);
                Intrinsics.checkNotNullExpressionValue(map2, string2);
                map2.put(object2, hashMap);
                int cfr_ignored_0 = 27 / 0;
            } else {
                map2 = AFb1rSDK.getCurrencyIso4217Code(map2);
                Intrinsics.checkNotNullExpressionValue(map2, string2);
                map2.put(object2, hashMap);
            }
        }
    }

    private boolean component2() {
        int n3;
        AFKeystoreWrapper = (values + 51) % 128;
        AFd1rSDK aFd1rSDK = this.component3.getRevenue;
        String string2 = "appsFlyerCount";
        int n4 = aFd1rSDK.getMediationNetwork(string2, 0);
        if (n4 <= (n3 = 1)) {
            AFKeystoreWrapper = (values + 27) % 128;
            return n3 != 0;
        }
        AFKeystoreWrapper = (values + 85) % 128;
        return false;
    }

    private static long component3() {
        long l2;
        int n3;
        int n4 = AFKeystoreWrapper + 99;
        values = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            long l3 = System.currentTimeMillis();
            l2 = SystemClock.elapsedRealtime() + l3;
        } else {
            long l4 = System.currentTimeMillis();
            l2 = SystemClock.elapsedRealtime();
            l2 = l4 - l2;
        }
        values = (AFKeystoreWrapper + 7) % 128;
        return l2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object component3(Object[] object) {
        Throwable throwable622222;
        InputStreamReader inputStreamReader;
        Object object2;
        block19: {
            int n3;
            File file;
            String string2;
            block17: {
                string2 = "PreInstall file wasn't found: ";
                object2 = null;
                file = (File)object[0];
                object = (String)object[1];
                AFKeystoreWrapper = n3 = (values + 69) % 128;
                if (file == null) {
                    int n4;
                    values = n4 = (n3 += 97) % 128;
                    if ((n3 %= 2) == 0) return null;
                    n4 = 61 / 0;
                    return null;
                }
                object2 = new Properties();
                Object object3 = new FileInputStream(file);
                Charset charset = Charset.defaultCharset();
                inputStreamReader = new InputStreamReader((InputStream)object3, charset);
                ((Properties)object2).load(inputStreamReader);
                object3 = "Found PreInstall property!";
                AFLogger.afInfoLog((String)object3);
                object = ((Properties)object2).getProperty((String)object);
                try {
                    ((Reader)inputStreamReader).close();
                    return object;
                }
                catch (Throwable throwable2) {
                    object2 = throwable2.getMessage();
                    AFLogger.afErrorLog((String)object2, throwable2);
                }
                return object;
                catch (Throwable throwable3) {
                    break block17;
                }
                catch (Throwable throwable4) {
                    n3 = 0;
                    inputStreamReader = null;
                }
            }
            string2 = ((Throwable)object).getMessage();
            AFLogger.afErrorLog(string2, (Throwable)object);
            if (inputStreamReader == null) return null;
            ((Reader)inputStreamReader).close();
            return null;
            {
                catch (Throwable throwable5) {
                    string2 = throwable5.getMessage();
                    AFLogger.afErrorLog(string2, throwable5);
                    return null;
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                int n7;
                block18: {
                    block20: {
                        n3 = 0;
                        inputStreamReader = null;
                        break block20;
                        catch (FileNotFoundException fileNotFoundException2) {}
                    }
                    try {
                        object = file.getAbsolutePath();
                        object2 = new StringBuilder(string2);
                        ((StringBuilder)object2).append((String)object);
                        object = ((StringBuilder)object2).toString();
                        AFLogger.afDebugLog((String)object);
                        if (inputStreamReader == null) break block18;
                    }
                    catch (Throwable throwable622222) {}
                    break block19;
                    ((Reader)inputStreamReader).close();
                    return null;
                }
                values = n7 = (AFKeystoreWrapper + 15) % 128;
            }
            return null;
        }
        if (inputStreamReader == null) throw throwable622222;
        try {
            ((Reader)inputStreamReader).close();
            throw throwable622222;
        }
        catch (Throwable throwable7) {
            object2 = throwable7.getMessage();
            AFLogger.afErrorLog((String)object2, throwable7);
        }
        throw throwable622222;
    }

    private void component3(Map map2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(map2, "");
        Object object = new Object[n3];
        object[0] = this;
        int n4 = System.identityHashCode(this);
        int n7 = 1273246331;
        int n8 = -1273246327;
        object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n7, n8, n4);
        String string2 = "oneLinkSlug";
        object = ((AppsFlyerProperties)object).getString(string2);
        Object object2 = new Object[n3];
        object2[0] = this;
        int n10 = System.identityHashCode(this);
        Object object3 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code(object2, n7, n8, n10);
        object2 = "onelinkVersion";
        object3 = ((AppsFlyerProperties)object3).getString((String)object2);
        if (object != null) {
            n3 = values + 47;
            AFKeystoreWrapper = n4 = n3 % 128;
            string2 = "onelink_id";
            if ((n3 %= 2) != 0) {
                map2.put(string2, object);
            } else {
                map2.put(string2, object);
                throw null;
            }
        }
        if (object3 != null) {
            int n14;
            object2 = "onelink_ver";
            map2.put(object2, object3);
            AFKeystoreWrapper = n14 = (values + 9) % 128;
        }
    }

    private static /* synthetic */ Object component4(Object[] object) {
        object = (AFg1iSDK)object[0];
        int n3 = AFKeystoreWrapper + 97;
        values = n3 % 128;
        String string2 = "sentSuccessfully";
        object = object.component1.getMonetizationNetwork(string2, null);
        boolean bl2 = Boolean.parseBoolean((String)object);
        if ((n3 %= 2) != 0) {
            n3 = 31 / 0;
        }
        return bl2;
    }

    private String component4() {
        int n3 = 1;
        int n4 = values + 51;
        AFKeystoreWrapper = n4 % 128;
        String string2 = "INSTALL_STORE";
        if ((n4 %= 2) != 0) {
            int n7;
            Object object;
            AFd1rSDK aFd1rSDK = this.component1;
            n4 = (int)(aFd1rSDK.getMonetizationNetwork(string2) ? 1 : 0);
            if (n4 != 0) {
                return this.component1.getMonetizationNetwork(string2, null);
            }
            n4 = this.component2() ^ n3;
            if (n4 != 0) {
                n3 = 0;
                object = null;
            } else {
                object = new Object[n3];
                aFd1rSDK = null;
                object[0] = this;
                n4 = System.identityHashCode(this);
                int n8 = -505986928;
                int n10 = 505986930;
                object = (String)AFg1iSDK.getCurrencyIso4217Code(object, n8, n10, n4);
            }
            aFd1rSDK = this.component1;
            aFd1rSDK.AFAdRevenueData(string2, (String)object);
            n4 = values + 117;
            AFKeystoreWrapper = n7 = n4 % 128;
            if ((n4 %= 2) != 0) {
                return object;
            }
            throw null;
        }
        this.component1.getMonetizationNetwork(string2);
        throw null;
    }

    private void component4(Map map2) {
        values = (AFKeystoreWrapper + 63) % 128;
        Intrinsics.checkNotNullParameter(map2, "");
        AFd1qSDK aFd1qSDK = this.component3;
        AFg1wSDK.AFAdRevenueData(map2, aFd1qSDK);
        AFKeystoreWrapper = (values + 79) % 128;
    }

    private void copy(Map map2) {
        values = (AFKeystoreWrapper + 29) % 128;
        Intrinsics.checkNotNullParameter(map2, "");
        Boolean bl2 = this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
        map2.put("is_pc", bl2);
        AFKeystoreWrapper = (values + 87) % 128;
    }

    private boolean copy() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (Boolean)AFg1iSDK.getCurrencyIso4217Code(objectArray, -156743048, 156743056, n3);
    }

    private final String copydefault() {
        int n3;
        values = n3 = (AFKeystoreWrapper + 3) % 128;
        Object object = this.component1;
        CharSequence charSequence = "androidIdCached";
        object = object.getMonetizationNetwork((String)charSequence, null);
        charSequence = this.getMonetizationNetwork;
        charSequence = charSequence.getContentResolver();
        String string2 = "android_id";
        try {
            charSequence = Settings.Secure.getString((ContentResolver)charSequence, (String)string2);
            if (charSequence != null) {
                values = (AFKeystoreWrapper + 79) % 128;
                return charSequence;
            }
        }
        catch (Exception exception) {
            string2 = exception.getMessage();
            AFLogger.afErrorLog(string2, exception);
        }
        if (object != null) {
            charSequence = new StringBuilder("use cached AndroidId: ");
            ((StringBuilder)charSequence).append((String)object);
            AFLogger.afDebugLog(((StringBuilder)charSequence).toString());
            return object;
        }
        return null;
    }

    private final void copydefault(Map map2) {
        String string2;
        Object object;
        int n3;
        int n4 = AFKeystoreWrapper + 25;
        values = n4 % 128;
        if ((n4 %= 2) != 0 ? (n4 = Build.VERSION.SDK_INT) >= (n3 = 125) : (n4 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            object = (UiModeManager)r.a(this.getMonetizationNetwork);
        } else {
            object = this.getMonetizationNetwork;
            string2 = "uimode";
            n3 = (object = object.getSystemService(string2)) instanceof UiModeManager;
            if (n3 != 0) {
                object = (UiModeManager)object;
            } else {
                n4 = 0;
                object = null;
            }
        }
        if (object != null && (n4 = object.getCurrentModeType()) == (n3 = 4)) {
            n4 = AFKeystoreWrapper + 79;
            values = n3 = n4 % 128;
            string2 = "tv";
            if ((n4 %= 2) == 0) {
                object = Boolean.TRUE;
                map2.put(string2, object);
            } else {
                object = Boolean.TRUE;
                map2.put(string2, object);
                throw null;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void d(Map var1_1) {
        var2_2 = 2;
        var3_3 = 1;
        var4_4 = 0;
        var5_5 = null;
        var6_6 = "";
        Intrinsics.checkNotNullParameter(var1_1, var6_6);
        var7_7 = this.component3.component4();
        var8_8 = this.component1;
        var9_9 = new Object[var2_2];
        var9_9[0] = var8_8;
        var9_9[var3_3] = var7_7;
        var10_10 = System.currentTimeMillis();
        var12_11 = (int)var10_10;
        var13_12 = -1548056329;
        var14_13 = 1548056332;
        var8_8 = (String)AFg1iSDK.getCurrencyIso4217Code(var9_9, var13_12, var14_13, var12_11);
        if (var8_8 != null && !(var15_14 = Intrinsics.areEqual(var8_8, var7_7))) {
            var15_14 = true;
        } else {
            AFg1iSDK.AFKeystoreWrapper = (AFg1iSDK.values + 5) % 128;
            var15_14 = false;
            var9_9 = null;
        }
        if (var8_8 != null) ** GOTO lbl-1000
        AFg1iSDK.values = var12_11 = (AFg1iSDK.AFKeystoreWrapper + 3) % 128;
        if (var7_7 != null) {
            var12_11 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var12_11 = 0;
            var8_8 = null;
        }
        if (var15_14 || var12_11 != 0) {
            var8_8 = "af_latestchannel";
            var1_1.put(var8_8, var7_7);
        }
        if ((var7_7 = this.component4()) != null) {
            var8_8 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(var8_8, var6_6);
            var7_7 = var7_7.toLowerCase((Locale)var8_8);
            Intrinsics.checkNotNullExpressionValue(var7_7, var6_6);
            var8_8 = "af_installstore";
            var1_1.put(var8_8, var7_7);
        }
        if ((var7_7 = this.equals()) != null) {
            var8_8 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(var8_8, var6_6);
            var7_7 = var7_7.toLowerCase((Locale)var8_8);
            Intrinsics.checkNotNullExpressionValue(var7_7, var6_6);
            var8_8 = "af_preinstall_name";
            var1_1.put(var8_8, var7_7);
        }
        var16_15 = new Object[var3_3];
        var16_15[0] = this;
        var17_16 = -505986928;
        var12_11 = 505986930;
        var4_4 = System.identityHashCode(this);
        if ((var16_15 = (String)AFg1iSDK.getCurrencyIso4217Code((Object[])var16_15, var17_16, var12_11, var4_4)) != null) {
            var4_4 = AFg1iSDK.values + 69;
            AFg1iSDK.AFKeystoreWrapper = var17_16 = var4_4 % 128;
            var18_17 = "af_currentstore";
            if ((var4_4 %= var2_2) != 0) {
                var5_5 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(var5_5, var6_6);
                var16_15 = var16_15.toLowerCase(var5_5);
                Intrinsics.checkNotNullExpressionValue(var16_15, var6_6);
                var1_1.put(var18_17, var16_15);
                return;
            }
            var5_5 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(var5_5, var6_6);
            var16_15 = var16_15.toLowerCase(var5_5);
            Intrinsics.checkNotNullExpressionValue(var16_15, var6_6);
            var1_1.put(var18_17, var16_15);
            throw null;
        }
    }

    private void e(Map map2) {
        int n3;
        int n4 = values + 7;
        AFKeystoreWrapper = n3 = n4 % 128;
        String string2 = "af_preinstalled";
        String string3 = "";
        if ((n4 %= 2) == 0) {
            Intrinsics.checkNotNullParameter(map2, string3);
            n4 = (int)(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork) ? 1 : 0);
            String string4 = String.valueOf(n4 != 0);
            map2.put(string2, string4);
            int cfr_ignored_0 = 24 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map2, string3);
            n4 = (int)(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork) ? 1 : 0);
            String string5 = String.valueOf(n4 != 0);
            map2.put(string2, string5);
        }
    }

    private static /* synthetic */ Object equals(Object[] object) {
        block9: {
            int n3 = 0;
            Object object2 = null;
            if ((object = (String)object[0]) != null) {
                values = n3 = (AFKeystoreWrapper + 123) % 128;
                object2 = StringsKt.m0((CharSequence)object);
                object2 = object2.toString();
                n3 = object2.length();
                if (n3 <= 0) break block9;
                AFKeystoreWrapper = n3 = (values + 89) % 128;
                object = StringsKt.m0((CharSequence)object);
                object = object.toString();
                try {
                    object2 = new File((String)object);
                    return object2;
                }
                catch (Throwable throwable) {
                    object2 = throwable.getMessage();
                    AFLogger.afErrorLog((String)object2, throwable);
                }
            }
        }
        return null;
    }

    private String equals() {
        int n3 = 1;
        int n4 = 0;
        Object object = new Object[n3];
        object[0] = this;
        int n7 = System.identityHashCode(this);
        int n8 = 1273246331;
        int n10 = -1273246327;
        object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n8, n10, n7);
        String string2 = "preInstallName";
        object = ((AppsFlyerProperties)object).getString(string2);
        AFd1rSDK aFd1rSDK = null;
        if (object != null) {
            n3 = AFKeystoreWrapper + 39;
            values = n4 = n3 % 128;
            if ((n3 %= 2) == 0) {
                return object;
            }
            throw null;
        }
        AFd1rSDK aFd1rSDK2 = this.component1;
        int n14 = aFd1rSDK2.getMonetizationNetwork(string2);
        if (n14 != 0) {
            int n15 = AFKeystoreWrapper + 13;
            values = n14 = n15 % 128;
            if ((n15 %= 2) != 0) {
                object = this.component1.getMonetizationNetwork(string2, null);
                int cfr_ignored_0 = 31 / 0;
            } else {
                object = this.component1.getMonetizationNetwork(string2, null);
            }
        } else {
            n14 = this.component2();
            if (n14 != 0) {
                int n16 = AFKeystoreWrapper + 19;
                values = n14 = n16 % 128;
                if ((n16 %= 2) == 0) {
                    object = this.AFInAppEventType();
                    if (object == null) {
                        object = this.getMediationNetwork("AF_PRE_INSTALL_NAME");
                    }
                } else {
                    this.AFInAppEventType();
                    throw null;
                }
            }
            if (object != null) {
                int n17;
                n14 = AFKeystoreWrapper + 59;
                values = n17 = n14 % 128;
                if ((n14 %= 2) == 0) {
                    aFd1rSDK = this.component1;
                    aFd1rSDK.AFAdRevenueData(string2, (String)object);
                } else {
                    this.component1.AFAdRevenueData(string2, (String)object);
                    throw null;
                }
            }
        }
        if (object != null) {
            Object object2 = new Object[n3];
            object2[0] = this;
            n4 = System.identityHashCode(this);
            object2 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object2, n8, n10, n4);
            ((AppsFlyerProperties)object2).set(string2, (String)object);
        }
        return object;
    }

    private final void equals(Map map2) {
        block3: {
            int n3;
            Object object;
            block4: {
                int n4;
                int n7;
                block2: {
                    n7 = values + 101;
                    AFKeystoreWrapper = n7 % 128;
                    n4 = 1;
                    if ((n7 %= 2) != 0) break block2;
                    object = this.getMonetizationNetwork;
                    n7 = (int)(AFh1zSDK.getRevenue(object) ? 1 : 0);
                    int cfr_ignored_0 = 82 / 0;
                    if ((n7 ^= n4) == n4) break block3;
                    break block4;
                }
                object = this.getMonetizationNetwork;
                n7 = (int)(AFh1zSDK.getRevenue(object) ? 1 : 0);
                if (n7 != n4) break block3;
            }
            object = Boolean.TRUE;
            String string2 = "inst_app";
            map2.put(string2, object);
            AFKeystoreWrapper = n3 = (values + 101) % 128;
        }
    }

    private void force(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        Object object = this.toString;
        int n3 = 1;
        Object object2 = new Object[n3];
        object2[0] = object;
        int n4 = System.identityHashCode(object);
        int n7 = -1684451992;
        int n8 = 1684451992;
        object = (String)AFg1wSDK.getCurrencyIso4217Code(object2, n7, n8, n4);
        if (object != null) {
            AFKeystoreWrapper = (values + 91) % 128;
            n3 = object.length();
            if (n3 != 0) {
                int n10;
                AFKeystoreWrapper = n3 = (values + 15) % 128;
                object2 = "appsflyerKey";
                map2.put(object2, object);
                values = n10 = (AFKeystoreWrapper + 5) % 128;
            }
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] object) {
        Object object2;
        block5: {
            int n3;
            int n4;
            block6: {
                int n7;
                int n8;
                String string2;
                block4: {
                    int n10;
                    n4 = 1;
                    object = (AFg1iSDK)object[0];
                    n3 = AFKeystoreWrapper + 33;
                    values = n10 = n3 % 128;
                    string2 = "api_store_value";
                    n8 = -1273246327;
                    n7 = 1273246331;
                    if ((n3 %= 2) == 0) break block4;
                    object2 = new Object[n4];
                    object2[0] = object;
                    n3 = System.identityHashCode(object);
                    object2 = ((AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code(object2, n7, n8, n3)).getString(string2);
                    n3 = 40 / 0;
                    if (object2 != null) break block5;
                    break block6;
                }
                object2 = new Object[n4];
                object2[0] = object;
                n3 = System.identityHashCode(object);
                if ((object2 = ((AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code(object2, n7, n8, n3)).getString(string2)) != null) break block5;
            }
            n4 = values + 123;
            AFKeystoreWrapper = n3 = n4 % 128;
            String string3 = "AF_STORE";
            object = super.getMediationNetwork(string3);
            if ((n4 %= 2) == 0) {
                n4 = 35 / 0;
            }
            object2 = object;
        }
        return object2;
    }

    public static Object getCurrencyIso4217Code(Object[] object, int n3, int n4, int n7) {
        int n8 = 2;
        int n10 = 1;
        int n14 = n3 * -716;
        int n15 = n4 * 1435 + n14;
        n14 = ~n3;
        int n16 = (n4 | n14) * -1434 + n15;
        n15 = ~n7;
        int n17 = ~(n15 | n4);
        n3 = ~(n3 | n4);
        n17 |= n3;
        int n18 = ~n4;
        n14 |= n18;
        n18 = ~(n14 | n7);
        n17 = (n17 | n18) * 717 + n16;
        n14 = ~(n14 | n15);
        n3 |= n14;
        n4 = ~(n4 | n7);
        n3 = (n3 | n4) * 717 + n17;
        n4 = 0;
        switch (n3) {
            default: {
                object = AFg1iSDK.getRevenue((Object[])object);
                break;
            }
            case 12: {
                Object object2 = (AFg1iSDK)object[0];
                object = (AFa1oSDK)object[n10];
                AFKeystoreWrapper = (values + 43) % 128;
                Object object3 = "";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Map map2 = ((AFa1oSDK)object).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(map2, (String)object3);
                boolean bl2 = ((AFa1oSDK)object).getRevenue();
                ((AFg1iSDK)object2).getMonetizationNetwork(map2, bl2);
                AFg1iSDK.hashCode(map2);
                AFg1iSDK.AFLogger(map2);
                ((AFg1iSDK)object2).getCurrencyIso4217Code(map2);
                object = ((AFg1iSDK)object2).equals.getRevenue;
                ((AFg1iSDK)object2).AFAdRevenueData(map2, (String)object);
                object = new Object[n8];
                object[0] = object2;
                object[n10] = map2;
                n7 = System.identityHashCode(object2);
                n15 = -1748783943;
                n16 = 1748783953;
                AFg1iSDK.getCurrencyIso4217Code((Object[])object, n15, n16, n7);
                object = ((AFg1iSDK)object2).getMonetizationNetwork.getResources().getConfiguration().mcc;
                object3 = new Pair("mcc", object);
                object = ((AFg1iSDK)object2).getMonetizationNetwork.getResources().getConfiguration().mnc;
                String string2 = "mnc";
                Pair pair = new Pair(string2, object);
                object = new Pair[n8];
                object[0] = object3;
                object[n10] = pair;
                object = fh1_2.i((Pair[])object);
                object3 = "cell";
                map2.put(object3, object);
                object = new Object[n10];
                object[0] = object2;
                n3 = System.identityHashCode(object2);
                n4 = 76539304;
                n7 = -76539295;
                object = (String)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n4, n7, n3);
                map2.put("sig", object);
                long l2 = AFg1iSDK.component3();
                object = l2;
                map2.put("last_boot_time", object);
                object2 = AFg1iSDK.areAllFieldsValid();
                map2.put("disk", object2);
                values = (AFKeystoreWrapper + 87) % 128;
                bl2 = false;
                object = null;
                break;
            }
            case 11: {
                object = AFg1iSDK.equals((Object[])object);
                break;
            }
            case 10: {
                object = AFg1iSDK.component1((Object[])object);
                break;
            }
            case 9: {
                object = (AFg1iSDK)object[0];
                AFKeystoreWrapper = (values + 7) % 128;
                PackageManager packageManager = ((AFg1iSDK)object).getMonetizationNetwork.getApplicationContext().getPackageManager();
                object = ((AFg1iSDK)object).getMonetizationNetwork.getApplicationContext().getPackageName();
                object = AFb1qSDK.e_(packageManager, (String)object);
                values = n3 = (AFKeystoreWrapper + 51) % 128;
                break;
            }
            case 8: {
                object = AFg1iSDK.component4((Object[])object);
                break;
            }
            case 7: {
                object = AFg1iSDK.component3((Object[])object);
                break;
            }
            case 6: {
                object = AFg1iSDK.component2((Object[])object);
                break;
            }
            case 5: {
                object = AFg1iSDK.areAllFieldsValid((Object[])object);
                break;
            }
            case 4: {
                object = AFg1iSDK.getMediationNetwork((Object[])object);
                break;
            }
            case 3: {
                object = AFg1iSDK.getMonetizationNetwork((Object[])object);
                break;
            }
            case 2: {
                object = AFg1iSDK.getCurrencyIso4217Code((Object[])object);
                break;
            }
            case 1: {
                object = AFg1iSDK.AFAdRevenueData((Object[])object);
            }
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final String getCurrencyIso4217Code(String string2) {
        int n3;
        block4: {
            int n4;
            block5: {
                Object object = new Object[]{this};
                int n7 = System.identityHashCode(this);
                int n8 = 1273246331;
                int n10 = -1273246327;
                object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n8, n10, n7);
                String string3 = "collectAndroidId";
                n3 = ((AppsFlyerProperties)object).getBoolean(string3, false);
                object = null;
                if (n3 == 0) break block4;
                AFKeystoreWrapper = n3 = (values + 115) % 128;
                if (string2 == null) break block5;
                values = (n3 + 123) % 128;
                n3 = string2.length();
                if (n3 != 0) break block4;
            }
            if ((n4 = this.AFKeystoreWrapper()) == 0) return null;
            n4 = values + 123;
            AFKeystoreWrapper = n3 = n4 % 128;
            if ((n4 %= 2) != 0) {
                string2 = this.copydefault();
                AFKeystoreWrapper = n3 = (values + 115) % 128;
                return string2;
            }
            this.copydefault();
            throw null;
        }
        if (string2 == null) return null;
        values = n3 = (AFKeystoreWrapper + 107) % 128;
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String getCurrencyIso4217Code(SimpleDateFormat var1_1) {
        block2: {
            block3: {
                AFg1iSDK.values = var2_2 = (AFg1iSDK.AFKeystoreWrapper + 75) % 128;
                var3_3 = "";
                Intrinsics.checkNotNullParameter(var1_1, var3_3);
                var4_4 = this.component1;
                var5_5 = 0;
                var6_6 = null;
                var7_7 /* !! */  = "appsFlyerFirstInstall";
                var4_4 = var4_4.getMonetizationNetwork(var7_7 /* !! */ , null);
                if (var4_4 != null) break block2;
                var8_8 = AFg1iSDK.values + 79;
                AFg1iSDK.AFKeystoreWrapper = var5_5 = var8_8 % 128;
                if ((var8_8 %= 2) != 0) break block3;
                var8_8 = (int)this.component2();
                var5_5 = 74 / 0;
                if (var8_8 == 0) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            var8_8 = (int)this.component2();
            if (var8_8 != 0) lbl-1000:
            // 2 sources

            {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                var4_4 = new Date();
                var4_4 = var1_1 = var1_1.format((Date)var4_4);
            } else lbl-1000:
            // 2 sources

            {
                AFg1iSDK.values = var9_9 = (AFg1iSDK.AFKeystoreWrapper + 37) % 128;
                var4_4 = var3_3;
            }
            var1_1 = this.component1;
            var1_1.AFAdRevenueData(var7_7 /* !! */ , (String)var4_4);
            AFg1iSDK.AFKeystoreWrapper = var9_9 = (AFg1iSDK.values + 77) % 128;
        }
        var6_6 = AFLogger.INSTANCE;
        var7_7 /* !! */  = AFh1vSDK.e;
        var10_10 = kp1_0.c("AppsFlyer: first launch date: ", (String)var4_4);
        AFh1uSDK.i$default(var6_6, (AFh1vSDK)var7_7 /* !! */ , var10_10, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(var4_4, var3_3);
        return var4_4;
    }

    private void getCurrencyIso4217Code(Map map2, String string2) {
        Object[] objectArray = new Object[]{this, map2, string2};
        int n3 = System.identityHashCode(this);
        AFg1iSDK.getCurrencyIso4217Code(objectArray, 86217130, -86217129, n3);
    }

    private static boolean getCurrencyIso4217Code(File file) {
        int n3;
        int n4;
        block6: {
            block7: {
                block5: {
                    n4 = AFKeystoreWrapper + 87;
                    values = n4 % 128;
                    if ((n4 %= 2) == 0) break block5;
                    n4 = 92 / 0;
                    if (file == null) break block6;
                    break block7;
                }
                if (file == null) break block6;
            }
            n3 = file.exists();
            if (n3 != 0) {
                return false;
            }
        }
        n3 = values + 81;
        AFKeystoreWrapper = n4 = n3 % 128;
        if ((n3 %= 2) != 0) {
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] object) {
        int n3;
        object = (AFg1iSDK)object[0];
        int n4 = values + 7;
        AFKeystoreWrapper = n3 = n4 % 128;
        object = (AppsFlyerProperties)object.hashCode.getValue();
        if ((n4 %= 2) == 0) {
            n4 = 88 / 0;
        }
        AFKeystoreWrapper = (values + 87) % 128;
        return object;
    }

    private static String getMediationNetwork(AFd1rSDK aFd1rSDK, String string2) {
        Object[] objectArray = new Object[]{aFd1rSDK, string2};
        int n3 = (int)System.currentTimeMillis();
        return (String)AFg1iSDK.getCurrencyIso4217Code(objectArray, -1548056329, 1548056332, n3);
    }

    private final String getMediationNetwork(String string2) {
        int n3;
        int n4 = values + 25;
        AFKeystoreWrapper = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            AFd1qSDK aFd1qSDK = this.component3;
            string2 = aFd1qSDK.getRevenue(string2);
            n4 = 50 / 0;
        } else {
            AFd1qSDK aFd1qSDK = this.component3;
            string2 = aFd1qSDK.getRevenue(string2);
        }
        n4 = AFKeystoreWrapper + 79;
        values = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return string2;
        }
        throw null;
    }

    private final SimpleDateFormat getMediationNetwork() {
        int n3;
        int n4 = values + 21;
        AFKeystoreWrapper = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            int n7;
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat)this.AFInAppEventType.getValue();
            n3 = values + 9;
            AFKeystoreWrapper = n7 = n3 % 128;
            if ((n3 %= 2) == 0) {
                n3 = 20 / 0;
            }
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat)this.AFInAppEventType.getValue();
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] object) {
        String string2;
        AFd1rSDK aFd1rSDK;
        block3: {
            String string3;
            block4: {
                block2: {
                    aFd1rSDK = (AFd1rSDK)object[0];
                    object = (String)object[1];
                    int n3 = AFKeystoreWrapper + 79;
                    values = n3 % 128;
                    string2 = "CACHED_CHANNEL";
                    if ((n3 %= 2) == 0) break block2;
                    string3 = aFd1rSDK.getMonetizationNetwork(string2, null);
                    int cfr_ignored_0 = 56 / 0;
                    if (string3 == null) break block3;
                    break block4;
                }
                string3 = aFd1rSDK.getMonetizationNetwork(string2, null);
                if (string3 == null) break block3;
            }
            return string3;
        }
        aFd1rSDK.AFAdRevenueData(string2, (String)object);
        values = (AFKeystoreWrapper + 31) % 128;
        return object;
    }

    private String getMonetizationNetwork() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (String)AFg1iSDK.getCurrencyIso4217Code(objectArray, 76539304, -76539295, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void getMonetizationNetwork(Map object, String string2) {
        Exception exception2;
        block4: {
            int n3;
            String string3;
            String string4;
            block3: {
                int n4;
                string4 = "prev_event_name";
                AFKeystoreWrapper = n4 = (values + 91) % 128;
                Object object2 = "";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Intrinsics.checkNotNullParameter(string2, (String)object2);
                try {
                    object2 = this.component1;
                    string3 = null;
                    object2 = object2.getMonetizationNetwork(string4, null);
                    string3 = "prev_event_timestamp";
                    if (object2 == null) break block3;
                    JSONObject jSONObject = new JSONObject();
                    AFd1rSDK aFd1rSDK = this.component1;
                    long l2 = -1;
                    long l3 = aFd1rSDK.getMediationNetwork(string3, l2);
                    jSONObject.put(string3, l3);
                    jSONObject.put(string4, object2);
                    object2 = "prev_event";
                    object.put(object2, jSONObject);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object = this.component1;
            object.AFAdRevenueData(string4, string2);
            object = this.component1;
            long l4 = System.currentTimeMillis();
            object.getMonetizationNetwork(string3, l4);
            int n7 = values + 33;
            AFKeystoreWrapper = n3 = n7 % 128;
            if ((n7 %= 2) == 0) {
                n7 = 16 / 0;
            }
            return;
        }
        AFLogger.afErrorLog("Error while processing previous event.", exception2);
    }

    private void getMonetizationNetwork(Map map2, boolean n3) {
        Object object;
        String string2;
        HashMap<String, Object> hashMap;
        block2: {
            block4: {
                String string3;
                int n4;
                block3: {
                    Intrinsics.checkNotNullParameter(map2, "");
                    hashMap = new HashMap<String, Object>();
                    string2 = AFg1iSDK.AFAdRevenueData("ro.product.cpu.abi");
                    hashMap.put("cpu_abi", string2);
                    string2 = AFg1iSDK.AFAdRevenueData("ro.product.cpu.abi2");
                    hashMap.put("cpu_abi2", string2);
                    string2 = AFg1iSDK.AFAdRevenueData("os.arch");
                    hashMap.put("arch", string2);
                    string2 = AFg1iSDK.AFAdRevenueData("ro.build.display.id");
                    String string4 = "build_display_id";
                    hashMap.put(string4, string2);
                    n4 = 1;
                    if (n3 != n4) break block2;
                    n3 = AFKeystoreWrapper + 103;
                    values = n3 % 128;
                    n4 = 2;
                    string4 = null;
                    string3 = "appsFlyerCount";
                    if ((n3 %= n4) == 0) break block3;
                    this.areAllFieldsValid(hashMap);
                    object = this.component3.getRevenue;
                    n3 = object.getMediationNetwork(string3, 0);
                    n4 = 3;
                    if (n3 > n4) break block2;
                    break block4;
                }
                this.areAllFieldsValid(hashMap);
                object = this.component3.getRevenue;
                n3 = object.getMediationNetwork(string3, 0);
                if (n3 > n4) break block2;
            }
            object = this.getCurrencyIso4217Code.getCurrencyIso4217Code();
            hashMap.putAll((Map<String, Object>)object);
            AFKeystoreWrapper = n3 = (values + 103) % 128;
        }
        object = this.areAllFieldsValid;
        string2 = this.getMonetizationNetwork;
        object = object.getCurrencyIso4217Code((Context)string2);
        hashMap.put("dim", object);
        map2.put("deviceData", hashMap);
    }

    private final AppsFlyerProperties getRevenue() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code(objectArray, 1273246331, -1273246327, n3);
    }

    private static File getRevenue(String string2) {
        Object[] objectArray = new Object[]{string2};
        int n3 = (int)System.currentTimeMillis();
        return (File)AFg1iSDK.getCurrencyIso4217Code(objectArray, 1393711468, -1393711457, n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object getRevenue(Object[] object) {
        Throwable throwable2;
        int n3;
        block6: {
            int n4;
            int n7;
            Object object2;
            Object object3;
            AFg1iSDK aFg1iSDK;
            Object object4;
            Object object5;
            block5: {
                int n8;
                object5 = "versionCode";
                object4 = null;
                aFg1iSDK = (AFg1iSDK)object[0];
                n3 = 1;
                object = (Map)object[n3];
                values = (AFKeystoreWrapper + 111) % 128;
                try {
                    object3 = aFg1iSDK.getMonetizationNetwork;
                    object3 = object3.getPackageManager();
                    object2 = aFg1iSDK.getMonetizationNetwork;
                    object2 = object2.getPackageName();
                    object3 = object3.getPackageInfo((String)object2, 0);
                    object2 = aFg1iSDK.component1;
                    n7 = object2.getMediationNetwork((String)object5, 0);
                    n8 = ((PackageInfo)object3).versionCode;
                    if (n8 <= n7) break block5;
                    AFKeystoreWrapper = n7 = (values + 93) % 128;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object2 = aFg1iSDK.component1;
                object2.AFAdRevenueData((String)object5, n8);
            }
            object5 = "app_version_code";
            n7 = ((PackageInfo)object3).versionCode;
            object2 = String.valueOf(n7);
            object.put(object5, object2);
            object5 = "app_version_name";
            object2 = aFg1iSDK.component3;
            object2 = ((AFd1qSDK)object2).getMonetizationNetwork;
            object2 = ((AFd1nSDK)object2).AFAdRevenueData;
            String string2 = object2.getPackageName();
            object2 = AFb1qSDK.getMediationNetwork((Context)object2, string2);
            object.put(object5, object2);
            object5 = "targetSDKver";
            object2 = aFg1iSDK.component3;
            object2 = ((AFd1qSDK)object2).getMonetizationNetwork;
            object2 = ((AFd1nSDK)object2).AFAdRevenueData;
            object2 = object2.getApplicationInfo();
            n7 = ((ApplicationInfo)object2).targetSdkVersion;
            object2 = n7;
            object.put(object5, object2);
            long l2 = ((PackageInfo)object3).firstInstallTime;
            long l3 = ((PackageInfo)object3).lastUpdateTime;
            object5 = "date1";
            object3 = aFg1iSDK.getMediationNetwork();
            Object[] objectArray = new Date(l2);
            object3 = ((DateFormat)object3).format((Date)objectArray);
            object.put(object5, object3);
            object5 = "date2";
            object3 = aFg1iSDK.getMediationNetwork();
            object2 = new Date(l3);
            object3 = ((DateFormat)object3).format((Date)object2);
            object.put(object5, object3);
            int n10 = View.getDefaultSize((int)0, (int)0);
            int n14 = n10 + 15;
            n10 = Process.getThreadPriority((int)0) + 20 >> 6;
            n7 = 102 - n10;
            string2 = "\uffe6\ufffb\u000f\b\ufffd\u0002\uffde\ufffb\u000e\uffff\u0000\u0003\f\r\u000e";
            {
                n10 = Process.myTid() >> 22;
                n4 = 10 - n10;
            }
            {
                object5 = new Object[n3];
                objectArray = object5;
                AFg1iSDK.a(n14, n7, string2, false, n4, (Object[])object5);
                object5 = object5[0];
                object5 = (String)object5;
                object5 = ((String)object5).intern();
                object4 = aFg1iSDK.getMediationNetwork();
                object3 = "";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                object4 = aFg1iSDK.getCurrencyIso4217Code((SimpleDateFormat)object4);
                object.put(object5, object4);
                return null;
            }
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", throwable2, n3 != 0);
        return null;
    }

    private static String getRevenue(File file, String string2) {
        Object[] objectArray = new Object[]{file, string2};
        int n3 = (int)System.currentTimeMillis();
        return (String)AFg1iSDK.getCurrencyIso4217Code(objectArray, 2000545293, -2000545286, n3);
    }

    private void getRevenue(AFa1oSDK objectArray, String string2, String string3, AFc1aSDK aFc1aSDK) {
        int n3;
        int n4;
        int n7 = 1;
        int n8 = 2;
        String string4 = "";
        Intrinsics.checkNotNullParameter(objectArray, string4);
        Map map2 = objectArray.getMonetizationNetwork();
        objectArray = objectArray.getCurrencyIso4217Code();
        Object object = AFf1zSDK.getMonetizationNetwork;
        if (objectArray == object) {
            n4 = AFKeystoreWrapper + 53;
            values = n3 = n4 % 128;
            if ((n4 %= n8) != 0) {
                Intrinsics.checkNotNullExpressionValue(map2, string4);
                this.toString(map2);
                this.copydefault(map2);
                this.equals(map2);
                objectArray = this.copy;
                object = this.component1;
                AFc1rSDK.getMonetizationNetwork((AFd1nSDK)objectArray, (AFd1rSDK)object);
                n4 = 72 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map2, string4);
                this.toString(map2);
                this.copydefault(map2);
                this.equals(map2);
                objectArray = this.copy;
                object = this.component1;
                AFc1rSDK.getMonetizationNetwork((AFd1nSDK)objectArray, (AFd1rSDK)object);
            }
        }
        Intrinsics.checkNotNullExpressionValue(map2, string4);
        this.AFKeystoreWrapper(map2);
        this.component3(map2);
        this.component2(map2);
        objectArray = new Object[n8];
        objectArray[0] = map2;
        objectArray[n7] = string3;
        long l2 = System.currentTimeMillis();
        int n10 = (int)l2;
        int n14 = -830168679;
        n3 = 830168685;
        AFg1iSDK.getCurrencyIso4217Code(objectArray, n14, n3, n10);
        objectArray = new Object[3];
        objectArray[0] = this;
        objectArray[n7] = map2;
        objectArray[n8] = string2;
        int n15 = System.identityHashCode(this);
        n10 = 86217130;
        n7 = -86217129;
        AFg1iSDK.getCurrencyIso4217Code(objectArray, n10, n7, n15);
        this.valueOf(map2);
        n4 = 0;
        objectArray = null;
        if (aFc1aSDK != null) {
            n15 = values + 75;
            AFKeystoreWrapper = n10 = n15 % 128;
            if ((n15 %= n8) != 0) {
                aFc1aSDK.getRevenue(map2);
                return;
            }
            aFc1aSDK.getRevenue(map2);
            throw null;
        }
        n15 = AFKeystoreWrapper + 97;
        values = n10 = n15 % 128;
        if ((n15 %= n8) == 0) {
            return;
        }
        throw null;
    }

    private final void getRevenue(Map map2) {
        block15: {
            int n3;
            Object object;
            try {
                object = this.getMonetizationNetwork;
            }
            catch (Exception exception) {
                AFLogger.afErrorLog("Exception while collecting install date. ", exception);
                return;
            }
            object = object.getPackageManager();
            Object object2 = this.getMonetizationNetwork;
            object2 = object2.getPackageName();
            String string2 = null;
            object = object.getPackageInfo((String)object2, 0);
            long l2 = object.firstInstallTime;
            string2 = "yyyy-MM-dd_HHmmssZ";
            Object object3 = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, (Locale)object3);
            string2 = "installDate";
            object3 = "UTC";
            object3 = TimeZone.getTimeZone((String)object3);
            simpleDateFormat.setTimeZone((TimeZone)object3);
            object3 = new Date(l2);
            object = simpleDateFormat.format((Date)object3);
            map2.put(string2, object);
            int n4 = AFKeystoreWrapper + 27;
            values = n3 = n4 % 128;
            if ((n4 %= 2) != 0) break block15;
            return;
        }
        throw null;
    }

    private static void getRevenue(Map map2, AFa1oSDK object) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(map2, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = ((AFa1oSDK)object).areAllFieldsValid;
        if (string2 != null) {
            String string3 = "eventName";
            map2.put(string3, string2);
            object = ((AFa1oSDK)object).getCurrencyIso4217Code;
            if (object == null) {
                object = new HashMap();
            }
            string2 = new JSONObject((Map)object);
            object = string2.toString();
            string2 = "eventValue";
            map2.put(string2, object);
        }
    }

    private static void getRevenue(Map map2, String string2) {
        Object[] objectArray = new Object[]{map2, string2};
        int n3 = (int)System.currentTimeMillis();
        AFg1iSDK.getCurrencyIso4217Code(objectArray, -830168679, 830168685, n3);
    }

    private void getRevenue(Map map2, boolean bl2) {
        block6: {
            String string2;
            int n3;
            block7: {
                String string3;
                String string4;
                block5: {
                    int n4;
                    n3 = AFKeystoreWrapper + 103;
                    values = n4 = n3 % 128;
                    string4 = "platformextension";
                    string3 = "";
                    if ((n3 %= 2) == 0) break block5;
                    Intrinsics.checkNotNullParameter(map2, string3);
                    string2 = this.getRevenue;
                    map2.put(string4, string2);
                    n3 = 35 / 0;
                    if (!bl2) break block6;
                    break block7;
                }
                Intrinsics.checkNotNullParameter(map2, string3);
                string2 = this.getRevenue;
                map2.put(string4, string2);
                if (!bl2) break block6;
            }
            int n7 = AFKeystoreWrapper + 59;
            values = n3 = n7 % 128;
            int n8 = n7 % 2;
            string2 = "platform_extension_v2";
            if (n8 == 0) {
                Map map3 = this.AFAdRevenueData.getMediationNetwork();
                map2.put(string2, map3);
            } else {
                Map map4 = this.AFAdRevenueData.getMediationNetwork();
                map2.put(string2, map4);
                throw null;
            }
        }
    }

    private static void hashCode(Map map2) {
        AFKeystoreWrapper = (values + 93) % 128;
        Object object = "";
        Intrinsics.checkNotNullParameter(map2, (String)object);
        int n3 = Drawable.resolveOpacity((int)0, (int)0);
        int n4 = n3 + 5;
        double d2 = CdmaCellLocation.convertQuartSecToDecDegrees((int)0);
        double d5 = 0.0;
        String string2 = "\ufffb\u000b\ufffa\u0007\ufffd";
        String string3 = "sdk";
        double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        double d9 = d7 + 103;
        int n7 = TextUtils.indexOf((CharSequence)object, (CharSequence)object, (int)0, (int)0);
        int n8 = 5 - n7;
        object = new Object[1];
        AFg1iSDK.a(n4, (int)d9, string2, false, n8, object);
        object = ((String)object[0]).intern();
        String string4 = Build.BRAND;
        map2.put(object, string4);
        string4 = Build.DEVICE;
        map2.put("device", string4);
        string4 = Build.PRODUCT;
        map2.put("product", string4);
        object = String.valueOf(Build.VERSION.SDK_INT);
        map2.put(string3, object);
        string4 = Build.MODEL;
        map2.put("model", string4);
        object = "deviceType";
        string4 = Build.TYPE;
        map2.put(object, string4);
        int n10 = values + 27;
        AFKeystoreWrapper = n7 = n10 % 128;
        if ((n10 %= 2) != 0) {
            return;
        }
        throw null;
    }

    private void i(Map map2) {
        Object[] objectArray = new Object[]{this, map2};
        int n3 = System.identityHashCode(this);
        AFg1iSDK.getCurrencyIso4217Code(objectArray, -1748783943, 1748783953, n3);
    }

    private void registerClient(Map map2) {
        block5: {
            int n3;
            AFKeystoreWrapper = n3 = (values + 37) % 128;
            String string2 = "";
            Intrinsics.checkNotNullParameter(map2, string2);
            Object object = this.copy;
            Object object2 = this.component1;
            object = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object, (AFd1rSDK)object2);
            if (object == null) break block5;
            object2 = "uid";
            try {
                map2.put(object2, object);
                values = (AFKeystoreWrapper + 75) % 128;
                return;
            }
            catch (Throwable throwable) {
                object = new StringBuilder("ERROR: could not get uid ");
                object2 = throwable.getMessage();
                ((StringBuilder)object).append((String)object2);
                object = object.toString();
                Intrinsics.checkNotNullExpressionValue(object, string2);
                AFLogger.afErrorLog((String)object, throwable);
            }
        }
    }

    private final void toString(Map map2) {
        int n3;
        values = (AFKeystoreWrapper + 65) % 128;
        float f5 = Float.MIN_VALUE;
        Object object = new Object[]{this};
        int n32 = 1273246331;
        int n4 = -1273246327;
        int n7 = System.identityHashCode(this);
        boolean n8 = ((AppsFlyerProperties)(object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n32, n4, n7))).isOtherSdkStringDisabled();
        if (!n8) {
            object = this.getMediationNetwork;
            Object object2 = this.getMonetizationNetwork;
            f5 = object.AFAdRevenueData((Context)object2).getCurrencyIso4217Code;
            object2 = "batteryLevel";
            object = String.valueOf(f5);
            map2.put(object2, object);
        }
        int n10 = values + 11;
        AFKeystoreWrapper = n3 = n10 % 128;
        if ((n10 %= 2) == 0) {
            n10 = 47 / 0;
        }
    }

    private void unregisterClient(Map map2) {
        int n3;
        int n4 = values + 115;
        AFKeystoreWrapper = n3 = n4 % 128;
        String string2 = "didConfigureTokenRefreshService=";
        CharSequence charSequence = "";
        if ((n4 %= 2) != 0) {
            Intrinsics.checkNotNullParameter(map2, (String)charSequence);
            Object object = this.getMonetizationNetwork;
            n4 = (int)(AFg1jSDK.getMonetizationNetwork(object) ? 1 : 0);
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append(n4 != 0);
            string2 = ((StringBuilder)charSequence).toString();
            AFLogger.afDebugLog(string2);
            if (n4 == 0) {
                object = Boolean.FALSE;
                string2 = "tokenRefreshConfigured";
                map2.put(string2, object);
            }
            object = AFg1jSDK.getRevenue(this.component1);
            string2 = "registeredUninstall";
            map2.put(string2, object);
            int n7 = values + 27;
            AFKeystoreWrapper = n4 = n7 % 128;
            if ((n7 %= 2) == 0) {
                n7 = 48 / 0;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map2, (String)charSequence);
        boolean bl2 = AFg1jSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(bl2);
        AFLogger.afDebugLog(stringBuilder.toString());
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void v(Map var1_1) {
        block14: {
            block13: {
                block12: {
                    var2_2 = null;
                    var3_5 = 1;
                    var4_6 = AFg1iSDK.values + 107;
                    AFg1iSDK.AFKeystoreWrapper = var5_7 = var4_6 % 128;
                    var6_8 /* !! */  = "collectFacebookAttrId";
                    var7_9 = -1273246327;
                    var8_10 = 1273246331;
                    var9_11 = "";
                    if ((var4_6 %= 2) != 0) break block12;
                    Intrinsics.checkNotNullParameter(var1_1, var9_11);
                    var10_12 = new Object[var3_5];
                    var10_12[0] = this;
                    var11_13 = System.identityHashCode(this);
                    var10_12 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])var10_12, var8_10, var7_9, var11_13);
                    var4_6 = (int)var10_12.getBoolean(var6_8 /* !! */ , false);
                    if ((var3_5 ^= var4_6) == 0) break block13;
                    break block14;
                }
                Intrinsics.checkNotNullParameter(var1_1, var9_11);
                var10_12 = new Object[var3_5];
                var10_12[0] = this;
                var11_13 = System.identityHashCode(this);
                var10_12 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])var10_12, var8_10, var7_9, var11_13);
                var3_5 = var10_12.getBoolean(var6_8 /* !! */ , (boolean)var3_5);
                if (var3_5 == 0) break block14;
            }
            var3_5 = 0;
            var12_14 = null;
            try {
                var10_12 = this.getMonetizationNetwork;
                var10_12 = var10_12.getPackageManager();
                var6_8 /* !! */  = "com.facebook.katana";
                var10_12.getApplicationInfo(var6_8 /* !! */ , 0);
                var2_2 = this.component3;
                var10_12 = this.getMonetizationNetwork;
                var12_14 = var2_2.AFAdRevenueData((Context)var10_12);
            }
            catch (PackageManager.NameNotFoundException var2_4) {}
            ** finally { 
lbl40:
            // 1 sources

            var10_12 = AFLogger.INSTANCE;
            var6_8 /* !! */  = AFh1vSDK.AFKeystoreWrapper;
            var13_15 = true;
            var14_17 = "Exception while collecting facebook's attribution ID. ";
            var11_13 = 0;
            var9_11 = null;
            var10_12.e((AFh1vSDK)var6_8 /* !! */ , var14_17, var2_3, false, false, var13_15, false);
            if (var12_14 != null) {
                var2_2 = "fb";
                var1_1.put(var2_2, var12_14);
                AFg1iSDK.values = var15_19 = (AFg1iSDK.AFKeystoreWrapper + 105) % 128;
            }
        }
    }

    private void valueOf(Map map2) {
        block3: {
            int n3;
            long l2;
            Object object;
            block4: {
                String string2;
                long l3;
                int n4;
                block2: {
                    int n7;
                    n4 = AFKeystoreWrapper + 9;
                    values = n7 = n4 % 128;
                    l3 = 0L;
                    string2 = "";
                    if ((n4 %= 2) == 0) break block2;
                    Intrinsics.checkNotNullParameter(map2, string2);
                    object = this.component4;
                    l2 = ((AFh1oSDK)object).equals;
                    n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                    if (n4 == 0) break block3;
                    break block4;
                }
                Intrinsics.checkNotNullParameter(map2, string2);
                object = this.component4;
                l2 = ((AFh1oSDK)object).equals;
                n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                if (n4 == 0) break block3;
            }
            object = l2;
            String string3 = "prev_session_dur";
            map2.put(string3, object);
            values = n3 = (AFKeystoreWrapper + 99) % 128;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void values(Map map2) {
        int n3;
        Intrinsics.checkNotNullParameter(map2, "");
        String string2 = AFc1rSDK.getCurrencyIso4217Code();
        String string3 = AFc1rSDK.getMonetizationNetwork();
        if (string2 != null) {
            int n4;
            int n7 = AFKeystoreWrapper + 77;
            values = n4 = n7 % 128;
            if ((n7 %= 2) != 0) throw null;
            if (string3 != null && (n7 = Integer.parseInt(string3)) > 0) {
                n7 = values + 99;
                AFKeystoreWrapper = n4 = n7 % 128;
                String string4 = "originalAppsflyerId";
                String string5 = "reinstallCounter";
                if ((n7 %= 2) != 0) {
                    map2.put(string5, string3);
                    map2.put(string4, string2);
                } else {
                    map2.put(string5, string3);
                    map2.put(string4, string2);
                    throw null;
                }
            }
        }
        int n8 = AFKeystoreWrapper + 63;
        values = n3 = n8 % 128;
        if ((n8 %= 2) != 0) throw null;
    }

    private static PackageInfo w_(PackageManager packageManager, String string2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        String string3 = "";
        if (n3 >= n4) {
            PackageManager.PackageInfoFlags packageInfoFlags = p.a();
            packageManager = q.a(packageManager, string2, packageInfoFlags);
            Intrinsics.checkNotNullExpressionValue(packageManager, string3);
            int n7 = AFKeystoreWrapper + 5;
            values = n3 = n7 % 128;
            if ((n7 %= 2) == 0) {
                return packageManager;
            }
            throw null;
        }
        packageManager = packageManager.getPackageInfo(string2, 0);
        Intrinsics.checkNotNullExpressionValue(packageManager, string3);
        AFKeystoreWrapper = (values + 47) % 128;
        return packageManager;
    }

    public final Long AFAdRevenueData() {
        Object object = this.copy.AFAdRevenueData;
        if (object != null) {
            PackageManager packageManager = object.getPackageManager();
            if (packageManager != null) {
                object = object.getPackageName();
                String string2 = "";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object = AFg1iSDK.w_(packageManager, (String)object);
                if (object != null) {
                    int n3;
                    int n4 = AFKeystoreWrapper + 17;
                    values = n3 = n4 % 128;
                    if ((n4 %= 2) == 0) {
                        return object.firstInstallTime;
                    }
                    long cfr_ignored_0 = object.firstInstallTime;
                    throw null;
                }
            }
            return null;
        }
        AFKeystoreWrapper = (values + 27) % 128;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final void AFAdRevenueData(AFa1oSDK object) {
        void var7_12;
        int n3;
        Object object2;
        int n4;
        int n7 = 2;
        Object object3 = null;
        values = n4 = (AFKeystoreWrapper + 85) % 128;
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object4 = this.component3;
        boolean n8 = ((AFd1qSDK)object4).component1();
        if (!n8) {
            object4 = AFb1rSDK.getCurrencyIso4217Code(((AFa1oSDK)object).getMonetizationNetwork());
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            object2 = Boolean.TRUE;
            String string3 = "ad_ids_disabled";
            object4.put(string3, object2);
        } else {
            Object object5;
            object4 = this.component3.AFAdRevenueData.component4;
            if (object4 == null) {
                AFKeystoreWrapper = (values + 9) % 128;
                return;
            }
            object2 = ((AFh1pSDK)object4).component3;
            if (object2 != null && (n3 = object2.length()) != 0) {
                object2 = "gaidError";
                object5 = ((AFh1pSDK)object4).component3;
                ((AFa1oSDK)object).getCurrencyIso4217Code((String)object2, object5);
                values = n3 = (AFKeystoreWrapper + 103) % 128;
            }
            if ((object2 = ((AFh1pSDK)object4).getMonetizationNetwork) != null && (object5 = ((AFh1pSDK)object4).getCurrencyIso4217Code) != null) {
                int n10;
                ((AFa1oSDK)object).getCurrencyIso4217Code("advertiserId", object2);
                object2 = String.valueOf(((AFh1pSDK)object4).getCurrencyIso4217Code);
                object5 = "advertiserIdEnabled";
                ((AFa1oSDK)object).getCurrencyIso4217Code((String)object5, object2);
                object4 = String.valueOf(((AFh1pSDK)object4).getRevenue);
                object2 = "isGaidWithGps";
                ((AFa1oSDK)object).getCurrencyIso4217Code((String)object2, object4);
                AFKeystoreWrapper = n10 = (values + 31) % 128;
            }
        }
        object4 = this.component3.AFAdRevenueData.component4;
        if (object4 != null) {
            int n14;
            n3 = values + 49;
            AFKeystoreWrapper = n14 = n3 % 128;
            if ((n3 %= n7) == 0) {
                object4 = ((AFh1pSDK)object4).areAllFieldsValid;
                object2 = Boolean.TRUE;
                boolean bl2 = Intrinsics.areEqual(object4, object2);
                n3 = 96 / 0;
            } else {
                object4 = ((AFh1pSDK)object4).areAllFieldsValid;
                object2 = Boolean.TRUE;
                boolean bl3 = Intrinsics.areEqual(object4, object2);
            }
        } else {
            boolean bl4 = false;
            object4 = null;
        }
        object4 = String.valueOf((boolean)var7_12);
        object2 = "GAID_retry";
        ((AFa1oSDK)object).getCurrencyIso4217Code((String)object2, object4);
        Object object6 = new AFf1zSDK[n7];
        object4 = AFf1zSDK.getMonetizationNetwork;
        object6[0] = object4;
        object3 = AFf1zSDK.equals;
        int n15 = 1;
        object6[n15] = object3;
        object6 = xx_2.i((Object[])object6);
        object3 = ((AFa1oSDK)object).getCurrencyIso4217Code();
        n7 = (int)(object6.contains(object3) ? 1 : 0);
        if (n7 != 0 && (object6 = this.equals.component3) != null) {
            object = AFb1rSDK.getCurrencyIso4217Code(((AFa1oSDK)object).getMonetizationNetwork());
            Intrinsics.checkNotNullExpressionValue(object, string2);
            long l2 = ((AFe1nSDK)object6).getRevenue;
            object6 = l2;
            object3 = "fetchAdIdLatency";
            object.put(object3, object6);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void AFAdRevenueData(Map var1_1) {
        block9: {
            block10: {
                Intrinsics.checkNotNullParameter(var1_1, "");
                var2_3 = this.equals.AFAdRevenueData;
                if (var2_3 == null) break block9;
                var3_4 = AFg1iSDK.AFKeystoreWrapper + 61;
                AFg1iSDK.values = var4_5 = var3_4 % 128;
                var5_6 = "af_deeplink";
                if ((var3_4 %= 2) == 0) break block10;
                var6_7 /* !! */  = var1_1.get(var5_6);
                85 / 0;
                if (var6_7 /* !! */  == null) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            var6_7 /* !! */  = var1_1.get(var5_6);
            if (var6_7 /* !! */  != null) lbl-1000:
            // 2 sources

            {
                var1_1 = "Skip 'af' payload as deeplink was found by path";
                AFLogger.afDebugLog((String)var1_1);
            } else lbl-1000:
            // 2 sources

            {
                var6_7 /* !! */  = tl2_2.b;
                var6_7 /* !! */  = new V((String)var2_3);
                var2_3 = "isPush";
                var7_8 = "true";
                var6_7 /* !! */ .put((String)var2_3, var7_8);
                var2_3 = var6_7 /* !! */ .toString();
                try {
                    var1_1.put(var5_6, var2_3);
                    var1_1 = Unit.a;
                }
                catch (Throwable var1_2) {
                    var2_3 = tl2_2.b;
                    var1_1 = vl2_2.a(var1_2);
                }
                var7_8 = tl2_2.a(var1_1);
                if (var7_8 != null) {
                    var2_3 = AFLogger.INSTANCE;
                    var6_7 /* !! */  = AFh1vSDK.e;
                    var5_6 = "Exception while trying to create JSONObject from pushPayload";
                    var8_9 = 120;
                    AFh1uSDK.e$default((AFh1uSDK)var2_3, var6_7 /* !! */ , var5_6, (Throwable)var7_8, false, false, false, false, var8_9, null);
                }
                AFg1iSDK.AFKeystoreWrapper = var9_10 = (AFg1iSDK.values + 117) % 128;
            }
        }
        this.equals.AFAdRevenueData = null;
    }

    public final long getCurrencyIso4217Code() {
        int n3;
        int n4 = values + 87;
        AFKeystoreWrapper = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return System.currentTimeMillis();
        }
        System.currentTimeMillis();
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    public final void getCurrencyIso4217Code(AFa1oSDK var1_1) {
        var2_2 = "";
        Intrinsics.checkNotNullParameter(var1_1, var2_2);
        var3_3 = var1_1.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(var3_3, var2_2);
        var4_4 = var1_1.AFAdRevenueData;
        var3_3.put("open_referrer", var4_4);
        var2_2 = var1_1.component3;
        var5_5 = 1;
        if (var2_2 == null) ** GOTO lbl-1000
        AFg1iSDK.AFKeystoreWrapper = var6_6 = (AFg1iSDK.values + 25) % 128;
        var7_7 = b.k(var2_2);
        if (var7_7 == 0) {
            var7_7 = 0;
            var2_2 = null;
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = 1;
        }
        if (var7_7 != var5_5) {
            AFg1iSDK.AFKeystoreWrapper = var7_7 = (AFg1iSDK.values + 109) % 128;
            var2_2 = "af_web_referrer";
            var1_1 = var1_1.component3;
            var3_3.put(var2_2, var1_1);
        }
    }

    public final void getCurrencyIso4217Code(Map map2) {
        int n3;
        block11: {
            block13: {
                Object object;
                Object object2;
                String string2;
                block14: {
                    String string3;
                    String string4;
                    int n4;
                    int n7;
                    String string5;
                    int n8;
                    block12: {
                        int n10;
                        n3 = 1;
                        boolean n14 = false;
                        string2 = null;
                        Intrinsics.checkNotNullParameter(map2, "");
                        object2 = this.component2.getMediationNetwork;
                        if (object2 != null) {
                            n8 = values + 115;
                            AFKeystoreWrapper = n10 = n8 % 128;
                            if ((n8 %= 2) == 0) {
                                object2 = ((AFi1rSDK)object2).getMonetizationNetwork();
                                n8 = 62 / 0;
                            } else {
                                object2 = ((AFi1rSDK)object2).getMonetizationNetwork();
                            }
                        } else {
                            object2 = null;
                        }
                        if (object2 == null) break block11;
                        n8 = values + 105;
                        AFKeystoreWrapper = n10 = n8 % 128;
                        n8 %= 2;
                        string5 = "disableCollectNetworkData";
                        n7 = -1273246327;
                        n4 = 1273246331;
                        string4 = "ivc";
                        string3 = "network";
                        if (n8 != 0) break block12;
                        Object object4 = ((AFi1pSDK)object2).AFAdRevenueData;
                        map2.put(string3, object4);
                        n8 = (int)(((AFi1pSDK)object2).getMediationNetwork() ? 1 : 0);
                        object4 = n8 != 0;
                        map2.put(string4, object4);
                        object4 = new Object[n3];
                        object4[0] = this;
                        int n15 = System.identityHashCode(this);
                        object4 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object4, n4, n7, n15);
                        int n16 = ((AppsFlyerProperties)object4).getBoolean(string5, false);
                        if ((n3 ^= n16) == 0) break block13;
                        break block14;
                    }
                    Object object3 = ((AFi1pSDK)object2).AFAdRevenueData;
                    map2.put(string3, object3);
                    object3 = ((AFi1pSDK)object2).getMediationNetwork();
                    map2.put(string4, object3);
                    object = new Object[n3];
                    object[0] = this;
                    n8 = System.identityHashCode(this);
                    object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n4, n7, n8);
                    n3 = (int)(((AppsFlyerProperties)object).getBoolean(string5, false) ? 1 : 0);
                    if (n3 != 0) break block13;
                }
                object = ((AFi1pSDK)object2).getCurrencyIso4217Code;
                if (object != null) {
                    string2 = "operator";
                    map2.put(string2, object);
                } else {
                    values = n3 = (AFKeystoreWrapper + 97) % 128;
                }
                object = ((AFi1pSDK)object2).getMediationNetwork;
                if (object != null) {
                    string2 = "carrier";
                    map2.put(string2, object);
                }
            }
            return;
        }
        int n17 = values + 25;
        AFKeystoreWrapper = n3 = n17 % 128;
        if ((n17 %= 2) == 0) {
            n17 = 98 / 0;
        }
    }

    public final void getCurrencyIso4217Code(Map map2, int n3, int n4) {
        int n7 = values + 7;
        AFKeystoreWrapper = n7 % 128;
        String string2 = "iaecounter";
        String string3 = "counter";
        String string4 = "";
        if ((n7 %= 2) != 0) {
            Intrinsics.checkNotNullParameter(map2, string4);
            String string5 = String.valueOf(n3);
            map2.put(string3, string5);
            string5 = String.valueOf(n4);
            map2.put(string2, string5);
            string5 = String.valueOf(this.copy() ^ true);
            String string6 = "isFirstCall";
            map2.put(string6, string5);
            int n8 = values + 17;
            AFKeystoreWrapper = n3 = n8 % 128;
            if ((n8 %= 2) != 0) {
                return;
            }
            throw null;
        }
        Intrinsics.checkNotNullParameter(map2, string4);
        String string7 = String.valueOf(n3);
        map2.put(string3, string7);
        string7 = String.valueOf(n4);
        map2.put(string2, string7);
        this.copy();
        throw null;
    }

    public final void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        Object[] objectArray = new Object[]{this, aFa1oSDK};
        int n3 = System.identityHashCode(this);
        AFg1iSDK.getCurrencyIso4217Code(objectArray, 1541874918, -1541874906, n3);
    }

    public final void getMediationNetwork(Map map2) {
        int n3;
        int n4;
        int n7 = 0;
        String[] stringArray = null;
        int n8 = 1;
        Object object = "";
        Intrinsics.checkNotNullParameter(map2, (String)object);
        Object object2 = new Object[n8];
        object2[0] = this;
        int n10 = System.identityHashCode(this);
        int n14 = 1273246331;
        int n15 = -1273246327;
        object2 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object2, n14, n15, n10);
        CharSequence charSequence = "appid";
        object2 = ((AppsFlyerProperties)object2).getString((String)charSequence);
        if (object2 != null) {
            values = n4 = (AFKeystoreWrapper + 21) % 128;
            map2.put(charSequence, object2);
            AFKeystoreWrapper = n3 = (values + 41) % 128;
        }
        object2 = new Object[n8];
        object2[0] = this;
        n10 = System.identityHashCode(this);
        object2 = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object2, n14, n15, n10);
        charSequence = "currencyCode";
        if ((object2 = ((AppsFlyerProperties)object2).getString((String)charSequence)) != null) {
            AFKeystoreWrapper = (values + 71) % 128;
            n10 = ((String)object2).length();
            if (n10 != (n4 = 3)) {
                charSequence = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                ((StringBuilder)charSequence).append((String)object2);
                String string2 = "' is not a legal value.";
                ((StringBuilder)charSequence).append(string2);
                charSequence = charSequence.toString();
                Intrinsics.checkNotNullExpressionValue(charSequence, (String)object);
                AFLogger.afWarnLog((String)charSequence);
            }
            object = "currency";
            map2.put(object, object2);
        }
        object = new Object[n8];
        object[0] = this;
        n3 = System.identityHashCode(this);
        object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n14, n15, n3);
        object2 = "IS_UPDATE";
        if ((object = ((AppsFlyerProperties)object).getString((String)object2)) != null) {
            object2 = "isUpdate";
            map2.put(object2, object);
        }
        object = new Object[n8];
        object[0] = this;
        n3 = System.identityHashCode(this);
        object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n14, n15, n3);
        object2 = "additionalCustomData";
        if ((object = ((AppsFlyerProperties)object).getString((String)object2)) != null) {
            object2 = "customData";
            map2.put(object2, object);
        }
        object = new Object[n8];
        object[0] = this;
        n3 = System.identityHashCode(this);
        object = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code((Object[])object, n14, n15, n3);
        object2 = "AppUserId";
        if ((object = ((AppsFlyerProperties)object).getString((String)object2)) != null) {
            int n16;
            object2 = "appUserId";
            map2.put(object2, object);
            AFKeystoreWrapper = n16 = (values + 79) % 128;
        }
        Object object3 = new Object[n8];
        object3[0] = this;
        n7 = System.identityHashCode(this);
        stringArray = (AppsFlyerProperties)AFg1iSDK.getCurrencyIso4217Code(object3, n14, n15, n7);
        object3 = "userEmails";
        if ((stringArray = stringArray.getString((String)object3)) != null) {
            object3 = "user_emails";
            map2.put(object3, stringArray);
        }
        if ((stringArray = this.equals.getMediationNetwork) != null && (stringArray = stringArray.getCurrencyIso4217Code) != null) {
            AFKeystoreWrapper = n8 = (values + 75) % 128;
            object3 = "sharing_filter";
            map2.put(object3, stringArray);
        }
    }

    public final void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        Object[] objectArray = new Object[]{this, aFa1oSDK};
        int n3 = System.identityHashCode(this);
        AFg1iSDK.getCurrencyIso4217Code(objectArray, -1645166160, 1645166165, n3);
    }

    public final void getMonetizationNetwork(Map map2) {
        AFKeystoreWrapper = (values + 81) % 128;
        Intrinsics.checkNotNullParameter(map2, "");
        this.getRevenue(map2);
        Object[] objectArray = new Object[]{this, map2};
        int n3 = System.identityHashCode(this);
        AFg1iSDK.getCurrencyIso4217Code(objectArray, -1208384822, 1208384822, n3);
        this.d(map2);
        this.e(map2);
        this.v(map2);
        values = (AFKeystoreWrapper + 79) % 128;
    }
}

