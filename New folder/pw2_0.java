/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pW2
 */
public final class pw2_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onClick");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        Application application = (Application)this.b;
        Intrinsics.checkNotNullParameter(application, "$application");
        z40_0.Companion.getClass();
        return z40$a.a((Context)application).a.a("enable_urgency_driver_plp");
    }
}

