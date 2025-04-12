/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableList;
import com.google.common.eventbus.SubscriberRegistry;

class SubscriberRegistry$1
extends CacheLoader {
    public ImmutableList load(Class clazz) {
        return SubscriberRegistry.access$000(clazz);
    }
}

