/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  android.os.BadParcelableException
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat$1;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi22;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi28;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi29;
import android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallback;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat$Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.media.session.MediaButtonReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
    private static final String DATA_CALLING_PID = "data_calling_pid";
    private static final String DATA_CALLING_UID = "data_calling_uid";
    private static final String DATA_EXTRAS = "data_extras";
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    public static final String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    private static final int MAX_BITMAP_SIZE_IN_DP = 320;
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    static final String TAG = "MediaSessionCompat";
    static int sMaxBitmapSize;
    private final ArrayList mActiveListeners;
    private final MediaControllerCompat mController;
    private final MediaSessionCompat$MediaSessionImpl mImpl;

    private MediaSessionCompat(Context context, MediaSessionCompat$MediaSessionImpl object) {
        ArrayList arrayList;
        this.mActiveListeners = arrayList = new ArrayList();
        this.mImpl = object;
        this.mController = object = new MediaControllerCompat(context, this);
    }

    public MediaSessionCompat(Context context, String string2) {
        this(context, string2, null, null);
    }

    public MediaSessionCompat(Context context, String string2, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, string2, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String string2, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, string2, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context object, String object2, ComponentName object3, PendingIntent pendingIntent, Bundle bundle, qB3 qB32) {
        ArrayList arrayList;
        this.mActiveListeners = arrayList = new ArrayList();
        if (object != null) {
            int n3 = TextUtils.isEmpty((CharSequence)object2);
            if (n3 == 0) {
                int n4;
                int n7;
                n3 = 1;
                String string2 = "android.intent.action.MEDIA_BUTTON";
                if (object3 == null) {
                    n7 = MediaButtonReceiver.a;
                    super(string2);
                    String string3 = object.getPackageName();
                    object3.setPackage(string3);
                    string3 = object.getPackageManager();
                    object3 = string3.queryBroadcastReceivers((Intent)object3, 0);
                    int n8 = object3.size();
                    if (n8 == n3) {
                        object3 = (ResolveInfo)object3.get(0);
                        object3 = ((ResolveInfo)object3).activityInfo;
                        String string4 = ((ActivityInfo)object3).packageName;
                        object3 = ((ActivityInfo)object3).name;
                        super(string4, (String)object3);
                        object3 = string3;
                    } else {
                        object3.size();
                        n7 = 0;
                        object3 = null;
                    }
                }
                if (object3 != null && pendingIntent == null) {
                    super(string2);
                    pendingIntent.setComponent((ComponentName)object3);
                    n7 = Build.VERSION.SDK_INT;
                    n4 = 31;
                    if (n7 >= n4) {
                        n7 = 0x2000000;
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    pendingIntent = PendingIntent.getBroadcast((Context)object, (int)0, (Intent)pendingIntent, (int)n7);
                }
                if ((n7 = Build.VERSION.SDK_INT) >= (n4 = 29)) {
                    super((Context)object, (String)object2, qB32, bundle);
                    this.mImpl = object3;
                } else {
                    n4 = 28;
                    if (n7 >= n4) {
                        super((Context)object, (String)object2, qB32, bundle);
                        this.mImpl = object3;
                    } else {
                        n4 = 22;
                        this.mImpl = n7 >= n4 ? (object3 = new MediaSessionCompat$MediaSessionImplApi22((Context)object, (String)object2, qB32, bundle)) : (object3 = new MediaSessionCompat$MediaSessionImplApi21((Context)object, (String)object2, qB32, bundle));
                    }
                }
                object3 = Looper.myLooper();
                object3 = object3 != null ? Looper.myLooper() : Looper.getMainLooper();
                super((Looper)object3);
                object3 = new MediaSessionCompat$1(this);
                this.setCallback((MediaSessionCompat$Callback)object3, (Handler)object2);
                this.mImpl.setMediaButtonReceiver(pendingIntent);
                this.mController = object2 = new MediaControllerCompat((Context)object, this);
                int n10 = sMaxBitmapSize;
                if (n10 == 0) {
                    int n14;
                    object = object.getResources().getDisplayMetrics();
                    float f5 = TypedValue.applyDimension((int)n3, (float)320.0f, (DisplayMetrics)object);
                    n10 = 0x3F000000;
                    float f6 = 0.5f;
                    sMaxBitmapSize = n14 = (int)(f5 += f6);
                }
                return;
            }
            super("tag must not be null or empty");
            throw object;
        }
        super("context must not be null");
        throw object;
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = MediaSessionCompat.class.getClassLoader();
            bundle.setClassLoader(classLoader);
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object object) {
        int n3 = Build.VERSION.SDK_INT;
        if (context != null && object != null) {
            int n4 = 29;
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = n3 >= n4 ? new MediaSessionCompat$MediaSessionImplApi29(object) : (n3 >= (n4 = 28) ? new MediaSessionCompat$MediaSessionImplApi28(object) : new MediaSessionCompat$MediaSessionImplApi21(object));
            object = new MediaSessionCompat(context, mediaSessionCompat$MediaSessionImplApi21);
            return object;
        }
        return null;
    }

    public static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long l2;
        long l3;
        long l4;
        int n3;
        int n4;
        long l7;
        long l8;
        long l12;
        long l14;
        if (playbackStateCompat != null && (l14 = (l12 = (l8 = playbackStateCompat.getPosition()) - (l7 = (long)-1)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false && ((n4 = playbackStateCompat.getState()) == (n3 = 3) || (n4 = playbackStateCompat.getState()) == (n3 = 4) || (n4 = playbackStateCompat.getState()) == (n3 = 5)) && (l4 = (l3 = (l8 = playbackStateCompat.getLastPositionUpdateTime()) - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            long l15;
            String string2;
            long l16 = SystemClock.elapsedRealtime();
            float f5 = playbackStateCompat.getPlaybackSpeed();
            float f6 = l16 - l8;
            l8 = (long)(f5 *= f6);
            long l17 = playbackStateCompat.getPosition() + l8;
            if (mediaMetadataCompat != null && (n3 = (int)(mediaMetadataCompat.containsKey(string2 = "android.media.metadata.DURATION") ? 1 : 0)) != 0) {
                l7 = mediaMetadataCompat.getLong(string2);
            }
            long l18 = (l15 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1)) >= 0 && (l15 = l17 == l7 ? 0 : (l17 < l7 ? -1 : 1)) > 0 ? l7 : ((l15 = l17 == l2 ? 0 : (l17 < l2 ? -1 : 1)) < 0 ? l2 : l17);
            PlaybackStateCompat$Builder playbackStateCompat$Builder = new PlaybackStateCompat$Builder(playbackStateCompat);
            int n7 = playbackStateCompat.getState();
            float f7 = playbackStateCompat.getPlaybackSpeed();
            playbackStateCompat = playbackStateCompat$Builder.setState(n7, l18, f7, l16).build();
        }
        return playbackStateCompat;
    }

    public static Bundle unparcelWithClassLoader(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        }
        catch (BadParcelableException badParcelableException) {
            return null;
        }
    }

    public void addOnActiveChangeListener(MediaSessionCompat$OnActiveChangeListener object) {
        if (object != null) {
            this.mActiveListeners.add(object);
            return;
        }
        object = new IllegalArgumentException("Listener may not be null");
        throw object;
    }

    public String getCallingPackage() {
        return this.mImpl.getCallingPackage();
    }

    public MediaControllerCompat getController() {
        return this.mController;
    }

    public final fn1_0 getCurrentControllerInfo() {
        return this.mImpl.getCurrentControllerInfo();
    }

    public Object getMediaSession() {
        return this.mImpl.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.mImpl.getRemoteControlClient();
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isActive() {
        return this.mImpl.isActive();
    }

    public void release() {
        this.mImpl.release();
    }

    public void removeOnActiveChangeListener(MediaSessionCompat$OnActiveChangeListener object) {
        if (object != null) {
            this.mActiveListeners.remove(object);
            return;
        }
        object = new IllegalArgumentException("Listener may not be null");
        throw object;
    }

    public void sendSessionEvent(String object, Bundle bundle) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            this.mImpl.sendSessionEvent((String)object, bundle);
            return;
        }
        object = new IllegalArgumentException("event cannot be null or empty");
        throw object;
    }

    public void setActive(boolean bl2) {
        boolean bl3;
        Object object = this.mImpl;
        object.setActive(bl2);
        Iterator iterator = this.mActiveListeners.iterator();
        while (bl3 = iterator.hasNext()) {
            object = (MediaSessionCompat$OnActiveChangeListener)iterator.next();
            object.onActiveChanged();
        }
    }

    public void setCallback(MediaSessionCompat$Callback mediaSessionCompat$Callback) {
        this.setCallback(mediaSessionCompat$Callback, null);
    }

    public void setCallback(MediaSessionCompat$Callback object, Handler handler) {
        if (object == null) {
            object = this.mImpl;
            handler = null;
            object.setCallback(null, null);
        } else {
            MediaSessionCompat$MediaSessionImpl mediaSessionCompat$MediaSessionImpl = this.mImpl;
            if (handler == null) {
                handler = new Handler();
            }
            mediaSessionCompat$MediaSessionImpl.setCallback((MediaSessionCompat$Callback)object, handler);
        }
    }

    public void setCaptioningEnabled(boolean bl2) {
        this.mImpl.setCaptioningEnabled(bl2);
    }

    public void setExtras(Bundle bundle) {
        this.mImpl.setExtras(bundle);
    }

    public void setFlags(int n3) {
        this.mImpl.setFlags(n3);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mImpl.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mImpl.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.mImpl.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(int n3) {
        this.mImpl.setPlaybackToLocal(n3);
    }

    public void setPlaybackToRemote(HE3 object) {
        object = new IllegalArgumentException("volumeProvider may not be null!");
        throw object;
    }

    public void setQueue(List object) {
        if (object != null) {
            boolean bl2;
            HashSet<Object> hashSet = new HashSet<Object>();
            Iterator iterator = object.iterator();
            while (bl2 = iterator.hasNext()) {
                Object object2 = (MediaSessionCompat$QueueItem)iterator.next();
                if (object2 != null) {
                    long l2 = ((MediaSessionCompat$QueueItem)object2).getQueueId();
                    Serializable serializable = l2;
                    boolean bl3 = hashSet.contains(serializable);
                    if (bl3) {
                        ((MediaSessionCompat$QueueItem)object2).getQueueId();
                        String string2 = "id of each queue item should be unique";
                        serializable = new IllegalArgumentException(string2);
                    }
                    long l3 = ((MediaSessionCompat$QueueItem)object2).getQueueId();
                    object2 = l3;
                    hashSet.add(object2);
                    continue;
                }
                object = new IllegalArgumentException("queue shouldn't have null items");
                throw object;
            }
        }
        this.mImpl.setQueue((List)object);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mImpl.setQueueTitle(charSequence);
    }

    public void setRatingType(int n3) {
        this.mImpl.setRatingType(n3);
    }

    public void setRegistrationCallback(MediaSessionCompat$RegistrationCallback mediaSessionCompat$RegistrationCallback, Handler handler) {
        this.mImpl.setRegistrationCallback(mediaSessionCompat$RegistrationCallback, handler);
    }

    public void setRepeatMode(int n3) {
        this.mImpl.setRepeatMode(n3);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mImpl.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int n3) {
        this.mImpl.setShuffleMode(n3);
    }
}

