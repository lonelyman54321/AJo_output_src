/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersion;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;

public class LibraryVersionComponent {
    private LibraryVersionComponent() {
    }

    public static /* synthetic */ LibraryVersion a(String string2, LibraryVersionComponent$VersionExtractor libraryVersionComponent$VersionExtractor, ComponentContainer componentContainer) {
        return LibraryVersionComponent.lambda$fromContext$0(string2, libraryVersionComponent$VersionExtractor, componentContainer);
    }

    public static Component create(String string2, String string3) {
        return Component.intoSet((Object)LibraryVersion.create(string2, string3), LibraryVersion.class);
    }

    public static Component fromContext(String string2, LibraryVersionComponent$VersionExtractor libraryVersionComponent$VersionExtractor) {
        Component$Builder component$Builder = Component.intoSetBuilder(LibraryVersion.class);
        Object object = Dependency.required(Context.class);
        component$Builder = component$Builder.add((Dependency)object);
        object = new eu1_1(string2, libraryVersionComponent$VersionExtractor);
        return component$Builder.factory((ComponentFactory)object).build();
    }

    private static /* synthetic */ LibraryVersion lambda$fromContext$0(String string2, LibraryVersionComponent$VersionExtractor object, ComponentContainer componentContainer) {
        componentContainer = (Context)componentContainer.get(Context.class);
        object = object.extract(componentContainer);
        return LibraryVersion.create(string2, (String)object);
    }
}

