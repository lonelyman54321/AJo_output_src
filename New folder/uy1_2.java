/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uY1
 */
public final class uy1_2
implements Function1 {
    public final /* synthetic */ ky1_0 a;

    public /* synthetic */ uy1_2(ky1_0 ky1_02) {
        this.a = ky1_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        ky1_0 ky1_02 = this.a;
        Intrinsics.checkNotNullParameter(ky1_02, "this$0");
        ky1_02.m.k(object);
        return Unit.a;
    }
}

