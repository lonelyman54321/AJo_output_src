/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oy3
 */
public final class oy3_0
implements Function1 {
    public final /* synthetic */ hy3_0 a;

    public /* synthetic */ oy3_0(hy3_0 hy3_02) {
        this.a = hy3_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        hy3_0 hy3_02 = this.a;
        Intrinsics.checkNotNullParameter(hy3_02, "this$0");
        hy3_02.l.k(object);
        return Unit.a;
    }
}

