/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from P6
 */
public final class p6_0
implements Function2 {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j7_0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ p6_0(CMSNavigation cMSNavigation, t6_0 t6_02, int n3, j7_0 j7_02, int n4) {
        this.a = cMSNavigation;
        this.b = t6_02;
        this.c = n3;
        this.d = j7_02;
        this.e = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        CMSNavigation cMSNavigation = this.a;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$category");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onItemClick");
        j7_0 j7_02 = this.d;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        int n3 = Me3.b(this.e | 1);
        int n4 = this.c;
        Object object4 = object;
        object4 = (t6_0)object;
        Z6.c(cMSNavigation, (t6_0)object4, n4, j7_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

