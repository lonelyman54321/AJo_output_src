/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.g;
import com.facebook.j$a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class j {
    public static final j a;
    public static final AtomicBoolean b;
    public static final AtomicBoolean c;
    public static final j$a d;
    public static final j$a e;
    public static final j$a f;
    public static final j$a g;
    public static final j$a h;
    public static SharedPreferences i;

    static {
        Object object = new j();
        a = object;
        b = object = new AtomicBoolean(false);
        c = object = new AtomicBoolean(false);
        boolean bl2 = true;
        d = object = new j$a(bl2, "com.facebook.sdk.AutoInitEnabled");
        e = object = new j$a(bl2, "com.facebook.sdk.AutoLogAppEventsEnabled");
        f = object = new j$a(bl2, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
        g = object = new j$a(false, "auto_event_setup_enabled");
        h = object = new j$a(bl2, "com.facebook.sdk.MonitorEnabled");
    }

    public static final boolean b() {
        Object object;
        Class<j> clazz = j.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return false;
        }
        try {
            object = a;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return false;
        }
        ((j)object).e();
        object = f;
        return ((j$a)object).a();
    }

    public static final boolean c() {
        j j3;
        Class<j> clazz = j.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return false;
        }
        try {
            j3 = a;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return false;
        }
        j3.e();
        return j3.a();
    }

    /*
     * Exception decompiling
     */
    public static final Boolean i() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [7, 6 : 51->54)] java.lang.Throwable
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
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Throwable throwable222;
        block10: {
            Object object;
            block9: {
                Object object2;
                block11: {
                    boolean bl2;
                    boolean bl3 = td0.b(this);
                    if (bl3) {
                        return false;
                    }
                    object = dl0_2.c();
                    if (object == null || (bl2 = object.isEmpty())) break block9;
                    Object object3 = "auto_log_app_events_enabled";
                    object3 = object.get(object3);
                    object3 = (Boolean)object3;
                    object2 = "auto_log_app_events_default";
                    object = object.get(object2);
                    object = (Boolean)object;
                    if (object3 != null) {
                        return (Boolean)object3;
                    }
                    bl2 = td0.b(this);
                    object2 = null;
                    if (bl2) break block11;
                    {
                        catch (Throwable throwable222) {
                            break block10;
                        }
                    }
                    try {
                        object3 = j.i();
                        if (object3 == null && (object3 = this.f()) == null) break block11;
                        object2 = object3;
                    }
                    catch (Throwable throwable3) {
                        td0.a(this, throwable3);
                    }
                }
                if (object2 != null) {
                    return (Boolean)object2;
                }
                if (object != null) {
                    return (Boolean)object;
                }
                return true;
            }
            object = e;
            return ((j$a)object).a();
        }
        td0.a(this, throwable222);
        return false;
    }

    public final void d() {
        Object object;
        long l2;
        Object object2;
        block14: {
            long l3;
            boolean bl2;
            block13: {
                bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    object2 = g;
                }
                catch (Throwable throwable) {
                    td0.a(this, throwable);
                    return;
                }
                this.j((j$a)object2);
                l2 = System.currentTimeMillis();
                object = ((j$a)object2).c;
                if (object == null) break block13;
                l3 = ((j$a)object2).d;
                l3 = l2 - l3;
                long l4 = 604800000L;
                long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l7 >= 0) break block13;
                return;
            }
            object = null;
            ((j$a)object2).c = null;
            l3 = 0L;
            ((j$a)object2).d = l3;
            object2 = c;
            object = null;
            boolean bl3 = true;
            bl2 = ((AtomicBoolean)object2).compareAndSet(false, bl3);
            if (bl2) break block14;
            return;
        }
        object2 = FacebookSdk.d();
        object = new jy3(l2);
        object2.execute((Runnable)object);
    }

    /*
     * Exception decompiling
     */
    public final void e() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [18 : 181->186)] java.lang.Throwable
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
     * Exception decompiling
     */
    public final Boolean f() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [27 : 111->114)] java.lang.Throwable
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
     * Exception decompiling
     */
    public final void g(j$a var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [29 : 128->131)] java.lang.Throwable
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        block15: {
            block17: {
                block16: {
                    block14: {
                        var1_1 = 4;
                        var2_2 = "previous";
                        var3_3 = "com.facebook.sdk.USER_SETTINGS_BITMASK";
                        var4_4 = td0.b(this);
                        if (var4_4) {
                            return;
                        }
                        try {
                            var5_5 = j.b;
                            var4_4 = var5_5.get();
                            if (!var4_4) {
                                return;
                            }
                            var4_4 = FacebookSdk.isInitialized();
                            if (!var4_4) {
                                return;
                            }
                            var5_5 = FacebookSdk.a();
                            var6_6 = j.d;
                            var7_7 = var6_6.a();
                            var8_8 = j.e;
                            var9_9 = var8_8.a() << 1;
                            var7_7 |= var9_9;
                            var8_8 = j.f;
                            var9_9 = var8_8.a() << 2;
                            var7_7 |= var9_9;
                            var8_8 = j.h;
                            var9_9 = var8_8.a() << 3;
                            var7_7 |= var9_9;
                            var8_8 = j.i;
                            var10_10 = "userSettingPref";
                            if (var8_8 != null) break block14;
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var9_9 = 0;
                            var8_8 = null;
                        }
                        catch (Throwable var11_11) {
                            break block15;
                        }
                    }
                    var12_13 = 0;
                    var9_9 = var8_8.getInt(var3_3, 0);
                    if (var9_9 == var7_7) ** GOTO lbl118
                    var13_14 /* !! */  = j.i;
                    if (var13_14 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                        var14_15 = 0;
                        var13_14 /* !! */  = null;
                    }
                    var10_10 = var13_14 /* !! */ .edit();
                    var3_3 = var10_10.putInt(var3_3, var7_7);
                    var3_3.apply();
                    try {
                        var3_3 = var5_5.getPackageManager();
                        var10_10 = var5_5.getPackageName();
                        var14_15 = 128;
                        var3_3 = var3_3.getApplicationInfo((String)var10_10, var14_15);
                        var10_10 = "ctx.packageManager.getAp\u2026ageManager.GET_META_DATA)";
                        Intrinsics.checkNotNullExpressionValue(var3_3, (String)var10_10);
                        var10_10 = var3_3.metaData;
                        if (var10_10 == null) break block16;
                        var10_10 = "com.facebook.sdk.AutoInitEnabled";
                        var13_14 /* !! */  = "com.facebook.sdk.AutoLogAppEventsEnabled";
                        var15_16 = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
                        var16_18 = "com.facebook.sdk.MonitorEnabled";
                        var10_10 = new String[]{var10_10, var13_14 /* !! */ , var15_16, var16_18};
                        v0 /* !! */  = var13_14 /* !! */  = (SharedPreferences)new boolean[var1_1];
                        v0 /* !! */ [0] = (SharedPreferences)true;
                        v0 /* !! */ [1] = (SharedPreferences)true;
                        v0 /* !! */ [2] = (SharedPreferences)true;
                        v0 /* !! */ [3] = (SharedPreferences)true;
                        var17_20 = 0;
                        var15_16 = null;
                        var18_21 = 0;
                        var16_18 = null;
                    }
                    catch (PackageManager.NameNotFoundException v2) {
                        var18_21 = 0;
                        var16_19 = null;
                        break block17;
                    }
                    while (var12_13 < var1_1) {
                        try {
                            var19_22 = var3_3.metaData;
                            var20_23 = var10_10[var12_13];
                            var21_24 = var19_22.containsKey(var20_23) << var12_13;
                            var18_21 |= var21_24;
                            var19_22 = var3_3.metaData;
                            var20_23 = var10_10[var12_13];
                            var22_25 = var13_14 /* !! */ [var12_13];
                            var21_24 = var19_22.getBoolean(var20_23, (boolean)var22_25) << var12_13;
                            var17_20 |= var21_24;
                            ++var12_13;
                        }
                        catch (PackageManager.NameNotFoundException v1) {
                            var12_13 = var17_20;
                            break block17;
                        }
                    }
lbl87:
                    // 2 sources

                    while (true) {
                        var12_13 = var18_21;
                        ** GOTO lbl-1000
                        break;
                    }
                }
                var17_20 = 0;
                var15_17 = null;
                ** GOTO lbl-1000
            }
            var17_20 = var12_13;
            ** while (true)
lbl-1000:
            // 2 sources

            {
                var11_12 = new g((Context)var5_5, null);
                var3_3 = "loggerImpl";
                Intrinsics.checkNotNullParameter(var11_12, var3_3);
                var3_3 = new Bundle();
                var5_5 = "usage";
                var3_3.putInt((String)var5_5, var12_13);
                var5_5 = "initial";
                var3_3.putInt((String)var5_5, var17_20);
                var3_3.putInt(var2_2, var9_9);
                var5_5 = "current";
                var3_3.putInt((String)var5_5, var7_7);
                var5_5 = "parameters";
                Intrinsics.checkNotNullParameter(var3_3, (String)var5_5);
                var23_26 = var3_3.getInt(var2_2) & 2;
                if (var23_26 != 0 || (var23_26 = (int)j.c()) != 0) {
                    var2_2 = "fb_sdk_settings_changed";
                    var11_12.h((Bundle)var3_3, var2_2);
                }
lbl118:
                // 4 sources

                return;
            }
        }
        td0.a(this, var11_11);
    }

    /*
     * Exception decompiling
     */
    public final void j(j$a var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [6, 5 : 48->52)] java.lang.Throwable
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

    public final void k() {
        Serializable serializable;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            serializable = b;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        bl2 = serializable.get();
        if (bl2) {
            return;
        }
        String string2 = "The UserSettingManager has not been initialized successfully";
        serializable = new FacebookException(string2);
        throw serializable;
    }

    /*
     * Exception decompiling
     */
    public final void l(j$a var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [18, 17 : 90->97)] java.lang.Throwable
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
}

