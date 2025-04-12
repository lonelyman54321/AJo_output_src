/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.app.g$c;

public final class Um
implements Runnable {
    public final /* synthetic */ g$c a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ Um(g$c c2, Runnable runnable2) {
        this.a = c2;
        this.b = runnable2;
    }

    public final void run() {
        Runnable runnable2 = this.b;
        g$c g$c = this.a;
        g$c.getClass();
        try {
            runnable2.run();
            return;
        }
        finally {
            g$c.a();
        }
    }
}

