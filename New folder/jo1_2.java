/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Jo1
 */
public final class jo1_2
implements vj_2 {
    public final /* synthetic */ bl_2 a;

    public jo1_2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final void a(jj_2 object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        object = tl2_2.b;
        this.a.resumeWith(dl2_22);
    }

    public final void b(jj_2 object, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(throwable, "t");
        object = tl2_2.b;
        object = vl2_2.a(throwable);
        this.a.resumeWith(object);
    }
}

