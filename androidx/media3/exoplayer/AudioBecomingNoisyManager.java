/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Handler
 */
package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.media3.exoplayer.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver;
import androidx.media3.exoplayer.AudioBecomingNoisyManager$a;

public final class AudioBecomingNoisyManager {
    public final Context a;
    public final AudioBecomingNoisyManager$AudioBecomingNoisyReceiver b;
    public boolean c;

    public AudioBecomingNoisyManager(Context object, Handler handler, AudioBecomingNoisyManager$a audioBecomingNoisyManager$a) {
        this.a = object = object.getApplicationContext();
        super(this, handler, audioBecomingNoisyManager$a);
        this.b = object;
    }

    public final void a(boolean bl2) {
        boolean bl3;
        AudioBecomingNoisyManager$AudioBecomingNoisyReceiver audioBecomingNoisyManager$AudioBecomingNoisyReceiver = this.b;
        Context context = this.a;
        if (bl2 && !(bl3 = this.c)) {
            String string2 = "android.media.AUDIO_BECOMING_NOISY";
            IntentFilter intentFilter = new IntentFilter(string2);
            context.registerReceiver((BroadcastReceiver)audioBecomingNoisyManager$AudioBecomingNoisyReceiver, intentFilter);
            this.c = bl2 = true;
        } else if (!bl2 && (bl2 = this.c)) {
            context.unregisterReceiver((BroadcastReceiver)audioBecomingNoisyManager$AudioBecomingNoisyReceiver);
            bl2 = false;
            Object var5_6 = null;
            this.c = false;
        }
    }
}

