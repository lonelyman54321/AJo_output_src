/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.NotProvisionedException
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.SystemClock
 */
package androidx.media3.exoplayer.drm;

import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSession$a;
import androidx.media3.exoplayer.drm.DefaultDrmSession$b;
import androidx.media3.exoplayer.drm.DefaultDrmSession$c;
import androidx.media3.exoplayer.drm.DefaultDrmSession$d;
import androidx.media3.exoplayer.drm.DefaultDrmSession$e;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$d;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$e;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.d;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.drm.g$a;
import androidx.media3.exoplayer.drm.g$d;
import androidx.media3.exoplayer.drm.j;
import androidx.media3.exoplayer.upstream.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public final class DefaultDrmSession
implements DrmSession {
    public final List a;
    public final g b;
    public final DefaultDrmSession$a c;
    public final DefaultDrmSession$b d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final B80 i;
    public final b j;
    public final nu2 k;
    public final j l;
    public final UUID m;
    public final Looper n;
    public final DefaultDrmSession$e o;
    public int p;
    public int q;
    public HandlerThread r;
    public DefaultDrmSession$c s;
    public be0_0 t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public g$a x;
    public g$d y;

    public DefaultDrmSession(UUID object, g g3, DefaultDrmSession$a defaultDrmSession$a, DefaultDrmSession$b defaultDrmSession$b, List list, int n3, boolean bl2, boolean bl3, byte[] byArray, HashMap hashMap, j j3, Looper looper, b b2, nu2 nu22) {
        int n4 = 1;
        if (n3 == n4 || n3 == (n4 = 3)) {
            byArray.getClass();
        }
        this.m = object;
        this.c = defaultDrmSession$a;
        this.d = defaultDrmSession$b;
        this.b = g3;
        this.e = n3;
        this.f = bl2;
        this.g = bl3;
        if (byArray != null) {
            this.w = byArray;
            object = null;
            this.a = null;
        } else {
            list.getClass();
            this.a = object = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = j3;
        this.i = object = new B80();
        this.j = b2;
        this.k = nu22;
        this.p = 2;
        this.n = looper;
        object = new DefaultDrmSession$e(this, looper);
        this.o = object;
    }

    public final UUID a() {
        this.p();
        return this.m;
    }

    public final boolean b() {
        this.p();
        return this.f;
    }

    public final be0_0 c() {
        this.p();
        return this.t;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(b$a object) {
        Object object2;
        int n3;
        Object object3;
        B80 b80;
        int n4;
        int n7;
        block13: {
            Object object4;
            this.p();
            n7 = this.q;
            n4 = 0;
            b80 = null;
            if (n7 < 0) {
                object4 = "Session reference count less than zero: ";
                object3 = new StringBuilder((String)object4);
                n3 = this.q;
                ((StringBuilder)object3).append(n3);
                object3 = ((StringBuilder)object3).toString();
                Cx.c((String)object3);
                this.q = 0;
            }
            n7 = 1;
            if (object != null) {
                object4 = this.i;
                Object object5 = ((B80)object4).a;
                synchronized (object5) {
                    Throwable throwable2;
                    block12: {
                        Object object6;
                        block11: {
                            try {
                                Collection<Object> collection = ((B80)object4).d;
                                object6 = new ArrayList(collection);
                                ((ArrayList)object6).add(object);
                                object6 = Collections.unmodifiableList(object6);
                                ((B80)object4).d = object6;
                                object6 = ((B80)object4).b;
                                object6 = ((HashMap)object6).get(object);
                                object6 = (Integer)object6;
                                if (object6 != null) break block11;
                                Set set = ((B80)object4).c;
                                collection = new Collection<Object>(set);
                                ((HashSet)collection).add(object);
                                collection = Collections.unmodifiableSet(collection);
                                ((B80)object4).c = collection;
                            }
                            catch (Throwable throwable2) {
                                break block12;
                            }
                        }
                        object4 = ((B80)object4).b;
                        object2 = object6 != null ? (Object)((Integer)object6 + n7) : (Object)1;
                        object6 = (int)object2;
                        ((HashMap)object4).put(object, object6);
                        break block13;
                    }
                    throw throwable2;
                }
            }
        }
        this.q = n3 = this.q + n7;
        if (n3 == n7) {
            int n8 = this.p;
            n3 = 2;
            if (n8 == n3) {
                n4 = 1;
            }
            ct3.f(n4 != 0);
            object = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = object;
            ((Thread)object).start();
            b80 = this.r.getLooper();
            object = new DefaultDrmSession$c(this, (Looper)b80);
            this.s = object;
            n8 = (int)(this.l() ? 1 : 0);
            if (n8 != 0) {
                this.h(n7 != 0);
            }
        } else if (object != null && (n4 = this.i()) != 0 && (n4 = (b80 = this.i).count(object)) == n7) {
            n7 = this.p;
            ((b$a)object).d(n7);
        }
        object = ((DefaultDrmSessionManager$e)this.d).a;
        long l2 = ((DefaultDrmSessionManager)object).l;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            object3 = ((DefaultDrmSessionManager)object).o;
            object3.remove(this);
            object = ((DefaultDrmSessionManager)object).u;
            object.getClass();
            object.removeCallbacksAndMessages((Object)this);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(b$a object) {
        long l2;
        long l3;
        Object object2;
        Object object3 = null;
        this.p();
        int n3 = this.q;
        if (n3 <= 0) {
            Cx.c("release() called on a session that's already fully released.");
            return;
        }
        int n4 = 1;
        this.q = n3 -= n4;
        if (n3 == 0) {
            this.p = 0;
            object2 = this.o;
            object2.removeCallbacksAndMessages(null);
            object2 = this.s;
            synchronized (object2) {
                object2.removeCallbacksAndMessages(null);
                ((DefaultDrmSession$c)((Object)object2)).a = n4;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            object2 = this.v;
            if (object2 != null) {
                g g3 = this.b;
                g3.j((byte[])object2);
                this.v = null;
            }
        }
        if (object != null) {
            this.i.a(object);
            object2 = this.i;
            n3 = ((B80)object2).count(object);
            if (n3 == 0) {
                ((b$a)object).f();
            }
        }
        object = this.d;
        n3 = this.q;
        object = ((DefaultDrmSessionManager$e)object).a;
        long l4 = -9223372036854775807L;
        if (n3 == n4 && (n4 = ((DefaultDrmSessionManager)object).p) > 0 && (n4 = (int)((l3 = (l2 = ((DefaultDrmSessionManager)object).l) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0) {
            ((DefaultDrmSessionManager)object).o.add(this);
            object2 = ((DefaultDrmSessionManager)object).u;
            object2.getClass();
            El0 el0 = new El0(this, 0);
            long l7 = SystemClock.uptimeMillis();
            long l8 = ((DefaultDrmSessionManager)object).l;
            object2.postAtTime((Runnable)el0, (Object)this, l7 += l8);
        } else if (n3 == 0) {
            long l12;
            long l14;
            ((DefaultDrmSessionManager)object).m.remove(this);
            object3 = ((DefaultDrmSessionManager)object).r;
            if (object3 == this) {
                ((DefaultDrmSessionManager)object).r = null;
            }
            if ((object3 = ((DefaultDrmSessionManager)object).s) == this) {
                ((DefaultDrmSessionManager)object).s = null;
            }
            object3 = ((DefaultDrmSessionManager)object).i;
            object2 = ((DefaultDrmSessionManager$d)object3).a;
            ((HashSet)object2).remove(this);
            Object object4 = ((DefaultDrmSessionManager$d)object3).b;
            if (object4 == this) {
                ((DefaultDrmSessionManager$d)object3).b = null;
                n4 = (int)(((HashSet)object2).isEmpty() ? 1 : 0);
                if (n4 == 0) {
                    g$d g$d;
                    ((DefaultDrmSessionManager$d)object3).b = object2 = (DefaultDrmSession)((HashSet)object2).iterator().next();
                    ((DefaultDrmSession)object2).y = g$d = ((DefaultDrmSession)object2).b.b();
                    object3 = ((DefaultDrmSession)object2).s;
                    n3 = gz3.a;
                    g$d.getClass();
                    object3.getClass();
                    object4 = Iv1.b;
                    long l15 = ((AtomicLong)object4).getAndIncrement();
                    long l16 = SystemClock.elapsedRealtime();
                    n4 = 1;
                    object2 = new DefaultDrmSession$d(l15, n4 != 0, l16, g$d);
                    object3 = object3.obtainMessage(n4, object2);
                    object3.sendToTarget();
                }
            }
            if ((n4 = (int)((l14 = (l12 = ((DefaultDrmSessionManager)object).l) - l4) == 0L ? 0 : (l14 < 0L ? -1 : 1))) != 0) {
                object3 = ((DefaultDrmSessionManager)object).u;
                object3.getClass();
                object3.removeCallbacksAndMessages((Object)this);
                object3 = ((DefaultDrmSessionManager)object).o;
                object3.remove(this);
            }
        }
        ((DefaultDrmSessionManager)object).j();
    }

    public final boolean f(String string2) {
        this.p();
        byte[] byArray = this.v;
        ct3.h(byArray);
        return this.b.m(string2, byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(bl0_0 iterator) {
        iterator = this.i;
        Object object = ((B80)((Object)iterator)).a;
        synchronized (object) {
            iterator = ((B80)((Object)iterator)).c;
        }
        iterator = iterator.iterator();
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            object = (b$a)iterator.next();
            ((b$a)object).a();
        }
        return;
    }

    public final DrmSession$DrmSessionException getError() {
        DrmSession$DrmSessionException drmSession$DrmSessionException;
        this.p();
        int n3 = this.p;
        int n4 = 1;
        if (n3 == n4) {
            drmSession$DrmSessionException = this.u;
        } else {
            n3 = 0;
            drmSession$DrmSessionException = null;
        }
        return drmSession$DrmSessionException;
    }

    public final int getState() {
        this.p();
        return this.p;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(boolean object) {
        long l2;
        long l3;
        long l4;
        Comparable<UUID> comparable;
        int n3 = this.g;
        if (n3 != 0) {
            return;
        }
        Object object2 = this.v;
        int n4 = gz3.a;
        n4 = this.e;
        int n7 = 1;
        int n8 = 2;
        if (n4 != 0 && n4 != n7) {
            if (n4 != n8) {
                n3 = 3;
                if (n4 != n3) {
                    return;
                }
                this.w.getClass();
                this.v.getClass();
                byte[] byArray = this.w;
                this.m(byArray, n3, (boolean)object);
                return;
            }
            byte[] byArray = this.w;
            if (byArray != null) {
                n4 = (int)(this.o() ? 1 : 0);
                if (n4 == 0) return;
            }
            this.m((byte[])object2, n8, (boolean)object);
            return;
        }
        Object object3 = this.w;
        if (object3 == null) {
            this.m((byte[])object2, n7, (boolean)object);
            return;
        }
        n4 = this.p;
        n7 = 4;
        if (n4 != n7) {
            n4 = (int)(this.o() ? 1 : 0);
            if (n4 == 0) return;
        }
        if ((n4 = (int)((object3 = (Object)OF.d).equals(comparable = this.m) ? 1 : 0)) == 0) {
            l4 = Long.MAX_VALUE;
        } else {
            object3 = this.n();
            if (object3 == null) {
                n4 = 0;
                object3 = null;
            } else {
                long l7;
                Object object4;
                block22: {
                    object4 = "LicenseDurationRemaining";
                    l3 = -9223372036854775807L;
                    try {
                        object4 = object3.get(object4);
                        if (object4 == null) break block22;
                        l7 = Long.parseLong((String)object4);
                    }
                    catch (NumberFormatException numberFormatException) {}
                }
                l7 = l3;
                object4 = l7;
                String string2 = "PlaybackDurationRemaining";
                try {
                    object3 = object3.get(string2);
                    object3 = (String)object3;
                    if (object3 != null) {
                        l3 = Long.parseLong((String)object3);
                    }
                }
                catch (NumberFormatException numberFormatException) {}
                object3 = l3;
                comparable = new Comparable<UUID>(object4, object3);
                object3 = comparable;
            }
            object3.getClass();
            comparable = (Long)object3.first;
            l4 = (Long)comparable;
            object3 = (Long)object3.second;
            l3 = object3.longValue();
            l4 = Math.min(l4, l3);
        }
        n4 = this.e;
        if (n4 == 0 && (n4 = (int)((l2 = l4 - (l3 = (long)60)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) <= 0) {
            String string3 = "Offline license has expired or will expire soon. Remaining seconds: ";
            object3 = new StringBuilder(string3);
            object3.append(l4);
            object3 = object3.toString();
            Cx.b((String)object3);
            this.m((byte[])object2, n8, (boolean)object);
            return;
        }
        long l8 = 0L;
        long l12 = l4 - l8;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object <= 0) {
            KeysExpiredException keysExpiredException = new KeysExpiredException();
            this.j(keysExpiredException, n8);
            return;
        }
        this.p = n7;
        Object object5 = this.i;
        object2 = ((B80)object5).a;
        synchronized (object2) {
            object5 = ((B80)object5).c;
        }
        object5 = object5.iterator();
        while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
            object2 = (b$a)object5.next();
            ((b$a)object2).c();
        }
    }

    public final boolean i() {
        int n3 = this.p;
        int n4 = 3;
        n3 = n3 != n4 && n3 != (n4 = 4) ? 0 : 1;
        return n3 != 0;
    }

    /*
     * Exception decompiling
     */
    public final void j(Throwable var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 342->344)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void k(Throwable object, boolean n3) {
        boolean bl2 = object instanceof NotProvisionedException;
        if (!bl2 && !(bl2 = androidx.media3.exoplayer.drm.d.b((Throwable)object))) {
            n3 = n3 != 0 ? 1 : 2;
            this.j((Throwable)object, n3);
        } else {
            object = (DefaultDrmSessionManager$d)this.c;
            ((DefaultDrmSessionManager$d)object).b(this);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean l() {
        DefaultDrmSessionManager$d defaultDrmSessionManager$d;
        boolean bl2;
        block13: {
            Object object;
            Iterator iterator;
            Object object2;
            int n3 = this.i();
            bl2 = true;
            if (n3 != 0) {
                return bl2;
            }
            try {
                object2 = this.b;
                object2 = object2.c();
                this.v = (byte[])object2;
                iterator = this.b;
                object = this.k;
                iterator.h((byte[])object2, (nu2)object);
                object2 = this.b;
                iterator = (Iterator)this.v;
                this.t = object2 = object2.i((byte[])iterator);
                this.p = n3 = 3;
                iterator = this.i;
                object = ((B80)((Object)iterator)).a;
                synchronized (object) {
                    iterator = ((B80)((Object)iterator)).c;
                }
            }
            catch (NoSuchMethodError noSuchMethodError) {
                break block13;
            }
            catch (Exception exception) {
                // empty catch block
                break block13;
            }
            catch (NotProvisionedException notProvisionedException) {
                object2 = (DefaultDrmSessionManager$d)this.c;
                ((DefaultDrmSessionManager$d)object2).b(this);
                return false;
            }
            {
                iterator = iterator.iterator();
                while (true) {
                    boolean bl3;
                    if (!(bl3 = iterator.hasNext())) {
                        object2 = this.v;
                        object2.getClass();
                        return bl2;
                    }
                    object = iterator.next();
                    object = (b$a)object;
                    ((b$a)object).d(n3);
                }
            }
        }
        boolean bl4 = androidx.media3.exoplayer.drm.d.b((Throwable)((Object)defaultDrmSessionManager$d));
        if (bl4) {
            defaultDrmSessionManager$d = (DefaultDrmSessionManager$d)this.c;
            defaultDrmSessionManager$d.b(this);
            return false;
        }
        this.j((Throwable)((Object)defaultDrmSessionManager$d), (int)(bl2 ? 1 : 0));
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public final void m(byte[] object, int n3, boolean bl2) {
        block15: {
            void var1_4;
            Object object2 = this.b;
            List list = this.a;
            HashMap hashMap = this.h;
            g$a g$a = object2.l((byte[])object, list, n3, hashMap);
            this.x = g$a;
            object = this.s;
            n3 = gz3.a;
            g$a.getClass();
            object.getClass();
            object2 = Iv1.b;
            long l2 = ((AtomicLong)object2).getAndIncrement();
            long l3 = SystemClock.elapsedRealtime();
            DefaultDrmSession$d defaultDrmSession$d = new DefaultDrmSession$d(l2, bl2, l3, g$a);
            int n4 = 2;
            object = object.obtainMessage(n4, (Object)defaultDrmSession$d);
            try {
                object.sendToTarget();
                break block15;
            }
            catch (NoSuchMethodError noSuchMethodError) {
            }
            catch (Exception exception) {
                // empty catch block
            }
            n3 = 1;
            this.k((Throwable)var1_4, n3 != 0);
        }
    }

    public final Map n() {
        this.p();
        Object object = this.v;
        if (object == null) {
            object = null;
        } else {
            g g3 = this.b;
            object = g3.a((byte[])object);
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean o() {
        void var2_5;
        boolean bl2 = true;
        g g3 = this.b;
        byte[] byArray = this.v;
        byte[] byArray2 = this.w;
        try {
            g3.d(byArray, byArray2);
            return bl2;
        }
        catch (NoSuchMethodError noSuchMethodError) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.j((Throwable)var2_5, (int)(bl2 ? 1 : 0));
        return false;
    }

    public final void p() {
        Object object;
        Object object2;
        Object object3 = Thread.currentThread();
        if (object3 != (object2 = (object = this.n).getThread())) {
            object3 = new StringBuilder("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
            object2 = Thread.currentThread().getName();
            ((StringBuilder)object3).append((String)object2);
            object2 = "\nExpected thread: ";
            ((StringBuilder)object3).append((String)object2);
            object = object.getThread().getName();
            ((StringBuilder)object3).append((String)object);
            object3 = ((StringBuilder)object3).toString();
            object = new IllegalStateException();
            Cx.g((String)object3, (Throwable)object);
        }
    }
}

