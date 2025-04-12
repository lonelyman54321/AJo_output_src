/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Home.BrandSubCategory;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iD1
 */
public final class id1_1
implements View.OnClickListener {
    public final /* synthetic */ kD1 a;
    public final /* synthetic */ dd1_2 b;

    public /* synthetic */ id1_1(kD1 kD12, dd1_2 dd1_22) {
        this.a = kD12;
        this.b = dd1_22;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$luxBrandData");
        object = ((kD1)object).a;
        object2 = (BrandSubCategory)((dd1_2)object2).a;
        object.G9((BrandSubCategory)object2);
    }
}

