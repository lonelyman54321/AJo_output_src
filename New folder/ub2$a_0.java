/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ub2$a
 */
public final class ub2$a_0
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;

    public ub2$a_0(qz1_2 qz1_22, yT1 yT12) {
        this.a = qz1_22;
        this.b = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 72;
            qz1_2 qz1_22 = this.a;
            yT1 yT12 = this.b;
            de2_0.p(qz1_22, yT12, (b30_0)object, n4);
        }
        return Unit.a;
    }
}

