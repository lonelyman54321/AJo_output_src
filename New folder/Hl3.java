/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;

public final class Hl3
implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ Hl3(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void doFrame(long l2) {
        this.a.run();
    }
}

