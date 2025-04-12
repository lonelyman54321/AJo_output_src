/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.i$b;
import androidx.navigation.d;
import androidx.navigation.d$a;
import androidx.navigation.e;
import androidx.navigation.e$a$a;
import androidx.navigation.h;
import androidx.navigation.i;
import androidx.navigation.p;
import androidx.navigation.q;
import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class e$a
extends kU1 {
    public final p g;
    public final /* synthetic */ e h;

    public e$a(e e2, p p2) {
        Intrinsics.checkNotNullParameter(p2, "navigator");
        this.h = e2;
        this.g = p2;
    }

    public static final /* synthetic */ void g(e$a e$a, d d2, boolean bl2) {
        super.c(d2, bl2);
    }

    public final d a(i i3, Bundle bundle) {
        Intrinsics.checkNotNullParameter(i3, "destination");
        Object object = this.h;
        Context context = ((e)object).a;
        i$b i$b = ((e)object).j();
        object = ((e)object).p;
        return d$a.a(context, i3, bundle, i$b, (eu1_0)object);
    }

    public final void b(d object) {
        Intrinsics.checkNotNullParameter(object, "entry");
        e e2 = this.h;
        Object object2 = e2.z.get(object);
        Object object3 = Boolean.TRUE;
        boolean bl2 = Intrinsics.areEqual(object2, object3);
        super.b((d)object);
        e2.z.remove(object);
        object3 = e2.g;
        boolean bl3 = ((fp_2)object3).contains(object);
        kb3_2 kb3_22 = e2.i;
        if (!bl3) {
            e2.x((d)object);
            Object object4 = ((d)object).h.d;
            i$b i$b = i$b.CREATED;
            bl3 = object4.isAtLeast(i$b);
            if (bl3) {
                object4 = i$b.DESTROYED;
                ((d)object).c((i$b)((Object)object4));
            }
            bl3 = object3 instanceof Collection;
            object = ((d)object).f;
            if (!bl3 || !(bl3 = ((fp_2)object3).isEmpty())) {
                object3 = ((AbstractList)object3).iterator();
                while (bl3 = object3.hasNext()) {
                    object4 = ((d)object3.next()).f;
                    bl3 = Intrinsics.areEqual(object4, object);
                    if (!bl3) continue;
                    break;
                }
            } else if (!bl2 && (object2 = e2.p) != null) {
                object3 = "backStackEntryId";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object2 = ((h)object2).a;
                object = (rd3_0)object2.remove(object);
                if (object != null) {
                    ((rd3_0)object).a();
                }
            }
            e2.y();
            object = e2.v();
            kb3_22.getClass();
            kb3_22.k(null, object);
        } else {
            boolean bl4 = this.d;
            if (!bl4) {
                e2.y();
                object = CollectionsKt.m0((Collection)object3);
                object2 = e2.h;
                object2.getClass();
                ((kb3_2)object2).k(null, object);
                object = e2.v();
                kb3_22.getClass();
                kb3_22.k(null, object);
            }
        }
    }

    public final void c(d d2, boolean bl2) {
        Object object = "popUpTo";
        Intrinsics.checkNotNullParameter(d2, (String)object);
        e e2 = this.h;
        Object object2 = e2.v;
        Object object3 = d2.b.a;
        object2 = ((q)object2).b((String)object3);
        object3 = bl2;
        LinkedHashMap linkedHashMap = e2.z;
        linkedHashMap.put(d2, object3);
        object3 = this.g;
        boolean bl3 = Intrinsics.areEqual(object2, object3);
        if (bl3) {
            object2 = e2.y;
            if (object2 != null) {
                object2.invoke(d2);
                super.c(d2, bl2);
            } else {
                object2 = new e$a$a(this, d2, bl2);
                Intrinsics.checkNotNullParameter(d2, (String)object);
                Intrinsics.checkNotNullParameter(object2, "onComplete");
                Object object4 = e2.g;
                int n3 = ((fp_2)object4).indexOf(d2);
                if (n3 < 0) {
                    Objects.toString(d2);
                } else {
                    int n4 = 1;
                    int n7 = ((fp_2)object4).c;
                    if ((n3 += n4) != n7) {
                        object4 = ((d)((fp_2)object4).get((int)n3)).b;
                        int n8 = ((i)object4).g;
                        n3 = 0;
                        object = null;
                        e2.r(n8, n4 != 0, false);
                    }
                    androidx.navigation.e.u(e2, d2);
                    ((e$a$a)object2).invoke();
                    e2.z();
                    e2.b();
                }
            }
        } else {
            object = e2.w.get(object2);
            Intrinsics.checkNotNull(object);
            object = (e$a)object;
            ((e$a)object).c(d2, bl2);
        }
    }

    public final void d(d d2, boolean bl2) {
        Intrinsics.checkNotNullParameter(d2, "popUpTo");
        super.d(d2, bl2);
    }

    public final void e(d object) {
        Intrinsics.checkNotNullParameter(object, "entry");
        super.e((d)object);
        Object object2 = this.h.g;
        boolean bl2 = object2.contains(object);
        if (bl2) {
            object2 = i$b.STARTED;
            ((d)object).c((i$b)((Object)object2));
            return;
        }
        object = new IllegalStateException("Cannot transition entry that is not in the back stack");
        throw object;
    }

    public final void f(d object) {
        Object object2;
        block7: {
            block6: {
                Object object3;
                Object object4;
                block5: {
                    object2 = "backStackEntry";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object4 = this.h;
                    object3 = ((e)object4).v;
                    Object object5 = ((d)object).b.a;
                    object3 = ((q)object3).b((String)object5);
                    object5 = this.g;
                    boolean bl2 = Intrinsics.areEqual(object3, object5);
                    if (!bl2) break block5;
                    object4 = ((e)object4).x;
                    if (object4 != null) {
                        object4.invoke(object);
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        super.f((d)object);
                    } else {
                        object = ((d)object).b;
                        Objects.toString(object);
                    }
                    break block6;
                }
                object2 = ((e)object4).w.get(object3);
                if (object2 == null) break block7;
                object2 = (e$a)object2;
                ((e$a)object2).f((d)object);
            }
            return;
        }
        object2 = new StringBuilder("NavigatorBackStack for ");
        object = ((d)object).b.a;
        object = h30_0.a((StringBuilder)object2, (String)object, " should already be created");
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final void h(d d2) {
        Intrinsics.checkNotNullParameter(d2, "backStackEntry");
        super.f(d2);
    }
}

