/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioSink$b;
import androidx.media3.exoplayer.audio.b$a;
import androidx.media3.exoplayer.audio.g;

public final class g$a
implements AudioSink$b {
    public final /* synthetic */ g a;

    public g$a(g g3) {
        this.a = g3;
    }

    public final void a(Exception exception) {
        Cx.d("Audio sink error", exception);
        b$a b$a = this.a.U0;
        Handler handler = b$a.a;
        if (handler != null) {
            Jr jr = new Jr(b$a, exception);
            handler.post((Runnable)jr);
        }
    }
}

