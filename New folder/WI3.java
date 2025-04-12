/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Trace
 */
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.WorkerParameters;
import androidx.work.WorkerParameters$a;
import androidx.work.a;
import androidx.work.b;
import androidx.work.c;
import androidx.work.c$a;
import androidx.work.c$a$a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class WI3 {
    public final EI3 a;
    public final Context b;
    public final String c;
    public final WorkerParameters$a d;
    public final Si3 e;
    public final a f;
    public final xj2_2 g;
    public final BV0 h;
    public final WorkDatabase i;
    public final FI3 j;
    public final ap0 k;
    public final List l;
    public final String m;
    public final xl1_2 n;

    public WI3(WI3$a object) {
        FI3 fI3;
        Intrinsics.checkNotNullParameter(object, "builder");
        Object object2 = ((WI3$a)object).e;
        this.a = object2;
        Object object3 = ((WI3$a)object).g;
        this.b = object3;
        this.c = object2 = ((EI3)object2).a;
        object3 = ((WI3$a)object).h;
        this.d = object3;
        object3 = ((WI3$a)object).b;
        this.e = object3;
        object3 = ((WI3$a)object).a;
        this.f = object3;
        object3 = ((a)object3).d;
        this.g = object3;
        object3 = ((WI3$a)object).c;
        this.h = object3;
        object3 = ((WI3$a)object).d;
        this.i = object3;
        this.j = fI3 = ((WorkDatabase)object3).f();
        this.k = object3 = ((WorkDatabase)object3).a();
        this.l = object = ((WI3$a)object).f;
        object2 = Gn.a("Work [ id=", (String)object2, ", tags={ ");
        object3 = object;
        object = CollectionsKt.R((Iterable)object, ",", null, null, null, 62);
        this.m = object = h30_0.a((StringBuilder)object2, (String)object, " } ]");
        this.n = object = mm0.a();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(WI3 var0, f80_0 var1_1) {
        block31: {
            block30: {
                block29: {
                    block32: {
                        var2_2 = var0;
                        var3_3 = var1_1;
                        var4_8 = 2;
                        var5_9 = 3;
                        var6_10 = null;
                        var7_11 = 1;
                        var8_12 = var1_1 instanceof zi3_2;
                        if (var8_12 == 0) ** GOTO lbl-1000
                        var9_13 = var1_1;
                        var9_13 = (zi3_2)var1_1;
                        var10_14 = var9_13.d;
                        var11_15 = -1 << -1;
                        var12_16 = var10_14 & var11_15;
                        if (var12_16 != 0) {
                            var9_13.d = var10_14 -= var11_15;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_13 = new zi3_2(var2_2, (f80_0)var3_3);
                        }
                        var13_17 = var9_13;
                        var3_3 = var9_13.b;
                        var14_18 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var8_12 = var9_13.d;
                        if (var8_12 != 0) {
                            if (var8_12 != var7_11) {
                                var3_3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var3_3;
                            }
                            var15_19 = var9_13.a;
                            vl2_2.b(var3_3);
                        }
                        vl2_2.b(var3_3);
                        var9_13 = var2_2.f;
                        var3_3 = var9_13.m;
                        var3_3.getClass();
                        var10_14 = (int)gp3_0.b();
                        var16_21 = var2_2.a;
                        var17_22 = var16_21.x;
                        if (var10_14 != 0 && var17_22 != null) {
                            block28: {
                                var18_23 = var16_21.hashCode();
                                var9_13.m.getClass();
                                var19_24 = "methodName";
                                Intrinsics.checkNotNullParameter(var17_22, (String)var19_24);
                                var20_25 = Build.VERSION.SDK_INT;
                                var21_26 = 29;
                                if (var20_25 >= var21_26) {
                                    var15_19 = gp3_0.c(var17_22);
                                    hp3_0.a(var18_23, (String)var15_19);
                                } else {
                                    block27: {
                                        var19_24 = gp3_0.c(var17_22);
                                        var22_27 = "asyncTraceBegin";
                                        try {
                                            var23_28 = gp3_0.c;
                                            if (var23_28 != null) break block27;
                                            var23_28 = Trace.class;
                                            var24_29 = new Class[var5_9];
                                            var24_29[0] = var25_30 /* !! */  = Long.TYPE;
                                            var24_29[var7_11] = var25_30 /* !! */  = String.class;
                                            var24_29[var4_8] = var25_30 /* !! */  = Integer.TYPE;
                                            gp3_0.c = var24_29 = var23_28.getMethod((String)var22_27, (Class<?>)var24_29);
                                        }
                                        catch (Exception var3_5) {
                                            break block28;
                                        }
                                    }
                                    var24_29 = gp3_0.c;
                                    var26_31 = gp3_0.a;
                                    var22_27 = var26_31;
                                    var3_3 = var18_23;
                                    var28_20 /* !! */  = new Object[var5_9];
                                    var28_20 /* !! */ [0] = var22_27;
                                    var28_20 /* !! */ [var7_11] = var19_24;
                                    var28_20 /* !! */ [var4_8] = var3_3;
                                    var4_8 = 0;
                                    var15_19 = null;
                                    var24_29.invoke(null, var28_20 /* !! */ );
                                }
                                break block32;
                            }
                            gp3_0.a(var3_5);
                        }
                    }
                    var3_3 = new VI3(var2_2);
                    var24_29 = var2_2.i;
                    var3_3 = (Boolean)var24_29.runInTransaction((Callable)var3_3);
                    var15_19 = "shouldExit";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var15_19);
                    var18_23 = (int)var3_3.booleanValue();
                    if (var18_23 != 0) {
                        var4_8 = 0;
                        var15_19 = null;
                        return new WI3$b$c(null);
                    }
                    var18_23 = (int)var16_21.f();
                    var15_19 = var2_2.c;
                    if (var18_23 != 0) {
                        var3_3 = var16_21.e;
                    } else {
                        var3_3 = var9_13.f;
                        var3_3.getClass();
                        var28_20 /* !! */  = var16_21.d;
                        var19_24 = "className";
                        Intrinsics.checkNotNullParameter(var28_20 /* !! */ , (String)var19_24);
                        var3_3.Q((String)var28_20 /* !! */ );
                        var18_23 = Oh1.a;
                        Intrinsics.checkNotNullParameter(var28_20 /* !! */ , (String)var19_24);
                        try {
                            var3_3 = Class.forName((String)var28_20 /* !! */ );
                            var5_9 = 0;
                            var28_20 /* !! */  = null;
                            var3_3 = var3_3.getDeclaredConstructor(null);
                            var3_3 = var3_3.newInstance(null);
                            var28_20 /* !! */  = "null cannot be cast to non-null type androidx.work.InputMerger";
                            Intrinsics.checkNotNull(var3_3, (String)var28_20 /* !! */ );
                            var3_3 = (Nh1)var3_3;
                        }
                        catch (Exception v0) {
                            qx1.a().getClass();
                            var18_23 = 0;
                            var3_3 = null;
                        }
                        if (var3_3 == null) {
                            var18_23 = androidx.work.impl.a.a;
                            var3_3 = qx1.a();
                            var3_3.getClass();
                            return new WI3$b$a(0);
                        }
                        var28_20 /* !! */  = kotlin.collections.a.b(var16_21.e);
                        var19_24 = var2_2.j.l((String)var15_19);
                        var28_20 /* !! */  = CollectionsKt.W((Iterable)var19_24, (Collection)var28_20 /* !! */ );
                        var3_3 = var3_3.a((ArrayList)var28_20 /* !! */ );
                    }
                    var15_19 = UUID.fromString((String)var15_19);
                    var19_24 = var2_2.l;
                    var23_28 = var2_2.e;
                    var22_27 = new zi3_1((WorkDatabase)var24_29, (Si3)var23_28);
                    var29_32 = var2_2.h;
                    var6_10 = new fi3_0((WorkDatabase)var24_29, (BV0)var29_32, (Si3)var23_28);
                    var28_20 /* !! */  = new Object();
                    var28_20 /* !! */ .a = var15_19;
                    var28_20 /* !! */ .b = var3_3;
                    var28_20 /* !! */ .c = var3_3 = new HashSet(var19_24);
                    var28_20 /* !! */ .d = var3_3 = var2_2.d;
                    var28_20 /* !! */ .e = var18_23 = var16_21.k;
                    var28_20 /* !! */ .f = var3_3 = var9_13.a;
                    var28_20 /* !! */ .g = var3_3 = var9_13.b;
                    var28_20 /* !! */ .h = var23_28;
                    var28_20 /* !! */ .i = var3_3 = var9_13.e;
                    var28_20 /* !! */ .j = var22_27;
                    var28_20 /* !! */ .k = var6_10;
                    try {
                        var15_19 = var2_2.b;
                        var9_13 = var16_21.c;
                        var3_3 = var3_3.b((Context)var15_19, (String)var9_13, (WorkerParameters)var28_20 /* !! */ );
                        var3_3.setUsed();
                        var15_19 = var13_17.getContext();
                        var28_20 /* !! */  = i$a.a;
                        var15_19 = var15_19.get((CoroutineContext$a)var28_20 /* !! */ );
                    }
                    catch (Throwable v1) {
                        var18_23 = androidx.work.impl.a.a;
                        var3_3 = qx1.a();
                        var3_3.getClass();
                        var4_8 = 0;
                        var15_19 = null;
                        return new WI3$b$a(0);
                    }
                    Intrinsics.checkNotNull(var15_19);
                    var29_32 = var15_19;
                    var29_32 = (i)var15_19;
                    var21_26 = 1;
                    var15_19 = var19_24;
                    var28_20 /* !! */  = var3_3;
                    var8_12 = var10_14;
                    var16_21 = var0;
                    var12_16 = var21_26;
                    var19_24 = new cj_0(var3_3, (boolean)var10_14, var17_22, var0, var21_26);
                    var29_32.G((Function1)var19_24);
                    var5_9 = 1;
                    var15_19 = new Ad0(var2_2, var5_9);
                    var15_19 = var24_29.runInTransaction((Callable)var15_19);
                    var28_20 /* !! */  = "workDatabase.runInTransa\u2026e\n            }\n        )";
                    Intrinsics.checkNotNullExpressionValue(var15_19, (String)var28_20 /* !! */ );
                    var15_19 = (Boolean)var15_19;
                    var4_8 = (int)var15_19.booleanValue();
                    if (var4_8 == 0) {
                        var4_8 = 0;
                        var15_19 = null;
                        return new WI3$b$c(null);
                    }
                    var4_8 = 0;
                    var15_19 = null;
                    var5_9 = (int)var29_32.p();
                    if (var5_9 != 0) {
                        return new WI3$b$c(null);
                    }
                    Intrinsics.checkNotNullExpressionValue(var6_10, "params.foregroundUpdater");
                    var28_20 /* !! */  = var23_28.a();
                    var9_13 = "workTaskExecutor.getMainThreadExecutor()";
                    Intrinsics.checkNotNullExpressionValue(var28_20 /* !! */ , (String)var9_13);
                    var28_20 /* !! */  = h83.a((Executor)var28_20 /* !! */ );
                    try {
                        var9_13 = new aj3_0(var2_2, (c)var3_3, var6_10, null);
                        var13_17.a = var2_2;
                        var13_17.getClass();
                        var13_17.d = var4_8 = 1;
                        var3_3 = Ae3.g(var13_17, (CoroutineContext)var28_20 /* !! */ , (Function2)var9_13);
                        if (var3_3 == var14_18 /* !! */ ) {
                            return var14_18 /* !! */ ;
                        }
                        var15_19 = var2_2;
                        break block29;
                    }
                    catch (Throwable v2) {
                        var15_19 = var2_2;
                        break block30;
                    }
                    catch (CancellationException var3_6) {
                        var15_19 = var2_2;
                        break block31;
                    }
                    catch (CancellationException var3_4) {
                        break block31;
                    }
                }
                try {
                    var3_3 = (c$a)var3_3;
                    var28_20 /* !! */  = "result";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var28_20 /* !! */ );
                    return new WI3$b$b((c$a)var3_3);
                }
                catch (Throwable v3) {}
            }
            var18_23 = androidx.work.impl.a.a;
            var3_3 = qx1.a();
            var28_20 /* !! */  = var15_19.m;
            var3_3.getClass();
            var3_3 = var15_19.f;
            var3_3.getClass();
            var4_8 = 0;
            var15_19 = null;
            return new WI3$b$a(0);
        }
        var5_9 = androidx.work.impl.a.a;
        var28_20 /* !! */  = qx1.a();
        var15_19 = var15_19.m;
        var28_20 /* !! */ .getClass();
        throw var3_7;
    }

    public final void b(int n3) {
        hI3$b hI3$b = hI3$b.ENQUEUED;
        FI3 fI3 = this.j;
        String string2 = this.c;
        fI3.d(hI3$b, string2);
        this.g.getClass();
        long l2 = System.currentTimeMillis();
        fI3.t(l2, string2);
        int n4 = this.a.v;
        fI3.e(n4, string2);
        fI3.b(-1, string2);
        fI3.w(n3, string2);
    }

    public final void c() {
        this.g.getClass();
        long l2 = System.currentTimeMillis();
        FI3 fI3 = this.j;
        String string2 = this.c;
        fI3.t(l2, string2);
        hI3$b hI3$b = hI3$b.ENQUEUED;
        fI3.d(hI3$b, string2);
        fI3.z(string2);
        int n3 = this.a.v;
        fI3.e(n3, string2);
        fI3.a(string2);
        fI3.b(-1, string2);
    }

    public final void d(c$a object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "result");
        String string2 = this.c;
        ArrayList arrayList = xx_2.j(string2);
        while (true) {
            hI3$b hI3$b;
            boolean bl2 = arrayList.isEmpty() ^ true;
            object2 = this.j;
            if (!bl2) break;
            Object object3 = (String)cx_2.y(arrayList);
            hI3$b hI3$b2 = object2.h((String)object3);
            if (hI3$b2 != (hI3$b = hI3$b.CANCELLED)) {
                hI3$b2 = hI3$b.FAILED;
                object2.d(hI3$b2, (String)object3);
            }
            object2 = this.k;
            object3 = object2.a((String)object3);
            arrayList.addAll(object3);
        }
        object = ((c$a$a)object).a;
        Intrinsics.checkNotNullExpressionValue(object, "failure.outputData");
        int n3 = this.a.v;
        object2.e(n3, string2);
        object2.u(string2, (b)object);
    }
}

