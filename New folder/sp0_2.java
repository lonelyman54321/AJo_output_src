/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sP0
 */
public final class sp0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object;
        int n3 = this.a;
        switch (n3) {
            default: {
                Application application = (Application)this.b;
                Intrinsics.checkNotNullParameter(application, "$application");
                z40_0.Companion.getClass();
                return z40$a.a((Context)application).a.a("enable_urgency_driver_pdp");
            }
            case 0: 
        }
        Object object2 = object = this.b;
        object2 = (SystemUiController)object;
        Intrinsics.checkNotNullParameter(object2, "$systemUiController");
        long l2 = nz_1.a;
        jh3_2.h((SystemUiController)object2, l2, false, false, null, 12, null);
        return Unit.a;
    }
}

