/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package android.support.v4.media.session;

import android.os.Build;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21$a;

public final class MediaControllerCompat$PlaybackInfo {
    public static final int PLAYBACK_TYPE_LOCAL = 1;
    public static final int PLAYBACK_TYPE_REMOTE = 2;
    private final AudioAttributesCompat mAudioAttrsCompat;
    private final int mCurrentVolume;
    private final int mMaxVolume;
    private final int mPlaybackType;
    private final int mVolumeControl;

    public MediaControllerCompat$PlaybackInfo(int n3, int n4, int n7, int n8, int n10) {
        AudioAttributesImplApi21$a audioAttributesImplApi21$a;
        int n14 = AudioAttributesCompat.b;
        n14 = Build.VERSION.SDK_INT;
        int n15 = 26;
        if (n14 >= n15) {
        } else {
        }
        audioAttributesImplApi21$a.a.setLegacyStreamType(n4);
        AudioAttributesImpl audioAttributesImpl = audioAttributesImplApi21$a.build();
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat(audioAttributesImpl);
        this(n3, audioAttributesCompat, n7, n8, n10);
    }

    public MediaControllerCompat$PlaybackInfo(int n3, AudioAttributesCompat audioAttributesCompat, int n4, int n7, int n8) {
        this.mPlaybackType = n3;
        this.mAudioAttrsCompat = audioAttributesCompat;
        this.mVolumeControl = n4;
        this.mMaxVolume = n7;
        this.mCurrentVolume = n8;
    }

    public AudioAttributesCompat getAudioAttributes() {
        return this.mAudioAttrsCompat;
    }

    public int getAudioStream() {
        return this.mAudioAttrsCompat.a.a();
    }

    public int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public int getMaxVolume() {
        return this.mMaxVolume;
    }

    public int getPlaybackType() {
        return this.mPlaybackType;
    }

    public int getVolumeControl() {
        return this.mVolumeControl;
    }
}

