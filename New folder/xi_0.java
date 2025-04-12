/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from XI
 */
public final class xi_0
implements Vo0 {
    public uE a;
    public It0 b;
    public E60 c;
    public Function0 d;

    public xi_0() {
        az0_0 az0_02 = az0_0.a;
        this.a = az0_02;
    }

    public final float D0(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final float E0(float f5) {
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final /* synthetic */ float H(long l2) {
        return mv0_0.a(l2, this);
    }

    public final float H0() {
        return this.a.getDensity().H0();
    }

    public final float J0(float f5) {
        return this.getDensity() * f5;
    }

    public final long O(float f5) {
        f5 = this.E0(f5);
        return this.n(f5);
    }

    public final int O0(long l2) {
        return Math.round(this.h0(l2));
    }

    public final /* synthetic */ long Z0(long l2) {
        return Uo0.d(l2, this);
    }

    public final It0 e(Function1 function1) {
        It0 it0 = new Object();
        it0.a = function1;
        this.b = it0;
        return it0;
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    public final /* synthetic */ float h0(long l2) {
        return Uo0.c(l2, this);
    }

    public final /* synthetic */ long n(float f5) {
        return mv0_0.b(f5, this);
    }

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }
}

