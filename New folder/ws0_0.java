/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from wS0
 */
public final class ws0_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;

    public ws0_0(u10 u102) {
        this.c = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = Bt3.b;
            object2 = ((At3)object.j((H30)object2)).k;
            u10 u102 = (u10)this.c;
            Function2 function2 = new vs0_1(u102);
            function2 = v10.c(-1567914264, function2, (b30_0)object);
            int n7 = 48;
            Ll3.a((xm3)object2, function2, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

