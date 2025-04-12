/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Message
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager2.widget.ViewPager2$g;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEarnPointData;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.prioritydelivery.DeliveryTimeData;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.helper.UrlHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from bO
 */
public final class bo_1
extends RecyclerView$f {
    public final List a;
    public final j82_0 b;
    public final ao_1 c;
    public final nw_0 d;
    public final RecyclerViewScrollListener e;
    public final dn_1 f;
    public final en_1 g;
    public final Av h;
    public final hy0_0 i;
    public final String j;
    public int k;
    public int l;
    public op_2 m;
    public iP n;

    public bo_1(ArrayList object, j82_0 j82_02, ao_1 ao_12, nw_0 nw_02, RecyclerViewScrollListener recyclerViewScrollListener, dn_1 dn_12, en_1 en_12, Av av2, hy0_0 hy0_02) {
        int n3;
        Intrinsics.checkNotNullParameter(j82_02, "onCartClickListener");
        Intrinsics.checkNotNullParameter(ao_12, "cartItemsCallback");
        Intrinsics.checkNotNullParameter(dn_12, "cartInfoProvider");
        this.a = object;
        this.b = j82_02;
        this.c = ao_12;
        this.d = nw_02;
        this.e = recyclerViewScrollListener;
        this.f = dn_12;
        this.g = en_12;
        this.h = av2;
        this.i = hy0_02;
        this.j = object = bo_1.class.getName();
        this.k = n3 = -1;
        this.l = n3;
    }

    public final ArrayList g() {
        Object object = this.m;
        if (object != null) {
            boolean bl2;
            object = ((op_2)object).l;
            if (object == null || (bl2 = ((ArrayList)object).isEmpty())) {
                object = new Object();
            }
        } else {
            object = new Object();
        }
        return object;
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
        boolean bl2;
        Object e2;
        boolean bl3 = false;
        Object var3_3 = null;
        List list = this.a;
        if (list != null) {
            e2 = list.get(n3);
        } else {
            bl2 = false;
            e2 = null;
        }
        bl2 = e2 instanceof su3;
        if (bl2) {
            if (list != null) {
                var3_3 = list.get(n3);
            }
            Intrinsics.checkNotNull(var3_3, "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.UiCartComponent");
            return ((su3)var3_3).b;
        }
        if (list != null) {
            e2 = list.get(n3);
        } else {
            bl2 = false;
            e2 = null;
        }
        bl2 = e2 instanceof CartEntry;
        if (bl2) {
            return 10;
        }
        if (list != null) {
            var3_3 = list.get(n3);
        }
        if (bl3 = var3_3 instanceof Component) {
            return 21;
        }
        return super.getItemViewType(n3);
    }

    public final void h() {
        Object object = this.m;
        if (object != null && (object = ((op_2)object).i) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void i(List object) {
        Object object2 = "products";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        op_2 op_22 = this.m;
        if (op_22 != null) {
            boolean bl2;
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = op_22.l;
            object = (Collection)object;
            ((ArrayList)object2).addAll(object);
            object = ((ArrayList)object2).iterator();
            int n3 = 0;
            object2 = null;
            while (bl2 = object.hasNext()) {
                Object object3 = object.next();
                int n4 = n3 + 1;
                if (n3 >= 0) {
                    object3 = (Product)object3;
                    object2 = n00.a;
                    object2 = n00.b(object3);
                    object3 = op_22.m;
                    ((ArrayList)object3).add((Object)object2);
                    n3 = n4;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block264: {
            block265: {
                block266: {
                    block268: {
                        block267: {
                            block263: {
                                var3_3 /* !! */  = this;
                                var4_4 = var1_1;
                                var5_5 = var2_2;
                                var6_6 /* !! */  = "holder";
                                Intrinsics.checkNotNullParameter(var1_1, (String)var6_6 /* !! */ );
                                var7_7 = var1_1 instanceof cn_2;
                                var8_8 = this.a;
                                var9_9 = "setData";
                                var10_10 = 8;
                                var11_11 = 1.1E-44f;
                                var12_12 = 1;
                                var13_13 = 0;
                                var14_14 = null;
                                if (var7_7 == 0) break block263;
                                var4_4 = (cn_2)var1_1;
                                if (var8_8 != null) {
                                    var15_15 /* !! */  = var8_8.get(var2_2);
                                } else {
                                    var5_5 = 0;
                                    var16_26 = 0.0f;
                                    var15_15 /* !! */  = null;
                                }
                                var4_4.getClass();
                                var17_32 = yn3_0.a;
                                var18_35 /* !! */  = new Object[]{};
                                var17_32.a((String)var9_9, var18_35 /* !! */ );
                                var19_38 = var15_15 /* !! */  instanceof su3;
                                if (var19_38) {
                                    var15_15 /* !! */  = (su3)var15_15 /* !! */ ;
                                    var17_32 = var15_15 /* !! */ .a;
                                    var19_38 = TextUtils.isEmpty((CharSequence)var17_32);
                                    var18_35 /* !! */  = "bannerImv";
                                    if (!var19_38) {
                                        var17_32 = new da$a();
                                        var17_32.k = var12_12;
                                        var17_32.a = var7_7 = R$drawable.component_placeholder;
                                        var17_32.b = var7_7;
                                        var17_32.c = var7_7;
                                        var17_32.s = var12_12;
                                        var7_7 = R$string.acc_icon_product_placeholder;
                                        var6_6 /* !! */  = hv3_0.K(var7_7);
                                        var17_32.b((String)var6_6 /* !! */ );
                                        var6_6 /* !! */  = UrlHelper.Companion.getInstance();
                                        var15_15 /* !! */  = var15_15 /* !! */ .a;
                                        var15_15 /* !! */  = var6_6 /* !! */ .getImageUrl((String)var15_15 /* !! */ );
                                        var6_6 /* !! */  = var4_4.a;
                                        if (var6_6 /* !! */  == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_35 /* !! */ );
                                            var7_7 = 0;
                                            var6_6 /* !! */  = null;
                                        }
                                        var17_32.n = var15_15 /* !! */ ;
                                        var17_32.u = var6_6 /* !! */ ;
                                        var17_32.i = var12_12;
                                        var17_32.a();
                                        var15_15 /* !! */  = var4_4.a;
                                        if (var15_15 /* !! */  == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_35 /* !! */ );
                                            var5_5 = 0;
                                            var16_26 = 0.0f;
                                            var15_15 /* !! */  = null;
                                        }
                                        if ((var17_32 = var4_4.a) == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_35 /* !! */ );
                                            var19_38 = false;
                                            var17_32 = null;
                                        }
                                        var17_32 = var17_32.getContext();
                                        var7_7 = R$string.acc_banner;
                                        var17_32 = var17_32.getString(var7_7);
                                        var15_15 /* !! */ .setContentDescription((CharSequence)var17_32);
                                        var4_4 = var4_4.a;
                                        if (var4_4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_35 /* !! */ );
                                            var20_40 = false;
                                            var21_48 = null;
                                        } else {
                                            var21_48 = var4_4;
                                        }
                                        var21_48.setVisibility(0);
                                    } else {
                                        var4_4 = var4_4.a;
                                        if (var4_4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_35 /* !! */ );
                                            var20_41 = false;
                                            var21_49 = null;
                                        } else {
                                            var21_49 = var4_4;
                                        }
                                        var21_49.setVisibility(var10_10);
                                    }
                                }
                                var17_32 = var3_3 /* !! */ ;
                                break block264;
                            }
                            var7_7 = var1_1 instanceof lo_0;
                            var22_56 = "";
                            if (var7_7 == 0) break block265;
                            this.k = var7_7 = this.k + var12_12;
                            var4_4 = (lo_0)var1_1;
                            if (var8_8 != null) {
                                var6_6 /* !! */  = var8_8.get(var2_2);
                            } else {
                                var7_7 = 0;
                                var6_6 /* !! */  = null;
                            }
                            var23_57 = var3_3 /* !! */ .k;
                            var4_4.getClass();
                            var24_60 = yn3_0.a;
                            var25_61 = new Object[]{};
                            var24_60.a((String)var9_9, (Object[])var25_61);
                            var26_62 = var6_6 /* !! */  instanceof CartEntry;
                            if (var26_62 != 0) {
                                var4_4.B = var6_6 /* !! */  = (CartEntry)var6_6 /* !! */ ;
                            }
                            if ((var6_6 /* !! */  = var4_4.B) == null) break block266;
                            Intrinsics.checkNotNull(var6_6 /* !! */ );
                            var6_6 /* !! */  = var6_6 /* !! */ .getProduct();
                            if (var6_6 /* !! */  == null) break block266;
                            var6_6 /* !! */  = var4_4.B;
                            Intrinsics.checkNotNull(var6_6 /* !! */ );
                            var6_6 /* !! */  = var6_6 /* !! */ .getProduct();
                            var9_9 = var4_4.M;
                            if (var9_9 != null) {
                                var25_61 = "check box of position ";
                                var24_60 = new StringBuilder((String)var25_61);
                                var24_60.append(var23_57);
                                var8_8 = var24_60.toString();
                                var9_9.setContentDescription((CharSequence)var8_8);
                                var8_8 = Unit.a;
                            }
                            if ((var8_8 = var6_6 /* !! */ .getImages()) != null && (var23_57 = (var8_8 = (Collection)var8_8).isEmpty() ^ var12_12) == var12_12) {
                                block261: {
                                    var8_8 = var6_6 /* !! */ .getImages();
                                    Intrinsics.checkNotNull(var8_8);
                                    var8_8 = var8_8.iterator();
                                    while ((var26_62 = var8_8.hasNext()) != 0) {
                                        var9_9 = (ProductImage)var8_8.next();
                                        var24_60 = var9_9.component1();
                                        var9_9 = var9_9.component2();
                                        Intrinsics.checkNotNull(var24_60);
                                        var25_61 = "mobileProductListingImage";
                                        var27_65 = var25_61.equalsIgnoreCase((String)var24_60);
                                        if (!var27_65) continue;
                                        break block261;
                                    }
                                    var9_9 = var22_56;
                                }
                                if (var9_9 == null) {
                                    var8_8 = var6_6 /* !! */ .getImages();
                                    Intrinsics.checkNotNull(var8_8);
                                    var8_8 = (ProductImage)var8_8.get(0);
                                    var9_9 = var8_8.getUrl();
                                }
                            } else {
                                var9_9 = var22_56;
                            }
                            var23_57 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                            var24_60 = " of ";
                            var25_61 = "-";
                            var28_66 = "productImv";
                            if (var23_57 == 0) {
                                var8_8 = var4_4.c;
                                if (var8_8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var28_66);
                                    var23_57 = 0;
                                    var8_8 = null;
                                }
                                var8_8.setClickable((boolean)var12_12);
                                var8_8 = var4_4.c;
                                if (var8_8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var28_66);
                                    var23_57 = 0;
                                    var8_8 = null;
                                }
                                var29_67 = R$string.product_image;
                                var21_50 = hv3_0.K(var29_67);
                                var17_33 = var6_6 /* !! */ .getBrandName();
                                var18_36 = var6_6 /* !! */ .getName();
                                var17_33 = KW.a((String)var21_50, (String)var24_60, (String)var17_33, (String)var25_61, (String)var18_36);
                                var8_8.setContentDescription((CharSequence)var17_33);
                                var17_33 = new da$a();
                                var17_33.k = var12_12;
                                var17_33.a = var30_68 = R$drawable.component_placeholder;
                                var17_33.b = var30_68;
                                var17_33.c = var30_68;
                                var17_33.s = var12_12;
                                var30_68 = R$string.acc_icon_product_placeholder;
                                var18_36 = hv3_0.K(var30_68);
                                var17_33.b((String)var18_36);
                                var18_36 = UrlHelper.Companion.getInstance().getImageUrl((String)var9_9);
                                var8_8 = var4_4.c;
                                if (var8_8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var28_66);
                                    var23_57 = 0;
                                    var8_8 = null;
                                }
                                var17_33.n = var18_36;
                                var17_33.u = var8_8;
                                var17_33.i = var12_12;
                                var17_33.a();
                            } else {
                                var17_33 = var4_4.c;
                                if (var17_33 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var28_66);
                                    var19_39 = 0;
                                    var17_33 = null;
                                }
                                var17_33.setClickable(false);
                                var17_33 = var4_4.c;
                                if (var17_33 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var28_66);
                                    var19_39 = 0;
                                    var17_33 = null;
                                }
                                var30_68 = R$drawable.item_dummy_noimg;
                                var17_33.setImageResource(var30_68);
                                var17_33 = Unit.a;
                            }
                            var17_33 = var6_6 /* !! */ .getBrandName();
                            if (var17_33 != null && (var19_39 = var17_33.length()) != 0) {
                                var17_33 = var4_4.t;
                                if (var17_33 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("brandInfo");
                                    var19_39 = 0;
                                    var17_33 = null;
                                }
                                var18_36 = var6_6 /* !! */ .getBrandName();
                                Intrinsics.checkNotNull(var18_36);
                                var17_33.setText((CharSequence)var18_36);
                            }
                            var17_33 = var4_4.B;
                            var18_36 = "dodProductLayout";
                            if (var17_33 == null || (var19_39 = (int)var17_33.isDealEnabled()) != var12_12) break block267;
                            var31_73 = Calendar.getInstance(TimeZone.getTimeZone("IST")).getTimeInMillis();
                            var17_33 = var4_4.B;
                            Intrinsics.checkNotNull(var17_33);
                            var33_75 = var17_33.getActualDealStartTime();
                            var19_39 = (int)(var31_73 == var33_75 ? 0 : (var31_73 < var33_75 ? -1 : 1));
                            if (var19_39 <= 0) ** GOTO lbl-1000
                            var17_33 = var4_4.B;
                            Intrinsics.checkNotNull(var17_33);
                            var33_75 = var17_33.getDealEndTime();
                            var19_39 = (int)(var31_73 == var33_75 ? 0 : (var31_73 < var33_75 ? -1 : 1));
                            if (var19_39 < 0) {
                                var17_33 = var4_4.B;
                                Intrinsics.checkNotNull(var17_33);
                                var4_4.E = var31_73 = var17_33.getDealEndTime();
                                var4_4.F = var12_12;
                                var17_33 = var4_4.C;
                                if (var17_33 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                                    var19_39 = 0;
                                    var17_33 = null;
                                }
                                var17_33.setVisibility(0);
                                var4_4.y((boolean)var12_12);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4.F = false;
                                var17_33 = var4_4.C;
                                if (var17_33 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                                    var19_39 = 0;
                                    var17_33 = null;
                                }
                                var17_33.setVisibility(var10_10);
                                var4_4.y(false);
                            }
                            var17_33 = Unit.a;
                            break block268;
                        }
                        var4_4.F = false;
                        var17_33 = var4_4.C;
                        if (var17_33 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                            var19_39 = 0;
                            var17_33 = null;
                        }
                        var17_33.setVisibility(var10_10);
                        var4_4.y(false);
                        var17_33 = h40_0.a;
                        var17_33 = z40_0.Companion;
                        var18_36 = AJIOApplication.Companion;
                        var8_8 = Q.a((AJIOApplication$a)var18_36, (z40$a)var17_33).a;
                        var23_57 = var8_8.g("maxLimitForShowLowInventoryLabel");
                        var9_9 = var4_4.B;
                        if (var9_9 != null && (var9_9 = var9_9.getInventoryQty()) != null) {
                            var26_62 = var9_9.intValue();
                            if (var26_62 > 0) {
                                if (var26_62 <= var23_57) {
                                    var21_50 = var4_4.a;
                                    var21_50.s7();
                                }
                                if ((var19_39 = (int)(var17_33 = Q.a((AJIOApplication$a)var18_36, (z40$a)var17_33).a).a((String)(var18_36 = "isShowLowInventoryLabel"))) != 0 && (var19_39 = (int)og1_1.c()) == 0) {
                                    if (var26_62 <= var23_57) {
                                        var17_33 = var4_4.s;
                                        if (var17_33 != null) {
                                            var30_68 = R$string.inventory_qty_left;
                                            var8_8 = var26_62;
                                            var9_9 = new Object[var12_12];
                                            var9_9[0] = var8_8;
                                            var18_36 = hv3_0.L(var30_68, (Object[])var9_9);
                                            var17_33.setText((CharSequence)var18_36);
                                            var17_33 = Unit.a;
                                        }
                                        if ((var17_33 = var4_4.s) != null) {
                                            var17_33.setVisibility(0);
                                            var17_33 = Unit.a;
                                        }
                                    } else {
                                        var17_33 = var4_4.s;
                                        if (var17_33 != null) {
                                            var17_33.setVisibility(var10_10);
                                            var17_33 = Unit.a;
                                        }
                                        if ((var17_33 = lp_0.e(var4_4.B)) != null && (var30_68 = var17_33.length()) != 0) {
                                            var18_36 = var4_4.s;
                                            if (var18_36 != null) {
                                                ai0_2.B((View)var18_36);
                                            }
                                            if ((var18_36 = var4_4.s) != null) {
                                                var18_36.setText((CharSequence)var17_33);
                                            }
                                        }
                                    }
                                } else {
                                    var17_33 = var4_4.s;
                                    if (var17_33 != null) {
                                        var17_33.setVisibility(var10_10);
                                        var17_33 = Unit.a;
                                    }
                                    if ((var17_33 = lp_0.e(var4_4.B)) != null && (var30_68 = var17_33.length()) != 0) {
                                        var18_36 = var4_4.s;
                                        if (var18_36 != null) {
                                            ai0_2.B((View)var18_36);
                                        }
                                        if ((var18_36 = var4_4.s) != null) {
                                            var18_36.setText((CharSequence)var17_33);
                                        }
                                    }
                                }
                            } else {
                                var17_33 = var4_4.s;
                                if (var17_33 != null) {
                                    var17_33.setVisibility(var10_10);
                                    var17_33 = Unit.a;
                                }
                            }
                            var17_33 = Unit.a;
                        }
                    }
                    Intrinsics.checkNotNull(var6_6 /* !! */ );
                    var4_4.z(var5_5, (Product)var6_6 /* !! */ );
                    var15_16 /* !! */  = var4_4.y;
                    var17_33 = "cartS1S2Info";
                    if (var15_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var15_16 /* !! */ .setVisibility(var10_10);
                    var15_16 /* !! */  = var4_4.d;
                    var18_36 = "productNameTv";
                    if (var15_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var15_16 /* !! */ .setMaxLines(2);
                    var15_16 /* !! */  = ka2_2.a(var4_4.B);
                    var23_57 = (int)var15_16 /* !! */ .b;
                    var9_9 = "sizeContainer";
                    if (var23_57 != 0) {
                        var4_4.H = false;
                        var8_8 = var4_4.k;
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                            var23_57 = 0;
                            var8_8 = null;
                        }
                        var8_8.setVisibility(var10_10);
                    } else {
                        var4_4.H = var12_12;
                        var8_8 = var4_4.k;
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                            var23_57 = 0;
                            var8_8 = null;
                        }
                        var8_8.setVisibility(0);
                        var23_57 = (int)hv3_0.Y();
                        if (var23_57 != 0) {
                            var8_8 = var4_4.B;
                            Intrinsics.checkNotNull(var8_8);
                            var8_8 = var8_8.getProduct().getSelectedSizeVariant();
                            var8_8 = var8_8 != null ? Y63.c((ProductOptionVariant)var8_8) : var22_56;
                        } else {
                            var8_8 = var15_16 /* !! */ .c;
                        }
                        var20_42 = TextUtils.isEmpty((CharSequence)var8_8);
                        var35_76 = "sizeValue";
                        if (var20_42 == 0) {
                            if (var8_8 != null) {
                                block262: {
                                    var20_42 = var8_8.length() - var12_12;
                                    var10_10 = 0;
                                    var11_11 = 0.0f;
                                    var36_77 = null;
                                    var37_79 = false;
                                    block3: while (var10_10 <= var20_42) {
                                        var13_13 = var37_79 == false ? var10_10 : var20_42;
                                        var12_12 = Intrinsics.compare(var13_13 = (int)var8_8.charAt(var13_13), 32);
                                        if (var12_12 <= 0) {
                                            var12_12 = 1;
                                        } else {
                                            var12_12 = 0;
                                            var38_80 /* !! */  = null;
                                        }
                                        if (!var37_79) {
                                            if (var12_12 == 0) {
                                                var12_12 = 1;
                                                var13_13 = 0;
                                                var14_14 = null;
                                                var37_79 = true;
                                                continue;
                                            }
                                            var13_13 = 1;
                                            var10_10 += var13_13;
lbl385:
                                            // 2 sources

                                            while (true) {
                                                var12_12 = 1;
                                                var13_13 = 0;
                                                var14_14 = null;
                                                continue block3;
                                                break;
                                            }
                                        }
                                        var13_13 = 1;
                                        if (var12_12 != 0) {
                                            var20_42 += -1;
                                            ** continue;
                                        }
                                        break block262;
                                    }
                                    var13_13 = 1;
                                }
                                var8_8 = com.jio.jioads.adinterfaces.a.a(var20_42, var13_13, var10_10, (String)var8_8);
                            } else {
                                var23_57 = 0;
                                var8_8 = null;
                            }
                            var36_77 = var4_4.j;
                            if (var36_77 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var35_76);
                                var10_10 = 0;
                                var11_11 = 0.0f;
                                var36_77 = null;
                            }
                            var36_77.setText((CharSequence)var8_8);
                            var36_77 = var4_4.k;
                            if (var36_77 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                                var10_10 = 0;
                                var11_11 = 0.0f;
                                var36_77 = null;
                            }
                            var26_62 = R$string.size_selection_cart;
                            var38_80 /* !! */  = var4_4.B;
                            if (var38_80 /* !! */  == null || (var38_80 /* !! */  = var38_80 /* !! */ .getProduct()) == null || (var38_80 /* !! */  = var38_80 /* !! */ .getBrandName()) == null) {
                                var38_80 /* !! */  = var22_56;
                            }
                            if ((var14_14 = var4_4.B) != null && (var14_14 = var14_14.getProduct()) != null && (var14_14 = var14_14.getName()) != null) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var14_14 = var22_56;
                            ** continue;
                            var20_42 = 3;
                            var3_3 /* !! */  = new Object[var20_42];
                            var20_42 = 0;
                            var21_50 = null;
                            var3_3 /* !! */ [0] = var38_80 /* !! */ ;
                            var3_3 /* !! */ [1] = var14_14;
                            var12_12 = 2;
                            var3_3 /* !! */ [var12_12] = var8_8;
                            var3_3 /* !! */  = hv3_0.L(var26_62, (Object[])var3_3 /* !! */ );
                            var36_77.setContentDescription((CharSequence)var3_3 /* !! */ );
                        } else {
                            var3_3 /* !! */  = var4_4.j;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var35_76);
                                var39_81 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setText((CharSequence)var22_56);
                        }
                    }
                    var3_3 /* !! */  = var15_16 /* !! */ .a;
                    if (var3_3 /* !! */  != null && (var39_81 = var3_3 /* !! */ .length()) != 0) {
                        var3_3 /* !! */  = var4_4.y;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                            var39_81 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var23_57 = 0;
                        var8_8 = null;
                        var3_3 /* !! */ .setVisibility(0);
                        var3_3 /* !! */  = var4_4.d;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                            var39_81 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var23_57 = 1;
                        var3_3 /* !! */ .setMaxLines(var23_57);
                        var3_3 /* !! */  = var4_4.y;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                            var39_81 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var15_16 /* !! */  = var15_16 /* !! */ .a;
                        var3_3 /* !! */ .setText((CharSequence)var15_16 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = var6_6 /* !! */ .getName()) != null && (var39_81 = var3_3 /* !! */ .length()) != 0) {
                        var3_3 /* !! */  = var4_4.d;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                            var39_81 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var15_16 /* !! */  = var6_6 /* !! */ .getName();
                        Intrinsics.checkNotNull(var15_16 /* !! */ );
                        var3_3 /* !! */ .setText((CharSequence)var15_16 /* !! */ );
                    }
                    var3_3 /* !! */  = h40_0.a;
                    var5_5 = (int)var3_3 /* !! */ .f1();
                    var17_33 = "offerContainerFreebies";
                    if (var5_5 != 0) {
                        var15_16 /* !! */  = a21.a;
                        var18_36 = var4_4.B;
                        if (var18_36 != null) {
                            var18_36 = var18_36.getGiftProducts();
                        } else {
                            var30_68 = 0;
                            var40_83 = 0.0f;
                            var18_36 = null;
                        }
                        var15_16 /* !! */ .getClass();
                        var15_16 /* !! */  = a21.f(var18_36);
                        if (var15_16 /* !! */  != null) {
                            var15_16 /* !! */  = var15_16 /* !! */ .getQuantities();
                        } else {
                            var5_5 = 0;
                            var16_27 = 0.0f;
                            var15_16 /* !! */  = null;
                        }
                        var15_16 /* !! */  = (Collection)var15_16 /* !! */ ;
                        if (var15_16 /* !! */  != null && (var5_5 = (int)var15_16 /* !! */ .isEmpty()) == 0) {
                            var15_16 /* !! */  = var4_4.o;
                            if (var15_16 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                                var5_5 = 0;
                                var16_27 = 0.0f;
                                var15_16 /* !! */  = null;
                            }
                            ai0_2.B((View)var15_16 /* !! */ );
                            var5_5 = 0;
                            var16_27 = 0.0f;
                            var15_16 /* !! */  = h40_0.D(false).getCartfreebiesHeaderOne();
                            var17_33 = var4_4.B;
                            if (var17_33 != null && (var17_33 = var17_33.getGiftQuantity()) != null) {
                                var19_39 = var17_33.intValue();
lbl509:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var19_39 = 0;
                            var17_33 = null;
                            ** continue;
                            var30_68 = 1;
                            var40_83 = 1.4E-45f;
                            if (var19_39 > var30_68) {
                                var30_68 = 0;
                                var40_83 = 0.0f;
                                var18_36 = null;
                                var15_16 /* !! */  = h40_0.D(false).getCartfreebiesHeaderMore();
                                if (var15_16 /* !! */  != null) {
                                    var17_33 = String.valueOf(var19_39);
                                    var8_8 = "%x";
                                    var15_16 /* !! */  = kotlin.text.b.n((String)var15_16 /* !! */ , (String)var8_8, (String)var17_33, false);
                                } else {
                                    var5_5 = 0;
                                    var16_27 = 0.0f;
                                    var15_16 /* !! */  = null;
                                }
                            }
                            if ((var17_33 = var4_4.A) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvGWPTitle");
                                var19_39 = 0;
                                var17_33 = null;
                            }
                            var17_33.setText((CharSequence)var15_16 /* !! */ );
                        } else {
                            var15_16 /* !! */  = var4_4.o;
                            if (var15_16 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                                var5_5 = 0;
                                var16_27 = 0.0f;
                                var15_16 /* !! */  = null;
                            }
                            ai0_2.i((View)var15_16 /* !! */ );
                        }
                    } else {
                        var15_16 /* !! */  = var4_4.o;
                        if (var15_16 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                            var5_5 = 0;
                            var16_27 = 0.0f;
                            var15_16 /* !! */  = null;
                        }
                        ai0_2.i((View)var15_16 /* !! */ );
                    }
                    var15_16 /* !! */  = var4_4.c;
                    if (var15_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var28_66);
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var19_39 = R$string.product_image;
                    var17_33 = hv3_0.K(var19_39);
                    var18_36 = var6_6 /* !! */ .getBrandName();
                    if (var18_36 == null) {
                        var18_36 = var22_56;
                    }
                    if ((var8_8 = var6_6 /* !! */ .getName()) == null) {
                        var8_8 = var22_56;
                    }
                    var17_33 = KW.a((String)var17_33, (String)var24_60, (String)var18_36, (String)var25_61, (String)var8_8);
                    var15_16 /* !! */ .setContentDescription((CharSequence)var17_33);
                    var15_16 /* !! */  = var4_4.m;
                    var17_33 = "removeImv";
                    if (var15_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var30_68 = R$string.remove_refresh;
                    var18_36 = hv3_0.K(var30_68);
                    var8_8 = var6_6 /* !! */ .getBrandName();
                    if (var8_8 == null) {
                        var8_8 = var22_56;
                    }
                    if ((var6_6 /* !! */  = var6_6 /* !! */ .getName()) == null) {
                        var6_6 /* !! */  = var22_56;
                    }
                    var9_9 = " ";
                    var18_36 = KW.a((String)var18_36, (String)var9_9, (String)var8_8, (String)var25_61, (String)var6_6 /* !! */ );
                    var15_16 /* !! */ .setContentDescription((CharSequence)var18_36);
                    var15_16 /* !! */  = var4_4.l;
                    if (var15_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("quantityValue");
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var18_36 = var4_4.B;
                    Intrinsics.checkNotNull(var18_36);
                    var18_36 = var18_36.getQuantity().toString();
                    var15_16 /* !! */ .setText((CharSequence)var18_36);
                    var15_16 /* !! */  = var4_4.w;
                    var18_36 = "qtyContainer";
                    if (var15_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var7_7 = R$string.quantity_selection_cart;
                    var8_8 = var4_4.B;
                    if (var8_8 == null || (var8_8 = var8_8.getProduct()) == null || (var8_8 = var8_8.getBrandName()) == null) {
                        var8_8 = var22_56;
                    }
                    if ((var9_9 = var4_4.B) == null || (var9_9 = var9_9.getProduct()) == null || (var9_9 = var9_9.getName()) == null) {
                        var9_9 = var22_56;
                    }
                    if ((var36_77 = var4_4.B) == null || (var36_77 = var36_77.getQuantity()) == null) {
                        var36_77 = var22_56;
                    }
                    var36_77 = var36_77.toString();
                    var12_12 = 3;
                    var38_80 /* !! */  = new Object[var12_12];
                    var13_13 = 0;
                    var14_14 = null;
                    var38_80 /* !! */ [0] = var8_8;
                    var38_80 /* !! */ [1] = var9_9;
                    var23_57 = 2;
                    var38_80 /* !! */ [var23_57] = var36_77;
                    var6_6 /* !! */  = hv3_0.L(var7_7, var38_80 /* !! */ );
                    var15_16 /* !! */ .setContentDescription((CharSequence)var6_6 /* !! */ );
                    var15_16 /* !! */  = var4_4.m;
                    if (var15_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var15_16 /* !! */ .setVisibility(0);
                    var15_16 /* !! */  = var4_4.B;
                    Intrinsics.checkNotNull(var15_16 /* !! */ );
                    var15_16 /* !! */  = var15_16 /* !! */ .getProduct().getFnlColorVariantData();
                    hv3_0.a.getClass();
                    var15_16 /* !! */  = hv3_0.A((ProductFnlColorVariantData)var15_16 /* !! */ );
                    var17_33 = "exclusiveLbl";
                    if (var15_16 /* !! */  != null) {
                        var6_6 /* !! */  = var4_4.b;
                        if (var6_6 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                            var7_7 = 0;
                            var6_6 /* !! */  = null;
                        }
                        var6_6 /* !! */ .setText((CharSequence)var15_16 /* !! */ );
                        var15_16 /* !! */  = var4_4.b;
                        if (var15_16 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                            var5_5 = 0;
                            var16_27 = 0.0f;
                            var15_16 /* !! */  = null;
                        }
                        var19_39 = 0;
                        var17_33 = null;
                        var15_16 /* !! */ .setVisibility(0);
                    } else {
                        var15_16 /* !! */  = var4_4.b;
                        if (var15_16 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                            var5_5 = 0;
                            var16_27 = 0.0f;
                            var15_16 /* !! */  = null;
                        }
                        var19_39 = 8;
                        var15_16 /* !! */ .setVisibility(var19_39);
                    }
                    var15_16 /* !! */  = var4_4.B;
                    if (var15_16 /* !! */  != null && (var15_16 /* !! */  = var15_16 /* !! */ .getServicabilityInfo()) != null) {
                        var15_16 /* !! */  = var15_16 /* !! */ .getEddUpper();
                    } else {
                        var5_5 = 0;
                        var16_27 = 0.0f;
                        var15_16 /* !! */  = null;
                    }
                    var17_33 = "tvStandardDeliveryDate";
                    if (var15_16 /* !! */  != null && (var5_5 = var15_16 /* !! */ .length()) != 0) {
                        var15_16 /* !! */  = var4_4.B;
                        var6_6 /* !! */  = "Delivery by ";
                        if (var15_16 /* !! */  != null && (var15_16 /* !! */  = var15_16 /* !! */ .getServicabilityInfo()) != null && (var15_16 /* !! */  = var15_16 /* !! */ .getEddUpper()) != null) {
                            var15_16 /* !! */  = k7.m((String)var15_16 /* !! */ );
                            var15_16 /* !! */  = kp1_0.c((String)var6_6 /* !! */ , (String)var15_16 /* !! */ );
                            var8_8 = var4_4.q;
                            if (var8_8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                                var23_57 = 0;
                                var8_8 = null;
                            }
                            var8_8.setText((CharSequence)var15_16 /* !! */ );
                            var15_16 /* !! */  = var4_4.q;
                            if (var15_16 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                                var5_5 = 0;
                                var16_27 = 0.0f;
                                var15_16 /* !! */  = null;
                            }
                            ai0_2.B((View)var15_16 /* !! */ );
                            var15_16 /* !! */  = Unit.a;
                        }
                        if ((var5_5 = (int)h40_0.Q1()) != 0) {
                            var15_16 /* !! */  = var4_4.B;
                            if (var15_16 /* !! */  != null && (var15_16 /* !! */  = var15_16 /* !! */ .getServicabilityInfo()) != null) {
                                var15_16 /* !! */  = var15_16 /* !! */ .getDeliverySLA();
                            } else {
                                var5_5 = 0;
                                var16_27 = 0.0f;
                                var15_16 /* !! */  = null;
                            }
                            var3_3 /* !! */  = var3_3 /* !! */ .d0();
                            if (var3_3 /* !! */  != null) {
                                var3_3 /* !! */  = (DeliveryTimeData)var3_3 /* !! */ .get(var15_16 /* !! */ );
                            } else {
                                var39_81 = 0;
                                var3_3 /* !! */  = null;
                            }
                            if (var15_16 /* !! */  != null && (var23_57 = var15_16 /* !! */ .length()) != 0) {
                                if (var3_3 /* !! */  != null && (var23_57 = (int)var3_3 /* !! */ .getShowDay()) == (var26_62 = 1)) {
                                    var3_3 /* !! */  = var4_4.B;
                                    if (var3_3 /* !! */  != null && (var3_3 /* !! */  = var3_3 /* !! */ .getServicabilityInfo()) != null) {
                                        var3_3 /* !! */  = var3_3 /* !! */ .getEddUpper();
                                    } else {
                                        var39_81 = 0;
                                        var3_3 /* !! */  = null;
                                    }
                                    var3_3 /* !! */  = k7.m(String.valueOf(var3_3 /* !! */ ));
                                    if (var3_3 /* !! */  != null) {
                                        var22_56 = var3_3 /* !! */ ;
                                    }
                                    var3_3 /* !! */  = new Date();
                                    var9_9 = "yyyy-MM-dd'T'HH:mm";
                                    var36_77 = Locale.ENGLISH;
                                    var8_8 = new SimpleDateFormat((String)var9_9, (Locale)var36_77);
                                    try {
                                        var3_3 /* !! */  = var8_8.parse((String)var22_56);
                                    }
                                    catch (Exception v0) {}
                                    if (var3_3 /* !! */  != null) {
                                        var9_9 = "hh:mm a";
                                        var36_77 = Locale.ENGLISH;
                                        var8_8 = new SimpleDateFormat((String)var9_9, (Locale)var36_77);
                                        var3_3 /* !! */  = var8_8.format((Date)var3_3 /* !! */ );
                                    } else {
                                        var39_81 = 0;
                                        var3_3 /* !! */  = null;
                                    }
                                    var8_8 = ", ";
                                    var3_3 /* !! */  = UX.c((String)var6_6 /* !! */ , (String)var15_16 /* !! */ , (String)var8_8, (String)var3_3 /* !! */ );
                                } else {
                                    if (var3_3 /* !! */  != null) {
                                        var3_3 /* !! */  = var3_3 /* !! */ .getDisplayName();
                                    } else {
                                        var39_81 = 0;
                                        var3_3 /* !! */  = null;
                                    }
                                    var3_3 /* !! */  = String.valueOf(var3_3 /* !! */ );
                                }
                                var15_16 /* !! */  = var4_4.P;
                                var7_7 = 0;
                                var6_6 /* !! */  = null;
                                if (var15_16 /* !! */  != null) {
                                    var15_16 /* !! */ .setVisibility(0);
                                    var15_16 /* !! */  = Unit.a;
                                }
                                if ((var15_16 /* !! */  = var4_4.O) != null) {
                                    var15_16 /* !! */ .setVisibility(0);
                                    var15_16 /* !! */  = Unit.a;
                                }
                                if ((var15_16 /* !! */  = var4_4.q) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                                    var5_5 = 0;
                                    var16_27 = 0.0f;
                                    var15_16 /* !! */  = null;
                                }
                                ai0_2.i((View)var15_16 /* !! */ );
                                var15_16 /* !! */  = var4_4.P;
                                if (var15_16 /* !! */  != null) {
                                    var15_16 /* !! */ .setText((CharSequence)var3_3 /* !! */ );
                                    var3_3 /* !! */  = Unit.a;
                                }
                            } else {
                                var3_3 /* !! */  = var4_4.B;
                                if (var3_3 /* !! */  != null && (var3_3 /* !! */  = var3_3 /* !! */ .getServicabilityInfo()) != null && (var3_3 /* !! */  = var3_3 /* !! */ .getEddUpper()) != null) {
                                    if ((var3_3 /* !! */  = k7.m((String)var3_3 /* !! */ )) != null) {
                                        var22_56 = var3_3 /* !! */ ;
                                    }
                                    var3_3 /* !! */  = var6_6 /* !! */ .concat((String)var22_56);
                                    var15_16 /* !! */  = new SpannableString((CharSequence)var3_3 /* !! */ );
                                    var7_7 = var22_56.length();
                                    if (var7_7 > 0) {
                                        var23_57 = 0;
                                        var8_8 = null;
                                        var39_81 = StringsKt.O((CharSequence)var3_3 /* !! */ , (String)var22_56, 0, false, 6);
                                        var7_7 = var22_56.length() + var39_81;
                                        var9_9 = new StyleSpan(1);
                                        var10_10 = 33;
                                        var11_11 = 4.6E-44f;
                                        var15_16 /* !! */ .setSpan(var9_9, var39_81, var7_7, var10_10);
                                    } else {
                                        var23_57 = 0;
                                        var8_8 = null;
                                    }
                                    var3_3 /* !! */  = var4_4.P;
                                    if (var3_3 /* !! */  != null) {
                                        var3_3 /* !! */ .setVisibility(0);
                                        var3_3 /* !! */  = Unit.a;
                                    }
                                    if ((var3_3 /* !! */  = var4_4.O) != null) {
                                        var3_3 /* !! */ .setVisibility(0);
                                        var3_3 /* !! */  = Unit.a;
                                    }
                                    if ((var3_3 /* !! */  = var4_4.q) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                                        var39_81 = 0;
                                        var3_3 /* !! */  = null;
                                    }
                                    ai0_2.i((View)var3_3 /* !! */ );
                                    var3_3 /* !! */  = var4_4.P;
                                    if (var3_3 /* !! */  != null) {
                                        var3_3 /* !! */ .setText((CharSequence)var15_16 /* !! */ );
                                        var3_3 /* !! */  = Unit.a;
                                    }
                                    var3_3 /* !! */  = Unit.a;
                                }
                            }
                        }
                        var3_3 /* !! */  = Unit.a;
                    } else {
                        var3_3 /* !! */  = var4_4.q;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_33);
                            var39_81 = 0;
                            var3_3 /* !! */  = null;
                        }
                        ai0_2.i((View)var3_3 /* !! */ );
                        var3_3 /* !! */  = var4_4.P;
                        if (var3_3 /* !! */  != null) {
                            ai0_2.i((View)var3_3 /* !! */ );
                            var3_3 /* !! */  = Unit.a;
                        }
                        if ((var3_3 /* !! */  = var4_4.O) != null) {
                            ai0_2.i((View)var3_3 /* !! */ );
                            var3_3 /* !! */  = Unit.a;
                        }
                    }
                    var3_3 /* !! */  = var4_4.B;
                    Intrinsics.checkNotNull(var3_3 /* !! */ );
                    var39_81 = (int)var3_3 /* !! */ .inventoryQtyUpdateNeeded();
                    if (var39_81 != 0 && (var39_81 = (int)var4_4.F) == 0) {
                        var3_3 /* !! */  = var4_4.n;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("promotionLayout");
                            var39_81 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var5_5 = 8;
                        var16_27 = 1.1E-44f;
                        var3_3 /* !! */ .setVisibility(var5_5);
                        var3_3 /* !! */  = var4_4.p;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("promotionOfferDivider");
                            var39_81 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var3_3 /* !! */ .setVisibility(var5_5);
                        var39_81 = (int)og1_1.b();
                        if (var39_81 != 0) {
                            var3_3 /* !! */  = var4_4.w;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                                var20_42 = 0;
                                var21_50 = null;
                            } else {
                                var21_50 = var3_3 /* !! */ ;
                            }
                            var39_81 = R$drawable.bg_grey_red_luxe;
                            var3_3 /* !! */  = hv3_0.r(var39_81);
                            var21_50.setBackground((Drawable)var3_3 /* !! */ );
                        } else {
                            var3_3 /* !! */  = var4_4.w;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                                var20_42 = 0;
                                var21_50 = null;
                            } else {
                                var21_50 = var3_3 /* !! */ ;
                            }
                            var39_81 = R$drawable.rounded_cool_grey_red_refresh;
                            var3_3 /* !! */  = hv3_0.r(var39_81);
                            var21_50.setBackground((Drawable)var3_3 /* !! */ );
                        }
                    } else {
                        var3_3 /* !! */  = var4_4.B;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var4_4.x((CartEntry)var3_3 /* !! */ );
                        var39_81 = (int)og1_1.b();
                        if (var39_81 != 0) {
                            var3_3 /* !! */  = var4_4.w;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                                var20_42 = 0;
                                var21_50 = null;
                            } else {
                                var21_50 = var3_3 /* !! */ ;
                            }
                            var39_81 = hv3_0.m(R$color.luxe_color_F5F5F5);
                            var21_50.setBackgroundColor(var39_81);
                        } else {
                            var3_3 /* !! */  = var4_4.w;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var18_36);
                                var20_42 = 0;
                                var21_50 = null;
                            } else {
                                var21_50 = var3_3 /* !! */ ;
                            }
                            var39_81 = R$drawable.rounded_cool_grey_refresh;
                            var3_3 /* !! */  = hv3_0.r(var39_81);
                            var21_50.setBackground((Drawable)var3_3 /* !! */ );
                        }
                    }
                    var4_4.A();
                }
                var17_33 = this;
                break block264;
            }
            var39_82 = var1_1 instanceof mm_2;
            var17_34 = this;
            var18_37 = this.c;
            if (var39_82 != 0) {
                var3_3 /* !! */  = var1_1;
                var3_3 /* !! */  = (mm_2)var1_1;
                var4_4 = var18_37.ta();
                var3_3 /* !! */ .getClass();
                Intrinsics.checkNotNullParameter(var4_4, "cartEarnPointData");
                var15_17 = yn3_0.a;
                var30_69 /* !! */  = 0;
                var40_84 = 0.0f;
                var6_6 /* !! */  = new Object[]{};
                var15_17.a((String)var9_9, var6_6 /* !! */ );
                var5_5 = R$string.super_cash;
                var15_17 = hv3_0.K(var5_5);
                var18_37 = var3_3 /* !! */ .d;
                if (var18_37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ajioWalletTv");
                    var30_69 /* !! */  = 0;
                    var40_84 = 0.0f;
                    var18_37 = null;
                }
                var7_7 = R$string.ajio_super_cash;
                var9_9 = new Object[1];
                var23_58 = 0;
                var8_8 = null;
                var9_9[0] = var15_17;
                var6_6 /* !! */  = hv3_0.L(var7_7, (Object[])var9_9);
                var18_37.setText((CharSequence)var6_6 /* !! */ );
                var41_86 = var4_4.getEligibleEarnAmount();
                var31_74 = 0L;
                var43_87 = 0.0;
                var36_78 = "earnPointsMessageView";
                var12_12 = (int)(var41_86 == var43_87 ? 0 : (var41_86 > var43_87 ? 1 : -1));
                if (var12_12 > 0) {
                    var18_37 = var3_3 /* !! */ .b;
                    if (var18_37 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var36_78);
                        var30_69 /* !! */  = 0;
                        var40_84 = 0.0f;
                        var18_37 = null;
                    }
                    var7_7 = R$string.ajioearn;
                    var43_87 = var4_4.getEligibleEarnAmount();
                    var8_8 = var43_87;
                    var26_63 = 2;
                    var9_9 = new Object[var26_63];
                    var10_10 = 0;
                    var11_11 = 0.0f;
                    var36_78 = null;
                    var9_9[0] = var8_8;
                    var23_58 = 1;
                    var9_9[var23_58] = var15_17;
                    var15_17 = hv3_0.L(var7_7, (Object[])var9_9);
                    mm_2.w((TextView)var18_37, (String)var15_17);
                } else {
                    var40_84 = var4_4.getAdditionalPurchaseAmount();
                    var7_7 = 0;
                    var6_6 /* !! */  = null;
                    cfr_temp_0 = var40_84 - 0.0f;
                    var30_69 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var30_69 /* !! */  > 0) {
                        var18_37 = var3_3 /* !! */ .b;
                        if (var18_37 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var36_78);
                            var30_69 /* !! */  = 0;
                            var40_84 = 0.0f;
                            var18_37 = null;
                        }
                        var7_7 = R$string.ajio_additional_purchase;
                        var8_8 = qz2_0.l(Float.valueOf(var4_4.getAdditionalPurchaseAmount()));
                        var26_64 = 2;
                        var9_9 = new Object[var26_64];
                        var10_10 = 0;
                        var11_11 = 0.0f;
                        var36_78 = null;
                        var9_9[0] = var8_8;
                        var23_58 = 1;
                        var9_9[var23_58] = var15_17;
                        var15_17 = hv3_0.L(var7_7, (Object[])var9_9);
                        mm_2.w((TextView)var18_37, (String)var15_17);
                    }
                }
                var15_17 = var3_3 /* !! */ .c;
                if (var15_17 == null) {
                    var15_17 = "ajioInfoView";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_17);
                    var20_43 = false;
                    var21_51 = null;
                } else {
                    var21_51 = var15_17;
                }
                var15_17 = new lm_1((mm_2)var3_3 /* !! */ , (CartEarnPointData)var4_4);
                var21_51.setOnClickListener((View.OnClickListener)var15_17);
            } else {
                var39_82 = var1_1 instanceof po_1;
                if (var39_82 != 0) {
                    var3_3 /* !! */  = var1_1;
                    var3_3 /* !! */  = (po_1)var1_1;
                    var4_4 = var18_37.j7();
                    var15_18 = var3_3 /* !! */ .itemView;
                    var30_70 = R$id.tv_pd_delivery_alert_message;
                    var15_18 = (TextView)var15_18.findViewById(var30_70);
                    var15_18.setText((CharSequence)var4_4);
                    var3_3 /* !! */  = var3_3 /* !! */ .itemView;
                    var45_88 = R$id.iv_pd_delivery_alert;
                    var3_3 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var45_88);
                    lp_0.h((ImageView)var3_3 /* !! */ );
                } else {
                    var39_82 = var1_1 instanceof sm_2;
                    if (var39_82 != 0) {
                        var3_3 /* !! */  = var1_1;
                        var3_3 /* !! */  = (sm_2)var1_1;
                        var4_4 = var18_37.A7();
                        var3_3 /* !! */ .w(var4_4);
                    } else {
                        var39_82 = var1_1 instanceof zn_1;
                        if (var39_82 != 0) {
                            var3_3 /* !! */  = CartRepo.INSTANCE;
                            var7_7 = (int)var3_3 /* !! */ .isOOSimilarEnabled();
                            if (var7_7 != 0) {
                                this.l = var2_2;
                            }
                            var4_4 = (zn_1)var4_4;
                            var15_19 = var18_37.S2();
                            var4_4.getClass();
                            Intrinsics.checkNotNull(var15_19, "null cannot be cast to non-null type kotlin.collections.List<com.ril.ajio.services.data.Cart.CartEntry>");
                            var6_6 /* !! */  = var4_4.e;
                            var8_8 = var4_4.b;
                            var18_37 = new pn_1((j82_0)var6_6 /* !! */ , (ArrayList)var15_19, (dn_1)var8_8);
                            var7_7 = (int)og1_1.b();
                            if (var7_7 != 0) {
                                var3_3 /* !! */  = var4_4.d;
                                if (var3_3 /* !! */  != null) {
                                    var3_3 /* !! */ .setAdapter((RecyclerView$f)var18_37);
                                }
                            } else {
                                var39_82 = var3_3 /* !! */ .isOOSimilarEnabled();
                                if (var39_82 != 0) {
                                    var3_3 /* !! */  = var4_4.c;
                                    if (var3_3 /* !! */  != null) {
                                        var3_3 /* !! */ .setAdapter((RecyclerView$f)var18_37);
                                    }
                                    if ((var3_3 /* !! */  = var4_4.f) != null) {
                                        var30_71 = R$string.oos_count_refresh;
                                        var7_7 = var15_19.size();
                                        var6_6 /* !! */  = var7_7;
                                        var9_9 = new Object[1];
                                        var23_59 = false;
                                        var8_8 = null;
                                        var9_9[0] = var6_6 /* !! */ ;
                                        var18_37 = hv3_0.L(var30_71, (Object[])var9_9);
                                        var3_3 /* !! */ .setText((CharSequence)var18_37);
                                    }
                                    if ((var3_3 /* !! */  = var4_4.g) != null) {
                                        var30_71 = var15_19.size();
                                        var3_3 /* !! */ .setMax(var30_71);
                                    }
                                    var39_82 = var15_19.size();
                                    var5_5 = 1;
                                    var16_28 = 1.4E-45f;
                                    if (var39_82 <= var5_5) {
                                        var3_3 /* !! */  = var4_4.g;
                                        if (var3_3 /* !! */  != null) {
                                            var5_5 = 8;
                                            var16_28 = 1.1E-44f;
                                            var3_3 /* !! */ .setVisibility(var5_5);
                                        }
                                    } else {
                                        var3_3 /* !! */  = var4_4.g;
                                        if (var3_3 /* !! */  != null) {
                                            var5_5 = 0;
                                            var16_28 = 0.0f;
                                            var15_19 = null;
                                            var3_3 /* !! */ .setVisibility(0);
                                        }
                                    }
                                    if ((var3_3 /* !! */  = var4_4.c) != null) {
                                        var15_19 = new yn_1((zn_1)var4_4);
                                        var3_3 /* !! */ .f((ViewPager2$g)var15_19);
                                    }
                                } else {
                                    var3_3 /* !! */  = var4_4.d;
                                    if (var3_3 /* !! */  != null) {
                                        var3_3 /* !! */ .setAdapter((RecyclerView$f)var18_37);
                                    }
                                }
                            }
                        } else {
                            var39_82 = var1_1 instanceof on_1;
                            if (var39_82 != 0) {
                                var3_3 /* !! */  = var1_1;
                                var3_3 /* !! */  = (on_1)var1_1;
                                var4_4 = var18_37.S2();
                                if (var8_8 != null) {
                                    var15_20 = var8_8.iterator();
                                    var13_13 = 0;
                                    var14_14 = null;
                                    while ((var7_7 = (int)var15_20.hasNext()) != 0) {
                                        var6_6 /* !! */  = var15_20.next();
                                        var7_7 = var6_6 /* !! */  instanceof CartEntry;
                                        if (var7_7 == 0) continue;
                                        var7_7 = 1;
                                        var13_13 += var7_7;
                                    }
                                } else {
                                    var13_13 = 0;
                                    var14_14 = null;
                                }
                                if ((var15_20 = var18_37.A7()) != null && (var15_20 = var15_20.getAge()) != null) {
                                    var22_56 = var15_20;
                                }
                                var3_3 /* !! */ .w(var13_13, (String)var22_56, (ArrayList)var4_4);
                            } else {
                                var39_82 = var1_1 instanceof oo_2;
                                if (var39_82 != 0) {
                                    var3_3 /* !! */  = var1_1;
                                    var3_3 /* !! */  = (oo_2)var1_1;
                                    ai0_2.t((View)var3_3 /* !! */ .b);
                                    var45_89 = R$string.redemption_options;
                                    var4_4 = hv3_0.K(var45_89);
                                    var3_3 /* !! */  = var3_3 /* !! */ .a;
                                    var3_3 /* !! */ .setText((CharSequence)var4_4);
                                    var4_4 = var3_3 /* !! */ .getLayoutParams();
                                    var15_21 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
                                    Intrinsics.checkNotNull(var4_4, var15_21);
                                    var4_4 = (LinearLayout.LayoutParams)var4_4;
                                    var5_5 = hv3_0.q(R$dimen.dp12);
                                    var30_72 = false;
                                    var40_85 = 0.0f;
                                    var18_37 = null;
                                    var4_4.setMargins(0, var5_5, 0, 0);
                                    var3_3 /* !! */ .setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                } else {
                                    var39_82 = var1_1 instanceof hn_1;
                                    var6_6 /* !! */  = "getInternalWalletDataHolder(...)";
                                    var9_9 = "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.UiCartComponent";
                                    if (var39_82 != 0) {
                                        if (var8_8 != null) {
                                            var3_3 /* !! */  = var8_8.get(var2_2);
                                        } else {
                                            var39_82 = 0;
                                            var3_3 /* !! */  = null;
                                        }
                                        var39_82 = var3_3 /* !! */  instanceof su3;
                                        if (var39_82 != 0) {
                                            var3_3 /* !! */  = var4_4;
                                            var3_3 /* !! */  = (hn_1)var4_4;
                                            if (var8_8 != null) {
                                                var21_52 /* !! */  = var8_8.get(var5_5);
                                            } else {
                                                var20_44 = false;
                                                var21_52 /* !! */  = null;
                                            }
                                            Intrinsics.checkNotNull(var21_52 /* !! */ , (String)var9_9);
                                            var21_52 /* !! */  = (su3)var21_52 /* !! */ ;
                                            var4_4 = var21_52 /* !! */ .c;
                                            Intrinsics.checkNotNullExpressionValue(var4_4, (String)var6_6 /* !! */ );
                                            var3_3 /* !! */ .x((InternalWalletDataHolder)var4_4);
                                        }
                                    } else {
                                        var39_82 = var1_1 instanceof ln_1;
                                        if (var39_82 != 0) {
                                            if (var8_8 != null) {
                                                var3_3 /* !! */  = var8_8.get(var2_2);
                                            } else {
                                                var39_82 = 0;
                                                var3_3 /* !! */  = null;
                                            }
                                            var39_82 = var3_3 /* !! */  instanceof su3;
                                            if (var39_82 != 0) {
                                                var3_3 /* !! */  = var4_4;
                                                var3_3 /* !! */  = (ln_1)var4_4;
                                                if (var8_8 != null) {
                                                    var4_4 = var8_8.get(var5_5);
                                                } else {
                                                    var45_90 = false;
                                                    var4_4 = null;
                                                }
                                                Intrinsics.checkNotNull(var4_4, (String)var9_9);
                                                var4_4 = ((su3)var4_4).c;
                                                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var6_6 /* !! */ );
                                                var3_3 /* !! */ .getClass();
                                                var15_22 = "internalWalletDataHolder";
                                                Intrinsics.checkNotNullParameter(var4_4, (String)var15_22);
                                                var5_5 = (int)var4_4.isDisable();
                                                var18_37 = var3_3 /* !! */ .f;
                                                var6_6 /* !! */  = var3_3 /* !! */ .c;
                                                var8_8 = var3_3 /* !! */ .d;
                                                var9_9 = var3_3 /* !! */ .e;
                                                var10_10 = 1065353216;
                                                var11_11 = 1.0f;
                                                if (var5_5 != 0) {
                                                    var8_8.setAlpha(var11_11);
                                                    var9_9.setAlpha(var11_11);
                                                    var15_22 = cp_1.Companion;
                                                    var5_5 = (int)km_1.b((cp$a)var15_22);
                                                    if (var5_5 == 0) {
                                                        var5_5 = 0;
                                                        var16_29 = 0.0f;
                                                        var15_22 = null;
                                                        var6_6 /* !! */ .setVisibility(0);
lbl1159:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var5_5 = 8;
                                                    var16_29 = 1.1E-44f;
                                                    var6_6 /* !! */ .setVisibility(var5_5);
                                                    ** continue;
                                                    var5_5 = 0;
                                                    var16_29 = 0.0f;
                                                    var15_22 = null;
                                                    var18_37.setOnClickListener(null);
                                                    var5_5 = 8;
                                                    var16_29 = 1.1E-44f;
                                                } else {
                                                    var15_22 = cp_1.Companion;
                                                    var5_5 = (int)km_1.b((cp$a)var15_22);
                                                    if (var5_5 != 0) {
                                                        var8_8.setAlpha(var11_11);
                                                        var9_9.setAlpha(var11_11);
lbl1177:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var5_5 = 0x3F000000;
                                                    var16_30 = 0.5f;
                                                    var8_8.setAlpha(var16_30);
                                                    var9_9.setAlpha(var16_30);
                                                    ** continue;
                                                    var5_5 = 8;
                                                    var16_30 = 1.1E-44f;
                                                    var6_6 /* !! */ .setVisibility(var5_5);
                                                    var6_6 /* !! */  = new kn_1((ln_1)var3_3 /* !! */ , (InternalWalletDataHolder)var4_4);
                                                    var18_37.setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                                                }
                                                var4_4 = var4_4.getZeroViewTitle();
                                                var9_9.setText((CharSequence)var4_4);
                                                var3_3 /* !! */  = var3_3 /* !! */ .g;
                                                var3_3 /* !! */ .setVisibility(var5_5);
                                            }
                                        } else {
                                            var39_82 = var1_1 instanceof iP;
                                            if (var39_82 != 0) {
                                                var3_3 /* !! */  = var1_1;
                                                var3_3 /* !! */  = (iP)var1_1;
                                                var4_4 = var18_37.A7();
                                                var15_23 = var18_37.G6();
                                                if ((var18_37 = var18_37.A7()) != null) {
                                                    var21_53 = var18_37.getGwpGiftEntries();
                                                } else {
                                                    var20_45 = false;
                                                    var21_53 = null;
                                                }
                                                var3_3 /* !! */ .w((Cart)var4_4, var15_23, var21_53);
                                            } else {
                                                var39_82 = var1_1 instanceof mo1_1;
                                                if (var39_82 != 0) {
                                                    var3_3 /* !! */  = var1_1;
                                                    var3_3 /* !! */  = (mo1_1)var1_1;
                                                    var4_4 = var18_37.A7();
                                                    var5_5 = this.getItemViewType(var2_2);
                                                    var3_3 /* !! */ .setData(var4_4, var5_5);
                                                } else {
                                                    var39_82 = var1_1 instanceof op_2;
                                                    if (var39_82 != 0) {
                                                        var3_3 /* !! */  = var1_1;
                                                        var3_3 /* !! */  = (op_2)var1_1;
                                                        var3_3 /* !! */ .x();
                                                    } else {
                                                        var39_82 = var1_1 instanceof un_2;
                                                        if (var39_82 != 0) {
                                                            var3_3 /* !! */  = var1_1;
                                                            var3_3 /* !! */  = (un_2)var1_1;
                                                            var4_4 = var18_37.A7();
                                                            if (var4_4 != null) {
                                                                var21_54 = var4_4.getGwpGiftEntries();
                                                            } else {
                                                                var20_46 = false;
                                                                var21_54 = null;
                                                            }
                                                            var3_3 /* !! */ .w(var21_54);
                                                        } else {
                                                            var39_82 = var1_1 instanceof im_2;
                                                            if (var39_82 != 0) {
                                                                var3_3 /* !! */  = var1_1;
                                                                var3_3 /* !! */  = (im_2)var1_1;
                                                                var4_4 = var18_37.l0();
                                                                var3_3 /* !! */ .w((CartAssuredGiftModel)var4_4);
                                                            } else {
                                                                var39_82 = var1_1 instanceof um_1;
                                                                if (var39_82 != 0) {
                                                                    var3_3 /* !! */  = var18_37.x6();
                                                                    var5_5 = (int)h40_0.Q1();
                                                                    if (var5_5 != 0) {
                                                                        if (var3_3 /* !! */  != null) {
                                                                            var21_55 = var3_3 /* !! */ .getAddressType();
                                                                        } else {
                                                                            var20_47 = false;
                                                                            var21_55 = null;
                                                                        }
                                                                        var15_24 = AddressType.Pincode;
                                                                        if (var21_55 == var15_24) {
                                                                            var22_56 = var3_3 /* !! */ .getPostalCode();
                                                                        }
                                                                    } else {
                                                                        var22_56 = var18_37.B3();
                                                                    }
                                                                    var4_4 = (um_1)var4_4;
                                                                    var4_4.w((CartDeliveryAddress)var3_3 /* !! */ , (String)var22_56);
                                                                } else {
                                                                    var39_82 = var1_1 instanceof wo_0;
                                                                    if (var39_82 != 0) {
                                                                        var3_3 /* !! */  = var1_1;
                                                                        var3_3 /* !! */  = (wo_0)var1_1;
                                                                        var4_4 = var18_37.A7();
                                                                        var3_3 /* !! */ .w((Cart)var4_4);
                                                                    } else {
                                                                        var39_82 = var1_1 instanceof yg_1;
                                                                        if (var39_82 != 0) {
                                                                            var3_3 /* !! */  = var1_1;
                                                                            var3_3 /* !! */  = (yg_1)var1_1;
                                                                            if (var8_8 != null) {
                                                                                var15_25 /* !! */  = var8_8.get(var2_2);
                                                                            } else {
                                                                                var5_5 = 0;
                                                                                var16_31 = 0.0f;
                                                                                var15_25 /* !! */  = null;
                                                                            }
                                                                            Intrinsics.checkNotNull(var15_25 /* !! */ , "null cannot be cast to non-null type com.ril.ajio.services.entity.Component");
                                                                            var15_25 /* !! */  = (Component)var15_25 /* !! */ ;
                                                                            var45_91 = yg_1.r;
                                                                            var45_91 = 0;
                                                                            var4_4 = null;
                                                                            var3_3 /* !! */ .x((Component)var15_25 /* !! */ , null, null);
                                                                        } else {
                                                                            var39_82 = var1_1 instanceof yo_1;
                                                                            if (var39_82 != 0) {
                                                                                var3_3 /* !! */  = var1_1;
                                                                                var3_3 /* !! */  = (yo_1)var1_1;
                                                                                var4_4 = var18_37.A7();
                                                                                var3_3 /* !! */ .w((Cart)var4_4);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2 = "parent";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        yn3$a yn3$a = yn3_0.a;
        Object object3 = this.j;
        Object[] objectArray = "TAG";
        Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
        yn3$a.l((String)object3);
        object3 = n3;
        boolean bl2 = true;
        Object object4 = new Object[bl2];
        ao_1 ao_12 = null;
        object4[0] = object3;
        yn3$a.a("onCreateViewHolder viewType = %s", object4);
        int n4 = og1_1.b();
        object3 = this.h;
        object4 = null;
        Object object5 = this.d;
        dn_1 dn_12 = this.f;
        en_1 en_12 = this.g;
        ao_1 ao_13 = this.c;
        String string2 = "getContext(...)";
        j82_0 j82_02 = this.b;
        String string3 = "inflate(...)";
        if (n4 != 0) {
            RecyclerView$B recyclerView$B;
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(j82_02, "onCartClickListener");
            Intrinsics.checkNotNullParameter(ao_13, "cartItemsCallback");
            object2 = "cartInfoProvider";
            Intrinsics.checkNotNullParameter(dn_12, (String)object2);
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7 && n3 != (n7 = 4) && n3 != (n7 = 5)) {
                    n7 = 6;
                    if (n3 != n7) {
                        n7 = 28;
                        if (n3 != n7) {
                            n7 = 31;
                            if (n3 != n7) {
                                n7 = 33;
                                if (n3 != n7) {
                                    block0 : switch (n3) {
                                        default: {
                                            switch (n3) {
                                                default: {
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.cart_no_view_refresh;
                                                    object = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object, string3);
                                                    recyclerView$B = new r32_0((View)object);
                                                    break block0;
                                                }
                                                case 25: {
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.item_cart_rvp;
                                                    object = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object, string3);
                                                    recyclerView$B = new yo_1(j82_02, (View)object, bl2);
                                                    break block0;
                                                }
                                                case 24: {
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.row_cart_pd_delivery_alert_luxe;
                                                    object = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object, string3);
                                                    recyclerView$B = new po_1((View)object, j82_02);
                                                    break block0;
                                                }
                                                case 23: {
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.cart_gift_with_products_row_luxe;
                                                    object = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object, string3);
                                                    recyclerView$B = new un_2((View)object, j82_02);
                                                    break block0;
                                                }
                                                case 22: {
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.item_cart_rvp;
                                                    object = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object, string3);
                                                    recyclerView$B = new yo_1(j82_02, (View)object, false);
                                                    break block0;
                                                }
                                                case 21: {
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.item_cms_banner_layout;
                                                    object = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object, string3);
                                                    recyclerView$B = new yg_1((View)object, (Av)object3);
                                                    break block0;
                                                }
                                                case 20: {
                                                    n3 = (int)(h40_0.Q1() ? 1 : 0);
                                                    if (n3 != 0) {
                                                        object2 = LayoutInflater.from((Context)object.getContext());
                                                        n4 = R$layout.row_cart_delivery_address_luxe_new;
                                                        object2 = object2.inflate(n4, (ViewGroup)object, false);
                                                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                                                        object = object.getContext();
                                                        Intrinsics.checkNotNullExpressionValue(object, string2);
                                                        recyclerView$B = new um_1(j82_02, (Context)object, (View)object2);
                                                        break block0;
                                                    }
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.row_cart_delivery_address_luxe;
                                                    object2 = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                                                    object = object.getContext();
                                                    Intrinsics.checkNotNullExpressionValue(object, string2);
                                                    recyclerView$B = new um_1(j82_02, (Context)object, (View)object2);
                                                    break block0;
                                                }
                                                case 19: {
                                                    object2 = LayoutInflater.from((Context)object.getContext());
                                                    n4 = R$layout.cart_inventory_oos_new_luxe;
                                                    object2 = object2.inflate(n4, (ViewGroup)object, false);
                                                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                                                    object = object.getContext();
                                                    Intrinsics.checkNotNullExpressionValue(object, string2);
                                                    recyclerView$B = new on_1((View)object2, j82_02, (Context)object, (nw_0)object5);
                                                    break block0;
                                                }
                                                case 18: 
                                            }
                                            object2 = LayoutInflater.from((Context)object.getContext());
                                            n4 = R$layout.row_cart_return_exchange_policy_layout_luxe;
                                            object = object2.inflate(n4, (ViewGroup)object, false);
                                            Intrinsics.checkNotNullExpressionValue(object, string3);
                                            recyclerView$B = new wo_0((View)object, j82_02, dn_12);
                                            break;
                                        }
                                        case 14: {
                                            object2 = LayoutInflater.from((Context)object.getContext());
                                            n4 = R$layout.row_cart_quality_assured_luxe;
                                            object = object2.inflate(n4, (ViewGroup)object, false);
                                            Intrinsics.checkNotNullExpressionValue(object, string3);
                                            recyclerView$B = new mo_0((View)object);
                                            break;
                                        }
                                        case 13: {
                                            object2 = LayoutInflater.from((Context)object.getContext());
                                            n4 = R$layout.cart_inventory_oos_luxe;
                                            object2 = object2.inflate(n4, (ViewGroup)object, false);
                                            Intrinsics.checkNotNullExpressionValue(object2, string3);
                                            object = object.getContext();
                                            Intrinsics.checkNotNullExpressionValue(object, string2);
                                            recyclerView$B = new zn_1((View)object2, j82_02, (Context)object, null);
                                            break;
                                        }
                                        case 12: {
                                            object2 = LayoutInflater.from((Context)object.getContext());
                                            n4 = R$layout.row_cashpoint_summary_luxe;
                                            object = object2.inflate(n4, (ViewGroup)object, false);
                                            Intrinsics.checkNotNullExpressionValue(object, string3);
                                            recyclerView$B = new mm_2((View)object, j82_02);
                                            break;
                                        }
                                        case 11: {
                                            object2 = LayoutInflater.from((Context)object.getContext());
                                            n4 = R$layout.row_cart_pricedrop_luxe;
                                            object = object2.inflate(n4, (ViewGroup)object, false);
                                            Intrinsics.checkNotNullExpressionValue(object, string3);
                                            recyclerView$B = new ho_2((View)object, j82_02);
                                            break;
                                        }
                                        case 10: {
                                            object2 = LayoutInflater.from((Context)object.getContext());
                                            n4 = R$layout.row_cart_product_luxe;
                                            object2 = object2.inflate(n4, (ViewGroup)object, false);
                                            Intrinsics.checkNotNullExpressionValue(object2, string3);
                                            object = object.getContext();
                                            Intrinsics.checkNotNullExpressionValue(object, string2);
                                            recyclerView$B = new lo_0(j82_02, (Context)object, (View)object2);
                                            break;
                                        }
                                        case 9: {
                                            object2 = LayoutInflater.from((Context)object.getContext());
                                            n4 = R$layout.row_cart_summary_luxe;
                                            object = object2.inflate(n4, (ViewGroup)object, false);
                                            Intrinsics.checkNotNullExpressionValue(object, string3);
                                            recyclerView$B = new iP((View)object, j82_02);
                                            break;
                                        }
                                    }
                                } else {
                                    object2 = LayoutInflater.from((Context)object.getContext());
                                    n4 = R$layout.pesdk_luxe_internal_wallet_zero_balance;
                                    object = object2.inflate(n4, (ViewGroup)object, false);
                                    Intrinsics.checkNotNullExpressionValue(object, string3);
                                    recyclerView$B = new ln_1((View)object, en_12);
                                }
                            } else {
                                object2 = LayoutInflater.from((Context)object.getContext());
                                n4 = R$layout.pesdk_luxe_internal_wallet_success_layout;
                                object = object2.inflate(n4, (ViewGroup)object, false);
                                Intrinsics.checkNotNullExpressionValue(object, string3);
                                object2 = ao_13.G6();
                                recyclerView$B = new hn_1((View)object, en_12, (dn_1)object2);
                            }
                        } else {
                            object2 = LayoutInflater.from((Context)object.getContext());
                            n4 = R$layout.pesdk_luxe_internal_wallet_verify_otp;
                            object = object2.inflate(n4, (ViewGroup)object, false);
                            Intrinsics.checkNotNullExpressionValue(object, string3);
                            recyclerView$B = new jn_1((View)object, en_12);
                        }
                    } else {
                        object2 = LayoutInflater.from((Context)object.getContext());
                        n4 = R$layout.row_cart_coupon_luxe;
                        object = object2.inflate(n4, (ViewGroup)object, false);
                        Intrinsics.checkNotNullExpressionValue(object, string3);
                        recyclerView$B = new sm_2((View)object, j82_02);
                    }
                } else {
                    object2 = LayoutInflater.from((Context)object.getContext());
                    n4 = R$layout.row_merges_oos_limitedstock_layout_luxe;
                    object2 = object2.inflate(n4, (ViewGroup)object, false);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    object = object.getContext();
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    recyclerView$B = new mo1_1(j82_02, (Context)object, (View)object2);
                }
            } else {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.pesdk_lux_row_title;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                recyclerView$B = new oo_2((View)object, j82_02);
            }
            return recyclerView$B;
        }
        switch (n3) {
            default: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.cart_no_view_refresh;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                r32_0 r32_02 = new r32_0((View)object);
                return r32_02;
            }
            case 33: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.pesdk_internal_wallet_zero_balance;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                ln_1 ln_12 = new ln_1((View)object, en_12);
                return ln_12;
            }
            case 31: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.pesdk_internal_wallet_success_layout;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = ao_13.G6();
                hn_1 hn_12 = new hn_1((View)object, en_12, (dn_1)object2);
                return hn_12;
            }
            case 28: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.pesdk_internal_wallet_verify_otp;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                jn_1 jn_12 = new jn_1((View)object, en_12);
                return jn_12;
            }
            case 25: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.item_cart_rvp;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                yo_1 yo_12 = new yo_1(j82_02, (View)object, bl2);
                return yo_12;
            }
            case 24: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_pd_delivery_alert;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                po_1 po_12 = new po_1((View)object, j82_02);
                return po_12;
            }
            case 23: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.cart_gift_with_products_row;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                un_2 un_22 = new un_2((View)object, j82_02);
                return un_22;
            }
            case 22: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.item_cart_rvp;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                yo_1 yo_13 = new yo_1(j82_02, (View)object, false);
                return yo_13;
            }
            case 21: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.item_cms_banner_layout;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                yg_1 yg_12 = new yg_1((View)object, (Av)object3);
                return yg_12;
            }
            case 20: {
                n3 = (int)(h40_0.Q1() ? 1 : 0);
                if (n3 != 0) {
                    object2 = LayoutInflater.from((Context)object.getContext());
                    n4 = R$layout.row_cart_delivery_address_new;
                    object2 = object2.inflate(n4, (ViewGroup)object, false);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    object = object.getContext();
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    um_1 um_12 = new um_1(j82_02, (Context)object, (View)object2);
                    return um_12;
                }
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_delivery_address;
                object2 = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object = object.getContext();
                Intrinsics.checkNotNullExpressionValue(object, string2);
                um_1 um_13 = new um_1(j82_02, (Context)object, (View)object2);
                return um_13;
            }
            case 19: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.cart_inventory_oos_new_refresh;
                object2 = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object = object.getContext();
                Intrinsics.checkNotNullExpressionValue(object, string2);
                on_1 on_12 = new on_1((View)object2, j82_02, (Context)object, (nw_0)object5);
                return on_12;
            }
            case 18: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_return_exchange_policy_layout;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                wo_0 wo_02 = new wo_0((View)object, j82_02, dn_12);
                return wo_02;
            }
            case 17: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.cart_assured_gifts;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                im_2 im_22 = new im_2((View)object, j82_02);
                return im_22;
            }
            case 15: {
                op_2 op_22;
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.cart_wishlist;
                yn3$a = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(yn3$a, string3);
                object = ao_13.Y1();
                if (object != null) {
                    object4 = ((ProductsList)object).getProducts();
                }
                objectArray = object4;
                object3 = this.d;
                object4 = this.e;
                ao_12 = this.c;
                object5 = this.i;
                object2 = op_22;
                this.m = op_22 = new op_2((View)yn3$a, (nw_0)object3, (List)objectArray, (RecyclerViewScrollListener)object4, ao_12, (hy0_0)object5);
                Intrinsics.checkNotNull(op_22, "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.viewholder.CartWishListHolder");
                return op_22;
            }
            case 14: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_quality_assured;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                mo_0 mo_02 = new mo_0((View)object);
                return mo_02;
            }
            case 13: {
                CartRepo cartRepo = CartRepo.INSTANCE;
                n3 = (int)(cartRepo.isOOSimilarEnabled() ? 1 : 0);
                n3 = n3 != 0 ? ((n3 = (int)(ao_13.i3() ? 1 : 0)) == 0 && (n3 = dn_12.H1()) != 0 ? R$layout.cart_inventory_oos_similar_oos_items_not_present : R$layout.cart_inventory_oos_similar_oos_items_present) : R$layout.cart_inventory_oos_refresh;
                cartRepo = LayoutInflater.from((Context)object.getContext()).inflate(n3, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(cartRepo, string3);
                object = object.getContext();
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object2 = new zn_1((View)cartRepo, j82_02, (Context)object, dn_12);
                return object2;
            }
            case 12: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cashpoint_summary_refresh;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                mm_2 mm_22 = new mm_2((View)object, j82_02);
                return mm_22;
            }
            case 11: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_pricedrop_refresh;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                ho_2 ho_22 = new ho_2((View)object, j82_02);
                return ho_22;
            }
            case 10: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_product_refresh;
                object2 = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object = object.getContext();
                Intrinsics.checkNotNullExpressionValue(object, string2);
                lo_0 lo_02 = new lo_0(j82_02, (Context)object, (View)object2);
                return lo_02;
            }
            case 9: {
                iP iP2;
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_summary_refresh;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                this.n = iP2 = new iP((View)object, j82_02);
                Intrinsics.checkNotNull(iP2, "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.viewholder.CartSummaryViewHolderRefresh");
                return iP2;
            }
            case 6: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_cart_coupon_refresh;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                sm_2 sm_22 = new sm_2((View)object, j82_02);
                return sm_22;
            }
            case 3: 
            case 4: 
            case 5: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_merges_oos_limitedstock_layout_refresh;
                object2 = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object = object.getContext();
                Intrinsics.checkNotNullExpressionValue(object, string2);
                mo1_1 mo1_12 = new mo1_1(j82_02, (Context)object, (View)object2);
                return mo1_12;
            }
            case 2: {
                object2 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.pesdk_row_title;
                object = object2.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                oo_2 oo_22 = new oo_2((View)object, j82_02);
                return oo_22;
            }
            case 1: 
        }
        object2 = LayoutInflater.from((Context)object.getContext());
        n4 = R$layout.row_cart_banner_refresh;
        object = object2.inflate(n4, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        cn_2 cn_22 = new cn_2((View)object);
        return cn_22;
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        super.onViewAttachedToWindow(recyclerView$B);
        boolean bl2 = recyclerView$B instanceof lo_0;
        if (bl2) {
            object = recyclerView$B;
            object = (lo_0)recyclerView$B;
            Object object2 = ((lo_0)object).G;
            if (object2 != null) {
                object2.cancel();
            }
            boolean n3 = ((lo_0)object).F;
            int n4 = 8;
            Object object3 = "dodProductLayout";
            Object object4 = null;
            if (n3) {
                long l2;
                object2 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
                long l3 = object2.getTimeInMillis();
                long l4 = l3 - (l2 = ((lo_0)object).E);
                Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object5 < 0) {
                    object2 = ((lo_0)object).C;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        boolean bl3 = false;
                        object2 = null;
                    }
                    object2.setVisibility(0);
                    boolean bl4 = true;
                    ((lo_0)object).y(bl4);
                    long l7 = ((lo_0)object).E - l3;
                    object3 = ((lo_0)object).D;
                    if (object3 == null) {
                        object3 = "dodTimerTv";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object4 = object3;
                    }
                    object3 = ((lo_0)object).a;
                    object2 = new bs0_1(l7, (TextView)object4, (cs0_2)object3);
                    ((lo_0)object).G = object2 = object2.start();
                } else {
                    object2 = ((lo_0)object).C;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object4 = object2;
                    }
                    object4.setVisibility(n4);
                    ((lo_0)object).y(false);
                }
            } else {
                object2 = ((lo_0)object).C;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object4 = object2;
                }
                object4.setVisibility(n4);
                ((lo_0)object).y(false);
            }
        }
        if (bl2 = recyclerView$B instanceof yg_1) {
            recyclerView$B = (yg_1)recyclerView$B;
            ((yg_1)recyclerView$B).w();
        }
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        super.onViewDetachedFromWindow(recyclerView$B);
        boolean bl2 = recyclerView$B instanceof lo_0;
        if (bl2) {
            recyclerView$B = (lo_0)recyclerView$B;
            string2 = ((lo_0)recyclerView$B).G;
            if (string2 != null) {
                string2.cancel();
            }
            bl2 = false;
            string2 = null;
            ((lo_0)recyclerView$B).G = null;
        }
    }

    public final void onViewRecycled(RecyclerView$B recyclerView$B) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, object);
        boolean bl2 = recyclerView$B instanceof yg_1;
        if (bl2) {
            int n3;
            recyclerView$B = new Message();
            ((Message)recyclerView$B).what = n3 = 1004;
            object = AnalyticsGAEventHandler.Companion.getInstance();
            object.sendMessage((Message)recyclerView$B);
        }
    }
}

