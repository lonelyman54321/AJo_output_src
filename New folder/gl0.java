/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioFormat
 *  android.media.AudioTrack$Builder
 *  android.media.MediaDrmResetException
 */
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;

public final class gl0 {
    public static /* bridge */ /* synthetic */ AudioTrack.Builder a(AudioTrack.Builder builder, AudioFormat audioFormat) {
        return builder.setAudioFormat(audioFormat);
    }

    public static /* bridge */ /* synthetic */ boolean b(Throwable throwable) {
        return throwable instanceof MediaDrmResetException;
    }
}

