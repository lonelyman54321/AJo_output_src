/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Kg0
 */
public final class kg0_1
implements Function2 {
    public final /* synthetic */ Function1 a;

    public kg0_1(ah0_1 ah0_12) {
        this.a = ah0_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            b30$a$a b30$a$a;
            n4 = -1759068122;
            object.K(n4);
            object2 = this.a;
            n3 = (int)(object.J(object2) ? 1 : 0);
            Object object3 = object.v();
            if (n3 != 0 || object3 == (b30$a$a = b30$a.a)) {
                object2 = (ah0_1)object2;
                n3 = 0;
                b30$a$a = null;
                object3 = new jg0_2(object2, 0);
                object.o(object3);
            }
            object3 = (Function0)object3;
            object.E();
            n4 = 0;
            object2 = null;
            ro3_0.e((Function0)object3, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

