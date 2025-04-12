/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 */
import android.media.AudioTrack;
import java.nio.ByteBuffer;

public final class Lk0 {
    public static /* bridge */ /* synthetic */ int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int n3, long l2) {
        return audioTrack.write(byteBuffer, n3, 1, l2);
    }
}

