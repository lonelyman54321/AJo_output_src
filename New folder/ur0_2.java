/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.services.network.dnsresolver.DnsResolver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ur0
 */
public final class ur0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                gu1_2 gu1_22 = (gu1_2)this.b;
                Intrinsics.checkNotNullParameter(gu1_22, "this$0");
                gu1_22 = gu1_22.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(gu1_22, "getApplication(...)");
                op2_2 op2_22 = new op2_2((Application)gu1_22);
                return op2_22;
            }
            case 0: 
        }
        return DnsResolver.c((Context)this.b);
    }
}

