/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import kotlin.jvm.internal.Intrinsics;

public final class InstallationsKt {
    public static final FirebaseInstallations getInstallations(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseInstallations.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final FirebaseInstallations installations(Firebase object, FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(firebaseApp, "app");
        object = FirebaseInstallations.getInstance(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(app)");
        return object;
    }
}

