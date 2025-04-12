/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from c83
 */
public final class c83_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ String c;

    public c83_0(String string2) {
        this.c = string2;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        object4 = object3;
        object4 = (Number)object3;
        int n4 = ((Number)object4).intValue() & 0x11;
        if (n4 == (n3 = 16) && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            object4 = this.c;
            n3 = 0;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n7 = 131070;
            Ll3.b((String)object4, null, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object5, 0, 0, n7);
        }
        return Unit.a;
    }
}

