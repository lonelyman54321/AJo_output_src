/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class vx3
implements dx_0 {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ vx3(ux3 ux32) {
        this.a = ux32;
    }

    public final DataCallback apply(Object object, Object object2) {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        Intrinsics.checkNotNullParameter(object, "p0");
        Intrinsics.checkNotNullParameter(object2, "p1");
        return (DataCallback)function2.invoke(object, object2);
    }
}

