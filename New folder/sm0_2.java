/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SM0
 */
public final class sm0_2
implements gx0_2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;

    public sm0_2(w93_0 w93_02, u02_0 u02_02) {
        this.a = w93_02;
        this.b = u02_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            n4 = 1191484817;
            object2.K(n4);
            object = this.a;
            n3 = (int)(object2.J(object) ? 1 : 0);
            object4 = object2.v();
            b30$a$a b30$a$a = b30$a.a;
            if (n3 != 0 || object4 == b30$a$a) {
                object = (w93_0)object;
                n3 = 0;
                object3 = null;
                object4 = new qm0_0((Function0)object, 0);
                object2.o(object4);
            }
            object4 = (Function0)object4;
            object2.E();
            n4 = 1191486897;
            object2.K(n4);
            object = this.b;
            n3 = (int)(object2.J(object) ? 1 : 0);
            Object object5 = object2.v();
            if (n3 != 0 || object5 == b30$a$a) {
                object = (u02_0)object;
                n3 = 0;
                object3 = null;
                object5 = new rm0_1(object, 0);
                object2.o(object5);
            }
            object5 = (Function0)object5;
            object2.E();
            n4 = 0;
            object = null;
            tm0_1.a((Function0)object4, (Function0)object5, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

