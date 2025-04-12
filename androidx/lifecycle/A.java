/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.A$a;
import androidx.lifecycle.A$b;
import androidx.lifecycle.A$c;
import androidx.lifecycle.E$b;
import androidx.lifecycle.E$c;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.x;
import androidx.lifecycle.x$a;
import androidx.lifecycle.y;
import kotlin.jvm.internal.Intrinsics;

public final class A {
    public static final A$b a;
    public static final A$c b;
    public static final A$a c;

    static {
        Wd0$b wd0$b;
        a = wd0$b = new Object();
        wd0$b = new Object();
        b = wd0$b;
        wd0$b = new Object();
        c = wd0$b;
    }

    public static final x a(or1_2 object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = a;
        object3 = (zs2_1)((or1_2)object).a((Wd0$b)object3);
        if (object3 != null) {
            Object object4 = b;
            if ((object4 = (sD3)((or1_2)object).a((Wd0$b)object4)) != null) {
                A$a a$a = c;
                a$a = (Bundle)((or1_2)object).a(a$a);
                Wd0$b wd0$b = E$c.VIEW_MODEL_KEY;
                if ((object = (String)((or1_2)object).a(wd0$b)) != null) {
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object2 = object3.getSavedStateRegistry().b();
                    boolean bl2 = object2 instanceof us2_1;
                    wd0$b = null;
                    object2 = bl2 ? (us2_1)object2 : null;
                    if (object2 != null) {
                        object3 = A.c((sD3)object4);
                        object4 = (x)((vs2_1)object3).a.get(object);
                        if (object4 == null) {
                            boolean bl3;
                            boolean bl4;
                            object4 = x.f;
                            Intrinsics.checkNotNullParameter(object, "key");
                            ((us2_1)object2).b();
                            object4 = ((us2_1)object2).c;
                            object4 = object4 != null ? object4.getBundle((String)object) : null;
                            Bundle bundle = ((us2_1)object2).c;
                            if (bundle != null) {
                                bundle.remove((String)object);
                            }
                            if ((bundle = ((us2_1)object2).c) != null && (bl4 = bundle.isEmpty()) == (bl3 = true)) {
                                ((us2_1)object2).c = null;
                            }
                            object4 = x$a.a(object4, (Bundle)a$a);
                            object2 = ((vs2_1)object3).a;
                            object2.put(object, object4);
                        }
                        return object4;
                    }
                    object = new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    throw object;
                }
                object = new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                throw object;
            }
            object = new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            throw object;
        }
        object = new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        throw object;
    }

    public static final void b(zs2_1 object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = object.getLifecycle().b();
        Object object3 = i$b.INITIALIZED;
        if (object2 != object3 && object2 != (object3 = i$b.CREATED)) {
            object2 = "Failed requirement.".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = object.getSavedStateRegistry().b();
        if (object2 == null) {
            object3 = object.getSavedStateRegistry();
            Object object4 = object;
            object4 = (sD3)object;
            object2 = new us2_1((xs2_1)object3, (sD3)object4);
            object3 = object.getSavedStateRegistry();
            object4 = "androidx.lifecycle.internal.SavedStateHandlesProvider";
            ((xs2_1)object3).c((String)object4, (xS2$b)object2);
            object = object.getLifecycle();
            object3 = new y((us2_1)object2);
            ((i)object).a((lu1)object3);
        }
    }

    public static final vs2_1 c(sD3 object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = new Object();
        Object object3 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = "factory";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        rd3_0 rd3_02 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        boolean bl2 = object instanceof f;
        object = bl2 ? ((f)object).getDefaultViewModelCreationExtras() : Wd0$a.b;
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object3 = new pD3(rd3_02, (E$b)object2, (Wd0)object);
        object2 = "androidx.lifecycle.internal.SavedStateHandlesVM";
        Intrinsics.checkNotNullParameter(object2, "key");
        object4 = vs2_1.class;
        Intrinsics.checkNotNullParameter(object4, "modelClass");
        object = rn1_2.c((Class)object4);
        return (vs2_1)((pD3)object3).a((yn1_2)object, (String)object2);
    }
}

