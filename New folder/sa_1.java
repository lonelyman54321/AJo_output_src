/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sa
 */
public final class sa_1
implements Function0 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ CMSNavigation b;

    public /* synthetic */ sa_1(j7_0 j7_02, CMSNavigation cMSNavigation) {
        this.a = j7_02;
        this.b = cMSNavigation;
    }

    public final Object invoke() {
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        CMSNavigation cMSNavigation = this.b;
        j7_02.d(j7_02, cMSNavigation);
        return Unit.a;
    }
}

