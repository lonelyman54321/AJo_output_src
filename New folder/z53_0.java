/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from z53
 */
public final class z53_0
extends Lambda
implements Function1 {
    public final /* synthetic */ bl_2 c;

    public z53_0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.c = cancellableContinuationImpl;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = tl2_2.b;
        object = Unit.a;
        this.c.resumeWith(object);
        return object;
    }
}

