/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.components;

import android.content.Context;
import com.google.firebase.components.ComponentDiscovery$MetadataRegistrarNameRetriever;
import com.google.firebase.components.ComponentDiscovery$RegistrarNameRetriever;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public final class ComponentDiscovery {
    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final String TAG = "ComponentDiscovery";
    private final Object context;
    private final ComponentDiscovery$RegistrarNameRetriever retriever;

    public ComponentDiscovery(Object object, ComponentDiscovery$RegistrarNameRetriever componentDiscovery$RegistrarNameRetriever) {
        this.context = object;
        this.retriever = componentDiscovery$RegistrarNameRetriever;
    }

    public static /* synthetic */ ComponentRegistrar a(String string2) {
        return ComponentDiscovery.instantiate(string2);
    }

    public static ComponentDiscovery forContext(Context context, Class clazz) {
        ComponentDiscovery$MetadataRegistrarNameRetriever componentDiscovery$MetadataRegistrarNameRetriever = new ComponentDiscovery$MetadataRegistrarNameRetriever(clazz, null);
        ComponentDiscovery componentDiscovery = new ComponentDiscovery(context, componentDiscovery$MetadataRegistrarNameRetriever);
        return componentDiscovery;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ComponentRegistrar instantiate(String string2) {
        IllegalAccessException illegalAccessException22222;
        Object object;
        String string3;
        CharSequence charSequence;
        block9: {
            InstantiationException instantiationException22222;
            block8: {
                NoSuchMethodException noSuchMethodException22222;
                Object object2;
                block7: {
                    Object object3;
                    Serializable serializable;
                    charSequence = ".";
                    string3 = "Could not instantiate ";
                    object2 = " is not an instance of com.google.firebase.components.ComponentRegistrar";
                    object = "Class ";
                    try {
                        serializable = Class.forName(string2);
                        object3 = ComponentRegistrar.class;
                        boolean bl2 = ((Class)object3).isAssignableFrom((Class<?>)serializable);
                        if (bl2) {
                            object2 = serializable.getDeclaredConstructor(null);
                            object2 = ((Constructor)object2).newInstance(null);
                            return (ComponentRegistrar)object2;
                        }
                    }
                    catch (InvocationTargetException invocationTargetException2222) {
                    }
                    catch (NoSuchMethodException noSuchMethodException22222) {
                        break block7;
                    }
                    catch (InstantiationException instantiationException22222) {
                        break block8;
                    }
                    catch (IllegalAccessException illegalAccessException22222) {
                        break block9;
                    }
                    object3 = new StringBuilder((String)object);
                    ((StringBuilder)object3).append(string2);
                    ((StringBuilder)object3).append((String)object2);
                    object2 = ((StringBuilder)object3).toString();
                    serializable = new Serializable((String)object2);
                    throw serializable;
                    catch (ClassNotFoundException classNotFoundException) {
                        charSequence = new StringBuilder((String)object);
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append(" is not an found.");
                        return null;
                    }
                    string2 = kp1_0.c(string3, string2);
                    object2 = new InvalidRegistrarException(string2, invocationTargetException2222);
                    throw object2;
                }
                string2 = kp1_0.c(string3, string2);
                object2 = new InvalidRegistrarException(string2, noSuchMethodException22222);
                throw object2;
            }
            string2 = cP.a(string3, string2, (String)charSequence);
            object = new InvalidRegistrarException(string2, instantiationException22222);
            throw object;
        }
        string2 = cP.a(string3, string2, (String)charSequence);
        object = new InvalidRegistrarException(string2, illegalAccessException22222);
        throw object;
    }

    public List discover() {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = this.retriever;
        Object object2 = this.context;
        object = object.retrieve(object2).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            try {
                if ((object2 = ComponentDiscovery.instantiate((String)object2)) == null) continue;
            }
            catch (InvalidRegistrarException invalidRegistrarException) {}
            arrayList.add(object2);
        }
        return arrayList;
    }

    public List discoverLazy() {
        boolean bl2;
        ArrayList<j10_0> arrayList = new ArrayList<j10_0>();
        Object object = this.retriever;
        Object object2 = this.context;
        object = object.retrieve(object2).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            j10_0 j10_02 = new j10_0((String)object2);
            arrayList.add(j10_02);
        }
        return arrayList;
    }
}

