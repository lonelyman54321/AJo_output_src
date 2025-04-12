/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$array;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.LuxePdpLinks;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.flashsale.pdp.RilfnlBreadCrumb;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.helper.UrlHelper;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q32
 */
public final class q32_0
extends RecyclerView$f
implements M82 {
    public final s82_0 a;
    public final List b;
    public final List c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public Product g;
    public J43 h;
    public boolean i;

    public q32_0(s82_0 s82_02, List list, List list2, boolean bl2, boolean bl3) {
        String string2 = "Similar Products";
        Intrinsics.checkNotNullParameter(string2, "listType");
        this.a = s82_02;
        this.b = list;
        this.c = list2;
        this.d = string2;
        this.e = bl2;
        this.f = bl3;
    }

    public final void C(Product product, String string2) {
        s82_0 s82_02 = this.a;
        if (s82_02 != null) {
            boolean bl2 = this.f;
            s82_02.Y0(product, string2, bl2);
        }
    }

    public final void R4(Product product, String string2) {
        s82_0 s82_02 = this.a;
        if (s82_02 != null) {
            boolean bl2 = this.f;
            s82_02.x4(product, string2, bl2);
        }
    }

    public final void S6(String object, int n3, Product product, String string2, SaleGAData saleGAData, String string3) {
        object = this.a;
        if (object != null) {
            string2 = this.d;
            object.F(product, n3, string2);
        }
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
        Object object = this.g;
        if (object != null && (object = this.h) != null) {
            ++n3;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4;
        Object object = this.g;
        if (object != null && (object = this.h) != null && n3 == (n4 = this.getItemCount() + -1)) {
            return 18;
        }
        if ((n3 %= 2) == 0) {
            return 6;
        }
        return 7;
    }

    public final void h9(Product product, String string2) {
    }

    public final void n0() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block49: {
            block52: {
                block51: {
                    block50: {
                        block48: {
                            var3_3 = this;
                            var4_4 = var1_1;
                            var5_5 = var2_2;
                            var6_6 = "viewHolder";
                            Intrinsics.checkNotNullParameter(var1_1, (String)var6_6);
                            var7_7 = var1_1 instanceof sx3_0;
                            var8_8 = false;
                            var9_9 = null;
                            var10_10 = 1;
                            if (var7_7 != 0) {
                                var4_4 = (sx3_0)var1_1;
                                var4_4.getClass();
                                var11_11 = new ArrayList<Object>();
                                var12_13 = var4_4.c;
                                var13_15 = var12_13.getContext();
                                var6_6 = new LinearLayoutManager((Context)var13_15, var10_10, false);
                                var12_13.setLayoutManager((RecyclerView$o)var6_6);
                                var6_6 = var4_4.a;
                                if (var6_6 != null) {
                                    var9_9 = var12_13.getContext().getResources();
                                    var10_10 = R$array.validColorList;
                                    var9_9 = var9_9.getStringArray(var10_10);
                                    Intrinsics.checkNotNullExpressionValue(var9_9, "getStringArray(...)");
                                    var9_9 = tp_2.M((Object[])var9_9);
                                    var14_18 = UrlHelper.Companion.getInstance().getBaseUrl();
                                    var13_15 = var6_6.getRilfnlBreadCrumbList();
                                    var15_21 = 2;
                                    if (var13_15 != null && (var13_15 = var13_15.getRilfnlBreadCrumb()) != null && (var13_15 = (RilfnlBreadCrumb)var13_15.get(var15_21)) != null) {
                                        var13_15 = var13_15.getCategoryCode();
                                    } else {
                                        var16_22 = false;
                                        var17_25 = 0.0f;
                                        var13_15 = null;
                                    }
                                    var18_28 = "/c/";
                                    var14_18 = n1.a(var14_18, (String)var18_28, (String)var13_15);
                                    var13_15 = var6_6.getRilfnlBreadCrumbList();
                                    if (var13_15 != null && (var13_15 = var13_15.getRilfnlBreadCrumb()) != null && (var13_15 = (RilfnlBreadCrumb)var13_15.get(var15_21)) != null) {
                                        var13_15 = var13_15.getName();
                                    } else {
                                        var16_22 = false;
                                        var17_25 = 0.0f;
                                        var13_15 = null;
                                    }
                                    var18_28 = var6_6.getFnlColorVariantData();
                                    if (var18_28 != null) {
                                        var18_28 = var18_28.getBrandName();
                                    } else {
                                        var19_29 = false;
                                        var18_28 = null;
                                    }
                                    var19_29 = TextUtils.isEmpty((CharSequence)var18_28);
                                    var20_30 = "?query=";
                                    var21_31 = "UTF-8";
                                    var22_32 = var4_4.d;
                                    if (!var19_29) {
                                        var18_28 = var6_6.getBrandName();
                                        var18_28 = y02.a(var22_32, (String)var13_15, " by ", (String)var18_28);
                                        var23_33 = var6_6.getFnlColorVariantData();
                                        var23_33 = var23_33 != null ? var23_33.getBrandName() : null;
                                        var24_34 /* !! */  = new StringBuilder(":relevance:brand:");
                                        var24_34 /* !! */ .append((String)var23_33);
                                        var25_35 = URLEncoder.encode(var24_34 /* !! */ .toString(), var21_31);
                                        var25_35 = n1.a(var14_18, var20_30, (String)var25_35);
                                        var23_33 = new LuxePdpLinks((String)var18_28, (String)var25_35);
                                        var11_11.add(var23_33);
                                    }
                                    if ((var25_35 = var6_6.getFnlColorVariantData()) != null) {
                                        var25_35 = var25_35.getColor();
                                    } else {
                                        var26_37 = false;
                                        var25_35 = null;
                                    }
                                    var26_37 = TextUtils.isEmpty((CharSequence)var25_35);
                                    var18_28 = " ";
                                    if (!var26_37) {
                                        var25_35 = var6_6.getFnlColorVariantData();
                                        if (var25_35 != null && (var25_35 = var25_35.getColor()) != null) {
                                            var23_33 = Locale.ROOT;
                                            var25_35 = var25_35.toLowerCase((Locale)var23_33);
                                            var23_33 = "toLowerCase(...)";
                                            Intrinsics.checkNotNullExpressionValue(var25_35, (String)var23_33);
                                        } else {
                                            var26_37 = false;
                                            var25_35 = null;
                                        }
                                        var8_8 = var9_9.contains(var25_35);
                                        if (var8_8) {
                                            var9_9 = var6_6.getFnlColorVariantData();
                                            if (var9_9 != null) {
                                                var9_9 = var9_9.getColor();
                                            } else {
                                                var8_8 = false;
                                                var9_9 = null;
                                            }
                                            var9_9 = y02.a(var22_32, (String)var9_9, (String)var18_28, (String)var13_15);
                                            var25_35 = var6_6.getFnlColorVariantData();
                                            if (var25_35 != null) {
                                                var25_35 = var25_35.getColor();
                                            } else {
                                                var26_37 = false;
                                                var25_35 = null;
                                            }
                                            var24_34 /* !! */  = ":relevance:verticalcolorfamily:";
                                            var23_33 = new StringBuilder((String)var24_34 /* !! */ );
                                            var23_33.append((String)var25_35);
                                            var25_35 = URLEncoder.encode(var23_33.toString(), var21_31);
                                            var25_35 = n1.a(var14_18, var20_30, (String)var25_35);
                                            var23_33 = new LuxePdpLinks((String)var9_9, (String)var25_35);
                                            var11_11.add(var23_33);
                                        }
                                    }
                                    if (!(var8_8 = TextUtils.isEmpty((CharSequence)(var9_9 = var6_6.getStyleType())))) {
                                        var9_9 = var6_6.getStyleType();
                                        var9_9 = y02.a(var22_32, (String)var9_9, (String)var18_28, (String)var13_15);
                                        var25_35 = var6_6.getStyleType();
                                        var22_32 = ":relevance:brickstyletype:";
                                        var18_28 = new StringBuilder(var22_32);
                                        var18_28.append((String)var25_35);
                                        var25_35 = URLEncoder.encode(var18_28.toString(), var21_31);
                                        var25_35 = n1.a(var14_18, var20_30, (String)var25_35);
                                        var18_28 = new LuxePdpLinks((String)var9_9, (String)var25_35);
                                        var11_11.add(var18_28);
                                    }
                                    if ((var9_9 = var6_6.getRilfnlBreadCrumbList()) != null) {
                                        var9_9 = var6_6.getRilfnlBreadCrumbList();
                                        Intrinsics.checkNotNull(var9_9);
                                        var9_9 = var9_9.getRilfnlBreadCrumb();
                                        if (var9_9 != null) {
                                            var6_6 = var6_6.getRilfnlBreadCrumbList();
                                            Intrinsics.checkNotNull(var6_6);
                                            var6_6 = var6_6.getRilfnlBreadCrumb();
                                            Intrinsics.checkNotNull(var6_6);
                                            var7_7 = var6_6.size();
                                            if (var7_7 >= var15_21) {
                                                var6_6 = kp1_0.c("All ", (String)var13_15);
                                                var9_9 = new LuxePdpLinks((String)var6_6, var14_18);
                                                var11_11.add(var9_9);
                                            }
                                        }
                                    }
                                    var4_4 = var4_4.b;
                                    var6_6 = new s43_0(var11_11, (J43)var4_4);
                                    var12_13.setAdapter((RecyclerView$f)var6_6);
                                }
                                return;
                            }
                            var6_6 = this.b;
                            if (var6_6 != null) {
                                var6_6 = (Product)var6_6.get(var2_2);
                            } else {
                                var7_7 = 0;
                                var6_6 = null;
                            }
                            var25_36 = var3_3.c;
                            if (var25_36 != null) {
                                var25_36 = (PlpProductUIModel)CollectionsKt.N(var5_5, (List)var25_36);
                            } else {
                                var26_38 = 0;
                                var25_36 = null;
                            }
                            var27_39 = var4_4 instanceof kG1;
                            if (var27_39 == 0) break block48;
                            var4_4 = (kG1)var4_4;
                            var4_4.y((Product)var6_6);
                            break block49;
                        }
                        var27_39 = var4_4 instanceof vv2_1;
                        if (var27_39 == 0) break block50;
                        var4_4 = (vv2_1)var4_4;
                        var14_19 = ScreenType.SCREEN_PDP;
                        var27_39 = 48;
                        var16_23 = false;
                        var17_26 = 0.0f;
                        var13_16 = null;
                        var5_5 = var2_2;
                        var9_9 = var25_36;
                        var26_38 = 0;
                        var25_36 = null;
                        vv2_1.D((vv2_1)var4_4, var2_2, (Product)var6_6, (PlpProductUIModel)var9_9, var14_19, null, var27_39);
                        break block49;
                    }
                    var5_5 = var4_4 instanceof p32;
                    if (var5_5 == 0 || var6_6 == null) break block49;
                    var4_4 = (p32)var4_4;
                    var5_5 = this.getItemCount();
                    var4_4.getClass();
                    Intrinsics.checkNotNullParameter(var6_6, "product");
                    var25_36 = "<set-?>";
                    Intrinsics.checkNotNullParameter(var6_6, (String)var25_36);
                    var4_4.j = var6_6;
                    var4_4.k = var5_5;
                    var11_12 = var6_6.getFnlColorVariantData();
                    if (var11_12 == null) break block49;
                    var5_5 = var4_4.getAdapterPosition();
                    var25_36 = var4_4.c;
                    if (var5_5 != 0) {
                        var28_40 = 8.4E-45f;
                        var5_5 = mz3_0.d(6);
                        var25_36.setPadding(var5_5, 0, 0, 0);
                    } else {
                        var28_40 = 2.2E-44f;
                        var5_5 = mz3_0.d(16);
                        var25_36.setPadding(var5_5, 0, 0, 0);
                    }
                    var11_12 = var6_6.getFnlColorVariantData();
                    if (var11_12 != null) {
                        var11_12 = var11_12.getColorGroup();
                    } else {
                        var5_5 = 0;
                        var28_40 = 0.0f;
                        var11_12 = null;
                    }
                    var4_4.i = var11_12;
                    var11_12 = var6_6.getFnlColorVariantData();
                    if (var11_12 != null) {
                        var11_12 = var11_12.getBrandName();
                    } else {
                        var5_5 = 0;
                        var28_40 = 0.0f;
                        var11_12 = null;
                    }
                    var25_36 = var4_4.d;
                    var25_36.setText((CharSequence)var11_12);
                    var11_12 = var6_6.getPrice();
                    var26_38 = 8;
                    var12_14 = var4_4.e;
                    if (var11_12 == null) break block51;
                    var12_14.setVisibility(0);
                    var11_12 = var6_6.getPrice();
                    if (var11_12 != null) {
                        var11_12 = var11_12.getFormattedValue();
                    } else {
                        var5_5 = 0;
                        var28_40 = 0.0f;
                        var11_12 = null;
                    }
                    var11_12 = qz2_0.n((String)var11_12);
                    var12_14.setText(var11_12);
                    var11_12 = var6_6.getWasPriceData();
                    var12_14 = var4_4.g;
                    if (var11_12 == null) ** GOTO lbl-1000
                    var11_12 = var11_12.getValue();
                    var16_24 = 0;
                    var17_27 = 0.0f;
                    var13_17 /* !! */  = null;
                    if (var11_12 != null) {
                        var28_40 = Float.parseFloat((String)var11_12);
                    } else {
                        var5_5 = 0;
                        var28_40 = 0.0f;
                        var11_12 = null;
                    }
                    var29_41 = var6_6.getPrice();
                    if (var29_41 != null && (var29_41 = var29_41.getValue()) != null) {
                        var17_27 = Float.parseFloat((String)var29_41);
                    }
                    if ((var5_5 = Float.compare(var28_40, var17_27)) > 0) {
                        qz2_0.b((Product)var6_6, (TextView)var12_14);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var12_14.setVisibility(var26_38);
                    }
                    break block52;
                }
                var12_14.setVisibility(var26_38);
            }
            var11_12 = var6_6.getImages();
            if (var11_12 != null) {
                block47: {
                    var11_12 = var6_6.getImages();
                    Intrinsics.checkNotNull(var11_12);
                    var11_12 = var11_12.iterator();
                    while ((var27_39 = (int)var11_12.hasNext()) != 0) {
                        var29_41 = "mobileProductListingImage";
                        var12_14 = (ProductImage)var11_12.next();
                        var13_17 /* !! */  = var12_14.getFormat();
                        var16_24 = (int)var29_41.equalsIgnoreCase(var13_17 /* !! */ );
                        if (var16_24 == 0) continue;
                        var11_12 = var12_14.getUrl();
                        break block47;
                    }
                    var5_5 = 0;
                    var28_40 = 0.0f;
                    var11_12 = null;
                }
                if (var11_12 == null) {
                    var11_12 = var6_6.getImages();
                    var30_42 = var11_12 != null && (var11_12 = (ProductImage)var11_12.get(0)) != null ? (var11_12 = var11_12.getUrl()) : null;
                    var11_12 = var30_42;
                }
            } else {
                var5_5 = 0;
                var28_40 = 0.0f;
                var11_12 = null;
            }
            if ((var27_39 = (int)TextUtils.isEmpty(var11_12)) == 0) {
                var12_14 = new da$a();
                var12_14.k = var10_10;
                var12_14.a = var16_24 = R$drawable.component_placeholder;
                var12_14.b = var16_24;
                var12_14.t = var10_10;
                var12_14.h = var10_10;
                var11_12 = UrlHelper.Companion.getInstance().getImageUrl((String)var11_12);
                var13_17 /* !! */  = var4_4.f;
                Intrinsics.checkNotNull(var13_17 /* !! */ );
                var12_14.n = var11_12;
                var12_14.u = var13_17 /* !! */ ;
                var12_14.a();
            }
            var11_12 = var6_6.getFnlColorVariantData();
            var4_4 = var4_4.h;
            if (var11_12 != null && (var5_5 = (int)var11_12.isAllPromotions()) == var10_10) {
                var4_4.setVisibility(0);
                var11_12 = new da$a();
                var11_12.k = var10_10;
                var11_12.r = var10_10;
                var7_7 = R$string.acc_banner;
                var6_6 = hv3_0.K(var7_7);
                var11_12.b((String)var6_6);
                var6_6 = UrlHelper.Companion.getInstance();
                var9_9 = new Object[]{};
                var14_20 = "misc";
                var25_36 = "plp_offer_imv";
                var11_12.n = var6_6 = var6_6.getApiUrl(var14_20, (String)var25_36, (Object[])var9_9);
                var11_12.u = var4_4;
                var11_12.a();
            } else {
                var4_4.setVisibility(var26_38);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        int n4;
        Object object2;
        boolean bl2;
        Object object3;
        int n7;
        Object object4;
        block12: {
            Object object5;
            block11: {
                block10: {
                    Intrinsics.checkNotNullParameter(object, "parent");
                    object4 = z40_0.Companion;
                    object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
                    n7 = ((ao0_0)object4).g("pdpSimilarProductListType");
                    object3 = null;
                    if (n7) break block10;
                    object5 = LayoutInflater.from((Context)object.getContext());
                    n7 = R$layout.new_similar_product_list_layout_horizontal_row;
                    object = object5.inflate(n7, object, false);
                    object4 = this.a;
                    object3 = this.d;
                    object5 = new p32((View)object, (s82_0)object4, (String)object3);
                    break block11;
                }
                n7 = 1;
                bl2 = this.e;
                if (!bl2) break block12;
                LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                int n8 = R$layout.luxe_pdp_similar_to_layout;
                View view = layoutInflater.inflate(n8, object, false);
                object3 = "inflate(...)";
                Intrinsics.checkNotNullExpressionValue(view, (String)object3);
                Context context = object.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                object = tr2_2.a;
                boolean bl3 = tr2_2.t(n7 != 0);
                object5 = new kG1(view, context, this, null, bl3);
            }
            return object5;
        }
        int n10 = this.f;
        if (n10 != 0) {
            n7 = 18;
            if (n3 == n7) {
                Object object6 = LayoutInflater.from((Context)object.getContext());
                n7 = R$layout.useful_links_item;
                object = object6.inflate(n7, object, false);
                object4 = this.g;
                object3 = this.h;
                object6 = new sx3_0((View)object, (Product)object4, (J43)object3);
                return object6;
            }
            object2 = LayoutInflater.from((Context)object.getContext());
            n7 = R$layout.common_product_item_view;
            object = object2.inflate(n7, object, false);
        } else {
            n10 = 7;
            if (n3 == n10) {
                object2 = LayoutInflater.from((Context)object.getContext());
                n10 = R$layout.common_product_item_view;
                object = object2.inflate(n10, object, false);
            } else {
                object2 = LayoutInflater.from((Context)object.getContext());
                n10 = R$layout.common_product_item_view;
                object = object2.inflate(n10, object, false);
            }
            this.i = n7;
        }
        object2 = new vv2_1((View)object);
        Intrinsics.checkNotNullParameter(this, "onPLPProductClickListener");
        object2.h = this;
        object = tr2_2.a;
        object2.j = n4 = tr2_2.t(bl2);
        object2.q = false;
        object2.r = n4 = this.i;
        object4 = object2.a;
        if (n4 != 0) {
            n4 = R$id.sale_container_v2;
            object = object4.findViewById(n4);
        } else {
            n4 = R$id.sale_container;
            object = object4.findViewById(n4);
        }
        object2.q0 = object;
        return object2;
    }
}

