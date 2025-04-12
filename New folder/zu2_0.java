/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zu2
 */
public final class zu2_0
implements Function0 {
    public final /* synthetic */ bv2_0 a;

    public /* synthetic */ zu2_0(bv2_0 bv2_02) {
        this.a = bv2_02;
    }

    public final Object invoke() {
        bv2_0 bv2_02 = this.a;
        Intrinsics.checkNotNullParameter(bv2_02, "this$0");
        z40$a z40$a = z40_0.Companion;
        bv2_02 = bv2_02.a;
        z40$a.getClass();
        return z40$a.a((Context)bv2_02).a.a("enable_urgency_driver_plp");
    }
}

