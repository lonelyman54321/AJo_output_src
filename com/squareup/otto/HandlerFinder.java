/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.HandlerFinder$1;
import java.util.Map;

interface HandlerFinder {
    public static final HandlerFinder ANNOTATED;

    static {
        HandlerFinder$1 handlerFinder$1 = new HandlerFinder$1();
        ANNOTATED = handlerFinder$1;
    }

    public Map findAllProducers(Object var1);

    public Map findAllSubscribers(Object var1);
}

