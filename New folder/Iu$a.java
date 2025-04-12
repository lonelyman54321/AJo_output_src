/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Iu$a
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;

    public Iu$a(gx0_2 gx0_22) {
        this.c = gx0_22;
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
        } else {
            object4 = Bt3.b;
            Object object5 = ((At3)object3.j((H30)object4)).k;
            long l2 = Iu.c;
            int n7 = 0xFFFFFD;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            object4 = xm3.a((xm3)object5, l3, l2, null, null, l4, 0, l7, null, null, n7);
            gx0_2 gx0_22 = this.c;
            object5 = new hu_0(gx0_22);
            object5 = v10.c(915155142, (fx0_2)object5, (b30_0)object3);
            int n8 = 48;
            Ll3.a((xm3)object4, (Function2)object5, (b30_0)object3, n8);
        }
        return Unit.a;
    }
}

