/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.freebies.FreebieProductDetail;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from mX0
 */
public final class mx0_1
extends jg2_0 {
    public final View b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;

    public mx0_1(View view) {
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "viewLocal");
        super(view);
        this.b = view;
        int n3 = R$id.productName;
        this.c = textView = (TextView)view.findViewById(n3);
        n3 = R$id.quantityLabel;
        this.d = textView = (TextView)view.findViewById(n3);
        n3 = R$id.productImage;
        textView = (ImageView)view.findViewById(n3);
        this.e = textView;
        n3 = R$id.freeTagText;
        this.f = textView = (TextView)view.findViewById(n3);
        n3 = R$id.returnLabel;
        view = (TextView)view.findViewById(n3);
        this.g = view;
    }

    public final void w(int n3, Object object) {
        StringBuilder stringBuilder = null;
        int n4 = 1;
        int n7 = object instanceof FreebieProductDetail;
        if (n7 != 0) {
            boolean bl2;
            Object object2;
            long l2;
            Object[] objectArray;
            Object object3;
            Object object4;
            Object object5 = " - ";
            Object object6 = this.c;
            if (object6 != null) {
                object4 = object;
                object4 = (FreebieProductDetail)object;
                object3 = ((FreebieProductDetail)object4).getBrandName();
                object4 = ((FreebieProductDetail)object4).getName();
                objectArray = new StringBuilder();
                objectArray.append((String)object3);
                objectArray.append((String)object5);
                objectArray.append((String)object4);
                object4 = objectArray.toString();
                object6.setText((CharSequence)object4);
            }
            if (object6 != null) {
                object4 = object;
                object4 = (FreebieProductDetail)object;
                object3 = ((FreebieProductDetail)object4).getBrandName();
                object4 = ((FreebieProductDetail)object4).getName();
                objectArray = new StringBuilder();
                objectArray.append((String)object3);
                objectArray.append((String)object5);
                objectArray.append((String)object4);
                object5 = objectArray.toString();
                object6.setContentDescription((CharSequence)object5);
            }
            n7 = (n7 = og1_1.c()) != 0 ? R$drawable.freebie_product_placeholder_luxe : R$drawable.freebie_product_placeholder;
            object6 = this.e;
            if (object6 != null) {
                object4 = new da$a();
                ((da$a)object4).a = n7;
                ((da$a)object4).b = n7;
                object5 = object;
                ((da$a)object4).n = object5 = ((FreebieProductDetail)object).getImageUrl();
                ((da$a)object4).u = object6;
                ((da$a)object4).a();
            }
            n7 = R$string.cart_gwp_qty;
            object5 = hv3_0.K(n7);
            object6 = "format(...)";
            object4 = this.d;
            if (object4 != null) {
                object3 = StringCompanionObject.INSTANCE;
                object3 = object;
                l2 = ((FreebieProductDetail)object).getQuantity();
                object3 = l2;
                objectArray = new Object[n4];
                objectArray[0] = object3;
                zn0_1.b(objectArray, n4, (String)object5, (String)object6, (TextView)object4);
            }
            if (object4 != null) {
                object3 = StringCompanionObject.INSTANCE;
                object3 = object;
                l2 = ((FreebieProductDetail)object).getQuantity();
                object3 = l2;
                objectArray = new Object[n4];
                objectArray[0] = object3;
                object2 = xh2_0.a(objectArray, n4, (String)object5, (String)object6);
                object5 = new StringBuilder();
                ((StringBuilder)object5).append((String)object2);
                ((StringBuilder)object5).append(n3);
                object2 = ((StringBuilder)object5).toString();
                object4.setContentDescription((CharSequence)object2);
            }
            n4 = og1_1.c();
            object5 = this.f;
            if (n4 != 0 && object5 != null && (object2 = object5.getParent()) != null && (bl2 = object2 instanceof ConstraintLayout)) {
                object2 = (ConstraintLayout)((Object)object2);
                object6 = object2.getContext();
                int n8 = R$color.luxe_color_121212;
                object6 = t70.getDrawable((Context)object6, n8);
                object2.setBackground((Drawable)object6);
            }
            if (object5 != null) {
                object2 = h40_0.a;
                object2 = h40_0.D(false).getFreeTextOnProduct();
                object5.setText((CharSequence)object2);
            }
            object = (FreebieProductDetail)object;
            boolean bl3 = ((FreebieProductDetail)object).isReturnable();
            object2 = this.g;
            if (bl3) {
                if (object2 != null) {
                    object = h40_0.a;
                    object = h40_0.D(false).getReturnText();
                    object2.setText((CharSequence)object);
                }
                if (object2 != null) {
                    object = h40_0.a;
                    object = h40_0.D(false).getReturnText();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object);
                    stringBuilder.append(n3);
                    String string2 = stringBuilder.toString();
                    object2.setContentDescription((CharSequence)string2);
                }
                if (object2 != null) {
                    ai0_2.B((View)object2);
                }
            } else if (object2 != null) {
                ai0_2.i((View)object2);
            }
        }
    }
}

