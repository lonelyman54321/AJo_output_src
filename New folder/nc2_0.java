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
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.NetPrice;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NC2
 */
public final class nc2_0
extends RecyclerView$f {
    public final sc2_0 a;
    public final List b;

    public nc2_0(sc2_0 sc2_02, List list) {
        Intrinsics.checkNotNullParameter(sc2_02, "itemClickListener");
        this.a = sc2_02;
        this.b = list;
    }

    public final int getItemCount() {
        int n3;
        List list = this.b;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (QC2)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.b;
        if (object != null) {
            float f5;
            int n4;
            boolean bl2;
            Object object2;
            Product product = (Product)object.get(n3);
            recyclerView$B.getClass();
            if (product == null || (object = product.getSourceStoreId()) == null) {
                object = ld3_2.STORE_AJIO.getStoreId();
            }
            String string2 = null;
            if (product != null) {
                object2 = product.getImages();
            } else {
                bl2 = false;
                object2 = null;
            }
            String string3 = product != null ? product.getBaseProduct() : null;
            Object object3 = ((QC2)recyclerView$B).k;
            Object object4 = new RC2((List)object2, string3, (sc2_0)object3, (String)object);
            object2 = ((QC2)recyclerView$B).b;
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object4);
            if (product != null) {
                object4 = product.getBrandName();
            } else {
                n4 = 0;
                object4 = null;
                f5 = 0.0f;
            }
            n4 = TextUtils.isEmpty((CharSequence)object4);
            if (n4 == 0) {
                if (product != null) {
                    object4 = product.getBrandName();
                } else {
                    n4 = 0;
                    object4 = null;
                    f5 = 0.0f;
                }
                object2 = ((QC2)recyclerView$B).j;
                object2.setText((CharSequence)object4);
            }
            if (product != null) {
                object4 = product.getName();
            } else {
                n4 = 0;
                object4 = null;
                f5 = 0.0f;
            }
            n4 = TextUtils.isEmpty((CharSequence)object4);
            if (n4 == 0) {
                if (product != null) {
                    object4 = product.getName();
                } else {
                    n4 = 0;
                    object4 = null;
                    f5 = 0.0f;
                }
                object2 = ((QC2)recyclerView$B).c;
                object2.setText((CharSequence)object4);
            }
            if (product != null && (object4 = product.getNetPrice()) != null && (object4 = ((NetPrice)object4).getValue()) != null) {
                f5 = ((Number)object4).floatValue();
                object4 = qz2_0.m(Float.valueOf(f5));
            } else {
                if (product != null && (object4 = product.getPrice()) != null) {
                    object4 = ((Price)object4).getValue();
                } else {
                    n4 = 0;
                    object4 = null;
                    f5 = 0.0f;
                }
                object4 = qz2_0.n((String)object4);
            }
            bl2 = TextUtils.isEmpty((CharSequence)object4);
            string3 = null;
            int n7 = 8;
            Object object5 = ((QC2)recyclerView$B).d;
            if (bl2) {
                object5.setVisibility(n7);
            } else {
                object5.setVisibility(0);
            }
            object5.setText((CharSequence)object4);
            if (product != null) {
                object4 = product.getQuantity();
            } else {
                n4 = 0;
                object4 = null;
                f5 = 0.0f;
            }
            object4 = object4 != null ? String.valueOf(product.getQuantity()) : "0";
            object2 = ((QC2)recyclerView$B).h;
            object2.setText((CharSequence)object4);
            if (product != null) {
                n4 = hv3_0.Y();
                object2 = ((QC2)recyclerView$B).e;
                if (n4 != 0) {
                    object4 = product.getSelectedSizeVariant();
                    if (object4 != null) {
                        object5 = Y63.c((ProductOptionVariant)object4);
                        object2.setText((CharSequence)object5);
                        object2 = Y63.j((ProductOptionVariant)object4);
                        object5 = Boolean.TRUE;
                        bl2 = Intrinsics.areEqual(object2, object5);
                        object5 = ((QC2)recyclerView$B).f;
                        if (bl2) {
                            object4 = Y63.b((ProductOptionVariant)object4);
                            String string4 = "Brand size ";
                            object2 = new StringBuilder(string4);
                            ((StringBuilder)object2).append((String)object4);
                            object4 = ((StringBuilder)object2).toString();
                            object5.setText((CharSequence)object4);
                            object5.setVisibility(0);
                        } else {
                            object5.setVisibility(n7);
                        }
                    }
                } else {
                    object4 = product.getSelectedSize();
                    object2.setText((CharSequence)object4);
                }
                n4 = (int)(product.getShouldShowSize() ? 1 : 0);
                object2 = ((QC2)recyclerView$B).g;
                if (n4 == 0) {
                    object2.setVisibility(n7);
                } else {
                    object2.setVisibility(0);
                }
            }
            n4 = R$string.view_details;
            object4 = hv3_0.K(n4);
            if (product != null) {
                object2 = product.getBrandName();
            } else {
                bl2 = false;
                object2 = null;
            }
            if (product != null) {
                string2 = product.getName();
            }
            string3 = " for ";
            object3 = " ";
            object4 = KW.a((String)object4, string3, (String)object2, (String)object3, string2);
            string2 = ((QC2)recyclerView$B).i;
            string2.setContentDescription((CharSequence)object4);
            object4 = new PC2((QC2)recyclerView$B, product, (String)object);
            string2.setOnClickListener((View.OnClickListener)object4);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.b() ? 1 : 0);
        sc2_0 sc2_02 = null;
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.quickview_list_item_luxe;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.quickview_list_item_refresh;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
        }
        sc2_02 = this.a;
        object = new QC2((View)viewGroup, sc2_02);
        return object;
    }
}

