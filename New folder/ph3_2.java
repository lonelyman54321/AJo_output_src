/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ph3
 */
public final class ph3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;

    public ph3_2(Function2 function2) {
        this.c = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
            ph3_2 ph3_22 = this;
        } else {
            object4 = Bt3.b;
            Object object5 = ((At3)object3.j((H30)object4)).k;
            int n7 = 0xFF7FFF;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            int n8 = 3;
            long l7 = 0L;
            object4 = xm3.a((xm3)object5, l2, l3, null, null, l4, n8, l7, null, null, n7);
            object5 = this;
            Function2 function2 = this.c;
            Ll3.a((xm3)object4, function2, (b30_0)object3, 0);
        }
        return Unit.a;
    }
}

