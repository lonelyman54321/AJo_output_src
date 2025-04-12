/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  androidx.media3.exoplayer.hls.HlsMediaSource$Factory
 */
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.f;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.a$a;
import androidx.media3.datasource.c$a;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.j;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vL1
 */
public final class vl1_0
implements yg1_1 {
    public PlayerView a;
    public e b;

    public final View a() {
        PlayerView playerView = this.a;
        Intrinsics.checkNotNull((Object)playerView);
        return playerView;
    }

    public final void b(Context object, zm1_0 zm1_02, an1_0 an1_02) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(zm1_02, "buffering");
        Intrinsics.checkNotNullParameter(an1_02, "playerReady");
        Object object2 = this.b;
        if (object2 != null) {
            return;
        }
        object2 = new Object();
        zn0 zn02 = new zn0((Context)object, (j4$b)object2);
        object2 = new ExoPlayer$c((Context)object);
        ((ExoPlayer$c)object2).b(zn02);
        object = ((ExoPlayer$c)object2).a();
        ((e)object).setVolume(0.0f);
        object2 = new ul1_1(zm1_02, this, (e)object, an1_02);
        ((e)object).l.a(object2);
        this.b = object;
    }

    public final void c() {
        e e2 = this.b;
        if (e2 != null) {
            float f5 = this.e();
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object > 0) {
                e2.setVolume(0.0f);
            } else {
                float f7 = f5 - 0.0f;
                Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (object2 == false) {
                    object2 = 1065353216;
                    f5 = 1.0f;
                    e2.setVolume(f5);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void d(Context object, bn1_0 bn1_02) {
        void var4_7;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(bn1_02, "artworkAsset");
        PlayerView playerView = this.a;
        if (playerView != null) {
            return;
        }
        playerView = new PlayerView((Context)object);
        playerView.setBackgroundColor(0);
        object = object.getResources().getConfiguration();
        int bl2 = ((Configuration)object).orientation;
        int n3 = 2;
        if (bl2 == n3) {
            int n4 = 3;
        } else {
            boolean bl3 = false;
            object = null;
        }
        playerView.setResizeMode((int)var4_7);
        boolean bl4 = true;
        playerView.setUseArtwork(bl4);
        bn1_02 = (Drawable)bn1_02.invoke();
        playerView.setDefaultArtwork((Drawable)bn1_02);
        playerView.setUseController(bl4);
        playerView.setControllerAutoShow(false);
        object = this.b;
        playerView.setPlayer((f)object);
        this.a = playerView;
    }

    public final float e() {
        float f5;
        e e2 = this.b;
        if (e2 != null) {
            e2.E();
            f5 = e2.h0;
        } else {
            f5 = 0.0f;
            e2 = null;
        }
        return f5;
    }

    public final void f(Context object, String object2, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(object, "ctx");
        Intrinsics.checkNotNullParameter(object2, "uriString");
        Object object3 = this.a;
        if (object3 != null) {
            object3.requestFocus();
            ((PlayerView)((Object)object3)).setShowBuffering(0);
        }
        if ((object3 = this.b) != null) {
            Object object4 = new nl0$a((Context)object);
            object4 = ((nl0$a)object4).a();
            Intrinsics.checkNotNullExpressionValue(object4, "Builder(ctx).build()");
            String string2 = object.getPackageName();
            string2 = gz3.y(object, string2);
            Intrinsics.checkNotNullExpressionValue(string2, "getUserAgent(ctx, ctx.packageName)");
            object2 = MediaItem.b((String)object2);
            Intrinsics.checkNotNullExpressionValue(object2, "fromUri(uriString)");
            c$a c$a = new c$a();
            c$a.c(string2);
            c$a.b((Kq3)object4);
            Intrinsics.checkNotNullExpressionValue(c$a, "Factory().setUserAgent(u\u2026er(defaultBandwidthMeter)");
            object4 = new a$a((Context)object, c$a);
            object = new HlsMediaSource.Factory((DataSource$Factory)object4);
            object = object.createMediaSource((MediaItem)object2);
            object2 = "Factory(dataSourceFactor\u2026ateMediaSource(mediaItem)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (j)object;
            ((e)object3).setMediaSource((j)object);
            ((e)object3).prepare();
            if (bl2) {
                object = this.a;
                if (object != null) {
                    object.showController();
                }
                ((e)object3).setPlayWhenReady(false);
                int n3 = 1065353216;
                float f5 = 1.0f;
                ((e)object3).setVolume(f5);
            } else if (bl3) {
                boolean bl4 = true;
                ((e)object3).setPlayWhenReady(bl4);
                float f6 = this.e();
                ((e)object3).setVolume(f6);
            }
        }
    }

    public final void pause() {
        e e2 = this.b;
        if (e2 != null) {
            e2.stop();
            e2.release();
        }
        this.b = null;
        this.a = null;
    }

    public final void setPlayWhenReady(boolean bl2) {
        e e2 = this.b;
        if (e2 != null) {
            e2.setPlayWhenReady(bl2);
        }
    }
}

