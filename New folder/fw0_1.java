/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fW0
 */
public final class fw0_1
implements Function1 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ tr1_0 b;

    public /* synthetic */ fw0_1(FragmentManager fragmentManager, tr1_0 tr1_02) {
        this.a = fragmentManager;
        this.b = tr1_02;
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        tr1_0 tr1_02 = this.b;
        Intrinsics.checkNotNullParameter(tr1_02, "$container");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        FragmentManager fragmentManager = this.a;
        object = new hw0_2(fragmentManager, tr1_02);
        return object;
    }
}

