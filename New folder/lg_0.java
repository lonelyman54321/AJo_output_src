/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.Context
 */
import android.content.ComponentCallbacks;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Lg
 */
public final class lg_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ Mg d;

    public lg_0(Context context, Mg mg) {
        this.c = context;
        this.d = mg;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = object.getApplicationContext();
        Mg mg = this.d;
        object2.registerComponentCallbacks((ComponentCallbacks)mg);
        object2 = new kg_0((Context)object, mg);
        return object2;
    }
}

