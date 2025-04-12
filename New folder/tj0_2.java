/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from tJ0
 */
public final class tj0_2
implements Function2 {
    public final /* synthetic */ pj0_2 a;

    public tj0_2(pj0_2 pj0_22) {
        this.a = pj0_22;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            pj0_2 pj0_22 = this.a;
            int n7 = 1;
            object2 = new a00(pj0_22, n7);
            n3 = 0;
            pj0_22 = null;
            rB0.e((Function0)object2, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

