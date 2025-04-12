/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.services.data.Cart.ActionContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cA
 */
public final class ca_0
implements Function0 {
    public final /* synthetic */ ActionContent a;
    public final /* synthetic */ ia_1 b;

    public /* synthetic */ ca_0(ActionContent actionContent, ia_1 ia_12) {
        this.a = actionContent;
        this.b = ia_12;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        hv3_0 hv3_02 = hv3_0.a;
        ActionContent actionContent = this.a;
        Object object2 = null;
        if (actionContent != null) {
            String string2;
            int n3 = ((ia_1)object).o;
            float f5 = n3;
            Float f6 = Float.valueOf(f5);
            qz1_2 qz1_22 = ((ia_1)object).g;
            String string3 = qz1_22 != null ? (string2 = qz1_22.y0) : null;
            if (qz1_22 != null) {
                object2 = qz1_22.g;
            }
            n3 = 0;
            f5 = 0.0f;
            qz1_22 = null;
            string2 = null;
            int n4 = 0x1FBFFFF;
            object2 = ActionContent.copy$default(actionContent, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, f6, null, null, null, null, null, null, string3, (String)object2, n4, null);
        }
        object = ((Fragment)object).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getChildFragmentManager(...)");
        hv3_02.getClass();
        hv3_0.c0(object2, (FragmentManager)object);
        return Unit.a;
    }
}

