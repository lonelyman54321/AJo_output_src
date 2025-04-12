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

public final class Ig
extends Lambda
implements Function1 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ Jg d;

    public Ig(Context context, Jg jg) {
        this.c = context;
        this.d = jg;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = object.getApplicationContext();
        Jg jg = this.d;
        object2.registerComponentCallbacks((ComponentCallbacks)jg);
        object2 = new Hg((Context)object, jg);
        return object2;
    }
}

