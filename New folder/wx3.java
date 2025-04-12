/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class wx3
implements Function1 {
    public final /* synthetic */ yx3 a;

    public /* synthetic */ wx3(yx3 yx32) {
        this.a = yx32;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        yx3 yx32 = this.a;
        Intrinsics.checkNotNullParameter(yx32, "this$0");
        yx32.f.k(object);
        return Unit.a;
    }
}

