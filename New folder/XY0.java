/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class XY0
implements View.OnClickListener {
    public final /* synthetic */ qy0_1 a;
    public final /* synthetic */ YY0 b;
    public final /* synthetic */ FacetValue c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ DD2 e;
    public final /* synthetic */ Boolean f;

    public /* synthetic */ XY0(qy0_1 qy0_12, YY0 yY0, FacetValue facetValue, Function2 function2, DD2 dD2, Boolean bl2) {
        this.a = qy0_12;
        this.b = yY0;
        this.c = facetValue;
        this.d = function2;
        this.e = dD2;
        this.f = bl2;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$generalFacetValueAdapter");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Comparable comparable = this.c;
        String string2 = "$facetValue";
        Intrinsics.checkNotNullParameter(comparable, string2);
        int n3 = object.h;
        int n4 = ((RecyclerView$B)object2).getLayoutPosition();
        KI0 kI0 = ((YY0)object2).a;
        Function2 function2 = this.d;
        DD2 dD2 = this.e;
        if (n3 == n4) {
            n3 = 0;
            object = null;
            kI0.Y5((FacetValue)comparable, false);
            if (function2 != null) {
                object = Boolean.FALSE;
                object2 = Boolean.TRUE;
                function2.invoke(object, object2);
            }
            if (dD2 != null) {
                n3 = -1;
                dD2.d(n3);
            }
        } else {
            n3 = 1;
            kI0.Y5((FacetValue)comparable, n3 != 0);
            if (function2 != null) {
                object = Boolean.TRUE;
                boolean bl2 = Intrinsics.areEqual(this.f, object);
                comparable = Boolean.valueOf(bl2);
                function2.invoke(comparable, object);
            }
            if (dD2 != null) {
                n3 = ((RecyclerView$B)object2).getLayoutPosition();
                dD2.d(n3);
            }
        }
    }
}

