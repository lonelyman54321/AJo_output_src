/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.ktx;

import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3 INSTANCE;

    static {
        FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3 firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3;
        INSTANCE = firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3 = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3();
    }

    public final c create(ComponentContainer object) {
        Qualified qualified = Qualified.qualified(Blocking.class, Executor.class);
        object = object.get(qualified);
        Intrinsics.checkNotNullExpressionValue(object, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
        return h83.a((Executor)object);
    }
}

