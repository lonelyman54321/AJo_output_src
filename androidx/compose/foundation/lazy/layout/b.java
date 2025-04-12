/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.compose.foundation.lazy.layout.b$a;

public abstract class b {
    public abstract yr1_0 e();

    public final Object f(int n3) {
        Integer n4;
        Object object = this.e().d(n3);
        int n7 = ((Nj1)object).a;
        n7 = n3 - n7;
        object = ((b$a)((Nj1)object).c).getKey();
        if (object == null || (object = object.invoke(n4 = Integer.valueOf(n7))) == null) {
            object = new DefaultLazyKey(n3);
        }
        return object;
    }
}

