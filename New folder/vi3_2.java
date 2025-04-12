/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Vi3
 */
public final class vi3_2
implements OnCompleteListener {
    public final /* synthetic */ bl_2 a;

    public vi3_2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final void onComplete(Task object) {
        Object object2 = ((Task)object).getException();
        bl_2 bl_22 = this.a;
        if (object2 == null) {
            boolean bl2 = ((Task)object).isCanceled();
            if (bl2) {
                object = null;
                bl_22.e(null);
            } else {
                object2 = tl2_2.b;
                object = ((Task)object).getResult();
                bl_22.resumeWith(object);
            }
        } else {
            object = tl2_2.b;
            object = vl2_2.a((Throwable)object2);
            bl_22.resumeWith(object);
        }
    }
}

