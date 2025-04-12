/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Pair
 */
package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.e;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.c;
import androidx.media3.exoplayer.source.c$b;
import androidx.media3.exoplayer.source.d$a;
import androidx.media3.exoplayer.source.d$c;
import androidx.media3.exoplayer.source.d$d;
import androidx.media3.exoplayer.source.d$e;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.j$c;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.s$a;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class d
extends c {
    public static final MediaItem u;
    public final ArrayList k;
    public final HashSet l;
    public Handler m;
    public final ArrayList n;
    public final IdentityHashMap o;
    public final HashMap p;
    public final HashSet q;
    public boolean r;
    public HashSet s;
    public s t;

    static {
        Object object;
        Object object2;
        boolean bl2;
        Object object3 = new MediaItem$a$a();
        Object object4 = new MediaItem$c$a();
        List list = Collections.emptyList();
        ImmutableList immutableList = ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        MediaItem$f mediaItem$f = MediaItem$f.a;
        Uri uri = Uri.EMPTY;
        Object object5 = ((MediaItem$c$a)object4).b;
        if (object5 != null && (object5 = ((MediaItem$c$a)object4).a) == null) {
            bl2 = false;
            object5 = null;
        } else {
            bl2 = true;
        }
        ct3.f(bl2);
        bl2 = false;
        object5 = null;
        if (uri != null) {
            UUID uUID = ((MediaItem$c$a)object4).a;
            if (uUID != null) {
                object5 = new MediaItem$c((MediaItem$c$a)object4);
            }
            Object object6 = object5;
            long l2 = -9223372036854775807L;
            uUID = null;
            object5 = object2;
            object = object2 = new MediaItem$e(uri, null, (MediaItem$c)object6, list, null, immutableList, null, l2);
        } else {
            object = null;
        }
        MediaItem$b mediaItem$b = new MediaItem$a((MediaItem$a$a)object3);
        object3 = new MediaItem$d(mediaItem$d$a);
        e e2 = androidx.media3.common.e.I;
        object2 = object4;
        u = object4 = new MediaItem("", mediaItem$b, (MediaItem$e)object, (MediaItem$d)object3, e2, mediaItem$f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d(j ... object) {
        Cloneable cloneable = new s$a();
        for (j j3 : object) {
            j3.getClass();
        }
        Object object2 = ((s$a)((Object)cloneable)).b;
        int n3 = ((int[])object2).length;
        if (n3 > 0) {
            cloneable = ((s$a)((Object)cloneable)).e();
        }
        this.t = cloneable;
        cloneable = new IdentityHashMap();
        this.o = cloneable;
        this.p = cloneable;
        super();
        this.k = cloneable;
        object2 = new ArrayList;
        super();
        this.n = object2;
        object2 = new HashSet;
        super();
        this.s = object2;
        object2 = new HashSet;
        super();
        this.l = object2;
        object2 = new HashSet;
        super();
        this.q = object2;
        object = Arrays.asList(object);
        synchronized (this) {
            int n4 = ((ArrayList)cloneable).size();
            object = (List)object;
            this.D(n4, (List)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void A(int n3, j object) {
        synchronized (this) {
            object = Collections.singletonList(object);
            object = (List)object;
            this.D(n3, (List)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void B(j j3) {
        synchronized (this) {
            ArrayList arrayList = this.k;
            int n3 = arrayList.size();
            this.A(n3, j3);
            return;
        }
    }

    public final void C(int n3, Collection object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            int n4;
            Object object2 = (d$d)object.next();
            int n7 = n3 + 1;
            Object object3 = this.n;
            int n8 = 0;
            Object object4 = null;
            if (n3 > 0) {
                n4 = n3 + -1;
                d$d d$d = (d$d)((ArrayList)object3).get(n4);
                androidx.media3.common.g g3 = d$d.a.o;
                n4 = d$d.e;
                g3 = ((QV0)g3).b;
                int n10 = g3.p() + n4;
                ((d$d)object2).d = n3;
                ((d$d)object2).e = n10;
                ((d$d)object2).f = false;
                object4 = ((d$d)object2).c;
                ((ArrayList)object4).clear();
            } else {
                ((d$d)object2).d = n3;
                ((d$d)object2).e = 0;
                ((d$d)object2).f = false;
                object4 = ((d$d)object2).c;
                ((ArrayList)object4).clear();
            }
            object4 = ((d$d)object2).a.o.b;
            n8 = ((androidx.media3.common.g)object4).p();
            n4 = 1;
            this.E(n3, n4, n8);
            ((ArrayList)object3).add(n3, object2);
            Object object5 = this.p;
            object3 = ((d$d)object2).b;
            ((HashMap)object5).put(object3, object2);
            object5 = ((d$d)object2).a;
            this.z(object2, (j)object5);
            object5 = this.b;
            n3 = ((HashSet)object5).isEmpty() ^ n4;
            if (n3 != 0 && (n3 = (int)(((IdentityHashMap)(object5 = this.o)).isEmpty() ? 1 : 0)) != 0) {
                object5 = this.q;
                ((HashSet)object5).add(object2);
            } else {
                object5 = (c$b)this.h.get(object2);
                object5.getClass();
                object2 = ((c$b)object5).a;
                object5 = ((c$b)object5).b;
                object2.k((j$c)object5);
            }
            n3 = n7;
        }
    }

    public final void D(int n3, List object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        int n4;
        Handler handler = this.m;
        ArrayList<d$d> arrayList = object.iterator();
        while ((n4 = arrayList.hasNext()) != 0) {
            object2 = (j)arrayList.next();
            object2.getClass();
        }
        n4 = object.size();
        arrayList = new ArrayList<d$d>(n4);
        object2 = object.iterator();
        while (bl3 = object2.hasNext()) {
            j j3 = (j)object2.next();
            d$d d$d = new d$d(j3, false);
            arrayList.add(d$d);
        }
        object2 = this.k;
        ((ArrayList)object2).addAll(n3, arrayList);
        if (handler != null && !(bl2 = object.isEmpty())) {
            n4 = 0;
            object2 = null;
            object = new d$e(n3, arrayList, null);
            n3 = 1;
            Message message = handler.obtainMessage(n3, object);
            message.sendToTarget();
        }
    }

    public final void E(int n3, int n4, int n7) {
        Object object;
        int n8;
        while (n3 < (n8 = ((ArrayList)(object = this.n)).size())) {
            object = (d$d)((ArrayList)object).get(n3);
            ((d$d)object).d = n8 = ((d$d)object).d + n4;
            ((d$d)object).e = n8 = ((d$d)object).e + n7;
            ++n3;
        }
    }

    public final void F() {
        boolean bl2;
        Iterator iterator = this.q.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (d$d)iterator.next();
            Object object2 = ((d$d)object).c;
            boolean bl3 = ((ArrayList)object2).isEmpty();
            if (!bl3) continue;
            object = (c$b)this.h.get(object);
            object.getClass();
            object2 = ((c$b)object).a;
            object = ((c$b)object).b;
            object2.k((j$c)object);
            iterator.remove();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void G(Set set) {
        synchronized (this) {
            try {
                Object object = set.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        object = this.l;
                        object.removeAll(set);
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (d$c)object2;
                    Handler handler = ((d$c)object2).a;
                    object2 = ((d$c)object2).b;
                    handler.post(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h H(int n3) {
        synchronized (this) {
            ArrayList arrayList = this.k;
            Object object = arrayList.get(n3);
            object = (d$d)object;
            return ((d$d)object).a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int I() {
        synchronized (this) {
            ArrayList arrayList = this.k;
            return arrayList.size();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void J(int n3, int n4) {
        synchronized (this) {
            this.K(n3, n4);
            return;
        }
    }

    public final void K(int n3, int n4) {
        int n7;
        Handler handler = this.m;
        List list = this.k;
        if (n3 >= 0 && n4 <= (n7 = ((ArrayList)list).size()) && n3 <= n4) {
            if (n3 != n4) {
                list = list.subList(n3, n4);
                list.clear();
            }
            if (handler != null) {
                Integer n8 = n4;
                n7 = 0;
                list = new List(n3, n8, null);
                n3 = 2;
                Message message = handler.obtainMessage(n3, list);
                message.sendToTarget();
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void L(d$c d$c) {
        Object object;
        boolean bl2 = this.r;
        if (!bl2) {
            object = this.m;
            object.getClass();
            int n3 = 5;
            object = object.obtainMessage(n3);
            object.sendToTarget();
            this.r = bl2 = true;
        }
        if (d$c != null) {
            object = this.s;
            ((HashSet)object).add(d$c);
        }
    }

    public final void M() {
        this.r = false;
        HashSet hashSet = this.s;
        Object object = new HashSet();
        this.s = object;
        ArrayList arrayList = this.n;
        s s7 = this.t;
        object = new d$a(arrayList, s7, false);
        this.t((androidx.media3.common.g)object);
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(6, (Object)hashSet).sendToTarget();
    }

    public final MediaItem c() {
        return u;
    }

    public final void f(i object) {
        Object object2 = this.o;
        Object object3 = (d$d)((IdentityHashMap)object2).remove(object);
        object3.getClass();
        ((d$d)object3).a.f((i)object);
        ArrayList arrayList = ((d$d)object3).c;
        object = ((g)object).a;
        arrayList.remove(object);
        boolean bl2 = ((IdentityHashMap)object2).isEmpty();
        if (!bl2) {
            this.F();
        }
        if ((bl2 = ((d$d)object3).f) && (bl2 = arrayList.isEmpty())) {
            this.q.remove(object3);
            object = (c$b)this.h.remove(object3);
            object.getClass();
            object2 = ((c$b)object).a;
            object3 = ((c$b)object).b;
            object2.j((j$c)object3);
            object = ((c$b)object).c;
            object2.b((k)object);
            object2.e((b)object);
        }
    }

    public final boolean m() {
        return false;
    }

    public final i n(j$b object, Cj0 cj0, long l2) {
        j j3;
        Object object2 = (Pair)((j$b)object).a;
        Object object3 = object2.first;
        object2 = object2.second;
        object = ((j$b)object).a(object2);
        object2 = (d$d)this.p.get(object3);
        if (object2 == null) {
            boolean bl2;
            object3 = new a();
            j3 = null;
            object2 = new d$d((j)object3, false);
            object2.f = bl2 = true;
            object3 = object2.a;
            this.z(object2, (j)object3);
        }
        this.q.add(object2);
        object3 = (c$b)this.h.get(object2);
        object3.getClass();
        j3 = ((c$b)object3).a;
        object3 = ((c$b)object3).b;
        j3.g((j$c)object3);
        object2.c.add(object);
        object = object2.a.D((j$b)object, cj0, l2);
        this.o.put(object, object2);
        this.F();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final androidx.media3.common.g o() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                s s7;
                block4: {
                    block3: {
                        try {
                            s7 = this.t;
                            int n3 = s7.getLength();
                            Object object = this.k;
                            int n4 = ((ArrayList)object).size();
                            if (n3 == n4) break block3;
                            s7 = this.t;
                            s7 = s7.e();
                            object = this.k;
                            n4 = ((ArrayList)object).size();
                            s7 = ((s$a)s7).g(0, n4);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    s7 = this.t;
                }
                ArrayList arrayList = this.k;
                return new d$a(arrayList, s7, false);
            }
            throw throwable2;
        }
    }

    public final void q() {
        super.q();
        this.q.clear();
    }

    public final void r() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s(Kq3 kq3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object;
                    Object object2;
                    block3: {
                        try {
                            this.j = kq3;
                            kq3 = null;
                            object2 = gz3.k(null);
                            this.i = object2;
                            object = new W30(this);
                            object2 = new Handler((Handler.Callback)object);
                            this.m = object2;
                            object2 = this.k;
                            boolean bl2 = ((ArrayList)object2).isEmpty();
                            if (!bl2) break block3;
                            this.M();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object2 = this.t;
                    object = this.k;
                    int n3 = ((ArrayList)object).size();
                    this.t = object2 = object2.g(0, n3);
                    object2 = this.k;
                    this.C(0, (Collection)object2);
                    this.L(null);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        super.u();
                        object = this.n;
                        ((ArrayList)object).clear();
                        object = this.q;
                        ((HashSet)object).clear();
                        object = this.p;
                        ((HashMap)object).clear();
                        object = this.t;
                        this.t = object = object.e();
                        object = this.m;
                        if (object == null) break block3;
                        object.removeCallbacksAndMessages(null);
                        this.m = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = null;
                this.r = false;
                object = this.s;
                ((HashSet)object).clear();
                object = this.l;
                this.G((Set)object);
                return;
            }
            throw throwable2;
        }
    }

    public final j$b v(Object object, j$b j$b) {
        block1: {
            Object object2;
            int n3;
            object = (d$d)object;
            Object object3 = null;
            for (int i3 = 0; i3 < (n3 = ((ArrayList)(object2 = ((d$d)object).c)).size()); ++i3) {
                object2 = (j$b)((d$d)object).c.get(i3);
                long l2 = ((j$b)object2).d;
                long l3 = j$b.d;
                long l4 = l2 - l3;
                Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object4 != false) continue;
                object = ((d$d)object).b;
                i3 = H0.e;
                object3 = j$b.a;
                object = Pair.create((Object)object, (Object)object3);
                object = j$b.a(object);
                break block1;
            }
            object = null;
        }
        return object;
    }

    public final int x(int n3, Object object) {
        int n4 = ((d$d)object).e;
        return n3 + n4;
    }

    public final void y(Object object, j object2, androidx.media3.common.g g3) {
        object = (d$d)object;
        int n3 = ((d$d)object).d + 1;
        ArrayList arrayList = this.n;
        int n4 = arrayList.size();
        if (n3 < n4) {
            n3 = ((d$d)object).d + 1;
            object2 = (d$d)arrayList.get(n3);
            int n7 = g3.p();
            n3 = ((d$d)object2).e;
            int n8 = ((d$d)object).e;
            if ((n7 -= (n3 -= n8)) != 0) {
                int n10 = ((d$d)object).d + 1;
                n3 = 0;
                object2 = null;
                this.E(n10, 0, n7);
            }
        }
        this.L(null);
    }
}

