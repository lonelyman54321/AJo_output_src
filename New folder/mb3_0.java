/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mB3
 */
public final class mb3_0
extends Hj {
    public final oo2_1 a;
    public final zr1_1 b;
    public final zr1_1 c;

    public mb3_0(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Application application = this.getApplication();
        super((Context)application);
        this.a = object;
        super();
        this.b = object;
        super();
        this.c = object;
    }
}

