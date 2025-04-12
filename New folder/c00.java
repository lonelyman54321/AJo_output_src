/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class c00
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c00(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (uw0_1)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                oo2_0 oo2_02 = oo2_0.a;
                object = ((uw0_1)object).b.j0();
                oo2_02.getClass();
                return oo2_0.c("EMI", (PaymentInstruments)object);
            }
            case 0: 
        }
        e00 e002 = (e00)this.b;
        Intrinsics.checkNotNullParameter(e002, "this$0");
        e002 = e002.a.getApplication();
        Intrinsics.checkNotNullExpressionValue(e002, "getApplication(...)");
        bD2 bD22 = new bD2((Context)e002);
        ZC2 zC2 = new ZC2(bD22);
        return zC2;
    }
}

