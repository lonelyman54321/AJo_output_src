/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.media3.exoplayer.hls.HlsMediaSource$Factory
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.common.MediaItem;
import androidx.media3.common.b;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.a$a;
import androidx.media3.datasource.c$a;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.j;
import androidx.media3.ui.PlayerView;
import com.clevertap.android.sdk.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wL1
 */
public final class wl1_0
implements tg1_0 {
    public e a;
    public PlayerView b;
    public ViewGroup.LayoutParams c;
    public FrameLayout.LayoutParams d;
    public long e;

    public final View a() {
        PlayerView playerView = this.b;
        Intrinsics.checkNotNull((Object)playerView);
        return playerView;
    }

    public final void b() {
        e e2 = this.a;
        if (e2 != null) {
            long l2;
            Intrinsics.checkNotNull(e2);
            this.e = l2 = e2.getCurrentPosition();
        }
    }

    public final void c(Context object, String object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "url");
        Object object3 = this.a;
        if (object3 != null) {
            return;
        }
        object3 = new nl0$a((Context)object);
        object3 = ((nl0$a)object3).a();
        Intrinsics.checkNotNullExpressionValue(object3, "Builder(context).build()");
        Object object4 = new j4$b();
        zn0 zn02 = new zn0((Context)object, (j4$b)object4);
        object4 = object.getPackageName();
        object4 = gz3.y((Context)object, (String)object4);
        Intrinsics.checkNotNullExpressionValue(object4, "getUserAgent(context, context.packageName)");
        c$a c$a = new c$a();
        c$a.c((String)object4);
        c$a.b((Kq3)object3);
        Intrinsics.checkNotNullExpressionValue(c$a, "Factory().setUserAgent(u\u2026ransferListener(listener)");
        object3 = new a$a((Context)object, c$a);
        object2 = MediaItem.b((String)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "fromUri(url)");
        object4 = new HlsMediaSource.Factory((DataSource$Factory)object3);
        object2 = object4.createMediaSource((MediaItem)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "Factory(dataSourceFactor\u2026ateMediaSource(mediaItem)");
        object3 = new ExoPlayer$c((Context)object);
        ((ExoPlayer$c)object3).b(zn02);
        object = ((ExoPlayer$c)object3).a();
        object2 = (j)object2;
        ((e)object).setMediaSource((j)object2);
        ((e)object).prepare();
        ((e)object).setRepeatMode(1);
        long l2 = this.e;
        ((b)object).seekTo(l2);
        this.a = object;
    }

    public final void d(boolean bl2) {
        if (bl2) {
            PlayerView playerView = this.b;
            Intrinsics.checkNotNull((Object)playerView);
            playerView = playerView.getLayoutParams();
            this.c = playerView;
            playerView = this.b;
            Intrinsics.checkNotNull((Object)playerView);
            FrameLayout.LayoutParams layoutParams = this.d;
            playerView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        } else {
            PlayerView playerView = this.b;
            Intrinsics.checkNotNull((Object)playerView);
            ViewGroup.LayoutParams layoutParams = this.c;
            playerView.setLayoutParams(layoutParams);
        }
    }

    public final void e(Context context, boolean bl2) {
        float f5;
        float f6;
        int n3;
        Intrinsics.checkNotNullParameter(context, "context");
        Object object = this.b;
        if (object != null) {
            return;
        }
        if (bl2) {
            n3 = 1137442816;
            f6 = 408.0f;
        } else {
            n3 = 1131413504;
            f6 = 240.0f;
        }
        Object object2 = context.getResources().getDisplayMetrics();
        boolean bl3 = true;
        f6 = TypedValue.applyDimension((int)(bl3 ? 1 : 0), (float)f6, (DisplayMetrics)object2);
        n3 = (int)f6;
        if (bl2) {
            int n4 = 1133871104;
            f5 = 299.0f;
        } else {
            int n7 = 1124466688;
            f5 = 134.0f;
        }
        object2 = context.getResources().getDisplayMetrics();
        int n8 = (int)TypedValue.applyDimension((int)(bl3 ? 1 : 0), (float)f5, (DisplayMetrics)object2);
        object2 = new PlayerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n3, n8);
        this.c = layoutParams;
        object2.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        ((PlayerView)((Object)object2)).setShowBuffering((int)(bl3 ? 1 : 0));
        ((PlayerView)((Object)object2)).setUseArtwork(bl3);
        ((PlayerView)((Object)object2)).setControllerAutoShow(false);
        context = context.getResources();
        int n10 = R$drawable.ct_audio;
        object = WK2.a;
        context = context.getDrawable(n10, null);
        ((PlayerView)((Object)object2)).setDefaultArtwork((Drawable)context);
        this.b = object2;
    }

    public final void pause() {
        e e2 = this.a;
        if (e2 != null) {
            e2.stop();
            e2.release();
            e2 = null;
            this.a = null;
        }
    }

    public final void play() {
        boolean bl2;
        Object object = this.b;
        if (object != null) {
            object.requestFocus();
            bl2 = false;
            object.setVisibility(0);
            e e2 = this.a;
            object.setPlayer(e2);
        }
        if ((object = this.a) != null) {
            bl2 = true;
            ((e)object).setPlayWhenReady(bl2);
        }
    }
}

