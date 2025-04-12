/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

public final class BW$a
implements View.OnClickListener {
    public final int a;
    public final /* synthetic */ bw_0 b;

    public BW$a(bw_0 bw_02, int n3) {
        this.b = bw_02;
        this.a = n3;
    }

    public final void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "v");
        Object object2 = object.getTag();
        if (object2 != null && (n3 = (object2 = object.getTag()) instanceof ProductOptionVariant) != 0) {
            int n4;
            boolean bl2;
            int n7;
            Object object3;
            object = object.getTag();
            object2 = "null cannot be cast to non-null type com.ril.ajio.services.data.Product.ProductOptionVariant";
            Intrinsics.checkNotNull(object, (String)object2);
            Object object4 = object;
            object4 = (ProductOptionVariant)object;
            String string2 = ((ProductOptionVariant)object4).getCode();
            object = ((ProductOptionVariant)object4).getValue();
            n3 = 1;
            if (object == null) {
                object = "";
                int n8 = ((String)object).length() - n3;
                object3 = null;
                n7 = 0;
                bl2 = false;
                while (n7 <= n8) {
                    n4 = !bl2 ? n7 : n8;
                    n4 = ((String)object).charAt(n4);
                    int n10 = 32;
                    n4 = Intrinsics.compare(n4, n10);
                    n4 = n4 <= 0 ? 1 : 0;
                    if (!bl2) {
                        if (n4 == 0) {
                            bl2 = true;
                            continue;
                        }
                        ++n7;
                        continue;
                    }
                    if (n4 == 0) break;
                    n8 += -1;
                }
                object = com.jio.jioads.adinterfaces.a.a(n8, n3, n7, (String)object);
            }
            object3 = object;
            object = this.b;
            c92 c922 = ((bw_0)object).b;
            if (c922 != null) {
                boolean bl3 = ((ProductOptionVariant)object4).isStockAvailable();
                bl2 = bl3 ^ true;
                n4 = 0;
                n7 = this.a;
                c922.q2(string2, (String)object3, n7, bl2, (ProductOptionVariant)object4, false);
            }
        }
    }
}

