/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.x;
import androidx.navigation.d;
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from T6
 */
public final class t6_0
implements Function1 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ j7_0 b;

    public /* synthetic */ t6_0(yT1 yT12, j7_0 j7_02) {
        this.a = yT12;
        this.b = j7_02;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (CMSNavigation)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$navController");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$viewModel");
        String string2 = "category";
        Intrinsics.checkNotNullParameter(object, string2);
        Collection collection = ((CMSNavigation)object).getChildDetails();
        if (collection != null && (n3 = collection.isEmpty()) == 0) {
            object3 = ((e)object2).g();
            if (object3 != null && (object3 = ((d)object3).b()) != null) {
                string2 = "selected_category";
                ((x)object3).c(object, string2);
            }
            object3 = "ajio_category_screen_l2";
            string2 = null;
            n3 = 6;
            e.p((e)object2, (String)object3, null, n3);
        } else {
            object2 = Z6.a;
            if (object2 != null) {
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = "viewModel";
                Intrinsics.checkNotNullParameter(object3, string2);
                ((j7_0)object2).d((j7_0)object3, (CMSNavigation)object);
            }
        }
        jq_1.a(((CMSNavigation)object).getName());
        return Unit.a;
    }
}

