/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.AnnotatedHandlerFinder;
import com.squareup.otto.HandlerFinder;
import java.util.Map;

final class HandlerFinder$1
implements HandlerFinder {
    public Map findAllProducers(Object object) {
        return AnnotatedHandlerFinder.findAllProducers(object);
    }

    public Map findAllSubscribers(Object object) {
        return AnnotatedHandlerFinder.findAllSubscribers(object);
    }
}

