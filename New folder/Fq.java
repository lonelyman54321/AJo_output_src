/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Fq {
    public final UC1 a;
    public final Z43 b;
    public final x30_0 c;

    public Fq() {
        Object object = new UC1();
        this.a = object;
        this.b = object = new Z43(0);
        this.c = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Fq object, LU0 object2, ct2_1 object3, Object object4) {
        object.getClass();
        object3.getClass();
        object3 = null;
        Fq$b fq$b = new Fq$b((LU0)object2, null);
        object2 = ((Fq)object).c;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    if (object4 == null) {
                        try {
                            object = ((Fq)object).b;
                            object4 = new Fq$a(null);
                            object = ((Z43)object).d(fq$b, (Fq$a)object4);
                            object = (Fq$a)object;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = ((Fq)object).a;
                    object3 = new Fq$a(object4);
                    object = ((UC1)object).b(fq$b, object3);
                    object = (Fq$a)object;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Fq$a a(LU0 object, ct2_1 object2) {
        object2.getClass();
        object2 = null;
        Fq$b fq$b = new Fq$b((LU0)object, null);
        object = this.c;
        synchronized (object) {
            try {
                object2 = this.a;
                object2 = ((UC1)object2).a(fq$b);
                object2 = (Fq$a)object2;
                if (object2 != null) return object2;
                object2 = this.b;
                object2 = ((Z43)object2).a(fq$b);
                return (Fq$a)object2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(LU0 var1_1, ct2_1 var2_3, jq$b var3_5, f80_0 var4_6) {
        block19: {
            block18: {
                var5_7 = var4_6 instanceof gq_1;
                if (!var5_7) ** GOTO lbl-1000
                var6_8 = var4_6;
                var6_8 = (gq_1)var4_6;
                var7_9 = var6_8.f;
                var8_10 = -1 << -1;
                var9_11 = var7_9 & var8_10;
                if (var9_11 != 0) {
                    var6_8.f = var7_9 -= var8_10;
                } else lbl-1000:
                // 2 sources

                {
                    var6_8 = new gq_1(this, (f80_0)var4_6);
                }
                var4_6 = var6_8.d;
                var10_12 = j90_0.COROUTINE_SUSPENDED;
                var8_10 = var6_8.f;
                var9_11 = 0;
                var11_13 = 1;
                if (var8_10 == 0) break block18;
                if (var8_10 != var11_13) {
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var12_14 = var6_8.c;
                var2_3 = var6_8.b;
                var3_5 = var6_8.a;
                vl2_2.b(var4_6);
                break block19;
            }
            vl2_2.b(var4_6);
            var2_3.getClass();
            var4_6 = new Fq$b((LU0)var1_1, null);
            var1_1 = this.c;
            synchronized (var1_1) {
                block14: {
                    try {
                        var2_3 = this.a;
                        var2_3 = var2_3.a(var4_6);
                        var2_3 = (Fq$a)var2_3;
                        if (var2_3 != null) break block14;
                        var2_3 = this.b;
                        var2_3 = var2_3.a(var4_6);
                        var2_3 = (Fq$a)var2_3;
                    }
                    catch (Throwable var2_4) {
                        ** break block15
                    }
                }
                if (var2_3 == null) ** GOTO lbl-1000
                return var2_3.a;
lbl-1000:
                // 1 sources

                {
                    var2_3 = Unit.a;
                }
            }
            var6_8.a = this;
            var6_8.b = var4_6;
            var12_14 = false;
            var1_1 = null;
            var6_8.c = false;
            var6_8.f = var11_13;
            var2_3 = var3_5.invoke(var6_8);
            if (var2_3 == var10_12) {
                return var10_12;
            }
            var3_5 = this;
            var13_15 = var4_6;
            var4_6 = var2_3;
            var2_3 = var13_15;
        }
        var6_8 = var3_5.c;
        synchronized (var6_8) {
            block17: {
                block16: {
                    if (var4_6 == null) {
                        try {
                            var1_1 = var3_5.b;
                            var3_5 = new Fq$a(null);
                            var1_1.d((Fq$b)var2_3, (Fq$a)var3_5);
                            break block16;
                        }
                        catch (Throwable var1_2) {
                            break block17;
                        }
                    }
                    if (var12_14) {
                        var1_1 = var3_5.b;
                        var3_5 = new Fq$a(var4_6);
                        var1_1.d((Fq$b)var2_3, (Fq$a)var3_5);
                    } else {
                        var1_1 = var3_5.a;
                        var3_5 = new Fq$a(var4_6);
                        var1_1.b(var2_3, var3_5);
                    }
                }
                var1_1 = Unit.a;
                return var4_6;
            }
            throw var1_2;
        }
lbl-1000:
        // 1 sources

        {
            throw var2_4;
        }
    }
}

