/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.media.Rating
 *  android.media.session.MediaSession$Callback
 *  android.net.Uri
 *  android.os.BadParcelableException
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 *  android.text.TextUtils
 */
package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.Reference;

class MediaSessionCompat$Callback$MediaSessionCallbackApi21
extends MediaSession.Callback {
    final /* synthetic */ MediaSessionCompat$Callback this$0;

    public MediaSessionCompat$Callback$MediaSessionCallbackApi21(MediaSessionCompat$Callback mediaSessionCompat$Callback) {
        this.this$0 = mediaSessionCompat$Callback;
    }

    private void clearCurrentControllerInfo(MediaSessionCompat$MediaSessionImpl mediaSessionCompat$MediaSessionImpl) {
        mediaSessionCompat$MediaSessionImpl.setCurrentControllerInfo(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private MediaSessionCompat$MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {
        Object object;
        Object object2 = this.this$0.mLock;
        synchronized (object2) {
            object = this.this$0;
            object = ((MediaSessionCompat$Callback)object).mSessionImpl;
            object = ((Reference)object).get();
            object = (MediaSessionCompat$MediaSessionImplApi21)object;
        }
        if (object == null) return null;
        object2 = this.this$0;
        MediaSessionCompat$Callback mediaSessionCompat$Callback = ((MediaSessionCompat$MediaSessionImplApi21)object).getCallback();
        if (object2 != mediaSessionCompat$Callback) return null;
        return object;
    }

    private void setCurrentControllerInfo(MediaSessionCompat$MediaSessionImpl mediaSessionCompat$MediaSessionImpl) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return;
        }
        String string2 = mediaSessionCompat$MediaSessionImpl.getCallingPackage();
        n4 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n4 != 0) {
            string2 = "android.media.session.MediaController";
        }
        int n7 = -1;
        fn1_0 fn1_02 = new fn1_0(string2, n7, n7);
        mediaSessionCompat$MediaSessionImpl.setCurrentControllerInfo(fn1_02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCommand(String object, Bundle object2, ResultReceiver object3) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21;
        block12: {
            mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
            if (mediaSessionCompat$MediaSessionImplApi21 == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader((Bundle)object2);
            this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
            Object object4 = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
            try {
                boolean bl2 = ((String)object).equals(object4);
                Object object5 = null;
                if (bl2) {
                    object = new Bundle();
                    object2 = mediaSessionCompat$MediaSessionImplApi21.getSessionToken();
                    object4 = ((MediaSessionCompat$Token)object2).getExtraBinder();
                    String string2 = "android.support.v4.media.session.EXTRA_BINDER";
                    if (object4 != null) {
                        object5 = object4.asBinder();
                    }
                    object.putBinder(string2, (IBinder)object5);
                    object2 = ((MediaSessionCompat$Token)object2).getSession2Token();
                    if (object2 != null) {
                        object4 = new Bundle();
                        object5 = new ParcelImpl((qB3)object2);
                        object2 = "a";
                        object4.putParcelable((String)object2, (Parcelable)object5);
                        object2 = "android.support.v4.media.session.SESSION_TOKEN2";
                        object.putParcelable((String)object2, (Parcelable)object4);
                    }
                    boolean bl3 = false;
                    object2 = null;
                    object3.send(0, (Bundle)object);
                    break block12;
                }
                object4 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
                bl2 = ((String)object).equals(object4);
                String string3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
                if (bl2) {
                    object = this.this$0;
                    object2 = object2.getParcelable(string3);
                    object2 = (MediaDescriptionCompat)object2;
                    ((MediaSessionCompat$Callback)object).onAddQueueItem((MediaDescriptionCompat)object2);
                    break block12;
                }
                object4 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
                bl2 = ((String)object).equals(object4);
                String string4 = "android.support.v4.media.session.command.ARGUMENT_INDEX";
                if (bl2) {
                    object = this.this$0;
                    Parcelable parcelable = object2.getParcelable(string3);
                    MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat)parcelable;
                    int n3 = object2.getInt(string4);
                    ((MediaSessionCompat$Callback)object).onAddQueueItem(mediaDescriptionCompat, n3);
                    break block12;
                }
                object4 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
                bl2 = ((String)object).equals(object4);
                if (bl2) {
                    object = this.this$0;
                    object2 = object2.getParcelable(string3);
                    object2 = (MediaDescriptionCompat)object2;
                    ((MediaSessionCompat$Callback)object).onRemoveQueueItem((MediaDescriptionCompat)object2);
                    break block12;
                }
                object4 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
                bl2 = ((String)object).equals(object4);
                if (bl2) {
                    int n4;
                    object = mediaSessionCompat$MediaSessionImplApi21.mQueue;
                    if (object == null) break block12;
                    int n7 = -1;
                    if ((n7 = object2.getInt(string4, n7)) >= 0 && n7 < (n4 = (object2 = mediaSessionCompat$MediaSessionImplApi21.mQueue).size())) {
                        object2 = mediaSessionCompat$MediaSessionImplApi21.mQueue;
                        object5 = object = object2.get(n7);
                        object5 = (MediaSessionCompat$QueueItem)object;
                    }
                    if (object5 != null) {
                        object = this.this$0;
                        object2 = ((MediaSessionCompat$QueueItem)object5).getDescription();
                        ((MediaSessionCompat$Callback)object).onRemoveQueueItem((MediaDescriptionCompat)object2);
                    }
                    break block12;
                }
                object4 = this.this$0;
                ((MediaSessionCompat$Callback)object4).onCommand((String)object, (Bundle)object2, (ResultReceiver)object3);
            }
            catch (BadParcelableException badParcelableException) {}
        }
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCustomAction(String object, Bundle object2) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21;
        block14: {
            mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
            if (mediaSessionCompat$MediaSessionImplApi21 == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader((Bundle)object2);
            this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
            Object object3 = "android.support.v4.media.session.action.PLAY_FROM_URI";
            try {
                int n3 = ((String)object).equals(object3);
                String string2 = "android.support.v4.media.session.action.ARGUMENT_URI";
                String string3 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
                if (n3 != 0) {
                    object = object2.getParcelable(string2);
                    object = (Uri)object;
                    object2 = object2.getBundle(string3);
                    MediaSessionCompat.ensureClassLoader((Bundle)object2);
                    object3 = this.this$0;
                    ((MediaSessionCompat$Callback)object3).onPlayFromUri((Uri)object, (Bundle)object2);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.PREPARE";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = this.this$0;
                    ((MediaSessionCompat$Callback)object).onPrepare();
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
                    object = object2.getString((String)object);
                    object2 = object2.getBundle(string3);
                    MediaSessionCompat.ensureClassLoader((Bundle)object2);
                    object3 = this.this$0;
                    ((MediaSessionCompat$Callback)object3).onPrepareFromMediaId((String)object, (Bundle)object2);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = "android.support.v4.media.session.action.ARGUMENT_QUERY";
                    object = object2.getString((String)object);
                    object2 = object2.getBundle(string3);
                    MediaSessionCompat.ensureClassLoader((Bundle)object2);
                    object3 = this.this$0;
                    ((MediaSessionCompat$Callback)object3).onPrepareFromSearch((String)object, (Bundle)object2);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.PREPARE_FROM_URI";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = object2.getParcelable(string2);
                    object = (Uri)object;
                    object2 = object2.getBundle(string3);
                    MediaSessionCompat.ensureClassLoader((Bundle)object2);
                    object3 = this.this$0;
                    ((MediaSessionCompat$Callback)object3).onPrepareFromUri((Uri)object, (Bundle)object2);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
                    boolean bl2 = object2.getBoolean((String)object);
                    object2 = this.this$0;
                    ((MediaSessionCompat$Callback)object2).onSetCaptioningEnabled(bl2);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.SET_REPEAT_MODE";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
                    int n4 = object2.getInt((String)object);
                    object2 = this.this$0;
                    ((MediaSessionCompat$Callback)object2).onSetRepeatMode(n4);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
                    int n7 = object2.getInt((String)object);
                    object2 = this.this$0;
                    ((MediaSessionCompat$Callback)object2).onSetShuffleMode(n7);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.SET_RATING";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = "android.support.v4.media.session.action.ARGUMENT_RATING";
                    object = object2.getParcelable((String)object);
                    object = (RatingCompat)object;
                    object2 = object2.getBundle(string3);
                    MediaSessionCompat.ensureClassLoader((Bundle)object2);
                    object3 = this.this$0;
                    ((MediaSessionCompat$Callback)object3).onSetRating((RatingCompat)object, (Bundle)object2);
                    break block14;
                }
                object3 = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
                n3 = ((String)object).equals(object3);
                if (n3 != 0) {
                    object = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
                    n3 = 1065353216;
                    float f5 = 1.0f;
                    float f6 = object2.getFloat((String)object, f5);
                    object2 = this.this$0;
                    ((MediaSessionCompat$Callback)object2).onSetPlaybackSpeed(f6);
                } else {
                    object3 = this.this$0;
                    ((MediaSessionCompat$Callback)object3).onCustomAction((String)object, (Bundle)object2);
                }
            }
            catch (BadParcelableException badParcelableException) {}
        }
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onFastForward() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onFastForward();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public boolean onMediaButtonEvent(Intent intent) {
        boolean bl2;
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        boolean bl3 = false;
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return false;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        MediaSessionCompat$Callback mediaSessionCompat$Callback = this.this$0;
        boolean bl4 = mediaSessionCompat$Callback.onMediaButtonEvent(intent);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        if (bl4 || (bl2 = super.onMediaButtonEvent(intent))) {
            bl3 = true;
        }
        return bl3;
    }

    public void onPause() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPause();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPlay() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPlay();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPlayFromMediaId(String string2, Bundle bundle) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPlayFromMediaId(string2, bundle);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPlayFromSearch(String string2, Bundle bundle) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPlayFromSearch(string2, bundle);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPlayFromUri(uri, bundle);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPrepare() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPrepare();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPrepareFromMediaId(String string2, Bundle bundle) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPrepareFromMediaId(string2, bundle);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPrepareFromSearch(String string2, Bundle bundle) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPrepareFromSearch(string2, bundle);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onPrepareFromUri(uri, bundle);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onRewind() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onRewind();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onSeekTo(long l2) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onSeekTo(l2);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onSetPlaybackSpeed(float f5) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onSetPlaybackSpeed(f5);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onSetRating(Rating object) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        MediaSessionCompat$Callback mediaSessionCompat$Callback = this.this$0;
        object = RatingCompat.fromRating(object);
        mediaSessionCompat$Callback.onSetRating((RatingCompat)object);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onSkipToNext() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onSkipToNext();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onSkipToPrevious() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onSkipToPrevious();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onSkipToQueueItem(long l2) {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onSkipToQueueItem(l2);
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void onStop() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.getSessionImplIfCallbackIsSet();
        if (mediaSessionCompat$MediaSessionImplApi21 == null) {
            return;
        }
        this.setCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
        this.this$0.onStop();
        this.clearCurrentControllerInfo(mediaSessionCompat$MediaSessionImplApi21);
    }
}

