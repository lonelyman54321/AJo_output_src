/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GN2
 */
public final class gn2_1
extends RecyclerView$f {
    public kh2_0 a;
    public boolean b;
    public ArrayList c;

    public final int getItemCount() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2;
        object = (gn2$a_0)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        ArrayList arrayList = this.c;
        if (arrayList != null && (object2 = (CartEntry)arrayList.get(n3)) != null && (object2 = (CartEntry)arrayList.get(n3)) != null && (object2 = ((CartEntry)object2).getTotalPrice()) != null && (object2 = ((Price)object2).getValue()) != null) {
            Object object3;
            object2 = (CartEntry)arrayList.get(n3);
            int n4 = 0;
            float f5 = 0.0f;
            Comparable comparable = null;
            if (object2 != null) {
                float f6;
                boolean bl2;
                int n7 = ((CartEntry)object2).getReturnEditedQuantity();
                Object object4 = ((gn2$a_0)object).a;
                Object object5 = (CartEntry)arrayList.get(n3);
                String string2 = null;
                if (object5 != null && (object5 = ((CartEntry)object5).getProduct()) != null) {
                    object5 = ((Product)object5).getName();
                } else {
                    bl2 = false;
                    object5 = null;
                    f6 = 0.0f;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n7);
                String string3 = "x ";
                stringBuilder.append(string3);
                stringBuilder.append((String)object5);
                object5 = stringBuilder.toString();
                object4.setText((CharSequence)object5);
                object4 = (CartEntry)arrayList.get(n3);
                if (object4 != null && (object4 = ((CartEntry)object4).getTotalPrice()) != null) {
                    string2 = ((Price)object4).getValue();
                }
                Intrinsics.checkNotNull(string2);
                float f7 = Float.parseFloat(string2);
                object5 = (CartEntry)arrayList.get(n3);
                Intrinsics.checkNotNull(object5);
                object5 = ((CartEntry)object5).getOrderTotalQuantity();
                string2 = "getOrderTotalQuantity(...)";
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                f6 = ((Number)object5).floatValue();
                f7 /= f6;
                float f8 = n7;
                f7 = f7 * f8 + 0.0f;
                comparable = (CartEntry)arrayList.get(n3);
                if (comparable != null && (comparable = ((CartEntry)comparable).getOrderEntry()) != null && (comparable = ((CartEntry)comparable).getOrderTotalQuantity()) != null) {
                    n4 = ((Number)((Object)comparable)).intValue();
                    object5 = cp_1.Companion;
                    object5.getClass();
                    bl2 = cp$a.w();
                    if (bl2 && (object3 = (CartEntry)arrayList.get(n3)) != null && (object3 = ((CartEntry)object3).getConvenienceFee()) != null && (object3 = ((ConvenienceFeePriceSplitUp)object3).getTotal()) != null) {
                        float f11 = ((ConvenienceFeePriceSplitUp$AmountData)object3).getNetAmount();
                        boolean bl3 = this.b;
                        if (bl3) {
                            f7 += f11;
                        } else {
                            float f12 = n4;
                            f7 = f11 = f11 / f12 * f8 + f7;
                        }
                    }
                }
                f5 = f7;
                qz2_0.u(f7);
                object3 = this.a;
                object3.A0(f7);
            }
            object = ((gn2$a_0)object).b;
            object3 = qz2_0.u(f5);
            object.setText((CharSequence)object3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_return_refund_breakup;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new gn2$a_0((View)viewGroup);
        return object;
    }
}

