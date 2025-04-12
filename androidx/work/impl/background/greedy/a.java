/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.background.greedy.DelayedWorkTracker$1;
import androidx.work.impl.background.greedy.a$a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;
import kotlinx.coroutines.i;

public final class a
implements mt2_0,
t82,
fe0_0 {
    public final Context a;
    public final HashMap b;
    public final eo0_0 c;
    public boolean d;
    public final Object e;
    public final jh3_1 f;
    public final kz2_0 g;
    public final ii3_0 h;
    public final androidx.work.a i;
    public final HashMap j;
    public Boolean k;
    public final MH3 l;
    public final Si3 m;
    public final Cn3 n;

    static {
        qx1.b("GreedyScheduler");
    }

    public a(Context object, androidx.work.a a2, aq3 aq32, kz2_0 kz2_02, ki3_2 ki3_22, Si3 si3) {
        Object object2 = new HashMap();
        this.b = object2;
        this.e = object2 = new Object();
        object2 = new ab3_0();
        Object object3 = new jh3_1((ab3_0)object2);
        this.f = object3;
        object2 = new HashMap();
        this.j = object2;
        this.a = object;
        object = a2.g;
        object3 = a2.d;
        this.c = object2 = new eo0_0(this, (Sm0)object, (TV)object3);
        this.n = object2 = new Cn3((Sm0)object, ki3_22);
        this.m = si3;
        super(aq32);
        this.l = object;
        this.i = a2;
        this.g = kz2_02;
        this.h = ki3_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(gI3 gI32, boolean bl2) {
        Object object = this.f.a(gI32);
        if (object != null) {
            Cn3 cn3 = this.n;
            cn3.a((xb3_0)object);
        }
        this.f(gI32);
        if (bl2) return;
        Object object2 = this.e;
        synchronized (object2) {
            object = this.j;
            ((HashMap)object).remove(gI32);
            return;
        }
    }

    public final void b(String object) {
        boolean bl2;
        Object object2;
        Object object3 = this.k;
        if (object3 == null) {
            object3 = this.a;
            object2 = this.i;
            bl2 = Gz2.a((Context)object3, (androidx.work.a)object2);
            object3 = bl2;
            this.k = object3;
        }
        if (!(bl2 = ((Boolean)(object3 = this.k)).booleanValue())) {
            qx1.a().getClass();
            return;
        }
        bl2 = this.d;
        if (!bl2) {
            object3 = this.g;
            ((kz2_0)object3).a(this);
            this.d = bl2 = true;
        }
        qx1.a().getClass();
        object3 = this.c;
        if (object3 != null && (object2 = (Runnable)((eo0_0)object3).d.remove(object)) != null) {
            object3 = ((eo0_0)object3).b;
            ((Sm0)object3).a((Runnable)object2);
        }
        object3 = this.f;
        object = ((jh3_1)object3).remove((String)object).iterator();
        while (bl2 = object.hasNext()) {
            object3 = (xb3_0)object.next();
            this.n.a((xb3_0)object3);
            object2 = this.h;
            object2.a((xb3_0)object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(EI3 ... object) {
        boolean bl2;
        Object object2;
        int n3 = 1;
        Object object3 = this.k;
        if (object3 == null) {
            object3 = this.a;
            object2 = this.i;
            bl2 = Gz2.a((Context)object3, (androidx.work.a)object2);
            object3 = bl2;
            this.k = object3;
        }
        if (!(bl2 = ((Boolean)(object3 = this.k)).booleanValue())) {
            qx1.a().getClass();
            return;
        }
        bl2 = this.d;
        if (!bl2) {
            object3 = this.g;
            ((kz2_0)object3).a(this);
            this.d = n3;
        }
        object3 = new HashSet();
        object2 = new HashSet();
        int n4 = ((EI3[])object).length;
        Object object4 = null;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            int n7;
            Object object5 = this.f;
            Object object6 = object[i3];
            Object object7 = JI3.a((EI3)object6);
            boolean bl3 = ((jh3_1)object5).b((gI3)object7);
            if (bl3) continue;
            long l2 = this.g((EI3)object6);
            l2 = Math.max(((EI3)object6).a(), l2);
            Object object8 = this.i.d;
            object8.getClass();
            long l3 = System.currentTimeMillis();
            Object object9 = ((EI3)object6).b;
            Object object10 = hI3$b.ENQUEUED;
            if (object9 != object10) continue;
            Object object11 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object11 < 0) {
                object8 = this.c;
                if (object8 == null) continue;
                HashMap hashMap = ((eo0_0)object8).d;
                object9 = ((EI3)object6).a;
                object9 = (Runnable)hashMap.remove(object9);
                object10 = ((eo0_0)object8).b;
                if (object9 != null) {
                    ((Sm0)object10).a((Runnable)object9);
                }
                object9 = new DelayedWorkTracker$1((eo0_0)object8, (EI3)object6);
                object6 = ((EI3)object6).a;
                hashMap.put(object6, object9);
                object6 = ((eo0_0)object8).c;
                l3 = object6.currentTimeMillis();
                ((Sm0)object10).b(l2 -= l3, (Runnable)object9);
                continue;
            }
            bl3 = ((EI3)object6).e();
            if (bl3) {
                object7 = ((EI3)object6).j;
                n7 = Build.VERSION.SDK_INT;
                int n8 = 23;
                if (n7 >= n8 && (n8 = (int)(((b60)object7).d ? 1 : 0)) != 0) {
                    object7 = qx1.a();
                    ((EI3)object6).toString();
                    object7.getClass();
                    continue;
                }
                n8 = 24;
                if (n7 >= n8 && (bl3 = ((b60)object7).f())) {
                    object7 = qx1.a();
                    ((EI3)object6).toString();
                    object7.getClass();
                    continue;
                }
                ((HashSet)object3).add(object6);
                object6 = ((EI3)object6).a;
                ((HashSet)object2).add(object6);
                continue;
            }
            object7 = this.f;
            object5 = JI3.a((EI3)object6);
            bl3 = ((jh3_1)object7).b((gI3)object5);
            if (bl3) continue;
            qx1.a().getClass();
            object7 = this.f;
            object7.getClass();
            n7 = yb3_0.a;
            object5 = "spec";
            Intrinsics.checkNotNullParameter(object6, (String)object5);
            object6 = JI3.a((EI3)object6);
            object6 = ((jh3_1)object7).c((gI3)object6);
            this.n.b((xb3_0)object6);
            object7 = this.h;
            object7.d((xb3_0)object6);
        }
        object = this.e;
        synchronized (object) {
            Throwable throwable2;
            block14: {
                block13: {
                    try {
                        n3 = ((HashSet)object3).isEmpty();
                        if (n3 != 0) break block13;
                        Iterator iterator = ",";
                        TextUtils.join((CharSequence)((Object)iterator), object2);
                        iterator = qx1.a();
                        iterator.getClass();
                        iterator = ((HashSet)object3).iterator();
                        while (bl2 = iterator.hasNext()) {
                            object3 = iterator.next();
                            Object object12 = this.b;
                            object2 = JI3.a((EI3)(object3 = (EI3)object3));
                            n4 = (int)(((HashMap)object12).containsKey(object2) ? 1 : 0);
                            if (n4 != 0) continue;
                            object12 = this.l;
                            object4 = this.m;
                            object4 = object4.b();
                            object3 = OH3.a((MH3)object12, (EI3)object3, (c)object4, this);
                            object12 = this.b;
                            ((HashMap)object12).put(object2, object3);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void d(EI3 object, k60_0 object2) {
        object = JI3.a((EI3)object);
        boolean bl2 = object2 instanceof k60$a;
        ii3_0 ii3_02 = this.h;
        Cn3 cn3 = this.n;
        jh3_1 jh3_12 = this.f;
        if (bl2) {
            boolean bl3 = jh3_12.b((gI3)object);
            if (!bl3) {
                object2 = qx1.a();
                ((gI3)object).toString();
                object2.getClass();
                object = jh3_12.c((gI3)object);
                cn3.b((xb3_0)object);
                ii3_02.d((xb3_0)object);
            }
        } else {
            qx1 qx12 = qx1.a();
            ((gI3)object).toString();
            qx12.getClass();
            object = jh3_12.a((gI3)object);
            if (object != null) {
                cn3.a((xb3_0)object);
                object2 = (k60$b)object2;
                int n3 = ((k60$b)object2).a;
                ii3_02.b((xb3_0)object, n3);
            }
        }
    }

    public final boolean e() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void f(gI3 gI32) {
        Object object = this.e;
        // MONITORENTER : object
        Object object2 = this.b;
        object2 = ((HashMap)object2).remove(gI32);
        object2 = (i)object2;
        // MONITOREXIT : object
        if (object2 == null) return;
        object = qx1.a();
        Objects.toString(gI32);
        object.getClass();
        gI32 = null;
        object2.d(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long g(EI3 eI3) {
        Object object = this.e;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                gI3 gI32;
                block5: {
                    try {
                        gI32 = JI3.a(eI3);
                        object2 = this.j;
                        object2 = ((HashMap)object2).get(gI32);
                        object2 = (a$a)object2;
                        if (object2 != null) break block5;
                        int n3 = eI3.k;
                        Object object3 = this.i;
                        object3 = ((androidx.work.a)object3).d;
                        object3.getClass();
                        long l2 = System.currentTimeMillis();
                        object2 = new a$a(n3, l2);
                        HashMap hashMap = this.j;
                        hashMap.put(gI32, object2);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                long l3 = ((a$a)object2).b;
                int n4 = eI3.k;
                int n7 = ((a$a)object2).a;
                n4 = n4 - n7 + -5;
                n7 = 0;
                gI32 = null;
                n4 = Math.max(n4, 0);
                long l4 = n4;
                long l7 = 30000L;
                return l4 * l7 + l3;
            }
            throw throwable2;
        }
    }
}

