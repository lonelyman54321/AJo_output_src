/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from B6
 */
public final class b6_0
implements hx0_2 {
    public final /* synthetic */ z6_0 a;

    public b6_0(z6_0 z6_02) {
        this.a = z6_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        String string2 = "$this$composable";
        String string3 = "it";
        ro.c((Number)object4, (ek_1)object, string2, (d)object2, string3);
        object = this.a;
        object2 = ((z6_0)object).w;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            object2 = null;
        }
        object4 = (j7_0)((z6_0)object).g.getValue();
        object = (oa1_1)((z6_0)object).h.getValue();
        Z6.a((j7_0)object4, (yT1)object2, (oa1_1)object, (b30_0)object3, 584);
        return Unit.a;
    }
}

