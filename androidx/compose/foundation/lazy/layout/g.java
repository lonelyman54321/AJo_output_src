/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.foundation.lazy.layout.g$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public final class g
implements d {
    public final gr1_1 a;
    public final Object[] b;
    public final int c;

    public g(IntRange object, b objectArray) {
        objectArray = objectArray.e();
        int n3 = ((c)object).a;
        if (n3 >= 0) {
            int n4 = objectArray.b + -1;
            int n7 = Math.min(((c)object).b, n4);
            if (n7 < n3) {
                object = j62.a;
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.a = object;
                n7 = 0;
                object = null;
                objectArray = new Object[]{};
                this.b = objectArray;
                this.c = 0;
            } else {
                n4 = n7 - n3 + 1;
                Object object2 = new Object[n4];
                this.b = object2;
                this.c = n3;
                super(n4);
                g$a g$a = new g$a(n3, n7, (gr1_1)object2, this);
                objectArray.c(n3, n7, g$a);
                this.a = object2;
            }
            return;
        }
        objectArray = "negative nearestRange.first".toString();
        object = new IllegalStateException((String)objectArray);
        throw object;
    }

    public final int b(Object object) {
        Object object2 = this.a;
        Object object3 = ((i62)object2).b(object);
        if (object3 >= 0) {
            object2 = ((i62)object2).c;
            object3 = object2[object3];
        } else {
            object3 = -1;
        }
        return object3;
    }

    public final Object c(int n3) {
        Object object;
        Object[] objectArray;
        int n4;
        int n7 = this.c;
        if ((n3 -= n7) >= 0 && n3 <= (n4 = tp_2.C(objectArray = this.b))) {
            object = objectArray[n3];
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }
}

