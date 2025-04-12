/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PQ0
 */
public final class pq0_1
implements gx0_2 {
    public final /* synthetic */ int a;

    public pq0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        String string2 = "$this$Badge";
        Intrinsics.checkNotNullParameter(object4, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            object4 = this;
        } else {
            object4 = this;
            n3 = this.a;
            object6 = String.valueOf(n3);
            long l2 = Em3.f(10);
            int n7 = 3072;
            string2 = null;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n8 = 131062;
            Ll3.b((String)object6, null, l3, l2, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object5, n7, 0, n8);
        }
        return Unit.a;
    }
}

