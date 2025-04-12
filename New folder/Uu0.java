/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  android.os.Handler
 *  android.view.WindowInsets
 */
import android.media.MediaCodec;
import android.os.Handler;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

public final class Uu0 {
    public static /* bridge */ /* synthetic */ WindowInsets a(DrawerLayout drawerLayout) {
        return drawerLayout.getRootWindowInsets();
    }

    public static /* bridge */ /* synthetic */ void b(MediaCodec mediaCodec, lh3 lh32, Handler handler) {
        mediaCodec.setOnFrameRenderedListener((MediaCodec.OnFrameRenderedListener)lh32, handler);
    }
}

