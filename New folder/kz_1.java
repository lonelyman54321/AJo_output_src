/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from kz
 */
public final class kz_1
extends Lambda
implements Function1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ZD d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ re3_1 j;

    public kz_1(boolean bl2, ZD zD, long l2, float f5, float f6, long l3, long l4, re3_1 re3_12) {
        this.c = bl2;
        this.d = zD;
        this.e = l2;
        this.f = f5;
        this.g = f6;
        this.h = l3;
        this.i = l4;
        this.j = re3_12;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (E60)object;
        object2.e1();
        Object object3 = this.c;
        if (object3 != 0) {
            float f5 = 0.0f;
            Object var5_7 = null;
            int n3 = 246;
            ZD zD = this.d;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = this.e;
            Jt0.k((Kt0)object2, zD, l2, l3, l4, null, n3);
        } else {
            float f6;
            long l7 = this.e;
            float f7 = r90_0.b(l7);
            float f8 = f7 - (f6 = this.f);
            object3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object3 < 0) {
                float f11 = this.g;
                l7 = object2.l();
                f7 = C63.d(l7);
                float f12 = this.g;
                float f14 = f7 - f12;
                long l8 = object2.l();
                f7 = C63.b(l8);
                float f15 = f7 - f12;
                ZD zD = this.d;
                long l12 = this.e;
                object = object2.M0();
                long l14 = ((xL$b)object).l();
                iL iL2 = ((xL$b)object).a();
                iL2.p();
                yl_0 yl_02 = ((xL$b)object).a;
                int n4 = 0;
                yl_02.b(f11, f11, f14, f15, 0);
                long l15 = 0L;
                f15 = 0.0f;
                Object var5_8 = null;
                n4 = 246;
                l8 = 0L;
                long l16 = l12;
                try {
                    Jt0.k((Kt0)object2, zD, l8, l15, l12, null, n4);
                }
                finally {
                    jz.b((xL$b)object, l14);
                }
            } else {
                long l17 = gz.c(l7, f6);
                re3_1 re3_12 = this.j;
                int n7 = 208;
                ZD zD = this.d;
                long l18 = this.h;
                long l19 = this.i;
                Jt0.k((Kt0)object2, zD, l18, l19, l17, re3_12, n7);
            }
        }
        return Unit.a;
    }
}

