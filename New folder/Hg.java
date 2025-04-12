/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.Context
 */
import android.content.ComponentCallbacks;
import android.content.Context;

public final class Hg
implements Cr0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Jg b;

    public Hg(Context context, Jg jg) {
        this.a = context;
        this.b = jg;
    }

    public final void dispose() {
        Context context = this.a.getApplicationContext();
        Jg jg = this.b;
        context.unregisterComponentCallbacks((ComponentCallbacks)jg);
    }
}

