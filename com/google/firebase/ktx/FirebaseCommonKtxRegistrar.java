/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.ktx;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;
import com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2;
import com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3;
import com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class FirebaseCommonKtxRegistrar
implements ComponentRegistrar {
    public List getComponents() {
        Object object = Background.class;
        Object object2 = c.class;
        Object[] objectArray = Component.builder(Qualified.qualified(object, object2));
        Object object3 = Executor.class;
        object = Dependency.required(Qualified.qualified(object, object3));
        object = objectArray.add((Dependency)object);
        objectArray = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE;
        object = ((Component$Builder)object).factory((ComponentFactory)objectArray).build();
        objectArray = "builder(Qualified.qualif\u2026cher()\n    }\n    .build()";
        Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
        Object object4 = Lightweight.class;
        Object object5 = Component.builder(Qualified.qualified(object4, object2));
        object4 = Dependency.required(Qualified.qualified(object4, object3));
        object4 = ((Component$Builder)object5).add((Dependency)object4);
        object5 = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2.INSTANCE;
        object4 = ((Component$Builder)object4).factory((ComponentFactory)object5).build();
        Intrinsics.checkNotNullExpressionValue(object4, (String)objectArray);
        object5 = Blocking.class;
        Class<UiThread> clazz = Component.builder(Qualified.qualified(object5, object2));
        object5 = Dependency.required(Qualified.qualified(object5, object3));
        object5 = ((Component$Builder)((Object)clazz)).add((Dependency)object5);
        clazz = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3.INSTANCE;
        object5 = ((Component$Builder)object5).factory((ComponentFactory)((Object)clazz)).build();
        Intrinsics.checkNotNullExpressionValue(object5, (String)objectArray);
        clazz = UiThread.class;
        object2 = Component.builder(Qualified.qualified(clazz, object2));
        object3 = Dependency.required(Qualified.qualified(clazz, object3));
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4.INSTANCE;
        object2 = ((Component$Builder)object2).factory((ComponentFactory)object3).build();
        Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray);
        objectArray = new Component[]{object, object4, object5, object2};
        return xx_2.i(objectArray);
    }
}

