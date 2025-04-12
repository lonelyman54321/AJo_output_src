/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mb2
 */
public final class mb2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object;
        int n3 = this.a;
        switch (n3) {
            default: {
                qm3_0 qm3_02 = (qm3_0)this.b;
                Intrinsics.checkNotNullParameter(qm3_02, "this$0");
                qm3_02 = qm3_02.requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(qm3_02, "getApplicationContext(...)");
                jo_2 jo_22 = new jo_2((Context)qm3_02);
                return jo_22;
            }
            case 0: 
        }
        Object object2 = object = this.b;
        object2 = (SystemUiController)object;
        Intrinsics.checkNotNullParameter(object2, "$systemUiController");
        long l2 = OX.f;
        jh3_2.h((SystemUiController)object2, l2, true, false, null, 12, null);
        return Unit.a;
    }
}

