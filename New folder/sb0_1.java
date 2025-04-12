/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.navigation.e;
import androidx.recyclerview.widget.o;
import com.ril.ajio.myaccount.order.fragment.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sb0
 */
public final class sb0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sb0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = com.ril.ajio.myaccount.order.fragment.b.Companion;
                object = (b)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object = ((Fragment)object).requireContext();
                object2 = new o((Context)object);
                return object2;
            }
            case 0: 
        }
        object = (yT1)object;
        Intrinsics.checkNotNullParameter(object, "$navController");
        e.p((e)object, "finish/coupon bonanza - non active list screen", null, 6);
        return Unit.a;
    }
}

