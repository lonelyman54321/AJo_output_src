/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.compose.foundation.lazy.layout.b$a;
import androidx.compose.foundation.lazy.layout.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g$a
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gr1_1 e;
    public final /* synthetic */ g f;

    public g$a(int n3, int n4, gr1_1 gr1_12, g g3) {
        this.c = n3;
        this.d = n4;
        this.e = gr1_12;
        this.f = g3;
        super(1);
    }

    public final Object invoke(Object object) {
        block3: {
            object = (Nj1)object;
            Function1 function1 = ((b$a)((Nj1)object).c).getKey();
            int n3 = this.c;
            int n4 = ((Nj1)object).a;
            n3 = Math.max(n3, n4);
            int n7 = ((Nj1)object).b + n4 + -1;
            int n8 = this.d;
            if (n3 > (n7 = Math.min(n8, n7))) break block3;
            while (true) {
                Object object2;
                block5: {
                    block4: {
                        if (function1 == null) break block4;
                        n8 = n3 - n4;
                        object2 = n8;
                        if ((object2 = function1.invoke(object2)) != null) break block5;
                    }
                    object2 = new DefaultLazyKey(n3);
                }
                this.e.h(object2, n3);
                g g3 = this.f;
                Object[] objectArray = g3.b;
                int n10 = g3.c;
                n10 = n3 - n10;
                objectArray[n10] = object2;
                if (n3 == n7) break;
                ++n3;
            }
        }
        return Unit.a;
    }
}

