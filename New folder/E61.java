/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.viewpager2.widget.ViewPager2$g;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.CustomLinearLayoutManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCmsAppUpdateVH;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCuratedWidgetVH;
import com.ril.ajio.kmm.shared.model.home.HomeViewTypes;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

public final class E61
extends RecyclerView$f {
    public final ArrayList a;
    public final g71_0 b;
    public final String c;
    public final po_0 d;
    public final OnGAEventHandlerListener e;
    public final mf1_0 f;
    public final lf1_0 g;
    public final U71 h;
    public final x82_0 i;
    public final boolean j;
    public final String k;
    public final String l;
    public final tt2_2 m;
    public final gx0_2 n;
    public final b62 o;
    public final kc1_2 p;
    public final OnGACuratedWidgetEventHandlerListener q;
    public final e00$a r;
    public final k92_0 s;
    public ArrayList t;
    public final FV2 u;
    public final AV2 v;
    public int w;
    public boolean x;
    public int y;

    public E61(ArrayList arrayList, g71_0 g71_02, String string2, po_0 po_02, OnGAEventHandlerListener onGAEventHandlerListener, mf1_0 mf1_02, lf1_0 lf1_02, U71 u71, x82_0 x82_02, tt2_2 tt2_22, pz_1 pz_12, b62 b622, kc1_2 kc1_22, OnGACuratedWidgetEventHandlerListener onGACuratedWidgetEventHandlerListener, e00$a e00$a, k92_0 k92_02, ArrayList arrayList2, FV2 fV2, AV2 aV2) {
        Intrinsics.checkNotNullParameter(arrayList, "homeDataList");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(onGAEventHandlerListener, "onGAEventHandlerListener");
        String string3 = "home landing screen";
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string3, "screenType");
        Intrinsics.checkNotNullParameter(tt2_22, "scrollStateHolder");
        Intrinsics.checkNotNullParameter(pz_12, "trackBannerImpression");
        Intrinsics.checkNotNullParameter(b622, "olpHomeComponentCallback");
        Intrinsics.checkNotNullParameter(kc1_22, "iCuratedWidgetClickListener");
        Intrinsics.checkNotNullParameter((Object)e00$a, "cmsPageType");
        this.a = arrayList;
        this.b = g71_02;
        this.c = string2;
        this.d = po_02;
        this.e = onGAEventHandlerListener;
        this.f = mf1_02;
        this.g = lf1_02;
        this.h = u71;
        this.i = x82_02;
        this.j = false;
        this.k = string3;
        this.l = string3;
        this.m = tt2_22;
        this.n = pz_12;
        this.o = b622;
        this.p = kc1_22;
        this.q = onGACuratedWidgetEventHandlerListener;
        this.r = e00$a;
        this.s = k92_02;
        this.t = arrayList2;
        this.u = fV2;
        this.v = aV2;
    }

    public static boolean g(List object) {
        if (object != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                String string2;
                String string3 = ((BannerData)object.next()).getBannerType();
                bl2 = Intrinsics.areEqual(string3, string2 = "VIDEO");
                if (!bl2) continue;
                return true;
            }
        }
        return false;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getItemViewType(int n3) {
        void var4_7;
        boolean bl2;
        Object object = this.a;
        Object object2 = (HomeRowData)((ArrayList)object).get(n3);
        Object var4_4 = null;
        if (object2 != null) {
            object2 = ((HomeRowData)object2).getType();
        } else {
            bl2 = false;
            object2 = null;
        }
        HomeViewTypes homeViewTypes = HomeViewTypes.ROW_TYPE_FULL_IMAGE;
        if (object2 == homeViewTypes) {
            object2 = (HomeRowData)((ArrayList)object).get(n3);
            if (object2 != null) {
                object2 = ((HomeRowData)object2).getBanners();
            } else {
                bl2 = false;
                object2 = null;
            }
            bl2 = E61.g((List)object2);
            if (bl2) {
                return ac3_2.VIDEO_CAROUSE.getType();
            }
        }
        if ((object2 = (HomeRowData)((ArrayList)object).get(n3)) != null) {
            object2 = ((HomeRowData)object2).getType();
        } else {
            bl2 = false;
            object2 = null;
        }
        homeViewTypes = HomeViewTypes.ROW_TYPE_CAROUSEL;
        if (object2 == homeViewTypes) {
            object2 = (HomeRowData)((ArrayList)object).get(n3);
            if (object2 != null) {
                object2 = ((HomeRowData)object2).getBanners();
            } else {
                bl2 = false;
                object2 = null;
            }
            bl2 = E61.g((List)object2);
            if (bl2) {
                return ac3_2.VIDEO_CAROUSE.getType();
            }
        }
        if ((object2 = (HomeRowData)((ArrayList)object).get(n3)) != null) {
            object2 = ((HomeRowData)object2).getType();
        } else {
            bl2 = false;
            object2 = null;
        }
        HomeViewTypes homeViewTypes2 = HomeViewTypes.ROW_TYPE_HLIST;
        if (object2 == homeViewTypes2) {
            object2 = (HomeRowData)((ArrayList)object).get(n3);
            if (object2 != null) {
                object2 = ((HomeRowData)object2).getBanners();
            } else {
                bl2 = false;
                object2 = null;
            }
            bl2 = E61.g((List)object2);
            if (bl2) {
                return ac3_2.HLIST_VIDEO.getType();
            }
        }
        if ((object2 = (HomeRowData)((ArrayList)object).get(n3)) != null) {
            object2 = ((HomeRowData)object2).getType();
        } else {
            bl2 = false;
            object2 = null;
        }
        homeViewTypes2 = HomeViewTypes.ROW_TYPE_IMAGE_SEARCH_WIDGET;
        if (object2 == homeViewTypes2) {
            String string2;
            Object object3 = od3_2.a;
            int n4 = ((String)object3).length();
            if (n4 == 0) {
                object3 = od3_2.a();
            }
            if ((n4 = (int)(s20.a ? 1 : 0)) == 0 && (n4 = (int)(Intrinsics.areEqual(object = od3_2.a(), string2 = ((ld3_2)((Object)(object2 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(object3, object = ((ld3_2)((Object)object2)).getStoreId()) ? 1 : 0)) == 0) {
                object3 = h40_0.a;
                n3 = (int)(h40_0.i1() ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                    return homeViewTypes2.getType();
                }
                object3 = HomeViewTypes.ROW_TYPE_SPACE;
                return ((HomeViewTypes)((Object)object3)).getType();
            }
            object3 = h40_0.a;
            object3 = z40_0.Companion;
            object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
            object = "image_search_enabled_fleek";
            n3 = (int)(((ao0_0)object3).a((String)object) ? 1 : 0);
            if (n3 != 0) {
                return homeViewTypes2.getType();
            }
            object3 = HomeViewTypes.ROW_TYPE_SPACE;
            return ((HomeViewTypes)((Object)object3)).getType();
        }
        object2 = (HomeRowData)((ArrayList)object).get(n3);
        if (object2 != null) {
            HomeViewTypes homeViewTypes3 = ((HomeRowData)object2).getType();
        }
        if (var4_7 == homeViewTypes) {
            Object object4;
            n3 = (int)(og1_1.c() ? 1 : 0);
            if (n3 != 0) {
                n3 = (int)(og1_1.c() ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(KU2.f ? 1 : 0)) != 0) {
                    return homeViewTypes.getType();
                }
            } else {
                n3 = (int)(og1_1.c() ? 1 : 0);
                if (n3 == 0 && (n3 = (int)(KU2.e ? 1 : 0)) != 0) {
                    String string3;
                    object4 = od3_2.a;
                    int n7 = ((String)object4).length();
                    if (n7 == 0) {
                        object4 = od3_2.a();
                    }
                    if ((n7 = (int)(s20.a ? 1 : 0)) == 0 && (n7 = (int)(Intrinsics.areEqual(object = od3_2.a(), string3 = ((ld3_2)((Object)(object2 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0) {
                        object = ((ld3_2)((Object)object2)).getStoreId();
                        n3 = (int)(Intrinsics.areEqual(object4, object) ? 1 : 0);
                        if (n3 == 0) return homeViewTypes.getType();
                    }
                }
            }
            object4 = HomeViewTypes.ROW_TYPE_SPACE;
            return ((HomeViewTypes)((Object)object4)).getType();
        }
        Object object5 = (HomeRowData)((ArrayList)object).get(n3);
        if (object5 != null && (object5 = ((HomeRowData)object5).getType()) != null) {
            return ((HomeViewTypes)((Object)object5)).getType();
        }
        object5 = HomeViewTypes.ROW_TYPE_SPACE;
        return ((HomeViewTypes)((Object)object5)).getType();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block163: {
            block181: {
                block180: {
                    block179: {
                        block175: {
                            block176: {
                                block177: {
                                    block178: {
                                        block171: {
                                            block172: {
                                                block173: {
                                                    block174: {
                                                        block170: {
                                                            block169: {
                                                                block168: {
                                                                    block167: {
                                                                        block166: {
                                                                            block165: {
                                                                                block164: {
                                                                                    block162: {
                                                                                        var3_3 = var1_1;
                                                                                        var4_6 = var2_2;
                                                                                        var5_7 = 0;
                                                                                        var6_8 = null;
                                                                                        var7_9 = 1;
                                                                                        Intrinsics.checkNotNullParameter(var1_1, "holder");
                                                                                        var8_10 = this.a;
                                                                                        var9_11 = var8_10.size();
                                                                                        if (var2_2 >= var9_11) {
                                                                                            return;
                                                                                        }
                                                                                        var10_12 = (HomeRowData)var8_10.get(var2_2);
                                                                                        var11_13 = var1_1 instanceof f33_0;
                                                                                        var12_14 = 8;
                                                                                        var13_15 = 0;
                                                                                        var14_16 = null;
                                                                                        if (var11_13 == 0) break block162;
                                                                                        var3_3 = (f33_0)var1_1;
                                                                                        var15_17 = var3_3.itemView;
                                                                                        var16_35 = R$id.stlTitleTv;
                                                                                        var15_17 = (TextView)var15_17.findViewById(var16_35);
                                                                                        var3_3.d = var15_17;
                                                                                        var15_17 = var3_3.itemView;
                                                                                        var16_35 = R$id.stlParent;
                                                                                        var15_17 = (RelativeLayout)var15_17.findViewById(var16_35);
                                                                                        var3_3.e = var15_17;
                                                                                        var15_17 = var3_3.itemView;
                                                                                        var16_35 = R$id.stlHList;
                                                                                        var15_17 = (RecyclerView)var15_17.findViewById(var16_35);
                                                                                        var3_3.f = var15_17;
                                                                                        if (var10_12 != null) {
                                                                                            var14_16 = var10_12.getHeading();
                                                                                        }
                                                                                        if (var14_16 == null) ** GOTO lbl-1000
                                                                                        var15_17 = var10_12.getHeading();
                                                                                        Intrinsics.checkNotNull(var15_17);
                                                                                        var4_6 = kotlin.text.b.k((CharSequence)var15_17) ^ var7_9;
                                                                                        if (var4_6 == 0) ** GOTO lbl-1000
                                                                                        var15_17 = var10_12.getHeading();
                                                                                        Intrinsics.checkNotNull(var15_17);
                                                                                        var4_6 = var15_17.length();
                                                                                        if (var4_6 > 0) {
                                                                                            var15_17 = var3_3.d;
                                                                                            if (var15_17 != null) {
                                                                                                var8_10 = var10_12.getHeading();
                                                                                                var15_17.setText((CharSequence)var8_10);
                                                                                            }
                                                                                            if ((var15_17 = var3_3.d) != null) {
                                                                                                var15_17.setVisibility(0);
                                                                                            }
                                                                                        } else if ((var15_17 = var3_3.d) != null) {
                                                                                            var15_17.setVisibility(var12_14);
                                                                                        }
                                                                                        if ((var15_17 = var3_3.e) != null) {
                                                                                            if (var10_12 != null) {
                                                                                                var16_35 = var10_12.getBottomPadding();
                                                                                            } else {
                                                                                                var16_35 = 0;
                                                                                                var8_10 = null;
                                                                                            }
                                                                                            var16_35 = mz3_0.d(var16_35);
                                                                                            var15_17.setPadding(0, 0, 0, var16_35);
                                                                                        }
                                                                                        if ((var15_17 = var3_3.f) != null) {
                                                                                            var15_17.setVisibility(var12_14);
                                                                                        }
                                                                                        if (var10_12 != null && (var15_17 = var10_12.getBanners()) != null) {
                                                                                            var3_3.c = var15_17;
                                                                                            var8_10 = var15_17;
                                                                                            var8_10 = (Collection)var15_17;
                                                                                            var16_35 = (int)var8_10.isEmpty();
                                                                                            if ((var7_9 ^= var16_35) != 0) {
                                                                                                var17_43 = var3_3.f;
                                                                                                if (var17_43 != null) {
                                                                                                    var17_43.setVisibility(0);
                                                                                                }
                                                                                                if ((var17_43 = var3_3.f) != null) {
                                                                                                    var10_12 = var3_3.a.getContext();
                                                                                                    var8_10 = new WrapperLinearLayoutManager((Context)var10_12, 0);
                                                                                                    var17_43.setLayoutManager((RecyclerView$o)var8_10);
                                                                                                }
                                                                                                if ((var6_8 = var3_3.f) != null) {
                                                                                                    var3_3 = var3_3.b;
                                                                                                    var17_43 = new e33_0((List)var15_17, (g71_0)var3_3);
                                                                                                    var6_8.setAdapter((RecyclerView$f)var17_43);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break block163;
                                                                                    }
                                                                                    var11_13 = var1_1 instanceof z71_0;
                                                                                    var18_50 = "";
                                                                                    if (var11_13 == 0) break block164;
                                                                                    var3_3 = (z71_0)var1_1;
                                                                                    var4_6 = z71_0.h;
                                                                                    var3_3.getClass();
                                                                                    Intrinsics.checkNotNullParameter(var18_50, "parentPosition");
                                                                                    var15_18 = var3_3.itemView;
                                                                                    var16_36 = R$id.cmsParent;
                                                                                    var15_18 = (ConstraintLayout)var15_18.findViewById(var16_36);
                                                                                    if (var10_12 != null) {
                                                                                        var16_36 = var10_12.getBottomPadding();
                                                                                    } else {
                                                                                        var16_36 = 0;
                                                                                        var8_10 = null;
                                                                                    }
                                                                                    var16_36 = mz3_0.d(var16_36);
                                                                                    var15_18.setPadding(0, 0, 0, var16_36);
                                                                                    var15_18 = var3_3.itemView;
                                                                                    var16_36 = R$id.hList;
                                                                                    var15_18 = (RecyclerView)var15_18.findViewById(var16_36);
                                                                                    var15_18.setVisibility(var12_14);
                                                                                    if (var10_12 != null && (var18_50 = var10_12.getBanners()) != null) {
                                                                                        var8_10 = var18_50;
                                                                                        var8_10 = (Collection)var18_50;
                                                                                        var16_36 = (int)var8_10.isEmpty();
                                                                                        if ((var7_9 ^= var16_36) != 0) {
                                                                                            var15_18.setVisibility(0);
                                                                                            var8_10 = var3_3.a.getContext();
                                                                                            var17_44 = new WrapperLinearLayoutManager((Context)var8_10, 0);
                                                                                            var15_18.setLayoutManager(var17_44);
                                                                                            var7_9 = var3_3.getBindingAdapterPosition();
                                                                                            var19_51 = String.valueOf(var7_9);
                                                                                            var20_55 = var3_3.b;
                                                                                            var21_60 = var3_3.c;
                                                                                            var22_62 = var3_3.e;
                                                                                            var14_16 = var6_8;
                                                                                            var6_8 = new s81_0((List)var18_50, var20_55, var21_60, var22_62, var19_51);
                                                                                            var15_18.setAdapter((RecyclerView$f)var6_8);
                                                                                        }
                                                                                    }
                                                                                    var6_8 = new y71_0((z71_0)var3_3);
                                                                                    var15_18.addOnScrollListener((RecyclerView$s)var6_8);
                                                                                    break block163;
                                                                                }
                                                                                var11_13 = var1_1 instanceof t71_0;
                                                                                var23_67 = 0L;
                                                                                if (var11_13 == 0) break block165;
                                                                                var3_3 = (t71_0)var1_1;
                                                                                var15_19 /* !! */  = var3_3.itemView;
                                                                                var16_37 = R$id.homeImageContainer;
                                                                                var15_19 /* !! */  = (ConstraintLayout)var15_19 /* !! */ .findViewById(var16_37);
                                                                                if (var10_12 != null) {
                                                                                    var16_37 = var10_12.getBottomPadding();
                                                                                } else {
                                                                                    var16_37 = 0;
                                                                                    var8_10 = null;
                                                                                }
                                                                                var16_37 = mz3_0.d(var16_37);
                                                                                var15_19 /* !! */ .setPadding(0, 0, 0, var16_37);
                                                                                if (var10_12 == null || (var8_10 = var10_12.getBanners()) == null || (var16_37 = var8_10.isEmpty() ^ var7_9) != var7_9) break block163;
                                                                                var3_3.c = var8_10 = var10_12.getBanners();
                                                                                if (var8_10 == null || (var8_10 = (BannerData)var8_10.get(0)) == null) break block163;
                                                                                var9_11 = (int)var8_10.getShowTimer();
                                                                                var25_68 = "|0";
                                                                                if (var9_11 == 0) ** GOTO lbl-1000
                                                                                var10_12 = nh_2.Companion;
                                                                                var26_75 = var8_10.getTimerEndTime();
                                                                                var27_82 = var26_75 != null ? var26_75.longValue() : var23_67;
                                                                                var10_12.getClass();
                                                                                var9_11 = (int)nh$a_0.a(var27_82);
                                                                                if (var9_11 != 0) {
                                                                                    Intrinsics.checkNotNull(var15_19 /* !! */ );
                                                                                    var9_11 = var15_19 /* !! */ .getChildCount();
                                                                                    var26_75 = new ArrayList();
                                                                                    while (var5_7 < var9_11) {
                                                                                        var14_16 = var15_19 /* !! */ .getChildAt(var5_7);
                                                                                        var29_83 = var14_16 instanceof FrameLayout;
                                                                                        if (!var29_83) {
                                                                                            var26_75.add(var14_16);
                                                                                        }
                                                                                        var5_7 += var7_9;
                                                                                    }
                                                                                    var6_8 = var26_75.iterator();
                                                                                    var10_12 = "iterator(...)";
                                                                                    Intrinsics.checkNotNullExpressionValue(var6_8, (String)var10_12);
                                                                                    while ((var9_11 = (int)var6_8.hasNext()) != 0) {
                                                                                        var10_12 = var6_8.next();
                                                                                        var26_75 = "next(...)";
                                                                                        Intrinsics.checkNotNullExpressionValue(var10_12, (String)var26_75);
                                                                                        var10_12 = (View)var10_12;
                                                                                        var15_19 /* !! */ .removeView((View)var10_12);
                                                                                    }
                                                                                    var26_75 = var3_3.itemView;
                                                                                    var13_15 = R$id.timerContainer;
                                                                                    var19_52 /* !! */  = var26_75.findViewById(var13_15);
                                                                                    var26_75 = var3_3.itemView;
                                                                                    var13_15 = R$id.info;
                                                                                    var30_87 = var26_75 = var26_75.findViewById(var13_15);
                                                                                    var30_87 = (TextView)var26_75;
                                                                                    var26_75 = var3_3.itemView;
                                                                                    var13_15 = R$id.days;
                                                                                    var31_91 = var26_75 = var26_75.findViewById(var13_15);
                                                                                    var31_91 = (TextView)var26_75;
                                                                                    var26_75 = var3_3.itemView;
                                                                                    var13_15 = R$id.days_postfix;
                                                                                    var32_93 = var26_75 = var26_75.findViewById(var13_15);
                                                                                    var32_93 = (TextView)var26_75;
                                                                                    var26_75 = var3_3.itemView;
                                                                                    var13_15 = R$id.hours;
                                                                                    var33_95 = var26_75 = var26_75.findViewById(var13_15);
                                                                                    var33_95 = (TextView)var26_75;
                                                                                    var26_75 = var3_3.itemView;
                                                                                    var13_15 = R$id.minutes;
                                                                                    var34_96 = var26_75 = var26_75.findViewById(var13_15);
                                                                                    var34_96 = (TextView)var26_75;
                                                                                    var26_75 = var3_3.itemView;
                                                                                    var13_15 = R$id.seconds;
                                                                                    var35_97 = var26_75 = var26_75.findViewById(var13_15);
                                                                                    var35_97 = (TextView)var26_75;
                                                                                    var26_75 = var8_10.getTimerEndTime();
                                                                                    if (var26_75 != null) {
                                                                                        var23_67 = var26_75.longValue();
                                                                                    }
                                                                                    var22_63 = var10_12;
                                                                                    var10_12 = new oh_2(var19_52 /* !! */ , (TextView)var30_87, (TextView)var31_91, (TextView)var32_93, (TextView)var33_95, (TextView)var34_96, (TextView)var35_97, var23_67);
                                                                                    var3_3.b = var6_8 = new nh_2((oh_2)var10_12);
                                                                                    var10_12 = var8_10.getTimerLabel();
                                                                                    var6_8.a((String)var10_12);
                                                                                    var6_8 = var3_3.itemView;
                                                                                    var9_11 = R$id.timerContainer;
                                                                                    var31_91 = var6_8.findViewById(var9_11);
                                                                                    var5_7 = var3_3.getBindingAdapterPosition();
                                                                                    var33_95 = UX.a(var5_7, var25_68);
                                                                                    var30_87 = var3_3.a;
                                                                                    var32_93 = null;
                                                                                    var22_63 = var15_19 /* !! */ ;
                                                                                    var19_52 /* !! */  = var8_10;
                                                                                    V81.b((ConstraintLayout)var15_19 /* !! */ , (BannerData)var8_10, (g71_0)var30_87, (View)var31_91, false, (String)var33_95);
                                                                                    t71_0.w((ConstraintLayout)var15_19 /* !! */ , (BannerData)var8_10, (boolean)var7_9);
                                                                                } else lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var3_3.b = null;
                                                                                    Intrinsics.checkNotNull(var15_19 /* !! */ );
                                                                                    var7_9 = var3_3.getBindingAdapterPosition();
                                                                                    var32_94 = UX.a(var7_9, var25_68);
                                                                                    var30_88 = var3_3.a;
                                                                                    var36_98 = 24;
                                                                                    var31_92 = null;
                                                                                    var22_64 /* !! */  = var15_19 /* !! */ ;
                                                                                    var19_53 = var8_10;
                                                                                    V81.c((ConstraintLayout)var15_19 /* !! */ , (BannerData)var8_10, var30_88, null, var32_94, var36_98);
                                                                                    t71_0.w((ConstraintLayout)var15_19 /* !! */ , (BannerData)var8_10, false);
                                                                                }
                                                                                break block163;
                                                                            }
                                                                            var11_13 = var1_1 instanceof y61_0;
                                                                            var37_99 = -1;
                                                                            if (var11_13 == 0) break block166;
                                                                            var3_3 = (y61_0)var1_1;
                                                                            var15_20 = var3_3.itemView;
                                                                            var16_38 = R$id.rotatingParent;
                                                                            var15_20 = (RelativeLayout)var15_20.findViewById(var16_38);
                                                                            if (var10_12 != null) {
                                                                                var16_38 = var10_12.getBottomPadding();
                                                                            } else {
                                                                                var16_38 = 0;
                                                                                var8_10 = null;
                                                                            }
                                                                            var16_38 = mz3_0.d(var16_38);
                                                                            var15_20.setPadding(0, 0, 0, var16_38);
                                                                            if (var10_12 != null) {
                                                                                var15_20 = var10_12.getCarouselTimer();
                                                                                if (var15_20 != null) {
                                                                                    var4_6 = var15_20.intValue();
                                                                                } else {
                                                                                    var4_6 = 0;
                                                                                    var15_20 = null;
                                                                                }
                                                                                if (var4_6 > 0) {
                                                                                    var15_20 = var10_12.getCarouselTimer();
                                                                                    if (var15_20 != null) {
                                                                                        var4_6 = var15_20.intValue();
                                                                                    } else {
                                                                                        var4_6 = 0;
                                                                                        var15_20 = null;
                                                                                    }
                                                                                    var3_3.e = var4_6 *= 1000;
                                                                                }
                                                                                if ((var15_20 = var10_12.getBanners()) != null) {
                                                                                    var8_10 = var15_20;
                                                                                    var8_10 = (Collection)var15_20;
                                                                                    var9_11 = var8_10.isEmpty() ^ var7_9;
                                                                                    if (var9_11 != 0) {
                                                                                        var3_3.n = var15_20;
                                                                                        var10_12 = (BannerData)var15_20.get(0);
                                                                                        var11_13 = var10_12.getHeight();
                                                                                        var12_14 = (int)var10_12.getShowTimer();
                                                                                        if (var12_14 != 0) {
                                                                                            var26_76 = nh_2.Companion;
                                                                                            if ((var10_12 = var10_12.getTimerEndTime()) != null) {
                                                                                                var23_67 = var10_12.longValue();
                                                                                            }
                                                                                            var26_76.getClass();
                                                                                            var9_11 = (int)nh$a_0.a(var23_67);
                                                                                            if (var9_11 != 0) {
                                                                                                var9_11 = hv3_0.q(R$dimen.timer_inner_layout_height);
                                                                                                var11_13 += var9_11;
                                                                                            }
                                                                                        }
                                                                                        var10_12 = var3_3.g;
                                                                                        var26_76 = var10_12.getLayoutParams();
                                                                                        var14_16 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
                                                                                        Intrinsics.checkNotNull(var26_76, (String)var14_16);
                                                                                        var26_76 = (RelativeLayout.LayoutParams)var26_76;
                                                                                        var26_76.height = var11_13;
                                                                                        var26_76.width = var37_99;
                                                                                        var10_12.setLayoutParams((ViewGroup.LayoutParams)var26_76);
                                                                                        var25_69 /* !! */  = var3_3.i;
                                                                                        if (var25_69 /* !! */  != null) {
                                                                                            var25_69 /* !! */ .removeAllViews();
                                                                                        }
                                                                                        var26_76 = var3_3.h;
                                                                                        var26_76.clear();
                                                                                        var16_38 = var8_10.size();
                                                                                        var14_16 = null;
                                                                                        for (var13_15 = 0; var13_15 < var16_38; var13_15 += var7_9) {
                                                                                            var18_50 = LayoutInflater.from((Context)var3_3.j);
                                                                                            var38_100 = R$layout.rotating_banner_progress_bar;
                                                                                            var18_50 = var18_50.inflate(var38_100, (ViewGroup)var25_69 /* !! */ , false);
                                                                                            var38_100 = R$id.row_rotate_progressbar_one;
                                                                                            var18_50 = (ProgressBar)var18_50.findViewById(var38_100);
                                                                                            if (var25_69 /* !! */  != null) {
                                                                                                var25_69 /* !! */ .addView((View)var18_50);
                                                                                            }
                                                                                            var26_76.add(var18_50);
                                                                                        }
                                                                                        var16_38 = var3_3.getBindingAdapterPosition();
                                                                                        var8_10 = String.valueOf(var16_38);
                                                                                        var25_69 /* !! */  = var3_3.a;
                                                                                        var3_3.s = var6_8 = new x61_0((List)var15_20, (g71_0)var25_69 /* !! */ , (String)var8_10);
                                                                                        var10_12.setAdapter((Uk2)var6_8);
                                                                                        var39_103 = var15_20.size();
                                                                                        if (var39_103 > var7_9) {
                                                                                            var39_103 = var15_20.size() * 50;
                                                                                            var10_12.setCurrentItem(var39_103);
                                                                                            ** GOTO lbl1138
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            break block163;
                                                                        }
                                                                        var11_13 = var1_1 instanceof c71;
                                                                        if (var11_13 == 0) break block167;
                                                                        var3_3 = (c71)var1_1;
                                                                        var15_21 = this.b.D6();
                                                                        var3_3.getClass();
                                                                        if (var15_21 != null) {
                                                                            var8_10 = var15_21.b;
                                                                            var10_12 = "getLayoutParams(...)";
                                                                            if (var8_10 != null && (var16_39 = var8_10.isEmpty()) == 0 && (var16_39 = var15_21.e) != 0) {
                                                                                var8_10 = var3_3.i;
                                                                                var25_70 = var8_10.getLayoutParams();
                                                                                Intrinsics.checkNotNullExpressionValue(var25_70, (String)var10_12);
                                                                                var25_70.height = -2;
                                                                                var8_10.setLayoutParams((ViewGroup.LayoutParams)var25_70);
                                                                                var8_10 = yn3_0.a;
                                                                                var10_12 = "CLOSET Component visible";
                                                                                var25_70 = new Object[]{};
                                                                                var8_10.a((String)var10_12, (Object[])var25_70);
                                                                                var8_10 = var15_21.c;
                                                                                var9_11 = (int)TextUtils.isEmpty((CharSequence)var8_10);
                                                                                if (var9_11 != 0) {
                                                                                    var8_10 = "Your Wishlist";
                                                                                }
                                                                                var3_3.e.setText((CharSequence)var8_10);
                                                                                var16_39 = var15_21.d;
                                                                                var10_12 = var3_3.f;
                                                                                if (var16_39 > 0) {
                                                                                    var14_16 = "(";
                                                                                    var25_70 = new StringBuilder((String)var14_16);
                                                                                    var25_70.append(var16_39);
                                                                                    var25_70.append(")");
                                                                                    var8_10 = var25_70.toString();
                                                                                    var10_12.setText((CharSequence)var8_10);
                                                                                } else {
                                                                                    var10_12.setText((CharSequence)var18_50);
                                                                                }
                                                                                var8_10 = var3_3.k;
                                                                                var3_3.d.setOnClickListener((View.OnClickListener)var8_10);
                                                                                var10_12 = var15_21.b;
                                                                                var15_21 = var15_21.a;
                                                                                var25_70 = var3_3.b;
                                                                                var8_10 = new hw_1((List)var10_12, (HashMap)var15_21, (g71_0)var25_70);
                                                                                var10_12 = var3_3.a.getContext();
                                                                                var15_21 = new WrapperLinearLayoutManager((Context)var10_12, 0);
                                                                                var10_12 = var3_3.g;
                                                                                var10_12.setLayoutManager((RecyclerView$o)var15_21);
                                                                                var10_12.setAdapter((RecyclerView$f)var8_10);
                                                                                var4_6 = (int)tr2_2.y(false);
                                                                                if (var4_6 != 0 && (var4_6 = (int)tr2_2.i()) != 0) {
                                                                                    var4_6 = 1;
                                                                                } else {
                                                                                    var4_6 = 0;
                                                                                    var15_21 = null;
                                                                                }
                                                                                var8_10 = var3_3.h;
                                                                                if (var4_6 == 0 && (var4_6 = (int)tr2_2.l((ScreenType)(var15_21 = ScreenType.SCREEN_HOME))) == 0) {
                                                                                    var8_10.setVisibility(var12_14);
                                                                                } else {
                                                                                    var8_10.setVisibility(0);
                                                                                    ur2_2.a((View)var8_10, false);
                                                                                }
                                                                                var4_6 = (int)var3_3.j;
                                                                                if (var4_6 == 0) {
                                                                                    var15_21 = AnalyticsManager.Companion.getInstance();
                                                                                    var8_10 = var15_21.getGtmEvents();
                                                                                    var29_84 = 8;
                                                                                    var38_101 = false;
                                                                                    var20_56 = null;
                                                                                    var10_12 = "closet widget";
                                                                                    var25_70 = "widget impression";
                                                                                    var26_77 = "landing screen";
                                                                                    var13_15 = 0;
                                                                                    var14_16 = null;
                                                                                    GTMEvents.pushWidgetInteractionEvent$default((GTMEvents)var8_10, (String)var10_12, (String)var25_70, var26_77, null, var29_84, null);
                                                                                    var3_3.j = var7_9;
                                                                                }
                                                                            } else {
                                                                                var15_21 = yn3_0.a;
                                                                                var17_45 = "CLOSET Component gone";
                                                                                var8_10 = new Object[]{};
                                                                                var15_21.a(var17_45, var8_10);
                                                                                var3_3 = var3_3.i;
                                                                                var15_21 = var3_3.getLayoutParams();
                                                                                Intrinsics.checkNotNullExpressionValue(var15_21, (String)var10_12);
                                                                                var15_21.height = 0;
                                                                                var3_3.setLayoutParams((ViewGroup.LayoutParams)var15_21);
                                                                            }
                                                                        }
                                                                        break block163;
                                                                    }
                                                                    var11_13 = var1_1 instanceof HomeCmsAppUpdateVH;
                                                                    var40_107 = 4;
                                                                    if (var11_13 == 0) break block168;
                                                                    var3_3 = (HomeCmsAppUpdateVH)var1_1;
                                                                    var4_6 = this.w;
                                                                    if (var4_6 != 0) {
                                                                        var8_10 = var3_3.d;
                                                                        var10_12 = var3_3.l;
                                                                        var25_71 = var3_3.k;
                                                                        var14_16 = this.d;
                                                                        var22_65 = var3_3.c;
                                                                        var30_89 = var3_3.b;
                                                                        var20_57 = var3_3.h;
                                                                        var21_61 = var3_3.e;
                                                                        var18_50 = var3_3.g;
                                                                        var26_78 = var3_3.f;
                                                                        if (var4_6 != var7_9) {
                                                                            var5_7 = 2;
                                                                            var17_46 = var3_3.i;
                                                                            if (var4_6 != var5_7) {
                                                                                var5_7 = 3;
                                                                                if (var4_6 != var5_7) {
                                                                                    if (var4_6 == var40_107) {
                                                                                        var3_3.w(true);
                                                                                        var17_46.setVisibility(0);
                                                                                        var26_78.setVisibility(0);
                                                                                        var4_6 = 8;
                                                                                        var18_50.setVisibility(var4_6);
                                                                                        var21_61.setVisibility(var4_6);
                                                                                        var4_6 = R$drawable.rounded_app_update_bg_yellow;
                                                                                        var20_57.setBackgroundResource(var4_6);
                                                                                        var15_22 = hv3_0.K(R$string.app_update_header_4);
                                                                                        var30_89.setText((CharSequence)var15_22);
                                                                                        var15_22 = var30_89.getText().toString();
                                                                                        var3_3.j = var15_22;
                                                                                        var15_22 = hv3_0.K(R$string.app_update_info_4);
                                                                                        var22_65.setText((CharSequence)var15_22);
                                                                                        var15_22 = hv3_0.K(R$string.app_update_btn_txt_2);
                                                                                        var8_10.setText((CharSequence)var15_22);
                                                                                        var8_10.setAlpha(1.0f);
                                                                                        var4_6 = 1;
                                                                                        var8_10.setClickable((boolean)var4_6);
                                                                                        var8_10.setEnabled((boolean)var4_6);
                                                                                        var5_7 = 0;
                                                                                        var6_8 = null;
                                                                                        var15_22 = new a71_0(0, var14_16, var3_3);
                                                                                        var8_10.setOnClickListener((View.OnClickListener)var15_22);
                                                                                        var25_71.removeCallbacks((Runnable)var10_12);
                                                                                    }
                                                                                } else {
                                                                                    var5_7 = 0;
                                                                                    var6_8 = null;
                                                                                    var3_3.w(true);
                                                                                    var17_46.setVisibility(0);
                                                                                    var4_6 = 8;
                                                                                    var26_78.setVisibility(var4_6);
                                                                                    var18_50.setVisibility(0);
                                                                                    var21_61.setVisibility(var4_6);
                                                                                    var4_6 = R$drawable.rounded_app_update_bg_blue;
                                                                                    var20_57.setBackgroundResource(var4_6);
                                                                                    var15_23 = hv3_0.K(R$string.app_update_header_3);
                                                                                    var30_89.setText((CharSequence)var15_23);
                                                                                    var3_3.j = var15_23 = var30_89.getText().toString();
                                                                                    var3_3 = hv3_0.K(R$string.app_update_info_3);
                                                                                    var22_65.setText((CharSequence)var3_3);
                                                                                    var3_3 = hv3_0.K(R$string.app_update_btn_txt_1);
                                                                                    var8_10.setText((CharSequence)var3_3);
                                                                                    var39_104 = 0x3F000000;
                                                                                    var41_108 = 0.5f;
                                                                                    var8_10.setAlpha(var41_108);
                                                                                    var4_6 = 0;
                                                                                    var15_23 = null;
                                                                                    var8_10.setClickable(false);
                                                                                    var8_10.setEnabled(false);
                                                                                    var25_71.removeCallbacks((Runnable)var10_12);
                                                                                    var42_112 = 100;
                                                                                    var25_71.postDelayed((Runnable)var10_12, var42_112);
                                                                                }
                                                                            } else {
                                                                                var5_7 = 1;
                                                                                var3_3.w((boolean)var5_7);
                                                                                var17_46.setVisibility(0);
                                                                                var4_6 = 8;
                                                                                var26_78.setVisibility(var4_6);
                                                                                var18_50.setVisibility(var4_6);
                                                                                var21_61.setVisibility(var4_6);
                                                                                var4_6 = R$drawable.rounded_app_update_bg_blue;
                                                                                var20_57.setBackgroundResource(var4_6);
                                                                                var15_24 = hv3_0.K(R$string.app_update_header_2);
                                                                                var30_89.setText((CharSequence)var15_24);
                                                                                var3_3.j = var15_24 = var30_89.getText().toString();
                                                                                var3_3 = hv3_0.K(R$string.app_update_info_2);
                                                                                var22_65.setText((CharSequence)var3_3);
                                                                                var3_3 = hv3_0.K(R$string.app_update_btn_txt_1);
                                                                                var8_10.setText((CharSequence)var3_3);
                                                                                var39_105 = 0x3F000000;
                                                                                var41_109 = 0.5f;
                                                                                var8_10.setAlpha(var41_109);
                                                                                var4_6 = 0;
                                                                                var15_24 = null;
                                                                                var8_10.setClickable(false);
                                                                                var8_10.setEnabled(false);
                                                                                var25_71.removeCallbacks((Runnable)var10_12);
                                                                                var42_113 = 100;
                                                                                var25_71.postDelayed((Runnable)var10_12, var42_113);
                                                                            }
                                                                        } else {
                                                                            var3_3.w(true);
                                                                            var5_7 = 8;
                                                                            var26_78.setVisibility(var5_7);
                                                                            var18_50.setVisibility(var5_7);
                                                                            var21_61.setVisibility(0);
                                                                            var4_6 = R$drawable.rounded_app_update_bg_blue;
                                                                            var20_57.setBackgroundResource(var4_6);
                                                                            var15_25 = hv3_0.K(R$string.app_update_header_1);
                                                                            var30_89.setText((CharSequence)var15_25);
                                                                            var15_25 = hv3_0.K(R$string.app_update_info_1);
                                                                            var22_65.setText((CharSequence)var15_25);
                                                                            var15_25 = hv3_0.K(R$string.app_update_btn_txt_1);
                                                                            var8_10.setText((CharSequence)var15_25);
                                                                            var8_10.setAlpha(1.0f);
                                                                            var4_6 = 1;
                                                                            var8_10.setClickable((boolean)var4_6);
                                                                            var8_10.setEnabled((boolean)var4_6);
                                                                            var6_8 = new b71_0((po_0)var14_16, (HomeCmsAppUpdateVH)var3_3);
                                                                            var8_10.setOnClickListener((View.OnClickListener)var6_8);
                                                                            var6_8 = new bd0_1(var4_6, var14_16, var3_3);
                                                                            var21_61.setOnClickListener((View.OnClickListener)var6_8);
                                                                            var25_71.removeCallbacks((Runnable)var10_12);
                                                                        }
                                                                    } else {
                                                                        var4_6 = 0;
                                                                        var15_26 = null;
                                                                        var3_3.w(false);
                                                                    }
                                                                    break block163;
                                                                }
                                                                var5_7 = var1_1 instanceof f71_0;
                                                                if (var5_7 == 0) break block169;
                                                                var3_3 = (f71_0)var1_1;
                                                                var3_3.getClass();
                                                                if (var10_12 != null) {
                                                                    var14_16 = var10_12.getCustomData();
                                                                }
                                                                Intrinsics.checkNotNull(var14_16, "null cannot be cast to non-null type com.ril.ajio.services.data.Home.LuxeFooterData");
                                                                var14_16 = (LuxeFooterData)var14_16;
                                                                var15_27 = var14_16.getTitle();
                                                                var6_8 = var3_3.c;
                                                                var6_8.setText((CharSequence)var15_27);
                                                                var15_27 = new e71((LuxeFooterData)var14_16, (f71_0)var3_3);
                                                                var6_8.setOnClickListener((View.OnClickListener)var15_27);
                                                                break block163;
                                                            }
                                                            var5_7 = var1_1 instanceof d71;
                                                            if (var5_7 == 0) break block170;
                                                            var3_3 = (d71)var1_1;
                                                            var3_3.getClass();
                                                            var5_7 = 1;
                                                            var15_28 = new n9(var3_3, var5_7);
                                                            var3_3 = var3_3.c;
                                                            var3_3.setOnClickListener((View.OnClickListener)var15_28);
                                                            break block163;
                                                        }
                                                        var5_7 = var1_1 instanceof v71_0;
                                                        if (var5_7 == 0) break block171;
                                                        var3_3 = (v71_0)var1_1;
                                                        var3_3.getClass();
                                                        if (var10_12 == null) break block163;
                                                        var15_29 = var10_12.getBanners();
                                                        var6_8 = var3_3.g;
                                                        if (var15_29 == null || (var4_6 = (int)var15_29.isEmpty()) != 0) break block172;
                                                        var15_29 = var10_12.getBanners();
                                                        if (var15_29 == null) ** GOTO lbl-1000
                                                        var7_9 = 0;
                                                        var17_47 = null;
                                                        if ((var15_29 = (BannerData)CollectionsKt.N(0, (List)var15_29)) != null) {
                                                            var15_29 = var15_29.getProductIds();
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var4_6 = 0;
                                                            var15_29 = null;
                                                        }
                                                        var17_47 = var3_3.e;
                                                        if ((var15_29 == null || (var4_6 = var15_29.length()) == 0) && (var4_6 = (int)Intrinsics.areEqual(var17_47, var15_29 = Boolean.FALSE)) != 0) break block172;
                                                        var15_29 = var10_12.getBgColor();
                                                        if (var15_29 == null) {
                                                            var15_29 = "#ffffff";
                                                        }
                                                        var4_6 = Color.parseColor((String)var15_29);
                                                        var6_8.setBackgroundColor(var4_6);
                                                        var15_29 = od3_2.a();
                                                        var8_10 = ld3_2.STORE_AJIOGRAM.getStoreId();
                                                        var4_6 = (int)Intrinsics.areEqual(var15_29, var8_10);
                                                        var8_10 = var3_3.h;
                                                        var25_72 /* !! */  = var3_3.i;
                                                        if (var4_6 != 0) {
                                                            var15_29 = var6_8.getContext();
                                                            var12_14 = R$color.color_060c10;
                                                            var4_6 = t70.getColor((Context)var15_29, var12_14);
                                                            var6_8.setBackgroundColor(var4_6);
                                                            var15_29 = var6_8.getContext();
                                                            var12_14 = R$color.white;
                                                            var4_6 = t70.getColor((Context)var15_29, var12_14);
                                                            var25_72 /* !! */ .setTextColor(var4_6);
                                                            var15_29 = var6_8.getContext();
                                                            var12_14 = R$color.white;
                                                            var4_6 = t70.getColor((Context)var15_29, var12_14);
                                                            var8_10.setTextColor(var4_6);
                                                        }
                                                        if ((var12_14 = (int)Intrinsics.areEqual(var17_47, var15_29 = Boolean.TRUE)) != 0) {
                                                            var12_14 = R$string.recently_viewed;
                                                            var26_79 = hv3_0.K(var12_14);
                                                        } else {
                                                            var26_79 = var10_12.getHeading();
                                                        }
                                                        var10_12.setHeading(var26_79);
                                                        var26_79 = var10_12.getHeading();
                                                        var18_50 = var3_3.b;
                                                        if (var26_79 != null && (var12_14 = var26_79.length()) != 0) {
                                                            var3_3.l = var26_79 = var10_12.getHeading();
                                                            var26_79 = var10_12.getHeading();
                                                            var8_10.setText((CharSequence)var26_79);
                                                            ai0_2.B((View)var8_10);
                                                            if (var18_50 != null) {
                                                                var8_10 = var10_12.getHeading();
                                                                var18_50.I((String)var8_10);
                                                            }
                                                        } else {
                                                            ai0_2.i((View)var8_10);
                                                        }
                                                        if ((var8_10 = var10_12.getSubHeading()) != null && (var16_40 = var8_10.length()) != 0) {
                                                            var8_10 = var10_12.getSubHeading();
                                                            var25_72 /* !! */ .setText((CharSequence)var8_10);
                                                            ai0_2.B((View)var25_72 /* !! */ );
                                                        } else {
                                                            ai0_2.i((View)var25_72 /* !! */ );
                                                        }
                                                        var8_10 = var10_12.getBanners();
                                                        if (var8_10 != null) {
                                                            var16_40 = var8_10.size();
                                                        } else {
                                                            var16_40 = 0;
                                                            var8_10 = null;
                                                        }
                                                        if (var16_40 <= 0) break block173;
                                                        if (var18_50 == null || (var8_10 = var18_50.E(var16_40 = var3_3.getBindingAdapterPosition())) == null || (var8_10 = var8_10.getProductUIModelList()) == null) ** GOTO lbl-1000
                                                        var11_13 = 0;
                                                        var25_72 /* !! */  = null;
                                                        if ((var8_10 = (PlpProductUIModel)CollectionsKt.N(0, (List)var8_10)) != null) {
                                                            var8_10 = var8_10.getProductType();
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var16_40 = 0;
                                                            var8_10 = null;
                                                        }
                                                        var25_72 /* !! */  = HomeWidgetTypes.HOME_WIDGET_TYPE_HIDE;
                                                        if (var8_10 != var25_72 /* !! */ ) break block174;
                                                        var3_3 = var6_8.getLayoutParams();
                                                        var4_6 = 0;
                                                        var15_29 = null;
                                                        var3_3.height = 0;
                                                        var3_3.width = 0;
                                                        break block163;
                                                    }
                                                    var4_6 = (int)Intrinsics.areEqual(var17_47, var15_29);
                                                    var15_29 = var4_6 != 0 ? "HOME_RV_WIDGET" : "BackGround_ProductWidget";
                                                    if (var18_50 == null) break block173;
                                                    var5_7 = var3_3.getBindingAdapterPosition();
                                                    var17_47 = var10_12.getBanners();
                                                    if (var17_47 == null) ** GOTO lbl-1000
                                                    var16_40 = 0;
                                                    var8_10 = null;
                                                    if ((var17_47 = (BannerData)CollectionsKt.N(0, (List)var17_47)) != null) {
                                                        var17_47 = var17_47.getProductIds();
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var7_9 = 0;
                                                        var17_47 = null;
                                                    }
                                                    var18_50.G(var5_7, (String)var17_47, (String)var15_29);
                                                }
                                                var5_7 = var3_3.getBindingAdapterPosition();
                                                var17_47 = var3_3.d;
                                                var15_29 = new j91((U71)var18_50, (HomeRowData)var10_12, var5_7, (x82_0)var17_47);
                                                var17_47 = var3_3.a.getContext();
                                                var16_40 = 0;
                                                var8_10 = null;
                                                var6_8 = new CustomLinearLayoutManager((Context)var17_47, 0, false);
                                                var17_47 = var3_3.j;
                                                var17_47.setLayoutManager((RecyclerView$o)var6_8);
                                                var6_8 = var17_47.getAdapter();
                                                if (var6_8 == null) {
                                                    var17_47.setAdapter((RecyclerView$f)var15_29);
                                                }
                                                var15_29 = var3_3.p;
                                                var17_47.addOnScrollListener((RecyclerView$s)var15_29);
                                                var15_29 = var10_12.getBanners();
                                                if (var15_29 != null) {
                                                    var5_7 = 0;
                                                    var6_8 = null;
                                                    if ((var15_29 = (BannerData)CollectionsKt.N(0, (List)var15_29)) != null) {
                                                        var14_16 = var15_29.getUuid();
                                                    }
                                                }
                                                var3_3.o = var14_16;
                                                var15_29 = var3_3.f;
                                                var15_29.b((RecyclerView)var17_47, (TT2$b)var3_3);
                                                var15_29.a((RecyclerView)var17_47, (TT2$b)var3_3);
                                                var5_7 = 1;
                                                var15_29 = new wd0_1(var3_3, var5_7);
                                                var17_47.post((Runnable)var15_29);
                                                break block163;
                                            }
                                            var3_3 = var6_8.getLayoutParams();
                                            var4_6 = 0;
                                            var15_29 = null;
                                            var3_3.height = 0;
                                            var3_3.width = 0;
                                            break block163;
                                        }
                                        var5_7 = var1_1 instanceof p71_0;
                                        if (var5_7 == 0) break block175;
                                        var3_3 = (p71_0)var1_1;
                                        var3_3.q = var10_12;
                                        if (var10_12 == null) break block163;
                                        var15_30 = var10_12.getBanners();
                                        var6_8 = var3_3.h;
                                        if (var15_30 == null || (var4_6 = (int)var15_30.isEmpty()) != 0) break block176;
                                        var15_30 = var10_12.getBgColor();
                                        if (var15_30 != null && (var4_6 = var15_30.length()) > 0) {
                                            var15_30 = var10_12.getBgColor();
                                            var4_6 = Color.parseColor((String)var15_30);
                                            var6_8.setBackgroundColor(var4_6);
                                        } else {
                                            var15_30 = var6_8.getContext();
                                            var7_9 = R$color.white;
                                            var4_6 = t70.getColor((Context)var15_30, var7_9);
                                            var6_8.setBackgroundColor(var4_6);
                                        }
                                        var15_30 = h40_0.a;
                                        var4_6 = (int)h40_0.c();
                                        var17_48 = var3_3.i;
                                        var8_10 = var3_3.j;
                                        if (var4_6 != 0 && (var4_6 = (int)Intrinsics.areEqual(var15_30 = od3_2.a(), var25_73 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0) {
                                            var15_30 = var6_8.getContext();
                                            var11_13 = R$color.color_060c10;
                                            var4_6 = t70.getColor((Context)var15_30, var11_13);
                                            var6_8.setBackgroundColor(var4_6);
                                            var15_30 = var6_8.getContext();
                                            var11_13 = R$color.white;
                                            var4_6 = t70.getColor((Context)var15_30, var11_13);
                                            var8_10.setTextColor(var4_6);
                                            var15_30 = var6_8.getContext();
                                            var11_13 = R$color.white;
                                            var4_6 = t70.getColor((Context)var15_30, var11_13);
                                            var17_48.setTextColor(var4_6);
                                        }
                                        var15_30 = var10_12.getHeading();
                                        var25_73 = var3_3.b;
                                        if (var15_30 != null && (var4_6 = var15_30.length()) != 0) {
                                            var3_3.n = var15_30 = var10_12.getHeading();
                                            var15_30 = var10_12.getHeading();
                                            var17_48.setText((CharSequence)var15_30);
                                            ai0_2.B((View)var17_48);
                                            var15_30 = var10_12.getHeading();
                                            if (var15_30 != null) {
                                                var18_50 = var15_30;
                                            }
                                            var3_3.r = var18_50;
                                            if (var25_73 != null) {
                                                var15_30 = var10_12.getHeading();
                                                var25_73.I((String)var15_30);
                                            }
                                        } else {
                                            ai0_2.i((View)var17_48);
                                        }
                                        if ((var15_30 = var10_12.getSubHeading()) != null && (var4_6 = var15_30.length()) != 0) {
                                            var15_30 = var10_12.getSubHeading();
                                            var8_10.setText((CharSequence)var15_30);
                                            ai0_2.B((View)var8_10);
                                        } else {
                                            ai0_2.i((View)var8_10);
                                        }
                                        var15_30 = var10_12.getBanners();
                                        if (var15_30 != null) {
                                            var4_6 = var15_30.size();
                                        } else {
                                            var4_6 = 0;
                                            var15_30 = null;
                                        }
                                        if (var4_6 <= 0) break block177;
                                        if (var25_73 == null || (var15_30 = var25_73.E(var4_6 = var3_3.getBindingAdapterPosition())) == null || (var15_30 = var15_30.getProducts()) == null) ** GOTO lbl-1000
                                        var7_9 = 0;
                                        var17_48 = null;
                                        if ((var15_30 = (Product)CollectionsKt.N(0, (List)var15_30)) != null) {
                                            var15_30 = var15_30.getProductType();
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var4_6 = 0;
                                            var15_30 = null;
                                        }
                                        var17_48 = var10_12.getBanners();
                                        var16_41 = false;
                                        var8_10 = null;
                                        if (var17_48 != null && (var17_48 = (BannerData)CollectionsKt.N(0, (List)var17_48)) != null) {
                                            var17_48 = var17_48.getNoOfproducts();
                                        } else {
                                            var7_9 = 0;
                                            var17_48 = null;
                                        }
                                        if (var17_48 != null && (var17_48 = var10_12.getBanners()) != null && (var17_48 = (BannerData)CollectionsKt.N(0, (List)var17_48)) != null && (var17_48 = var17_48.getNoOfproducts()) != null) {
                                            var7_9 = var17_48.intValue();
                                        } else {
                                            var7_9 = 0;
                                            var17_48 = null;
                                        }
                                        var8_10 = HomeWidgetTypes.HOME_WIDGET_TYPE_HIDE;
                                        if (var15_30 != var8_10 && var7_9 >= var40_107) break block178;
                                        var3_3 = var6_8.getLayoutParams();
                                        var4_6 = 0;
                                        var15_30 = null;
                                        var3_3.height = 0;
                                        var3_3.width = 0;
                                        break block163;
                                    }
                                    var15_30 = var10_12.getBanners();
                                    var5_7 = 0;
                                    var6_8 = null;
                                    if (var15_30 != null && (var15_30 = (BannerData)CollectionsKt.N(0, (List)var15_30)) != null) {
                                        var15_30 = var15_30.getNoOfproducts();
                                    } else {
                                        var4_6 = 0;
                                        var15_30 = null;
                                    }
                                    if (var15_30 != null) {
                                        var15_30 = var10_12.getBanners();
                                        if (var15_30 != null && (var15_30 = (BannerData)CollectionsKt.N(0, (List)var15_30)) != null) {
                                            var15_30 = var15_30.getNoOfproducts();
                                        } else {
                                            var4_6 = 0;
                                            var15_30 = null;
                                        }
                                        var15_30 = String.valueOf(var15_30);
lbl816:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var15_30 = "10";
                                    ** while (true)
                                    var44_114 = var15_30;
                                    var15_30 = var10_12.getBanners();
                                    var5_7 = 0;
                                    var6_8 = null;
                                    var45_115 = var15_30 != null && (var15_30 = (BannerData)CollectionsKt.N(0, (List)var15_30)) != null ? (var15_30 = var15_30.getFeedLogic()) : null;
                                    var15_30 = var10_12.getBanners();
                                    var46_116 = var15_30 != null && (var15_30 = (BannerData)CollectionsKt.N(0, (List)var15_30)) != null ? (var15_30 = var15_30.getWidgetLevel()) : null;
                                    var47_117 = var10_12.getHeading();
                                    var4_6 = var3_3.getBindingAdapterPosition();
                                    var6_8 = od3_2.a();
                                    var17_48 = ld3_2.STORE_AJIO.getStoreId();
                                    var7_9 = (int)Intrinsics.areEqual(var6_8, var17_48);
                                    if (var7_9 == 0) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var6_8 = "rilfnl";
                                    ** while (true)
                                    var48_118 = var6_8;
                                    var6_8 = var10_12.getBanners();
                                    if (var6_8 == null) ** GOTO lbl-1000
                                    var7_9 = 0;
                                    var17_48 = null;
                                    if ((var6_8 = (BannerData)CollectionsKt.N(0, (List)var6_8)) != null) {
                                        var49_119 = var6_8 = var6_8.getShowDefault();
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var49_119 = null;
                                    }
                                    var50_120 = Boolean.FALSE;
                                    var51_121 = var4_6;
                                    var52_122 = 768;
                                    var6_8 = new WidgetRecord((String)var45_115, (String)var46_116, (String)var44_114, var47_117, var50_120, (Boolean)var49_119, var51_121, (String)var48_118, null, null, var52_122, null);
                                    if (var25_73 != null) {
                                        var4_6 = var3_3.getBindingAdapterPosition();
                                        var25_73.D(var4_6, (WidgetRecord)var6_8);
                                    }
                                }
                                var15_30 = var3_3.f;
                                var6_8 = var15_30.name();
                                var17_48 = "Home";
                                var5_7 = (int)Intrinsics.areEqual(var6_8, var17_48);
                                var8_10 = var3_3.k;
                                if (var5_7 != 0) {
                                    var12_14 = var3_3.getBindingAdapterPosition();
                                    var18_50 = var3_3.e;
                                    var6_8 = new j91((U71)var25_73, (HomeRowData)var10_12, var12_14, (x82_0)var18_50);
                                } else {
                                    ai0_2.q((RecyclerView)var8_10);
                                    var11_13 = hv3_0.q(R$dimen.dimen_24);
                                    var12_14 = hv3_0.q(R$dimen.dimen_8);
                                    var6_8 = new lo_1(var11_13, var12_14);
                                    var8_10.addItemDecoration((RecyclerView$n)var6_8);
                                    var53_123 = var3_3.getBindingAdapterPosition();
                                    var19_54 = var3_3.n;
                                    var30_90 = new n71_0((p71_0)var3_3);
                                    var20_58 = var3_3.b;
                                    var22_66 = var3_3.g;
                                    var18_50 = var6_8;
                                    var6_8 = new bb2_1(var20_58, var53_123, var22_66, var19_54, var30_90);
                                }
                                var26_80 = var3_3.a.getContext();
                                var29_85 = false;
                                var18_50 = null;
                                var25_73 = new CustomLinearLayoutManager(var26_80, 0, false);
                                var8_10.setLayoutManager((RecyclerView$o)var25_73);
                                var25_73 = var8_10.getAdapter();
                                if (var25_73 == null) {
                                    var8_10.setAdapter((RecyclerView$f)var6_8);
                                } else {
                                    var8_10.setAdapter(null);
                                    var8_10.setAdapter((RecyclerView$f)var6_8);
                                }
                                var6_8 = var3_3.s;
                                var8_10.addOnScrollListener((RecyclerView$s)var6_8);
                                var6_8 = var10_12.getBanners();
                                if (var6_8 != null) {
                                    var9_11 = 0;
                                    var10_12 = null;
                                    if ((var6_8 = (BannerData)CollectionsKt.N(0, (List)var6_8)) != null) {
                                        var14_16 = var6_8.getUuid();
                                    }
                                }
                                var3_3.p = var14_16;
                                var6_8 = var3_3.d;
                                var6_8.b((RecyclerView)var8_10, (TT2$b)var3_3);
                                var6_8.a((RecyclerView)var8_10, (TT2$b)var3_3);
                                var15_30 = var15_30.name();
                                var4_6 = (int)Intrinsics.areEqual(var15_30, var17_48);
                                if (var4_6 != 0) {
                                    var6_8 = Looper.getMainLooper();
                                    var15_30 = new Handler((Looper)var6_8);
                                    var7_9 = 1;
                                    var6_8 = new y9(var3_3, var7_9);
                                    var54_124 = 100;
                                    var15_30.postDelayed((Runnable)var6_8, var54_124);
                                }
                                break block163;
                            }
                            var3_3 = var6_8.getLayoutParams();
                            var4_6 = 0;
                            var15_30 = null;
                            var3_3.height = 0;
                            var3_3.width = 0;
                            break block163;
                        }
                        var5_7 = var1_1 instanceof HomeCuratedWidgetVH;
                        if (var5_7 == 0) break block179;
                        var3_3 = (HomeCuratedWidgetVH)var1_1;
                        var3_3.x((HomeRowData)var10_12);
                        break block163;
                    }
                    var5_7 = var1_1 instanceof ue2_0;
                    if (var5_7 == 0) break block180;
                    var3_3 = (ue2_0)var1_1;
                    var15_31 = "LP";
                    var3_3.w(var15_31);
                    break block163;
                }
                var5_7 = var1_1 instanceof zc3_2;
                if (var5_7 == 0) break block181;
                var3_3 = (zc3_2)var1_1;
                var6_8 = (HomeRowData)var8_10.get(var2_2);
                var17_49 = var3_3.itemView;
                var16_42 = R$id.layoutVideo;
                var17_49 = (ConstraintLayout)var17_49.findViewById(var16_42);
                if (var6_8 != null) {
                    var16_42 = var6_8.getBottomPadding();
                } else {
                    var16_42 = 0;
                    var8_10 = null;
                }
                var16_42 = mz3_0.d(var16_42);
                var9_11 = 0;
                var10_12 = null;
                var17_49.setPadding(0, 0, 0, var16_42);
                var17_49 = var3_3.b;
                if (var6_8 == null) ** GOTO lbl-1000
                var8_10 = var6_8.getCarouselTimer();
                if (var8_10 != null) {
                    var16_42 = var8_10.intValue();
                } else {
                    var16_42 = 0;
                    var8_10 = null;
                }
                if (var16_42 > 0) {
                    var8_10 = var6_8.getCarouselTimer();
                    if (var8_10 != null) {
                        var16_42 = var8_10.intValue();
                    } else {
                        var16_42 = 0;
                        var8_10 = null;
                    }
                    var3_3.j = var16_42 *= 1000;
                }
                if ((var6_8 = var6_8.getBanners()) == null) ** GOTO lbl-1000
                var8_10 = var6_8;
                var8_10 = (Collection)var6_8;
                var9_11 = (int)var8_10.isEmpty();
                var11_13 = 1;
                if ((var9_11 ^= var11_13) != 0) {
                    var3_3.d = var10_12 = CollectionsKt.m0((Collection)var8_10);
                    var9_11 = var10_12.size();
                    var5_7 = ((BannerData)var6_8.get(0)).getHeight();
                    var25_74 = var3_3.c;
                    var26_81 /* !! */  = var25_74.getLayoutParams();
                    var26_81 /* !! */ .height = var5_7;
                    var26_81 /* !! */ .width = var37_99;
                    var25_74.setLayoutParams(var26_81 /* !! */ );
                    var6_8 = var3_3.h;
                    var11_13 = 1;
                    if (var9_11 > var11_13) {
                        var25_74 = var3_3.d;
                        if (var25_74 != null && (var11_13 = (int)var25_74.isEmpty()) == 0) {
                            var11_13 = 0;
                            var25_74 = null;
                        } else {
                            var11_13 = 1;
                        }
                        if (var11_13 == 0) {
                            var25_74 = var3_3.d;
                            Intrinsics.checkNotNull(var25_74);
                            var12_14 = 0;
                            var26_81 /* !! */  = null;
                            var25_74 = (BannerData)var25_74.get(0);
                            var18_50 = var3_3.d;
                            Intrinsics.checkNotNull(var18_50);
                            var38_102 = 1;
                            var10_12 = (BannerData)var18_50.get(var9_11 -= var38_102);
                            var18_50 = var3_3.d;
                            Intrinsics.checkNotNull(var18_50);
                            var18_50.add(0, var10_12);
                            var10_12 = var3_3.d;
                            Intrinsics.checkNotNull(var10_12);
                            var10_12.add(var25_74);
                        }
                        if (var6_8 != null) {
                            var6_8.removeAllViews();
                        }
                        var10_12 = var3_3.g;
                        var10_12.clear();
                        var10_12.add(null);
                        var16_42 = var8_10.size();
                        var25_74 = null;
                        for (var11_13 = 0; var11_13 < var16_42; var11_13 += var12_14) {
                            var26_81 /* !! */  = LayoutInflater.from((Context)var3_3.i);
                            var29_86 = R$layout.rotating_banner_progress_bar;
                            var38_102 = 0;
                            var20_59 = null;
                            var26_81 /* !! */  = var26_81 /* !! */ .inflate(var29_86, (ViewGroup)var6_8, false);
                            var29_86 = R$id.row_rotate_progressbar_one;
                            var26_81 /* !! */  = (ProgressBar)var26_81 /* !! */ .findViewById(var29_86);
                            if (var6_8 != null) {
                                var6_8.addView((View)var26_81 /* !! */ );
                            }
                            var10_12.add(var26_81 /* !! */ );
                            var12_14 = 1;
                        }
                        var10_12.add(null);
                    } else if (var6_8 != null) {
                        var16_42 = 8;
                        var6_8.setVisibility(var16_42);
                    }
                    var6_8 = zv0_2.b(var3_3.itemView.getContext());
                    Intrinsics.checkNotNull(var6_8, "null cannot be cast to non-null type android.app.Activity");
                    var6_8 = (Activity)var6_8;
                    var10_12 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                    Intrinsics.checkNotNull(var6_8, (String)var10_12);
                    var6_8 = (AjioHomeActivity)var6_8;
                    var3_3.e = var8_10 = new wd3_2((AjioHomeActivity)var6_8);
                    var6_8 = var3_3.d;
                    if (var6_8 != null) {
                        var14_16 = CollectionsKt.m0((Collection)var6_8);
                    }
                    Intrinsics.checkNotNull(var14_16);
                    var6_8 = var14_16.iterator();
                    while ((var16_42 = (int)var6_8.hasNext()) != 0) {
                        var8_10 = (BannerData)var6_8.next();
                        var10_12 = var3_3.e;
                        if (var10_12 == null) continue;
                        AjioExoPlayerFragment.Companion.getClass();
                        var26_81 /* !! */  = var3_3.a;
                        Intrinsics.checkNotNullParameter(var26_81 /* !! */ , "homeComponentClickListener");
                        var25_74 = new AjioExoPlayerFragment();
                        var14_16 = new Bundle();
                        var18_50 = new Gson();
                        var20_59 = BannerData.class;
                        var8_10 = var18_50.toJson(var8_10, (Type)var20_59);
                        var18_50 = "banner_data";
                        var14_16.putString((String)var18_50, (String)var8_10);
                        var25_74.q = var26_81 /* !! */ ;
                        var25_74.setArguments((Bundle)var14_16);
                        var8_10 = var10_12.j;
                        var8_10.add(var25_74);
                    }
                    var6_8 = var3_3.e;
                    var17_49.setAdapter((RecyclerView$f)var6_8);
                    var6_8 = var3_3.d;
                    if (var6_8 != null) {
                        var5_7 = var6_8.size();
                    } else {
                        var5_7 = 0;
                        var6_8 = null;
                    }
                    var8_10 = new xc3_1((zc3_2)var3_3, var5_7);
                    var17_49.f((ViewPager2$g)var8_10);
                    var39_106 = 1;
                    var41_110 = 1.4E-45f;
                    var5_7 = 0;
                    var6_8 = null;
                    var17_49.setCurrentItem(var39_106, false);
                } else lbl-1000:
                // 3 sources

                {
                    var39_106 = 1;
                    var41_111 = 1.4E-45f;
                }
                var17_49.setId(var39_106 += var4_6);
                break block163;
            }
            var5_7 = var1_1 instanceof Z52;
            if (var5_7 != 0) {
                var3_3 = (Z52)var1_1;
                var15_32 = (HomeRowData)var8_10.get(var2_2);
                var3_3.getClass();
                if (var15_32 != null) {
                    var6_8 = var15_32.getHeading();
                } else {
                    var5_7 = 0;
                    var6_8 = null;
                }
                var5_7 = (int)TextUtils.isEmpty((CharSequence)var6_8);
                if (var5_7 == 0) {
                    if (var15_32 != null) {
                        var14_16 = var15_32.getHeading();
                    }
                    var3_3 = var3_3.e;
                    var3_3.setText((CharSequence)var14_16);
                }
            } else {
                var4_6 = var1_1 instanceof u43_0;
                if (var4_6 != 0) {
                    var3_3 = (u43_0)var1_1;
                    var3_3.x((HomeRowData)var10_12);
                } else {
                    var4_6 = var1_1 instanceof P93;
                    if (var4_6 != 0) {
                        var3_3 = (P93)var1_1;
                        var15_33 = var3_3.a;
                        var5_7 = 20;
                        var5_7 = mz3_0.d(var5_7);
                        var3_3 = new FrameLayout.LayoutParams(var37_99, var5_7);
                        try {
                            var15_33.setLayoutParams((ViewGroup.LayoutParams)var3_3);
                        }
                        catch (Exception var3_4) {
                            yn3_0.a.e(var3_4);
                            var6_8 = null;
                            var5_7 = mz3_0.d(0);
                            var3_5 = new FrameLayout.LayoutParams(var37_99, var5_7);
                            var15_33.setLayoutParams((ViewGroup.LayoutParams)var3_5);
                        }
                    } else {
                        var4_6 = var1_1 instanceof gF2;
                        if (var4_6 != 0) {
                            var15_34 = this.t;
                            if (var15_34 != null) {
                                var3_3 = (gF2)var1_1;
                                var3_3.w(var15_34);
                            }
                        } else {
                            var4_6 = var1_1 instanceof ee1_0;
                            if (var4_6 != 0) {
                                var3_3 = (ee1_0)var1_1;
                                var3_3.w();
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int object) {
        void var8_94;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        HomeViewTypes homeViewTypes = HomeViewTypes.ROW_TYPE_STL;
        int n3 = homeViewTypes.getType();
        g71_0 g71_02 = this.b;
        Object object2 = "inflate(...)";
        OnGAEventHandlerListener onGAEventHandlerListener = null;
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.shop_the_look_list_layout;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            f33_0 f33_02 = new f33_0((View)viewGroup, g71_02);
            return var8_94;
        }
        HomeViewTypes homeViewTypes2 = HomeViewTypes.ROW_TYPE_HLIST;
        n3 = homeViewTypes2.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.home_list_layout;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            OnGAEventHandlerListener onGAEventHandlerListener2 = this.e;
            object2 = this.n;
            z71_0 z71_02 = new z71_0((View)viewGroup, g71_02, onGAEventHandlerListener2, (gx0_2)object2);
            return var8_94;
        }
        HomeViewTypes homeViewTypes3 = HomeViewTypes.ROW_TYPE_FULL_IMAGE;
        n3 = homeViewTypes3.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.home_image_layout;
            viewGroup = layoutInflater.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            t71_0 t71_02 = new t71_0((View)viewGroup, g71_02);
            return var8_94;
        }
        HomeViewTypes homeViewTypes4 = HomeViewTypes.ROW_TYPE_CAROUSEL;
        n3 = homeViewTypes4.getType();
        if (object == n3) {
            y61_0 y61_02;
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n10 = R$layout.home_rotating_image_layout;
            View view = layoutInflater.inflate(n10, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(view, (String)object2);
            g71_0 g71_03 = this.b;
            boolean bl2 = this.j;
            gx0_2 gx0_22 = this.n;
            OnGAEventHandlerListener onGAEventHandlerListener3 = this.e;
            y61_0 y61_03 = y61_02;
            y61_02 = new y61_0(view, g71_03, bl2, gx0_22, onGAEventHandlerListener3);
            return var8_94;
        }
        HomeViewTypes homeViewTypes5 = HomeViewTypes.ROW_TYPE_CLOSET;
        n3 = homeViewTypes5.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n14 = R$layout.layout_home_closet;
            viewGroup = layoutInflater.inflate(n14, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            String string2 = this.c;
            c71 c712 = new c71((View)viewGroup, g71_02, string2);
            return var8_94;
        }
        HomeViewTypes homeViewTypes6 = HomeViewTypes.ROW_TYPE_APP_UPDATE;
        n3 = homeViewTypes6.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n15 = R$layout.component_app_update;
            viewGroup = layoutInflater.inflate(n15, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            HomeCmsAppUpdateVH homeCmsAppUpdateVH = new HomeCmsAppUpdateVH((View)viewGroup);
            return var8_94;
        }
        HomeViewTypes homeViewTypes7 = HomeViewTypes.ROW_TYPE_LUXE_BOTTOM_LINKS;
        n3 = homeViewTypes7.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n16 = R$layout.luxe_footer_layout;
            viewGroup = layoutInflater.inflate(n16, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            mf1_0 mf1_02 = this.f;
            f71_0 f71_02 = new f71_0((View)viewGroup, mf1_02);
            return var8_94;
        }
        HomeViewTypes homeViewTypes8 = HomeViewTypes.ROW_TYPE_LUXE_BOTTOM_SCROLL_TO_TOP;
        n3 = homeViewTypes8.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n17 = R$layout.layout_back_to_top;
            viewGroup = layoutInflater.inflate(n17, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            lf1_0 lf1_02 = this.g;
            d71 d712 = new d71((View)viewGroup, lf1_02);
            return var8_94;
        }
        HomeViewTypes homeViewTypes9 = HomeViewTypes.ROW_TYPE_PRODUCT_WIDGET;
        n3 = homeViewTypes9.getType();
        if (object == n3) {
            v71_0 v71_02;
            boolean bl3 = og1_1.c();
            if (bl3) {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n3 = R$layout.home_product_widget_vh_layout_luxe;
                viewGroup = layoutInflater.inflate(n3, viewGroup, false);
            } else {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n3 = R$layout.home_product_widget_vh_layout;
                viewGroup = layoutInflater.inflate(n3, viewGroup, false);
            }
            g71_02 = viewGroup;
            Intrinsics.checkNotNull(viewGroup);
            Boolean bl4 = Boolean.FALSE;
            onGAEventHandlerListener = this.e;
            x82_0 x82_02 = this.i;
            object2 = this.h;
            tt2_2 tt2_22 = this.m;
            v71_0 v71_03 = v71_02;
            v71_02 = new v71_0((View)viewGroup, (U71)object2, onGAEventHandlerListener, x82_02, bl4, tt2_22);
            return var8_94;
        }
        HomeViewTypes homeViewTypes10 = HomeViewTypes.ROW_TYPE_RECENTLYVIEWED_WIDGET;
        n3 = homeViewTypes10.getType();
        if (object == n3) {
            v71_0 v71_04;
            boolean bl5 = og1_1.c();
            if (bl5) {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n3 = R$layout.home_product_widget_vh_layout_luxe;
                viewGroup = layoutInflater.inflate(n3, viewGroup, false);
            } else {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n3 = R$layout.home_product_widget_vh_layout;
                viewGroup = layoutInflater.inflate(n3, viewGroup, false);
            }
            g71_02 = viewGroup;
            Intrinsics.checkNotNull(viewGroup);
            Boolean bl6 = Boolean.TRUE;
            onGAEventHandlerListener = this.e;
            x82_0 x82_03 = this.i;
            object2 = this.h;
            tt2_2 tt2_23 = this.m;
            v71_0 v71_05 = v71_04;
            v71_04 = new v71_0((View)viewGroup, (U71)object2, onGAEventHandlerListener, x82_03, bl6, tt2_23);
            return var8_94;
        }
        ac3_2 ac3_22 = ac3_2.VIDEO_CAROUSE;
        n3 = ac3_22.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n18 = R$layout.video_view;
            viewGroup = layoutInflater.inflate(n18, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            zc3_2 zc3_22 = new zc3_2((View)viewGroup, g71_02);
            return var8_94;
        }
        HomeViewTypes homeViewTypes11 = HomeViewTypes.ROW_TYPE_RATINGS_WIDGET;
        n3 = homeViewTypes11.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n19 = R$layout.home_rating_view;
            viewGroup = layoutInflater.inflate(n19, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            ue2_0 ue2_02 = new ue2_0((View)viewGroup);
            return var8_94;
        }
        HomeViewTypes homeViewTypes12 = HomeViewTypes.ROW_TYPE_DYNAMIC_WIDGET;
        n3 = homeViewTypes12.getType();
        int n20 = 1;
        e00$a e00$a = this.r;
        if (object == n3) {
            p71_0 p71_02;
            int[] nArray = E61$a.$EnumSwitchMapping$0;
            n3 = e00$a.ordinal();
            int n21 = nArray[n3];
            if (n21 == n20) {
                boolean bl7 = og1_1.c();
                if (bl7) {
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                    n3 = R$layout.home_product_widget_vh_layout_luxe;
                    viewGroup = layoutInflater.inflate(n3, viewGroup, false);
                } else {
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                    n3 = R$layout.home_product_widget_vh_layout;
                    viewGroup = layoutInflater.inflate(n3, viewGroup, false);
                }
                Intrinsics.checkNotNull(viewGroup);
            } else {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n3 = R$layout.curated_product_widget_layout_pdp;
                viewGroup = layoutInflater.inflate(n3, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
            }
            g71_02 = viewGroup;
            tt2_2 tt2_24 = this.m;
            x82_0 x82_04 = this.i;
            object2 = this.h;
            onGAEventHandlerListener = this.e;
            e00$a e00$a2 = this.r;
            k92_0 k92_02 = this.s;
            p71_0 p71_03 = p71_02;
            p71_02 = new p71_0((View)viewGroup, (U71)object2, onGAEventHandlerListener, tt2_24, x82_04, e00$a2, k92_02);
            return var8_94;
        }
        HomeViewTypes homeViewTypes13 = HomeViewTypes.ROW_TYPE_CURATED_WIDGET;
        n3 = homeViewTypes13.getType();
        if (object == n3) {
            HomeCuratedWidgetVH homeCuratedWidgetVH;
            int[] nArray = E61$a.$EnumSwitchMapping$0;
            n3 = e00$a.ordinal();
            int n22 = nArray[n3];
            if (n22 == n20) {
                boolean bl8 = og1_1.c();
                if (bl8) {
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                    n3 = R$layout.home_product_widget_vh_layout_luxe;
                    viewGroup = layoutInflater.inflate(n3, viewGroup, false);
                } else {
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                    n3 = R$layout.home_product_widget_vh_layout;
                    viewGroup = layoutInflater.inflate(n3, viewGroup, false);
                }
                Intrinsics.checkNotNull(viewGroup);
            } else {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n3 = R$layout.curated_product_widget_layout_pdp;
                viewGroup = layoutInflater.inflate(n3, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
            }
            g71_02 = viewGroup;
            tt2_2 tt2_25 = this.m;
            kc1_2 kc1_22 = this.p;
            object2 = this.h;
            onGAEventHandlerListener = this.e;
            OnGACuratedWidgetEventHandlerListener onGACuratedWidgetEventHandlerListener = this.q;
            e00$a e00$a3 = this.r;
            HomeCuratedWidgetVH homeCuratedWidgetVH2 = homeCuratedWidgetVH;
            homeCuratedWidgetVH = new HomeCuratedWidgetVH((View)viewGroup, (U71)object2, onGAEventHandlerListener, tt2_25, kc1_22, onGACuratedWidgetEventHandlerListener, e00$a3);
            return var8_94;
        }
        HomeViewTypes homeViewTypes14 = HomeViewTypes.ROW_TYPE_OLP_CARDS_WIDGET;
        n3 = homeViewTypes14.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            n20 = R$layout.olp_home_carousel_layout;
            viewGroup = layoutInflater.inflate(n20, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            b62 b622 = this.o;
            object2 = this.h;
            Z52 z52 = new Z52((View)viewGroup, g71_02, b622, (U71)object2);
            return var8_94;
        }
        HomeViewTypes homeViewTypes15 = HomeViewTypes.ROW_TYPE_SIMILAR_ITEMS;
        n3 = homeViewTypes15.getType();
        if (object == n3) {
            u43_0 u43_02;
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            n3 = R$layout.curated_product_widget_layout_pdp;
            View view = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNull(view);
            U71 u71 = this.h;
            OnGAEventHandlerListener onGAEventHandlerListener4 = this.e;
            tt2_2 tt2_26 = this.m;
            k92_0 k92_03 = this.s;
            u43_0 u43_03 = u43_02;
            u43_02 = new u43_0(view, u71, onGAEventHandlerListener4, tt2_26, k92_03);
            return var8_94;
        }
        HomeViewTypes homeViewTypes16 = HomeViewTypes.ROW_TYPE_RECENT_SEARCH_WIDGET;
        n3 = homeViewTypes16.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            n3 = R$layout.search_view_row;
            viewGroup = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            AV2 aV2 = this.v;
            return new gF2((View)viewGroup, aV2);
        }
        HomeViewTypes homeViewTypes17 = HomeViewTypes.ROW_TYPE_IMAGE_SEARCH_WIDGET;
        n3 = homeViewTypes17.getType();
        if (object == n3) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            n3 = R$layout.image_search_layout;
            viewGroup = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            FV2 fV2 = this.u;
            Intrinsics.checkNotNull(fV2);
            return new ee1_0((View)viewGroup, fV2);
        }
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n24 = R$layout.layout_space_home;
        viewGroup = layoutInflater.inflate(n24, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
        P93 p93 = new P93((View)viewGroup);
        return var8_94;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewAttachedToWindow(RecyclerView$B var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = "holder";
        Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
        super.onViewAttachedToWindow((RecyclerView$B)var1_1);
        this.y = var5_5 = var1_1.getLayoutPosition();
        var5_5 = var1_1 instanceof y61_0;
        var6_6 = this.n;
        var7_7 = "";
        var8_8 /* !! */  = "isPdBanner";
        var9_9 = this.e;
        var10_10 = "pageType";
        var11_11 = "servedFromCms";
        var12_12 = "bannerPosition";
        var13_13 = "componentPosition";
        var14_14 = "bannerImpression";
        var15_15 = this.l;
        var16_16 = this.k;
        var17_17 = "screenType";
        var18_18 = "screenName";
        var19_19 = var7_7;
        if (var5_5 != 0) {
            var3_3 = (y61_0)var1_1;
            var5_5 = var3_3.l;
            var3_3.x(var5_5);
            var4_4 = var3_3.s;
            if (var4_4 != null && (var4_4 = var4_4.f) != null) {
                var4_4.b();
            }
            var5_5 = var3_3.getLayoutPosition();
            Intrinsics.checkNotNullParameter(var16_16, (String)var18_18);
            Intrinsics.checkNotNullParameter(var15_15, var17_17);
            var3_3.p = var5_5;
            var3_3.q = var16_16;
            var3_3.r = var15_15;
            var4_4 = var3_3.n;
            if (var4_4 != null) {
                var20_20 = var4_4;
                var20_20 = ((Iterable)var4_4).iterator();
                var21_22 = 0;
                var7_7 = null;
                while (var22_24 = var20_20.hasNext()) {
                    var23_25 /* !! */  = var20_20.next();
                    var24_26 = var21_22 + 1;
                    if (var21_22 >= 0) {
                        block50: {
                            var23_25 /* !! */  = (BannerData)var23_25 /* !! */ ;
                            var23_25 /* !! */  = var4_4;
                            var23_25 /* !! */  = (Collection)var4_4;
                            var22_24 = var23_25 /* !! */ .isEmpty();
                            var25_27 = var9_9;
                            var26_28 = true;
                            var27_32 = var22_24 ^ true;
                            if (var27_32) {
                                var26_28 = false;
                                var23_25 /* !! */  = var4_4.get(0);
                                var9_9 = var23_25 /* !! */ ;
                                var9_9 = (BannerData)var23_25 /* !! */ ;
                                var22_24 = var9_9.isAnalyticsEventPushed();
                                if (!var22_24) {
                                    var23_25 /* !! */  = var4_4;
                                    var4_4 = var9_9.isAdBanner();
                                    var28_33 = var8_8 /* !! */ ;
                                    var8_8 /* !! */  = Boolean.TRUE;
                                    var5_5 = (int)Intrinsics.areEqual(var4_4, var8_8 /* !! */ );
                                    if (var5_5 != 0) {
                                        var9_9.setAnalyticsEventPushed(true);
                                        var5_5 = var3_3.getLayoutPosition();
                                        var21_22 = var3_3.getAbsoluteAdapterPosition();
                                        var8_8 /* !! */  = var9_9.getBannerAdsMetaData();
                                        var4_4 = var5_5;
                                        var7_7 = var21_22;
                                        var6_6.invoke(var8_8 /* !! */ , var4_4, var7_7);
                                        while (true) {
                                            var1_1 = var3_3;
                                            var4_4 = var25_27;
                                            var7_7 = var28_33;
                                            break block50;
                                            break;
                                        }
                                    }
                                } else {
                                    var23_25 /* !! */  = var4_4;
                                    var28_33 = var8_8 /* !! */ ;
                                }
                                if ((var5_5 = (int)var9_9.isAnalyticsEventPushed()) != 0 || (var4_4 = var9_9.getBannerUrl()) == null || (var5_5 = var4_4.length()) == 0) ** continue;
                                var5_5 = 1;
                                var9_9.setAnalyticsEventPushed((boolean)var5_5);
                                var4_4 = AnalyticsManager.Companion.getInstance().getGa();
                                var8_8 /* !! */  = var9_9.getBannerUrl();
                                var4_4.trackCMSLandingPageCustomDimension((String)var8_8 /* !! */ );
                                var4_4 = new Message();
                                var4_4.what = var29_34 = 1003;
                                var8_8 /* !! */  = new JSONObject();
                                var1_1 = var3_3;
                                var3_3 = var9_9.getBannerUrl();
                                Intrinsics.checkNotNull(var3_3);
                                var8_8 /* !! */ .put(var14_14, var3_3);
                                var30_36 = var2_2.y;
                                var8_8 /* !! */ .put(var13_13, (int)var30_36);
                                var8_8 /* !! */ .put(var12_12, var21_22);
                                var8_8 /* !! */ .put((String)var18_18, var16_16);
                                var8_8 /* !! */ .put(var17_17, var15_15);
                                var30_36 = true;
                                var8_8 /* !! */ .put(var11_11, var30_36);
                                var3_3 = yx0_0.a;
                                var8_8 /* !! */ .put(var10_10, var3_3);
                                cp_1.Companion.getClass();
                                var3_3 = cp$a.e();
                                var7_7 = var9_9.getHotspots();
                                if (var7_7 == null || (var7_7 = (HotSpotT)CollectionsKt.firstOrNull((List)var7_7)) == null || (var7_7 = var7_7.getHotspotUrl()) == null) {
                                    var7_7 = var19_19;
                                }
                                var3_3.getClass();
                                var30_36 = cp_1.d((String)var7_7);
                                var7_7 = var28_33;
                                var8_8 /* !! */ .put((String)var28_33, var30_36);
                                var4_4.obj = var8_8 /* !! */ ;
                                var3_3 = AnalyticsGAEventHandler.Companion;
                                var8_8 /* !! */  = var3_3.getInstance();
                                var8_8 /* !! */ .sendMessage((Message)var4_4);
                                var3_3 = var3_3.getInstance();
                                var4_4 = var25_27;
                                var3_3.setOnGAEventHandlerListener((OnGAEventHandlerListener)var25_27);
                            } else {
                                var1_1 = var3_3;
                                var23_25 /* !! */  = var4_4;
                                var7_7 = var8_8 /* !! */ ;
                                var4_4 = var9_9;
                            }
                        }
                        var3_3 = var1_1;
                        var9_9 = var4_4;
                        var8_8 /* !! */  = var7_7;
                        var4_4 = var23_25 /* !! */ ;
                        var21_22 = var24_26;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
            }
        } else {
            var7_7 = var8_8 /* !! */ ;
            var4_4 = var9_9;
            var29_35 = var1_1 instanceof t71_0;
            if (var29_35 != 0) {
                var3_3 = (t71_0)var1_1;
                var8_8 /* !! */  = var3_3.b;
                if (var8_8 /* !! */  != null) {
                    var8_8 /* !! */ .b();
                }
                if ((var8_8 /* !! */  = var3_3.c) != null) {
                    var8_8 /* !! */  = ((Iterable)var8_8 /* !! */ ).iterator();
                    var26_29 = 0;
                    var9_9 = null;
                    while (var31_41 = var8_8 /* !! */ .hasNext()) {
                        var15_15 = var8_8 /* !! */ .next();
                        var32_42 = var26_29 + 1;
                        if (var26_29 >= 0) {
                            block51: {
                                var15_15 = (BannerData)var15_15;
                                var33_43 = var15_15.isAnalyticsEventPushed();
                                var1_1 = var8_8 /* !! */ ;
                                if (var33_43 == 0) {
                                    var8_8 /* !! */  = var15_15.isAdBanner();
                                    var33_43 = var32_42;
                                    var16_16 = Boolean.TRUE;
                                    var29_35 = Intrinsics.areEqual(var8_8 /* !! */ , var16_16);
                                    if (var29_35 != 0) {
                                        var15_15.setAnalyticsEventPushed(true);
                                        var29_35 = var3_3.getLayoutPosition();
                                        var26_29 = var3_3.getAbsoluteAdapterPosition();
                                        var15_15 = var15_15.getBannerAdsMetaData();
                                        var8_8 /* !! */  = var29_35;
                                        var9_9 = var26_29;
                                        var6_6.invoke(var15_15, var8_8 /* !! */ , var9_9);
                                        while (true) {
                                            var20_21 = var3_3;
                                            break block51;
                                            break;
                                        }
                                    }
                                } else {
                                    var33_43 = var32_42;
                                }
                                if ((var29_35 = (int)var15_15.isAnalyticsEventPushed()) != 0 || (var8_8 /* !! */  = var15_15.getBannerUrl()) == null || (var29_35 = var8_8 /* !! */ .length()) == 0) ** continue;
                                var29_35 = 1;
                                var15_15.setAnalyticsEventPushed((boolean)var29_35);
                                var8_8 /* !! */  = AnalyticsManager.Companion.getInstance().getGa();
                                var16_16 = var15_15.getBannerUrl();
                                var8_8 /* !! */ .trackCMSLandingPageCustomDimension((String)var16_16);
                                var8_8 /* !! */  = new Message();
                                var8_8 /* !! */ .what = var32_42 = 1003;
                                var16_16 = new JSONObject();
                                var20_21 = var3_3;
                                var3_3 = var15_15.getBannerUrl();
                                Intrinsics.checkNotNull(var3_3);
                                var16_16.put(var14_14, var3_3);
                                var30_37 = var2_2.y;
                                var16_16.put(var13_13, (int)var30_37);
                                var16_16.put(var12_12, var26_29);
                                var3_3 = "home landing screen";
                                var16_16.put((String)var18_18, var3_3);
                                var16_16.put(var17_17, var3_3);
                                var30_37 = true;
                                var16_16.put(var11_11, var30_37);
                                var3_3 = yx0_0.a;
                                var16_16.put(var10_10, var3_3);
                                cp_1.Companion.getClass();
                                var3_3 = cp$a.e();
                                var9_9 = var15_15.getHotspots();
                                if (var9_9 == null || (var9_9 = (HotSpotT)CollectionsKt.firstOrNull((List)var9_9)) == null || (var9_9 = var9_9.getHotspotUrl()) == null) {
                                    var9_9 = var19_19;
                                }
                                var3_3.getClass();
                                var30_37 = cp_1.d((String)var9_9);
                                var16_16.put((String)var7_7, var30_37);
                                var8_8 /* !! */ .obj = var16_16;
                                var3_3 = AnalyticsGAEventHandler.Companion;
                                var9_9 = var3_3.getInstance();
                                var9_9.sendMessage((Message)var8_8 /* !! */ );
                                var3_3 = var3_3.getInstance();
                                var3_3.setOnGAEventHandlerListener((OnGAEventHandlerListener)var4_4);
                            }
                            var8_8 /* !! */  = var1_1;
                            var26_29 = var33_43;
                            var3_3 = var20_21;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                }
            } else {
                var34_44 = 0;
                var6_6 = null;
                var21_23 = var1_1 instanceof f33_0;
                if (var21_23) {
                    var3_3 = (f33_0)var1_1;
                    var6_6 = var3_3.c;
                    if (var6_6 != null) {
                        var6_6 = ((Iterable)var6_6).iterator();
                        while (var21_23 = var6_6.hasNext()) {
                            var7_7 = (BannerData)var6_6.next();
                            var29_35 = var7_7.isAnalyticsEventPushed();
                            if (var29_35 != 0 || (var8_8 /* !! */  = var7_7.getBannerUrl()) == null || (var29_35 = var8_8 /* !! */ .length()) == 0) continue;
                            var29_35 = 1;
                            var7_7.setAnalyticsEventPushed((boolean)var29_35);
                            var8_8 /* !! */  = AnalyticsManager.Companion.getInstance().getGa();
                            var9_9 = var7_7.getBannerUrl();
                            var8_8 /* !! */ .trackCMSLandingPageCustomDimension((String)var9_9);
                            var8_8 /* !! */  = new Message();
                            var8_8 /* !! */ .what = var26_30 = 1003;
                            var9_9 = new JSONObject();
                            var7_7 = var7_7.getBannerUrl();
                            Intrinsics.checkNotNull(var7_7);
                            var9_9.put(var14_14, var7_7);
                            var21_23 = var3_3.getLayoutPosition();
                            var9_9.put(var13_13, (int)var21_23);
                            var21_23 = var3_3.getAbsoluteAdapterPosition();
                            var9_9.put(var12_12, (int)var21_23);
                            var9_9.put((String)var18_18, var16_16);
                            var9_9.put(var17_17, var15_15);
                            var21_23 = true;
                            var9_9.put(var11_11, var21_23);
                            var7_7 = yx0_0.a;
                            var9_9.put(var10_10, var7_7);
                            var8_8 /* !! */ .obj = var9_9;
                            var7_7 = AnalyticsGAEventHandler.Companion;
                            var9_9 = var7_7.getInstance();
                            var9_9.sendMessage((Message)var8_8 /* !! */ );
                            var7_7 = var7_7.getInstance();
                            var7_7.setOnGAEventHandlerListener((OnGAEventHandlerListener)var4_4);
                        }
                    }
                } else {
                    var21_23 = var1_1 instanceof v71_0;
                    if (var21_23) {
                        var3_3 = (v71_0)var1_1;
                        var7_7 = var3_3.e;
                        var4_4 = Boolean.TRUE;
                        var5_5 = (int)Intrinsics.areEqual(var7_7, var4_4);
                        if (var5_5 != 0) {
                            var4_4 = this.h;
                            if (var4_4 != null) {
                                var34_44 = var3_3.getBindingAdapterPosition();
                                var18_18 = var4_4.C(var34_44);
                            } else {
                                var35_45 = 0;
                                var18_18 = null;
                            }
                            if (var18_18 != null) {
                                var34_44 = var3_3.getBindingAdapterPosition();
                                var7_7 = var2_2.a;
                                var30_38 = var3_3.getBindingAdapterPosition();
                                if ((var3_3 = (HomeRowData)var7_7.get(var30_38)) != null && (var3_3 = var3_3.getBanners()) != null) {
                                    var21_23 = false;
                                    var7_7 = null;
                                    var3_3 = (BannerData)var3_3.get(0);
                                } else {
                                    var21_23 = false;
                                    var7_7 = null;
                                }
                                var3_3 = od3_2.a();
                                var8_8 /* !! */  = ld3_2.STORE_AJIOGRAM.getStoreId();
                                var29_35 = Intrinsics.areEqual(var3_3, var8_8 /* !! */ );
                                if (var29_35 != 0) {
                                    var35_45 = 2;
                                } else {
                                    var8_8 /* !! */  = ld3_2.STORE_LUXE.getStoreId();
                                    var30_38 = (int)Intrinsics.areEqual(var3_3, var8_8 /* !! */ );
                                    if (var30_38 != 0) {
                                        var35_45 = 1;
                                    } else {
                                        var35_45 = 0;
                                        var18_18 = null;
                                    }
                                }
                                var4_4.J(var34_44, var35_45);
                            }
                        }
                    } else {
                        var34_44 = var1_1 instanceof HomeCmsAppUpdateVH;
                        if (var34_44 != 0) {
                            var3_3 = oo_0.Companion;
                            var3_3.getClass();
                            var30_39 = Oo$a.a();
                            if (var30_39 && !(var30_39 = this.x)) {
                                var3_3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                var5_5 = qo_0.a;
                                var4_4 = var5_5;
                                var6_6 = "landing screen";
                                var7_7 = "soft update widget - viewed";
                                var3_3.pushUpdateAppEvent((String)var7_7, var4_4, (String)var6_6);
                                this.x = var30_39 = true;
                            }
                        } else {
                            var34_44 = var1_1 instanceof zc3_2;
                            if (var34_44 != 0) {
                                var3_3 = (zc3_2)var1_1;
                                var6_6 = var3_3.d;
                                if (var6_6 != null) {
                                    var6_6 = var6_6.iterator();
                                    while (var21_23 = var6_6.hasNext()) {
                                        var7_7 = (BannerData)var6_6.next();
                                        var29_35 = (int)var7_7.isAnalyticsEventPushed();
                                        if (var29_35 != 0 || (var8_8 /* !! */  = var7_7.getBannerUrl()) == null || (var29_35 = var8_8 /* !! */ .length()) == 0) continue;
                                        var29_35 = 1;
                                        var7_7.setAnalyticsEventPushed((boolean)var29_35);
                                        var8_8 /* !! */  = AnalyticsManager.Companion.getInstance().getGa();
                                        var9_9 = var7_7.getBannerUrl();
                                        var8_8 /* !! */ .trackCMSLandingPageCustomDimension((String)var9_9);
                                        var8_8 /* !! */  = new Message();
                                        var8_8 /* !! */ .what = var26_31 = 1003;
                                        var9_9 = new JSONObject();
                                        var7_7 = var7_7.getBannerUrl();
                                        Intrinsics.checkNotNull(var7_7);
                                        var9_9.put(var14_14, var7_7);
                                        var21_23 = var3_3.getLayoutPosition();
                                        var9_9.put(var13_13, (int)var21_23);
                                        var21_23 = var3_3.getAbsoluteAdapterPosition();
                                        var9_9.put(var12_12, (int)var21_23);
                                        var9_9.put((String)var18_18, var16_16);
                                        var9_9.put(var17_17, var15_15);
                                        var21_23 = true;
                                        var9_9.put(var11_11, var21_23);
                                        var7_7 = yx0_0.a;
                                        var9_9.put(var10_10, var7_7);
                                        var8_8 /* !! */ .obj = var9_9;
                                        var7_7 = AnalyticsGAEventHandler.Companion;
                                        var9_9 = var7_7.getInstance();
                                        var9_9.sendMessage((Message)var8_8 /* !! */ );
                                        var7_7 = var7_7.getInstance();
                                        var7_7.setOnGAEventHandlerListener((OnGAEventHandlerListener)var4_4);
                                    }
                                }
                            } else {
                                var5_5 = var1_1 instanceof ue2_0;
                                if (var5_5 != 0) {
                                    var3_3 = (ue2_0)var1_1;
                                    var4_4 = var3_3.c;
                                    if (var4_4 != null) {
                                        var30_40 = var3_3.getLayoutPosition();
                                        var4_4 = var4_4.k;
                                        if (var4_4 != null) {
                                            var4_4.Pa(var30_40);
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

    public final void onViewDetachedFromWindow(RecyclerView$B object) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewDetachedFromWindow((RecyclerView$B)object);
        int n3 = object instanceof y61_0;
        if (n3 != 0) {
            object = (y61_0)object;
            object2 = ((y61_0)object).m;
            if (object2 != null) {
                Intrinsics.checkNotNull(object2);
                object2.cancel();
            }
            if ((object = ((y61_0)object).s) != null && (object = ((x61_0)object).f) != null && (object = ((nh_2)object).b) != null) {
                object.cancel();
            }
        } else {
            n3 = object instanceof t71_0;
            if (n3 != 0) {
                object = ((t71_0)object).b;
                if (object != null && (object = ((nh_2)object).b) != null) {
                    object.cancel();
                }
            } else {
                n3 = object instanceof zc3_2;
                if (n3 != 0) {
                    object = (zc3_2)object;
                    object2 = ((zc3_2)object).m;
                    if (object2 != null) {
                        Intrinsics.checkNotNull(object2);
                        object2.cancel();
                    }
                    if ((object2 = ((zc3_2)object).e) != null) {
                        int n4 = ((zc3_2)object).b.getCurrentItem();
                        object = ((wd3_2)object2).i(n4);
                    } else {
                        boolean bl2 = false;
                        object = null;
                    }
                    object2 = "null cannot be cast to non-null type com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment";
                    Intrinsics.checkNotNull(object, (String)object2);
                    object = (AjioExoPlayerFragment)object;
                    ((AjioExoPlayerFragment)object).Qa();
                } else {
                    n3 = object instanceof z71_0;
                    if (n3 != 0) {
                        object = ((RecyclerView$B)object).itemView;
                        n3 = R$id.hList;
                        if ((n3 = ig2_2.a((RecyclerView)(object = (RecyclerView)object.findViewById(n3)))) >= 0) {
                            object = ((RecyclerView)object).findViewHolderForAdapterPosition(n3);
                            String string2 = "null cannot be cast to non-null type com.ril.ajio.home.landingpage.viewholder.cms.HomeListSubViewHolder";
                            Intrinsics.checkNotNull(object, string2);
                            object = (x71_0)object;
                            ((x71_0)object).y(n3);
                        }
                    }
                }
            }
        }
    }
}

