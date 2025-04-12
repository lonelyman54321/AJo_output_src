/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from kU2
 */
public final class ku2_0 {
    public dU2 a;
    public Pg2 b;
    public TR0 c;
    public pg2_0 d;
    public boolean e;
    public pU1 f;
    public int g;
    public QT2 h;
    public final kU2$c i;
    public final kU2$d j;

    public ku2_0(dU2 object, Pg2 pg2, TR0 tR0, pg2_0 pg2_02, boolean bl2, pU1 pU12) {
        this.a = object;
        this.b = pg2;
        this.c = tR0;
        this.d = pg2_02;
        this.e = bl2;
        this.f = pU12;
        this.g = 1;
        this.h = object = androidx.compose.foundation.gestures.i.b;
        this.i = object = new kU2$c(this);
        this.j = object = new kU2$d(this);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final long a(ku2_0 ku2_02, QT2 qT2, long l2, int n3) {
        long l3;
        long l4;
        void var8_9;
        float f5;
        int n4;
        boolean bl2;
        Object object = ku2_02;
        long l7 = l2;
        ru1_0 ru1_02 = ku2_02.f.a;
        Object object2 = null;
        if (ru1_02 != null && (bl2 = ru1_02.m)) {
            ru1_0 ru1_03 = (ru1_0)Zr3.b(ru1_02);
        } else {
            n4 = 0;
            Object var8_8 = null;
            f5 = 0.0f;
        }
        long l8 = 0L;
        long l12 = var8_9 != null ? (l4 = var8_9.onPreScroll-OzD1aCk(l7, n3)) : l8;
        l7 = e72.h(l7, l12);
        pg2_0 pg2_02 = ((ku2_0)object).d;
        pg2_0 pg2_03 = pg2_0.Horizontal;
        if (pg2_02 == pg2_03) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 2;
            f5 = 2.8E-45f;
        }
        l4 = e72.a(n4, l7, 0.0f);
        l4 = ku2_02.d(l4);
        f5 = ku2_02.f(l4);
        QT2 qT22 = qT2;
        f5 = qT2.a(f5);
        l4 = ku2_02.g(f5);
        long l14 = ku2_02.d(l4);
        l7 = e72.h(l7, l14);
        object = ((ku2_0)object).f.a;
        if (object != null && (n4 = (int)(((LP1$c)object).m ? 1 : 0)) != 0) {
            object2 = object = Zr3.b((yr3_0)object);
            object2 = (ru1_0)object;
        }
        Object object3 = object2;
        if (object2 != null) {
            long l15 = l14;
            l3 = l14;
            l14 = l7;
            l8 = ((ru1_0)object2).onPostScroll-DzOQY0M(l15, l7, n3);
            return e72.i(e72.i(l12, l3), l8);
        }
        l3 = l14;
        return e72.i(e72.i(l12, l3), l8);
    }

    /*
     * Unable to fully structure code
     */
    public final Object b(long var1_1, f80_0 var3_2) {
        var4_3 = var3_2 instanceof kU2$a;
        if (!var4_3) ** GOTO lbl-1000
        var5_4 = var3_2;
        var5_4 = (kU2$a)var3_2;
        var6_5 = var5_4.d;
        var7_6 = -1 << -1;
        var8_7 = var6_5 & var7_6;
        if (var8_7 != 0) {
            var5_4.d = var6_5 -= var7_6;
        } else lbl-1000:
        // 2 sources

        {
            var5_4 = new kU2$a(this, (f80_0)var3_2);
        }
        var3_2 = var5_4.b;
        var9_8 = j90_0.COROUTINE_SUSPENDED;
        var7_6 = var5_4.d;
        var8_7 = 1;
        if (var7_6 == 0) ** GOTO lbl23
        if (var7_6 == var8_7) {
            var10_9 = var5_4.a;
            vl2_2.b(var3_2);
        } else {
            var10_10 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var10_10;
lbl23:
            // 1 sources

            vl2_2.b(var3_2);
            var3_2 = new Ref$LongRef();
            var3_2.element = var1_1;
            var11_11 = aS1.Default;
            var12_12 = new kU2$b(this, (Ref$LongRef)var3_2, var1_1, null);
            var5_4.a = var3_2;
            var5_4.d = var8_7;
            var10_9 = this.e(var11_11, var12_12, var5_4);
            if (var10_9 == var9_8) {
                return var9_8;
            }
            var10_9 = var3_2;
        }
        var1_1 = var10_9.element;
        var3_2 = new WA3(var1_1);
        return var3_2;
    }

    public final float c(float f5) {
        int n3 = this.e;
        if (n3 != 0) {
            n3 = -1;
            float f6 = n3;
            f5 *= f6;
        }
        return f5;
    }

    public final long d(long l2) {
        int n3 = this.e;
        if (n3 != 0) {
            n3 = -1082130432;
            float f5 = -1.0f;
            l2 = e72.j(l2, f5);
        }
        return l2;
    }

    public final Object e(aS1 object, Function2 object2, f80_0 f80_02) {
        dU2 dU22 = this.a;
        kU2$e kU2$e = new kU2$e(this, (Function2)object2, null);
        if ((object = dU22.a((aS1)((Object)object), kU2$e, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final float f(long l2) {
        pg2_0 pg2_02 = this.d;
        pg2_0 pg2_03 = pg2_0.Horizontal;
        float f5 = pg2_02 == pg2_03 ? e72.d(l2) : e72.e(l2);
        return f5;
    }

    public final long g(float f5) {
        pg2_0 pg2_02;
        pg2_0 pg2_03;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        long l2 = object == false ? 0L : ((pg2_03 = this.d) == (pg2_02 = pg2_0.Horizontal) ? h72.a(f5, 0.0f) : h72.a(0.0f, f5));
        return l2;
    }
}

