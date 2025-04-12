/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from eE1
 */
public final class ee1_2
implements Function2 {
    public final /* synthetic */ zd1_1 a;

    public ee1_2(zd1_1 zd1_12) {
        this.a = zd1_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n4 = 0;
            object4 = CT1.b(new p[0], (b30_0)object3);
            Object object5 = this.a;
            ae1_2 ae1_22 = new ae1_2((yT1)object4, (zd1_1)object5);
            object5 = "luxe_category_screen_l1";
            int n7 = 8;
            aU1.b((yT1)object4, (String)object5, null, null, null, null, null, null, null, null, ae1_22, (b30_0)object3, n7, 0);
        }
        return Unit.a;
    }
}

