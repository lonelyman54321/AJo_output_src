/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class Lz2$b
implements Function1 {
    public final /* synthetic */ bl_2 a;

    public Lz2$b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = tl2_2.b;
        object = Unit.a;
        this.a.resumeWith(object);
        return object;
    }
}

