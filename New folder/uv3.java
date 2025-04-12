/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class uv3
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function1 b;

    public uv3(String string2, ud_2 ud_22) {
        this.a = string2;
        this.b = ud_22;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = this.a;
            if (object != null && (n4 = ((String)object).length()) != 0) {
                n4 = -469241476;
                object3.K(n4);
                object = this.b;
                n3 = (int)(object3.J(object) ? 1 : 0);
                Object object4 = object3.v();
                if (n3 != 0 || object4 == (object2 = b30$a.a)) {
                    object = (ud_2)object;
                    n3 = 1;
                    object4 = new M22(object, n3);
                    object3.o(object4);
                }
                object4 = (Function0)object4;
                object3.E();
                u10 u102 = q20_0.d;
                int n7 = 24576;
                int n8 = 14;
                pc1_0.a((Function0)object4, null, false, null, u102, (b30_0)object3, n7, n8);
            }
        }
        return Unit.a;
    }
}

