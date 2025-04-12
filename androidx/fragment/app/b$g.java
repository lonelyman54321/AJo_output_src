/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl$1;
import androidx.fragment.app.b$f;
import androidx.fragment.app.b$g$a;
import androidx.fragment.app.b$g$b;
import androidx.fragment.app.b$h;
import androidx.fragment.app.n$a;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class b$g
extends n$a {
    public final List c;
    public final n$c d;
    public final n$c e;
    public final GW0 f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final Jp j;
    public final ArrayList k;
    public final ArrayList l;
    public final Jp m;
    public final Jp n;
    public final boolean o;
    public final fl_0 p;
    public Object q;

    public b$g(ArrayList object, n$c n$c, n$c n$c2, GW0 gW0, Object object2, ArrayList arrayList, ArrayList arrayList2, Jp jp, ArrayList arrayList3, ArrayList arrayList4, Jp jp2, Jp jp4, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "transitionInfos");
        Intrinsics.checkNotNullParameter(gW0, "transitionImpl");
        Intrinsics.checkNotNullParameter(arrayList, "sharedElementFirstOutViews");
        Intrinsics.checkNotNullParameter(arrayList2, "sharedElementLastInViews");
        Intrinsics.checkNotNullParameter(jp, "sharedElementNameMapping");
        Intrinsics.checkNotNullParameter(arrayList3, "enteringNames");
        Intrinsics.checkNotNullParameter(arrayList4, "exitingNames");
        Intrinsics.checkNotNullParameter(jp2, "firstOutViews");
        Intrinsics.checkNotNullParameter(jp4, "lastInViews");
        this.c = object;
        this.d = n$c;
        this.e = n$c2;
        this.f = gW0;
        this.g = object2;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = jp;
        this.k = arrayList3;
        this.l = arrayList4;
        this.m = jp2;
        this.n = jp4;
        this.o = bl2;
        this.p = object = new Object();
    }

    public static void f(View view, ArrayList arrayList) {
        boolean bl2 = view instanceof ViewGroup;
        if (bl2) {
            View view2 = view;
            view2 = (ViewGroup)view;
            int n3 = view2.isTransitionGroup();
            if (n3 != 0) {
                bl2 = arrayList.contains(view);
                if (!bl2) {
                    arrayList.add(view);
                }
            } else {
                int n4 = view2.getChildCount();
                for (n3 = 0; n3 < n4; ++n3) {
                    View view3 = view2.getChildAt(n3);
                    int n7 = view3.getVisibility();
                    if (n7 != 0) continue;
                    String string2 = "child";
                    Intrinsics.checkNotNullExpressionValue(view3, string2);
                    b$g.f(view3, arrayList);
                }
            }
        } else {
            bl2 = arrayList.contains(view);
            if (!bl2) {
                arrayList.add(view);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        Object object;
        GW0 gW0;
        block4: {
            Object object2;
            boolean bl2;
            block3: {
                gW0 = this.f;
                boolean bl3 = gW0.l();
                if (!bl3) return false;
                object = this.c;
                bl2 = object instanceof Collection;
                if (!bl2) break block3;
                object2 = object;
                object2 = (Collection)object;
                bl2 = object2.isEmpty();
                if (bl2) break block4;
            }
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (b$h)object.next();
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 34;
                if (n3 < n4) return false;
                object2 = ((b$h)object2).b;
                if (object2 == null) return false;
                bl2 = gW0.m(object2);
                if (!bl2) return false;
            }
        }
        object = this.g;
        if (object == null) return true;
        boolean bl4 = gW0.m(object);
        if (!bl4) return false;
        return true;
    }

    public final void b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        this.p.a();
    }

    public final void c(ViewGroup viewGroup) {
        Object object = "container";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        boolean bl2 = viewGroup.isLaidOut();
        Iterator<Object> iterator = this.c;
        String string2 = "FragmentManager";
        int n3 = 2;
        if (!bl2) {
            boolean bl3;
            iterator = (Iterable)((Object)iterator);
            object = iterator.iterator();
            while (bl3 = object.hasNext()) {
                iterator = (b$h)object.next();
                n$c n$c = ((b$f)((Object)iterator)).a;
                boolean bl4 = Log.isLoggable((String)string2, (int)n3);
                if (bl4) {
                    viewGroup.toString();
                    Objects.toString(n$c);
                }
                iterator = ((b$f)((Object)iterator)).a;
                ((n$c)((Object)iterator)).c(this);
            }
            return;
        }
        object = this.q;
        GW0 gW0 = this.f;
        n$c n$c = this.e;
        n$c n$c2 = this.d;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            gW0.c(object);
            boolean bl5 = Log.isLoggable((String)string2, (int)n3);
            if (bl5) {
                Objects.toString(n$c2);
                Objects.toString(n$c);
            }
        } else {
            Object object2;
            object = this.g(viewGroup, n$c, n$c2);
            ArrayList arrayList = (ArrayList)((Pair)object).a;
            iterator = (Iterable)((Object)iterator);
            int n4 = yx_2.o((Iterable)((Object)iterator), 10);
            Object object3 = new ArrayList(n4);
            iterator = iterator.iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = ((b$h)iterator.next()).a;
                ((ArrayList)object3).add(object2);
            }
            iterator = ((ArrayList)object3).iterator();
            while (true) {
                boolean bl6 = iterator.hasNext();
                object2 = ((Pair)object).b;
                if (!bl6) break;
                object3 = (n$c)iterator.next();
                Fragment fragment = ((n$c)object3).c;
                cn0_0 cn0_02 = new cn0_0(0, object3, this);
                object3 = this.p;
                gW0.u(fragment, object2, (fl_0)object3, cn0_02);
            }
            object = new b$g$a(viewGroup, this, object2);
            this.i(arrayList, viewGroup, (Function0)object);
            boolean bl7 = Log.isLoggable((String)string2, (int)n3);
            if (bl7) {
                Objects.toString(n$c2);
                Objects.toString(n$c);
            }
        }
    }

    public final void d(uu_0 uu_02, ViewGroup object) {
        Intrinsics.checkNotNullParameter(uu_02, "backEvent");
        Object object2 = "container";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.q;
        if (object != null) {
            float f5 = uu_02.c;
            object2 = this.f;
            ((GW0)object2).r(object, f5);
        }
    }

    public final void e(ViewGroup viewGroup) {
        boolean bl2;
        Object object = "container";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        boolean bl3 = viewGroup.isLaidOut();
        Object object2 = this.c;
        if (!bl3) {
            boolean bl4;
            object2 = (Iterable)object2;
            object = object2.iterator();
            while (bl4 = object.hasNext()) {
                object2 = ((b$h)object.next()).a;
                String string2 = "FragmentManager";
                int n3 = 2;
                boolean bl5 = Log.isLoggable((String)string2, (int)n3);
                if (!bl5) continue;
                viewGroup.toString();
                Objects.toString(object2);
            }
            return;
        }
        bl3 = this.h();
        Object object3 = this.e;
        Object object4 = this.d;
        if (bl3 && (object = this.g) != null && !(bl2 = this.a())) {
            Objects.toString(object);
            Objects.toString(object4);
            Objects.toString(object3);
        }
        if ((bl3 = this.a()) && (bl3 = this.h())) {
            Object object5;
            object = new Ref$ObjectRef();
            object3 = this.g(viewGroup, (n$c)object3, (n$c)object4);
            object4 = (ArrayList)((Pair)object3).a;
            object2 = (Iterable)object2;
            int n4 = yx_2.o((Iterable)object2, 10);
            Object object6 = new ArrayList(n4);
            object2 = object2.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object5 = ((b$h)object2.next()).a;
                ((ArrayList)object6).add(object5);
            }
            object2 = ((ArrayList)object6).iterator();
            while (true) {
                bl2 = object2.hasNext();
                object5 = ((Pair)object3).b;
                if (!bl2) break;
                object6 = (n$c)object2.next();
                an0_0 an0_02 = new an0_0((Ref$ObjectRef)object);
                Object object7 = ((n$c)object6).c;
                object7 = new bn0_0((n$c)object6, this);
                object6 = this.f;
                fl_0 fl_02 = this.p;
                ((GW0)object6).v(object5, fl_02, an0_02, (Runnable)object7);
            }
            object2 = new b$g$b(this, viewGroup, object5, (Ref$ObjectRef)object);
            this.i((ArrayList)object4, viewGroup, (Function0)object2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Pair g(ViewGroup viewGroup, n$c n$c, n$c n$c2) {
        Fragment fragment;
        String string2;
        void var27_73;
        Object object;
        boolean bl2;
        ArrayList arrayList;
        void var13_38;
        Object object2;
        ArrayList arrayList2;
        Object object3;
        Object object4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean bl3;
        Object object5 = this;
        ViewGroup viewGroup2 = viewGroup;
        n$c n$c3 = n$c;
        n$c n$c4 = n$c2;
        Context context = viewGroup.getContext();
        View view = new View(context);
        Rect rect = new Rect();
        Object object6 = this.c;
        ArrayList arrayList5 = object6.iterator();
        int n3 = 0;
        Object var13_37 = null;
        boolean bl4 = false;
        while (true) {
            ArrayList arrayList6;
            bl3 = arrayList5.hasNext();
            arrayList4 = ((b$g)object5).i;
            arrayList3 = ((b$g)object5).h;
            object4 = ((b$g)object5).g;
            object3 = ((b$g)object5).f;
            if (!bl3) break;
            arrayList2 = ((b$h)arrayList5.next()).d;
            if (arrayList2 != null && n$c4 != null && n$c3 != null && (bl3 = ((a53)((Object)(arrayList2 = ((b$g)object5).j))).isEmpty() ^ true) && object4 != null) {
                arrayList2 = n$c3.c;
                object2 = n$c4.c;
                arrayList6 = arrayList5;
                boolean bl5 = ((b$g)object5).o;
                arrayList = var13_38;
                Jp jp = ((b$g)object5).m;
                CW0.a((Fragment)((Object)arrayList2), (Fragment)object2, bl5, jp);
                object2 = null;
                arrayList5 = new ArrayList(n$c3, 0, n$c4, object5);
                x92.a((View)viewGroup2, (Runnable)((Object)arrayList5));
                arrayList5 = jp.values();
                arrayList3.addAll(arrayList5);
                arrayList5 = ((b$g)object5).l;
                bl2 = arrayList5.isEmpty() ^ true;
                if (bl2) {
                    bl2 = false;
                    arrayList5 = arrayList5.get(0);
                    object2 = "exitingNames[0]";
                    Intrinsics.checkNotNullExpressionValue(arrayList5, (String)object2);
                    arrayList5 = (String)((Object)arrayList5);
                    arrayList5 = (View)jp.get(arrayList5);
                    ((GW0)object3).s((View)arrayList5, object4);
                    ArrayList arrayList7 = arrayList5;
                } else {
                    void var13_41 = arrayList;
                }
                arrayList5 = ((b$g)object5).n;
                object2 = ((Jp)((Object)arrayList5)).values();
                arrayList4.addAll(object2);
                object2 = ((b$g)object5).k;
                bl3 = object2.isEmpty() ^ true;
                if (bl3) {
                    bl3 = false;
                    object2 = ((ArrayList)object2).get(0);
                    arrayList2 = "enteringNames[0]";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)((Object)arrayList2));
                    object2 = (String)object2;
                    arrayList5 = (View)((a53)((Object)arrayList5)).get(object2);
                    if (arrayList5 != null) {
                        object2 = new en0_0(object3, 0, arrayList5, rect);
                        x92.a((View)viewGroup2, (Runnable)object2);
                        bl4 = true;
                    }
                }
                ((GW0)object3).w(object4, view, arrayList3);
                arrayList5 = ((b$g)object5).f;
                object3 = ((b$g)object5).g;
                object2 = ((b$g)object5).i;
                arrayList = arrayList5;
                object = object3;
                ((GW0)((Object)arrayList5)).q(object3, null, null, object3, (ArrayList)object2);
                arrayList5 = arrayList6;
                continue;
            }
            arrayList6 = arrayList5;
            arrayList = var13_38;
        }
        arrayList = var13_38;
        arrayList5 = new ArrayList();
        object6 = object6.iterator();
        bl2 = false;
        object2 = null;
        n3 = 0;
        Object var13_43 = null;
        while (true) {
            void var13_44;
            bl3 = object6.hasNext();
            var27_73 = var13_44;
            string2 = "FragmentManager";
            fragment = object2;
            if (!bl3) break;
            arrayList2 = (b$h)object6.next();
            object2 = ((b$f)((Object)arrayList2)).a;
            object = object6;
            object6 = ((b$h)((Object)arrayList2)).b;
            if ((object6 = ((GW0)object3).h(object6)) != null) {
                void var31_77;
                void var13_54;
                boolean bl6;
                boolean bl7;
                void var9_12;
                ArrayList arrayList8 = arrayList2;
                arrayList2 = new ArrayList();
                String string3 = string2;
                View view2 = ((n$c)object2).c.mView;
                void var31_78 = var9_12;
                String string4 = "operation.fragment.mView";
                Intrinsics.checkNotNullExpressionValue(view2, string4);
                b$g.f(view2, arrayList2);
                if (object4 != null && (object2 == n$c4 || object2 == n$c3)) {
                    if (object2 == n$c4) {
                        Collection collection = CollectionsKt.o0(arrayList3);
                        arrayList2.removeAll(collection);
                    } else {
                        Collection collection = CollectionsKt.o0(arrayList4);
                        arrayList2.removeAll(collection);
                    }
                }
                if (bl7 = arrayList2.isEmpty()) {
                    ((GW0)object3).a(view, object6);
                } else {
                    ((GW0)object3).b(object6, arrayList2);
                    ((b$g)object5).f.q(object6, object6, arrayList2, null, null);
                    n$c$b n$c$b = ((n$c)object2).a;
                    n$c$b n$c$b2 = n$c$b.GONE;
                    if (n$c$b == n$c$b2) {
                        ((n$c)object2).i = false;
                        ArrayList arrayList9 = new ArrayList(arrayList2);
                        Fragment fragment2 = ((n$c)object2).c;
                        object5 = fragment2.mView;
                        arrayList9.remove(object5);
                        object5 = fragment2.mView;
                        ((GW0)object3).p(object6, (View)object5, arrayList9);
                        bl7 = false;
                        Object var9_19 = null;
                        object5 = new fn0_0(arrayList2, 0);
                        x92.a((View)viewGroup2, (Runnable)object5);
                    }
                }
                object5 = ((n$c)object2).a;
                n$c$b n$c$b = n$c$b.VISIBLE;
                object2 = "transitioningViews";
                if (object5 == n$c$b) {
                    arrayList5.addAll(arrayList2);
                    object5 = var31_78;
                    if (bl4) {
                        ((GW0)object3).t(object6, (Rect)var31_78);
                    }
                    String string5 = string3;
                    n3 = 2;
                    bl7 = Log.isLoggable((String)string3, (int)n3);
                    if (bl7) {
                        object6.toString();
                        Iterator iterator = arrayList2.iterator();
                        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                            Object e2 = iterator.next();
                            Intrinsics.checkNotNullExpressionValue(e2, (String)object2);
                            View view3 = (View)e2;
                            Objects.toString(view3);
                        }
                    }
                    Object object7 = object5;
                    void var13_53 = arrayList;
                } else {
                    void var13_55 = arrayList;
                    String string6 = string3;
                    object5 = var31_78;
                    ((GW0)object3).s((View)arrayList, object6);
                    bl6 = Log.isLoggable((String)string3, (int)2);
                    if (bl6) {
                        object6.toString();
                        object5 = arrayList2.iterator();
                        while (bl7 = object5.hasNext()) {
                            Object e5 = object5.next();
                            Intrinsics.checkNotNullExpressionValue(e5, (String)object2);
                            View view4 = (View)e5;
                            Objects.toString(view4);
                        }
                    }
                }
                arrayList2 = arrayList8;
                bl6 = ((b$h)((Object)arrayList8)).c;
                if (bl6) {
                    object5 = fragment;
                    object2 = ((GW0)object3).o(fragment, object6);
                    object5 = this;
                    arrayList = var13_54;
                    void var13_56 = var27_73;
                    object6 = object;
                } else {
                    object2 = var27_73;
                    object5 = fragment;
                    Object object8 = ((GW0)object3).o(var27_73, object6);
                    object2 = fragment;
                    arrayList = var13_54;
                    object6 = object;
                    object5 = this;
                    Object object9 = object8;
                }
                void var9_31 = var31_77;
                continue;
            }
            object2 = var27_73;
            object5 = fragment;
            void var13_59 = var27_73;
            object6 = object;
            object2 = fragment;
            object5 = this;
        }
        String string7 = string2;
        object2 = var27_73;
        object5 = fragment;
        object5 = ((GW0)object3).n(fragment, var27_73, object4);
        boolean bl8 = Log.isLoggable((String)string2, (int)2);
        if (!bl8) return new Pair(arrayList5, object5);
        Objects.toString(object5);
        return new Pair(arrayList5, object5);
    }

    public final boolean h() {
        boolean bl2;
        block4: {
            Object object;
            boolean bl3;
            Object object2;
            block3: {
                object2 = this.c;
                bl3 = object2 instanceof Collection;
                bl2 = true;
                if (!bl3) break block3;
                object = object2;
                object = (Collection)object2;
                bl3 = object.isEmpty();
                if (bl3) break block4;
            }
            object2 = object2.iterator();
            while (bl3 = object2.hasNext()) {
                object = ((b$h)object2.next()).a.c;
                bl3 = ((Fragment)object).mTransitioning;
                if (bl3) continue;
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public final void i(ArrayList object, ViewGroup viewGroup, Function0 object2) {
        ArrayList<View> arrayList;
        Object object3;
        int n3;
        int n4 = 4;
        CW0.c(n4, (List)object);
        GW0 gW0 = this.f;
        gW0.getClass();
        ArrayList<ArrayList<View>> arrayList2 = new ArrayList<ArrayList<View>>();
        ArrayList arrayList3 = this.i;
        int n7 = arrayList3.size();
        Object object4 = null;
        for (n3 = 0; n3 < n7; ++n3) {
            object3 = (View)arrayList3.get(n3);
            arrayList = ViewCompat.a;
            arrayList = ViewCompat$c.g(object3);
            arrayList2.add(arrayList);
            ViewCompat$c.p(object3, null);
        }
        Object object5 = "FragmentManager";
        n3 = 2;
        n7 = (int)(Log.isLoggable((String)object5, (int)n3) ? 1 : 0);
        ArrayList arrayList4 = this.h;
        if (n7 != 0) {
            object5 = arrayList4.iterator();
            while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object4 = object5.next();
                Intrinsics.checkNotNullExpressionValue(object4, "sharedElementFirstOutViews");
                object4 = object4;
                Objects.toString(object4);
                object3 = ViewCompat.a;
                ViewCompat$c.g(object4);
            }
            object5 = arrayList3.iterator();
            while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object4 = object5.next();
                Intrinsics.checkNotNullExpressionValue(object4, "sharedElementLastInViews");
                Objects.toString(object4);
                object3 = ViewCompat.a;
                ViewCompat$c.g(object4);
            }
        }
        object2.invoke();
        n3 = arrayList3.size();
        arrayList = new ArrayList<View>();
        int n8 = 0;
        object2 = null;
        while (true) {
            object3 = this.h;
            if (n8 >= n3) break;
            object5 = (View)object3.get(n8);
            object3 = ViewCompat.a;
            object3 = ViewCompat$c.g((View)object5);
            arrayList.add((View)object3);
            if (object3 != null) {
                ViewCompat$c.p((View)object5, null);
                object5 = (String)this.j.get(object3);
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object e2 = arrayList2.get(i3);
                    boolean bl2 = ((String)object5).equals(e2);
                    if (!bl2) continue;
                    object5 = (View)arrayList3.get(i3);
                    ViewCompat$c.p((View)object5, (String)object3);
                    break;
                }
            }
            ++n8;
        }
        object5 = object2;
        object2 = new FragmentTransitionImpl$1(n3, arrayList3, arrayList2, (ArrayList)object3, arrayList);
        x92.a((View)viewGroup, (Runnable)object2);
        CW0.c(0, (List)object);
        object = this.g;
        gW0.x(object, arrayList4, arrayList3);
    }
}

