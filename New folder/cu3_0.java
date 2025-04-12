/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cu3
 */
public final class cu3_0
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ cu3_0(int n3, ft1_2 ft1_22, Function0 function0, int n4) {
        this.a = n3;
        this.b = ft1_22;
        this.c = function0;
        this.d = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        ft1_2 ft1_22 = this.b;
        Intrinsics.checkNotNullParameter(ft1_22, "$lazyListState");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onItemViewed");
        int n3 = Me3.b(this.d | 1);
        ov3.m(this.a, ft1_22, function0, (b30_0)object, n3);
        return Unit.a;
    }
}

