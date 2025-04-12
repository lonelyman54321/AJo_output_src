/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.core.provider;

import android.content.Context;
import androidx.core.provider.g;
import androidx.core.provider.g$a;
import java.util.List;
import java.util.concurrent.Callable;

public final class e
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public e(int n3, Context context, String string2, List list) {
        this.a = string2;
        this.b = context;
        this.c = list;
        this.d = n3;
    }

    public final Object call() {
        Object object = this.a;
        Context context = this.b;
        List list = this.c;
        int n3 = this.d;
        try {
            object = g.b(n3, context, (String)object, list);
        }
        catch (Throwable throwable) {
            int n4 = -3;
            object = new g$a(n4);
        }
        return object;
    }
}

