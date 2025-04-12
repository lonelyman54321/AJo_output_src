/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O33
 */
public final class o33_0
implements Function0 {
    public final /* synthetic */ Application a;

    public /* synthetic */ o33_0(Application application) {
        this.a = application;
    }

    public final Object invoke() {
        Application application = this.a;
        Intrinsics.checkNotNullParameter(application, "$application");
        z40_0.Companion.getClass();
        return z40$a.a((Context)application).a.a("enable_urgency_driver_plp");
    }
}

