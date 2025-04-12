/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.concurrent.Executor;

/*
 * Renamed from dl0
 */
public final class dl0_0
implements Executor {
    public final /* synthetic */ Handler a;

    public /* synthetic */ dl0_0(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable2) {
        this.a.post(runnable2);
    }
}

