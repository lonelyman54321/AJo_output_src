/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V12
 */
public final class v12_0
implements Function1 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ v12_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final Object invoke(Object object) {
        object = (Float)object;
        Object object2 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object2, string2);
        if (object != null) {
            float f5 = ((Number)object).floatValue();
            int n3 = Intrinsics.areEqual((Float)object, 0.0f);
            if (n3 == 0) {
                float f6;
                float f7;
                object = h40_0.a;
                n3 = h40_0.v1();
                if (n3 != 0 && (n3 = (f7 = f5 - (f6 = 4.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0) {
                    object = ((NewProductDetailsFragment)object2).F;
                    int n4 = 1;
                    f5 = Float.MIN_VALUE;
                    object2 = new q81_0(n4);
                    ((lq2_1)object).a((Function1)object2);
                }
            }
        }
        return Unit.a;
    }
}

