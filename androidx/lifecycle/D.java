/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class D
implements rq1_2 {
    public final yn1_2 a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public jD3 e;

    public D(yn1_2 yn1_22, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(yn1_22, "viewModelClass");
        Intrinsics.checkNotNullParameter(function0, "storeProducer");
        Intrinsics.checkNotNullParameter(function02, "factoryProducer");
        nd3_1 nd3_12 = nd3_1.c;
        this(yn1_22, function0, function02, nd3_12);
    }

    public D(yn1_2 yn1_22, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(yn1_22, "viewModelClass");
        Intrinsics.checkNotNullParameter(function0, "storeProducer");
        Intrinsics.checkNotNullParameter(function02, "factoryProducer");
        Intrinsics.checkNotNullParameter(function03, "extrasProducer");
        this.a = yn1_22;
        this.b = function0;
        this.c = function02;
        this.d = function03;
    }

    public final Object getValue() {
        Object object = this.e;
        if (object == null) {
            object = (rd3_0)this.b.invoke();
            Object object2 = (E$b)this.c.invoke();
            Object object3 = (Wd0)this.d.invoke();
            Object object4 = "store";
            Intrinsics.checkNotNullParameter(object, (String)object4);
            String string2 = "factory";
            Intrinsics.checkNotNullParameter(object2, string2);
            String string3 = "extras";
            Intrinsics.checkNotNullParameter(object3, string3);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            Intrinsics.checkNotNullParameter(object2, string2);
            Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
            object4 = new pD3((rd3_0)object, (E$b)object2, (Wd0)object3);
            object = this.a;
            object2 = "modelClass";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(object, "<this>");
            object2 = object.getQualifiedName();
            if (object2 != null) {
                object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object2 = ((String)object3).concat((String)object2);
                this.e = object = ((pD3)object4).a((yn1_2)object, (String)object2);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
        return object;
    }

    public final boolean isInitialized() {
        boolean bl2;
        jD3 jD32 = this.e;
        if (jD32 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            jD32 = null;
        }
        return bl2;
    }
}

