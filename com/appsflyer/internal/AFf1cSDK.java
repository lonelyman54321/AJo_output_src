/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 *  android.view.ViewConfiguration
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFg1kSDK;
import com.appsflyer.internal.AFg1lSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFk1qSDK;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

public final class AFf1cSDK
extends AFf1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static char AFKeystoreWrapper = '\u0000';
    private static int valueOf = 1;
    private static char[] values;
    private final AFg1kSDK AFInAppEventType;
    private final String copy;
    private final AFd1nSDK copydefault;
    private final AFd1qSDK hashCode;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[9];
        char[] cArray3 = cArray;
        cArray2[0] = 23880;
        cArray3[1] = 23896;
        cArray2[2] = 23876;
        cArray3[3] = 23886;
        cArray2[4] = 23885;
        cArray3[5] = 23883;
        cArray2[6] = 23881;
        cArray3[7] = 23882;
        cArray3[8] = 23884;
        values = cArray;
        AFKeystoreWrapper = (char)26803;
    }

    public AFf1cSDK(String object, AFd1kSDK aFd1kSDK) {
        Context context = aFd1kSDK.values().AFAdRevenueData;
        Object object2 = new AFg1lSDK(context);
        super((AFa1oSDK)object2, aFd1kSDK, (String)object);
        this.hashCode = object2 = aFd1kSDK.getMediationNetwork();
        this.copydefault = object2 = aFd1kSDK.values();
        this.copy = object;
        this.AFInAppEventType = object = aFd1kSDK.component1();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(int n3, byte by2, String object, Object[] objectArray) {
        int n4;
        int n7;
        int n8;
        int n10;
        if (object != null) {
            int n14 = $11 + 37;
            $10 = n10 = n14 % 128;
            if ((n14 %= 2) != 0) {
                ((String)object).toCharArray();
                throw null;
            }
            object = ((String)object).toCharArray();
        }
        object = (char[])object;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArray = values;
        long l2 = 3167490297675737264L;
        if (cArray != null) {
            n8 = cArray.length;
            char[] cArray2 = new char[n8];
            for (n7 = 0; n7 < n8; ++n7) {
                long l3;
                int n15;
                int n16 = $10 + 71;
                $11 = n15 = n16 % 128;
                if ((n16 %= 2) == 0) {
                    l3 = (long)cArray[n7] & l2;
                    n15 = (int)l3;
                    cArray2[n7] = n16 = (int)((char)n15);
                    continue;
                }
                l3 = (long)cArray[n7] ^ l2;
                n15 = (int)l3;
                cArray2[n7] = n16 = (int)((char)n15);
            }
            $10 = n10 = ($11 + 49) % 128;
            cArray = cArray2;
        }
        long l4 = AFKeystoreWrapper;
        int n17 = (int)(l2 ^= l4);
        char c2 = (char)n17;
        char[] cArray3 = new char[n3];
        n8 = n3 % 2;
        if (n8 != 0) {
            n8 = $10 + 31;
            $11 = n4 = n8 % 128;
            if ((n8 %= 2) == 0) {
                n8 = n3 + 34;
                cArray3[n8] = n4 = (int)((char)(object[n8] << by2));
            } else {
                n8 = n3 + -1;
                cArray3[n8] = n4 = (int)((char)(object[n8] - by2));
            }
        } else {
            n8 = n3;
        }
        n4 = 1;
        if (n8 > n4) {
            $11 = n7 = ($10 + 3) % 128;
            aFk1qSDK.getCurrencyIso4217Code = 0;
            while ((n7 = aFk1qSDK.getCurrencyIso4217Code) < n8) {
                $10 = ($11 + 41) % 128;
                Object object2 = object[n7];
                aFk1qSDK.getMediationNetwork = (char)object2;
                Object object3 = n7 + 1;
                object3 = object[object3];
                aFk1qSDK.getRevenue = (char)object3;
                if (object2 == object3) {
                    object2 = object2 - by2;
                    cArray3[n7] = (char)object2;
                    object2 = n7 + 1;
                    cArray3[object2] = object3 = (Object)((char)(object3 - by2));
                } else {
                    int n18;
                    reference var23_22 = object2 / c2;
                    aFk1qSDK.AFAdRevenueData = (int)var23_22;
                    aFk1qSDK.areAllFieldsValid = (int)(object2 %= c2);
                    aFk1qSDK.getMonetizationNetwork = n18 = object3 / c2;
                    aFk1qSDK.component4 = object3 %= c2;
                    if (object2 == object3) {
                        var23_22 = (var23_22 + c2 - n4) % c2;
                        aFk1qSDK.AFAdRevenueData = (int)var23_22;
                        aFk1qSDK.getMonetizationNetwork = n18 = (n18 + c2 - n4) % c2;
                        var23_22 = var23_22 * c2 + object2;
                        n18 = n18 * c2 + object3;
                        object2 = cArray[var23_22];
                        cArray3[n7] = (char)object2;
                        object2 = n7 + 1;
                        cArray3[object2] = object3 = cArray[n18];
                    } else if (var23_22 == n18) {
                        object2 = (object2 + c2 - n4) % c2;
                        aFk1qSDK.areAllFieldsValid = (int)object2;
                        aFk1qSDK.component4 = object3 = (object3 + c2 - n4) % c2;
                        var23_22 = var23_22 * c2 + object2;
                        n18 = n18 * c2 + object3;
                        object2 = cArray[var23_22];
                        cArray3[n7] = (char)object2;
                        object2 = n7 + 1;
                        cArray3[object2] = object3 = cArray[n18];
                    } else {
                        var23_22 = var23_22 * c2 + object3;
                        n18 = n18 * c2 + object2;
                        object2 = cArray[var23_22];
                        cArray3[n7] = (char)object2;
                        object2 = n7 + 1;
                        cArray3[object2] = object3 = cArray[n18];
                    }
                }
                aFk1qSDK.getCurrencyIso4217Code = n7 += 2;
            }
        }
        by2 = 0;
        while (true) {
            char c3;
            if (by2 >= n3) {
                String string2 = new String(cArray3);
                objectArray[0] = string2;
                return;
            }
            cArray3[by2] = c3 = (char)(cArray3[by2] ^ 0x359A);
            by2 = (byte)(by2 + 1);
        }
    }

    private void copy() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        AFf1cSDK.getRevenue(objectArray, 1340322794, -1340322794, n3);
    }

    public static /* synthetic */ Object getRevenue(Object[] object, int n3, int n4, int n7) {
        object = (AFf1cSDK)object[0];
        valueOf = (AFInAppEventParameterName + 95) % 128;
        object.toString.getRevenue("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        valueOf = (AFInAppEventParameterName + 9) % 128;
        return null;
    }

    public final void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        int n3;
        int n4 = AFInAppEventParameterName + 17;
        valueOf = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return;
        }
        throw null;
    }

    public final void component2(AFa1oSDK aFa1oSDK) {
        int n3;
        valueOf = n3 = (AFInAppEventParameterName + 9) % 128;
        String string2 = this.hashCode.getMonetizationNetwork();
        if (string2 != null) {
            int n4;
            String string3 = "advertiserId";
            aFa1oSDK.getCurrencyIso4217Code(string3, string2);
            valueOf = n4 = (AFInAppEventParameterName + 23) % 128;
        }
    }

    public final boolean copydefault() {
        int n3;
        AFInAppEventParameterName = n3 = (valueOf + 51) % 128;
        valueOf = (n3 + 103) % 128;
        return false;
    }

    public final void getCurrencyIso4217Code(AFa1oSDK object) {
        int n3 = 0;
        String string2 = null;
        int n4 = 1;
        super.getCurrencyIso4217Code((AFa1oSDK)object);
        Object object2 = this.copydefault.AFAdRevenueData;
        Object object3 = AFb1rSDK.getRevenue();
        if (object2 != null) {
            boolean n7 = ((AFb1rSDK)object3).AFAdRevenueData();
            if (!n7) {
                object3 = object2.getPackageManager();
                Object object4 = object2.getPackageName();
                object4 = object3.getPackageInfo((String)object4, 0);
                String string3 = "app_version_code";
                int n8 = ((PackageInfo)object4).versionCode;
                Object[] objectArray = Integer.toString(n8);
                ((AFa1oSDK)object).getCurrencyIso4217Code(string3, objectArray);
                string3 = "app_version_name";
                objectArray = ((PackageInfo)object4).versionName;
                ((AFa1oSDK)object).getCurrencyIso4217Code(string3, objectArray);
                string3 = ((PackageInfo)object4).applicationInfo;
                object3 = object3.getApplicationLabel((ApplicationInfo)string3);
                object3 = object3.toString();
                string3 = "app_name";
                ((AFa1oSDK)object).getCurrencyIso4217Code(string3, object3);
                long l2 = ((PackageInfo)object4).firstInstallTime;
                string3 = "yyyy-MM-dd_HHmmssZ";
                Locale locale = Locale.US;
                objectArray = new SimpleDateFormat(string3, locale);
                string3 = "installDate";
                object3 = AFb1rSDK.getCurrencyIso4217Code((SimpleDateFormat)objectArray, l2);
                try {
                    ((AFa1oSDK)object).getCurrencyIso4217Code(string3, object3);
                }
                catch (Throwable throwable) {
                    object4 = "Exception while collecting application version info.";
                    AFLogger.afErrorLog((String)object4, throwable);
                }
                object3 = this.AFInAppEventType;
                object4 = ((AFa1oSDK)object).getMonetizationNetwork();
                object3.getCurrencyIso4217Code((Map)object4);
                object3 = ((AFa1oSDK)object).getMonetizationNetwork();
                object4 = "ivc";
                object3.remove(object4);
                object3 = AFb1rSDK.getCurrencyIso4217Code();
                if (object3 != null) {
                    int n10;
                    object4 = "appUserId";
                    ((AFa1oSDK)object).getCurrencyIso4217Code((String)object4, object3);
                    valueOf = n10 = (AFInAppEventParameterName + 97) % 128;
                }
                object3 = "model";
                object4 = Build.MODEL;
                ((AFa1oSDK)object).getCurrencyIso4217Code((String)object3, object4);
                int n14 = KeyEvent.getDeadChar((int)0, (int)0) + 5;
                int n15 = ViewConfiguration.getScrollBarSize() >> 8;
                n15 = (byte)(51 - n15);
                string3 = "\u0001\u0002\b\u0005\u3631";
                objectArray = new Object[n4];
                AFf1cSDK.a(n14, (byte)n15, string3, objectArray);
                object3 = objectArray[0];
                object3 = (String)object3;
                object3 = ((String)object3).intern();
                object4 = Build.BRAND;
                try {
                    ((AFa1oSDK)object).getCurrencyIso4217Code((String)object3, object4);
                }
                catch (Throwable throwable) {
                    object4 = "Exception while collecting device brand and model.";
                    AFLogger.afErrorLog((String)object4, throwable);
                }
                object3 = AppsFlyerProperties.getInstance();
                object4 = "deviceTrackingDisabled";
                int n16 = ((AppsFlyerProperties)object3).getBoolean((String)object4, false) ^ n4;
                if (n16 != n4) {
                    object3 = "true";
                    ((AFa1oSDK)object).getCurrencyIso4217Code((String)object4, object3);
                }
                if ((object2 = AFb1vSDK.b_(object2.getContentResolver())) != null) {
                    object3 = object2.getRevenue;
                    object4 = "amazon_aid";
                    ((AFa1oSDK)object).getCurrencyIso4217Code((String)object4, object3);
                    object2 = String.valueOf(object2.AFAdRevenueData);
                    object3 = "amazon_aid_limit";
                    ((AFa1oSDK)object).getCurrencyIso4217Code((String)object3, object2);
                }
                object2 = this.component1;
                Object object5 = new Object[n4];
                object5[0] = object2;
                int n17 = System.identityHashCode(object2);
                int n18 = -1684451992;
                n15 = 1684451992;
                object5 = (String)AFg1wSDK.getCurrencyIso4217Code((Object[])object5, n18, n15, n17);
                ((AFa1oSDK)object).getCurrencyIso4217Code("devkey", object5);
                object5 = this.copydefault;
                object2 = this.toString;
                object5 = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object5, (AFd1rSDK)object2);
                ((AFa1oSDK)object).getCurrencyIso4217Code("uid", object5);
                object2 = this.copy;
                ((AFa1oSDK)object).getCurrencyIso4217Code("af_gcm_token", object2);
                object5 = this.toString;
                object2 = "appsFlyerCount";
                string2 = Integer.toString(object5.getMediationNetwork((String)object2, 0));
                ((AFa1oSDK)object).getCurrencyIso4217Code("launch_counter", string2);
                n3 = Build.VERSION.SDK_INT;
                string2 = Integer.toString(n3);
                object5 = "sdk";
                ((AFa1oSDK)object).getCurrencyIso4217Code((String)object5, string2);
                string2 = this.hashCode.component4();
                if (string2 != null) {
                    int n19;
                    object5 = "channel";
                    ((AFa1oSDK)object).getCurrencyIso4217Code((String)object5, string2);
                    valueOf = n19 = (AFInAppEventParameterName + 25) % 128;
                }
                return;
            }
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", n4 != 0);
            object = new IllegalStateException("CustomerUserId not set, register is not sent");
            throw object;
        }
        object = new IllegalStateException("Context is not provided, can't send register request");
        throw object;
    }

    public final void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        AFInAppEventParameterName = (valueOf + 5) % 128;
    }

    public final void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        valueOf = (AFInAppEventParameterName + 33) % 128;
    }

    public final void getRevenue() {
        int n3;
        int n4 = 0;
        int n7 = 1;
        AFInAppEventParameterName = n3 = (valueOf + 49) % 128;
        super.getRevenue();
        AFe1kSDK aFe1kSDK = this.component4;
        if (aFe1kSDK != null && (n3 = (int)(aFe1kSDK.isSuccessful() ? 1 : 0)) != 0) {
            n3 = AFInAppEventParameterName + 43;
            valueOf = n3 % 128;
            int n8 = -1340322794;
            int n10 = 1340322794;
            if ((n3 %= 2) != 0) {
                Object[] objectArray = new Object[n7];
                objectArray[0] = this;
                n4 = System.identityHashCode(this);
                AFf1cSDK.getRevenue(objectArray, n10, n8, n4);
            } else {
                Object[] objectArray = new Object[n7];
                objectArray[0] = this;
                n4 = System.identityHashCode(this);
                AFf1cSDK.getRevenue(objectArray, n10, n8, n4);
                throw null;
            }
        }
    }

    public final void getRevenue(AFa1oSDK aFa1oSDK) {
        int n3;
        int n4 = valueOf + 97;
        AFInAppEventParameterName = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            n4 = 38 / 0;
        }
    }
}

