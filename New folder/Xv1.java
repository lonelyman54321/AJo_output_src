/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Looper
 */
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public final class Xv1 {
    public static final Object f;
    public static Xv1 g;
    public final Context a;
    public final HashMap b;
    public final HashMap c;
    public final ArrayList d;
    public final Xv1$a e;

    static {
        Object object;
        f = object = new Object();
    }

    public Xv1(Context context) {
        Object object;
        this.b = object = new Object();
        this.c = object = new Object();
        this.d = object;
        this.a = context;
        context = context.getMainLooper();
        super(this, (Looper)context);
        this.e = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Xv1 a(Context object) {
        Object object2 = f;
        synchronized (object2) {
            try {
                Xv1 xv1 = g;
                if (xv1 != null) return g;
                object = object.getApplicationContext();
                g = xv1 = new Xv1((Context)object);
                return g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter) {
        HashMap hashMap = this.b;
        synchronized (hashMap) {
            Throwable throwable2;
            block7: {
                Cloneable cloneable;
                int n3;
                Object object;
                Xv1$c xv1$c;
                block6: {
                    try {
                        xv1$c = new Xv1$c(broadcastReceiver2, intentFilter);
                        object = this.b;
                        object = ((HashMap)object).get(broadcastReceiver2);
                        object = (ArrayList)object;
                        n3 = 1;
                        if (object != null) break block6;
                        object = new ArrayList(n3);
                        cloneable = this.b;
                        cloneable.put(broadcastReceiver2, object);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                ((ArrayList)object).add(xv1$c);
                int n4 = 0;
                broadcastReceiver2 = null;
                while (true) {
                    int n7;
                    if (n4 >= (n7 = intentFilter.countActions())) {
                        return;
                    }
                    object = intentFilter.getAction(n4);
                    cloneable = this.c;
                    cloneable = cloneable.get(object);
                    if ((cloneable = (ArrayList)cloneable) == null) {
                        cloneable = new ArrayList(n3);
                        HashMap hashMap2 = this.c;
                        hashMap2.put(object, cloneable);
                    }
                    ((ArrayList)cloneable).add(xv1$c);
                    ++n4;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Intent var1_1) {
        var2_2 = this;
        var3_3 /* !! */  = var1_1;
        var4_5 = this.b;
        synchronized (var4_5) {
            block14: {
                block15: {
                    block13: {
                        block12: {
                            try {
                                var5_6 = var1_1.getAction();
                                var6_7 = this.a;
                                var6_7 = var6_7.getContentResolver();
                                var7_8 = var1_1.resolveTypeIfNeeded((ContentResolver)var6_7);
                                var8_9 = var1_1.getData();
                                var9_10 = var1_1.getScheme();
                                var10_11 = var1_1.getCategories();
                                var11_12 = var1_1.getFlags() & 8;
                                var12_13 = 0;
                                var13_14 = var11_12 != 0;
                                if (!var13_14) break block12;
                                var1_1.toString();
                            }
                            catch (Throwable var3_4) {
                                break block13;
                            }
                        }
                        var6_7 = var2_2.c;
                        var14_15 = var1_1.getAction();
                        var15_16 = var6_7 = var6_7.get(var14_15);
                        var15_16 = (ArrayList)var6_7;
                        if (var15_16 == null) break block14;
                        if (var13_14) {
                            var15_16.toString();
                        }
                        var11_12 = 0;
                        var6_7 = null;
                        var16_17 = null;
                        var17_18 = 0;
                        break block15;
                    }
                    throw var3_4;
                }
                while (var17_18 < (var11_12 = var15_16.size())) {
                    block16: {
                        var6_7 = var15_16.get(var17_18);
                        var18_19 /* !! */  = var6_7;
                        var18_19 /* !! */  = (Xv1$c)var6_7;
                        if (var13_14) {
                            var6_7 = var18_19 /* !! */ .a;
                            Objects.toString(var6_7);
                        }
                        if ((var11_12 = (int)var18_19 /* !! */ .c) == 0) break block16;
                        var19_20 = var17_18;
                        var20_21 = var15_16;
                        var21_22 = var5_6;
                        var22_23 = var7_8;
                        var7_8 = null;
                        var5_6 = var16_17;
                        ** GOTO lbl-1000
                    }
                    var6_7 = var18_19 /* !! */ .a;
                    var23_24 = "LocalBroadcastManager";
                    var14_15 = var5_6;
                    var24_25 /* !! */  = var18_19 /* !! */ ;
                    var18_19 /* !! */  = var7_8;
                    var19_20 = var17_18;
                    var21_22 = var5_6;
                    var5_6 = var16_17;
                    var16_17 = var8_9;
                    var20_21 = var15_16;
                    var15_16 = var10_11;
                    var22_23 = var7_8;
                    var7_8 = null;
                    var11_12 = var6_7.match((String)var14_15, (String)var18_19 /* !! */ , var9_10, var8_9, var10_11, var23_24);
                    if (var11_12 >= 0) {
                        if (var13_14) {
                            Integer.toHexString(var11_12);
                        }
                        var16_17 = var5_6 == null ? new Object() : var5_6;
                        var16_17.add(var24_25 /* !! */ );
                        var11_12 = 1;
                        var24_25 /* !! */ .c = var11_12;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var16_17 = var5_6;
                    }
                    var17_18 = var19_20 + 1;
                    var5_6 = var21_22;
                    var15_16 = var20_21;
                    var7_8 = var22_23;
                    var12_13 = 0;
                }
                var5_6 = var16_17;
                var7_8 = null;
                if (var16_17 != null) {
                    for (var12_13 = 0; var12_13 < (var11_12 = var5_6.size()); ++var12_13) {
                        var6_7 = var5_6.get(var12_13);
                        var6_7 = (Xv1$c)var6_7;
                        var6_7.c = false;
                    }
                    var6_7 = var2_2.d;
                    var14_15 = new Xv1$b(var3_3 /* !! */ , (ArrayList)var5_6);
                    var6_7.add(var14_15);
                    var3_3 /* !! */  = var2_2.e;
                    var11_12 = 1;
                    var25_26 = var3_3 /* !! */ .hasMessages(var11_12);
                    if (!var25_26) {
                        var3_3 /* !! */  = var2_2.e;
                        var3_3 /* !! */ .sendEmptyMessage(var11_12);
                    }
                    return;
                }
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void d(BroadcastReceiver var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 34->38)] java.lang.Throwable
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

