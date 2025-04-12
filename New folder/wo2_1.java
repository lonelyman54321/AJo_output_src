/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from wO2
 */
public final class wo2_1
extends RecyclerView$f {
    public ArrayList a;
    public final T4 b;

    public wo2_1(ArrayList arrayList, s4_0 s4_02) {
        Intrinsics.checkNotNullParameter(arrayList, "addressList");
        Intrinsics.checkNotNullParameter(s4_02, "addressListListener");
        this.a = arrayList;
        this.b = s4_02;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    /*
     * WARNING - void declaration
     */
    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4 = 2;
        int n7 = 1;
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof wO2$a;
        if (bl2) {
            void var11_13;
            int n10;
            Serializable serializable;
            object2 = this.a.get(n3);
            Object object3 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            object2 = (CartDeliveryAddress)object2;
            boolean bl3 = ((CartDeliveryAddress)object2).isDefaultAddress();
            if (!bl3 && n3 > 0) {
                serializable = this.a;
                n10 = n3 + -1;
                serializable = (CartDeliveryAddress)((ArrayList)serializable).get(n10);
                boolean n8 = ((CartDeliveryAddress)serializable).isDefaultAddress();
            } else {
                boolean bl4 = false;
                serializable = null;
            }
            object = (wO2$a)object;
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "address");
            Object object4 = ((wO2$a)object).c;
            Object object5 = ((wO2$a)object).b;
            TextView textView = ((wO2$a)object).i;
            if (bl3) {
                object3 = "Default Address";
                object5.setText((CharSequence)object3);
                ai0_2.B((View)object5);
                ai0_2.B((View)object4);
                ai0_2.i((View)textView);
            } else if (var11_13 != false) {
                object3 = "All Address";
                object5.setText((CharSequence)object3);
                ai0_2.B((View)object5);
                ai0_2.i((View)object4);
                ai0_2.B((View)textView);
            } else {
                ai0_2.i((View)object5);
                ai0_2.i((View)object4);
                ai0_2.B((View)textView);
            }
            object3 = ((CartDeliveryAddress)object2).getAddressPOC();
            bl3 = TextUtils.isEmpty((CharSequence)object3);
            serializable = ((wO2$a)object).d;
            if (bl3) {
                object3 = mz3_0.N((CartDeliveryAddress)object2);
                ((wO2$a)object).j = object3;
                serializable.setText((CharSequence)object3);
            } else {
                object3 = ((CartDeliveryAddress)object2).getAddressPOC();
                if (object3 != null) {
                    object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
                } else {
                    bl3 = false;
                    object3 = null;
                }
                serializable.setText((CharSequence)object3);
                object3 = ((CartDeliveryAddress)object2).getAddressPOC();
                if (object3 == null || (object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString()) == null) {
                    object3 = "";
                }
                ((wO2$a)object).j = object3;
            }
            object3 = wO2$a.w((CartDeliveryAddress)object2, false);
            serializable = ((wO2$a)object).e;
            serializable.setText((CharSequence)object3);
            object3 = wO2$a.w((CartDeliveryAddress)object2, n7 != 0);
            serializable.setContentDescription((CharSequence)object3);
            object3 = ((CartDeliveryAddress)object2).getPhone();
            serializable = ((wO2$a)object).f;
            serializable.setText((CharSequence)object3);
            object3 = cp_1.Companion;
            object4 = ((CartDeliveryAddress)object2).getPhone();
            object3.getClass();
            object3 = cp$a.B((String)object4);
            serializable.setContentDescription((CharSequence)object3);
            object3 = n3;
            serializable = ((wO2$a)object).g;
            serializable.setTag(object3);
            object3 = ((wO2$a)object).k;
            serializable.setOnClickListener((View.OnClickListener)object3);
            object4 = n3;
            object5 = ((wO2$a)object).h;
            object5.setTag(object4);
            object5.setOnClickListener((View.OnClickListener)object3);
            n10 = R$string.edit_address_text;
            String string2 = ((wO2$a)object).j;
            Object[] objectArray = ((CartDeliveryAddress)object2).getPostalCode();
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = string2;
            objectArray2[n7] = objectArray;
            object4 = hv3_0.L(n10, objectArray2);
            object5.setContentDescription((CharSequence)object4);
            n10 = R$string.delete_address_text;
            object5 = ((wO2$a)object).j;
            string2 = ((CartDeliveryAddress)object2).getPostalCode();
            objectArray = new Object[n4];
            objectArray[0] = object5;
            objectArray[n7] = string2;
            object4 = hv3_0.L(n10, objectArray);
            serializable.setContentDescription((CharSequence)object4);
            int n8 = R$string.mark_default_address_text;
            object = ((wO2$a)object).j;
            object2 = ((CartDeliveryAddress)object2).getPostalCode();
            Object[] objectArray3 = new Object[n4];
            objectArray3[0] = object;
            objectArray3[n7] = object2;
            object = hv3_0.L(n8, objectArray3);
            textView.setContentDescription((CharSequence)object);
            object = n3;
            textView.setTag(object);
            textView.setOnClickListener((View.OnClickListener)object3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.c() ? 1 : 0);
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.luxe_layout_address_block;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.layout_address_block;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        object = new wO2$a(this, (View)viewGroup);
        return object;
    }
}

