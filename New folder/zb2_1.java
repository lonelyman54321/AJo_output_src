/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zb2
 */
public final class zb2_1
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ zb2_1(sd2_2 sd2_22, yb_1 yb_12, boolean bl2, int n3) {
        this.a = sd2_22;
        this.b = yb_12;
        this.c = bl2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$onCloseButtonClicked");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onOkayButtonClicked");
        int n3 = Me3.b(this.d | 1);
        object2 = (sd2_2)object2;
        function0 = (yb_1)function0;
        boolean bl2 = this.c;
        jd2_1.b((sd2_2)object2, (yb_1)function0, bl2, (b30_0)object, n3);
        return Unit.a;
    }
}

