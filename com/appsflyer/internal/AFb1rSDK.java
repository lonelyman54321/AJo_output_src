/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  android.graphics.Color
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFLogger;
import com.appsflyer.AFLogger$LogLevel;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.AppsFlyerProperties$EmailsCryptType;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.PurchaseHandler$PurchaseValidationCallback;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult$Error;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFa1mSDK;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1rSDK$4;
import com.appsflyer.internal.AFb1rSDK$5;
import com.appsflyer.internal.AFb1rSDK$AFa1tSDK;
import com.appsflyer.internal.AFb1rSDK$AFa1vSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFc1cSDK;
import com.appsflyer.internal.AFc1fSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1sSDK;
import com.appsflyer.internal.AFc1tSDK;
import com.appsflyer.internal.AFd1eSDK$AFa1vSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1hSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFf1aSDK;
import com.appsflyer.internal.AFf1bSDK;
import com.appsflyer.internal.AFf1jSDK;
import com.appsflyer.internal.AFf1mSDK;
import com.appsflyer.internal.AFf1nSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.appsflyer.internal.AFf1qSDK;
import com.appsflyer.internal.AFf1rSDK;
import com.appsflyer.internal.AFg1gSDK;
import com.appsflyer.internal.AFg1hSDK;
import com.appsflyer.internal.AFg1jSDK;
import com.appsflyer.internal.AFg1mSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFg1xSDK;
import com.appsflyer.internal.AFh1eSDK;
import com.appsflyer.internal.AFh1iSDK;
import com.appsflyer.internal.AFh1jSDK;
import com.appsflyer.internal.AFh1lSDK;
import com.appsflyer.internal.AFh1mSDK;
import com.appsflyer.internal.AFh1nSDK;
import com.appsflyer.internal.AFh1oSDK;
import com.appsflyer.internal.AFh1qSDK;
import com.appsflyer.internal.AFh1sSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.AFi1jSDK;
import com.appsflyer.internal.AFi1lSDK;
import com.appsflyer.internal.AFi1mSDK;
import com.appsflyer.internal.AFi1qSDK;
import com.appsflyer.internal.AFi1sSDK;
import com.appsflyer.internal.AFj1bSDK;
import com.appsflyer.internal.AFj1cSDK;
import com.appsflyer.internal.AFj1iSDK;
import com.appsflyer.internal.AFj1jSDK;
import com.appsflyer.internal.AFj1lSDK;
import com.appsflyer.internal.AFj1pSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.AFj1uSDK;
import com.appsflyer.internal.AFj1ySDK;
import com.appsflyer.internal.AFj1zSDK;
import com.appsflyer.internal.AFk1nSDK;
import com.appsflyer.internal.a_0;
import com.appsflyer.internal.b_0;
import com.appsflyer.internal.c_0;
import com.appsflyer.internal.d_0;
import com.appsflyer.internal.e_0;
import com.appsflyer.internal.f_0;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1rSDK
extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static char[] AFInAppEventParameterName;
    private static boolean AFInAppEventType = false;
    private static AFb1rSDK component3;
    private static int e = 1;
    static final String getCurrencyIso4217Code;
    static AppsFlyerInAppPurchaseValidatorListener getMediationNetwork;
    public static final String getRevenue;
    private static int registerClient;
    private static boolean valueOf;
    private static int values;
    private AFg1xSDK AFKeystoreWrapper;
    long areAllFieldsValid;
    private long component1;
    boolean component2;
    Application component4;
    private Map copy;
    private long copydefault;
    private boolean equals;
    public volatile AppsFlyerConversionListener getMonetizationNetwork = null;
    private SharedPreferences hashCode;
    private final AFd1oSDK toString;

    static {
        int n3;
        AFb1rSDK.areAllFieldsValid();
        getCurrencyIso4217Code = "331";
        Object object = "6.15";
        AFAdRevenueData = object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append("/androidevent?buildnumber=6.15.2&app_id=");
        getRevenue = ((Object)stringBuilder).toString();
        getMediationNetwork = null;
        component3 = object = new AFb1rSDK();
        int n4 = registerClient + 113;
        e = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            n4 = 41 / 0;
        }
    }

    public AFb1rSDK() {
        long l2;
        this.component1 = l2 = (long)-1;
        this.areAllFieldsValid = l2;
        this.copydefault = l2 = TimeUnit.SECONDS.toMillis(5);
        this.component2 = false;
        AFVersionDeclaration.init();
        Object object = new AFd1oSDK();
        this.toString = object;
        this.getMonetizationNetwork().i().getMediationNetwork();
        this.getMonetizationNetwork().i().AFAdRevenueData();
        object = this.getMonetizationNetwork().copy();
        AFb1rSDK$AFa1vSDK aFb1rSDK$AFa1vSDK = new AFb1rSDK$AFa1vSDK(this);
        ((AFe1aSDK)object).getRevenue.add(aFb1rSDK$AFa1vSDK);
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] object) {
        int n3;
        AFc1kSDK aFc1kSDK = null;
        Object object2 = (AFb1rSDK)object[0];
        int n4 = 1;
        String string2 = (String)object[n4];
        int n7 = 2;
        object = (Map)object[n7];
        int n8 = e + 119;
        registerClient = n3 = n8 % 128;
        if ((n8 %= n7) != 0) {
            object2 = ((AFb1rSDK)object2).getMonetizationNetwork().d();
            ((AFc1kSDK)object2).getMediationNetwork = string2;
            ((AFc1kSDK)object2).getCurrencyIso4217Code = object;
            n4 /= 0;
        } else {
            aFc1kSDK = ((AFb1rSDK)object2).getMonetizationNetwork().d();
            aFc1kSDK.getMediationNetwork = string2;
            aFc1kSDK.getCurrencyIso4217Code = object;
        }
        return null;
    }

    private String AFAdRevenueData(Context context, String string2) {
        int n3 = 2;
        if (context == null) {
            int n4;
            e = n4 = (registerClient + 65) % 128;
            registerClient = (n4 += 51) % 128;
            string2 = null;
            if ((n4 %= n3) == 0) {
                return null;
            }
            throw null;
        }
        Object[] objectArray = new Object[n3];
        objectArray[0] = this;
        objectArray[1] = context;
        int n7 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -608775197, 608775214, n7);
        return this.getMonetizationNetwork().getMediationNetwork().getRevenue(string2);
    }

    private static void AFAdRevenueData(AFa1oSDK aFa1oSDK, AFh1mSDK object) {
        if (object != null) {
            String string2;
            int n3;
            registerClient = n3 = (e + 17) % 128;
            aFa1oSDK.AFAdRevenueData = string2 = ((AFh1mSDK)object).getRevenue;
            aFa1oSDK.component3 = object = ((AFh1mSDK)object).getMonetizationNetwork;
            e = n3 = (n3 + 115) % 128;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void AFAdRevenueData(String string2) {
        JSONException jSONException2;
        block5: {
            block4: {
                Object object;
                try {
                    object = new JSONObject(string2);
                    String string3 = "pid";
                    int n3 = object.has(string3);
                    if (n3 == 0) break block4;
                    e = n3 = (registerClient + 117) % 128;
                    object = "preInstallName";
                }
                catch (JSONException jSONException2) {
                    break block5;
                }
                {
                    AFb1rSDK.getMediationNetwork((String)object, string2);
                    e = (registerClient + 65) % 128;
                    return;
                }
            }
            string2 = "Cannot set preinstall attribution data without a media source";
            {
                AFLogger.afWarnLog(string2);
                return;
            }
        }
        AFLogger.afErrorLog("Error parsing JSON for preinstall", jSONException2);
    }

    private static void AFAdRevenueData(String string2, boolean bl2) {
        e = (registerClient + 57) % 128;
        AppsFlyerProperties.getInstance().set(string2, bl2);
        e = (registerClient + 11) % 128;
    }

    public static /* synthetic */ void a(AFd1kSDK aFd1kSDK) {
        AFb1rSDK.getRevenue(aFd1kSDK);
    }

    private static void a(String object, String object2, int[] nArray, int n3, Object[] objectArray) {
        int n4;
        int n7;
        Object object3;
        int n8;
        $10 = n8 = ($11 + 61) % 128;
        if (object2 != null) {
            object3 = "ISO-8859-1";
            object2 = ((String)object2).getBytes((String)object3);
        }
        object2 = (byte[])object2;
        if (object != null) {
            $11 = n8 = ($10 + 109) % 128;
            object = ((String)object).toCharArray();
        }
        object = (char[])object;
        object3 = new AFk1nSDK();
        char[] cArray = AFInAppEventParameterName;
        long l2 = 358767465314578885L;
        if (cArray != null) {
            n7 = cArray.length;
            char[] cArray2 = new char[n7];
            $10 = ($11 + 47) % 128;
            for (int i3 = 0; i3 < n7; ++i3) {
                char c2;
                $11 = ($10 + 29) % 128;
                long l3 = (long)cArray[i3] ^ l2;
                int n10 = (int)l3;
                cArray2[i3] = c2 = (char)n10;
            }
            cArray = cArray2;
        }
        n7 = values;
        long l4 = n7;
        int n14 = (int)(l2 ^= l4);
        Object object4 = AFInAppEventType;
        if (object4 != 0) {
            int n15;
            int n16;
            $10 = ($11 + 71) % 128;
            ((AFk1nSDK)object3).AFAdRevenueData = n16 = ((Object)object2).length;
            object = new char[n16];
            ((AFk1nSDK)object3).getRevenue = 0;
            while ((n15 = ((AFk1nSDK)object3).getRevenue) < (object4 = ((AFk1nSDK)object3).AFAdRevenueData)) {
                object4 = object4 + -1 - n15;
                object4 = object2[object4] + n3;
                object4 = (char)(cArray[object4] - n14);
                object[n15] = object4;
                ((AFk1nSDK)object3).getRevenue = ++n15;
            }
            objectArray[0] = object2 = new String((char[])object);
            return;
        }
        int n17 = valueOf;
        if (n17 != 0) {
            int n18;
            $10 = ($11 + 13) % 128;
            ((AFk1nSDK)object3).AFAdRevenueData = n17 = ((Object)object).length;
            object2 = new char[n17];
            ((AFk1nSDK)object3).getRevenue = 0;
            while ((n18 = ((AFk1nSDK)object3).getRevenue) < (object4 = ((AFk1nSDK)object3).AFAdRevenueData)) {
                object4 = object4 + -1 - n18;
                object4 = object[object4] - n3;
                object4 = (char)(cArray[object4] - n14);
                object2[n18] = object4;
                ((AFk1nSDK)object3).getRevenue = ++n18;
            }
            objectArray[0] = object = new String((char[])object2);
            return;
        }
        ((AFk1nSDK)object3).AFAdRevenueData = n4 = nArray.length;
        object = new char[n4];
        ((AFk1nSDK)object3).getRevenue = 0;
        while ((n17 = ((AFk1nSDK)object3).getRevenue) < (object4 = ((AFk1nSDK)object3).AFAdRevenueData)) {
            object4 = object4 + -1 - n17;
            object4 = nArray[object4] - n3;
            object4 = (char)(cArray[object4] - n14);
            object[n17] = object4;
            ((AFk1nSDK)object3).getRevenue = ++n17;
        }
        objectArray[0] = object2 = new String((char[])object);
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] object) {
        AFe1aSDK aFe1aSDK = null;
        object = (AFb1rSDK)object[0];
        e = (registerClient + 101) % 128;
        int n3 = AFf1mSDK.component4();
        if (n3 != 0) {
            return null;
        }
        object = ((AFb1rSDK)object).getMonetizationNetwork();
        aFe1aSDK = object.copy();
        AFf1mSDK aFf1mSDK = new AFf1mSDK((AFd1kSDK)object);
        object = aFe1aSDK.AFAdRevenueData;
        AFe1aSDK$2 aFe1aSDK$2 = new AFe1aSDK$2(aFe1aSDK, aFf1mSDK);
        object.execute(aFe1aSDK$2);
        int n4 = e + 113;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return null;
        }
        throw null;
    }

    public static void areAllFieldsValid() {
        boolean bl2;
        char[] cArray;
        char[] cArray2 = cArray = new char[9];
        char[] cArray3 = cArray;
        cArray2[0] = 61619;
        cArray3[1] = 61630;
        cArray2[2] = 61617;
        cArray3[3] = 61516;
        cArray2[4] = 61627;
        cArray3[5] = 61511;
        cArray2[6] = 61631;
        cArray3[7] = 61517;
        cArray3[8] = 61504;
        AFInAppEventParameterName = cArray;
        values = -552931120;
        valueOf = bl2 = true;
        AFInAppEventType = bl2;
    }

    public static /* synthetic */ void b(AFb1rSDK aFb1rSDK, AFf1bSDK aFf1bSDK) {
        aFb1rSDK.getCurrencyIso4217Code(aFf1bSDK);
    }

    public static /* synthetic */ void c(AFb1rSDK aFb1rSDK) {
        aFb1rSDK.copy();
    }

    private static /* synthetic */ Object component1(Object[] objectArray) {
        int n3;
        AFb1rSDK aFb1rSDK = (AFb1rSDK)objectArray[0];
        objectArray = (String[])objectArray[1];
        e = n3 = (registerClient + 121) % 128;
        String string2 = Arrays.toString(objectArray);
        String string3 = "setOneLinkCustomDomain ";
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        AFLogger.afDebugLog(string2);
        aFb1rSDK.getMonetizationNetwork().d().component1 = objectArray;
        int n4 = registerClient + 121;
        e = n4 % 128;
        aFb1rSDK = null;
        if ((n4 %= 2) != 0) {
            return null;
        }
        throw null;
    }

    private void component1() {
        int n3;
        int n4 = e + 119;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            ExecutorService executorService = this.getMonetizationNetwork().getMonetizationNetwork();
            rx1_0 rx1_02 = new rx1_0(this, 3);
            executorService.execute(rx1_02);
            return;
        }
        ExecutorService executorService = this.getMonetizationNetwork().getMonetizationNetwork();
        rx1_0 rx1_03 = new rx1_0(this, 3);
        executorService.execute(rx1_03);
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] object) {
        int n3;
        Object object2 = (AFb1rSDK)object[0];
        boolean bl2 = true;
        Boolean bl3 = (Boolean)object[bl2];
        boolean bl4 = bl3;
        int n4 = 2;
        object = (Context)object[n4];
        Object object3 = new Object[n4];
        object3[0] = object2;
        object3[bl2] = object;
        int n7 = System.identityHashCode(object2);
        int n8 = -608775197;
        int n10 = 608775214;
        AFb1rSDK.getCurrencyIso4217Code(object3, n8, n10, n7);
        object = ((AFb1rSDK)object2).getMonetizationNetwork();
        object.AFKeystoreWrapper().getCurrencyIso4217Code(bl4);
        object2 = object.getMonetizationNetwork();
        object3 = new e_0(object, 0);
        object2.submit((Runnable)object3);
        if (bl4 == bl2) {
            registerClient = n3 = (e + 21) % 128;
            object = object.getRevenue();
            object2 = "is_stop_tracking_used";
            object.getRevenue((String)object2, bl2);
        }
        n7 = registerClient + 15;
        e = n7 % 128;
        n3 = 0;
        object2 = null;
        if ((n7 %= n4) == 0) {
            n7 = 18 / 0;
        }
        return null;
    }

    private static void component2(Context context) {
        Object[] objectArray = new Object[]{context};
        int n3 = (int)System.currentTimeMillis();
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 2054602482, -2054602479, n3);
    }

    private AFj1sSDK[] component2() {
        int n3;
        int n4 = registerClient + 13;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return this.getMonetizationNetwork().equals().getCurrencyIso4217Code();
        }
        this.getMonetizationNetwork().equals().getCurrencyIso4217Code();
        throw null;
    }

    private AFh1mSDK component3(Context context) {
        e = (registerClient + 81) % 128;
        boolean bl2 = context instanceof Activity;
        if (bl2) {
            int n3;
            context = (Activity)context;
            AFi1mSDK aFi1mSDK = this.getMonetizationNetwork().AFLogger();
            AFh1mSDK aFh1mSDK = new AFh1mSDK((Activity)context, aFi1mSDK);
            int n4 = registerClient + 125;
            e = n3 = n4 % 128;
            if ((n4 %= 2) != 0) {
                return aFh1mSDK;
            }
            throw null;
        }
        return null;
    }

    private static /* synthetic */ Object component3(Object[] object) {
        int n3;
        String string2 = null;
        AFb1rSDK aFb1rSDK = (AFb1rSDK)object[0];
        int n4 = 1;
        Object object2 = (String)object[n4];
        int n7 = 2;
        object = (Context)object[n7];
        registerClient = n3 = (e + 93) % 128;
        if (object != null) {
            e = (n3 + 81) % 128;
            n3 = (int)(aFb1rSDK.AFAdRevenueData() ? 1 : 0);
            if (n3 != 0) {
                aFb1rSDK.setCustomerUserId((String)object2);
                String string3 = "CustomerUserId set: ";
                Object object3 = new StringBuilder(string3);
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(object3.toString(), n4 != 0);
                object2 = AppsFlyerProperties.getInstance();
                object3 = aFb1rSDK.getMonetizationNetwork().getRevenue();
                object2 = ((AppsFlyerProperties)object2).getReferrer((AFd1rSDK)object3);
                object3 = AFh1qSDK.getRevenue;
                aFb1rSDK.getCurrencyIso4217Code((Context)object, (AFh1qSDK)((Object)object3));
                object3 = aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper();
                Object object4 = new Object[n4];
                object4[0] = object3;
                n3 = System.identityHashCode(object3);
                int n8 = -1684451992;
                int n10 = 1684451992;
                object4 = (String)AFg1wSDK.getCurrencyIso4217Code((Object[])object4, n8, n10, n3);
                if (object2 == null) {
                    int n14;
                    n4 = registerClient + 103;
                    e = n14 = n4 % 128;
                    if ((n4 %= n7) != 0) {
                        object2 = "";
                    } else {
                        throw null;
                    }
                }
                if ((n4 = object instanceof Activity) != 0) {
                    n4 = registerClient + 95;
                    e = n3 = n4 % 128;
                    if ((n4 %= n7) == 0) {
                        object4 = object;
                        object4 = (Activity)object;
                        object4.getIntent();
                        n4 = 16 / 0;
                    } else {
                        string2 = object;
                        string2 = (Activity)object;
                        string2.getIntent();
                    }
                }
                aFb1rSDK.getMonetizationNetwork((Context)object, (String)object2);
                return null;
            }
            aFb1rSDK.setCustomerUserId((String)object2);
            object = String.valueOf(object2);
            string2 = "waitForCustomerUserId is false; setting CustomerUserID: ";
            object = string2.concat((String)object);
            AFLogger.afInfoLog((String)object, n4 != 0);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean component3() {
        Object object;
        int n3;
        String string2;
        String string3;
        Object object2;
        Object object3;
        Locale locale;
        long l2;
        int n4;
        int n7;
        int n8;
        block6: {
            block8: {
                block7: {
                    n8 = 1;
                    n7 = 2;
                    registerClient = n4 = (e + 9) % 128;
                    l2 = this.component1;
                    long l3 = 0L;
                    long l4 = l2 - l3;
                    Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object4 <= 0) {
                        n8 = this.isStopped();
                        if (n8 != 0) return false;
                        String string4 = "Sending first launch for this session!";
                        AFLogger.afInfoLog(string4);
                        return false;
                    }
                    l2 = System.currentTimeMillis();
                    l3 = this.component1;
                    l2 -= l3;
                    locale = Locale.US;
                    object3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
                    long l7 = this.component1;
                    object2 = l7;
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = object3;
                    objectArray[n8] = object2;
                    long l8 = System.currentTimeMillis();
                    int n10 = (int)l8;
                    int n14 = 1382084704;
                    int n15 = -1382084693;
                    object2 = (String)AFb1rSDK.getCurrencyIso4217Code(objectArray, n14, n15, n10);
                    long l12 = this.areAllFieldsValid;
                    Long l14 = l12;
                    Object[] objectArray2 = new Object[n7];
                    objectArray2[0] = object3;
                    objectArray2[n8] = l14;
                    long l15 = System.currentTimeMillis();
                    int n16 = (int)l15;
                    object3 = (String)AFb1rSDK.getCurrencyIso4217Code(objectArray2, n14, n15, n16);
                    long l16 = this.copydefault;
                    string3 = ";\nLast successful Launch event: ";
                    string2 = "Last Launch attempt: ";
                    Object object5 = l2 == l16 ? 0 : (l2 < l16 ? -1 : 1);
                    if (object5 >= 0) break block6;
                    n3 = registerClient + 31;
                    e = n14 = n3 % 128;
                    if ((n3 %= n7) != 0) break block7;
                    n3 = (int)(this.isStopped() ? 1 : 0);
                    n14 = 95 / 0;
                    if (n3 != 0) break block6;
                    break block8;
                }
                n3 = (int)(this.isStopped() ? 1 : 0);
                if (n3 != 0) break block6;
            }
            long l17 = this.copydefault;
            object3 = og_1.a(string2, (String)object2, string3, (String)object3, ";\nThis launch is blocked: ");
            ((StringBuilder)object3).append(l2);
            ((StringBuilder)object3).append(" ms < ");
            ((StringBuilder)object3).append(l17);
            ((StringBuilder)object3).append(" ms");
            AFLogger.afInfoLog(((StringBuilder)object3).toString());
            return n8 != 0;
        }
        if ((n8 = (int)(this.isStopped() ? 1 : 0)) != 0) return false;
        n8 = registerClient + 117;
        e = n3 = n8 % 128;
        if ((n8 %= n7) == 0) {
            object = new Object[n7];
            object[0] = object2;
            object[0] = object3;
            Object object6 = l2;
            n4 = 3;
            object[n4] = object6;
            object6 = "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)";
            object = String.format(locale, (String)object6, (Object[])object);
        } else {
            object = og_1.a(string2, (String)object2, string3, (String)object3, ";\nSending launch (+");
            ((StringBuilder)object).append(l2);
            String string5 = " ms)";
            ((StringBuilder)object).append(string5);
            object = ((StringBuilder)object).toString();
        }
        AFLogger.afInfoLog((String)object);
        return false;
    }

    private static /* synthetic */ Object component4(Object[] context) {
        int n3;
        AFb1rSDK aFb1rSDK = (AFb1rSDK)context[0];
        context = (Context)context[1];
        e = (registerClient + 63) % 128;
        aFb1rSDK.start(context, null);
        int n4 = registerClient + 93;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object copy(Object[] object) {
        block7: {
            String string2;
            Object object2;
            block8: {
                int n3;
                CharSequence charSequence;
                int n4;
                block10: {
                    block9: {
                        int n7;
                        int n8;
                        n4 = 0;
                        charSequence = null;
                        object2 = (AFb1rSDK)object[0];
                        int n10 = 1;
                        string2 = (String)object[n10];
                        n3 = 2;
                        object = (Map)object[n3];
                        object2 = ((AFb1rSDK)object2).getMonetizationNetwork().e();
                        AFc1aSDK aFc1aSDK = ((AFd1tSDK)object2).getMonetizationNetwork;
                        if (aFc1aSDK == null) {
                            ((AFd1tSDK)object2).getMonetizationNetwork = aFc1aSDK = new AFc1aSDK();
                        }
                        object2 = ((AFd1tSDK)object2).getMonetizationNetwork;
                        aFc1aSDK = null;
                        if (string2 == null || (n8 = string2.isEmpty()) != 0) break block7;
                        if (object == null) break block8;
                        n8 = e + 31;
                        registerClient = n7 = n8 % 128;
                        if ((n8 %= n3) == 0) break block9;
                        n3 = (int)(object.isEmpty() ? 1 : 0);
                        n8 = 51 / 0;
                        if (n3 == 0) break block10;
                        break block8;
                    }
                    n4 = object.isEmpty();
                    if (n4 != 0) break block8;
                }
                charSequence = new StringBuilder("Setting partner data for ");
                ((StringBuilder)charSequence).append(string2);
                String string3 = ": ";
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(object);
                AFLogger.afDebugLog(((Object)charSequence).toString());
                charSequence = new JSONObject((Map)object);
                charSequence = charSequence.toString();
                n4 = ((String)charSequence).length();
                n3 = 1000;
                if (n4 > n3) {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    object = new HashMap();
                    charSequence = String.valueOf(n4);
                    charSequence = "limit exceeded: ".concat((String)charSequence);
                    ((HashMap)object).put("error", charSequence);
                    ((AFc1aSDK)object2).getRevenue.put(string2, object);
                    return null;
                }
                ((AFc1aSDK)object2).getCurrencyIso4217Code.put(string2, object);
                ((AFc1aSDK)object2).getRevenue.remove(string2);
                return null;
            }
            if ((object = ((AFc1aSDK)object2).getCurrencyIso4217Code.remove(string2)) == null) {
                int n14;
                registerClient = n14 = (e + 125) % 128;
                object = "Partner data is missing or `null`";
            } else {
                object = "Cleared partner data for ".concat(string2);
            }
            AFLogger.afWarnLog((String)object);
            return null;
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
        return null;
    }

    private /* synthetic */ void copy() {
        AFi1jSDK aFi1jSDK = this.getMonetizationNetwork().force();
        if (aFi1jSDK != null) {
            e = (registerClient + 83) % 128;
            int n3 = aFi1jSDK.AFAdRevenueData();
            if (n3 != 0) {
                e = n3 = (registerClient + 97) % 128;
                f_0 f_02 = new f_0(this, aFi1jSDK);
                aFi1jSDK.getCurrencyIso4217Code(f_02);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object copydefault(Object[] object) {
        Exception exception2;
        Object object2;
        block4: {
            AFb1rSDK aFb1rSDK;
            int n3;
            block3: {
                AppsFlyerProperties appsFlyerProperties;
                int n4;
                n3 = 0;
                object2 = null;
                aFb1rSDK = (AFb1rSDK)object[0];
                boolean bl2 = true;
                object = (Map)object[bl2];
                registerClient = (e + 39) % 128;
                AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
                int n7 = appsFlyerProperties2.getBoolean("collectAndroidIdForceByUser", false);
                if (n7 != 0) return null;
                n7 = e + 11;
                registerClient = n4 = n7 % 128;
                String string2 = "collectIMEIForceByUser";
                if ((n7 %= 2) != 0 ? (n3 = ((AppsFlyerProperties)(object2 = AppsFlyerProperties.getInstance())).getBoolean(string2, bl2)) != 0 : (n3 = (appsFlyerProperties = AppsFlyerProperties.getInstance()).getBoolean(string2, false)) != 0) {
                    return null;
                }
                registerClient = n3 = (e + 125) % 128;
                object2 = object.get("advertiserId");
                if (object2 == null) return null;
                try {
                    object2 = aFb1rSDK.getMonetizationNetwork();
                    object2 = object2.e();
                    object2 = ((AFd1tSDK)object2).getRevenue;
                    n3 = (int)(AFc1sSDK.getRevenue((String)object2) ? 1 : 0);
                    if (n3 == 0) break block3;
                    object2 = "android_id";
                    if ((object2 = object.remove(object2)) == null) break block3;
                    object2 = "validateGaidAndIMEI :: removing: android_id";
                    AFLogger.afInfoLog((String)object2);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object2 = aFb1rSDK.getMonetizationNetwork();
            object2 = object2.AFKeystoreWrapper();
            n3 = (int)(AFc1sSDK.getRevenue((String)(object2 = ((AFg1wSDK)object2).getRevenue())) ? 1 : 0);
            if (n3 == 0) return null;
            object2 = "imei";
            if ((object = object.remove(object2)) == null) return null;
            object = "validateGaidAndIMEI :: removing: imei";
            AFLogger.afInfoLog((String)object);
            return null;
        }
        object2 = "failed to remove IMEI or AndroidID key from params; ";
        AFLogger.afErrorLog((String)object2, exception2);
        return null;
    }

    private /* synthetic */ void copydefault() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -927250196, 927250219, n3);
    }

    public static /* synthetic */ void d(AFb1rSDK aFb1rSDK, AFi1jSDK aFi1jSDK) {
        aFb1rSDK.getMediationNetwork(aFi1jSDK);
    }

    public static /* synthetic */ void e(AFb1rSDK aFb1rSDK, boolean bl2) {
        aFb1rSDK.getCurrencyIso4217Code(bl2);
    }

    private static /* synthetic */ Object equals(Object[] object) {
        int n3;
        int n4 = 0;
        AFb1rSDK aFb1rSDK = (AFb1rSDK)object[0];
        int n7 = 1;
        Context context = (Context)object[n7];
        int n8 = 2;
        String string2 = (String)object[n8];
        object = (Map)object[3];
        int n10 = registerClient + 105;
        e = n10 % 128;
        if ((n10 %= n8) == 0) {
            aFb1rSDK.logEvent(context, string2, (Map)object, null);
            n3 = 52 / 0;
        } else {
            aFb1rSDK.logEvent(context, string2, (Map)object, null);
        }
        n3 = registerClient + 21;
        e = n4 = n3 % 128;
        if ((n3 %= n8) != 0) {
            return null;
        }
        throw null;
    }

    private static void equals() {
        e = (registerClient + 119) % 128;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getCurrencyIso4217Code;
        aFLogger.w(aFh1vSDK, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        e = (registerClient + 21) % 128;
    }

    public static /* synthetic */ void f(AFb1rSDK aFb1rSDK, Context context, Intent intent) {
        aFb1rSDK.i_(context, intent);
    }

    public static /* synthetic */ void g(AFb1rSDK aFb1rSDK) {
        aFb1rSDK.copydefault();
    }

    private static int getCurrencyIso4217Code(AFd1rSDK aFd1rSDK, boolean bl2) {
        int n3;
        int n4 = registerClient + 43;
        e = n3 = n4 % 128;
        String string2 = "appsFlyerInAppEventCount";
        if ((n4 %= 2) != 0) {
            int n7 = AFb1rSDK.getRevenue(aFd1rSDK, string2, bl2);
            registerClient = (e + 97) % 128;
            return n7;
        }
        AFb1rSDK.getRevenue(aFd1rSDK, string2, bl2);
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] object) {
        int n3;
        AFb1rSDK aFb1rSDK = (AFb1rSDK)object[0];
        object = (String)object[1];
        registerClient = n3 = (e + 13) % 128;
        AFb1cSDK aFb1cSDK = aFb1rSDK.getMonetizationNetwork().copydefault();
        String string2 = "setAndroidIdData";
        String[] stringArray = new String[]{object};
        aFb1cSDK.getMediationNetwork(string2, stringArray);
        aFb1rSDK.getMonetizationNetwork().e().getRevenue = object;
        int n4 = e + 9;
        registerClient = n4 % 128;
        aFb1rSDK = null;
        if ((n4 %= 2) != 0) {
            n4 = 16 / 0;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objectArray, int n3, int n4, int n7) {
        int n8;
        int n10;
        int n14;
        int n15 = n14 * -716;
        int n16 = n10 * 1435 + n15;
        n15 = ~n14;
        int n17 = (n10 | n15) * -1434 + n16;
        n16 = ~n8;
        int n18 = ~(n16 | n10);
        n14 = ~(n14 | n10);
        n18 |= n14;
        int n19 = ~n10;
        n15 |= n19;
        n19 = ~(n15 | n8);
        n18 = (n18 | n19) * 717 + n17;
        n15 = ~(n15 | n16);
        n14 |= n15;
        n10 = ~(n10 | n8);
        n14 = (n14 | n10) * 717 + n18;
        n10 = 2;
        n8 = 0;
        Object object = null;
        n15 = 1;
        n16 = 0;
        Object object2 = null;
        switch (n14) {
            default: {
                String string2 = (String)objectArray[0];
                n14 = e + 35;
                registerClient = n15 = n14 % 128;
                n14 %= n10;
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                boolean bl2 = appsFlyerProperties.getBoolean(string2, false);
                e = n14 = (registerClient + 109) % 128;
                return bl2;
            }
            case 23: {
                int n20;
                AFb1rSDK aFb1rSDK = (AFb1rSDK)objectArray[0];
                AFh1lSDK aFh1lSDK = new AFh1lSDK();
                aFb1rSDK.getRevenue(aFh1lSDK);
                registerClient = n20 = (e + 17) % 128;
                return object2;
            }
            case 22: {
                Object object3;
                AFb1rSDK aFb1rSDK = (AFb1rSDK)objectArray[0];
                AFa1oSDK aFa1oSDK = (AFa1oSDK)objectArray[n15];
                e = n17 = (registerClient + 31) % 128;
                String string3 = aFa1oSDK.areAllFieldsValid;
                if (string3 == null) {
                    n8 = 1;
                }
                if ((n17 = aFb1rSDK.AFAdRevenueData() ^ n15) != n15) {
                    String string4 = "CustomerUserId not set, reporting is disabled";
                    AFLogger.afInfoLog(string4, n15 != 0);
                    return object2;
                }
                if (n8 != 0) {
                    long l2;
                    n8 = e + 73;
                    registerClient = n17 = n8 % 128;
                    object3 = "launchProtectEnabled";
                    if ((n8 %= n10) != 0 ? (n10 = (int)(((AppsFlyerProperties)(object = AppsFlyerProperties.getInstance())).getBoolean((String)object3, n15 != 0) ? 1 : 0)) != 0 : (n10 = (int)(((AppsFlyerProperties)(object = AppsFlyerProperties.getInstance())).getBoolean((String)object3, n15 != 0) ? 1 : 0)) != 0) {
                        n10 = (int)(aFb1rSDK.component3() ? 1 : 0);
                        if (n10 != 0) {
                            AppsFlyerRequestListener appsFlyerRequestListener = aFa1oSDK.getMediationNetwork;
                            if (appsFlyerRequestListener == null) return object2;
                            n14 = 10;
                            object3 = "Event timeout. Check 'minTimeBetweenSessions' param";
                            appsFlyerRequestListener.onError(n14, (String)object3);
                            return object2;
                        }
                    } else {
                        object3 = "Allowing multiple launches within a 5 second time window.";
                        AFLogger.afInfoLog((String)object3);
                    }
                    aFb1rSDK.component1 = l2 = System.currentTimeMillis();
                }
                object3 = aFb1rSDK.getMonetizationNetwork().AFAdRevenueData();
                object = new AFb1rSDK$AFa1tSDK(aFb1rSDK, aFa1oSDK);
                long l3 = 0L;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                AFj1cSDK.getMonetizationNetwork((ScheduledExecutorService)object3, (Runnable)object, l3, timeUnit);
                return object2;
            }
            case 21: {
                return AFb1rSDK.values(objectArray);
            }
            case 20: {
                return AFb1rSDK.copydefault(objectArray);
            }
            case 19: {
                return AFb1rSDK.hashCode(objectArray);
            }
            case 18: {
                return AFb1rSDK.copy(objectArray);
            }
            case 17: {
                return AFb1rSDK.toString(objectArray);
            }
            case 16: {
                return AFb1rSDK.equals(objectArray);
            }
            case 15: {
                return AFb1rSDK.component1(objectArray);
            }
            case 14: {
                return AFb1rSDK.areAllFieldsValid(objectArray);
            }
            case 13: {
                return AFb1rSDK.component2(objectArray);
            }
            case 12: {
                return AFb1rSDK.component4(objectArray);
            }
            case 11: {
                int n21;
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat)objectArray[0];
                long l4 = ((Number)objectArray[n15]).longValue();
                TimeZone timeZone = TimeZone.getTimeZone("UTC");
                simpleDateFormat.setTimeZone(timeZone);
                Date date = new Date(l4);
                object2 = simpleDateFormat.format(date);
                e = n21 = (registerClient + 11) % 128;
                return object2;
            }
            case 10: {
                Object object4 = (AFb1rSDK)objectArray[0];
                Boolean bl3 = (Boolean)objectArray[n15];
                boolean bl4 = bl3;
                String string5 = String.valueOf(bl4);
                String string6 = "setDisableAdvertisingIdentifiers: ".concat(string5);
                AFLogger.afDebugLog(string6);
                if (!bl4) {
                    n17 = e + 87;
                    registerClient = n18 = n17 % 128;
                    if ((n17 %= n10) == 0) {
                        n8 = 1;
                    }
                    e = n18 = (n18 + 43) % 128;
                } else {
                    e = n10 = (registerClient + 91) % 128;
                }
                AFb1vSDK.getCurrencyIso4217Code = n8 != 0;
                Object object5 = ((AFb1rSDK)object4).getMonetizationNetwork();
                object = object5.e();
                ((AFd1tSDK)object).areAllFieldsValid = bl4;
                if (bl4) {
                    AFd1tSDK aFd1tSDK = object5.e();
                    aFd1tSDK.component4 = null;
                    return object2;
                }
                AFe1aSDK aFe1aSDK = object5.copy();
                object4 = ((AFb1rSDK)object4).getMonetizationNetwork();
                object5 = new AFf1pSDK((AFd1kSDK)object4);
                object4 = aFe1aSDK.AFAdRevenueData;
                object = new AFe1aSDK$2(aFe1aSDK, (AFe1eSDK)object5);
                object4.execute((Runnable)object);
                return object2;
            }
            case 9: {
                Object object6 = (AFb1rSDK)objectArray[0];
                Boolean bl5 = (Boolean)objectArray[n15];
                int n22 = bl5.booleanValue();
                n8 = e + 109;
                registerClient = n17 = n8 % 128;
                String string7 = "collectAndroidIdForceByUser";
                String string8 = "collectAndroidId";
                String string9 = "setCollectAndroidID";
                if ((n8 %= n10) != 0) {
                    String string10;
                    object6 = ((AFb1rSDK)object6).getMonetizationNetwork().copydefault();
                    object = new String[n15];
                    object[n15] = string10 = String.valueOf(n22 != 0);
                    object6.getMediationNetwork(string9, (String[])object);
                } else {
                    object6 = ((AFb1rSDK)object6).getMonetizationNetwork().copydefault();
                    object = String.valueOf(n22 != 0);
                    object = new String[]{object};
                    object6.getMediationNetwork(string9, (String[])object);
                }
                object6 = Boolean.toString(n22 != 0);
                AFb1rSDK.getMediationNetwork(string8, (String)object6);
                String string11 = Boolean.toString(n22 != 0);
                AFb1rSDK.getMediationNetwork(string7, string11);
                registerClient = n22 = (e + 75) % 128;
                return object2;
            }
            case 8: {
                int n24;
                AFc1cSDK aFc1cSDK;
                Object object7 = (AFb1rSDK)objectArray[0];
                String[] stringArray = (String[])objectArray[n15];
                object7 = ((AFb1rSDK)object7).getMonetizationNetwork().e();
                ((AFd1tSDK)object7).getMediationNetwork = aFc1cSDK = new AFc1cSDK(stringArray);
                e = n24 = (registerClient + 57) % 128;
                return object2;
            }
            case 7: {
                return AFb1rSDK.component3(objectArray);
            }
            case 6: {
                return AFb1rSDK.getRevenue(objectArray);
            }
            case 5: {
                return AFb1rSDK.getCurrencyIso4217Code(objectArray);
            }
            case 4: {
                int n25;
                AFb1rSDK aFb1rSDK = (AFb1rSDK)objectArray[0];
                object = (Context)objectArray[n15];
                Intent intent = (Intent)objectArray[n10];
                Object object8 = new AFj1iSDK(intent);
                String string12 = "appsflyer_preinstall";
                String string13 = ((AFj1iSDK)object8).AFAdRevenueData(string12);
                if (string13 != null) {
                    String string14 = ((AFj1iSDK)object8).AFAdRevenueData(string12);
                    AFb1rSDK.AFAdRevenueData(string14);
                    e = n25 = (registerClient + 87) % 128;
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String string15 = "referrer";
                object8 = ((AFj1iSDK)object8).AFAdRevenueData(string15);
                string13 = String.valueOf(object8);
                String string16 = "Play store referrer: ";
                string13 = string16.concat(string13);
                AFLogger.afInfoLog(string13);
                if (object8 == null) return object2;
                registerClient = n15 = (e + 87) % 128;
                aFb1rSDK.getMonetizationNetwork((Context)object).AFAdRevenueData(string15, (String)object8);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                string13 = "AF_REFERRER";
                appsFlyerProperties.set(string13, (String)object8);
                appsFlyerProperties.getCurrencyIso4217Code = object8;
                AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
                n25 = (int)(appsFlyerProperties2.getMonetizationNetwork() ? 1 : 0);
                if (n25 == 0) return object2;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFh1qSDK aFh1qSDK = AFh1qSDK.getMonetizationNetwork;
                aFb1rSDK.getCurrencyIso4217Code((Context)object, aFh1qSDK);
                aFb1rSDK.getMonetizationNetwork((String)object8);
                return object2;
            }
            case 3: {
                return AFb1rSDK.getMediationNetwork(objectArray);
            }
            case 2: {
                return AFb1rSDK.getMonetizationNetwork(objectArray);
            }
            case 1: 
        }
        return AFb1rSDK.AFAdRevenueData(objectArray);
    }

    public static String getCurrencyIso4217Code() {
        int n3 = 1;
        int n4 = registerClient + 117;
        e = n4 % 128;
        int n7 = -143536152;
        int n8 = 143536171;
        String string2 = "AppUserId";
        Object object = new Object[n3];
        if ((n4 %= 2) == 0) {
            object[0] = string2;
            long l2 = System.currentTimeMillis();
            n4 = (int)l2;
            object = (String)AFb1rSDK.getCurrencyIso4217Code(object, n8, n7, n4);
            n4 = 44 / 0;
        } else {
            object[0] = string2;
            long l3 = System.currentTimeMillis();
            n4 = (int)l3;
            object = (String)AFb1rSDK.getCurrencyIso4217Code(object, n8, n7, n4);
        }
        return object;
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        String string2;
        block12: {
            Object object;
            Object object2 = "af";
            registerClient = (e + 13) % 128;
            string2 = null;
            if (activity != null && (object = activity.getIntent()) != null) {
                int n3;
                Object object3 = object.getExtras();
                if (object3 == null) break block12;
                e = n3 = (registerClient + 75) % 128;
                string2 = object3.getString((String)object2);
                if (string2 == null) break block12;
                e = n3 = (registerClient + 97) % 128;
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.AFInAppEventType;
                String string3 = "Push Notification received af payload = ";
                String string4 = String.valueOf(string2);
                string3 = string3.concat(string4);
                aFLogger.w(aFh1vSDK, string3);
                object3.remove((String)object2);
                object2 = object.putExtras(object3);
                try {
                    activity.setIntent((Intent)object2);
                }
                catch (Throwable throwable) {
                    object2 = AFLogger.INSTANCE;
                    object = AFh1vSDK.AFInAppEventType;
                    object3 = throwable.getMessage();
                    ((AFh1uSDK)object2).e((AFh1vSDK)((Object)object), (String)object3, throwable);
                }
            }
        }
        return string2;
    }

    public static String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, long l2) {
        Long l3 = l2;
        Object[] objectArray = new Object[]{simpleDateFormat, l3};
        int n3 = (int)System.currentTimeMillis();
        return (String)AFb1rSDK.getCurrencyIso4217Code(objectArray, 1382084704, -1382084693, n3);
    }

    public static Map getCurrencyIso4217Code(Map hashMap) {
        int n3;
        e = n3 = (registerClient + 91) % 128;
        String string2 = "meta";
        int n4 = hashMap.containsKey(string2);
        if (n4 != 0) {
            hashMap = (Map)hashMap.get(string2);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap.put(string2, hashMap2);
            hashMap = hashMap2;
        }
        n3 = registerClient + 97;
        e = n4 = n3 % 128;
        if ((n3 %= 2) == 0) {
            n3 = 35 / 0;
        }
        return hashMap;
    }

    /*
     * Exception decompiling
     */
    private static void getCurrencyIso4217Code(Context var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 12[TRYBLOCK] [12 : 168->171)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void getCurrencyIso4217Code(Context object, AFh1qSDK object2) {
        int n3 = 1;
        registerClient = (e + 23) % 128;
        int n4 = 2;
        Object object3 = new Object[n4];
        String string2 = null;
        object3[0] = this;
        object3[n3] = object;
        int n7 = System.identityHashCode(this);
        int n8 = -608775197;
        int n10 = 608775214;
        AFb1rSDK.getCurrencyIso4217Code((Object[])object3, n8, n10, n7);
        object3 = this.getMonetizationNetwork().component3();
        object = AFa1mSDK.AFAdRevenueData(object);
        n7 = ((AFh1oSDK)object3).getCurrencyIso4217Code() ^ n3;
        if (n7 != n3) {
            int n14;
            Map map2 = ((AFh1oSDK)object3).getCurrencyIso4217Code;
            string2 = "api_name";
            object2 = ((Object)object2).toString();
            map2.put(string2, object2);
            ((AFh1oSDK)object3).AFAdRevenueData((AFh1sSDK)((Object)object));
            e = n14 = (registerClient + 3) % 128;
        }
        ((AFh1oSDK)object3).getMonetizationNetwork();
    }

    private void getCurrencyIso4217Code(AppsFlyerConversionListener appsFlyerConversionListener) {
        int n3;
        if (appsFlyerConversionListener == null) {
            e = (registerClient + 33) % 128;
            return;
        }
        this.getMonetizationNetwork = appsFlyerConversionListener;
        int n4 = e + 67;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        Object[] objectArray = new Object[]{this, aFa1oSDK};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1781271842, -1781271820, n3);
    }

    private /* synthetic */ void getCurrencyIso4217Code(AFf1bSDK object) {
        int n3;
        int n4;
        registerClient = n4 = (e + 43) % 128;
        AFd1kSDK aFd1kSDK = this.getMonetizationNetwork();
        AFf1bSDK aFf1bSDK = AFf1bSDK.getCurrencyIso4217Code;
        if (object == aFf1bSDK) {
            object = aFd1kSDK.afErrorLog();
            object.getCurrencyIso4217Code();
        }
        if ((n3 = (object = aFd1kSDK.copydefault()).getCurrencyIso4217Code()) == 0) {
            int n7;
            n3 = registerClient + 7;
            e = n7 = n3 % 128;
            if ((n3 %= 2) == 0) {
                aFd1kSDK.i().getCurrencyIso4217Code();
                n3 = 15 / 0;
                return;
            }
            aFd1kSDK.i().getCurrencyIso4217Code();
            return;
        }
        aFd1kSDK.i().getMediationNetwork();
    }

    private /* synthetic */ void getCurrencyIso4217Code(boolean bl2) {
        if (bl2) {
            int n3;
            int n4 = registerClient + 67;
            e = n3 = n4 % 128;
            int n7 = n4 % 2;
            if (n7 != 0) {
                this.getMonetizationNetwork().i().getMonetizationNetwork();
                return;
            }
            this.getMonetizationNetwork().i().getMonetizationNetwork();
            throw null;
        }
        this.getMonetizationNetwork().i().getRevenue();
        e = (registerClient + 79) % 128;
    }

    private static boolean getCurrencyIso4217Code(String string2) {
        Object[] objectArray = new Object[]{string2};
        int n3 = (int)System.currentTimeMillis();
        return (Boolean)AFb1rSDK.getCurrencyIso4217Code(objectArray, -1187185472, 1187185472, n3);
    }

    public static int getMediationNetwork(AFd1rSDK aFd1rSDK, boolean bl2) {
        e = (registerClient + 51) % 128;
        int n3 = AFb1rSDK.getRevenue(aFd1rSDK, "appsFlyerCount", bl2);
        registerClient = (e + 9) % 128;
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object getMediationNetwork(Object[] var0) {
        block9: {
            block11: {
                block8: {
                    block10: {
                        var1_2 /* !! */  = null;
                        var0 = (Context)var0[0];
                        var2_3 = AFb1rSDK.registerClient + 55;
                        AFb1rSDK.e = var3_4 = var2_3 % 128;
                        var4_5 /* !! */  = "android.permission.INTERNET";
                        if ((var2_3 %= 2) != 0) break block10;
                        try {
                            var1_2 /* !! */  = var0.getPackageManager();
                            var0 = var0.getPackageName();
                            var5_6 = 11102;
                            var0 = var1_2 /* !! */ .getPackageInfo((String)var0, var5_6);
                            var0 = var0.requestedPermissions;
                            var0 = Arrays.asList(var0);
                            var2_3 = (int)var0.contains(var4_5 /* !! */ );
                            if (var2_3 == 0) {
                                break block8;
                            }
                            ** GOTO lbl-1000
                        }
                        catch (Exception var0_1) {
                            break block9;
                        }
                    }
                    var1_2 /* !! */  = var0.getPackageManager();
                    var0 = var0.getPackageName();
                    var5_7 = 4096;
                    var0 = var1_2 /* !! */ .getPackageInfo((String)var0, var5_7);
                    var0 = var0.requestedPermissions;
                    var2_3 = (int)(var0 = Arrays.asList(var0)).contains(var4_5 /* !! */ );
                    if (var2_3 != 0) ** GOTO lbl-1000
                }
                var2_3 = AFb1rSDK.registerClient + 73;
                AFb1rSDK.e = var3_4 = var2_3 % 128;
                var4_5 /* !! */  = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml";
                if ((var2_3 %= 2) == 0) break block11;
                var1_2 /* !! */  = AFLogger.INSTANCE;
                var6_8 /* !! */  = AFh1vSDK.e;
                var1_2 /* !! */ .w((AFh1vSDK)var6_8 /* !! */ , var4_5 /* !! */ );
                ** GOTO lbl-1000
            }
            var0 = AFLogger.INSTANCE;
            var1_2 /* !! */  = AFh1vSDK.e;
            var0.w((AFh1vSDK)var1_2 /* !! */ , var4_5 /* !! */ );
            throw null;
lbl-1000:
            // 3 sources

            {
                if ((var2_3 = (int)var0.contains(var1_2 /* !! */  = "android.permission.ACCESS_NETWORK_STATE")) == 0) {
                    var1_2 /* !! */  = AFLogger.INSTANCE;
                    var4_5 /* !! */  = AFh1vSDK.e;
                    var6_8 /* !! */  = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml";
                    var1_2 /* !! */ .w((AFh1vSDK)var4_5 /* !! */ , var6_8 /* !! */ );
                }
                if ((var2_3 = Build.VERSION.SDK_INT) <= (var3_4 = 32)) return null;
                var1_2 /* !! */  = "com.google.android.gms.permission.AD_ID";
                var7_9 = var0.contains(var1_2 /* !! */ );
                if (var7_9) {
                    return null;
                }
                var0 = AFLogger.INSTANCE;
                var1_2 /* !! */  = AFh1vSDK.e;
                var4_5 /* !! */  = "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml";
                var0.w((AFh1vSDK)var1_2 /* !! */ , var4_5 /* !! */ );
                return null;
            }
        }
        var1_2 /* !! */  = AFLogger.INSTANCE;
        var4_5 /* !! */  = AFh1vSDK.e;
        var1_2 /* !! */ .e((AFh1vSDK)var4_5 /* !! */ , "Exception while validation permissions. ", var0_1);
        return null;
    }

    private /* synthetic */ void getMediationNetwork(AFi1jSDK object) {
        int n3;
        Object object2 = this.getMonetizationNetwork().getMediationNetwork();
        Object object3 = this.getMonetizationNetwork();
        AFf1jSDK aFf1jSDK = new AFf1jSDK((AFi1jSDK)object, (AFd1qSDK)object2, (AFd1kSDK)object3);
        object = this.getMonetizationNetwork().copy();
        object2 = ((AFe1aSDK)object).AFAdRevenueData;
        object3 = new AFe1aSDK$2((AFe1aSDK)object, aFf1jSDK);
        object2.execute((Runnable)object3);
        int n4 = registerClient + 111;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return;
        }
        throw null;
    }

    private static void getMediationNetwork(String string2) {
        int n3;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getCurrencyIso4217Code;
        String string3 = "ERROR: AppsFlyer SDK is not initialized! The API call '";
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(string2);
        stringBuilder.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        string2 = ((Object)stringBuilder).toString();
        aFLogger.w(aFh1vSDK, string2);
        int n4 = registerClient + 67;
        e = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            n4 = 31 / 0;
        }
    }

    private static void getMediationNetwork(String string2, String string3) {
        int n3;
        int n4;
        registerClient = n4 = (e + 67) % 128;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        appsFlyerProperties.set(string2, string3);
        int n7 = e + 43;
        registerClient = n3 = n7 % 128;
        if ((n7 %= 2) == 0) {
            return;
        }
        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objectArray) {
        int n3;
        Object object;
        Object object2;
        block6: {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            int n4;
            Object object7;
            Object object8;
            Object object9;
            String string2;
            Context context;
            int n7;
            block8: {
                block7: {
                    int n8;
                    void var8_16;
                    Object object10;
                    Object object11;
                    Object object12;
                    Object object13;
                    Object object14;
                    n7 = 0;
                    object2 = null;
                    object = (AFb1rSDK)objectArray[0];
                    int n10 = 1;
                    context = (Context)objectArray[n10];
                    int n14 = 2;
                    string2 = (String)objectArray[n14];
                    object9 = object14 = objectArray[3];
                    object9 = (String)object14;
                    object8 = object13 = objectArray[4];
                    object8 = (String)object13;
                    object7 = object12 = objectArray[5];
                    object7 = (String)object12;
                    n4 = 6;
                    object6 = object11 = objectArray[n4];
                    object6 = (String)object11;
                    int n15 = 7;
                    object5 = object10 = objectArray[n15];
                    object5 = (Map)object10;
                    AFd1kSDK aFd1kSDK = ((AFb1rSDK)object).getMonetizationNetwork();
                    object4 = aFd1kSDK.copydefault();
                    if (object5 == null) {
                        e = n4 = (registerClient + 43) % 128;
                        String string3 = "";
                    } else {
                        String string4 = object5.toString();
                    }
                    void var17_32 = var8_16;
                    String string5 = string2;
                    object3 = object9;
                    Object object15 = object8;
                    Object object16 = object7;
                    Object object17 = object4;
                    object4 = var17_32;
                    String[] stringArray = new String[]{string2, object9, object8, object7, object6, var17_32};
                    object3 = "validateAndTrackInAppPurchase";
                    object17.getMediationNetwork((String)object3, stringArray);
                    n10 = (int)(((AFb1rSDK)object).isStopped() ? 1 : 0);
                    if (n10 == 0) {
                        object17 = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK = AFh1vSDK.v;
                        String string6 = " ";
                        object3 = og_1.a("Validate in app called with parameters: ", (String)object8, string6, (String)object7, string6);
                        ((StringBuilder)object3).append((String)object6);
                        object3 = object3.toString();
                        ((AFh1uSDK)object17).i(aFh1vSDK, (String)object3);
                    }
                    n10 = 0;
                    object17 = null;
                    if (string2 == null || object7 == null || object9 == null || object6 == null) break block6;
                    n4 = e + 71;
                    registerClient = n8 = n4 % 128;
                    if ((n4 %= n14) == 0) break block7;
                    n14 = 20 / 0;
                    if (object8 != null) break block8;
                    break block6;
                }
                if (object8 == null) break block6;
            }
            object3 = context.getApplicationContext();
            AFg1wSDK aFg1wSDK = ((AFb1rSDK)object).getMonetizationNetwork().AFKeystoreWrapper();
            n4 = 1;
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = aFg1wSDK;
            n7 = System.identityHashCode(aFg1wSDK);
            int n16 = -1684451992;
            int n17 = 1684451992;
            Object object18 = object2 = AFg1wSDK.getCurrencyIso4217Code(objectArray2, n16, n17, n7);
            String string7 = (String)object2;
            AFd1qSDK aFd1qSDK = ((AFb1rSDK)object).getMonetizationNetwork().getMediationNetwork();
            Object object19 = object4;
            object2 = object4;
            object4 = object9;
            object9 = object8;
            object8 = object7;
            object7 = object6;
            object6 = object5;
            ((AFa1bSDK)object19)((Context)object3, string7, aFd1qSDK, string2, (String)object4, (String)object9, (String)object8, (String)object7, (Map)object5);
            Thread thread2 = new Thread((Runnable)object19);
            thread2.start();
            return null;
        }
        if ((object2 = getMediationNetwork) == null) return null;
        e = n3 = (registerClient + 7) % 128;
        object = "Please provide purchase parameters";
        object2.onValidateInAppFailure((String)object);
        return null;
    }

    public static String getMonetizationNetwork(AFd1rSDK aFd1rSDK, String string2) {
        int n3;
        int n4 = registerClient + 59;
        e = n3 = n4 % 128;
        String string3 = "CACHED_CHANNEL";
        if ((n4 %= 2) != 0) {
            String string4 = aFd1rSDK.getMonetizationNetwork(string3, null);
            if (string4 != null) {
                int n7;
                int n8 = registerClient + 103;
                e = n7 = n8 % 128;
                if ((n8 %= 2) != 0) {
                    return string4;
                }
                throw null;
            }
            aFd1rSDK.AFAdRevenueData(string3, string2);
            return string2;
        }
        aFd1rSDK.getMonetizationNetwork(string3, null);
        throw null;
    }

    private void getMonetizationNetwork(Context objectArray, String string2) {
        int n3 = 1;
        int n4 = 2;
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        Object[] objectArray2 = new Object[n4];
        objectArray2[0] = this;
        objectArray2[n3] = objectArray;
        int n7 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray2, -608775197, 608775214, n7);
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getCurrencyIso4217Code = null;
        aFh1iSDK.component2 = string2;
        aFh1iSDK.AFAdRevenueData = null;
        objectArray = new Object[n4];
        objectArray[0] = this;
        objectArray[n3] = aFh1iSDK;
        int n8 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1781271842, -1781271820, n8);
        e = (registerClient + 11) % 128;
    }

    private void getMonetizationNetwork(String object) {
        Object object2 = new AFh1jSDK();
        Object object3 = this.getMonetizationNetwork().getMediationNetwork().getRevenue;
        String string2 = "appsFlyerCount";
        int n3 = object3.getMediationNetwork(string2, 0);
        object2 = object2.getMediationNetwork(n3);
        object2.component2 = object;
        if (object != null) {
            registerClient = (e + 45) % 128;
            int n4 = ((String)object).length();
            if (n4 > (n3 = 5) && (n4 = (int)(((AFj1uSDK)(object = this.getMonetizationNetwork().equals())).getMediationNetwork((AFa1oSDK)object2) ? 1 : 0)) != 0) {
                object = this.getMonetizationNetwork().AFAdRevenueData();
                object3 = new AFb1rSDK$AFa1tSDK(this, (AFa1oSDK)object2);
                long l2 = 5;
                object2 = TimeUnit.MILLISECONDS;
                AFj1cSDK.getMonetizationNetwork((ScheduledExecutorService)object, (Runnable)object3, l2, (TimeUnit)((Object)object2));
                e = n4 = (registerClient + 53) % 128;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void getMonetizationNetwork(JSONObject var0) {
        block14: {
            var1_1 = new ArrayList<Object>();
            var2_2 = var0.keys();
            block8: while (true) {
                var3_3 = var2_2.hasNext();
                var4_4 = 0;
                var5_5 = null;
                if (var3_3 == 0) break block14;
                var6_6 = (String)var2_2.next();
                try {
                    var6_6 = var0.get((String)var6_6);
                    var6_6 = (String)var6_6;
                    var7_8 /* !! */  = new JSONArray((String)var6_6);
lbl13:
                    // 2 sources

                    while (true) {
                        var3_3 = var7_8 /* !! */ .length();
                        if (var4_4 >= var3_3) continue block8;
                        AFb1rSDK.registerClient = var3_3 = (AFb1rSDK.e + 73) % 128;
                        break block8;
                        break;
                    }
                }
                catch (JSONException var6_7) {
                    var5_5 = "error at timeStampArr";
                    AFLogger.afErrorLogForExcManagerOnly(var5_5, var6_7);
                    continue;
                }
                break;
            }
            {
                var8_9 = var7_8 /* !! */ .getLong(var4_4);
                var6_6 = var8_9;
                var1_1.add(var6_6);
                ++var4_4;
                ** continue;
            }
        }
        Collections.sort(var1_1);
        var2_2 = var0.keys();
        var3_3 = 0;
        var6_6 = null;
        block10: while (true) {
            var10_10 /* !! */  = 0;
            var7_8 /* !! */  = null;
            block11: while (true) {
                block16: {
                    block17: {
                        block15: {
                            var11_11 = var2_2.hasNext();
                            var12_12 = 1;
                            if ((var11_11 ^= var12_12) || var7_8 /* !! */  != null) break block10;
                            var13_13 = (String)var2_2.next();
                            try {
                                var15_16 = var0.get(var13_13);
                                var15_16 = (String)var15_16;
                                var14_15 = new JSONArray((String)var15_16);
                                var16_17 = 0;
                                var15_16 = null;
lbl47:
                                // 2 sources

                                while (true) {
                                    var17_18 = var14_15.length();
                                    if (var16_17 >= var17_18) continue block11;
                                    var17_18 = AFb1rSDK.e + 71;
                                    AFb1rSDK.registerClient = var18_19 = var17_18 % 128;
                                    if ((var17_18 %= 2) == 0) break block15;
                                    break;
                                }
                            }
                            catch (JSONException var13_14) {
                                break block16;
                            }
                            var19_20 = var14_15.getLong(var16_17);
                            var21_21 = var1_1.get(var12_12);
                            var22_22 = (var21_21 = (Long)var21_21).longValue();
                            cfr_temp_0 = var19_20 - var22_22;
                            var24_23 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var24_23 /* !! */  == false) continue block10;
                            break block17;
                        }
                        var19_20 = var14_15.getLong(var16_17);
                        var21_21 = var1_1.get(0);
                        var22_22 = (var21_21 = (Long)var21_21).longValue();
                        cfr_temp_1 = var19_20 - var22_22;
                        var24_23 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var24_23 /* !! */  == false) continue block10;
                    }
                    var19_20 = var14_15.getLong(var16_17);
                    var21_21 = var1_1.get(var12_12);
                    var22_22 = (var21_21 = (Long)var21_21).longValue();
                    cfr_temp_2 = var19_20 - var22_22;
                    var24_23 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                    if (var24_23 /* !! */  == false) continue block10;
                    AFb1rSDK.e = var17_18 = (AFb1rSDK.registerClient + 123) % 128;
                    {
                        var19_20 = var14_15.getLong(var16_17);
                        var25_24 = var1_1.size() - var12_12;
                    }
                    {
                        var21_21 = var1_1.get(var25_24);
                        var22_22 = (var21_21 = (Long)var21_21).longValue();
                        cfr_temp_3 = var19_20 - var22_22;
                        var10_10 /* !! */  = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                        if (var10_10 /* !! */  != 0) ** break;
                        continue block10;
                        ++var16_17;
                        AFb1rSDK.registerClient = var10_10 /* !! */  = (AFb1rSDK.e + 17) % 128;
                        var7_8 /* !! */  = var13_13;
                        ** continue;
                    }
                }
                var26_25 = "error at manageExtraReferrers";
                AFLogger.afErrorLogForExcManagerOnly(var26_25, var13_14);
            }
            break;
        }
        if (var7_8 /* !! */  != null) {
            var0.remove((String)var7_8 /* !! */ );
        }
    }

    private static int getRevenue(AFd1rSDK aFd1rSDK, String string2, boolean bl2) {
        e = (registerClient + 33) % 128;
        int n3 = aFd1rSDK.getMediationNetwork(string2, 0);
        boolean bl3 = true;
        if (bl2 == bl3) {
            int n4;
            registerClient = n4 = (e + 57) % 128;
            aFd1rSDK.AFAdRevenueData(string2, ++n3);
        }
        return n3;
    }

    public static AFb1rSDK getRevenue() {
        int n3;
        int n4 = e + 11;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return component3;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Object getRevenue(Object[] object) {
        int n3;
        int n4 = 0;
        String[] stringArray = null;
        object = (AFb1rSDK)object[0];
        int n7 = e + 77;
        registerClient = n3 = n7 % 128;
        String string2 = "getSdkVersion";
        if ((n7 %= 2) != 0) {
            object = ((AFb1rSDK)object).getMonetizationNetwork().copydefault();
            stringArray = new String[]{};
            object.getMediationNetwork(string2, stringArray);
        } else {
            object = ((AFb1rSDK)object).getMonetizationNetwork().copydefault();
            stringArray = new String[]{};
            object.getMediationNetwork(string2, stringArray);
        }
        object = AFd1qSDK.areAllFieldsValid();
        n4 = registerClient + 35;
        e = n7 = n4 % 128;
        if ((n4 %= 2) == 0) {
            throw null;
        }
        return object;
    }

    private static String getRevenue(String string2) {
        Object[] objectArray = new Object[]{string2};
        int n3 = (int)System.currentTimeMillis();
        return (String)AFb1rSDK.getCurrencyIso4217Code(objectArray, 143536171, -143536152, n3);
    }

    private void getRevenue(Context object, String string2, Map map2) {
        int n3;
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        aFh1eSDK.areAllFieldsValid = string2;
        aFh1eSDK.getCurrencyIso4217Code = map2;
        object = this.component3((Context)object);
        this.getRevenue(aFh1eSDK, (AFh1mSDK)object);
        int n4 = e + 63;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            n4 = 67 / 0;
        }
    }

    private static /* synthetic */ void getRevenue(AFd1kSDK object) {
        int n3;
        int n4 = e + 79;
        registerClient = n3 = n4 % 128;
        object = object.valueOf();
        object.getCurrencyIso4217Code();
        if ((n4 %= 2) == 0) {
            e = (registerClient + 91) % 128;
            return;
        }
        throw null;
    }

    private void getRevenue(Map map2) {
        Object[] objectArray = new Object[]{this, map2};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -1216379940, 1216379960, n3);
    }

    public static boolean getRevenue(Context context) {
        block8: {
            Object object;
            int n3;
            boolean bl2;
            block6: {
                block7: {
                    int n4;
                    registerClient = (e + 49) % 128;
                    bl2 = true;
                    n3 = 0;
                    object = GoogleApiAvailability.getInstance();
                    try {
                        int n7 = ((GoogleApiAvailability)object).isGooglePlayServicesAvailable(context);
                        if (n7 != 0) break block6;
                        n4 = registerClient + 79;
                        e = n7 = n4 % 128;
                        if ((n4 %= 2) != 0) break block7;
                    }
                    catch (Throwable throwable) {
                        String string2 = "WARNING:  Google play services is unavailable. ";
                        AFLogger.afErrorLog(string2, throwable);
                    }
                    n4 = 46 / 0;
                }
                return bl2;
            }
            try {
                context = context.getPackageManager();
                object = "com.google.android.gms";
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                object = AFh1vSDK.e;
                aFLogger.e((AFh1vSDK)((Object)object), "WARNING:  Google Play Services is unavailable. ", nameNotFoundException);
                return false;
            }
            context.getPackageInfo((String)object, 0);
            int n8 = e + 87;
            registerClient = n3 = n8 % 128;
            if ((n8 %= 2) != 0) break block8;
            return bl2;
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
    public static SharedPreferences h_(Context var0) {
        var1_3 = AFb1rSDK.class;
        synchronized (var1_3) {
            block12: {
                block11: {
                    try {
                        var2_4 = AFb1rSDK.e + 1;
                        AFb1rSDK.registerClient = var2_4 %= 128;
                        var3_5 = AFb1rSDK.getRevenue();
                        var3_5 = var3_5.hashCode;
                        if (var3_5 == null) {
                            var2_4 = AFb1rSDK.registerClient + 47;
                            AFb1rSDK.e = var4_6 = var2_4 % 128;
                            var4_6 = 0;
                            if ((var2_4 %= 2) != 0) break block11;
                            var3_5 = StrictMode.allowThreadDiskReads();
                        }
                        ** GOTO lbl40
                    }
                    catch (Throwable var0_1) {
                        break block12;
                    }
                    try {
                        var5_7 = AFb1rSDK.getRevenue();
                        var0 /* !! */  = var0 /* !! */ .getApplicationContext();
                        var6_8 = "appsflyer-data";
                        var0 /* !! */  = var0 /* !! */ .getSharedPreferences(var6_8, 0);
                        var5_7.hashCode = var0 /* !! */ ;
                    }
                    catch (Throwable var0_2) {
                        ** GOTO lbl-1000
                    }
lbl27:
                    // 2 sources

                    while (true) {
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var3_5);
                        ** GOTO lbl40
                        break;
                    }
                }
                var3_5 = StrictMode.allowThreadDiskReads();
                {
                    var5_7 = AFb1rSDK.getRevenue();
                    var0 /* !! */  = var0 /* !! */ .getApplicationContext();
                    var6_8 = "appsflyer-data";
                    var0 /* !! */  = var0 /* !! */ .getSharedPreferences(var6_8, 0);
                    var5_7.hashCode = var0 /* !! */ ;
                    ** continue;
                }
lbl-1000:
                // 1 sources

                {
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var3_5);
                    throw var0_2;
lbl40:
                    // 2 sources

                    var0 /* !! */  = AFb1rSDK.getRevenue();
                    return var0 /* !! */ .hashCode;
                }
            }
            throw var0_1;
        }
    }

    private static /* synthetic */ Object hashCode(Object[] object) {
        int n3;
        object = (String)object[0];
        int n4 = e + 121;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            object = appsFlyerProperties.getString((String)object);
            n4 = e + 3;
            registerClient = n3 = n4 % 128;
            if ((n4 %= 2) != 0) {
                n4 = 36 / 0;
            }
            return object;
        }
        AppsFlyerProperties.getInstance().getString((String)object);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void i_(Context context, Intent intent) {
        int n3;
        AFc1oSDK aFc1oSDK;
        String string2;
        String string3;
        int n4;
        int n7 = 1;
        int n8 = 0;
        String string4 = null;
        int n10 = 2;
        e = n4 = (registerClient + 13) % 128;
        Object object = new Object[n10];
        object[0] = this;
        object[n7] = context;
        int n14 = System.identityHashCode(this);
        int n15 = 608775214;
        AFb1rSDK.getCurrencyIso4217Code((Object[])object, -608775197, n15, n14);
        object = this.getMonetizationNetwork().d();
        AFd1rSDK aFd1rSDK = this.getMonetizationNetwork().getRevenue();
        if (intent != null && (n15 = (int)((string3 = "android.intent.action.VIEW").equals(string2 = intent.getAction()) ? 1 : 0)) != 0) {
            int n16;
            n15 = registerClient + 11;
            e = n16 = n15 % 128;
            if ((n15 %= n10) == 0) {
                intent.getData();
                throw null;
            }
            string3 = intent.getData();
        } else {
            n15 = 0;
            string3 = null;
        }
        if (string3 != null && (n15 = (int)((string3 = string3.toString()).isEmpty() ? 1 : 0)) == 0) {
            e = n8 = (registerClient + 109) % 128;
        } else {
            n7 = 0;
            aFc1oSDK = null;
        }
        string4 = "ddl_sent";
        n8 = aFd1rSDK.getMediationNetwork(string4);
        if (n8 != 0 && n7 == 0) {
            ((AFc1kSDK)object).getMonetizationNetwork("No direct deep link", null);
            return;
        }
        aFc1oSDK = AFc1oSDK.AFAdRevenueData(((AFc1kSDK)object).areAllFieldsValid.afInfoLog());
        ((AFc1kSDK)object).n_(aFc1oSDK, intent, context);
        int n17 = e + 31;
        registerClient = n3 = n17 % 128;
        if ((n17 %= n10) == 0) {
            return;
        }
        throw null;
    }

    private static /* synthetic */ Object toString(Object[] object) {
        Object object2 = (AFb1rSDK)object[0];
        object = (Context)object[1];
        int n3 = registerClient + 51;
        e = n3 % 128;
        if ((n3 %= 2) != 0) {
            object2 = ((AFb1rSDK)object2).toString;
            if (object != null) {
                object2 = ((AFd1oSDK)object2).getCurrencyIso4217Code;
                if (object != null) {
                    int n4;
                    ((AFd1nSDK)object2).AFAdRevenueData = object = object.getApplicationContext();
                    e = n4 = (registerClient + 33) % 128;
                }
            }
            return null;
        }
        object = ((AFb1rSDK)object2).toString;
        throw null;
    }

    private static /* synthetic */ Object values(Object[] object) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK)object[0];
        int n3 = 1;
        DeepLinkListener deepLinkListener = (DeepLinkListener)object[n3];
        int n4 = 2;
        long l2 = ((Number)object[n4]).longValue();
        e = (registerClient + 101) % 128;
        aFb1rSDK.getMonetizationNetwork().d().getMonetizationNetwork = deepLinkListener;
        object = aFb1rSDK.getMonetizationNetwork().d();
        object.component3 = l2;
        int n7 = registerClient + 111;
        e = n7 % 128;
        aFb1rSDK = null;
        if ((n7 %= n4) == 0) {
            n7 = 17 / 0;
        }
        return null;
    }

    public final void AFAdRevenueData(Context context) {
        Object[] objectArray = new Object[]{this, context};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -608775197, 608775214, n3);
    }

    public final boolean AFAdRevenueData() {
        block5: {
            block6: {
                String string2;
                int n3;
                block4: {
                    n3 = e + 37;
                    registerClient = n3 % 128;
                    string2 = "waitForCustomerId";
                    if ((n3 %= 2) == 0) break block4;
                    n3 = (int)(AFb1rSDK.getCurrencyIso4217Code(string2) ? 1 : 0);
                    int cfr_ignored_0 = 44 / 0;
                    if (n3 == 0) break block5;
                    break block6;
                }
                n3 = (int)(AFb1rSDK.getCurrencyIso4217Code(string2) ? 1 : 0);
                if (n3 == 0) break block5;
            }
            String string3 = AFb1rSDK.getCurrencyIso4217Code();
            if (string3 == null) {
                registerClient = (e + 105) % 128;
                return true;
            }
        }
        return false;
    }

    public final void addPushNotificationDeepLinkPath(String ... object) {
        int n3;
        registerClient = n3 = (e + 35) % 128;
        List list = this.getMonetizationNetwork().d().AFAdRevenueData;
        int n4 = list.contains(object = Arrays.asList(object));
        if (n4 == 0) {
            int n7;
            e = n4 = (registerClient + 77) % 128;
            list.add(object);
            e = n7 = (registerClient + 121) % 128;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void anonymizeUser(boolean bl2) {
        Object object;
        int n3;
        int n4 = registerClient + 25;
        e = n3 = n4 % 128;
        String string2 = "deviceTrackingDisabled";
        String string3 = "anonymizeUser";
        if ((n4 %= 2) == 0) {
            String string4;
            object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = new String[]{};
            int n7 = 1;
            stringArray[n7] = string4 = String.valueOf(bl2);
            object.getMediationNetwork(string3, stringArray);
        } else {
            object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = String.valueOf(bl2);
            stringArray = new String[]{stringArray};
            object.getMediationNetwork(string3, stringArray);
        }
        object = AppsFlyerProperties.getInstance();
        ((AppsFlyerProperties)object).set(string2, bl2);
    }

    public final void appendParametersToDeepLinkingURL(String string2, Map map2) {
        Object[] objectArray = new Object[]{this, string2, map2};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -1888684226, 1888684227, n3);
    }

    public final void component4() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -1730576944, 1730576958, n3);
    }

    public final void enableFacebookDeferredApplinks(boolean bl2) {
        int n3;
        registerClient = (e + 117) % 128;
        AFc1fSDK aFc1fSDK = this.getMonetizationNetwork().unregisterClient();
        aFc1fSDK.AFAdRevenueData(bl2);
        int n4 = registerClient + 37;
        e = n3 = n4 % 128;
        int n7 = n4 % 2;
        if (n7 == 0) {
            int n8 = 96 / 0;
        }
    }

    public final void enableTCFDataCollection(boolean bl2) {
        int n3;
        int n4 = registerClient + 31;
        e = n3 = n4 % 128;
        String string2 = "enableTCFDataCollection";
        if ((n4 %= 2) != 0) {
            String string3 = Boolean.toString(bl2);
            AFb1rSDK.getMediationNetwork(string2, string3);
            return;
        }
        String string4 = Boolean.toString(bl2);
        AFb1rSDK.getMediationNetwork(string2, string4);
        throw null;
    }

    public final void g_(Context context, Intent intent) {
        Object[] objectArray = new Object[]{this, context, intent};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -687234173, 687234177, n3);
    }

    public final String getAppsFlyerUID(Context object) {
        int n3 = 2;
        int n4 = 0;
        AFb1cSDK aFb1cSDK = this.getMonetizationNetwork().copydefault();
        String[] stringArray = new String[]{};
        String string2 = "getAppsFlyerUID";
        aFb1cSDK.getMediationNetwork(string2, stringArray);
        if (object == null) {
            int n7;
            registerClient = n7 = (e + 93) % 128;
            e = n4 = (n7 += 115) % 128;
            n7 %= n3;
            n3 = 0;
            Object var8_9 = null;
            if (n7 != 0) {
                return null;
            }
            throw null;
        }
        Object object2 = new Object[n3];
        object2[0] = this;
        object2[1] = object;
        int n8 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(object2, -608775197, 608775214, n8);
        object = this.getMonetizationNetwork().getMediationNetwork();
        object2 = object.getMonetizationNetwork;
        object = object.getRevenue;
        return AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object2, (AFd1rSDK)object);
    }

    public final String getAttributionId(Context object) {
        registerClient = (e + 55) % 128;
        Object[] objectArray = new Object[]{this, object};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -608775197, 608775214, n3);
        object = this.getMonetizationNetwork().getMediationNetwork().AFAdRevenueData((Context)object);
        registerClient = (e + 79) % 128;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getCurrencyIso4217Code(Context object, String string2) {
        JSONException jSONException2;
        block11: {
            Throwable throwable2;
            CharSequence charSequence;
            block10: {
                long l2;
                long l3;
                long l4;
                Object object2;
                Object object3;
                long l7;
                String string3;
                int n3;
                block12: {
                    int n4;
                    charSequence = "extraReferrers";
                    registerClient = n3 = (e + 29) % 128;
                    string3 = String.valueOf(string2);
                    String string4 = "received a new (extra) referrer: ";
                    string3 = string4.concat(string3);
                    AFLogger.afDebugLog(string3);
                    l7 = System.currentTimeMillis();
                    object3 = this.getMonetizationNetwork((Context)object);
                    object2 = null;
                    object3 = object3.getMonetizationNetwork((String)charSequence, null);
                    if (object3 == null) {
                        object3 = new JSONObject();
                        object2 = new JSONArray();
                        e = n4 = (registerClient + 55) % 128;
                    } else {
                        object2 = new JSONObject((String)object3);
                        boolean bl2 = object2.has(string2);
                        if (bl2) {
                            Object object4 = object2.get(string2);
                            object4 = (String)object4;
                            object3 = new JSONArray((String)object4);
                        } else {
                            object3 = new JSONArray();
                        }
                        JSONObject jSONObject = object2;
                        object2 = object3;
                        object3 = jSONObject;
                    }
                    n4 = object2.length();
                    l4 = n4;
                    long l8 = 5;
                    long l12 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
                    if (l12 >= 0) break block12;
                    registerClient = n4 = (e + 29) % 128;
                    try {
                        object2.put(l7);
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    catch (JSONException jSONException2) {
                        break block11;
                    }
                }
                if ((l3 = (l2 = (l7 = (long)(n3 = object3.length())) - (l4 = (long)4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
                    AFb1rSDK.getMonetizationNetwork((JSONObject)object3);
                }
                string3 = object2.toString();
                object3.put(string2, (Object)string3);
                object = this.getMonetizationNetwork((Context)object);
                string3 = object3.toString();
                object.AFAdRevenueData((String)charSequence, string3);
                return;
            }
            charSequence = new StringBuilder("Couldn't save referrer - ");
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(": ");
            AFLogger.afErrorLog(charSequence.toString(), throwable2);
            return;
        }
        AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", jSONException2);
    }

    public final String getHostName() {
        e = (registerClient + 65) % 128;
        String string2 = this.getMonetizationNetwork().AFInAppEventType().AFAdRevenueData();
        e = (registerClient + 89) % 128;
        return string2;
    }

    public final String getHostPrefix() {
        int n3;
        int n4 = registerClient + 117;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return this.getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        }
        this.getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFg1xSDK getMediationNetwork() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                AFg1xSDK aFg1xSDK;
                block3: {
                    try {
                        aFg1xSDK = this.AFKeystoreWrapper;
                        if (aFg1xSDK != null) break block3;
                        int n3 = e + 37;
                        registerClient = n3 %= 128;
                        this.AFKeystoreWrapper = aFg1xSDK = new b_0(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                aFg1xSDK = this.AFKeystoreWrapper;
                int n4 = registerClient + 119;
                e = n4 %= 128;
                return aFg1xSDK;
            }
            throw throwable2;
        }
    }

    public final AFd1kSDK getMonetizationNetwork() {
        int n3 = e;
        AFd1oSDK aFd1oSDK = this.toString;
        registerClient = (n3 + 17) % 128;
        return aFd1oSDK;
    }

    public final AFd1rSDK getMonetizationNetwork(Context object) {
        int n3 = 1;
        int n4 = 2;
        int n7 = registerClient + 63;
        e = n7 % 128;
        int n8 = 608775214;
        int n10 = -608775197;
        if ((n7 %= n4) != 0) {
            Object[] objectArray = new Object[n4];
            objectArray[0] = this;
            objectArray[n3] = object;
            int n14 = System.identityHashCode(this);
            AFb1rSDK.getCurrencyIso4217Code(objectArray, n10, n8, n14);
            object = this.getMonetizationNetwork().getRevenue();
            e = (registerClient + 111) % 128;
            return object;
        }
        Object[] objectArray = new Object[n4];
        objectArray[0] = this;
        objectArray[n3] = object;
        int n15 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, n10, n8, n15);
        this.getMonetizationNetwork().getRevenue();
        throw null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map getMonetizationNetwork(AFa1oSDK var1_1) {
        block6: {
            block8: {
                block7: {
                    var2_3 = false;
                    var3_4 = null;
                    var4_5 = 1;
                    var5_6 /* !! */  = this.getMonetizationNetwork().values().AFAdRevenueData;
                    var6_7 = this.getMonetizationNetwork(var5_6 /* !! */ );
                    var7_8 = this.getMonetizationNetwork().component1();
                    var8_9 = this.getMonetizationNetwork().AFKeystoreWrapper();
                    var9_10 = var8_9.getCurrencyIso4217Code();
                    var10_11 = var1_1.getRevenue();
                    var11_12 = var1_1.getRevenue;
                    var12_13 /* !! */  = new Date();
                    var13_14 = var12_13 /* !! */ .getTime();
                    var15_15 = Color.blue((int)0);
                    var15_15 = 127 - var15_15;
                    var16_16 /* !! */  = new Object[var4_5];
                    var17_17 = "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081";
                    AFb1rSDK.a(null, var17_17, null, var15_15, var16_16 /* !! */ );
                    var18_18 /* !! */  = ((String)var16_16 /* !! */ [0]).intern();
                    var12_13 /* !! */  = Long.toString(var13_14);
                    var11_12.put(var18_18 /* !! */ , var12_13 /* !! */ );
                    if (!var9_10) break block7;
                    try {
                        var8_9 = AFLogger.INSTANCE;
                        var12_13 /* !! */  = AFh1vSDK.e;
                        var19_19 = "SDK Reporting has been stopped";
                        var8_9.i((AFh1vSDK)var12_13 /* !! */ , var19_19, (boolean)var4_5);
                        ** GOTO lbl53
                    }
                    catch (Throwable var1_2) {
                        var6_7 = var1_2;
                        break block6;
                    }
                }
                var8_9 = AFLogger.INSTANCE;
                var12_13 /* !! */  = AFh1vSDK.e;
                var18_18 /* !! */  = "******* sendTrackingWithEvent: ";
                var19_20 /* !! */  = new StringBuilder((String)var18_18 /* !! */ );
                var15_15 = var10_11 ^ 1;
                if (var15_15 == 0) break block8;
                var18_18 /* !! */  = var1_1.areAllFieldsValid;
                ** GOTO lbl49
            }
            var15_15 = AFb1rSDK.e + 117;
            AFb1rSDK.registerClient = var20_21 = var15_15 % 128;
            var16_16 /* !! */  = "Launch";
            if ((var15_15 %= 2) == 0) ** GOTO lbl48
            var15_15 = 40;
            {
                var15_15 /= 0;
lbl48:
                // 2 sources

                var18_18 /* !! */  = var16_16 /* !! */ ;
lbl49:
                // 2 sources

                var19_20 /* !! */ .append((String)var18_18 /* !! */ );
                var19_20 /* !! */  = var19_20 /* !! */ .toString();
                var8_9.i((AFh1vSDK)var12_13 /* !! */ , (String)var19_20 /* !! */ , (boolean)var4_5);
lbl53:
                // 2 sources

                var8_9 = new Object[var4_5];
                var8_9[0] = var5_6 /* !! */ ;
                var13_14 = System.currentTimeMillis();
                var21_22 = (int)var13_14;
                var22_23 = 2054602482;
                var23_24 = -2054602479;
                AFb1rSDK.getCurrencyIso4217Code(var8_9, var22_23, var23_24, var21_22);
                var21_22 = AFb1rSDK.getMediationNetwork((AFd1rSDK)var6_7, (boolean)var10_11);
                var1_1 = var1_1.areAllFieldsValid;
                if (var1_1 == null) ** GOTO lbl-1000
                AFb1rSDK.e = var24_25 = (AFb1rSDK.registerClient + 125) % 128;
                var2_3 = true;
            }
lbl-1000:
            // 2 sources

            {
                var24_25 = AFb1rSDK.getCurrencyIso4217Code((AFd1rSDK)var6_7, var2_3);
                if (var10_11 != 0 && var21_22 == var4_5) {
                    var3_4 = AppsFlyerProperties.getInstance();
                    var3_4.getMonetizationNetwork = var4_5;
                }
                var7_8.getCurrencyIso4217Code(var11_12, var21_22, var24_25);
                return var11_12;
            }
        }
        var3_4 = AFLogger.INSTANCE;
        var25_26 = AFh1vSDK.e;
        var9_10 = true;
        var10_11 = 1;
        var5_6 /* !! */  = "Error while preparing to send event";
        var26_27 = true;
        var3_4.e(var25_26, (String)var5_6 /* !! */ , var1_2, var26_27, var9_10, (boolean)var10_11);
        return var11_12;
    }

    public final String getOutOfStore(Context object) {
        int n3 = registerClient + 99;
        e = n3 % 128;
        String string2 = "api_store_value";
        if ((n3 %= 2) != 0) {
            String string3 = AppsFlyerProperties.getInstance().getString(string2);
            if (string3 != null) {
                return string3;
            }
            string3 = "AF_STORE";
            if ((object = this.AFAdRevenueData((Context)object, string3)) != null) {
                e = (registerClient + 81) % 128;
                return object;
            }
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        AppsFlyerProperties.getInstance().getString(string2);
        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void getRevenue(AFa1oSDK object) {
        Object object2;
        int n3;
        int n4;
        block14: {
            void var14_37;
            int n7;
            int n8;
            AFj1jSDK aFj1jSDK;
            int n10;
            int n14;
            int n15;
            Object object3;
            int n16;
            block13: {
                String string2;
                block17: {
                    block18: {
                        int n17;
                        Context context;
                        block16: {
                            block15: {
                                n4 = 2;
                                n3 = 0;
                                n16 = 1;
                                context = this.getMonetizationNetwork().values().AFAdRevenueData;
                                if (context == null) {
                                    e = (registerClient + 89) % 128;
                                    AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
                                    return;
                                }
                                object3 = this.getMonetizationNetwork().AFKeystoreWrapper();
                                object2 = new Object[n16];
                                object2[0] = object3;
                                n15 = System.identityHashCode(object3);
                                n17 = -1684451992;
                                n14 = 1684451992;
                                object3 = (String)AFg1wSDK.getCurrencyIso4217Code((Object[])object2, n17, n14, n15);
                                object2 = ((AFa1oSDK)object).getMediationNetwork;
                                if (object3 == null) break block14;
                                n17 = e + 109;
                                registerClient = n14 = n17 % 128;
                                if ((n17 %= n4) == 0) break block15;
                                n15 = ((String)object3).length();
                                n17 = 13 / 0;
                                if (n15 != 0) break block16;
                                break block14;
                            }
                            n15 = ((String)object3).length();
                            if (n15 == 0) break block14;
                        }
                        object3 = this.getMonetizationNetwork(context);
                        AppsFlyerProperties.getInstance().saveProperties((AFd1rSDK)object3);
                        object2 = this.getMonetizationNetwork().AFKeystoreWrapper();
                        boolean bl2 = ((AFg1wSDK)object2).getCurrencyIso4217Code();
                        if (!bl2) {
                            String string3 = context.getClass().getName();
                            object2 = "sendWithEvent from activity: ";
                            String string4 = ((String)object2).concat(string3);
                            AFLogger.afInfoLog(string4);
                        }
                        n10 = ((AFa1oSDK)object).getRevenue();
                        object2 = this.getMonetizationNetwork((AFa1oSDK)object);
                        n17 = this.isStopped() ^ n16;
                        if (n17 != 0) {
                            String string5 = "AppsFlyerLib.sendWithEvent";
                            AFLogger.afInfoLog(string5);
                        }
                        n15 = AFb1rSDK.getMediationNetwork((AFd1rSDK)object3, false);
                        AFd1qSDK aFd1qSDK = this.getMonetizationNetwork().getMediationNetwork();
                        aFj1jSDK = new AFj1jSDK(aFd1qSDK);
                        String string6 = "";
                        Intrinsics.checkNotNullParameter(object, string6);
                        n14 = (int)(((AFa1oSDK)object).getRevenue() ? 1 : 0);
                        n8 = object instanceof AFh1nSDK;
                        n7 = object instanceof AFh1jSDK;
                        boolean bl3 = object instanceof AFh1lSDK;
                        if (bl3 || n7 != 0) break block17;
                        if (n8 == 0) break block18;
                        AFj1bSDK aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                        string2 = AFj1jSDK.getCurrencyIso4217Code;
                        String string7 = aFj1bSDK.getMonetizationNetwork(string2);
                        break block13;
                    }
                    if (n14 != 0) {
                        e = (registerClient + 65) % 128;
                        AFd1rSDK aFd1rSDK = aFj1jSDK.getRevenue.getRevenue;
                        string2 = "appsFlyerCount";
                        n14 = aFd1rSDK.getMediationNetwork(string2, 0);
                        if (n14 < n4) {
                            AFj1bSDK aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                            string2 = AFj1jSDK.getMediationNetwork;
                            String string8 = aFj1bSDK.getMonetizationNetwork(string2);
                            break block13;
                        } else {
                            AFj1bSDK aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                            string2 = AFj1jSDK.areAllFieldsValid;
                            String string9 = aFj1bSDK.getMonetizationNetwork(string2);
                        }
                        break block13;
                    } else {
                        AFj1bSDK aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                        string2 = AFj1jSDK.component1;
                        String string10 = aFj1bSDK.getMonetizationNetwork(string2);
                    }
                    break block13;
                }
                AFj1bSDK aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                string2 = AFj1jSDK.getMonetizationNetwork;
                String string11 = aFj1bSDK.getMonetizationNetwork(string2);
            }
            String string12 = AFj1jSDK.getMonetizationNetwork(aFj1jSDK.getMediationNetwork((String)var14_37), n8 != 0);
            String string13 = aFj1jSDK.getRevenue(string12);
            Object[] objectArray = new Object[n4];
            objectArray[0] = this;
            objectArray[n16] = object2;
            n14 = System.identityHashCode(this);
            n8 = -1216379940;
            n7 = 1216379960;
            AFb1rSDK.getCurrencyIso4217Code(objectArray, n8, n7, n14);
            AFd1kSDK aFd1kSDK = this.getMonetizationNetwork();
            object = ((AFa1oSDK)object).getRevenue(string13).getRevenue((Map)object2).getMediationNetwork(n15);
            object3 = this.getMonetizationNetwork().unregisterClient().getCurrencyIso4217Code();
            AFc1tSDK aFc1tSDK = new AFc1tSDK(aFd1kSDK, (AFa1oSDK)object, (Map)object3);
            if (n10 != 0) {
                object = this.component2();
                n10 = ((Object)object).length;
                n15 = 0;
                object3 = null;
                while (n3 < n10) {
                    object2 = object[n3];
                    AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK = ((AFj1sSDK)object2).component2;
                    AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK2 = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
                    if (aFj1sSDK$AFa1zSDK == aFj1sSDK$AFa1zSDK2) {
                        String string14 = "Failed to get ";
                        object3 = new StringBuilder(string14);
                        object2 = ((AFj1sSDK)object2).getMonetizationNetwork;
                        ((StringBuilder)object3).append((String)object2);
                        object2 = " referrer, wait ...";
                        ((StringBuilder)object3).append((String)object2);
                        object3 = object3.toString();
                        AFLogger.afDebugLog((String)object3);
                        n15 = 1;
                    }
                    n3 += n16;
                }
                object = this.getMonetizationNetwork().unregisterClient();
                int n18 = object.getMonetizationNetwork();
                if (n18 != 0) {
                    registerClient = n18 = (e + 73) % 128;
                    object = "fetching Facebook deferred AppLink data, wait ...";
                    AFLogger.afDebugLog((String)object);
                    n3 = 1;
                } else {
                    n3 = n15;
                }
                object = this.getMonetizationNetwork().AFKeystoreWrapper();
                n18 = (int)(((AFg1wSDK)object).getMonetizationNetwork() ? 1 : 0);
                if (n18 != 0) {
                    registerClient = n18 = (e + 89) % 128;
                    n3 = 1;
                }
            }
            object = this.getMonetizationNetwork().AFAdRevenueData();
            long l2 = n3 != 0 ? 500L : 0L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            AFj1cSDK.getMonetizationNetwork((ScheduledExecutorService)object, aFc1tSDK, l2, timeUnit);
            return;
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        object = "AppsFlyer will not track this event.";
        AFLogger.afInfoLog((String)object);
        if (object2 == null) return;
        int n19 = e + 85;
        registerClient = n3 = n19 % 128;
        String string15 = "No dev key";
        n19 = (n19 %= n4) != 0 ? 99 : 41;
        object2.onError(n19, string15);
    }

    public final void getRevenue(AFa1oSDK object, AFh1mSDK objectArray) {
        int n3;
        Object object2;
        int n4;
        int n7;
        block7: {
            block8: {
                int n8;
                int n10;
                int n14;
                block6: {
                    n7 = 2;
                    n14 = 1;
                    n4 = e + 107;
                    registerClient = n4 % 128;
                    n10 = 1684451992;
                    n8 = -1684451992;
                    if ((n4 %= n7) == 0) break block6;
                    AFb1rSDK.AFAdRevenueData((AFa1oSDK)object, (AFh1mSDK)objectArray);
                    objectArray = this.getMonetizationNetwork().AFKeystoreWrapper();
                    object2 = new Object[n14];
                    object2[0] = objectArray;
                    n3 = System.identityHashCode(objectArray);
                    objectArray = (String)AFg1wSDK.getCurrencyIso4217Code(object2, n8, n10, n3);
                    n4 = 0 / 0;
                    if (objectArray != null) break block7;
                    break block8;
                }
                AFb1rSDK.AFAdRevenueData((AFa1oSDK)object, (AFh1mSDK)objectArray);
                objectArray = this.getMonetizationNetwork().AFKeystoreWrapper();
                object2 = new Object[n14];
                object2[0] = objectArray;
                n3 = System.identityHashCode(objectArray);
                objectArray = (String)AFg1wSDK.getCurrencyIso4217Code(object2, n8, n10, n3);
                if (objectArray != null) break block7;
            }
            objectArray = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.";
            AFLogger.afWarnLog((String)objectArray);
            object = ((AFa1oSDK)object).getMediationNetwork;
            if (object != null) {
                int n15;
                e = (registerClient + 91) % 128;
                n3 = 41;
                String string2 = "No dev key";
                object.onError(n3, string2);
                registerClient = n15 = (e + 3) % 128;
            }
            return;
        }
        objectArray = AppsFlyerProperties.getInstance();
        object2 = this.getMonetizationNetwork().getRevenue();
        if ((objectArray = objectArray.getReferrer((AFd1rSDK)object2)) == null) {
            n3 = e + 79;
            registerClient = n4 = n3 % 128;
            if ((n3 %= n7) != 0) {
                n3 = 5 / 0;
            }
            objectArray = "";
        }
        ((AFa1oSDK)object).component2 = objectArray;
        objectArray = new Object[n7];
        objectArray[0] = this;
        objectArray[n14] = object;
        int n16 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1781271842, -1781271820, n16);
    }

    public final String getSdkVersion() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (String)AFb1rSDK.getCurrencyIso4217Code(objectArray, 2001963572, -2001963566, n3);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final AppsFlyerLib init(String object, AppsFlyerConversionListener appsFlyerConversionListener, Context object2) {
        int n3;
        int n4 = 0;
        Object var5_5 = null;
        int n7 = 2;
        int n8 = 1;
        registerClient = n3 = (e + 27) % 128;
        int n10 = this.equals ^ n8;
        if (n10 != 0) {
            void var5_12;
            this.equals = n8;
            Object object3 = this.getMonetizationNetwork().AFKeystoreWrapper();
            ((AFg1wSDK)object3).getCurrencyIso4217Code((String)object);
            if (object2 != null) {
                AFg1hSDK aFg1hSDK;
                long l2;
                object3 = new Object[n7];
                object3[0] = this;
                object3[n8] = object2;
                n10 = System.identityHashCode(this);
                int n14 = -608775197;
                int n15 = 608775214;
                AFb1rSDK.getCurrencyIso4217Code((Object[])object3, n14, n15, n10);
                object2 = AFb1qSDK.f_((Context)object2);
                if (object2 == null) return this;
                this.component4 = object2;
                this.getMonetizationNetwork().valueOf().getMonetizationNetwork();
                object2 = this.getMonetizationNetwork().component3();
                ((AFh1oSDK)object2).getMediationNetwork = l2 = System.currentTimeMillis();
                object2 = this.getMonetizationNetwork().copy();
                AFd1kSDK aFd1kSDK = this.getMonetizationNetwork();
                object3 = new AFf1pSDK(aFd1kSDK);
                Executor executor = ((AFe1aSDK)object2).AFAdRevenueData;
                Object object4 = new AFe1aSDK$2((AFe1aSDK)object2, (AFe1eSDK)object3);
                executor.execute((Runnable)object4);
                object2 = this.getMonetizationNetwork().registerClient();
                n3 = Build.VERSION.SDK_INT;
                n10 = 31;
                if (n3 >= n10) {
                    Context context = ((AFi1qSDK)object2).getCurrencyIso4217Code;
                    object3 = new AFi1lSDK(context);
                } else {
                    Context context = ((AFi1qSDK)object2).getCurrencyIso4217Code;
                    object3 = new AFi1sSDK(context);
                }
                ((AFi1qSDK)object2).getMediationNetwork = object3;
                object2 = this.getMonetizationNetwork().afErrorLog();
                object3 = new c_0(this);
                object2.getCurrencyIso4217Code((AFd1eSDK$AFa1vSDK)object3);
                object2 = this.getMonetizationNetwork().component2();
                object3 = this.getMediationNetwork();
                ((AFf1aSDK)object2).AFAdRevenueData((AFg1xSDK)object3);
                object2 = this.getMonetizationNetwork().equals();
                object3 = new d_0(this);
                AFi1eSDK aFi1eSDK = ((AFj1uSDK)object2).AFAdRevenueData((Runnable)object3);
                object3 = ((AFj1uSDK)object2).getRevenue(aFi1eSDK, (Runnable)object3);
                ((AFj1uSDK)object2).getMonetizationNetwork(aFi1eSDK);
                object4 = ((AFj1uSDK)object2).AFAdRevenueData.getMediationNetwork();
                AFj1lSDK aFj1lSDK = new AFj1lSDK((AFd1qSDK)object4, (Runnable)object3);
                ((AFj1uSDK)object2).getMonetizationNetwork(aFj1lSDK);
                object4 = ((AFj1uSDK)object2).AFAdRevenueData;
                AFj1ySDK aFj1ySDK = new AFj1ySDK();
                AFj1zSDK aFj1zSDK = new AFj1zSDK((Runnable)object3, (AFd1kSDK)object4, aFj1ySDK);
                ((AFj1uSDK)object2).getMonetizationNetwork(aFj1zSDK);
                object4 = ((AFj1uSDK)object2).AFAdRevenueData;
                AFj1pSDK aFj1pSDK = new AFj1pSDK((Runnable)object3, (AFd1kSDK)object4);
                ((AFj1uSDK)object2).getMonetizationNetwork(aFj1pSDK);
                AFg1gSDK aFg1gSDK = ((AFj1uSDK)object2).AFAdRevenueData.afDebugLog();
                object4 = AFg1hSDK.getMediationNetwork;
                n10 = (int)(aFg1gSDK.AFAdRevenueData((AFg1hSDK)((Object)object4)) ? 1 : 0);
                if (n10 != 0) {
                    object4 = ((AFj1uSDK)object2).AFAdRevenueData.getMonetizationNetwork();
                    AFd1qSDK aFd1qSDK = ((AFj1uSDK)object2).AFAdRevenueData.getMediationNetwork();
                    AFj1rSDK aFj1rSDK = new AFj1rSDK((ExecutorService)object4, aFd1qSDK, (Runnable)object3);
                    ((AFj1uSDK)object2).getMonetizationNetwork(aFj1rSDK);
                }
                ((AFj1uSDK)object2).getCurrencyIso4217Code((Runnable)object3);
                n10 = (int)(((AFj1uSDK)object2).AFAdRevenueData() ? 1 : 0);
                if (n10 == 0) {
                    Context context = ((AFj1uSDK)object2).AFAdRevenueData.values().AFAdRevenueData;
                    object4 = ((AFj1uSDK)object2).AFAdRevenueData;
                    Object object5 = "com.appsflyer.referrer.INSTALL_PROVIDER";
                    Intent intent = new Intent((String)object5);
                    List list = context.getPackageManager().queryIntentContentProviders(intent, 0);
                    if (list != null && (n15 = (int)(list.isEmpty() ? 1 : 0)) == 0) {
                        int n16;
                        ArrayList<AFj1tSDK> arrayList = new ArrayList<AFj1tSDK>();
                        Iterator iterator = list.iterator();
                        while ((n16 = iterator.hasNext()) != 0) {
                            registerClient = n16 = (e + 25) % 128;
                            object5 = ((ResolveInfo)iterator.next()).providerInfo;
                            if (object5 != null) {
                                AFj1tSDK aFj1tSDK = new AFj1tSDK((ProviderInfo)object5, (Runnable)object3, (AFd1kSDK)object4);
                                arrayList.add(aFj1tSDK);
                                continue;
                            }
                            object5 = AFLogger.INSTANCE;
                            AFh1vSDK aFh1vSDK = AFh1vSDK.w;
                            String string2 = "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component";
                            ((AFh1uSDK)object5).w(aFh1vSDK, string2);
                            e = n16 = (registerClient + 53) % 128;
                        }
                        n3 = (int)(arrayList.isEmpty() ? 1 : 0);
                        if (n3 == 0) {
                            ((AFj1uSDK)object2).getMonetizationNetwork.addAll(arrayList);
                            object3 = AFLogger.INSTANCE;
                            AFh1vSDK aFh1vSDK = AFh1vSDK.w;
                            object5 = "Detected ";
                            object4 = new StringBuilder((String)object5);
                            n15 = arrayList.size();
                            ((StringBuilder)object4).append(n15);
                            String string3 = " valid preinstall provider(s)";
                            ((StringBuilder)object4).append(string3);
                            object4 = object4.toString();
                            ((AFh1uSDK)object3).d(aFh1vSDK, (String)object4);
                        }
                    }
                }
                object3 = ((AFj1uSDK)object2).getCurrencyIso4217Code();
                n10 = ((Object[])object3).length;
                while (n4 < n10) {
                    n14 = registerClient + 59;
                    e = n15 = n14 % 128;
                    if ((n14 %= n7) == 0) {
                        object4 = object3[n4];
                        Context context = ((AFj1uSDK)object2).AFAdRevenueData.values().AFAdRevenueData;
                        ((AFj1sSDK)object4).getMediationNetwork(context);
                        n4 += 52;
                        continue;
                    }
                    object4 = object3[n4];
                    Context context = ((AFj1uSDK)object2).AFAdRevenueData.values().AFAdRevenueData;
                    ((AFj1sSDK)object4).getMediationNetwork(context);
                    n4 += n8;
                }
                object2 = this.getMonetizationNetwork().afDebugLog();
                boolean bl2 = object2.AFAdRevenueData(aFg1hSDK = AFg1hSDK.getCurrencyIso4217Code);
                if (bl2) {
                    this.component1();
                }
                object2 = this.toString.AFKeystoreWrapper();
                AFd1qSDK aFd1qSDK = this.getMonetizationNetwork().getMediationNetwork();
                ((AFg1wSDK)object2).getMediationNetwork(aFd1qSDK);
            } else {
                object2 = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.hashCode;
                String string4 = "context is null, Google Install Referrer will be not initialized";
                ((AFh1uSDK)object2).w(aFh1vSDK, string4);
            }
            object2 = this.getMonetizationNetwork().copydefault();
            if (appsFlyerConversionListener == null) {
                n4 = registerClient;
                n8 = n4 + 103;
                e = n3 = n8 % 128;
                if ((n8 %= n7) == 0) throw null;
                e = n4 = (n4 + 13) % 128;
                String string5 = "null";
            } else {
                String string6 = "conversionDataListener";
            }
            object = new String[]{object, var5_12};
            object2.getMediationNetwork("init", (String[])object);
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.e;
            String string7 = getCurrencyIso4217Code;
            StringBuilder stringBuilder = new StringBuilder("Initializing AppsFlyer SDK: (v6.15.2.");
            stringBuilder.append(string7);
            stringBuilder.append(")");
            String string8 = stringBuilder.toString();
            ((AFLogger)object).force((AFh1vSDK)((Object)object2), string8);
            this.getMonetizationNetwork = appsFlyerConversionListener;
            return this;
        }
        e = (n3 + 51) % 128;
        return this;
    }

    public final boolean isPreInstalledApp(Context context) {
        int n3 = 2;
        registerClient = (e + 25) % 128;
        Object object = new Object[n3];
        object[0] = this;
        object[1] = context;
        int n4 = System.identityHashCode(this);
        int n7 = -608775197;
        int n8 = 608775214;
        AFb1rSDK.getCurrencyIso4217Code((Object[])object, n7, n8, n4);
        object = this.getMonetizationNetwork();
        object.getMediationNetwork();
        boolean bl2 = AFd1qSDK.getMonetizationNetwork(context);
        int n10 = e + 103;
        registerClient = n4 = n10 % 128;
        if ((n10 %= n3) != 0) {
            n3 = 40 / 0;
        }
        return bl2;
    }

    public final boolean isStopped() {
        int n3;
        registerClient = (e + 97) % 128;
        AFg1wSDK aFg1wSDK = this.getMonetizationNetwork().AFKeystoreWrapper();
        boolean bl2 = aFg1wSDK.getCurrencyIso4217Code();
        int n4 = registerClient + 97;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return bl2;
        }
        throw null;
    }

    public final void logAdRevenue(AFAdRevenueData objectArray, Map object) {
        int n3;
        int n4;
        int n7;
        block7: {
            block8: {
                block6: {
                    int n8;
                    n7 = 1;
                    n4 = 2;
                    n3 = e + 9;
                    registerClient = n8 = n3 % 128;
                    if ((n3 %= n4) == 0) break block6;
                    n3 = (int)(this.equals ? 1 : 0);
                    n8 = 41 / 0;
                    if (n3 != 0) break block7;
                    break block8;
                }
                n3 = (int)(this.equals ? 1 : 0);
                if (n3 != 0) break block7;
            }
            AFb1rSDK.getMediationNetwork("logAdRevenue");
            return;
        }
        if ((n3 = (int)(objectArray.areAllFieldsValid() ? 1 : 0)) == 0) {
            objectArray = AFLogger.INSTANCE;
            object = AFh1vSDK.registerClient;
            objectArray.w((AFh1vSDK)((Object)object), "Invalid ad revenue parameters provided");
            return;
        }
        Object object2 = this.getMonetizationNetwork().AFKeystoreWrapper();
        n3 = (int)(((AFg1wSDK)object2).getCurrencyIso4217Code() ? 1 : 0);
        if (n3 != 0) {
            objectArray = AFLogger.INSTANCE;
            object = AFh1vSDK.registerClient;
            objectArray.w((AFh1vSDK)((Object)object), "SDK is stopped");
            return;
        }
        object2 = this.getMonetizationNetwork().AFKeystoreWrapper();
        Object[] objectArray2 = new Object[n7];
        objectArray2[0] = object2;
        n3 = System.identityHashCode(object2);
        int n10 = -1684451992;
        int n14 = 1684451992;
        object2 = (String)AFg1wSDK.getCurrencyIso4217Code(objectArray2, n10, n14, n3);
        if ((n3 = (int)(AFc1sSDK.getRevenue((String)object2) ? 1 : 0)) != 0) {
            e = (registerClient + 83) % 128;
            AFb1rSDK.equals();
            return;
        }
        object2 = new AFh1nSDK((AFAdRevenueData)objectArray, (Map)object);
        objectArray = new Object[n4];
        objectArray[0] = this;
        objectArray[n7] = object2;
        int n15 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1781271842, -1781271820, n15);
        registerClient = (e + 49) % 128;
    }

    public final void logEvent(Context context, String string2, Map map2) {
        Object[] objectArray = new Object[]{this, context, string2, map2};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1252837027, -1252837011, n3);
    }

    public final void logEvent(Context object, String object2, Map object3, AppsFlyerRequestListener stringArray) {
        HashMap<String, Float> hashMap;
        Object object4;
        boolean bl2 = true;
        float f5 = Float.MIN_VALUE;
        object3 = object3 == null ? null : (object4 = new HashMap(object3));
        int n3 = 2;
        object4 = new Object[n3];
        HashMap<Object, Object> hashMap2 = null;
        object4[0] = this;
        object4[bl2] = object;
        int n4 = System.identityHashCode(this);
        int n7 = -608775197;
        float f6 = -1.02922835E17f;
        int n8 = 608775214;
        float f7 = 4.362235E-17f;
        AFb1rSDK.getCurrencyIso4217Code((Object[])object4, n7, n8, n4);
        object4 = new AFh1eSDK();
        ((AFa1oSDK)object4).areAllFieldsValid = object2;
        ((AFa1oSDK)object4).getMediationNetwork = stringArray;
        if (object3 != null && (n4 = (int)(object3.containsKey(stringArray = "af_touch_obj") ? 1 : 0)) != 0) {
            hashMap2 = new HashMap<Object, Object>();
            Object object5 = object3.get(stringArray);
            n8 = object5 instanceof MotionEvent;
            if (n8 != 0) {
                object5 = (MotionEvent)object5;
                hashMap = new HashMap();
                Object object6 = Float.valueOf(object5.getX());
                hashMap.put("x", (Float)object6);
                f7 = object5.getY();
                object6 = Float.valueOf(f7);
                String string2 = "y";
                hashMap.put(string2, (Float)object6);
                hashMap2.put("loc", hashMap);
                hashMap = Float.valueOf(object5.getPressure());
                object6 = "pf";
                hashMap2.put(object6, hashMap);
                f5 = object5.getTouchMajor();
                n7 = 0x40000000;
                f6 = 2.0f;
                hashMap = Float.valueOf(f5 /= f6);
                object5 = "rad";
                hashMap2.put(object5, hashMap);
            } else {
                String string3 = "Parsing failed due to invalid input in 'af_touch_obj'.";
                hashMap2.put("error", string3);
                object5 = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.unregisterClient;
                ((AFLogger)object5).w(aFh1vSDK, string3, bl2);
            }
            hashMap = Collections.singletonMap("tch_data", hashMap2);
            object3.remove(stringArray);
            ((AFa1oSDK)object4).getRevenue(hashMap);
        }
        ((AFa1oSDK)object4).getCurrencyIso4217Code = object3;
        object3 = this.getMonetizationNetwork().copydefault();
        hashMap = ((AFa1oSDK)object4).getCurrencyIso4217Code;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        stringArray = new JSONObject((Map)hashMap);
        stringArray = stringArray.toString();
        stringArray = new String[]{object2, stringArray};
        hashMap = "logEvent";
        object3.getMediationNetwork((String)((Object)hashMap), stringArray);
        if (object2 == null) {
            object2 = AFh1qSDK.getMediationNetwork;
            this.getCurrencyIso4217Code((Context)object, (AFh1qSDK)((Object)object2));
        }
        object = this.component3((Context)object);
        this.getRevenue((AFa1oSDK)object4, (AFh1mSDK)object);
    }

    public final void logLocation(Context context, double d2, double d5) {
        HashMap<String, String> hashMap = this.getMonetizationNetwork().copydefault();
        String[] stringArray = String.valueOf(d2);
        String string2 = String.valueOf(d5);
        stringArray = new String[]{stringArray, string2};
        hashMap.getMediationNetwork("logLocation", stringArray);
        hashMap = new HashMap<String, String>();
        String string3 = Double.toString(d5);
        hashMap.put("af_long", string3);
        String string4 = Double.toString(d2);
        hashMap.put("af_lat", string4);
        this.getRevenue(context, "af_location_coordinates", hashMap);
        e = (registerClient + 61) % 128;
    }

    public final void logSession(Context context) {
        e = (registerClient + 43) % 128;
        Object object = this.getMonetizationNetwork().copydefault();
        String[] stringArray = new String[]{};
        object.getMediationNetwork("logSession", stringArray);
        this.getMonetizationNetwork().copydefault().getRevenue();
        object = AFh1qSDK.getCurrencyIso4217Code;
        this.getCurrencyIso4217Code(context, (AFh1qSDK)((Object)object));
        this.getRevenue(context, null, null);
        e = (registerClient + 7) % 128;
    }

    public final void onPause(Context object) {
        int n3 = registerClient + 7;
        e = n3 % 128;
        if ((n3 %= 2) != 0) {
            int n4;
            object = this.getMonetizationNetwork().w();
            object.AFAdRevenueData();
            n3 = registerClient + 123;
            e = n4 = n3 % 128;
            if ((n3 %= 2) != 0) {
                return;
            }
            throw null;
        }
        this.getMonetizationNetwork().w().AFAdRevenueData();
        throw null;
    }

    public final void performOnAppAttribution(Context object, URI object2) {
        int n3;
        int n4 = 2;
        int n7 = e + 101;
        registerClient = n3 = n7 % 128;
        if ((n7 %= n4) == 0) {
            String string2 = "\"";
            if (object2 != null) {
                int n8;
                e = n8 = (n3 += 75) % 128;
                if ((n3 %= n4) != 0) {
                    String string3 = object2.toString();
                    n3 = (int)(string3.isEmpty() ? 1 : 0);
                    if (n3 == 0) {
                        if (object == null) {
                            object2 = this.getMonetizationNetwork().d();
                            Object object3 = new StringBuilder("Context is \"");
                            object3.append(object);
                            object3.append(string2);
                            object = ((Object)object3).toString();
                            object3 = DeepLinkResult$Error.NETWORK;
                            ((AFc1kSDK)object2).getMonetizationNetwork((String)object, (DeepLinkResult$Error)((Object)object3));
                            return;
                        }
                        Object object4 = new Object[n4];
                        object4[0] = this;
                        object4[1] = object;
                        int n10 = System.identityHashCode(this);
                        AFb1rSDK.getCurrencyIso4217Code(object4, -608775197, 608775214, n10);
                        object = this.getMonetizationNetwork().d();
                        object4 = AFc1oSDK.AFAdRevenueData(this.getMonetizationNetwork().afInfoLog());
                        object2 = Uri.parse((String)object2.toString());
                        ((AFc1kSDK)object).o_((AFc1oSDK)object4, (Uri)object2);
                        return;
                    }
                } else {
                    object2.toString().isEmpty();
                    throw null;
                }
            }
            object = this.getMonetizationNetwork().d();
            Object object5 = new StringBuilder("Link is \"");
            object5.append(object2);
            object5.append(string2);
            object2 = ((Object)object5).toString();
            object5 = DeepLinkResult$Error.NETWORK;
            ((AFc1kSDK)object).getMonetizationNetwork((String)object2, (DeepLinkResult$Error)((Object)object5));
            return;
        }
        throw null;
    }

    public final void performOnDeepLinking(Intent object, Context context) {
        int n3;
        Object object2;
        int n4;
        block5: {
            block6: {
                block4: {
                    int n7;
                    n4 = 0;
                    object2 = null;
                    n3 = 2;
                    int n8 = e + 71;
                    registerClient = n7 = n8 % 128;
                    if ((n8 %= n3) == 0) break block4;
                    n8 = 33 / 0;
                    if (object != null) break block5;
                    break block6;
                }
                if (object != null) break block5;
            }
            object = this.getMonetizationNetwork().d();
            object2 = DeepLinkResult$Error.DEVELOPER_ERROR;
            ((AFc1kSDK)object).getMonetizationNetwork("performOnDeepLinking was called with null intent", (DeepLinkResult$Error)((Object)object2));
            return;
        }
        if (context == null) {
            object = this.getMonetizationNetwork().d();
            object2 = DeepLinkResult$Error.DEVELOPER_ERROR;
            ((AFc1kSDK)object).getMonetizationNetwork("performOnDeepLinking was called with null context", (DeepLinkResult$Error)((Object)object2));
            registerClient = (e + 7) % 128;
            return;
        }
        context = context.getApplicationContext();
        Object object3 = new Object[n3];
        object3[0] = this;
        object3[1] = context;
        n4 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(object3, -608775197, 608775214, n4);
        object2 = this.getMonetizationNetwork().getMonetizationNetwork();
        object3 = new a_0(this, context, (Intent)object);
        object2.execute((Runnable)object3);
    }

    public final void registerConversionListener(Context object, AppsFlyerConversionListener appsFlyerConversionListener) {
        registerClient = (e + 123) % 128;
        object = this.getMonetizationNetwork().copydefault();
        String[] stringArray = new String[]{};
        object.getMediationNetwork("registerConversionListener", stringArray);
        this.getCurrencyIso4217Code(appsFlyerConversionListener);
        e = (registerClient + 123) % 128;
    }

    public final void registerValidatorListener(Context object, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int n3;
        int n4;
        registerClient = n4 = (e + 117) % 128;
        object = this.getMonetizationNetwork().copydefault();
        String[] stringArray = new String[]{};
        String string2 = "registerValidatorListener";
        object.getMediationNetwork(string2, stringArray);
        object = "registerValidatorListener called";
        AFLogger.afDebugLog((String)object);
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            registerClient = (e + 113) % 128;
            return;
        }
        getMediationNetwork = appsFlyerInAppPurchaseValidatorListener;
        n4 = registerClient + 103;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return;
        }
        throw null;
    }

    public final void sendInAppPurchaseData(Context object, Map object2, PurchaseHandler$PurchaseValidationCallback object3) {
        int n3;
        int n4 = 2;
        registerClient = (e + 33) % 128;
        Object object4 = new Object[n4];
        AFd1kSDK aFd1kSDK = null;
        object4[0] = this;
        object4[1] = object;
        int n7 = System.identityHashCode(this);
        int n8 = -608775197;
        int n10 = 608775214;
        AFb1rSDK.getCurrencyIso4217Code(object4, n8, n10, n7);
        object = this.getMonetizationNetwork().areAllFieldsValid();
        object4 = new String[]{"purchases"};
        boolean bl2 = ((PurchaseHandler)object).getCurrencyIso4217Code((Map)object2, (PurchaseHandler$PurchaseValidationCallback)object3, (String[])object4);
        if (bl2) {
            aFd1kSDK = ((PurchaseHandler)object).getRevenue;
            object4 = new AFf1nSDK((Map)object2, (PurchaseHandler$PurchaseValidationCallback)object3, aFd1kSDK);
            object = ((PurchaseHandler)object).getMediationNetwork;
            object2 = ((AFe1aSDK)object).AFAdRevenueData;
            object3 = new AFe1aSDK$2((AFe1aSDK)object, (AFe1eSDK)object4);
            object2.execute((Runnable)object3);
        }
        n7 = registerClient + 81;
        e = n3 = n7 % 128;
        if ((n7 %= n4) != 0) {
            return;
        }
        throw null;
    }

    public final void sendPurchaseData(Context object, Map object2, PurchaseHandler$PurchaseValidationCallback object3) {
        e = (registerClient + 77) % 128;
        Object object4 = new Object[2];
        AFd1kSDK aFd1kSDK = null;
        object4[0] = this;
        object4[1] = object;
        int n3 = System.identityHashCode(this);
        int n4 = -608775197;
        int n7 = 608775214;
        AFb1rSDK.getCurrencyIso4217Code(object4, n4, n7, n3);
        object = this.getMonetizationNetwork().areAllFieldsValid();
        object4 = new String[]{"subscriptions"};
        boolean bl2 = ((PurchaseHandler)object).getCurrencyIso4217Code((Map)object2, (PurchaseHandler$PurchaseValidationCallback)object3, (String[])object4);
        if (bl2) {
            aFd1kSDK = ((PurchaseHandler)object).getRevenue;
            object4 = new AFf1rSDK((Map)object2, (PurchaseHandler$PurchaseValidationCallback)object3, aFd1kSDK);
            object = ((PurchaseHandler)object).getMediationNetwork;
            object2 = ((AFe1aSDK)object).AFAdRevenueData;
            object3 = new AFe1aSDK$2((AFe1aSDK)object, (AFe1eSDK)object4);
            object2.execute((Runnable)object3);
        }
        e = (registerClient + 97) % 128;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void sendPushNotificationData(Activity activity) {
        block14: {
            long l2;
            Object object;
            Object object2;
            Object object3;
            AFb1rSDK aFb1rSDK;
            block16: {
                int n3;
                long l3;
                String string2;
                block17: {
                    String string3;
                    Object object4;
                    block15: {
                        String[] stringArray;
                        Object object5;
                        aFb1rSDK = this;
                        object3 = "c";
                        object2 = "pid";
                        int n4 = registerClient + 41;
                        e = n4 % 128;
                        int n7 = 2;
                        if ((n4 %= n7) == 0) {
                            throw null;
                        }
                        n4 = 1;
                        object = "sendPushNotificationData";
                        if (activity != null && (object5 = activity.getIntent()) != null) {
                            object5 = this.getMonetizationNetwork().copydefault();
                            stringArray = activity.getLocalClassName();
                            object4 = new StringBuilder("activity_intent_");
                            string2 = activity.getIntent().toString();
                            ((StringBuilder)object4).append(string2);
                            object4 = object4.toString();
                            stringArray = new String[]{stringArray, object4};
                            object5.getMediationNetwork((String)object, stringArray);
                        } else if (activity != null) {
                            int n8;
                            int n10 = e + 113;
                            registerClient = n8 = n10 % 128;
                            stringArray = "activity_intent_null";
                            if ((n10 %= n7) != 0) {
                                object5 = this.getMonetizationNetwork().copydefault();
                                int n14 = 5;
                                object4 = new String[n14];
                                string2 = null;
                                object4[0] = string3 = activity.getLocalClassName();
                                object4[n4] = stringArray;
                                object5.getMediationNetwork((String)object, (String[])object4);
                            } else {
                                object5 = this.getMonetizationNetwork().copydefault();
                                object4 = activity.getLocalClassName();
                                stringArray = new String[]{object4, stringArray};
                                object5.getMediationNetwork((String)object, stringArray);
                            }
                        } else {
                            object5 = this.getMonetizationNetwork().copydefault();
                            stringArray = new String[]{"activity_null"};
                            object5.getMediationNetwork((String)object, stringArray);
                        }
                        object = this.getMonetizationNetwork().e();
                        ((AFd1tSDK)object).AFAdRevenueData = object5 = AFb1rSDK.getCurrencyIso4217Code(activity);
                        if (object5 == null) break block14;
                        l2 = System.currentTimeMillis();
                        object4 = aFb1rSDK.copy;
                        string2 = ")";
                        if (object4 != null) break block15;
                        AFLogger.afInfoLog("pushes: initializing pushes history..");
                        object3 = new ConcurrentHashMap();
                        aFb1rSDK.copy = object3;
                        l3 = l2;
                        object3 = AppsFlyerProperties.getInstance();
                        n4 = 2;
                        n3 = ((AppsFlyerProperties)object3).getInt("pushPayloadHistorySize", n4);
                        object2 = aFb1rSDK.copy;
                        int n15 = object2.size();
                        if (n15 != n3) break block16;
                        break block17;
                    }
                    try {
                        object4 = AppsFlyerProperties.getInstance();
                        string3 = "pushPayloadMaxAging";
                        long l4 = 1800000L;
                        long l7 = ((AppsFlyerProperties)object4).getLong(string3, l4);
                        object4 = aFb1rSDK.copy;
                        object4 = object4.keySet();
                        object4 = object4.iterator();
                    }
                    finally {
                        l3 = l2;
                    }
                }
                object3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                ((StringBuilder)object3).append(l3);
                ((StringBuilder)object3).append(string2);
                AFLogger.afInfoLog(object3.toString());
                object3 = aFb1rSDK.copy;
                object2 = l3;
                object3.remove(object2);
                e = n3 = (registerClient + 111) % 128;
            }
            object3 = aFb1rSDK.copy;
            object2 = l2;
            String string4 = ((AFd1tSDK)object).AFAdRevenueData;
            object3.put(object2, string4);
            this.start((Context)activity);
        }
        e = (registerClient + 59) % 128;
    }

    public final void setAdditionalData(Map object) {
        int n3 = e + 61;
        registerClient = n3 % 128;
        if ((n3 %= 2) == 0) {
            if (object != null) {
                Object object2 = this.getMonetizationNetwork().copydefault();
                String[] stringArray = object.toString();
                stringArray = new String[]{stringArray};
                String string2 = "setAdditionalData";
                object2.getMediationNetwork(string2, stringArray);
                object2 = new JSONObject((Map)object);
                object = AppsFlyerProperties.getInstance();
                object2 = object2.toString();
                ((AppsFlyerProperties)object).setCustomData((String)object2);
            }
            int n4 = registerClient + 47;
            e = n3 = n4 % 128;
            if ((n4 %= 2) != 0) {
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void setAndroidIdData(String string2) {
        Object[] objectArray = new Object[]{this, string2};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1241603377, -1241603372, n3);
    }

    public final void setAppId(String string2) {
        int n3;
        e = (registerClient + 105) % 128;
        Object object = this.getMonetizationNetwork().copydefault();
        String string3 = "setAppId";
        String[] stringArray = new String[]{string2};
        object.getMediationNetwork(string3, stringArray);
        object = "appid";
        AFb1rSDK.getMediationNetwork((String)object, string2);
        int n4 = e + 49;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return;
        }
        throw null;
    }

    public final void setAppInviteOneLink(String string2) {
        String string3;
        block5: {
            Object object;
            block3: {
                int n3;
                int n4;
                block4: {
                    String string4;
                    String string5;
                    block2: {
                        int n7;
                        n4 = e + 33;
                        registerClient = n7 = n4 % 128;
                        string3 = "oneLinkSlug";
                        n3 = 1;
                        string5 = "setAppInviteOneLink = ";
                        string4 = "setAppInviteOneLink";
                        if ((n4 %= 2) == 0) break block2;
                        object = this.getMonetizationNetwork().copydefault();
                        String[] stringArray = new String[]{};
                        stringArray[n3] = string2;
                        object.getMediationNetwork(string4, stringArray);
                        object = String.valueOf(string2);
                        object = string5.concat((String)object);
                        AFLogger.afInfoLog((String)object);
                        if (string2 == null) break block3;
                        break block4;
                    }
                    object = this.getMonetizationNetwork().copydefault();
                    String[] stringArray = new String[]{string2};
                    object.getMediationNetwork(string4, stringArray);
                    object = String.valueOf(string2);
                    object = string5.concat((String)object);
                    AFLogger.afInfoLog((String)object);
                    if (string2 == null) break block3;
                }
                object = AppsFlyerProperties.getInstance().getString(string3);
                n4 = string2.equals(object) ^ n3;
                if (n4 == 0) break block5;
            }
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            object = AppsFlyerProperties.getInstance();
            String string6 = "onelinkScheme";
            ((AppsFlyerProperties)object).remove(string6);
        }
        AFb1rSDK.getMediationNetwork(string3, string2);
        registerClient = (e + 55) % 128;
    }

    public final void setCollectAndroidID(boolean bl2) {
        Boolean bl3 = bl2;
        Object[] objectArray = new Object[]{this, bl3};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1505293153, -1505293144, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setCollectIMEI(boolean bl2) {
        Object object;
        int n3;
        int n4 = e + 113;
        registerClient = n3 = n4 % 128;
        String string2 = "collectIMEIForceByUser";
        String string3 = "collectIMEI";
        String string4 = "setCollectIMEI";
        if ((n4 %= 2) != 0) {
            String string5;
            object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = new String[]{};
            int n7 = 1;
            stringArray[n7] = string5 = String.valueOf(bl2);
            object.getMediationNetwork(string4, stringArray);
        } else {
            object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = String.valueOf(bl2);
            stringArray = new String[]{stringArray};
            object.getMediationNetwork(string4, stringArray);
        }
        object = Boolean.toString(bl2);
        AFb1rSDK.getMediationNetwork(string3, (String)object);
        String string6 = Boolean.toString(bl2);
        AFb1rSDK.getMediationNetwork(string2, string6);
        e = (registerClient + 59) % 128;
    }

    public final void setCollectOaid(boolean bl2) {
        e = (registerClient + 19) % 128;
        AFb1cSDK aFb1cSDK = this.getMonetizationNetwork().copydefault();
        String[] stringArray = String.valueOf(bl2);
        stringArray = new String[]{stringArray};
        aFb1cSDK.getMediationNetwork("setCollectOaid", stringArray);
        String string2 = Boolean.toString(bl2);
        AFb1rSDK.getMediationNetwork("collectOAID", string2);
        registerClient = (e + 31) % 128;
    }

    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int n3;
        int n4 = registerClient + 55;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            Objects.requireNonNull(appsFlyerConsent);
            this.getMonetizationNetwork().e().component1 = appsFlyerConsent;
            registerClient = (e + 33) % 128;
            return;
        }
        Objects.requireNonNull(appsFlyerConsent);
        this.getMonetizationNetwork().e().component1 = appsFlyerConsent;
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setCurrencyCode(String string2) {
        Object object;
        int n3;
        int n4 = e + 115;
        registerClient = n3 = n4 % 128;
        String string3 = "currencyCode";
        String string4 = "setCurrencyCode";
        if ((n4 %= 2) != 0) {
            object = this.getMonetizationNetwork().copydefault();
            Object var7_7 = null;
            String[] stringArray = new String[]{};
            stringArray[0] = string2;
            object.getMediationNetwork(string4, stringArray);
        } else {
            object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = new String[]{string2};
            object.getMediationNetwork(string4, stringArray);
        }
        object = AppsFlyerProperties.getInstance();
        ((AppsFlyerProperties)object).set(string3, string2);
    }

    public final void setCustomerIdAndLogSession(String string2, Context context) {
        Object[] objectArray = new Object[]{this, string2, context};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 231975276, -231975269, n3);
    }

    public final void setCustomerUserId(String string2) {
        e = (registerClient + 109) % 128;
        Object object = this.getMonetizationNetwork().copydefault();
        String[] stringArray = new String[]{string2};
        object.getMediationNetwork("setCustomerUserId", stringArray);
        object = String.valueOf(string2);
        AFLogger.afInfoLog("setCustomerUserId = ".concat((String)object));
        AFb1rSDK.getMediationNetwork("AppUserId", string2);
        AFb1rSDK.AFAdRevenueData("waitForCustomerId", false);
        e = (registerClient + 115) % 128;
    }

    public final void setDebugLog(boolean bl2) {
        int n3;
        int n4 = registerClient + 81;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            AFLogger$LogLevel aFLogger$LogLevel;
            if (bl2) {
                aFLogger$LogLevel = AFLogger$LogLevel.DEBUG;
            } else {
                aFLogger$LogLevel = AFLogger$LogLevel.NONE;
                e = n4 = (registerClient + 41) % 128;
            }
            this.setLogLevel(aFLogger$LogLevel);
            return;
        }
        throw null;
    }

    public final void setDisableAdvertisingIdentifiers(boolean bl2) {
        Boolean bl3 = bl2;
        Object[] objectArray = new Object[]{this, bl3};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -1685759045, 1685759055, n3);
    }

    public final void setDisableNetworkData(boolean bl2) {
        registerClient = (e + 87) % 128;
        String string2 = String.valueOf(bl2);
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(string2));
        AFb1rSDK.AFAdRevenueData("disableCollectNetworkData", bl2);
        e = (registerClient + 71) % 128;
    }

    public final void setExtension(String string2) {
        int n3;
        registerClient = (e + 69) % 128;
        Object object = this.getMonetizationNetwork().copydefault();
        String[] stringArray = new String[]{string2};
        object.getMediationNetwork("setExtension", stringArray);
        object = AppsFlyerProperties.getInstance();
        String string3 = "sdkExtension";
        ((AppsFlyerProperties)object).set(string3, string2);
        int n4 = e + 85;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return;
        }
        throw null;
    }

    public final void setHost(String string2, String string3) {
        registerClient = (e + 83) % 128;
        int n3 = AFc1sSDK.getMonetizationNetwork(string3);
        if (n3 == 0) {
            n3 = e + 69;
            registerClient = n3 % 128;
            if ((n3 %= 2) == 0) {
                int n4;
                if (string2 != null) {
                    string2 = string2.trim();
                    registerClient = n3 = (e + 31) % 128;
                } else {
                    string2 = "";
                }
                string3 = string3.trim();
                AFe1hSDK aFe1hSDK = new AFe1hSDK(string2, string3);
                AFe1iSDK.getMonetizationNetwork(aFe1hSDK);
                int n7 = e + 23;
                registerClient = n4 = n7 % 128;
                if ((n7 %= 2) == 0) {
                    return;
                }
                throw null;
            }
            throw null;
        }
        AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
    }

    public final void setImeiData(String string2) {
        int n3 = 1;
        int n4 = 2;
        int n7 = e + 11;
        registerClient = n7 % 128;
        int n8 = -1318882909;
        int n10 = 1318882910;
        String string3 = "setImeiData";
        if ((n7 %= n4) != 0) {
            Object object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = new String[]{};
            stringArray[n3] = string2;
            object.getMediationNetwork(string3, stringArray);
            object = this.getMonetizationNetwork().AFKeystoreWrapper();
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            objectArray[n3] = string2;
            int n14 = System.identityHashCode(object);
            AFg1wSDK.getCurrencyIso4217Code(objectArray, n10, n8, n14);
        } else {
            Object object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = new String[]{string2};
            object.getMediationNetwork(string3, stringArray);
            object = this.getMonetizationNetwork().AFKeystoreWrapper();
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            objectArray[n3] = string2;
            int n15 = System.identityHashCode(object);
            AFg1wSDK.getCurrencyIso4217Code(objectArray, n10, n8, n15);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setIsUpdate(boolean bl2) {
        Object object;
        int n3;
        int n4 = e + 109;
        registerClient = n3 = n4 % 128;
        String string2 = "IS_UPDATE";
        String string3 = "setIsUpdate";
        if ((n4 %= 2) != 0) {
            String string4;
            object = this.getMonetizationNetwork().copydefault();
            int n7 = 1;
            String[] stringArray = new String[n7];
            stringArray[n7] = string4 = String.valueOf(bl2);
            object.getMediationNetwork(string3, stringArray);
        } else {
            object = this.getMonetizationNetwork().copydefault();
            String[] stringArray = String.valueOf(bl2);
            stringArray = new String[]{stringArray};
            object.getMediationNetwork(string3, stringArray);
        }
        object = AppsFlyerProperties.getInstance();
        ((AppsFlyerProperties)object).set(string2, bl2);
    }

    public final void setLogLevel(AFLogger$LogLevel aFLogger$LogLevel) {
        int n3 = aFLogger$LogLevel.getLevel();
        Object object = AFLogger$LogLevel.NONE;
        int n4 = object.getLevel();
        boolean bl2 = false;
        if (n3 > n4) {
            int n7;
            n3 = e;
            n4 = n3 + 73;
            registerClient = n7 = n4 % 128;
            if ((n4 %= 2) == 0) {
                bl2 = true;
            }
            registerClient = n3 = (n3 + 99) % 128;
        }
        Object object2 = this.getMonetizationNetwork().copydefault();
        object = String.valueOf(bl2);
        object = new String[]{object};
        String string2 = "log";
        object2.getMediationNetwork(string2, (String)object);
        object2 = AppsFlyerProperties.getInstance();
        object = "logLevel";
        int n8 = aFLogger$LogLevel.getLevel();
        ((AppsFlyerProperties)object2).set((String)object, n8);
        if (!bl2) {
            this.getMonetizationNetwork().i().AFAdRevenueData();
            e = (registerClient + 5) % 128;
            return;
        }
        this.getMonetizationNetwork().i().component1();
    }

    public final void setMinTimeBetweenSessions(int n3) {
        int n4;
        long l2;
        registerClient = (e + 113) % 128;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long l3 = n3;
        this.copydefault = l2 = timeUnit.toMillis(l3);
        n3 = registerClient + 27;
        e = n4 = n3 % 128;
        if ((n3 %= 2) == 0) {
            n3 = 22 / 0;
        }
    }

    public final void setOaidData(String string2) {
        int n3;
        e = (registerClient + 81) % 128;
        AFb1cSDK aFb1cSDK = this.getMonetizationNetwork().copydefault();
        String string3 = "setOaidData";
        String[] stringArray = new String[]{string2};
        aFb1cSDK.getMediationNetwork(string3, stringArray);
        AFb1vSDK.getRevenue = string2;
        int n4 = e + 59;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return;
        }
        throw null;
    }

    public final void setOneLinkCustomDomain(String ... stringArray) {
        Object[] objectArray = new Object[]{this, stringArray};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1539108454, -1539108439, n3);
    }

    public final void setOutOfStore(String string2) {
        int n3 = registerClient;
        e = (n3 + 35) % 128;
        boolean bl2 = true;
        if (string2 != null) {
            e = (n3 += 119) % 128;
            n3 %= 2;
            Locale locale = Locale.getDefault();
            string2 = string2.toLowerCase(locale);
            AppsFlyerProperties.getInstance().set("api_store_value", string2);
            string2 = String.valueOf(string2);
            AFLogger.afInfoLog("Store API set with value: ".concat(string2), bl2);
            return;
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", bl2);
    }

    public final void setPartnerData(String string2, Map map2) {
        Object[] objectArray = new Object[]{this, string2, map2};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -1784713538, 1784713556, n3);
    }

    public final void setPhoneNumber(String string2) {
        int n3;
        int n4 = e + 11;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            AFd1tSDK aFd1tSDK = this.getMonetizationNetwork().e();
            aFd1tSDK.getCurrencyIso4217Code = string2 = AFb1jSDK.getMonetizationNetwork(string2);
            int cfr_ignored_0 = 77 / 0;
        } else {
            AFd1tSDK aFd1tSDK = this.getMonetizationNetwork().e();
            aFd1tSDK.getCurrencyIso4217Code = string2 = AFb1jSDK.getMonetizationNetwork(string2);
        }
    }

    public final void setPluginInfo(PluginInfo pluginInfo) {
        int n3;
        int n4 = registerClient + 117;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            Objects.requireNonNull(pluginInfo);
            this.getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
            return;
        }
        Objects.requireNonNull(pluginInfo);
        this.getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
        throw null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setPreinstallAttribution(String string2, String string3, String string4) {
        int n3;
        String string5;
        JSONObject jSONObject;
        block8: {
            JSONException jSONException2;
            block7: {
                AFLogger.afDebugLog("setPreinstallAttribution API called");
                jSONObject = new JSONObject();
                string5 = "pid";
                if (string2 != null) {
                    try {
                        jSONObject.put(string5, (Object)string2);
                        registerClient = n3 = (e + 73) % 128;
                    }
                    catch (JSONException jSONException2) {
                        break block7;
                    }
                }
                if (string3 != null) {
                    e = n3 = (registerClient + 119) % 128;
                    string2 = "c";
                    {
                        jSONObject.put(string2, (Object)string3);
                    }
                }
                if (string4 == null) break block8;
                e = n3 = (registerClient + 103) % 128;
                string2 = "af_siteid";
                {
                    jSONObject.put(string2, (Object)string4);
                    break block8;
                }
            }
            string3 = jSONException2.getMessage();
            AFLogger.afErrorLog(string3, jSONException2);
        }
        if ((n3 = (int)(jSONObject.has(string5) ? 1 : 0)) != 0) {
            string3 = jSONObject.toString();
            AFb1rSDK.getMediationNetwork("preInstallName", string3);
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    public final void setResolveDeepLinkURLs(String ... object) {
        int n3;
        registerClient = (e + 113) % 128;
        Object object2 = Arrays.toString(object);
        String string2 = "setResolveDeepLinkURLs ";
        Object object3 = new StringBuilder(string2);
        ((StringBuilder)object3).append((String)object2);
        AFLogger.afDebugLog(((StringBuilder)object3).toString());
        object2 = this.getMonetizationNetwork().d();
        object3 = ((AFc1kSDK)object2).component4;
        object3.clear();
        object2 = ((AFc1kSDK)object2).component4;
        object = Arrays.asList(object);
        object2.addAll(object);
        int n4 = registerClient + 51;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return;
        }
        throw null;
    }

    public final void setSharingFilter(String ... stringArray) {
        int n3;
        int n4 = registerClient + 91;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            this.setSharingFilterForPartners(stringArray);
            return;
        }
        this.setSharingFilterForPartners(stringArray);
        throw null;
    }

    public final void setSharingFilterForAllPartners() {
        int n3;
        int n4 = e + 81;
        registerClient = n3 = n4 % 128;
        String string2 = "all";
        if ((n4 %= 2) != 0) {
            String[] stringArray = new String[]{string2};
            this.setSharingFilterForPartners(stringArray);
        } else {
            String[] stringArray = new String[]{string2};
            this.setSharingFilterForPartners(stringArray);
        }
        n4 = e + 35;
        registerClient = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            n4 = 74 / 0;
        }
    }

    public final void setSharingFilterForPartners(String ... stringArray) {
        Object[] objectArray = new Object[]{this, stringArray};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -2050013962, 2050013970, n3);
    }

    public final void setUserEmails(AppsFlyerProperties$EmailsCryptType object, String ... object2) {
        int n3 = ((String[])object2).length + 1;
        Object object3 = new ArrayList(n3);
        ArrayList<String> arrayList = ((Object)object).toString();
        ((ArrayList)object3).add(arrayList);
        arrayList = Arrays.asList(object2);
        ((ArrayList)object3).addAll(arrayList);
        arrayList = this.getMonetizationNetwork().copydefault();
        Object object4 = new String[((String[])object2).length + 1];
        object3 = ((ArrayList)object3).toArray((T[])object4);
        object4 = "setUserEmails";
        arrayList.getMediationNetwork((String)object4, (String[])object3);
        object3 = AppsFlyerProperties.getInstance();
        int n4 = object.getValue();
        ((AppsFlyerProperties)object3).set("userEmailsCryptType", n4);
        object3 = new HashMap();
        arrayList = new ArrayList<String>();
        n4 = ((String[])object2).length;
        registerClient = (e + 121) % 128;
        String string2 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            string2 = object2[i3];
            int[] nArray = AFb1rSDK$5.getRevenue;
            int n7 = object.ordinal();
            int n8 = nArray[n7];
            if (n8 != (n7 = 2)) {
                string2 = AFb1jSDK.getMonetizationNetwork(string2);
                ((AbstractCollection)arrayList).add(string2);
                string2 = "sha256_el_arr";
            } else {
                ((AbstractCollection)arrayList).add(string2);
                string2 = "plain_el_arr";
            }
            e = n8 = (registerClient + 81) % 128;
        }
        ((HashMap)object3).put(string2, arrayList);
        object = new JSONObject((Map)object3);
        object2 = AppsFlyerProperties.getInstance();
        object = object.toString();
        ((AppsFlyerProperties)object2).setUserEmails((String)object);
    }

    public final void setUserEmails(String ... stringArray) {
        int n3;
        registerClient = (e + 47) % 128;
        Object object = this.getMonetizationNetwork().copydefault();
        String string2 = "setUserEmails";
        object.getMediationNetwork(string2, stringArray);
        object = AppsFlyerProperties$EmailsCryptType.NONE;
        this.setUserEmails((AppsFlyerProperties$EmailsCryptType)((Object)object), stringArray);
        int n4 = registerClient + 123;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return;
        }
        throw null;
    }

    public final void start(Context context) {
        Object[] objectArray = new Object[]{this, context};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -1799167514, 1799167526, n3);
    }

    public final void start(Context context, String string2) {
        registerClient = (e + 111) % 128;
        this.start(context, string2, null);
        e = (registerClient + 109) % 128;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void start(Context context, String object, AppsFlyerRequestListener appsFlyerRequestListener) {
        int n3;
        int n4 = 2;
        int n7 = 1;
        registerClient = (e + 99) % 128;
        Object object2 = this.getMonetizationNetwork().w();
        boolean bl2 = object2.getMediationNetwork();
        int n8 = 0;
        Object[] objectArray = null;
        if (bl2) {
            int n10;
            int n14 = e + 45;
            registerClient = n10 = n14 % 128;
            if ((n14 %= n4) != 0) throw null;
            return;
        }
        bl2 = this.equals;
        String string2 = "No dev key";
        int n15 = 41;
        String string3 = "start";
        if (!bl2) {
            AFb1rSDK.getMediationNetwork(string3);
            if (object == null) {
                if (appsFlyerRequestListener == null) return;
                appsFlyerRequestListener.onError(n15, string2);
                return;
            }
        }
        object2 = new Object[n4];
        object2[0] = this;
        object2[n7] = context;
        int n16 = System.identityHashCode(this);
        int n17 = -608775197;
        int n18 = 608775214;
        AFb1rSDK.getCurrencyIso4217Code((Object[])object2, n17, n18, n16);
        object2 = this.getMonetizationNetwork().component3();
        AFh1sSDK aFh1sSDK = AFa1mSDK.AFAdRevenueData(context);
        ((AFh1oSDK)object2).AFAdRevenueData(aFh1sSDK);
        Application application = this.component4;
        if (application == null) {
            n16 = e + 119;
            registerClient = n17 = n16 % 128;
            if ((n16 %= n4) == 0) {
                objectArray = AFb1qSDK.f_(context);
                if (objectArray == null) return;
                this.component4 = objectArray;
            } else {
                AFb1qSDK.f_(context);
                throw null;
            }
        }
        objectArray = this.getMonetizationNetwork().copydefault();
        String[] stringArray = new String[]{object};
        objectArray.getMediationNetwork(string3, stringArray);
        objectArray = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.e;
        String string4 = getCurrencyIso4217Code;
        CharSequence charSequence = new StringBuilder("Starting AppsFlyer: (v6.15.2.");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(")");
        charSequence = ((StringBuilder)charSequence).toString();
        objectArray.i(aFh1vSDK, (String)charSequence);
        String string5 = "Build Number: ";
        charSequence = new StringBuilder(string5);
        ((StringBuilder)charSequence).append(string4);
        String string6 = ((Object)charSequence).toString();
        objectArray.i(aFh1vSDK, string6);
        objectArray = AppsFlyerProperties.getInstance();
        AFd1rSDK aFd1rSDK = this.getMonetizationNetwork().getRevenue();
        objectArray.loadProperties(aFd1rSDK);
        n8 = TextUtils.isEmpty((CharSequence)object);
        if (n8 == 0) {
            objectArray = this.getMonetizationNetwork().AFKeystoreWrapper();
            objectArray.getCurrencyIso4217Code((String)object);
        } else {
            object = this.getMonetizationNetwork().AFKeystoreWrapper();
            objectArray = new Object[n7];
            objectArray[0] = object;
            n3 = System.identityHashCode(object);
            int n19 = -1684451992;
            n16 = 1684451992;
            object = (String)AFg1wSDK.getCurrencyIso4217Code(objectArray, n19, n16, n3);
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) != 0) {
                int n20;
                e = n20 = (registerClient + 105) % 128;
                AFb1rSDK.equals();
                if (appsFlyerRequestListener == null) return;
                appsFlyerRequestListener.onError(n15, string2);
                return;
            }
        }
        object = this.getMonetizationNetwork().component2();
        objectArray = this.getMediationNetwork();
        ((AFf1aSDK)object).AFAdRevenueData((AFg1xSDK)objectArray);
        object = new Object[n7];
        object[0] = this;
        n7 = System.identityHashCode(this);
        n8 = -1730576944;
        int n21 = 1730576958;
        AFb1rSDK.getCurrencyIso4217Code((Object[])object, n8, n21, n7);
        AFb1rSDK.getCurrencyIso4217Code(this.component4.getBaseContext());
        this.getMonetizationNetwork().unregisterClient().getMediationNetwork();
        object = this.toString.w();
        AFb1rSDK$4 aFb1rSDK$4 = new AFb1rSDK$4(this, (AFh1oSDK)object2, appsFlyerRequestListener);
        object.getRevenue(context, aFb1rSDK$4);
        int n22 = registerClient + 89;
        e = n3 = n22 % 128;
        if ((n22 %= n4) != 0) return;
        n22 = 35 / 0;
    }

    /*
     * WARNING - void declaration
     */
    public final void stop(boolean bl2, Context context) {
        void var2_3;
        Boolean bl3 = bl2;
        Object[] objectArray = new Object[]{this, bl3, var2_3};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, -2043587704, 2043587717, n3);
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int n3;
        e = (registerClient + 87) % 128;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long l2 = 3;
        long l3 = timeUnit.toMillis(l2);
        this.subscribeForDeepLink(deepLinkListener, l3);
        int n4 = registerClient + 45;
        e = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return;
        }
        throw null;
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long l2) {
        Long l3 = l2;
        Object[] objectArray = new Object[]{this, deepLinkListener, l3};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 1858628735, -1858628714, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void unregisterConversionListener() {
        int n3 = e + 97;
        registerClient = n3 % 128;
        String string2 = "unregisterConversionListener";
        if ((n3 %= 2) != 0) {
            AFb1cSDK aFb1cSDK = this.getMonetizationNetwork().copydefault();
            int n4 = 1;
            String[] stringArray = new String[n4];
            aFb1cSDK.getMediationNetwork(string2, stringArray);
        } else {
            AFb1cSDK aFb1cSDK = this.getMonetizationNetwork().copydefault();
            boolean bl2 = false;
            String[] stringArray = new String[]{};
            aFb1cSDK.getMediationNetwork(string2, stringArray);
        }
        this.getMonetizationNetwork = null;
        registerClient = (e + 47) % 128;
    }

    public final void updateServerUninstallToken(Context object, String object2) {
        block4: {
            block5: {
                long l2;
                String string2;
                Object object3;
                Object object4;
                int n3;
                Object object5;
                block7: {
                    block6: {
                        int n4 = 2;
                        object5 = new Object[n4];
                        n3 = 0;
                        object5[0] = this;
                        boolean bl2 = true;
                        object5[bl2] = object;
                        int n7 = System.identityHashCode(this);
                        int n8 = -608775197;
                        int n10 = 608775214;
                        AFb1rSDK.getCurrencyIso4217Code((Object[])object5, n8, n10, n7);
                        object5 = new AFg1jSDK((Context)object);
                        if (object2 == null || (object4 = (object = ((String)object2).trim()).isEmpty())) break block4;
                        object = AFLogger.INSTANCE;
                        object3 = AFh1vSDK.i;
                        string2 = "Firebase Refreshed Token = ".concat((String)object2);
                        object.i((AFh1vSDK)((Object)object3), string2);
                        object = ((AFg1jSDK)object5).getMediationNetwork();
                        if (object != null && (n7 = (int)(object2.equals(object3 = object.getRevenue) ? 1 : 0)) != 0) break block5;
                        l2 = System.currentTimeMillis();
                        if (object == null) break block6;
                        long l3 = object.getCurrencyIso4217Code;
                        object = TimeUnit.SECONDS;
                        long l4 = object.toMillis(2);
                        long l7 = (l3 = l2 - l3) - l4;
                        object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object4 <= 0) break block7;
                    }
                    n3 = 1;
                }
                object = new AFg1mSDK((String)object2, l2, bl2 ^= n3);
                Object object6 = ((AFg1jSDK)object5).AFAdRevenueData;
                string2 = object.getRevenue;
                object6.AFAdRevenueData("afUninstallToken", string2);
                object6 = ((AFg1jSDK)object5).AFAdRevenueData;
                object3 = "afUninstallToken_received_time";
                long l8 = object.getCurrencyIso4217Code;
                object6.getMonetizationNetwork((String)object3, l8);
                object5 = ((AFg1jSDK)object5).AFAdRevenueData;
                object6 = "afUninstallToken_queued";
                object4 = object.getCurrencyIso4217Code();
                object5.getRevenue((String)object6, (boolean)object4);
                if (n3 != 0) {
                    AFg1jSDK.getMediationNetwork((String)object2);
                }
            }
            return;
        }
        object = AFLogger.INSTANCE;
        object2 = AFh1vSDK.i;
        object.w((AFh1vSDK)((Object)object2), "Firebase Token is either empty or null and was not registered.");
    }

    public final void validateAndLogInAppPurchase(Context context, String string2, String string3, String string4, String string5, String string6, Map map2) {
        Object[] objectArray = new Object[]{this, context, string2, string3, string4, string5, string6, map2};
        int n3 = System.identityHashCode(this);
        AFb1rSDK.getCurrencyIso4217Code(objectArray, 123597494, -123597492, n3);
    }

    public final void validateAndLogInAppPurchase(AFPurchaseDetails object, Map object2, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1aSDK aFe1aSDK = this.toString.copy();
        AFd1oSDK aFd1oSDK = this.toString;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        AFf1qSDK aFf1qSDK = new AFf1qSDK(aFd1oSDK, appsFlyerProperties, (AFPurchaseDetails)object, (Map)object2, appsFlyerInAppPurchaseValidationCallback);
        object = aFe1aSDK.AFAdRevenueData;
        object2 = new AFe1aSDK$2(aFe1aSDK, aFf1qSDK);
        object.execute((Runnable)object2);
        registerClient = (e + 25) % 128;
    }

    public final void waitForCustomerUserId(boolean bl2) {
        e = (registerClient + 21) % 128;
        String string2 = String.valueOf(bl2);
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(string2), true);
        AFb1rSDK.AFAdRevenueData("waitForCustomerId", bl2);
        e = (registerClient + 75) % 128;
    }
}

