/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from D6
 */
public final class d6_0
implements Function2 {
    public final /* synthetic */ z6_0 a;

    public d6_0(z6_0 z6_02) {
        this.a = z6_02;
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
            ((z6_0)object5).w = object4;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                n4 = 0;
                object4 = null;
            }
            a6_0 a6_02 = new a6_0((z6_0)object5);
            object5 = "ajio_category_screen_l1";
            int n7 = 8;
            aU1.b((yT1)object4, (String)object5, null, null, null, null, null, null, null, null, a6_02, (b30_0)object3, n7, 0);
        }
        return Unit.a;
    }
}

