/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductSwatchImage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J12
 */
public final class j12_0
extends RecyclerView$f {
    public final q82_0 a;
    public ArrayList b;
    public final boolean c;

    public j12_0(q82_0 q82_02, ArrayList arrayList, boolean bl2) {
        Intrinsics.checkNotNullParameter(q82_02, "mOnColorClickListener");
        this.a = q82_02;
        this.b = arrayList;
        this.c = bl2;
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

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Intrinsics.checkNotNullParameter(object, "viewHolder");
        Object object2 = this.b;
        Intrinsics.checkNotNull(object2);
        Object object3 = ((ArrayList)object2).get(n3);
        object2 = "get(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ProductOptionVariant)object3;
        int n4 = object instanceof RY1;
        Object object4 = " color Product";
        boolean bl2 = true;
        int n7 = 10;
        CharSequence charSequence = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams";
        String string2 = "<set-?>";
        String string3 = "productOptionVariant";
        if (n4 != 0) {
            object = (RY1)object;
            object.getClass();
            Intrinsics.checkNotNullParameter(object3, string3);
            Intrinsics.checkNotNullParameter(object3, string2);
            ((RY1)object).d = object3;
            n4 = ((RecyclerView$B)object).getAdapterPosition();
            string2 = ((RY1)object).b;
            if (n4 != 0) {
                object2 = string2.getLayoutParams();
                Intrinsics.checkNotNull(object2, (String)charSequence);
                object2 = (RecyclerView$LayoutParams)((Object)object2);
                n7 = mz3_0.d(n7);
                object2.setMargins(n7, 0, 0, 0);
            } else {
                string2.setPadding(0, 0, 0, 0);
            }
            object2 = new da$a();
            ((da$a)object2).k = bl2;
            ((da$a)object2).a = n7 = R$drawable.component_placeholder;
            ((da$a)object2).b = n7;
            ((da$a)object2).g = bl2;
            ((da$a)object2).h = bl2;
            Object object5 = ((ProductOptionVariant)object3).getSwatchImage();
            if (object5 != null) {
                object5 = ((ProductSwatchImage)object5).getUrl();
            } else {
                bl2 = false;
                object5 = null;
            }
            ((da$a)object2).n = object5;
            object = ((RY1)object).c;
            ((da$a)object2).u = object;
            ((da$a)object2).a();
            n4 = (int)(((ProductOptionVariant)object3).isSelected() ? 1 : 0);
            if (n4 != 0) {
                object.setClickable(false);
                object.setLongClickable(false);
                object2 = ((ProductOptionVariant)object3).getColor();
                object5 = new StringBuilder();
                ((StringBuilder)object5).append((String)object2);
                ((StringBuilder)object5).append((String)object4);
                object2 = ((StringBuilder)object5).toString();
                object.setContentDescription((CharSequence)object2);
                int n8 = R$drawable.pdp_luxe_main_color_selected;
                string2.setBackgroundResource(n8);
                object = ((ProductOptionVariant)object3).getValue();
                if (object != null && (n8 = ((String)object).length()) != 0) {
                    object = ((ProductOptionVariant)object3).getValue();
                    string2.setTag(object);
                }
            } else {
                object3 = ((ProductOptionVariant)object3).getColor();
                object.setContentDescription((CharSequence)object3);
                int n10 = R$drawable.luxe_pdp_color_unselected;
                string2.setBackgroundResource(n10);
            }
        } else {
            n4 = object instanceof yi2_2;
            if (n4 != 0) {
                object = (yi2_2)object;
                object.getClass();
                Intrinsics.checkNotNullParameter(object3, string3);
                Intrinsics.checkNotNullParameter(object3, string2);
                ((yi2_2)object).d = object3;
                n4 = ((RecyclerView$B)object).getAdapterPosition();
                object4 = ((yi2_2)object).b;
                if (n4 != 0) {
                    object2 = object4.getLayoutParams();
                    Intrinsics.checkNotNull(object2, (String)charSequence);
                    object2 = (RecyclerView$LayoutParams)((Object)object2);
                    int n14 = mz3_0.d(n7);
                    object2.setMargins(n14, 0, 0, 0);
                } else {
                    ((CardView)((Object)object4)).setPadding(0, 0, 0, 0);
                }
                object2 = ((ProductOptionVariant)object3).getValue();
                object = ((yi2_2)object).c;
                object.setText((CharSequence)object2);
                n3 = (int)(((ProductOptionVariant)object3).isSelected() ? 1 : 0);
                if (n3 != 0) {
                    n3 = hv3_0.m(R$color.accent_color_10);
                    object.setBackgroundColor(n3);
                    n3 = hv3_0.m(R$color.luxe_color_FFFFFF);
                    object.setTextColor(n3);
                } else {
                    n3 = hv3_0.m(R$color.luxe_color_FFFFFF);
                    object.setBackgroundColor(n3);
                    n3 = hv3_0.m(R$color.accent_color_10);
                    object.setTextColor(n3);
                }
            } else {
                n4 = object instanceof bb3_0;
                if (n4 != 0) {
                    object = (bb3_0)object;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object3, string3);
                    Intrinsics.checkNotNullParameter(object3, string2);
                    ((bb3_0)object).e = object3;
                    object2 = new da$a();
                    ((da$a)object2).k = bl2;
                    ((da$a)object2).a = n7 = R$drawable.component_placeholder;
                    ((da$a)object2).b = n7;
                    ((da$a)object2).g = bl2;
                    ((da$a)object2).h = bl2;
                    Object object6 = ((ProductOptionVariant)object3).getThumbnail();
                    ((da$a)object2).n = object6;
                    object6 = ((bb3_0)object).c;
                    ((da$a)object2).u = object6;
                    ((da$a)object2).a();
                    object2 = ((ProductOptionVariant)object3).getColor();
                    AjioTextView ajioTextView = ((bb3_0)object).d;
                    ajioTextView.setText((CharSequence)object2);
                    n4 = (int)(((ProductOptionVariant)object3).isSelected() ? 1 : 0);
                    object = ((bb3_0)object).b;
                    if (n4 != 0) {
                        object6.setClickable(false);
                        object6.setLongClickable(false);
                        object2 = ((ProductOptionVariant)object3).getColor();
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append((String)object2);
                        ((StringBuilder)charSequence).append((String)object4);
                        object2 = ((StringBuilder)charSequence).toString();
                        object6.setContentDescription((CharSequence)object2);
                        n4 = R$drawable.square_color_selected;
                        object.setBackgroundResource(n4);
                        object2 = ((ProductOptionVariant)object3).getValue();
                        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                            object3 = ((ProductOptionVariant)object3).getValue();
                            object.setTag(object3);
                        }
                        object = ajioTextView.getContext();
                        object3 = "getContext(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        n3 = R$attr.tool_bar_title;
                        int n15 = tm3_0.a(n3, (Context)object);
                        ajioTextView.setTextColor(n15);
                    } else {
                        object3 = ((ProductOptionVariant)object3).getColor();
                        object6.setContentDescription((CharSequence)object3);
                        n3 = R$drawable.square_color_unselected;
                        object.setBackgroundResource(n3);
                        object = ajioTextView.getContext();
                        n3 = R$color.color_6d6d6d;
                        int n16 = t70.getColor((Context)object, n3);
                        ajioTextView.setTextColor(n16);
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(this.c ? 1 : 0);
        q82_0 q82_02 = this.a;
        if (n3 != 0) {
            object = h40_0.a;
            n3 = (int)(h40_0.s1() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                int n4 = R$layout.color_rectangle_item;
                viewGroup = object.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
                object = new bb3_0((View)viewGroup, q82_02);
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                int n7 = R$layout.new_row_pdp_color;
                viewGroup = object.inflate(n7, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
                object = new RY1((View)viewGroup, q82_02);
            }
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.row_pdp_s1;
            viewGroup = object.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object = new yi2_2((View)viewGroup, q82_02);
        }
        return object;
    }
}

