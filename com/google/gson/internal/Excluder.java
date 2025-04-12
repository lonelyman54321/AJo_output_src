/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.internal.Excluder$1;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder
implements TypeAdapterFactory,
Cloneable {
    public static final Excluder DEFAULT;
    private static final double IGNORE_VERSIONS = -1.0;
    private List deserializationStrategies;
    private int modifiers = 136;
    private boolean requireExpose;
    private List serializationStrategies;
    private boolean serializeInnerClasses = true;
    private double version = -1.0;

    static {
        Excluder excluder;
        DEFAULT = excluder = new Excluder();
    }

    public Excluder() {
        List list;
        this.serializationStrategies = list = Collections.emptyList();
        this.deserializationStrategies = list = Collections.emptyList();
    }

    private boolean excludeClassChecks(Class clazz) {
        Until until;
        Since since;
        boolean bl2;
        double d2 = this.version;
        double d5 = -1.0;
        boolean bl3 = true;
        Object object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object != false && !(bl2 = this.isValidVersion(since = clazz.getAnnotation(Since.class), until = clazz.getAnnotation(Until.class)))) {
            return bl3;
        }
        bl2 = this.serializeInnerClasses;
        if (!bl2 && (bl2 = this.isInnerClass(clazz))) {
            return bl3;
        }
        return this.isAnonymousOrNonStaticLocal(clazz);
    }

    private boolean excludeClassInStrategy(Class clazz, boolean bl2) {
        boolean bl3;
        Object object = bl2 ? this.serializationStrategies : this.deserializationStrategies;
        object = object.iterator();
        while (bl3 = object.hasNext()) {
            ExclusionStrategy exclusionStrategy = (ExclusionStrategy)object.next();
            bl3 = exclusionStrategy.shouldSkipClass(clazz);
            if (!bl3) continue;
            return true;
        }
        return false;
    }

    private boolean isAnonymousOrNonStaticLocal(Class clazz) {
        boolean bl2;
        Class<Enum> clazz2 = Enum.class;
        boolean bl3 = clazz2.isAssignableFrom(clazz);
        if (!bl3 && !(bl3 = this.isStatic(clazz)) && ((bl3 = clazz.isAnonymousClass()) || (bl2 = clazz.isLocalClass()))) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        return bl2;
    }

    private boolean isInnerClass(Class clazz) {
        boolean bl2;
        boolean bl3 = clazz.isMemberClass();
        if (bl3 && !(bl2 = this.isStatic(clazz))) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        return bl2;
    }

    private boolean isStatic(Class clazz) {
        int n3 = clazz.getModifiers() & 8;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            clazz = null;
        }
        return n3 != 0;
    }

    private boolean isValidSince(Since since) {
        double d2;
        double d5;
        double d7;
        double d9;
        boolean bl2 = true;
        if (since != null && (d9 = (d7 = (d5 = this.version) - (d2 = since.value())) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) < 0) {
            bl2 = false;
        }
        return bl2;
    }

    private boolean isValidUntil(Until until) {
        double d2;
        double d5;
        double d7;
        double d9;
        boolean bl2 = true;
        if (until != null && (d9 = (d7 = (d5 = this.version) - (d2 = until.value())) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) >= 0) {
            bl2 = false;
        }
        return bl2;
    }

    private boolean isValidVersion(Since since, Until until) {
        boolean bl2 = this.isValidSince(since);
        if (bl2 && (bl2 = this.isValidUntil(until))) {
            bl2 = true;
        } else {
            bl2 = false;
            since = null;
        }
        return bl2;
    }

    public Excluder clone() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            AssertionError assertionError = new AssertionError((Object)cloneNotSupportedException);
            throw assertionError;
        }
        return (Excluder)object;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        boolean bl2;
        boolean bl3;
        Object object = typeToken.getRawType();
        boolean bl4 = this.excludeClassChecks((Class)object);
        boolean bl5 = true;
        boolean bl6 = bl4 || (bl3 = this.excludeClassInStrategy((Class)object, bl5));
        boolean bl7 = bl4 || (bl2 = this.excludeClassInStrategy((Class)object, false));
        if (!bl6 && !bl7) {
            return null;
        }
        object = new Excluder$1(this, bl7, bl6, gson, typeToken);
        return object;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluder = this.clone();
        excluder.serializeInnerClasses = false;
        return excluder;
    }

    public boolean excludeClass(Class clazz, boolean bl2) {
        boolean bl3;
        boolean bl4 = this.excludeClassChecks(clazz);
        if (!bl4 && !(bl3 = this.excludeClassInStrategy(clazz, bl2))) {
            bl3 = false;
            clazz = null;
        } else {
            bl3 = true;
        }
        return bl3;
    }

    public boolean excludeField(Field object, boolean bl2) {
        Until until;
        Class clazz;
        int n3 = this.modifiers;
        int n4 = ((Field)object).getModifiers();
        n3 &= n4;
        n4 = 1;
        if (n3 != 0) {
            return n4 != 0;
        }
        double d2 = this.version;
        double d5 = -1.0;
        double d7 = d2 - d5;
        n3 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1));
        if (n3 != 0 && (n3 = (int)(this.isValidVersion((Since)((Object)(clazz = ((Field)object).getAnnotation(Since.class))), until = ((Field)object).getAnnotation(Until.class)) ? 1 : 0)) == 0) {
            return n4 != 0;
        }
        n3 = (int)(((Field)object).isSynthetic() ? 1 : 0);
        if (n3 != 0) {
            return n4 != 0;
        }
        n3 = (int)(this.requireExpose ? 1 : 0);
        if (n3 != 0 && ((clazz = ((Field)object).getAnnotation(Expose.class)) == null || (bl2 ? (n3 = (int)(clazz.serialize() ? 1 : 0)) == 0 : (n3 = (int)(clazz.deserialize() ? 1 : 0)) == 0))) {
            return n4 != 0;
        }
        n3 = (int)(this.serializeInnerClasses ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(this.isInnerClass(clazz = ((Field)object).getType()) ? 1 : 0)) != 0) {
            return n4 != 0;
        }
        clazz = ((Field)object).getType();
        n3 = (int)(this.isAnonymousOrNonStaticLocal(clazz) ? 1 : 0);
        if (n3 != 0) {
            return n4 != 0;
        }
        Object object2 = bl2 ? this.serializationStrategies : this.deserializationStrategies;
        n3 = (int)(object2.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            clazz = new FieldAttributes((Field)object);
            object = object2.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (ExclusionStrategy)object.next();
                bl2 = object2.shouldSkipField((FieldAttributes)((Object)clazz));
                if (!bl2) continue;
                return n4 != 0;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluder = this.clone();
        excluder.requireExpose = true;
        return excluder;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean bl2, boolean bl3) {
        ArrayList<ExclusionStrategy> arrayList;
        Excluder excluder = this.clone();
        if (bl2) {
            List list = this.serializationStrategies;
            excluder.serializationStrategies = arrayList = new ArrayList<ExclusionStrategy>(list);
            arrayList.add(exclusionStrategy);
        }
        if (bl3) {
            List list = this.deserializationStrategies;
            excluder.deserializationStrategies = arrayList = new ArrayList<ExclusionStrategy>(list);
            arrayList.add(exclusionStrategy);
        }
        return excluder;
    }

    public Excluder withModifiers(int ... nArray) {
        Excluder excluder = this.clone();
        excluder.modifiers = 0;
        for (int n3 : nArray) {
            int n4 = excluder.modifiers;
            excluder.modifiers = n3 |= n4;
        }
        return excluder;
    }

    public Excluder withVersion(double d2) {
        Excluder excluder = this.clone();
        excluder.version = d2;
        return excluder;
    }
}

