/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fh
 */
public final class fh_0
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ hd1_0 d;
    public final /* synthetic */ TX e;

    public fh_0(float f5, hd1_0 hd1_02, ay_1 ay_12) {
        this.c = f5;
        this.d = hd1_02;
        this.e = ay_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (E60)object;
        object.e1();
        float f5 = this.c;
        hd1_0 hd1_02 = this.d;
        TX tX = this.e;
        xL$b xL$b = object.M0();
        long l2 = xL$b.l();
        Object object2 = xL$b.a();
        object2.p();
        object2 = xL$b.a;
        ((yl_0)object2).g(f5, 0.0f);
        f5 = 45.0f;
        long l3 = 0L;
        try {
            ((yl_0)object2).d(l3, f5);
            tX = (ay_1)tX;
            Jt0.e((Kt0)object, hd1_02, (ay_1)tX);
            return Unit.a;
        }
        finally {
            jz.b(xL$b, l2);
        }
    }
}

