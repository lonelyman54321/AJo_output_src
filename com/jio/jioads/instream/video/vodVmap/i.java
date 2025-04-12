/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video.vodVmap;

import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.vodVmap.m;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i
extends Lambda
implements Function2 {
    public final /* synthetic */ m c;

    public i(m m2) {
        this.c = m2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Map map2 = this.c;
        f f5 = ((m)((Object)map2)).c;
        map2 = ((m)((Object)map2)).s;
        if (map2 == null) {
            map2 = new Map();
        }
        f5.getClass();
        Intrinsics.checkNotNullParameter(map2, "headers");
        return o.G(f5.a, (String)object, (String)object2, map2);
    }
}

