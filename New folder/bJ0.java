/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.ril.ajio.data.repo.UserRepo;

public final class bJ0
implements Continuation,
bx0_2 {
    public Object apply(Object object) {
        return UserRepo.y((Throwable)object);
    }

    public Object then(Task task2) {
        return FcmBroadcastProcessor.d(task2);
    }
}

