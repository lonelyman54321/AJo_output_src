/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qN2
 */
public final class qn2_2
implements Function1 {
    public final /* synthetic */ yn2_2 a;

    public /* synthetic */ qn2_2(yn2_2 yn2_22) {
        this.a = yn2_22;
    }

    public final Object invoke(Object object) {
        object = (Float)object;
        Object object2 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object2, string2);
        if (object != null) {
            float f5 = ((Number)object).floatValue();
            String string3 = null;
            int n3 = Intrinsics.areEqual((Float)object, 0.0f);
            if (n3 == 0) {
                float f6;
                float f7;
                string3 = ((yn2_2)object2).f;
                if (string3 != null && (n3 = string3.length()) != 0) {
                    n3 = 1;
                    ((yn2_2)object2).J = n3;
                    f7 = ((Float)object).floatValue();
                    string3 = new Bundle();
                    string3.putFloat("RATING", f7);
                    String string4 = ((yn2_2)object2).I;
                    string3.putString("BASE_PRODUCT_ID", string4);
                    object = ((yn2_2)object2).l;
                    if (object != null) {
                        string4 = "RETURN_ORDER";
                        int n4 = 927;
                        object.onFragmentInteraction(string4, n4, (Bundle)string3);
                    }
                    object = ((yn2_2)object2).f;
                    Intrinsics.checkNotNull(object);
                    ((yn2_2)object2).getOrderDetails((String)object);
                }
                object = h40_0.a;
                int n7 = h40_0.v1();
                if (n7 != 0 && (n7 = (f6 = f5 - (f7 = 4.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) >= 0) {
                    int n8 = 2;
                    f5 = 2.8E-45f;
                    object = new pj0_1(n8);
                    object2 = ((yn2_2)object2).T;
                    ((lq2_1)object2).a((Function1)object);
                }
            } else {
                int n10;
                object = ((yn2_2)object2).f;
                if (object != null && (n10 = ((String)object).length()) != 0) {
                    object = ((yn2_2)object2).f;
                    Intrinsics.checkNotNull(object);
                    ((yn2_2)object2).getOrderDetails((String)object);
                }
            }
        }
        return Unit.a;
    }
}

