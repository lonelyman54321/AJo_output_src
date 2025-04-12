/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.x;
import androidx.navigation.d;
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class C6
implements hx0_2 {
    public final /* synthetic */ z6_0 a;

    public C6(z6_0 z6_02) {
        this.a = z6_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        Object object5 = "it";
        ro.c((Number)object4, (ek_1)object, "$this$composable", (d)object2, (String)object5);
        object = this.a;
        object2 = ((z6_0)object).w;
        object4 = "navController";
        Object object6 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object2 = null;
        }
        if ((object2 = ((e)object2).k()) != null && (object2 = ((d)object2).b()) != null) {
            object5 = "selected_category";
            object2 = (CMSNavigation)((x)object2).b((String)object5);
        } else {
            object2 = null;
        }
        object5 = ((z6_0)object).w;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object6 = object5;
        }
        object = (j7_0)((z6_0)object).g.getValue();
        eb_0.a((yT1)object6, (j7_0)object, (CMSNavigation)object2, (b30_0)object3, 584);
        return Unit.a;
    }
}

