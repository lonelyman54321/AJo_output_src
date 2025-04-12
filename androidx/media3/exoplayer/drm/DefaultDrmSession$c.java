/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.util.Pair
 */
package androidx.media3.exoplayer.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSession$d;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.media3.exoplayer.drm.g$a;
import androidx.media3.exoplayer.drm.g$d;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.upstream.b$a;
import java.io.IOException;
import java.util.UUID;

public final class DefaultDrmSession$c
extends Handler {
    public boolean a;
    public final /* synthetic */ DefaultDrmSession b;

    public DefaultDrmSession$c(DefaultDrmSession defaultDrmSession, Looper looper) {
        this.b = defaultDrmSession;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(Message message, MediaDrmCallbackException object) {
        DefaultDrmSession$d defaultDrmSession$d = (DefaultDrmSession$d)message.obj;
        int n3 = defaultDrmSession$d.b;
        if (n3 == 0) {
            return false;
        }
        n3 = defaultDrmSession$d.d;
        int n4 = 1;
        defaultDrmSession$d.d = n3 += n4;
        Object object2 = this.b.j;
        int n7 = 3;
        int n8 = object2.b(n7);
        if (n3 > n8) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Object object3 = ((Throwable)object).getCause();
        n3 = object3 instanceof IOException;
        if (n3 != 0) {
            object = (IOException)((Throwable)object).getCause();
        } else {
            object = ((Throwable)object).getCause();
            object = object3 = new IOException((Throwable)object);
        }
        object3 = this.b.j;
        int n10 = defaultDrmSession$d.d;
        object2 = new b$a((IOException)object, n10);
        long l2 = object3.a((b$a)object2);
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            return false;
        }
        synchronized (this) {
            Throwable throwable2;
            block9: {
                try {
                    l4 = (long)this.a;
                    if (l4 == false) {
                        message = Message.obtain((Message)message);
                        this.sendMessageDelayed(message, l2);
                        return n4 != 0;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message message) {
        Object object;
        Object object2;
        int n3;
        Object object3;
        block9: {
            MediaDrmCallbackException mediaDrmCallbackException2;
            block11: {
                Exception exception2;
                block10: {
                    block8: {
                        object3 = (DefaultDrmSession$d)message.obj;
                        try {
                            int n4 = message.what;
                            n3 = 1;
                            if (n4 == n3) break block8;
                            n3 = 2;
                            if (n4 != n3) {
                                RuntimeException runtimeException = new RuntimeException();
                                throw runtimeException;
                            }
                            object2 = this.b;
                            object = ((DefaultDrmSession)object2).l;
                            object2 = ((DefaultDrmSession)object2).m;
                            Object object4 = ((DefaultDrmSession$d)object3).c;
                            object4 = (g$a)object4;
                            object = (i)object;
                            object2 = ((i)object).a((UUID)object2, (g$a)object4);
                            break block9;
                        }
                        catch (Exception exception2) {
                            break block10;
                        }
                        catch (MediaDrmCallbackException mediaDrmCallbackException2) {
                            break block11;
                        }
                    }
                    object2 = this.b;
                    object2 = ((DefaultDrmSession)object2).l;
                    object = ((DefaultDrmSession$d)object3).c;
                    object = (g$d)object;
                    object2 = (i)object2;
                    object2 = ((i)object2).b((g$d)object);
                    break block9;
                }
                object = "Key/provisioning request produced an unexpected exception. Not retrying.";
                Cx.g((String)object, exception2);
                break block9;
            }
            n3 = (int)(this.a(message, mediaDrmCallbackException2) ? 1 : 0);
            if (n3 != 0) {
                return;
            }
        }
        object = this.b.j;
        long cfr_ignored_0 = ((DefaultDrmSession$d)object3).a;
        object.getClass();
        synchronized (this) {
            Throwable throwable2;
            block13: {
                block12: {
                    try {
                        n3 = (int)(this.a ? 1 : 0);
                        if (n3 != 0) break block12;
                        object = this.b;
                        object = ((DefaultDrmSession)object).o;
                        int n7 = message.what;
                        object3 = ((DefaultDrmSession$d)object3).c;
                        object3 = Pair.create((Object)object3, (Object)object2);
                        message = object.obtainMessage(n7, object3);
                        message.sendToTarget();
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

