/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.SystemClock
 *  android.telephony.TelephonyManager
 *  android.view.View
 *  android.view.ViewConfiguration
 */
package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFa1vSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFc1sSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1pSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.AFg1wSDK$4;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFk1pSDK;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class AFg1wSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int[] component3;
    private static int copy = 1;
    private final AFd1nSDK AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile boolean component1 = false;
    private volatile String component4;
    private long getCurrencyIso4217Code;
    private final AFg1uSDK getMediationNetwork;
    private boolean getMonetizationNetwork = false;
    Map getRevenue;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[18];
        int[] nArray3 = nArray;
        nArray2[0] = -822670749;
        nArray3[1] = 1075086223;
        nArray2[2] = 147004145;
        nArray3[3] = 479090167;
        nArray2[4] = -532315947;
        nArray3[5] = 551557374;
        nArray2[6] = 1465503631;
        nArray3[7] = -1445164187;
        nArray2[8] = -1205793421;
        nArray3[9] = -530934650;
        nArray2[10] = 1110614146;
        nArray3[11] = 1724100027;
        nArray2[12] = -1279723807;
        nArray3[13] = 1741964355;
        nArray2[14] = -470761703;
        nArray3[15] = -2125897653;
        nArray2[16] = 1290985041;
        nArray3[17] = -235853772;
        component3 = nArray;
    }

    public AFg1wSDK(AFd1nSDK aFd1nSDK, AFg1uSDK aFg1uSDK) {
        this.AFAdRevenueData = aFd1nSDK;
        this.getMediationNetwork = aFg1uSDK;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] object) {
        int n3;
        AFg1wSDK aFg1wSDK = (AFg1wSDK)object[0];
        int n4 = 1;
        object = (Map)object[n4];
        aFg1wSDK = aFg1wSDK.AFAdRevenueData.AFAdRevenueData;
        AFd1pSDK aFd1pSDK = new AFd1pSDK((Map)object, (Context)aFg1wSDK);
        int n7 = component2 + 89;
        copy = n3 = n7 % 128;
        if ((n7 %= 2) != 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void AFAdRevenueData(Map map2, AFd1qSDK object) {
        Exception exception2;
        block13: {
            block8: {
                long l2;
                Object[] objectArray;
                int n3;
                int n4;
                int n7;
                int n8;
                Object object2;
                int n10;
                int n14;
                block9: {
                    block11: {
                        block12: {
                            block10: {
                                n14 = 1;
                                n10 = 57;
                                object2 = ((AFd1qSDK)object).getCurrencyIso4217Code;
                                n8 = AFc1sSDK.getRevenue((String)object2);
                                n7 = 8;
                                n4 = 0;
                                if (n8 == 0) break block9;
                                n8 = component2 + 69;
                                copy = n3 = n8 % 128;
                                objectArray = "com.appsflyer.security.uuid";
                                if ((n8 %= 2) != 0) break block10;
                                object2 = ((AFd1qSDK)object).getRevenue((String)objectArray);
                                n3 = (int)(AFc1sSDK.getRevenue((String)object2) ? 1 : 0);
                                int cfr_ignored_0 = n10 / 0;
                                if (n3 == 0) break block11;
                                break block12;
                            }
                            object2 = ((AFd1qSDK)object).getRevenue((String)objectArray);
                            n3 = (int)(AFc1sSDK.getRevenue((String)object2) ? 1 : 0);
                            if (n3 == 0) break block11;
                        }
                        object2 = AFd1qSDK.getMediationNetwork();
                    }
                    ((AFd1qSDK)object).getCurrencyIso4217Code = object2 = ((String)object2).substring(0, n7);
                }
                object = ((AFd1qSDK)object).getCurrencyIso4217Code;
                n8 = 6;
                try {
                    Object object3 = object2 = (Object)new int[n8];
                    object3[0] = 1091213027;
                    object3[1] = 1132401161;
                    object3[2] = -1174855883;
                    object3[3] = -1091241639;
                    object3[4] = -1587464187;
                    object3[5] = 1289805057;
                    n3 = ViewConfiguration.getTouchSlop();
                    n7 = n3 >> 8;
                    n7 = 12 - n7;
                    objectArray = new Object[n14];
                    AFg1wSDK.a((int[])object2, n7, objectArray);
                    object2 = objectArray[0];
                    object2 = (String)object2;
                    object2 = ((String)object2).intern();
                    object2 = map2.get(object2);
                    object2 = String.valueOf(object2);
                    long l3 = Long.parseLong((String)object2);
                    object = ((String)object).toCharArray();
                    l2 = 94;
                }
                catch (Exception exception2) {}
                n7 = (int)(l3 %= l2) + 33;
                component2 = n8 = (copy + n10) % 128;
                while (true) {
                    n10 = ((Object)object).length;
                    if (n4 >= n10) break block8;
                    n10 = (char)(object[n4] ^ n7);
                    break;
                }
                {
                    object[n4] = n10;
                    n4 += n14;
                    continue;
                }
                break block13;
            }
            String string2 = "sbid";
            String string3 = new String((char[])object);
            map2.put(string2, string3);
            return;
        }
        object = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.e;
        ((AFh1uSDK)object).e(aFh1vSDK, "Exception occurred while generating sbid ", exception2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(int[] nArray, int n3, Object[] objectArray) {
        int n4;
        int n7;
        int n8;
        int[] nArray2;
        int[] nArray3 = nArray;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        int n10 = 4;
        char[] cArray = new char[n10];
        int n14 = nArray.length;
        int n15 = 2;
        char[] cArray2 = new char[n14 *= 2];
        int[] nArray4 = component3;
        long l2 = 7040698834646313678L;
        if (nArray4 != null) {
            int n16 = nArray4.length;
            nArray2 = new int[n16];
            n8 = 0;
            while (n8 < n16) {
                long l3;
                n7 = $11 + 27;
                $10 = n4 = n7 % 128;
                if ((n7 %= n15) != 0) {
                    n7 = nArray4[n8];
                    l3 = (long)n7 ^ l2;
                    nArray2[n8] = n4 = (int)l3;
                    continue;
                }
                n7 = nArray4[n8];
                l3 = (long)n7 ^ l2;
                nArray2[n8] = n4 = (int)l3;
                ++n8;
            }
            nArray4 = nArray2;
        }
        int n17 = nArray4.length;
        int[] nArray5 = new int[n17];
        nArray2 = component3;
        if (nArray2 != null) {
            int[] nArray6;
            n8 = $10 + 11;
            $11 = n7 = n8 % 128;
            if ((n8 %= n15) == 0) {
                n8 = nArray2.length;
                nArray6 = new int[n8];
            } else {
                n8 = nArray2.length;
                nArray6 = new int[n8];
            }
            for (n4 = 0; n4 < n8; ++n4) {
                int n18;
                int n19 = nArray2[n4];
                long l4 = (long)n19 ^ l2;
                nArray6[n4] = n18 = (int)l4;
            }
            nArray2 = nArray6;
        }
        System.arraycopy(nArray2, 0, nArray5, 0, n17);
        aFk1pSDK.AFAdRevenueData = 0;
        while (true) {
            int n20;
            int n21;
            if ((n17 = aFk1pSDK.AFAdRevenueData) >= (n21 = nArray3.length)) {
                String string2 = new String(cArray2, 0, n3);
                objectArray[0] = string2;
                return;
            }
            n21 = nArray3[n17];
            cArray[0] = n20 = (int)(n21 >> 16);
            n21 = (char)n21;
            int n22 = 1;
            cArray[n22] = n21;
            n8 = n17 + 1;
            n8 = nArray3[n8];
            n7 = 16;
            cArray[n15] = n8 = (int)((char)(n8 >> n7));
            ++n17;
            n17 = (char)nArray3[n17];
            n4 = 3;
            cArray[n4] = n17;
            aFk1pSDK.getCurrencyIso4217Code = n20 = (n20 << n7) + n21;
            aFk1pSDK.getMonetizationNetwork = n21 = (n8 << 16) + n17;
            AFk1pSDK.getCurrencyIso4217Code(nArray5);
            nArray4 = null;
            for (n17 = 0; n17 < n7; n21 ^= n20, ++n17) {
                n21 = aFk1pSDK.getCurrencyIso4217Code;
                n20 = nArray5[n17];
                aFk1pSDK.getCurrencyIso4217Code = n21 ^= n20;
                n21 = AFk1pSDK.getRevenue(n21);
                n20 = aFk1pSDK.getMonetizationNetwork;
                n20 = aFk1pSDK.getCurrencyIso4217Code;
                aFk1pSDK.getCurrencyIso4217Code = n21;
                aFk1pSDK.getMonetizationNetwork = n20;
            }
            n17 = aFk1pSDK.getCurrencyIso4217Code;
            aFk1pSDK.getCurrencyIso4217Code = n21 = aFk1pSDK.getMonetizationNetwork;
            aFk1pSDK.getMonetizationNetwork = n17;
            n20 = nArray5[n7];
            aFk1pSDK.getMonetizationNetwork = n17 ^= n20;
            n20 = nArray5[17];
            aFk1pSDK.getCurrencyIso4217Code = n21 ^= n20;
            cArray[0] = n20 = (int)((char)(n21 >>> 16));
            cArray[n22] = n21 = (int)((char)n21);
            cArray[n15] = n21 = (int)((char)(n17 >>> 16));
            cArray[n4] = n17 = (int)((char)n17);
            AFk1pSDK.getCurrencyIso4217Code(nArray5);
            n17 = aFk1pSDK.AFAdRevenueData;
            n21 = n17 * 2;
            cArray2[n21] = n20 = cArray[0];
            n21 = n17 * 2 + n22;
            cArray2[n21] = n20 = cArray[n22];
            n21 = n17 * 2 + n15;
            cArray2[n21] = n20 = cArray[n15];
            n21 = n17 * 2 + n4;
            cArray2[n21] = n20 = cArray[n4];
            aFk1pSDK.AFAdRevenueData = n17 += n15;
        }
    }

    private boolean areAllFieldsValid() {
        Map map2 = this.getRevenue;
        if (map2 != null) {
            int n3;
            int n4 = copy + 3;
            component2 = n3 = n4 % 128;
            if ((n4 %= 2) == 0) {
                int n8 = (int)(map2.isEmpty() ? 1 : 0);
                n8 = n8 ^ (n4 = 1);
                if (n8 != 0) {
                    int n10 = component2 + 97;
                    copy = n3 = n10 % 128;
                    int n14 = n10 % 2;
                    if (n14 == 0) {
                        return false;
                    }
                    return n4 != 0;
                }
            } else {
                map2.isEmpty();
                throw null;
            }
        }
        return false;
    }

    private long component4() {
        int n3;
        int n4 = copy + 29;
        component2 = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            return this.getCurrencyIso4217Code;
        }
        throw null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] object, int n3, int n4, int n7) {
        int n8 = n3 * 371;
        int n10 = n4 * 371 + n8;
        n8 = ~n4;
        int n14 = ~n7;
        int n15 = ~(n8 | n14);
        int n16 = ~n3;
        int n17 = ~(n16 | n7);
        n15 = (n15 | n17) * -370 + n10;
        n10 = ~(n16 | n14);
        n7 = ~(n7 | n8) | n10;
        n3 = ~(n3 | n4);
        n4 = (n7 | n3) * -370 + n15;
        n3 = n3 * 370 + n4;
        n4 = 0;
        n7 = 1;
        if (n3 != n7) {
            n7 = 2;
            if (n3 != n7) {
                object = (AFg1wSDK)object[0];
                copy = (component2 + 61) % 128;
                object = object.component4;
                copy = n3 = (component2 + 53) % 128;
            } else {
                object = AFg1wSDK.AFAdRevenueData(object);
            }
        } else {
            AFg1wSDK aFg1wSDK = (AFg1wSDK)object[0];
            object = (String)object[n7];
            copy = n4 = (component2 + 107) % 128;
            aFg1wSDK.areAllFieldsValid = object;
            copy = (component2 + 103) % 128;
            object = null;
        }
        return object;
    }

    public static void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        try {
            AFb1sSDK aFb1sSDK = new AFb1sSDK(aFa1oSDK);
            aFb1sSDK.afInfoLog();
            copy = (component2 + 35) % 128;
            return;
        }
        catch (Exception exception) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", exception);
            return;
        }
    }

    private long getMonetizationNetwork(AFd1qSDK object) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        AFd1nSDK aFd1nSDK = ((AFd1qSDK)object).getMonetizationNetwork;
        object = ((AFd1qSDK)object).getRevenue;
        object = AFb1iSDK.getCurrencyIso4217Code(aFd1nSDK, (AFd1rSDK)object);
        stringBuilder.append((String)object);
        long l2 = this.component4();
        stringBuilder.append(l2);
        object = ((Object)stringBuilder).toString();
        long l3 = AFb1jSDK.getRevenue((String)object);
        int n4 = component2 + 11;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return l3;
        }
        throw null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean getMonetizationNetwork(Context context) {
        int n3;
        int n4;
        String string2;
        copy = (component2 + 23) % 128;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        int n7 = appsFlyerProperties.getBoolean(string2 = "collectAndroidIdForceByUser", false);
        if (n7 != (n4 = 1)) {
            int n8;
            n7 = component2 + 41;
            copy = n8 = n7 % 128;
            String string3 = "collectIMEIForceByUser";
            if (!((n7 %= 2) == 0 ? (n7 = (int)((appsFlyerProperties = AppsFlyerProperties.getInstance()).getBoolean(string3, false) ? 1 : 0)) != 0 : (n7 = (int)((appsFlyerProperties = AppsFlyerProperties.getInstance()).getBoolean(string3, false) ? 1 : 0)) != 0)) {
                AFb1rSDK.getRevenue();
                boolean bl2 = AFb1rSDK.getRevenue(context) ^ n4;
                if (bl2 == n4) return n4;
                return false;
            }
        }
        component2 = n3 = (copy + 15) % 128;
        return n4;
    }

    public final String AFAdRevenueData() {
        Object[] objectArray = new Object[]{this};
        int n3 = System.identityHashCode(this);
        return (String)AFg1wSDK.getCurrencyIso4217Code(objectArray, -1684451992, 1684451992, n3);
    }

    public final void component2() {
        int n3 = copy + 91;
        component2 = n3 % 128;
        n3 %= 2;
        long l2 = System.currentTimeMillis();
        long l3 = this.getCurrencyIso4217Code;
        Map map2 = this.getRevenue;
        Long l4 = l2 -= l3;
        map2.put("ttr", l4);
        map2 = this.getRevenue;
        Long l7 = this.component4();
        map2.put("lvl_timestamp", l7);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map getCurrencyIso4217Code(Map var1_1) {
        block8: {
            var2_5 = 0;
            var3_6 = null;
            var4_7 = 1;
            var5_8 = 2;
            var6_9 = this.AFAdRevenueData;
            var6_9 = var6_9.AFAdRevenueData;
            {
                catch (Throwable var1_3) {
                    break block8;
                }
                try {
                    var7_10 = new Object[var5_8];
                    var7_10[var4_7] = var6_9;
                    var7_10[0] = var1_1;
                    var1_1 = AFa1vSDK.registerClient;
                    var8_11 = -1068415224;
                    var9_12 = var8_11;
                    var9_12 = var1_1.get(var9_12);
                    if (var9_12 == null) {
                        var10_13 = Color.blue((int)0) + 37;
                        var11_14 = SystemClock.elapsedRealtime();
                        var13_15 = 0L;
                        var15_16 = var11_14 == var13_15 ? 0 : (var11_14 < var13_15 ? -1 : 1);
                        var16_17 = 360 - var15_16;
                    }
                    ** GOTO lbl43
                }
                catch (Throwable var1_2) {}
                var3_6 = var1_2.getCause();
                if (var3_6 == null) throw var1_2;
                throw var3_6;
            }
            {
                var17_18 = View.combineMeasuredStates((int)0, (int)0);
                var18_19 = 40289 - var17_18;
            }
            var17_18 = (char)var18_19;
            {
                var9_12 = AFa1vSDK.getRevenue(var10_13, var16_17, var17_18);
                var9_12 = (Class)var9_12;
                var19_20 = new Class[var5_8];
                var19_20[0] = var20_21 = Map.class;
                var19_20[var4_7] = var3_6 = Context.class;
                var9_12 = var9_12.getDeclaredConstructor(var19_20);
                var3_6 = var8_11;
                var1_1.put(var3_6, var9_12);
lbl43:
                // 2 sources

                var9_12 = var9_12;
                var1_1 = var9_12.newInstance(var7_10);
                var2_5 = AFg1wSDK.copy + 71;
                AFg1wSDK.component2 = var4_7 = var2_5 % 128;
                if ((var2_5 %= var5_8) != 0) throw null;
                return var1_1;
            }
        }
        AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", var1_3);
        return new HashMap<K, V>();
    }

    public final void getCurrencyIso4217Code(String string2) {
        int n3;
        component2 = (copy + 121) % 128;
        this.component4 = string2;
        int n4 = component2 + 65;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return;
        }
        throw null;
    }

    public final void getCurrencyIso4217Code(boolean bl2) {
        int n3;
        int n4 = copy + 109;
        component2 = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            this.component1 = bl2;
            return;
        }
        this.component1 = bl2;
        throw null;
    }

    public final boolean getCurrencyIso4217Code() {
        int n3;
        int n4 = component2 + 99;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            n4 = (int)(this.component1 ? 1 : 0);
            n3 = 49 / 0;
        } else {
            n4 = (int)(this.component1 ? 1 : 0);
        }
        return n4 != 0;
    }

    public final Map getMediationNetwork() {
        HashMap hashMap = new HashMap();
        int n3 = this.areAllFieldsValid();
        String string2 = "lvl";
        if (n3 != 0) {
            copy = n3 = (component2 + 65) % 128;
            Map map2 = this.getRevenue;
            hashMap.put(string2, map2);
        } else {
            n3 = this.getMonetizationNetwork;
            if (n3 != 0) {
                Map<String, String> map3 = new Map<String, String>();
                this.getRevenue = map3;
                this.component2();
                map3 = this.getRevenue;
                String string3 = "error";
                String string4 = "pending LVL response";
                map3.put(string3, string4);
                map3 = this.getRevenue;
                hashMap.put(string2, map3);
                copy = n3 = (component2 + 73) % 128;
            }
        }
        return hashMap;
    }

    public final void getMediationNetwork(AFd1qSDK aFd1qSDK) {
        boolean bl2;
        long l2;
        this.getCurrencyIso4217Code = l2 = System.currentTimeMillis();
        AFg1uSDK aFg1uSDK = this.getMediationNetwork;
        long l3 = this.getMonetizationNetwork(aFd1qSDK);
        aFd1qSDK = this.AFAdRevenueData.AFAdRevenueData;
        AFg1wSDK$4 aFg1wSDK$4 = new AFg1wSDK$4(this);
        this.getMonetizationNetwork = bl2 = aFg1uSDK.getMediationNetwork(l3, (Context)aFd1qSDK, aFg1wSDK$4);
        copy = (component2 + 9) % 128;
    }

    public final Map getMonetizationNetwork(Map map2) {
        Object[] objectArray = new Object[]{this, map2};
        int n3 = System.identityHashCode(this);
        return (Map)AFg1wSDK.getCurrencyIso4217Code(objectArray, 896699170, -896699168, n3);
    }

    public final boolean getMonetizationNetwork() {
        int n3;
        component2 = (copy + 19) % 128;
        int n4 = this.getMonetizationNetwork;
        if (n4 != 0) {
            n4 = this.areAllFieldsValid();
            n3 = 1;
            if ((n4 ^= n3) == n3) {
                return n3 != 0;
            }
        }
        n4 = component2 + 41;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return false;
        }
        throw null;
    }

    public final String getRevenue() {
        component2 = (copy + 61) % 128;
        String string2 = this.areAllFieldsValid;
        component2 = (copy + 55) % 128;
        return string2;
    }

    /*
     * Unable to fully structure code
     */
    public final String getRevenue(AFd1rSDK var1_1) {
        block19: {
            block24: {
                block25: {
                    block23: {
                        block22: {
                            block21: {
                                block20: {
                                    var2_2 = "use cached IMEI: ";
                                    var3_3 = AppsFlyerProperties.getInstance();
                                    var4_6 = var3_3.getBoolean("collectIMEI", false);
                                    var5_7 = "imeiCached";
                                    var6_8 = var1_1.getMonetizationNetwork(var5_7, null);
                                    if (!var4_6 || !(var4_6 = AFc1sSDK.getRevenue((String)(var3_3 = this.areAllFieldsValid)))) break block24;
                                    var3_3 = this.AFAdRevenueData.AFAdRevenueData;
                                    if (var3_3 == null) ** GOTO lbl-1000
                                    var7_9 = AFg1wSDK.component2 + 117;
                                    AFg1wSDK.copy = var8_10 = var7_9 % 128;
                                    if ((var7_9 %= 2) == 0) break block25;
                                    var7_9 = (int)AFg1wSDK.getMonetizationNetwork((Context)var3_3);
                                    var8_10 = 1;
                                    if ((var7_9 ^= var8_10) == var8_10) ** GOTO lbl-1000
                                    var9_11 = "phone";
                                    var3_3 = var3_3.getSystemService((String)var9_11);
                                    var3_3 = (TelephonyManager)var3_3;
                                    var9_11 = var3_3.getClass();
                                    var10_12 = "getDeviceId";
                                    var9_11 = var9_11.getMethod(var10_12, null);
                                    var3_3 = var9_11.invoke(var3_3, null);
                                    var3_3 = (String)var3_3;
                                    if (var3_3 != null) break block19;
                                    if (var6_8 == null) break block20;
                                    var3_3 = String.valueOf(var6_8);
                                    var3_3 = var2_2.concat((String)var3_3);
                                    try {
                                        AFLogger.afDebugLog((String)var3_3);
                                        break block21;
                                    }
                                    catch (Exception var3_4) {
                                        break block22;
                                    }
                                    catch (InvocationTargetException var3_5) {
                                        break block23;
                                    }
                                }
                                var6_8 = null;
                            }
                            AFg1wSDK.copy = var11_13 = (AFg1wSDK.component2 + 53) % 128;
lbl46:
                            // 3 sources

                            while (true) {
                                var3_3 = var6_8;
                                break block19;
                                break;
                            }
                        }
                        if (var6_8 != null) {
                            var2_2 = var2_2.concat(var6_8);
                            AFLogger.afDebugLog((String)var2_2);
                        } else {
                            var6_8 = null;
                        }
                        var2_2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                        var9_11 = var3_4.getMessage();
                        var2_2.append((String)var9_11);
                        var2_2 = var2_2.toString();
                        AFLogger.afErrorLog((String)var2_2, var3_4);
                        ** GOTO lbl46
                    }
                    if (var6_8 != null) {
                        var2_2 = var2_2.concat(var6_8);
                        AFLogger.afDebugLog((String)var2_2);
                    } else {
                        var6_8 = null;
                    }
                    var2_2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    var9_11 = var3_5.getMessage();
                    var2_2.append((String)var9_11);
                    var2_2 = var2_2.toString();
                    AFLogger.afErrorLog((String)var2_2, var3_5);
                    ** while (true)
                }
                AFg1wSDK.getMonetizationNetwork((Context)var3_3);
                throw null;
            }
            var2_2 = this.areAllFieldsValid;
            if (var2_2 != null) {
                var3_3 = this.areAllFieldsValid;
            } else lbl-1000:
            // 3 sources

            {
                var4_6 = false;
                var3_3 = null;
            }
        }
        if ((var11_13 = AFc1sSDK.getRevenue((String)var3_3)) == 0) {
            var1_1.AFAdRevenueData(var5_7, (String)var3_3);
            return var3_3;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final void getRevenue(String string2) {
        Object[] objectArray = new Object[]{this, string2};
        int n3 = System.identityHashCode(this);
        AFg1wSDK.getCurrencyIso4217Code(objectArray, 1318882910, -1318882909, n3);
    }
}

