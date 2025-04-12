/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from f7
 */
public final class f7_0
implements Function1 {
    public final /* synthetic */ j7_0 a;

    public /* synthetic */ f7_0(j7_0 j7_02) {
        this.a = j7_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "this$0");
        j7_02.e.k(object);
        return Unit.a;
    }
}

