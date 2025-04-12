/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.ReturnRefundBottomLink;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from EN2
 */
public final class en2_0
implements View.OnClickListener {
    public final /* synthetic */ fn2_2 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Ref$IntRef c;

    public /* synthetic */ en2_0(fn2_2 fn2_22, ArrayList arrayList, Ref$IntRef ref$IntRef) {
        this.a = fn2_22;
        this.b = arrayList;
        this.c = ref$IntRef;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$bottomLink");
        Ref$IntRef ref$IntRef = this.c;
        Intrinsics.checkNotNullParameter(ref$IntRef, "$index");
        object = ((fn2_2)object2).a;
        if (object != null) {
            int n3 = ref$IntRef.element;
            object2 = ((ReturnRefundBottomLink)object3.get(n3)).getBottomLinkUrl();
            int n4 = ref$IntRef.element;
            object3 = ((ReturnRefundBottomLink)object3.get(n4)).getBottomLinkCode();
            object.O0((String)object2, (ReturnRefundLinksEnum)((Object)object3));
        }
    }
}

