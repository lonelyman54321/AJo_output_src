/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaControllerCallback$_Parcel;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

class IMediaControllerCallback$Stub$Proxy
implements IMediaControllerCallback {
    private IBinder mRemote;

    public IMediaControllerCallback$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public String getInterfaceDescriptor() {
        return "android.support.v4.media.session.IMediaControllerCallback";
    }

    public void onCaptioningEnabledChanged(boolean bl2) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        try {
            parcel.writeInterfaceToken(string2);
            int n3 = 1;
            parcel.writeInt((int)(bl2 ? 1 : 0));
            IBinder iBinder = this.mRemote;
            int n4 = 11;
            iBinder.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onEvent(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string3 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string3);
        parcel.writeString(string2);
        string2 = null;
        IMediaControllerCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        string2 = this.mRemote;
        bundle = null;
        int n3 = 1;
        try {
            string2.transact(n3, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onExtrasChanged(Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        string2 = null;
        IMediaControllerCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        bundle = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 7;
        try {
            bundle.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        string2 = null;
        IMediaControllerCallback$_Parcel.access$100(parcel, mediaMetadataCompat, 0);
        mediaMetadataCompat = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 4;
        try {
            mediaMetadataCompat.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        string2 = null;
        IMediaControllerCallback$_Parcel.access$100(parcel, playbackStateCompat, 0);
        playbackStateCompat = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 3;
        try {
            playbackStateCompat.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onQueueChanged(List list) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        string2 = null;
        IMediaControllerCallback$_Parcel.access$200(parcel, list, 0);
        list = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 5;
        try {
            list.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onQueueTitleChanged(CharSequence charSequence) {
        Throwable throwable2;
        Parcel parcel;
        block4: {
            int n3;
            int n4;
            block3: {
                block2: {
                    parcel = Parcel.obtain();
                    String string2 = "android.support.v4.media.session.IMediaControllerCallback";
                    try {
                        parcel.writeInterfaceToken(string2);
                        n4 = 0;
                        string2 = null;
                        n3 = 1;
                        if (charSequence == null) break block2;
                        parcel.writeInt(n3);
                        TextUtils.writeToParcel((CharSequence)charSequence, (Parcel)parcel, (int)0);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                parcel.writeInt(0);
            }
            charSequence = this.mRemote;
            n4 = 6;
            charSequence.transact(n4, parcel, null, n3);
            parcel.recycle();
            return;
        }
        parcel.recycle();
        throw throwable2;
    }

    public void onRepeatModeChanged(int n3) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        IBinder iBinder = this.mRemote;
        string2 = null;
        int n4 = 1;
        int n7 = 9;
        try {
            iBinder.transact(n7, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onSessionDestroyed() {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        string2 = this.mRemote;
        int n3 = 1;
        int n4 = 2;
        try {
            string2.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onSessionReady() {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        string2 = this.mRemote;
        int n3 = 1;
        int n4 = 13;
        try {
            string2.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onShuffleModeChanged(int n3) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        IBinder iBinder = this.mRemote;
        string2 = null;
        int n4 = 1;
        int n7 = 12;
        try {
            iBinder.transact(n7, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onShuffleModeChangedRemoved(boolean bl2) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        try {
            parcel.writeInterfaceToken(string2);
            int n3 = 1;
            parcel.writeInt((int)(bl2 ? 1 : 0));
            IBinder iBinder = this.mRemote;
            int n4 = 10;
            iBinder.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel parcel = Parcel.obtain();
        String string2 = "android.support.v4.media.session.IMediaControllerCallback";
        parcel.writeInterfaceToken(string2);
        string2 = null;
        IMediaControllerCallback$_Parcel.access$100(parcel, parcelableVolumeInfo, 0);
        parcelableVolumeInfo = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 8;
        try {
            parcelableVolumeInfo.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

