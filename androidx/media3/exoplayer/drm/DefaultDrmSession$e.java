/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Pair
 */
package androidx.media3.exoplayer.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSession$a;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$d;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.g$a;
import androidx.media3.exoplayer.drm.g$d;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashSet;

public final class DefaultDrmSession$e
extends Handler {
    public final /* synthetic */ DefaultDrmSession a;

    public DefaultDrmSession$e(DefaultDrmSession defaultDrmSession, Looper looper) {
        this.a = defaultDrmSession;
        super(looper);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message object) {
        boolean bl2;
        Object object2 = (Pair)((Message)object).obj;
        Object object3 = ((Pair)object2).first;
        object2 = ((Pair)object2).second;
        int n3 = ((Message)object).what;
        int n4 = 0;
        byte[] byArray = null;
        int n7 = 2;
        int n8 = 1;
        if (n3 != n8) {
            if (n3 != n7) {
                return;
            }
            object = this.a;
            g$a g$a = ((DefaultDrmSession)object).x;
            if (object3 != g$a) return;
            int n10 = ((DefaultDrmSession)object).i();
            if (!n10) {
                return;
            }
            ((DefaultDrmSession)object).x = null;
            n10 = object2 instanceof Exception;
            if (!n10 && !(n10 = object2 instanceof NoSuchMethodError)) {
                void var2_6;
                block21: {
                    int n14;
                    block20: {
                        try {
                            object2 = (byte[])object2;
                            n10 = ((DefaultDrmSession)object).e;
                            n4 = 3;
                            if (n10 != n4) break block20;
                            object3 = ((DefaultDrmSession)object).b;
                            byArray = ((DefaultDrmSession)object).w;
                        }
                        catch (NoSuchMethodError noSuchMethodError) {
                            break block21;
                        }
                        catch (Exception exception) {
                            break block21;
                        }
                        {
                            object3.k(byArray, (byte[])object2);
                            object2 = ((DefaultDrmSession)object).i;
                            object3 = ((B80)object2).a;
                            synchronized (object3) {
                                object2 = ((B80)object2).c;
                            }
                        }
                        {
                            object2 = object2.iterator();
                            while ((n10 = object2.hasNext()) != 0) {
                                object3 = object2.next();
                                object3 = (b$a)object3;
                                ((b$a)object3).b();
                            }
                            return;
                        }
                    }
                    object3 = ((DefaultDrmSession)object).b;
                    byArray = ((DefaultDrmSession)object).v;
                    object2 = object3.k(byArray, (byte[])object2);
                    n10 = ((DefaultDrmSession)object).e;
                    if ((n10 == n7 || !n10 && (object3 = (Object)((DefaultDrmSession)object).w) != null) && object2 != null && (n10 = ((Pair)object2).length)) {
                        ((DefaultDrmSession)object).w = (byte[])object2;
                    }
                    ((DefaultDrmSession)object).p = n14 = 4;
                    object2 = new Object();
                    ((DefaultDrmSession)object).g((bl0_0)object2);
                    return;
                }
                ((DefaultDrmSession)object).k((Throwable)var2_6, n8 != 0);
                return;
            }
            object2 = (Throwable)object2;
            ((DefaultDrmSession)object).k((Throwable)object2, false);
            return;
        }
        object = this.a;
        g$d g$d = ((DefaultDrmSession)object).y;
        if (object3 != g$d) return;
        int n15 = ((DefaultDrmSession)object).p;
        if (n15 != n7 && (n15 = (int)(((DefaultDrmSession)object).i() ? 1 : 0)) == 0) {
            return;
        }
        ((DefaultDrmSession)object).y = null;
        n15 = object2 instanceof Exception;
        DefaultDrmSession$a defaultDrmSession$a = ((DefaultDrmSession)object).c;
        if (n15 != 0) {
            object2 = (Exception)object2;
            defaultDrmSession$a = (DefaultDrmSessionManager$d)defaultDrmSession$a;
            ((DefaultDrmSessionManager$d)defaultDrmSession$a).a((Exception)object2, false);
            return;
        }
        try {
            object = ((DefaultDrmSession)object).b;
            object2 = (byte[])object2;
            object.f((byte[])object2);
        }
        catch (Exception exception) {
            defaultDrmSession$a = (DefaultDrmSessionManager$d)defaultDrmSession$a;
            ((DefaultDrmSessionManager$d)defaultDrmSession$a).a(exception, n8 != 0);
            return;
        }
        defaultDrmSession$a = (DefaultDrmSessionManager$d)defaultDrmSession$a;
        ((DefaultDrmSessionManager$d)defaultDrmSession$a).b = null;
        object = ((DefaultDrmSessionManager$d)defaultDrmSession$a).a;
        object2 = ImmutableList.copyOf((Collection)object);
        ((HashSet)object).clear();
        object = ((ImmutableList)object2).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (DefaultDrmSession)object.next();
            n15 = (int)(((DefaultDrmSession)object2).l() ? 1 : 0);
            if (n15 == 0) continue;
            ((DefaultDrmSession)object2).h(n8 != 0);
        }
    }
}

