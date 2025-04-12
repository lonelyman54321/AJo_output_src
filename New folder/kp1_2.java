/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from kp1
 */
public final class kp1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ lp1_0 c;
    public final /* synthetic */ bl_2 d;

    public kp1_2(lp1_0 lp1_02, CancellableContinuationImpl cancellableContinuationImpl) {
        this.c = lp1_02;
        this.d = cancellableContinuationImpl;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.c;
        Object object2 = ((lp1_0)object).a;
        bl_2 bl_22 = this.d;
        synchronized (object2) {
            object = ((lp1_0)object).b;
            object.remove(bl_22);
            return Unit.a;
        }
    }
}

