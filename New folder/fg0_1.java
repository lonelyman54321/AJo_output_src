/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fg0
 */
public final class fg0_1
implements gx0_2 {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ gx0_2 c;

    public fg0_1(yi2_1 yi2_12, Function0 function0, pg0_1 pg0_12) {
        this.a = yi2_12;
        this.b = function0;
        this.c = pg0_12;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            rz3_0.Companion.getClass();
            yi2_1 yi2_12 = this.a;
            ArrayList arrayList = Rz3$a.e(yi2_12);
            n4 = -1452017702;
            object4.K(n4);
            object = this.c;
            n3 = (int)(object4.J(object) ? 1 : 0);
            object3 = object4.v();
            if (n3 != 0 || object3 == (object2 = b30$a.a)) {
                object = (pg0_1)object;
                object3 = new eg0_1((pg0_1)object);
                object4.o(object3);
            }
            Object object5 = object3;
            object5 = (gx0_2)object3;
            object4.E();
            Function0 function0 = this.b;
            int n7 = 64;
            mh0_1.a(yi2_12, arrayList, function0, (gx0_2)object5, (b30_0)object4, n7);
        }
        return Unit.a;
    }
}

