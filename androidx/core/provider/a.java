/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.provider.CallbackWrapper$1;
import androidx.core.provider.CallbackWrapper$2;
import androidx.core.provider.g$a;
import androidx.core.provider.h$c;
import java.util.concurrent.Executor;

public final class a {
    public final h$c a;
    public final Executor b;

    public a(ft3$a ft3$a, ZJ2 zJ2) {
        this.a = ft3$a;
        this.b = zJ2;
    }

    public final void a(g$a object) {
        int n3 = ((g$a)object).b;
        Executor executor = this.b;
        h$c h$c = this.a;
        if (n3 == 0) {
            object = ((g$a)object).a;
            CallbackWrapper$1 callbackWrapper$1 = new CallbackWrapper$1(h$c, (Typeface)object);
            executor.execute(callbackWrapper$1);
        } else {
            object = new CallbackWrapper$2(h$c, n3);
            executor.execute((Runnable)object);
        }
    }
}

