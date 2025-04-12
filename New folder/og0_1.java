/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Og0
 */
public final class og0_1
implements Function2 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ yh0_0 b;

    public og0_1(ah0_1 ah0_12, yh0_0 yh0_02) {
        this.a = ah0_12;
        this.b = yh0_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3;
            Object object4;
            n4 = -3318763;
            object.K(n4);
            object2 = this.a;
            n3 = (int)(object.J(object2) ? 1 : 0);
            Object object5 = object.v();
            b30$a$a b30$a$a = b30$a.a;
            if (n3 != 0 || object5 == b30$a$a) {
                object4 = object2;
                object4 = (ah0_1)object2;
                object3 = null;
                object5 = new mg0_1(object4, 0);
                object.o(object5);
            }
            object5 = (Function0)object5;
            object.E();
            object.K(-3315977);
            n3 = (int)(object.J(object2) ? 1 : 0);
            object3 = object.v();
            if (n3 != 0 || object3 == b30$a$a) {
                object2 = (ah0_1)object2;
                n3 = 0;
                object4 = null;
                object3 = new ng0_1(object2, 0);
                object.o(object3);
            }
            object3 = (Function0)object3;
            object.E();
            object2 = this.b.h;
            n3 = 0;
            object4 = null;
            r93_0.a((Function0)object5, (Function0)object3, (tr1_0)object2, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

