/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.audio.b$a;

public final class Nr
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ fj0 b;

    public /* synthetic */ Nr(b$a b$a, fj0 fj02) {
        this.a = b$a;
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
        object = ((b$a)object).b;
        object.s(fj02);
    }
}

