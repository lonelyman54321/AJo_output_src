/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.a;
import okhttp3.internal.concurrent.c;

public final class b {
    public final c a;
    public final String b;
    public boolean c;
    public ri3_1 d;
    public final ArrayList e;
    public boolean f;

    public b(c arrayList, String string2) {
        Intrinsics.checkNotNullParameter(arrayList, "taskRunner");
        Intrinsics.checkNotNullParameter(string2, "name");
        this.a = arrayList;
        this.b = string2;
        this.e = arrayList = new ArrayList();
    }

    public static /* synthetic */ void d(b b2, ri3_1 ri3_12) {
        b2.c(ri3_12, 0L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = ez3.a;
        object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        boolean bl2 = this.b();
                        if (!bl2) break block3;
                        object2 = this.a;
                        ((c)object2).e(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final boolean b() {
        int n3;
        Object object = this.d;
        int n4 = 1;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            boolean bl2 = ((ri3_1)object).b;
            if (bl2) {
                this.f = n4;
            }
        }
        object = this.e;
        boolean bl3 = false;
        ri3_1 ri3_12 = null;
        for (int i3 = ((ArrayList)object).size() - n4; (n3 = -1) < i3; i3 += -1) {
            Object object2 = (ri3_1)((ArrayList)object).get(i3);
            n3 = (int)(((ri3_1)object2).b ? 1 : 0);
            if (n3 == 0) continue;
            ri3_12 = (ri3_1)((ArrayList)object).get(i3);
            object2 = okhttp3.internal.concurrent.c.i;
            Level level = Level.FINE;
            n3 = (int)(((Logger)object2).isLoggable(level) ? 1 : 0);
            if (n3 != 0) {
                object2 = "canceled";
                okhttp3.internal.concurrent.a.a(ri3_12, this, (String)object2);
            }
            ((ArrayList)object).remove(i3);
            bl3 = true;
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(ri3_1 object, long l2) {
        Intrinsics.checkNotNullParameter(object, "task");
        c c2 = this.a;
        synchronized (c2) {
            Throwable throwable2;
            block9: {
                boolean bl2;
                block6: {
                    boolean bl3;
                    block7: {
                        block8: {
                            try {
                                bl2 = this.c;
                                if (!bl2) break block6;
                                bl3 = ((ri3_1)object).b;
                                if (!bl3) break block7;
                                Object object2 = okhttp3.internal.concurrent.c.h;
                                object2 = okhttp3.internal.concurrent.c.i;
                                Level level = Level.FINE;
                                bl3 = ((Logger)object2).isLoggable(level);
                                if (!bl3) break block8;
                                object2 = "schedule canceled (queue is shutdown)";
                                okhttp3.internal.concurrent.a.a((ri3_1)object, this, (String)object2);
                            }
                            catch (Throwable throwable2) {}
                        }
                        return;
                    }
                    Object object3 = okhttp3.internal.concurrent.c.h;
                    object3 = okhttp3.internal.concurrent.c.i;
                    Level level = Level.FINE;
                    bl3 = ((Logger)object3).isLoggable(level);
                    if (bl3) {
                        object3 = "schedule failed (queue is shutdown)";
                        okhttp3.internal.concurrent.a.a((ri3_1)object, this, (String)object3);
                    }
                    object = new RejectedExecutionException();
                    throw object;
                    break block9;
                }
                bl2 = false;
                boolean bl4 = this.e((ri3_1)object, l2, false);
                if (bl4) {
                    object = this.a;
                    ((c)object).e(this);
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final boolean e(ri3_1 object, long l2, boolean bl2) {
        block13: {
            int n3;
            int n4;
            boolean bl3;
            ArrayList arrayList;
            block11: {
                Object object2;
                String string2;
                Object object3;
                long l3;
                Object object4;
                block12: {
                    Intrinsics.checkNotNullParameter(object, "task");
                    object.getClass();
                    Intrinsics.checkNotNullParameter(this, "queue");
                    object4 = ((ri3_1)object).c;
                    if (object4 == this) break block12;
                    if (object4 != null) break block13;
                    ((ri3_1)object).c = this;
                }
                object4 = this.a.a;
                long l4 = object4.nanoTime();
                long l7 = l4 + l2;
                arrayList = this.e;
                int n7 = arrayList.indexOf(object);
                bl3 = false;
                n4 = -1;
                if (n7 != n4) {
                    l3 = ((ri3_1)object).d;
                    long l8 = l3 - l7;
                    Object object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object5 <= 0) {
                        Object object6 = okhttp3.internal.concurrent.c.i;
                        Level level = Level.FINE;
                        boolean bl4 = ((Logger)object6).isLoggable(level);
                        if (bl4) {
                            object6 = "already scheduled";
                            okhttp3.internal.concurrent.a.a((ri3_1)object, this, (String)object6);
                        }
                        return false;
                    }
                    arrayList.remove(n7);
                }
                ((ri3_1)object).d = l7;
                Logger logger = okhttp3.internal.concurrent.c.i;
                Level level = Level.FINE;
                n7 = (int)(logger.isLoggable(level) ? 1 : 0);
                if (n7 != 0) {
                    if (bl2) {
                        object3 = okhttp3.internal.concurrent.a.b(l7 -= l4);
                        string2 = "run again after ";
                        object3 = string2.concat((String)object3);
                    } else {
                        object3 = okhttp3.internal.concurrent.a.b(l7 -= l4);
                        string2 = "scheduled after ";
                        object3 = string2.concat((String)object3);
                    }
                    okhttp3.internal.concurrent.a.a((ri3_1)object, this, (String)object3);
                }
                object3 = arrayList.iterator();
                n3 = 0;
                string2 = null;
                while ((object2 = object3.hasNext()) != 0) {
                    ri3_1 ri3_12 = (ri3_1)object3.next();
                    l3 = ri3_12.d - l4;
                    long l12 = l3 - l2;
                    object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object2 <= 0) {
                        ++n3;
                        continue;
                    }
                    break block11;
                }
                n3 = -1;
            }
            if (n3 == n4) {
                n3 = arrayList.size();
            }
            arrayList.add(n3, object);
            if (n3 == 0) {
                bl3 = true;
            }
            return bl3;
        }
        String string3 = "task is in multiple queues".toString();
        object = new IllegalStateException(string3);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        Object object = ez3.a;
        object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    boolean bl2 = true;
                    try {
                        this.c = bl2;
                        bl2 = this.b();
                        if (!bl2) break block3;
                        object2 = this.a;
                        ((c)object2).e(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final String toString() {
        return this.b;
    }
}

