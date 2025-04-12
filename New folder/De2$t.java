/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class De2$t
implements hx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;

    public De2$t(qz1_2 qz1_22, String string2) {
        this.a = qz1_22;
        this.b = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (Boolean)object;
        boolean n3 = (Boolean)object;
        object2 = (Boolean)object2;
        boolean bl2 = (Boolean)object2;
        object3 = (b30_0)object3;
        int n4 = ((Number)(object4 = (Number)object4)).intValue();
        int n7 = n4 & 0xE;
        if (n7 == 0) {
            n7 = (int)(object3.a(n3) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n4;
        }
        if ((n4 &= 0x70) == 0) {
            n4 = (int)(object3.a(bl2) ? 1 : 0);
            n4 = n4 != 0 ? 32 : 16;
            n7 |= n4;
        }
        if ((n4 = n7 & 0x2DB) == (n7 = 146) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else if (bl2) {
            object2 = this.a;
            object2.getClass();
            object3 = md3_0.c((jD3)object2);
            String string2 = this.b;
            object4 = new a02_0((qz1_2)object2, n3, string2, null);
            int n8 = 3;
            Ae3.d((i90_0)object3, null, null, (Function2)object4, n8);
        }
        return Unit.a;
    }
}

