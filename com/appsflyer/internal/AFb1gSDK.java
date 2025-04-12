/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.View
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1mSDK;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1sSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1cSDK;
import com.appsflyer.internal.AFi1uSDK;
import com.appsflyer.internal.AFi1vSDK;
import com.appsflyer.internal.AFk1sSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

public final class AFb1gSDK
implements AFb1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFAdRevenueData = 0;
    private static long component2 = 0L;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault;
    private static char equals;
    private boolean areAllFieldsValid;
    private boolean component1;
    private final AFd1kSDK component3;
    private List getCurrencyIso4217Code;
    private boolean getMediationNetwork;
    private int getMonetizationNetwork;
    private final Map getRevenue;

    static {
        AFb1gSDK.component2();
        AFAdRevenueData = 98166;
        copydefault = (copy + 55) % 128;
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        HashMap hashMap;
        boolean bl2;
        ArrayList arrayList;
        this.getCurrencyIso4217Code = arrayList = new ArrayList();
        this.getMediationNetwork = bl2 = true;
        this.getRevenue = hashMap = new HashMap();
        boolean bl3 = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
        this.component1 = bl2 ^= bl3;
        this.getMonetizationNetwork = 0;
        this.areAllFieldsValid = false;
        this.component3 = aFd1kSDK;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void AFAdRevenueData(String var1_1, String var2_3, String var3_4, String var4_5) {
        synchronized (this) {
            block13: {
                if (var1_1 == null) ** GOTO lbl10
                try {
                    var5_6 = var1_1.length();
                    if (var5_6 > 0) {
                        var6_7 = this.getRevenue;
                        var7_8 = "app_id";
                        var6_7.put(var7_8, var1_1);
                    }
lbl10:
                    // 4 sources

                    if (var2_3 == null || (var8_9 = var2_3.length()) <= 0) break block13;
                    var1_1 = this.getRevenue;
                    var6_7 = "app_version";
                    var1_1.put(var6_7, var2_3);
                }
                catch (Throwable v0) {}
                var8_9 = AFb1gSDK.copy + 97;
                AFb1gSDK.copydefault = var8_9 %= 128;
            }
            if (var3_4 == null) ** GOTO lbl31
            var8_9 = var3_4.length();
            if (var8_9 <= 0) ** GOTO lbl31
            var1_1 = this.getRevenue;
            var2_3 = "channel";
            var1_1.put(var2_3, var3_4);
            var8_9 = AFb1gSDK.copydefault + 61;
            AFb1gSDK.copy = var8_9 %= 128;
lbl31:
            // 3 sources

            if (var4_5 == null) ** break block14
            var8_9 = AFb1gSDK.copy + 41;
            AFb1gSDK.copydefault = var8_9 %= 128;
            var8_9 = var4_5.length();
            if (var8_9 <= 0) ** break block15
            try {
                var8_9 = AFb1gSDK.copydefault + 57;
                AFb1gSDK.copy = var8_9 %= 128;
            }
            catch (Throwable var1_2) {}
            try {
                var1_1 = this.getRevenue;
                var2_3 = "preInstall";
                var1_1.put(var2_3, var4_5);
            }
            finally {
                return;
            }
            {
            }
            {
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(char c2, String string2, String string3, String string4, int n3, Object[] objectArray) {
        Object object;
        int n4;
        int n7;
        int n8 = 2;
        if (string4 != null) {
            n7 = $10 + 117;
            $11 = n4 = n7 % 128;
            if ((n7 %= n8) == 0) {
                string4.toCharArray();
                throw null;
            }
            object = string4.toCharArray();
        } else {
            object = string4;
        }
        object = (char[])object;
        Object object2 = string3 != null ? (Object)string3.toCharArray() : string3;
        object2 = (char[])object2;
        Object object3 = string2 != null ? (Object)string2.toCharArray() : string2;
        object3 = (char[])object3;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int n10 = ((Object)object3).length;
        char[] cArray = new char[n10];
        int n14 = ((Object)object).length;
        char[] cArray2 = new char[n14];
        System.arraycopy(object3, 0, cArray, 0, n10);
        System.arraycopy(object, 0, cArray2, 0, n14);
        cArray[0] = n7 = (int)((char)(cArray[0] ^ c2));
        n7 = cArray2[n8];
        int n15 = n3;
        n15 = (char)n3;
        cArray2[n8] = n7 = (int)((char)(n7 + n15));
        n7 = ((Object)object2).length;
        object3 = new char[n7];
        aFk1sSDK.getMediationNetwork = 0;
        while ((n10 = aFk1sSDK.getMediationNetwork) < n7) {
            $11 = ($10 + 63) % 128;
            n14 = (n10 + 2) % 4;
            int n16 = (n10 + 3) % 4;
            int n17 = n10 % 4;
            n17 = cArray[n17] * 32718;
            n14 = cArray2[n14];
            n17 += n14;
            char c3 = (char)-1;
            n17 = (char)(n17 % c3);
            aFk1sSDK.getMonetizationNetwork = (char)n17;
            int n18 = (cArray[n16] * 32718 + n14) / c3;
            cArray2[n16] = n14 = (int)((char)n18);
            cArray[n16] = n17;
            long l2 = object2[n10] ^ n17;
            long l3 = component2;
            long l4 = 4316357171685541830L;
            l2 ^= (l3 ^= l4);
            l3 = (int)((long)component4 ^ l4);
            l2 ^= l3;
            l3 = (char)((long)equals ^ l4);
            n14 = (char)(l2 ^= l3);
            object3[n10] = n14;
            aFk1sSDK.getMediationNetwork = ++n10;
        }
        object = new String((char[])object3);
        n4 = $11 + 25;
        $10 = n15 = n4 % 128;
        if ((n4 %= n8) == 0) {
            objectArray[0] = object;
            return;
        }
        throw null;
    }

    private static String component1() {
        int n3;
        int n4 = copydefault + 75;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return "6.15.2";
        }
        throw null;
    }

    public static void component2() {
        component2 = -7965111987969810777L;
        component4 = -2046375994;
        equals = (char)51142;
    }

    private static float component3() {
        int n3;
        Random random = new Random();
        float f5 = random.nextFloat();
        int n4 = copy + 89;
        copydefault = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            n4 = 1 / 0;
        }
        return f5;
    }

    /*
     * Exception decompiling
     */
    private void component4() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 63->67)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Map copy() {
        synchronized (this) {
            Throwable throwable22222;
            block8: {
                int n3;
                int n4 = copydefault + 3;
                copy = n3 = n4 % 128;
                if ((n4 %= 2) != 0) {
                    Map map2 = this.getRevenue;
                    String string2 = "data";
                    List list = this.getCurrencyIso4217Code;
                    map2.put(string2, list);
                    this.copydefault();
                    return this.getRevenue;
                }
                {
                    catch (Throwable throwable22222) {
                        break block8;
                    }
                    {
                        Map map3 = this.getRevenue;
                        String string3 = "data";
                        List list = this.getCurrencyIso4217Code;
                        map3.put(string3, list);
                        this.copydefault();
                        n4 = 0;
                        map3 = null;
                    }
                    try {
                        throw null;
                    }
                    catch (Throwable throwable3) {}
                    {
                        throw throwable3;
                    }
                }
            }
            throw throwable22222;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void copydefault() {
        synchronized (this) {
            ArrayList arrayList;
            this.getCurrencyIso4217Code = arrayList = new ArrayList();
            int n3 = 0;
            arrayList = null;
            this.getMonetizationNetwork = 0;
            n3 = copy + 41;
            copydefault = n3 %= 128;
            return;
        }
    }

    private boolean equals() {
        boolean bl2;
        int n3;
        block3: {
            block2: {
                n3 = copy;
                copydefault = (n3 + 105) % 128;
                boolean bl3 = this.component1;
                bl2 = true;
                if (bl3 ^= bl2) break block2;
                copydefault = (n3 + 123) % 128;
                bl3 = this.getMediationNetwork;
                if (bl3 || (bl3 = this.areAllFieldsValid)) break block3;
            }
            return false;
        }
        copydefault = (n3 + 41) % 128;
        return bl2;
    }

    private static boolean getCurrencyIso4217Code(float f5) {
        Float f6 = Float.valueOf(f5);
        Object[] objectArray = new Object[]{f6};
        int n3 = (int)System.currentTimeMillis();
        return (Boolean)AFb1gSDK.getMonetizationNetwork(objectArray, 169076754, -169076754, n3);
    }

    private boolean getCurrencyIso4217Code(String string2) {
        boolean bl2 = AFc1sSDK.getMonetizationNetwork(string2);
        if (bl2) {
            copy = (copydefault + 57) % 128;
            return true;
        }
        Object object = this.component3.getMediationNetwork().getMonetizationNetwork.AFAdRevenueData;
        String string3 = object.getPackageName();
        object = AFb1qSDK.getMediationNetwork(object, string3);
        boolean bl3 = string2.equals(object);
        copy = (copydefault + 31) % 128;
        return bl3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void getMediationNetwork(String var1_1, String var2_3, String var3_4) {
        synchronized (this) {
            block18: {
                block17: {
                    try {
                        var4_5 = AFb1gSDK.copy + 67;
                        AFb1gSDK.copydefault = var4_5 %= 128;
                    }
                    catch (Throwable var1_2) {
                        break block18;
                    }
                    try {
                        var5_6 = this.getRevenue;
                        var6_7 = 0;
                        var7_8 = null;
                        var8_9 = Color.rgb((int)0, (int)0, (int)0);
                        var9_10 = -16733443 - var8_9;
                    }
                    catch (Throwable v0) {
                        return;
                    }
                    var10_11 = (char)var9_10;
                    var11_12 = "\u9c12\u51b7\ufd6a\ue6aa";
                    var12_13 = "\uca7d\u7f24\u423d\ufade\uc3df";
                    var13_14 = "\u5961\u96dc\ufb23\uaa90";
                    {
                        var8_9 = View.getDefaultSize((int)0, (int)0);
                        var9_10 = 1783740316;
                        var14_15 = var9_10 - var8_9;
                        var8_9 = 1;
                    }
                    {
                        var15_16 /* !! */  = new Object[var8_9];
                        AFb1gSDK.a(var10_11, var11_12, var12_13, var13_14, var14_15, var15_16 /* !! */ );
                        var7_8 = var15_16 /* !! */ [0];
                        var7_8 = (String)var7_8;
                        var7_8 = var7_8.intern();
                        var15_16 /* !! */  = Build.BRAND;
                        var5_6.put(var7_8, var15_16 /* !! */ );
                        var5_6 = this.getRevenue;
                        var7_8 = "model";
                        var15_16 /* !! */  = Build.MODEL;
                        var5_6.put(var7_8, var15_16 /* !! */ );
                        var5_6 = this.getRevenue;
                        var7_8 = "platform";
                        var15_16 /* !! */  = "Android";
                        var5_6.put(var7_8, var15_16 /* !! */ );
                        var5_6 = this.getRevenue;
                        var7_8 = "platform_version";
                        var15_16 /* !! */  = Build.VERSION.RELEASE;
                        var5_6.put(var7_8, var15_16 /* !! */ );
                        var4_5 = 0;
                        var5_6 = null;
                        if (var1_1 == null) break block17;
                    }
                    {
                        var6_7 = AFb1gSDK.copy + 93;
                        AFb1gSDK.copydefault = var8_9 = var6_7 % 128;
                        if ((var6_7 %= 2) != 0) ** GOTO lbl61
                    }
                    {
                        var6_7 = var1_1.length();
                        if (var6_7 > 0) {
                            var7_8 = this.getRevenue;
                            var15_16 /* !! */  = "advertiserId";
                            var7_8.put(var15_16 /* !! */ , var1_1);
                        }
                        break block17;
lbl61:
                        // 1 sources

                        var1_1.length();
                        throw null;
                    }
                }
                if (var2_3 == null) ** GOTO lbl74
                {
                    var16_17 = AFb1gSDK.copydefault + 101;
                    AFb1gSDK.copy = var16_17 %= 128;
                }
                {
                    var16_17 = var2_3.length();
                    if (var16_17 > 0) {
                        var1_1 = this.getRevenue;
                        var7_8 = "imei";
                        var1_1.put(var7_8, var2_3);
                    }
lbl74:
                    // 4 sources

                    if (var3_4 == null || (var16_17 = var3_4.length()) <= 0) ** GOTO lbl-1000
                }
                {
                    var16_17 = AFb1gSDK.copy + 97;
                    AFb1gSDK.copydefault = var17_18 = var16_17 % 128;
                    if ((var16_17 %= 2) != 0) ** GOTO lbl83
                }
                {
                    var1_1 = this.getRevenue;
                    var2_3 = "android_id";
                    var1_1.put(var2_3, var3_4);
                    ** GOTO lbl-1000
lbl83:
                    // 1 sources

                    var1_1 = this.getRevenue;
                    var2_3 = "android_id";
                    var1_1.put(var2_3, var3_4);
                    throw null;
                }
lbl-1000:
                // 2 sources

                {
                    var16_17 = AFb1gSDK.copydefault + 85;
                    AFb1gSDK.copy = var16_17 %= 128;
                    return;
                }
            }
            throw var1_2;
        }
    }

    private void getMediationNetwork(boolean bl2) {
        int n3;
        int n4 = copy + 79;
        copydefault = n3 = n4 % 128;
        String string2 = "participantInProxy";
        if ((n4 %= 2) == 0) {
            this.component3.getRevenue().getRevenue(string2, bl2);
            copy = (copydefault + 3) % 128;
            return;
        }
        this.component3.getRevenue().getRevenue(string2, bl2);
        throw null;
    }

    /*
     * Exception decompiling
     */
    private boolean getMediationNetwork(AFi1uSDK var1_1, AFi1uSDK var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 37->41)] java.lang.Throwable
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

    private static boolean getMediationNetwork(String string2) {
        int n3;
        int n4 = copy + 95;
        copydefault = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            n4 = (int)(AFc1sSDK.getMonetizationNetwork(string2) ? 1 : 0);
            if (n4 != 0) {
                int n7 = copy + 67;
                copydefault = n7 % 128;
                n4 = 1;
                if ((n7 %= 2) != 0) {
                    n7 = 73 / 0;
                }
                return n4 != 0;
            }
            new AFe1vSDK();
            return AFe1vSDK.getMonetizationNetwork(AFb1gSDK.component1(), string2);
        }
        AFc1sSDK.getMonetizationNetwork(string2);
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] object) {
        int n3;
        String string2;
        AFb1gSDK aFb1gSDK = (AFb1gSDK)object[0];
        int n4 = 1;
        object = (Throwable)object[n4];
        Throwable throwable = ((Throwable)object).getCause();
        String string3 = object.getClass().getSimpleName();
        if (throwable == null) {
            string2 = ((Throwable)object).getMessage();
            copydefault = n3 = (copy + 27) % 128;
        } else {
            string2 = throwable.getMessage();
        }
        if (throwable == null) {
            n4 = copydefault + 33;
            copy = n3 = n4 % 128;
            if ((n4 %= 2) == 0) {
                object = ((Throwable)object).getStackTrace();
                n4 = 50 / 0;
            } else {
                object = ((Throwable)object).getStackTrace();
            }
        } else {
            object = throwable.getStackTrace();
        }
        object = AFb1gSDK.getRevenue(string2, (StackTraceElement[])object);
        aFb1gSDK.getMonetizationNetwork("exception", string3, (String[])object);
        int n7 = copydefault + 15;
        copy = n7 % 128;
        if ((n7 %= 2) != 0) {
            return null;
        }
        throw null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ Object getMonetizationNetwork(Object[] object, int n3, int n4, int n7) {
        int n8 = n3 * 71;
        int n10 = n4 * -69 + n8;
        n8 = ~(~n3 | n4);
        int n14 = (~(n4 | n7) | n8) * -140 + n10;
        n10 = ~(n3 | n4 | n7) * 70 + n14;
        n4 = ~(~n4 | n3) | n8;
        if ((n3 = (~(n3 | n7) | n4) * 70 + n10) == (n4 = 1)) return AFb1gSDK.getMonetizationNetwork((Object[])object);
        n4 = 2;
        if (n3 == n4) return AFb1gSDK.getRevenue((Object[])object);
        n4 = 3;
        n7 = 0;
        if (n3 != n4) {
            int n15;
            double d2;
            float f5 = ((Number)(object = (Number)object[0])).floatValue();
            double d5 = f5;
            double d7 = d5 - (d2 = 1.0);
            n7 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1));
            if (n7 >= 0) {
                return Boolean.TRUE;
            }
            d2 = 0.0;
            double d9 = d5 - d2;
            n7 = (int)(d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1));
            if (n7 <= 0) {
                int n16;
                copy = n16 = (copydefault + 111) % 128;
                return Boolean.FALSE;
            }
            float f6 = AFb1gSDK.component3();
            float f7 = f6 - f5;
            Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object2 > 0) return Boolean.FALSE;
            copy = n15 = (copydefault + 121) % 128;
            return Boolean.TRUE;
        }
        object = (AFi1vSDK)object[0];
        n3 = copy;
        copydefault = n4 = (n3 + 43) % 128;
        if (object != null && (object = ((AFi1vSDK)object).getRevenue) != null) {
            return ((AFh1cSDK)object).getCurrencyIso4217Code;
        }
        copydefault = n3 = (n3 + 15) % 128;
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void getMonetizationNetwork(String var1_1, String var2_4, String ... var3_5) {
        synchronized (this) {
            block18: {
                block15: {
                    block17: {
                        block16: {
                            var4_6 = AFb1gSDK.copy + 19;
                            AFb1gSDK.copydefault = var4_6 %= 128;
                            var4_6 = (int)this.equals();
                            if (var4_6 == 0 || (var4_6 = this.getMonetizationNetwork) >= (var5_7 = 98304)) break block15;
                            {
                                catch (Throwable var1_2) {}
                            }
                            var6_8 = System.currentTimeMillis();
                            var8_9 = ", ";
                            var3_5 /* !! */  = TextUtils.join((CharSequence)var8_9, (Object[])var3_5 /* !! */ );
                            if (var1_1 != null) {
                                var8_9 = new StringBuilder();
                                var8_9.append(var6_8);
                                var9_10 = " ";
                                var8_9.append((String)var9_10);
                                var9_10 = Thread.currentThread();
                                var6_8 = var9_10.getId();
                                var8_9.append(var6_8);
                                var9_10 = " _/AppsFlyer_6.15.2 [";
                                var8_9.append((String)var9_10);
                                var8_9.append((String)var1_1);
                                var1_1 = "] ";
                                var8_9.append((String)var1_1);
                                var8_9.append((String)var2_4);
                                var1_1 = " ";
                                var8_9.append((String)var1_1);
                                var8_9.append((String)var3_5 /* !! */ );
                                var1_1 = var8_9.toString();
                            } else {
                                var1_1 = new StringBuilder();
                                var1_1.append(var6_8);
                                var9_11 = " ";
                                var1_1.append((String)var9_11);
                                var9_11 = Thread.currentThread();
                                var6_8 = var9_11.getId();
                                var1_1.append(var6_8);
                                var9_11 = " ";
                                var1_1.append((String)var9_11);
                                var1_1.append((String)var2_4);
                                var2_4 = "/AppsFlyer_6.15.2 ";
                                var1_1.append((String)var2_4);
                                var1_1.append((String)var3_5 /* !! */ );
                                var1_1 = var1_1.toString();
                            }
                            var10_12 = this.getMonetizationNetwork;
                            var11_13 = var1_1.length();
                            var4_6 = 1;
                            var11_13 = AFb1gSDK.AFAdRevenueData;
                            var5_7 = 0;
                            if ((var10_12 += (var11_13 <<= var4_6)) > var11_13) {
                                var10_12 = this.getMonetizationNetwork;
                                var11_13 -= var10_12;
                                var1_1 = var1_1.substring(0, var11_13 /= 2);
                                var5_7 = 1;
                            }
                            var2_4 = this.getCurrencyIso4217Code;
                            var2_4.add(var1_1);
                            var10_12 = this.getMonetizationNetwork;
                            var12_14 = var1_1.length() << var4_6;
                            this.getMonetizationNetwork = var10_12 += var12_14;
                            if (var5_7 == 0) ** GOTO lbl98
                            var12_14 = AFb1gSDK.copydefault + 43;
                            AFb1gSDK.copy = var10_12 = var12_14 % 128;
                            if ((var12_14 %= 2) != 0) ** GOTO lbl89
                            var1_1 = this.getCurrencyIso4217Code;
                            var2_4 = "+~+~ The limit has been exceeded, and no more data is available. +~+~";
                            var1_1.add(var2_4);
                            this.getMonetizationNetwork = var12_14 = this.getMonetizationNetwork + 24700;
                            break block16;
lbl89:
                            // 1 sources

                            var1_1 = this.getCurrencyIso4217Code;
                            var2_4 = "+~+~ The limit has been exceeded, and no more data is available. +~+~";
                            var1_1.add(var2_4);
                            this.getMonetizationNetwork = var12_14 = this.getMonetizationNetwork + 138;
                        }
                        var12_14 = AFb1gSDK.copy + 37;
                        AFb1gSDK.copydefault = var12_14 %= 128;
lbl98:
                        // 2 sources

                        var12_14 = AFb1gSDK.copydefault + 55;
                        AFb1gSDK.copy = var10_12 = var12_14 % 128;
                        if ((var12_14 %= 2) == 0) break block17;
                        return;
                    }
                    var12_14 = 0;
                    var1_1 = null;
                    throw null;
                    break block18;
                }
                return;
            }
            throw var1_2;
            catch (Throwable v0) {}
            return;
        }
    }

    private static AFi1uSDK getRevenue(AFi1vSDK aFi1vSDK) {
        Object[] objectArray = new Object[]{aFi1vSDK};
        int n3 = (int)System.currentTimeMillis();
        return (AFi1uSDK)AFb1gSDK.getMonetizationNetwork(objectArray, 1236177641, -1236177638, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object getRevenue(Object[] object) {
        Throwable throwable2;
        int n3 = 0;
        Object object2 = null;
        Object object3 = (AFb1gSDK)object[0];
        int n4 = 1;
        Object object4 = (String)object[n4];
        int n7 = 2;
        object = object[n7];
        int n8 = copy + 107;
        copydefault = n8 % 128;
        n8 %= n7;
        n7 = 1684451992;
        int n10 = -1684451992;
        if (n8 == 0) {
            try {
                object = ((AFb1gSDK)object3).l_((String)object4, (PackageManager)object);
                object4 = ((AFb1gSDK)object3).component3;
                object4 = object4.AFKeystoreWrapper();
                Object[] objectArray = new Object[n4];
                objectArray[0] = object4;
                n3 = System.identityHashCode(object4);
                object2 = AFg1wSDK.getCurrencyIso4217Code(objectArray, n10, n7, n3);
                object2 = (String)object2;
                object4 = ((AFb1gSDK)object3).component3;
                object4 = object4.getCurrencyIso4217Code();
                object = ((AFe1qSDK)object4).AFAdRevenueData((Map)object, (String)object2);
                if (object == null) {
                    object = "could not send null proxy data";
                    object3 = "request was null";
                    object2 = new NullPointerException((String)object3);
                    AFLogger.afErrorLogForExcManagerOnly((String)object, (Throwable)object2);
                    copy = (copydefault + n4) % 128;
                    return null;
                }
                object2 = ((AFb1gSDK)object3).component3;
                object2 = object2.getMonetizationNetwork();
                object3 = new q62_0(object, n4);
                object2.execute((Runnable)object3);
                return null;
            }
            catch (Throwable throwable2) {}
        } else {
            object = ((AFb1gSDK)object3).l_((String)object4, (PackageManager)object);
            object4 = ((AFb1gSDK)object3).component3;
            object4 = object4.AFKeystoreWrapper();
            Object[] objectArray = new Object[n4];
            objectArray[0] = object4;
            n3 = System.identityHashCode(object4);
            object2 = AFg1wSDK.getCurrencyIso4217Code(objectArray, n10, n7, n3);
            object2 = (String)object2;
            object3 = ((AFb1gSDK)object3).component3;
            object3 = object3.getCurrencyIso4217Code();
            ((AFe1qSDK)object3).AFAdRevenueData((Map)object, (String)object2);
            throw null;
        }
        AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", throwable2);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void getRevenue(String var1_1, String var2_3, String var3_4, String var4_5) {
        synchronized (this) {
            block14: {
                block13: {
                    block12: {
                        var5_6 = this.getRevenue;
                        var6_7 = "sdk_version";
                        var5_6.put(var6_7, var1_1);
                        if (var2_3 == null || (var7_8 = var2_3.length()) <= 0) break block12;
                        try {
                            var7_8 = AFb1gSDK.copy + 55;
                            AFb1gSDK.copydefault = var8_9 = var7_8 % 128;
                            if ((var7_8 %= 2) != 0) ** GOTO lbl19
                        }
                        catch (Throwable var1_2) {}
                        var1_1 = this.getRevenue;
                        var5_6 = "devkey";
                        var1_1.put(var5_6, var2_3);
                        break block12;
lbl19:
                        // 1 sources

                        var1_1 = this.getRevenue;
                        var3_4 = "devkey";
                        var1_1.put(var3_4, var2_3);
                        var7_8 = 0;
                        var1_1 = null;
                        throw null;
                    }
                    if (var3_4 != null) {
                        var7_8 = AFb1gSDK.copy + 51;
                        AFb1gSDK.copydefault = var7_8 %= 128;
                        var7_8 = var3_4.length();
                        if (var7_8 <= 0) break block13;
                        var1_1 = this.getRevenue;
                        var2_3 = "originalAppsFlyerId";
                        var1_1.put(var2_3, var3_4);
                    }
                }
                if (var4_5 == null) break block14;
                var7_8 = AFb1gSDK.copydefault + 77;
                AFb1gSDK.copy = var7_8 %= 128;
                try {
                    var7_8 = var4_5.length();
                    if (var7_8 <= 0) break block14;
                    var1_1 = this.getRevenue;
                    var2_3 = "uid";
                    var1_1.put(var2_3, var4_5);
                }
                catch (Throwable v0) {
                    return;
                }
                var7_8 = AFb1gSDK.copy + 83;
                AFb1gSDK.copydefault = var7_8 %= 128;
                throw var1_2;
            }
            return;
        }
    }

    private boolean getRevenue(AFi1uSDK aFi1uSDK, AFi1uSDK aFi1uSDK2) {
        int n3 = copy + 47;
        copydefault = n3 % 128;
        if ((n3 %= 2) == 0) {
            boolean bl2;
            int n4 = aFi1uSDK.equals(aFi1uSDK2);
            if (n4 != 0) {
                copydefault = (copy + 119) % 128;
                bl2 = this.values();
            } else {
                float f5 = aFi1uSDK.getMonetizationNetwork;
                bl2 = AFb1gSDK.getCurrencyIso4217Code(f5);
                this.getMediationNetwork(bl2);
            }
            n4 = copy + 39;
            copydefault = n3 = n4 % 128;
            if ((n4 %= 2) == 0) {
                return bl2;
            }
            throw null;
        }
        aFi1uSDK.equals(aFi1uSDK2);
        throw null;
    }

    private static String[] getRevenue(String string2, StackTraceElement[] stackTraceElementArray) {
        int n3;
        int n4;
        copy = n4 = (copydefault + 67) % 128;
        if (stackTraceElementArray == null) {
            return new String[]{string2};
        }
        n4 = stackTraceElementArray.length;
        int n7 = 1;
        String[] stringArray = new String[n4 += n7];
        int n8 = 0;
        stringArray[0] = string2;
        while (n7 < (n3 = stackTraceElementArray.length)) {
            n3 = copydefault + 65;
            copy = n8 = n3 % 128;
            if ((n3 %= 2) == 0) {
                stringArray[n7] = string2 = ((Object)stackTraceElementArray[n7]).toString();
                n7 += 106;
                continue;
            }
            stringArray[n7] = string2 = ((Object)stackTraceElementArray[n7]).toString();
            ++n7;
        }
        return stringArray;
    }

    private Map l_(String object, PackageManager packageManager) {
        int n3;
        copy = (copydefault + 65) % 128;
        AFg1wSDK aFg1wSDK = this.component3.AFKeystoreWrapper();
        AFd1tSDK aFd1tSDK = this.component3.e();
        this.m_((String)object, packageManager, aFg1wSDK, aFd1tSDK);
        object = this.copy();
        int n4 = copydefault + 89;
        copy = n3 = n4 % 128;
        if ((n4 %= 2) != 0) {
            return object;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m_(String var1_1, PackageManager var2_3, AFg1wSDK var3_4, AFd1tSDK var4_5) {
        synchronized (this) {
            block12: {
                try {
                    var5_6 = AppsFlyerProperties.getInstance();
                    var6_7 = "remote_debug_static_data";
                    var7_8 /* !! */  = var5_6.getString(var6_7);
                    var8_9 = this.getRevenue;
                    var8_9.clear();
                    if (var7_8 /* !! */  == null) ** GOTO lbl20
                }
                catch (Throwable var1_2) {}
                try {
                    var1_1 = this.getRevenue;
                    var2_3 /* !! */  = new JSONObject((String)var7_8 /* !! */ );
                    var2_3 /* !! */  = AFa1mSDK.getRevenue((JSONObject)var2_3 /* !! */ );
                    var1_1.putAll(var2_3 /* !! */ );
                }
                catch (Throwable v0) {}
                var9_10 = AFb1gSDK.copydefault + 59;
                AFb1gSDK.copy = var9_10 %= 128;
                break block12;
lbl20:
                // 1 sources

                var7_8 /* !! */  = AFb1rSDK.getRevenue();
                var8_9 = AFb1rSDK.getRevenue();
                var8_9 = var8_9.getMonetizationNetwork();
                var8_9 = var8_9.getMediationNetwork();
                var8_9 = var8_9.AFAdRevenueData;
                var8_9 = var8_9.component4;
                var10_11 = 0;
                var11_12 = null;
                if (var8_9 != null) {
                    var13_14 = var8_9.getMonetizationNetwork;
                    var8_9 = var8_9.AFAdRevenueData;
                    var12_13 = new AFb1tSDK(var13_14, (Boolean)var8_9);
                } else {
                    var12_13 = null;
                }
                if (var12_13 != null) {
                    var14_15 = AFb1gSDK.copy + 3;
                    AFb1gSDK.copydefault = var14_15 %= 128;
                    var11_12 = var12_13.getRevenue;
                }
                var3_4 = var3_4.getRevenue();
                var4_5 = var4_5.getRevenue;
                this.getMediationNetwork(var11_12, (String)var3_4, (String)var4_5);
                var4_5 = "6.15.2.";
                var3_4 = new StringBuilder((String)var4_5);
                var4_5 = AFb1rSDK.getCurrencyIso4217Code;
                var3_4.append((String)var4_5);
                var3_4 = var3_4.toString();
                var4_5 = var7_8 /* !! */ .getMonetizationNetwork();
                var4_5 = var4_5.AFKeystoreWrapper();
                var15_16 = 1;
                var7_8 /* !! */  = new Object[var15_16];
                var7_8 /* !! */ [0] = var4_5;
                var16_17 = System.identityHashCode(var4_5);
                var14_15 = -1684451992;
                var10_11 = 1684451992;
                var4_5 = AFg1wSDK.getCurrencyIso4217Code(var7_8 /* !! */ , var14_15, var10_11, var16_17);
                var4_5 = (String)var4_5;
                var7_8 /* !! */  = "KSAppsFlyerId";
                var7_8 /* !! */  = var5_6.getString((String)var7_8 /* !! */ );
                var8_9 = "uid";
                var8_9 = var5_6.getString((String)var8_9);
                this.getRevenue((String)var3_4, (String)var4_5, (String)var7_8 /* !! */ , (String)var8_9);
                try {
                    var2_3 /* !! */  = var2_3 /* !! */ .getPackageInfo((String)var1_1, 0);
                    var17_18 = var2_3 /* !! */ .versionCode;
                    var3_4 = "channel";
                    var3_4 = var5_6.getString((String)var3_4);
                    var4_5 = "preInstallName";
                    var4_5 = var5_6.getString((String)var4_5);
                    var2_3 /* !! */  = String.valueOf(var17_18);
                    this.AFAdRevenueData((String)var1_1, (String)var2_3 /* !! */ , (String)var3_4, (String)var4_5);
                }
                catch (Throwable v1) {}
                var2_3 /* !! */  = this.getRevenue;
                var1_1 = new JSONObject((Map)var2_3 /* !! */ );
                var1_1 = var1_1.toString();
                var5_6.set(var6_7, (String)var1_1);
                break block12;
                throw var1_2;
            }
            var1_1 = this.getRevenue;
            var2_3 /* !! */  = "launch_counter";
            var3_4 = this.component3;
            var3_4 = var3_4.getMediationNetwork();
            var3_4 = var3_4.getRevenue;
            var4_5 = "appsFlyerCount";
            var18_19 = var3_4.getMediationNetwork((String)var4_5, 0);
            var3_4 = String.valueOf(var18_19);
            var1_1.put(var2_3 /* !! */ , var3_4);
            return;
        }
    }

    private void valueOf() {
        int n3;
        int n4 = copy + 107;
        copydefault = n3 = n4 % 128;
        String string2 = "participantInProxy";
        if ((n4 %= 2) == 0) {
            this.component3.getRevenue().AFAdRevenueData(string2);
            copy = (copydefault + 89) % 128;
            return;
        }
        this.component3.getRevenue().AFAdRevenueData(string2);
        throw null;
    }

    private boolean values() {
        copydefault = (copy + 63) % 128;
        boolean bl2 = this.component3.getRevenue().getMediationNetwork("participantInProxy");
        copydefault = (copy + 101) % 128;
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public final void AFAdRevenueData() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [10 : 86->90)] java.lang.Throwable
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

    public final boolean areAllFieldsValid() {
        int n3;
        int n4 = copy + 19;
        copydefault = n3 = n4 % 128;
        if ((n4 %= 2) == 0) {
            int n7;
            n4 = (int)(this.areAllFieldsValid ? 1 : 0);
            copy = n7 = (n3 += 45) % 128;
            if ((n3 %= 2) != 0) {
                return n4 != 0;
            }
            throw null;
        }
        throw null;
    }

    public final void getCurrencyIso4217Code(String string2, String stringArray) {
        int n3 = copydefault + 25;
        copy = n3 % 128;
        if ((n3 %= 2) == 0) {
            stringArray = new String[]{stringArray};
            this.getMonetizationNetwork(null, string2, stringArray);
        } else {
            stringArray = new String[]{stringArray};
            this.getMonetizationNetwork(null, string2, stringArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean getCurrencyIso4217Code() {
        int n3 = 1;
        copydefault = (copy + 53) % 128;
        Object object = this.component3.component2().getCurrencyIso4217Code.getRevenue;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        long l2 = System.currentTimeMillis();
        int n4 = (int)l2;
        int n7 = 1236177641;
        int n8 = -1236177638;
        object = (AFi1uSDK)AFb1gSDK.getMonetizationNetwork(objectArray, n7, n8, n4);
        AFi1vSDK aFi1vSDK = this.component3.component2().getCurrencyIso4217Code.AFAdRevenueData;
        Object[] objectArray2 = new Object[n3];
        objectArray2[0] = aFi1vSDK;
        long l3 = System.currentTimeMillis();
        int n10 = (int)l3;
        AFi1uSDK aFi1uSDK = (AFi1uSDK)AFb1gSDK.getMonetizationNetwork(objectArray2, n7, n8, n10);
        boolean bl2 = this.getMediationNetwork((AFi1uSDK)object, aFi1uSDK);
        if (bl2) {
            this.component4();
            n3 = copydefault + 25;
        } else {
            this.getMediationNetwork();
            this.AFAdRevenueData();
            n3 = copydefault + 91;
        }
        copy = n3 %= 128;
        return bl2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getMediationNetwork() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    int n3;
                    int n4;
                    int n7 = copydefault + 19;
                    copy = n4 = n7 % 128;
                    n4 = 0;
                    if ((n7 %= 2) == 0) {
                        this.getMediationNetwork = false;
                        this.getMonetizationNetwork();
                    } else {
                        this.getMediationNetwork = false;
                        this.getMonetizationNetwork();
                    }
                    this.copydefault();
                    n7 = copy + 23;
                    copydefault = n3 = n7 % 128;
                    if ((n7 %= 2) == 0) break block8;
                    n7 = 73;
                    {
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    n7 /= 0;
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void getMediationNetwork(String string2, int n3, String string3) {
        int n4;
        copy = n4 = (copydefault + 63) % 128;
        String[] stringArray = String.valueOf(n3);
        stringArray = new String[]{stringArray, string3};
        string3 = "server_response";
        this.getMonetizationNetwork(string3, string2, stringArray);
        int n7 = copy + 39;
        copydefault = n3 = n7 % 128;
        if ((n7 %= 2) != 0) {
            n7 = 20 / 0;
        }
    }

    public final void getMediationNetwork(String string2, String stringArray) {
        int n3;
        int n4;
        copydefault = n4 = (copy + 55) % 128;
        String string3 = "server_request";
        stringArray = new String[]{stringArray};
        this.getMonetizationNetwork(string3, string2, stringArray);
        int n7 = copy + 61;
        copydefault = n3 = n7 % 128;
        if ((n7 %= 2) != 0) {
            n7 = 90 / 0;
        }
    }

    public final void getMediationNetwork(String string2, String ... stringArray) {
        copy = (copydefault + 71) % 128;
        this.getMonetizationNetwork("public_api_call", string2, stringArray);
        copy = (copydefault + 107) % 128;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getMonetizationNetwork() {
        synchronized (this) {
            try {
                int n3;
                int n4 = copy + 115;
                copydefault = n3 = n4 % 128;
                n3 = 0;
                if ((n4 %= 2) != 0) {
                    Object object = this.getRevenue;
                    object.clear();
                    object = this.getCurrencyIso4217Code;
                    object.clear();
                } else {
                    Object object = this.getRevenue;
                    object.clear();
                    object = this.getCurrencyIso4217Code;
                    object.clear();
                }
                this.getMonetizationNetwork = 0;
                n4 = copydefault + 21;
                copy = n4 %= 128;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void getRevenue() {
        int n3 = copydefault + 41;
        copy = n3 % 128;
        n3 %= 2;
        this.component1 = false;
    }

    public final void getRevenue(Throwable throwable) {
        Object[] objectArray = new Object[]{this, throwable};
        int n3 = System.identityHashCode(this);
        AFb1gSDK.getMonetizationNetwork(objectArray, 353230021, -353230020, n3);
    }

    public final void k_(String string2, PackageManager packageManager) {
        Object[] objectArray = new Object[]{this, string2, packageManager};
        int n3 = System.identityHashCode(this);
        AFb1gSDK.getMonetizationNetwork(objectArray, 1187970804, -1187970802, n3);
    }
}

