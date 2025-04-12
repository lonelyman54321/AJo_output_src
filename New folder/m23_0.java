/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from M23
 */
public final class m23_0
extends RecyclerView$f {
    public final List a;
    public final p23 b;
    public final boolean c;
    public boolean d;
    public final LinkedHashSet e;

    public m23_0(yo2_2 abstractCollection, p23 p232, boolean bl2) {
        Intrinsics.checkNotNullParameter(p232, "sharedWithMeAdapterListener");
        this.a = abstractCollection;
        this.b = p232;
        this.c = bl2;
        this.e = abstractCollection;
    }

    public final int g(int n3) {
        block4: {
            LinkedHashSet linkedHashSet;
            block3: {
                int n4;
                int n7;
                block2: {
                    linkedHashSet = this.e;
                    Integer n8 = n3;
                    n7 = linkedHashSet.contains(n8);
                    if (n7 == 0) break block2;
                    Integer n10 = n3;
                    linkedHashSet.remove(n10);
                    break block3;
                }
                n7 = linkedHashSet.size();
                if (n7 >= (n4 = 10)) break block4;
                Integer n14 = n3;
                linkedHashSet.add(n14);
            }
            this.notifyDataSetChanged();
            return linkedHashSet.size();
        }
        return -1;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        return n3;
    }

    public final ArrayList h() {
        int n3;
        Iterator iterator = ((TreeSet)ex_2.B(this.e)).iterator();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        while ((n3 = iterator.hasNext()) != 0) {
            Object object = iterator.next();
            String string2 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            n3 = ((Number)object).intValue();
            if ((object = this.i(n3).getFnlColorVariantData()) == null || (object = ((ProductFnlColorVariantData)object).getColorGroup()) == null) continue;
            arrayList.add(object);
        }
        return arrayList;
    }

    public final Product i(int n3) {
        Product product;
        int n4;
        List list = this.a;
        if (list != null && n3 == (n4 = list.size())) {
            n3 += -1;
        }
        if (list != null) {
            product = (Product)list.get(n3);
        } else {
            n3 = 0;
            product = null;
        }
        Intrinsics.checkNotNull(product);
        return product;
    }

    /*
     * Unable to fully structure code
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block18: {
            block20: {
                block19: {
                    block17: {
                        var3_3 = "holder";
                        Intrinsics.checkNotNullParameter(var1_1, (String)var3_3);
                        var4_4 = var1_1 instanceof K23;
                        if (!var4_4) break block18;
                        var1_1 = (K23)var1_1;
                        var3_3 = this.a;
                        Intrinsics.checkNotNull(var3_3);
                        var3_3 = (Product)var3_3.get(var2_2);
                        var5_5 = this.d;
                        var6_6 = this.e;
                        var7_7 = var2_2;
                        var8_8 = var6_6.contains(var7_7);
                        var1_1.getClass();
                        Intrinsics.checkNotNullParameter(var3_3, "originalProduct");
                        var1_1.l = var2_2;
                        var9_9 = var3_3.getFnlColorVariantData();
                        var7_7 = var3_3.getImages();
                        var10_10 = null;
                        if (var7_7 != null) {
                            var7_7 = var7_7.iterator();
                            do {
                                if ((var12_12 = (var11_11 = (ProductImage)var7_7.next()).getFormat()) == null || (var15_15 = (int)kotlin.text.b.i((String)(var12_12 = var11_11.getFormat()), var13_13 = "mobileProductListingImage", var14_14 = true)) == 0) continue;
                                var7_7 = var11_11.getUrl();
                                break block17;
                            } while (var16_16 = var7_7.hasNext());
                        }
                        var7_7 = null;
                    }
                    if (var7_7 == null) {
                        var7_7 = var9_9 != null ? var9_9.getOutfitPictureURL() : null;
                    }
                    var11_11 = new da$a();
                    var11_11.a = var15_15 = R$drawable.component_placeholder;
                    var11_11.b = var15_15;
                    var12_12 = UrlHelper.Companion.getInstance();
                    var11_11.n = var7_7 = var12_12.getImageUrl((String)var7_7);
                    var7_7 = var1_1.b;
                    var11_11.u = var7_7;
                    var11_11.a();
                    if (var9_9 != null) {
                        var9_9 = var9_9.getBrandName();
                    } else {
                        var2_2 = 0;
                        var9_9 = null;
                        var17_17 = 0.0f;
                    }
                    var1_1.c.setText((CharSequence)var9_9);
                    var9_9 = var1_1.d;
                    var7_7 = var3_3.getName();
                    var9_9.setText((CharSequence)var7_7);
                    var9_9 = var3_3.getPrice();
                    var7_7 = var1_1.f;
                    var11_11 = var1_1.e;
                    var15_15 = 0;
                    var12_12 = null;
                    var18_18 = 8;
                    if (var9_9 == null) break block19;
                    var9_9 = var3_3.getPrice();
                    var11_11.setVisibility(0);
                    if (var9_9 != null) {
                        var10_10 = var9_9.getFormattedValue();
                    }
                    var10_10 = qz2_0.n(var10_10);
                    var11_11.setText((CharSequence)var10_10);
                    var10_10 = var3_3.getWasPriceData();
                    var16_16 = false;
                    var19_19 = 0.0f;
                    var11_11 = null;
                    if (var9_9 != null && (var9_9 = var9_9.getValue()) != null) {
                        var17_17 = Float.parseFloat((String)var9_9);
                    } else {
                        var2_2 = 0;
                        var17_17 = 0.0f;
                        var9_9 = null;
                    }
                    if (var10_10 == null) ** GOTO lbl-1000
                    if ((var10_10 = var10_10.getValue()) != null) {
                        var19_19 = Float.parseFloat((String)var10_10);
                    }
                    if ((var2_2 = Float.compare(var19_19, var17_17)) > 0) {
                        qz2_0.d((Product)var3_3, (TextView)var7_7);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var7_7.setVisibility(var18_18);
                    }
                    break block20;
                }
                var11_11.setVisibility(var18_18);
                var7_7.setVisibility(var18_18);
            }
            var2_2 = 4;
            var17_17 = 5.6E-45f;
            var3_3 = var1_1.g;
            var7_7 = var1_1.k;
            var10_10 = var1_1.j;
            var11_11 = var1_1.i;
            var1_1 = var1_1.h;
            if (var5_5) {
                ai0_2.i((View)var3_3);
                ai0_2.i((View)var1_1);
                if (var8_8) {
                    var11_11.setVisibility(var18_18);
                    var10_10.setVisibility(0);
                    var7_7.setVisibility(0);
                } else {
                    var11_11.setVisibility(0);
                    var10_10.setVisibility(var2_2);
                    var7_7.setVisibility(var18_18);
                }
            } else {
                var11_11.setVisibility(var18_18);
                var10_10.setVisibility(var2_2);
                var7_7.setVisibility(var18_18);
                ai0_2.B((View)var3_3);
                var2_2 = (int)this.c;
                if (var2_2 != 0) {
                    ai0_2.B((View)var1_1);
                } else {
                    ai0_2.i((View)var1_1);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_shared_with_me_product_list_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.b;
        K23 k23 = new K23((View)viewGroup, (p23)object);
        return k23;
    }
}

