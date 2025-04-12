/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lt
 */
public final class lt_2
implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ ob0_1 e;
    public final /* synthetic */ yT1 f;
    public final /* synthetic */ p83_0 g;
    public final /* synthetic */ ft1_2 h;

    public /* synthetic */ lt_2(boolean bl2, p83_0 p83_02, ArrayList arrayList, c80 c802, ob0_1 ob0_12, yT1 yT12, p83_0 p83_03, ft1_2 ft1_22) {
        this.a = bl2;
        this.b = p83_02;
        this.c = arrayList;
        this.d = c802;
        this.e = ob0_12;
        this.f = yT12;
        this.g = p83_03;
        this.h = ft1_22;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (dt1_0)object;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$unlockedCouponsList");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$modifiedAvailableCouponsList");
        i90_0 i90_02 = this.d;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_1 ob0_12 = this.e;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Object object4 = this.f;
        Intrinsics.checkNotNullParameter(object4, "$navController");
        Object object5 = this.g;
        Intrinsics.checkNotNullParameter(object5, "$availableCouponsList");
        ft1_2 ft1_22 = this.h;
        Intrinsics.checkNotNullParameter(ft1_22, "$lazyListState");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        Object object6 = i90_02;
        object6 = (c80)i90_02;
        boolean bl3 = this.a;
        gx0_2 gx0_22 = new Qt$a(bl3, ob0_12, (yT1)object4, (c80)object6);
        boolean bl4 = true;
        u10 u102 = new u10(417809836, gx0_22, bl4);
        int n3 = 3;
        bt1.a((dt1_0)object, null, u102, n3);
        if (bl3 && (bl2 = ((p83_0)object2).isEmpty() ^ bl4)) {
            gx0_22 = new Qt$b(ob0_12, (p83_0)object2);
            int n4 = 1791155185;
            object2 = new u10(n4, gx0_22, bl4);
            bt1.a((dt1_0)object, null, (gx0_2)object2, n3);
        }
        object2 = new Qt$c((c80)object6, ob0_12, (yT1)object4);
        object4 = new u10(211785365, object2, bl4);
        bt1.a((dt1_0)object, null, (gx0_2)object4, n3);
        int n7 = object3.size();
        object6 = object3;
        object6 = (ArrayList)object3;
        object4 = new Qt$d((ArrayList)object6, ob0_12, bl3, (p83_0)object5);
        object3 = new u10(-1972886205, object4, bl4);
        bt1.b((dt1_0)object, n7, null, (u10)object3, 6);
        object5 = object;
        bl2 = bl3;
        object = new Qt$e(bl3, ft1_22, (ArrayList)object6, ob0_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, n3);
        return Unit.a;
    }
}

