/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken;
import java.util.Collection;

class SubscriberRegistry$2
extends CacheLoader {
    public ImmutableSet load(Class clazz) {
        return ImmutableSet.copyOf((Collection)TypeToken.of(clazz).getTypes().rawTypes());
    }
}

