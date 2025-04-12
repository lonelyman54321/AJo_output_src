/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  com.google.android.exoplayer2.ExoPlayer
 *  com.google.android.exoplayer2.ExoPlayer$Builder
 *  com.google.android.exoplayer2.MediaItem
 *  com.google.android.exoplayer2.Player
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
 *  com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory
 *  com.google.android.exoplayer2.trackselection.DefaultTrackSelector
 *  com.google.android.exoplayer2.trackselection.ExoTrackSelection$Factory
 *  com.google.android.exoplayer2.trackselection.TrackSelector
 *  com.google.android.exoplayer2.ui.StyledPlayerView
 *  com.google.android.exoplayer2.upstream.BandwidthMeter
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$Builder
 *  com.google.android.exoplayer2.upstream.DefaultDataSource$Factory
 *  com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
 *  com.google.android.exoplayer2.upstream.TransferListener
 *  com.google.android.exoplayer2.util.Util
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.R$drawable;
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
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GF0
 */
public final class gf0_1
implements tg1_0 {
    public ExoPlayer a;
    public StyledPlayerView b;
    public ViewGroup.LayoutParams c;
    public FrameLayout.LayoutParams d;
    public long e;

    public final View a() {
        StyledPlayerView styledPlayerView = this.b;
        Intrinsics.checkNotNull(styledPlayerView);
        return (View)styledPlayerView;
    }

    public final void b() {
        ExoPlayer exoPlayer = this.a;
        if (exoPlayer != null) {
            long l2;
            Intrinsics.checkNotNull(exoPlayer);
            this.e = l2 = exoPlayer.getCurrentPosition();
        }
    }

    public final void c(Context context, String string2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "url");
        ExoPlayer exoPlayer = this.a;
        if (exoPlayer != null) {
            return;
        }
        exoPlayer = new DefaultBandwidthMeter.Builder(context);
        exoPlayer = exoPlayer.build();
        Intrinsics.checkNotNullExpressionValue(exoPlayer, "Builder(context).build()");
        exoPlayer = (BandwidthMeter)exoPlayer;
        Object object = new AdaptiveTrackSelection.Factory();
        object = (ExoTrackSelection.Factory)object;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context, (ExoTrackSelection.Factory)object);
        defaultTrackSelector = (TrackSelector)defaultTrackSelector;
        object = context.getPackageName();
        object = Util.getUserAgent((Context)context, (String)object);
        Intrinsics.checkNotNullExpressionValue(object, "getUserAgent(context, context.packageName)");
        exoPlayer = exoPlayer.getTransferListener();
        DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
        exoPlayer = factory.setUserAgent((String)object).setTransferListener((TransferListener)exoPlayer);
        Intrinsics.checkNotNullExpressionValue(exoPlayer, "Factory().setUserAgent(u\u2026ransferListener(listener)");
        exoPlayer = (DataSource.Factory)exoPlayer;
        object = new DefaultDataSource.Factory(context, (DataSource.Factory)exoPlayer);
        object = (DataSource.Factory)object;
        string2 = MediaItem.fromUri((String)string2);
        Intrinsics.checkNotNullExpressionValue(string2, "fromUri(url)");
        exoPlayer = new HlsMediaSource.Factory((DataSource.Factory)object);
        string2 = exoPlayer.createMediaSource((MediaItem)string2);
        Intrinsics.checkNotNullExpressionValue(string2, "Factory(dataSourceFactor\u2026ateMediaSource(mediaItem)");
        exoPlayer = new ExoPlayer.Builder(context);
        context = exoPlayer.setTrackSelector((TrackSelector)defaultTrackSelector).build();
        string2 = (MediaSource)string2;
        context.setMediaSource((MediaSource)string2);
        context.prepare();
        context.setRepeatMode(1);
        long l2 = this.e;
        context.seekTo(l2);
        this.a = context;
    }

    public final void d(boolean bl2) {
        if (bl2) {
            StyledPlayerView styledPlayerView = this.b;
            Intrinsics.checkNotNull(styledPlayerView);
            styledPlayerView = styledPlayerView.getLayoutParams();
            this.c = styledPlayerView;
            styledPlayerView = this.b;
            Intrinsics.checkNotNull(styledPlayerView);
            FrameLayout.LayoutParams layoutParams = this.d;
            styledPlayerView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        } else {
            StyledPlayerView styledPlayerView = this.b;
            Intrinsics.checkNotNull(styledPlayerView);
            ViewGroup.LayoutParams layoutParams = this.c;
            styledPlayerView.setLayoutParams(layoutParams);
        }
    }

    public final void e(Context context, boolean bl2) {
        float f5;
        float f6;
        int n3;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        StyledPlayerView styledPlayerView = this.b;
        if (styledPlayerView != null) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, string2);
        if (bl2) {
            n3 = 1137442816;
            f6 = 408.0f;
        } else {
            n3 = 1131413504;
            f6 = 240.0f;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean bl3 = true;
        f6 = TypedValue.applyDimension((int)(bl3 ? 1 : 0), (float)f6, (DisplayMetrics)displayMetrics);
        n3 = (int)f6;
        Intrinsics.checkNotNullParameter(context, string2);
        if (bl2) {
            int n4 = 1133871104;
            f5 = 299.0f;
        } else {
            int n7 = 1124466688;
            f5 = 134.0f;
        }
        string2 = context.getResources().getDisplayMetrics();
        int n8 = (int)TypedValue.applyDimension((int)(bl3 ? 1 : 0), (float)f5, (DisplayMetrics)string2);
        string2 = new StyledPlayerView(context);
        displayMetrics = new FrameLayout.LayoutParams(n3, n8);
        this.c = displayMetrics;
        string2.setLayoutParams((ViewGroup.LayoutParams)displayMetrics);
        string2.setShowBuffering((int)(bl3 ? 1 : 0));
        string2.setUseArtwork(bl3);
        string2.setControllerAutoShow(false);
        context = context.getResources();
        int n10 = R$drawable.ct_audio;
        context = WK2.b((Resources)context, n10);
        string2.setDefaultArtwork((Drawable)context);
        this.b = string2;
    }

    public final void pause() {
        ExoPlayer exoPlayer = this.a;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
            exoPlayer = null;
            this.a = null;
        }
    }

    public final void play() {
        boolean bl2;
        StyledPlayerView styledPlayerView = this.b;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            bl2 = false;
            styledPlayerView.setVisibility(0);
            Player player = (Player)this.a;
            styledPlayerView.setPlayer(player);
        }
        if ((styledPlayerView = this.a) != null) {
            bl2 = true;
            styledPlayerView.setPlayWhenReady(bl2);
        }
    }
}

