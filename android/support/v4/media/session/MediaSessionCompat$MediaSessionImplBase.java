/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.media.AudioManager
 *  android.media.RemoteControlClient
 *  android.media.RemoteControlClient$MetadataEditor
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteCallbackList
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat$Builder;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$1;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallback;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallbackHandler;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

class MediaSessionCompat$MediaSessionImplBase
implements MediaSessionCompat$MediaSessionImpl {
    static final int RCC_PLAYSTATE_NONE;
    final AudioManager mAudioManager;
    volatile MediaSessionCompat$Callback mCallback;
    boolean mCaptioningEnabled;
    private final Context mContext;
    final RemoteCallbackList mControllerCallbacks;
    boolean mDestroyed;
    Bundle mExtras;
    int mFlags;
    private MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler;
    boolean mIsActive;
    int mLocalStream;
    final Object mLock;
    private final ComponentName mMediaButtonReceiverComponentName;
    private final PendingIntent mMediaButtonReceiverIntent;
    MediaMetadataCompat mMetadata;
    List mQueue;
    CharSequence mQueueTitle;
    int mRatingType;
    final RemoteControlClient mRcc;
    MediaSessionCompat$RegistrationCallbackHandler mRegistrationCallbackHandler;
    private fn1_0 mRemoteUserInfo;
    int mRepeatMode;
    PendingIntent mSessionActivity;
    final Bundle mSessionInfo;
    int mShuffleMode;
    PlaybackStateCompat mState;
    private final MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub;
    private final MediaSessionCompat$Token mToken;
    private HE3$a mVolumeCallback;
    HE3 mVolumeProvider;
    int mVolumeType;

    public MediaSessionCompat$MediaSessionImplBase(Context object, String string2, ComponentName object2, PendingIntent pendingIntent, qB3 qB32, Bundle bundle) {
        int n3;
        Object object3;
        this.mLock = object3 = new Object();
        object3 = new RemoteCallbackList();
        this.mControllerCallbacks = object3;
        object3 = null;
        this.mDestroyed = false;
        this.mIsActive = false;
        this.mFlags = n3 = 3;
        MediaSessionCompat$MediaSessionImplBase$1 mediaSessionCompat$MediaSessionImplBase$1 = new MediaSessionCompat$MediaSessionImplBase$1(this);
        this.mVolumeCallback = mediaSessionCompat$MediaSessionImplBase$1;
        if (object2 != null) {
            this.mContext = object;
            this.mSessionInfo = bundle;
            bundle = (AudioManager)object.getSystemService("audio");
            this.mAudioManager = bundle;
            this.mMediaButtonReceiverComponentName = object2;
            this.mMediaButtonReceiverIntent = pendingIntent;
            object = object.getPackageName();
            super(this, (String)object, string2);
            this.mStub = object2;
            super(object2, null, qB32);
            this.mToken = object;
            this.mRatingType = 0;
            this.mVolumeType = 1;
            this.mLocalStream = n3;
            super(pendingIntent);
            this.mRcc = object;
            return;
        }
        super("MediaButtonReceiver component may not be null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendCaptioningEnabled(boolean bl2) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onCaptioningEnabledChanged(bl2);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                RemoteCallbackList remoteCallbackList2 = this.mControllerCallbacks;
                remoteCallbackList2.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendEvent(String string2, Bundle bundle) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onEvent(string2, bundle);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                string2 = this.mControllerCallbacks;
                string2.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendExtras(Bundle bundle) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onExtrasChanged(bundle);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                bundle = this.mControllerCallbacks;
                bundle.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendMetadata(MediaMetadataCompat mediaMetadataCompat) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onMetadataChanged(mediaMetadataCompat);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                mediaMetadataCompat = this.mControllerCallbacks;
                mediaMetadataCompat.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendQueue(List list) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onQueueChanged(list);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                list = this.mControllerCallbacks;
                list.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendQueueTitle(CharSequence charSequence) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onQueueTitleChanged(charSequence);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                charSequence = this.mControllerCallbacks;
                charSequence.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendRepeatMode(int n3) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onRepeatModeChanged(n3);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                RemoteCallbackList remoteCallbackList2 = this.mControllerCallbacks;
                remoteCallbackList2.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendSessionDestroyed() {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onSessionDestroyed();
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                remoteCallbackList = this.mControllerCallbacks;
                remoteCallbackList.finishBroadcast();
                remoteCallbackList = this.mControllerCallbacks;
                remoteCallbackList.kill();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendShuffleMode(int n3) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onShuffleModeChanged(n3);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                RemoteCallbackList remoteCallbackList2 = this.mControllerCallbacks;
                remoteCallbackList2.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendState(PlaybackStateCompat playbackStateCompat) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onPlaybackStateChanged(playbackStateCompat);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                playbackStateCompat = this.mControllerCallbacks;
                playbackStateCompat.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void adjustVolume(int n3, int n4) {
        int n7 = this.mVolumeType;
        int n8 = 2;
        if (n7 != n8) {
            AudioManager audioManager = this.mAudioManager;
            n8 = this.mLocalStream;
            audioManager.adjustStreamVolume(n8, n3, n4);
        }
    }

    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle object) {
        long l2;
        String string2;
        int n3;
        RemoteControlClient remoteControlClient = this.mRcc;
        int n4 = 1;
        remoteControlClient = remoteControlClient.editMetadata(n4 != 0);
        if (object == null) {
            return remoteControlClient;
        }
        String string3 = "android.media.metadata.ART";
        boolean bl2 = object.containsKey(string3);
        int n7 = 100;
        if (bl2) {
            if ((string3 = (Bitmap)object.getParcelable(string3)) != null) {
                Bitmap.Config config = string3.getConfig();
                string3 = string3.copy(config, false);
            }
            remoteControlClient.putBitmap(n7, (Bitmap)string3);
        } else {
            string3 = "android.media.metadata.ALBUM_ART";
            bl2 = object.containsKey(string3);
            if (bl2) {
                if ((string3 = (Bitmap)object.getParcelable(string3)) != null) {
                    Bitmap.Config config = string3.getConfig();
                    string3 = string3.copy(config, false);
                }
                remoteControlClient.putBitmap(n7, (Bitmap)string3);
            }
        }
        string3 = "android.media.metadata.ALBUM";
        bl2 = object.containsKey(string3);
        if (bl2) {
            string3 = object.getString(string3);
            remoteControlClient.putString(n4, string3);
        }
        if ((n3 = object.containsKey(string2 = "android.media.metadata.ALBUM_ARTIST")) != 0) {
            n3 = 13;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.ARTIST") ? 1 : 0)) != 0) {
            n3 = 2;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.AUTHOR") ? 1 : 0)) != 0) {
            n3 = 3;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.COMPILATION") ? 1 : 0)) != 0) {
            n3 = 15;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.COMPOSER") ? 1 : 0)) != 0) {
            n3 = 4;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.DATE") ? 1 : 0)) != 0) {
            n3 = 5;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.DISC_NUMBER") ? 1 : 0)) != 0) {
            n3 = 14;
            l2 = object.getLong(string2);
            remoteControlClient.putLong(n3, l2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.DURATION") ? 1 : 0)) != 0) {
            n3 = 9;
            l2 = object.getLong(string2);
            remoteControlClient.putLong(n3, l2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.GENRE") ? 1 : 0)) != 0) {
            n3 = 6;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.TITLE") ? 1 : 0)) != 0) {
            n3 = 7;
            string2 = object.getString(string2);
            remoteControlClient.putString(n3, string2);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.TRACK_NUMBER") ? 1 : 0)) != 0) {
            long l3 = object.getLong(string2);
            remoteControlClient.putLong(0, l3);
        }
        if ((n3 = (int)(object.containsKey(string2 = "android.media.metadata.WRITER") ? 1 : 0)) != 0) {
            n3 = 11;
            object = object.getString(string2);
            remoteControlClient.putString(n3, (String)object);
        }
        return remoteControlClient;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MediaSessionCompat$Callback getCallback() {
        Object object = this.mLock;
        synchronized (object) {
            return this.mCallback;
        }
    }

    public String getCallingPackage() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fn1_0 getCurrentControllerInfo() {
        Object object = this.mLock;
        synchronized (object) {
            return this.mRemoteUserInfo;
        }
    }

    public Object getMediaSession() {
        return null;
    }

    public String getPackageNameForUid(int n3) {
        PackageManager packageManager = this.mContext.getPackageManager();
        String string2 = packageManager.getNameForUid(n3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = "android.media.session.MediaController";
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PlaybackStateCompat getPlaybackState() {
        Object object = this.mLock;
        synchronized (object) {
            return this.mState;
        }
    }

    public int getRccStateFromState(int n3) {
        switch (n3) {
            default: {
                return -1;
            }
            case 10: 
            case 11: {
                return 6;
            }
            case 9: {
                return 7;
            }
            case 7: {
                return 9;
            }
            case 6: 
            case 8: {
                return 8;
            }
            case 5: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 1;
            }
            case 0: 
        }
        return 0;
    }

    public int getRccTransportControlFlagsFromActions(long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        long l14;
        long l15 = 1L & l2;
        long l16 = 0L;
        long l17 = l15 - l16;
        Object object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        int n3 = object != false ? 32 : 0;
        long l18 = (long)2 & l2;
        long l19 = l18 - l16;
        Object object2 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
        if (object2 != false) {
            n3 |= 0x10;
        }
        if ((object2 = (l14 = (l18 = (long)4 & l2) - l16) == 0L ? 0 : (l14 < 0L ? -1 : 1)) != false) {
            n3 |= 4;
        }
        if ((object2 = (l12 = (l18 = (long)8 & l2) - l16) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) {
            n3 |= 2;
        }
        if ((object2 = (l8 = (l18 = (long)16 & l2) - l16) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
            n3 |= 1;
        }
        if ((object2 = (l7 = (l18 = (long)32 & l2) - l16) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            n3 |= 0x80;
        }
        if ((object2 = (l4 = (l18 = (long)64 & l2) - l16) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            n3 |= 0x40;
        }
        if ((object2 = (l3 = (l2 &= (l18 = 512L)) - l16) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            n3 |= 8;
        }
        return n3;
    }

    public Object getRemoteControlClient() {
        return null;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mToken;
    }

    public boolean isActive() {
        return this.mIsActive;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void postToHandler(int n3, int n4, int n7, Object object, Bundle bundle) {
        Object object2 = this.mLock;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                block4: {
                    String string2;
                    Bundle bundle2;
                    Message message;
                    block6: {
                        block5: {
                            try {
                                MediaSessionCompat$MediaSessionImplBase$MessageHandler mediaSessionCompat$MediaSessionImplBase$MessageHandler = this.mHandler;
                                if (mediaSessionCompat$MediaSessionImplBase$MessageHandler == null) break block4;
                                message = mediaSessionCompat$MediaSessionImplBase$MessageHandler.obtainMessage(n3, n4, n7, object);
                                bundle2 = new Bundle();
                                n7 = Binder.getCallingUid();
                                object = "data_calling_uid";
                                bundle2.putInt((String)object, n7);
                                object = "data_calling_pkg";
                                string2 = this.getPackageNameForUid(n7);
                                bundle2.putString((String)object, string2);
                                n7 = Binder.getCallingPid();
                                if (n7 <= 0) break block5;
                                object = "data_calling_pid";
                                bundle2.putInt((String)object, n7);
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        string2 = "data_calling_pid";
                        int n8 = -1;
                        bundle2.putInt(string2, n8);
                    }
                    if (bundle != null) {
                        string2 = "data_extras";
                        bundle2.putBundle(string2, bundle);
                    }
                    message.setData(bundle2);
                    message.sendToTarget();
                }
                return;
            }
            throw throwable2;
        }
    }

    public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        this.mAudioManager.registerMediaButtonEventReceiver(componentName);
    }

    public void release() {
        this.mIsActive = false;
        this.mDestroyed = true;
        this.updateMbrAndRcc();
        this.sendSessionDestroyed();
        this.setCallback(null, null);
    }

    public void sendSessionEvent(String string2, Bundle bundle) {
        this.sendEvent(string2, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void sendVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onVolumeInfoChanged(parcelableVolumeInfo);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                parcelableVolumeInfo = this.mControllerCallbacks;
                parcelableVolumeInfo.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void setActive(boolean bl2) {
        boolean bl3 = this.mIsActive;
        if (bl2 == bl3) {
            return;
        }
        this.mIsActive = bl2;
        this.updateMbrAndRcc();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCallback(MediaSessionCompat$Callback mediaSessionCompat$Callback, Handler handler) {
        Object object = this.mLock;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                Object object2;
                block8: {
                    try {
                        object2 = this.mHandler;
                        if (object2 == null) break block8;
                        object2.removeCallbacksAndMessages(null);
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                if (mediaSessionCompat$Callback != null && handler != null) {
                    Looper looper = handler.getLooper();
                    object2 = new MediaSessionCompat$MediaSessionImplBase$MessageHandler(this, looper);
                } else {
                    object2 = null;
                }
                this.mHandler = object2;
                object2 = this.mCallback;
                if (object2 != mediaSessionCompat$Callback && (object2 = this.mCallback) != null) {
                    object2 = this.mCallback;
                    ((MediaSessionCompat$Callback)object2).setSessionImpl(null, null);
                }
                if ((mediaSessionCompat$Callback = (this.mCallback = mediaSessionCompat$Callback)) != null) {
                    mediaSessionCompat$Callback = this.mCallback;
                    mediaSessionCompat$Callback.setSessionImpl(this, handler);
                }
                return;
            }
            throw throwable2;
        }
    }

    public void setCaptioningEnabled(boolean bl2) {
        boolean bl3 = this.mCaptioningEnabled;
        if (bl3 != bl2) {
            this.mCaptioningEnabled = bl2;
            this.sendCaptioningEnabled(bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCurrentControllerInfo(fn1_0 fn1_02) {
        Object object = this.mLock;
        synchronized (object) {
            this.mRemoteUserInfo = fn1_02;
            return;
        }
    }

    public void setExtras(Bundle bundle) {
        this.mExtras = bundle;
        this.sendExtras(bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setFlags(int n3) {
        Object object = this.mLock;
        synchronized (object) {
            this.mFlags = n3 |= 3;
            return;
        }
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        Object object;
        if (mediaMetadataCompat != null) {
            int n3 = MediaSessionCompat.sMaxBitmapSize;
            object = new MediaMetadataCompat$Builder(mediaMetadataCompat, n3);
            mediaMetadataCompat = ((MediaMetadataCompat$Builder)object).build();
        }
        object = this.mLock;
        synchronized (object) {
            this.mMetadata = mediaMetadataCompat;
        }
        this.sendMetadata(mediaMetadataCompat);
        boolean bl2 = this.mIsActive;
        if (!bl2) {
            return;
        }
        mediaMetadataCompat = mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle();
        this.buildRccMetadata((Bundle)mediaMetadataCompat).apply();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        Object object = this.mLock;
        synchronized (object) {
            this.mState = playbackStateCompat;
        }
        this.sendState(playbackStateCompat);
        boolean bl2 = this.mIsActive;
        if (!bl2) {
            return;
        }
        if (playbackStateCompat == null) {
            playbackStateCompat = this.mRcc;
            bl2 = false;
            object = null;
            playbackStateCompat.setPlaybackState(0);
            playbackStateCompat = this.mRcc;
            playbackStateCompat.setTransportControlFlags(0);
            return;
        }
        this.setRccState(playbackStateCompat);
        object = this.mRcc;
        long l2 = playbackStateCompat.getActions();
        int n3 = this.getRccTransportControlFlagsFromActions(l2);
        object.setTransportControlFlags(n3);
    }

    public void setPlaybackToLocal(int n3) {
        ParcelableVolumeInfo parcelableVolumeInfo;
        this.mLocalStream = n3;
        int n4 = this.mVolumeType = 1;
        int n7 = this.mLocalStream;
        int n8 = this.mAudioManager.getStreamMaxVolume(n7);
        Object object = this.mAudioManager;
        int n10 = this.mLocalStream;
        int n14 = object.getStreamVolume(n10);
        object = parcelableVolumeInfo;
        parcelableVolumeInfo = new ParcelableVolumeInfo(n4, n7, 2, n8, n14);
        this.sendVolumeInfoChanged(parcelableVolumeInfo);
    }

    public void setPlaybackToRemote(HE3 object) {
        object = new IllegalArgumentException("volumeProvider may not be null");
        throw object;
    }

    public void setQueue(List list) {
        this.mQueue = list;
        this.sendQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mQueueTitle = charSequence;
        this.sendQueueTitle(charSequence);
    }

    public void setRatingType(int n3) {
        this.mRatingType = n3;
    }

    public void setRccState(PlaybackStateCompat playbackStateCompat) {
        RemoteControlClient remoteControlClient = this.mRcc;
        int n3 = playbackStateCompat.getState();
        n3 = this.getRccStateFromState(n3);
        remoteControlClient.setPlaybackState(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setRegistrationCallback(MediaSessionCompat$RegistrationCallback mediaSessionCompat$RegistrationCallback, Handler handler) {
        Object object = this.mLock;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler;
                block5: {
                    try {
                        mediaSessionCompat$RegistrationCallbackHandler = this.mRegistrationCallbackHandler;
                        if (mediaSessionCompat$RegistrationCallbackHandler == null) break block5;
                        mediaSessionCompat$RegistrationCallbackHandler.removeCallbacksAndMessages(null);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (mediaSessionCompat$RegistrationCallback != null) {
                    handler = handler.getLooper();
                    this.mRegistrationCallbackHandler = mediaSessionCompat$RegistrationCallbackHandler = new MediaSessionCompat$RegistrationCallbackHandler((Looper)handler, mediaSessionCompat$RegistrationCallback);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void setRepeatMode(int n3) {
        int n4 = this.mRepeatMode;
        if (n4 != n3) {
            this.mRepeatMode = n3;
            this.sendRepeatMode(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSessionActivity(PendingIntent pendingIntent) {
        Object object = this.mLock;
        synchronized (object) {
            this.mSessionActivity = pendingIntent;
            return;
        }
    }

    public void setShuffleMode(int n3) {
        int n4 = this.mShuffleMode;
        if (n4 != n3) {
            this.mShuffleMode = n3;
            this.sendShuffleMode(n3);
        }
    }

    public void setVolumeTo(int n3, int n4) {
        int n7 = this.mVolumeType;
        int n8 = 2;
        if (n7 != n8) {
            AudioManager audioManager = this.mAudioManager;
            n8 = this.mLocalStream;
            audioManager.setStreamVolume(n8, n3, n4);
        }
    }

    public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);
    }

    public void updateMbrAndRcc() {
        boolean bl2 = this.mIsActive;
        if (bl2) {
            Object object = this.mMediaButtonReceiverIntent;
            ComponentName componentName = this.mMediaButtonReceiverComponentName;
            this.registerMediaButtonEventReceiver((PendingIntent)object, componentName);
            object = this.mAudioManager;
            componentName = this.mRcc;
            object.registerRemoteControlClient((RemoteControlClient)componentName);
            object = this.mMetadata;
            this.setMetadata((MediaMetadataCompat)object);
            object = this.mState;
            this.setPlaybackState((PlaybackStateCompat)object);
        } else {
            PendingIntent pendingIntent = this.mMediaButtonReceiverIntent;
            ComponentName componentName = this.mMediaButtonReceiverComponentName;
            this.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
            this.mRcc.setPlaybackState(0);
            pendingIntent = this.mAudioManager;
            componentName = this.mRcc;
            pendingIntent.unregisterRemoteControlClient((RemoteControlClient)componentName);
        }
    }
}

