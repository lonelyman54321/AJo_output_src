/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.net.Uri
 *  android.os.Binder
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
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaControllerCallback$Stub;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession$Stub$Proxy;
import android.support.v4.media.session.IMediaSession$_Parcel;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

public abstract class IMediaSession$Stub
extends Binder
implements IMediaSession {
    static final int TRANSACTION_addQueueItem = 41;
    static final int TRANSACTION_addQueueItemAt = 42;
    static final int TRANSACTION_adjustVolume = 11;
    static final int TRANSACTION_fastForward = 22;
    static final int TRANSACTION_getExtras = 31;
    static final int TRANSACTION_getFlags = 9;
    static final int TRANSACTION_getLaunchPendingIntent = 8;
    static final int TRANSACTION_getMetadata = 27;
    static final int TRANSACTION_getPackageName = 6;
    static final int TRANSACTION_getPlaybackState = 28;
    static final int TRANSACTION_getQueue = 29;
    static final int TRANSACTION_getQueueTitle = 30;
    static final int TRANSACTION_getRatingType = 32;
    static final int TRANSACTION_getRepeatMode = 37;
    static final int TRANSACTION_getSessionInfo = 50;
    static final int TRANSACTION_getShuffleMode = 47;
    static final int TRANSACTION_getTag = 7;
    static final int TRANSACTION_getVolumeAttributes = 10;
    static final int TRANSACTION_isCaptioningEnabled = 45;
    static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
    static final int TRANSACTION_isTransportControlEnabled = 5;
    static final int TRANSACTION_next = 20;
    static final int TRANSACTION_pause = 18;
    static final int TRANSACTION_play = 13;
    static final int TRANSACTION_playFromMediaId = 14;
    static final int TRANSACTION_playFromSearch = 15;
    static final int TRANSACTION_playFromUri = 16;
    static final int TRANSACTION_prepare = 33;
    static final int TRANSACTION_prepareFromMediaId = 34;
    static final int TRANSACTION_prepareFromSearch = 35;
    static final int TRANSACTION_prepareFromUri = 36;
    static final int TRANSACTION_previous = 21;
    static final int TRANSACTION_rate = 25;
    static final int TRANSACTION_rateWithExtras = 51;
    static final int TRANSACTION_registerCallbackListener = 3;
    static final int TRANSACTION_removeQueueItem = 43;
    static final int TRANSACTION_removeQueueItemAt = 44;
    static final int TRANSACTION_rewind = 23;
    static final int TRANSACTION_seekTo = 24;
    static final int TRANSACTION_sendCommand = 1;
    static final int TRANSACTION_sendCustomAction = 26;
    static final int TRANSACTION_sendMediaButton = 2;
    static final int TRANSACTION_setCaptioningEnabled = 46;
    static final int TRANSACTION_setPlaybackSpeed = 49;
    static final int TRANSACTION_setRepeatMode = 39;
    static final int TRANSACTION_setShuffleMode = 48;
    static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
    static final int TRANSACTION_setVolumeTo = 12;
    static final int TRANSACTION_skipToQueueItem = 17;
    static final int TRANSACTION_stop = 19;
    static final int TRANSACTION_unregisterCallbackListener = 4;

    public IMediaSession$Stub() {
        this.attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    public static IMediaSession asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterface != null && (bl2 = iInterface instanceof IMediaSession)) {
            return (IMediaSession)iInterface;
        }
        iInterface = new IMediaSession$Stub$Proxy(iBinder);
        return iInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel object, Parcel parcel, int n4) {
        int n7;
        String string2 = "android.support.v4.media.session.IMediaSession";
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            object.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel.writeString(string2);
            return n8 != 0;
        }
        boolean bl2 = false;
        string2 = null;
        switch (n3) {
            default: {
                return super.onTransact(n3, object, parcel, n4);
            }
            case 51: {
                Object object2 = RatingCompat.CREATOR;
                object2 = (RatingCompat)IMediaSession$_Parcel.access$000(object, object2);
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator);
                this.rateWithExtras((RatingCompat)object2, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 50: {
                Bundle bundle = this.getSessionInfo();
                parcel.writeNoException();
                IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, n8);
                break;
            }
            case 49: {
                float f5 = object.readFloat();
                this.setPlaybackSpeed(f5);
                parcel.writeNoException();
                break;
            }
            case 48: {
                n3 = object.readInt();
                this.setShuffleMode(n3);
                parcel.writeNoException();
                break;
            }
            case 47: {
                n3 = this.getShuffleMode();
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 46: {
                n3 = object.readInt();
                if (n3 != 0) {
                    bl2 = true;
                }
                this.setCaptioningEnabled(bl2);
                parcel.writeNoException();
                break;
            }
            case 45: {
                n3 = (int)(this.isCaptioningEnabled() ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 44: {
                n3 = object.readInt();
                this.removeQueueItemAt(n3);
                parcel.writeNoException();
                break;
            }
            case 43: {
                Object object3 = MediaDescriptionCompat.CREATOR;
                object3 = (MediaDescriptionCompat)IMediaSession$_Parcel.access$000(object, object3);
                this.removeQueueItem((MediaDescriptionCompat)object3);
                parcel.writeNoException();
                break;
            }
            case 42: {
                Object object4 = MediaDescriptionCompat.CREATOR;
                object4 = (MediaDescriptionCompat)IMediaSession$_Parcel.access$000(object, object4);
                int n10 = object.readInt();
                this.addQueueItemAt((MediaDescriptionCompat)object4, n10);
                parcel.writeNoException();
                break;
            }
            case 41: {
                Object object5 = MediaDescriptionCompat.CREATOR;
                object5 = (MediaDescriptionCompat)IMediaSession$_Parcel.access$000(object, object5);
                this.addQueueItem((MediaDescriptionCompat)object5);
                parcel.writeNoException();
                break;
            }
            case 40: {
                n3 = object.readInt();
                if (n3 != 0) {
                    bl2 = true;
                }
                this.setShuffleModeEnabledRemoved(bl2);
                parcel.writeNoException();
                break;
            }
            case 39: {
                n3 = object.readInt();
                this.setRepeatMode(n3);
                parcel.writeNoException();
                break;
            }
            case 38: {
                n3 = (int)(this.isShuffleModeEnabledRemoved() ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 37: {
                n3 = this.getRepeatMode();
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 36: {
                Parcelable.Creator creator = Uri.CREATOR;
                creator = (Uri)IMediaSession$_Parcel.access$000(object, creator);
                Parcelable.Creator creator2 = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator2);
                this.prepareFromUri((Uri)creator, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 35: {
                String string3 = object.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator);
                this.prepareFromSearch(string3, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 34: {
                String string4 = object.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator);
                this.prepareFromMediaId(string4, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 33: {
                this.prepare();
                parcel.writeNoException();
                break;
            }
            case 32: {
                n3 = this.getRatingType();
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 31: {
                Bundle bundle = this.getExtras();
                parcel.writeNoException();
                IMediaSession$_Parcel.access$100(parcel, (Parcelable)bundle, n8);
                break;
            }
            case 30: {
                CharSequence charSequence = this.getQueueTitle();
                parcel.writeNoException();
                if (charSequence != null) {
                    parcel.writeInt(n8);
                    TextUtils.writeToParcel((CharSequence)charSequence, (Parcel)parcel, (int)n8);
                    break;
                }
                parcel.writeInt(0);
                break;
            }
            case 29: {
                List list = this.getQueue();
                parcel.writeNoException();
                IMediaSession$_Parcel.access$200(parcel, list, n8);
                break;
            }
            case 28: {
                PlaybackStateCompat playbackStateCompat = this.getPlaybackState();
                parcel.writeNoException();
                IMediaSession$_Parcel.access$100(parcel, playbackStateCompat, n8);
                break;
            }
            case 27: {
                MediaMetadataCompat mediaMetadataCompat = this.getMetadata();
                parcel.writeNoException();
                IMediaSession$_Parcel.access$100(parcel, mediaMetadataCompat, n8);
                break;
            }
            case 26: {
                String string5 = object.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator);
                this.sendCustomAction(string5, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 25: {
                Object object6 = RatingCompat.CREATOR;
                object6 = (RatingCompat)IMediaSession$_Parcel.access$000(object, object6);
                this.rate((RatingCompat)object6);
                parcel.writeNoException();
                break;
            }
            case 24: {
                long l2 = object.readLong();
                this.seekTo(l2);
                parcel.writeNoException();
                break;
            }
            case 23: {
                this.rewind();
                parcel.writeNoException();
                break;
            }
            case 22: {
                this.fastForward();
                parcel.writeNoException();
                break;
            }
            case 21: {
                this.previous();
                parcel.writeNoException();
                break;
            }
            case 20: {
                this.next();
                parcel.writeNoException();
                break;
            }
            case 19: {
                this.stop();
                parcel.writeNoException();
                break;
            }
            case 18: {
                this.pause();
                parcel.writeNoException();
                break;
            }
            case 17: {
                long l3 = object.readLong();
                this.skipToQueueItem(l3);
                parcel.writeNoException();
                break;
            }
            case 16: {
                Parcelable.Creator creator = Uri.CREATOR;
                creator = (Uri)IMediaSession$_Parcel.access$000(object, creator);
                Parcelable.Creator creator3 = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator3);
                this.playFromUri((Uri)creator, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 15: {
                String string6 = object.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator);
                this.playFromSearch(string6, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 14: {
                String string7 = object.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)IMediaSession$_Parcel.access$000(object, creator);
                this.playFromMediaId(string7, (Bundle)object);
                parcel.writeNoException();
                break;
            }
            case 13: {
                this.play();
                parcel.writeNoException();
                break;
            }
            case 12: {
                n3 = object.readInt();
                n4 = object.readInt();
                object = object.readString();
                this.setVolumeTo(n3, n4, (String)object);
                parcel.writeNoException();
                break;
            }
            case 11: {
                n3 = object.readInt();
                n4 = object.readInt();
                object = object.readString();
                this.adjustVolume(n3, n4, (String)object);
                parcel.writeNoException();
                break;
            }
            case 10: {
                ParcelableVolumeInfo parcelableVolumeInfo = this.getVolumeAttributes();
                parcel.writeNoException();
                IMediaSession$_Parcel.access$100(parcel, parcelableVolumeInfo, n8);
                break;
            }
            case 9: {
                long l4 = this.getFlags();
                parcel.writeNoException();
                parcel.writeLong(l4);
                break;
            }
            case 8: {
                PendingIntent pendingIntent = this.getLaunchPendingIntent();
                parcel.writeNoException();
                IMediaSession$_Parcel.access$100(parcel, (Parcelable)pendingIntent, n8);
                break;
            }
            case 7: {
                String string8 = this.getTag();
                parcel.writeNoException();
                parcel.writeString(string8);
                break;
            }
            case 6: {
                String string9 = this.getPackageName();
                parcel.writeNoException();
                parcel.writeString(string9);
                break;
            }
            case 5: {
                n3 = (int)(this.isTransportControlEnabled() ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 4: {
                IMediaControllerCallback iMediaControllerCallback = IMediaControllerCallback$Stub.asInterface(object.readStrongBinder());
                this.unregisterCallbackListener(iMediaControllerCallback);
                parcel.writeNoException();
                break;
            }
            case 3: {
                IMediaControllerCallback iMediaControllerCallback = IMediaControllerCallback$Stub.asInterface(object.readStrongBinder());
                this.registerCallbackListener(iMediaControllerCallback);
                parcel.writeNoException();
                break;
            }
            case 2: {
                Parcelable.Creator creator = KeyEvent.CREATOR;
                creator = (KeyEvent)IMediaSession$_Parcel.access$000(object, creator);
                n3 = (int)(this.sendMediaButton((KeyEvent)creator) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 1: {
                String string10 = object.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)IMediaSession$_Parcel.access$000(object, creator);
                string2 = MediaSessionCompat$ResultReceiverWrapper.CREATOR;
                object = (MediaSessionCompat$ResultReceiverWrapper)IMediaSession$_Parcel.access$000(object, (Parcelable.Creator)string2);
                this.sendCommand(string10, (Bundle)creator, (MediaSessionCompat$ResultReceiverWrapper)object);
                parcel.writeNoException();
            }
        }
        return n8 != 0;
    }
}

