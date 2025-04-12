/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.home.landingpage.activity.CustomVideoPlayerActivity;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.HomeViewTypes;
import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Closet.ClosetComponentModel;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.options.CuratedLayoutType;
import com.ril.ajio.services.data.options.CuratedWidget;
import com.ril.ajio.services.data.options.CuratedWidgetItem;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.ProductListQuery;
import com.ril.ajio.services.utils.NewQueryUtil;
import com.ril.ajio.services.utils.ServiceUtil;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import com.ril.ajio.view.BaseActivity;
import io.reactivex.Scheduler;
import java.lang.constant.Constable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class e00
implements g71_0,
U71,
x82_0,
b62,
kc1_2 {
    public zr1_1 A;
    public Product B;
    public final HashMap C;
    public RecyclerView D;
    public final hh3_2 E;
    public final hh3_2 F;
    public final hh3_2 G;
    public final hh3_2 H;
    public final hh3_2 I;
    public final hh3_2 J;
    public final Activity a;
    public final ky1_0 b;
    public final vh3_2 c;
    public final po_0 d;
    public final mf1_0 e;
    public final lf1_0 f;
    public String g;
    public final OnGAEventHandlerListener h;
    public final mu1_1 i;
    public final sD3 j;
    public final boolean k;
    public final F12 l;
    public final OnFragmentInteractionListener m;
    public final OnGACuratedWidgetEventHandlerListener n;
    public final e00$a o;
    public final k92_0 p;
    public final ArrayList q;
    public final FV2 r;
    public final AV2 s;
    public final NewEEcommerceEventsRevamp t;
    public String u;
    public E61 v;
    public final ArrayList w;
    public final hh3_2 x;
    public Set y;
    public String z;

    public e00(FragmentActivity fragmentActivity, ky1_0 ky1_02, vh3_2 vh3_22, po_0 po_02, mf1_0 mf1_02, lf1_0 lf1_02, OnGAEventHandlerListener onGAEventHandlerListener, mu1_1 mu1_12, sD3 sD32, boolean bl2, F12 f12, OnFragmentInteractionListener onFragmentInteractionListener, OnGACuratedWidgetEventHandlerListener onGACuratedWidgetEventHandlerListener, e00$a e00$a, k92_0 k92_02, ArrayList arrayList, FV2 fV2, AV2 aV2, int n3) {
        Object object;
        k92_0 k92_03;
        OnFragmentInteractionListener onFragmentInteractionListener2;
        lf1_0 lf1_03;
        mf1_0 mf1_03;
        Object object2;
        Object object3;
        e00 e002 = this;
        Object object4 = fragmentActivity;
        Object object5 = ky1_02;
        mu1_1 mu1_13 = mu1_12;
        Object object6 = sD32;
        Object object7 = f12;
        int n4 = n3;
        int n7 = n3 & 4;
        if (n7 != 0) {
            n7 = 0;
            object3 = null;
        } else {
            object3 = vh3_22;
        }
        int n8 = n4 & 8;
        if (n8 != 0) {
            n8 = 0;
            object2 = null;
        } else {
            object2 = po_02;
        }
        int n10 = n4 & 0x10;
        if (n10 != 0) {
            n10 = 0;
            mf1_03 = null;
        } else {
            mf1_03 = mf1_02;
        }
        int n14 = n4 & 0x20;
        if (n14 != 0) {
            n14 = 0;
            lf1_03 = null;
        } else {
            lf1_03 = lf1_02;
        }
        int n15 = n4 & 0x400;
        n15 = n15 != 0 ? 0 : (int)(bl2 ? 1 : 0);
        int n16 = n4 & 0x1000;
        if (n16 != 0) {
            n16 = 0;
            onFragmentInteractionListener2 = null;
        } else {
            onFragmentInteractionListener2 = onFragmentInteractionListener;
        }
        int n17 = n4 & 0x4000;
        e00$a e00$a2 = n17 != 0 ? e00$a.Home : e00$a;
        int n18 = 0x8000 & n4;
        if (n18 != 0) {
            n18 = 0;
            k92_03 = null;
        } else {
            k92_03 = k92_02;
        }
        int n19 = n4 & 0x10000;
        ArrayList arrayList2 = n19 != 0 ? null : arrayList;
        n19 = n4 & 0x20000;
        FV2 fV22 = n19 != 0 ? null : fV2;
        n19 = 262144;
        if ((n4 &= n19) != 0) {
            n4 = 0;
            object = null;
        } else {
            object = aV2;
        }
        Intrinsics.checkNotNullParameter(object4, "activity");
        Intrinsics.checkNotNullParameter(mu1_13, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(object6, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(object7, "plpViewModel");
        Intrinsics.checkNotNullParameter((Object)e00$a2, "cmsPageType");
        e002.a = object4;
        e002.b = object5;
        e002.c = object3;
        e002.d = object2;
        e002.e = mf1_03;
        e002.f = lf1_03;
        object4 = null;
        e002.g = null;
        object3 = onGAEventHandlerListener;
        e002.h = onGAEventHandlerListener;
        e002.i = mu1_13;
        e002.j = object6;
        e002.k = n15;
        e002.l = object7;
        e002.m = onFragmentInteractionListener2;
        object6 = onGACuratedWidgetEventHandlerListener;
        e002.n = onGACuratedWidgetEventHandlerListener;
        e002.o = e00$a2;
        e002.p = k92_03;
        Object object8 = arrayList2;
        e002.q = arrayList2;
        object8 = fV22;
        e002.r = fV22;
        e002.s = object;
        e002.t = object6 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        object6 = new ArrayList();
        e002.w = object6;
        object6 = new vz_1(e002);
        e002.x = object6 = yr1_2.b((Function0)object6);
        object6 = new HashMap();
        e002.C = object6;
        object6 = new wz_2(e002);
        e002.E = object6 = yr1_2.b((Function0)object6);
        n4 = 0;
        object6 = new xz_1(e002, 0);
        e002.F = object6 = yr1_2.b((Function0)object6);
        n7 = 0;
        object = new yz_1(e002, 0);
        e002.G = object = yr1_2.b((Function0)object);
        object = new zz_1(e002, 0);
        e002.H = object = yr1_2.b((Function0)object);
        object = new a00(e002, 0);
        e002.I = object = yr1_2.b((Function0)object);
        object = new b00(e002);
        e002.J = object = yr1_2.b((Function0)object);
        object3 = this.f().j;
        object8 = new d00(e002, 0);
        object2 = new e00$b((Function1)object8);
        ((LiveData)object3).e(mu1_13, (F62)object2);
        object3 = this.f().l;
        object8 = new qz_2(e002);
        object2 = new e00$b((Function1)object8);
        ((LiveData)object3).e(mu1_13, (F62)object2);
        object3 = this.g().e;
        n8 = 1;
        object8 = new hl_2(e002, n8);
        object2 = new e00$b((Function1)object8);
        ((LiveData)object3).e(mu1_13, (F62)object2);
        object3 = this.f().e;
        object8 = new rz_2(e002);
        object2 = new e00$b((Function1)object8);
        ((LiveData)object3).e(mu1_13, (F62)object2);
        if (object5 != null && (object3 = ((ky1_0)object5).m) != null) {
            n8 = 0;
            object8 = new sz_1(e002, 0);
            object2 = new e00$b((Function1)object8);
            ((LiveData)object3).e(mu1_13, (F62)object2);
        }
        object8 = object5 != null ? ((ky1_0)object5).o : null;
        Intrinsics.checkNotNull(object8);
        object4 = new tz_0(e002, 0);
        object5 = new e00$b((Function1)object4);
        ((LiveData)object8).e(mu1_13, (F62)object5);
        object4 = ((F12)object7).d.f;
        object5 = new l4_0(e002, 1);
        object7 = new e00$b((Function1)object5);
        ((LiveData)object4).e(mu1_13, (F62)object7);
        object4 = ((r43_0)((hh3_2)object).getValue()).d;
        object5 = new ul_2(e002, 1);
        object7 = new e00$b((Function1)object5);
        ((LiveData)object4).e(mu1_13, (F62)object7);
        object4 = ((tf2_2)((hh3_2)object6).getValue()).e;
        object5 = new vl_2(e002, 1);
        object6 = new e00$b((Function1)object5);
        ((LiveData)object4).e(mu1_13, (F62)object6);
    }

    public final boolean A(int n3) {
        HashMap hashMap = this.C;
        Constable constable = Integer.valueOf(n3);
        if ((constable = (Boolean)hashMap.get(constable)) != null) {
            n3 = (int)(((Boolean)constable).booleanValue() ? 1 : 0);
        } else {
            n3 = 0;
            constable = null;
        }
        return n3 != 0;
    }

    public final void B(int n3, WidgetRecord widgetRecord) {
        int n4;
        Intrinsics.checkNotNullParameter(widgetRecord, "widgetRecord");
        Intrinsics.checkNotNullParameter("BackGround_ProductWidget", "requestID");
        Object object = this.B;
        String string2 = null;
        if (object != null) {
            object = ((Product)object).getCode();
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null && (n4 = ((String)object).length()) != 0) {
            object = this.f().b;
            Object object2 = n3;
            if ((object = (RecentlyViewedProducts)((HashMap)object).get(object2)) == null) {
                object = this.f();
                ((oz_2)object).b(n3);
                Object object3 = this.z;
                if (object3 == null) {
                    object3 = widgetRecord.getCurrentStore();
                }
                widgetRecord.setCurrentStore((String)object3);
                object2 = object3 = this.J.getValue();
                object2 = (r43_0)object3;
                object3 = this.B;
                if (object3 != null) {
                    string2 = ((Product)object3).getCode();
                }
                object3 = h40_0.a;
                boolean bl2 = h40_0.b2();
                int n7 = 432;
                r43_0.b((r43_0)object2, string2, bl2, null, null, widgetRecord, null, false, n7);
            }
        }
    }

    public final RecentlyViewedProducts C(int n3) {
        HashMap hashMap = this.f().b;
        Integer n4 = n3;
        return (RecentlyViewedProducts)hashMap.get(n4);
    }

    /*
     * WARNING - void declaration
     */
    public final void D(int n3, WidgetRecord object) {
        Object object2 = "widgetRecord";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter("BackGround_ProductWidget", "requestID");
        Object object3 = this.f().b;
        Integer n4 = n3;
        object3 = (RecentlyViewedProducts)((HashMap)object3).get(n4);
        if (object3 == null) {
            void var7_13;
            void var7_10;
            object3 = this.f();
            ((oz_2)object3).b(n3);
            Object object4 = this.z;
            if (object4 == null) {
                object4 = ((WidgetRecord)object).getCurrentStore();
            }
            ((WidgetRecord)object).setCurrentStore((String)object4);
            object4 = this.l;
            object4.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = z40_0.Companion;
            object4 = ((F12)object4).d;
            object3 = ((bv2_0)object4).a;
            object2.getClass();
            int bl2 = z40$a.a((Context)object3).a.g("plp_page_size");
            object3 = new ProductListQuery();
            ((ProductListQuery)object3).setPageSize(bl2);
            ((ProductListQuery)object3).setCategoryId("83");
            ((bv2_0)object4).t1 = object2 = ((WidgetRecord)object).getWidgetID();
            ((bv2_0)object4).x1 = object2 = ((WidgetRecord)object).getWidgetName();
            ((bv2_0)object4).u1 = object2 = ((WidgetRecord)object).getWidgetType();
            ((bv2_0)object4).Z0 = object2 = ((WidgetRecord)object).getCurrentStore();
            object2 = ((WidgetRecord)object).getShowDefault();
            if (object2 != null) {
                boolean bl3 = (Boolean)object2;
            } else {
                boolean bl4 = false;
                object2 = null;
            }
            ((bv2_0)object4).v1 = object2 = Boolean.valueOf((boolean)var7_10);
            ((bv2_0)object4).z1 = object2 = ((WidgetRecord)object).getWidgetFilters();
            ((bv2_0)object4).A1 = object2 = ((WidgetRecord)object).getBannerType();
            ((bv2_0)object4).w1 = object2 = ((WidgetRecord)object).getWidgetMinProdCount();
            object2 = ((WidgetRecord)object).getShowViewAllWidget();
            if (object2 != null) {
                boolean bl5 = (Boolean)object2;
            } else {
                boolean bl6 = true;
            }
            ((bv2_0)object4).y1 = var7_13;
            ((bv2_0)object4).B1 = object = ((WidgetRecord)object).getAdapterPositionOfWidget();
            object = Boolean.FALSE;
            ((bv2_0)object4).h((ProductListQuery)object3, (Boolean)object);
        }
    }

    public final gw_2 D6() {
        return this.f().a;
    }

    public final RecentlyViewedProducts E(int n3) {
        HashMap hashMap = this.f().b;
        Integer n4 = n3;
        return (RecentlyViewedProducts)hashMap.get(n4);
    }

    public final void F(int n3, WidgetRecord widgetRecord, String string2) {
        Object object = widgetRecord;
        String string3 = string2;
        String string4 = "widgetRecord";
        Intrinsics.checkNotNullParameter(widgetRecord, string4);
        Object object2 = "widgetName";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        Object object3 = this.f().c;
        Object object4 = n3;
        object3 = (CuratedWidget)((HashMap)object3).get(object4);
        if (object3 == null) {
            Object object5;
            int n4;
            Object object6;
            Object object7 = this.f();
            object7.getClass();
            Intrinsics.checkNotNullParameter(string2, (String)object2);
            int n7 = 15;
            int n8 = 0;
            Object object8 = null;
            object4 = null;
            boolean bl2 = false;
            Object object9 = null;
            Object object10 = null;
            String string5 = null;
            object3 = object6;
            object6 = new CuratedWidget(null, null, null, null, n7, null);
            object2 = CuratedLayoutType.HOME_WIDGET_TYPE_SHIMMER;
            ((CuratedWidget)object6).setLayoutType((CuratedLayoutType)((Object)object2));
            ArrayList<CuratedWidgetItem> arrayList = new ArrayList<CuratedWidgetItem>();
            String string6 = null;
            for (int i3 = 0; i3 < (n4 = 4); ++i3) {
                object3 = null;
                object4 = null;
                bl2 = false;
                object9 = null;
                object10 = null;
                object2 = object8;
                object5 = string2;
                n8 = 15;
                string6 = null;
                object8 = new CuratedWidgetItem(null, null, null, null, i3, string2, n8, null);
                arrayList.add((CuratedWidgetItem)object8);
            }
            ((CuratedWidget)object6).setCuratedWidgetItemList(arrayList);
            object2 = n3;
            ((oz_2)object7).c.put(object2, object6);
            object2 = this;
            object3 = this.z;
            if (object3 == null) {
                object3 = widgetRecord.getCurrentStore();
            }
            ((WidgetRecord)object).setCurrentStore((String)object3);
            object3 = this.f();
            object3.getClass();
            Intrinsics.checkNotNullParameter(object, string4);
            n9_0.a.getClass();
            Intrinsics.checkNotNullParameter(object, string4);
            object4 = UrlHelper.Companion.getInstance();
            object9 = new Object[]{};
            object10 = "homepage";
            string5 = "home_curated_widget";
            object8 = ((UrlHelper)object4).getApiUrl((String)object10, string5, object9);
            object4 = n9_0.l;
            bl2 = ((UserInformation)object4).isUserOnline();
            if (bl2) {
                object9 = ((UserInformation)object4).getCustomerUUID();
            } else {
                bl2 = false;
                object9 = null;
            }
            object6 = NewQueryUtil.INSTANCE.getCuratedWidgetApiQueryParam((WidgetRecord)object, (String)object9);
            Intrinsics.checkNotNullExpressionValue(object4, "userInformation");
            object4 = ServiceUtil.getToken((UserInformation)object4);
            string6 = kp1_0.c("Bearer ", (String)object4);
            string4 = n9_0.k;
            object5 = n9_0.b;
            string3 = n9_0.j;
            object7 = "newCuratedWidgetCallHome";
            object4 = object5.getCuratedWidgetOptions((String)object8, string6, string3, string4, (String)object7, (Map)object6);
            object9 = qt2_2.c;
            object4 = ((g53_0)object4).h((Scheduler)object9);
            object9 = ti_2.a();
            object4 = ((g53_0)object4).e((Scheduler)object9);
            object9 = new h9_0(0);
            string5 = null;
            object10 = new i9_0(object9, 0);
            object9 = new s53_0((q63_0)object4, (bx0_2)object10);
            object4 = new j9_0(0);
            object10 = new u53_0((q63_0)object9, (bx0_2)object4);
            Intrinsics.checkNotNullExpressionValue(object10, "onErrorReturn(...)");
            bl2 = false;
            object4 = new cz_1(0, object, object3);
            object9 = new fz_2((cz_1)object4);
            object4 = new gz_2((oz_2)object3, (WidgetRecord)object);
            object = new hz_2(object4);
            object = ((g53_0)object10).f((o60_0)object9, (o60_0)object);
            object3 = ((oz_2)object3).g;
            ((t30_0)object3).b((yr0_2)object);
        } else {
            object2 = this;
        }
    }

    public final void G(int n3, String object, String object2) {
        Object object3 = "requestID";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = this.f().b;
        Integer n4 = n3;
        object4 = (RecentlyViewedProducts)((HashMap)object4).get(n4);
        if (object4 == null) {
            int n7;
            object4 = this.f();
            ((oz_2)object4).b(n3);
            if (object != null && (n7 = ((String)object).length()) != 0) {
                object4 = this.f();
                object4.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                n9_0.a.getClass();
                object = n9_0.b((String)object, (String)object2);
                object2 = new iz_2((oz_2)object4, n3);
                object3 = new jz_2((Function1)object2);
                object2 = new kz_2((oz_2)object4, n3);
                int n8 = 1;
                Object object5 = new w3_0(object2, n8);
                object5 = ((g53_0)object).f((o60_0)object3, (o60_0)object5);
                object = ((oz_2)object4).g;
                ((t30_0)object).b((yr0_2)object5);
            }
        }
    }

    public final CuratedWidget H(int n3) {
        HashMap hashMap = this.f().c;
        Integer n4 = n3;
        return (CuratedWidget)hashMap.get(n4);
    }

    public final void I(String string2) {
        this.u = string2;
    }

    public final void J(int n3, int n4) {
        ArrayList arrayList = this.g().d;
        Integer n7 = n3;
        boolean bl2 = arrayList.contains(n7);
        if (!bl2) {
            arrayList = this.g().d;
            Integer n8 = n3;
            arrayList.add(n8);
        }
        this.g().b(n4);
    }

    public final void Y9(String string2, String string3, String string4, String string5, String string6) {
        Object object = string2;
        String string7 = string3;
        Object object2 = string4;
        String string8 = string5;
        String string9 = string6;
        Intrinsics.checkNotNullParameter(string2, "orderStatus");
        Intrinsics.checkNotNullParameter(string4, "returnId");
        String string10 = "position";
        Object object3 = dm_1.a(string5, "orderId", string6, string10);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            string10 = "clicked_item_code";
            object3.putString(string10, string3);
        }
        string10 = "return_refund_return_id";
        object3.putString(string10, (String)object2);
        object3.putString("product_code", string8);
        object2 = this.m;
        if (object2 != null) {
            string10 = com.ril.ajio.myaccount.order.fragment.b.Z;
            int n3 = 2;
            object2.onFragmentInteraction(string10, n3, (Bundle)object3);
        }
        object2 = zE2.a;
        Intrinsics.checkNotNullParameter(string9, "rank");
        Bundle bundle = new Bundle();
        bundle.putString("order_id", string8);
        bundle.putString("product_id", string7);
        bundle.putString("order_status", (String)object);
        bundle.putInt("isrefundfail", 1);
        object = AnalyticsManager.Companion;
        object3 = av_0.a((AnalyticsManager$Companion)object);
        string10 = av_0.a((AnalyticsManager$Companion)object);
        String string11 = bv_0.a((AnalyticsManager$Companion)object);
        String string12 = cv_0.a((AnalyticsManager$Companion)object);
        object = zE2.a;
        string8 = string6;
        string9 = "lp_order_widget_interaction";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "landing screen interaction", "home order widget click", string6, string9, (String)object3, string10, string11, bundle, string12, false, null, 1536, null);
    }

    public final void Z6(BannerData object, List object2) {
        Intrinsics.checkNotNullParameter(object, "bannerData");
        Intrinsics.checkNotNullParameter(object2, "bannerList");
        Object object3 = this.a;
        Object object4 = object3.getApplication();
        Object object5 = new jo_2((Context)object4);
        Intrinsics.checkNotNullParameter(object, "clickedBanner");
        object5 = "bannersList";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        boolean bl2 = object3 instanceof AjioHomeActivity;
        if (bl2) {
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
            Activity activity = object3;
            activity = (AjioHomeActivity)object3;
            ShopTheLookFragment.Companion.getClass();
            ShopTheLookFragment shopTheLookFragment = new ShopTheLookFragment();
            object3 = new Gson();
            object3 = ((Gson)object3).toJson(object);
            object4 = new Gson();
            object2 = ((Gson)object4).toJson(object2);
            object4 = new Bundle();
            object4.putString("clickedBannerData", (String)object3);
            object4.putString((String)object5, (String)object2);
            shopTheLookFragment.setArguments((Bundle)object4);
            Fragment fragment = activity.T0;
            Boolean bl3 = Boolean.FALSE;
            boolean bl4 = true;
            String string2 = "ShopTheLook";
            activity.Q1(fragment, shopTheLookFragment, bl4, string2, bl3);
        }
        if ((object = ((BannerData)object).getBannerUrl()) != null) {
            this.f().getClass();
            object2 = "shop the look";
            object5 = "";
            object3 = null;
            oz_2.h((String)object2, (String)object, (String)object5, false);
        }
    }

    public final void a(WidgetRecord widgetRecord, CuratedWidgetItem curatedWidgetItem, int n3, boolean bl2, String string2) {
        int n4;
        String string3;
        e00 e002 = this;
        boolean bl3 = bl2;
        Intrinsics.checkNotNullParameter(widgetRecord, "widgetRecord");
        Object object = e00$a.Home;
        Object object2 = this.o;
        String string4 = null;
        if (object2 == object) {
            object = AnalyticsManager.Companion;
            String string5 = bv_0.a((AnalyticsManager$Companion)object);
            String string6 = cv_0.a((AnalyticsManager$Companion)object);
            Object var13_15 = null;
            object = this.t;
            string3 = "home landing screen";
            String string7 = "home landing screen";
            int n7 = 192;
            object2 = curatedWidgetItem;
            n4 = n3;
            NewEEcommerceEventsRevamp.pushEECuratedWidgetOptionSelectPromotion$default((NewEEcommerceEventsRevamp)object, curatedWidgetItem, n3, string3, string5, string7, string6, null, null, n7, null);
        } else {
            Bundle bundle = new Bundle();
            object = this.B;
            object = object != null ? ((Product)object).getCode() : null;
            object2 = "product_id";
            bundle.putString((String)object2, (String)object);
            object = e002.B;
            object = object != null ? ((Product)object).getName() : null;
            object2 = "product_name";
            bundle.putString((String)object2, (String)object);
            object = e002.B;
            object = object != null && (object = ((Product)object).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object).getBrandName() : null;
            object2 = "product_brand";
            bundle.putString((String)object2, (String)object);
            object = e002.B;
            object = object != null ? ((Product)object).getBrickName() : null;
            object2 = "product_brick";
            bundle.putString((String)object2, (String)object);
            object = e002.B;
            object = object != null ? ((Product)object).getBrickCategory() : null;
            bundle.putString("product_category", (String)object);
            string3 = "pdp widget screen";
            String string8 = "pdp screen";
            object = e002.t;
            String string9 = "pdp widget screen";
            String string10 = "pdp screen";
            object2 = curatedWidgetItem;
            n4 = n3;
            ((NewEEcommerceEventsRevamp)object).pushEECuratedWidgetOptionSelectPromotion(curatedWidgetItem, n3, string3, string8, string9, string10, bundle, string2);
        }
        object = new Bundle();
        object2 = "enable_ads_on_plp";
        object.putBoolean((String)object2, bl3);
        Object object3 = widgetRecord.getWidgetID();
        object.putString("widgetID", (String)object3);
        string3 = widgetRecord.getWidgetType();
        object.putString("widgetType", string3);
        string3 = widgetRecord.getWidgetName();
        object.putString("widgetName", string3);
        object3 = widgetRecord.getShowDefault();
        if (object3 != null) {
            n4 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
        } else {
            n4 = 0;
            object3 = null;
        }
        string3 = "showDefaultWidget";
        object.putBoolean(string3, n4 != 0);
        object3 = e002.z;
        if (object3 == null) {
            object3 = widgetRecord.getCurrentStore();
        }
        object.putString("widgetStore", (String)object3);
        string3 = widgetRecord.getWidgetFilters();
        object.putString("widgetFilters", string3);
        object3 = "bannerType";
        string3 = widgetRecord.getBannerType();
        object.putString((String)object3, string3);
        object.putBoolean((String)object2, bl3);
        object2 = curatedWidgetItem != null ? curatedWidgetItem.getWidgetName() : null;
        object3 = "widgetComponentName";
        object.putString((String)object3, (String)object2);
        object2 = curatedWidgetItem != null ? curatedWidgetItem.getHeader() : null;
        if (curatedWidgetItem != null) {
            string4 = curatedWidgetItem.getSubheader();
        }
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(" ");
        ((StringBuilder)object3).append(string4);
        object2 = ((StringBuilder)object3).toString();
        object.putString("widgetOptionName", (String)object2);
        kj0_1 kj0_12 = kj0_1.g();
        object2 = e002.a;
        kj0_12.u((Activity)object2, "/widget/", "", "", (Bundle)object);
    }

    public final void b(zr1_1 object) {
        Intrinsics.checkNotNullParameter(object, "orderListMutableLiveData");
        this.A = object;
        Object object2 = object = this.F.getValue();
        object2 = (tf2_2)object;
        boolean bl2 = hv3_0.D();
        object2.getClass();
        object = md3_0.c((jD3)object2);
        rf2_2 rf2_22 = new rf2_2((tf2_2)object2, "LAST6MONTH", bl2, true, null);
        Ae3.d((i90_0)object, null, null, rf2_22, 3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(ArrayList var1_1, ClosetComponentModel var2_2) {
        block8: {
            var3_3 = this.f();
            var3_3.getClass();
            if (var1_1 == null || (var4_4 = var1_1.size()) <= 0) break block8;
            var4_4 = var1_1.size();
            var6_6 = null;
            for (var5_5 = 0; var5_5 < var4_4; ++var5_5) {
                block10: {
                    block9: {
                        var7_7 /* !! */  = (HomeRowData)var1_1.get(var5_5);
                        var7_7 /* !! */  = var7_7 /* !! */  != null ? var7_7 /* !! */ .getType() : null;
                        if (var7_7 /* !! */  != (var8_8 = HomeViewTypes.ROW_TYPE_CLOSET)) continue;
                        if (var2_2 == null) break block9;
                        var1_1 = var2_2.getClosetPriceFromDb();
                        if (var1_1 == null) ** GOTO lbl-1000
                        var1_1 = var2_2.getClosetPriceFromDb();
                        Intrinsics.checkNotNull(var1_1);
                        var9_9 = var1_1.size();
                        if (var9_9 != 0) {
                            var1_1 = var3_3.a;
                            if (var1_1 != null) {
                                var1_1.a = var10_10 = var2_2.getClosetPriceFromDb();
                            }
                        } else if ((var1_1 = var3_3.a) != null) {
                            var1_1.a = null;
                        }
                        if ((var1_1 = var3_3.a) != null) {
                            var10_10 = var2_2.getClosetItemsInOrder();
                            var1_1.b = var10_10;
                        }
                        if ((var1_1 = var2_2.getClosetItemsInOrder()) != null) {
                            var1_1 = AnalyticsManager.Companion;
                            var2_2 = var1_1.getInstance().getGtmEvents();
                            var10_10 = av_0.a((AnalyticsManager$Companion)var1_1);
                            var6_6 = "Closet_";
                            var10_10 = cP.a(var6_6, (String)var10_10, "_Shown");
                            var7_7 /* !! */  = av_0.a((AnalyticsManager$Companion)var1_1);
                            var6_6 = kp1_0.c(var6_6, (String)var7_7 /* !! */ );
                            ak0_0.a((AnalyticsManager$Companion)var1_1, (GTMEvents)var2_2, (String)var10_10, var6_6);
                        }
                        break block10;
                    }
                    var3_3.a = null;
                }
                if ((var1_1 = var3_3.a) == null) break;
                var1_1.e = var11_11 = true;
                break;
            }
        }
        if ((var1_1 = this.v) != null) {
            var1_1.notifyDataSetChanged();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void c4(String string2, HotSpotT hotSpotT, String string3, BannerData bannerData, String string4, String string5) {
        String string6;
        String string7;
        Object object;
        Bundle bundle;
        int n3;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        e00 e002;
        block37: {
            int n7;
            Object object7;
            Object object8;
            String string8;
            block35: {
                int n8;
                block36: {
                    Object object9;
                    e002 = this;
                    object6 = string2;
                    object5 = string3;
                    string8 = string5;
                    object4 = hotSpotT;
                    Intrinsics.checkNotNullParameter(hotSpotT, "hotspot");
                    object3 = bannerData;
                    Intrinsics.checkNotNullParameter(bannerData, "bannerData");
                    object2 = "creativeSlot";
                    Intrinsics.checkNotNullParameter(string5, (String)object2);
                    n8 = 0;
                    object8 = null;
                    if (string2 != null && (n4 = string2.length()) != 0 && (n3 = (int)(Intrinsics.areEqual(string2, object9 = "NOTIFY_ME") ? 1 : 0)) != 0) {
                        int n10;
                        Object var29_64;
                        boolean bl2;
                        String string9;
                        String string10;
                        String string11;
                        Object object10;
                        object6 = this.y;
                        if (object6 == null) return;
                        Object object11 = object6;
                        Iterable iterable = (Iterable)object6;
                        object5 = hotSpotT.getMetadata();
                        object5 = object5 != null ? ((HotSpotMetaData)object5).getHotspotMetadataId() : null;
                        boolean bl3 = CollectionsKt.F(iterable, object5);
                        if (bl3) {
                            object6 = z40_0.Companion;
                            object6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object6).a;
                            String string12 = "notifyMeFailureMsg";
                            object10 = object6 = ((ao0_0)object6).b(string12);
                        } else {
                            AnalyticsData analyticsData;
                            z40$a z40$a = z40_0.Companion;
                            String string13 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("notifyMeSuccessMsg");
                            object5 = new HashMap();
                            object3 = hotSpotT.getMetadata();
                            object3 = object3 != null ? ((HotSpotMetaData)object3).getHotspotMetadataId() : null;
                            object9 = "hotspotMetadataId";
                            ((HashMap)object5).put(object9, object3);
                            object3 = hotSpotT.getMetadata();
                            object3 = object3 != null ? ((HotSpotMetaData)object3).getEvent() : null;
                            ((HashMap)object5).put("notifyme_banner_name", object3);
                            object3 = AnalyticsManager.Companion.getInstance().getCt();
                            object9 = analyticsData;
                            string11 = null;
                            boolean bl4 = false;
                            string10 = null;
                            string9 = null;
                            long l2 = 0L;
                            bl2 = false;
                            var29_64 = null;
                            object2 = analyticsData;
                            n10 = 0;
                            analyticsData = null;
                            int n14 = 65279;
                            ((AnalyticsData)object9)(null, null, null, l2, null, null, null, null, (HashMap)object5, null, null, null, null, null, null, null, n14, null);
                            ((CleverTapEvents)object3).sendNotifyMeEvent((AnalyticsData)object9);
                            object2 = hotSpotT.getMetadata();
                            if (object2 != null) {
                                object2 = ((HotSpotMetaData)object2).getHotspotMetadataId();
                            } else {
                                boolean bl5 = false;
                                object2 = null;
                            }
                            Intrinsics.checkNotNull(object2);
                            object6.add(object2);
                            object2 = this.f();
                            object4 = (UserInformation)e002.x.getValue();
                            object5 = "<get-userInformation>(...)";
                            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                            object2.getClass();
                            Intrinsics.checkNotNullParameter(object6, "set");
                            Intrinsics.checkNotNullParameter(object4, "userInformation");
                            object2 = new Gson();
                            object6 = ((Gson)object2).toJson(object6);
                            ((UserInformation)object4).setNotifyMeData((String)object6);
                            object10 = string13;
                        }
                        n3 = 1;
                        hv3_0.o0(n3, (String)object10, null);
                        object6 = AnalyticsManager.Companion.getInstance();
                        object9 = ((AnalyticsManager)object6).getGtmEvents();
                        Object var33_75 = null;
                        bl2 = false;
                        var29_64 = null;
                        string11 = "landing screen interactions";
                        string10 = "landing_screen_interactions";
                        string9 = "Notify me click";
                        n10 = 32;
                        GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)object9, string11, string10, string9, (String)object10, null, null, n10, null);
                        return;
                    }
                    if (object5 == null) return;
                    n3 = string3.length();
                    if (n3 == 0) {
                        return;
                    }
                    n3 = (int)(h40_0.Q1() ? 1 : 0);
                    object2 = "";
                    if (n3 != 0) {
                        cp_1.Companion.getClass();
                        object6 = cp$a.e();
                        object6.getClass();
                        n3 = (int)(cp_1.d(string3) ? 1 : 0);
                        if (n3 != 0) {
                            void var10_19;
                            object6 = this.f();
                            object4 = bannerData.getBannerUrl();
                            if (object4 != null) {
                                object2 = object4;
                            }
                            object4 = cp$a.e();
                            object4.getClass();
                            boolean bl6 = cp_1.d(string3);
                            object6.getClass();
                            oz_2.h(object5, (String)object2, string8, bl6);
                            object6 = (jo_2)e002.E.getValue();
                            int n15 = 1;
                            ((jo_2)object6).A(n15 != 0);
                            AJIOApplication.Companion.getClass();
                            AJIOApplication aJIOApplication = AJIOApplication$a.a();
                            object6 = new jo_2((Context)aJIOApplication);
                            object6 = ((jo_2)object6).l();
                            if (object6 != null) {
                                AddressType addressType = ((CartDeliveryAddress)object6).getAddressType();
                            } else {
                                n15 = 0;
                                Object var10_18 = null;
                            }
                            object2 = AddressType.Address;
                            if (var10_19 != object2) {
                                if (object6 != null) {
                                    object6 = ((CartDeliveryAddress)object6).getAddressType();
                                } else {
                                    n3 = 0;
                                    object6 = null;
                                }
                                AddressType addressType = AddressType.Pincode;
                                if (object6 != addressType) {
                                    y7_0 y7_02;
                                    object6 = e002.a;
                                    n15 = object6 instanceof AjioHomeActivity;
                                    if (n15 != 0) {
                                        object8 = object6;
                                        object8 = (AjioHomeActivity)object6;
                                    }
                                    if (object8 == null) return;
                                    object9 = new CartAddressListBottomSheet();
                                    object6 = ((FragmentActivity)object8).getSupportFragmentManager();
                                    n15 = R$id.content;
                                    if ((n15 = (object6 = ((FragmentManager)object6).D(n15)) instanceof tm2_2) == 0) return;
                                    object6 = ((tm2_2)object6).getChildFragmentManager();
                                    n15 = R$id.home_content;
                                    if ((n15 = (object6 = ((FragmentManager)object6).D(n15)) instanceof q9_0) == 0) return;
                                    Object object12 = object6;
                                    object12 = (q9_0)object6;
                                    n15 = (int)(((Fragment)object12).isVisible() ? 1 : 0);
                                    if (n15 == 0) return;
                                    gj2_1 gj2_12 = ((AjioHomeActivity)object8).S0;
                                    if (gj2_12 != null) {
                                        boolean bl7;
                                        gj2_12.a = bl7 = true;
                                    }
                                    Object object13 = object6;
                                    zm_2 zm_22 = (zm_2)object6;
                                    Intrinsics.checkNotNullParameter(zm_22, "cartAddressCallBackListener");
                                    ((CartAddressListBottomSheet)object9).u = zm_22;
                                    Object object14 = object6;
                                    q9_0 q9_02 = (q9_0)object6;
                                    object6 = y7_02;
                                    object2 = object8;
                                    object4 = object9;
                                    object5 = string3;
                                    object3 = string4;
                                    y7_02 = new y7_0(q9_02, (AjioHomeActivity)object8, (CartAddressListBottomSheet)object9, string3, string4);
                                    Intrinsics.checkNotNullParameter(y7_02, "pdDeeplinkListener");
                                    ((q9_0)object12).z0 = y7_02;
                                    object6 = ((FragmentActivity)object8).getSupportFragmentManager();
                                    String string14 = "CartLocationBottomSheet";
                                    ((DialogFragment)object9).show((FragmentManager)object6, string14);
                                    return;
                                }
                            }
                            object6 = kj0_1.g();
                            object3 = null;
                            Activity activity = e002.a;
                            object2 = string3;
                            object4 = string4;
                            object5 = string3;
                            ((kj0_1)object6).u(activity, string3, string4, string3, null);
                            return;
                        }
                    }
                    object6 = "closet";
                    boolean bl8 = false;
                    object4 = null;
                    n3 = (int)(StringsKt.F((CharSequence)object5, (CharSequence)object6, false) ? 1 : 0);
                    n4 = 2;
                    if (n3 != 0) {
                        object6 = e002.c;
                        if (object6 != null) {
                            object6.U1(n4);
                        }
                        if ((object6 = e002.b) != null) {
                            String string15 = k7.i("ddMMyyyy");
                            ((ky1_0)object6).m(string15);
                        }
                        if (object6 == null) return;
                        String string16 = "closet_card_in_home";
                        object6 = ((ky1_0)object6).h;
                        ((sw_0)object6).getPreference(string16, (String)object2);
                        return;
                    }
                    bundle = new Bundle();
                    object6 = bannerData.getEnableAdsOnPlp();
                    n3 = object6 != null ? (int)(((Boolean)object6).booleanValue() ? 1 : 0) : 1;
                    bundle.putBoolean("enable_ads_on_plp", n3 != 0);
                    object6 = bannerData.getBannerAdsMetaData();
                    object7 = bannerData.isAdBanner();
                    object = Boolean.TRUE;
                    n7 = Intrinsics.areEqual(object7, object);
                    object = "isClickEnabled";
                    string7 = "external_ads_home_config";
                    string6 = "EXTERNAL_AD";
                    if (n7 == 0 || object6 == null) break block35;
                    boolean bl9 = true;
                    bundle.putBoolean("from_landing_screen_banner_ads", bl9);
                    object7 = ((BannerAdsMetaData)object6).getImageName();
                    CharSequence charSequence = ((BannerAdsMetaData)object6).getCampaignId();
                    StringBuilder stringBuilder = new StringBuilder("JioAds - ");
                    stringBuilder.append((String)object7);
                    stringBuilder.append(" - ");
                    stringBuilder.append((String)charSequence);
                    object8 = stringBuilder.toString();
                    object8 = le3_2.E(100, (String)object8);
                    bundle.putString("banner_ad_source_details", (String)object8);
                    object7 = ((BannerAdsMetaData)object6).getClickId();
                    bundle.putString("click_id", (String)object7);
                    n8 = bannerData.getActualWidth();
                    object8 = n8;
                    n7 = bannerData.getActualHeight();
                    object7 = n7;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(object8);
                    ((StringBuilder)charSequence).append("x");
                    ((StringBuilder)charSequence).append(object7);
                    object8 = ((StringBuilder)charSequence).toString();
                    ((BannerAdsMetaData)object6).setCreativeName((String)object8);
                    object8 = ((BannerAdsMetaData)object6).getCcbValue();
                    if (object8 == null || (n8 = ((String)object8).length()) == 0) {
                        cp_1.Companion.getClass();
                        object8 = cp$a.e();
                        object7 = UUID.randomUUID().toString();
                        object8.getClass();
                        object8 = cp_1.n((String)object7);
                        ((BannerAdsMetaData)object6).setCcbValue((String)object8);
                    }
                    object7 = ((BannerAdsMetaData)object6).getCcbValue();
                    bundle.putString("banner_ad_ccb", (String)object7);
                    object8 = bannerData.getBannerAdsMetaData();
                    if (object8 != null) {
                        object8 = ((BannerAdsMetaData)object8).getBannerType();
                    } else {
                        n8 = 0;
                        object8 = null;
                    }
                    object7 = "AD";
                    n8 = (int)(Intrinsics.areEqual(object8, object7) ? 1 : 0);
                    if (n8 == 0) break block36;
                    object8 = bannerData.getBannerUrl();
                    e002.r((BannerAdsMetaData)object6, (String)object8, string8);
                    break block37;
                }
                object8 = bannerData.getBannerAdsMetaData();
                if (object8 != null) {
                    object8 = ((BannerAdsMetaData)object8).getBannerType();
                } else {
                    n8 = 0;
                    object8 = null;
                }
                n8 = (int)(Intrinsics.areEqual(object8, string6) ? 1 : 0);
                if (n8 != 0) {
                    object8 = h40_0.a;
                    object8 = z40_0.Companion;
                    object7 = AJIOApplication.Companion;
                    object8 = Q.a((AJIOApplication$a)object7, (z40$a)object8).a.d(string7);
                    n8 = (int)(object8.optBoolean((String)object) ? 1 : 0);
                    if (n8 != 0) {
                        object8 = bannerData.getBannerUrl();
                        e002.r((BannerAdsMetaData)object6, (String)object8, string8);
                    }
                }
                break block37;
            }
            object6 = bannerData.getBannerUrl();
            if (object6 != null && (n3 = ((String)object6).length()) != 0) {
                object6 = this.f();
                object8 = bannerData.getBannerUrl();
                if (object8 == null) {
                    object8 = object2;
                }
                cp_1.Companion.getClass();
                object7 = cp$a.e();
                object7.getClass();
                n7 = cp_1.d(string3);
                object6.getClass();
                oz_2.h(object5, (String)object8, string8, n7 != 0);
            }
        }
        object6 = bannerData.getBannerAdsMetaData();
        if (object6 != null) {
            object6 = ((BannerAdsMetaData)object6).getBannerType();
        } else {
            n3 = 0;
            object6 = null;
        }
        n3 = (int)(Intrinsics.areEqual(object6, string6) ? 1 : 0);
        if (n3 != 0) {
            object6 = h40_0.a;
            object6 = z40_0.Companion;
            AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
            object6 = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object6).a.d(string7);
            n3 = (int)(object6.optBoolean((String)object) ? 1 : 0);
            if (n3 == 0) return;
            object6 = "ajio";
            n3 = (int)(StringsKt.F((CharSequence)object5, (CharSequence)object6, false) ? 1 : 0);
            if (n3 != 0) {
                object6 = AnalyticsManager.Companion;
                String string17 = "Web view Screen";
                km_1.a((AnalyticsManager$Companion)object6, string17);
            }
            object6 = kj0_1.g();
            object3 = bannerData.getBannerUrl();
            Activity activity = e002.a;
            object2 = string3;
            object4 = string4;
            object5 = object3;
            object3 = bundle;
            ((kj0_1)object6).u(activity, string3, string4, (String)object5, bundle);
            return;
        }
        object6 = "dresstool";
        n3 = (int)(StringsKt.F(object5, (CharSequence)object6, false) ? 1 : 0);
        if (n3 != 0) {
            bundle.putString("dress_tool_ingress", "homescreen");
            object6 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
            String string18 = bannerData.getBannerUrl();
            if (string18 != null) {
                object2 = string18;
            }
            boolean bl10 = false;
            Object var10_37 = null;
            object6 = NewEEcommerceEventsRevamp.getCreativeName$default((NewEEcommerceEventsRevamp)object6, (String)object2, false, n4, null);
            String string19 = "dress_tool_source_details";
            bundle.putString(string19, (String)object6);
        }
        object6 = kj0_1.g();
        object3 = bannerData.getBannerUrl();
        Activity activity = e002.a;
        object2 = string3;
        object4 = string4;
        object5 = object3;
        object3 = bundle;
        ((kj0_1)object6).u(activity, string3, string4, (String)object5, bundle);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(String string2, Product product, int n3, HomeRowData homeRowData) {
        boolean bl2;
        boolean bl3;
        Object object;
        Object object2 = this;
        Object object3 = product;
        Object object4 = string2;
        Intrinsics.checkNotNullParameter(string2, "productColorGroup");
        Intrinsics.checkNotNullParameter(product, "clickedProduct");
        Object object5 = this.u;
        object5 = kp1_0.c("landing screen - ", (String)object5);
        object4 = this.u;
        String string3 = hv3_0.K(R$string.recently_viewed);
        int n4 = Intrinsics.areEqual(object4, string3);
        String string4 = null;
        string3 = null;
        if (homeRowData != null && (object = homeRowData.getBanners()) != null && (object = (BannerData)object.get(0)) != null) {
            object = ((BannerData)object).getWidgetLevel();
        } else {
            bl3 = false;
            object = null;
        }
        Object object6 = "USER";
        bl3 = Intrinsics.areEqual(object, object6);
        object = bl3 ? "user_level" : "dynamic";
        if (homeRowData != null && n4 == 0) {
            object5 = homeRowData.getBanners();
            if (object5 != null && (object5 = (BannerData)object5.get(0)) != null) {
                object5 = ((BannerData)object5).getFeedLogic();
            } else {
                bl2 = false;
                object5 = null;
            }
            object4 = homeRowData.getHeading();
            object6 = new StringBuilder();
            ((StringBuilder)object6).append((String)object);
            object = "_";
            ((StringBuilder)object6).append((String)object);
            ((StringBuilder)object6).append((String)object5);
            ((StringBuilder)object6).append((String)object);
            ((StringBuilder)object6).append((String)object4);
            ((StringBuilder)object6).append((String)object);
            n4 = n3;
            ((StringBuilder)object6).append(n3);
            object5 = ((StringBuilder)object6).toString();
        } else {
            n4 = n3;
        }
        String string5 = object5;
        Activity activity = ((e00)object2).a;
        bl2 = activity instanceof AjioHomeActivity;
        if (bl2) {
            object5 = object6 = ((e00)object2).t;
            object = ((NewEEcommerceEventsRevamp)object6).getEE_SELECT_ITEM();
            String string6 = ((NewEEcommerceEventsRevamp)object6).getPrevScreen();
            String string7 = ((NewEEcommerceEventsRevamp)object6).getPrevScreenType();
            object6 = null;
            String string8 = "landing screen";
            String string9 = "landing screen";
            Activity activity2 = activity;
            activity = null;
            long l2 = 0L;
            int n7 = 4192848;
            object4 = product;
            object2 = object3;
            object3 = string5;
            NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object5, product, n3, (String)object, string5, null, string8, false, string6, string9, null, string7, null, null, false, null, null, l2, null, null, null, null, null, n7, null);
            if (homeRowData != null && (object5 = homeRowData.getBanners()) != null) {
                n4 = 0;
                object4 = null;
                if ((object5 = (BannerData)object5.get(0)) != null) {
                    string4 = ((BannerData)object5).getBannerType();
                }
            } else {
                n4 = 0;
                object4 = null;
            }
            object5 = string4;
            string3 = "RECOMMENDED_PRODUCTS";
            bl2 = kotlin.text.b.i(string4, string3, false);
            object5 = bl2 ? od3_2.a() : od3_2.a();
            object4 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            string3 = activity2;
            Intrinsics.checkNotNull(activity2, (String)object4);
            activity = activity2;
            activity = (AjioHomeActivity)activity2;
            eA2$a.a((ea2_1)activity, (Product)object2, (String)object5);
        }
    }

    public final void e() {
        oz_2 oz_22 = this.f();
        oz_22.getClass();
        Object object = this.w;
        Intrinsics.checkNotNullParameter(object, "homeDataList");
        boolean bl2 = false;
        oz_22.h = false;
        object = ((ArrayList)object).iterator();
        Object object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while (bl2 = object.hasNext()) {
            boolean bl3;
            HomeViewTypes homeViewTypes;
            object2 = (HomeRowData)object.next();
            if (object2 != null) {
                object2 = ((HomeRowData)object2).getType();
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != (homeViewTypes = HomeViewTypes.ROW_TYPE_CLOSET)) continue;
            oz_22.h = bl3 = true;
            break;
        }
    }

    public final void e0() {
        String string2;
        g71_0.Companion.getClass();
        Object object = this.c;
        if (object != null) {
            int n3 = 2;
            object.U1(n3);
        }
        if ((object = this.b) != null) {
            string2 = k7.i("ddMMyyyy");
            ((ky1_0)object).m(string2);
        }
        if (object != null) {
            string2 = "";
            object = ((ky1_0)object).h;
            String string3 = "closet_card_in_home";
            ((sw_0)object).getPreference(string3, string2);
        }
    }

    public final oz_2 f() {
        return (oz_2)this.G.getValue();
    }

    public final ZC2 g() {
        return (ZC2)this.I.getValue();
    }

    public final void h(String string2) {
        Object object = "ctaLink";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        if (n3 > 0) {
            object = kj0_1.g();
            Activity activity = this.a;
            ((kj0_1)object).w(activity, string2);
        }
    }

    public final void i() {
        int n3;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        boolean bl2 = ((ao0_0)object).a("enabledDeleteForNotifyMe");
        Object object2 = this.x;
        if (bl2) {
            object = (UserInformation)((hh3_2)object2).getValue();
            ((UserInformation)object).removeNotifyMeData();
        }
        object = this.f();
        object2 = (UserInformation)((hh3_2)object2).getValue();
        Object object3 = "<get-userInformation>(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "userInformation");
        object = ((UserInformation)object2).getNotifyMeData();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = new TypeToken();
            object2 = ((TypeToken)object2).getType();
            Intrinsics.checkNotNullExpressionValue(object2, "getType(...)");
            object3 = new Gson();
            object = ((Gson)object3).fromJson((String)object, (Type)object2);
            object2 = "fromJson(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (Set)object;
        } else {
            object = new HashSet();
        }
        this.y = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void j(ArrayList var1_1) {
        block8: {
            var2_2 = 1;
            var3_3 = var1_1.isEmpty() ^ var2_2;
            if (var3_3 == 0) break block8;
            var1_1 = var1_1.iterator();
            while ((var3_3 = var1_1.hasNext()) != 0) {
                block9: {
                    var4_4 = (Number)var1_1.next();
                    var3_3 = var4_4.intValue();
                    var5_5 /* !! */  = this.f().b;
                    var6_6 = var3_3;
                    var5_5 /* !! */  = var5_5 /* !! */ .get(var6_6);
                    var6_6 = null;
                    var7_7 = 0;
                    var8_8 = null;
                    if (var5_5 /* !! */  != null) {
                        var5_5 /* !! */  = this.f().b;
                        var9_9 = var3_3;
                        if ((var5_5 /* !! */  = (var5_5 /* !! */  = (RecentlyViewedProducts)var5_5 /* !! */ .get(var9_9)) != null && (var5_5 /* !! */  = var5_5 /* !! */ .getProducts()) != null && (var5_5 /* !! */  = (Product)var5_5 /* !! */ .get(0)) != null ? var5_5 /* !! */ .getProductType() : null) != (var9_9 = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER)) continue;
                    }
                    if ((var5_5 /* !! */  = this.f().f) == null || (var9_9 = (Collection)var5_5 /* !! */ .getProducts()) == null || (var10_10 = (int)var9_9.isEmpty()) != 0) break block9;
                    var9_9 = var5_5 /* !! */ .getProducts();
                    Intrinsics.checkNotNull(var9_9);
                    var10_10 = var9_9.size();
                    var11_11 = CMSConfigInitializer.getRvMin();
                    if (var10_10 >= var11_11) ** GOTO lbl-1000
                }
                if (var3_3 < (var10_10 = (var9_9 = this.w).size())) {
                    var5_5 /* !! */  = this.f();
                    var5_5 /* !! */ .c(var3_3);
                } else lbl-1000:
                // 2 sources

                {
                    var9_9 = new ArrayList();
                    var12_12 = new RecentlyViewedProducts();
                    if (var5_5 /* !! */  != null && (var13_13 = var5_5 /* !! */ .getProducts()) != null) {
                        var13_13 = ((Iterable)var13_13).iterator();
                        while (var14_14 = var13_13.hasNext()) {
                            var15_15 /* !! */  = var13_13.next();
                            var16_16 = var7_7 + 1;
                            if (var7_7 >= 0) {
                                var15_15 /* !! */  = (Product)var15_15 /* !! */ ;
                                Intrinsics.checkNotNull(var15_15 /* !! */ );
                                var17_17 = 500;
                                var8_8 = n00.e(var15_15 /* !! */ , var7_7, (boolean)var2_2, null, var17_17);
                                var9_9.add(var8_8);
                                var7_7 = var16_16;
                                continue;
                            }
                            xx_2.n();
                            throw null;
                        }
                    }
                    if (var5_5 /* !! */  != null) {
                        var6_6 = var5_5 /* !! */ .getProducts();
                    }
                    var12_12.setProducts((List)var6_6);
                    var12_12.setProductUIModelList((List)var9_9);
                    var5_5 /* !! */  = var3_3;
                    var6_6 = this.f().b;
                    var6_6.put(var5_5 /* !! */ , var12_12);
                }
                if ((var5_5 /* !! */  = this.v) == null) continue;
                var5_5 /* !! */ .notifyItemChanged(var3_3);
            }
        }
    }

    public final void k(ArrayList arrayList, int n3, long l2) {
        oz_2 oz_22 = this.f();
        oz_22.getClass();
        if (arrayList != null) {
            int n4 = arrayList.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object = (HomeRowData)arrayList.get(i3);
                boolean bl2 = false;
                object = object != null ? object.getType() : null;
                HomeViewTypes homeViewTypes = HomeViewTypes.ROW_TYPE_CLOSET;
                if (object != homeViewTypes || (object = oz_22.a) == null) continue;
                ((gw_2)object).f = l2;
                ((gw_2)object).d = n3;
                int n7 = -1;
                if (n3 == n7) {
                    ((gw_2)object).b = null;
                    ((gw_2)object).a = null;
                    ((gw_2)object).e = false;
                    continue;
                }
                ((gw_2)object).e = bl2 = true;
            }
        }
    }

    public final void l() {
        int n3;
        Object object = this.f();
        ArrayList arrayList = this.w;
        object.getClass();
        int n4 = -1;
        if (arrayList != null) {
            int n7 = arrayList.size();
            for (n3 = 0; n3 < n7; ++n3) {
                HomeViewTypes homeViewTypes;
                Object object2 = (HomeRowData)arrayList.get(n3);
                object2 = object2 != null ? object2.getType() : null;
                if (object2 != (homeViewTypes = HomeViewTypes.ROW_TYPE_APP_UPDATE)) {
                    continue;
                }
                break;
            }
        } else {
            n3 = -1;
        }
        if (n3 != n4 && arrayList != null) {
            object = (HomeRowData)arrayList.remove(n3);
        }
        if ((object = this.v) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void m(String string2) {
        if (string2 != null) {
            Activity activity = this.a;
            Intent intent = new Intent((Context)activity, CustomVideoPlayerActivity.class);
            String string3 = "VIDEO_URL";
            intent.putExtra(string3, string2);
            activity.startActivity(intent);
            activity = (BaseActivity)activity;
            Intrinsics.checkNotNull(activity);
            int n3 = R$anim.slide_in_bottom;
            int n4 = R$anim.slide_out_top;
            activity.overridePendingTransition(n3, n4);
        }
    }

    public final void n(ArrayList object) {
        int n3 = object.isEmpty() ^ 1;
        if (n3 != 0) {
            object = ((ArrayList)object).iterator();
            while ((n3 = object.hasNext()) != 0) {
                Object object2;
                int n4;
                Number number = (Number)object.next();
                n3 = number.intValue();
                if (n3 >= (n4 = ((ArrayList)(object2 = this.w)).size())) continue;
                object.remove();
                this.f().c(n3);
                object2 = this.v;
                if (object2 == null) continue;
                ((RecyclerView$f)object2).notifyItemChanged(n3);
            }
        }
    }

    public final void o(WidgetRecord widgetRecord, boolean bl2) {
        Intrinsics.checkNotNullParameter(widgetRecord, "widgetRecord");
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_ads_on_plp", bl2);
        Object object = widgetRecord.getWidgetID();
        bundle.putString("widgetID", (String)object);
        String string2 = widgetRecord.getWidgetType();
        bundle.putString("widgetType", string2);
        string2 = widgetRecord.getWidgetName();
        bundle.putString("widgetName", string2);
        boolean bl3 = true;
        bundle.putBoolean("showViewAllWidget", bl3);
        object = widgetRecord.getShowDefault();
        if (object != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        string2 = "showDefaultWidget";
        bundle.putBoolean(string2, bl2);
        object = this.z;
        if (object == null) {
            object = widgetRecord.getCurrentStore();
        }
        bundle.putString("widgetStore", (String)object);
        kj0_1 kj0_12 = kj0_1.g();
        Activity activity = this.a;
        kj0_12.u(activity, "/widget/", "", "", bundle);
    }

    public final void p(RecyclerView object, tt2_2 object2) {
        OnGACuratedWidgetEventHandlerListener onGACuratedWidgetEventHandlerListener;
        Object object3 = this;
        Object object4 = object;
        Object object5 = this;
        tt2_2 tt2_22 = object2;
        Intrinsics.checkNotNullParameter(object, "recyclerView");
        Object object6 = object2;
        Intrinsics.checkNotNullParameter(object2, "scrollStateHolder");
        this.D = object;
        object4 = onGACuratedWidgetEventHandlerListener;
        object6 = this.g;
        Object object7 = this.h;
        OnGAEventHandlerListener onGAEventHandlerListener = object7;
        Intrinsics.checkNotNull(object7);
        Object object8 = object7;
        object7 = new pz_1(this);
        object7 = this.w;
        FV2 fV2 = this.r;
        AV2 aV2 = this.s;
        po_0 po_02 = this.d;
        mf1_0 mf1_02 = this.e;
        lf1_0 lf1_02 = this.f;
        object = onGACuratedWidgetEventHandlerListener;
        onGACuratedWidgetEventHandlerListener = this.n;
        object4 = this.o;
        object2 = object7;
        object7 = this;
        object3 = object4;
        k92_0 k92_02 = this.p;
        ArrayList arrayList = this.q;
        object4 = object;
        object7 = object2;
        ((E61)object)((ArrayList)object2, this, (String)object6, po_02, onGAEventHandlerListener, mf1_02, lf1_02, this, this, tt2_22, (pz_1)object8, this, this, onGACuratedWidgetEventHandlerListener, (e00$a)((Object)object3), k92_02, arrayList, fV2, aV2);
        object4 = this;
        object7 = object;
        this.v = object;
        object5 = this.D;
        if (object5 != null) {
            ((RecyclerView)object5).setAdapter((RecyclerView$f)object);
        }
    }

    public final void q(ArrayList object) {
        Intrinsics.checkNotNullParameter(object, "homeData");
        ArrayList arrayList = this.w;
        arrayList.clear();
        arrayList.addAll(object);
        object = this.f();
        arrayList.size();
        object.getClass();
    }

    public final void r(BannerAdsMetaData bannerAdsMetaData, String string2, String string3) {
        e00 e002 = this;
        CharSequence charSequence = new StringBuilder();
        CharSequence charSequence2 = bannerAdsMetaData.getCampaignId();
        charSequence.append((String)charSequence2);
        charSequence2 = "|";
        charSequence.append((String)charSequence2);
        Object object = bannerAdsMetaData.getCreativeName();
        charSequence.append((String)object);
        charSequence.append((String)charSequence2);
        object = string3;
        charSequence.append(string3);
        charSequence.append((String)charSequence2);
        object = bannerAdsMetaData.getImageName();
        charSequence.append((String)object);
        charSequence.append((String)charSequence2);
        charSequence2 = bannerAdsMetaData.getBannerType();
        charSequence.append((String)charSequence2);
        object = this.t;
        String string4 = ((NewEEcommerceEventsRevamp)object).getEE_SELECT_PROMOTION();
        charSequence2 = "";
        CharSequence charSequence3 = string2 == null ? charSequence2 : string2;
        String string5 = av_0.a(AnalyticsManager.Companion);
        String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string7 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        String string8 = charSequence.toString();
        int n3 = 3584;
        String string9 = "home landing screen";
        boolean bl2 = true;
        boolean bl3 = true;
        NewEEcommerceEventsRevamp.pushEESelectPromotion$default((NewEEcommerceEventsRevamp)object, string4, charSequence3, string5, string6, string9, string7, bl2, bl3, string8, null, null, false, n3, null);
        charSequence = bannerAdsMetaData.getClickTracker();
        object = bannerAdsMetaData.getBannerType();
        string4 = "AD";
        boolean bl4 = Intrinsics.areEqual(object, string4);
        if (bl4) {
            object = bannerAdsMetaData.getClickTracker();
            if (object != null) {
                charSequence = bannerAdsMetaData.getCcbValue();
                Intrinsics.checkNotNullParameter(object, "url");
                long l2 = k7.p();
                string4 = String.valueOf(l2);
                charSequence3 = "[trq]";
                string5 = null;
                object = kotlin.text.b.n((String)object, charSequence3, string4, false);
                if (charSequence != null) {
                    charSequence2 = charSequence;
                }
                charSequence = kotlin.text.b.n((String)object, "[ccb]", (String)charSequence2, false);
            }
        } else {
            charSequence2 = bannerAdsMetaData.getBannerType();
            boolean bl5 = Intrinsics.areEqual(charSequence2, object = "EXTERNAL_AD");
            if (bl5) {
                charSequence = bannerAdsMetaData.getClickTracker();
            }
        }
        ((BannerAdViewModel)e002.H.getValue()).callBannerClickImpression((String)charSequence);
    }

    public final void s(int n3, Product object) {
        Object object2 = "updateProduct";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = -1;
        if (n3 == n4) {
            return;
        }
        n4 = ((Product)object).getViewHolderPos();
        Object object3 = this.f().b;
        Object object4 = n3;
        if ((object3 = (RecentlyViewedProducts)((HashMap)object3).get(object4)) != null && (object4 = ((RecentlyViewedProducts)object3).getProducts()) != null) {
            object = object4.set(n4, object);
        }
        object = this.f().b;
        object4 = n3;
        ((HashMap)object).put(object4, object3);
        if (object3 != null && (object = ((RecentlyViewedProducts)object3).getProductUIModelList()) != null && (object = (PlpProductUIModel)object.get(n4)) != null) {
            if ((object3 = ((RecentlyViewedProducts)object3).getProductUIModelList()) != null && (object2 = (PlpProductUIModel)object3.get(n4)) != null) {
                n4 = (int)(((PlpProductUIModel)object2).isProductWishlisted() ? 1 : 0);
            } else {
                n4 = 0;
                object2 = null;
            }
            ((PlpProductUIModel)object).setProductWishlisted((n4 ^= 1) != 0);
        }
        if ((object = this.v) != null) {
            ((RecyclerView$f)object).notifyItemChanged(n3);
        }
    }

    public final void t(ArrayList object) {
        E61 e61 = this.v;
        if (e61 != null) {
            int n3;
            int n4;
            block6: {
                e61.t = object;
                object = e61.a.iterator();
                n4 = 0;
                while (true) {
                    boolean bl2 = object.hasNext();
                    n3 = -1;
                    if (!bl2) break;
                    Object object2 = (HomeRowData)object.next();
                    if (object2 != null) {
                        object2 = object2.getType();
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    HomeViewTypes homeViewTypes = HomeViewTypes.ROW_TYPE_RECENT_SEARCH_WIDGET;
                    if (object2 != homeViewTypes) {
                        ++n4;
                        continue;
                    }
                    break block6;
                    break;
                }
                n4 = -1;
            }
            if (n4 != n3) {
                e61.notifyItemChanged(n4);
            }
        }
    }

    public final mu1_1 y() {
        return this.i;
    }

    public final void z(int n3) {
        HashMap hashMap = this.C;
        Integer n4 = n3;
        Boolean bl2 = Boolean.TRUE;
        hashMap.put(n4, bl2);
    }
}

