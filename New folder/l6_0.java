/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from L6
 */
public final class l6_0
implements Function0 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ CMSNavigation b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ l6_0(j7_0 j7_02, CMSNavigation cMSNavigation, t6_0 t6_02) {
        this.a = j7_02;
        this.b = cMSNavigation;
        this.c = t6_02;
    }

    public final Object invoke() {
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        CMSNavigation cMSNavigation = this.b;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$category");
        Function1 function1 = this.c;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        String string2 = cMSNavigation.getName();
        String string3 = "";
        if (string2 == null) {
            string2 = string3;
        }
        j7_02.i = string2;
        j7_02.j = string3;
        j7_02.k = string3;
        function1.invoke(cMSNavigation);
        return Unit.a;
    }
}

