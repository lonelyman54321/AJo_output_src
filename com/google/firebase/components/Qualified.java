/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Qualified$Unqualified;
import java.io.Serializable;

public final class Qualified {
    private final Class qualifier;
    private final Class type;

    public Qualified(Class clazz, Class clazz2) {
        this.qualifier = clazz;
        this.type = clazz2;
    }

    public static Qualified qualified(Class clazz, Class clazz2) {
        Qualified qualified = new Qualified(clazz, clazz2);
        return qualified;
    }

    public static Qualified unqualified(Class clazz) {
        Qualified qualified = new Qualified(Qualified$Unqualified.class, clazz);
        return qualified;
    }

    public boolean equals(Object object) {
        Class clazz;
        Class clazz2;
        if (this == object) {
            return true;
        }
        Class clazz3 = null;
        if (object != null && (clazz2 = Qualified.class) == (clazz = object.getClass())) {
            object = (Qualified)object;
            clazz = this.type;
            clazz2 = ((Qualified)object).type;
            boolean bl2 = clazz.equals(clazz2);
            if (!bl2) {
                return false;
            }
            clazz3 = this.qualifier;
            object = ((Qualified)object).qualifier;
            return clazz3.equals(object);
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.type.hashCode() * 31;
        return this.qualifier.hashCode() + n3;
    }

    public String toString() {
        Serializable serializable = this.qualifier;
        Class<Qualified$Unqualified> clazz = Qualified$Unqualified.class;
        if (serializable == clazz) {
            return this.type.getName();
        }
        serializable = new StringBuilder("@");
        clazz = this.qualifier.getName();
        ((StringBuilder)serializable).append((String)((Object)clazz));
        ((StringBuilder)serializable).append(" ");
        clazz = this.type.getName();
        ((StringBuilder)serializable).append((String)((Object)clazz));
        return ((StringBuilder)serializable).toString();
    }
}

