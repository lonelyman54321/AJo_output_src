/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import java.util.Map;

public interface ClassToInstanceMap
extends Map {
    public Object getInstance(Class var1);

    public Object putInstance(Class var1, Object var2);
}

