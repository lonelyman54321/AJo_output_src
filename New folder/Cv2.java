/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.internal.Intrinsics;

public final class Cv2
implements View.OnClickListener {
    public final /* synthetic */ dv2_0 a;
    public final /* synthetic */ FacetValue b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ Cv2(dv2_0 dv2_02, FacetValue facetValue, int n3, int n4) {
        this.a = dv2_02;
        this.b = facetValue;
        this.c = n3;
        this.d = n4;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        FacetValue facetValue = this.b;
        Intrinsics.checkNotNullParameter(facetValue, "$item");
        object = ((dv2_0)object).a;
        int n3 = this.c;
        int n4 = this.d;
        object.L6(facetValue, n3, n4);
    }
}

