/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFf1fSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1fSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1gSDK;
import com.appsflyer.internal.AFi1jSDK;
import com.appsflyer.internal.AFj1jSDK;
import com.appsflyer.internal.AFk1oSDK;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFf1jSDK
extends AFf1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName;
    private static int valueOf = 0;
    private static int values = 1;
    private final AFi1jSDK copy;
    private final AFd1qSDK hashCode;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[12];
        char[] cArray3 = cArray;
        cArray2[0] = 15268;
        cArray3[1] = 15348;
        cArray2[2] = 15353;
        cArray3[3] = 15344;
        cArray2[4] = 15350;
        cArray3[5] = 15357;
        cArray2[6] = 15356;
        cArray3[7] = 15351;
        cArray2[8] = 15344;
        cArray3[9] = 15349;
        cArray2[10] = 15351;
        cArray3[11] = 15346;
        AFInAppEventParameterName = cArray;
    }

    public AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFi1jSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1qSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1kSDK, string2);
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, null, 8, null);
    }

    private AFf1jSDK(AFi1jSDK object, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK, AFh1fSDK aFh1fSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(aFd1qSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1kSDK, string2);
        Intrinsics.checkNotNullParameter(aFh1fSDK, string2);
        super(aFh1fSDK, aFd1kSDK);
        this.copy = object;
        this.hashCode = aFd1qSDK;
        object = AFf1zSDK.getMonetizationNetwork;
        this.getRevenue.add(object);
    }

    public /* synthetic */ AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK, AFh1fSDK aFh1fSDK, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 8) != 0) {
            aFh1fSDK = new AFh1fSDK();
        }
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, aFh1fSDK);
    }

    private static void a(String string2, boolean bl2, int[] nArray, Object[] objectArray) {
        Object object = string2;
        int n3 = $11 + 15;
        $10 = n3 % 128;
        int n4 = 2;
        if ((n3 %= n4) == 0) {
            Object object2;
            Object object3;
            if (string2 != null) {
                object3 = "ISO-8859-1";
                object = string2.getBytes((String)object3);
            }
            object = (byte[])object;
            object3 = new AFk1oSDK();
            int n7 = nArray[0];
            int n8 = 1;
            int n10 = nArray[n8];
            int n14 = nArray[n4];
            int n15 = nArray[3];
            char[] cArray = AFInAppEventParameterName;
            if (cArray != null) {
                $10 = ($11 + 117) % 128;
                int n16 = cArray.length;
                char[] cArray2 = new char[n16];
                for (object2 = 0; object2 < n16; ++object2) {
                    char c2;
                    $10 = ($11 + 33) % 128;
                    long l2 = cArray[object2];
                    long l3 = 740144413554588574L;
                    int n17 = (int)(l2 ^= l3);
                    cArray2[object2] = c2 = (char)n17;
                }
                cArray = cArray2;
            }
            Object object4 = new char[n10];
            System.arraycopy(cArray, n7, object4, 0, n10);
            if (object != null) {
                int n18;
                char[] cArray3;
                int n19;
                n7 = $10 + 67;
                $11 = n19 = n7 % 128;
                if ((n7 %= n4) == 0) {
                    cArray3 = new char[n10];
                    ((AFk1oSDK)object3).getCurrencyIso4217Code = n8;
                    n19 = 1;
                } else {
                    cArray3 = new char[n10];
                    ((AFk1oSDK)object3).getCurrencyIso4217Code = 0;
                    n19 = 0;
                    cArray = null;
                }
                while ((n18 = ((AFk1oSDK)object3).getCurrencyIso4217Code) < n10) {
                    object2 = object[n18];
                    if (object2 == n8) {
                        object2 = object4[n18] * 2 + n8 - n19;
                        cArray3[n18] = n19 = (int)((char)object2);
                    } else {
                        object2 = object4[n18] * 2 - n19;
                        cArray3[n18] = n19 = (int)((char)object2);
                    }
                    n19 = cArray3[n18];
                    ((AFk1oSDK)object3).getCurrencyIso4217Code = ++n18;
                }
                object4 = cArray3;
            }
            if (n15 > 0) {
                object = new char[n10];
                System.arraycopy(object4, 0, object, 0, n10);
                n7 = n10 - n15;
                System.arraycopy(object, 0, object4, n7, n15);
                System.arraycopy(object, n15, object4, 0, n7);
            }
            if (bl2) {
                object = new char[n10];
                ((AFk1oSDK)object3).getCurrencyIso4217Code = 0;
                while ((n7 = ((AFk1oSDK)object3).getCurrencyIso4217Code) < n10) {
                    n15 = n10 - n7 - n8;
                    n15 = object4[n15];
                    object[n7] = n15;
                    ((AFk1oSDK)object3).getCurrencyIso4217Code = ++n7;
                }
                object4 = object;
            }
            if (n14 > 0) {
                int n20;
                ((AFk1oSDK)object3).getCurrencyIso4217Code = 0;
                $11 = n20 = ($10 + 101) % 128;
                while ((n20 = ((AFk1oSDK)object3).getCurrencyIso4217Code) < n10) {
                    n7 = object4[n20];
                    n8 = nArray[n4];
                    object4[n20] = n7 = (int)((char)(n7 - n8));
                    ((AFk1oSDK)object3).getCurrencyIso4217Code = ++n20;
                }
            }
            objectArray[0] = object = new String((char[])object4);
            return;
        }
        throw null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void component3(AFa1oSDK object) {
        block7: {
            Throwable throwable2;
            Object object2;
            block6: {
                int n3;
                block4: {
                    block5: {
                        try {
                            int n4;
                            object2 = this.equals();
                            if (object2 == null) break block4;
                            int n7 = values + 39;
                            valueOf = n4 = n7 % 128;
                            if ((n7 %= 2) != 0) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        ((AFa1oSDK)object).getRevenue((Map)object2);
                        break block4;
                    }
                    ((AFa1oSDK)object).getRevenue((Map)object2);
                    object = null;
                    throw null;
                }
                if ((n3 = (object2 = this.copy).getRevenue()) != 0) break block7;
                values = n3 = (valueOf + 115) % 128;
                {
                    object = AFf1eSDK.component1((AFa1oSDK)object);
                    object2 = "";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object2 = "pia_disabled";
                    Boolean bl2 = Boolean.TRUE;
                    object.put(object2, bl2);
                    valueOf = (values + 33) % 128;
                    return;
                }
            }
            object2 = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.getRevenue;
            int n8 = 96;
            String string2 = "Error while adding PIA data to payload";
            boolean bl3 = true;
            AFh1uSDK.e$default((AFh1uSDK)object2, aFh1vSDK, string2, throwable2, bl3, false, false, false, n8, null);
        }
        values = (valueOf + 45) % 128;
    }

    private final Map equals() {
        Object object = this.copy.getMediationNetwork();
        if (object != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<Object, Object>();
            Object object2 = ((AFi1gSDK)object).getMonetizationNetwork;
            linkedHashMap2.put("pia_timestamp", object2);
            long l2 = ((AFi1gSDK)object).getRevenue;
            object2 = l2;
            String string2 = "ttr_millis";
            linkedHashMap2.put(string2, object2);
            object2 = ((AFi1gSDK)object).AFAdRevenueData;
            if (object2 != null) {
                int n3;
                valueOf = n3 = (values + 125) % 128;
                string2 = "pia_token";
                linkedHashMap2.put(string2, object2);
            }
            if ((object = ((AFi1gSDK)object).getCurrencyIso4217Code) != null) {
                int n4;
                valueOf = n4 = (values + 53) % 128;
                object2 = "error_code";
                linkedHashMap2.put(object2, object);
            }
            linkedHashMap.put("pia", linkedHashMap2);
            valueOf = (values + 35) % 128;
            return linkedHashMap;
        }
        return null;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objectArray, int n3, int n4, int n7) {
        AFf1jSDK cfr_ignored_0 = (AFf1jSDK)objectArray[0];
        ((Number)objectArray[1]).intValue();
        valueOf = (values + 47) % 128;
        return null;
    }

    public final void getCurrencyIso4217Code(AFa1oSDK object) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = ((AFa1oSDK)object).getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        Object object3 = new int[]{0, 12, 0, 4};
        Object object4 = new Object[1];
        AFf1jSDK.a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", false, object3, (Object[])object4);
        object3 = ((String)object4[0]).intern();
        object4 = new Date();
        object4 = String.valueOf(((Date)object4).getTime());
        object2.put(object3, object4);
        super.getCurrencyIso4217Code((AFa1oSDK)object);
        this.component3((AFa1oSDK)object);
        object3 = this.hashCode;
        object2 = new AFj1jSDK((AFd1qSDK)object3, null, 2, null);
        object3 = ((AFj1jSDK)object2).AFAdRevenueData.getMonetizationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
        object3 = AFj1jSDK.getMonetizationNetwork(((AFj1jSDK)object2).getMediationNetwork((String)object3), false);
        object2 = ((AFj1jSDK)object2).getRevenue((String)object3);
        ((AFa1oSDK)object).getRevenue((String)object2);
        object2 = this.equals;
        object = ((AFa1oSDK)object).getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        int n3 = this.hashCode.getRevenue.getMediationNetwork("appsFlyerCount", 0);
        int n4 = this.hashCode.getRevenue.getMediationNetwork("appsFlyerInAppEventCount", 0);
        object2.getCurrencyIso4217Code((Map)object, n3, n4);
        values = (valueOf + 47) % 128;
    }

    public final boolean getMediationNetwork() {
        int n3;
        int n4;
        int n7 = values + 117;
        valueOf = n4 = n7 % 128;
        n7 = (n7 %= 2) != 0 ? 1 : 0;
        values = n3 = (n4 += 7) % 128;
        if ((n4 %= 2) != 0) {
            return n7 != 0;
        }
        throw null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long getMonetizationNetwork() {
        long l2;
        TimeUnit timeUnit;
        int n3;
        int n4 = valueOf + 97;
        values = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            timeUnit = TimeUnit.MINUTES;
            l2 = 0L;
            return timeUnit.toMillis(l2);
        }
        timeUnit = TimeUnit.MINUTES;
        l2 = 1L;
        return timeUnit.toMillis(l2);
    }

    public final void getMonetizationNetwork(int n3) {
        Integer n4 = n3;
        Object[] objectArray = new Object[]{this, n4};
        AFf1jSDK.getMediationNetwork(objectArray, 36511501, -36511501, n3);
    }
}

