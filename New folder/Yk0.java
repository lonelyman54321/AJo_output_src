/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRouting$OnRoutingChangedListener
 *  android.media.AudioTrack
 *  android.os.Handler
 */
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

public final class Yk0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }
}

