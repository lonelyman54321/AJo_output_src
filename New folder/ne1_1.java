/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NE1
 */
public final class ne1_1
implements Function2 {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bf1_2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ne1_1(CMSNavigation cMSNavigation, ve1_1 ve1_12, boolean bl2, bf1_2 bf1_22, int n3) {
        this.a = cMSNavigation;
        this.b = ve1_12;
        this.c = bl2;
        this.d = bf1_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        CMSNavigation cMSNavigation = this.a;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$category");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onCardArrowClick");
        bf1_2 bf1_22 = this.d;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        int n3 = Me3.b(this.e | 1);
        boolean bl2 = this.c;
        Object object4 = object;
        object4 = (ve1_1)object;
        ue1_0.a(cMSNavigation, (ve1_1)object4, bl2, bf1_22, (b30_0)object3, n3);
        return Unit.a;
    }
}

