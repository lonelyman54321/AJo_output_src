/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from z50
 */
public final class z50_0
extends Lambda
implements Function1 {
    public final /* synthetic */ UF3 c;

    public z50_0(UF3 uF3) {
        this.c = uF3;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        object = (a11_0)object;
        UF3 uF3 = this.c;
        float f6 = uF3.f;
        int n3 = Float.isNaN(f6);
        if (n3 == 0 || (n3 = Float.isNaN(f6 = uF3.g)) == 0) {
            f6 = uF3.f;
            n3 = Float.isNaN(f6);
            f5 = 0.5f;
            if (n3 != 0) {
                n3 = 0x3F000000;
                f6 = 0.5f;
            } else {
                f6 = uF3.f;
            }
            float f7 = uF3.g;
            boolean bl2 = Float.isNaN(f7);
            if (!bl2) {
                f5 = uF3.g;
            }
            long l2 = Pq3.a(f6, f5);
            object.f0(l2);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.h) ? 1 : 0)) == 0) {
            f6 = uF3.h;
            object.g(f6);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.i) ? 1 : 0)) == 0) {
            f6 = uF3.i;
            object.h(f6);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.j) ? 1 : 0)) == 0) {
            f6 = uF3.j;
            object.j(f6);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.k) ? 1 : 0)) == 0) {
            f6 = uF3.k;
            object.m(f6);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.l) ? 1 : 0)) == 0) {
            f6 = uF3.l;
            object.c(f6);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.m) ? 1 : 0)) == 0) {
            f6 = uF3.m;
            object.t(f6);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.n) ? 1 : 0)) == 0 || (n3 = (int)(Float.isNaN(f6 = uF3.o) ? 1 : 0)) == 0) {
            f6 = uF3.n;
            n3 = (int)(Float.isNaN(f6) ? 1 : 0);
            f5 = 1.0f;
            if (n3 != 0) {
                n3 = 1065353216;
                f6 = 1.0f;
            } else {
                f6 = uF3.n;
            }
            object.d(f6);
            f6 = uF3.o;
            n3 = (int)(Float.isNaN(f6) ? 1 : 0);
            if (n3 == 0) {
                f5 = uF3.o;
            }
            object.k(f5);
        }
        if ((n3 = (int)(Float.isNaN(f6 = uF3.p) ? 1 : 0)) == 0) {
            float f8 = uF3.p;
            object.b(f8);
        }
        return Unit.a;
    }
}

