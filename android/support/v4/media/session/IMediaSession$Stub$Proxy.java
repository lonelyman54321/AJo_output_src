/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.view.KeyEvent
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession$_Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

class IMediaSession$Stub$Proxy
implements IMediaSession {
    private IBinder mRemote;

    public IMediaSession$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, mediaDescriptionCompat, 0);
            mediaDescriptionCompat = this.mRemote;
            int n3 = 41;
            mediaDescriptionCompat.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int n3) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, mediaDescriptionCompat, 0);
            parcel.writeInt(n3);
            mediaDescriptionCompat = this.mRemote;
            n3 = 42;
            mediaDescriptionCompat.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void adjustVolume(int n3, int n4, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        parcel.writeInterfaceToken(string3);
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        parcel.writeString(string2);
        IBinder iBinder = this.mRemote;
        n4 = 11;
        string2 = null;
        try {
            iBinder.transact(n4, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void fastForward() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 22;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public Bundle getExtras() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 31;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = IMediaSession$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (Bundle)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public long getFlags() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 9;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            long l2 = parcel2.readLong();
            return l2;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return "android.support.v4.media.session.IMediaSession";
    }

    public PendingIntent getLaunchPendingIntent() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 8;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = PendingIntent.CREATOR;
            object = IMediaSession$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (PendingIntent)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public MediaMetadataCompat getMetadata() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 27;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = MediaMetadataCompat.CREATOR;
            object = IMediaSession$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (MediaMetadataCompat)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public String getPackageName() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 6;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            string2 = parcel2.readString();
            return string2;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public PlaybackStateCompat getPlaybackState() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 28;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = PlaybackStateCompat.CREATOR;
            object = IMediaSession$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (PlaybackStateCompat)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public List getQueue() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 29;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = MediaSessionCompat$QueueItem.CREATOR;
            object = parcel2.createTypedArrayList((Parcelable.Creator)object);
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public CharSequence getQueueTitle() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 30;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = TextUtils.CHAR_SEQUENCE_CREATOR;
            object = IMediaSession$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (CharSequence)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public int getRatingType() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 32;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            int n4 = parcel2.readInt();
            return n4;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public int getRepeatMode() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 37;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            int n4 = parcel2.readInt();
            return n4;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public Bundle getSessionInfo() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 50;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = IMediaSession$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (Bundle)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public int getShuffleMode() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 47;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            int n4 = parcel2.readInt();
            return n4;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public String getTag() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 7;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            string2 = parcel2.readString();
            return string2;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public ParcelableVolumeInfo getVolumeAttributes() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        Object object = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 10;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = ParcelableVolumeInfo.CREATOR;
            object = IMediaSession$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (ParcelableVolumeInfo)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public boolean isCaptioningEnabled() {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block3: {
            int n3;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            String string2 = "android.support.v4.media.session.IMediaSession";
            try {
                parcel2.writeInterfaceToken(string2);
                string2 = this.mRemote;
                n3 = 45;
                bl2 = false;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            string2.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block3;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean isShuffleModeEnabledRemoved() {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block3: {
            int n3;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            String string2 = "android.support.v4.media.session.IMediaSession";
            try {
                parcel2.writeInterfaceToken(string2);
                string2 = this.mRemote;
                n3 = 38;
                bl2 = false;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            string2.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block3;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean isTransportControlEnabled() {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block3: {
            int n3;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            String string2 = "android.support.v4.media.session.IMediaSession";
            try {
                parcel2.writeInterfaceToken(string2);
                string2 = this.mRemote;
                n3 = 5;
                bl2 = false;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            string2.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block3;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public void next() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 20;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void pause() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 18;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void play() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 13;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void playFromMediaId(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 14;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void playFromSearch(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 15;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void playFromUri(Uri uri, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)uri, 0);
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            uri = this.mRemote;
            int n3 = 16;
            uri.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void prepare() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 33;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void prepareFromMediaId(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 34;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void prepareFromSearch(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 35;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void prepareFromUri(Uri uri, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)uri, 0);
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            uri = this.mRemote;
            int n3 = 36;
            uri.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void previous() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 21;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void rate(RatingCompat ratingCompat) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, ratingCompat, 0);
            ratingCompat = this.mRemote;
            int n3 = 25;
            ratingCompat.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, ratingCompat, 0);
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            ratingCompat = this.mRemote;
            int n3 = 51;
            ratingCompat.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            parcel.writeStrongInterface((IInterface)iMediaControllerCallback);
            iMediaControllerCallback = this.mRemote;
            int n3 = 3;
            iMediaControllerCallback.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, mediaDescriptionCompat, 0);
            mediaDescriptionCompat = this.mRemote;
            int n3 = 43;
            mediaDescriptionCompat.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void removeQueueItemAt(int n3) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            parcel.writeInt(n3);
            IBinder iBinder = this.mRemote;
            int n4 = 44;
            iBinder.transact(n4, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void rewind() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 23;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void seekTo(long l2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        parcel.writeInterfaceToken(string2);
        parcel.writeLong(l2);
        IBinder iBinder = this.mRemote;
        int n3 = 24;
        string2 = null;
        try {
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void sendCommand(String string2, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            IMediaSession$_Parcel.access$100(parcel, mediaSessionCompat$ResultReceiverWrapper, 0);
            bundle = this.mRemote;
            int n3 = 1;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void sendCustomAction(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 26;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public boolean sendMediaButton(KeyEvent keyEvent) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block4: {
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            String string2 = "android.support.v4.media.session.IMediaSession";
            try {
                parcel2.writeInterfaceToken(string2);
                bl2 = false;
                string2 = null;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            IMediaSession$_Parcel.access$100(parcel2, (Parcelable)keyEvent, 0);
            keyEvent = this.mRemote;
            int n3 = 2;
            keyEvent.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block4;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public void setCaptioningEnabled(boolean bl2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            parcel.writeInt((int)(bl2 ? 1 : 0));
            IBinder iBinder = this.mRemote;
            int n3 = 46;
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void setPlaybackSpeed(float f5) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            parcel.writeFloat(f5);
            IBinder iBinder = this.mRemote;
            int n3 = 49;
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void setRepeatMode(int n3) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            parcel.writeInt(n3);
            IBinder iBinder = this.mRemote;
            int n4 = 39;
            iBinder.transact(n4, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void setShuffleMode(int n3) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            parcel.writeInt(n3);
            IBinder iBinder = this.mRemote;
            int n4 = 48;
            iBinder.transact(n4, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void setShuffleModeEnabledRemoved(boolean bl2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = null;
            parcel.writeInt((int)(bl2 ? 1 : 0));
            IBinder iBinder = this.mRemote;
            int n3 = 40;
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void setVolumeTo(int n3, int n4, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaSession";
        parcel.writeInterfaceToken(string3);
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        parcel.writeString(string2);
        IBinder iBinder = this.mRemote;
        n4 = 12;
        string2 = null;
        try {
            iBinder.transact(n4, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void skipToQueueItem(long l2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        parcel.writeInterfaceToken(string2);
        parcel.writeLong(l2);
        IBinder iBinder = this.mRemote;
        int n3 = 17;
        string2 = null;
        try {
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void stop() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 19;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaSession";
        try {
            parcel.writeInterfaceToken(string2);
            parcel.writeStrongInterface((IInterface)iMediaControllerCallback);
            iMediaControllerCallback = this.mRemote;
            int n3 = 4;
            iMediaControllerCallback.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }
}

