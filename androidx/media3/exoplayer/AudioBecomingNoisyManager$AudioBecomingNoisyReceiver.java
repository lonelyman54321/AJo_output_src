/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 */
package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.media3.exoplayer.AudioBecomingNoisyManager;
import androidx.media3.exoplayer.AudioBecomingNoisyManager$a;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.e$b;

final class AudioBecomingNoisyManager$AudioBecomingNoisyReceiver
extends BroadcastReceiver
implements Runnable {
    public final AudioBecomingNoisyManager$a a;
    public final Handler b;
    public final /* synthetic */ AudioBecomingNoisyManager c;

    public AudioBecomingNoisyManager$AudioBecomingNoisyReceiver(AudioBecomingNoisyManager audioBecomingNoisyManager, Handler handler, AudioBecomingNoisyManager$a a2) {
        this.c = audioBecomingNoisyManager;
        this.b = handler;
        this.a = a2;
    }

    public final void onReceive(Context object, Intent object2) {
        object = "android.media.AUDIO_BECOMING_NOISY";
        boolean bl2 = ((String)object).equals(object2 = object2.getAction());
        if (bl2) {
            object = this.b;
            object.post((Runnable)this);
        }
    }

    public final void run() {
        Object object = this.c;
        boolean bl2 = ((AudioBecomingNoisyManager)object).c;
        if (bl2) {
            object = ((e$b)this.a).a;
            int n3 = -1;
            int n4 = 3;
            ((e)object).A(n3, n4, false);
        }
    }
}

