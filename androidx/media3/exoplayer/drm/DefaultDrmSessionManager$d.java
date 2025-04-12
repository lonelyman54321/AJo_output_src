/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package androidx.media3.exoplayer.drm;

import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSession$a;
import androidx.media3.exoplayer.drm.DefaultDrmSession$d;
import androidx.media3.exoplayer.drm.g$d;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashSet;

public final class DefaultDrmSessionManager$d
implements DefaultDrmSession$a {
    public final HashSet a;
    public DefaultDrmSession b;

    public DefaultDrmSessionManager$d() {
        HashSet hashSet;
        this.a = hashSet = new HashSet();
    }

    public final void a(Exception exception, boolean bl2) {
        boolean bl3;
        this.b = null;
        Object object = this.a;
        Object object2 = ImmutableList.copyOf((Collection)object);
        ((HashSet)object).clear();
        object = ((ImmutableList)object2).iterator();
        while (bl3 = object.hasNext()) {
            object2 = (DefaultDrmSession)object.next();
            object2.getClass();
            int n3 = bl2 ? 1 : 3;
            ((DefaultDrmSession)object2).j(exception, n3);
        }
    }

    public final void b(DefaultDrmSession object) {
        g$d g$d;
        this.a.add(object);
        Object object2 = this.b;
        if (object2 != null) {
            return;
        }
        this.b = object;
        ((DefaultDrmSession)object).y = g$d = ((DefaultDrmSession)object).b.b();
        object = ((DefaultDrmSession)object).s;
        g$d.getClass();
        object.getClass();
        long l2 = Iv1.b.getAndIncrement();
        long l3 = SystemClock.elapsedRealtime();
        int n3 = 1;
        object2 = new DefaultDrmSession$d(l2, n3 != 0, l3, g$d);
        object.obtainMessage(n3, object2).sendToTarget();
    }
}

