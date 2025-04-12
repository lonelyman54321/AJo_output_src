/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.OutcomeReceiver
 */
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class i80
extends AtomicBoolean
implements OutcomeReceiver {
    public final f80_0 a;

    public i80(CancellableContinuationImpl cancellableContinuationImpl) {
        super(false);
        this.a = cancellableContinuationImpl;
    }

    public final void onError(Throwable serializable) {
        f80_0 f80_02 = null;
        boolean bl2 = true;
        boolean bl3 = this.compareAndSet(false, bl2);
        if (bl3) {
            f80_02 = this.a;
            serializable = vl2_2.a(serializable);
            f80_02.resumeWith(serializable);
        }
    }

    public final void onResult(Object object) {
        f80_0 f80_02 = null;
        boolean bl2 = true;
        boolean bl3 = this.compareAndSet(false, bl2);
        if (bl3) {
            f80_02 = this.a;
            f80_02.resumeWith(object);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContinuationOutcomeReceiver(outcomeReceived = ");
        boolean bl2 = this.get();
        stringBuilder.append(bl2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

