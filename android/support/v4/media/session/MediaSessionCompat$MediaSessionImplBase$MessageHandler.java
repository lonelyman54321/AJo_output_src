/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 *  android.view.KeyEvent
 */
package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$Command;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;

class MediaSessionCompat$MediaSessionImplBase$MessageHandler
extends Handler {
    private static final int KEYCODE_MEDIA_PAUSE = 127;
    private static final int KEYCODE_MEDIA_PLAY = 126;
    private static final int MSG_ADD_QUEUE_ITEM = 25;
    private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
    private static final int MSG_ADJUST_VOLUME = 2;
    private static final int MSG_COMMAND = 1;
    private static final int MSG_CUSTOM_ACTION = 20;
    private static final int MSG_FAST_FORWARD = 16;
    private static final int MSG_MEDIA_BUTTON = 21;
    private static final int MSG_NEXT = 14;
    private static final int MSG_PAUSE = 12;
    private static final int MSG_PLAY = 7;
    private static final int MSG_PLAY_MEDIA_ID = 8;
    private static final int MSG_PLAY_SEARCH = 9;
    private static final int MSG_PLAY_URI = 10;
    private static final int MSG_PREPARE = 3;
    private static final int MSG_PREPARE_MEDIA_ID = 4;
    private static final int MSG_PREPARE_SEARCH = 5;
    private static final int MSG_PREPARE_URI = 6;
    private static final int MSG_PREVIOUS = 15;
    private static final int MSG_RATE = 19;
    private static final int MSG_RATE_EXTRA = 31;
    private static final int MSG_REMOVE_QUEUE_ITEM = 27;
    private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
    private static final int MSG_REWIND = 17;
    private static final int MSG_SEEK_TO = 18;
    private static final int MSG_SET_CAPTIONING_ENABLED = 29;
    private static final int MSG_SET_PLAYBACK_SPEED = 32;
    private static final int MSG_SET_REPEAT_MODE = 23;
    private static final int MSG_SET_SHUFFLE_MODE = 30;
    private static final int MSG_SET_VOLUME = 22;
    private static final int MSG_SKIP_TO_ITEM = 11;
    private static final int MSG_STOP = 13;
    final /* synthetic */ MediaSessionCompat$MediaSessionImplBase this$0;

    public MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase, Looper looper) {
        this.this$0 = mediaSessionCompat$MediaSessionImplBase;
        super(looper);
    }

    private void onMediaButtonEvent(KeyEvent keyEvent, MediaSessionCompat$Callback mediaSessionCompat$Callback) {
        block14: {
            int n3;
            long l2;
            block15: {
                block16: {
                    int n4;
                    if (keyEvent == null || (n4 = keyEvent.getAction()) != 0) break block14;
                    PlaybackStateCompat playbackStateCompat = this.this$0.mState;
                    l2 = 0L;
                    long l3 = playbackStateCompat == null ? l2 : playbackStateCompat.getActions();
                    n3 = keyEvent.getKeyCode();
                    if (n3 == (n4 = 126)) break block15;
                    n4 = 127;
                    if (n3 == n4) break block16;
                    switch (n3) {
                        default: {
                            break;
                        }
                        case 90: {
                            long l4 = 64;
                            long l7 = (l3 &= l4) - l2;
                            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                            if (n3 != 0) {
                                mediaSessionCompat$Callback.onFastForward();
                                break;
                            }
                            break block14;
                        }
                        case 89: {
                            long l8 = 8;
                            long l12 = (l3 &= l8) - l2;
                            n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
                            if (n3 != 0) {
                                mediaSessionCompat$Callback.onRewind();
                                break;
                            }
                            break block14;
                        }
                        case 88: {
                            long l14 = 16;
                            long l15 = (l3 &= l14) - l2;
                            n3 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                            if (n3 != 0) {
                                mediaSessionCompat$Callback.onSkipToPrevious();
                                break;
                            }
                            break block14;
                        }
                        case 87: {
                            long l16 = 32;
                            long l17 = (l3 &= l16) - l2;
                            n3 = (int)(l17 == 0L ? 0 : (l17 < 0L ? -1 : 1));
                            if (n3 != 0) {
                                mediaSessionCompat$Callback.onSkipToNext();
                                break;
                            }
                            break block14;
                        }
                        case 86: {
                            long l18 = 1L;
                            long l19 = (l3 &= l18) - l2;
                            n3 = (int)(l19 == 0L ? 0 : (l19 < 0L ? -1 : 1));
                            if (n3 != 0) {
                                mediaSessionCompat$Callback.onStop();
                                break;
                            }
                            break block14;
                        }
                    }
                    break block14;
                }
                long l20 = 2;
                long l21 = (l3 &= l20) - l2;
                n3 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1));
                if (n3 != 0) {
                    mediaSessionCompat$Callback.onPause();
                }
                break block14;
            }
            long l22 = 4;
            long l23 = (l3 &= l22) - l2;
            n3 = (int)(l23 == 0L ? 0 : (l23 < 0L ? -1 : 1));
            if (n3 != 0) {
                mediaSessionCompat$Callback.onPlay();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleMessage(Message object) {
        Throwable throwable2;
        block39: {
            int n3;
            Object object2 = this.this$0.mCallback;
            if (object2 == null) {
                return;
            }
            Object object3 = object.getData();
            MediaSessionCompat.ensureClassLoader((Bundle)object3);
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.this$0;
            String string2 = object3.getString("data_calling_pkg");
            String string3 = "data_calling_pid";
            int n4 = object3.getInt(string3);
            String string4 = "data_calling_uid";
            int n7 = object3.getInt(string4);
            Object object4 = new fn1_0(string2, n4, n7);
            mediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo((fn1_0)object4);
            object3 = object3.getBundle("data_extras");
            MediaSessionCompat.ensureClassLoader((Bundle)object3);
            mediaSessionCompat$MediaSessionImplBase = null;
            try {
                n3 = object.what;
                string2 = null;
            }
            catch (Throwable throwable2) {
                break block39;
            }
            switch (n3) {
                default: {
                    break;
                }
                case 32: {
                    object = object.obj;
                    object = (Float)object;
                    float f5 = object.floatValue();
                    ((MediaSessionCompat$Callback)object2).onSetPlaybackSpeed(f5);
                    break;
                }
                case 31: {
                    object = object.obj;
                    object = (RatingCompat)object;
                    ((MediaSessionCompat$Callback)object2).onSetRating((RatingCompat)object, (Bundle)object3);
                    break;
                }
                case 30: {
                    int n8 = object.arg1;
                    ((MediaSessionCompat$Callback)object2).onSetShuffleMode(n8);
                    break;
                }
                case 29: {
                    object = object.obj;
                    object = (Boolean)object;
                    boolean bl2 = object.booleanValue();
                    ((MediaSessionCompat$Callback)object2).onSetCaptioningEnabled(bl2);
                    break;
                }
                case 28: {
                    int n10;
                    object3 = this.this$0;
                    object3 = ((MediaSessionCompat$MediaSessionImplBase)object3).mQueue;
                    if (object3 == null) break;
                    n3 = object.arg1;
                    if (n3 >= 0 && n3 < (n10 = object3.size())) {
                        object3 = this.this$0;
                        object3 = ((MediaSessionCompat$MediaSessionImplBase)object3).mQueue;
                        int n14 = object.arg1;
                        object = object3.get(n14);
                        object = (MediaSessionCompat$QueueItem)object;
                    } else {
                        boolean bl3 = false;
                        object = null;
                        float f6 = 0.0f;
                    }
                    if (object == null) break;
                    object = object.getDescription();
                    ((MediaSessionCompat$Callback)object2).onRemoveQueueItem((MediaDescriptionCompat)object);
                    break;
                }
                case 27: {
                    object = object.obj;
                    object = (MediaDescriptionCompat)object;
                    ((MediaSessionCompat$Callback)object2).onRemoveQueueItem((MediaDescriptionCompat)object);
                    break;
                }
                case 26: {
                    object3 = object.obj;
                    object3 = (MediaDescriptionCompat)object3;
                    int n15 = object.arg1;
                    ((MediaSessionCompat$Callback)object2).onAddQueueItem((MediaDescriptionCompat)object3, n15);
                    break;
                }
                case 25: {
                    object = object.obj;
                    object = (MediaDescriptionCompat)object;
                    ((MediaSessionCompat$Callback)object2).onAddQueueItem((MediaDescriptionCompat)object);
                    break;
                }
                case 23: {
                    int n16 = object.arg1;
                    ((MediaSessionCompat$Callback)object2).onSetRepeatMode(n16);
                    break;
                }
                case 22: {
                    object2 = this.this$0;
                    int n17 = object.arg1;
                    ((MediaSessionCompat$MediaSessionImplBase)object2).setVolumeTo(n17, 0);
                    break;
                }
                case 21: {
                    object = object.obj;
                    object = (KeyEvent)object;
                    object4 = "android.intent.action.MEDIA_BUTTON";
                    object3 = new Intent((String)object4);
                    object4 = "android.intent.extra.KEY_EVENT";
                    object3.putExtra((String)object4, (Parcelable)object);
                    boolean bl4 = ((MediaSessionCompat$Callback)object2).onMediaButtonEvent((Intent)object3);
                    if (bl4) break;
                    this.onMediaButtonEvent((KeyEvent)object, (MediaSessionCompat$Callback)object2);
                    break;
                }
                case 20: {
                    object = object.obj;
                    object = (String)object;
                    ((MediaSessionCompat$Callback)object2).onCustomAction((String)object, (Bundle)object3);
                    break;
                }
                case 19: {
                    object = object.obj;
                    object = (RatingCompat)object;
                    ((MediaSessionCompat$Callback)object2).onSetRating((RatingCompat)object);
                    break;
                }
                case 18: {
                    object = object.obj;
                    object = (Long)object;
                    long l2 = object.longValue();
                    ((MediaSessionCompat$Callback)object2).onSeekTo(l2);
                    break;
                }
                case 17: {
                    ((MediaSessionCompat$Callback)object2).onRewind();
                    break;
                }
                case 16: {
                    ((MediaSessionCompat$Callback)object2).onFastForward();
                    break;
                }
                case 15: {
                    ((MediaSessionCompat$Callback)object2).onSkipToPrevious();
                    break;
                }
                case 14: {
                    ((MediaSessionCompat$Callback)object2).onSkipToNext();
                    break;
                }
                case 13: {
                    ((MediaSessionCompat$Callback)object2).onStop();
                    break;
                }
                case 12: {
                    ((MediaSessionCompat$Callback)object2).onPause();
                    break;
                }
                case 11: {
                    object = object.obj;
                    object = (Long)object;
                    long l3 = object.longValue();
                    ((MediaSessionCompat$Callback)object2).onSkipToQueueItem(l3);
                    break;
                }
                case 10: {
                    object = object.obj;
                    object = (Uri)object;
                    ((MediaSessionCompat$Callback)object2).onPlayFromUri((Uri)object, (Bundle)object3);
                    break;
                }
                case 9: {
                    object = object.obj;
                    object = (String)object;
                    ((MediaSessionCompat$Callback)object2).onPlayFromSearch((String)object, (Bundle)object3);
                    break;
                }
                case 8: {
                    object = object.obj;
                    object = (String)object;
                    ((MediaSessionCompat$Callback)object2).onPlayFromMediaId((String)object, (Bundle)object3);
                    break;
                }
                case 7: {
                    ((MediaSessionCompat$Callback)object2).onPlay();
                    break;
                }
                case 6: {
                    object = object.obj;
                    object = (Uri)object;
                    ((MediaSessionCompat$Callback)object2).onPrepareFromUri((Uri)object, (Bundle)object3);
                    break;
                }
                case 5: {
                    object = object.obj;
                    object = (String)object;
                    ((MediaSessionCompat$Callback)object2).onPrepareFromSearch((String)object, (Bundle)object3);
                    break;
                }
                case 4: {
                    object = object.obj;
                    object = (String)object;
                    ((MediaSessionCompat$Callback)object2).onPrepareFromMediaId((String)object, (Bundle)object3);
                    break;
                }
                case 3: {
                    ((MediaSessionCompat$Callback)object2).onPrepare();
                    break;
                }
                case 2: {
                    object2 = this.this$0;
                    int n18 = object.arg1;
                    ((MediaSessionCompat$MediaSessionImplBase)object2).adjustVolume(n18, 0);
                    break;
                }
                case 1: {
                    object = object.obj;
                    object = (MediaSessionCompat$MediaSessionImplBase$Command)object;
                    object3 = object.command;
                    object4 = object.extras;
                    object = object.stub;
                    ((MediaSessionCompat$Callback)object2).onCommand((String)object3, (Bundle)object4, (ResultReceiver)object);
                }
            }
            this.this$0.setCurrentControllerInfo(null);
            return;
        }
        this.this$0.setCurrentControllerInfo(null);
        throw throwable2;
    }
}

