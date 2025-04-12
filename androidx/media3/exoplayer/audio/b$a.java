/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.e$b;

public final class b$a {
    public final Handler a;
    public final b b;

    public b$a(Handler handler, e$b e$b) {
        this.a = handler;
        this.b = e$b;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(fj0 fj02) {
        // MONITORENTER : fj02
        // MONITOREXIT : fj02
        Handler handler = this.a;
        if (handler == null) return;
        Nr nr = new Nr(this, fj02);
        handler.post((Runnable)nr);
    }
}

