/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.ktx;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class FirebaseKt$coroutineDispatcher$1
implements ComponentFactory {
    public static final FirebaseKt$coroutineDispatcher$1 INSTANCE;

    static {
        FirebaseKt$coroutineDispatcher$1 firebaseKt$coroutineDispatcher$1;
        INSTANCE = firebaseKt$coroutineDispatcher$1 = new FirebaseKt$coroutineDispatcher$1();
    }

    public final c create(ComponentContainer object) {
        Intrinsics.reifiedOperationMarker(4, "T");
        Qualified qualified = Qualified.qualified(Annotation.class, Executor.class);
        object = object.get(qualified);
        Intrinsics.checkNotNullExpressionValue(object, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
        return h83.a((Executor)object);
    }
}

