/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Zu3
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ Zu3(LP1 lP1, mj0_2 mj0_22, u10 u102, u10 u103, int n3) {
        this.a = lP1;
        this.b = mj0_22;
        this.c = u102;
        this.d = u103;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onRefresh");
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$content");
        Function2 function2 = this.d;
        Intrinsics.checkNotNullParameter(function2, "$indicatorRefresh");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (mj0_2)object;
        Object object5 = object2;
        object5 = (u10)object2;
        Function2 function22 = function2;
        function22 = (u10)function2;
        ov3.b(this.a, (mj0_2)object4, (u10)object5, (u10)function22, (b30_0)object3, n3);
        return Unit.a;
    }
}

