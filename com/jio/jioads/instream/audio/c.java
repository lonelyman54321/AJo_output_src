/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.audio;

import com.jio.jioads.controller.f;
import com.jio.jioads.instream.audio.j;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c
extends Lambda
implements Function2 {
    public final /* synthetic */ j c;

    public c(j j3) {
        this.c = j3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        com.jio.jioads.common.c c2 = ((j)object3).c;
        object3 = ((j)object3).e;
        return ((f)c2).f((String)object, (String)object2, (Map)object3);
    }
}

