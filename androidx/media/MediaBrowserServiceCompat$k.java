/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.text.TextUtils
 */
package androidx.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8;
import androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$j;

public final class MediaBrowserServiceCompat$k
extends Handler {
    public MediaBrowserServiceCompat a;

    public final void a(Runnable runnable2) {
        Thread thread2;
        Thread thread3 = Thread.currentThread();
        if (thread3 == (thread2 = this.getLooper().getThread())) {
            runnable2.run();
        } else {
            this.post(runnable2);
        }
    }

    public final void handleMessage(Message message) {
        block17: {
            Object object;
            block18: {
                object = message;
                Object object2 = this.a;
                if (object2 == null) break block18;
                Object object3 = message.getData();
                int n3 = message.what;
                Object object4 = "data_callback_token";
                Object object5 = "data_calling_uid";
                String string2 = "data_calling_pid";
                String string3 = "data_package_name";
                String string4 = "data_root_hints";
                String string5 = "data_media_item_id";
                String string6 = "data_result_receiver";
                object2 = object2.b;
                switch (n3) {
                    default: {
                        message.toString();
                        break block17;
                    }
                    case 9: {
                        Bundle bundle = object3.getBundle("data_custom_action_extras");
                        MediaSessionCompat.ensureClassLoader(bundle);
                        String string7 = "data_custom_action";
                        String string8 = object3.getString(string7);
                        Object object6 = object3 = object3.getParcelable(string6);
                        object6 = (ResultReceiver)object3;
                        object = message.replyTo;
                        MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j = new MediaBrowserServiceCompat$j((Messenger)object);
                        ((Object)object2).getClass();
                        boolean bl2 = TextUtils.isEmpty((CharSequence)string8);
                        if (!bl2 && object6 != null) {
                            object = ((MediaBrowserServiceCompat$h)object2).a.f;
                            object3 = new MediaBrowserServiceCompat$ServiceBinderImpl$9((MediaBrowserServiceCompat$h)object2, mediaBrowserServiceCompat$j, string8, bundle, (ResultReceiver)object6);
                            ((MediaBrowserServiceCompat$k)((Object)object)).a((Runnable)object3);
                        }
                        break block17;
                    }
                    case 8: {
                        Bundle bundle = object3.getBundle("data_search_extras");
                        MediaSessionCompat.ensureClassLoader(bundle);
                        String string9 = "data_search_query";
                        String string10 = object3.getString(string9);
                        Object object7 = object3 = object3.getParcelable(string6);
                        object7 = (ResultReceiver)object3;
                        object = message.replyTo;
                        MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j = new MediaBrowserServiceCompat$j((Messenger)object);
                        ((Object)object2).getClass();
                        boolean bl3 = TextUtils.isEmpty((CharSequence)string10);
                        if (!bl3 && object7 != null) {
                            object = ((MediaBrowserServiceCompat$h)object2).a.f;
                            object3 = new MediaBrowserServiceCompat$ServiceBinderImpl$8((MediaBrowserServiceCompat$h)object2, mediaBrowserServiceCompat$j, string10, bundle, (ResultReceiver)object7);
                            ((MediaBrowserServiceCompat$k)((Object)object)).a((Runnable)object3);
                        }
                        break block17;
                    }
                    case 7: {
                        object = message.replyTo;
                        object3 = new MediaBrowserServiceCompat$j((Messenger)object);
                        object = ((MediaBrowserServiceCompat$h)object2).a.f;
                        MediaBrowserServiceCompat$ServiceBinderImpl$7 mediaBrowserServiceCompat$ServiceBinderImpl$7 = new MediaBrowserServiceCompat$ServiceBinderImpl$7((MediaBrowserServiceCompat$h)object2, (MediaBrowserServiceCompat$j)object3);
                        ((MediaBrowserServiceCompat$k)((Object)object)).a(mediaBrowserServiceCompat$ServiceBinderImpl$7);
                        break block17;
                    }
                    case 6: {
                        Bundle bundle = object3.getBundle(string4);
                        MediaSessionCompat.ensureClassLoader(bundle);
                        object = message.replyTo;
                        MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j = new MediaBrowserServiceCompat$j((Messenger)object);
                        String string11 = object3.getString(string3);
                        int n4 = object3.getInt(string2);
                        int n7 = object3.getInt((String)object5);
                        object = ((MediaBrowserServiceCompat$h)object2).a.f;
                        MediaBrowserServiceCompat mediaBrowserServiceCompat = object2;
                        MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j2 = mediaBrowserServiceCompat$j;
                        object3 = new MediaBrowserServiceCompat$ServiceBinderImpl$6(n7, n4, bundle, (MediaBrowserServiceCompat$h)object2, mediaBrowserServiceCompat$j, string11);
                        ((MediaBrowserServiceCompat$k)((Object)object)).a((Runnable)object3);
                        break block17;
                    }
                    case 5: {
                        String string12 = object3.getString(string5);
                        object3 = (ResultReceiver)object3.getParcelable(string6);
                        object = message.replyTo;
                        object4 = new MediaBrowserServiceCompat$j((Messenger)object);
                        ((Object)object2).getClass();
                        boolean bl4 = TextUtils.isEmpty((CharSequence)string12);
                        if (!bl4 && object3 != null) {
                            object = ((MediaBrowserServiceCompat$h)object2).a.f;
                            object5 = new MediaBrowserServiceCompat$ServiceBinderImpl$5((MediaBrowserServiceCompat$h)object2, (MediaBrowserServiceCompat$j)object4, string12, (ResultReceiver)object3);
                            ((MediaBrowserServiceCompat$k)((Object)object)).a((Runnable)object5);
                        }
                        break block17;
                    }
                    case 4: {
                        String string13 = object3.getString(string5);
                        object3 = object3.getBinder((String)object4);
                        object = message.replyTo;
                        object4 = new MediaBrowserServiceCompat$j((Messenger)object);
                        object = ((MediaBrowserServiceCompat$h)object2).a.f;
                        object5 = new MediaBrowserServiceCompat$ServiceBinderImpl$4((MediaBrowserServiceCompat$h)object2, (MediaBrowserServiceCompat$j)object4, string13, (IBinder)object3);
                        ((MediaBrowserServiceCompat$k)((Object)object)).a((Runnable)object5);
                        break block17;
                    }
                    case 3: {
                        String string14 = "data_options";
                        Bundle bundle = object3.getBundle(string14);
                        MediaSessionCompat.ensureClassLoader(bundle);
                        String string15 = object3.getString(string5);
                        IBinder iBinder = object3.getBinder((String)object4);
                        object = message.replyTo;
                        MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j = new MediaBrowserServiceCompat$j((Messenger)object);
                        object = ((MediaBrowserServiceCompat$h)object2).a.f;
                        object3 = new MediaBrowserServiceCompat$ServiceBinderImpl$3((MediaBrowserServiceCompat$h)object2, mediaBrowserServiceCompat$j, string15, iBinder, bundle);
                        ((MediaBrowserServiceCompat$k)((Object)object)).a((Runnable)object3);
                        break block17;
                    }
                    case 2: {
                        object = message.replyTo;
                        object3 = new MediaBrowserServiceCompat$j((Messenger)object);
                        object = ((MediaBrowserServiceCompat$h)object2).a.f;
                        MediaBrowserServiceCompat$ServiceBinderImpl$2 mediaBrowserServiceCompat$ServiceBinderImpl$2 = new MediaBrowserServiceCompat$ServiceBinderImpl$2((MediaBrowserServiceCompat$h)object2, (MediaBrowserServiceCompat$j)object3);
                        ((MediaBrowserServiceCompat$k)((Object)object)).a(mediaBrowserServiceCompat$ServiceBinderImpl$2);
                        break block17;
                    }
                    case 1: {
                        Bundle bundle = object3.getBundle(string4);
                        MediaSessionCompat.ensureClassLoader(bundle);
                        String string16 = object3.getString(string3);
                        int n8 = object3.getInt(string2);
                        int n10 = object3.getInt((String)object5);
                        object = message.replyTo;
                        object3 = new MediaBrowserServiceCompat$j((Messenger)object);
                        object = ((MediaBrowserServiceCompat$h)object2).a;
                        if (string16 != null) {
                            object4 = object.getPackageManager().getPackagesForUid(n10);
                            int n14 = ((String[])object4).length;
                            string2 = null;
                            for (int i3 = 0; i3 < n14; ++i3) {
                                string3 = object4[i3];
                                boolean bl5 = string3.equals(string16);
                                if (!bl5) continue;
                                MediaBrowserServiceCompat mediaBrowserServiceCompat = object2;
                                Object object8 = object3;
                                String string17 = string16;
                                object4 = new MediaBrowserServiceCompat$ServiceBinderImpl$1(n8, n10, bundle, (MediaBrowserServiceCompat$h)object2, (MediaBrowserServiceCompat$j)object3, string16);
                                object = ((MediaBrowserServiceCompat)((Object)object)).f;
                                ((MediaBrowserServiceCompat$k)((Object)object)).a((Runnable)object4);
                                break block17;
                            }
                        } else {
                            object.getClass();
                        }
                        object2 = new StringBuilder("Package/uid mismatch: uid=");
                        ((StringBuilder)object2).append(n10);
                        ((StringBuilder)object2).append(" package=");
                        ((StringBuilder)object2).append(string16);
                        object2 = ((StringBuilder)object2).toString();
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                }
            }
            boolean bl6 = false;
            object = null;
            this.removeCallbacksAndMessages(null);
        }
    }

    public final boolean sendMessageAtTime(Message message, long l2) {
        Bundle bundle = message.getData();
        Object object = MediaBrowserCompat.class.getClassLoader();
        bundle.setClassLoader((ClassLoader)object);
        object = "data_calling_uid";
        int n3 = Binder.getCallingUid();
        bundle.putInt((String)object, n3);
        int n4 = Binder.getCallingPid();
        String string2 = "data_calling_pid";
        if (n4 > 0) {
            bundle.putInt(string2, n4);
        } else {
            n4 = (int)(bundle.containsKey(string2) ? 1 : 0);
            if (n4 == 0) {
                n4 = -1;
                bundle.putInt(string2, n4);
            }
        }
        return super.sendMessageAtTime(message, l2);
    }
}

