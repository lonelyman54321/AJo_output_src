/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$e;
import androidx.fragment.app.h;
import androidx.fragment.app.m;
import androidx.fragment.app.n$a;
import androidx.fragment.app.n$b;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$a;
import androidx.fragment.app.n$c$b;
import androidx.fragment.app.n$c$b$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class n {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public n(ViewGroup object) {
        Intrinsics.checkNotNullParameter(object, "container");
        this.a = object;
        this.b = object;
        super();
        this.c = object;
    }

    public static final n i(ViewGroup viewGroup, FragmentManager object) {
        String string2 = "container";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        Intrinsics.checkNotNullParameter(object, "fragmentManager");
        object = ((FragmentManager)object).N();
        Intrinsics.checkNotNullExpressionValue(object, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        Intrinsics.checkNotNullParameter(object, "factory");
        int n3 = R$id.special_effects_controller_view_tag;
        Object object2 = viewGroup.getTag(n3);
        boolean bl2 = object2 instanceof n;
        if (bl2) {
            object2 = (n)object2;
        } else {
            ((FragmentManager$e)object).getClass();
            Intrinsics.checkNotNullParameter(viewGroup, string2);
            object2 = new n(viewGroup);
            object = "factory.createController(container)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            int n4 = R$id.special_effects_controller_view_tag;
            viewGroup.setTag(n4, object2);
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean j(ArrayList var0) {
        block9: {
            block8: {
                var1_1 = var0.iterator();
                var2_2 = true;
                block0: while (true) {
                    var3_3 = true;
                    while (var4_4 = var1_1.hasNext()) {
                        var5_5 = (n$c)var1_1.next();
                        var6_6 = var5_5.k;
                        var4_4 = var6_6.isEmpty() ^ var2_2;
                        if (var4_4) {
                            var5_5 = var5_5.k;
                            var4_4 = var5_5 instanceof Collection;
                            if (var4_4 && (var4_4 = ((ArrayList)var5_5).isEmpty())) continue block0;
                            var5_5 = ((ArrayList)var5_5).iterator();
                            do {
                                if (var4_4 = var5_5.hasNext()) ** break;
                                continue block0;
                            } while (var4_4 = (var6_6 = (n$a)var5_5.next()).a());
                        }
                        var3_3 = false;
                        var5_5 = null;
                    }
                    break;
                }
                if (!var3_3) break block8;
                var1_1 = new ArrayList<E>();
                var0 = var0.iterator();
                while (var3_3 = var0.hasNext()) {
                    var5_5 = ((n$c)var0.next()).k;
                    cx_2.r((Iterable)var5_5, var1_1);
                }
                var7_7 = var1_1.isEmpty() ^ var2_2;
                if (var7_7) break block9;
            }
            var2_2 = false;
        }
        return var2_2;
    }

    public final void a(n$c n$c) {
        Object object = "operation";
        Intrinsics.checkNotNullParameter(n$c, (String)object);
        boolean bl2 = n$c.i;
        if (bl2) {
            object = n$c.a;
            View view = n$c.c.requireView();
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.requireView()");
            ViewGroup viewGroup = this.a;
            ((n$c$b)((Object)object)).applyState(view, viewGroup);
            bl2 = false;
            object = null;
            n$c.i = false;
        }
    }

    public abstract void b(ArrayList var1, boolean var2);

    public final void c(ArrayList list) {
        int n3;
        ArrayList arrayList;
        int n4;
        Intrinsics.checkNotNullParameter(list, "operations");
        List list2 = new List();
        Object object = list.iterator();
        while ((n4 = object.hasNext()) != 0) {
            arrayList = ((n$c)object.next()).k;
            cx_2.r(arrayList, list2);
        }
        list2 = CollectionsKt.k0(CollectionsKt.o0(list2));
        int n7 = list2.size();
        n4 = 0;
        arrayList = null;
        Object object2 = null;
        for (n3 = 0; n3 < n7; ++n3) {
            n$a n$a = (n$a)list2.get(n3);
            ViewGroup viewGroup = this.a;
            n$a.c(viewGroup);
        }
        int n8 = ((ArrayList)list).size();
        object = null;
        for (n7 = 0; n7 < n8; ++n7) {
            object2 = (n$c)((ArrayList)list).get(n7);
            this.a((n$c)object2);
        }
        list = CollectionsKt.k0(list);
        n8 = list.size();
        while (n4 < n8) {
            object = (n$c)list.get(n4);
            object2 = ((n$c)object).k;
            n3 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0);
            if (n3 != 0) {
                ((n$c)object).b();
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(n$c$b object, n$c$a object2, h h3) {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            Throwable throwable2;
            block6: {
                Object object3;
                block4: {
                    block5: {
                        try {
                            object3 = h3.c;
                            String string2 = "fragmentStateManager.fragment";
                            Intrinsics.checkNotNullExpressionValue(object3, string2);
                            object3 = this.f((Fragment)object3);
                            if (object3 != null) break block4;
                            object3 = h3.c;
                            boolean bl2 = ((Fragment)object3).mTransitioning;
                            if (!bl2) break block5;
                            string2 = "fragmentStateManager.fragment";
                            Intrinsics.checkNotNullExpressionValue(object3, string2);
                            object3 = this.g((Fragment)object3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object3 = null;
                }
                if (object3 != null) {
                    ((n$c)object3).d((n$c$b)((Object)object), (n$c$a)((Object)object2));
                    return;
                }
                object3 = new n$b((n$c$b)((Object)object), (n$c$a)((Object)object2), h3);
                object = this.b;
                ((ArrayList)object).add(object3);
                object = new m(this, (n$b)object3);
                object2 = "listener";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = ((n$c)object3).d;
                ((ArrayList)object2).add(object);
                int n3 = 1;
                object = new BN1(n3, this, object3);
                object2 = "listener";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = ((n$c)object3).d;
                ((ArrayList)object2).add(object);
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        var1_1 = 1;
        var2_2 = this.f;
        if (var2_2) {
            return;
        }
        var3_3 /* !! */  = this.a;
        var2_2 = var3_3 /* !! */ .isAttachedToWindow();
        if (!var2_2) {
            this.h();
            this.e = false;
            return;
        }
        var3_3 /* !! */  = this.b;
        synchronized (var3_3 /* !! */ ) {
            block26: {
                block25: {
                    block24: {
                        try {
                            var4_4 = this.c;
                            var4_4 = CollectionsKt.m0((Collection)var4_4);
                            var5_5 = this.c;
                            var5_5.clear();
                            var5_5 = var4_4.iterator();
lbl19:
                            // 2 sources

                            while ((var6_6 = var5_5.hasNext()) != 0) {
                                var7_7 = var5_5.next();
                                var7_7 = (n$c)var7_7;
                                var8_8 = this.b;
                                var9_9 = var8_8.isEmpty() ^ var1_1;
                                if (var9_9 != 0) {
                                    break block24;
                                }
                                ** GOTO lbl-1000
                            }
                            break block25;
                        }
                        catch (Throwable var10_10) {
                            break block26;
                        }
                    }
                    var8_8 = var7_7.c;
                    var9_9 = var8_8.mTransitioning;
                    if (var9_9 != 0) {
                        var9_9 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var9_9 = 0;
                        var8_8 = null;
                    }
                    var7_7.g = var9_9;
                    ** GOTO lbl19
                }
                var4_4 = var4_4.iterator();
                while (true) {
                    var11_12 = var4_4.hasNext();
                    var6_6 = 2;
                    if (var11_12 == 0) break;
                    var5_5 = var4_4.next();
                    var5_5 = (n$c)var5_5;
                    var9_9 = this.d;
                    if (var9_9 != 0) {
                        var8_8 = "FragmentManager";
                        if ((var6_6 = (int)Log.isLoggable((String)var8_8, (int)var6_6)) != 0) {
                            Objects.toString(var5_5);
                        }
                        var5_5.b();
                    } else {
                        var8_8 = "FragmentManager";
                        if ((var6_6 = (int)Log.isLoggable((String)var8_8, (int)var6_6)) != 0) {
                            Objects.toString(var5_5);
                        }
                        var7_7 = this.a;
                        var5_5.a((ViewGroup)var7_7);
                    }
                    this.d = false;
                    var6_6 = (int)var5_5.f;
                    if (var6_6 != 0) continue;
                    var7_7 = this.c;
                    var7_7.add((Object)var5_5);
                }
                var4_4 = this.b;
                var12_13 = var4_4.isEmpty() ^ var1_1;
                if (!var12_13) ** GOTO lbl126
                {
                    this.m();
                    var4_4 = this.b;
                    var4_4 = CollectionsKt.m0((Collection)var4_4);
                    var11_12 = var4_4.isEmpty();
                    if (var11_12 == 0) ** GOTO lbl-1000
                }
                return;
lbl-1000:
                // 1 sources

                {
                    var5_5 = this.b;
                    var5_5.clear();
                    var5_5 = this.c;
                    var5_5.addAll(var4_4);
                    var5_5 = "FragmentManager";
                    Log.isLoggable((String)var5_5, (int)var6_6);
                    var11_12 = this.e;
                    this.b((ArrayList)var4_4, (boolean)var11_12);
                    var11_12 = n.j((ArrayList)var4_4);
                    var8_8 = var4_4.iterator();
                    var13_14 = true;
                    while (var14_15 = var8_8.hasNext()) {
                        var15_16 /* !! */  = var8_8.next();
                        var15_16 /* !! */  = (n$c)var15_16 /* !! */ ;
                        var15_16 /* !! */  = var15_16 /* !! */ .c;
                        var14_15 = var15_16 /* !! */ .mTransitioning;
                        if (var14_15) continue;
                        var13_14 = false;
                        var16_17 = null;
                    }
                    if (var13_14 && var11_12 == 0) {
                        var9_9 = 1;
                    } else {
                        var9_9 = 0;
                        var8_8 = null;
                    }
                    this.d = var9_9;
                    var8_8 = "FragmentManager";
                    Log.isLoggable((String)var8_8, (int)var6_6);
                    if (!var13_14) {
                        this.l((List)var4_4);
                        this.c((ArrayList)var4_4);
                    } else if (var11_12 != 0) {
                        this.l((List)var4_4);
                        var11_12 = var4_4.size();
                        var8_8 = null;
                        for (var9_9 = 0; var9_9 < var11_12; var9_9 += var1_1) {
                            var16_17 = (n$c)var4_4.get(var9_9);
                            var16_17 = var16_17;
                            this.a(var16_17);
                        }
                    }
                    this.e = false;
                    var10_11 = "FragmentManager";
                    Log.isLoggable((String)var10_11, (int)var6_6);
lbl126:
                    // 2 sources

                    var10_11 = Unit.a;
                }
                return;
            }
            throw var10_10;
        }
    }

    public final n$c f(Fragment fragment) {
        Object e2;
        block1: {
            boolean bl2;
            Iterator iterator = this.b.iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                Object object = e2 = iterator.next();
                object = (n$c)e2;
                Fragment fragment2 = ((n$c)object).c;
                boolean bl4 = Intrinsics.areEqual(fragment2, fragment);
                if (!bl4 || (bl3 = ((n$c)object).e)) continue;
                break block1;
            }
            bl2 = false;
            e2 = null;
        }
        return (n$c)e2;
    }

    public final n$c g(Fragment fragment) {
        Object e2;
        block1: {
            boolean bl2;
            Iterator iterator = this.c.iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                Object object = e2 = iterator.next();
                object = (n$c)e2;
                Fragment fragment2 = ((n$c)object).c;
                boolean bl4 = Intrinsics.areEqual(fragment2, fragment);
                if (!bl4 || (bl3 = ((n$c)object).e)) continue;
                break block1;
            }
            bl2 = false;
            e2 = null;
        }
        return (n$c)e2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        int n3 = 2;
        Log.isLoggable((String)"FragmentManager", (int)n3);
        Object object = this.a;
        boolean bl2 = object.isAttachedToWindow();
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            Throwable throwable2;
            block11: {
                boolean bl3;
                Object object2;
                boolean bl4;
                Object object3;
                Iterator iterator;
                try {
                    this.m();
                    iterator = this.b;
                    this.l((List)((Object)iterator));
                    iterator = this.c;
                    iterator = CollectionsKt.m0((Collection)((Object)iterator));
                    object3 = ((ArrayList)((Object)iterator)).iterator();
                    while (bl4 = object3.hasNext()) {
                        object2 = object3.next();
                        object2 = (n$c)object2;
                        ((n$c)object2).g = false;
                    }
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (bl3 = iterator.hasNext()) {
                    object3 = iterator.next();
                    object3 = (n$c)object3;
                    object2 = "FragmentManager";
                    bl4 = Log.isLoggable(object2, (int)n3);
                    if (bl4) {
                        if (!bl2) {
                            object2 = this.a;
                            Objects.toString(object2);
                        }
                        Objects.toString(object3);
                    }
                    object2 = this.a;
                    ((n$c)object3).a((ViewGroup)object2);
                }
                iterator = this.b;
                iterator = CollectionsKt.m0((Collection)((Object)iterator));
                object3 = ((ArrayList)((Object)iterator)).iterator();
                while (bl4 = object3.hasNext()) {
                    object2 = object3.next();
                    object2 = (n$c)object2;
                    ((n$c)object2).g = false;
                }
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (bl3 = iterator.hasNext()) {
                    object3 = iterator.next();
                    object3 = (n$c)object3;
                    object2 = "FragmentManager";
                    bl4 = Log.isLoggable(object2, (int)n3);
                    if (bl4) {
                        if (!bl2) {
                            object2 = this.a;
                            Objects.toString(object2);
                        }
                        Objects.toString(object3);
                    }
                    object2 = this.a;
                    ((n$c)object3).a((ViewGroup)object2);
                }
                object = Unit.a;
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
    public final void k() {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            Throwable throwable2;
            block9: {
                boolean bl2;
                Object object;
                block8: {
                    block7: {
                        try {
                            Object object2;
                            Fragment fragment;
                            block10: {
                                int n3;
                                block6: {
                                    Object object3;
                                    Object object4;
                                    Object object5;
                                    this.m();
                                    object = this.b;
                                    n3 = ((ArrayList)object).size();
                                    object = ((ArrayList)object).listIterator(n3);
                                    do {
                                        n3 = (int)(object.hasPrevious() ? 1 : 0);
                                        fragment = null;
                                        if (n3 == 0) break block6;
                                        object5 = object2 = object.previous();
                                        object5 = (n$c)object2;
                                        object3 = n$c$b.Companion;
                                        object4 = ((n$c)object5).c;
                                        object4 = object4.mView;
                                        String string2 = "operation.fragment.mView";
                                        Intrinsics.checkNotNullExpressionValue(object4, string2);
                                        object3.getClass();
                                        object3 = n$c$b$a.a((View)object4);
                                    } while ((object5 = ((n$c)object5).a) != (object4 = n$c$b.VISIBLE) || object3 == object4);
                                    break block10;
                                }
                                n3 = 0;
                                object2 = null;
                            }
                            object2 = (n$c)object2;
                            if (object2 != null) {
                                fragment = ((n$c)object2).c;
                            }
                            if (fragment == null) break block7;
                            bl2 = fragment.isPostponed();
                            break block8;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    bl2 = false;
                    object = null;
                }
                this.f = bl2;
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final void l(List object) {
        n$c n$c;
        int n3;
        int n4 = object.size();
        int n7 = 0;
        Object object2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            n$c = (n$c)object.get(n3);
            n$c.e();
        }
        object = (Iterable)object;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = ((n$c)object.next()).k;
            cx_2.r((Iterable)object2, arrayList);
        }
        object = CollectionsKt.k0(CollectionsKt.o0(arrayList));
        n4 = object.size();
        while (n7 < n4) {
            boolean bl2;
            object2 = (n$a)object.get(n7);
            object2.getClass();
            n$c = this.a;
            String string2 = "container";
            Intrinsics.checkNotNullParameter(n$c, string2);
            boolean bl3 = ((n$a)object2).a;
            if (!bl3) {
                ((n$a)object2).e((ViewGroup)n$c);
            }
            ((n$a)object2).a = bl2 = true;
            ++n7;
        }
    }

    public final void m() {
        boolean bl2;
        Iterator iterator = this.b.iterator();
        while (bl2 = iterator.hasNext()) {
            n$c n$c = (n$c)iterator.next();
            Enum enum_ = n$c.b;
            Object object = n$c$a.ADDING;
            if (enum_ != object) continue;
            enum_ = n$c.c.requireView();
            Intrinsics.checkNotNullExpressionValue(enum_, "fragment.requireView()");
            object = n$c$b.Companion;
            int n3 = enum_.getVisibility();
            ((Object)object).getClass();
            enum_ = n$c$b$a.b(n3);
            object = n$c$a.NONE;
            n$c.d((n$c$b)enum_, (n$c$a)((Object)object));
        }
    }
}

