/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from P90
 */
public final class p90_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ Callable a;
    public final /* synthetic */ bl_2 b;

    public p90_0(Cb1$a cb1$a, CancellableContinuationImpl cancellableContinuationImpl, f80_0 f80_02) {
        this.a = cb1$a;
        this.b = cancellableContinuationImpl;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Cb1$a cb1$a = (Cb1$a)this.a;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl)this.b;
        object = new p90_0(cb1$a, cancellableContinuationImpl, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (p90_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((p90_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        bl_2 bl_22 = this.b;
        vl2_2.b(object);
        try {
            object = this.a;
            object = object.call();
        }
        catch (Throwable throwable) {
            tL2$b tL2$b = vl2_2.a(throwable);
            bl_22.resumeWith(tL2$b);
            return Unit.a;
        }
        {
            bl_22.resumeWith(object);
            return Unit.a;
        }
    }
}

