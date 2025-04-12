/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.os.SystemClock
 *  android.text.TextUtils
 */
package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFi1tSDK;
import com.appsflyer.internal.AFi1vSDK;
import com.appsflyer.internal.AFi1wSDK;
import com.appsflyer.internal.AFi1zSDK;
import com.appsflyer.internal.AFk1rSDK;

public final class AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long getCurrencyIso4217Code = 0L;
    private static int getMediationNetwork = 1;
    private static int getMonetizationNetwork;

    static {
        int n3;
        AFg1ySDK.getRevenue();
        Process.getElapsedCpuTime();
        int n4 = getMonetizationNetwork + 125;
        getMediationNetwork = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            n4 = 77 / 0;
        }
    }

    private static void a(String object, int n3, Object[] objectArray) {
        long l2;
        Object object2;
        int n4;
        int n7;
        $11 = n7 = ($10 + 21) % 128;
        if (object != null) {
            $10 = n7 = (n7 + 107) % 128;
            object = ((String)object).toCharArray();
        }
        object = (char[])object;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        aFk1rSDK.AFAdRevenueData = n3;
        n3 = ((Object)object).length;
        long[] lArray = new long[n3];
        aFk1rSDK.getMediationNetwork = 0;
        while ((n4 = aFk1rSDK.getMediationNetwork) < (object2 = ((Object)object).length)) {
            $11 = ($10 + 31) % 128;
            object2 = object[n4];
            l2 = object2;
            long l3 = n4;
            int n8 = aFk1rSDK.AFAdRevenueData;
            long l4 = n8;
            l2 ^= (l3 *= l4);
            l3 = getCurrencyIso4217Code;
            l4 = 7264887542928058188L;
            lArray[n4] = l2 ^= (l3 ^= l4);
            aFk1rSDK.getMediationNetwork = ++n4;
        }
        char[] cArray = new char[n3];
        aFk1rSDK.getMediationNetwork = 0;
        while ((n4 = aFk1rSDK.getMediationNetwork) < (object2 = ((Object)object).length)) {
            $10 = ($11 + 35) % 128;
            l2 = lArray[n4];
            int n10 = (int)l2;
            cArray[n4] = object2 = (Object)((char)n10);
            aFk1rSDK.getMediationNetwork = ++n4;
        }
        objectArray[0] = object = new String(cArray);
    }

    private static String getMediationNetwork(String string2, String object, String string3, String string4, String string5) {
        int n3;
        int n4;
        getMediationNetwork = n4 = (getMonetizationNetwork + 101) % 128;
        String string6 = "";
        object = new String[]{object, string3, string4, string5, string6};
        string3 = "\u2063";
        string2 = AFb1jSDK.getMonetizationNetwork((String)(object = TextUtils.join((CharSequence)string3, (Object[])object)), string2);
        int n7 = string2.length();
        if (n7 < (n3 = 12)) {
            n7 = getMediationNetwork + 49;
            getMonetizationNetwork = n3 = n7 % 128;
            if ((n7 %= 2) == 0) {
                return string2;
            }
            throw null;
        }
        return string2.substring(0, n3);
    }

    private static AFi1tSDK getMonetizationNetwork(AFi1vSDK object, String object2, String object3, String string2) {
        boolean bl2 = false;
        CharSequence charSequence = null;
        int n3 = 1;
        if (object2 == null) {
            object = object.getCurrencyIso4217Code;
            object3 = AFi1zSDK.getRevenue;
            if (object == object3) {
                bl2 = true;
            }
            object = AFi1wSDK.AFAdRevenueData;
            object2 = new AFi1tSDK(bl2, (AFi1wSDK)((Object)object));
            return object2;
        }
        long l2 = SystemClock.elapsedRealtime();
        long l3 = 0L;
        String string3 = "\u1568\u4fbb\ua0ca\u0511\u7e24\ud372\u359e\u6ea8\uc3f0\u2409\u9952\uf273\u548d\u89d8\ue2e5\u4734\ub859\u1d6e\u77b9\ua8c7\u0d15\u662d\udb4d\u3d96\u96a7\ucbf0\u2c01\u815e\ufa79\u5c8f\ub1d4\ueae7\u4f0d\ua05e\u0568\u7fb6\ud0c1\u3565\u6e3c\uc349\u2595\u9ed5\uf3f0\u546b\u8928\ue27d\u4482\ub9d2\u12fc\u770c\ua85e\u0d65\u67b0\ud8c3\u3deb\u963f\ucb44\u2de1\u86a7\ufbcf\u5c1b\ub12f\uea73\u4cf7";
        long l4 = (l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) + 23250;
        Object object4 = new Object[n3];
        AFg1ySDK.a(string3, (int)l4, object4);
        charSequence = ((String)object4[0]).intern();
        object4 = object.getCurrencyIso4217Code;
        AFi1zSDK aFi1zSDK = AFi1zSDK.getMonetizationNetwork;
        if (object4 == aFi1zSDK) {
            charSequence = new StringBuilder((String)object3);
            object3 = ((Object)((StringBuilder)charSequence).reverse()).toString();
        } else {
            object3 = "";
            string2 = charSequence;
        }
        object = object.AFAdRevenueData;
        charSequence = new StringBuilder(string2);
        string2 = ((Object)((StringBuilder)charSequence).reverse()).toString();
        charSequence = "android";
        object4 = "v1";
        object = AFg1ySDK.getMediationNetwork(string2, (String)object, (String)charSequence, (String)object4, object3);
        boolean bl3 = ((Object)object).equals(object2);
        object3 = bl3 ? AFi1wSDK.getMonetizationNetwork : AFi1wSDK.getRevenue;
        object2 = new AFi1tSDK(bl3, (AFi1wSDK)((Object)object3));
        return object2;
    }

    public static void getRevenue() {
        getCurrencyIso4217Code = -2677878734856900073L;
    }

    public final AFi1tSDK getMediationNetwork(AFi1vSDK object, String object2, String string2, String string3) {
        block6: {
            int n3;
            block7: {
                block5: {
                    n3 = getMediationNetwork;
                    int n4 = n3 + 37;
                    getMonetizationNetwork = n4 % 128;
                    if ((n4 %= 2) == 0) break block5;
                    n4 = 4 / 0;
                    if (object == null) break block6;
                    break block7;
                }
                if (object == null) break block6;
            }
            if (string2 != null && string3 != null) {
                int n7;
                getMonetizationNetwork = n3 = (n3 + 91) % 128;
                object = AFg1ySDK.getMonetizationNetwork((AFi1vSDK)object, object2, string2, string3);
                int n8 = getMonetizationNetwork + 37;
                getMediationNetwork = n7 = n8 % 128;
                if ((n8 %= 2) != 0) {
                    return object;
                }
                throw null;
            }
        }
        object2 = AFi1wSDK.getCurrencyIso4217Code;
        object = new AFi1tSDK(false, (AFi1wSDK)((Object)object2));
        return object;
    }
}

