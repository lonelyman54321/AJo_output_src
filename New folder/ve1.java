/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.ProductType;
import kotlin.jvm.internal.Intrinsics;

public final class ve1
implements View.OnClickListener {
    public final /* synthetic */ we1_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ ve1(we1_0 we1_02, int n3) {
        this.a = we1_02;
        this.b = n3;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((we1_0)object2).b;
        object2 = ((we1_0)object2).a;
        int n3 = this.b;
        object2 = (ProductType)object2.get(n3);
        object.onCategoryClick(n3, (ProductType)object2);
    }
}

