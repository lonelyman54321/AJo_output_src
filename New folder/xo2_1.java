/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xo2
 */
public final class xo2_1
implements Function1 {
    public final /* synthetic */ op2_2 a;

    public /* synthetic */ xo2_1(op2_2 op2_22) {
        this.a = op2_22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        op2_2 op2_22 = this.a;
        Intrinsics.checkNotNullParameter(op2_22, "this$0");
        op2_22.A.k(object);
        return Unit.a;
    }
}

