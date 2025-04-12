/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 */
import android.media.AudioAttributes;

public final class J42$a {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        return builder;
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int n3) {
        return builder.setContentType(n3);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int n3) {
        return builder.setLegacyStreamType(n3);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int n3) {
        return builder.setUsage(n3);
    }
}

