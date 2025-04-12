/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.BrandItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gd
 */
public final class gd_1
implements Function2 {
    public final /* synthetic */ BrandItemData a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ gd_1(BrandItemData brandItemData, xd_1 xd_12, yd_1 yd_12, int n3) {
        this.a = brandItemData;
        this.b = xd_12;
        this.c = yd_12;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$brandsData");
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        Function1 function12 = this.c;
        Intrinsics.checkNotNullParameter(function12, "$onFollowClicked");
        int n3 = Me3.b(this.d | 1);
        function1 = (xd_1)function1;
        function12 = (yd_1)function12;
        qd_0.c((BrandItemData)object2, (xd_1)function1, (yd_1)function12, (b30_0)object, n3);
        return Unit.a;
    }
}

