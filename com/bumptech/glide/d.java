/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide;

import com.bumptech.glide.d$a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d {
    public final Map a;

    public d(d$a map2) {
        map2 = ((d$a)((Object)map2)).a;
        HashMap hashMap = new HashMap(map2);
        this.a = map2 = Collections.unmodifiableMap(hashMap);
    }
}

