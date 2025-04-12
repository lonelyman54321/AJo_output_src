/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LE1
 */
public final class le1_0
implements Function0 {
    public final /* synthetic */ bf1_2 a;
    public final /* synthetic */ CMSNavigation b;

    public /* synthetic */ le1_0(bf1_2 bf1_22, CMSNavigation cMSNavigation) {
        this.a = bf1_22;
        this.b = cMSNavigation;
    }

    public final Object invoke() {
        String string2;
        bf1_2 bf1_22 = this.a;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        CMSNavigation cMSNavigation = this.b;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$subCategory");
        bf1_22.l = string2 = cMSNavigation.getName();
        bf1_22.c(bf1_22, cMSNavigation);
        jq_1.a(cMSNavigation.getName());
        return Unit.a;
    }
}

