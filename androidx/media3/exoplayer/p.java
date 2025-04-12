/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  android.os.Looper
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceView
 *  android.view.TextureView
 */
package androidx.media3.exoplayer;

import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.b;
import androidx.media3.common.d;
import androidx.media3.common.f$a;
import androidx.media3.common.f$c;
import androidx.media3.common.g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayer$a;
import androidx.media3.exoplayer.ExoPlayer$b;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.ExoPlayer$d;
import androidx.media3.exoplayer.ExoPlayer$e;
import androidx.media3.exoplayer.ExoPlayer$f;
import androidx.media3.exoplayer.ExoPlayer$g;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.m;
import androidx.media3.exoplayer.m$b;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.s;
import java.util.List;

public final class p
extends b
implements ExoPlayer,
ExoPlayer$a,
ExoPlayer$g,
ExoPlayer$f,
ExoPlayer$d {
    public final e b;
    public final f40 c;

    public p(ExoPlayer$c exoPlayer$c) {
        e e2;
        f40 f402;
        this.c = f402 = new f40();
        try {
            e2 = new e(exoPlayer$c, this);
        }
        catch (Throwable throwable) {
            this.c.e();
            throw throwable;
        }
        this.b = e2;
        f402.e();
    }

    public final void addAnalyticsListener(oe oe2) {
        this.e();
        this.b.addAnalyticsListener(oe2);
    }

    public final void addAudioOffloadListener(ExoPlayer$b exoPlayer$b) {
        this.e();
        this.b.addAudioOffloadListener(exoPlayer$b);
    }

    public final void addListener(f$c f$c) {
        this.e();
        this.b.addListener(f$c);
    }

    public final void addMediaItems(int n3, List list) {
        this.e();
        this.b.addMediaItems(n3, list);
    }

    public final void addMediaSource(int n3, j j3) {
        this.e();
        this.b.addMediaSource(n3, j3);
    }

    public final void addMediaSource(j j3) {
        this.e();
        this.b.addMediaSource(j3);
    }

    public final void addMediaSources(int n3, List list) {
        this.e();
        this.b.addMediaSources(n3, list);
    }

    public final void addMediaSources(List list) {
        this.e();
        this.b.addMediaSources(list);
    }

    public final void b(int n3, int n4, long l2, boolean bl2) {
        this.e();
        this.b.b(n3, n4, l2, bl2);
    }

    public final void clearAuxEffectInfo() {
        this.e();
        this.b.clearAuxEffectInfo();
    }

    public final void clearCameraMotionListener(jk_0 jk_02) {
        this.e();
        this.b.clearCameraMotionListener(jk_02);
    }

    public final void clearVideoFrameMetadataListener(LB3 lB3) {
        this.e();
        this.b.clearVideoFrameMetadataListener(lB3);
    }

    public final void clearVideoSurface() {
        this.e();
        this.b.clearVideoSurface();
    }

    public final void clearVideoSurface(Surface surface) {
        this.e();
        this.b.clearVideoSurface(surface);
    }

    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.e();
        this.b.clearVideoSurfaceHolder(surfaceHolder);
    }

    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        this.e();
        this.b.clearVideoSurfaceView(surfaceView);
    }

    public final void clearVideoTextureView(TextureView textureView) {
        this.e();
        this.b.clearVideoTextureView(textureView);
    }

    public final m createMessage(m$b m$b) {
        this.e();
        return this.b.createMessage(m$b);
    }

    public final void decreaseDeviceVolume() {
        this.e();
        this.b.E();
    }

    public final void decreaseDeviceVolume(int n3) {
        this.e();
        this.b.E();
    }

    public final void e() {
        this.c.b();
    }

    public final je getAnalyticsCollector() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.r;
    }

    public final Looper getApplicationLooper() {
        this.e();
        return this.b.s;
    }

    public final dr_1 getAudioAttributes() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.g0;
    }

    public final ExoPlayer$a getAudioComponent() {
        return this;
    }

    public final fj0 getAudioDecoderCounters() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.e0;
    }

    public final d getAudioFormat() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.T;
    }

    public final int getAudioSessionId() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.f0;
    }

    public final f$a getAvailableCommands() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.P;
    }

    public final long getBufferedPosition() {
        this.e();
        return this.b.getBufferedPosition();
    }

    public final VV getClock() {
        this.e();
        return this.b.x;
    }

    public final long getContentBufferedPosition() {
        this.e();
        return this.b.getContentBufferedPosition();
    }

    public final long getContentPosition() {
        this.e();
        return this.b.getContentPosition();
    }

    public final int getCurrentAdGroupIndex() {
        this.e();
        return this.b.getCurrentAdGroupIndex();
    }

    public final int getCurrentAdIndexInAdGroup() {
        this.e();
        return this.b.getCurrentAdIndexInAdGroup();
    }

    public final Ue0 getCurrentCues() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.j0;
    }

    public final int getCurrentMediaItemIndex() {
        this.e();
        return this.b.getCurrentMediaItemIndex();
    }

    public final int getCurrentPeriodIndex() {
        this.e();
        return this.b.getCurrentPeriodIndex();
    }

    public final long getCurrentPosition() {
        this.e();
        return this.b.getCurrentPosition();
    }

    public final g getCurrentTimeline() {
        this.e();
        return this.b.getCurrentTimeline();
    }

    public final sp3 getCurrentTrackGroups() {
        this.e();
        return this.b.getCurrentTrackGroups();
    }

    public final Dp3 getCurrentTrackSelections() {
        this.e();
        return this.b.getCurrentTrackSelections();
    }

    public final bq3 getCurrentTracks() {
        this.e();
        return this.b.getCurrentTracks();
    }

    public final ExoPlayer$d getDeviceComponent() {
        return this;
    }

    public final Ip0 getDeviceInfo() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.r0;
    }

    public final int getDeviceVolume() {
        this.e();
        this.b.E();
        return 0;
    }

    public final long getDuration() {
        this.e();
        return this.b.getDuration();
    }

    public final long getMaxSeekToPreviousPosition() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.w;
    }

    public final androidx.media3.common.e getMediaMetadata() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.Q;
    }

    public final boolean getPauseAtEndOfMediaItems() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.O;
    }

    public final boolean getPlayWhenReady() {
        this.e();
        return this.b.getPlayWhenReady();
    }

    public final Looper getPlaybackLooper() {
        this.e();
        return this.b.k.k;
    }

    public final ot2_0 getPlaybackParameters() {
        this.e();
        return this.b.getPlaybackParameters();
    }

    public final int getPlaybackState() {
        this.e();
        return this.b.getPlaybackState();
    }

    public final int getPlaybackSuppressionReason() {
        this.e();
        return this.b.getPlaybackSuppressionReason();
    }

    public final ExoPlaybackException getPlayerError() {
        this.e();
        return this.b.getPlayerError();
    }

    public final androidx.media3.common.e getPlaylistMetadata() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.R;
    }

    public final ExoPlayer$e getPreloadConfiguration() {
        this.e();
        return this.b.N;
    }

    public final n getRenderer(int n3) {
        this.e();
        return this.b.getRenderer(n3);
    }

    public final int getRendererCount() {
        this.e();
        return this.b.getRendererCount();
    }

    public final int getRendererType(int n3) {
        this.e();
        return this.b.getRendererType(n3);
    }

    public final int getRepeatMode() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.F;
    }

    public final long getSeekBackIncrement() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.u;
    }

    public final long getSeekForwardIncrement() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.v;
    }

    public final ex2_0 getSeekParameters() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.L;
    }

    public final boolean getShuffleModeEnabled() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.G;
    }

    public final boolean getSkipSilenceEnabled() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.i0;
    }

    public final A63 getSurfaceSize() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.c0;
    }

    public final ExoPlayer$f getTextComponent() {
        return this;
    }

    public final long getTotalBufferedDuration() {
        this.e();
        return this.b.getTotalBufferedDuration();
    }

    public final Fp3 getTrackSelectionParameters() {
        this.e();
        return this.b.getTrackSelectionParameters();
    }

    public final Gp3 getTrackSelector() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.h;
    }

    public final int getVideoChangeFrameRateStrategy() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.b0;
    }

    public final ExoPlayer$g getVideoComponent() {
        return this;
    }

    public final fj0 getVideoDecoderCounters() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.d0;
    }

    public final d getVideoFormat() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.S;
    }

    public final int getVideoScalingMode() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.a0;
    }

    public final wc3_0 getVideoSize() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.s0;
    }

    public final float getVolume() {
        this.e();
        e e2 = this.b;
        e2.E();
        return e2.h0;
    }

    public final void increaseDeviceVolume() {
        this.e();
        this.b.E();
    }

    public final void increaseDeviceVolume(int n3) {
        this.e();
        this.b.E();
    }

    public final boolean isDeviceMuted() {
        this.e();
        this.b.E();
        return false;
    }

    public final boolean isLoading() {
        this.e();
        return this.b.isLoading();
    }

    public final boolean isPlayingAd() {
        this.e();
        return this.b.isPlayingAd();
    }

    public final boolean isReleased() {
        e e2 = this.b;
        e2.E();
        return e2.q0;
    }

    public final boolean isSleepingForOffload() {
        this.e();
        return this.b.isSleepingForOffload();
    }

    public final boolean isTunnelingEnabled() {
        this.e();
        return this.b.isTunnelingEnabled();
    }

    public final void moveMediaItems(int n3, int n4, int n7) {
        this.e();
        this.b.moveMediaItems(n3, n4, n7);
    }

    public final void prepare() {
        this.e();
        this.b.prepare();
    }

    public final void prepare(j j3) {
        this.e();
        this.b.prepare(j3);
    }

    public final void prepare(j j3, boolean bl2, boolean bl3) {
        this.e();
        this.b.prepare(j3, bl2, bl3);
    }

    public final void release() {
        this.e();
        this.b.release();
    }

    public final void removeAnalyticsListener(oe oe2) {
        this.e();
        this.b.removeAnalyticsListener(oe2);
    }

    public final void removeAudioOffloadListener(ExoPlayer$b exoPlayer$b) {
        this.e();
        this.b.removeAudioOffloadListener(exoPlayer$b);
    }

    public final void removeListener(f$c f$c) {
        this.e();
        this.b.removeListener(f$c);
    }

    public final void removeMediaItems(int n3, int n4) {
        this.e();
        this.b.removeMediaItems(n3, n4);
    }

    public final void replaceMediaItems(int n3, int n4, List list) {
        this.e();
        this.b.replaceMediaItems(n3, n4, list);
    }

    public final void setAudioAttributes(dr_1 dr_12, boolean bl2) {
        this.e();
        this.b.setAudioAttributes(dr_12, bl2);
    }

    public final void setAudioSessionId(int n3) {
        this.e();
        this.b.setAudioSessionId(n3);
    }

    public final void setAuxEffectInfo(dt dt2) {
        this.e();
        this.b.setAuxEffectInfo(dt2);
    }

    public final void setCameraMotionListener(jk_0 jk_02) {
        this.e();
        this.b.setCameraMotionListener(jk_02);
    }

    public final void setDeviceMuted(boolean bl2) {
        this.e();
        this.b.E();
    }

    public final void setDeviceMuted(boolean bl2, int n3) {
        this.e();
        this.b.E();
    }

    public final void setDeviceVolume(int n3) {
        this.e();
        this.b.E();
    }

    public final void setDeviceVolume(int n3, int n4) {
        this.e();
        this.b.E();
    }

    public final void setForegroundMode(boolean bl2) {
        this.e();
        this.b.setForegroundMode(bl2);
    }

    public final void setHandleAudioBecomingNoisy(boolean bl2) {
        this.e();
        this.b.setHandleAudioBecomingNoisy(bl2);
    }

    public final void setImageOutput(ImageOutput imageOutput) {
        this.e();
        this.b.setImageOutput(imageOutput);
    }

    public final void setMediaItems(List list, int n3, long l2) {
        this.e();
        this.b.setMediaItems(list, n3, l2);
    }

    public final void setMediaItems(List list, boolean bl2) {
        this.e();
        this.b.setMediaItems(list, bl2);
    }

    public final void setMediaSource(j j3) {
        this.e();
        this.b.setMediaSource(j3);
    }

    public final void setMediaSource(j j3, long l2) {
        this.e();
        this.b.setMediaSource(j3, l2);
    }

    public final void setMediaSource(j j3, boolean bl2) {
        this.e();
        this.b.setMediaSource(j3, bl2);
    }

    public final void setMediaSources(List list) {
        this.e();
        this.b.setMediaSources(list);
    }

    public final void setMediaSources(List list, int n3, long l2) {
        this.e();
        this.b.setMediaSources(list, n3, l2);
    }

    public final void setMediaSources(List list, boolean bl2) {
        this.e();
        this.b.setMediaSources(list, bl2);
    }

    public final void setPauseAtEndOfMediaItems(boolean bl2) {
        this.e();
        this.b.setPauseAtEndOfMediaItems(bl2);
    }

    public final void setPlayWhenReady(boolean bl2) {
        this.e();
        this.b.setPlayWhenReady(bl2);
    }

    public final void setPlaybackParameters(ot2_0 ot2_02) {
        this.e();
        this.b.setPlaybackParameters(ot2_02);
    }

    public final void setPlaylistMetadata(androidx.media3.common.e e2) {
        this.e();
        this.b.setPlaylistMetadata(e2);
    }

    public final void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        this.e();
        this.b.setPreferredAudioDevice(audioDeviceInfo);
    }

    public final void setPreloadConfiguration(ExoPlayer$e exoPlayer$e) {
        this.e();
        this.b.setPreloadConfiguration(exoPlayer$e);
    }

    public final void setPriority(int n3) {
        this.e();
        this.b.setPriority(n3);
    }

    public final void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        this.e();
        this.b.setPriorityTaskManager(priorityTaskManager);
    }

    public final void setRepeatMode(int n3) {
        this.e();
        this.b.setRepeatMode(n3);
    }

    public final void setSeekParameters(ex2_0 ex2_02) {
        this.e();
        this.b.setSeekParameters(ex2_02);
    }

    public final void setShuffleModeEnabled(boolean bl2) {
        this.e();
        this.b.setShuffleModeEnabled(bl2);
    }

    public final void setShuffleOrder(s s7) {
        this.e();
        this.b.setShuffleOrder(s7);
    }

    public final void setSkipSilenceEnabled(boolean bl2) {
        this.e();
        this.b.setSkipSilenceEnabled(bl2);
    }

    public final void setTrackSelectionParameters(Fp3 fp3) {
        this.e();
        this.b.setTrackSelectionParameters(fp3);
    }

    public final void setVideoChangeFrameRateStrategy(int n3) {
        this.e();
        this.b.setVideoChangeFrameRateStrategy(n3);
    }

    public final void setVideoEffects(List list) {
        this.e();
        this.b.setVideoEffects(list);
    }

    public final void setVideoFrameMetadataListener(LB3 lB3) {
        this.e();
        this.b.setVideoFrameMetadataListener(lB3);
    }

    public final void setVideoScalingMode(int n3) {
        this.e();
        this.b.setVideoScalingMode(n3);
    }

    public final void setVideoSurface(Surface surface) {
        this.e();
        this.b.setVideoSurface(surface);
    }

    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.e();
        this.b.setVideoSurfaceHolder(surfaceHolder);
    }

    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        this.e();
        this.b.setVideoSurfaceView(surfaceView);
    }

    public final void setVideoTextureView(TextureView textureView) {
        this.e();
        this.b.setVideoTextureView(textureView);
    }

    public final void setVolume(float f5) {
        this.e();
        this.b.setVolume(f5);
    }

    public final void setWakeMode(int n3) {
        this.e();
        this.b.setWakeMode(n3);
    }

    public final void stop() {
        this.e();
        this.b.stop();
    }
}

