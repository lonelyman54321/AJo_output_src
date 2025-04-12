/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 */
package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.E$a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.b_0;
import androidx.lifecycle.f;
import androidx.lifecycle.i$b;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import androidx.navigation.d$e;
import androidx.navigation.i;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements mu1_1,
sD3,
f,
zs2_1 {
    public final Context a;
    public i b;
    public final Bundle c;
    public i$b d;
    public final eu1_0 e;
    public final String f;
    public final Bundle g;
    public final o h;
    public final ys2_0 i;
    public boolean j;
    public final hh3_2 k;
    public i$b l;
    public final b_0 m;

    public d(Context object, i object2, Bundle bundle, i$b i$b, eu1_0 eu1_02, String string2, Bundle bundle2) {
        this.a = object;
        this.b = object2;
        this.c = bundle;
        this.d = i$b;
        this.e = eu1_02;
        this.f = string2;
        this.g = bundle2;
        super(this);
        this.h = object;
        Intrinsics.checkNotNullParameter(this, "owner");
        super(this);
        this.i = object;
        super(this);
        object = yr1_2.b((Function0)object);
        object2 = new d$e(this);
        this.k = object2 = yr1_2.b((Function0)object2);
        object2 = i$b.INITIALIZED;
        this.l = object2;
        this.m = object = (b_0)((hh3_2)object).getValue();
    }

    public final Bundle a() {
        Bundle bundle;
        Object object = this.c;
        object = object == null ? null : (bundle = new Bundle(object));
        return object;
    }

    public final x b() {
        return (x)this.k.getValue();
    }

    public final void c(i$b i$b) {
        Intrinsics.checkNotNullParameter((Object)i$b, "maxState");
        this.l = i$b;
        this.d();
    }

    public final void d() {
        Object object;
        int n3;
        Object object2;
        int n4 = this.j;
        if (n4 == 0) {
            object2 = this.i;
            object2.a();
            this.j = n3 = 1;
            object = this.e;
            if (object != null) {
                A.b(this);
            }
            object = this.g;
            object2.b((Bundle)object);
        }
        object2 = this.d;
        n4 = ((Enum)object2).ordinal();
        object = this.l;
        n3 = object.ordinal();
        o o3 = this.h;
        if (n4 < n3) {
            object2 = this.d;
            o3.h((i$b)((Object)object2));
        } else {
            object2 = this.l;
            o3.h((i$b)((Object)object2));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = false;
        if (object == null) return bl2;
        boolean bl3 = object instanceof d;
        if (!bl3) return bl2;
        object = (d)object;
        Object object4 = this.f;
        Object object5 = ((d)object).f;
        bl3 = Intrinsics.areEqual(object4, object5);
        if (!bl3) return bl2;
        object5 = this.b;
        object4 = ((d)object).b;
        bl3 = Intrinsics.areEqual(object5, object4);
        if (!bl3) return bl2;
        object5 = this.h;
        object4 = ((d)object).h;
        bl3 = Intrinsics.areEqual(object5, object4);
        if (!bl3) return bl2;
        object5 = this.i.b;
        object4 = ((d)object).i.b;
        bl3 = Intrinsics.areEqual(object5, object4);
        if (!bl3) return bl2;
        object5 = this.c;
        object = ((d)object).c;
        boolean bl4 = Intrinsics.areEqual(object5, object);
        if (bl4) return true;
        if (object5 == null) return bl2;
        object4 = object5.keySet();
        if (object4 == null) return bl2;
        boolean bl5 = (object4 = (Iterable)object4) instanceof Collection;
        if (bl5) {
            object3 = object4;
            object3 = (Collection)object4;
            bl5 = object3.isEmpty();
            if (bl5) return true;
        }
        object4 = ((Iterable)object4).iterator();
        do {
            if (!(bl5 = object4.hasNext())) return true;
            object3 = (String)object4.next();
            object2 = object5.get((String)object3);
            if (object != null) {
                object3 = object.get((String)object3);
                continue;
            }
            bl5 = false;
            object3 = null;
        } while (bl5 = Intrinsics.areEqual(object2, object3));
        return bl2;
    }

    public final Wd0 getDefaultViewModelCreationExtras() {
        or1_2 or1_22 = new or1_2(0);
        Object object = null;
        Object object2 = this.a;
        object2 = object2 != null ? object2.getApplicationContext() : null;
        boolean bl2 = object2 instanceof Application;
        if (bl2) {
            object = object2;
            object = (Application)object2;
        }
        if (object != null) {
            object2 = E$a.c;
            or1_22.b((Wd0$b)object2, object);
        }
        object = A.a;
        or1_22.b((Wd0$b)object, this);
        object = A.b;
        or1_22.b((Wd0$b)object, this);
        object = this.a();
        if (object != null) {
            object2 = A.c;
            or1_22.b((Wd0$b)object2, object);
        }
        return or1_22;
    }

    public final E$b getDefaultViewModelProviderFactory() {
        return this.m;
    }

    public final androidx.lifecycle.i getLifecycle() {
        return this.h;
    }

    public final xs2_1 getSavedStateRegistry() {
        return this.i.b;
    }

    public final rd3_0 getViewModelStore() {
        boolean bl2 = this.j;
        if (bl2) {
            Object object = this.h.d;
            Object object2 = i$b.DESTROYED;
            if (object != object2) {
                object = this.e;
                if (object != null) {
                    object2 = this.f;
                    return object.a((String)object2);
                }
                object2 = "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object2 = "You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        String string2 = "You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int hashCode() {
        Object object;
        int n3 = this.f.hashCode() * 31;
        i i3 = this.b;
        int n4 = i3.hashCode() + n3;
        Bundle bundle = this.c;
        if (bundle != null && (object = bundle.keySet()) != null) {
            int n7;
            object = ((Iterable)object).iterator();
            while ((n7 = object.hasNext()) != 0) {
                Object object2 = (String)object.next();
                n4 *= 31;
                if ((object2 = bundle.get((String)object2)) != null) {
                    n7 = object2.hashCode();
                } else {
                    n7 = 0;
                    object2 = null;
                }
                n4 += n7;
            }
        }
        n3 = (this.h.hashCode() + (n4 *= 31)) * 31;
        return this.i.b.hashCode() + n3;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        Object object = d.class.getSimpleName();
        charSequence.append((String)object);
        object = new StringBuilder("(");
        String string2 = this.f;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(')');
        object = ((StringBuilder)object).toString();
        charSequence.append((String)object);
        charSequence.append(" destination=");
        object = this.b;
        charSequence.append(object);
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

