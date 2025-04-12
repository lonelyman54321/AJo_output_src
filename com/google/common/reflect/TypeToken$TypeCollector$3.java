/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken$TypeCollector;
import com.google.common.reflect.TypeToken$TypeCollector$ForwardingTypeCollector;

class TypeToken$TypeCollector$3
extends TypeToken$TypeCollector$ForwardingTypeCollector {
    public TypeToken$TypeCollector$3(TypeToken$TypeCollector typeToken$TypeCollector, TypeToken$TypeCollector typeToken$TypeCollector2) {
        super(typeToken$TypeCollector2);
    }

    public ImmutableList collectTypes(Iterable object) {
        boolean bl2;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            Class clazz = this.getRawType(e2);
            boolean bl3 = clazz.isInterface();
            if (bl3) continue;
            immutableList$Builder.add(e2);
        }
        object = immutableList$Builder.build();
        return super.collectTypes((Iterable)object);
    }

    public Iterable getInterfaces(Object object) {
        return ImmutableSet.of();
    }
}

