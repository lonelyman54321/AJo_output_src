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
 * Renamed from Lb0
 */
public final class lb0_0 {
    public final jo_2 a;

    public lb0_0(Application application) {
        jo_2 jo_22;
        Intrinsics.checkNotNullParameter(application, "context");
        this.a = jo_22 = new jo_2((Context)application);
    }
}

