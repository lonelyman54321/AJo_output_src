/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from am3
 */
public final class am3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Yl3 c;
    public final /* synthetic */ Sl$b d;

    public am3_0(Yl3 yl3, Sl$b sl$b) {
        this.c = yl3;
        this.d = sl$b;
        super(1);
    }

    public final Object invoke(Object object) {
        ki ki2;
        object = (a11_0)object;
        Object object2 = this.c;
        object2.getClass();
        Object object3 = new cm3_0((Yl3)object2);
        object3 = (Boolean)((cm3_0)object3).invoke();
        boolean n3 = (Boolean)object3;
        int n4 = 1;
        bm3_0 bm3_02 = null;
        if (!n3 || (object2 = (Tl3)((Yl3)object2).b.getValue()) == null || (object3 = Yl3.c(this.d, (Tl3)object2)) == null) {
            ki2 = null;
        } else {
            float f5;
            float f6;
            int n7;
            int n8 = ((Sl$b)object3).b;
            int n10 = ((Sl$b)object3).c;
            ki2 = ((Tl3)object2).k(n8, n10);
            aG2 aG22 = ((Tl3)object2).b(n8);
            int n14 = n10 - n4;
            aG2 aG23 = ((Tl3)object2).b(n14);
            if ((n8 = ((Tl3)object2).f(n8)) == (n7 = ((Tl3)object2).f(n14))) {
                f6 = aG23.a;
                f5 = aG22.a;
                f6 = Math.min(f6, f5);
            } else {
                n7 = 0;
                f6 = 0.0f;
                object2 = null;
            }
            f5 = aG22.b;
            long l2 = h72.a(f6, f5);
            long l3 = -9223372034707292160L;
            ki2.k(l2 ^= l3);
        }
        if (ki2 != null) {
            bm3_02 = new bm3_0(ki2);
        }
        if (bm3_02 != null) {
            object.I0(bm3_02);
            object.r(n4 != 0);
        }
        return Unit.a;
    }
}

