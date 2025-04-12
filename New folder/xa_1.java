/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xa
 */
public final class xa_1
implements Function2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ j7_0 b;
    public final /* synthetic */ CMSNavigation c;
    public final /* synthetic */ int d;

    public /* synthetic */ xa_1(yT1 yT12, j7_0 j7_02, CMSNavigation cMSNavigation, int n3) {
        this.a = yT12;
        this.b = j7_02;
        this.c = cMSNavigation;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        yT1 yT12 = this.a;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        j7_0 j7_02 = this.b;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        CMSNavigation cMSNavigation = this.c;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$cmsNavigation");
        int n3 = Me3.b(this.d | 1);
        eb_0.e(yT12, j7_02, cMSNavigation, (b30_0)object, n3);
        return Unit.a;
    }
}

