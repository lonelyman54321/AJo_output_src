/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;

/*
 * Renamed from eJ0
 */
public final class ej0_1
implements Continuation {
    public final Object then(Task task2) {
        return FcmBroadcastProcessor.c(task2);
    }
}

