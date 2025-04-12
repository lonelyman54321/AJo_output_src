/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.x;
import androidx.navigation.d;
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HE1
 */
public final class he1_0
implements Function1 {
    public final /* synthetic */ bf1_2 a;
    public final /* synthetic */ CMSNavigation b;
    public final /* synthetic */ e c;

    public /* synthetic */ he1_0(bf1_2 bf1_22, e e2, CMSNavigation cMSNavigation) {
        this.a = bf1_22;
        this.b = cMSNavigation;
        this.c = e2;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4;
        object = (CMSNavigation)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        CMSNavigation cMSNavigation = this.b;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$subCategory");
        e e2 = this.c;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        ((bf1_2)object2).j = object = cMSNavigation.getName();
        ((bf1_2)object2).k = object = "";
        ((bf1_2)object2).l = object;
        object = cMSNavigation.getChildDetails();
        if (object != null && (n4 = object.isEmpty()) == (n3 = 1)) {
            ((bf1_2)object2).c((bf1_2)object2, cMSNavigation);
        } else {
            object = e2.g();
            if (object != null && (object = ((d)object).b()) != null) {
                object2 = "selected_category";
                ((x)object).c(cMSNavigation, (String)object2);
            }
            object = "luxe_category_screen_l3";
            object2 = null;
            n3 = 6;
            e.p(e2, (String)object, null, n3);
        }
        n4 = jq_1.a;
        jq_1.a(cMSNavigation.getName());
        return Unit.a;
    }
}

