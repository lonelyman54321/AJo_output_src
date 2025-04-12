/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar;
import com.google.firebase.platforminfo.LibraryVersion;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Set;

public class DefaultUserAgentPublisher
implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    public DefaultUserAgentPublisher(Set object, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.javaSDKVersionUserAgent = object = DefaultUserAgentPublisher.toUserAgent((Set)object);
        this.gamesSDKRegistrar = globalLibraryVersionRegistrar;
    }

    public static /* synthetic */ UserAgentPublisher a(ComponentContainer componentContainer) {
        return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
    }

    public static Component component() {
        Component$Builder component$Builder = Component.builder(UserAgentPublisher.class);
        Object object = Dependency.setOf(LibraryVersion.class);
        component$Builder = component$Builder.add((Dependency)object);
        object = new Object();
        return component$Builder.factory((ComponentFactory)object).build();
    }

    private static /* synthetic */ UserAgentPublisher lambda$component$0(ComponentContainer object) {
        object = object.setOf(LibraryVersion.class);
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.getInstance();
        DefaultUserAgentPublisher defaultUserAgentPublisher = new DefaultUserAgentPublisher((Set)object, globalLibraryVersionRegistrar);
        return defaultUserAgentPublisher;
    }

    private static String toUserAgent(Set object) {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        object = object.iterator();
        while ((c2 = object.hasNext()) != '\u0000') {
            Object object2 = (LibraryVersion)object.next();
            String string2 = ((LibraryVersion)object2).getLibraryName();
            stringBuilder.append(string2);
            char c3 = '/';
            stringBuilder.append(c3);
            object2 = ((LibraryVersion)object2).getVersion();
            stringBuilder.append((String)object2);
            c2 = object.hasNext();
            if (c2 == '\u0000') continue;
            c2 = ' ';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public String getUserAgent() {
        Object object = this.gamesSDKRegistrar.getRegisteredVersions();
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return this.javaSDKVersionUserAgent;
        }
        object = new StringBuilder();
        String string2 = this.javaSDKVersionUserAgent;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(' ');
        string2 = DefaultUserAgentPublisher.toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions());
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }
}

