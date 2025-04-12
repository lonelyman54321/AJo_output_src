/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.TypeResolver$WildcardCapturer;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

class TypeResolver$WildcardCapturer$1
extends TypeResolver$WildcardCapturer {
    final /* synthetic */ TypeVariable val$typeParam;

    public TypeResolver$WildcardCapturer$1(TypeResolver$WildcardCapturer typeResolver$WildcardCapturer, AtomicInteger atomicInteger, TypeVariable typeVariable) {
        this.val$typeParam = typeVariable;
        super(atomicInteger, null);
    }

    public TypeVariable captureAsTypeVariable(Type[] typeArray) {
        typeArray = Arrays.asList(typeArray);
        LinkedHashSet linkedHashSet = new LinkedHashSet(typeArray);
        typeArray = Arrays.asList(this.val$typeParam.getBounds());
        linkedHashSet.addAll(typeArray);
        int n3 = linkedHashSet.size();
        int n4 = 1;
        if (n3 > n4) {
            typeArray = Object.class;
            linkedHashSet.remove(typeArray);
        }
        typeArray = new Type[]{};
        typeArray = linkedHashSet.toArray(typeArray);
        return super.captureAsTypeVariable(typeArray);
    }
}

