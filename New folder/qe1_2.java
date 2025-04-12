/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qE1
 */
public final class qe1_2
implements Function2 {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ bf1_2 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ qe1_2(CMSNavigation cMSNavigation, bf1_2 bf1_22, te1_1 te1_12, int n3) {
        this.a = cMSNavigation;
        this.b = bf1_22;
        this.c = te1_12;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$item");
        bf1_2 bf1_22 = this.b;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        Function1 function1 = this.c;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        int n3 = Me3.b(this.d | 1);
        function1 = (te1_1)function1;
        re1_1.c((CMSNavigation)object2, bf1_22, (te1_1)function1, (b30_0)object, n3);
        return Unit.a;
    }
}

