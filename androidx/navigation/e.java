/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.a;
import androidx.navigation.b;
import androidx.navigation.d;
import androidx.navigation.d$a;
import androidx.navigation.e$a;
import androidx.navigation.e$b;
import androidx.navigation.e$c;
import androidx.navigation.e$e;
import androidx.navigation.e$f;
import androidx.navigation.e$g;
import androidx.navigation.f;
import androidx.navigation.h;
import androidx.navigation.i;
import androidx.navigation.i$a;
import androidx.navigation.i$b;
import androidx.navigation.j;
import androidx.navigation.l;
import androidx.navigation.n;
import androidx.navigation.p;
import androidx.navigation.p$a;
import androidx.navigation.q;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;

public class e {
    public int A;
    public final ArrayList B;
    public final i23_0 C;
    public final ee2_2 D;
    public final Context a;
    public final Activity b;
    public j c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final fp_2 g;
    public final kb3_2 h;
    public final kb3_2 i;
    public final ge2_2 j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public mu1_1 o;
    public h p;
    public final CopyOnWriteArrayList q;
    public androidx.lifecycle.i$b r;
    public final vs1_0 s;
    public final e$f t;
    public final boolean u;
    public final q v;
    public final LinkedHashMap w;
    public Function1 x;
    public Function1 y;
    public final LinkedHashMap z;

    public e(Context object) {
        Object object2;
        Object object3;
        block1: {
            boolean bl2;
            Intrinsics.checkNotNullParameter(object, "context");
            this.a = object;
            object3 = e$c.c;
            object = ez2_1.d((Function1)object3, object).iterator();
            while (bl2 = object.hasNext()) {
                object3 = object.next();
                object2 = object3;
                object2 = (Context)object3;
                boolean bl3 = object2 instanceof Activity;
                if (!bl3) continue;
                break block1;
            }
            bl2 = false;
            object3 = null;
        }
        object3 = (Activity)object3;
        this.b = object3;
        object = new fp_2();
        this.g = object;
        object = mz0_2.a;
        object3 = lb3_2.a(object);
        this.h = object3;
        object = lb3_2.a(object);
        this.i = object;
        object = ms0_1.b((kb3_2)object);
        this.j = object;
        object = new LinkedHashMap();
        this.k = object;
        object = new LinkedHashMap();
        this.l = object;
        object = new LinkedHashMap();
        this.m = object;
        object = new LinkedHashMap();
        this.n = object;
        object = new CopyOnWriteArrayList();
        this.q = object;
        object = androidx.lifecycle.i$b.INITIALIZED;
        this.r = object;
        super(this);
        this.s = object;
        super(this);
        this.t = object;
        int n3 = 1;
        this.u = n3;
        object3 = new Object();
        this.v = object3;
        super();
        this.w = object2;
        super();
        this.z = object2;
        object2 = new l((q)object3);
        ((q)object3).a((p)object2);
        Context context = this.a;
        object2 = new a(context);
        ((q)object3).a((p)object2);
        this.B = object3 = new Object();
        super(this);
        yr1_2.b(object3);
        object3 = he_2.DROP_OLDEST;
        object = k23_0.b(n3, 0, object3, 2);
        this.C = object;
        object = ms0_1.a((i23_0)object);
        this.D = object;
    }

