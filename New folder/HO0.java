/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.IndexedValue;

public final class HO0 {
    public final IO0 a;
    public final ks1_1 b;
    public int c;

    public HO0() {
        Object object = new IO0();
        this.a = object;
        this.b = object = ls1_2.a();
        this.c = -1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Serializable a(f80_0 var1_1) {
        block12: {
            var2_3 = var1_1 instanceof go0_1;
            if (var2_3 == 0) ** GOTO lbl-1000
            var3_4 = var1_1;
            var3_4 = (go0_1)var1_1;
            var4_5 = var3_4.e;
            var5_6 = -1 << -1;
            var6_7 = var4_5 & var5_6;
            if (var6_7 != 0) {
                var3_4.e = var4_5 -= var5_6;
            } else lbl-1000:
            // 2 sources

            {
                var3_4 = new go0_1(this, (f80_0)var1_1);
            }
            var1_1 = var3_4.c;
            var7_8 = j90_0.COROUTINE_SUSPENDED;
            var5_6 = var3_4.e;
            var6_7 = 0;
            var8_9 = 1;
            if (var5_6 != 0) {
                if (var5_6 != var8_9) {
                    var1_1 = new Iterator<T>("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var7_8 = var3_4.b;
                var3_4 = var3_4.a;
                vl2_2.b(var1_1);
            } else {
                vl2_2.b(var1_1);
                var3_4.a = this;
                var1_1 = this.b;
                var3_4.b = var1_1;
                var3_4.e = var8_9;
                var3_4 = var1_1.d((f80_0)var3_4, null);
                if (var3_4 == var7_8) {
                    return var7_8;
                }
                var3_4 = this;
                var7_8 = var1_1;
            }
            try {
                var1_1 = var3_4.a;
                var1_1 = var1_1.b();
                var2_3 = var3_4.c;
                var5_6 = var1_1.size();
                var2_3 = var2_3 - var5_6 + var8_9;
            }
            catch (Throwable var1_2) {
                break block12;
            }
            var1_1 = (Iterable)var1_1;
            var8_9 = 10;
            var8_9 = yx_2.o((Iterable)var1_1, var8_9);
            var9_10 = new ArrayList<IndexedValue>(var8_9);
            var1_1 = var1_1.iterator();
            var8_9 = 0;
            while (true) {
                if (!(var10_11 = var1_1.hasNext())) {
                    var7_8.b(null);
                    return var9_10;
                }
                var11_12 /* !! */  = var1_1.next();
                var12_13 = var8_9 + 1;
                if (var8_9 < 0) {
                    xx_2.n();
                    throw null;
                }
                var11_12 /* !! */  = (rk2_0)var11_12 /* !! */ ;
                var13_14 = new IndexedValue(var8_9 += var2_3, var11_12 /* !! */ );
                var9_10.add(var13_14);
                var8_9 = var12_13;
            }
        }
        var7_8.b(null);
        throw var1_2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(IndexedValue var1_1, f80_0 var2_3) {
        var3_4 = var2_3 instanceof HO0$a;
        if (!var3_4) ** GOTO lbl-1000
        var4_5 = var2_3;
        var4_5 = (HO0$a)var2_3;
        var5_6 = var4_5.f;
        var6_7 = -1 << -1;
        var7_8 = var5_6 & var6_7;
        if (var7_8 != 0) {
            var4_5.f = var5_6 -= var6_7;
        } else lbl-1000:
        // 2 sources

        {
            var4_5 = new HO0$a(this, (f80_0)var2_3);
        }
        var2_3 = var4_5.d;
        var8_9 /* !! */  = j90_0.COROUTINE_SUSPENDED;
        var6_7 = var4_5.f;
        var7_8 = 1;
        if (var6_7 == 0) ** GOTO lbl27
        if (var6_7 == var7_8) {
            var1_1 /* !! */  = var4_5.c;
            var8_9 /* !! */  = var4_5.b;
            var4_5 = var4_5.a;
            vl2_2.b(var2_3);
            var2_3 = var1_1 /* !! */ ;
            var1_1 /* !! */  = var8_9 /* !! */ ;
        } else {
            var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1 /* !! */ ;
lbl27:
            // 1 sources

            vl2_2.b(var2_3);
            var4_5.a = this;
            var4_5.b = var1_1 /* !! */ ;
            var4_5.c = var2_3 = this.b;
            var4_5.f = var7_8;
            var4_5 = var2_3.d((f80_0)var4_5, null);
            if (var4_5 == var8_9 /* !! */ ) {
                return var8_9 /* !! */ ;
            }
            var4_5 = this;
        }
        try {
            var4_5.c = var5_6 = var1_1 /* !! */ .a;
            var4_5 = var4_5.a;
            var1_1 /* !! */  = var1_1 /* !! */ .b;
            var1_1 /* !! */  = (rk2_0)var1_1 /* !! */ ;
            var4_5.a((rk2_0)var1_1 /* !! */ );
            var1_1 /* !! */  = Unit.a;
            return Unit.a;
        }
        finally {
            var2_3.b(null);
        }
    }
}

