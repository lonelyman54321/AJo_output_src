/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders;

import com.google.firebase.encoders.FieldDescriptor$1;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

public final class FieldDescriptor {
    private final String name;
    private final Map properties;

    private FieldDescriptor(String string2, Map map2) {
        this.name = string2;
        this.properties = map2;
    }

    public /* synthetic */ FieldDescriptor(String string2, Map map2, FieldDescriptor$1 fieldDescriptor$1) {
        this(string2, map2);
    }

    public static FieldDescriptor$Builder builder(String string2) {
        FieldDescriptor$Builder fieldDescriptor$Builder = new FieldDescriptor$Builder(string2);
        return fieldDescriptor$Builder;
    }

    public static FieldDescriptor of(String string2) {
        Map map2 = Collections.emptyMap();
        FieldDescriptor fieldDescriptor = new FieldDescriptor(string2, map2);
        return fieldDescriptor;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof FieldDescriptor;
        if (!bl4) {
            return false;
        }
        object = (FieldDescriptor)object;
        Object object2 = this.name;
        String string2 = ((FieldDescriptor)object).name;
        bl4 = ((String)object2).equals(string2);
        if (!bl4 || !(bl2 = (object2 = this.properties).equals(object = ((FieldDescriptor)object).properties))) {
            bl3 = false;
        }
        return bl3;
    }

    public String getName() {
        return this.name;
    }

    public Annotation getProperty(Class clazz) {
        return (Annotation)this.properties.get(clazz);
    }

    public int hashCode() {
        int n3 = this.name.hashCode() * 31;
        return this.properties.hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FieldDescriptor{name=");
        Object object = this.name;
        stringBuilder.append((String)object);
        stringBuilder.append(", properties=");
        object = this.properties.values();
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

