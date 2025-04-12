/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xc0
 */
public final class xc0_1
implements Function1 {
    public final /* synthetic */ fd0_2 a;

    public /* synthetic */ xc0_1(fd0_2 fd0_22) {
        this.a = fd0_22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        fd0_2 fd0_22 = this.a;
        Intrinsics.checkNotNullParameter(fd0_22, "this$0");
        fd0_22.c.k(object);
        return Unit.a;
    }
}

