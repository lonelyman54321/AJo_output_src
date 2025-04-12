/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class eE2
implements dx_0 {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ eE2(dE2 dE22) {
        this.a = dE22;
    }

    public final DataCallback apply(Object object, Object object2) {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        Intrinsics.checkNotNullParameter(object, "p0");
        Intrinsics.checkNotNullParameter(object2, "p1");
        return (DataCallback)function2.invoke(object, object2);
    }
}

