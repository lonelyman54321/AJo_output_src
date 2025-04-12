/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Iq1
 */
public final class iq1_2
extends Lambda
implements hx0_2 {
    public final /* synthetic */ gx0_2 c;

    public iq1_2(u10 u102) {
        this.c = u102;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        object = (Pq1)object;
        object2 = (Number)object2;
        ((Number)object2).intValue();
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        int n4 = ((Number)object4).intValue();
        int n7 = n4 & 6;
        if (n7 == 0) {
            n7 = (int)(object3.J(object) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x83) == (n3 = 130) && (n7 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object2 = n4 &= 0xE;
            object4 = this.c;
            object4.invoke(object, object3, object2);
        }
        return Unit.a;
    }
}

