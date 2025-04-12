/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.JobSupport$b;

final class JobSupport$AwaitContinuation
extends CancellableContinuationImpl {
    public final JobSupport i;

    public JobSupport$AwaitContinuation(f80_0 f80_02, JobSupport jobSupport) {
        super(1, f80_02);
        this.i = jobSupport;
    }

    public final Throwable o(JobSupport jobSupport) {
        JobSupport jobSupport2 = this.i;
        jobSupport2.getClass();
        Object object = JobSupport.a;
        jobSupport2 = ((AtomicReferenceFieldUpdater)object).get(jobSupport2);
        boolean bl2 = jobSupport2 instanceof JobSupport$b;
        if (bl2) {
            object = jobSupport2;
            object = ((JobSupport$b)((Object)jobSupport2)).c();
            if (object != null) {
                return object;
            }
        }
        if (bl2 = jobSupport2 instanceof m00_0) {
            return ((m00_0)((Object)jobSupport2)).a;
        }
        return jobSupport.w();
    }

    public final String z() {
        return "AwaitContinuation";
    }
}

