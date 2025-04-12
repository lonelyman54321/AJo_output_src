/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory$Options
 *  android.media.AudioFocusRequest
 *  android.media.AudioFocusRequest$Builder
 */
import android.graphics.BitmapFactory;
import android.media.AudioFocusRequest;

public final class zr {
    public static /* synthetic */ AudioFocusRequest.Builder a(AudioFocusRequest audioFocusRequest) {
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(audioFocusRequest);
        return builder;
    }

    public static /* bridge */ /* synthetic */ void b(BitmapFactory.Options options) {
        options.inPreferredColorSpace = null;
    }
}

