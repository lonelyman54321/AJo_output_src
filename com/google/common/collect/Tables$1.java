/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collections;
import java.util.Map;

class Tables$1
implements Function {
    public Map apply(Map map2) {
        return Collections.unmodifiableMap(map2);
    }
}

