/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat$TransportControls;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;

class MediaControllerCompat$TransportControlsBase
extends MediaControllerCompat$TransportControls {
    private IMediaSession mBinder;

    public MediaControllerCompat$TransportControlsBase(IMediaSession iMediaSession) {
        this.mBinder = iMediaSession;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void fastForward() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.fastForward();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void pause() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.pause();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void play() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.play();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void playFromMediaId(String string2, Bundle bundle) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.playFromMediaId(string2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void playFromSearch(String string2, Bundle bundle) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.playFromSearch(string2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void playFromUri(Uri uri, Bundle bundle) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.playFromUri(uri, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void prepare() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.prepare();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void prepareFromMediaId(String string2, Bundle bundle) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.prepareFromMediaId(string2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void prepareFromSearch(String string2, Bundle bundle) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.prepareFromSearch(string2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void prepareFromUri(Uri uri, Bundle bundle) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.prepareFromUri(uri, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void rewind() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.rewind();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void seekTo(long l2) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.seekTo(l2);
    }

    public void sendCustomAction(PlaybackStateCompat$CustomAction object, Bundle bundle) {
        object = ((PlaybackStateCompat$CustomAction)object).getAction();
        this.sendCustomAction((String)object, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void sendCustomAction(String string2, Bundle bundle) {
        IMediaSession iMediaSession;
        MediaControllerCompat.validateCustomAction(string2, bundle);
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.sendCustomAction(string2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setCaptioningEnabled(boolean bl2) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.setCaptioningEnabled(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setPlaybackSpeed(float f5) {
        IMediaSession iMediaSession = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object == false) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("speed must not be zero");
            throw illegalArgumentException;
        }
        try {
            iMediaSession = this.mBinder;
            iMediaSession.setPlaybackSpeed(f5);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setRating(RatingCompat ratingCompat) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.rate(ratingCompat);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setRating(RatingCompat ratingCompat, Bundle bundle) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.rateWithExtras(ratingCompat, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setRepeatMode(int n3) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.setRepeatMode(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setShuffleMode(int n3) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.setShuffleMode(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void skipToNext() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.next();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void skipToPrevious() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.previous();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void skipToQueueItem(long l2) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.skipToQueueItem(l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void stop() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.stop();
    }
}

