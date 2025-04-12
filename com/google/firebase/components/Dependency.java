/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Preconditions;
import com.google.firebase.components.Qualified;

public final class Dependency {
    private final Qualified anInterface;
    private final int injection;
    private final int type;

    private Dependency(Qualified qualified, int n3, int n4) {
        this.anInterface = qualified = (Qualified)Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.type = n3;
        this.injection = n4;
    }

    private Dependency(Class object, int n3, int n4) {
        object = Qualified.unqualified((Class)object);
        this((Qualified)object, n3, n4);
    }

    public static Dependency deferred(Qualified qualified) {
        Dependency dependency = new Dependency(qualified, 0, 2);
        return dependency;
    }

    public static Dependency deferred(Class clazz) {
        Dependency dependency = new Dependency(clazz, 0, 2);
        return dependency;
    }

    private static String describeInjection(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    return "deferred";
                }
                String string2 = hj0_0.a(n3, "Unsupported injection: ");
                AssertionError assertionError = new AssertionError((Object)string2);
                throw assertionError;
            }
            return "provider";
        }
        return "direct";
    }

    public static Dependency optional(Class clazz) {
        Dependency dependency = new Dependency(clazz, 0, 0);
        return dependency;
    }

    public static Dependency optionalProvider(Qualified qualified) {
        Dependency dependency = new Dependency(qualified, 0, 1);
        return dependency;
    }

    public static Dependency optionalProvider(Class clazz) {
        Dependency dependency = new Dependency(clazz, 0, 1);
        return dependency;
    }

    public static Dependency required(Qualified qualified) {
        Dependency dependency = new Dependency(qualified, 1, 0);
        return dependency;
    }

    public static Dependency required(Class clazz) {
        Dependency dependency = new Dependency(clazz, 1, 0);
        return dependency;
    }

    public static Dependency requiredProvider(Qualified qualified) {
        int n3 = 1;
        Dependency dependency = new Dependency(qualified, n3, n3);
        return dependency;
    }

    public static Dependency requiredProvider(Class clazz) {
        int n3 = 1;
        Dependency dependency = new Dependency(clazz, n3, n3);
        return dependency;
    }

    public static Dependency setOf(Qualified qualified) {
        Dependency dependency = new Dependency(qualified, 2, 0);
        return dependency;
    }

    public static Dependency setOf(Class clazz) {
        Dependency dependency = new Dependency(clazz, 2, 0);
        return dependency;
    }

    public static Dependency setOfProvider(Qualified qualified) {
        Dependency dependency = new Dependency(qualified, 2, 1);
        return dependency;
    }

    public static Dependency setOfProvider(Class clazz) {
        Dependency dependency = new Dependency(clazz, 2, 1);
        return dependency;
    }

    public boolean equals(Object object) {
        int n3 = object instanceof Dependency;
        boolean bl2 = false;
        if (n3 != 0) {
            int n4;
            int n7;
            object = (Dependency)object;
            Qualified qualified = this.anInterface;
            Qualified qualified2 = ((Dependency)object).anInterface;
            n3 = qualified.equals(qualified2);
            if (n3 != 0 && (n3 = this.type) == (n7 = ((Dependency)object).type) && (n3 = this.injection) == (n4 = ((Dependency)object).injection)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public Qualified getInterface() {
        return this.anInterface;
    }

    public int hashCode() {
        int n3 = this.anInterface.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.type;
        n3 = (n3 ^ n7) * n4;
        n4 = this.injection;
        return n3 ^ n4;
    }

    public boolean isDeferred() {
        int n3 = this.injection;
        int n4 = 2;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isDirectInjection() {
        int n3 = this.injection;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isRequired() {
        int n3 = this.type;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isSet() {
        int n3 = this.type;
        int n4 = 2;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        Object object = this.anInterface;
        stringBuilder.append(object);
        object = ", type=";
        stringBuilder.append((String)object);
        int n3 = this.type;
        int n4 = 1;
        object = n3 == n4 ? "required" : (n3 == 0 ? "optional" : "set");
        stringBuilder.append((String)object);
        stringBuilder.append(", injection=");
        object = Dependency.describeInjection(this.injection);
        return h30_0.a(stringBuilder, (String)object, "}");
    }
}

