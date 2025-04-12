/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.lifecycle.E$b;
import androidx.lifecycle.E$d;
import androidx.lifecycle.a_0;
import androidx.lifecycle.i$b;
import androidx.navigation.d;
import androidx.navigation.d$c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d$e
extends Lambda
implements Function0 {
    public final /* synthetic */ d c;

    public d$e(d d2) {
        this.c = d2;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        boolean bl2 = ((d)object).j;
        if (bl2) {
            Object object2 = ((d)object).h.d;
            Object object3 = i$b.DESTROYED;
            if (object2 != object3) {
                object3 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object2 = new E$d();
                Object object4 = ((d)object).getSavedStateRegistry();
                ((a_0)object2).a = object4;
                ((a_0)object2).b = object4 = ((d)object).getLifecycle();
                ((a_0)object2).c = null;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object4 = "factory";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                rd3_0 rd3_02 = ((d)object).getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object = ((d)object).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(rd3_02, "store");
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
                object3 = new pD3(rd3_02, (E$b)object2, (Wd0)object);
                object = d$c.class;
                object2 = "modelClass";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object4 = "<this>";
                object = ef0_0.a(object, (String)object2, (String)object2, (String)object4);
                object2 = object.getQualifiedName();
                if (object2 != null) {
                    object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
                    return ((d$c)((pD3)object3).a((yn1_2)object, (String)object2)).a;
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = "You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        String string2 = "You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

