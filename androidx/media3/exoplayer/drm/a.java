/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.drm;

import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$c;
import androidx.media3.datasource.c$a;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.drm.i;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class a
implements Yv0 {
    public final Object a;
    public MediaItem$c b;
    public DefaultDrmSessionManager c;

    public a() {
        Object object;
        this.a = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static DefaultDrmSessionManager b(MediaItem$c object) {
        Object object2;
        HashMap hashMap;
        Object object3;
        int n3;
        int n4 = 1;
        Object object4 = new c$a();
        byte[] byArray = null;
        ((c$a)object4).c = null;
        Object object5 = ((MediaItem$c)object).b;
        if (object5 == null) {
            n3 = 0;
            object5 = null;
        } else {
            object5 = object5.toString();
        }
        boolean bl2 = ((MediaItem$c)object).f;
        i i3 = new i((String)object5, bl2, (c$a)object4);
        object4 = ((MediaItem$c)object).c.entrySet().iterator();
        while ((n3 = object4.hasNext()) != 0) {
            object5 = (Map.Entry)object4.next();
            object3 = (String)object5.getKey();
            object5 = (String)object5.getValue();
            object3.getClass();
            object5.getClass();
            hashMap = i3.d;
            synchronized (hashMap) {
                HashMap hashMap2 = i3.d;
                hashMap2.put(object3, object5);
            }
        }
        hashMap = new HashMap();
        object4 = OF.a;
        androidx.media3.exoplayer.upstream.a a2 = new Object();
        object3 = ((MediaItem$c)object).a;
        object3.getClass();
        boolean bl3 = ((MediaItem$c)object).d;
        boolean bl4 = ((MediaItem$c)object).e;
        object4 = Ints.toArray(((MediaItem$c)object).g);
        n3 = ((Object)object4).length;
        Object object6 = null;
        for (int i8 = 0; i8 < n3; i8 += n4) {
            Object object7 = object4[i8];
            int n7 = 2;
            object7 = object7 != n7 && object7 != n4 ? (Object)false : (Object)true;
            ct3.a((boolean)object7);
        }
        object6 = object2 = object4.clone();
        object6 = (int[])object2;
        long l2 = 300000L;
        object5 = object2;
        object2 = new DefaultDrmSessionManager((UUID)object3, i3, hashMap, bl3, (int[])object6, bl4, a2, l2);
        object = ((MediaItem$c)object).h;
        if (object != null) {
            int n8 = ((Object)object).length;
            byArray = Arrays.copyOf((byte[])object, n8);
        }
        ct3.f(((DefaultDrmSessionManager)object2).m.isEmpty());
        ((DefaultDrmSessionManager)object2).v = 0;
        ((DefaultDrmSessionManager)object2).w = byArray;
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final c a(MediaItem object) {
        Object object2 = ((MediaItem)object).b;
        object2.getClass();
        object = ((MediaItem)object).b.c;
        if (object == null) {
            return androidx.media3.exoplayer.drm.c.a;
        }
        object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        MediaItem$c mediaItem$c = this.b;
                        boolean bl2 = ((MediaItem$c)object).equals(mediaItem$c);
                        if (bl2) break block4;
                        this.b = object;
                        this.c = object = androidx.media3.exoplayer.drm.a.b((MediaItem$c)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = this.c;
                object.getClass();
                return object;
            }
            throw throwable2;
        }
    }
}

