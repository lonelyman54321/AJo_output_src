/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class O43
implements View.OnClickListener {
    public final /* synthetic */ p43_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ ProductOptionVariant d;

    public /* synthetic */ O43(p43_0 p43_02, int n3, Ref$ObjectRef ref$ObjectRef, ProductOptionVariant productOptionVariant) {
        this.a = p43_02;
        this.b = n3;
        this.c = ref$ObjectRef;
        this.d = productOptionVariant;
    }

    public final void onClick(View view) {
        boolean bl2;
        O43 o43 = this;
        p43_0 p43_02 = this.a;
        Intrinsics.checkNotNullParameter(p43_02, "this$0");
        Ref$ObjectRef ref$ObjectRef = this.c;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$buttonText");
        ProductOptionVariant productOptionVariant = this.d;
        Intrinsics.checkNotNullParameter(productOptionVariant, "$optionVariant");
        Iterator iterator = p43_02.c.iterator();
        Number number = null;
        int n3 = 0;
        Object object = null;
        while (bl2 = iterator.hasNext()) {
            Object object2 = iterator.next();
            int n4 = n3 + 1;
            if (n3 >= 0) {
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                Object object8;
                object2 = (ProductOptionVariant)object2;
                int n7 = 3;
                Object object9 = "filterSize";
                int n8 = o43.b;
                if (n8 == n3) {
                    n3 = (int)(((ProductOptionVariant)object2).isSelected() ? 1 : 0);
                    if (n3 == 0) {
                        object = p43_02.b;
                        object2 = String.valueOf(ref$ObjectRef.element);
                        object.l((String)object2, productOptionVariant);
                        object = p43_02.b;
                        object2 = String.valueOf(ref$ObjectRef.element);
                        object.f((String)object2, productOptionVariant, n8);
                        object = d92_0.a;
                        object = String.valueOf(ref$ObjectRef.element);
                        object2 = "<set-?>";
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        d92_0.c = object;
                        object = p43_02.a.x5();
                        object8 = object != null ? (object = ((Product)object).getId()) : null;
                        object = p43_02.a.x5();
                        object7 = object != null ? (object = ((Product)object).getName()) : null;
                        object = p43_02.a.x5();
                        object6 = object != null ? (object = ((Product)object).getBrandName()) : null;
                        object = p43_02.a.x5();
                        object5 = object != null ? (object = ((Product)object).getBrickCategory()) : null;
                        object = p43_02.a.x5();
                        object4 = object != null ? (object = ((Product)object).getBrickName()) : null;
                        object = String.valueOf(ref$ObjectRef.element);
                        Intrinsics.checkNotNullParameter(object, (String)object9);
                        object2 = d92_0.b;
                        object3 = object9;
                        object9 = new z92_0((String)object8, (String)object7, (String)object6, (String)object5, (String)object4, (String)object, null);
                        Ae3.d((i90_0)object2, null, null, (Function2)object9, n7);
                        p43_02.notifyItemChanged(n8);
                    }
                } else {
                    n8 = (int)(((ProductOptionVariant)object2).isSelected() ? 1 : 0);
                    if (n8 != 0) {
                        ((ProductOptionVariant)object2).setSelected(false);
                        number = n3;
                        object = d92_0.a;
                        object = p43_02.a.x5();
                        object3 = object != null ? (object = ((Product)object).getId()) : null;
                        object = p43_02.a.x5();
                        object8 = object != null ? (object = ((Product)object).getName()) : null;
                        object = p43_02.a.x5();
                        object7 = object != null ? (object = ((Product)object).getBrandName()) : null;
                        object = p43_02.a.x5();
                        object6 = object != null ? (object = ((Product)object).getBrickCategory()) : null;
                        object = p43_02.a.x5();
                        object5 = object != null ? (object = ((Product)object).getBrickName()) : null;
                        object = String.valueOf(ref$ObjectRef.element);
                        Intrinsics.checkNotNullParameter(object, (String)object9);
                        object4 = object;
                        object2 = new b92_0((String)object3, (String)object8, (String)object7, (String)object6, (String)object5, (String)object, null);
                        object = d92_0.b;
                        Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
                    }
                }
                n3 = n4;
                continue;
            }
            xx_2.n();
            throw null;
        }
        if (number != null) {
            int n10 = number.intValue();
            p43_02.notifyItemChanged(n10);
        }
    }
}

