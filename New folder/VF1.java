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
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView$EllipsisListener;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.PlpExtendedBannerComponent;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class VF1
extends q22 {
    public List f;
    public final PlpExtendedBanner g;
    public String h;
    public String i;
    public final M82 j;
    public final Cw2 k;
    public final RecyclerViewScrollListener l;
    public final xE3 m;
    public final mf1_0 n;
    public final WA o;
    public final mg1_2 p;
    public String q;
    public boolean r;
    public String s;
    public String t;
    public final Function1 u;
    public final ChangeLocationListener v;
    public final CartDeliveryAddress w;
    public final ArrayList x;
    public final LinkedHashMap y;

    public VF1(List list, PlpExtendedBanner plpExtendedBanner, String string2, String string3, M82 m82, Cw2 cw2, RecyclerViewScrollListener recyclerViewScrollListener, xE3 xE32, mf1_0 mf1_02, WA wA, mg1_2 mg1_22, String string4, boolean bl2, String string5, String string6, yf1_0 yf1_02, ChangeLocationListener changeLocationListener, CartDeliveryAddress cartDeliveryAddress) {
        block22: {
            Iterator iterator = list;
            ArrayList<Object> arrayList = string2;
            Object object = string3;
            Object object2 = m82;
            Intrinsics.checkNotNullParameter(list, "productList");
            Intrinsics.checkNotNullParameter(string2, "title");
            Intrinsics.checkNotNullParameter(string3, "subtitle");
            Intrinsics.checkNotNullParameter(m82, "plpProductClickListener");
            Intrinsics.checkNotNullParameter(cw2, "popAndPeekListener");
            Intrinsics.checkNotNullParameter(recyclerViewScrollListener, "recyclerViewScrollListener");
            Intrinsics.checkNotNullParameter(xE32, "visualFilterToggleListener");
            Intrinsics.checkNotNullParameter(mf1_02, "luxeFooterClickListener");
            Intrinsics.checkNotNullParameter(wA, "brandDescriptionClickListener");
            Intrinsics.checkNotNullParameter(mg1_22, "luxeSaleToolbarListener");
            Intrinsics.checkNotNullParameter(yf1_02, "onBannerAdClick");
            String string7 = "changeLocationListener";
            Intrinsics.checkNotNullParameter(changeLocationListener, string7);
            this.f = list;
            iterator = plpExtendedBanner;
            this.g = plpExtendedBanner;
            this.h = string2;
            this.i = string3;
            this.j = m82;
            this.k = cw2;
            this.l = recyclerViewScrollListener;
            this.m = xE32;
            this.n = mf1_02;
            this.o = wA;
            this.p = mg1_22;
            iterator = string4;
            this.q = string4;
            this.r = bl2;
            iterator = string5;
            this.s = string5;
            iterator = string6;
            this.t = string6;
            this.u = yf1_02;
            this.v = changeLocationListener;
            iterator = cartDeliveryAddress;
            this.w = cartDeliveryAddress;
            iterator = new Iterator();
            this.y = iterator;
            iterator = z40_0.Companion;
            arrayList = AJIOApplication.Companion;
            arrayList.getClass();
            arrayList = AJIOApplication$a.a();
            iterator.getClass();
            iterator = z40$a.a((Context)arrayList);
            iterator = ((z40_0)((Object)iterator)).a;
            arrayList = "selfcarekeys";
            iterator = ((ao0_0)((Object)iterator)).b((String)((Object)arrayList));
            arrayList = new ArrayList<Object>();
            arrayList = ((TypeToken)((Object)arrayList)).getType();
            object = new Gson();
            iterator = ((Gson)object).fromJson((String)((Object)iterator), (Type)((Object)arrayList));
            iterator = (ArrayList)((Object)iterator);
            this.x = iterator;
            if (iterator == null) break block22;
            try {
                arrayList = new ArrayList<Object>();
                iterator = iterator.iterator();
            }
            catch (Exception exception) {
                arrayList = yn3_0.a;
                ((yn3$a)((Object)arrayList)).e(exception);
            }
            while (true) {
                boolean bl3 = iterator.hasNext();
                if (!bl3) break;
                object2 = object = iterator.next();
                object2 = (LuxeFooterData)object;
                boolean bl4 = ((LuxeFooterData)object2).isEnable() ^ true;
                if (bl4) continue;
                arrayList.add(object);
                continue;
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int g(int n3) {
        int n4;
        Object object;
        int n7;
        int n8;
        block11: {
            block10: {
                n8 = 1;
                n7 = n3 + -1;
                object = tr2_2.a;
                n4 = tr2_2.v(n8 != 0);
                if (n4 != 0) break block10;
                object = this.g;
                if (object == null) break block11;
                object = h40_0.a;
                n4 = h40_0.G1();
                if (n4 == 0) break block11;
            }
            n7 = n3 + -2;
        }
        if ((n3 = (int)(this.r ? 1 : 0)) != 0) {
            n7 += -1;
        }
        if ((n3 = (int)(this.a ? 1 : 0)) != 0) {
            Serializable serializable = this.d;
            object = (Number)((hh3_2)serializable).getValue();
            n4 = ((Number)object).intValue();
            int n10 = 3;
            if (n4 <= n8) {
                n4 = 3;
            } else {
                object = (Number)((hh3_2)serializable).getValue();
                n4 = ((Number)object).intValue();
            }
            n4 = n7 / n4;
            if (n4 <= 0) {
                object = (Number)((hh3_2)serializable).getValue();
                n4 = ((Number)object).intValue();
                if (n4 > n8) {
                    serializable = (Number)((hh3_2)serializable).getValue();
                    n10 = ((Number)serializable).intValue();
                }
                n3 = n7 / n10;
            } else {
                n3 = 0;
                serializable = null;
            }
            n7 -= n3;
        }
        return n7;
    }

    public final int getItemCount() {
        List list = this.f;
        int n3 = list.size();
        Object object = this.l;
        boolean bl2 = ((RecyclerViewScrollListener)object).isLastPage();
        int n4 = 1;
        if (!(bl2 ^= n4)) {
            object = this.x;
            n4 = object != null ? ((ArrayList)object).size() : 0;
        }
        return n3 + n4;
    }

    public final int getItemViewType(int n3) {
        Object object;
        Object object2 = this.f;
        int n4 = object2.size();
        if (n3 < n4) {
            object2 = ((cB2)this.f.get((int)n3)).b;
            Enum enum_ = db2_0.IS_HEADER;
            if (object2 == enum_) {
                return 8;
            }
            object2 = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_SALE_BANNER;
            if (object2 == enum_) {
                return 12;
            }
            object2 = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_PLP_EXTENDED_BANNER;
            if (object2 == enum_) {
                return 15;
            }
            object2 = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_VISUAL_FILTER;
            if (object2 == enum_) {
                return 5;
            }
            object2 = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_AUTO_CORRECT;
            int n7 = 0;
            if (object2 == enum_) {
                return 0;
            }
            object2 = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_FULL_JIO_AD_BANNER;
            int n8 = 21;
            if (object2 == enum_) {
                return n8;
            }
            object2 = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_HALF_JIO_AD_BANNER;
            if (object2 == enum_) {
                object2 = this.e;
                enum_ = Yj2.LIST;
                if (object2 == enum_) {
                    return n8;
                }
                object2 = this.f;
                Integer n10 = ((cB2)object2.get((int)n3)).e;
                if (n10 != null) {
                    n7 = n10;
                }
                n3 = (n7 %= 2) == 0 ? 24 : 20;
                return n3;
            }
            object2 = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_PRODUCT;
            if (object2 == enum_) {
                object2 = this.e;
                enum_ = Yj2.LIST;
                if (object2 == enum_ && n3 < (n4 = (object2 = this.f).size())) {
                    return 19;
                }
                object2 = this.f;
                n4 = object2.size();
                if (n3 < n4) {
                    object2 = this.f;
                    Integer n14 = ((cB2)object2.get((int)n3)).e;
                    if (n14 != null) {
                        n7 = n14;
                    }
                    n3 = (n7 %= 2) == 0 ? 6 : 7;
                    return n3;
                }
            }
            if ((object = ((cB2)this.f.get((int)n3)).b) == (object2 = db2_0.IS_ADDRESS_VIEW)) {
                return 29;
            }
        }
        n3 = (n3 = (object = this.l).isLastPage() ^ 1) != 0 ? 9 : 3;
        return n3;
    }

    public final int h(int n3) {
        List list = this.f;
        int n4 = list.size();
        int n7 = 1;
        if (n3 >= n4) {
            List list2 = this.f;
            n3 = list2.size() - n7;
        }
        n4 = 0;
        list = null;
        if (n3 >= 0) {
            int n8 = 0;
            while (true) {
                db2_0 db2_02;
                int n10;
                db2_0 db2_03;
                if ((db2_03 = ((cB2)this.f.get((int)n4)).b) != null && (n10 = ((Object)((Object)db2_03)).equals((Object)(db2_02 = db2_0.IS_PRODUCT))) == n7) {
                    ++n8;
                }
                if (n4 == n3) break;
                ++n4;
            }
            n4 = n8;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block41: {
            block50: {
                block49: {
                    block46: {
                        block48: {
                            block47: {
                                block45: {
                                    block44: {
                                        block43: {
                                            block42: {
                                                block40: {
                                                    var3_3 = 1;
                                                    var4_4 = "holder";
                                                    Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
                                                    var5_5 = var1_1 instanceof tf1_0;
                                                    var6_6 = 8;
                                                    if (var5_5 == 0) break block40;
                                                    var1_1 = (tf1_0)var1_1;
                                                    var7_7 = this.h;
                                                    var4_4 = this.i;
                                                    var8_15 = this.q;
                                                    var1_1.getClass();
                                                    Intrinsics.checkNotNullParameter(var7_7, "title");
                                                    Intrinsics.checkNotNullParameter(var4_4, "subTitle");
                                                    var9_17 = var1_1.b;
                                                    var9_17.setText((CharSequence)var7_7);
                                                    var1_1.c.setText((CharSequence)var4_4);
                                                    var7_7 = var1_1.e;
                                                    var4_4 = var1_1.d;
                                                    if (var8_15 != null && (var10_20 = var8_15.length()) != 0) {
                                                        var4_4.setEllipsesListener((AjioEllipsisTextView$EllipsisListener)var1_1);
                                                        var4_4.setVisibility(0);
                                                        var4_4.setText((CharSequence)var8_15);
                                                        var4_4 = new qo0_1(var1_1, var3_3);
                                                        var7_7.setOnClickListener((View.OnClickListener)var4_4);
                                                        var7_7.setVisibility(0);
                                                    } else {
                                                        var4_4.setVisibility(var6_6);
                                                        var7_7.setVisibility(var6_6);
                                                    }
                                                    break block41;
                                                }
                                                var5_5 = var1_1 instanceof kG1;
                                                if (var5_5 == 0) break block42;
                                                var11_22 = var1_1;
                                                var11_22 = (kG1)var1_1;
                                                var7_8 /* !! */  = ((cB2)this.f.get((int)var2_2)).a;
                                                var11_22.y(var7_8 /* !! */ );
                                                var7_8 /* !! */  = this.e;
                                                var4_4 = Yj2.LIST;
                                                if (var7_8 /* !! */  == var4_4) {
                                                    var7_8 /* !! */  = this.y;
                                                    var11_22 = var11_22.q;
                                                    Mj2.a((RecyclerView$B)var1_1, (LinkedHashMap)var7_8 /* !! */ , (RecyclerView)var11_22);
                                                }
                                                break block41;
                                            }
                                            var5_5 = var1_1 instanceof j12;
                                            if (var5_5 == 0) break block43;
                                            var1_1 = (j12)var1_1;
                                            var7_9 = this.l;
                                            var2_2 = (int)var7_9.isLastPage();
                                            var1_1.w((boolean)var2_2);
                                            break block41;
                                        }
                                        var5_5 = var1_1 instanceof of1_0;
                                        if (var5_5 == 0) break block44;
                                        var11_23 = this.x;
                                        if (var11_23 != null) {
                                            Intrinsics.checkNotNull(var11_23);
                                            var5_5 = var11_23.size() + var2_2;
                                            var2_2 = this.getItemCount();
                                            var5_5 -= var2_2;
                                            var2_2 = -1;
                                            if (var5_5 > var2_2) {
                                                Intrinsics.checkNotNull(var11_23);
                                                var2_2 = var11_23.size();
                                                if (var5_5 < var2_2) {
                                                    var1_1 = (of1_0)var1_1;
                                                    Intrinsics.checkNotNull(var11_23);
                                                    var7_10 /* !! */  = var11_23.get(var5_5);
                                                    var11_23 = "get(...)";
                                                    Intrinsics.checkNotNullExpressionValue(var7_10 /* !! */ , (String)var11_23);
                                                    var7_10 /* !! */  = (LuxeFooterData)var7_10 /* !! */ ;
                                                    var1_1.w((LuxeFooterData)var7_10 /* !! */ );
                                                    ** GOTO lbl286
                                                }
                                            }
                                        }
                                        break block41;
                                    }
                                    var5_5 = var1_1 instanceof I12;
                                    var8_16 = null;
                                    if (var5_5 == 0) break block45;
                                    var1_1 = (I12)var1_1;
                                    var7_11 = this.g;
                                    if (var7_11 != null && (var7_11 = var7_11.getData()) != null) {
                                        var8_16 = var7_11.getComponent();
                                    }
                                    var1_1.w((PlpExtendedBannerComponent)var8_16);
                                    break block41;
                                }
                                var5_5 = var1_1 instanceof rg1_0;
                                if (var5_5 == 0) break block46;
                                var4_4 = this.f;
                                var7_12 = ((cB2)var4_4.get((int)var2_2)).g;
                                if (var7_12 != null) {
                                    var4_4 = var7_12.getName();
                                } else {
                                    var5_5 = 0;
                                    var4_4 = null;
                                }
                                var5_5 = (int)"category".equalsIgnoreCase((String)var4_4);
                                var9_18 = this.c;
                                var12_27 = this.m;
                                if (var5_5 != 0) break block47;
                                if (var7_12 != null) {
                                    var4_4 = var7_12.getCode();
                                } else {
                                    var5_5 = 0;
                                    var4_4 = null;
                                }
                                var13_29 = "l1l3nestedcategory";
                                var5_5 = (int)var13_29.equalsIgnoreCase((String)var4_4);
                                if (var5_5 != 0) break block47;
                                if (var7_12 != null) {
                                    var4_4 = var7_12.getName();
                                } else {
                                    var5_5 = 0;
                                    var4_4 = null;
                                }
                                var13_29 = "brand";
                                var5_5 = (int)var13_29.equalsIgnoreCase((String)var4_4);
                                if (var5_5 != 0) ** GOTO lbl-1000
                                if (var7_12 != null) {
                                    var4_4 = var7_12.getName();
                                } else {
                                    var5_5 = 0;
                                    var4_4 = null;
                                }
                                var13_29 = "brands";
                                var5_5 = (int)var13_29.equalsIgnoreCase((String)var4_4);
                                if (var5_5 == 0) {
                                    if (var7_12 != null) {
                                        var4_4 = var7_12.getCode();
                                    } else {
                                        var5_5 = 0;
                                        var4_4 = null;
                                    }
                                    var4_4 = var9_18.get(var4_4);
                                    Intrinsics.checkNotNull(var4_4);
                                    var4_4 = ImmutableList.copyOf((Collection)var4_4);
                                    Intrinsics.checkNotNull(var4_4);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    if (var7_12 != null) {
                                        var4_4 = var7_12.getCode();
                                    } else {
                                        var5_5 = 0;
                                        var4_4 = null;
                                    }
                                    var4_4 = (ArrayList)var9_18.get(var4_4);
                                    var4_4 = var12_27.S((ArrayList)var4_4);
                                    Intrinsics.checkNotNull(var4_4);
                                    var4_4 = ImmutableList.copyOf((Collection)var4_4);
                                    Intrinsics.checkNotNull(var4_4);
                                }
                                break block48;
                            }
                            if (var7_12 != null) {
                                var4_4 = var7_12.getCode();
                            } else {
                                var5_5 = 0;
                                var4_4 = null;
                            }
                            var4_4 = (ArrayList)var9_18.get(var4_4);
                            var4_4 = var12_27.e7((ArrayList)var4_4);
                            Intrinsics.checkNotNull(var4_4);
                            var4_4 = ImmutableList.copyOf((Collection)var4_4);
                            Intrinsics.checkNotNull(var4_4);
                        }
                        var1_1 = (rg1_0)var1_1;
                        var1_1.getClass();
                        var9_18 = "facetValues";
                        Intrinsics.checkNotNullParameter(var4_4, (String)var9_18);
                        var10_21 = R$string.fs_filter_select;
                        var12_27 = var7_12 != null ? var7_12.getName() : null;
                        var11_24 = new Object[var3_3];
                        var11_24[0] = var12_27;
                        var11_24 = hv3_0.L(var10_21, (Object[])var11_24);
                        var9_18 = var1_1.c;
                        var9_18.setText((CharSequence)var11_24);
                        var11_24 = var1_1.e;
                        if (var11_24 == null) {
                            var9_18 = var1_1.a;
                            var1_1.e = var11_24 = new pG1(var7_12, (ImmutableList)var4_4, (xE3)var9_18);
                            if (var7_12 != null && (var3_3 = (int)TextUtils.isEmpty((CharSequence)(var11_24 = var7_12.getName()))) == 0) {
                                var11_24 = AnalyticsManager.Companion;
                                var12_27 = var11_24.getInstance().getGtmEvents();
                                var13_29 = var7_12.getName();
                                var14_31 = var7_12.getName();
                                if (var9_18 != null) {
                                    var15_33 = var7_12.getName();
                                    Intrinsics.checkNotNull(var15_33);
                                    var9_18 = var9_18.A2(var15_33);
                                } else {
                                    var10_21 = 0;
                                    var9_18 = null;
                                }
                                var15_33 = av_0.a((AnalyticsManager$Companion)var11_24);
                                var16_35 = new StringBuilder();
                                var16_35.append(var13_29);
                                var16_35.append("_Filter_AutoApplied");
                                var16_35.append(var14_31);
                                var16_35.append("-");
                                var16_35.append(var9_18);
                                var9_18 = h30_0.a(var16_35, "_", var15_33);
                                var13_29 = "Visual Filter Shown";
                                ak0_0.a((AnalyticsManager$Companion)var11_24, (GTMEvents)var12_27, var13_29, (String)var9_18);
                            }
                        } else {
                            Intrinsics.checkNotNull(var7_12);
                            Intrinsics.checkNotNullParameter(var7_12, "genderFacet");
                            var9_18 = "genderFacetValues";
                            Intrinsics.checkNotNullParameter(var4_4, (String)var9_18);
                            var11_24.b = var4_4;
                            var11_24.a = var7_12;
                            var11_24.notifyDataSetChanged();
                        }
                        var11_24 = var1_1.b;
                        var9_18 = var1_1.e;
                        var11_24.setAdapter((RecyclerView$f)var9_18);
                        var1_1.f = var7_12;
                        if (var7_12 != null) {
                            var11_24 = var7_12.getValues();
                        } else {
                            var3_3 = 0;
                            var11_24 = null;
                        }
                        var9_18 = var1_1.d;
                        if (var11_24 == null) ** GOTO lbl-1000
                        var3_3 = var4_4.size();
                        if (var3_3 > (var17_37 = var1_1.g)) ** GOTO lbl-1000
                        var1_1 = var7_12.getValues();
                        if (var1_1 != null) {
                            var17_37 = var1_1.size();
                            var8_16 = var17_37;
                        }
                        Intrinsics.checkNotNull(var8_16);
                        var17_37 = var8_16.intValue();
                        var2_2 = var4_4.size();
                        if (var17_37 > var2_2) lbl-1000:
                        // 2 sources

                        {
                            var9_18.setVisibility(0);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_18.setVisibility(var6_6);
                        }
                        break block41;
                    }
                    var2_2 = var1_1 instanceof as;
                    if (var2_2 == 0) break block49;
                    var1_1 = (as)var1_1;
                    var7_13 = this.s;
                    var11_25 = this.t;
                    var1_1.w(var7_13, var11_25);
                    break block41;
                }
                var2_2 = var1_1 instanceof yF1;
                if (var2_2 == 0) break block50;
                var1_1 = ((yF1)var1_1).a;
                var1_1.c();
                break block41;
            }
            var2_2 = var1_1 instanceof W4;
            if (var2_2 == 0) break block41;
            var7_14 = this.w;
            if (var7_14 != null) {
                var11_26 = var7_14.getCompleteAddress();
            } else {
                var3_3 = 0;
                var11_26 = null;
            }
            if (var7_14 != null) {
                var8_16 = var7_14.getDistrict();
            }
            var4_4 = ", ";
            var13_30 = n1.a((String)var11_26, (String)var4_4, (String)var8_16);
            var9_19 = var1_1;
            var9_19 = (W4)var1_1;
            if (var7_14 != null && (var1_1 = var7_14.getAddressType()) != null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var1_1 = AddressType.None;
            ** while (true)
            var12_28 = var1_1;
            var1_1 = od3_2.a;
            var17_38 = var1_1.length();
            if (var17_38 > 0) {
                var1_1 = od3_2.a;
lbl272:
                // 3 sources

                while (true) {
                    continue;
                    break;
                }
            }
            AJIOApplication.Companion.getClass();
            var11_26 = AJIOApplication$a.a();
            var1_1 = new jo_2((Context)var11_26);
            if ((var1_1 = var1_1.k()) != null) ** GOTO lbl272
            var1_1 = ld3_2.STORE_AJIO.getStoreId();
            ** while (true)
            var14_32 = var1_1;
            var1_1 = "";
            var15_34 = var7_14 != null && (var11_26 = var7_14.getPostalCode()) != null ? var11_26 : var1_1;
            var16_36 = var7_14 != null && (var7_14 = var7_14.getFirstName()) != null ? var7_14 : var1_1;
            var9_19.w((AddressType)var12_28, var13_30, (String)var14_32, (String)var15_34, (String)var16_36);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(object, "parent");
        Object object2 = null;
        Object object3 = "inflate(...)";
        if (n3 != 0) {
            int n4 = 3;
            if (n3 != n4) {
                n4 = 12;
                if (n3 != n4) {
                    n4 = 15;
                    if (n3 != n4) {
                        n4 = 24;
                        Function1 function1 = this.u;
                        if (n3 != n4) {
                            n4 = 29;
                            if (n3 != n4) {
                                n4 = 1;
                                Object object4 = "getContext(...)";
                                block0 : switch (n3) {
                                    default: {
                                        switch (n3) {
                                            default: {
                                                function1 = LayoutInflater.from((Context)object.getContext());
                                                int n7 = R$layout.luxe_plp_product_row_view;
                                                View view = function1.inflate(n7, (ViewGroup)object, false);
                                                Intrinsics.checkNotNullExpressionValue(view, (String)object3);
                                                Context context = object.getContext();
                                                Intrinsics.checkNotNullExpressionValue(context, (String)object4);
                                                object = tr2_2.a;
                                                boolean bl2 = tr2_2.t(n4 != 0);
                                                M82 m82 = this.j;
                                                Cw2 cw2 = this.k;
                                                RecyclerView$B recyclerView$B2 = recyclerView$B;
                                                recyclerView$B = new kG1(view, context, m82, cw2, bl2);
                                                break block0;
                                            }
                                            case 21: {
                                                recyclerView$B = LayoutInflater.from((Context)object.getContext());
                                                int n8 = R$layout.full_ads_banner;
                                                object = recyclerView$B.inflate(n8, (ViewGroup)object, false);
                                                Intrinsics.checkNotNull(object);
                                                recyclerView$B = new wv_0((View)object, n4 != 0, function1);
                                                break block0;
                                            }
                                            case 20: {
                                                recyclerView$B = LayoutInflater.from((Context)object.getContext());
                                                int n10 = R$layout.half_banner_ad_even;
                                                object = recyclerView$B.inflate(n10, (ViewGroup)object, false);
                                                Intrinsics.checkNotNull(object);
                                                recyclerView$B = new wv_0((View)object, false, function1);
                                                break block0;
                                            }
                                            case 19: 
                                        }
                                        function1 = LayoutInflater.from((Context)object.getContext());
                                        int n14 = R$layout.luxe_plp_multi_image_product_row_view;
                                        View view = function1.inflate(n14, (ViewGroup)object, false);
                                        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
                                        Context context = object.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context, (String)object4);
                                        object = tr2_2.a;
                                        boolean bl3 = tr2_2.v(n4 != 0);
                                        Yj2 yj2 = Yj2.LIST;
                                        M82 m82 = this.j;
                                        Cw2 cw2 = this.k;
                                        object4 = recyclerView$B;
                                        recyclerView$B = new kG1(view, context, m82, cw2, bl3, yj2);
                                        break;
                                    }
                                    case 9: {
                                        recyclerView$B = LayoutInflater.from((Context)object.getContext());
                                        int n15 = R$layout.plp_footer_row_view;
                                        object = recyclerView$B.inflate(n15, (ViewGroup)object, false);
                                        Intrinsics.checkNotNull(object);
                                        recyclerView$B = new j12((View)object);
                                        break;
                                    }
                                    case 8: {
                                        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                                        int n16 = R$layout.luxe_plp_header_row_view;
                                        object = layoutInflater.inflate(n16, object, false);
                                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                                        object2 = this.o;
                                        recyclerView$B = new tf1_0((View)object, (WA)object2);
                                        break;
                                    }
                                    case 7: {
                                        function1 = LayoutInflater.from((Context)object.getContext());
                                        int n17 = R$layout.luxe_plp_product_row_even;
                                        object2 = function1.inflate(n17, (ViewGroup)object, false);
                                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                                        function1 = object.getContext();
                                        Intrinsics.checkNotNullExpressionValue(function1, (String)object4);
                                        object = tr2_2.a;
                                        boolean bl4 = tr2_2.v(n4 != 0);
                                        object4 = this.j;
                                        Cw2 cw2 = this.k;
                                        object3 = recyclerView$B;
                                        Object object5 = object2;
                                        recyclerView$B = new kG1((View)object2, (Context)function1, (M82)object4, cw2, bl4);
                                        break;
                                    }
                                    case 6: {
                                        function1 = LayoutInflater.from((Context)object.getContext());
                                        int n18 = R$layout.luxe_plp_product_row_odd;
                                        View view = function1.inflate(n18, (ViewGroup)object, false);
                                        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
                                        Context context = object.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context, (String)object4);
                                        object = tr2_2.a;
                                        boolean bl5 = tr2_2.v(n4 != 0);
                                        M82 m82 = this.j;
                                        Cw2 cw2 = this.k;
                                        RecyclerView$B recyclerView$B3 = recyclerView$B;
                                        recyclerView$B = new kG1(view, context, m82, cw2, bl5);
                                        break;
                                    }
                                    case 5: {
                                        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                                        int n19 = R$layout.luxe_plp_visual_filter_row_view;
                                        object2 = layoutInflater.inflate(n19, object, false);
                                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                                        object = object.getContext();
                                        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                                        object3 = this.m;
                                        recyclerView$B = new rg1_0((View)object2, (Context)object, (xE3)object3);
                                        break;
                                    }
                                }
                            } else {
                                LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                                int n20 = R$layout.address_bar_ui;
                                object = layoutInflater.inflate(n20, object, false);
                                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                                object2 = this.v;
                                recyclerView$B = new W4((View)object, (ChangeLocationListener)object2);
                            }
                        } else {
                            recyclerView$B = LayoutInflater.from((Context)object.getContext());
                            int n21 = R$layout.half_banner_ad_odd;
                            object = recyclerView$B.inflate(n21, (ViewGroup)object, false);
                            Intrinsics.checkNotNull(object);
                            recyclerView$B = new wv_0((View)object, false, function1);
                        }
                    } else {
                        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                        int n22 = R$layout.plp_banner_row_layout;
                        object = layoutInflater.inflate(n22, object, false);
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        recyclerView$B = new I12((View)object);
                    }
                } else {
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                    int n24 = R$layout.layout_sale_header_plp_luxe;
                    object = layoutInflater.inflate(n24, object, false);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    object2 = this.p;
                    recyclerView$B = new yF1((View)object, (mg1_2)object2);
                }
            } else {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                int n25 = R$layout.luxe_footer_layout;
                object = layoutInflater.inflate(n25, object, false);
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                object2 = this.n;
                recyclerView$B = new of1_0((View)object, (mf1_0)object2);
            }
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
            int n26 = R$layout.plp_auto_correct_row_view;
            object = layoutInflater.inflate(n26, object, false);
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            recyclerView$B = new as((View)object);
        }
        return recyclerView$B;
    }

    public final void onViewAttachedToWindow(RecyclerView$B object) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewAttachedToWindow((RecyclerView$B)object);
        boolean bl2 = object instanceof j12;
        if (bl2) {
            object2 = this.l;
            bl2 = ((RecyclerViewScrollListener)object2).isLastPage();
            if (!bl2) {
                object = ((j12)object).a;
                hv3_0.p0((ShimmerFrameLayout)((Object)object));
            }
        } else {
            boolean bl3 = object instanceof yF1;
            if (bl3) {
                object = this.p;
                object.E9();
            }
        }
    }

    public final void onViewDetachedFromWindow(RecyclerView$B object) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewDetachedFromWindow((RecyclerView$B)object);
        boolean bl2 = object instanceof j12;
        if (bl2) {
            object2 = this.l;
            bl2 = ((RecyclerViewScrollListener)object2).isLastPage();
            if (!bl2) {
                object = ((j12)object).a;
                hv3_0.s0((ShimmerFrameLayout)((Object)object));
            }
        } else {
            boolean bl3 = object instanceof yF1;
            if (bl3) {
                object = this.p;
                object.Ja();
            }
        }
    }

    public final void onViewRecycled(RecyclerView$B object) {
        Object object2;
        Object object3 = "holder";
        Intrinsics.checkNotNullParameter(object, object3);
        super.onViewRecycled((RecyclerView$B)object);
        int n3 = object instanceof kG1;
        if (n3 != 0 && (object3 = this.e) == (object2 = Yj2.LIST)) {
            object = (kG1)object;
            n3 = ((RecyclerView$B)object).getLayoutPosition();
            object2 = this.y;
            object3 = n3;
            object = ((kG1)object).q;
            object = object != null && (object = ((RecyclerView)object).getLayoutManager()) != null ? ((RecyclerView$o)object).onSaveInstanceState() : null;
            object2.put(object3, object);
        }
    }
}

