/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wE1
 */
public final class we1_2
implements Function1 {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ bf1_2 b;
    public final /* synthetic */ e c;

    public /* synthetic */ we1_2(bf1_2 bf1_22, e e2, CMSNavigation cMSNavigation) {
        this.a = cMSNavigation;
        this.b = bf1_22;
        this.c = e2;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (dt1_0)object;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        e e2 = this.c;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        Object object3 = this.a;
        if (object3 != null) {
            object3 = ((CMSNavigation)object3).getChildDetails();
        } else {
            bl2 = false;
            object3 = null;
        }
        if (object3 != null) {
            int n3 = object3.size();
            GE1$b gE1$b = new GE1$b((List)object3, (bf1_2)object2, e2);
            bl2 = true;
            object2 = new u10(909755198, gE1$b, bl2);
            bt1.b((dt1_0)object, n3, null, (u10)object2, 6);
            object2 = W10.a;
            int n4 = 3;
            bt1.a((dt1_0)object, null, (gx0_2)object2, n4);
        }
        return Unit.a;
    }
}

