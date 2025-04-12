/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.media3.exoplayer.e$b;
import androidx.media3.exoplayer.video.f;

public final class f$a {
    public final Handler a;
    public final f b;

    public f$a(Handler handler, e$b e$b) {
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
        uC3 uC32 = new uC3(this, fj02);
        handler.post((Runnable)uC32);
    }

    public final void b(wc3_0 wc3_02) {
        Handler handler = this.a;
        if (handler != null) {
            int n3 = 1;
            Cl0 cl0 = new Cl0(n3, this, wc3_02);
            handler.post((Runnable)cl0);
        }
    }
}

