/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qi0
 */
public final class qi0_2
extends is2_2 {
    public final List b;
    public final CoroutineContext c;
    public Object d;
    public int e;

    public qi0_2(Object object, List list, Object object2, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(list, "interceptors");
        Intrinsics.checkNotNullParameter(object2, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        super(object);
        this.b = list;
        this.c = coroutineContext;
        this.d = object2;
    }

    public final Object a(f80_0 f80_02, Object object) {
        this.e = 0;
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.d = object;
        return this.c(f80_02);
    }

    public final Object b() {
        return this.d;
    }

    public final Object c(f80_0 f80_02) {
        int n3 = this.e;
        if (n3 < 0) {
            return this.d;
        }
        List list = this.b;
        int n4 = list.size();
        if (n3 >= n4) {
            this.e = -1;
            return this.d;
        }
        return this.e(f80_02);
    }

    public final Object d(f80_0 f80_02, Object object) {
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.d = object;
        return this.c(f80_02);
    }

    /*
     * Unable to fully structure code
     */
    public final Object e(f80_0 var1_1) {
        var2_2 = var1_1 instanceof qi0$a_0;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (qi0$a_0)var1_1;
        var4_4 = var3_3.d;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.d = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new qi0$a_0(this, (f80_0)var1_1);
        }
        var1_1 = var3_3.b;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.d;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl23
        if (var5_5 == var6_6) {
            var8_8 = var3_3.a;
            vl2_2.b(var1_1);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var1_1);
            var8_8 = this;
        }
        do {
            block9: {
                block8: {
                    if ((var9_9 = var8_8.e) == (var10_10 = -1)) break block8;
                    var11_11 = var8_8.b;
                    var12_12 = var11_11.size();
                    if (var9_9 < var12_12) break block9;
                    var8_8.e = var10_10;
                }
                return var8_8.d;
            }
            var13_13 = (gx0_2)var11_11.get(var9_9);
            var8_8.e = ++var9_9;
            var1_1 = var8_8.d;
            var3_3.a = var8_8;
            var3_3.d = var6_6;
        } while ((var1_1 = var13_13.invoke(var8_8, var1_1, var3_3)) != var7_7);
        return var7_7;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }
}

