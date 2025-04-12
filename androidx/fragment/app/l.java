/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ContextWrapper
 *  android.os.Bundle
 */
package androidx.fragment.app;

import android.app.Application;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.E$a;
import androidx.lifecycle.E$a$a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.b_0;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements f,
zs2_1,
sD3 {
    public final Fragment a;
    public final rd3_0 b;
    public final Runnable c;
    public E$b d;
    public o e = null;
    public ys2_0 f = null;

    public l(Fragment fragment, rd3_0 rd3_02, SV0 sV0) {
        this.a = fragment;
        this.b = rd3_02;
        this.c = sV0;
    }

    public final void a(i$a i$a) {
        this.e.f(i$a);
    }

    public final void b() {
        Object object = this.e;
        if (object == null) {
            object = new o(this);
            this.e = object;
            Intrinsics.checkNotNullParameter(this, "owner");
            this.f = object = new ys2_0(this);
            ((ys2_0)object).a();
            object = this.c;
            object.run();
        }
    }

    public final Wd0 getDefaultViewModelCreationExtras() {
        Object object;
        Fragment fragment;
        block4: {
            boolean bl2;
            fragment = this.a;
            object = fragment.requireContext().getApplicationContext();
            while (bl2 = object instanceof ContextWrapper) {
                bl2 = object instanceof Application;
                if (bl2) {
                    object = (Application)object;
                    break block4;
                }
                object = ((ContextWrapper)object).getBaseContext();
            }
            object = null;
        }
        E$a$a e$a$a = null;
        or1_2 or1_22 = new or1_2(0);
        if (object != null) {
            e$a$a = E$a.c;
            or1_22.b(e$a$a, object);
        }
        object = A.a;
        or1_22.b((Wd0$b)object, fragment);
        object = A.b;
        or1_22.b((Wd0$b)object, this);
        object = fragment.getArguments();
        if (object != null) {
            object = A.c;
            fragment = fragment.getArguments();
            or1_22.b((Wd0$b)object, fragment);
        }
        return or1_22;
    }

    public final E$b getDefaultViewModelProviderFactory() {
        E$b e$b;
        Fragment fragment = this.a;
        E$b e$b2 = fragment.getDefaultViewModelProviderFactory();
        boolean bl2 = e$b2.equals(e$b = fragment.mDefaultFactory);
        if (!bl2) {
            this.d = e$b2;
            return e$b2;
        }
        e$b2 = this.d;
        if (e$b2 == null) {
            block4: {
                e$b2 = fragment.requireContext().getApplicationContext();
                while (bl2 = e$b2 instanceof ContextWrapper) {
                    bl2 = e$b2 instanceof Application;
                    if (bl2) {
                        e$b2 = (Application)e$b2;
                        break block4;
                    }
                    e$b2 = ((ContextWrapper)e$b2).getBaseContext();
                }
                e$b2 = null;
            }
            Bundle bundle = fragment.getArguments();
            this.d = e$b = new b_0((Application)e$b2, fragment, bundle);
        }
        return this.d;
    }

    public final i getLifecycle() {
        this.b();
        return this.e;
    }

    public final xs2_1 getSavedStateRegistry() {
        this.b();
        return this.f.b;
    }

    public final rd3_0 getViewModelStore() {
        this.b();
        return this.b;
    }
}

