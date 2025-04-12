/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  com.google.android.exoplayer2.ExoPlayer
 *  com.google.android.exoplayer2.ExoPlayer$Builder
 *  com.google.android.exoplayer2.MediaItem
 *  com.google.android.exoplayer2.Player
 *  com.google.android.exoplayer2.Player$Listener
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
 *  com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory
 *  com.google.android.exoplayer2.trackselection.DefaultTrackSelector
 *  com.google.android.exoplayer2.trackselection.ExoTrackSelection$Factory
 *  com.google.android.exoplayer2.trackselection.TrackSelector
 *  com.google.android.exoplayer2.ui.StyledPlayerView
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$Builder
 *  com.google.android.exoplayer2.upstream.DefaultDataSource$Factory
 *  com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
 *  com.google.android.exoplayer2.upstream.TransferListener
 *  com.google.android.exoplayer2.util.Util
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FF0
 */
public final class ff0_1
implements yg1_1 {
    public StyledPlayerView a;
    public ExoPlayer b;

    public final View a() {
        StyledPlayerView styledPlayerView = this.a;
        Intrinsics.checkNotNull(styledPlayerView);
        return (View)styledPlayerView;
    }

    public final void b(Context context, zm1_0 zm1_02, an1_0 an1_02) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zm1_02, "buffering");
        Intrinsics.checkNotNullParameter(an1_02, "playerReady");
        Object object = this.b;
        if (object != null) {
            return;
        }
        object = new AdaptiveTrackSelection.Factory();
        object = (ExoTrackSelection.Factory)object;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context, (ExoTrackSelection.Factory)object);
        defaultTrackSelector = (TrackSelector)defaultTrackSelector;
        object = new ExoPlayer.Builder(context);
        context = object.setTrackSelector((TrackSelector)defaultTrackSelector).build();
        context.setVolume(0.0f);
        object = new ef0_1(zm1_02, an1_02);
        object = (Player.Listener)object;
        context.addListener((Player.Listener)object);
        this.b = context;
    }

    public final void c() {
        ExoPlayer exoPlayer = this.b;
        if (exoPlayer != null) {
            float f5 = this.e();
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object > 0) {
                exoPlayer.setVolume(0.0f);
            } else {
                float f7 = f5 - 0.0f;
                Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (object2 == false) {
                    object2 = 1065353216;
                    f5 = 1.0f;
                    exoPlayer.setVolume(f5);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void d(Context context, bn1_0 bn1_02) {
        void var4_7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bn1_02, "artworkAsset");
        StyledPlayerView styledPlayerView = this.a;
        if (styledPlayerView != null) {
            return;
        }
        styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setBackgroundColor(0);
        context = context.getResources().getConfiguration();
        int bl2 = context.orientation;
        int n3 = 2;
        if (bl2 == n3) {
            int n4 = 3;
        } else {
            boolean bl3 = false;
            context = null;
        }
        styledPlayerView.setResizeMode((int)var4_7);
        boolean bl4 = true;
        styledPlayerView.setUseArtwork(bl4);
        bn1_02 = (Drawable)bn1_02.invoke();
        styledPlayerView.setDefaultArtwork((Drawable)bn1_02);
        styledPlayerView.setUseController(bl4);
        styledPlayerView.setControllerAutoShow(false);
        context = (Player)this.b;
        styledPlayerView.setPlayer((Player)context);
        this.a = styledPlayerView;
    }

    public final float e() {
        float f5;
        ExoPlayer exoPlayer = this.b;
        if (exoPlayer != null) {
            f5 = exoPlayer.getVolume();
        } else {
            f5 = 0.0f;
            exoPlayer = null;
        }
        return f5;
    }

    public final void f(Context context, String string2, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(string2, "uriString");
        StyledPlayerView styledPlayerView = this.a;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setShowBuffering(0);
        }
        if ((styledPlayerView = this.b) != null) {
            DefaultBandwidthMeter.Builder builder = new DefaultBandwidthMeter.Builder(context);
            builder = builder.build();
            Intrinsics.checkNotNullExpressionValue(builder, "Builder(ctx).build()");
            String string3 = context.getPackageName();
            string3 = Util.getUserAgent((Context)context, (String)string3);
            Intrinsics.checkNotNullExpressionValue(string3, "getUserAgent(ctx, ctx.packageName)");
            string2 = MediaItem.fromUri((String)string2);
            Intrinsics.checkNotNullExpressionValue(string2, "fromUri(uriString)");
            DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
            string3 = factory.setUserAgent(string3);
            builder = (TransferListener)builder;
            builder = string3.setTransferListener((TransferListener)builder);
            Intrinsics.checkNotNullExpressionValue(builder, "Factory().setUserAgent(u\u2026er(defaultBandwidthMeter)");
            builder = (DataSource.Factory)builder;
            string3 = new DefaultDataSource.Factory(context, (DataSource.Factory)builder);
            string3 = (DataSource.Factory)string3;
            context = new HlsMediaSource.Factory((DataSource.Factory)string3);
            context = context.createMediaSource((MediaItem)string2);
            string2 = "Factory(dataSourceFactor\u2026ateMediaSource(mediaItem)";
            Intrinsics.checkNotNullExpressionValue(context, string2);
            context = (MediaSource)context;
            styledPlayerView.setMediaSource((MediaSource)context);
            styledPlayerView.prepare();
            if (bl2) {
                context = this.a;
                if (context != null) {
                    context.showController();
                }
                styledPlayerView.setPlayWhenReady(false);
                int n3 = 1065353216;
                float f5 = 1.0f;
                styledPlayerView.setVolume(f5);
            } else if (bl3) {
                boolean bl4 = true;
                styledPlayerView.setPlayWhenReady(bl4);
                float f6 = this.e();
                styledPlayerView.setVolume(f6);
            }
        }
    }

    public final void pause() {
        ExoPlayer exoPlayer = this.b;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.b = null;
        this.a = null;
    }

    public final void setPlayWhenReady(boolean bl2) {
        ExoPlayer exoPlayer = this.b;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(bl2);
        }
    }
}

