/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.os.Process
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 */
package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.AFa1gSDK;
import com.appsflyer.internal.AFa1kSDK;
import com.appsflyer.internal.AFa1kSDK$AFa1ySDK;
import com.appsflyer.internal.AFa1lSDK$1;
import com.appsflyer.internal.AFa1vSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AFa1lSDK {
    public static final Object AFAdRevenueData;
    private static final Double getRevenue;
    final LinkedHashMap getMediationNetwork;

    static {
        AFa1lSDK$1 aFa1lSDK$1 = new AFa1lSDK$1();
        AFAdRevenueData = aFa1lSDK$1;
        getRevenue = -0.0;
    }

    public AFa1lSDK() {
        LinkedHashMap linkedHashMap;
        this.getMediationNetwork = linkedHashMap = new LinkedHashMap();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private AFa1lSDK(Object var1_1) {
        var2_3 = 1;
        var3_4 = 2;
        var4_5 = null;
        super();
        try {
            var5_6 = AFa1vSDK.registerClient;
            var6_7 = -807770607;
            var7_8 = -7.328244E9f;
        }
        catch (Throwable var1_2) {
            var18_19 = var1_2.getCause();
            if (var18_19 != null) {
                throw var18_19;
            }
            throw var1_2;
        }
        var8_9 = var6_7;
        var8_9 = var5_6.get(var8_9);
        if (var8_9 != null) ** GOTO lbl37
        var9_10 = Color.green((int)0) + 37;
        var10_11 = (ViewConfiguration.getLongPressTimeout() >> 16) + 196;
        var11_12 = (char)(KeyEvent.normalizeMetaState((int)0) + 2457);
        var8_9 = AFa1vSDK.getRevenue(var9_10, var10_11, var11_12);
        var8_9 = (Class)var8_9;
        var12_13 = "getMonetizationNetwork";
        var8_9 = var8_9.getDeclaredMethod(var12_13, null);
        var13_14 = var6_7;
        var5_6.put(var13_14, var8_9);
lbl37:
        // 2 sources

        var8_9 = (Method)var8_9;
        var1_1 = var8_9.invoke(var1_1, null);
        var6_7 = var1_1 instanceof AFa1lSDK;
        if (var6_7 != 0) {
            this.getMediationNetwork = var1_1 = ((AFa1lSDK)var1_1).getMediationNetwork;
            return;
        }
        var13_14 = "AFJsonObject";
        var8_9 = new Object[var3_4];
        var8_9[var2_3] = var13_14;
        var8_9[0] = var1_1;
        var14_15 = 1756973990;
        var13_14 = var14_15;
        var13_14 = var5_6.get(var13_14);
        if (var13_14 != null) ** GOTO lbl91
        var7_8 = ViewConfiguration.getScrollFriction();
        var10_11 = 0;
        var12_13 = null;
        cfr_temp_0 = var7_8 - 0.0f;
        var6_7 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
        var6_7 = 38 - var6_7;
        var10_11 = (Process.myPid() >> 22) + 122;
        var15_16 = "";
        var16_17 = '0';
        var11_12 = TextUtils.lastIndexOf((CharSequence)var15_16, (char)var16_17);
        var11_12 = (char)(22433 - var11_12);
        var13_14 = AFa1vSDK.getRevenue(var6_7, var10_11, var11_12);
        var13_14 = (Class)var13_14;
        var12_13 = "getCurrencyIso4217Code";
        var17_18 = new Class[var3_4];
        var15_16 = Object.class;
        var17_18[0] = var15_16;
        var4_5 = String.class;
        var17_18[var2_3] = var4_5;
        var13_14 = var13_14.getDeclaredMethod(var12_13, var17_18);
        var1_1 = var14_15;
        var5_6.put(var1_1, var13_14);
lbl91:
        // 2 sources

        var13_14 = (Method)var13_14;
        var1_1 = var13_14.invoke(null, (Object[])var8_9);
        throw (Throwable)var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AFa1lSDK(String object) {
        int n3 = 1;
        Object object2 = "";
        try {
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = AFa1vSDK.registerClient;
            int n4 = -1479677238;
            Object object3 = n4;
            object3 = object.get(object3);
            if (object3 == null) {
                int n7 = View.MeasureSpec.getSize((int)0) + 37;
                char c2 = '0';
                int n8 = TextUtils.indexOf((CharSequence)object2, (char)c2);
                n8 = 195 - n8;
                char c3 = (char)(TextUtils.indexOf((CharSequence)object2, (char)c2, (int)0) + 2458);
                object2 = AFa1vSDK.getRevenue(n7, n8, c3);
                object2 = (Class)object2;
                Class[] classArray = new Class[n3];
                object3 = String.class;
                classArray[0] = object3;
                object3 = ((Class)object2).getDeclaredConstructor(classArray);
                Integer n10 = n4;
                object.put(n10, object3);
            }
            object3 = (Constructor)object3;
            object = ((Constructor)object3).newInstance(objectArray);
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 != null) {
                throw throwable2;
            }
            throw throwable;
        }
        this(object);
    }

    public AFa1lSDK(Map object) {
        this();
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            if (string2 != null) {
                LinkedHashMap linkedHashMap = this.getMediationNetwork;
                object2 = AFa1lSDK.AFAdRevenueData(object2.getValue());
                ((AbstractMap)linkedHashMap).put(string2, object2);
                continue;
            }
            object = new NullPointerException("key == null");
            throw object;
        }
    }

    /*
     * Exception decompiling
     */
    public static Object AFAdRevenueData(Object var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String getCurrencyIso4217Code(Number var0) {
        block23: {
            var1_2 = 1;
            if (var0 == null) break block23;
            var2_3 = var0.doubleValue();
            try {
                var4_4 = var2_3;
            }
            catch (Throwable var0_1) {
                var15_15 /* !! */  = var0_1.getCause();
                if (var15_15 /* !! */  != null) {
                    throw var15_15 /* !! */ ;
                }
                throw var0_1;
            }
            var5_5 = new Object[var1_2];
            var5_5[0] = var4_4;
            var4_4 = AFa1vSDK.registerClient;
            var6_6 = -1977863553;
            var7_7 = var6_6;
            var7_7 = var4_4.get(var7_7);
            if (var7_7 != null) ** GOTO lbl54
            var8_8 = ViewConfiguration.getDoubleTapTimeout() >> 16;
            var8_8 = 37 - var8_8;
            var9_9 = ViewConfiguration.getScrollFriction();
            var10_10 = '\u0000';
            cfr_temp_0 = var9_9 - 0.0f;
            var11_11 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            var11_11 = 123 - var11_11;
            var12_12 = "";
            var13_13 = '0';
            var10_10 = TextUtils.indexOf((CharSequence)var12_12, (char)var13_13, (int)0, (int)0);
            var10_10 = (char)(22433 - var10_10);
            var7_7 = AFa1vSDK.getRevenue(var8_8, (int)var11_11, var10_10);
            var7_7 = (Class)var7_7;
            var14_14 = "getRevenue";
            var15_15 /* !! */  = new Class[var1_2];
            var12_12 = Double.TYPE;
            var15_15 /* !! */ [0] = var12_12;
            var7_7 = var7_7.getDeclaredMethod(var14_14, var15_15 /* !! */ );
            var15_15 /* !! */  = var6_6;
            var4_4.put(var15_15 /* !! */ , var7_7);
lbl54:
            // 2 sources

            var7_7 = (Method)var7_7;
            var1_2 = 0;
            var15_15 /* !! */  = null;
            var15_15 /* !! */  = var7_7.invoke(null, var5_5);
            var15_15 /* !! */  = (Double)var15_15 /* !! */ ;
            var15_15 /* !! */ .getClass();
            var15_15 /* !! */  = AFa1lSDK.getRevenue;
            var1_2 = (int)var0.equals(var15_15 /* !! */ );
            if (var1_2 != 0) {
                return "-0";
            }
            var16_16 = var0.longValue();
            var18_17 = var16_16;
            cfr_temp_1 = var2_3 - var18_17;
            var6_6 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1));
            if (var6_6 == 0) {
                return Long.toString(var16_16);
            }
            return var0.toString();
        }
        var0 = new AFa1gSDK("Number must be non-null");
        throw var0;
    }

    public static String getCurrencyIso4217Code(String object) {
        if (object != null) {
            return object;
        }
        object = new AFa1gSDK("Names must be non-null");
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final AFa1lSDK getCurrencyIso4217Code(String var1_1, Object var2_3) {
        block23: {
            var3_4 = 1;
            if (var2_3 == null) {
                this.getMediationNetwork.remove(var1_1);
                return this;
            }
            var4_5 = var2_3 instanceof Number;
            if (!var4_5) break block23;
            var5_6 = var2_3;
            var5_6 = (Number)var2_3;
            var6_7 = var5_6.doubleValue();
            try {
                var5_6 = var6_7;
            }
            catch (Throwable var1_2) {
                var2_3 = var1_2.getCause();
                if (var2_3 != null) {
                    throw var2_3;
                }
                throw var1_2;
            }
            var8_8 = new Object[var3_4];
            var8_8[0] = var5_6;
            var5_6 = AFa1vSDK.registerClient;
            var9_9 = -1977863553;
            var10_10 = var9_9;
            var10_10 = var5_6.get(var10_10);
            if (var10_10 != null) ** GOTO lbl55
            var11_11 = View.resolveSizeAndState((int)0, (int)0, (int)0);
            var11_11 = 37 - var11_11;
            var12_12 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 122;
            var13_13 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            var13_13 = (char)(22434 - var13_13);
            var10_10 = AFa1vSDK.getRevenue(var11_11, var12_12, var13_13);
            var10_10 = (Class)var10_10;
            var14_14 = "getRevenue";
            var15_15 /* !! */  = new Class[var3_4];
            var16_16 = Double.TYPE;
            var15_15 /* !! */ [0] = var16_16;
            var10_10 = var10_10.getMethod(var14_14, var15_15 /* !! */ );
            var15_15 /* !! */  = var9_9;
            var5_6.put(var15_15 /* !! */ , var10_10);
lbl55:
            // 2 sources

            var10_10 = (Method)var10_10;
            var3_4 = 0;
            var15_15 /* !! */  = null;
            var15_15 /* !! */  = var10_10.invoke(null, var8_8);
            var15_15 /* !! */  = (Double)var15_15 /* !! */ ;
            var15_15 /* !! */ .getClass();
        }
        var15_15 /* !! */  = this.getMediationNetwork;
        if (var1_1 != null) {
            var15_15 /* !! */ .put(var1_1, var2_3);
            return this;
        }
        var1_1 = new AFa1gSDK("Names must be non-null");
        throw var1_1;
    }

    public final void getCurrencyIso4217Code(AFa1kSDK object) {
        boolean bl2;
        Object object2 = AFa1kSDK$AFa1ySDK.AFAdRevenueData;
        Object object3 = "{";
        ((AFa1kSDK)object).AFAdRevenueData((AFa1kSDK$AFa1ySDK)((Object)object2), (String)object3);
        object2 = this.getMediationNetwork.entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (Map.Entry)object2.next();
            String string2 = (String)object3.getKey();
            if (string2 != null) {
                ((AFa1kSDK)object).getCurrencyIso4217Code();
                ((AFa1kSDK)object).getMediationNetwork(string2);
                object3 = object3.getValue();
                ((AFa1kSDK)object).getMonetizationNetwork(object3);
                continue;
            }
            object = new AFa1gSDK("Names must be non-null");
            throw object;
        }
        object2 = AFa1kSDK$AFa1ySDK.AFAdRevenueData;
        object3 = AFa1kSDK$AFa1ySDK.getRevenue;
        ((AFa1kSDK)object).AFAdRevenueData((AFa1kSDK$AFa1ySDK)((Object)object2), (AFa1kSDK$AFa1ySDK)((Object)object3), "}");
    }

    public final String toString() {
        AFa1kSDK aFa1kSDK;
        try {
            aFa1kSDK = new AFa1kSDK();
        }
        catch (AFa1gSDK aFa1gSDK) {
            return null;
        }
        this.getCurrencyIso4217Code(aFa1kSDK);
        return aFa1kSDK.toString();
    }
}

