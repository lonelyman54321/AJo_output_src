/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BE1
 */
public final class be1_1
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ CMSNavigation b;

    public /* synthetic */ be1_1(he1_0 he1_02, CMSNavigation cMSNavigation) {
        this.a = he1_02;
        this.b = cMSNavigation;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onCardArrowClick");
        CMSNavigation cMSNavigation = this.b;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$category");
        function1.invoke(cMSNavigation);
        return Unit.a;
    }
}

