/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import java.util.concurrent.Executor;

public final class Gl3
implements Executor {
    public final /* synthetic */ Choreographer a;

    public /* synthetic */ Gl3(Choreographer choreographer) {
        this.a = choreographer;
    }

    public final void execute(Runnable runnable2) {
        Hl3 hl3 = new Hl3(runnable2);
        this.a.postFrameCallback((Choreographer.FrameCallback)hl3);
    }
}

