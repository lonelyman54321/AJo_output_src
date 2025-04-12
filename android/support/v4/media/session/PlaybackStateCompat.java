/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.PlaybackState
 *  android.media.session.PlaybackState$Builder
 *  android.media.session.PlaybackState$CustomAction
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.SystemClock
 *  android.text.TextUtils
 */
package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat$1;
import android.support.v4.media.session.PlaybackStateCompat$Api21Impl;
import android.support.v4.media.session.PlaybackStateCompat$Api22Impl;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat
implements Parcelable {
    public static final long ACTION_FAST_FORWARD = 64L;
    public static final long ACTION_PAUSE = 2L;
    public static final long ACTION_PLAY = 4L;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
    public static final long ACTION_PLAY_FROM_URI = 8192L;
    public static final long ACTION_PLAY_PAUSE = 512L;
    public static final long ACTION_PREPARE = 16384L;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768L;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536L;
    public static final long ACTION_PREPARE_FROM_URI = 131072L;
    public static final long ACTION_REWIND = 8L;
    public static final long ACTION_SEEK_TO = 256L;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 0x100000L;
    public static final long ACTION_SET_PLAYBACK_SPEED = 0x400000L;
    public static final long ACTION_SET_RATING = 128L;
    public static final long ACTION_SET_REPEAT_MODE = 262144L;
    public static final long ACTION_SET_SHUFFLE_MODE = 0x200000L;
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288L;
    public static final long ACTION_SKIP_TO_NEXT = 32L;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
    public static final long ACTION_STOP = 1L;
    public static final Parcelable.Creator CREATOR;
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    private static final int KEYCODE_MEDIA_PAUSE = 127;
    private static final int KEYCODE_MEDIA_PLAY = 126;
    public static final long PLAYBACK_POSITION_UNKNOWN = 255L;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = 255;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = 255;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    final long mActions;
    final long mActiveItemId;
    final long mBufferedPosition;
    List mCustomActions;
    final int mErrorCode;
    final CharSequence mErrorMessage;
    final Bundle mExtras;
    final long mPosition;
    final float mSpeed;
    final int mState;
    private PlaybackState mStateFwk;
    final long mUpdateTime;

    static {
        PlaybackStateCompat$1 playbackStateCompat$1 = new PlaybackStateCompat$1();
        CREATOR = playbackStateCompat$1;
    }

    public PlaybackStateCompat(int n3, long l2, long l3, float f5, long l4, int n4, CharSequence charSequence, long l7, List list, long l8, Bundle bundle) {
        this.mState = n3;
        this.mPosition = l2;
        this.mBufferedPosition = l3;
        this.mSpeed = f5;
        this.mActions = l4;
        this.mErrorCode = n4;
        Bundle bundle2 = charSequence;
        this.mErrorMessage = charSequence;
        this.mUpdateTime = l7;
        this.mCustomActions = bundle2 = new ArrayList(list);
        this.mActiveItemId = l8;
        bundle2 = bundle;
        this.mExtras = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        int n3;
        float f5;
        long l2;
        int n4;
        this.mState = n4 = parcel.readInt();
        this.mPosition = l2 = parcel.readLong();
        this.mSpeed = f5 = parcel.readFloat();
        this.mUpdateTime = l2 = parcel.readLong();
        this.mBufferedPosition = l2 = parcel.readLong();
        this.mActions = l2 = parcel.readLong();
        Object object = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mErrorMessage = object;
        object = PlaybackStateCompat$CustomAction.CREATOR;
        this.mCustomActions = object = parcel.createTypedArrayList((Parcelable.Creator)object);
        this.mActiveItemId = l2 = parcel.readLong();
        object = MediaSessionCompat.class.getClassLoader();
        object = parcel.readBundle((ClassLoader)object);
        this.mExtras = object;
        this.mErrorCode = n3 = parcel.readInt();
    }

    public static PlaybackStateCompat fromPlaybackState(Object object) {
        Object object2 = null;
        if (object != null) {
            ArrayList<PlaybackStateCompat$CustomAction> arrayList;
            Object object3 = object;
            object3 = (PlaybackState)object;
            Object object4 = PlaybackStateCompat$Api21Impl.getCustomActions((PlaybackState)object3);
            if (object4 != null) {
                int n3 = object4.size();
                ArrayList<PlaybackStateCompat$CustomAction> arrayList2 = new ArrayList<PlaybackStateCompat$CustomAction>(n3);
                object4 = object4.iterator();
                while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    PlaybackStateCompat$CustomAction playbackStateCompat$CustomAction = PlaybackStateCompat$CustomAction.fromCustomAction(object4.next());
                    arrayList2.add(playbackStateCompat$CustomAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 22;
            if (n4 >= n7) {
                object2 = PlaybackStateCompat$Api22Impl.getExtras((PlaybackState)object3);
                MediaSessionCompat.ensureClassLoader(object2);
            }
            Bundle bundle = object2;
            int n8 = PlaybackStateCompat$Api21Impl.getState((PlaybackState)object3);
            long l2 = PlaybackStateCompat$Api21Impl.getPosition((PlaybackState)object3);
            long l3 = PlaybackStateCompat$Api21Impl.getBufferedPosition((PlaybackState)object3);
            float f5 = PlaybackStateCompat$Api21Impl.getPlaybackSpeed((PlaybackState)object3);
            long l4 = PlaybackStateCompat$Api21Impl.getActions((PlaybackState)object3);
            CharSequence charSequence = PlaybackStateCompat$Api21Impl.getErrorMessage((PlaybackState)object3);
            long l7 = PlaybackStateCompat$Api21Impl.getLastPositionUpdateTime((PlaybackState)object3);
            long l8 = PlaybackStateCompat$Api21Impl.getActiveQueueItemId((PlaybackState)object3);
            object2 = new PlaybackStateCompat(n8, l2, l3, f5, l4, 0, charSequence, l7, arrayList, l8, bundle);
            object2.mStateFwk = object3;
        }
        return object2;
    }

    public static int toKeyCode(long l2) {
        long l3 = 4;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return 126;
        }
        l3 = 2;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            return 127;
        }
        l3 = 32;
        long l8 = l2 - l3;
        object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return 87;
        }
        l3 = 16;
        long l12 = l2 - l3;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object == false) {
            return 88;
        }
        l3 = 1L;
        long l14 = l2 - l3;
        object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object == false) {
            return 86;
        }
        l3 = 64;
        long l15 = l2 - l3;
        object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object == false) {
            return 90;
        }
        l3 = 8;
        long l16 = l2 - l3;
        object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object == false) {
            return 89;
        }
        l3 = 512L;
        long l17 = l2 - l3;
        object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object == false) {
            return 85;
        }
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public long getActions() {
        return this.mActions;
    }

    public long getActiveQueueItemId() {
        return this.mActiveItemId;
    }

    public long getBufferedPosition() {
        return this.mBufferedPosition;
    }

    public long getCurrentPosition(Long l2) {
        long l3;
        long l4 = this.mPosition;
        float f5 = this.mSpeed;
        if (l2 != null) {
            l3 = l2;
        } else {
            l3 = SystemClock.elapsedRealtime();
            long l7 = this.mUpdateTime;
            l3 -= l7;
        }
        float f6 = l3;
        long l8 = (long)(f5 * f6);
        return Math.max(0L, l4 += l8);
    }

    public List getCustomActions() {
        return this.mCustomActions;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public CharSequence getErrorMessage() {
        return this.mErrorMessage;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public long getLastPositionUpdateTime() {
        return this.mUpdateTime;
    }

    public float getPlaybackSpeed() {
        return this.mSpeed;
    }

    public Object getPlaybackState() {
        PlaybackState playbackState = this.mStateFwk;
        if (playbackState == null) {
            playbackState = PlaybackStateCompat$Api21Impl.createBuilder();
            int n3 = this.mState;
            long l2 = this.mPosition;
            float f5 = this.mSpeed;
            long l3 = this.mUpdateTime;
            Object object = playbackState;
            PlaybackStateCompat$Api21Impl.setState((PlaybackState.Builder)playbackState, n3, l2, f5, l3);
            long l4 = this.mBufferedPosition;
            PlaybackStateCompat$Api21Impl.setBufferedPosition((PlaybackState.Builder)playbackState, l4);
            l4 = this.mActions;
            PlaybackStateCompat$Api21Impl.setActions((PlaybackState.Builder)playbackState, l4);
            object = this.mErrorMessage;
            PlaybackStateCompat$Api21Impl.setErrorMessage((PlaybackState.Builder)playbackState, (CharSequence)object);
            object = this.mCustomActions.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction)((PlaybackStateCompat$CustomAction)object.next()).getCustomAction();
                PlaybackStateCompat$Api21Impl.addCustomAction((PlaybackState.Builder)playbackState, customAction);
            }
            l4 = this.mActiveItemId;
            PlaybackStateCompat$Api21Impl.setActiveQueueItemId((PlaybackState.Builder)playbackState, l4);
            int n4 = Build.VERSION.SDK_INT;
            n3 = 22;
            if (n4 >= n3) {
                object = this.mExtras;
                PlaybackStateCompat$Api22Impl.setExtras((PlaybackState.Builder)playbackState, (Bundle)object);
            }
            this.mStateFwk = playbackState = PlaybackStateCompat$Api21Impl.build((PlaybackState.Builder)playbackState);
        }
        return this.mStateFwk;
    }

    public long getPosition() {
        return this.mPosition;
    }

    public int getState() {
        return this.mState;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {state=");
        int n3 = this.mState;
        stringBuilder.append(n3);
        stringBuilder.append(", position=");
        long l2 = this.mPosition;
        stringBuilder.append(l2);
        stringBuilder.append(", buffered position=");
        l2 = this.mBufferedPosition;
        stringBuilder.append(l2);
        stringBuilder.append(", speed=");
        float f5 = this.mSpeed;
        stringBuilder.append(f5);
        stringBuilder.append(", updated=");
        l2 = this.mUpdateTime;
        stringBuilder.append(l2);
        stringBuilder.append(", actions=");
        l2 = this.mActions;
        stringBuilder.append(l2);
        stringBuilder.append(", error code=");
        n3 = this.mErrorCode;
        stringBuilder.append(n3);
        stringBuilder.append(", error message=");
        Object object = this.mErrorMessage;
        stringBuilder.append((CharSequence)object);
        stringBuilder.append(", custom actions=");
        object = this.mCustomActions;
        stringBuilder.append(object);
        stringBuilder.append(", active item id=");
        l2 = this.mActiveItemId;
        return jl0_0.b(stringBuilder, l2, "}");
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.mState;
        parcel.writeInt(n4);
        long l2 = this.mPosition;
        parcel.writeLong(l2);
        float f5 = this.mSpeed;
        parcel.writeFloat(f5);
        l2 = this.mUpdateTime;
        parcel.writeLong(l2);
        l2 = this.mBufferedPosition;
        parcel.writeLong(l2);
        l2 = this.mActions;
        parcel.writeLong(l2);
        TextUtils.writeToParcel((CharSequence)this.mErrorMessage, (Parcel)parcel, (int)n3);
        List list = this.mCustomActions;
        parcel.writeTypedList(list);
        l2 = this.mActiveItemId;
        parcel.writeLong(l2);
        list = this.mExtras;
        parcel.writeBundle((Bundle)list);
        n3 = this.mErrorCode;
        parcel.writeInt(n3);
    }
}

