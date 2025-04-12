/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class K12
extends RecyclerView$f {
    public final q82_0 a;
    public ArrayList b;
    public final yi2_1 c;

    public K12(q82_0 q82_02, ArrayList arrayList, yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(q82_02, "mOnColorClickListener");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        this.a = q82_02;
        this.b = arrayList;
        this.c = yi2_12;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        block35: {
            int n4;
            Object[] objectArray;
            int n7;
            Object object;
            int n8;
            Object object2;
            int n10;
            Object object3;
            block34: {
                AjioTextView ajioTextView;
                int n14;
                block36: {
                    AjioTextView ajioTextView2;
                    AjioTextView ajioTextView3;
                    block37: {
                        void var11_38;
                        int n15;
                        float f5;
                        void var11_23;
                        Product product;
                        void var11_14;
                        int n16;
                        object3 = recyclerView$B;
                        n10 = n3;
                        n14 = 0;
                        object2 = null;
                        n8 = 1;
                        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
                        object = this.b;
                        if (object == null) break block35;
                        object = ((ArrayList)object).get(n3);
                        Object object4 = "get(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                        object = (ProductOptionVariant)object;
                        boolean bl2 = recyclerView$B instanceof pz1_0;
                        if (!bl2) break block35;
                        object3 = (pz1_0)recyclerView$B;
                        object3.getClass();
                        Intrinsics.checkNotNullParameter(object, "productOptionVariant");
                        Intrinsics.checkNotNullParameter(object, "<set-?>");
                        ((pz1_0)object3).j = object;
                        object4 = ((pz1_0)object3).b;
                        Product product2 = object4.x5();
                        if (product2 != null) {
                            String string2 = product2.getBrandName();
                        } else {
                            n16 = 0;
                            Object var11_13 = null;
                        }
                        Object object5 = ((pz1_0)object3).d;
                        int n17 = 8;
                        if (var11_14 != null && (n16 = var11_14.length()) != 0) {
                            if (object5 != null) {
                                void var11_18;
                                Product product3 = object4.x5();
                                if (product3 != null) {
                                    String string3 = product3.getBrandName();
                                } else {
                                    n16 = 0;
                                    Object var11_17 = null;
                                }
                                object5.setText((CharSequence)var11_18);
                            }
                        } else if (object5 != null) {
                            object5.setVisibility(n17);
                        }
                        if ((product = object4.x5()) != null) {
                            String string4 = product.getName();
                        } else {
                            n16 = 0;
                            Object var11_22 = null;
                        }
                        object5 = ((pz1_0)object3).e;
                        if (var11_23 != null && (n16 = var11_23.length()) != 0) {
                            void var11_31;
                            String string5;
                            String string6;
                            Product product4 = object4.x5();
                            if (product4 != null) {
                                String string7 = product4.getName();
                            } else {
                                n16 = 0;
                                Object var11_26 = null;
                            }
                            int n18 = object4.r5();
                            String string8 = " | ";
                            if (n18 != 0 && (string6 = object4.k3()) != null && (n18 = string6.length()) != 0) {
                                void var11_27;
                                String string9 = object4.k3();
                                String string10 = n1.a((String)var11_27, string8, string9);
                            }
                            if ((n18 = object4.m4()) != 0 && (string5 = object4.R5()) != null && (n18 = string5.length()) != 0) {
                                void var11_29;
                                object4 = object4.R5();
                                String string11 = n1.a((String)var11_29, string8, (String)object4);
                            }
                            object5.setText((CharSequence)var11_31);
                        } else if (object5 != null) {
                            object5.setVisibility(n17);
                        }
                        object4 = ((ProductOptionVariant)object).getPriceData();
                        ajioTextView = ((pz1_0)object3).f;
                        if (object4 == null) break block36;
                        ajioTextView.setVisibility(0);
                        object4 = qz2_0.r(((ProductOptionVariant)object).getPriceData());
                        ajioTextView.setText((CharSequence)object4);
                        object4 = StringCompanionObject.INSTANCE;
                        object4 = ajioTextView.getContext().getResources();
                        int n19 = R$string.acc_plp_final_price;
                        object4 = object4.getString(n19);
                        object5 = "getString(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                        String string12 = qz2_0.r(((ProductOptionVariant)object).getPriceData());
                        Object[] objectArray2 = new Object[n8];
                        objectArray2[0] = string12;
                        Object[] objectArray3 = Arrays.copyOf(objectArray2, n8);
                        object4 = String.format((String)object4, objectArray3);
                        String string13 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, string13);
                        ajioTextView.setContentDescription((CharSequence)object4);
                        object4 = ((ProductOptionVariant)object).getWasPriceData();
                        ajioTextView3 = ((pz1_0)object3).g;
                        ajioTextView2 = ((pz1_0)object3).h;
                        if (object4 == null) break block37;
                        String string14 = ((Price)object4).getValue();
                        float f6 = 0.0f;
                        SpannableString spannableString = null;
                        if (string14 != null) {
                            f5 = Float.parseFloat(string14);
                        } else {
                            n15 = 0;
                            f5 = 0.0f;
                            string14 = null;
                        }
                        Object object6 = ((ProductOptionVariant)object).getPriceData();
                        if (object6 != null && (object6 = ((Price)object6).getValue()) != null) {
                            f6 = Float.parseFloat((String)object6);
                        }
                        if ((n15 = Float.compare(f5, f6)) <= 0) break block37;
                        string14 = qz2_0.s(mz3_0.h(((Price)object4).getValue()));
                        spannableString = new SpannableString((CharSequence)string14);
                        object6 = new StrikethroughSpan();
                        n7 = string14.length();
                        spannableString.setSpan(object6, 0, n7, 33);
                        object4 = qz2_0.g(((ProductOptionVariant)object).getPriceData(), (Price)object4);
                        ajioTextView3.setVisibility(0);
                        ajioTextView2.setVisibility(0);
                        ajioTextView3.setText((CharSequence)spannableString);
                        objectArray = ajioTextView3.getContext().getResources();
                        n17 = R$string.acc_plp_original_price;
                        objectArray = objectArray.getString(n17);
                        Intrinsics.checkNotNullExpressionValue(objectArray, (String)object5);
                        Object[] objectArray4 = new Object[n8];
                        objectArray4[0] = string14;
                        objectArray4 = Arrays.copyOf(objectArray4, n8);
                        objectArray = String.format((String)objectArray, objectArray4);
                        Intrinsics.checkNotNullExpressionValue(objectArray, string13);
                        ajioTextView3.setContentDescription((CharSequence)objectArray);
                        Price price = ((ProductOptionVariant)object).getPriceData();
                        if (price != null) {
                            String string15 = price.getDiscountPercent();
                        } else {
                            n16 = 0;
                            Object var11_37 = null;
                        }
                        n16 = (int)(TextUtils.isEmpty((CharSequence)var11_38) ? 1 : 0);
                        if (n16 == 0) {
                            Resources resources = ajioTextView2.getContext().getResources();
                            n7 = R$string.acc_plp_discount_price;
                            String string16 = resources.getString(n7);
                            Intrinsics.checkNotNullExpressionValue(string16, (String)object5);
                            objectArray = new Object[n8];
                            objectArray[0] = object4;
                            object2 = Arrays.copyOf(objectArray, n8);
                            object2 = String.format(string16, (Object[])object2);
                            Intrinsics.checkNotNullExpressionValue(object2, string13);
                            ajioTextView2.setContentDescription((CharSequence)object2);
                            object2 = ((ProductOptionVariant)object).getPriceData();
                            if (object2 != null) {
                                object2 = ((Price)object2).getDiscountPercent();
                            } else {
                                n14 = 0;
                                object2 = null;
                            }
                            ajioTextView2.setText((CharSequence)object2);
                            break block34;
                        } else {
                            n4 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                            if (n4 == 0) {
                                object = ajioTextView2.getContext().getResources();
                                n16 = R$string.acc_plp_discount_price;
                                object = object.getString(n16);
                                Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                                Object[] objectArray5 = new Object[n8];
                                objectArray5[0] = object4;
                                object2 = Arrays.copyOf(objectArray5, n8);
                                object2 = String.format((String)object, (Object[])object2);
                                Intrinsics.checkNotNullExpressionValue(object2, string13);
                                ajioTextView2.setContentDescription((CharSequence)object2);
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append((String)object4);
                                object = "% OFF";
                                ((StringBuilder)object2).append((String)object);
                                object2 = ((StringBuilder)object2).toString();
                                ajioTextView2.setText((CharSequence)object2);
                                break block34;
                            } else {
                                n14 = 8;
                                ajioTextView2.setVisibility(n14);
                            }
                        }
                        break block34;
                    }
                    n14 = 8;
                    ajioTextView3.setVisibility(n14);
                    ajioTextView2.setVisibility(n14);
                    break block34;
                }
                n14 = 8;
                ajioTextView.setVisibility(n14);
            }
            object2 = new nz1_0((pz1_0)object3, n10);
            object = ((pz1_0)object3).i;
            object.setOnClickListener((View.OnClickListener)object2);
            object2 = ((pz1_0)object3).c;
            if (object2 != null) {
                object = new oz1_0((pz1_0)object3, n10);
                object2.setOnClickListener((View.OnClickListener)object);
            }
            if ((object3 = ((pz1_0)object3).x().getModelImage()) != null) {
                objectArray = ((ModelImage)object3).getUrl();
            } else {
                n7 = 0;
                objectArray = null;
            }
            if (object2 != null) {
                object3 = Qj0.b((String)objectArray, "?quality=medium");
                da$a da$a = new da$a();
                da$a.k = n8;
                da$a.a = n4 = R$drawable.component_placeholder;
                da$a.b = n4;
                da$a.n = object3;
                da$a.u = object2;
                da$a.i = n8;
                da$a.a();
            }
            if (object2 != null) {
                object2.setClickable(n8 != 0);
            }
            if (object2 != null) {
                object2.setLongClickable(n8 != 0);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.product_details_oos_other_colours;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        q82_0 q82_02 = this.a;
        yi2_1 yi2_12 = this.c;
        object = new pz1_0((View)viewGroup, q82_02, yi2_12);
        return object;
    }
}

