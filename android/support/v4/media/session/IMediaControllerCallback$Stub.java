/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaControllerCallback$Stub$Proxy;
import android.support.v4.media.session.IMediaControllerCallback$_Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

public abstract class IMediaControllerCallback$Stub
extends Binder
implements IMediaControllerCallback {
    static final int TRANSACTION_onCaptioningEnabledChanged = 11;
    static final int TRANSACTION_onEvent = 1;
    static final int TRANSACTION_onExtrasChanged = 7;
    static final int TRANSACTION_onMetadataChanged = 4;
    static final int TRANSACTION_onPlaybackStateChanged = 3;
    static final int TRANSACTION_onQueueChanged = 5;
    static final int TRANSACTION_onQueueTitleChanged = 6;
    static final int TRANSACTION_onRepeatModeChanged = 9;
    static final int TRANSACTION_onSessionDestroyed = 2;
    static final int TRANSACTION_onSessionReady = 13;
    static final int TRANSACTION_onShuffleModeChanged = 12;
    static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
    static final int TRANSACTION_onVolumeInfoChanged = 8;

    public IMediaControllerCallback$Stub() {
        this.attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    public static IMediaControllerCallback asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (iInterface != null && (bl2 = iInterface instanceof IMediaControllerCallback)) {
            return (IMediaControllerCallback)iInterface;
        }
        iInterface = new IMediaControllerCallback$Stub$Proxy(iBinder);
        return iInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7;
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            parcel.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel2.writeString(string2);
            return n8;
        }
        boolean bl2 = false;
        string2 = null;
        switch (n3) {
            default: {
                return super.onTransact(n3, parcel, parcel2, n4);
            }
            case 13: {
                this.onSessionReady();
                break;
            }
            case 12: {
                n3 = parcel.readInt();
                this.onShuffleModeChanged(n3);
                break;
            }
            case 11: {
                n3 = parcel.readInt();
                if (n3 != 0) {
                    bl2 = true;
                }
                this.onCaptioningEnabledChanged(bl2);
                break;
            }
            case 10: {
                n3 = parcel.readInt();
                if (n3 != 0) {
                    bl2 = true;
                }
                this.onShuffleModeChangedRemoved(bl2);
                break;
            }
            case 9: {
                n3 = parcel.readInt();
                this.onRepeatModeChanged(n3);
                break;
            }
            case 8: {
                Object object = ParcelableVolumeInfo.CREATOR;
                object = (ParcelableVolumeInfo)IMediaControllerCallback$_Parcel.access$000(parcel, object);
                this.onVolumeInfoChanged((ParcelableVolumeInfo)object);
                break;
            }
            case 7: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)IMediaControllerCallback$_Parcel.access$000(parcel, creator);
                this.onExtrasChanged((Bundle)creator);
                break;
            }
            case 6: {
                Object object = TextUtils.CHAR_SEQUENCE_CREATOR;
                object = (CharSequence)IMediaControllerCallback$_Parcel.access$000(parcel, object);
                this.onQueueTitleChanged((CharSequence)object);
                break;
            }
            case 5: {
                Object object = MediaSessionCompat$QueueItem.CREATOR;
                object = parcel.createTypedArrayList(object);
                this.onQueueChanged((List)object);
                break;
            }
            case 4: {
                Object object = MediaMetadataCompat.CREATOR;
                object = (MediaMetadataCompat)IMediaControllerCallback$_Parcel.access$000(parcel, object);
                this.onMetadataChanged((MediaMetadataCompat)object);
                break;
            }
            case 3: {
                Object object = PlaybackStateCompat.CREATOR;
                object = (PlaybackStateCompat)IMediaControllerCallback$_Parcel.access$000(parcel, object);
                this.onPlaybackStateChanged((PlaybackStateCompat)object);
                break;
            }
            case 2: {
                this.onSessionDestroyed();
                break;
            }
            case 1: {
                String string3 = parcel.readString();
                parcel2 = Bundle.CREATOR;
                parcel = (Bundle)IMediaControllerCallback$_Parcel.access$000(parcel, (Parcelable.Creator)parcel2);
                this.onEvent(string3, (Bundle)parcel);
            }
        }
        return n8;
    }
}

