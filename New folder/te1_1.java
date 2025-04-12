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
 * Renamed from tE1
 */
public final class te1_1
implements Function1 {
    public final /* synthetic */ e a;
    public final /* synthetic */ CMSNavigation b;

    public /* synthetic */ te1_1(e e2, CMSNavigation cMSNavigation) {
        this.a = e2;
        this.b = cMSNavigation;
    }

    public final Object invoke(Object object) {
        object = (CMSNavigation)object;
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        CMSNavigation cMSNavigation = this.b;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$item");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        object = e2.g();
        if (object != null && (object = ((d)object).b()) != null) {
            string2 = "selected_category";
            ((x)object).c(cMSNavigation, string2);
        }
        e.p(e2, "luxe_category_screen_l2", null, 6);
        jq_1.a(cMSNavigation.getName());
        return Unit.a;
    }
}

