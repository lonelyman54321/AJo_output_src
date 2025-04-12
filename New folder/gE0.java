/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class gE0
implements Executor {
    public final Handler a;

    public gE0(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable object) {
        object.getClass();
        Object object2 = this.a;
        boolean bl2 = object2.post((Runnable)object);
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object2);
        stringBuilder.append(" is shutting down");
        object2 = stringBuilder.toString();
        object = new RejectedExecutionException((String)object2);
        throw object;
    }
}

