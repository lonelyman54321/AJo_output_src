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
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.d;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$c;
import androidx.media3.common.g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer$a;
import androidx.media3.exoplayer.ExoPlayer$b;
import androidx.media3.exoplayer.ExoPlayer$d;
import androidx.media3.exoplayer.ExoPlayer$e;
import androidx.media3.exoplayer.ExoPlayer$f;
import androidx.media3.exoplayer.ExoPlayer$g;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.m;
import androidx.media3.exoplayer.m$b;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.s;
import java.util.List;

public interface ExoPlayer
extends f {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000L;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500L;

    public void addAnalyticsListener(oe var1);

    public void addAudioOffloadListener(ExoPlayer$b var1);

    public /* synthetic */ void addListener(f$c var1);

    public /* synthetic */ void addMediaItem(int var1, MediaItem var2);

    public /* synthetic */ void addMediaItem(MediaItem var1);

    public /* synthetic */ void addMediaItems(int var1, List var2);

    public /* synthetic */ void addMediaItems(List var1);

    public void addMediaSource(int var1, j var2);

    public void addMediaSource(j var1);

    public void addMediaSources(int var1, List var2);

    public void addMediaSources(List var1);

    public /* synthetic */ boolean canAdvertiseSession();

    public void clearAuxEffectInfo();

    public void clearCameraMotionListener(jk_0 var1);

    public /* synthetic */ void clearMediaItems();

    public void clearVideoFrameMetadataListener(LB3 var1);

    public /* synthetic */ void clearVideoSurface();

    public /* synthetic */ void clearVideoSurface(Surface var1);

    public /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder var1);

    public /* synthetic */ void clearVideoSurfaceView(SurfaceView var1);

    public /* synthetic */ void clearVideoTextureView(TextureView var1);

    public m createMessage(m$b var1);

    public /* synthetic */ void decreaseDeviceVolume();

    public /* synthetic */ void decreaseDeviceVolume(int var1);

    public je getAnalyticsCollector();

    public /* synthetic */ Looper getApplicationLooper();

    public /* synthetic */ dr_1 getAudioAttributes();

    public ExoPlayer$a getAudioComponent();

    public fj0 getAudioDecoderCounters();

    public d getAudioFormat();

    public int getAudioSessionId();

    public /* synthetic */ f$a getAvailableCommands();

    public /* synthetic */ int getBufferedPercentage();

    public /* synthetic */ long getBufferedPosition();

    public VV getClock();

    public /* synthetic */ long getContentBufferedPosition();

    public /* synthetic */ long getContentDuration();

    public /* synthetic */ long getContentPosition();

    public /* synthetic */ int getCurrentAdGroupIndex();

    public /* synthetic */ int getCurrentAdIndexInAdGroup();

    public /* synthetic */ Ue0 getCurrentCues();

    public /* synthetic */ long getCurrentLiveOffset();

    public /* synthetic */ Object getCurrentManifest();

    public /* synthetic */ MediaItem getCurrentMediaItem();

    public /* synthetic */ int getCurrentMediaItemIndex();

    public /* synthetic */ int getCurrentPeriodIndex();

    public /* synthetic */ long getCurrentPosition();

    public /* synthetic */ g getCurrentTimeline();

    public sp3 getCurrentTrackGroups();

    public Dp3 getCurrentTrackSelections();

    public /* synthetic */ bq3 getCurrentTracks();

    public /* synthetic */ int getCurrentWindowIndex();

    public ExoPlayer$d getDeviceComponent();

    public /* synthetic */ Ip0 getDeviceInfo();

    public /* synthetic */ int getDeviceVolume();

    public /* synthetic */ long getDuration();

    public /* synthetic */ long getMaxSeekToPreviousPosition();

    public /* synthetic */ MediaItem getMediaItemAt(int var1);

    public /* synthetic */ int getMediaItemCount();

    public /* synthetic */ e getMediaMetadata();

    public /* synthetic */ int getNextMediaItemIndex();

    public /* synthetic */ int getNextWindowIndex();

    public boolean getPauseAtEndOfMediaItems();

    public /* synthetic */ boolean getPlayWhenReady();

    public Looper getPlaybackLooper();

    public /* synthetic */ ot2_0 getPlaybackParameters();

    public /* synthetic */ int getPlaybackState();

    public /* synthetic */ int getPlaybackSuppressionReason();

    public ExoPlaybackException getPlayerError();

    public /* synthetic */ e getPlaylistMetadata();

    public ExoPlayer$e getPreloadConfiguration();

    public /* synthetic */ int getPreviousMediaItemIndex();

    public /* synthetic */ int getPreviousWindowIndex();

    public n getRenderer(int var1);

    public int getRendererCount();

    public int getRendererType(int var1);

    public /* synthetic */ int getRepeatMode();

    public /* synthetic */ long getSeekBackIncrement();

    public /* synthetic */ long getSeekForwardIncrement();

    public ex2_0 getSeekParameters();

    public /* synthetic */ boolean getShuffleModeEnabled();

    public boolean getSkipSilenceEnabled();

    public /* synthetic */ A63 getSurfaceSize();

    public ExoPlayer$f getTextComponent();

    public /* synthetic */ long getTotalBufferedDuration();

    public /* synthetic */ Fp3 getTrackSelectionParameters();

    public Gp3 getTrackSelector();

    public int getVideoChangeFrameRateStrategy();

    public ExoPlayer$g getVideoComponent();

    public fj0 getVideoDecoderCounters();

    public d getVideoFormat();

    public int getVideoScalingMode();

    public /* synthetic */ wc3_0 getVideoSize();

    public /* synthetic */ float getVolume();

    public /* synthetic */ boolean hasNext();

    public /* synthetic */ boolean hasNextMediaItem();

    public /* synthetic */ boolean hasNextWindow();

    public /* synthetic */ boolean hasPreviousMediaItem();

    public /* synthetic */ void increaseDeviceVolume();

    public /* synthetic */ void increaseDeviceVolume(int var1);

    public /* synthetic */ boolean isCommandAvailable(int var1);

    public /* synthetic */ boolean isCurrentMediaItemDynamic();

    public /* synthetic */ boolean isCurrentMediaItemLive();

    public /* synthetic */ boolean isCurrentMediaItemSeekable();

    public /* synthetic */ boolean isCurrentWindowDynamic();

    public /* synthetic */ boolean isCurrentWindowLive();

    public /* synthetic */ boolean isCurrentWindowSeekable();

    public /* synthetic */ boolean isDeviceMuted();

    public /* synthetic */ boolean isLoading();

    public /* synthetic */ boolean isPlaying();

    public /* synthetic */ boolean isPlayingAd();

    public boolean isReleased();

    public boolean isSleepingForOffload();

    public boolean isTunnelingEnabled();

    public /* synthetic */ void moveMediaItem(int var1, int var2);

    public /* synthetic */ void moveMediaItems(int var1, int var2, int var3);

    public /* synthetic */ void next();

    public /* synthetic */ void pause();

    public /* synthetic */ void play();

    public /* synthetic */ void prepare();

    public void prepare(j var1);

    public void prepare(j var1, boolean var2, boolean var3);

    public void release();

    public void removeAnalyticsListener(oe var1);

    public void removeAudioOffloadListener(ExoPlayer$b var1);

    public /* synthetic */ void removeListener(f$c var1);

    public /* synthetic */ void removeMediaItem(int var1);

    public /* synthetic */ void removeMediaItems(int var1, int var2);

    public void replaceMediaItem(int var1, MediaItem var2);

    public void replaceMediaItems(int var1, int var2, List var3);

    public /* synthetic */ void seekBack();

    public /* synthetic */ void seekForward();

    public /* synthetic */ void seekTo(int var1, long var2);

    public /* synthetic */ void seekTo(long var1);

    public /* synthetic */ void seekToDefaultPosition();

    public /* synthetic */ void seekToDefaultPosition(int var1);

    public /* synthetic */ void seekToNext();

    public /* synthetic */ void seekToNextMediaItem();

    public /* synthetic */ void seekToNextWindow();

    public /* synthetic */ void seekToPrevious();

    public /* synthetic */ void seekToPreviousMediaItem();

    public /* synthetic */ void seekToPreviousWindow();

    public /* synthetic */ void setAudioAttributes(dr_1 var1, boolean var2);

    public void setAudioSessionId(int var1);

    public void setAuxEffectInfo(dt var1);

    public void setCameraMotionListener(jk_0 var1);

    public /* synthetic */ void setDeviceMuted(boolean var1);

    public /* synthetic */ void setDeviceMuted(boolean var1, int var2);

    public /* synthetic */ void setDeviceVolume(int var1);

    public /* synthetic */ void setDeviceVolume(int var1, int var2);

    public void setForegroundMode(boolean var1);

    public void setHandleAudioBecomingNoisy(boolean var1);

    public void setImageOutput(ImageOutput var1);

    public /* synthetic */ void setMediaItem(MediaItem var1);

    public /* synthetic */ void setMediaItem(MediaItem var1, long var2);

    public /* synthetic */ void setMediaItem(MediaItem var1, boolean var2);

    public /* synthetic */ void setMediaItems(List var1);

    public /* synthetic */ void setMediaItems(List var1, int var2, long var3);

    public /* synthetic */ void setMediaItems(List var1, boolean var2);

    public void setMediaSource(j var1);

    public void setMediaSource(j var1, long var2);

    public void setMediaSource(j var1, boolean var2);

    public void setMediaSources(List var1);

    public void setMediaSources(List var1, int var2, long var3);

    public void setMediaSources(List var1, boolean var2);

    public void setPauseAtEndOfMediaItems(boolean var1);

    public /* synthetic */ void setPlayWhenReady(boolean var1);

    public /* synthetic */ void setPlaybackParameters(ot2_0 var1);

    public /* synthetic */ void setPlaybackSpeed(float var1);

    public /* synthetic */ void setPlaylistMetadata(e var1);

    public void setPreferredAudioDevice(AudioDeviceInfo var1);

    public void setPreloadConfiguration(ExoPlayer$e var1);

    public void setPriority(int var1);

    public void setPriorityTaskManager(PriorityTaskManager var1);

    public /* synthetic */ void setRepeatMode(int var1);

    public void setSeekParameters(ex2_0 var1);

    public /* synthetic */ void setShuffleModeEnabled(boolean var1);

    public void setShuffleOrder(s var1);

    public void setSkipSilenceEnabled(boolean var1);

    public /* synthetic */ void setTrackSelectionParameters(Fp3 var1);

    public void setVideoChangeFrameRateStrategy(int var1);

    public void setVideoEffects(List var1);

    public void setVideoFrameMetadataListener(LB3 var1);

    public void setVideoScalingMode(int var1);

    public /* synthetic */ void setVideoSurface(Surface var1);

    public /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder var1);

    public /* synthetic */ void setVideoSurfaceView(SurfaceView var1);

    public /* synthetic */ void setVideoTextureView(TextureView var1);

    public /* synthetic */ void setVolume(float var1);

    public void setWakeMode(int var1);

    public /* synthetic */ void stop();
}