    public static i e(int n3, i i3, i i8, boolean bl2) {
        j j3;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(i3, (String)object);
        int n4 = i3.g;
        if (n4 == n3 && (i8 == null || (n4 = (int)(Intrinsics.areEqual(i3, i8) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object = i3.b, j3 = i8.b) ? 1 : 0)) != 0)) {
            return i3;
        }
        n4 = i3 instanceof j;
        if (n4 != 0) {
            i3 = (j)i3;
        } else {
            i3 = i3.b;
            Intrinsics.checkNotNull(i3);
        }
        return ((j)i3).f(n3, i3, i8, bl2);
    }

    public static void p(e object, String object2, n object3, int n3) {
        if ((n3 &= 2) != 0) {
            object3 = null;
        }
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "route");
        Object object4 = ((e)object).c;
        if (object4 != null) {
            object4 = ((e)object).g;
            object4 = ((e)object).l((fp_2)object4);
            boolean bl2 = true;
            if ((object4 = ((j)object4).h((String)object2, bl2, (i)object4)) != null) {
                object2 = ((i$b)object4).a;
                object4 = ((i$b)object4).b;
                if ((object4 = ((i)object2).a((Bundle)object4)) == null) {
                    object4 = new Bundle();
                }
                Intent intent = new Intent();
                String string2 = ((i)object2).h;
                if (string2 != null) {
                    String string3 = "android-app://androidx.navigation/";
                    string2 = string3.concat(string2);
                } else {
                    string2 = "";
                }
                string2 = Uri.parse((String)string2);
                Intrinsics.checkExpressionValueIsNotNull(string2, "Uri.parse(this)");
                intent.setDataAndType((Uri)string2, null);
                intent.setAction(null);
                object4.putParcelable("android-support-nav:controller:deepLinkIntent", (Parcelable)intent);
                ((e)object).n((i)object2, (Bundle)object4, (n)object3, null);
                return;
            }
            object2 = Gn.a("Navigation destination that matches route ", (String)object2, " cannot be found in the navigation graph ");
            object = ((e)object).c;
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
            object3 = new IllegalArgumentException((String)object);
            throw object3;
        }
        object3 = new StringBuilder("Cannot navigate to ");
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(". Navigation graph has not been set for NavController ");
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append('.');
        object = ((StringBuilder)object3).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static /* synthetic */ void u(e e2, d d2) {
        fp_2 fp_22 = new fp_2();
        e2.t(d2, false, fp_22);
    }

    public final void a(i object, Bundle object2, d object3, List object4) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object5;
        boolean bl5;
        boolean bl6;
        Object object6;
        Object object7;
        int n3;
        Object object8;
        int n4;
        Object object9;
        int n7;
        Object object10;
        Object object11 = ((d)object3).b;
        int n10 = object11 instanceof CS0;
        int n14 = 1;
        fp_2 fp_22 = this.g;
        if (n10 == 0) {
            while ((n10 = fp_22.isEmpty()) == 0 && (n10 = (object10 = ((d)fp_22.last()).b) instanceof CS0) != 0) {
                object10 = ((d)fp_22.last()).b;
                n10 = ((i)object10).g;
                n7 = 0;
                object9 = null;
                if ((n10 = (int)(this.r(n10, n14 != 0, false) ? 1 : 0)) != 0) continue;
            }
        }
        object10 = new fp_2();
        n7 = object instanceof j;
        Context context = this.a;
        Object object12 = null;
        if (n7 != 0) {
            object9 = object11;
            do {
                block26: {
                    Intrinsics.checkNotNull(object9);
                    object9 = ((i)object9).b;
                    if (object9 == null) continue;
                    n4 = object4.size();
                    object8 = object4.listIterator(n4);
                    while ((n3 = object8.hasPrevious()) != 0) {
                        object6 = object7 = object8.previous();
                        object6 = ((d)object7).b;
                        bl6 = Intrinsics.areEqual(object6, object9);
                        if (!bl6) continue;
                        break block26;
                    }
                    n3 = 0;
                    object7 = null;
                }
                object7 = (d)object7;
                if (object7 == null) {
                    object8 = this.j();
                    object7 = this.p;
                    object7 = d$a.a(context, (i)object9, (Bundle)object2, (androidx.lifecycle.i$b)((Object)object8), (eu1_0)object7);
                }
                ((fp_2)object10).addFirst(object7);
                n4 = fp_22.isEmpty() ^ n14;
                if (n4 == 0 || (object8 = ((d)fp_22.last()).b) != object9) continue;
                object8 = (d)fp_22.last();
                androidx.navigation.e.u(this, (d)object8);
            } while (object9 != null && object9 != object);
        }
        object9 = (n7 = ((fp_2)object10).isEmpty()) != 0 ? object11 : ((d)((fp_2)object10).first()).b;
        while (object9 != null && (object8 = this.d(n4 = ((i)object9).g, (i)object9)) != object9) {
            block27: {
                object9 = ((i)object9).b;
                if (object9 == null) continue;
                if (object2 != null && (n4 = (int)(object2.isEmpty() ? 1 : 0)) == n14) {
                    n4 = 0;
                    object8 = null;
                } else {
                    object8 = object2;
                }
                n3 = object4.size();
                object7 = object4.listIterator(n3);
                while (bl6 = object7.hasPrevious()) {
                    Object object13 = object6 = object7.previous();
                    object13 = ((d)object6).b;
                    boolean bl7 = Intrinsics.areEqual(object13, object9);
                    if (!bl7) continue;
                    break block27;
                }
                bl6 = false;
                object6 = null;
            }
            object6 = (d)object6;
            if (object6 == null) {
                object8 = ((i)object9).a((Bundle)object8);
                object7 = this.j();
                object6 = this.p;
                object6 = d$a.a(context, (i)object9, (Bundle)object8, object7, object6);
            }
            ((fp_2)object10).addFirst(object6);
        }
        boolean bl8 = ((fp_2)object10).isEmpty();
        if (!bl8) {
            object11 = ((d)((fp_2)object10).first()).b;
        }
        while (!(bl5 = fp_22.isEmpty()) && (bl5 = (object5 = ((d)fp_22.last()).b) instanceof j)) {
            object5 = ((d)fp_22.last()).b;
            object9 = "null cannot be cast to non-null type androidx.navigation.NavGraph";
            Intrinsics.checkNotNull(object5, (String)object9);
            object5 = ((j)object5).k;
            n7 = ((i)object11).g;
            object5 = ((ca3)object5).f(n7);
            if (object5 != null) break;
            object5 = (d)fp_22.last();
            androidx.navigation.e.u(this, (d)object5);
        }
        if (bl4 = fp_22.isEmpty()) {
            boolean bl9 = false;
            object11 = null;
        } else {
            object11 = fp_22.b;
            int n8 = fp_22.a;
            object11 = object11[n8];
        }
        object11 = (d)object11;
        if (object11 == null) {
            boolean bl10 = ((fp_2)object10).isEmpty();
            if (bl10) {
                boolean bl11 = false;
                object11 = null;
            } else {
                object11 = ((fp_2)object10).b;
                int n15 = ((fp_2)object10).a;
                object11 = object11[n15];
            }
            object11 = (d)object11;
        }
        if (object11 != null) {
            object11 = ((d)object11).b;
        } else {
            boolean bl12 = false;
            object11 = null;
        }
        object5 = this.c;
        boolean bl13 = Intrinsics.areEqual(object11, object5);
        if (!bl13) {
            boolean bl14;
            int n16 = object4.size();
            object4 = object4.listIterator(n16);
            while (bl14 = object4.hasPrevious()) {
                object5 = object11 = object4.previous();
                object5 = ((d)object11).b;
                object9 = this.c;
                Intrinsics.checkNotNull(object9);
                boolean bl15 = Intrinsics.areEqual(object5, object9);
                if (!bl15) continue;
                object12 = object11;
                break;
            }
            if ((object12 = (Object[])object12) == null) {
                object4 = this.c;
                Intrinsics.checkNotNull(object4);
                object11 = this.c;
                Intrinsics.checkNotNull(object11);
                object2 = ((i)object11).a((Bundle)object2);
                object11 = this.j();
                object5 = this.p;
                object12 = d$a.a(context, (i)object4, (Bundle)object2, (androidx.lifecycle.i$b)((Object)object11), (eu1_0)object5);
            }
            ((fp_2)object10).addFirst(object12);
        }
        object2 = ((AbstractList)object10).iterator();
        while (bl3 = object2.hasNext()) {
            object4 = (d)object2.next();
            object11 = ((d)object4).b.a;
            object11 = this.v.b((String)object11);
            object5 = this.w;
            if ((object11 = ((LinkedHashMap)object5).get(object11)) != null) {
                object11 = (e$a)object11;
                ((e$a)object11).h((d)object4);
                continue;
            }
            object2 = new StringBuilder("NavigatorBackStack for ");
            object = ((i)object).a;
            object = h30_0.a((StringBuilder)object2, (String)object, " should already be created");
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        fp_22.addAll((Collection)object10);
        fp_22.addLast(object3);
        object = CollectionsKt.X((Collection)object10, object3).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (d)object.next();
            object3 = ((d)object2).b.b;
            if (object3 == null) continue;
            int n17 = ((i)object3).g;
            object3 = this.f(n17);
            this.m((d)object2, (d)object3);
        }
    }

    public final boolean b() {
        Object object;
        Object object2;
        boolean bl2;
        while (!(bl2 = ((fp_2)(object2 = this.g)).isEmpty()) && (bl2 = (object = ((d)((fp_2)object2).last()).b) instanceof j)) {
            object2 = (d)((fp_2)object2).last();
            androidx.navigation.e.u(this, (d)object2);
        }
        object = (d)((fp_2)object2).g();
        Object object3 = this.B;
        if (object != null) {
            ((ArrayList)object3).add(object);
        }
        int n3 = this.A;
        int n4 = 1;
        this.A = n3 += n4;
        this.y();
        this.A = n3 = this.A + -1;
        if (n3 == 0) {
            Object object4 = CollectionsKt.m0((Collection)object3);
            ((ArrayList)object3).clear();
            object3 = ((ArrayList)object4).iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                boolean bl3;
                object4 = (d)object3.next();
                Object object5 = this.q.iterator();
                while (bl3 = object5.hasNext()) {
                    e$b e$b = (e$b)object5.next();
                    i cfr_ignored_0 = ((d)object4).b;
                    ((d)object4).a();
                    e$b.a();
                }
                object5 = this.C;
                ((i23_0)object5).a(object4);
            }
            object2 = CollectionsKt.m0((Collection)object2);
            object3 = this.h;
            object3.getClass();
            n3 = 0;
            object4 = null;
            ((kb3_2)object3).k(null, object2);
            object2 = this.v();
            object3 = this.i;
            object3.getClass();
            ((kb3_2)object3).k(null, object2);
        }
        if (object == null) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final boolean c(ArrayList arrayList, i i3, boolean bl2, boolean n3) {
        Object object;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        boolean bl3;
        e e2 = this;
        int n7 = n3;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        fp_2 fp_22 = new fp_2();
        Iterator iterator = arrayList.iterator();
        while (bl3 = iterator.hasNext()) {
            xs1_1 xs1_12;
            Object object6 = object5 = iterator.next();
            object6 = (p)object5;
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            object5 = e2.g.last();
            Object object7 = object5;
            object7 = (d)object5;
            object5 = xs1_12;
            object4 = ref$BooleanRef2;
            object3 = ref$BooleanRef;
            object2 = this;
            n4 = n3;
            object = fp_22;
            xs1_12 = new xs1_1(ref$BooleanRef2, ref$BooleanRef, this, n3 != 0, fp_22);
            e2.y = xs1_12;
            ((p)object6).e((d)object7, n7 != 0);
            e2.y = null;
            bl3 = ref$BooleanRef2.element;
            if (bl3) continue;
        }
        if (n7 != 0) {
            boolean bl4;
            Object object8;
            object5 = e2.m;
            object4 = "predicate";
            object3 = "<this>";
            if (!bl2) {
                object2 = ys1_1.c;
                object8 = i3;
                object2 = ez2_1.d((Function1)object2, i3);
                object8 = new zs1_1(e2);
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                Intrinsics.checkNotNullParameter(object8, (String)object4);
                object = new ci3_2((Sequence)object2, (Function1)object8);
                object2 = new ci3$a_0((ci3_2)object);
                while ((n4 = (int)(((ci3$a_0)object2).hasNext() ? 1 : 0)) != 0) {
                    n4 = ((i)((ci3$a_0)object2).next()).g;
                    object8 = n4;
                    boolean bl5 = fp_22.isEmpty();
                    if (bl5) {
                        bl5 = false;
                        object = null;
                    } else {
                        object = fp_22.b;
                        n7 = fp_22.a;
                        object = object[n7];
                    }
                    object = (NavBackStackEntryState)object;
                    if (object != null) {
                        object = object.a;
                    } else {
                        bl5 = false;
                        object = null;
                    }
                    object5.put(object8, object);
                }
            }
            if (bl4 = fp_22.isEmpty() ^ true) {
                object2 = (NavBackStackEntryState)fp_22.first();
                n4 = ((NavBackStackEntryState)object2).b;
                object8 = e2.d(n4, null);
                object8 = ez2_1.d(at1_2.c, object8);
                object = new bt1_2(e2);
                Intrinsics.checkNotNullParameter(object8, (String)object3);
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object4 = new ci3_2((Sequence)object8, (Function1)object);
                object3 = new ci3$a_0((ci3_2)object4);
                while (true) {
                    int n8 = ((ci3$a_0)object3).hasNext();
                    object8 = ((NavBackStackEntryState)object2).a;
                    if (n8 == 0) break;
                    n8 = ((i)((ci3$a_0)object3).next()).g;
                    object4 = n8;
                    object5.put(object4, object8);
                }
                bl3 = (object5 = ((LinkedHashMap)object5).values()).contains(object8);
                if (bl3) {
                    object5 = e2.n;
                    object5.put(object8, fp_22);
                }
            }
        }
        this.z();
        return ref$BooleanRef.element;
    }

    public final i d(int n3, i i3) {
        Object object = this.c;
        if (object == null) {
            return null;
        }
        Intrinsics.checkNotNull(object);
        int n4 = ((i)object).g;
        if (n4 == n3) {
            if (i3 != null) {
                object = this.c;
                n4 = (int)(Intrinsics.areEqual(object, i3) ? 1 : 0);
                if (n4 != 0 && (object = i3.b) == null) {
                    return this.c;
                }
            } else {
                return this.c;
            }
        }
        if ((object = (d)this.g.g()) == null || (object = ((d)object).b) == null) {
            object = this.c;
            Intrinsics.checkNotNull(object);
        }
        return androidx.navigation.e.e(n3, (i)object, i3, false);
    }

    public final d f(int n3) {
        Object object;
        Object object2;
        block2: {
            object2 = this.g;
            int n4 = object2.size();
            object2 = object2.listIterator(n4);
            while ((n4 = (int)(object2.hasPrevious() ? 1 : 0)) != 0) {
                Object object3 = object = object2.previous();
                object3 = ((d)object).b;
                int n7 = ((i)object3).g;
                if (n7 != n3) continue;
                break block2;
            }
            n4 = 0;
            object = null;
        }
        object = (d)object;
        if (object != null) {
            return object;
        }
        CharSequence charSequence = wk0_0.a(n3, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        object2 = this.h();
        ((StringBuilder)charSequence).append(object2);
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        object2 = new IllegalArgumentException((String)charSequence);
        throw object2;
    }

    public final d g() {
        return (d)this.g.g();
    }

    public final i h() {
        Object object = this.g();
        object = object != null ? ((d)object).b : null;
        return object;
    }

    public final j i() {
        Object object = this.c;
        if (object != null) {
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return object;
        }
        String string2 = "You must call setGraph() before calling getGraph()".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final androidx.lifecycle.i$b j() {
        Object object = this.o;
        object = object == null ? androidx.lifecycle.i$b.CREATED : this.r;
        return object;
    }

    public final d k() {
        Object e2;
        block2: {
            Iterator iterator = CollectionsKt.Z(this.g).iterator();
            boolean bl2 = iterator.hasNext();
            if (bl2) {
                iterator.next();
            }
            iterator = ez2_1.b(iterator).iterator();
            while (bl2 = iterator.hasNext()) {
                Object object = e2 = iterator.next();
                object = ((d)e2).b;
                boolean bl3 = object instanceof j ^ true;
                if (!bl3) continue;
                break block2;
            }
            bl2 = false;
            e2 = null;
        }
        return (d)e2;
    }

    public final j l(fp_2 object) {
        boolean bl2;
        if ((object = (d)((fp_2)object).g()) == null || (object = ((d)object).b) == null) {
            object = this.c;
            Intrinsics.checkNotNull(object);
        }
        if (bl2 = object instanceof j) {
            object = (j)object;
        } else {
            object = ((i)object).b;
            Intrinsics.checkNotNull(object);
        }
        return object;
    }

    public final void m(d object, d d2) {
        this.k.put(object, d2);
        object = this.l;
        Object object2 = ((LinkedHashMap)object).get(d2);
        if (object2 == null) {
            object2 = new Object(0);
            object.put(d2, object2);
        }
        object = ((LinkedHashMap)object).get(d2);
        Intrinsics.checkNotNull(object);
        ((AtomicInteger)object).incrementAndGet();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(i var1_1, Bundle var2_2, n var3_3, p$a var4_4) {
        block23: {
            block28: {
                block27: {
                    block24: {
                        block26: {
                            block25: {
                                block19: {
                                    block22: {
                                        var5_5 = this;
                                        var6_6 = var1_1;
                                        var7_8 /* !! */  = var3_3;
                                        var8_9 = var4_4;
                                        var9_10 = this.w;
                                        var10_11 = ((Iterable)var9_10.values()).iterator();
                                        while (true) {
                                            var11_12 = var10_11.hasNext();
                                            var12_13 = 1;
                                            if (var11_12 == 0) break;
                                            var13_14 = (e$a)var10_11.next();
                                            var13_14.d = var12_13;
                                        }
                                        var10_11 = new Ref$BooleanRef();
                                        var14_15 = -1;
                                        if (var7_8 /* !! */  == null) ** GOTO lbl-1000
                                        var15_16 = var7_8 /* !! */ .j;
                                        var16_17 = var7_8 /* !! */ .e;
                                        var17_18 = var7_8 /* !! */ .d;
                                        if (var15_16 != null) {
                                            Intrinsics.checkNotNull(var15_16);
                                            var18_19 = var5_5.s((String)var15_16, var17_18, var16_17);
                                        } else {
                                            var3_3.getClass();
                                            var3_3.getClass();
                                            var18_19 = var7_8 /* !! */ .c;
                                            if (var18_19 != var14_15) {
                                                var18_19 = (int)var5_5.r(var18_19, var17_18, var16_17);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var18_19 = 0;
                                                var15_16 = null;
                                            }
                                        }
                                        var19_20 = var1_1.a(var2_2);
                                        if (var7_8 /* !! */  == null || (var17_18 = var7_8 /* !! */ .b) != var12_13 || !(var17_18 = (var20_21 = var5_5.m).containsKey(var22_23 = Integer.valueOf(var21_22 = var6_6.g)))) break block22;
                                        var23_24 = var6_6.g;
                                        var23_24 = (int)var5_5.w(var23_24, var19_20, var7_8 /* !! */ , var8_9);
                                        var10_11.element = var23_24;
                                        var24_25 = var9_10;
                                        var25_26 = var18_19;
                                        var12_13 = 0;
                                        var26_27 = null;
                                        break block23;
                                    }
                                    var20_21 = var5_5.v;
                                    if (var7_8 /* !! */  == null || (var21_22 = var7_8 /* !! */ .a) != var12_13) break block24;
                                    var22_23 = this.g();
                                    var27_28 = var5_5.g;
                                    var28_29 = var27_28.a();
                                    var29_30 = var27_28.listIterator(var28_29);
                                    while (var30_31 = var29_30.hasPrevious()) {
                                        var31_32 = var29_30.previous();
                                        var26_27 = var31_32;
                                        var26_27 = ((d)var31_32).b;
                                        if (var26_27 == var6_6) {
                                            var12_13 = var29_30.nextIndex();
                                            break block19;
                                        }
                                        var12_13 = 1;
                                    }
                                    var12_13 = -1;
                                }
                                if (var12_13 == var14_15) break block24;
                                var28_29 = var6_6 instanceof j;
                                if (var28_29 == 0) break block25;
                                var21_22 = androidx.navigation.j.o;
                                var22_23 = var6_6;
                                var22_23 = (j)var6_6;
                                Intrinsics.checkNotNullParameter(var22_23, "<this>");
                                var22_23 = ez2_1.d(vt1_1.c, var22_23);
                                var29_30 = et1_0.c;
                                var22_23 = kz2_1.l(kz2_1.i((Sequence)var22_23, (Function1)var29_30));
                                var28_29 = var27_28.c - var12_13;
                                var14_15 = var22_23.size();
                                if (var28_29 != var14_15) break block24;
                                var14_15 = var27_28.c;
                                var32_33 = var27_28.subList(var12_13, var14_15);
                                var33_34 = yx_2.o((Iterable)var32_33, 10);
                                var29_30 = new ArrayList(var33_34);
                                var32_33 = var32_33.iterator();
                                while ((var33_34 = (int)var32_33.hasNext()) != 0) {
                                    var33_34 = ((d)var32_33.next()).b.g;
                                    var34_35 = var33_34;
                                    var29_30.add(var34_35);
                                }
                                var14_15 = (int)Intrinsics.areEqual(var29_30, var22_23);
                                if (var14_15 != 0) break block26;
                                break block24;
                            }
                            if (var22_23 == null || (var32_33 = var22_23.b) == null || (var33_34 = var6_6.g) != (var14_15 = var32_33.g)) break block24;
                        }
                        var32_33 = new fp_2();
                        while ((var33_34 = xx_2.h(var27_28)) >= var12_13) {
                            var34_35 = (d)cx_2.y(var27_28);
                            var5_5.x((d)var34_35);
                            var29_30 = var34_35.b;
                            var13_14 = var2_2;
                            var35_36 = var29_30.a(var2_2);
                            Intrinsics.checkNotNullParameter(var34_35, "entry");
                            var29_30 = var34_35.b;
                            var13_14 = var34_35.d;
                            var26_27 = var34_35.f;
                            var25_26 = var18_19;
                            var15_16 = var34_35.g;
                            var24_25 = var9_10;
                            var9_10 = var34_35.a;
                            var7_8 /* !! */  = var34_35.e;
                            var22_23 = new d((Context)var9_10, (i)var29_30, var35_36, (androidx.lifecycle.i$b)var13_14, (eu1_0)var7_8 /* !! */ , (String)var26_27, (Bundle)var15_16);
                            var7_8 /* !! */  = var34_35.d;
                            var22_23.d = var7_8 /* !! */ ;
                            var7_8 /* !! */  = var34_35.l;
                            var22_23.c((androidx.lifecycle.i$b)var7_8 /* !! */ );
                            var32_33.addFirst(var22_23);
                            var7_8 /* !! */  = var3_3;
                            var9_10 = var24_25;
                        }
                        var24_25 = var9_10;
                        var25_26 = var18_19;
                        var7_8 /* !! */  = var32_33.iterator();
                        while (var36_37 = var7_8 /* !! */ .hasNext()) {
                            var9_10 = (d)var7_8 /* !! */ .next();
                            var13_14 = var9_10.b.b;
                            if (var13_14 != null) {
                                var11_12 = var13_14.g;
                                var13_14 = var5_5.f(var11_12);
                                var5_5.m((d)var9_10, (d)var13_14);
                            }
                            var27_28.addLast(var9_10);
                        }
                        var7_8 /* !! */  = var32_33.iterator();
                        break block27;
                    }
                    var24_25 = var9_10;
                    var25_26 = var18_19;
                    var12_13 = 0;
                    var26_27 = null;
                    break block28;
                }
                while (var36_37 = var7_8 /* !! */ .hasNext()) {
                    block21: {
                        block20: {
                            var9_10 = (d)var7_8 /* !! */ .next();
                            var13_14 = var9_10.b.a;
                            var13_14 = var20_21.b((String)var13_14);
                            var26_27 = "backStackEntry";
                            Intrinsics.checkNotNullParameter(var9_10, (String)var26_27);
                            var32_33 = var9_10.b;
                            var33_34 = var32_33 instanceof i;
                            if (var33_34 == 0) {
                                var14_15 = 0;
                                var32_33 = null;
                            }
                            if (var32_33 == null) continue;
                            var34_35 = eu0_1.e;
                            QV.c((Function1)var34_35);
                            var13_14.c((i)var32_33);
                            var13_14 = var13_14.b();
                            Intrinsics.checkNotNullParameter(var9_10, (String)var26_27);
                            var26_27 = var13_14.a;
                            var26_27.lock();
                            try {
                                var32_33 = var13_14.e;
                                var32_33 = var32_33.a;
                                var32_33 = var32_33.getValue();
                                var32_33 = (Collection)var32_33;
                                var32_33 = CollectionsKt.m0((Collection)var32_33);
                                var33_34 = var32_33.size();
                                var34_35 = var32_33.listIterator(var33_34);
                                while ((var18_19 = (int)var34_35.hasPrevious()) != 0) {
                                    var15_16 = var34_35.previous();
                                    var15_16 = (d)var15_16;
                                    var15_16 = var15_16.f;
                                    var22_23 = var9_10.f;
                                    var18_19 = (int)Intrinsics.areEqual(var15_16, var22_23);
                                    if (var18_19 == 0) continue;
                                    var33_34 = var34_35.nextIndex();
                                    break block20;
                                }
                            }
                            catch (Throwable var6_7) {
                                break block21;
                            }
                            var33_34 = -1;
                        }
                        var32_33.set(var33_34, var9_10);
                        var9_10 = var13_14.b;
                        var9_10.getClass();
                        var11_12 = 0;
                        var13_14 = null;
                        var9_10.k(null, var32_33);
                        var9_10 = Unit.a;
                        var26_27.unlock();
                        continue;
                    }
                    var26_27.unlock();
                    throw var6_7;
                }
                var12_13 = 1;
            }
            if (var12_13 == 0) {
                var7_8 /* !! */  = this.j();
                var9_10 = var5_5.p;
                var7_8 /* !! */  = d$a.a(var5_5.a, (i)var6_6, var19_20, (androidx.lifecycle.i$b)var7_8 /* !! */ , (eu1_0)var9_10);
                var9_10 = ((i)var6_6).a;
                var9_10 = var20_21.b((String)var9_10);
                var7_8 /* !! */  = kotlin.collections.a.b(var7_8 /* !! */ );
                var5_5.x = var13_14 = new e$e((Ref$BooleanRef)var10_11, var5_5, (i)var6_6, var19_20);
                var6_6 = var3_3;
                var9_10.d((List)var7_8 /* !! */ , var3_3, var8_9);
                var23_24 = 0;
                var6_6 = null;
                var5_5.x = null;
            }
        }
        this.z();
        var6_6 = ((Iterable)var24_25.values()).iterator();
        while (var37_38 = var6_6.hasNext()) {
            var7_8 /* !! */  = (e$a)var6_6.next();
            var8_9 = null;
            var7_8 /* !! */ .d = false;
        }
        if (var25_26 == 0 && (var23_24 = (int)var10_11.element) == 0 && var12_13 == 0) {
            this.y();
            return;
        }
        this.b();
    }

    public final void o(String string2, Function1 object) {
        Intrinsics.checkNotNullParameter(string2, "route");
        Intrinsics.checkNotNullParameter(object, "builder");
        object = QV.c((Function1)object);
        androidx.navigation.e.p(this, string2, (n)object, 4);
    }

    public final boolean q() {
        Object object = this.g;
        boolean n3 = ((fp_2)object).isEmpty();
        boolean bl2 = false;
        if (!n3) {
            boolean bl3;
            object = this.h();
            Intrinsics.checkNotNull(object);
            int n4 = ((i)object).g;
            boolean bl4 = true;
            boolean bl5 = this.r(n4, bl4, false);
            if (bl5 && (bl3 = this.b())) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean r(int n3, boolean bl2, boolean bl3) {
        void var3_4;
        i i3;
        ArrayList<Object> arrayList;
        block4: {
            boolean bl4;
            Object object = this.g;
            boolean bl5 = ((fp_2)object).isEmpty();
            if (bl5) {
                return false;
            }
            arrayList = new ArrayList<Object>();
            object = CollectionsKt.Z((Iterable)object).iterator();
            while (bl4 = object.hasNext()) {
                int n4;
                int n7;
                i3 = ((d)object.next()).b;
                Object object2 = i3.a;
                q q2 = this.v;
                object2 = q2.b((String)object2);
                if (bl2 || (n7 = i3.g) != n3) {
                    arrayList.add(object2);
                }
                if ((n4 = i3.g) != n3) continue;
                break block4;
            }
            bl4 = false;
            i3 = null;
        }
        if (i3 == null) {
            int n8 = androidx.navigation.i.j;
            Context context = this.a;
            i$a.a(n3, context);
            return false;
        }
        return this.c(arrayList, i3, bl2, (boolean)var3_4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean s(String var1_1, boolean var2_2, boolean var3_3) {
        block17: {
            var4_4 = this;
            var5_5 = var1_1;
            var6_6 = var2_2;
            var7_7 = this.g;
            var8_8 = var7_7.isEmpty();
            if (var8_8) {
                return false;
            }
            var9_9 = new ArrayList<Object>();
            var10_10 = var7_7.a();
            var7_7 = var7_7.listIterator(var10_10);
            while ((var10_10 = (int)var7_7.hasPrevious()) != 0) {
                block16: {
                    block18: {
                        var11_11 /* !! */  = var7_7.previous();
                        var12_12 = var11_11 /* !! */ ;
                        var12_12 = (d)var11_11 /* !! */ ;
                        var13_13 = var12_12.b;
                        var14_14 = var12_12.a();
                        var13_13.getClass();
                        Intrinsics.checkNotNullParameter(var5_5, "route");
                        var15_15 = var13_13.h;
                        var16_16 = Intrinsics.areEqual(var15_15, var5_5);
                        if (var16_16) {
                            while (true) {
                                var17_17 = true;
                                break block16;
                                break;
                            }
                        }
                        var15_15 = var13_13.d(var5_5);
                        var18_18 = var15_15 != null ? var15_15.a : null;
                        var19_19 = Intrinsics.areEqual(var13_13, var18_18);
                        if (!var19_19) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                var17_17 = false;
                                var20_20 = null;
                                break block16;
                                break;
                            }
                        }
                        if (var14_14 == null) break block18;
                        var13_13 = var15_15.b;
                        if (var13_13 == null) ** GOTO lbl-1000
                        var18_18 = var13_13.keySet();
                        var21_21 = "matchingArgs.keySet()";
                        Intrinsics.checkNotNullExpressionValue(var18_18, var21_21);
                        var18_18 = ((Iterable)var18_18).iterator();
                        do {
                            if (!(var22_22 = var18_18.hasNext())) ** continue;
                            var21_21 = (String)var18_18.next();
                            var23_23 = var14_14.containsKey(var21_21);
                            if (!var23_23) ** GOTO lbl-1000
                            var24_24 = (b)var15_15.a.f.get(var21_21);
                            if (var24_24 != null) {
                                var24_24 = var24_24.a;
                            } else {
                                var23_23 = false;
                                var24_24 = null;
                            }
                            var25_25 = "key";
                            if (var24_24 != null) {
                                Intrinsics.checkNotNullExpressionValue(var21_21, (String)var25_25);
                                var20_20 = var26_26 = var24_24.a((Bundle)var13_13, var21_21);
                            } else {
                                var17_17 = false;
                                var20_20 = null;
                            }
                            if (var24_24 != null) {
                                Intrinsics.checkNotNullExpressionValue(var21_21, (String)var25_25);
                                var25_25 = var24_24.a(var14_14, var21_21);
                                continue;
                            }
                            var27_27 = false;
                            var25_25 = null;
                        } while (var24_24 == null || (var27_27 = var24_24.g(var20_20, var25_25)));
                        ** GOTO lbl-1000
                    }
                    var15_15.getClass();
                    ** continue;
                }
                if (var6_6 || !var17_17) {
                    var25_25 = var12_12.b.a;
                    var12_12 = var4_4.v;
                    var25_25 = var12_12.b((String)var25_25);
                    var9_9.add(var25_25);
                }
                if (!var17_17) continue;
                break block17;
            }
            var10_10 = 0;
            var11_11 /* !! */  = null;
        }
        var11_11 /* !! */  = (d)var11_11 /* !! */ ;
        if (var11_11 /* !! */  != null) {
            var25_25 = var11_11 /* !! */ .b;
        } else {
            var27_27 = false;
            var25_25 = null;
        }
        if (var25_25 == null) {
            return false;
        }
        return var4_4.c(var9_9, (i)var25_25, var6_6, var3_3);
    }

    public final void t(d object, boolean bl2, fp_2 object2) {
        Object object3 = this.g;
        d d2 = (d)((fp_2)object3).last();
        boolean bl3 = Intrinsics.areEqual(d2, object);
        if (bl3) {
            androidx.lifecycle.i$b i$b;
            boolean bl4;
            cx_2.y((List)object3);
            object = d2.b.a;
            object = this.v.b((String)object);
            object3 = this.w;
            object = (e$a)((LinkedHashMap)object3).get(object);
            boolean bl5 = true;
            if (!(object != null && (object = ((kU1)object).f) != null && (object = (Set)((ge2_2)object).a.getValue()) != null && (bl4 = object.contains(d2)) == bl5 || (bl4 = (object = this.l).containsKey(d2)))) {
                bl5 = false;
                object3 = null;
            }
            if (bl4 = ((androidx.lifecycle.i$b)((Object)(object = d2.h.d))).isAtLeast(i$b = androidx.lifecycle.i$b.CREATED)) {
                if (bl2) {
                    d2.c(i$b);
                    object = new NavBackStackEntryState(d2);
                    ((fp_2)object2).addFirst(object);
                }
                if (!bl5) {
                    object = androidx.lifecycle.i$b.DESTROYED;
                    d2.c((androidx.lifecycle.i$b)((Object)object));
                    this.x(d2);
                } else {
                    d2.c(i$b);
                }
            }
            if (!bl2 && !bl5 && (object = this.p) != null) {
                String string2 = "backStackEntryId";
                object2 = d2.f;
                Intrinsics.checkNotNullParameter(object2, string2);
                object = (rd3_0)((h)object).a.remove(object2);
                if (object != null) {
                    ((rd3_0)object).a();
                }
            }
            return;
        }
        Serializable serializable = new StringBuilder("Attempted to pop ");
        object = ((d)object).b;
        serializable.append(object);
        serializable.append(", which is not the top of the back stack (");
        object = d2.b;
        serializable.append(object);
        serializable.append(')');
        object = serializable.toString();
        object = object.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public final ArrayList v() {
        boolean bl2;
        boolean bl3;
        Object object;
        Object object2;
        boolean bl4;
        Object object3;
        Iterator<Object> iterator;
        boolean bl5;
        Object object4 = new ArrayList();
        ArrayList<Object> arrayList = ((Iterable)this.w.values()).iterator();
        while (bl5 = arrayList.hasNext()) {
            iterator = (Iterable)((e$a)arrayList.next()).f.a.getValue();
            object3 = new ArrayList();
            iterator = iterator.iterator();
            while (bl4 = iterator.hasNext()) {
                androidx.lifecycle.i$b i$b;
                object = object2 = iterator.next();
                object = (d)object2;
                boolean bl6 = ((ArrayList)object4).contains(object);
                if (bl6 || (bl3 = ((androidx.lifecycle.i$b)((Object)(object = ((d)object).l))).isAtLeast(i$b = androidx.lifecycle.i$b.STARTED))) continue;
                ((ArrayList)object3).add(object2);
            }
            cx_2.r(object3, object4);
        }
        arrayList = new ArrayList<Object>();
        iterator = this.g.iterator();
        while (bl2 = iterator.hasNext()) {
            object2 = object3 = iterator.next();
            object2 = (d)object3;
            bl3 = ((ArrayList)object4).contains(object2);
            if (bl3 || !(bl4 = ((androidx.lifecycle.i$b)((Object)(object2 = ((d)object2).l))).isAtLeast((androidx.lifecycle.i$b)((Object)(object = androidx.lifecycle.i$b.STARTED))))) continue;
            arrayList.add(object3);
        }
        cx_2.r(arrayList, object4);
        arrayList = new ArrayList<Object>();
        object4 = ((ArrayList)object4).iterator();
        while (bl5 = object4.hasNext()) {
            iterator = object4.next();
            object3 = iterator;
            object3 = ((d)((Object)iterator)).b;
            bl2 = object3 instanceof j ^ true;
            if (!bl2) continue;
            arrayList.add(iterator);
        }
        return arrayList;
    }

    public final boolean w(int n3, Bundle bundle, n n4, p$a p$a) {
        boolean bl2;
        Object object;
        Object object2;
        int n7;
        boolean bl3;
        e e2 = this;
        int n8 = 1;
        Object object3 = null;
        Object object4 = this.m;
        Object object5 = n3;
        boolean bl4 = object4.containsKey(object5);
        if (!bl4) {
            return false;
        }
        object5 = n3;
        object5 = (String)((LinkedHashMap)object4).get(object5);
        object4 = ((LinkedHashMap)object4).values();
        Object object6 = new e$g((String)object5);
        Intrinsics.checkNotNullParameter(object4, "<this>");
        Object object7 = "predicate";
        Intrinsics.checkNotNullParameter(object6, (String)object7);
        cx_2.v((Iterable)object4, (Function1)object6, n8 != 0);
        object4 = (fp_2)TypeIntrinsics.asMutableMap(this.n).remove(object5);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object5 = (d)this.g.g();
        if (object5 == null || (object5 = ((d)object5).b) == null) {
            object5 = this.i();
        }
        if (object4 != null) {
            object4 = ((AbstractList)object4).iterator();
            while (bl3 = object4.hasNext()) {
                object6 = (NavBackStackEntryState)object4.next();
                n7 = ((NavBackStackEntryState)object6).b;
                object7 = androidx.navigation.e.e(n7, object5, null, n8 != 0);
                object2 = e2.a;
                if (object7 != null) {
                    object5 = this.j();
                    object = e2.p;
                    object5 = ((NavBackStackEntryState)object6).a((Context)object2, (i)object7, (androidx.lifecycle.i$b)((Object)object5), (h)object);
                    arrayList.add(object5);
                    object5 = object7;
                    continue;
                }
                n8 = androidx.navigation.i.j;
                String string2 = i$a.a(((NavBackStackEntryState)object6).b, (Context)object2);
                object3 = new StringBuilder("Restore State failed: destination ");
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append(" cannot be found from the current destination ");
                ((StringBuilder)object3).append(object5);
                string2 = ((StringBuilder)object3).toString();
                string2 = string2.toString();
                object3 = new IllegalStateException(string2);
                throw object3;
            }
        }
        object4 = new ArrayList();
        object5 = new ArrayList();
        object6 = arrayList.iterator();
        while ((n7 = object6.hasNext()) != 0) {
            object7 = object6.next();
            object2 = object7;
            object2 = ((d)object7).b;
            bl2 = object2 instanceof j;
            if (bl2) continue;
            ((ArrayList)object5).add(object7);
        }
        object5 = ((ArrayList)object5).iterator();
        while (bl3 = object5.hasNext()) {
            object6 = (d)object5.next();
            object7 = (List)CollectionsKt.T(object4);
            if (object7 != null && (object2 = (d)CollectionsKt.S((List)object7)) != null && (object2 = ((d)object2).b) != null) {
                object2 = ((i)object2).a;
            } else {
                bl2 = false;
                object2 = null;
            }
            object = ((d)object6).b.a;
            bl2 = Intrinsics.areEqual(object2, object);
            if (bl2) {
                object7 = (Collection)object7;
                object7.add(object6);
                continue;
            }
            object7 = new d[n8];
            object7[0] = object6;
            object6 = xx_2.j((Object[])object7);
            ((ArrayList)object4).add((Object)object6);
        }
        object2 = new Ref$BooleanRef();
        object = ((ArrayList)object4).iterator();
        while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            f f5;
            Object object8;
            Object object9 = object8 = object.next();
            object9 = (List)object8;
            object8 = ((d)CollectionsKt.L(object9)).b.a;
            p p2 = e2.v.b((String)object8);
            object5 = new Ref$IntRef();
            object8 = f5;
            object3 = object2;
            object4 = arrayList;
            object6 = this;
            object7 = bundle;
            f5 = new f((Ref$BooleanRef)object2, arrayList, (Ref$IntRef)object5, this, bundle);
            e2.x = f5;
            object8 = n4;
            object3 = p$a;
            p2.d((List)object9, n4, p$a);
            e2.x = null;
        }
        return ((Ref$BooleanRef)object2).element;
    }

    public final void x(d d2) {
        int n3;
        Intrinsics.checkNotNullParameter(d2, "child");
        LinkedHashMap linkedHashMap = this.k;
        d2 = (d)linkedHashMap.remove(d2);
        if (d2 == null) {
            return;
        }
        linkedHashMap = this.l;
        Object object = (AtomicInteger)linkedHashMap.get(d2);
        if (object != null) {
            n3 = ((AtomicInteger)object).decrementAndGet();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = ((Integer)object).intValue()) == 0) {
            object = d2.b.a;
            object = this.v.b((String)object);
            LinkedHashMap linkedHashMap2 = this.w;
            if ((object = (e$a)linkedHashMap2.get(object)) != null) {
                ((e$a)object).b(d2);
            }
            linkedHashMap.remove(d2);
        }
    }

    public final void y() {
        int n3;
        Object object;
        Object object2;
        Object object3 = CollectionsKt.m0(this.g);
        boolean bl2 = ((ArrayList)object3).isEmpty();
        if (bl2) {
            return;
        }
        Object object4 = ((d)CollectionsKt.S((List)object3)).b;
        Object object5 = new ArrayList();
        boolean bl3 = object4 instanceof CS0;
        if (bl3) {
            boolean bl4;
            object2 = CollectionsKt.Z((Iterable)object3).iterator();
            while (bl4 = object2.hasNext()) {
                object = ((d)object2.next()).b;
                object5.add(object);
                n3 = object instanceof CS0;
                if (n3 != 0 || (bl4 = object instanceof j)) continue;
            }
        }
        object2 = new HashMap();
        object = CollectionsKt.Z((Iterable)object3).iterator();
        while ((n3 = object.hasNext()) != 0) {
            int n4;
            Object object6;
            int n7;
            int n8;
            Object object7 = (d)object.next();
            Object object8 = ((d)object7).l;
            i i3 = ((d)object7).b;
            if (object4 != null && (n8 = i3.g) == (n7 = ((i)object4).g)) {
                object6 = androidx.lifecycle.i$b.RESUMED;
                if (object8 != object6) {
                    object8 = this.v;
                    Object object9 = i3.a;
                    object8 = ((q)object8).b((String)object9);
                    object9 = this.w;
                    if ((object8 = (e$a)((LinkedHashMap)object9).get(object8)) != null && (object8 = ((kU1)object8).f) != null && (object8 = (Set)((ge2_2)object8).a.getValue()) != null) {
                        n4 = (int)(object8.contains(object7) ? 1 : 0);
                        object8 = n4 != 0;
                    } else {
                        n4 = 0;
                        object8 = null;
                    }
                    object9 = Boolean.TRUE;
                    n4 = (int)(Intrinsics.areEqual(object8, object9) ? 1 : 0);
                    if (n4 == 0 && ((object8 = (AtomicInteger)this.l.get(object7)) == null || (n4 = ((AtomicInteger)object8).get()) != 0)) {
                        ((HashMap)object2).put(object7, object6);
                    } else {
                        object8 = androidx.lifecycle.i$b.STARTED;
                        ((HashMap)object2).put(object7, object8);
                    }
                }
                if ((object7 = (i)CollectionsKt.firstOrNull(object5)) != null && (n3 = ((i)object7).g) == (n4 = i3.g)) {
                    cx_2.x(object5);
                }
                object4 = ((i)object4).b;
                continue;
            }
            n8 = object5.isEmpty() ^ 1;
            if (n8 != 0) {
                int n10 = i3.g;
                object6 = (i)CollectionsKt.L(object5);
                n8 = ((i)object6).g;
                if (n10 == n8) {
                    i3 = (i)cx_2.x(object5);
                    object6 = androidx.lifecycle.i$b.RESUMED;
                    if (object8 == object6) {
                        object8 = androidx.lifecycle.i$b.STARTED;
                        ((d)object7).c((androidx.lifecycle.i$b)((Object)object8));
                    } else {
                        object6 = androidx.lifecycle.i$b.STARTED;
                        if (object8 != object6) {
                            ((HashMap)object2).put(object7, object6);
                        }
                    }
                    if ((object7 = i3.b) == null || (n4 = (int)(object5.contains(object7) ? 1 : 0)) != 0) continue;
                    object5.add(object7);
                    continue;
                }
            }
            object8 = androidx.lifecycle.i$b.CREATED;
            ((d)object7).c((androidx.lifecycle.i$b)((Object)object8));
        }
        object3 = ((ArrayList)object3).iterator();
        while (bl2 = object3.hasNext()) {
            object4 = (d)object3.next();
            object5 = (androidx.lifecycle.i$b)((Object)((HashMap)object2).get(object4));
            if (object5 != null) {
                ((d)object4).c((androidx.lifecycle.i$b)((Object)object5));
                continue;
            }
            ((d)object4).d();
        }
    }

    public final void z() {
        boolean bl2 = this.u;
        boolean bl3 = false;
        if (bl2) {
            Object object = this.g;
            int n3 = object instanceof Collection;
            int n4 = 1;
            if (n3 != 0 && (n3 = ((fp_2)object).isEmpty()) != 0) {
                n3 = 0;
            } else {
                boolean bl4;
                object = ((AbstractList)object).iterator();
                n3 = 0;
                while (bl4 = object.hasNext()) {
                    i i3 = ((d)object.next()).b;
                    bl4 = i3 instanceof j ^ n4;
                    if (!bl4 || ++n3 >= 0) continue;
                    xx_2.m();
                    throw null;
                }
            }
            if (n3 > n4) {
                bl3 = true;
            }
        }
        this.t.setEnabled(bl3);
    }
}

