/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.view.SurfaceView
 *  android.view.TextureView
 */
package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.e;
import androidx.media3.common.f$a;
import androidx.media3.common.f$c;
import androidx.media3.common.g;
import java.util.List;

public interface f {
    public void addListener(f$c var1);

    public void addMediaItems(int var1, List var2);

    public void clearVideoSurfaceView(SurfaceView var1);

    public void clearVideoTextureView(TextureView var1);

    public Looper getApplicationLooper();

    public f$a getAvailableCommands();

    public long getBufferedPosition();

    public long getContentBufferedPosition();

    public long getContentDuration();

    public long getContentPosition();

    public int getCurrentAdGroupIndex();

    public int getCurrentAdIndexInAdGroup();

    public Ue0 getCurrentCues();

    public MediaItem getCurrentMediaItem();

    public int getCurrentMediaItemIndex();

    public int getCurrentPeriodIndex();

    public long getCurrentPosition();

    public g getCurrentTimeline();

    public bq3 getCurrentTracks();

    public long getDuration();

    public long getMaxSeekToPreviousPosition();

    public e getMediaMetadata();

    public boolean getPlayWhenReady();

    public ot2_0 getPlaybackParameters();

    public int getPlaybackState();

    public int getPlaybackSuppressionReason();

    public PlaybackException getPlayerError();

    public int getRepeatMode();

    public long getSeekBackIncrement();

    public long getSeekForwardIncrement();

    public boolean getShuffleModeEnabled();

    public long getTotalBufferedDuration();

    public Fp3 getTrackSelectionParameters();

    public wc3_0 getVideoSize();

    public boolean hasNextMediaItem();

    public boolean hasPreviousMediaItem();

    public boolean isCommandAvailable(int var1);

    public boolean isCurrentMediaItemDynamic();

    public boolean isCurrentMediaItemLive();

    public boolean isCurrentMediaItemSeekable();

    public boolean isPlaying();

    public boolean isPlayingAd();

    public void moveMediaItems(int var1, int var2, int var3);

    public void pause();

    public void play();

    public void prepare();

    public void release();

    public void removeListener(f$c var1);

    public void removeMediaItems(int var1, int var2);

    public void replaceMediaItems(int var1, int var2, List var3);

    public void seekBack();

    public void seekForward();

    public void seekTo(int var1, long var2);

    public void seekTo(long var1);

    public void seekToDefaultPosition();

    public void seekToNext();

    public void seekToPrevious();

    public void setMediaItems(List var1, int var2, long var3);

    public void setMediaItems(List var1, boolean var2);

    public void setPlayWhenReady(boolean var1);

    public void setPlaybackParameters(ot2_0 var1);

    public void setRepeatMode(int var1);

    public void setShuffleModeEnabled(boolean var1);

    public void setTrackSelectionParameters(Fp3 var1);

    public void setVideoSurfaceView(SurfaceView var1);

    public void setVideoTextureView(TextureView var1);

    public void setVolume(float var1);
}

