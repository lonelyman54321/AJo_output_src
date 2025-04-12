/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.ResourceBusyException
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.media3.exoplayer.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.DrmInitData$SchemeData;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$a;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$b;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$c;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$d;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$e;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.drm.c$b;
import androidx.media3.exoplayer.drm.d;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.drm.g$c;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.drm.j;
import androidx.media3.exoplayer.upstream.a;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public final class DefaultDrmSessionManager
implements c {
    public final UUID b;
    public final g$c c;
    public final j d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final DefaultDrmSessionManager$d i;
    public final b j;
    public final DefaultDrmSessionManager$e k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public g q;
    public DefaultDrmSession r;
    public DefaultDrmSession s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public nu2 x;
    public volatile DefaultDrmSessionManager$b y;

    public DefaultDrmSessionManager(UUID collection, i i3, HashMap hashMap, boolean bl2, int[] nArray, boolean bl3, a a2, long l2) {
        ww0_0 ww0_02 = androidx.media3.exoplayer.drm.h.d;
        collection.getClass();
        ct3.b(OF.b.equals(collection) ^ true, "Use C.CLEARKEY_UUID instead");
        this.b = collection;
        this.c = ww0_02;
        this.d = i3;
        this.e = hashMap;
        this.f = bl2;
        this.g = nArray;
        this.h = bl3;
        this.j = a2;
        collection = new Collection();
        this.i = collection;
        collection = new Collection(this);
        this.k = collection;
        this.v = 0;
        this.m = collection = new Collection();
        collection = Sets.newIdentityHashSet();
        this.n = collection;
        collection = Sets.newIdentityHashSet();
        this.o = collection;
        this.l = l2;
    }

    public static boolean f(DefaultDrmSession object) {
        boolean bl2;
        ((DefaultDrmSession)object).p();
        int n3 = ((DefaultDrmSession)object).p;
        boolean bl3 = false;
        int n4 = 1;
        if (n3 != n4) {
            return false;
        }
        object = ((DefaultDrmSession)object).getError();
        object.getClass();
        object = ((Throwable)object).getCause();
        n3 = object instanceof ResourceBusyException;
        if (n3 != 0 || (bl2 = androidx.media3.exoplayer.drm.d.c((Throwable)object))) {
            bl3 = true;
        }
        return bl3;
    }

    public static ArrayList i(DrmInitData drmInitData, UUID uUID, boolean bl2) {
        int n3;
        int n4 = drmInitData.d;
        ArrayList<DrmInitData$SchemeData> arrayList = new ArrayList<DrmInitData$SchemeData>(n4);
        for (n4 = 0; n4 < (n3 = drmInitData.d); ++n4) {
            Object object;
            DrmInitData$SchemeData drmInitData$SchemeData = drmInitData.a[n4];
            boolean bl3 = drmInitData$SchemeData.a(uUID);
            if (!bl3 && (!(bl3 = ((UUID)(object = OF.c)).equals(uUID)) || !(bl3 = drmInitData$SchemeData.a((UUID)(object = OF.b)))) || (object = (Object)drmInitData$SchemeData.e) == null && !bl2) continue;
            arrayList.add(drmInitData$SchemeData);
        }
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Looper looper, nu2 nu22) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    looper2 = new Handler(looper);
                    this.u = looper2;
                } else {
                    boolean bl2;
                    if (looper2 == looper) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        looper = null;
                    }
                    ct3.f(bl2);
                    looper = this.u;
                    looper.getClass();
                }
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl18 : MonitorExitStatement: MONITOREXIT : this
                this.x = nu22;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final DrmSession b(b$a b$a, androidx.media3.common.d d2) {
        boolean bl2 = false;
        Looper looper = null;
        this.k(false);
        int n3 = this.p;
        boolean bl3 = true;
        if (n3 > 0) {
            bl2 = true;
        }
        ct3.f(bl2);
        ct3.h(this.t);
        looper = this.t;
        return this.e(looper, b$a, d2, bl3);
    }

    public final int c(androidx.media3.common.d object) {
        int n3;
        block10: {
            block12: {
                int n4;
                boolean bl2;
                DrmInitData drmInitData;
                Object object2;
                int n7;
                block11: {
                    n7 = 0;
                    object2 = null;
                    this.k(false);
                    g g3 = this.q;
                    g3.getClass();
                    n3 = g3.g();
                    drmInitData = ((androidx.media3.common.d)object).s;
                    if (drmInitData == null) {
                        int n8;
                        int n10;
                        block9: {
                            object = ((androidx.media3.common.d)object).o;
                            int n14 = ip1_0.g((String)object);
                            n10 = 0;
                            drmInitData = null;
                            while (true) {
                                int[] nArray = this.g;
                                int n15 = nArray.length;
                                n8 = -1;
                                if (n10 >= n15) break;
                                int n17 = nArray[n10];
                                if (n17 != n14) {
                                    ++n10;
                                    continue;
                                }
                                break block9;
                                break;
                            }
                            n10 = -1;
                        }
                        if (n10 != n8) {
                            n7 = n3;
                        }
                        return n7;
                    }
                    object = this.w;
                    if (object != null) break block10;
                    object = this.b;
                    int n10 = 1;
                    Object object3 = DefaultDrmSessionManager.i(drmInitData, (UUID)object, n10 != 0);
                    boolean n18 = ((ArrayList)object3).isEmpty();
                    if (!n18) break block11;
                    int n14 = drmInitData.d;
                    if (n14 != n10 || (n7 = (int)(((DrmInitData$SchemeData)(object2 = drmInitData.a[0])).a((UUID)(object3 = OF.b)) ? 1 : 0)) == 0) break block12;
                    object3 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: ";
                    object2 = new StringBuilder((String)object3);
                    ((StringBuilder)object2).append(object);
                    object = ((StringBuilder)object2).toString();
                    Cx.f((String)object);
                }
                if ((object = drmInitData.c) == null || (n7 = (int)(((String)(object2 = "cenc")).equals(object) ? 1 : 0)) != 0 || ((n7 = (int)(((String)(object2 = "cbcs")).equals(object) ? 1 : 0)) == 0 ? (n7 = (int)(((String)(object2 = "cbc1")).equals(object) ? 1 : 0)) == 0 && !(bl2 = ((String)(object2 = "cens")).equals(object)) : (n4 = gz3.a) >= (n7 = 25))) break block10;
            }
            n3 = 1;
        }
        return n3;
    }

    public final c$b d(b$a b$a, androidx.media3.common.d d2) {
        DefaultDrmSessionManager$c defaultDrmSessionManager$c;
        int n3 = this.p;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            defaultDrmSessionManager$c = null;
        }
        ct3.f(n3 != 0);
        ct3.h(this.t);
        defaultDrmSessionManager$c = new DefaultDrmSessionManager$c(this, b$a);
        b$a = this.u;
        b$a.getClass();
        Cl0 cl0 = new Cl0(0, defaultDrmSessionManager$c, d2);
        b$a.post(cl0);
        return defaultDrmSessionManager$c;
    }

    public final DrmSession e(Looper object, b$a object2, androidx.media3.common.d object3, boolean bl2) {
        boolean bl3;
        boolean bl4;
        Object object4 = this.y;
        if (object4 == null) {
            this.y = object4 = new DefaultDrmSessionManager$b(this, (Looper)object);
        }
        object = ((androidx.media3.common.d)object3).s;
        int n3 = 0;
        object4 = null;
        DefaultDrmSession defaultDrmSession = null;
        if (object == null) {
            object = ((androidx.media3.common.d)object3).o;
            Object object5 = ip1_0.g((String)object);
            object2 = this.q;
            object2.getClass();
            int n4 = object2.g();
            Object object6 = 2;
            if (n4 != object6 || (n4 = (int)(uw0_0.c ? 1 : 0)) == 0) {
                Object object7;
                int n7;
                block18: {
                    object3 = this.g;
                    while (true) {
                        object6 = ((Object)object3).length;
                        n7 = -1;
                        if (n3 >= object6) break;
                        object6 = object3[n3];
                        if (object6 != object5) {
                            ++n3;
                            continue;
                        }
                        break block18;
                        break;
                    }
                    n3 = -1;
                }
                if (n3 != n7 && (object5 = object2.g()) != (object7 = 1)) {
                    object = this.r;
                    if (object == null) {
                        object = ImmutableList.of();
                        object = this.h((List)object, (boolean)object7, null, bl2);
                        object2 = this.m;
                        ((ArrayList)object2).add(object);
                        this.r = object;
                    } else {
                        ((DefaultDrmSession)object).d(null);
                    }
                    defaultDrmSession = this.r;
                }
            }
            return defaultDrmSession;
        }
        object3 = this.w;
        if (object3 == null) {
            object3 = this.b;
            bl4 = ((ArrayList)(object = DefaultDrmSessionManager.i((DrmInitData)object, (UUID)object3, false))).isEmpty();
            if (bl4) {
                object3 = this.b;
                object4 = "Media does not support uuid: ";
                StringBuilder stringBuilder = new StringBuilder((String)object4);
                stringBuilder.append(object3);
                object3 = stringBuilder.toString();
                object = new Exception((String)object3);
                object3 = "DRM error";
                Cx.d((String)object3, (Throwable)object);
                if (object2 != null) {
                    ((b$a)object2).e((Exception)object);
                }
                object3 = new DrmSession$DrmSessionException((Throwable)object, 6003);
                object2 = new f((DrmSession$DrmSessionException)object3);
                return object2;
            }
        } else {
            bl3 = false;
            object = null;
        }
        if (!(bl4 = this.f)) {
            defaultDrmSession = this.s;
        } else {
            boolean bl5;
            object3 = this.m.iterator();
            while (bl5 = object3.hasNext()) {
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession)object3.next();
                List list = defaultDrmSession2.a;
                boolean bl6 = Objects.equals(list, object);
                if (!bl6) continue;
                defaultDrmSession = defaultDrmSession2;
                break;
            }
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = this.h((List)object, false, (b$a)object2, bl2);
            bl3 = this.f;
            if (!bl3) {
                this.s = defaultDrmSession;
            }
            object = this.m;
            ((ArrayList)object).add(defaultDrmSession);
        } else {
            defaultDrmSession.d((b$a)object2);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession g(List list, boolean bl2, b$a b$a) {
        this.q.getClass();
        boolean bl3 = this.h;
        boolean bl4 = bl3 | bl2;
        g g3 = this.q;
        int n3 = this.v;
        byte[] byArray = this.w;
        Looper looper = this.t;
        looper.getClass();
        Object object = this.x;
        object.getClass();
        j j3 = this.d;
        Object object2 = this.j;
        UUID uUID = this.b;
        DefaultDrmSessionManager$d defaultDrmSessionManager$d = this.i;
        DefaultDrmSessionManager$e defaultDrmSessionManager$e = this.k;
        HashMap hashMap = this.e;
        Object object3 = hashMap;
        b b2 = object2;
        object2 = hashMap;
        object3 = object;
        object = b2;
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uUID, g3, defaultDrmSessionManager$d, defaultDrmSessionManager$e, list, n3, bl4, bl2, byArray, hashMap, j3, looper, b2, (nu2)object3);
        defaultDrmSession.d(b$a);
        long l2 = this.l;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            defaultDrmSession.d(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession h(List list, boolean bl2, b$a b$a, boolean bl3) {
        Object object;
        Object object2;
        DefaultDrmSession defaultDrmSession = this.g(list, bl2, b$a);
        boolean bl4 = DefaultDrmSessionManager.f(defaultDrmSession);
        long l2 = -9223372036854775807L;
        long l3 = this.l;
        Set set = this.o;
        if (bl4 && !(bl4 = set.isEmpty())) {
            boolean bl5;
            object2 = ImmutableSet.copyOf((Collection)set).iterator();
            while (bl5 = object2.hasNext()) {
                DrmSession drmSession = (DrmSession)object2.next();
                drmSession.e(null);
            }
            defaultDrmSession.e(b$a);
            bl4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (bl4) {
                defaultDrmSession.e(null);
            }
            defaultDrmSession = this.g(list, bl2, b$a);
        }
        if ((bl4 = DefaultDrmSessionManager.f(defaultDrmSession)) && bl3 && !(bl4 = (object = this.n).isEmpty())) {
            object = ImmutableSet.copyOf((Collection)object).iterator();
            while (bl4 = object.hasNext()) {
                object2 = (DefaultDrmSessionManager$c)object.next();
                ((DefaultDrmSessionManager$c)object2).release();
            }
            bl3 = set.isEmpty();
            if (!bl3) {
                object = ImmutableSet.copyOf((Collection)set).iterator();
                while (bl4 = object.hasNext()) {
                    object2 = (DrmSession)object.next();
                    object2.e(null);
                }
            }
            defaultDrmSession.e(b$a);
            bl3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (bl3) {
                defaultDrmSession.e(null);
            }
            defaultDrmSession = this.g(list, bl2, b$a);
        }
        return defaultDrmSession;
    }

    public final void j() {
        int n3;
        Object object = this.q;
        if (object != null && (n3 = this.p) == 0 && (n3 = (int)(((ArrayList)(object = this.m)).isEmpty() ? 1 : 0)) != 0 && (n3 = (int)((object = this.n).isEmpty() ? 1 : 0)) != 0) {
            object = this.q;
            object.getClass();
            object.release();
            n3 = 0;
            object = null;
            this.q = null;
        }
    }

    public final void k(boolean bl2) {
        Object object;
        if (bl2 && (object = this.t) == null) {
            object = new IllegalStateException();
            String string2 = "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.";
            Cx.g(string2, (Throwable)object);
        } else {
            object = Thread.currentThread();
            Object object2 = this.t;
            object2.getClass();
            object2 = object2.getThread();
            if (object != object2) {
                object = new StringBuilder("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
                object2 = Thread.currentThread().getName();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("\nExpected thread: ");
                object2 = this.t.getThread().getName();
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                object2 = new IllegalStateException();
                Cx.g((String)object, (Throwable)object2);
            }
        }
    }

    public final void prepare() {
        int n3;
        this.k(true);
        int n4 = this.p;
        this.p = n3 = n4 + 1;
        if (n4 != 0) {
            return;
        }
        Object object = this.q;
        if (object == null) {
            object = this.c;
            Object object2 = this.b;
            this.q = object = object.a((UUID)object2);
            object2 = new DefaultDrmSessionManager$a(this);
            object.e((DefaultDrmSessionManager$a)object2);
        } else {
            long l2 = this.l;
            long l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 != false) {
                Object object4;
                int n7;
                object = null;
                for (n4 = 0; n4 < (n7 = ((ArrayList)(object4 = this.m)).size()); ++n4) {
                    object4 = (DefaultDrmSession)((ArrayList)object4).get(n4);
                    n7 = 0;
                    ((DefaultDrmSession)object4).d(null);
                }
            }
        }
    }

    public final void release() {
        ArrayList arrayList;
        Object object;
        int n3;
        int n4 = 1;
        this.k(n4 != 0);
        this.p = n3 = this.p - n4;
        if (n3 != 0) {
            return;
        }
        long l2 = this.l;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            int n7;
            object = this.m;
            arrayList = new ArrayList(object);
            object = null;
            for (n3 = 0; n3 < (n7 = arrayList.size()); ++n3) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession)arrayList.get(n3);
                defaultDrmSession.e(null);
            }
        }
        arrayList = ImmutableSet.copyOf((Collection)this.n).iterator();
        while ((n3 = (int)(arrayList.hasNext() ? 1 : 0)) != 0) {
            object = (DefaultDrmSessionManager$c)arrayList.next();
            ((DefaultDrmSessionManager$c)object).release();
        }
        this.j();
    }
}

