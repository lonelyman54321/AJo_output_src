/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase;

import android.content.Context;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt$coroutineDispatcher$1;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class FirebaseKt {
    public static final FirebaseApp app(Firebase object, String string2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string2, "name");
        object = FirebaseApp.getInstance(string2);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(name)");
        return object;
    }

    private static final /* synthetic */ Component coroutineDispatcher() {
        int n3 = 4;
        Object object = "T";
        Intrinsics.reifiedOperationMarker(n3, (String)object);
        Class<Annotation> clazz = Annotation.class;
        Component$Builder component$Builder = Component.builder(Qualified.qualified(clazz, c.class));
        Intrinsics.reifiedOperationMarker(n3, (String)object);
        Object object2 = Dependency.required(Qualified.qualified(clazz, Executor.class));
        object2 = component$Builder.add((Dependency)object2);
        Intrinsics.needClassReification();
        object = FirebaseKt$coroutineDispatcher$1.INSTANCE;
        object2 = ((Component$Builder)object2).factory((ComponentFactory)object).build();
        Intrinsics.checkNotNullExpressionValue(object2, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        return object2;
    }

    public static final FirebaseApp getApp(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseApp.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final FirebaseOptions getOptions(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseKt.getApp(Firebase.INSTANCE).getOptions();
        Intrinsics.checkNotNullExpressionValue(object, "Firebase.app.options");
        return object;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase object, Context context, FirebaseOptions firebaseOptions) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseOptions, "options");
        object = FirebaseApp.initializeApp(context, firebaseOptions);
        Intrinsics.checkNotNullExpressionValue(object, "initializeApp(context, options)");
        return object;
    }

    public static final FirebaseApp initialize(Firebase object, Context context, FirebaseOptions firebaseOptions, String string2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseOptions, "options");
        Intrinsics.checkNotNullParameter(string2, "name");
        object = FirebaseApp.initializeApp(context, firebaseOptions, string2);
        Intrinsics.checkNotNullExpressionValue(object, "initializeApp(context, options, name)");
        return object;
    }
}

