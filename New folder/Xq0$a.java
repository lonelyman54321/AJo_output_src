/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedWriter;
import java.util.concurrent.Callable;

public final class Xq0$a
implements Callable {
    public final /* synthetic */ Xq0 a;

    public Xq0$a(Xq0 xq0) {
        this.a = xq0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Xq0 xq0 = this.a;
        synchronized (xq0) {
            Throwable throwable2;
            block4: {
                BufferedWriter bufferedWriter;
                Xq0 xq02;
                try {
                    xq02 = this.a;
                    bufferedWriter = xq02.i;
                    if (bufferedWriter == null) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                xq02.G();
                xq02 = this.a;
                boolean bl2 = xq02.n();
                if (!bl2) return null;
                xq02 = this.a;
                xq02.A();
                xq02 = this.a;
                bufferedWriter = null;
                xq02.k = 0;
                return null;
            }
            throw throwable2;
        }
    }
}

