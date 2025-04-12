/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ab0
 */
public final class ab0_1
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ i90_0 c;

    public /* synthetic */ ab0_1(p83_0 p83_02, ob0_1 ob0_12, c80 c802) {
        this.a = p83_02;
        this.b = ob0_12;
        this.c = c802;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$unlockedCouponsList");
        ob0_1 ob0_12 = this.b;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        int n3 = ((p83_0)object2).size();
        Lambda lambda = Jb0$c.c;
        Jb0$d jb0$d = new Jb0$d((List)object2, (Function1)((Object)lambda));
        i90_02 = (c80)i90_02;
        lambda = new Jb0$e((List)object2, ob0_12, (c80)i90_02);
        object2 = new u10(-632812321, lambda, true);
        object.a(n3, null, jb0$d, (u10)object2);
        return Unit.a;
    }
}

