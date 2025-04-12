/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.SystemClock
 */
package android.support.v4.media.session;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat$Builder {
    private long mActions;
    private long mActiveItemId;
    private long mBufferedPosition;
    private final List mCustomActions;
    private int mErrorCode;
    private CharSequence mErrorMessage;
    private Bundle mExtras;
    private long mPosition;
    private float mRate;
    private int mState;
    private long mUpdateTime;

    public PlaybackStateCompat$Builder() {
        ArrayList arrayList;
        this.mCustomActions = arrayList = new ArrayList();
        this.mActiveItemId = -1;
    }

    public PlaybackStateCompat$Builder(PlaybackStateCompat playbackStateCompat) {
        long l2;
        float f5;
        long l3;
        int n3;
        ArrayList arrayList;
        this.mCustomActions = arrayList = new ArrayList();
        this.mActiveItemId = -1;
        this.mState = n3 = playbackStateCompat.mState;
        this.mPosition = l3 = playbackStateCompat.mPosition;
        this.mRate = f5 = playbackStateCompat.mSpeed;
        this.mUpdateTime = l3 = playbackStateCompat.mUpdateTime;
        this.mBufferedPosition = l3 = playbackStateCompat.mBufferedPosition;
        this.mActions = l3 = playbackStateCompat.mActions;
        this.mErrorCode = n3 = playbackStateCompat.mErrorCode;
        Object object = playbackStateCompat.mErrorMessage;
        this.mErrorMessage = object;
        object = playbackStateCompat.mCustomActions;
        if (object != null) {
            arrayList.addAll(object);
        }
        this.mActiveItemId = l2 = playbackStateCompat.mActiveItemId;
        playbackStateCompat = playbackStateCompat.mExtras;
        this.mExtras = playbackStateCompat;
    }

    public PlaybackStateCompat$Builder addCustomAction(PlaybackStateCompat$CustomAction object) {
        if (object != null) {
            this.mCustomActions.add(object);
            return this;
        }
        object = new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        throw object;
    }

    public PlaybackStateCompat$Builder addCustomAction(String string2, String string3, int n3) {
        PlaybackStateCompat$CustomAction playbackStateCompat$CustomAction = new PlaybackStateCompat$CustomAction(string2, string3, n3, null);
        return this.addCustomAction(playbackStateCompat$CustomAction);
    }

    public PlaybackStateCompat build() {
        int n3 = this.mState;
        long l2 = this.mPosition;
        long l3 = this.mBufferedPosition;
        float f5 = this.mRate;
        long l4 = this.mActions;
        int n4 = this.mErrorCode;
        CharSequence charSequence = this.mErrorMessage;
        long l7 = this.mUpdateTime;
        List list = this.mCustomActions;
        long l8 = this.mActiveItemId;
        Bundle bundle = this.mExtras;
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(n3, l2, l3, f5, l4, n4, charSequence, l7, list, l8, bundle);
        return playbackStateCompat;
    }

    public PlaybackStateCompat$Builder setActions(long l2) {
        this.mActions = l2;
        return this;
    }

    public PlaybackStateCompat$Builder setActiveQueueItemId(long l2) {
        this.mActiveItemId = l2;
        return this;
    }

    public PlaybackStateCompat$Builder setBufferedPosition(long l2) {
        this.mBufferedPosition = l2;
        return this;
    }

    public PlaybackStateCompat$Builder setErrorMessage(int n3, CharSequence charSequence) {
        this.mErrorCode = n3;
        this.mErrorMessage = charSequence;
        return this;
    }

    public PlaybackStateCompat$Builder setErrorMessage(CharSequence charSequence) {
        this.mErrorMessage = charSequence;
        return this;
    }

    public PlaybackStateCompat$Builder setExtras(Bundle bundle) {
        this.mExtras = bundle;
        return this;
    }

    public PlaybackStateCompat$Builder setState(int n3, long l2, float f5) {
        long l3 = SystemClock.elapsedRealtime();
        return this.setState(n3, l2, f5, l3);
    }

    public PlaybackStateCompat$Builder setState(int n3, long l2, float f5, long l3) {
        this.mState = n3;
        this.mPosition = l2;
        this.mUpdateTime = l3;
        this.mRate = f5;
        return this;
    }
}

