/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.user.AppliedFacetValue;
import kotlin.jvm.internal.Intrinsics;

public final class eZ1
implements View.OnClickListener {
    public final /* synthetic */ AppliedFacetValue a;
    public final /* synthetic */ hZ1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ eZ1(AppliedFacetValue appliedFacetValue, hZ1 hZ12, int n3) {
        this.a = appliedFacetValue;
        this.b = hZ12;
        this.c = n3;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$item");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        String string2 = ((AppliedFacetValue)object).getType();
        String string3 = "facet";
        int n3 = Intrinsics.areEqual(string2, string3);
        if (n3 != 0 && (object = ((AppliedFacetValue)object).getFacetValue()) != null) {
            object2 = ((hZ1)object2).a;
            n3 = this.c;
            object2.Q8(n3, (FacetValue)object);
        }
    }
}

