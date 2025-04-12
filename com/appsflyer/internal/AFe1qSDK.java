/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.ImageFormat
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.os.SystemClock
 *  android.telephony.cdma.CdmaCellLocation
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.widget.ExpandableListView
 */
package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1mSDK;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFa1vSDK;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFc1jSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1gSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFe1jSDK;
import com.appsflyer.internal.AFe1lSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1oSDK;
import com.appsflyer.internal.AFe1pSDK;
import com.appsflyer.internal.AFe1rSDK;
import com.appsflyer.internal.AFe1sSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFe1ySDK;
import com.appsflyer.internal.AFh1hSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1jSDK;
import com.appsflyer.internal.AFk1jSDK;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

public final class AFe1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData;
    private static int areAllFieldsValid = 0;
    private static byte[] component1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copy = 0;
    private static int copydefault = 1;
    private static short[] equals;
    private static String getRevenue;
    private final AFe1iSDK component4;
    private final AFe1wSDK getCurrencyIso4217Code;
    private final AFd1qSDK getMediationNetwork;
    private final AppsFlyerProperties getMonetizationNetwork;

    static {
        int n3;
        String string2;
        AFe1qSDK.getCurrencyIso4217Code();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = string2 = "https://%sonelink.%s/shortlink-sdk/v2";
        int n4 = copydefault + 55;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return;
        }
        throw null;
    }

    public AFe1qSDK(AFe1wSDK aFe1wSDK, AFd1qSDK aFd1qSDK, AppsFlyerProperties appsFlyerProperties, AFe1iSDK aFe1iSDK) {
        this.getCurrencyIso4217Code = aFe1wSDK;
        this.getMediationNetwork = aFd1qSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
        this.component4 = aFe1iSDK;
    }

    private AFe1tSDK AFAdRevenueData(AFe1mSDK aFe1mSDK, AFe1jSDK aFe1jSDK) {
        Object[] objectArray = new Object[]{this, aFe1mSDK, aFe1jSDK};
        int n3 = System.identityHashCode(this);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -194014191, 194014192, n3);
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] object, int n3, int n4, int n7) {
        int n8 = 2;
        int n10 = 1;
        int n14 = n3 * -520;
        int n15 = n4 * 522 + n14;
        n14 = ~n3;
        int n16 = ~(n14 | n4 | n7) * 521 + n15;
        n15 = ~n4;
        n3 = ~(n3 | n15);
        n15 = n3 * -1042 + n16;
        if ((n3 = (n3 | (n4 = ~(n4 | (n7 = ~n7 | n14)))) * 521 + n15) != n10) {
            if (n3 != n8) {
                AFe1qSDK aFe1qSDK = (AFe1qSDK)object[0];
                Object object2 = (String)object[n10];
                object = (String)object[n8];
                Object[] objectArray = aFe1qSDK.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName();
                Object object3 = aFe1qSDK.getMediationNetwork;
                AFd1nSDK aFd1nSDK = ((AFd1qSDK)object3).getMonetizationNetwork;
                object3 = ((AFd1qSDK)object3).getRevenue;
                object3 = AFb1iSDK.getCurrencyIso4217Code(aFd1nSDK, (AFd1rSDK)object3);
                object = AFe1sSDK.getRevenue((String)objectArray, (String)object3, (String)object2, (String)object);
                object2 = new AFe1rSDK();
                n7 = 3;
                objectArray = new Object[n7];
                objectArray[0] = aFe1qSDK;
                objectArray[n10] = object;
                objectArray[n8] = object2;
                int n17 = System.identityHashCode(aFe1qSDK);
                n4 = 194014192;
                object = (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -194014191, n4, n17);
                copy = n3 = (copydefault + 119) % 128;
            } else {
                object = AFe1qSDK.getMediationNetwork(object);
            }
        } else {
            object = AFe1qSDK.getMonetizationNetwork(object);
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    private static void a(short s7, int n3, int n4, int n7, byte by2, Object[] objectArray) {
        long l2;
        int n8;
        byte by4;
        int n10;
        long l3;
        int n14;
        byte[] byArray;
        void var12_14;
        byte[] byArray2;
        Object object = new AFk1jSDK();
        StringBuilder stringBuilder = new StringBuilder();
        long l4 = component2;
        long l7 = 3554368215783393998L;
        int c2 = (int)(l4 ^= l7);
        int n15 = n3 + c2;
        int n16 = -1;
        int n17 = 1;
        if (n15 == n16) {
            boolean bl2 = false;
            byArray2 = null;
        } else {
            boolean bl3 = true;
        }
        int n18 = var12_14 ^ 1;
        if (n18 != 0) {
            Object[] objectArray2 = component1;
            if (objectArray2 != null) {
                n18 = objectArray2.length;
                byArray = new byte[n18];
                for (n14 = 0; n14 < n18; ++n14) {
                    $11 = ($10 + 9) % 128;
                    l3 = (long)objectArray2[n14] ^ l7;
                    n10 = (int)l3;
                    byArray[n14] = by4 = (byte)n10;
                }
                objectArray2 = byArray;
            }
            if (objectArray2 != null) {
                objectArray2 = component1;
                n8 = (int)((long)component3 ^ l7);
                n18 = n4 + n8;
                n15 = (byte)((long)objectArray2[n18] ^ l7);
                n18 = component2;
                l2 = (long)n18 ^ l7;
                n8 = (int)l2;
                n15 = (byte)(n15 + n8);
            } else {
                objectArray2 = equals;
                n8 = (int)((long)component3 ^ l7);
                n18 = n4 + n8;
                n15 = (short)((long)objectArray2[n18] ^ l7);
                n18 = component2;
                l2 = (long)n18 ^ l7;
                n8 = (int)l2;
                n15 = (short)(n15 + n8);
            }
        }
        if (n15 > 0) {
            char c3;
            char c5;
            void var12_17;
            n18 = n4 + n15 + -2;
            n8 = component3;
            long l8 = (long)n8 ^ l7;
            n14 = (int)l8;
            n18 += n14;
            if (var12_14 != n17) {
                $10 = ($11 + 41) % 128;
                boolean bl4 = true;
            } else {
                boolean bl5 = false;
                byArray2 = null;
            }
            ((AFk1jSDK)object).getCurrencyIso4217Code = n18 += var12_17;
            l2 = (long)areAllFieldsValid ^ l7;
            int n19 = (int)l2;
            ((AFk1jSDK)object).AFAdRevenueData = c5 = (char)(n7 + n19);
            stringBuilder.append(c5);
            ((AFk1jSDK)object).getMonetizationNetwork = c3 = ((AFk1jSDK)object).AFAdRevenueData;
            byArray2 = component1;
            if (byArray2 != null) {
                n18 = byArray2.length;
                byArray = new byte[n18];
                for (n14 = 0; n14 < n18; ++n14) {
                    $11 = ($10 + 33) % 128;
                    l3 = (long)byArray2[n14] ^ l7;
                    n10 = (int)l3;
                    byArray[n14] = by4 = (byte)n10;
                }
                byArray2 = byArray;
            }
            if (byArray2 != null) {
                $10 = ($11 + 71) % 128;
                boolean bl6 = true;
            } else {
                boolean bl7 = false;
                byArray2 = null;
            }
            ((AFk1jSDK)object).getRevenue = n17;
            while ((n18 = ((AFk1jSDK)object).getRevenue) < n15) {
                Object[] objectArray3;
                void var12_23;
                if (var12_23 != false) {
                    objectArray3 = component1;
                    n8 = ((AFk1jSDK)object).getCurrencyIso4217Code;
                    ((AFk1jSDK)object).getCurrencyIso4217Code = n14 = n8 + -1;
                    l2 = (long)objectArray3[n8] ^ l7;
                    n18 = (byte)l2;
                    n8 = ((AFk1jSDK)object).getMonetizationNetwork;
                    n18 = (byte)(n18 + s7) ^ by2;
                    n8 += n18;
                    n18 = (char)n8;
                    ((AFk1jSDK)object).AFAdRevenueData = (char)n18;
                    $11 = n18 = ($10 + 107) % 128;
                } else {
                    objectArray3 = equals;
                    n8 = ((AFk1jSDK)object).getCurrencyIso4217Code;
                    ((AFk1jSDK)object).getCurrencyIso4217Code = n14 = n8 + -1;
                    l2 = (long)objectArray3[n8] ^ l7;
                    n18 = (short)l2;
                    n8 = ((AFk1jSDK)object).getMonetizationNetwork;
                    n18 = (short)(n18 + s7) ^ by2;
                    n8 += n18;
                    n18 = (char)n8;
                    ((AFk1jSDK)object).AFAdRevenueData = (char)n18;
                }
                n18 = ((AFk1jSDK)object).AFAdRevenueData;
                stringBuilder.append((char)n18);
                n18 = ((AFk1jSDK)object).AFAdRevenueData;
                ((AFk1jSDK)object).getMonetizationNetwork = (char)n18;
                ((AFk1jSDK)object).getRevenue = n18 = ((AFk1jSDK)object).getRevenue + n17;
            }
        }
        objectArray[0] = object = stringBuilder.toString();
    }

    public static void getCurrencyIso4217Code() {
        byte[] byArray;
        component3 = 1161415615;
        component2 = 1991592606;
        areAllFieldsValid = -9740393;
        byte[] byArray2 = byArray = new byte[17];
        byte[] byArray3 = byArray;
        byArray2[0] = 61;
        byArray3[1] = 51;
        byArray2[2] = -49;
        byArray3[3] = -35;
        byArray2[4] = 61;
        byArray3[5] = -55;
        byArray2[6] = 48;
        byArray3[7] = -40;
        byArray2[8] = -24;
        byArray3[9] = 9;
        byArray2[10] = -21;
        byArray3[11] = 56;
        byArray2[12] = -61;
        byArray3[13] = 33;
        byArray2[14] = -34;
        byArray3[15] = -50;
        byArray3[16] = -50;
        component1 = byArray;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objectArray) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK)objectArray[0];
        int n3 = 1;
        Object object = (String[])objectArray[n3];
        int n4 = 2;
        Object object2 = (String)objectArray[n4];
        int n7 = 3;
        Object object3 = (UUID)objectArray[n7];
        int n8 = 4;
        String string2 = (String)objectArray[n8];
        String string3 = object3.toString();
        Object object4 = new StringBuilder();
        String string4 = getRevenue;
        Object object5 = AppsFlyerLib.getInstance().getHostPrefix();
        String string5 = AFb1rSDK.getRevenue().getHostName();
        Object[] objectArray2 = new Object[n4];
        objectArray2[0] = object5;
        objectArray2[n3] = string5;
        string4 = String.format(string4, objectArray2);
        ((StringBuilder)object4).append(string4);
        ((StringBuilder)object4).append("/");
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append("?id=");
        ((StringBuilder)object4).append((String)object2);
        string5 = object4.toString();
        object4 = aFe1qSDK.getRevenue();
        string4 = String.valueOf(object4.get("build_number"));
        Object object6 = new HashMap();
        object3 = object3.toString();
        ((HashMap)object6).put("Af-UUID", object3);
        ((HashMap)object6).put("Af-Meta-Sdk-Ver", string4);
        object3 = String.valueOf(object4.get("counter"));
        ((HashMap)object6).put("Af-Meta-Counter", object3);
        object3 = String.valueOf(object4.get("model"));
        ((HashMap)object6).put("Af-Meta-Model", object3);
        object3 = String.valueOf(object4.get("platformextension"));
        ((HashMap)object6).put("Af-Meta-Platform", object3);
        object3 = String.valueOf(object4.get("sdk"));
        ((HashMap)object6).put("Af-Meta-System-Version", object3);
        short s7 = (short)(Process.myPid() >> 22);
        int n10 = View.resolveSizeAndState((int)0, (int)0, (int)0);
        int n14 = -68 - n10;
        n10 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
        int n15 = -864846193 - n10;
        n10 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
        int n16 = 1981934312 - n10;
        long l2 = SystemClock.elapsedRealtime();
        long l3 = 0L;
        object4 = "GET";
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        l4 = (byte)(1 - l4);
        objectArray2 = new Object[n3];
        AFe1qSDK.a(s7, n14, n15, n16, (byte)l4, objectArray2);
        object3 = ((String)objectArray2[0]).intern();
        object = new String[]{object4, string3, object, object2, string4};
        object = AFe1qSDK.getRevenue(string2, string3, object);
        ((HashMap)object6).put(object3, object);
        objectArray2 = null;
        n14 = 0;
        object5 = object;
        object2 = object6;
        object6 = object4;
        object = new AFe1mSDK(string5, null, (String)object4, (Map)object2, false);
        object2 = new AFe1gSDK();
        Object[] objectArray3 = new Object[n7];
        objectArray3[0] = aFe1qSDK;
        objectArray3[n3] = object;
        objectArray3[n4] = object2;
        int n17 = System.identityHashCode(aFe1qSDK);
        AFe1tSDK aFe1tSDK = (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray3, -194014191, 194014192, n17);
        int n18 = copy + 45;
        copydefault = n3 = n18 % 128;
        if ((n18 %= n4) != 0) {
            return aFe1tSDK;
        }
        throw null;
    }

    private boolean getMediationNetwork() {
        AppsFlyerProperties appsFlyerProperties = this.getMonetizationNetwork;
        String string2 = "http_cache";
        int n3 = 1;
        int n4 = appsFlyerProperties.getBoolean(string2, n3 != 0);
        if (n4 != n3) {
            copy = n4 = (copydefault + 77) % 128;
            copydefault = (n4 + 67) % 128;
            return n3;
        }
        return false;
    }

    private AFe1tSDK getMonetizationNetwork(AFe1mSDK aFe1mSDK, AFe1jSDK aFe1jSDK, boolean bl2) {
        int n3;
        aFe1mSDK.getMonetizationNetwork = bl2;
        Object object = this.getCurrencyIso4217Code;
        ExecutorService executorService = ((AFe1wSDK)object).getMonetizationNetwork;
        object = ((AFe1wSDK)object).getMediationNetwork;
        AFe1tSDK aFe1tSDK = new AFe1tSDK(aFe1mSDK, executorService, (AFe1lSDK)object, aFe1jSDK);
        int n4 = copy + 89;
        copydefault = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return aFe1tSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] object) {
        int n3;
        AFe1qSDK aFe1qSDK = (AFe1qSDK)object[0];
        AFe1mSDK aFe1mSDK = (AFe1mSDK)object[1];
        int n4 = 2;
        object = (AFe1jSDK)object[n4];
        copydefault = (copy + 89) % 128;
        boolean bl2 = aFe1qSDK.getMediationNetwork();
        object = aFe1qSDK.getMonetizationNetwork(aFe1mSDK, (AFe1jSDK)object, bl2);
        int n7 = copy + 59;
        copydefault = n3 = n7 % 128;
        if ((n7 %= n4) != 0) {
            return object;
        }
        throw null;
    }

    private static String getRevenue(String string2, String string3, String ... object) {
        int n3;
        object = Arrays.asList(object);
        Serializable serializable = new ArrayList(object);
        String string4 = "v2";
        ((ArrayList)serializable).add(1, string4);
        object = new String[]{};
        object = ((ArrayList)serializable).toArray((T[])object);
        object = TextUtils.join((CharSequence)"\u2063", (Object[])object);
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(string3);
        ((StringBuilder)serializable).append(string4);
        string2 = serializable.toString();
        string2 = AFb1jSDK.getMonetizationNetwork((String)object, string2);
        int n4 = copydefault + 11;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return string2;
        }
        throw null;
    }

    private Map getRevenue() {
        HashMap hashMap = p3.a("build_number", "6.15.2");
        Object object = Integer.valueOf(this.getMediationNetwork.getRevenue.getMediationNetwork("appsFlyerCount", 0));
        hashMap.put("counter", object);
        String string2 = Build.MODEL;
        hashMap.put("model", string2);
        short s7 = (short)View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n3 = Color.alpha((int)0) + -75;
        int n4 = TextUtils.indexOf((CharSequence)"", (char)'0', (int)0) + -864846181;
        int n7 = Color.red((int)0);
        int n8 = 1981934345 - n7;
        byte by2 = (byte)(ViewConfiguration.getPressedStateDuration() >> 16);
        object = new Object[1];
        AFe1qSDK.a(s7, n3, n4, n8, by2, (Object[])object);
        object = ((String)object[0]).intern();
        string2 = Build.BRAND;
        hashMap.put(object, string2);
        object = Integer.toString(Build.VERSION.SDK_INT);
        hashMap.put("sdk", object);
        object = this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData;
        string2 = object.getPackageName();
        object = AFb1qSDK.getMediationNetwork((Context)object, string2);
        hashMap.put("app_version_name", object);
        object = this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        hashMap.put("app_id", object);
        object = new AFb1aSDK();
        object = ((AFb1aSDK)object).getMediationNetwork();
        string2 = "platformextension";
        hashMap.put(string2, object);
        int n10 = copydefault + 29;
        copy = n7 = n10 % 128;
        if ((n10 %= 2) != 0) {
            n10 = 28 / 0;
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1tSDK AFAdRevenueData(AFa1oSDK object, String object2, AFd1nSDK objectArray) {
        Class clazz;
        Object object3;
        Object object4;
        Object object5;
        int n3 = 1;
        int n4 = 2;
        int n7 = 3;
        copy = (copydefault + 43) % 128;
        try {
            object5 = new Object[n7];
            object5[n4] = objectArray;
            object5[n3] = object2;
            object5[0] = object;
            object2 = AFa1vSDK.registerClient;
            int n8 = 1754022303;
            object4 = n8;
            object4 = object2.get(object4);
            if (object4 == null) {
                object4 = "";
                int n10 = 48;
                int n14 = TextUtils.lastIndexOf((CharSequence)object4, (char)n10) + 36;
                n10 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37;
                char c2 = (char)View.combineMeasuredStates((int)0, (int)0);
                object4 = AFa1vSDK.getRevenue(n14, n10, c2);
                object4 = (Class)object4;
                object3 = "getRevenue";
                Class[] classArray = new Class[n7];
                clazz = AFa1oSDK.class;
                classArray[0] = clazz;
                classArray[n3] = clazz = String.class;
                classArray[n4] = clazz = AFd1nSDK.class;
                object4 = ((Class)object4).getMethod((String)object3, classArray);
                objectArray = n8;
                object2.put(objectArray, object4);
            }
            object4 = (Method)object4;
            object3 = object2 = ((Method)object4).invoke(null, object5);
            object3 = (byte[])object2;
            copydefault = (copy + 49) % 128;
            object4 = ((AFa1oSDK)object).component4;
        }
        catch (Throwable throwable) {
            try {
                object2 = throwable.getCause();
                if (object2 == null) throw throwable;
                throw object2;
            }
            catch (Throwable throwable2) {}
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", throwable2);
            return null;
        }
        clazz = Collections.emptyMap();
        boolean bl2 = ((AFa1oSDK)object).AFAdRevenueData();
        object5 = object2;
        object2 = new AFe1mSDK((String)object4, (byte[])object3, "POST", (Map)((Object)clazz), bl2);
        object = new AFe1oSDK();
        objectArray = new Object[n7];
        objectArray[0] = this;
        objectArray[n3] = object2;
        objectArray[n4] = object;
        int n15 = System.identityHashCode(this);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -194014191, 194014192, n15);
    }

    public final AFe1tSDK AFAdRevenueData(AFh1hSDK object) {
        int n3;
        Object[] objectArray;
        int n4 = 2;
        byte[] byArray = ((AFa1oSDK)object).getMediationNetwork();
        String string2 = ((AFa1oSDK)object).component4;
        Map map2 = Collections.emptyMap();
        boolean bl2 = true;
        String string3 = "POST";
        Object[] objectArray2 = objectArray;
        objectArray = new AFe1mSDK(string2, byArray, string3, map2, bl2);
        object = new AFe1oSDK();
        objectArray2 = new Object[3];
        string2 = null;
        objectArray2[0] = this;
        objectArray2[1] = objectArray;
        objectArray2[n4] = object;
        int n7 = System.identityHashCode(this);
        int n8 = 194014192;
        object = (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray2, -194014191, n8, n7);
        int n10 = copydefault + 31;
        copy = n3 = n10 % 128;
        if ((n10 %= n4) == 0) {
            return object;
        }
        throw null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1ySDK AFAdRevenueData(Map var1_1, String var2_4) {
        block10: {
            block9: {
                var3_5 = 0;
                var4_6 = null;
                var5_7 = 1;
                var6_8 = 2;
                var7_9 = new Object[var6_8];
                var7_9[var5_7] = var2_4;
                var7_9[0] = var1_1;
                var1_1 = AFa1vSDK.registerClient;
                var8_10 = -113710151;
                var9_11 = var8_10;
                var9_11 = var1_1.get(var9_11);
                if (var9_11 != null) ** GOTO lbl38
                var9_11 = "";
                var10_12 = MotionEvent.axisFromString((String)var9_11) + 36;
                var11_13 = ViewConfiguration.getFadingEdgeLength() >> 16;
                var11_13 = 37 - var11_13;
                var12_14 = CdmaCellLocation.convertQuartSecToDecDegrees((int)0);
                var14_15 = 0.0;
                var16_16 = var12_14 == var14_15 ? 0 : (var12_14 > var14_15 ? 1 : -1);
                {
                    catch (Throwable var1_3) {}
                    {
                        var2_4 = var1_3.getCause();
                        if (var2_4 != null) {
                            throw var2_4;
                        }
                        throw var1_3;
                    }
                }
                var17_17 = (char)var16_16;
                var9_11 = AFa1vSDK.getRevenue(var10_12, var11_13, var17_17);
                var9_11 = (Class)var9_11;
                var18_18 = "getCurrencyIso4217Code";
                var19_19 = new Class[var6_8];
                var19_19[0] = var20_20 = Map.class;
                var19_19[var5_7] = var4_6 = String.class;
                var9_11 = var9_11.getMethod(var18_18, var19_19);
                var2_4 = var8_10;
                var1_1.put(var2_4, var9_11);
lbl38:
                // 2 sources

                var9_11 = (Method)var9_11;
                var1_1 = var9_11.invoke(null, var7_9);
                var1_1 = (byte[])var1_1;
                if (var1_1 != null) break block9;
                var1_1 = "AFFinalizer: failed to create bytes";
                ** try [egrp 3[TRYBLOCK] [20 : 221->241)] { 
lbl-1000:
                // 1 sources

                {
                    catch (Exception var1_2) {
                        break block10;
                    }
                }
lbl47:
                // 1 sources

                var4_6 = "failed to create bytes from proxyData";
                var2_4 = new IllegalArgumentException((String)var4_6);
                AFLogger.afErrorLogForExcManagerOnly((String)var1_1, (Throwable)var2_4);
                return null;
            }
            AFe1qSDK.copydefault = var8_10 = (AFe1qSDK.copy + 99) % 128;
            var4_6 = this.getMediationNetwork;
            var2_4 = new AFe1ySDK((AFd1qSDK)var4_6, (byte[])var1_1);
            var21_21 = AFe1qSDK.copy + 101;
            AFe1qSDK.copydefault = var3_5 = var21_21 % 128;
            if ((var21_21 %= var6_8) != 0) {
                return var2_4;
            }
            throw null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", var1_2);
        return null;
    }

    public final AFe1tSDK getCurrencyIso4217Code(String string2, String string3, UUID uUID, String string4) {
        Object[] objectArray = new Object[]{this, string2, string3, uUID, string4};
        int n3 = System.identityHashCode(this);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -15930200, 15930202, n3);
    }

    public final AFe1tSDK getCurrencyIso4217Code(String string2, Map map2, String string3, UUID uUID, String string4) {
        int n3;
        Object object = string3;
        Object object2 = null;
        boolean bl2 = true;
        int n4 = 2;
        Object object3 = ((Object)uUID).toString();
        Object object4 = new HashMap();
        ((HashMap)object4).put("ttl", "-1");
        ((HashMap)object4).put("uuid", object3);
        Object object5 = map2;
        ((HashMap)object4).put("data", map2);
        Object object6 = "meta";
        object5 = this.getRevenue();
        ((HashMap)object4).put(object6, object5);
        if (string3 != null) {
            int n7;
            n3 = copydefault + 5;
            copy = n7 = n3 % 128;
            object5 = "brand_domain";
            if ((n3 %= n4) == 0) {
                int n8;
                ((HashMap)object4).put(object5, string3);
                copydefault = n8 = (copy + 59) % 128;
            } else {
                ((HashMap)object4).put(object5, string3);
                throw null;
            }
        }
        object = AFa1mSDK.getMediationNetwork(object4).toString();
        HashMap<Object[], String> hashMap = new HashMap<Object[], String>();
        short s7 = (short)(ViewConfiguration.getTouchSlop() >> 8);
        long l2 = SystemClock.uptimeMillis();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        l4 = -67 - l4;
        n3 = View.resolveSizeAndState((int)0, (int)0, (int)0);
        int n10 = -864846193 - n3;
        int n14 = View.getDefaultSize((int)0, (int)0) + 1981934312;
        long l7 = ViewConfiguration.getZoomControlsTimeout() - l3;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        l8 = (byte)(1 - l8);
        object4 = new Object[bl2];
        AFe1qSDK.a(s7, (int)l4, n10, n14, (byte)l8, (Object[])object4);
        object4 = ((String)object4[0]).intern();
        object6 = new String[]{"POST", object};
        object5 = string4;
        object3 = AFe1qSDK.getRevenue(string4, (String)object3, object6);
        hashMap.put((Object[])object4, (String)object3);
        object4 = new StringBuilder();
        object6 = getRevenue;
        object5 = AppsFlyerLib.getInstance().getHostPrefix();
        String string5 = AFb1rSDK.getRevenue().getHostName();
        Object[] objectArray = new Object[n4];
        objectArray[0] = object5;
        objectArray[bl2] = string5;
        object2 = String.format((String)object6, objectArray);
        ((StringBuilder)object4).append((String)object2);
        ((StringBuilder)object4).append("/");
        object2 = string2;
        ((StringBuilder)object4).append(string2);
        object6 = object4.toString();
        object2 = Charset.defaultCharset();
        object5 = ((String)object).getBytes((Charset)object2);
        object4 = object3;
        object3 = new AFe1mSDK((String)object6, (byte[])object5, "POST", hashMap, false);
        object = new AFe1oSDK();
        object2 = this;
        return this.getMonetizationNetwork((AFe1mSDK)object3, (AFe1jSDK)object, bl2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final AFe1tSDK getCurrencyIso4217Code(boolean var1_1, boolean var2_2, String var3_3, int var4_4) {
        block8: {
            var4_4 = 3;
            var5_5 = 1;
            var6_6 = 4;
            var7_7 = 2;
            var8_8 = AFe1qSDK.copy + 29;
            AFe1qSDK.copydefault = var9_9 = var8_8 % 128;
            var10_10 = "";
            if ((var8_8 %= var7_7) != 0) break block8;
            var11_11 = this.component4;
            Intrinsics.checkNotNullParameter(var3_3, var10_10);
            var12_12 = 51 / 0;
            if (!var1_1) ** GOTO lbl-1000
            ** GOTO lbl-1000
        }
        var11_11 = this.component4;
        Intrinsics.checkNotNullParameter(var3_3, var10_10);
        if (var1_1) lbl-1000:
        // 2 sources

        {
            var1_1 = AFe1qSDK.copy + 27;
            AFe1qSDK.copydefault = var12_12 = var1_1 % 128;
            if (!(var1_1 %= var7_7)) {
                var13_13 = AFe1iSDK.AFAdRevenueData;
                var12_12 = 26 / 0;
            } else {
                var13_13 = AFe1iSDK.AFAdRevenueData;
            }
        } else lbl-1000:
        // 2 sources

        {
            var13_13 = AFe1iSDK.getMediationNetwork;
        }
        var12_12 = 0;
        var14_14 = null;
        if (!var2_2) ** GOTO lbl36
        var2_2 = AFe1qSDK.copydefault + 119;
        AFe1qSDK.copy = var15_15 = var2_2 % 128;
        if (!(var2_2 %= var7_7)) {
            var16_16 = "stg";
        } else {
            throw null;
lbl36:
            // 1 sources

            var16_16 = var10_10;
        }
        var17_17 = StringCompanionObject.INSTANCE;
        var15_15 = AFe1iSDK.getCurrencyIso4217Code();
        if (var15_15 == 0) ** GOTO lbl47
        var15_15 = AFe1qSDK.copy + 117;
        AFe1qSDK.copydefault = var18_18 = var15_15 % 128;
        if ((var15_15 %= var7_7) != 0) {
            var14_14 = (String)var11_11.getMonetizationNetwork.getValue();
        } else {
            var13_13 = (String)var11_11.getMonetizationNetwork.getValue();
            throw null;
lbl47:
            // 1 sources

            var14_14 = var10_10;
        }
        var11_11 = var11_11.AFAdRevenueData();
        var17_17 = new Object[var6_6];
        var17_17[0] = var14_14;
        var17_17[var5_5] = var16_16;
        var17_17[var7_7] = var11_11;
        var17_17[var4_4] = var3_3;
        var13_13 = xh2_0.a(var17_17, var6_6, (String)var13_13, var10_10);
        var16_16 = new AFe1mSDK((String)var13_13, "GET");
        var16_16.component3 = 1500;
        var13_13 = new AFe1pSDK();
        var3_3 = new Object[var4_4];
        var3_3[0] = this;
        var3_3[var5_5] = var16_16;
        var3_3[var7_7] = var13_13;
        var1_1 = System.identityHashCode(this);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(var3_3, -194014191, 194014192, (int)var1_1);
    }

    public final AFe1tSDK getMediationNetwork(String string2, String string3) {
        Object[] objectArray = new Object[]{this, string2, string3};
        int n3 = System.identityHashCode(this);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -465858035, 465858035, n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1tSDK getMediationNetwork(Map var1_1, String var2_4, String var3_5) {
        var4_6 = 1;
        var5_7 = 2;
        AFe1qSDK.copydefault = (AFe1qSDK.copy + 29) % 128;
        var6_8 = null;
        try {
            var7_9 /* !! */  = new Object[var5_7];
            var7_9 /* !! */ [var4_6] = var2_4;
            var7_9 /* !! */ [0] = var1_1;
            var1_1 = AFa1vSDK.registerClient;
            var8_10 = -113710151;
            var9_11 = var8_10;
            var9_11 = var1_1.get(var9_11);
            if (var9_11 == null) {
                var10_12 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 35;
                var11_13 = "";
                var12_14 = TextUtils.getOffsetAfter((CharSequence)var11_13, (int)0) + 37;
                var13_15 = ViewConfiguration.getScrollFriction();
                var14_16 = null;
                cfr_temp_0 = var13_15 - 0.0f;
                var15_17 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            }
            ** GOTO lbl44
        }
        catch (Throwable var1_2) {
            try {
                var2_4 = var1_2.getCause();
                if (var2_4 == null) throw var1_2;
                throw var2_4;
            }
            catch (Exception var1_3) {}
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", var1_3);
            return null;
        }
        var15_17 = (char)(1 - var15_17);
        {
            var9_11 = AFa1vSDK.getRevenue(var10_12, var12_14, (char)var15_17);
            var9_11 = (Class)var9_11;
            var11_13 = "getCurrencyIso4217Code";
            var16_18 = new Class[var5_7];
            var14_16 = Map.class;
            var16_18[0] = var14_16;
            var14_16 = String.class;
            var16_18[var4_6] = var14_16;
            var9_11 = var9_11.getMethod((String)var11_13, var16_18);
            var2_4 = var8_10;
            var1_1.put(var2_4, var9_11);
lbl44:
            // 2 sources

            var9_11 = (Method)var9_11;
            var11_13 = var1_1 = var9_11.invoke(null, var7_9 /* !! */ );
            var11_13 = (byte[])var1_1;
            var2_4 = this.getMediationNetwork;
            var1_1 = new AFj1jSDK((AFd1qSDK)var2_4);
        }
        if (var3_5 != null && (var8_10 = var3_5.length()) != 0 && (var8_10 = (int)(var2_4 = new Regex(var6_8 = "4.?(\\d+)?.?(\\d+)")).c((CharSequence)var3_5)) == 0 && (var8_10 = (int)(var2_4 = new Regex(var6_8 = "3.?(\\d+)?.?(\\d+)")).c((CharSequence)var3_5)) == 0) {
            AFe1qSDK.copydefault = (AFe1qSDK.copy + 77) % 128;
            var8_10 = 0;
            var2_4 = null;
        } else {
            var8_10 = 1;
        }
        if ((var8_10 ^= var4_6) != var4_6) {
            AFe1qSDK.copydefault = var8_10 = (AFe1qSDK.copy + 23) % 128;
            var2_4 = var1_1.AFAdRevenueData;
            var3_5 = "https://%sviap.%s/api/v1/android/validate_purchase?app_id=";
            var2_4 = var2_4.getMonetizationNetwork((String)var3_5);
        } else {
            var2_4 = var1_1.AFAdRevenueData;
            var3_5 = "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=";
            var2_4 = var2_4.getMonetizationNetwork((String)var3_5);
        }
        var2_4 = var1_1.getMediationNetwork((String)var2_4);
        var9_11 = var1_1.getRevenue((String)var2_4);
        var14_16 = Collections.emptyMap();
        var7_9 /* !! */  = var1_1;
        var1_1 = new AFe1mSDK((String)var9_11, (byte[])var11_13, "POST", (Map)var14_16, true);
        var2_4 = new AFe1oSDK();
        var3_5 = new Object[3];
        var3_5[0] = this;
        var3_5[var4_6] = var1_1;
        var3_5[var5_7] = var2_4;
        var17_19 = System.identityHashCode(this);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(var3_5, -194014191, 194014192, var17_19);
    }

    public final AFe1tSDK getMonetizationNetwork(String object) {
        Object[] objectArray;
        Map map2 = Collections.emptyMap();
        Object[] objectArray2 = objectArray;
        objectArray = new AFe1mSDK((String)object, null, "GET", map2, false);
        objectArray.component3 = 10000;
        objectArray.AFAdRevenueData = false;
        object = new AFe1oSDK();
        objectArray2 = new Object[]{this, objectArray, object};
        int n3 = System.identityHashCode(this);
        object = (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray2, -194014191, 194014192, n3);
        copydefault = (copy + 25) % 128;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1tSDK getMonetizationNetwork(Map object, String object2) {
        Class<String> clazz;
        Object object3;
        Object object4;
        Object object5;
        int n3 = 1;
        int n4 = 2;
        Object[] objectArray = null;
        try {
            object5 = new Object[n4];
            object5[n3] = object2;
            object5[0] = object;
            object = AFa1vSDK.registerClient;
            int n7 = -113710151;
            object4 = n7;
            object4 = object.get(object4);
            if (object4 == null) {
                long l2 = ViewConfiguration.getGlobalActionKeyTimeout();
                long l3 = 0L;
                long l4 = (l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) + 34;
                int n8 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0) + 37;
                char c2 = (char)(ViewConfiguration.getKeyRepeatDelay() >> 16);
                object4 = AFa1vSDK.getRevenue((int)l4, n8, c2);
                object4 = (Class)object4;
                object3 = "getCurrencyIso4217Code";
                Class[] classArray = new Class[n4];
                clazz = Map.class;
                classArray[0] = clazz;
                classArray[n3] = clazz = String.class;
                object4 = ((Class)object4).getMethod((String)object3, classArray);
                object2 = n7;
                object.put(object2, object4);
            }
            object4 = (Method)object4;
            object3 = object = ((Method)object4).invoke(null, (Object[])object5);
            object3 = (byte[])object;
            copydefault = (copy + 71) % 128;
            object2 = this.getMediationNetwork;
            object = new AFj1jSDK((AFd1qSDK)object2);
            object2 = ((AFj1jSDK)object).AFAdRevenueData.getMonetizationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=");
            object4 = ((AFj1jSDK)object).getMediationNetwork((String)object2);
        }
        catch (Throwable throwable) {
            Throwable throwable2;
            try {
                object2 = throwable.getCause();
                if (object2 == null) throw throwable;
                throw object2;
            }
            catch (Throwable throwable3) {
                throwable2 = throwable3;
            }
            object5 = AFLogger.INSTANCE;
            object4 = AFh1vSDK.v;
            ((AFh1uSDK)object5).e((AFh1vSDK)((Object)object4), "AFFinalizer: reflection init failed", throwable2, false, false);
            return null;
        }
        clazz = Collections.emptyMap();
        object5 = object;
        object = new AFe1mSDK((String)object4, (byte[])object3, "POST", (Map)((Object)clazz), true);
        object2 = new AFe1oSDK();
        objectArray = new Object[3];
        objectArray[0] = this;
        objectArray[n3] = object;
        objectArray[n4] = object2;
        int n10 = System.identityHashCode(this);
        object = (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -194014191, 194014192, n10);
        copy = (copydefault + 47) % 128;
        return object;
    }

    public final AFe1tSDK getRevenue(AFc1qSDK object) {
        int n3;
        AFe1mSDK aFe1mSDK;
        int n4 = 2;
        Object[] objectArray = AFa1mSDK.getMediationNetwork(((AFa1oSDK)object).getMonetizationNetwork()).toString();
        String string2 = ((AFa1oSDK)object).component4;
        Object object2 = Charset.defaultCharset();
        byte[] byArray = objectArray.getBytes((Charset)object2);
        Map map2 = Collections.emptyMap();
        boolean bl2 = ((AFa1oSDK)object).AFAdRevenueData();
        String string3 = "POST";
        object2 = aFe1mSDK;
        aFe1mSDK = new AFe1mSDK(string2, byArray, string3, map2, bl2);
        object = new AFc1jSDK();
        objectArray = new Object[3];
        objectArray[0] = this;
        objectArray[1] = aFe1mSDK;
        objectArray[n4] = object;
        int n7 = System.identityHashCode(this);
        int n8 = 194014192;
        object = (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -194014191, n8, n7);
        int n10 = copydefault + 105;
        copy = n3 = n10 % 128;
        if ((n10 %= n4) != 0) {
            n4 = 97 / 0;
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1tSDK getRevenue(Map var1_1, String var2_4, String var3_5) {
        var4_6 = 1;
        var5_7 = 2;
        var6_8 = null;
        try {
            var7_9 /* !! */  = new Object[var5_7];
            var7_9 /* !! */ [var4_6] = var2_4;
            var7_9 /* !! */ [0] = var1_1;
            var1_1 = AFa1vSDK.registerClient;
            var8_10 = -113710151;
            var9_11 = var8_10;
            var9_11 = var1_1.get(var9_11);
            if (var9_11 == null) {
                var10_12 = ExpandableListView.getPackedPositionForChild((int)0, (int)0);
                var12_13 = 0L;
                var14_14 = var10_12 == var12_13 ? 0 : (var10_12 < var12_13 ? -1 : 1);
                var15_15 = 34 - var14_14;
            }
            ** GOTO lbl41
        }
        catch (Throwable var1_2) {
            try {
                var2_4 = var1_2.getCause();
                if (var2_4 == null) throw var1_2;
                throw var2_4;
            }
            catch (Exception var1_3) {}
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", var1_3);
            return null;
        }
        {
            var16_16 = (byte)KeyEvent.getModifierMetaStateMask() + 38;
        }
        {
            var17_17 = (char)(ImageFormat.getBitsPerPixel((int)0) + var4_6);
        }
        {
            var9_11 = AFa1vSDK.getRevenue(var15_15, var16_16, var17_17);
            var9_11 = (Class)var9_11;
            var18_18 = "getCurrencyIso4217Code";
            var19_19 = new Class[var5_7];
            var20_20 = Map.class;
            var19_19[0] = var20_20;
            var20_20 = String.class;
            var19_19[var4_6] = var20_20;
            var9_11 = var9_11.getMethod((String)var18_18, var19_19);
            var2_4 = var8_10;
            var1_1.put(var2_4, var9_11);
lbl41:
            // 2 sources

            var9_11 = (Method)var9_11;
            var18_18 = var1_1 = var9_11.invoke(null, var7_9 /* !! */ );
            var18_18 = (byte[])var1_1;
            var2_4 = this.getMediationNetwork;
            var1_1 = new AFj1jSDK((AFd1qSDK)var2_4);
            if (var3_5 == null) ** GOTO lbl-1000
            AFe1qSDK.copy = (AFe1qSDK.copydefault + 25) % 128;
            var8_10 = var3_5.length();
            if (var8_10 == 0) ** GOTO lbl-1000
            AFe1qSDK.copy = (AFe1qSDK.copydefault + 103) % 128;
        }
        var6_8 = "4.?(\\d+)?.?(\\d+)";
        var2_4 = new Regex(var6_8);
        var8_10 = (int)var2_4.c((CharSequence)var3_5);
        if (var8_10 == 0 && (var8_10 = (int)(var2_4 = new Regex(var6_8 = "3.?(\\d+)?.?(\\d+)")).c((CharSequence)var3_5)) == 0) {
            var2_4 = var1_1.AFAdRevenueData;
            var3_5 = "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=";
            var2_4 = var2_4.getMonetizationNetwork((String)var3_5);
        } else lbl-1000:
        // 3 sources

        {
            AFe1qSDK.copy = var8_10 = (AFe1qSDK.copydefault + 105) % 128;
            var2_4 = var1_1.AFAdRevenueData;
            var3_5 = "https://%sars.%s/api/v2/android/validate_subscription?app_id=";
            var2_4 = var2_4.getMonetizationNetwork((String)var3_5);
        }
        var2_4 = var1_1.getMediationNetwork((String)var2_4);
        var9_11 = var1_1.getRevenue((String)var2_4);
        var20_20 = Collections.emptyMap();
        var7_9 /* !! */  = var1_1;
        var1_1 = new AFe1mSDK((String)var9_11, (byte[])var18_18, "POST", (Map)var20_20, true);
        var2_4 = new AFe1oSDK();
        var3_5 = new Object[3];
        var3_5[0] = this;
        var3_5[var4_6] = var1_1;
        var3_5[var5_7] = var2_4;
        var21_21 = System.identityHashCode(this);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(var3_5, -194014191, 194014192, var21_21);
    }
}

