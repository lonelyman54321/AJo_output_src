/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.E$b;
import androidx.lifecycle.E$c;
import androidx.lifecycle.E$d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import androidx.navigation.d$c;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from androidx.lifecycle.a
 */
public abstract class a_0
extends E$d
implements E$b {
    public xs2_1 a;
    public i b;
    public Bundle c;

    public final void a(jD3 jD32) {
        Intrinsics.checkNotNullParameter(jD32, "viewModel");
        xs2_1 xs2_12 = this.a;
        if (xs2_12 != null) {
            Intrinsics.checkNotNull(xs2_12);
            i i3 = this.b;
            Intrinsics.checkNotNull(i3);
            g.a(jD32, xs2_12, i3);
        }
    }

    public final jD3 create(Class object) {
        Object object2 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = ((Class)object).getCanonicalName();
        if (string2 != null) {
            Object object3 = this.b;
            if (object3 != null) {
                object3 = this.a;
                Intrinsics.checkNotNull(object3);
                i i3 = this.b;
                Intrinsics.checkNotNull(i3);
                Bundle bundle = this.c;
                object3 = g.b((xs2_1)object3, i3, string2, bundle);
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((z)object3).b;
                Intrinsics.checkNotNullParameter(object, "handle");
                object2 = new d$c((x)object);
                ((jD3)object2).addCloseable("androidx.lifecycle.savedstate.vm.tag", (AutoCloseable)object3);
                return object2;
            }
            object = new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            throw object;
        }
        object = new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        throw object;
    }

    public final jD3 create(Class object, Wd0 object2) {
        Object object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "extras");
        Object object4 = E$c.VIEW_MODEL_KEY;
        object4 = (String)((Wd0)object2).a((Wd0$b)object4);
        if (object4 != null) {
            xs2_1 xs2_12 = this.a;
            String string2 = "handle";
            String string3 = "key";
            if (xs2_12 != null) {
                Intrinsics.checkNotNull(xs2_12);
                object2 = this.b;
                Intrinsics.checkNotNull(object2);
                Bundle bundle = this.c;
                object2 = g.b(xs2_12, (i)object2, (String)object4, bundle);
                Intrinsics.checkNotNullParameter(object4, string3);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object = ((z)object2).b;
                Intrinsics.checkNotNullParameter(object, string2);
                object3 = new d$c((x)object);
                object = "androidx.lifecycle.savedstate.vm.tag";
                ((jD3)object3).addCloseable((String)object, (AutoCloseable)object2);
            } else {
                object2 = A.a((or1_2)object2);
                Intrinsics.checkNotNullParameter(object4, string3);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object2, string2);
                object3 = new d$c((x)object2);
            }
            return object3;
        }
        object = new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        throw object;
    }

    public final /* synthetic */ jD3 create(yn1_2 yn1_22, Wd0 wd0) {
        wd0 = (or1_2)wd0;
        return oD3.a(this, yn1_22, (or1_2)wd0);
    }
}

