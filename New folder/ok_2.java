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
 * Renamed from OK
 */
public final class ok_2
extends jD3 {
    public final zr1_1 a;
    public final mk_2 b;

    public ok_2(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Object object = new zr1_1();
        this.a = object;
        this.b = object = new mk_2((Context)application);
    }
}

