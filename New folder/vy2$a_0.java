/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler$a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from vy2$a
 */
public final class vy2$a_0
implements xs1$b,
xy2 {
    public final int a;
    public final long b;
    public final wy2 c;
    public wf3$a_0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public vy2$a$a h;
    public boolean i;
    public final /* synthetic */ vy2_0 j;

    public vy2$a_0(vy2_0 vy2_02, int n3, long l2, wy2 wy22) {
        this.j = vy2_02;
        this.a = n3;
        this.b = l2;
        this.c = wy22;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(AndroidPrefetchScheduler$a var1_1) {
        block35: {
            block36: {
                block39: {
                    block34: {
                        block37: {
                            block30: {
                                block38: {
                                    block31: {
                                        var2_6 = this.c();
                                        if (!var2_6) {
                                            return false;
                                        }
                                        var3_7 = (wr1_0)this.j.a.b.invoke();
                                        var4_8 = this.a;
                                        var3_7 = var3_7.e(var4_8);
                                        var5_9 = this.d;
                                        var6_10 = 1;
                                        if (var5_9 != null) {
                                            var4_8 = 1;
                                        } else {
                                            var4_8 = 0;
                                            var5_9 = null;
                                        }
                                        var7_11 /* !! */  = 0L;
                                        var9_12 = this.c;
                                        if (var4_8 != 0) break block37;
                                        if (var3_7 != null && (var4_8 = (var5_9 = var9_12.a).a(var3_7)) >= 0) {
                                            var5_9 = var9_12.a;
                                            var10_13 = var5_9.b(var3_7);
                                        } else {
                                            var10_13 = var9_12.c;
                                        }
                                        var12_14 = var1_1.a();
                                        var4_8 = (int)this.i;
                                        if (var4_8 == 0 || (var4_8 = (int)(var12_14 == var7_11 /* !! */  ? 0 : (var12_14 < var7_11 /* !! */  ? -1 : 1))) <= 0) {
                                            var4_8 = (int)(var10_13 == var12_14 ? 0 : (var10_13 < var12_14 ? -1 : 1));
                                            if (var4_8 >= 0) return (boolean)var6_10;
                                        }
                                        var10_13 = System.nanoTime();
                                        var5_9 = "compose:lazy:prefetch:compose";
                                        Trace.beginSection((String)var5_9);
                                        this.d();
                                        var5_9 = Unit.a;
                                        var12_14 = System.nanoTime() - var10_13;
                                        if (var3_7 == null) break block30;
                                        var5_9 = var9_12.a;
                                        var14_15 = var5_9.a(var3_7);
                                        if (var14_15 < 0) break block31;
                                        var5_9 = var5_9.c;
                                        var10_13 = (long)var5_9[var14_15];
                                        break block38;
                                    }
                                    var10_13 = var7_11 /* !! */ ;
                                }
                                var10_13 = wy2.a(var9_12, var12_14, var10_13);
                                var5_9 = var9_12.a;
                                var5_9.e(var10_13, var3_7);
                            }
                            var10_13 = var9_12.c;
                            var9_12.c = var10_13 = wy2.a(var9_12, var12_14, var10_13);
                            break block37;
                            finally {
                                Trace.endSection();
                            }
                        }
                        if ((var4_8 = (int)this.i) != 0) break block39;
                        var4_8 = (int)this.g;
                        if (var4_8 == 0) {
                            var10_13 = var1_1.a();
                            cfr_temp_0 = var10_13 - var7_11 /* !! */ ;
                            var4_8 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var4_8 <= 0) return (boolean)var6_10;
                            var5_9 = "compose:lazy:prefetch:resolve-nested";
                            Trace.beginSection((String)var5_9);
                            try {
                                this.h = var5_9 = this.f();
                                this.g = var6_10;
                                var5_9 = Unit.a;
                            }
                            finally {
                                Trace.endSection();
                            }
                        }
                        if ((var5_9 = this.h) == null) break block39;
                        var15_16 = var5_9.b;
                        var16_17 = var5_9.c;
                        var17_18 = var5_9.a;
                        var18_19 = var17_18.size();
                        if (var16_17 >= var18_19) break block39;
                        var19_20 = var5_9.e;
                        var16_17 = var19_20.f ^ var6_10;
                        if (var16_17 == 0) {
                            var3_7 = "Should not execute nested prefetch on canceled request".toString();
                            var1_1 = new IllegalStateException((String)var3_7);
                            throw var1_1;
                        }
                        var19_20 = "compose:lazy:prefetch:nested";
                        Trace.beginSection((String)var19_20);
                        while (true) {
                            block33: {
                                try {
                                    var16_17 = var5_9.c;
                                    var18_19 = var17_18.size();
                                    if (var16_17 >= var18_19) break;
                                    var16_17 = var5_9.c;
                                    var19_20 = var15_16[var16_17];
                                    if (var19_20 != null) break block33;
                                }
                                catch (Throwable var1_4) {
                                    break block34;
                                }
                                var20_21 = var1_1.a();
                                cfr_temp_1 = var20_21 - var7_11 /* !! */ ;
                                var16_17 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var16_17 <= 0) ** GOTO lbl123
                                var16_17 = var5_9.c;
                                var22_22 = var17_18.get(var16_17);
                                var22_22 = (xs1)var22_22;
                                var23_23 = var22_22.b;
                                if (var23_23 == null) {
                                    var22_22 = mz0_2.a;
                                } else {
                                    var24_24 = new xs1$a((xs1)var22_22);
                                    var23_23.invoke(var24_24);
                                    var22_22 = var24_24.a;
                                }
                                var15_16[var16_17] = var22_22;
                            }
                            var16_17 = var5_9.c;
                            var19_20 = var15_16[var16_17];
                            Intrinsics.checkNotNull(var19_20);
                            while ((var18_19 = var5_9.d) < (var25_25 = var19_20.size())) {
                                block40: {
                                    var18_19 = var5_9.d;
                                    var22_22 = var19_20.get(var18_19);
                                    var18_19 = (int)(var22_22 = (xy2)var22_22).a((AndroidPrefetchScheduler$a)var1_1);
                                    if (var18_19 == 0) break block40;
lbl123:
                                    // 2 sources

                                    Trace.endSection();
                                    return (boolean)var6_10;
                                }
                                var5_9.d = var18_19 = var5_9.d + var6_10;
                            }
                            var5_9.d = 0;
                            var5_9.c = var16_17 = var5_9.c + var6_10;
                        }
                        var5_9 = Unit.a;
                        Trace.endSection();
                        break block39;
                    }
                    Trace.endSection();
                    throw var1_4;
                }
                if ((var4_8 = (int)this.e) != 0) return false;
                var10_13 = this.b;
                var4_8 = (int)c60.l(var10_13);
                if (var4_8 != 0) return false;
                if (var3_7 != null && (var4_8 = (var5_9 = var9_12.b).a(var3_7)) >= 0) {
                    var5_9 = var9_12.b;
                    var12_14 = var5_9.b(var3_7);
                } else {
                    var12_14 = var9_12.d;
                }
                var26_26 = var1_1.a();
                var28_27 /* !! */  = this.i;
                if (var28_27 /* !! */  == 0 || (var28_27 /* !! */  = var26_26 == var7_11 /* !! */  ? 0 : (var26_26 < var7_11 /* !! */  ? -1 : 1)) <= 0) {
                    var28_27 /* !! */  = (int)(var12_14 == var26_26 ? 0 : (var12_14 < var26_26 ? -1 : 1));
                    if (var28_27 /* !! */  >= 0) return (boolean)var6_10;
                }
                var29_28 = System.nanoTime();
                var1_1 = "compose:lazy:prefetch:measure";
                Trace.beginSection((String)var1_1);
                this.e(var10_13);
                var1_1 = Unit.a;
                var10_13 = System.nanoTime() - var29_28;
                if (var3_7 == null) break block35;
                var1_1 = var9_12.b;
                var4_8 = var1_1.a(var3_7);
                if (var4_8 < 0) break block36;
                var1_1 = var1_1.c;
                var7_11 /* !! */  = (long)var1_1[var4_8];
            }
            var29_28 = wy2.a(var9_12, var10_13, var7_11 /* !! */ );
            var1_1 = var9_12.b;
            var1_1.e(var29_28, var3_7);
        }
        var29_28 = var9_12.d;
        var9_12.d = var29_28 = wy2.a(var9_12, var10_13, var29_28);
        return false;
        finally {
            Trace.endSection();
        }
    }

    public final void b() {
        this.i = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean c() {
        int n3 = this.f;
        if (n3 != 0) return 0 != 0;
        wr1_0 wr1_02 = (wr1_0)this.j.a.b.invoke();
        n3 = wr1_02.getItemCount();
        int n4 = this.a;
        if (n4 < 0) return 0 != 0;
        if (n4 >= n3) return 0 != 0;
        return 1 != 0;
    }

    public final void cancel() {
        boolean bl2 = this.f;
        if (!bl2) {
            this.f = bl2 = true;
            wf3$a_0 wf3$a_0 = this.d;
            if (wf3$a_0 != null) {
                wf3$a_0.dispose();
            }
            bl2 = false;
            wf3$a_0 = null;
            this.d = null;
        }
    }

    public final void d() {
        boolean bl2 = this.c();
        if (bl2) {
            Object object = this.d;
            if (object == null) {
                object = this.j;
                Object object2 = (wr1_0)((vy2_0)object).a.b.invoke();
                int n3 = this.a;
                Object object3 = object2.c(n3);
                object2 = object2.e(n3);
                object2 = ((vy2_0)object).a.a(n3, object3, object2);
                this.d = object = ((vy2_0)object).b.a().f(object3, (Function2)object2);
                return;
            }
            String string2 = "Request was already composed!".toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
        String string3 = "Callers should check whether the request is still valid before calling performComposition()".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final void e(long l2) {
        boolean bl2 = this.f;
        int n3 = 1;
        if (bl2 ^= n3) {
            bl2 = this.e ^ n3;
            if (bl2) {
                this.e = n3;
                wf3$a_0 wf3$a_0 = this.d;
                if (wf3$a_0 != null) {
                    n3 = wf3$a_0.c();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        wf3$a_0.b(i3, l2);
                    }
                    return;
                }
                String string2 = "performComposition() must be called before performMeasure()".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            String string3 = "Request was already measured!".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        String string4 = "Callers should check whether the request is still valid before calling performMeasure()".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
        throw illegalArgumentException;
    }

    public final vy2$a$a f() {
        Object object = this.d;
        if (object != null) {
            Object object2 = new Ref$ObjectRef();
            vy2$a$b vy2$a$b = new vy2$a$b((Ref$ObjectRef)object2);
            object.a(vy2$a$b);
            object = (List)((Ref$ObjectRef)object2).element;
            object2 = object != null ? new vy2$a$a(this, (List)object) : null;
            return object2;
        }
        String string2 = "Should precompose before resolving nested prefetch states".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        void var2_5;
        StringBuilder stringBuilder = new StringBuilder("HandleAndRequestImpl { index = ");
        int bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", constraints = ");
        long l2 = this.b;
        Object object = c60.m(l2);
        stringBuilder.append(object);
        stringBuilder.append(", isComposed = ");
        object = this.d;
        if (object != null) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        stringBuilder.append((boolean)var2_5);
        stringBuilder.append(", isMeasured = ");
        boolean bl5 = this.e;
        stringBuilder.append(bl5);
        stringBuilder.append(", isCanceled = ");
        boolean bl6 = this.f;
        return Vm.a(" }", bl6, stringBuilder);
    }
}

