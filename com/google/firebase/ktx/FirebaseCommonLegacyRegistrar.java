/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.collections.a;

public final class FirebaseCommonLegacyRegistrar
implements ComponentRegistrar {
    public List getComponents() {
        return a.b(LibraryVersionComponent.create("fire-core-ktx", "21.0.0"));
    }
}

