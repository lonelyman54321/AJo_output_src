/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 */
package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat$Callback;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi29;
import android.support.v4.media.session.MediaControllerCompat$PlaybackInfo;
import android.support.v4.media.session.MediaControllerCompat$TransportControls;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.media.R$id;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MediaControllerCompat {
    public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    static final String TAG = "MediaControllerCompat";
    private final MediaControllerCompat$MediaControllerImpl mImpl;
    private final Set mRegisteredCallbacks;
    private final MediaSessionCompat$Token mToken;

    public MediaControllerCompat(Context object, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token != null) {
            Object object2 = new HashSet();
            object2 = Collections.synchronizedSet(object2);
            this.mRegisteredCallbacks = object2;
            this.mToken = mediaSessionCompat$Token;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 29;
            this.mImpl = n3 >= n4 ? (object2 = new MediaControllerCompat$MediaControllerImplApi29((Context)object, mediaSessionCompat$Token)) : (object2 = new MediaControllerCompat$MediaControllerImplApi21((Context)object, mediaSessionCompat$Token));
            return;
        }
        super("sessionToken must not be null");
        throw object;
    }

    public MediaControllerCompat(Context context, MediaSessionCompat object) {
        object = ((MediaSessionCompat)object).getSessionToken();
        this(context, (MediaSessionCompat$Token)object);
    }

    public static MediaControllerCompat getMediaController(Activity activity) {
        Object object = activity.getWindow().getDecorView();
        int n3 = R$id.media_controller_compat_view_tag;
        if ((n3 = (object = object.getTag(n3)) instanceof MediaControllerCompat) != 0) {
            return (MediaControllerCompat)object;
        }
        return MediaControllerCompat$MediaControllerImplApi21.getMediaController(activity);
    }

    public static void setMediaController(Activity activity, MediaControllerCompat mediaControllerCompat) {
        View view = activity.getWindow().getDecorView();
        int n3 = R$id.media_controller_compat_view_tag;
        view.setTag(n3, (Object)mediaControllerCompat);
        MediaControllerCompat$MediaControllerImplApi21.setMediaController(activity, mediaControllerCompat);
    }

    public static void validateCustomAction(String string2, Bundle object) {
        boolean bl2;
        if (string2 == null) {
            return;
        }
        String string3 = "android.support.v4.media.session.action.FOLLOW";
        boolean bl3 = string2.equals(string3);
        if (!bl3 && !(bl3 = string2.equals(string3 = "android.support.v4.media.session.action.UNFOLLOW")) || object != null && (bl2 = object.containsKey(string3 = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"))) {
            return;
        }
        string2 = cP.a("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", string2, ".");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.addQueueItem(mediaDescriptionCompat);
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int n3) {
        this.mImpl.addQueueItem(mediaDescriptionCompat, n3);
    }

    public void adjustVolume(int n3, int n4) {
        this.mImpl.adjustVolume(n3, n4);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent object) {
        if (object != null) {
            return this.mImpl.dispatchMediaButtonEvent((KeyEvent)object);
        }
        object = new IllegalArgumentException("KeyEvent may not be null");
        throw object;
    }

    public Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public long getFlags() {
        return this.mImpl.getFlags();
    }

    public Object getMediaController() {
        return this.mImpl.getMediaController();
    }

    public MediaMetadataCompat getMetadata() {
        return this.mImpl.getMetadata();
    }

    public String getPackageName() {
        return this.mImpl.getPackageName();
    }

    public MediaControllerCompat$PlaybackInfo getPlaybackInfo() {
        return this.mImpl.getPlaybackInfo();
    }

    public PlaybackStateCompat getPlaybackState() {
        return this.mImpl.getPlaybackState();
    }

    public List getQueue() {
        return this.mImpl.getQueue();
    }

    public CharSequence getQueueTitle() {
        return this.mImpl.getQueueTitle();
    }

    public int getRatingType() {
        return this.mImpl.getRatingType();
    }

    public int getRepeatMode() {
        return this.mImpl.getRepeatMode();
    }

    public qB3 getSession2Token() {
        return this.mToken.getSession2Token();
    }

    public PendingIntent getSessionActivity() {
        return this.mImpl.getSessionActivity();
    }

    public Bundle getSessionInfo() {
        return this.mImpl.getSessionInfo();
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mToken;
    }

    public int getShuffleMode() {
        return this.mImpl.getShuffleMode();
    }

    public MediaControllerCompat$TransportControls getTransportControls() {
        return this.mImpl.getTransportControls();
    }

    public boolean isCaptioningEnabled() {
        return this.mImpl.isCaptioningEnabled();
    }

    public boolean isSessionReady() {
        return this.mImpl.isSessionReady();
    }

    public void registerCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
        this.registerCallback(mediaControllerCompat$Callback, null);
    }

    public void registerCallback(MediaControllerCompat$Callback object, Handler handler) {
        if (object != null) {
            Set set = this.mRegisteredCallbacks;
            boolean bl2 = set.add(object);
            if (!bl2) {
                return;
            }
            if (handler == null) {
                handler = new Handler();
            }
            ((MediaControllerCompat$Callback)object).setHandler(handler);
            this.mImpl.registerCallback((MediaControllerCompat$Callback)object, handler);
            return;
        }
        object = new IllegalArgumentException("callback must not be null");
        throw object;
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.removeQueueItem(mediaDescriptionCompat);
    }

    public void removeQueueItemAt(int n3) {
        Object object;
        int n4;
        List list = this.getQueue();
        if (list != null && n3 >= 0 && n3 < (n4 = list.size()) && (object = (MediaSessionCompat$QueueItem)list.get(n3)) != null) {
            object = object.getDescription();
            this.removeQueueItem((MediaDescriptionCompat)object);
        }
    }

    public void sendCommand(String object, Bundle bundle, ResultReceiver resultReceiver) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            this.mImpl.sendCommand((String)object, bundle, resultReceiver);
            return;
        }
        object = new IllegalArgumentException("command must neither be null nor empty");
        throw object;
    }

    public void setVolumeTo(int n3, int n4) {
        this.mImpl.setVolumeTo(n3, n4);
    }

    public void unregisterCallback(MediaControllerCompat$Callback object) {
        if (object != null) {
            Set set = this.mRegisteredCallbacks;
            boolean bl2 = set.remove(object);
            if (!bl2) {
                return;
            }
            bl2 = false;
            set = null;
            try {
                MediaControllerCompat$MediaControllerImpl mediaControllerCompat$MediaControllerImpl = this.mImpl;
                mediaControllerCompat$MediaControllerImpl.unregisterCallback((MediaControllerCompat$Callback)object);
                return;
            }
            finally {
                ((MediaControllerCompat$Callback)object).setHandler(null);
            }
        }
        object = new IllegalArgumentException("callback must not be null");
        throw object;
    }
}

