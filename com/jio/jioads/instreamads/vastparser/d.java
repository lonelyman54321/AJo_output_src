/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.n;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d
extends Lambda
implements Function2 {
    public final /* synthetic */ n c;

    public d(n n3) {
        this.c = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        c c2 = ((n)object3).c;
        object3 = ((n)object3).a;
        if (object3 == null) {
            object3 = fh1_2.f();
        }
        return ((f)c2).f((String)object, (String)object2, (Map)object3);
    }
}

