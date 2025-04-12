/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

/*
 * Renamed from hX2
 */
public final class hx2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ gx2_0 c;

    public hx2_0(gx2_0 gx2_02) {
        this.c = gx2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        int n3;
        long l2 = ((Number)object).longValue();
        object = this.c;
        long l3 = ((gx2_0)object).l;
        l3 = l2 - l3;
        ((gx2_0)object).l = l2;
        double d2 = l3;
        float f5 = ((gx2_0)object).p;
        double d5 = f5;
        l2 = ok1_1.c(d2 /= d5);
        Object object3 = ((gx2_0)object).m;
        int n4 = ((l62)object3).b;
        int n7 = 0;
        boolean bl2 = true;
        if (n4 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (n3 != 0) {
            gX2$a gX2$a;
            int n8;
            object2 = ((l62)object3).a;
            for (n8 = 0; n8 < n4; ++n8) {
                gX2$a = (gX2$a)object2[n8];
                gx2_0.g((gx2_0)object, gX2$a, l2);
                gX2$a.c = bl2;
            }
            gr3 gr32 = ((gx2_0)object).e;
            if (gr32 != null) {
                gr32.q();
            }
            n4 = ((l62)object3).b;
            Object[] objectArray = ((l62)object3).a;
            object2 = f.m(0, n4);
            n8 = object2.a;
            n3 = object2.b;
            if (n8 <= n3) {
                while (true) {
                    Object object4;
                    int n10 = n8 - n7;
                    objectArray[n10] = object4 = objectArray[n8];
                    gX2$a = (gX2$a)objectArray[n8];
                    n10 = (int)(gX2$a.c ? 1 : 0);
                    if (n10 != 0) {
                        ++n7;
                    }
                    if (n8 == n3) break;
                    ++n8;
                }
            }
            n3 = n4 - n7;
            rp_1.n(n3, n4, null, objectArray);
            ((l62)object3).b = n4 = ((l62)object3).b - n7;
        }
        if ((object3 = ((gx2_0)object).n) != null) {
            long l4;
            ((gX2$a)object3).g = l4 = ((gx2_0)object).f;
            gx2_0.g((gx2_0)object, (gX2$a)object3, l2);
            float f6 = ((gX2$a)object3).d;
            ((gx2_0)object).o(f6);
            f6 = ((gX2$a)object3).d;
            float f7 = 1.0f;
            float f8 = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1);
            if (f8 == false) {
                ((gx2_0)object).n = null;
            }
            ((gx2_0)object).n();
        }
        return Unit.a;
    }
}

