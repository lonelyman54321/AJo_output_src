/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

public final class PC2
implements View.OnClickListener {
    public final /* synthetic */ QC2 a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ String c;

    public /* synthetic */ PC2(QC2 qC2, Product product, String string2) {
        this.a = qC2;
        this.b = product;
        this.c = string2;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$storeId");
        object = ((QC2)object2).k;
        object2 = this.b;
        object2 = object2 != null ? ((Product)object2).getCode() : null;
        object.y9((String)object2, string2);
    }
}

