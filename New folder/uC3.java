/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.video.f$a;

public final class uC3
implements Runnable {
    public final /* synthetic */ f$a a;
    public final /* synthetic */ fj0 b;

    public /* synthetic */ uC3(f$a f$a, fj0 fj02) {
        this.a = f$a;
        this.b = fj02;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Object object = this.a;
        fj0 fj02 = this.b;
        object.getClass();
        // MONITORENTER : fj02
        // MONITOREXIT : fj02
        object = ((f$a)object).b;
        object.b(fj02);
    }
}

