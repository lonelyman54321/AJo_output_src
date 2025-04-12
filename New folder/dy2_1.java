/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Dy2
 */
public final class dy2_1
implements cy2_0,
Vo0 {
    public final /* synthetic */ Vo0 a;
    public boolean b;
    public boolean c;
    public final ks1_1 d;

    public dy2_1(Vo0 object) {
        this.a = object;
        this.d = object = new ks1_1(false);
    }

    public final float D0(int n3) {
        return this.a.D0(n3);
    }

    public final float E0(float f5) {
        return this.a.E0(f5);
    }

    public final float H(long l2) {
        return this.a.H(l2);
    }

    public final float H0() {
        return this.a.H0();
    }

    public final float J0(float f5) {
        return this.a.J0(f5);
    }

    public final long O(float f5) {
        return this.a.O(f5);
    }

    public final int O0(long l2) {
        return this.a.O0(l2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object T(f80_0 var1_1) {
        block5: {
            block6: {
                var2_2 = var1_1 instanceof Dy2$b;
                if (!var2_2) ** GOTO lbl-1000
                var3_3 = var1_1;
                var3_3 = (Dy2$b)var1_1;
                var4_4 = var3_3.d;
                var5_5 = -1 << -1;
                var6_6 = var4_4 & var5_5;
                if (var6_6 != 0) {
                    var3_3.d = var4_4 -= var5_5;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = new Dy2$b(this, (f80_0)var1_1);
                }
                var1_1 = var3_3.b;
                var7_7 = j90_0.COROUTINE_SUSPENDED;
                var5_5 = var3_3.d;
                var6_6 = 0;
                var8_8 = 1;
                if (var5_5 == 0) break block5;
                if (var5_5 != var8_8) break block6;
                var3_3 = var3_3.a;
                vl2_2.b(var1_1);
                ** GOTO lbl35
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var1_1);
        var9_9 = this.b;
        if (!var9_9 && !(var9_9 = this.c)) {
            var3_3.a = this;
            var3_3.d = var8_8;
            var1_1 = this.d.d((f80_0)var3_3, null);
            if (var1_1 == var7_7) {
                return var7_7;
            }
            var3_3 = this;
lbl35:
            // 2 sources

            var1_1 = var3_3.d;
            var1_1.b(null);
        } else {
            var3_3 = this;
        }
        return var3_3.b;
    }

    public final long Z0(long l2) {
        return this.a.Z0(l2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object e(f80_0 var1_1) {
        var2_2 = var1_1 instanceof Dy2$a;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (Dy2$a)var1_1;
        var4_4 = var3_3.d;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.d = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new Dy2$a(this, (f80_0)var1_1);
        }
        var1_1 = var3_3.b;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.d;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl23
        if (var5_5 == var6_6) {
            var3_3 = var3_3.a;
            vl2_2.b(var1_1);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var1_1);
            var3_3.a = this;
            var3_3.d = var6_6;
            var8_8 = this.d;
            var1_1 = var8_8.d((f80_0)var3_3, null);
            if (var1_1 == var7_7) {
                return var7_7;
            }
            var3_3 = this;
        }
        var3_3.b = false;
        var3_3.c = false;
        return Unit.a;
    }

    public final int e0(float f5) {
        return this.a.e0(f5);
    }

    public final float getDensity() {
        return this.a.getDensity();
    }

    public final float h0(long l2) {
        return this.a.h0(l2);
    }

    public final long z(long l2) {
        return this.a.z(l2);
    }
}

