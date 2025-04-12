/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XL2
 */
public final class xl2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ xl2_1(String string2, ax1_0 ax1_02, u10 u102, int n3) {
        this.a = string2;
        this.b = ax1_02;
        this.c = u102;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$title");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onBackClick");
        gx0_2 gx0_22 = this.c;
        Intrinsics.checkNotNullParameter(gx0_22, "$content");
        int n3 = Me3.b(this.d | 1);
        function0 = (ax1_0)function0;
        gx0_22 = (u10)gx0_22;
        zl2_0.a((String)object2, (ax1_0)function0, (u10)gx0_22, (b30_0)object, n3);
        return Unit.a;
    }
}

