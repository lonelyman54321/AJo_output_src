/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 */
package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$l;
import androidx.fragment.app.f$a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public final FragmentManager a;
    public final CopyOnWriteArrayList b;

    public f(FragmentManager copyOnWriteArrayList) {
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "fragmentManager");
        this.a = copyOnWriteArrayList;
        this.b = copyOnWriteArrayList = new CopyOnWriteArrayList();
    }

    public final void a(Fragment fragment, Bundle bundle, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).a(fragment, bundle, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentActivityCreated(fragmentManager, fragment, bundle);
        }
    }

    public final void b(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Context context = fragmentManager.x.b;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).b(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentAttached(fragmentManager, fragment, context);
        }
    }

    public final void c(Fragment fragment, Bundle bundle, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).c(fragment, bundle, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentCreated(fragmentManager, fragment, bundle);
        }
    }

    public final void d(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).d(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentDestroyed(fragmentManager, fragment);
        }
    }

    public final void e(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).e(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentDetached(fragmentManager, fragment);
        }
    }

    public final void f(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).f(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentPaused(fragmentManager, fragment);
        }
    }

    public final void g(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Context context = fragmentManager.x.b;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).g(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentPreAttached(fragmentManager, fragment, context);
        }
    }

    public final void h(Fragment fragment, Bundle bundle, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).h(fragment, bundle, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentPreCreated(fragmentManager, fragment, bundle);
        }
    }

    public final void i(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).i(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentResumed(fragmentManager, fragment);
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        Intrinsics.checkNotNullParameter(bundle, "outState");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).j(fragment, bundle, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
        }
    }

    public final void k(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).k(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentStarted(fragmentManager, fragment);
        }
    }

    public final void l(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).l(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentStopped(fragmentManager, fragment);
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        Intrinsics.checkNotNullParameter(view, "v");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).m(fragment, view, bundle, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        }
    }

    public final void n(Fragment fragment, boolean bl2) {
        boolean bl3;
        Object object;
        Intrinsics.checkNotNullParameter(fragment, "f");
        FragmentManager fragmentManager = this.a;
        Object object2 = fragmentManager.z;
        if (object2 != null) {
            object2 = ((Fragment)object2).getParentFragmentManager();
            object = "parent.getParentFragmentManager()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = ((FragmentManager)object2).p;
            bl3 = true;
            ((f)object2).n(fragment, bl3);
        }
        object2 = this.b.iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object = (f$a)object2.next();
            if (bl2 && !(bl4 = ((f$a)object).b)) continue;
            object = ((f$a)object).a;
            ((FragmentManager$l)object).onFragmentViewDestroyed(fragmentManager, fragment);
        }
    }
}

