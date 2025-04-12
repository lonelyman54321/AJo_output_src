/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KE1
 */
public final class ke1_0
implements Function2 {
    public final /* synthetic */ e a;
    public final /* synthetic */ bf1_2 b;
    public final /* synthetic */ CMSNavigation c;
    public final /* synthetic */ int d;

    public /* synthetic */ ke1_0(e e2, bf1_2 bf1_22, CMSNavigation cMSNavigation, int n3) {
        this.a = e2;
        this.b = bf1_22;
        this.c = cMSNavigation;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        bf1_2 bf1_22 = this.b;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        CMSNavigation cMSNavigation = this.c;
        ue1_0.b(e2, bf1_22, cMSNavigation, (b30_0)object, n3);
        return Unit.a;
    }
}

