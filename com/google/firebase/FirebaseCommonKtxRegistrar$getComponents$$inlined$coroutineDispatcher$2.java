/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2 INSTANCE;

    static {
        FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2 firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2;
        INSTANCE = firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2 = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2();
    }

    public final c create(ComponentContainer object) {
        Qualified qualified = Qualified.qualified(Lightweight.class, Executor.class);
        object = object.get(qualified);
        Intrinsics.checkNotNullExpressionValue(object, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
        return h83.a((Executor)object);
    }
}

