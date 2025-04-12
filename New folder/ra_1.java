/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ra
 */
public final class ra_1
implements Function2 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ CMSNavigation b;
    public final /* synthetic */ int c;

    public /* synthetic */ ra_1(j7_0 j7_02, CMSNavigation cMSNavigation, int n3) {
        this.a = j7_02;
        this.b = cMSNavigation;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        CMSNavigation cMSNavigation = this.b;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$ajioSubCategory");
        int n3 = Me3.b(this.c | 1);
        eb_0.c(j7_02, cMSNavigation, (b30_0)object, n3);
        return Unit.a;
    }
}

