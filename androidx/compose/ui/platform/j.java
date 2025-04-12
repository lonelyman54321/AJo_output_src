/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.R$id;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.j$a;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.functions.Function2;

public final class j
implements z30_0,
n {
    public final AndroidComposeView a;
    public final z30_0 b;
    public boolean c;
    public i d;
    public Function2 e;

    public j(AndroidComposeView object, z30_0 z30_02) {
        this.a = object;
        this.b = z30_02;
        this.e = object = r20.a;
    }

    public final void e(Function2 function2) {
        j$a j$a = new j$a(this, function2);
        this.a.setOnViewTreeOwnersAvailable(j$a);
    }

    public final void k(mu1_1 object, i$a i$a) {
        object = i$a.ON_DESTROY;
        if (i$a == object) {
            this.o();
        } else {
            boolean bl2;
            object = i$a.ON_CREATE;
            if (i$a == object && !(bl2 = this.c)) {
                object = this.e;
                this.e((Function2)object);
            }
        }
    }

    public final void o() {
        boolean bl2 = this.c;
        if (!bl2) {
            this.c = bl2 = true;
            Object object = this.a.getView();
            int n3 = R$id.wrapped_composition_tag;
            object.setTag(n3, null);
            object = this.d;
            if (object != null) {
                ((i)object).c(this);
            }
        }
        this.b.o();
    }
}

