/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class cG1
implements Function0 {
    public final /* synthetic */ kG1 a;

    public /* synthetic */ cG1(kG1 kG12) {
        this.a = kG12;
    }

    public final Object invoke() {
        kG1 kG12 = this.a;
        Intrinsics.checkNotNullParameter(kG12, "this$0");
        z40$a z40$a = z40_0.Companion;
        kG12 = kG12.a;
        z40$a.getClass();
        return z40$a.a((Context)kG12).a.a("enable_urgency_driver_plp");
    }
}

