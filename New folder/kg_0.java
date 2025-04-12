/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.Context
 */
import android.content.ComponentCallbacks;
import android.content.Context;

/*
 * Renamed from Kg
 */
public final class kg_0
implements Cr0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Mg b;

    public kg_0(Context context, Mg mg) {
        this.a = context;
        this.b = mg;
    }

    public final void dispose() {
        Context context = this.a.getApplicationContext();
        Mg mg = this.b;
        context.unregisterComponentCallbacks((ComponentCallbacks)mg);
    }
}

