/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Handler
 */
package androidx.media3.exoplayer;

import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.exoplayer.a;

public final class a$a
implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ a b;

    public a$a(a a2, Handler handler) {
        this.b = a2;
        this.a = handler;
    }

    public final void onAudioFocusChange(int n3) {
        Cr cr2 = new Cr(this, n3);
        this.a.post((Runnable)cr2);
    }
}

