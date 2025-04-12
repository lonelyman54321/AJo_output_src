/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.E$b;
import androidx.lifecycle.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class E {
    public final pD3 a;

    public E(rd3_0 rd3_02, E$b e$b, Wd0 wd0) {
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        Intrinsics.checkNotNullParameter(wd0, "defaultCreationExtras");
        pD3 pD32 = new pD3(rd3_02, e$b, wd0);
        this.a = pD32;
    }

    public E(sD3 object, E$b e$b) {
        String string2 = "owner";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(e$b, "factory");
        rd3_0 rd3_02 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof f;
        object = bl2 ? ((f)object).getDefaultViewModelCreationExtras() : Wd0$a.b;
        this(rd3_02, e$b, (Wd0)object);
    }

    public final jD3 a(yn1_2 object) {
        String string2 = "modelClass";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, "<this>");
        string2 = object.getQualifiedName();
        if (string2 != null) {
            string2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(string2);
            return this.a.a((yn1_2)object, string2);
        }
        string2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final jD3 b(Class object) {
        Intrinsics.checkNotNullParameter(object, "modelClass");
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = Reflection.getOrCreateKotlinClass((Class)object);
        return this.a((yn1_2)object);
    }
}

