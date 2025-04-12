/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Lg0
 */
public final class lg0_0
implements Function2 {
    public final /* synthetic */ Function1 a;

    public lg0_0(ah0_1 ah0_12) {
        this.a = ah0_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            u10 u102 = l10_0.a;
            ah0_1 ah0_12 = (ah0_1)this.a;
            object = new kg0_1(ah0_12);
            int n7 = 1279078752;
            u10 u103 = v10.c(n7, (fx0_2)object, (b30_0)object3);
            long l2 = OX.f;
            float f5 = n3;
            int n8 = 0x186186;
            int n10 = 42;
            long l3 = 0L;
            Km.c(f5, n8, n10, l2, l3, u102, (b30_0)object3, null, null, u103);
        }
        return Unit.a;
    }
}

