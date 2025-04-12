/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.lifecycle.E$b;
import androidx.navigation.h;
import kotlin.jvm.internal.Intrinsics;

public final class h$b {
    public static h a(rd3_0 object) {
        Intrinsics.checkNotNullParameter(object, "viewModelStore");
        Object object2 = h.b;
        Object object3 = Wd0$a.b;
        Intrinsics.checkNotNullParameter(object, "store");
        Intrinsics.checkNotNullParameter(object2, "factory");
        Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
        pD3 pD32 = new pD3((rd3_0)object, (E$b)object2, (Wd0)object3);
        object = h.class;
        object2 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object3 = "<this>";
        object = sw0_0.a((Class)object, (String)object3, (Class)object, (String)object2, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object2 = object.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            return (h)pD32.a((yn1_2)object, (String)object2);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

