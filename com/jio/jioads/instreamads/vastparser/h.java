/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.instreamads.vastparser.n;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h
extends Lambda
implements Function2 {
    public final /* synthetic */ n c;

    public h(n n3) {
        this.c = n3;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (j)object;
        object2 = (j)object2;
        Object object3 = null;
        q q2 = object != null ? ((j)object).m : null;
        if (q2 != null) {
            if (object2 != null) {
                object3 = ((j)object2).m;
            }
            if (object3 != null) {
                object = ((j)object).m;
                Intrinsics.checkNotNull(object);
                object3 = this.c;
                object3.getClass();
                object = n.b((q)object);
                object2 = ((j)object2).m;
                Intrinsics.checkNotNull(object2);
                object3.getClass();
                object2 = n.b((q)object2);
                if (object != null && object2 != null) {
                    n3 = (Integer)object;
                    int n4 = (Integer)object2;
                    return n3 -= n4;
                }
            }
        }
        n3 = 0;
        return n3;
    }
}

