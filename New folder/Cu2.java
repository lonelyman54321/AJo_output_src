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

public final class Cu2
implements View.OnClickListener {
    public final /* synthetic */ du2_1 a;
    public final /* synthetic */ FacetValue b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ Cu2(du2_1 du2_12, FacetValue facetValue, int n3, int n4) {
        this.a = du2_12;
        this.b = facetValue;
        this.c = n3;
        this.d = n4;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        FacetValue facetValue = this.b;
        Intrinsics.checkNotNullParameter(facetValue, "$item");
        object = ((du2_1)object).a;
        int n3 = this.c;
        int n4 = this.d;
        object.y3(facetValue, n3, n4);
    }
}

