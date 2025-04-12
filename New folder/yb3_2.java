/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.FrameLayout$LayoutParams
 */
import android.content.Context;
import android.widget.FrameLayout;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YB3
 */
public final class yb3_2
implements Function1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public /* synthetic */ yb3_2(Context context, int n3, ExoPlayer exoPlayer, boolean bl2, String string2) {
        this.a = context;
        this.b = n3;
        this.c = exoPlayer;
        this.d = bl2;
        this.e = string2;
    }

    public final Object invoke(Object object) {
        object = (Context)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$context");
        ExoPlayer exoPlayer = this.c;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        String string2 = this.e;
        Intrinsics.checkNotNullParameter(string2, "$videoUrl");
        String string3 = "it";
        Intrinsics.checkNotNullParameter(object, string3);
        object = new PlayerView((Context)object2);
        int n3 = -1;
        int n4 = this.b;
        object2 = new FrameLayout.LayoutParams(n3, n4);
        ((PlayerView)((Object)object)).setUseController(false);
        ((PlayerView)((Object)object)).setControllerShowTimeoutMs(0);
        ((PlayerView)((Object)object)).hideController();
        ((PlayerView)((Object)object)).setControllerAutoShow(false);
        ((PlayerView)((Object)object)).setResizeMode(4);
        object2 = MediaItem.b(string2);
        exoPlayer.setMediaItem((MediaItem)object2);
        int n7 = 2;
        float f5 = 2.8E-45f;
        exoPlayer.setRepeatMode(n7);
        exoPlayer.prepare();
        ((PlayerView)((Object)object)).setPlayer(exoPlayer);
        ((PlayerView)((Object)object)).setShowBuffering(n7);
        n7 = (int)(this.d ? 1 : 0);
        string2 = "exoPlayer";
        if (n7 != 0) {
            Intrinsics.checkNotNullParameter(exoPlayer, string2);
            n7 = 0;
            f5 = 0.0f;
            object2 = null;
            exoPlayer.setVolume(0.0f);
        } else {
            Intrinsics.checkNotNullParameter(exoPlayer, string2);
            n7 = 1065353216;
            f5 = 1.0f;
            exoPlayer.setVolume(f5);
        }
        return object;
    }
}

