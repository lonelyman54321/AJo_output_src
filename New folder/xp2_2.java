/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalylticsGAHolderForProduct;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.home.CMSRequestType;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xp2
 */
public final class xp2_2
extends e61_0
implements k92_0,
yv0_1 {
    public RecyclerView A;
    public NestedScrollView B;
    public final ArrayList C;
    public tt2_2 D;
    public e00 E;
    public final hh3_2 F;
    public final hh3_2 G;
    public final hh3_2 H;
    public final hh3_2 I;
    public final hh3_2 J;
    public int K;
    public Product L;
    public final Xp2$c M;
    public final xp2$b_0 N;
    public fo3 f;
    public j3_0 g;
    public ee0_1 h;
    public nm_1 i;
    public ea2_1 j;
    public final hh3_2 k;
    public AjioTextView l;
    public AjioTextView m;
    public AjioTextView n;
    public ie0_1 o;
    public final NewEEcommerceEventsRevamp p;
    public final NewCustomEventsRevamp q;
    public String r;
    public String s;
    public RelativeLayout t;
    public AjioTextView u;
    public AjioTextView v;
    public AjioTextView w;
    public RelativeLayout x;
    public ShimmerFrameLayout y;
    public NestedScrollView z;

    public xp2_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new lc0_2(this, 2);
        this.k = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.p = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.q = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.r = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.s = object = newEEcommerceEventsRevamp.getPrevScreenType();
        object = new ArrayList();
        this.C = object;
        object = new id1_2(this, 2);
        this.F = object = yr1_2.b((Function0)object);
        object = new tp2_1(this);
        this.G = object = yr1_2.b((Function0)object);
        int n3 = 1;
        object = new ic_2(this, n3);
        this.H = object = yr1_2.b((Function0)object);
        object = new rd1_0(this, n3);
        this.I = object = yr1_2.b((Function0)object);
        object = new kc_2(this, n3);
        this.J = object = yr1_2.b((Function0)object);
        this.K = -1;
        this.M = object = new Xp2$c(this);
        this.N = object = new xp2$b_0(this);
    }

    public final void F(Product product, int n3, String string2) {
        Object object = this;
        Object object2 = "listType";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        if (product == null) {
            return;
        }
        Object object3 = product.getCode();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (bl2) {
            return;
        }
        Bundle bundle = this.Qa();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.p;
        object2 = newEEcommerceEventsRevamp;
        String string3 = newEEcommerceEventsRevamp.getEE_SELECT_ITEM();
        String string4 = newEEcommerceEventsRevamp.getPrevScreen();
        String string5 = newEEcommerceEventsRevamp.getPrevScreenType();
        newEEcommerceEventsRevamp = null;
        String string6 = "pdp widget screen";
        String string7 = "pdp widget screen";
        long l2 = 0L;
        int n4 = 3668560;
        String string8 = object3;
        object3 = product;
        object = product;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object2, product, n3, string3, string2, null, string6, false, string4, string7, null, string5, null, null, false, null, null, l2, null, null, bundle, null, null, n4, null);
        object2 = new ri2$a();
        ((ri2$a)object2).a = product;
        object = string8;
        ((ri2$a)object2).b(string8);
        ((ri2$a)object2).d = object = ld3_2.STORE_AJIO.getStoreId();
        object = ((ri2$a)object2).a();
        object2 = this;
        object3 = this.j;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            object3 = null;
        }
        object3.n0((ri2_0)object);
    }

    public final void Pa() {
        xp2_2 xp2_22 = this;
        Object object = this.o;
        Object object2 = "pdpExitIntentViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            boolean n3 = false;
            object = null;
        }
        Object object3 = ((ie0_1)object).e;
        object = ((ie0_1)object).f;
        if ((object = (BaseResponse)((LinkedHashMap)object3).get(object)) != null) {
            xp2_22.Sa((BaseResponse)object);
        } else {
            Object object4;
            object = xp2_22.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object4 = null;
            } else {
                object4 = object;
            }
            object4.getClass();
            object = h40_0.a;
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("pdp_to_bag_conversation_json");
            object2 = "pdp_exit_intent_full_screen_page_url";
            int n3 = object.has((String)object2);
            if (n3 != 0) {
                object = object.getString((String)object2);
                object2 = "getString(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            } else {
                object = "/pdp/exit_intent";
            }
            ((ie0_1)object4).f = object;
            if (object != null) {
                ((ie0_1)object4).f = object;
            }
            Object object5 = ((ie0_1)object4).f;
            int n4 = 0xFFFFFE;
            HomeReq homeReq = new HomeReq((String)object5, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, null, false, false, false, false, false, false, null, n4, null);
            object = ((ie0_1)object4).a;
            object2 = ((jo_2)((hh3_2)object).getValue()).f();
            homeReq.setUserType((String)object2);
            object2 = z40$a.a((Context)AJIOApplication$a.a()).a;
            object3 = "enable_locale";
            int n7 = object2.a((String)object3);
            if (n7 != 0 && (object = ((jo_2)((hh3_2)object).getValue()).i()) != null) {
                object2 = ((LocationData)object).getCity();
                homeReq.setCity((String)object2);
                object2 = ((LocationData)object).getState();
                homeReq.setState((String)object2);
                object2 = ((LocationData)object).getZone();
                homeReq.setZone((String)object2);
                object = ((LocationData)object).getPincode();
                homeReq.setPincode((String)object);
            }
            homeReq.setSimilarProductWidgetEnabledPDP(true);
            object = ((ie0_1)object4).b.getValue();
            object2 = "getValue(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (UserInformation)object;
            boolean bl2 = ((UserInformation)object).isUserOnline();
            object = bl2 ? "LOGGED_IN" : "NON_LOGGED_IN";
            homeReq.setLoggedIn((String)object);
            object = od3_2.a();
            object2 = Locale.ROOT;
            object = ((String)object).toUpperCase((Locale)object2);
            Intrinsics.checkNotNullExpressionValue(object, "toUpperCase(...)");
            homeReq.setStore((String)object);
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
            object = od3_2.a();
            object2 = CustomerStoreType.a;
            object2 = ScreenType.SCREEN_HOME;
            object = CustomerStoreType.a((String)object, (ScreenType)((Object)object2));
            if (object != null && (n7 = ((String)object).length()) != 0) {
                object2 = "userGroup";
                hashMap.put(object2, object);
            }
            if (object != null && (n7 = ((String)object).length()) != 0) {
                object2 = "userCohortValues";
                hashMap2.put(object2, object);
            }
            if ((n7 = ((String)(object = w61_0.a())).length()) > 0) {
                object2 = "experiments";
                hashMap.put(object2, object);
            }
            object = CMSRequestType.REQUEST_TYPE_HOME;
            homeReq.setRequestType((CMSRequestType)((Object)object));
            object = UrlHelper.Companion.getInstance();
            object2 = new Object[]{};
            String string2 = ((UrlHelper)object).getApiUrl("homepage", "home_cms", object2);
            int n8 = hv3_0.F();
            hv3_0.a.getClass();
            n7 = hv3_0.E();
            ScreenInfo screenInfo = new ScreenInfo(n8, n7);
            Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
            Intrinsics.checkNotNullParameter(string2, "url");
            Intrinsics.checkNotNullParameter(homeReq, "homeReq");
            object = md3_0.c((jD3)object4);
            object2 = new ge0_1((ie0_1)object4);
            object3 = object5;
            object5 = new he0_0(screenInfo, string2, homeReq, hashMap, hashMap2, (ie0_1)object4, null);
            n3 = 2;
            Ae3.d((i90_0)object, (CoroutineContext)object2, null, (Function2)object5, n3);
        }
    }

    public final Bundle Qa() {
        Bundle bundle = new Bundle();
        Object object = this.L;
        String string2 = null;
        object = object != null ? ((Product)object).getCode() : null;
        String string3 = "product_id";
        bundle.putString(string3, (String)object);
        object = this.L;
        object = object != null ? ((Product)object).getName() : null;
        string3 = "product_name";
        bundle.putString(string3, (String)object);
        object = this.L;
        object = object != null && (object = ((Product)object).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object).getBrandName() : null;
        string3 = "product_brand";
        bundle.putString(string3, (String)object);
        object = this.L;
        object = object != null ? ((Product)object).getBrickName() : null;
        string3 = "product_brick";
        bundle.putString(string3, (String)object);
        object = this.L;
        if (object != null) {
            string2 = ((Product)object).getBrickCategory();
        }
        bundle.putString("product_category", string2);
        return bundle;
    }

    public final e12_0 Ra() {
        return (e12_0)this.H.getValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Sa(BaseResponse baseResponse) {
        Object object;
        Object object2;
        xp2_2 xp2_22;
        block19: {
            block20: {
                block22: {
                    block23: {
                        xp2_2 xp2_23;
                        Object object3;
                        block21: {
                            xp2_22 = this;
                            object2 = baseResponse;
                            int n3 = this.isAdded();
                            if (n3 == 0) {
                                return;
                            }
                            object = baseResponse.getResponseStatusType();
                            object3 = xp2$a_1.$EnumSwitchMapping$0;
                            n3 = ((Enum)object).ordinal();
                            int n4 = 1;
                            if ((n3 = object3[n3]) == n4 || n3 == (n4 = 2)) break block19;
                            n4 = 3;
                            if (n3 == n4) break block20;
                            n4 = 4;
                            if (n3 != n4) {
                                object2 = this;
                                object = new NoWhenBranchMatchedException();
                                throw object;
                            }
                            object = this.z;
                            if (object != null) {
                                ai0_2.i((View)object);
                            }
                            if ((object = xp2_22.x) != null) {
                                ai0_2.i((View)object);
                            }
                            hv3_0.s0(xp2_22.y);
                            object = (HomeData)baseResponse.getData();
                            n4 = 0;
                            object3 = null;
                            if (object != null) {
                                object = ((HomeData)object).getHomeRowData();
                            } else {
                                n3 = 0;
                                object = null;
                            }
                            object = (Collection)object;
                            if (object != null && (n3 = (int)(object.isEmpty() ? 1 : 0)) == 0) break block21;
                            object2 = xp2_22;
                            object = xp2_22.B;
                            if (object == null) break block22;
                            break block23;
                        }
                        object = xp2_22.t;
                        if (object != null) {
                            ai0_2.i((View)object);
                        }
                        if ((object = xp2_22.o) == null) {
                            object = "pdpExitIntentViewModel";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        } else {
                            object3 = object;
                        }
                        object3.getClass();
                        Intrinsics.checkNotNullParameter(object2, "response");
                        object = ((ie0_1)object3).e;
                        object3 = ((ie0_1)object3).f;
                        object.put(object3, object2);
                        object = xp2_22.B;
                        if (object != null) {
                            ai0_2.B((View)object);
                        }
                        ArrayList arrayList = xp2_22.C;
                        arrayList.clear();
                        object2 = (HomeData)baseResponse.getData();
                        if (object2 != null && (object2 = ((HomeData)object2).getHomeRowData()) != null) {
                            object2 = (Collection)object2;
                            arrayList.addAll(object2);
                        }
                        e00$a e00$a = e00$a.PDP;
                        Object object4 = object2 = xp2_22.I.getValue();
                        object4 = (F12)object2;
                        object = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
                        object3 = object2 = xp2_22.F.getValue();
                        object3 = (ky1_0)object2;
                        object2 = xp2_23;
                        Object var12_13 = null;
                        Xp2$c xp2$c = xp2_22.M;
                        xp2$b_0 xp2$b_0 = xp2_22.N;
                        int n7 = 463996;
                        e00 e002 = xp2_23;
                        xp2_23 = this;
                        ArrayList arrayList2 = arrayList;
                        e00$a e00$a2 = e00$a;
                        xp2_22 = this;
                        ((e00)object2)((FragmentActivity)object, (ky1_0)object3, null, null, null, null, xp2$c, this, this, false, (F12)object4, null, xp2$b_0, e00$a, this, null, null, null, n7);
                        object2 = this;
                        object = e002;
                        this.E = e002;
                        object3 = arrayList2;
                        e002.q(arrayList2);
                        object = this.E;
                        if (object != null) {
                            ((e00)object).B = object3 = this.L;
                        }
                        if ((object = ((xp2_2)object2).A) != null) {
                            Context context = this.getContext();
                            object3 = new WrapperLinearLayoutManager(context);
                            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
                        }
                        object = ((xp2_2)object2).A;
                        object3 = ((xp2_2)object2).D;
                        qp2_2 qp2_22 = new qp2_2((xp2_2)object2);
                        object = (Unit)ai0_2.r(qp2_22, object, object3);
                        return;
                    }
                    ai0_2.i((View)object);
                }
                if ((object = ((xp2_2)object2).t) == null) return;
                ai0_2.B((View)object);
                return;
            }
            object2 = this;
            hv3_0.p0(this.y);
            object = this.x;
            if (object != null) {
                ai0_2.B((View)object);
            }
            if ((object = ((xp2_2)object2).z) != null) {
                ai0_2.B((View)object);
            }
            if ((object = ((xp2_2)object2).t) != null) {
                ai0_2.i((View)object);
            }
            if ((object = ((xp2_2)object2).B) == null) return;
            ai0_2.i((View)object);
            return;
        }
        object2 = xp2_22;
        object = xp2_22.z;
        if (object != null) {
            ai0_2.i((View)object);
        }
        if ((object = ((xp2_2)object2).x) != null) {
            ai0_2.i((View)object);
        }
        hv3_0.s0(((xp2_2)object2).y);
        object = ((xp2_2)object2).B;
        if (object != null) {
            ai0_2.i((View)object);
        }
        if ((object = ((xp2_2)object2).t) == null) return;
        ai0_2.B((View)object);
    }

    public final void Ta(Product object, String string2, String string3) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            Object object2 = this.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n3 = 0;
                object2 = null;
            }
            object2.startLoader();
            this.Ra().p.b = object;
            e12_0 e12_02 = this.Ra();
            String string4 = ld3_2.STORE_AJIO.getStoreId();
            e12_02.getClass();
            Intrinsics.checkNotNullParameter(string2, "productCode");
            Intrinsics.checkNotNullParameter(string4, "sourceStoreId");
            object = md3_0.c(e12_02);
            object2 = new x02_0(e12_02, string2, string4, string3, null);
            int n4 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n4);
        }
    }

    public final void Z2(Product object, int n3, String string2) {
        int n4;
        if (string2 != null && (n4 = string2.length()) != 0) {
            this.K = n3;
            Object object2 = this.g;
            n4 = 0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n3 = 0;
                object2 = null;
            }
            object2.startLoader();
            object2 = this.Ra().p;
            ((BH3)object2).c = object;
            object = this.Ra();
            object.getClass();
            n3 = string2.length();
            if (n3 > 0) {
                object2 = md3_0.c((jD3)object);
                h12_0 h12_02 = new h12_0((e12_0)object, string2, null);
                int n7 = 3;
                Ae3.d((i90_0)object2, null, null, h12_02, n7);
            }
        }
    }

    public final void Z4(Product object, int n3, String string2) {
        boolean bl2;
        boolean bl3;
        Object object2 = this.getActivity();
        if (object2 != null && ((object2 = this.getActivity()) == null || (bl3 = object2.isFinishing()) != (bl2 = true)) && object != null) {
            this.K = n3;
            Object object3 = (hy3_0)this.J.getValue();
            n3 = (int)(((hy3_0)object3).p() ? 1 : 0);
            if (n3 == 0) {
                boolean bl4;
                this.Ra().R = string2;
                object3 = this.Ra().p;
                ((BH3)object3).b = object;
                object = this.getActivity();
                if (object != null && !(bl4 = (object = this.requireActivity()).isFinishing()) && (object = this.getActivity()) != null && !(bl4 = (object = this.requireActivity()).isFinishing())) {
                    object = this.requireActivity();
                    object3 = "requireActivity(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    n3 = 53;
                    string2 = "";
                    object2 = "source - add to closet";
                    at2_1.g(n3, (Activity)object, string2, (String)object2);
                }
            } else {
                object3 = "similar products widget";
                this.Ta((Product)object, string2, (String)object3);
            }
        }
    }

    public final boolean d1(int n3, int n4) {
        int n7 = 53;
        if (n3 == n7 && n4 == (n3 = -1)) {
            Object object = this.g;
            n4 = 0;
            String string2 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n3 = 0;
                object = null;
            }
            object.startLoader();
            object = this.Ra().R;
            if (object != null && (n3 = ((String)object).length()) != 0) {
                object = this.Ra().p.b;
                if (object != null) {
                    String string3 = this.Ra().R;
                    this.Ta((Product)object, string3, null);
                }
                object = this.Ra();
                ((e12_0)object).R = null;
            } else {
                object = this.Ra();
                string2 = ld3_2.STORE_AJIO.getStoreId();
                ((e12_0)object).z(string2);
            }
            return true;
        }
        return false;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof ea2_1;
        if (bl2) {
            object2 = object;
            this.j = object2 = (ea2_1)object;
        }
        if (bl2 = object instanceof fo3) {
            object2 = object;
            object2 = (fo3)object;
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, string2);
            this.f = object2;
            bl2 = object instanceof nm_1;
            if (bl2) {
                object2 = object;
                this.i = object2 = (nm_1)object;
                bl2 = object instanceof j3_0;
                if (bl2) {
                    object2 = object;
                    this.g = object2 = (j3_0)object;
                }
                if (bl2 = object instanceof ee0_1) {
                    object = (ee0_1)object;
                    this.h = object;
                    return;
                }
                object = pn_2.b(object, " must implement ExitIntentListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement CartClosetListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ToolbarListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        Object object5 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string3);
        Object object6 = ie0_1.class;
        String string4 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object6, string4);
        object3 = "<this>";
        object4 = ef0_0.a(object6, string4, string4, (String)object3);
        object6 = object4.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.o = object2 = (ie0_1)((pD3)object2).a((yn1_2)object4, (String)object6);
            Intrinsics.checkNotNullParameter(this, (String)object);
            object2 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object4 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            Intrinsics.checkNotNullParameter(object4, string2);
            Intrinsics.checkNotNullParameter(object, string3);
            object5 = r43_0.class;
            object = rl3_0.b((rd3_0)object2, (E$b)object4, (Wd0)object, (Class)object5, string4);
            object2 = ef0_0.a((Class)object5, string4, string4, (String)object3);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object3 = string6.concat((String)object3);
                object = (r43_0)((pD3)object).a((yn1_2)object2, (String)object3);
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater object) {
        Object object2;
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(object, "inflater");
        int n4 = R$menu.menu_pdp;
        object.inflate(n4, menu2);
        n4 = R$id.cart;
        MenuItem menuItem = menu2.findItem(n4);
        Intrinsics.checkNotNullExpressionValue(menuItem, "findItem(...)");
        Object object3 = menuItem.getActionView();
        int n7 = 0;
        Object object4 = null;
        if (object3 != null) {
            n3 = R$id.menu_cart_count_tv;
            object3 = (AjioTextView)object3.findViewById(n3);
        } else {
            bl2 = false;
            object3 = null;
        }
        this.l = object3;
        object3 = menuItem.getActionView();
        if (object3 != null) {
            n3 = R$id.closet_menu_pdp;
            object3 = (ImageView)object3.findViewById(n3);
        } else {
            bl2 = false;
            object3 = null;
        }
        if (object3 != null) {
            n3 = R$string.wish_list;
            object2 = hv3_0.K(n3);
            object3.setContentDescription((CharSequence)object2);
        }
        if ((object3 = this.getActivity()) != null && !(bl2 = (object3 = this.requireActivity()).isFinishing()) && (object3 = this.l) != null) {
            object2 = (jo_2)this.k.getValue();
            n3 = ((jo_2)object2).d();
            if (n3 == 0) {
                Object object5 = z40_0.Companion;
                object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a;
                String string2 = "enable_highlight_empty_cart";
                boolean bl3 = ((ao0_0)object5).a(string2);
                if (bl3) {
                    object3.setVisibility(0);
                    object2 = String.valueOf(n3);
                    object3.setText((CharSequence)object2);
                    object2 = this.getContext();
                    if (object2 != null) {
                        n7 = R$drawable.circle_shape_cart_count_product;
                        object4 = xn.a((Context)object2, n7);
                    }
                    object3.setBackground(object4);
                } else {
                    n7 = 8;
                    object3.setVisibility(n7);
                }
            } else {
                Context context = this.getContext();
                if (context != null) {
                    n7 = R$drawable.circle_shape_pink_cart_menu;
                    object4 = xn.a(context, n7);
                }
                object3.setBackground(object4);
                object3.setVisibility(0);
                n7 = 9;
                if (n3 <= n7) {
                    object4 = String.valueOf(n3);
                    object3.setText((CharSequence)object4);
                } else {
                    object4 = hv3_0.f("9<sup>+</sup>");
                    object3.setText((CharSequence)object4);
                }
            }
        }
        super.onCreateOptionsMenu(menu2, (MenuInflater)object);
        menu2 = menuItem.getActionView();
        if (menu2 != null) {
            n4 = 1;
            object = new NC0(this, n4);
            menu2.setOnClickListener((View.OnClickListener)object);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.frag_exit_intent;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        xp2_2 xp2_22 = this;
        Object object = "item";
        Object object2 = menuItem;
        Intrinsics.checkNotNullParameter(menuItem, (String)object);
        int n3 = menuItem.getItemId();
        int n4 = R$id.closet_menu_pdp;
        if (n3 == n4) {
            object = new Bundle();
            object2 = (jo_2)this.k.getValue();
            int n7 = ((jo_2)object2).d();
            object2 = n7 > 0 ? "non-empty" : "empty";
            object.putString("cart_status", (String)object2);
            Object object3 = xp2_22.q;
            String string2 = ((NewCustomEventsRevamp)object3).getEC_USER_INTERACTION();
            String string3 = ((NewCustomEventsRevamp)object3).getEA_NAV_CLICK_HEADER();
            String string4 = ((NewCustomEventsRevamp)object3).getEN_NAV_CLICK();
            object2 = AnalyticsManager.Companion;
            String string5 = av_0.a((AnalyticsManager$Companion)object2);
            String string6 = av_0.a((AnalyticsManager$Companion)object2);
            String string7 = xp2_22.r;
            String string8 = xp2_22.s;
            int n8 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string2, string3, "Closet Button", string4, string5, string6, string7, null, string8, false, null, n8, null);
            object2 = ((AnalyticsManager$Companion)object2).getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object2).getGtmEvents();
            AnalyticsData analyticsData = ne_0.b((Bundle)object);
            string3 = "pdp screen";
            string4 = null;
            object3 = "Header Click";
            string2 = "Proceed to Closet";
            int n10 = 16;
            string6 = null;
            GTMEvents.pushButtonTapEvent$default(gTMEvents, (String)object3, string2, string3, analyticsData, null, n10, null);
            object = xp2_22.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartClosetListener");
                n3 = 0;
                object = null;
            }
            object.B0();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        Object object = this.p;
        String string2 = "pdp screen";
        ((NewEEcommerceEventsRevamp)object).setPrevScreen(string2);
        ((NewEEcommerceEventsRevamp)object).setPrevScreenType(string2);
        this.r = string2;
        this.s = string2;
        string2 = "pdp widget screen";
        ((NewEEcommerceEventsRevamp)object).setCurrentScreen(string2);
        object = AnalyticsManager.Companion;
        ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().setScreenName(string2);
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        Bundle bundle = this.Qa();
        ((GTMEvents)object).pushOpenScreenEvent(string2, bundle);
    }

    public final void onStop() {
        super.onStop();
        AnalylticsGAHolderForProduct.INSTANCE.clearAllRemainingEvents();
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Object object2;
        int n3;
        int n4;
        Object object3;
        int n7;
        int n8;
        Object object4;
        int n10;
        int n14;
        Object object5;
        Object object6;
        int n15 = 2;
        int n16 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, bundle);
        int n17 = R$id.title_tv;
        Object object7 = (AjioTextView)object.findViewById(n17);
        this.m = object7;
        n17 = R$id.sub_title_tv;
        object7 = (AjioTextView)object.findViewById(n17);
        this.n = object7;
        object7 = this.m;
        Object object8 = "pdp_to_bag_conversation_json";
        Object object9 = "getString(...)";
        if (object7 != null) {
            object6 = h40_0.a;
            object6 = z40_0.Companion;
            object6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object6).a.d((String)object8);
            n14 = object6.has((String)(object5 = "pdp_exit_intent_full_screen_title"));
            if (n14 != 0) {
                object6 = object6.getString((String)object5);
                Intrinsics.checkNotNullExpressionValue(object6, (String)object9);
            } else {
                n10 = R$string.exit_intent_title;
                object6 = hv3_0.K(n10);
            }
            object7.setText((CharSequence)object6);
        }
        if ((object7 = this.n) != null) {
            object6 = h40_0.a;
            object6 = z40_0.Companion;
            object6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object6).a.d((String)object8);
            n14 = object6.has((String)(object5 = "pdp_exit_intent_full_screen_sub_title"));
            if (n14 != 0) {
                object6 = object6.getString((String)object5);
                Intrinsics.checkNotNullExpressionValue(object6, (String)object9);
            } else {
                n10 = R$string.exit_intent_sub_title;
                object6 = hv3_0.K(n10);
            }
            object7.setText((CharSequence)object6);
        }
        n17 = R$id.exit_intent_items_list;
        this.A = object7 = (RecyclerView)object.findViewById(n17);
        n10 = 0;
        object6 = null;
        if (object7 != null) {
            ((RecyclerView)object7).setNestedScrollingEnabled(false);
        }
        n17 = R$id.exit_intent_root_view;
        object7 = (LinearLayout)object.findViewById(n17);
        n17 = R$id.root_container_scroll;
        this.B = object7 = (NestedScrollView)object.findViewById(n17);
        n17 = R$id.shimmer_container_scroll;
        this.z = object7 = (NestedScrollView)object.findViewById(n17);
        n17 = R$id.shimmer_container_exit_intent_root;
        object7 = (RelativeLayout)object.findViewById(n17);
        this.x = object7;
        n17 = R$id.shimmer_frame_exit_intent;
        object7 = (ShimmerFrameLayout)object.findViewById(n17);
        this.y = object7;
        n17 = R$id.error_container_exit_intent;
        object7 = (RelativeLayout)object.findViewById(n17);
        this.t = object7;
        n17 = R$id.error_title;
        object7 = (AjioTextView)object.findViewById(n17);
        this.u = object7;
        n17 = R$id.error_desc;
        object7 = (AjioTextView)object.findViewById(n17);
        this.v = object7;
        n17 = R$id.refreshButton;
        object7 = (AjioTextView)object.findViewById(n17);
        this.w = object7;
        object7 = this.u;
        if (object7 != null) {
            object5 = h40_0.a;
            object5 = z40_0.Companion;
            object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a.d((String)object8);
            n8 = object5.has((String)(object4 = "pdp_exit_intent_full_screen_error_sub_title"));
            if (n8 != 0) {
                object5 = object5.getString((String)object4);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object9);
            } else {
                n7 = R$string.issue_encountered;
                object5 = hv3_0.K(n7);
            }
            object7.setText((CharSequence)object5);
        }
        if ((object7 = this.v) != null) {
            object5 = h40_0.a;
            object5 = z40_0.Companion;
            object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a.d((String)object8);
            n8 = object5.has((String)(object4 = "pdp_exit_intent_full_screen_error_title"));
            if (n8 != 0) {
                object5 = object5.getString((String)object4);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object9);
            } else {
                n7 = R$string.try_refreshing_page;
                object5 = hv3_0.K(n7);
            }
            object7.setText((CharSequence)object5);
        }
        if ((object7 = this.w) != null) {
            object5 = h40_0.a;
            object5 = z40_0.Companion;
            object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a.d((String)object8);
            n8 = object5.has((String)(object4 = "pdp_exit_intent_full_screen_error_button"));
            if (n8 != 0) {
                object5 = object5.getString((String)object4);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object9);
            } else {
                n7 = R$string.refresh;
                object5 = hv3_0.K(n7);
            }
            object7.setText((CharSequence)object5);
        }
        object7 = this.getActivity();
        n7 = 0;
        object5 = null;
        if (object7 != null) {
            int n18;
            this.setHasOptionsMenu(n16 != 0);
            object4 = this.f;
            object3 = "toolbarListener";
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n14 = 0;
                object4 = null;
            }
            object4 = object4.getToolbar();
            object7 = (AppCompatActivity)object7;
            ((AppCompatActivity)object7).setSupportActionBar((Toolbar)object4);
            Object object10 = this.f;
            if (object10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object10 = null;
            }
            object10.T1();
            if (object4 != null) {
                object10 = AjioCustomToolbar$DisplayMode.TITLE;
                ((AjioCustomToolbar)object4).setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object10));
            }
            if (object4 != null) {
                object10 = h40_0.a;
                object10 = z40_0.Companion;
                AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                n18 = (int)((object8 = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object10).a.d((String)object8)).has((String)(object10 = "pdp_exit_intent_full_screen_back_title")) ? 1 : 0);
                if (n18 != 0) {
                    object8 = object8.getString((String)object10);
                    Intrinsics.checkNotNullExpressionValue(object8, object9);
                } else {
                    n4 = R$string.exit_intent_continue_to_home;
                    object8 = hv3_0.K(n4);
                }
                ((AjioCustomToolbar)object4).setTitle((CharSequence)object8);
            }
            if (object4 != null && (object8 = ((AjioCustomToolbar)object4).getTitleTextView()) != null) {
                n3 = 0x41400000;
                float f5 = 12.0f;
                ((AppCompatTextView)object8).setTextSize(n15, f5);
            }
            if (object4 != null && (object8 = ((AjioCustomToolbar)object4).getTitleTextView()) != null) {
                n3 = hv3_0.m(R$color.accent_color_10);
                object8.setTextColor(n3);
            }
            if (object4 != null && (object8 = ((AjioCustomToolbar)object4).getTitleTextView()) != null) {
                object9 = FontsManager.getInstance();
                object10 = this.getActivity();
                n18 = 10;
                object9 = ((FontsManager)object9).getTypefaceWithFont((Context)object10, n18);
                object8.setTypeface((Typeface)object9);
            }
            if ((object8 = ((AppCompatActivity)object7).getSupportActionBar()) != null) {
                ((ActionBar)object8).n(n16 != 0);
            }
            n4 = R$drawable.nav_back;
            object9 = ((AppCompatActivity)object7).getSupportActionBar();
            if (object9 != null) {
                ((ActionBar)object9).u(n4);
            }
            if ((object8 = ((AppCompatActivity)object7).getSupportActionBar()) != null) {
                n3 = R$string.back_button_text;
                object9 = this.getString(n3);
                ((ActionBar)object8).t((String)object9);
            }
            object8 = "";
            if (object4 != null) {
                object4.setContentDescription((CharSequence)object8);
            }
            if (object4 != null) {
                ((AjioCustomToolbar)object4).setProductListTitleText((String)object8);
            }
            if (object4 != null) {
                ((AjioCustomToolbar)object4).setProductListDetailText((String)object8);
            }
            if (object4 != null) {
                n4 = hv3_0.m(R$color.white);
                ((AjioCustomToolbar)object4).setToolbarBgColor(n4);
            }
            if ((object8 = this.f) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n4 = 0;
                object8 = null;
            }
            object8 = object8.getToolbar();
            if (object8 != null) {
                object9 = new ZC0(object7, n15);
                ((Toolbar)object8).setNavigationOnClickListener((View.OnClickListener)object9);
            }
        }
        if ((object2 = this.w) != null) {
            object7 = new pp2_1(this);
            object2.setOnClickListener((View.OnClickListener)object7);
        }
        n15 = R$id.shimmer_recyclerview_first;
        object2 = object.findViewById(n15);
        object7 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView";
        Intrinsics.checkNotNull(object2, (String)object7);
        object2 = (RecyclerView)object2;
        n4 = R$id.shimmer_recyclerview_second;
        object8 = object.findViewById(n4);
        Intrinsics.checkNotNull(object8, (String)object7);
        object8 = (RecyclerView)object8;
        n3 = R$id.shimmer_recyclerview_third;
        object = object.findViewById(n3);
        Intrinsics.checkNotNull(object, (String)object7);
        object = (RecyclerView)object;
        n3 = hv3_0.q(R$dimen.dimen_24);
        n14 = hv3_0.q(R$dimen.dimen_8);
        object7 = new lo_1(n3, n14);
        object9 = new ArrayList();
        object4 = null;
        for (n14 = 0; n14 < (n8 = 5); n14 += n16) {
            object3 = n14;
            ((ArrayList)object9).add(object3);
        }
        Object object11 = new i33((ArrayList)object9);
        object3 = this.getContext();
        object4 = new LinearLayoutManager((Context)object3, 0, false);
        ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object4);
        ((RecyclerView)object2).addItemDecoration((RecyclerView$n)object7);
        ((RecyclerView)object2).setAdapter((RecyclerView$f)object11);
        object2 = new i33((ArrayList)object9);
        object4 = this.getContext();
        object11 = new LinearLayoutManager((Context)object4, 0, false);
        ((RecyclerView)object8).setLayoutManager((RecyclerView$o)object11);
        ((RecyclerView)object8).addItemDecoration((RecyclerView$n)object7);
        ((RecyclerView)object8).setAdapter((RecyclerView$f)object2);
        object2 = new i33((ArrayList)object9);
        object8 = this.getContext();
        object11 = new LinearLayoutManager((Context)object8, 0, false);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object11);
        ((RecyclerView)object).addItemDecoration((RecyclerView$n)object7);
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        hv3_0.p0(this.y);
        object = this.x;
        if (object != null) {
            ai0_2.B((View)object);
        }
        if ((object = this.z) != null) {
            ai0_2.B((View)object);
        }
        if ((object = this.t) != null) {
            ai0_2.i((View)object);
        }
        if ((object = this.B) != null) {
            ai0_2.i((View)object);
        }
        if ((object = this.o) == null) {
            object = "pdpExitIntentViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object5 = object;
        }
        object = ((ie0_1)object5).d;
        object2 = this.getViewLifecycleOwner();
        object11 = new up2_2(this);
        object7 = new Xp2$d((Function1)object11);
        ((LiveData)object).e((mu1_1)object2, (F62)object7);
        object = this.Ra().p.e;
        object2 = this.getViewLifecycleOwner();
        object11 = new vp2_1(this);
        ((LiveData)object).e((mu1_1)object2, (F62)object11);
        object = this.Ra().p.g;
        object2 = this.getViewLifecycleOwner();
        object11 = new wp2_1(this);
        object7 = new Xp2$d((Function1)object11);
        ((LiveData)object).e((mu1_1)object2, (F62)object7);
        this.D = object = new tt2_2(bundle);
        this.Pa();
    }
}

