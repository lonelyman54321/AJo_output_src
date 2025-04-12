/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hd
 */
public final class hd_1
implements Function1 {
    public final /* synthetic */ i a;
    public final /* synthetic */ n b;

    public /* synthetic */ hd_1(i i3, n n3) {
        this.a = i3;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        i i3 = this.a;
        Intrinsics.checkNotNullParameter(i3, "$lifecycle");
        n n3 = this.b;
        Intrinsics.checkNotNullParameter(n3, "$onLifecycleEventObserver");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        i3.a(n3);
        object = new qd$c(i3, n3);
        return object;
    }
}

