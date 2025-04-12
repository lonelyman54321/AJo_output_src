/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PE1
 */
public final class pe1_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pe1_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                String string2 = (String)this.c;
                Intrinsics.checkNotNullParameter(string2, "$toastMessage");
                qz1_22.getClass();
                Intrinsics.checkNotNullParameter(string2, "message");
                hv3_0.o0(1, string2, null);
                return Unit.a;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$onCardArrowClick");
        CMSNavigation cMSNavigation = (CMSNavigation)this.c;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$category");
        function1.invoke(cMSNavigation);
        return Unit.a;
    }
}

