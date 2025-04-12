/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.core.provider;

import android.content.Context;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class c
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gV0 c;
    public final /* synthetic */ int d;

    public c(String string2, Context context, gV0 gV02, int n3) {
        this.a = string2;
        this.b = context;
        this.c = gV02;
        this.d = n3;
    }

    public final Object call() {
        int n3 = 1;
        Context context = this.c;
        Object[] objectArray = new Object[n3];
        objectArray[0] = context;
        context = new ArrayList(n3);
        List list = objectArray[0];
        Objects.requireNonNull(list);
        context.add(list);
        list = Collections.unmodifiableList(context);
        String string2 = this.a;
        context = this.b;
        return g.b(this.d, context, string2, list);
    }
}

