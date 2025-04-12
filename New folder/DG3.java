/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack$Builder
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 */
import android.media.AudioTrack;
import android.view.WindowInsets;

public final class DG3 {
    public static /* bridge */ /* synthetic */ AudioTrack.Builder a(AudioTrack.Builder builder, boolean bl2) {
        return builder.setOffloadedPlayback(bl2);
    }

    public static /* synthetic */ WindowInsets.Builder b(WindowInsets windowInsets) {
        WindowInsets.Builder builder = new WindowInsets.Builder(windowInsets);
        return builder;
    }
}

