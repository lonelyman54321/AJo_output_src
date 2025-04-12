/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/*
 * Renamed from bC1
 */
public final class bc1_1
implements Callable {
    public final /* synthetic */ WeakReference a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ bc1_1(WeakReference weakReference, Context context, int n3, String string2) {
        this.a = weakReference;
        this.b = context;
        this.c = n3;
        this.d = string2;
    }

    public final Object call() {
        Context context = (Context)this.a.get();
        if (context == null) {
            context = this.b;
        }
        int n3 = this.c;
        String string2 = this.d;
        return cc1_0.h(context, n3, string2);
    }
}

