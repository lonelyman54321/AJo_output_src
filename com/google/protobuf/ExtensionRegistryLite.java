/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.ExtensionRegistryFactory;
import com.google.protobuf.ExtensionRegistryLite$ExtensionClassHolder;
import com.google.protobuf.ExtensionRegistryLite$ObjectIntPair;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.MessageLite;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE;
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map extensionsByNumber;

    static {
        ExtensionRegistryLite extensionRegistryLite;
        EMPTY_REGISTRY_LITE = extensionRegistryLite = new ExtensionRegistryLite(true);
    }

    public ExtensionRegistryLite() {
        HashMap hashMap;
        this.extensionsByNumber = hashMap = new HashMap();
    }

    public ExtensionRegistryLite(ExtensionRegistryLite map2) {
        ExtensionRegistryLite extensionRegistryLite = EMPTY_REGISTRY_LITE;
        this.extensionsByNumber = map2 == extensionRegistryLite ? (map2 = Collections.emptyMap()) : (map2 = Collections.unmodifiableMap(((ExtensionRegistryLite)((Object)map2)).extensionsByNumber));
    }

    public ExtensionRegistryLite(boolean bl2) {
        Map map2;
        this.extensionsByNumber = map2 = Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ExtensionRegistryLite getEmptyRegistry() {
        boolean bl2 = doFullRuntimeInheritanceCheck;
        if (!bl2) {
            return EMPTY_REGISTRY_LITE;
        }
        ExtensionRegistryLite extensionRegistryLite = emptyRegistry;
        if (extensionRegistryLite != null) return extensionRegistryLite;
        Class<ExtensionRegistryLite> clazz = ExtensionRegistryLite.class;
        synchronized (clazz) {
            try {
                extensionRegistryLite = emptyRegistry;
                if (extensionRegistryLite != null) return extensionRegistryLite;
                emptyRegistry = extensionRegistryLite = ExtensionRegistryFactory.createEmpty();
                return extensionRegistryLite;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite newInstance() {
        boolean bl2 = doFullRuntimeInheritanceCheck;
        ExtensionRegistryLite extensionRegistryLite = bl2 ? ExtensionRegistryFactory.create() : new ExtensionRegistryLite();
        return extensionRegistryLite;
    }

    public static void setEagerlyParseMessageSets(boolean bl2) {
        eagerlyParseMessageSets = bl2;
    }

    public final void add(ExtensionLite object) {
        int n3 = 1;
        Object object2 = GeneratedMessageLite$GeneratedExtension.class;
        GenericDeclaration genericDeclaration = object.getClass();
        boolean bl2 = object2.isAssignableFrom((Class<?>)genericDeclaration);
        if (bl2) {
            genericDeclaration = object;
            genericDeclaration = (GeneratedMessageLite$GeneratedExtension)object;
            this.add((GeneratedMessageLite$GeneratedExtension)((Object)genericDeclaration));
        }
        if ((bl2 = doFullRuntimeInheritanceCheck) && (bl2 = ExtensionRegistryFactory.isFullRegistry(this))) {
            try {
                genericDeclaration = this.getClass();
                object2 = "add";
            }
            catch (Exception exception) {
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                object = String.format("Could not invoke ExtensionRegistry#add for %s", objectArray);
                object2 = new IllegalArgumentException((String)object, exception);
                throw object2;
            }
            Class[] classArray = new Class[n3];
            Class clazz = ExtensionRegistryLite$ExtensionClassHolder.INSTANCE;
            classArray[0] = clazz;
            genericDeclaration = ((Class)genericDeclaration).getMethod((String)object2, classArray);
            object2 = new Object[n3];
            object2[0] = object;
            ((Method)genericDeclaration).invoke(this, object2);
        }
    }

    public final void add(GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension) {
        Map map2 = this.extensionsByNumber;
        MessageLite messageLite = generatedMessageLite$GeneratedExtension.getContainingTypeDefaultInstance();
        int n3 = generatedMessageLite$GeneratedExtension.getNumber();
        ExtensionRegistryLite$ObjectIntPair extensionRegistryLite$ObjectIntPair = new ExtensionRegistryLite$ObjectIntPair(messageLite, n3);
        map2.put(extensionRegistryLite$ObjectIntPair, generatedMessageLite$GeneratedExtension);
    }

    public GeneratedMessageLite$GeneratedExtension findLiteExtensionByNumber(MessageLite messageLite, int n3) {
        Map map2 = this.extensionsByNumber;
        ExtensionRegistryLite$ObjectIntPair extensionRegistryLite$ObjectIntPair = new ExtensionRegistryLite$ObjectIntPair(messageLite, n3);
        return (GeneratedMessageLite$GeneratedExtension)map2.get(extensionRegistryLite$ObjectIntPair);
    }

    public ExtensionRegistryLite getUnmodifiable() {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite(this);
        return extensionRegistryLite;
    }
}

