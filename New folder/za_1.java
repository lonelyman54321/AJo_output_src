/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Za
 */
public final class za_1
implements Function2 {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ j7_0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ za_1(CMSNavigation cMSNavigation, ib_1 ib_12, jb_2 jb_22, boolean bl2, j7_0 j7_02, int n3) {
        this.a = cMSNavigation;
        this.b = ib_12;
        this.c = jb_22;
        this.d = bl2;
        this.e = j7_02;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        CMSNavigation cMSNavigation = this.a;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$ajioSubCategory");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onCardArrowClick");
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$onSubCategoryClick");
        j7_0 j7_02 = this.e;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        int n3 = Me3.b(this.f | 1);
        Object object4 = object;
        object4 = (ib_1)object;
        Object object5 = object2;
        object5 = (jb_2)object2;
        boolean bl2 = this.d;
        eb_0.b(cMSNavigation, (ib_1)object4, (jb_2)object5, bl2, j7_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

