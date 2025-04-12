/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

public final class F63$b$a
implements View.OnClickListener {
    public final /* synthetic */ F63$b a;

    public F63$b$a(F63$b b2) {
        this.a = b2;
    }

    public final void onClick(View object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "v");
        Object object2 = object.getTag();
        if (object2 != null && (bl2 = (object2 = object.getTag()) instanceof ProductOptionVariant)) {
            F63$d f63$d;
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.ProductOptionVariant");
            object = (ProductOptionVariant)object;
            object2 = ((ProductOptionVariant)object).getCode();
            String string2 = ((ProductOptionVariant)object).getValue();
            if (string2 == null) {
                string2 = "";
                int n3 = string2.length();
                int n4 = 1;
                n3 -= n4;
                int n7 = 0;
                boolean bl3 = false;
                while (n7 <= n3) {
                    int n8 = !bl3 ? n7 : n3;
                    n8 = string2.charAt(n8);
                    int n10 = 32;
                    n8 = Intrinsics.compare(n8, n10);
                    n8 = n8 <= 0 ? 1 : 0;
                    if (!bl3) {
                        if (n8 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n7;
                        continue;
                    }
                    if (n8 == 0) break;
                    n3 += -1;
                }
                string2 = ((Object)string2.subSequence(n7, n3 += n4)).toString();
            }
            if ((f63$d = this.a.b) != null && f63$d != null) {
                f63$d.p3((String)object2, string2, (ProductOptionVariant)object);
            }
        }
    }
}

