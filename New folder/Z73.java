/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Z73
extends Lambda
implements Function2 {
    public final /* synthetic */ D73 c;

    public Z73(D73 d73) {
        this.c = d73;
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
            object4 = this.c.getMessage();
            n3 = 0;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n7 = 131070;
            Ll3.b((String)object4, null, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, 0, 0, n7);
        }
        return Unit.a;
    }
}

