/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class RD2
implements Function1 {
    public final /* synthetic */ gE2 a;

    public /* synthetic */ RD2(gE2 gE22) {
        this.a = gE22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        gE2 gE22 = this.a;
        Intrinsics.checkNotNullParameter(gE22, "this$0");
        gE22.e.k(object);
        return Unit.a;
    }
}

