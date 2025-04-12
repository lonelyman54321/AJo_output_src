/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J
 */
public final class j_0
implements Function1 {
    public final /* synthetic */ n_0 a;

    public /* synthetic */ j_0(n_0 n_02) {
        this.a = n_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        n_0 n_02 = this.a;
        Intrinsics.checkNotNullParameter(n_02, "this$0");
        n_02.b.k(object);
        return Unit.a;
    }
}

