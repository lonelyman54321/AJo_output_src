/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package androidx.media3.exoplayer.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import java.util.Arrays;
import java.util.Iterator;

public final class DefaultDrmSessionManager$b
extends Handler {
    public final /* synthetic */ DefaultDrmSessionManager a;

    public DefaultDrmSessionManager$b(DefaultDrmSessionManager defaultDrmSessionManager, Looper looper) {
        this.a = defaultDrmSessionManager;
        super(looper);
    }

    public final void handleMessage(Message message) {
        boolean bl2;
        byte[] byArray = (byte[])message.obj;
        if (byArray == null) {
            return;
        }
        Iterator iterator = this.a.m.iterator();
        while (bl2 = iterator.hasNext()) {
            DefaultDrmSession defaultDrmSession = (DefaultDrmSession)iterator.next();
            defaultDrmSession.p();
            byte[] byArray2 = defaultDrmSession.v;
            boolean bl3 = Arrays.equals(byArray2, byArray);
            if (!bl3) continue;
            int n3 = message.what;
            int n4 = 2;
            if (n3 != n4 || (n3 = defaultDrmSession.e) != 0 || (n3 = defaultDrmSession.p) != (n4 = 4)) break;
            n3 = gz3.a;
            n3 = 0;
            message = null;
            defaultDrmSession.h(false);
            break;
        }
    }
}

