/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.collections.a;

public final class FirebaseAnalyticsLegacyRegistrar
implements ComponentRegistrar {
    public final List getComponents() {
        return a.b(LibraryVersionComponent.create("fire-analytics-ktx", "22.2.0"));
    }
}

