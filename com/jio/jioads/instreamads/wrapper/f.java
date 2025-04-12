/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.wrapper;

import com.jio.jioads.instreamads.vastparser.model.d;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.instreamads.wrapper.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f
extends Lambda
implements Function2 {
    public final /* synthetic */ i c;

    public f(i i3) {
        this.c = i3;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object iterator) {
        int n3;
        boolean bl2;
        Object object2;
        object = (j)object;
        iterator = (j)((Object)iterator);
        Integer n4 = null;
        if (object != null) {
            object2 = ((j)object).m;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            if (iterator != null) {
                object2 = ((j)((Object)iterator)).m;
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null) {
                Object object3;
                boolean bl3;
                object = ((j)object).m;
                Intrinsics.checkNotNull(object);
                object2 = this.c;
                object2.getClass();
                object = ((q)object).j;
                String string2 = "waterfall";
                if (object != null) {
                    object = object.iterator();
                    while (bl3 = object.hasNext()) {
                        object3 = (d)object.next();
                        String string3 = ((d)object3).d;
                        boolean bl4 = Intrinsics.areEqual(string3, string2);
                        if (!bl4) continue;
                        object = ((d)object3).e;
                        break;
                    }
                } else {
                    n3 = 0;
                    object = null;
                }
                iterator = ((j)((Object)iterator)).m;
                Intrinsics.checkNotNull(iterator);
                object2.getClass();
                iterator = ((q)((Object)iterator)).j;
                if (iterator != null) {
                    iterator = iterator.iterator();
                    while (bl2 = iterator.hasNext()) {
                        object2 = (d)iterator.next();
                        object3 = ((d)object2).d;
                        bl3 = Intrinsics.areEqual(object3, string2);
                        if (!bl3) continue;
                        n4 = ((d)object2).e;
                        break;
                    }
                }
                if (object != null && n4 != null) {
                    n3 = (Integer)object;
                    int n7 = n4;
                    return n3 -= n7;
                }
            }
        }
        n3 = 0;
        return n3;
    }
}

