/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView$EllipsisListener;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.pdprefresh.data.AjiogramInterventions;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.PlpExtendedBannerComponent;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.entity.BannerAdData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from oa
 */
public final class oa_1
extends B5 {
    public final ChangeLocationListener A;
    public final CartDeliveryAddress B;
    public final AjiogramInterventions C;
    public List D;
    public final LinkedHashMap E;
    public List f;
    public final bv2_0 g;
    public final PlpExtendedBanner h;
    public final M82 i;
    public final Cw2 j;
    public final xE3 k;
    public final RecyclerViewScrollListener l;
    public final WA m;
    public final Pj2 n;
    public String o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public String t;
    public String u;
    public final Function1 v;
    public final Function0 w;
    public final mu1_1 x;
    public ma_2 y;
    public final yv2_1 z;

    public oa_1(List list, bv2_0 bv2_02, PlpExtendedBanner plpExtendedBanner, M82 m82, Cw2 cw2, xE3 xE32, RecyclerViewScrollListener recyclerViewScrollListener, WA wA, Pj2 pj2, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, Ba ba4, Ca ca2, mu1_1 mu1_12, ma_2 ma_22, yv2_1 yv2_12, ChangeLocationListener changeLocationListener, CartDeliveryAddress cartDeliveryAddress, AjiogramInterventions ajiogramInterventions) {
        LinkedHashMap linkedHashMap = list;
        Intrinsics.checkNotNullParameter(list, "productList");
        Intrinsics.checkNotNullParameter(bv2_02, "plpDelegate");
        Intrinsics.checkNotNullParameter(m82, "plpProductClickListener");
        Intrinsics.checkNotNullParameter(cw2, "popAndPeekListener");
        Intrinsics.checkNotNullParameter(xE32, "visualFilterToggleListener");
        Intrinsics.checkNotNullParameter(recyclerViewScrollListener, "recyclerViewScrollListener");
        Intrinsics.checkNotNullParameter(wA, "brandDescriptionClickListener");
        Intrinsics.checkNotNullParameter(pj2, "plpInfoProvider");
        Intrinsics.checkNotNullParameter(ba4, "onBannerAdClick");
        Intrinsics.checkNotNullParameter(ca2, "onSearchClick");
        Intrinsics.checkNotNullParameter(yv2_12, "quickFiltersItemClicked");
        Intrinsics.checkNotNullParameter(changeLocationListener, "changeLocationListener");
        this.f = list;
        this.g = bv2_02;
        linkedHashMap = plpExtendedBanner;
        this.h = plpExtendedBanner;
        this.i = m82;
        this.j = cw2;
        this.k = xE32;
        this.l = recyclerViewScrollListener;
        this.m = wA;
        this.n = pj2;
        linkedHashMap = string2;
        this.o = string2;
        linkedHashMap = string3;
        this.p = string3;
        linkedHashMap = string4;
        this.q = string4;
        linkedHashMap = string5;
        this.r = string5;
        this.s = bl2;
        linkedHashMap = string6;
        this.t = string6;
        linkedHashMap = string7;
        this.u = string7;
        this.v = ba4;
        this.w = ca2;
        linkedHashMap = mu1_12;
        this.x = mu1_12;
        linkedHashMap = ma_22;
        this.y = ma_22;
        this.z = yv2_12;
        this.A = changeLocationListener;
        linkedHashMap = cartDeliveryAddress;
        this.B = cartDeliveryAddress;
        linkedHashMap = ajiogramInterventions;
        this.C = ajiogramInterventions;
        this.E = linkedHashMap = new LinkedHashMap();
    }

    public final int g(int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        Object object;
        Object object2;
        int n14;
        Object object3;
        block19: {
            Object object4;
            String string2;
            block18: {
                object3 = this.g;
                Object object5 = (Object[])((bv2_0)object3).N1.keySet();
                n14 = 0;
                object2 = null;
                object = new Integer[]{};
                object5 = object5.toArray((T[])object);
                object = n3;
                n10 = ((Integer[])object5).length;
                string2 = "<this>";
                Intrinsics.checkNotNullParameter(object5, string2);
                n8 = Arrays.binarySearch((Object[])object5, 0, n10, object);
                if (n8 < 0) {
                    if ((n8 = -n8 + -2) >= 0) {
                        object5 = object5[n8];
                        n7 = (Integer)object5;
                    } else {
                        n7 = 0;
                        object5 = null;
                    }
                } else {
                    object5 = object5[n8];
                    n7 = (Integer)object5;
                }
                object = ((bv2_0)object3).N1;
                object5 = n7;
                object5 = (Integer)((LinkedHashMap)object).get(object5);
                if (object5 != null) {
                    n7 = (Integer)object5;
                } else {
                    n7 = 0;
                    object5 = null;
                }
                object = this.f;
                n10 = 10;
                if (n3 < n10) {
                    n10 = n3;
                }
                if ((n10 = (object = (Iterable)object.subList(0, n10)) instanceof Collection) == 0) break block18;
                object4 = object;
                object4 = (Collection)object;
                n10 = (int)(object4.isEmpty() ? 1 : 0);
                if (n10 != 0) break block19;
            }
            object = ((Iterable)object).iterator();
            while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                db2_0 db2_02;
                object4 = (cB2)object.next();
                n4 = 0;
                string2 = null;
                Object object6 = object4 != null ? ((cB2)object4).a : null;
                if (object6 != null || (object6 = object4 != null ? ((cB2)object4).b : null) == (db2_02 = db2_0.IS_VISUAL_FILTER) || (object6 = object4 != null ? ((cB2)object4).b : null) == (db2_02 = db2_0.IS_FILTER_NUDGE) || (object6 = object4 != null ? ((cB2)object4).b : null) == (db2_02 = db2_0.IS_FULL_JIO_AD_BANNER)) continue;
                if (object4 != null) {
                    object4 = ((cB2)object4).b;
                } else {
                    n10 = 0;
                    object4 = null;
                }
                if (object4 == (object6 = db2_0.IS_HALF_JIO_AD_BANNER) || ++n14 >= 0) continue;
                xx_2.m();
                throw null;
            }
        }
        n3 -= n14;
        n14 = (int)(this.a ? 1 : 0);
        if ((n14 != 0 || (object2 = this.n.m5()) == (object = BE3.FILTER_NUDGE)) && (n14 = (int)(this.s ? 1 : 0)) == 0) {
            object2 = this.d;
            object = (Number)((hh3_2)object2).getValue();
            n8 = ((Number)object).intValue();
            n10 = 3;
            n4 = 1;
            if (n8 <= n4) {
                n8 = 3;
            } else {
                object = (Number)((hh3_2)object2).getValue();
                n8 = ((Number)object).intValue();
            }
            n8 = n3 / n8;
            int n15 = ((bv2_0)object3).P1;
            if (n8 <= n15) {
                object3 = (Number)((hh3_2)object2).getValue();
                n15 = ((Number)object3).intValue();
                if (n15 > n4) {
                    object3 = (Number)((hh3_2)object2).getValue();
                    n10 = ((Number)object3).intValue();
                }
                n15 = n3 / n10;
            }
            n3 -= n15;
        }
        return n3 - n7;
    }

    public final int getItemCount() {
        return this.f.size() + 1;
    }

    public final int getItemViewType(int n3) {
        Object object = this.f;
        int n4 = object.size();
        if (n3 < n4) {
            object = ((cB2)this.f.get((int)n3)).b;
            Enum enum_ = db2_0.IS_IMAGE_SEARCH;
            if (object == enum_) {
                return 25;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_QUICK_FILTER_WIDGET;
            if (object == enum_) {
                return 28;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_SEARCH_WIDGET;
            if (object == enum_) {
                return 26;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_VIDEO_BANNER;
            if (object == enum_) {
                return 27;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_AUTO_CORRECT;
            int n7 = 0;
            if (object == enum_) {
                return 0;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_BRAND_DESCRIPTION;
            if (object == enum_) {
                return 10;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_CMS_BANNER;
            if (object == enum_) {
                return 17;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_PLP_EXTENDED_BANNER;
            if (object == enum_) {
                return 15;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_NEW_USER_BANNER;
            if (object == enum_ && (object = ((cB2)this.f.get((int)n3)).d) != null && (n4 = object.length()) != 0) {
                return 11;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_FILTER_NUDGE;
            if (object == enum_) {
                return 14;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_VISUAL_FILTER;
            if (object == enum_) {
                return 5;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_REVIEW_BANNER;
            if (object == enum_) {
                return 22;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_FULL_JIO_AD_BANNER;
            int n8 = 21;
            if (object == enum_) {
                return n8;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_HALF_JIO_AD_BANNER;
            if (object == enum_) {
                object = this.e;
                enum_ = Yj2.LIST;
                if (object == enum_) {
                    return n8;
                }
                object = this.f;
                Integer n10 = ((cB2)object.get((int)n3)).e;
                if (n10 != null) {
                    n7 = n10;
                }
                n3 = (n7 %= 2) == 0 ? 24 : 20;
                return n3;
            }
            object = ((cB2)this.f.get((int)n3)).b;
            enum_ = db2_0.IS_PRODUCT;
            if (object == enum_) {
                object = this.e;
                enum_ = Yj2.LIST;
                if (object == enum_ && n3 < (n4 = (object = this.f).size())) {
                    return 19;
                }
                object = this.f;
                n4 = object.size();
                if (n3 < n4) {
                    object = this.f;
                    Integer n14 = ((cB2)object.get((int)n3)).e;
                    if (n14 != null) {
                        n7 = n14;
                    }
                    n3 = (n7 %= 2) == 0 ? 6 : 7;
                    return n3;
                }
            }
        }
        return 3;
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
                Object object;
                if ((object = (cB2)this.f.get(n4)) != null && (object = ((cB2)object).b) != null && (n10 = object.equals((Object)(db2_02 = db2_0.IS_PRODUCT))) == n7) {
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
        block80: {
            block96: {
                block95: {
                    block94: {
                        block93: {
                            block92: {
                                block91: {
                                    block90: {
                                        block89: {
                                            block88: {
                                                block87: {
                                                    block86: {
                                                        block82: {
                                                            block85: {
                                                                block84: {
                                                                    block83: {
                                                                        block81: {
                                                                            block79: {
                                                                                var3_3 = var1_1;
                                                                                var4_4 = var2_2;
                                                                                var5_5 = 1;
                                                                                var6_6 = false;
                                                                                var7_7 = null;
                                                                                var8_8 /* !! */  = "viewHolder";
                                                                                Intrinsics.checkNotNullParameter(var1_1, (String)var8_8 /* !! */ );
                                                                                var9_9 = var1_1 instanceof Ae1;
                                                                                if (var9_9 == 0) break block79;
                                                                                var3_3 = (Ae1)var1_1;
                                                                                var10_10 = this.t;
                                                                                var8_8 /* !! */  = this.u;
                                                                                var3_3.getClass();
                                                                                if (var10_10 != null) {
                                                                                    he3_1.Companion.getClass();
                                                                                    var10_10 = he3$a_0.b(var10_10);
                                                                                    var11_25 = var3_3.a;
                                                                                    var11_25.setText((CharSequence)var10_10);
                                                                                }
                                                                                if (var8_8 /* !! */  != null) {
                                                                                    he3_1.Companion.getClass();
                                                                                    var10_10 = he3$a_0.b((String)var8_8 /* !! */ );
                                                                                    var3_3 = var3_3.b;
                                                                                    var3_3.setText((CharSequence)var10_10);
                                                                                }
                                                                                break block80;
                                                                            }
                                                                            var9_9 = var1_1 instanceof uj2_0;
                                                                            var11_26 /* !! */  = this.g;
                                                                            var12_27 /* !! */  = "";
                                                                            if (var9_9 == 0) break block81;
                                                                            var3_3 = (uj2_0)var1_1;
                                                                            var8_8 /* !! */  = var11_26 /* !! */ .r;
                                                                            if (var8_8 /* !! */  != null && (var8_8 /* !! */  = var8_8 /* !! */ .getName()) != null) {
                                                                                var12_27 /* !! */  = var8_8 /* !! */ ;
                                                                            }
                                                                            var3_3.getClass();
                                                                            Intrinsics.checkNotNullParameter(var12_27 /* !! */ , "brandName");
                                                                            var8_8 /* !! */  = var3_3.b;
                                                                            if (var8_8 /* !! */  != null) {
                                                                                var8_8 /* !! */ .setOnClickListener((View.OnClickListener)var3_3);
                                                                            }
                                                                            var8_8 /* !! */  = StringsKt.m0((CharSequence)var12_27 /* !! */ ).toString();
                                                                            var3_3 = var3_3.c;
                                                                            if (var8_8 /* !! */  != null && (var9_9 = var8_8 /* !! */ .length()) != 0) {
                                                                                if (var3_3 != null) {
                                                                                    var8_8 /* !! */  = StringCompanionObject.INSTANCE;
                                                                                    var9_9 = R$string.search_in;
                                                                                    var8_8 /* !! */  = hv3_0.K(var9_9);
                                                                                    var11_26 /* !! */  = new Object[var5_5];
                                                                                    var11_26 /* !! */ [0] = var12_27 /* !! */ ;
                                                                                    var12_27 /* !! */  = "format(...)";
                                                                                    zn0_1.b((Object[])var11_26 /* !! */ , var5_5, (String)var8_8 /* !! */ , (String)var12_27 /* !! */ , (TextView)var3_3);
                                                                                }
                                                                            } else if (var3_3 != null) {
                                                                                var5_5 = R$string.search_hint_home;
                                                                                var10_11 = hv3_0.K(var5_5);
                                                                                var3_3.setText((CharSequence)var10_11);
                                                                            }
                                                                            break block80;
                                                                        }
                                                                        var9_9 = var1_1 instanceof xj2_0;
                                                                        var13_28 = 0;
                                                                        var14_29 /* !! */  = null;
                                                                        if (var9_9 == 0) break block82;
                                                                        var1_1.setIsRecyclable(false);
                                                                        var3_3 = (xj2_0)var1_1;
                                                                        var8_8 /* !! */  = var11_26 /* !! */ .r;
                                                                        if (var8_8 /* !! */  == null) break block83;
                                                                        var3_3.getClass();
                                                                        var11_26 /* !! */  = var8_8 /* !! */ .getPageHeader();
                                                                        if (var11_26 /* !! */  != null) break block84;
                                                                    }
                                                                    var11_26 /* !! */  = var12_27 /* !! */ ;
                                                                }
                                                                var3_3.l = var11_26 /* !! */ ;
                                                                if (var8_8 /* !! */  == null || (var11_26 /* !! */  = var8_8 /* !! */ .getImage()) == null) {
                                                                    var11_26 /* !! */  = var12_27 /* !! */ ;
                                                                }
                                                                var3_3.s = var11_26 /* !! */ ;
                                                                if (var8_8 /* !! */  != null && (var8_8 /* !! */  = var8_8 /* !! */ .getMetaData()) != null) {
                                                                    var8_8 /* !! */  = var8_8 /* !! */ .getBrandPageHeaderMediaType();
                                                                } else {
                                                                    var9_9 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                var9_9 = (int)Intrinsics.areEqual(var8_8 /* !! */ , "IMAGE");
                                                                var11_26 /* !! */  = "videoConstraintView";
                                                                var15_30 = "imgVolume";
                                                                var16_37 = "ivDiscoverBrand";
                                                                var4_4 = 17170445;
                                                                if (var9_9 == 0) break block85;
                                                                var8_8 /* !! */  = var3_3.g;
                                                                if (var8_8 /* !! */  == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var11_26 /* !! */ );
                                                                    var9_9 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                ai0_2.i((View)var8_8 /* !! */ );
                                                                var8_8 /* !! */  = var3_3.i;
                                                                if (var8_8 /* !! */  == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var16_37);
                                                                    var9_9 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                ai0_2.B((View)var8_8 /* !! */ );
                                                                var8_8 /* !! */  = var3_3.d;
                                                                if (var8_8 /* !! */  == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_30);
                                                                    var9_9 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                ai0_2.i((View)var8_8 /* !! */ );
                                                                var8_8 /* !! */  = new da$a();
                                                                var8_8 /* !! */ .k = var5_5;
                                                                var8_8 /* !! */ .a = var4_4;
                                                                var8_8 /* !! */ .b = var4_4;
                                                                var10_12 = var3_3.l;
                                                                var3_3 = var3_3.i;
                                                                if (var3_3 == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var16_37);
                                                                } else {
                                                                    var14_29 /* !! */  = var3_3;
                                                                }
                                                                var8_8 /* !! */ .n = var10_12;
                                                                var8_8 /* !! */ .u = var14_29 /* !! */ ;
                                                                var8_8 /* !! */ .a();
                                                                break block80;
                                                            }
                                                            var8_8 /* !! */  = var3_3.i;
                                                            if (var8_8 /* !! */  == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var16_37);
                                                                var9_9 = 0;
                                                                var8_8 /* !! */  = null;
                                                            }
                                                            ai0_2.i((View)var8_8 /* !! */ );
                                                            var8_8 /* !! */  = var3_3.d;
                                                            if (var8_8 /* !! */  == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var15_30);
                                                                var9_9 = 0;
                                                                var8_8 /* !! */  = null;
                                                            }
                                                            ai0_2.B((View)var8_8 /* !! */ );
                                                            var8_8 /* !! */  = var3_3.g;
                                                            if (var8_8 /* !! */  == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_26 /* !! */ );
                                                                var9_9 = 0;
                                                                var8_8 /* !! */  = null;
                                                            }
                                                            ai0_2.B((View)var8_8 /* !! */ );
                                                            var8_8 /* !! */  = new da$a();
                                                            var8_8 /* !! */ .k = var5_5;
                                                            var8_8 /* !! */ .a = var4_4;
                                                            var8_8 /* !! */ .b = var4_4;
                                                            var10_13 = var3_3.s;
                                                            var11_26 /* !! */  = var3_3.h;
                                                            if (var11_26 /* !! */  == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                                                                var17_41 = 0;
                                                                var11_26 /* !! */  = null;
                                                            }
                                                            var8_8 /* !! */ .n = var10_13;
                                                            var8_8 /* !! */ .u = var11_26 /* !! */ ;
                                                            var8_8 /* !! */ .a();
                                                            var18_46 /* !! */  = null;
                                                            var19_47 = 0;
                                                            var20_48 = null;
                                                            var21_52 /* !! */  = null;
                                                            var22_55 = null;
                                                            var23_58 = false;
                                                            var24_61 = null;
                                                            var25_64 = false;
                                                            var26_66 = 255;
                                                            var27_67 = var10_13;
                                                            var3_3.c = var10_13 = new sb3_2(null, null, null, false, 0.0f, null, null, var26_66);
                                                            var10_13 = var3_3.n;
                                                            if (var10_13 != null) {
                                                                var10_13 = var10_13.c();
                                                                var8_8 /* !! */  = Boolean.TRUE;
                                                                var6_6 = Intrinsics.areEqual(var10_13, var8_8 /* !! */ );
                                                            }
                                                            if ((var10_13 = var3_3.c) != null) {
                                                                var10_13.d = var6_6;
                                                            }
                                                            var3_3.j = var6_6;
                                                            var10_13 = var3_3.b;
                                                            if (var10_13 == null) ** GOTO lbl-1000
                                                            var8_8 /* !! */  = var3_3.l;
                                                            var17_41 = var3_3.getLayoutPosition();
                                                            var8_8 /* !! */  = ow_0.c(var17_41, (String)var8_8 /* !! */ );
                                                            if (var8_8 /* !! */  != null) {
                                                                var18_46 /* !! */  = var8_8 /* !! */ ;
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var18_46 /* !! */  = var12_27 /* !! */ ;
                                                            }
                                                            if (var10_13 != null) {
                                                                var19_47 = var3_3.getLayoutPosition();
                                                                var8_8 /* !! */  = var3_3.f;
                                                                if (var8_8 /* !! */  == null) {
                                                                    var8_8 /* !! */  = "playerView";
                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                                                                    var21_52 /* !! */  = null;
                                                                } else {
                                                                    var21_52 /* !! */  = var8_8 /* !! */ ;
                                                                }
                                                                var22_55 = var3_3.l;
                                                                var8_8 /* !! */  = var3_3.c;
                                                                var26_66 = 8;
                                                                var23_58 = false;
                                                                var24_61 = null;
                                                                var27_67 = var10_13;
                                                                ma_2.i((ma_2)var10_13, var19_47, (PlayerView)var21_52 /* !! */ , var22_55, null, (pb_2)var3_3, (String)var18_46 /* !! */ , (sb3_2)var8_8 /* !! */ , var26_66);
                                                            }
                                                            if ((var9_9 = (int)var3_3.j) != 0) {
                                                                var8_8 /* !! */  = var3_3.d;
                                                                if (var8_8 /* !! */  == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_30);
                                                                    var9_9 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                var11_26 /* !! */  = var3_3.itemView.getContext();
                                                                var28_71 = R$drawable.ic_pdp_video_unmute;
                                                                var11_26 /* !! */  = xn.a(var11_26 /* !! */ , var28_71);
                                                                var8_8 /* !! */ .setImageDrawable((Drawable)var11_26 /* !! */ );
                                                                var3_3 = var3_3.d;
                                                                if (var3_3 == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_30);
                                                                } else {
                                                                    var14_29 /* !! */  = var3_3;
                                                                }
                                                                var29_75 = R$string.video_unmute;
                                                                var3_3 = hv3_0.K(var29_75);
                                                                var14_29 /* !! */ .setContentDescription((CharSequence)var3_3);
                                                                if (var10_13 != null) {
                                                                    var29_75 = var10_13.r;
                                                                    var3_3 = var10_13.a(var29_75);
                                                                    ma_2.p((ma_2)var10_13, (ExoPlayer)var3_3);
                                                                }
                                                            } else {
                                                                var8_8 /* !! */  = var3_3.d;
                                                                if (var8_8 /* !! */  == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_30);
                                                                    var9_9 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                var11_26 /* !! */  = var3_3.itemView.getContext();
                                                                var28_72 = R$drawable.ic_pdp_video_mute;
                                                                var11_26 /* !! */  = xn.a(var11_26 /* !! */ , var28_72);
                                                                var8_8 /* !! */ .setImageDrawable((Drawable)var11_26 /* !! */ );
                                                                if (var10_13 != null) {
                                                                    var9_9 = var10_13.r;
                                                                    var8_8 /* !! */  = var10_13.a(var9_9);
                                                                    var10_13.k((ExoPlayer)var8_8 /* !! */ );
                                                                }
                                                                if ((var3_3 = var3_3.d) == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_30);
                                                                } else {
                                                                    var14_29 /* !! */  = var3_3;
                                                                }
                                                                var29_76 = R$string.video_mute;
                                                                var3_3 = hv3_0.K(var29_76);
                                                                var14_29 /* !! */ .setContentDescription((CharSequence)var3_3);
                                                            }
                                                            break block80;
                                                        }
                                                        var9_9 = var1_1 instanceof vv2_1;
                                                        if (var9_9 == 0) break block86;
                                                        var7_7 = var1_1;
                                                        var7_7 = (vv2_1)var1_1;
                                                        var11_26 /* !! */  = ((cB2)this.f.get((int)var2_2)).a;
                                                        var12_27 /* !! */  = ((cB2)this.f.get((int)var2_2)).h;
                                                        var14_29 /* !! */  = ScreenType.SCREEN_PLP;
                                                        var15_31 = yt2_2.PLP;
                                                        var30_79 = 32;
                                                        var10_14 /* !! */  = var7_7;
                                                        var9_9 = var2_2;
                                                        vv2_1.D((vv2_1)var7_7, var2_2, (Product)var11_26 /* !! */ , (PlpProductUIModel)var12_27 /* !! */ , var14_29 /* !! */ , var15_31, var30_79);
                                                        var10_14 /* !! */  = this.e;
                                                        var8_8 /* !! */  = Yj2.LIST;
                                                        if (var10_14 /* !! */  == var8_8 /* !! */ ) {
                                                            var10_14 /* !! */  = this.E;
                                                            var8_8 /* !! */  = var7_7.p0;
                                                            Mj2.a(var1_1, (LinkedHashMap)var10_14 /* !! */ , (RecyclerView)var8_8 /* !! */ );
                                                        }
                                                        break block80;
                                                    }
                                                    var9_9 = var1_1 instanceof HW;
                                                    if (var9_9 == 0) break block87;
                                                    var3_3 = (HW)var1_1;
                                                    var10_15 = this.D;
                                                    var3_3.getClass();
                                                    if (var10_15 != null) {
                                                        var8_8 /* !! */  = var10_15.get(0);
                                                        var14_29 /* !! */  = var8_8 /* !! */ ;
                                                        var14_29 /* !! */  = (BannerData)var8_8 /* !! */ ;
                                                    }
                                                    if (var14_29 /* !! */  == null) {
                                                        var10_15 = new ConstraintLayout$LayoutParams(0, 0);
                                                        var3_3 = var3_3.itemView;
                                                        var9_9 = R$id.containerOnboarding;
                                                        var3_3 = (ConstraintLayout)var3_3.findViewById(var9_9);
                                                        var3_3.setLayoutParams((ViewGroup.LayoutParams)var10_15);
                                                    } else {
                                                        var20_49 = var8_8 /* !! */  = var10_15.get(0);
                                                        var20_49 = (BannerData)var8_8 /* !! */ ;
                                                        var22_56 = null;
                                                        var25_65 = 56;
                                                        var27_68 = var3_3.a;
                                                        var23_59 = false;
                                                        var24_62 = null;
                                                        var21_53 = var3_3;
                                                        V81.c(var27_68, (BannerData)var20_49, (g71_0)var3_3, null, null, var25_65);
                                                        var10_15 = (BannerData)var10_15.get(0);
                                                        if (var10_15 != null) {
                                                            var17_42 = var10_15.getWidth();
                                                            var5_5 = var10_15.getHeight();
                                                            var8_8 /* !! */  = new ConstraintLayout$LayoutParams(var17_42, var5_5);
                                                            var3_3 = var3_3.itemView;
                                                            var5_5 = R$id.containerOnboarding;
                                                            var3_3 = (ConstraintLayout)var3_3.findViewById(var5_5);
                                                            var3_3.setLayoutParams((ViewGroup.LayoutParams)var8_8 /* !! */ );
                                                        }
                                                    }
                                                    break block80;
                                                }
                                                var9_9 = var1_1 instanceof I12;
                                                if (var9_9 == 0) break block88;
                                                var3_3 = (I12)var1_1;
                                                var10_16 = this.h;
                                                if (var10_16 != null && (var10_16 = var10_16.getData()) != null) {
                                                    var14_29 /* !! */  = var10_16.getComponent();
                                                }
                                                var3_3.w((PlpExtendedBannerComponent)var14_29 /* !! */ );
                                                break block80;
                                            }
                                            var9_9 = var1_1 instanceof j12;
                                            if (var9_9 == 0) break block89;
                                            var3_3 = (j12)var1_1;
                                            var10_17 = this.l;
                                            var5_5 = (int)var10_17.isLastPage();
                                            var3_3.w((boolean)var5_5);
                                            break block80;
                                        }
                                        var9_9 = var1_1 instanceof CE3;
                                        if (var9_9 == 0) break block90;
                                        var8_8 /* !! */  = ((cB2)this.f.get((int)var2_2)).g;
                                        if (var8_8 /* !! */  != null) {
                                            var11_26 /* !! */  = var8_8 /* !! */ .getName();
                                            var17_43 = "category".equalsIgnoreCase((String)var11_26 /* !! */ );
                                            var12_27 /* !! */  = this.c;
                                            var15_32 = this.k;
                                            if (!var17_43 && !(var17_43 = (var16_38 = "l1l3nestedcategory").equalsIgnoreCase((String)(var11_26 /* !! */  = var8_8 /* !! */ .getCode())))) {
                                                var16_38 = "brand";
                                                var11_26 /* !! */  = var8_8 /* !! */ .getName();
                                                var17_43 = var16_38.equalsIgnoreCase((String)var11_26 /* !! */ );
                                                if (!var17_43 && !(var17_43 = (var16_38 = "brands").equalsIgnoreCase((String)(var11_26 /* !! */  = var8_8 /* !! */ .getName())))) {
                                                    var11_26 /* !! */  = var8_8 /* !! */ .getCode();
                                                    if ((var11_26 /* !! */  = (ArrayList)var12_27 /* !! */ .get(var11_26 /* !! */ )) == null) {
                                                        var11_26 /* !! */  = new ArrayList();
                                                    }
                                                    var11_26 /* !! */  = ImmutableList.copyOf((Collection)var11_26 /* !! */ );
                                                } else {
                                                    var11_26 /* !! */  = var8_8 /* !! */ .getCode();
                                                    var11_26 /* !! */  = (ArrayList)var12_27 /* !! */ .get(var11_26 /* !! */ );
                                                    if ((var11_26 /* !! */  = var15_32.S((ArrayList)var11_26 /* !! */ )) == null) {
                                                        var11_26 /* !! */  = new ArrayList();
                                                    }
                                                    var11_26 /* !! */  = ImmutableList.copyOf((Collection)var11_26 /* !! */ );
                                                }
                                            } else {
                                                var11_26 /* !! */  = var8_8 /* !! */ .getCode();
                                                var11_26 /* !! */  = (ArrayList)var12_27 /* !! */ .get(var11_26 /* !! */ );
                                                if ((var11_26 /* !! */  = var15_32.e7((ArrayList)var11_26 /* !! */ )) == null) {
                                                    var11_26 /* !! */  = new ArrayList();
                                                }
                                                var11_26 /* !! */  = ImmutableList.copyOf((Collection)var11_26 /* !! */ );
                                            }
                                            Intrinsics.checkNotNull(var11_26 /* !! */ );
                                            var3_3 = (CE3)var3_3;
                                            var28_73 = var4_4 + 1;
                                            var3_3.getClass();
                                            Intrinsics.checkNotNullParameter(var11_26 /* !! */ , "facetValues");
                                            var31_81 = R$string.fs_filter_select;
                                            var16_38 = var8_8 /* !! */ .getName();
                                            var10_18 = new Object[var5_5];
                                            var10_18[0] = var16_38;
                                            var10_18 = hv3_0.L(var31_81, (Object[])var10_18);
                                            var15_32 = var3_3.c;
                                            var15_32.setText((CharSequence)var10_18);
                                            var10_18 = var3_3.d;
                                            if (var10_18 == null) {
                                                var15_32 = var3_3.a;
                                                var10_18 = new wE3((Facet)var8_8 /* !! */ , (ImmutableList)var11_26 /* !! */ , (xE3)var15_32, var28_73);
                                                var3_3.d = var10_18;
                                                var10_18 = var8_8 /* !! */ .getName();
                                                var5_5 = (int)TextUtils.isEmpty((CharSequence)var10_18);
                                                if (var5_5 == 0) {
                                                    var10_18 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                    var11_26 /* !! */  = var8_8 /* !! */ .getName();
                                                    var12_27 /* !! */  = var8_8 /* !! */ .getName();
                                                    if (var15_32 != null) {
                                                        var8_8 /* !! */  = var8_8 /* !! */ .getName();
                                                        Intrinsics.checkNotNull(var8_8 /* !! */ );
                                                        var14_29 /* !! */  = var15_32.A2((String)var8_8 /* !! */ );
                                                    }
                                                    var8_8 /* !! */  = o72_0.a;
                                                    var15_32 = new StringBuilder();
                                                    var15_32.append((String)var11_26 /* !! */ );
                                                    var15_32.append("_Filter_AutoApplied");
                                                    var15_32.append((String)var12_27 /* !! */ );
                                                    var15_32.append("-");
                                                    var15_32.append((Object)var14_29 /* !! */ );
                                                    var8_8 /* !! */  = h30_0.a((StringBuilder)var15_32, "_", (String)var8_8 /* !! */ );
                                                    var11_26 /* !! */  = o72_0.a;
                                                    var12_27 /* !! */  = "Visual Filter Shown";
                                                    var10_18.pushButtonTapEvent((String)var12_27 /* !! */ , var8_8 /* !! */ , (String)var11_26 /* !! */ );
                                                }
                                            } else {
                                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                                Intrinsics.checkNotNullParameter(var8_8 /* !! */ , "genderFacet");
                                                var14_29 /* !! */  = "genderFacetValues";
                                                Intrinsics.checkNotNullParameter(var11_26 /* !! */ , (String)var14_29 /* !! */ );
                                                var10_18.b = var11_26 /* !! */ ;
                                                var10_18.a = var8_8 /* !! */ ;
                                                var10_18.d = var28_73;
                                                var10_18.notifyDataSetChanged();
                                            }
                                            var10_18 = var3_3.b;
                                            var3_3 = var3_3.d;
                                            var10_18.setAdapter((RecyclerView$f)var3_3);
                                        }
                                        break block80;
                                    }
                                    var9_9 = var1_1 instanceof as;
                                    if (var9_9 == 0) break block91;
                                    var3_3 = (as)var1_1;
                                    var10_19 = this.q;
                                    var8_8 /* !! */  = this.r;
                                    var3_3.w(var10_19, (String)var8_8 /* !! */ );
                                    break block80;
                                }
                                var9_9 = var1_1 instanceof YA;
                                if (var9_9 == 0) break block92;
                                var10_20 = this.p;
                                if (var10_20 != null) {
                                    var3_3 = (YA)var1_1;
                                    Intrinsics.checkNotNull(var10_20);
                                    var3_3.getClass();
                                    Intrinsics.checkNotNullParameter(var10_20, "desc");
                                    var8_8 /* !! */  = var3_3.b;
                                    var8_8 /* !! */ .setEllipsesListener((AjioEllipsisTextView$EllipsisListener)var3_3);
                                    var8_8 /* !! */ .setText((CharSequence)var10_20);
                                    var10_20 = new XA(var3_3, 0);
                                    var3_3 = var3_3.c;
                                    var3_3.setOnClickListener((View.OnClickListener)var10_20);
                                }
                                break block80;
                            }
                            var9_9 = var1_1 instanceof zo3_0;
                            if (var9_9 == 0) break block93;
                            var8_8 /* !! */  = this.o;
                            if (var8_8 /* !! */  != null && (var9_9 = var8_8 /* !! */ .length()) != 0) {
                                var3_3 = (zo3_0)var1_1;
                                var8_8 /* !! */  = this.o;
                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                var3_3.getClass();
                                Intrinsics.checkNotNullParameter(var8_8 /* !! */ , "bannerUrl");
                                var11_26 /* !! */  = new da$a();
                                var11_26 /* !! */ .k = var5_5;
                                var11_26 /* !! */ .r = var5_5;
                                var11_26 /* !! */ .n = var8_8 /* !! */ ;
                                var3_3 = var3_3.a;
                                var11_26 /* !! */ .u = var3_3;
                                var11_26 /* !! */ .a();
                            }
                            break block80;
                        }
                        var9_9 = var1_1 instanceof wv_0;
                        if (var9_9 == 0) break block94;
                        var3_3 = (wv_0)var1_1;
                        var8_8 /* !! */  = ((cB2)this.f.get((int)var2_2)).f;
                        var3_3.getClass();
                        if (var8_8 /* !! */  != null) {
                            var11_26 /* !! */  = var8_8 /* !! */ .getCustomimage();
                        } else {
                            var17_44 = 0;
                            var11_26 /* !! */  = null;
                        }
                        var11_26 /* !! */  = (Collection)var11_26 /* !! */ ;
                        if (var11_26 /* !! */  != null && (var17_44 = var11_26 /* !! */ .isEmpty()) == 0) {
                            var17_44 = var3_3.a;
                            if (!(var17_44 != 0 ? var8_8 /* !! */  == null || (var11_26 /* !! */  = var8_8 /* !! */ .getCustomimage()) == null || (var11_26 /* !! */  = (Map)CollectionsKt.firstOrNull((List)var11_26 /* !! */ )) == null || (var11_26 /* !! */  = (String)var11_26 /* !! */ .get(var15_33 = "1024x320")) == null : var8_8 /* !! */  == null || (var11_26 /* !! */  = var8_8 /* !! */ .getCustomimage()) == null || (var11_26 /* !! */  = (Map)CollectionsKt.firstOrNull((List)var11_26 /* !! */ )) == null || (var11_26 /* !! */  = (String)var11_26 /* !! */ .get(var15_34 = "512x910")) == null)) {
                                var12_27 /* !! */  = var11_26 /* !! */ ;
                            }
                            if (var8_8 /* !! */  != null) {
                                var14_29 /* !! */  = var8_8 /* !! */ .getCcbValue();
                            }
                            if ((var14_29 /* !! */  == null || (var17_44 = var14_29 /* !! */ .length()) == 0) && var8_8 /* !! */  != null) {
                                cp_1.Companion.getClass();
                                var11_26 /* !! */  = cp$a.e();
                                var14_29 /* !! */  = UUID.randomUUID().toString();
                                var11_26 /* !! */ .getClass();
                                var11_26 /* !! */  = cp_1.n((String)var14_29 /* !! */ );
                                var8_8 /* !! */ .setCcbValue((String)var11_26 /* !! */ );
                            }
                            var11_26 /* !! */  = new da$a();
                            var11_26 /* !! */ .a = var13_28 = R$drawable.component_placeholder;
                            var11_26 /* !! */ .b = var13_28;
                            var11_26 /* !! */ .k = var5_5;
                            var11_26 /* !! */ .n = var12_27 /* !! */ ;
                            var12_27 /* !! */  = var3_3.c;
                            var11_26 /* !! */ .u = var12_27 /* !! */ ;
                            var11_26 /* !! */ .i = var5_5;
                            var11_26 /* !! */ .a();
                            var10_21 = new vv_0((wv_0)var3_3, (BannerAdData)var8_8 /* !! */ );
                            var12_27 /* !! */ .setOnClickListener((View.OnClickListener)var10_21);
                            var10_21 = (Boolean)var3_3.e.getValue();
                            var5_5 = (int)var10_21.booleanValue();
                            var3_3 = var3_3.d;
                            if (var5_5 != 0) {
                                if (var3_3 != null) {
                                    ai0_2.B((View)var3_3);
                                }
                            } else if (var3_3 != null) {
                                ai0_2.i((View)var3_3);
                            }
                        }
                        break block80;
                    }
                    var9_9 = var1_1 instanceof ue2_0;
                    if (var9_9 == 0) break block95;
                    var3_3 = (ue2_0)var1_1;
                    var10_22 = "PLP";
                    var3_3.w(var10_22);
                    break block80;
                }
                var9_9 = var1_1 instanceof tj2_1;
                if (var9_9 == 0) break block96;
                var27_69 = var1_1;
                var27_69 = (tj2_1)var1_1;
                var3_3 = var11_26 /* !! */ .X1;
                var20_50 = var11_26 /* !! */ .W1;
                var21_54 = var11_26 /* !! */ .Y1;
                var27_69.getClass();
                Intrinsics.checkNotNullParameter(var3_3, "listOfFilters");
                Intrinsics.checkNotNullParameter(var20_50, "selectedFilters");
                Intrinsics.checkNotNullParameter(var21_54, "imagesMap");
                var11_26 /* !! */  = var27_69.itemView.getContext();
                var8_8 /* !! */  = new FlexboxLayoutManager(var11_26 /* !! */ );
                var8_8 /* !! */ .setFlexWrap(var5_5);
                var8_8 /* !! */ .setFlexDirection(0);
                var8_8 /* !! */ .setJustifyContent(0);
                var8_8 /* !! */ .setAlignItems(0);
                var22_57 = var27_69.b;
                var22_57.setLayoutManager((RecyclerView$o)var8_8 /* !! */ );
                var8_8 /* !! */  = new ArrayList();
                var3_3 = var3_3.iterator();
                while (var17_45 = var3_3.hasNext()) {
                    var11_26 /* !! */  = var3_3.next();
                    var12_27 /* !! */  = var11_26 /* !! */ ;
                    var12_27 /* !! */  = (FacetValue)var11_26 /* !! */ ;
                    var28_74 = var12_27 /* !! */ .getSelected() ^ var5_5;
                    if (var28_74 == 0) continue;
                    var8_8 /* !! */ .add(var11_26 /* !! */ );
                }
                var3_3 = h40_0.a;
                var29_77 = h40_0.h0().optInt("maxFiltersCount");
                var12_27 /* !! */  = var29_77;
                var11_26 /* !! */  = var27_69.a;
                var3_3 = var24_63;
                var10_23 = var8_8 /* !! */ ;
                var8_8 /* !! */  = var11_26 /* !! */ ;
                var17_45 = false;
                var14_29 /* !! */  = var21_54;
                var31_82 = var2_2;
                var24_63 = new nj2_0((List)var10_23, (yv2_1)var11_26 /* !! */ , false, (Integer)var12_27 /* !! */ , var21_54, var2_2, 4);
                var22_57.setAdapter(var24_63);
                var10_23 = var27_69.itemView.getContext();
                var3_3 = new LinearLayoutManager((Context)var10_23, 0, false);
                var7_7 = var27_69.c;
                var7_7.setLayoutManager((RecyclerView$o)var3_3);
                var13_28 = 0;
                var14_29 /* !! */  = null;
                var23_60 = 228;
                var8_8 /* !! */  = var27_69.a;
                var31_82 = 0;
                var15_35 = null;
                var30_80 = false;
                var16_39 = null;
                var3_3 = var22_57;
                var10_23 = var20_50;
                var11_26 /* !! */  = var21_54;
                var28_74 = var2_2;
                var4_4 = var23_60;
                var22_57 = new bv2_1(var20_50, (yv2_1)var8_8 /* !! */ , var21_54, var2_2, false, false, false, var23_60);
                var7_7.setAdapter((RecyclerView$f)var22_57);
                break block80;
            }
            var5_5 = var1_1 instanceof W4;
            if (var5_5 == 0) break block80;
            var10_24 = this.B;
            if (var10_24 != null) {
                var8_8 /* !! */  = var10_24.getCompleteAddress();
            } else {
                var9_9 = 0;
                var8_8 /* !! */  = null;
            }
            if (var10_24 != null) {
                var14_29 /* !! */  = var10_24.getDistrict();
            }
            var11_26 /* !! */  = ", ";
            var32_83 = n1.a((String)var8_8 /* !! */ , (String)var11_26 /* !! */ , (String)var14_29 /* !! */ );
            var15_36 = var3_3;
            var15_36 = (W4)var3_3;
            if (var10_24 != null && (var3_3 = var10_24.getAddressType()) != null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var3_3 = AddressType.None;
            ** while (true)
            var16_40 /* !! */  = var3_3;
            var3_3 = od3_2.a;
            var29_78 = var3_3.length();
            if (var29_78 > 0) {
                var3_3 = od3_2.a;
lbl597:
                // 3 sources

                while (true) {
                    continue;
                    break;
                }
            }
            AJIOApplication.Companion.getClass();
            var8_8 /* !! */  = AJIOApplication$a.a();
            var3_3 = new jo_2((Context)var8_8 /* !! */ );
            if ((var3_3 = var3_3.k()) != null) ** GOTO lbl597
            var3_3 = ld3_2.STORE_AJIO.getStoreId();
            ** while (true)
            var7_7 = var3_3;
            var27_70 /* !! */  = var10_24 != null && (var3_3 = var10_24.getPostalCode()) != null ? var3_3 : var12_27 /* !! */ ;
            var20_51 /* !! */  = var10_24 != null && (var3_3 = var10_24.getFirstName()) != null ? var3_3 : var12_27 /* !! */ ;
            var15_36.w((AddressType)var16_40 /* !! */ , var32_83, (String)var7_7, (String)var27_70 /* !! */ , (String)var20_51 /* !! */ );
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parent");
        Object object3 = this.v;
        Object object4 = "popAndPeekListener";
        String string2 = "onPLPProductClickListener";
        xE3 xE32 = this.k;
        AjiogramInterventions ajiogramInterventions = this.C;
        Pj2 pj2 = this.n;
        Cw2 cw2 = this.j;
        M82 m82 = this.i;
        String string3 = "inflate(...)";
        switch (n3) {
            default: {
                boolean bl2;
                Object object5 = LayoutInflater.from((Context)object.getContext());
                int n4 = R$layout.common_product_item_view;
                object = object5.inflate(n4, object, false);
                Intrinsics.checkNotNull(object);
                object5 = new vv2_1((View)object);
                Intrinsics.checkNotNullParameter(m82, string2);
                ((vv2_1)object5).h = m82;
                Intrinsics.checkNotNullParameter(cw2, (String)object4);
                ((vv2_1)object5).i = cw2;
                ((vv2_1)object5).j = bl2 = pj2.H4();
                ((vv2_1)object5).m = ajiogramInterventions;
                ((vv2_1)object5).C();
                return object5;
            }
            case 28: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n7 = R$layout.layout_plp_list_quick_filter_view;
                object = object3.inflate(n7, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object3 = this.z;
                object2 = new tj2_1((View)object, (yv2_1)object3);
                break;
            }
            case 27: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n8 = R$layout.video_base_layout;
                object = object3.inflate(n8, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object3 = this.x;
                object4 = this.y;
                object2 = new xj2_0((View)object, (mu1_1)object3, (ma_2)object4);
                break;
            }
            case 26: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n10 = R$layout.plp_search_header;
                object = object3.inflate(n10, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object3 = (Ca)this.w;
                object2 = new uj2_0((View)object, (Ca)object3);
                break;
            }
            case 25: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n14 = R$layout.layout_plp_list_header_image_view;
                object = object3.inflate(n14, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = new Ae1((View)object);
                break;
            }
            case 24: {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n15 = R$layout.half_banner_ad_odd;
                object = object2.inflate(n15, object, false);
                Intrinsics.checkNotNull(object);
                object2 = new wv_0((View)object, false, (Function1)object3);
                break;
            }
            case 22: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n16 = R$layout.home_rating_view;
                object = object3.inflate(n16, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = new ue2_0((View)object);
                break;
            }
            case 21: {
                object2 = LayoutInflater.from((Context)object.getContext());
                int bl3 = R$layout.full_ads_banner;
                object = object2.inflate(bl3, object, false);
                Intrinsics.checkNotNull(object);
                boolean n17 = true;
                object2 = new wv_0((View)object, n17, (Function1)object3);
                break;
            }
            case 20: {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n19 = R$layout.half_banner_ad_even;
                object = object2.inflate(n19, object, false);
                Intrinsics.checkNotNull(object);
                object2 = new wv_0((View)object, false, (Function1)object3);
                break;
            }
            case 19: {
                boolean bl4;
                object3 = LayoutInflater.from((Context)object.getContext());
                int n4 = R$layout.common_product_item_view;
                object = object3.inflate(n4, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                vv2_1 vv2_12 = new vv2_1((View)object);
                Intrinsics.checkNotNullParameter(m82, string2);
                vv2_12.h = m82;
                Intrinsics.checkNotNullParameter(cw2, (String)object4);
                vv2_12.i = cw2;
                vv2_12.j = bl4 = pj2.H4();
                object = Yj2.LIST;
                Intrinsics.checkNotNullParameter(object, "list");
                vv2_12.l = object;
                vv2_12.m = ajiogramInterventions;
                vv2_12.C();
                return vv2_12;
            }
            case 17: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n20 = R$layout.cms_banner_view;
                object = object3.inflate(n20, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = new HW((View)object);
                break;
            }
            case 15: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n22 = R$layout.plp_banner_row_layout;
                object = object3.inflate(n22, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = new I12((View)object);
                break;
            }
            case 14: {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n21 = R$layout.plp_filter_nudge;
                object = object2.inflate(n21, object, false);
                Intrinsics.checkNotNull(object);
                object2 = new ae3_1((View)object, xE32);
                break;
            }
            case 11: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n24 = R$layout.plp_new_user_banner;
                object = object3.inflate(n24, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = new zo3_0((View)object);
                break;
            }
            case 10: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n29 = R$layout.plp_brand_desc_row_view;
                object = object3.inflate(n29, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object3 = this.m;
                object2 = new YA((View)object, (WA)object3);
                break;
            }
            case 7: {
                boolean bl5;
                Object object6 = LayoutInflater.from((Context)object.getContext());
                int n25 = R$layout.common_product_item_view;
                object = object6.inflate(n25, object, false);
                Intrinsics.checkNotNull(object);
                object6 = new vv2_1((View)object);
                Intrinsics.checkNotNullParameter(m82, string2);
                ((vv2_1)object6).h = m82;
                Intrinsics.checkNotNullParameter(cw2, (String)object4);
                ((vv2_1)object6).i = cw2;
                ((vv2_1)object6).j = bl5 = pj2.H4();
                ((vv2_1)object6).m = ajiogramInterventions;
                ((vv2_1)object6).C();
                return object6;
            }
            case 6: {
                boolean bl6;
                Object object7 = LayoutInflater.from((Context)object.getContext());
                int n26 = R$layout.common_product_item_view;
                object = object7.inflate(n26, object, false);
                Intrinsics.checkNotNull(object);
                object7 = new vv2_1((View)object);
                Intrinsics.checkNotNullParameter(m82, string2);
                ((vv2_1)object7).h = m82;
                Intrinsics.checkNotNullParameter(cw2, (String)object4);
                ((vv2_1)object7).i = cw2;
                ((vv2_1)object7).j = bl6 = pj2.H4();
                ((vv2_1)object7).m = ajiogramInterventions;
                ((vv2_1)object7).C();
                return object7;
            }
            case 5: {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n27 = R$layout.plp_visual_filter_row_view;
                object2 = object2.inflate(n27, object, false);
                Intrinsics.checkNotNull(object2);
                object = object.getContext();
                object4 = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                object2 = object3 = new CE3((View)object2, (Context)object, xE32);
                break;
            }
            case 3: {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n28 = R$layout.plp_footer_row_view;
                object = object2.inflate(n28, object, false);
                Intrinsics.checkNotNull(object);
                object2 = new j12((View)object);
                break;
            }
            case 0: {
                object3 = LayoutInflater.from((Context)object.getContext());
                int n7 = R$layout.plp_auto_correct_row_view;
                object = object3.inflate(n7, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = new as((View)object);
            }
        }
        return object2;
    }

    public final void onViewAttachedToWindow(RecyclerView$B object) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewAttachedToWindow((RecyclerView$B)object);
        Object object3 = object instanceof vv2_1;
        if (object3 != 0) {
            int n3;
            object = (vv2_1)object;
            object2 = ((vv2_1)object).P0;
            if (object2 != null) {
                object2.cancel();
            }
            object2 = ((vv2_1)object).O0;
            int n4 = 8;
            if (object2 != null && (object3 = ((PlpProductUIModel)object2).isDodEnabled()) == (n3 = 1)) {
                long l2;
                object2 = ((vv2_1)object).O0;
                long l3 = object2 != null ? ((PlpProductUIModel)object2).getDodEndTime() : 0L;
                long l4 = l3 - (l2 = ((Calendar)(object2 = Calendar.getInstance(TimeZone.getTimeZone("IST")))).getTimeInMillis());
                object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object3 > 0) {
                    object2 = ((vv2_1)object).Q;
                    n4 = 0;
                    object2.setVisibility(0);
                    TextView textView = ((vv2_1)object).R;
                    M82 m82 = this.i;
                    object2 = new bs0_1(l3 -= l2, textView, m82);
                    ((vv2_1)object).P0 = object2;
                    object2.start();
                } else {
                    object = ((vv2_1)object).Q;
                    object.setVisibility(n4);
                }
            } else {
                object = ((vv2_1)object).Q;
                object.setVisibility(n4);
            }
        } else {
            object3 = object instanceof j12;
            if (object3 != 0 && (object3 = ((RecyclerViewScrollListener)(object2 = this.l)).isLastPage()) == 0) {
                object = ((j12)object).a;
                hv3_0.p0((ShimmerFrameLayout)((Object)object));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onViewDetachedFromWindow(RecyclerView$B object) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewDetachedFromWindow((RecyclerView$B)object);
        boolean bl2 = object instanceof vv2_1;
        if (bl2) {
            object2 = object;
            object2 = (vv2_1)object;
            CountDownTimer countDownTimer = ((vv2_1)object2).P0;
            if (countDownTimer != null) {
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                Object var1_2 = null;
                ((vv2_1)object2).P0 = null;
                return;
            }
        }
        if (!(bl2 = object instanceof j12)) return;
        object2 = this.l;
        bl2 = ((RecyclerViewScrollListener)object2).isLastPage();
        if (bl2) return;
        ShimmerFrameLayout shimmerFrameLayout = ((j12)object).a;
        hv3_0.s0(shimmerFrameLayout);
    }

    public final void onViewRecycled(RecyclerView$B object) {
        Object object2;
        Object object3 = "holder";
        Intrinsics.checkNotNullParameter(object, object3);
        super.onViewRecycled((RecyclerView$B)object);
        int n3 = object instanceof vv2_1;
        if (n3 != 0 && (object3 = this.e) == (object2 = Yj2.LIST)) {
            object = (vv2_1)object;
            n3 = ((RecyclerView$B)object).getLayoutPosition();
            object2 = this.E;
            object3 = n3;
            object = ((vv2_1)object).p0;
            object = object != null && (object = ((RecyclerView)object).getLayoutManager()) != null ? ((RecyclerView$o)object).onSaveInstanceState() : null;
            object2.put(object3, object);
        }
    }
}

