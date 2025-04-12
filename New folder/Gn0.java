/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.Spatializer
 */
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;

public final class Gn0 {
    public static /* bridge */ /* synthetic */ boolean a(Spatializer spatializer, AudioAttributes audioAttributes, AudioFormat audioFormat) {
        return spatializer.canBeSpatialized(audioAttributes, audioFormat);
    }
}

