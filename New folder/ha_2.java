/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ha
 */
public final class ha_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                yT1 yT12 = (yT1)this.b;
                Intrinsics.checkNotNullParameter(yT12, "$navController");
                e.p(yT12, "finish/coupon bonanza - non active list screen", null, 6);
                return Unit.a;
            }
            case 1: {
                dr0_0 dr0_02 = (dr0_0)this.b;
                Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
                dr0_02.getClass();
                hv1_1 hv1_12 = hv1_1.IDLE;
                dr0_02.b0(hv1_12);
                dr0_02.B();
                return Unit.a;
            }
            case 0: 
        }
        ma_2 ma_22 = (ma_2)this.b;
        Intrinsics.checkNotNullParameter(ma_22, "this$0");
        ja_2 ja_22 = new ja_2(ma_22);
        return ja_22;
    }
}

