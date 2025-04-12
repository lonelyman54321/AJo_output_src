/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import androidx.media3.ui.PlayerView;

public final class pu2
implements Runnable {
    public final /* synthetic */ PlayerView a;
    public final /* synthetic */ Bitmap b;

    public /* synthetic */ pu2(PlayerView playerView, Bitmap bitmap) {
        this.a = playerView;
        this.b = bitmap;
    }

    public final void run() {
        PlayerView playerView = this.a;
        Bitmap bitmap = this.b;
        PlayerView.a(playerView, bitmap);
    }
}

