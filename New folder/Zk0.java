/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRouting$OnRoutingChangedListener
 *  android.media.AudioTrack
 */
import android.media.AudioRouting;
import android.media.AudioTrack;

public final class Zk0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        audioTrack.removeOnRoutingChangedListener(onRoutingChangedListener);
    }
}

