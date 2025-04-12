/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zE1
 */
public final class ze1_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ze1_2(Object object, int n3, int n4, Object object2) {
        this.a = n4;
        this.c = object;
        this.d = object2;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        switch (n3) {
            default: {
                ((Integer)object2).intValue();
                qz1_2 qz1_22 = (qz1_2)this.c;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                yT1 yT12 = (yT1)this.d;
                Intrinsics.checkNotNullParameter(yT12, "$navController");
                int n4 = Me3.b(this.b | 1);
                de2_0.p(qz1_22, yT12, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        object2.getClass();
        object2 = (CMSNavigation)this.c;
        Intrinsics.checkNotNullParameter(object2, "$category");
        Function1 function1 = (Function1)this.d;
        Intrinsics.checkNotNullParameter(function1, "$onCardArrowClick");
        int n7 = Me3.b(this.b | 1);
        function1 = (he1_0)function1;
        ge1_0.a((CMSNavigation)object2, (he1_0)function1, (b30_0)object, n7);
        return Unit.a;
    }
}

