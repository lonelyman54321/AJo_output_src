/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from iz
 */
public final class iz_1
extends Lambda
implements Function1 {
    public final /* synthetic */ aG2 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TX f;

    public iz_1(aG2 aG22, Ref$ObjectRef ref$ObjectRef, long l2, ay_1 ay_12) {
        this.c = aG22;
        this.d = ref$ObjectRef;
        this.e = l2;
        this.f = ay_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (E60)object;
        object.e1();
        Object object2 = this.c;
        float f5 = ((aG2)object2).a;
        Object object3 = this.d;
        long l2 = this.e;
        TX tX = this.f;
        yl_0 yl_02 = object.M0().a;
        float f6 = ((aG2)object2).b;
        yl_02.g(f5, f6);
        object3 = object2 = ((Ref$ObjectRef)object3).element;
        object3 = (hd1_0)object2;
        long l3 = 0L;
        int n3 = 890;
        long l4 = 0L;
        object2 = object;
        try {
            Jt0.d((Kt0)object, (hd1_0)object3, l4, l2, l3, 0.0f, tX, 0, n3);
            return Unit.a;
        }
        finally {
            object = object.M0().a;
            float f7 = -f5;
            float f8 = -f6;
            ((yl_0)object).g(f7, f8);
        }
    }
}

