/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ke2
 */
public final class ke2_1
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ ConvenienceFeePriceSplitUp d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ ke2_1(c80 c802, Activity activity, qz1_2 qz1_22, ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp, int n3, int n4) {
        this.a = c802;
        this.b = activity;
        this.c = qz1_22;
        this.d = convenienceFeePriceSplitUp;
        this.e = n3;
        this.f = n4;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.a;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        qz1_2 qz1_22 = this.c;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp = this.d;
        Intrinsics.checkNotNullParameter(convenienceFeePriceSplitUp, "$convenienceFee");
        int n3 = this.e;
        int n4 = this.f;
        Activity activity = this.b;
        ue2_2 ue2_22 = new ue2_2(activity, qz1_22, convenienceFeePriceSplitUp, n3, n4, null);
        Ae3.d(i90_02, null, null, ue2_22, 3);
        return Unit.a;
    }
}

