/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView$d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.customviews.RecyclerViewUtil;
import com.ril.ajio.data.database.entity.SearchEntry;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.kmm.shared.model.home.CMSRequestType;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.plp.PLPExtras$a;
import com.ril.ajio.plp.a;
import com.ril.ajio.plp.a$a;
import com.ril.ajio.services.data.Product.BrandDetails;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import com.ril.ajio.services.data.sis.StoreMetaData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.Functions$b;
import io.reactivex.internal.functions.Functions$c;
import io.reactivex.internal.functions.Functions$e;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from vV2
 */
public final class vv2_2
extends r61
implements AV2,
MV2,
JU2,
D82,
g71_0,
FV2 {
    public static final vv2$a_0 Companion;
    public RecyclerView A;
    public final String A0;
    public RecyclerView B;
    public final String B0;
    public RecyclerView C;
    public final hh3_2 C0;
    public TextView D;
    public ArrayList D0;
    public ShimmerFrameLayout E;
    public NestedScrollView E0;
    public FrameLayout F;
    public boolean F0;
    public TextView G;
    public String G0;
    public EditText H;
    public tt2_2 H0;
    public ConstraintLayout I;
    public e00 I0;
    public View J;
    public final hh3_2 J0;
    public View K;
    public final hh3_2 K0;
    public ImageView L;
    public final hh3_2 L0;
    public View M;
    public final hh3_2 M0;
    public ImageView N;
    public final vV2$c N0;
    public View O;
    public final vV2$d O0;
    public LinearLayout P;
    public final dv2_1 P0;
    public LinearLayout Q;
    public final ev2_1 Q0;
    public View R;
    public final xo0_2 R0;
    public ImageView S;
    public final rv2_0 S0;
    public ImageView T;
    public final qb_2 T0;
    public String U;
    public final sv2_0 U0;
    public final tv2_0 V0;
    public final uv2_1 W0;
    public String X;
    public final Y12 X0;
    public String Y;
    public boolean Z;
    public LinearLayout h;
    public boolean i;
    public zv2_2 j;
    public boolean k;
    public final hh3_2 k0;
    public final ArrayList l;
    public final String m;
    public j3_0 n;
    public hc1_2 o;
    public fo3 p;
    public final ArrayList p0;
    public vh3_2 q;
    public final ArrayList q0;
    public ea2_1 r;
    public final ArrayList r0;
    public final ArrayList s;
    public final ArrayList s0;
    public yw2_0 t;
    public lv2_0 t0;
    public x9_0 u;
    public kg3_1 u0;
    public Integer v;
    public hg3_0 v0;
    public final hh3_2 w;
    public boolean w0;
    public LinearLayout x;
    public String x0;
    public LinearLayout y;
    public final t30_0 y0;
    public TextView z;
    public final NewCustomEventsRevamp z0;

    static {
        vv2$a_0 vv2$a_0;
        Companion = vv2$a_0 = new Object();
    }

    public vv2_2() {
        Object object;
        Object object2 = new ArrayList();
        this.l = object2;
        this.m = "/SLP Screen";
        object2 = new ArrayList();
        this.s = object2;
        object2 = new hb0_1(this, 1);
        this.w = object2 = yr1_2.b((Function0)object2);
        this.U = object2 = "";
        this.X = object2;
        this.k0 = object = yr1_2.b((Function0)object);
        object = new ArrayList();
        this.p0 = object;
        object = new ArrayList();
        this.q0 = object;
        object = new ArrayList();
        this.r0 = object;
        object = new ArrayList();
        this.s0 = object;
        this.x0 = object2;
        this.y0 = object = new t30_0();
        object = AnalyticsManager.Companion;
        Object object3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.z0 = object3;
        this.A0 = object3 = bv_0.a((AnalyticsManager$Companion)object);
        this.B0 = object = cv_0.a((AnalyticsManager$Companion)object);
        object = new Object();
        this.C0 = object = yr1_2.b((Function0)object);
        this.G0 = object2;
        int n3 = 1;
        object2 = new re1_2(this, n3);
        this.J0 = object2 = yr1_2.b((Function0)object2);
        object2 = new mq2_2(this, n3);
        this.K0 = object2 = yr1_2.b((Function0)object2);
        object2 = new cv2_1(this);
        this.L0 = object2 = yr1_2.b((Function0)object2);
        object2 = new eq0_1(this, 2);
        this.M0 = object2 = yr1_2.b((Function0)object2);
        this.N0 = object2 = new Object();
        this.O0 = object2 = new Object();
        this.P0 = object2 = new dv2_1(this);
        this.Q0 = object2 = new ev2_1(this);
        n3 = 1;
        this.R0 = object2 = new xo0_2(this, n3);
        this.S0 = object2 = new rv2_0(this);
        this.T0 = object2 = new qb_2(this, n3);
        this.U0 = object2 = new sv2_0(this);
        this.V0 = object2 = new tv2_0(this);
        this.W0 = object2 = new uv2_1(this);
        this.X0 = object2 = new Y12(this, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void db(String object, String string2) {
        int n3;
        object = object != null && (n3 = ((String)object).length()) != 0 ? "branded search" : "non-branded search";
        Object object2 = object;
        object = sq0_1.a;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = string2;
        Intrinsics.checkNotNullParameter(object2, "action");
        String string4 = "elastic search screen";
        Bundle bundle = dm_1.a(string2, "label", string4, "screenName");
        string2 = od3_2.a();
        bundle.putString("store_type", string2);
        string2 = od3_2.a();
        bundle.putString("contains_store", string2);
        bundle.putString("search term", string3);
        object = AnalyticsManager.Companion;
        String string5 = bv_0.a((AnalyticsManager$Companion)object);
        String string6 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp newCustomEventsRevamp = sq0_1.b;
        String string7 = sq0_1.i;
        String string8 = sq0_1.h;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string7, (String)object2, string3, string8, string4, string4, string5, bundle, string6, false, null, 1536, null);
    }

    public final gw_2 D6() {
        return null;
    }

    public final void Ha(PLPExtras pLPExtras) {
        Intrinsics.checkNotNullParameter(pLPExtras, "plpExtras");
        String string2 = String.valueOf(pLPExtras.w);
        this.Xa(pLPExtras, string2);
    }

    public final void K0() {
        this.Ra();
        NewCustomEventsRevamp newCustomEventsRevamp = this.z0;
        String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
        String string3 = av_0.a(AnalyticsManager.Companion);
        String string4 = this.A0;
        String string5 = this.B0;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "search by image interactions", "Click a photo", "event_search_by_image_interactions", string3, "home landing screen", string4, null, string5, false, null, 1536, null);
    }

    public final void K1(SuggestionSearchModel suggestionSearchModel, int n3) {
        Object object;
        int n4;
        vv2_2 vv2_22 = this;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(suggestionSearchModel, "suggestionSearchModel");
        Object object2 = this.t0;
        yw2_0 yw2_02 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionAdapter");
            object2 = null;
        }
        if ((n4 = ((ArrayList)(object = ((lv2_0)object2).b)).isEmpty() ^ 1) != 0 && (n4 = ((ArrayList)object).size()) > n7 && n7 >= 0) {
            ((ArrayList)object).remove(n7);
            ((RecyclerView$f)object2).notifyItemRemoved(n7);
        }
        Object object3 = vv2_22.t;
        object2 = "searchViewModel";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object3 = null;
        }
        object = suggestionSearchModel.getText();
        String string2 = "getText(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object3.getClass();
        Intrinsics.checkNotNullParameter(object, "searchHistory");
        Object object4 = md3_0.c((jD3)object3);
        sw2_0 sw2_02 = new sw2_0(null, (yw2_0)object3, (String)object);
        n7 = 3;
        Ae3.d((i90_0)object4, null, null, sw2_02, n7);
        object3 = vv2_22.t;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            yw2_02 = object3;
        }
        String string3 = suggestionSearchModel.getText();
        Intrinsics.checkNotNullExpressionValue(string3, string2);
        object3 = String.valueOf(vv2_22.s0.size());
        yw2_02.getClass();
        Intrinsics.checkNotNullParameter(string3, "text");
        Intrinsics.checkNotNullParameter(object3, "count");
        Bundle bundle = px1_2.b("no_of_suggestion", (String)object3, "filled_char", string3);
        Object object5 = object3;
        object3 = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, bundle, null, null, null, null, null, null, 65023, null);
        object2 = AnalyticsManager.Companion;
        object4 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
        object5 = av_0.a((AnalyticsManager$Companion)object2);
        ((GTMEvents)object4).pushAutoSuggestionClickEvents("search_auto_suggestion_history_clear", "search interactions", "auto suggestion history clear", string3, (String)object5, (AnalyticsData)object3);
    }

    public final void L8(SuggestionSearchModel suggestionSearchModel, int n3, boolean bl2) {
        boolean bl3;
        vv2_2 vv2_22 = this;
        Object object = suggestionSearchModel;
        Intrinsics.checkNotNullParameter(suggestionSearchModel, "suggestionSearchModel");
        Object object2 = n3;
        this.v = object2;
        object2 = this.t;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
            bl3 = false;
            object2 = null;
        }
        ((yw2_0)object2).B = false;
        bv2_0.Companion.getClass();
        bv2_0.b2 = false;
        Bundle bundle = new Bundle();
        object2 = suggestionSearchModel.getText();
        Object object3 = "search_term";
        bundle.putString((String)object3, (String)object2);
        object2 = "valid_search";
        int n4 = 4;
        bundle.putInt((String)object2, n4);
        bl3 = this.Va();
        if (bl3 && (object2 = SV2.a) != null && (n4 = (int)(object2.isEmpty() ? 1 : 0)) == 0 && (n4 = (int)(SV2.b ? 1 : 0)) != 0) {
            object2 = (String)((Vector)object2).lastElement();
            object3 = "search_retained_term";
            bundle.putString((String)object3, (String)object2);
        }
        object3 = String.valueOf(n3);
        bundle.putString("position_of_click", (String)object3);
        Object object4 = vv2_22.z0;
        object2 = " - ";
        if (bl2) {
            String string2 = ((NewCustomEventsRevamp)object4).getEC_SEARCH_INTERACTIONS();
            object3 = suggestionSearchModel.getText();
            String string3 = suggestionSearchModel.getQuery();
            String string4 = n1.a((String)object3, (String)object2, string3);
            string3 = "auto search click - store";
            String string5 = "search_autofill_click";
            String string6 = "search screen";
            String string7 = "search screen";
            String string8 = vv2_22.A0;
            String string9 = vv2_22.B0;
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string2, string3, string4, string5, string6, string7, string8, bundle, string9, false, null, n7, null);
            object2 = kj0_1.g();
            object3 = this.getActivity();
            object4 = suggestionSearchModel.getQuery();
            ((kj0_1)object2).p((Activity)object3, (String)object4);
        } else {
            String string10 = suggestionSearchModel.getQuery();
            bundle.putString("suggested_link", string10);
            n4 = 2;
            vv2_22.Ua(n3, (SuggestionSearchModel)object, n4);
            string10 = ((NewCustomEventsRevamp)object4).getEC_SEARCH_INTERACTIONS();
            object3 = suggestionSearchModel.getText();
            String string11 = suggestionSearchModel.getQuery();
            String string12 = n1.a((String)object3, (String)object2, string11);
            string11 = "auto search click";
            String string13 = "search_autofill_click";
            String string14 = "search screen";
            String string15 = "search screen";
            String string16 = vv2_22.A0;
            String string17 = vv2_22.B0;
            int n8 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string10, string11, string12, string13, string14, string15, string16, bundle, string17, false, null, n8, null);
        }
        object = suggestionSearchModel.getText();
        Intrinsics.checkNotNullExpressionValue(object, "getText(...)");
        vv2_22.Za((String)object);
    }

    public final void L9() {
        NewCustomEventsRevamp newCustomEventsRevamp = this.z0;
        String string2 = newCustomEventsRevamp.getEC_SEARCH_INTERACTIONS();
        boolean bl2 = this.i;
        String string3 = bl2 ? "done" : "edit";
        Object object = this.G;
        object = object != null ? object.getText() : null;
        object = String.valueOf(object);
        String string4 = this.A0;
        String string5 = this.B0;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, (String)object, "search_history_edit", "search screen", "search screen", string4, null, string5, false, null, 1536, null);
    }

    public final void N() {
        this.Wa();
        NewCustomEventsRevamp newCustomEventsRevamp = this.z0;
        String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
        String string3 = av_0.a(AnalyticsManager.Companion);
        String string4 = this.A0;
        String string5 = this.B0;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "search by image interactions", "Select from gallery", "event_search_by_image_interactions", string3, "home landing screen", string4, null, string5, false, null, 1536, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void O6(ProductsList var1_1, boolean var2_2, boolean var3_3) {
        var4_4 = this;
        var5_5 = var1_1;
        var6_6 = false;
        var7_7 = null;
        if (!var3_3) {
            block37: {
                if (var1_1 != null) {
                    var8_8 = var1_1.getSpellingSuggestion();
                } else {
                    var9_9 = 0;
                    var8_8 = null;
                }
                if (var8_8 != null) {
                    var8_8 = var1_1.getSpellingSuggestion();
                    if (var8_8 != null) {
                        var8_8 = var8_8.getSuggestion();
lbl15:
                        // 2 sources

                        while (true) {
                            var10_10 = var8_8;
                            break block37;
                            break;
                        }
                    }
                    while (true) {
                        var11_11 = 0;
                        var10_10 = null;
                        break block37;
                        break;
                    }
                }
                if (var5_5 == null) ** continue;
                var8_8 = var1_1.getFreeTextSearch();
                ** continue;
            }
            var12_12 = var4_4.U;
            if (var5_5 != null) {
                var8_8 = var1_1.getOriginalSearchTerm();
            } else {
                var9_9 = 0;
                var8_8 = null;
            }
            if (var8_8 != null && (var9_9 = var8_8.length()) != 0) {
                var9_9 = 0;
                var8_8 = null;
            } else {
                var9_9 = 1;
            }
            var13_13 = var9_9 ^ 1;
            var14_14 = null;
            var8_8 = this;
            var15_15 = var12_12;
            var16_16 = var12_12;
            this.Qa((String)var12_12, (String)var12_12, (String)var12_12, (String)var10_10, false, var13_13);
        }
        hv3_0.S(this.getActivity());
        var8_8 = var4_4.b;
        ((jo_2)var8_8.getValue()).u();
        ((jo_2)var8_8.getValue()).w();
        ((jo_2)var8_8.getValue()).v();
        var8_8 = var4_4.U;
        var9_9 = var8_8.length();
        var15_15 = "";
        if (var9_9 > 0) {
            var8_8 = AnalyticsManager.Companion;
            var16_16 = var8_8.getInstance().getFb();
            var12_12 = new AnalyticsData$Builder();
            var10_10 = var4_4.U;
            var12_12 = var12_12.searchString((String)var10_10).build();
            var16_16.productSearch((AnalyticsData)var12_12);
            if (var5_5 != null) {
                var16_16 = var1_1.getCategoryCode();
            } else {
                var17_17 = 0;
                var16_16 = null;
            }
            var16_16 = var16_16 != null ? var1_1.getCategoryCode() : var15_15;
            var12_12 = var4_4.U;
            if (var5_5 != null && (var10_10 = var1_1.getProducts()) != null) {
                var11_11 = var10_10.size();
                var10_10 = var11_11;
            } else {
                var11_11 = 0;
                var10_10 = null;
            }
            var18_18 = "\n                    Category: ";
            var19_19 = "\n                    No of Results: ";
            var12_12 = og_1.a("\n                    Searched for Product: ", (String)var12_12, (String)var18_18, (String)var16_16, (String)var19_19);
            var12_12.append(var10_10);
            var12_12.append("\n                    ");
            var12_12 = ee3_2.b(var12_12.toString());
            var10_10 = var8_8.getInstance().getGa();
            var14_14 = new AnalyticsData$Builder();
            var12_12 = var14_14.label((String)var12_12).build();
            var10_10.productSearch((AnalyticsData)var12_12);
            var12_12 = new HashMap();
            var14_14 = var4_4.U;
            var12_12.put("Keyword", var14_14);
            var10_10 = "Category_Id";
            var12_12.put(var10_10, var16_16);
            if (var5_5 != null && (var16_16 = var1_1.getProducts()) != null) {
                var17_17 = var16_16.size();
                var16_16 = var17_17;
            } else {
                var17_17 = 0;
                var16_16 = null;
            }
            var12_12.put("NOR", var16_16);
            var10_10 = "Completed";
            var12_12.put("State", var10_10);
            var8_8 = var8_8.getInstance().getCt();
            var16_16 = new AnalyticsData$Builder();
            var16_16 = var16_16.eventMap((HashMap)var12_12).build();
            var8_8.search((AnalyticsData)var16_16);
        }
        if (var5_5 != null) {
            var8_8 = var1_1.getRedirect();
        } else {
            var9_9 = 0;
            var8_8 = null;
        }
        if (var8_8 == null) ** GOTO lbl-1000
        var8_8 = z40_0.Companion;
        var16_16 = this.requireActivity().getApplication();
        var12_12 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(var16_16, (String)var12_12);
        var8_8.getClass();
        var8_8 = z40$a.a((Context)var16_16).a;
        var16_16 = "search_redirect_key";
        var9_9 = (int)var8_8.a((String)var16_16);
        if (var9_9 != 0) {
            var8_8 = var1_1.getRedirect();
            Intrinsics.checkNotNull(var8_8);
            var15_15 = var1_1.getStore();
            var4_4.ab((String)var8_8, (String)var15_15);
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = AM0.a();
            var8_8.a = var5_5;
            if (var5_5 != null) {
                TextUtils.isEmpty((CharSequence)var1_1.getClassifierType());
                var19_19 = var4_4.z0;
                var20_20 = var19_19.getEC_SEARCH_INTERACTIONS();
                var8_8 = var4_4.U;
                var16_16 = var1_1.getFreeTextSearch();
                var12_12 = " - ";
                var21_21 = n1.a((String)var8_8, (String)var12_12, (String)var16_16);
                var8_8 = AnalyticsManager.Companion;
                var22_22 = bv_0.a((AnalyticsManager$Companion)var8_8);
                var23_23 = cv_0.a((AnalyticsManager$Companion)var8_8);
                var24_24 = 1536;
                var25_25 = "auto-correction";
                var26_26 = "search_autocorrection_click";
                var27_27 = "search screen";
                var28_28 = "search screen";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var19_19, var20_20, var25_25, var21_21, var26_26, var27_27, var28_28, var22_22, null, var23_23, false, null, var24_24, null);
            }
            if (var5_5 != null) {
                var8_8 = var1_1.getRedirect();
            } else {
                var9_9 = 0;
                var8_8 = null;
            }
            var8_8 = var8_8 == null ? "default" : "non-redirect";
            var16_16 = var4_4.t;
            var12_12 = "searchViewModel";
            if (var16_16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                var17_17 = 0;
                var16_16 = null;
            }
            if (var5_5 != null) {
                var10_10 = var1_1.getPageType();
            } else {
                var11_11 = 0;
                var10_10 = null;
            }
            var16_16.getClass();
            yw2_0.f((String)var10_10);
            var16_16 = var4_4.H;
            var10_10 = "searchETVRefresh";
            if (var16_16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                var17_17 = 0;
                var16_16 = null;
            }
            var16_16 = var16_16.getText();
            var14_14 = "getText(...)";
            Intrinsics.checkNotNullExpressionValue(var16_16, (String)var14_14);
            var16_16 = StringsKt.m0((CharSequence)var16_16);
            var17_17 = var16_16.length();
            if (var17_17 > 0 || (var17_17 = (var16_16 = var4_4.U).length()) > 0) {
                var6_6 = true;
            }
            var16_16 = new PLPExtras$a();
            var14_14 = var4_4.U;
            var18_18 = var14_14 == null ? var15_15 : var14_14;
            var16_16.c = var18_18;
            if (var14_14 == null) {
                var14_14 = var15_15;
            }
            var16_16.g = var14_14;
            var16_16.f = var15_15;
            var14_14 = var5_5 != null ? var1_1.getSpellCheckSuggestions() : null;
            var16_16.m = var14_14;
            var14_14 = var4_4.t;
            if (var14_14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var12_12);
                var14_14 = null;
            }
            if ((var12_12 = var14_14.s) == null) {
                var12_12 = var15_15;
            }
            var16_16.d = var12_12;
            var16_16.j = "user completed search";
            var12_12 = var4_4.U;
            if (var12_12 == null) {
                var12_12 = var15_15;
            }
            var16_16.k = var12_12;
            var12_12 = var4_4.H;
            if (var12_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            } else {
                var7_7 = var12_12;
            }
            var16_16.v = var12_12 = var7_7.getText().toString();
            var12_12 = var4_4.U;
            if (var12_12 != null) {
                var15_15 = var12_12;
            }
            var16_16.i = var15_15;
            var16_16.n = var8_8;
            var16_16.w = var8_8 = Boolean.valueOf(var6_6);
            var8_8 = var16_16.a();
            var15_15 = var4_4.U;
            var4_4.bb((PLPExtras)var8_8, (String)var15_15);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Qa(String var1_1, String var2_2, String var3_3, String var4_4, boolean var5_5, boolean var6_6) {
        block15: {
            block14: {
                var7_7 = var1_1;
                var8_8 = var4_4;
                var9_9 = 32;
                var10_10 = null;
                var11_11 = 1;
                if (var6_6) break block14;
                if (var1_1 == null) ** GOTO lbl-1000
                var12_12 = var1_1.length() - var11_11;
                var13_13 = 0;
                var14_15 = false;
                while (var13_13 <= var12_12) {
                    var15_17 = var14_15 == false ? var13_13 : var12_12;
                    if ((var15_17 = Intrinsics.compare(var1_1.charAt(var15_17), var9_9)) <= 0) {
                        var15_17 = 1;
                    } else {
                        var15_17 = 0;
                        var16_19 = null;
                    }
                    if (!var14_15) {
                        if (var15_17 == 0) {
                            var14_15 = true;
                            continue;
                        }
                        ++var13_13;
                        continue;
                    }
                    if (var15_17 == 0) break;
                    var12_12 += -1;
                }
                if ((var9_9 = (int)TextUtils.isEmpty((CharSequence)(var17_21 = var1_1.subSequence(var13_13, var12_12 += var11_11).toString()))) != 0) ** GOTO lbl-1000
                var19_23 = Calendar.getInstance().getTimeInMillis();
                var16_19 = od3_2.a();
                var17_21 = var18_22;
                var7_7 = var1_1;
                var8_8 = var2_2;
                var10_10 = var3_3;
                var11_11 = (int)var5_5;
                var18_22 = new SearchEntry(var1_1, var2_2, var3_3, var5_5, var19_23, var16_19, null);
                break block15;
            }
            if (var4_4 == null) ** GOTO lbl-1000
            var21_25 = var4_4.length() - var11_11;
            var13_14 = 0;
            var14_16 = false;
            while (var13_14 <= var21_25) {
                var15_18 = var14_16 == false ? var13_14 : var21_25;
                if ((var15_18 = Intrinsics.compare(var4_4.charAt(var15_18), var9_9)) <= 0) {
                    var15_18 = 1;
                } else {
                    var15_18 = 0;
                    var16_20 = null;
                }
                if (!var14_16) {
                    if (var15_18 == 0) {
                        var14_16 = true;
                        continue;
                    }
                    ++var13_14;
                    continue;
                }
                if (var15_18 == 0) break;
                var21_25 += -1;
            }
            if ((var9_9 = (int)TextUtils.isEmpty((CharSequence)(var17_21 = var4_4.subSequence(var13_14, var21_25 += var11_11).toString()))) == 0) {
                var19_24 = Calendar.getInstance().getTimeInMillis();
                var16_20 = od3_2.a();
                var17_21 = var18_22;
                var7_7 = var4_4;
                var8_8 = var2_2;
                var10_10 = var3_3;
                var11_11 = (int)var5_5;
                var18_22 = new SearchEntry(var4_4, var2_2, var3_3, var5_5, var19_24, var16_20, null);
            } else lbl-1000:
            // 4 sources

            {
                var18_22 = null;
            }
        }
        var17_21 = this;
        if (var18_22 != null) {
            var7_7 = this.t;
            if (var7_7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                var21_25 = 0;
                var7_7 = null;
            }
            var7_7.getClass();
            Intrinsics.checkNotNullParameter(var18_22, "searchEntry");
            var8_8 = md3_0.c((jD3)var7_7);
            var10_10 = new bw2_2((yw2_0)var7_7, var18_22, null);
            var21_25 = 3;
            Ae3.d((i90_0)var8_8, null, null, (Function2)var10_10, var21_25);
        }
    }

    public final void Ra() {
        a$a a$a = com.ril.ajio.plp.a.Companion;
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        K3 k3 = this.requireActivity().getActivityResultRegistry();
        a$a.getClass();
        a$a.a(context, k3, this).a();
    }

    public final Bundle Sa() {
        int n3 = 3;
        Bundle bundle = dk0.a(n3, "dimensionId");
        Object object = this.U;
        bundle.putString("Zerosearchresult", (String)object);
        Object object2 = this.t;
        object = null;
        String string2 = "searchViewModel";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        if ((object2 = ((yw2_0)object2).s) == null) {
            object2 = "ajio";
        } else {
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = object2;
            }
            object2 = ((yw2_0)object).s;
        }
        bundle.putString("StoreId", (String)object2);
        return bundle;
    }

    public final void Ta(String string2, boolean bl2) {
        int n3;
        FragmentActivity fragmentActivity = this.getActivity();
        hv3_0.S(fragmentActivity);
        if (string2 != null && (n3 = string2.length()) != 0) {
            this.showProgress();
            n3 = 0;
            fragmentActivity = null;
            String string3 = "queryString";
            yw2_0 yw2_02 = null;
            String string4 = "searchViewModel";
            if (bl2) {
                Object object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    yw2_02 = object;
                }
                yw2_02.getClass();
                Intrinsics.checkNotNullParameter(string2, string3);
                object = yw2_02.h;
                string3 = "luxe";
                yw2_02.c(string2, false, (zr1_1)object, string3);
            } else {
                Object object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    yw2_02 = object;
                }
                yw2_02.getClass();
                Intrinsics.checkNotNullParameter(string2, string3);
                object = yw2_02.d;
                string3 = yw2_02.s;
                yw2_02.c(string2, false, (zr1_1)object, string3);
            }
        }
    }

    public final void Ua(int n3, SuggestionSearchModel suggestionSearchModel, int n4) {
        Object object;
        boolean bl2;
        vv2_2 vv2_22 = this;
        int n7 = n3;
        Object object2 = this.t;
        String string2 = "searchViewModel";
        boolean bl3 = false;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object2 = null;
        }
        object2.getClass();
        Intrinsics.checkNotNullParameter(suggestionSearchModel, "model");
        object2 = suggestionSearchModel.getQuery();
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        String string3 = "Search Screen";
        String string4 = "";
        String string5 = "search";
        String string6 = "ajio";
        Object object4 = "StoreId";
        Object object5 = "SearchTerm";
        Object object6 = "dimensionId";
        Object object7 = "Autosuggestion_CM";
        int n8 = 4;
        if (!bl2 && (bl2 = Intrinsics.areEqual(object2 = suggestionSearchModel.getQuery(), object = "SIS_SEARCH"))) {
            boolean bl4;
            object2 = vv2_22.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            ((yw2_0)object2).s = null;
            object2 = vv2_22.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            ((yw2_0)object2).v = null;
            object2 = new Bundle();
            object2.putInt((String)object7, n7);
            object2.putInt((String)object6, n8);
            object = suggestionSearchModel.getText();
            object2.putString((String)object5, (String)object);
            object = vv2_22.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl4 = false;
                object = null;
            }
            if ((object = ((yw2_0)object).s) != null) {
                object = vv2_22.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object;
                }
                string6 = ((yw2_0)object3).s;
            }
            object2.putString((String)object4, string6);
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
            object2 = analyticsData$Builder.bundle((Bundle)object2).build();
            ((GTMEvents)object).pushSearchDiscoveryEvent(string5, string4, string3, (AnalyticsData)object2);
            object2 = suggestionSearchModel.getCode();
            bl4 = og1_1.c();
            vv2_22.Ta((String)object2, bl4);
        } else {
            boolean bl5;
            vv2_22.X = object2 = suggestionSearchModel.getText();
            object = suggestionSearchModel.getText();
            Object object8 = suggestionSearchModel.getQuery();
            object3 = "getQuery(...)";
            Intrinsics.checkNotNullExpressionValue(object8, (String)object3);
            n8 = ((String)object8).length();
            if (n8 > 0) {
                object2 = suggestionSearchModel.getQuery();
            }
            object3 = object2;
            String string7 = suggestionSearchModel.getCode();
            object8 = suggestionSearchModel.getText();
            String string8 = suggestionSearchModel.getQuery();
            int n10 = suggestionSearchModel.isAutoSuggested();
            object2 = this;
            String string9 = object;
            object = object8;
            object8 = string7;
            String string10 = object7;
            object7 = string8;
            String string11 = object6;
            int n14 = 0;
            object6 = null;
            String string12 = object5;
            int n15 = n10;
            Object object9 = object3;
            object3 = object4;
            int n16 = 0;
            object4 = null;
            this.Qa((String)object, string7, string8, null, n10 != 0, false);
            object2 = string7 == null ? object9 : string7;
            object = suggestionSearchModel.getText();
            n8 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n8 != 0) {
                object = object9;
            }
            object8 = new Bundle();
            object7 = string10;
            object8.putInt(string10, n7);
            object7 = string11;
            n14 = 4;
            object8.putInt(string11, n14);
            object7 = string12;
            object8.putString(string12, (String)object);
            object7 = vv2_22.t;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object7 = null;
            }
            if ((object7 = ((yw2_0)object7).s) != null) {
                object7 = vv2_22.t;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object7 = null;
                }
                string6 = ((yw2_0)object7).s;
            }
            object8.putString((String)object3, string6);
            object7 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object5 = new AnalyticsData$Builder();
            object8 = ((AnalyticsData$Builder)object5).bundle((Bundle)object8).build();
            ((GTMEvents)object7).pushSearchDiscoveryEvent(string5, string4, string3, (AnalyticsData)object8);
            n8 = 2;
            object7 = "search_term";
            n15 = n4;
            if (n4 != n8) {
                object8 = new Bundle();
                object8.putString((String)object7, (String)object);
                object8.putInt("valid_search", n14);
                object5 = String.valueOf(n3);
                object8.putString("position_of_click", (String)object5);
                object6 = vv2_22.z0;
                String string13 = ((NewCustomEventsRevamp)object6).getEC_SEARCH_INTERACTIONS();
                Intrinsics.checkNotNull(object);
                String string14 = "history search";
                String string15 = "search_history_click";
                String string16 = "search screen";
                String string17 = "search screen";
                object5 = vv2_22.A0;
                object4 = vv2_22.B0;
                int n17 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string13, string14, (String)object, string15, string16, string17, (String)object5, (Bundle)object8, (String)object4, false, null, n17, null);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)string9))) {
                object = string9;
                object8 = E1.a((String)object7, string9);
                object7 = FirebaseEvents.Companion.getInstance();
                object6 = GAUtils.Companion.getGAViewItemSearchResults();
                ((FirebaseEvents)object7).sendEvent((String)object6, (Bundle)object8);
            } else {
                object = string9;
            }
            object8 = suggestionSearchModel.getStoreType();
            object7 = "luxe";
            n8 = (int)(((String)object7).equalsIgnoreCase((String)object8) ? 1 : 0);
            Intrinsics.checkNotNull(object);
            vv2_22.Za((String)object);
            bl5 = suggestionSearchModel.isAutoSuggested();
            n14 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n14 == 0) {
                n14 = 0;
                object6 = null;
                if (object2 != null) {
                    n15 = ((String)object2).length();
                    n16 = 1;
                    n15 -= n16;
                    n7 = 0;
                    bl3 = false;
                    object3 = null;
                    while (n7 <= n15) {
                        int n18 = !bl3 ? n7 : n15;
                        n18 = ((String)object2).charAt(n18);
                        int n19 = 32;
                        n18 = Intrinsics.compare(n18, n19);
                        n18 = n18 <= 0 ? 1 : 0;
                        if (!bl3) {
                            if (n18 == 0) {
                                bl3 = true;
                                continue;
                            }
                            ++n7;
                            continue;
                        }
                        if (n18 == 0) break;
                        n15 += -1;
                    }
                    object5 = com.jio.jioads.adinterfaces.a.a(n15, n16, n7, (String)object2);
                } else {
                    n15 = 0;
                    object5 = null;
                }
                vv2_22.Y = object5;
                object5 = vv2_22.b;
                ((jo_2)((hh3_2)object5).getValue()).u();
                object4 = (jo_2)((hh3_2)object5).getValue();
                ((jo_2)object4).w();
                ((jo_2)((hh3_2)object5).getValue()).v();
                object5 = this.getActivity();
                hv3_0.S((Activity)object5);
                if (object2 != null) {
                    this.showProgress();
                    object5 = "queryString";
                    if (!bl5 && n8 != 0) {
                        object = vv2_22.t;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl3 = false;
                            object3 = null;
                        } else {
                            object3 = object;
                        }
                        object3.getClass();
                        Intrinsics.checkNotNullParameter(object2, (String)object5);
                        object = ((yw2_0)object3).f;
                        ((yw2_0)object3).c((String)object2, false, (zr1_1)object, (String)object7);
                    } else {
                        object8 = vv2_22.t;
                        if (object8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl3 = false;
                            object3 = null;
                        } else {
                            object3 = object8;
                        }
                        object3.getClass();
                        Intrinsics.checkNotNullParameter(object2, (String)object5);
                        object8 = od3_2.a();
                        object7 = ld3_2.STORE_AJIOGRAM;
                        object6 = ((ld3_2)((Object)object7)).getStoreId();
                        n8 = (int)(Intrinsics.areEqual(object8, object6) ? 1 : 0);
                        if (n8 != 0) {
                            ((yw2_0)object3).s = object8 = ((ld3_2)((Object)object7)).getStoreId();
                        }
                        object8 = ((yw2_0)object3).f;
                        object7 = ((yw2_0)object3).s;
                        ((yw2_0)object3).c((String)object2, bl5, (zr1_1)object8, (String)object7);
                    }
                }
            }
        }
    }

    public final boolean Va() {
        return (Boolean)this.k0.getValue();
    }

    public final void Wa() {
        a$a a$a = com.ril.ajio.plp.a.Companion;
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        K3 k3 = this.requireActivity().getActivityResultRegistry();
        a$a.getClass();
        a$a.a(context, k3, this).b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Xa(PLPExtras object, String object2) {
        Object object3 = h40_0.a;
        boolean bl2 = h40_0.b();
        Object object4 = null;
        if (!bl2) {
            og1_1.c();
            this.bb((PLPExtras)object, null);
            return;
        }
        if (object2 == null) return;
        try {
            object = this.getActivity();
            if (object != null) {
                Object object5;
                object = this.n;
                object3 = "activityFragmentListener";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object = null;
                }
                if ((object5 = this.n) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object4 = object5;
                }
                object3 = object4.y();
                object4 = de0_2.Companion;
                object5 = Boolean.FALSE;
                object4.getClass();
                object2 = de0$a.a((String)object2, (Boolean)object5);
                object4 = "de0";
                boolean bl3 = true;
                j3$a.a((j3_0)object, (Fragment)object3, (Fragment)object2, bl3, (String)object4);
            }
            object = Unit.a;
            return;
        }
        catch (Exception exception) {
            object = Unit.a;
            return;
        }
    }

    public final void Y9(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "orderStatus");
        Intrinsics.checkNotNullParameter(string4, "returnId");
        Intrinsics.checkNotNullParameter(string5, "orderId");
        Intrinsics.checkNotNullParameter(string6, "position");
    }

    public final void Ya() {
        yw2_0 yw2_02 = this.t;
        if (yw2_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
            yw2_02 = null;
        }
        yw2_02.getClass();
        aW aW2 = md3_0.c(yw2_02);
        Object object = C90$a.a;
        ww2_0 ww2_02 = new kotlin.coroutines.a((CoroutineContext$a)object);
        object = new xw2_0(yw2_02, null);
        Ae3.d(aW2, ww2_02, null, (Function2)object, 2);
    }

    public final void Z6(BannerData bannerData, List list) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(list, "bannerList");
    }

    public final void Za(String string2) {
        boolean bl2 = this.Va();
        if (bl2) {
            boolean bl3;
            Stack stack = SV2.a;
            stack = SV2.a;
            stack.push(string2);
            this.k = bl3 = true;
        }
    }

    public final void a8(PLPExtras pLPExtras) {
        Intrinsics.checkNotNullParameter(pLPExtras, "plpExtras");
        String string2 = pLPExtras.x;
        if (string2 == null) {
            string2 = "";
        }
        Object object = new File(string2);
        object = Uri.fromFile((File)object).toString();
        this.Xa(pLPExtras, (String)object);
    }

    public final void ab(String string2, String string3) {
        Object object;
        boolean bl2;
        Bundle bundle;
        String string4;
        Object object2;
        block6: {
            Object object3;
            block5: {
                Object object4 = z40_0.Companion;
                object3 = this.requireActivity().getApplication();
                object2 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                object4.getClass();
                object4 = z40$a.a((Context)object3).a;
                boolean bl3 = ((ao0_0)object4).a("use_store_field_search_redirect");
                object3 = null;
                string4 = bl3 ? string3 : null;
                bundle = new Bundle();
                object4 = this;
                object2 = this.H;
                if (object2 == null) {
                    object2 = "searchETVRefresh";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object3 = object2;
                }
                object3 = object3.getText();
                bl2 = true;
                if (object3 != null) break block5;
                bv2_0.Companion.getClass();
                object3 = bv2_0.a2;
                object = kv2_0.PLP_HISTORY;
                if (object3 != object) break block6;
            }
            object3 = "IS_FROM_SEARCH_TERM";
            bundle.putBoolean((String)object3, bl2);
        }
        bundle.putBoolean("IS_FROM_SEARCH_PAGE", bl2);
        object2 = kj0_1.g();
        object = this.getActivity();
        Boolean bl4 = Boolean.FALSE;
        ((kj0_1)object2).q((Activity)object, string2, 0, null, 0, null, true, bundle, string4, "redirect", null, null, bl4, bl4, 0);
    }

    public final void bb(PLPExtras object, String string2) {
        Object object2;
        boolean bl2 = this.F0;
        Object object3 = "<set-?>";
        boolean bl3 = false;
        j3_0 j3_02 = null;
        if (bl2) {
            object2 = this.G0;
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            ((PLPExtras)object).H = object2;
        } else {
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                bl2 = false;
                object2 = null;
            }
            object2 = ((yw2_0)object2).w;
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            ((PLPExtras)object).H = object2;
        }
        ((bu2_0)this.M0.getValue()).a.k(object);
        object2 = ((PLPExtras)object).e;
        if (object2 == null) {
            object2 = "";
        }
        object = ((PLPExtras)object).H;
        object = at2_1.b((String)object2, (String)object);
        object2 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        object3 = "search screen";
        ((NewEEcommerceEventsRevamp)object2).setPreviousScreenData((String)object3, (String)object3);
        object2 = this.getActivity();
        if (object2 != null) {
            j3_0 j3_03;
            object2 = this.n;
            object3 = "activityFragmentListener";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object2 = null;
            }
            if ((j3_03 = this.n) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                j3_02 = j3_03;
            }
            object3 = j3_02.y();
            bl3 = true;
            j3$a.a((j3_0)object2, (Fragment)object3, (Fragment)object, bl3, string2);
        }
    }

    public final void c4(String string2, HotSpotT hotSpotT, String string3, BannerData bannerData, String string4, String string5) {
        boolean bl2;
        String string6 = string3;
        Object object = hotSpotT;
        Intrinsics.checkNotNullParameter(hotSpotT, "hotspot");
        object = bannerData;
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Object object2 = "creativeSlot";
        Object object3 = string5;
        Intrinsics.checkNotNullParameter(string5, (String)object2);
        if (string3 != null && (bl2 = string3.length())) {
            object2 = bannerData.getBannerUrl();
            if (object2 != null && (bl2 = ((String)object2).length())) {
                object2 = this.t;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                    bl2 = false;
                    object2 = null;
                }
                if ((object3 = bannerData.getBannerUrl()) == null) {
                    object3 = "";
                }
                String string7 = object3;
                object2.getClass();
                Intrinsics.checkNotNullParameter(string6, "linkURL");
                Intrinsics.checkNotNullParameter(object3, "imageUrl");
                object2 = AnalyticsManager.Companion;
                NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
                object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
                String string8 = ((NewEEcommerceEventsRevamp)object3).getEE_SELECT_PROMOTION();
                String string9 = bv_0.a((AnalyticsManager$Companion)object2);
                String string10 = cv_0.a((AnalyticsManager$Companion)object2);
                int n3 = 3968;
                String string11 = "search screen";
                String string12 = "search screen";
                boolean bl3 = true;
                NewEEcommerceEventsRevamp.pushEESelectPromotion$default(newEEcommerceEventsRevamp, string8, string7, string11, string9, string12, string10, bl3, false, null, null, null, false, n3, null);
            }
            Bundle bundle = new Bundle();
            object2 = bannerData.getEnableAdsOnPlp();
            bl2 = object2 != null ? (boolean)((Boolean)object2) : true;
            bundle.putBoolean("enable_ads_on_plp", bl2);
            object2 = kj0_1.g();
            object = this.getActivity();
            String string13 = "Trending categories";
            string6 = string3;
            object3 = string4;
            ((kj0_1)object2).u((Activity)object, string3, string4, string13, bundle);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cb(DataCallback dataCallback, boolean bl2) {
        int n3;
        Object object;
        int n4;
        block30: {
            AnalyticsManager$Companion analyticsManager$Companion;
            Object object2;
            String string2;
            Object object3;
            Object object4;
            String string3;
            String string4;
            Object object5;
            int n7;
            Object object6;
            String string5;
            Object object7;
            int n8;
            vv2_2 vv2_22;
            block32: {
                block33: {
                    String string6;
                    int n10;
                    String string7;
                    block31: {
                        vv2_22 = this;
                        n4 = 1;
                        n8 = 0;
                        object = null;
                        this.hideProgress();
                        n3 = dataCallback.getStatus();
                        if (n3 != 0) break block30;
                        n4 = this.isAdded();
                        if (n4 == 0) {
                            return;
                        }
                        object7 = (ProductsList)dataCallback.getData();
                        string5 = "searchViewModel";
                        if (object7 != null && (object7 = ((ProductsList)object7).getShowAdsOnNextPage()) != null) {
                            object7 = this.t;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                                n4 = 0;
                                object7 = null;
                            }
                            object7.getClass();
                        }
                        if ((object7 = (ProductsList)dataCallback.getData()) != null && (object6 = ((ProductsList)object7).getBrandDetails()) != null) {
                            object6 = ((BrandDetails)object6).getBrandId();
                        } else {
                            n7 = 0;
                            object6 = null;
                        }
                        if (object7 != null) {
                            string7 = ((ProductsList)object7).getFreeTextSearch();
                        } else {
                            n10 = 0;
                            string7 = null;
                        }
                        vv2_2.db((String)object6, string7);
                        if (object7 != null) {
                            object6 = ((ProductsList)object7).getProducts();
                        } else {
                            n7 = 0;
                            object6 = null;
                        }
                        object6 = (Collection)object6;
                        if (object6 != null && (n7 = object6.isEmpty()) == 0) {
                            string5 = vv2_22.U;
                            vv2_22.Za(string5);
                            n3 = (int)(bl2 ? 1 : 0);
                            vv2_22.O6((ProductsList)object7, bl2, false);
                            return;
                        }
                        if (object7 != null) {
                            object = ((ProductsList)object7).getRedirect();
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        if (object != null) {
                            object = z40_0.Companion;
                            object6 = this.requireActivity().getApplication();
                            string7 = "getApplication(...)";
                            Intrinsics.checkNotNullExpressionValue(object6, string7);
                            object.getClass();
                            object = z40$a.a((Context)object6).a;
                            object6 = "search_redirect_key";
                            n8 = ((ao0_0)object).a((String)object6);
                            if (n8 != 0) {
                                object = ((ProductsList)object7).getRedirect();
                                Intrinsics.checkNotNull(object);
                                object7 = ((ProductsList)object7).getStore();
                                vv2_22.ab((String)object, (String)object7);
                                return;
                            }
                        }
                        if (object7 != null) {
                            object = ((ProductsList)object7).getSuggestedSearchTerms();
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        object5 = vv2_22.z0;
                        string4 = "/ajio";
                        string3 = "/(ZSR)/";
                        object6 = "Search Screen";
                        string7 = "search";
                        object4 = "/sis-";
                        object3 = vv2_22.m;
                        string6 = "";
                        if (object != null && (n8 = object.isEmpty()) == 0) break block31;
                        String string8 = object3;
                        string2 = object4;
                        object = string3;
                        object2 = object5;
                        Bundle bundle = this.Sa();
                        analyticsManager$Companion = AnalyticsManager.Companion;
                        object3 = analyticsManager$Companion.getInstance().getGtmEvents();
                        object4 = new AnalyticsData$Builder();
                        AnalyticsData analyticsData = ((AnalyticsData$Builder)object4).bundle(bundle).build();
                        ((GTMEvents)object3).pushSearchDiscoveryEvent(string7, string6, (String)object6, analyticsData);
                        object6 = vv2_22.U;
                        object = n1.a(string8, string3, (String)object6);
                        object6 = vv2_22.t;
                        if (object6 != null) break block32;
                        break block33;
                    }
                    object = this.Sa();
                    AnalyticsManager$Companion analyticsManager$Companion2 = AnalyticsManager.Companion;
                    Object object8 = analyticsManager$Companion2.getInstance().getGtmEvents();
                    Object object9 = new AnalyticsData$Builder();
                    object = ((AnalyticsData$Builder)object9).bundle((Bundle)object).build();
                    ((GTMEvents)object8).pushSearchDiscoveryEvent(string7, string6, (String)object6, (AnalyticsData)object);
                    object = new Bundle();
                    string7 = vv2_22.U;
                    object.putString("search_term", string7);
                    n10 = 4;
                    object.putInt("valid_search", n10);
                    object6 = h40_0.a;
                    n7 = h40_0.V0();
                    if (n7 != 0) {
                        object6 = analyticsManager$Companion2.getInstance().getNewEEcommerceEventsRevamp();
                        if (object7 != null && (string7 = ((ProductsList)object7).getLastSavedCohort()) != null) {
                            string6 = string7;
                        }
                        ((NewEEcommerceEventsRevamp)object6).addCohortLInkData((Bundle)object, string6);
                    }
                    if (object7 != null && (object6 = ((ProductsList)object7).getUserGroup()) != null && (n7 = ((String)object6).length()) > 0) {
                        object6 = "akamai_personalization";
                        string7 = ((ProductsList)object7).getUserGroup();
                        object.putString((String)object6, string7);
                    }
                    string7 = ((NewCustomEventsRevamp)object5).getEC_SEARCH_INTERACTIONS();
                    object8 = vv2_22.U;
                    int n14 = 1536;
                    string6 = "custom search";
                    object9 = "custom_search";
                    String string9 = "search screen";
                    String string10 = "search screen";
                    object6 = vv2_22.A0;
                    Object object10 = vv2_22.B0;
                    Object object11 = object6;
                    object6 = object5;
                    Object object12 = object3;
                    object3 = object11;
                    Object object13 = object4;
                    object4 = object;
                    object = string3;
                    string3 = object10;
                    object10 = object5;
                    object5 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string7, string6, (String)object8, (String)object9, string9, string10, (String)object11, (Bundle)object4, string3, false, null, n14, null);
                    object6 = vv2_22.U;
                    object8 = object12;
                    object = n1.a((String)object12, (String)object, (String)object6);
                    object6 = vv2_22.t;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n7 = 0;
                        object6 = null;
                    }
                    if ((object6 = ((yw2_0)object6).s) != null) {
                        object6 = vv2_22.t;
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                            n7 = 0;
                            object6 = null;
                        }
                        string5 = ((yw2_0)object6).s;
                        object9 = object13;
                        string4 = kp1_0.c((String)object13, string5);
                    }
                    string5 = string4;
                    object = Ft2.a((String)object, string4);
                    analyticsManager$Companion2.getInstance().getGtmEvents().setScreenName((String)object);
                    analyticsManager$Companion2.getInstance().getGtmEvents().pushOpenScreenEvent((String)object);
                    object9 = new Bundle();
                    object = ((NewCustomEventsRevamp)object10).getSV_ZERO_SEARCH_TERM();
                    string5 = vv2_22.U;
                    object9.putString((String)object, string5);
                    object = analyticsManager$Companion2.getInstance().getNewEEcommerceEventsRevamp();
                    object8 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
                    String string11 = cv_0.a(analyticsManager$Companion2);
                    string6 = "search screen";
                    object6 = vv2_22.z0;
                    string7 = "zero result screen";
                    ((NewCustomEventsRevamp)object6).newPushCustomScreenView(string7, string6, (String)object8, (Bundle)object9, string11);
                    vv2_22.gb((ProductsList)object7);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n7 = 0;
                object6 = null;
            }
            if ((object6 = ((yw2_0)object6).s) != null) {
                object6 = vv2_22.t;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n7 = 0;
                    object6 = null;
                }
                object6 = ((yw2_0)object6).s;
                string4 = kp1_0.c(string2, (String)object6);
            }
            object6 = string4;
            object = Ft2.a((String)object, string4);
            analyticsManager$Companion.getInstance().getGtmEvents().setScreenName((String)object);
            analyticsManager$Companion.getInstance().getGtmEvents().pushOpenScreenEvent((String)object);
            object = new Bundle();
            object2 = ((NewCustomEventsRevamp)object2).getSV_ZERO_SEARCH_TERM();
            object6 = vv2_22.U;
            object.putString((String)object2, (String)object6);
            object2 = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
            object5 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
            String string12 = cv_0.a(analyticsManager$Companion);
            string3 = "search screen";
            object3 = vv2_22.z0;
            object4 = "zero result screen";
            ((NewCustomEventsRevamp)object3).newPushCustomScreenView((String)object4, string3, (String)object5, (Bundle)object, string12);
            object = vv2_22.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n8 = 0;
                object = null;
            }
            if ((object = ((yw2_0)object).s) != null) {
                object = vv2_22.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n8 = 0;
                    object = null;
                }
                object = ((yw2_0)object).s;
            }
            if ((object = vv2_22.A) == null) {
                object = "searchList";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                boolean bl3 = false;
                object2 = null;
            } else {
                object2 = object;
            }
            n8 = 8;
            object2.setVisibility(n8);
            vv2_22.gb((ProductsList)object7);
            return;
        }
        n3 = dataCallback.getStatus();
        if (n3 != n4) return;
        Object object14 = StringCompanionObject.INSTANCE;
        object14 = hv3_0.K(R$string.acc_error_message);
        int n15 = R$string.something_wrong_msg;
        String string13 = hv3_0.K(n15);
        Object object15 = new Object[n4];
        object15[0] = string13;
        object = xh2_0.a((Object[])object15, n4, (String)object14, "format(...)");
        n3 = R$string.something_wrong_msg;
        object14 = hv3_0.K(n3);
        string13 = this.getContext();
        if (string13 == null) return;
        object15 = this.n;
        if (object15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            boolean bl4 = false;
            object15 = null;
        }
        object15.showToastNotification((Context)string13, (String)object14, n4, (String)object);
    }

    public final void e0() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void eb() {
        block34: {
            block33: {
                block32: {
                    var1_1 = 1;
                    var2_2 = "#FFFFFF";
                    var3_3 = this.t;
                    var4_4 = "searchViewModel";
                    var5_5 = null;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                        var6_6 = 0;
                        var3_3 = null;
                    }
                    var3_3 = var3_3.v;
                    var7_7 = "Search in ";
                    var8_8 = "searchETVRefresh";
                    if (var3_3 == null) break block34;
                    var3_3 = this.t;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                        var6_6 = 0;
                        var3_3 = null;
                    }
                    if ((var3_3 = var3_3.v) != null) {
                        var3_3 = var3_3.storeTitle;
                    } else {
                        var6_6 = 0;
                        var3_3 = null;
                    }
                    var9_9 = this.t;
                    if (var9_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                        var10_10 = 0;
                        var9_9 = null;
                    }
                    if ((var10_10 = var9_9.b()) == 0) ** GOTO lbl-1000
                    var9_9 = this.t;
                    if (var9_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                        var10_10 = 0;
                        var9_9 = null;
                    }
                    if ((var9_9 = var9_9.u) != null && (var10_10 = var9_9.length()) > 0) {
                        var11_11 = this.H;
                        if (var11_11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                            var1_1 = 0;
                            var11_11 = null;
                        }
                        if ((var3_3 = this.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                            var6_6 = 0;
                            var3_3 = null;
                        }
                        var3_3 = var3_3.u;
                        var9_9 = new StringBuilder(var7_7);
                        var9_9.append((String)var3_3);
                        var3_3 = var9_9.toString();
                        var11_11.setHint((CharSequence)var3_3);
                    } else if (var3_3 != null && (var12_14 = var3_3.length()) != 0) {
                        var7_7 = this.H;
                        if (var7_7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                            var12_14 = 0;
                            var7_7 = null;
                        }
                        var9_9 = StringCompanionObject.INSTANCE;
                        var10_10 = R$string.search_store;
                        var9_9 = this.getString(var10_10);
                        Intrinsics.checkNotNullExpressionValue(var9_9, "getString(...)");
                        var13_15 = new Object[var1_1];
                        var13_15[0] = var3_3;
                        var11_11 = Arrays.copyOf(var13_15, var1_1);
                        var11_11 = String.format((String)var9_9, (Object[])var11_11);
                        var3_3 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(var11_11, (String)var3_3);
                        var7_7.setHint((CharSequence)var11_11);
                    } else {
                        var11_11 = this.H;
                        if (var11_11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                            var1_1 = 0;
                            var11_11 = null;
                        }
                        var6_6 = R$string.search_by_product;
                        var3_3 = this.getString(var6_6);
                        var11_11.setHint((CharSequence)var3_3);
                    }
                    try {
                        var11_11 = this.t;
                        if (var11_11 != null) break block32;
                        Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                        var1_1 = 0;
                        var11_11 = null;
                    }
                    catch (Exception var11_12) {
                        break block33;
                    }
                }
                if ((var1_1 = (int)var11_11.b()) != 0) return;
                var11_11 = this.K;
                if (var11_11 == null) {
                    var11_11 = "searchContainer";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                    var1_1 = 0;
                    var11_11 = null;
                }
                if ((var3_3 = this.t) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                    var6_6 = 0;
                    var3_3 = null;
                }
                if ((var3_3 = var3_3.v) != null) {
                    var3_3 = var3_3.colorTheme;
                } else {
                    var6_6 = 0;
                    var3_3 = null;
                }
                var6_6 = Color.parseColor((String)var3_3);
                var11_11.setBackgroundColor(var6_6);
                var11_11 = this.L;
                if (var11_11 == null) {
                    var11_11 = "cancelImageRefresh";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                    var1_1 = 0;
                    var11_11 = null;
                }
                if ((var3_3 = this.t) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                    var6_6 = 0;
                    var3_3 = null;
                }
                if ((var3_3 = var3_3.v) != null) {
                    var3_3 = var3_3.headerIconColor;
                } else {
                    var6_6 = 0;
                    var3_3 = null;
                }
                var6_6 = Color.parseColor((String)var3_3);
                var4_4 = PorterDuff.Mode.SRC_IN;
                var11_11.setColorFilter(var6_6, (PorterDuff.Mode)var4_4);
                var11_11 = this.H;
                if (var11_11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                    var1_1 = 0;
                    var11_11 = null;
                }
                var6_6 = Color.parseColor((String)var2_2);
                var11_11.setBackgroundColor(var6_6);
                var11_11 = this.M;
                if (var11_11 == null) {
                    var11_11 = "searchEditContainer";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                } else {
                    var5_5 = var11_11;
                }
                var11_11 = var5_5.getBackground();
                var3_3 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable";
                Intrinsics.checkNotNull(var11_11, (String)var3_3);
                var11_11 = (GradientDrawable)var11_11;
                var11_11.mutate();
                var14_16 = Color.parseColor((String)var2_2);
                var11_11.setColor(var14_16);
                return;
            }
            var2_2 = yn3_0.a;
            var2_2.e(var11_12);
            return;
        }
        var11_13 = this.t;
        if (var11_13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var4_4);
            var1_1 = 0;
            var11_13 = null;
        }
        if ((var1_1 = var11_13.b()) == 0) return;
        var11_13 = this.t;
        if (var11_13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var4_4);
            var1_1 = 0;
            var11_13 = null;
        }
        if ((var11_13 = var11_13.u) == null) return;
        var1_1 = var11_13.length();
        if (var1_1 <= 0) return;
        var11_13 = this.H;
        if (var11_13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
            var1_1 = 0;
            var11_13 = null;
        }
        if ((var2_2 = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var4_4);
        } else {
            var5_5 = var2_2;
        }
        var2_2 = var5_5.u;
        var3_3 = new StringBuilder(var7_7);
        var3_3.append((String)var2_2);
        var2_2 = var3_3.toString();
        var11_13.setHint((CharSequence)var2_2);
    }

    public final void f0(boolean bl2) {
        if (bl2) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.z0;
            String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            String string3 = av_0.a(analyticsManager$Companion);
            String string4 = "upload image icon interactions";
            String string5 = "pop up close";
            String string6 = "event_upload_image_icon_interactions";
            String string7 = "home landing screen";
            String string8 = this.A0;
            String string9 = this.B0;
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string4, string5, string6, string3, string7, string8, null, string9, false, null, n3, null);
        }
    }

    public final void fb() {
        ld3_2 ld3_22;
        String string2;
        boolean bl2;
        boolean bl3;
        Object object = this.t;
        Object object2 = null;
        String string3 = "searchViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl3 = false;
            object = null;
        }
        if (bl2 = Intrinsics.areEqual(object = ((yw2_0)object).w, string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId())) {
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object2 = object;
            }
            object = ((yw2_0)object2).w;
            this.Oa((String)object);
        } else {
            string2 = ld3_2.STORE_AJIO.getStoreId();
            bl2 = Intrinsics.areEqual(object, string2);
            if (bl2) {
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object2 = object;
                }
                object = ((yw2_0)object2).w;
                this.Oa((String)object);
            } else {
                object2 = ld3_22.getStoreId();
                bl3 = Intrinsics.areEqual(object, object2);
                if (bl3) {
                    this.w0 = bl3 = true;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void gb(ProductsList productsList) {
        int n3;
        int n4;
        int n7;
        Object object;
        Object object2;
        Object object3;
        vv2_2 vv2_22;
        block52: {
            Object object4;
            block59: {
                int n8;
                int n10;
                String string2;
                Object object5;
                Object[] objectArray;
                Object object6;
                Object object7;
                Object object8;
                boolean bl2;
                Object object9;
                Object object10;
                Object object11;
                Object object12;
                Object object13;
                block53: {
                    boolean bl3;
                    Object object14;
                    mv2_2 mv2_22;
                    ArrayList arrayList;
                    block58: {
                        block57: {
                            int n14;
                            Object object15;
                            Object object16;
                            block56: {
                                block54: {
                                    block55: {
                                        int n15;
                                        vv2_22 = this;
                                        object3 = productsList;
                                        object13 = new Ref$ObjectRef();
                                        object12 = this.U;
                                        object11 = new StringBuilder();
                                        object10 = this.m;
                                        object2 = "/(ZSR)/";
                                        ((Ref$ObjectRef)object13).element = object12 = BW0.b((StringBuilder)object11, (String)object10, (String)object2, (String)object12);
                                        object11 = this.t;
                                        object10 = "searchViewModel";
                                        if (object11 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                                            n15 = 0;
                                            object11 = null;
                                        }
                                        if ((object11 = ((yw2_0)object11).s) != null) {
                                            object11 = vv2_22.t;
                                            if (object11 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                                                n15 = 0;
                                                object11 = null;
                                            }
                                            object11 = ((yw2_0)object11).s;
                                            object9 = "/sis-";
                                        } else {
                                            object11 = od3_2.a();
                                            object9 = "/";
                                        }
                                        object11 = kp1_0.c((String)object9, (String)object11);
                                        ((Ref$ObjectRef)object13).element = object12 = Qj0.b((String)object12, (String)object11);
                                        object12 = od3_2.a;
                                        n15 = ((String)object12).length();
                                        if (n15 == 0) {
                                            object12 = od3_2.a();
                                        }
                                        object11 = ld3_2.STORE_LUXE.getStoreId();
                                        bl2 = Intrinsics.areEqual(object12, object11);
                                        object9 = "zsr_impression";
                                        object4 = "zero_search_result_switch_enable";
                                        object8 = "\u2018%s\u2019";
                                        object7 = "format(...)";
                                        object6 = "setPlpTheme";
                                        objectArray = "trackZSREvents";
                                        object2 = "callCategoryApi";
                                        if (bl2) break block53;
                                        object12 = vv2_22.v0;
                                        if (object12 == null) break block52;
                                        object = vv2_22.t;
                                        if (object == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                                            n7 = 0;
                                            object = null;
                                        }
                                        object = ((yw2_0)object).s;
                                        object10 = vv2_22.U;
                                        if (object3 != null) {
                                            object16 = productsList.getSuggestedSearchTerms();
                                            arrayList = object16;
                                        } else {
                                            arrayList = null;
                                        }
                                        if (object3 != null) {
                                            object11 = object16 = productsList.getStoreInfo();
                                        } else {
                                            n15 = 0;
                                            object11 = null;
                                        }
                                        object15 = object3 != null ? (object16 = productsList.getStoreRedirectUri()) : null;
                                        mv2_22 = new mv2_2((ProductsList)object3, vv2_22);
                                        object14 = new nv2_1(vv2_22, (Ref$ObjectRef)object13);
                                        if (object3 != null && (object3 = productsList.getBrandDetails()) != null) {
                                            object3 = ((BrandDetails)object3).getName();
                                        } else {
                                            n4 = 0;
                                            object3 = null;
                                        }
                                        object16 = object9;
                                        object13 = new bb_1(vv2_22, 3);
                                        Intrinsics.checkNotNullParameter(mv2_22, (String)object2);
                                        Intrinsics.checkNotNullParameter(object14, (String)objectArray);
                                        Intrinsics.checkNotNullParameter(object13, (String)object6);
                                        ((hg3_0)object12).p = object10;
                                        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                        object9 = new StringBuilder("/SLP Screen/Smart Suggestion");
                                        ((StringBuilder)object9).append((String)object10);
                                        object6 = "/ajio";
                                        ((StringBuilder)object9).append((String)object6);
                                        object9 = ((StringBuilder)object9).toString();
                                        ((GTMEvents)object2).setScreenName((String)object9);
                                        object2 = od3_2.a;
                                        int n16 = ((String)object2).length();
                                        if (n16 == 0) {
                                            object2 = od3_2.a();
                                        }
                                        if ((n16 = (int)(s20.a ? 1 : 0)) == 0 && (n16 = (int)(Intrinsics.areEqual(object9 = od3_2.a(), objectArray = ((ld3_2)((Object)(object6 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(object2, object9 = ((ld3_2)((Object)object6)).getStoreId()) ? 1 : 0)) == 0) {
                                            n3 = 0;
                                            object2 = null;
                                        } else {
                                            n3 = 1;
                                        }
                                        object9 = ((hg3_0)object12).j;
                                        if (n3 == 0) break block54;
                                        if (object3 == null || (n3 = ((String)object3).length()) == 0) break block55;
                                        object2 = h40_0.a;
                                        object2 = h40_0.x();
                                        if (object2 != null) {
                                            object2 = ((FleekConfigs)object2).getBrandSearchResultEmptyMessage();
                                        } else {
                                            n3 = 0;
                                            object2 = null;
                                        }
                                        if (object2 != null) {
                                            object6 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
                                        } else {
                                            n14 = 0;
                                            object6 = null;
                                        }
                                        if (object6 != null && (n14 = ((String)object6).length()) != 0) {
                                            if (object2 != null) {
                                                object6 = StringCompanionObject.INSTANCE;
                                                n14 = 1;
                                                objectArray = new Object[n14];
                                                objectArray[0] = object3;
                                                zn0_1.b(objectArray, n14, (String)object2, (String)object7, (TextView)object9);
                                            }
                                            break block56;
                                        } else {
                                            n4 = R$string.sorry_msg_search_suggestion;
                                            hv3_0.K(n4);
                                        }
                                        break block56;
                                    }
                                    object3 = h40_0.a;
                                    object3 = h40_0.x();
                                    if (object3 != null) {
                                        object3 = ((FleekConfigs)object3).getGlobalSearchResultEmptyMessage();
                                    } else {
                                        n4 = 0;
                                        object3 = null;
                                    }
                                    if (object3 != null) {
                                        object2 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
                                    } else {
                                        n3 = 0;
                                        object2 = null;
                                    }
                                    if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                                        if (object3 != null) {
                                            object2 = StringCompanionObject.INSTANCE;
                                            n3 = 1;
                                            object6 = new Object[n3];
                                            objectArray = null;
                                            object6[0] = object10;
                                            zn0_1.b((Object[])object6, n3, (String)object3, (String)object7, (TextView)object9);
                                        }
                                        break block56;
                                    } else {
                                        n4 = R$string.sorry_msg_search_suggestion;
                                        hv3_0.K(n4);
                                    }
                                    break block56;
                                }
                                n4 = R$string.sorry_msg_search_suggestion;
                                hv3_0.K(n4);
                            }
                            object3 = hv3_0.K(R$string.sorry_msg_search_suggestion);
                            ((hg3_0)object12).m.setText((CharSequence)object3);
                            object3 = StringCompanionObject.INSTANCE;
                            n4 = 1;
                            object2 = new Object[n4];
                            n14 = 0;
                            object6 = null;
                            object2[0] = object10;
                            object2 = xh2_0.a((Object[])object2, n4, (String)object8, (String)object7);
                            object3 = ((hg3_0)object12).o;
                            object3.setText((CharSequence)object2);
                            n4 = (int)(og1_1.f() ? 1 : 0);
                            object2 = ((hg3_0)object12).k;
                            if (n4 == 0) break block57;
                            object3 = z40_0.Companion;
                            object8 = AJIOApplication.Companion;
                            object3 = Q.a((AJIOApplication$a)object8, (z40$a)object3).a;
                            n4 = (int)(((ao0_0)object3).a((String)object4) ? 1 : 0);
                            if (n4 == 0 || object10 == null || (n4 = ((String)object10).length()) == 0) break block57;
                            if (object11 != null) {
                                int n17;
                                object3 = ((hg3_0)object12).d;
                                object3.getClass();
                                if (object == null || (n17 = ((String)object).length()) == 0) {
                                    n17 = 1;
                                    object = od3_2.a();
                                    n7 = Intrinsics.areEqual(object11, object);
                                } else {
                                    n7 = Intrinsics.areEqual(object11, object);
                                    n17 = 1;
                                }
                                if ((n7 ^= n17) != 0) {
                                    object = ((yw2_0)object3).D;
                                    object4 = new gg3_1((hg3_0)object12);
                                    object8 = ((hg3_0)object12).c;
                                    ((LiveData)object).e((mu1_1)object8, (F62)object4);
                                    object9.setVisibility(8);
                                    n7 = 0;
                                    object2.setVisibility(0);
                                    object = object16;
                                    ((nv2_1)object14).invoke(object16, object11);
                                    object = ((hg3_0)object12).n;
                                    ((yw2_0)object3).d((ImageView)object, (String)object11);
                                    Bundle bundle = new Bundle();
                                    object16 = object3;
                                    object3 = new fg3_1((String)object11, bundle, (hg3_0)object12, (String)object15, (String)object10, mv2_22, (nv2_1)object14, (bb_1)object13);
                                    object = ((hg3_0)object12).l;
                                    object.setOnClickListener((View.OnClickListener)object3);
                                }
                            }
                            break block58;
                        }
                        object3 = null;
                        object9.setVisibility(0);
                        n4 = 8;
                        object2.setVisibility(n4);
                    }
                    object3 = ((hg3_0)object12).e;
                    object = ((hg3_0)object12).g;
                    object14 = arrayList;
                    if (arrayList != null && !(bl3 = ((hg3_0)object12).i)) {
                        bl3 = arrayList.isEmpty();
                        int n18 = 1;
                        if (bl3 ^= n18) {
                            bl3 = false;
                            mv2_22 = null;
                            object.setVisibility(0);
                            object = object.getContext();
                            object11 = new FlexboxLayoutManager((Context)object);
                            ((FlexboxLayoutManager)object11).setFlexWrap(n18);
                            ((FlexboxLayoutManager)object11).setFlexDirection(0);
                            n7 = 2;
                            ((FlexboxLayoutManager)object11).setJustifyContent(n7);
                            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object11);
                            object = new lg3_1((ng3_1)object12, arrayList);
                            ((RecyclerView)object3).setAdapter((RecyclerView$f)object);
                        } else {
                            int n19 = 8;
                            object.setVisibility(n19);
                            object3.setVisibility(n19);
                        }
                    } else {
                        int n20 = 8;
                        object.setVisibility(n20);
                        object3.setVisibility(n20);
                    }
                    object3 = ((hg3_0)object12).h;
                    n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                    object = ((hg3_0)object12).f;
                    if (n4 != 0 || (n4 = (int)(kotlin.text.b.i((String)(object3 = ((hg3_0)object12).h), (String)(object14 = "\"\""), bl3 = true) ? 1 : 0)) != 0) {
                        n4 = 8;
                        object.setVisibility(n4);
                        break block52;
                    } else {
                        n4 = 0;
                        object3 = null;
                        object.setVisibility(0);
                        object.setOnClickListener((View.OnClickListener)object12);
                    }
                    break block52;
                }
                object = object9;
                object9 = vv2_22.u0;
                if (object9 == null) break block52;
                object11 = vv2_22.U;
                if (object3 != null) {
                    object12 = object5 = productsList.getStoreInfo();
                } else {
                    bl2 = false;
                    object12 = null;
                }
                if (object3 != null) {
                    object5 = productsList.getStoreRedirectUri();
                    string2 = object5;
                } else {
                    string2 = null;
                }
                Object object17 = new ov2_2((ProductsList)object3, vv2_22);
                object3 = new pv2_1(vv2_22, (Ref$ObjectRef)object13);
                object5 = vv2_22.t;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                    n10 = 0;
                    object5 = null;
                }
                object5 = ((yw2_0)object5).s;
                object13 = new GR0(vv2_22, 2);
                Intrinsics.checkNotNullParameter(object17, (String)object2);
                Intrinsics.checkNotNullParameter(object3, (String)objectArray);
                Intrinsics.checkNotNullParameter(object13, (String)object6);
                object10 = hv3_0.K(R$string.sorry_msg_search_suggestion);
                object2 = ((kg3_1)object9).e;
                object2.setText((CharSequence)object10);
                object10 = StringCompanionObject.INSTANCE;
                int n21 = 1;
                object6 = new Object[n21];
                objectArray = null;
                object6[0] = object11;
                object8 = xh2_0.a((Object[])object6, n21, (String)object8, (String)object7);
                ((kg3_1)object9).g.setText((CharSequence)object8);
                object10 = z40_0.Companion;
                object8 = AJIOApplication.Companion;
                object10 = Q.a((AJIOApplication$a)object8, (z40$a)object10).a;
                n21 = (int)(((ao0_0)object10).a((String)object4) ? 1 : 0);
                object4 = ((kg3_1)object9).f;
                if (n21 == 0 || object11 == null || (n21 = ((String)object11).length()) == 0) break block59;
                n21 = 8;
                object4.setVisibility(n21);
                object10 = ((kg3_1)object9).d;
                object8 = ((yw2_0)object10).D;
                object7 = new jg3_1((kg3_1)object9);
                object6 = ((kg3_1)object9).c;
                ((LiveData)object8).e((mu1_1)object6, (F62)object7);
                if (object12 != null && (n8 = ((String)object12).length()) != 0) {
                    if (object5 == null || (n8 = ((String)object5).length()) == 0) {
                        n8 = 1;
                        object5 = od3_2.a();
                        n10 = Intrinsics.areEqual(object12, object5);
                    } else {
                        n10 = Intrinsics.areEqual(object12, object5);
                        n8 = 1;
                    }
                    if ((n10 ^= n8) != 0) {
                        object4.setVisibility(0);
                        object5 = hv3_0.r(R$drawable.luxe_search_no_result_bg);
                        ((kg3_1)object9).h.setBackground((Drawable)object5);
                        object5 = ((kg3_1)object9).a.getContext();
                        n8 = R$color.luxe_color_FFFFFF;
                        n10 = t70.getColor((Context)object5, n8);
                        object2.setTextColor(n10);
                        ((pv2_1)object3).invoke(object, object12);
                        object = ((kg3_1)object9).i;
                        ((yw2_0)object10).d((ImageView)object, (String)object12);
                        object5 = object;
                        object8 = object17;
                        object17 = object13;
                        object13 = object12;
                        object12 = object3;
                        object10 = string2;
                        object2 = object9;
                        object9 = object8;
                        object = new ig3_0((GR0)object17, (String)object13, (pv2_1)object3, (String)object11, string2, (kg3_1)object2, (ov2_2)object8);
                        object4.setOnClickListener((View.OnClickListener)object);
                    }
                }
                break block52;
            }
            n4 = 8;
            object4.setVisibility(n4);
        }
        if ((object3 = vv2_22.J) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionContainer");
            n4 = 0;
            object3 = null;
        }
        n7 = 0;
        object = null;
        object3.setVisibility(0);
        object3 = vv2_22.I;
        if (object3 == null) {
            object3 = "searchInfoContainer";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n4 = 8;
            n3 = 0;
            object2 = null;
        } else {
            object2 = object3;
            n4 = 8;
        }
        object2.setVisibility(n4);
    }

    public final void h3() {
        this.Wa();
        bv2_0.Companion.getClass();
        bv2_0.b2 = false;
        NewCustomEventsRevamp newCustomEventsRevamp = this.z0;
        String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
        String string3 = av_0.a(AnalyticsManager.Companion);
        String string4 = this.A0;
        String string5 = this.B0;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "upload image icon interactions", "Select from gallery", "event_upload_image_icon_interactions", string3, "home landing screen", string4, null, string5, false, null, 1536, null);
    }

    public final void h7(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        kj0_1 kj0_12 = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        kj0_12.o(fragmentActivity, intent, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void hb(boolean bl2) {
        int n3;
        int n4;
        vv2_2 vv2_22 = this;
        Object object = this.U;
        int n7 = 1;
        String string2 = null;
        if (object == null || (n4 = ((String)(object = ((Object)StringsKt.m0((CharSequence)object)).toString())).length()) == 0) {
            n4 = 0;
            object = null;
        } else {
            n4 = 1;
        }
        Object object2 = null;
        if (n4 == 0) {
            object = vv2_22.t0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionAdapter");
                n4 = 0;
                object = null;
            }
            ((lv2_0)object).b.clear();
            object = vv2_22.A;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchList");
                n4 = 0;
                object = null;
            }
            n7 = 8;
            object.setVisibility(n7);
            object = vv2_22.x;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHistoryLayout");
                n4 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = vv2_22.H;
            String string3 = "searchETVRefresh";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n4 = 0;
                object = null;
            }
            object = object.getText();
            string2 = "getText(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            n4 = object.length();
            if (n4 <= 0) return;
            object = vv2_22.H;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object2 = object;
            }
            object = object2.getText();
            object.clear();
            return;
        }
        bv2_0.Companion.getClass();
        bv2_0.Z1 = object = "search";
        bv2_0.a2 = kv2_0.PLP_SEARCH;
        Object object3 = vv2_22.t;
        if (object3 == null) {
            object3 = "searchViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object2 = object3;
        }
        String string4 = vv2_22.U;
        int n8 = this.Va();
        object2.getClass();
        Object object4 = "currentQueryString";
        Intrinsics.checkNotNullParameter(string4, (String)object4);
        Object object5 = ((yw2_0)object2).t;
        Object object6 = "ajio";
        Object object7 = ((yw2_0)object2).a;
        if (object5 != null && (n3 = ((String)object5).length()) != 0) {
            object = ((yw2_0)object2).s;
            object7.getClass();
            Intrinsics.checkNotNullParameter(string4, (String)object4);
            Bundle bundle = new Bundle();
            if (object != null) {
                object6 = object;
            }
            bundle.putString("store_type", (String)object6);
            String string5 = od3_2.a();
            bundle.putString("contains_store", string5);
            bundle.putString("searchTerm", string4);
            object3 = ((dw2_0)object7).g;
            object4 = ((NewCustomEventsRevamp)object3).getEC_FLEEK_BLP_SEARCH_INTERACTIONS();
            object = ((NewCustomEventsRevamp)object3).getSV_EP_FLICK_BPL_SEARCH();
            n7 = 0;
            string5 = null;
            object6 = "";
            String string6 = "blp screen";
            String string7 = "blp screen";
            String string8 = ((dw2_0)object7).h;
            String string9 = ((dw2_0)object7).i;
            int n10 = 1536;
            object5 = string4;
            object7 = object;
            string4 = null;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, (String)object5, (String)object6, (String)object, string6, string7, string8, bundle, string9, false, null, n10, null);
        } else {
            int n14;
            block23: {
                object2 = ((yw2_0)object2).s;
                object7.getClass();
                Intrinsics.checkNotNullParameter(string4, (String)object4);
                object4 = new Bundle();
                object4.putInt("dimensionId", n7);
                object5 = "SearchTerm";
                object4.putString((String)object5, string4);
                if (object2 != null) {
                    object6 = object2;
                }
                object4.putString("StoreId", (String)object6);
                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object5 = new AnalyticsData$Builder();
                object4 = ((AnalyticsData$Builder)object5).bundle((Bundle)object4).build();
                object5 = "";
                object6 = "Search Screen";
                ((GTMEvents)object2).pushSearchDiscoveryEvent((String)object, (String)object5, (String)object6, (AnalyticsData)object4);
                Bundle bundle = new Bundle();
                object = "search_term";
                bundle.putString((String)object, string4);
                object2 = "valid_search";
                n14 = 4;
                bundle.putInt((String)object2, n14);
                if (n8 != 0 && (object2 = SV2.a) != null && (n8 = object2.isEmpty()) == 0 && (n8 = SV2.b) != 0) {
                    object2 = (String)((Vector)object2).lastElement();
                    object3 = "search_retained_term";
                    bundle.putString((String)object3, (String)object2);
                }
                object3 = ((dw2_0)object7).g;
                object4 = ((NewCustomEventsRevamp)object3).getEC_SEARCH_INTERACTIONS();
                Object object8 = ((dw2_0)object7).h;
                object7 = ((dw2_0)object7).i;
                int n15 = 1536;
                object6 = string4;
                Object object9 = object7;
                object7 = "custom_search";
                String string10 = "search screen";
                String string11 = "search screen";
                String string12 = object8;
                object8 = object9;
                object9 = string4;
                string4 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, "custom search", (String)object6, (String)object7, string10, string11, string12, bundle, (String)object8, false, null, n15, null);
                object2 = new Bundle();
                n8 = ((String)object6).length() - n7;
                n14 = 0;
                object4 = null;
                n3 = 0;
                object5 = null;
                while (n14 <= n8) {
                    int n16 = n3 == 0 ? n14 : n8;
                    object6 = object9;
                    n16 = ((String)object9).charAt(n16);
                    int n17 = 32;
                    if ((n16 = Intrinsics.compare(n16, n17)) <= 0) {
                        n16 = 1;
                    } else {
                        n16 = 0;
                        object7 = null;
                    }
                    if (n3 == 0) {
                        if (n16 == 0) {
                            object9 = object6;
                            n3 = 1;
                            continue;
                        }
                        ++n14;
                    } else {
                        if (n16 == 0) break block23;
                        n8 += -1;
                    }
                    object9 = object6;
                }
                object6 = object9;
            }
            String string13 = com.jio.jioads.adinterfaces.a.a(n8, n7, n14, (String)object6);
            object2.putString((String)object, string13);
            object = FirebaseEvents.Companion.getInstance();
            string13 = GAUtils.Companion.getGAViewItemSearchResults();
            ((FirebaseEvents)object).sendEvent(string13, (Bundle)object2);
        }
        object = vv2_22.U;
        n7 = (int)(bl2 ? 1 : 0);
        vv2_22.Ta((String)object, bl2);
    }

    public final void hideProgress() {
        j3_0 j3_02 = this.n;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.stopLoader();
    }

    public final void m(String string2) {
    }

    public final void n3(SuggestionSearchModel suggestionSearchModel, int n3) {
        AnalyticsData analyticsData;
        int n4;
        vv2_2 vv2_22 = this;
        Object object = suggestionSearchModel;
        Intrinsics.checkNotNullParameter(suggestionSearchModel, "suggestionSearchModel");
        Object object2 = this.t;
        Object object3 = null;
        Object object4 = "searchViewModel";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n4 = 0;
            object2 = null;
        }
        String string2 = null;
        ((yw2_0)object2).B = false;
        bv2_0.Companion.getClass();
        bv2_0.b2 = false;
        vv2_22.v = object2 = Integer.valueOf(n3);
        n4 = 2;
        int n7 = n3;
        vv2_22.Ua(n3, (SuggestionSearchModel)object, n4);
        object2 = vv2_22.t;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object2;
        }
        String string3 = suggestionSearchModel.getText();
        object2 = "getText(...)";
        Intrinsics.checkNotNullExpressionValue(string3, (String)object2);
        object4 = String.valueOf(vv2_22.s0.size());
        object3.getClass();
        Intrinsics.checkNotNullParameter(string3, "text");
        Intrinsics.checkNotNullParameter(object4, "count");
        string2 = "filled_char";
        object3 = px1_2.b("no_of_suggestion", (String)object4, string2, string3);
        object4 = h40_0.a;
        boolean bl2 = h40_0.e2();
        if (bl2 && (object4 = SV2.a) != null && (n7 = (int)(object4.isEmpty() ? 1 : 0)) == 0 && (n7 = (int)(SV2.b ? 1 : 0)) != 0) {
            object4 = (String)((Vector)object4).lastElement();
            string2 = "search_retained_term";
            object3.putString(string2, (String)object4);
        }
        object3.putString("auto_suggestion_term", string3);
        Object object5 = analyticsData;
        analyticsData = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, (Bundle)object3, null, null, null, null, null, null, 65023, null);
        object3 = AnalyticsManager.Companion;
        object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
        object5 = av_0.a((AnalyticsManager$Companion)object3);
        ((GTMEvents)object4).pushAutoSuggestionClickEvents("search_auto_suggestion_history_click", "search interactions", "auto suggestion history click", string3, (String)object5, analyticsData);
        object = suggestionSearchModel.getText();
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        vv2_22.Za((String)object);
    }

    public final void n7(SuggestionSearchModel suggestionSearchModel) {
        vv2_2 vv2_22 = this;
        Object object = suggestionSearchModel;
        Intrinsics.checkNotNullParameter(suggestionSearchModel, "suggestionSearchModel");
        Object object2 = this.t;
        String string2 = "searchViewModel";
        yw2_0 yw2_02 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object2 = null;
        }
        int n3 = 0;
        ((yw2_0)object2).B = false;
        bv2_0.Companion.getClass();
        bv2_0.b2 = false;
        object2 = vv2_22.H;
        Object object3 = "searchETVRefresh";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        String string3 = suggestionSearchModel.getText().toString();
        object2.setText((CharSequence)string3);
        object2 = vv2_22.H;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        object3 = suggestionSearchModel.getText();
        n3 = ((String)object3).length();
        object2.setSelection(n3);
        object2 = vv2_22.t;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            yw2_02 = object2;
        }
        String string4 = suggestionSearchModel.getText().toString();
        object2 = String.valueOf(vv2_22.s0.size());
        yw2_02.getClass();
        Intrinsics.checkNotNullParameter(string4, "text");
        Intrinsics.checkNotNullParameter(object2, "count");
        Bundle bundle = px1_2.b("no_of_suggestion", (String)object2, "filled_char", string4);
        Object object4 = object2;
        object2 = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, bundle, null, null, null, null, null, null, 65023, null);
        object = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        object4 = av_0.a((AnalyticsManager$Companion)object);
        ((GTMEvents)object3).pushAutoSuggestionClickEvents("search_auto_fill_icon_click", "search interactions", "auto fill icon click", string4, (String)object4, (AnalyticsData)object2);
    }

    public final void na(String string2) {
        String string3 = string2;
        String string4 = "searchHistory";
        Intrinsics.checkNotNullParameter(string2, string4);
        Bundle bundle = new Bundle();
        bundle.putString("search_term", string2);
        Object object = this.z0;
        String string5 = ((NewCustomEventsRevamp)object).getEC_SEARCH_INTERACTIONS();
        Object object2 = "clear history search";
        String string6 = "search_history_clear";
        String string7 = "search screen";
        String string8 = "search screen";
        String string9 = this.A0;
        String string10 = this.B0;
        int n3 = 1536;
        Object object3 = string2;
        String string11 = string4;
        string4 = null;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string5, (String)object2, string2, string6, string7, string8, string9, bundle, string10, false, null, n3, null);
        object = this.t;
        string5 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
            object = null;
        }
        object.getClass();
        object2 = string11;
        Intrinsics.checkNotNullParameter(string3, string11);
        object2 = md3_0.c((jD3)object);
        object3 = new sw2_0(null, (yw2_0)object, string3);
        Ae3.d((i90_0)object2, null, null, (Function2)object3, 3);
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.t;
        Object object2 = "searchViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).e;
        Object object3 = this.getViewLifecycleOwner();
        Object object4 = this.P0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).c;
        object3 = this.getViewLifecycleOwner();
        object4 = this.Q0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).d;
        object3 = this.getViewLifecycleOwner();
        object4 = this.S0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).f;
        object3 = this.getViewLifecycleOwner();
        object4 = this.W0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).p;
        object3 = this.getViewLifecycleOwner();
        object4 = this.X0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).g;
        object3 = this.getViewLifecycleOwner();
        object4 = this.R0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).m;
        object3 = this.getViewLifecycleOwner();
        object4 = this.T0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).r;
        object3 = this.getViewLifecycleOwner();
        object4 = this.V0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).C;
        object3 = this.getViewLifecycleOwner();
        object4 = this.U0;
        ((LiveData)object).e((mu1_1)object3, (F62)object4);
        object = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object, "getViewLifecycleOwner(...)");
        object = nu1_0.a((mu1_1)object);
        object3 = new wv2_2(this, null);
        ((iu1_0)object).c((Function2)object3);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).E;
        object3 = this.getViewLifecycleOwner();
        object4 = new ZU2(this);
        vV2$e vV2$e = new vV2$e((Function1)object4);
        ((LiveData)object).e((mu1_1)object3, vV2$e);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).F;
        object3 = this.getViewLifecycleOwner();
        int n3 = 3;
        object4 = new ht_1(this, n3);
        vV2$e = new vV2$e((Function1)object4);
        ((LiveData)object).e((mu1_1)object3, vV2$e);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).G;
        object3 = this.getViewLifecycleOwner();
        n3 = 1;
        object4 = new if2_2(this, n3);
        vV2$e = new vV2$e((Function1)object4);
        ((LiveData)object).e((mu1_1)object3, vV2$e);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((yw2_0)object).H;
        object3 = this.getViewLifecycleOwner();
        n3 = 1;
        object4 = new br0_1(this, n3);
        vV2$e = new vV2$e((Function1)object4);
        ((LiveData)object).e((mu1_1)object3, vV2$e);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object.getClass();
        object2 = md3_0.c((jD3)object);
        object3 = new dw2_2((yw2_0)object, null);
        Ae3.d((i90_0)object2, null, null, (Function2)object3, 3);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof hc1_2;
        if (bl2) {
            object2 = object;
        } else {
            bl2 = false;
            object2 = null;
        }
        this.o = object2 = (hc1_2)object2;
        bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.n = object2 = (j3_0)object;
            bl2 = object instanceof fo3;
            if (bl2) {
                object2 = object;
                this.p = object2 = (fo3)object;
                bl2 = object instanceof vh3_2;
                if (bl2) {
                    object2 = object;
                    this.q = object2 = (vh3_2)object;
                    bl2 = object instanceof ea2_1;
                    if (bl2) {
                        object = (ea2_1)object;
                        this.r = object;
                        return;
                    }
                    object = pn_2.b(object, " must implement ProductDetailListener");
                    object2 = new ClassCastException((String)object);
                    throw object2;
                }
                object = pn_2.b(object, " must implement TabListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement ToolbarListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        super.onCreate((Bundle)object);
        this.setHasOptionsMenu(true);
        this.w0 = bl2 = og1_1.d();
        object = od3_2.a();
        this.x0 = object;
        object = kd3_2.a();
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        Object object6 = "store";
        Intrinsics.checkNotNullParameter(object3, (String)object6);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object4, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object7 = yw2_0.class;
        String string4 = "modelClass";
        object3 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object5, object7, string4);
        object4 = "<this>";
        object5 = sw0_0.a(object7, (String)object4, object7, string4, string4);
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object7 = object5.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string6.concat((String)object7);
            this.t = object3 = (yw2_0)((pD3)object3).a((yn1_2)object5, (String)object7);
            object3 = n9_0.a;
            object5 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object3;
            ((kd3_2)object).b = object5;
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object, string2);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object2 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, (String)object6);
            Intrinsics.checkNotNullParameter(object, string2);
            Intrinsics.checkNotNullParameter(object2, string3);
            object5 = x9_0.class;
            object = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)object2, object5, string4);
            object2 = sw0_0.a(object5, (String)object4, object5, string4, string4);
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object3 = string6.concat((String)object3);
                this.u = object = (x9_0)((pD3)object).a((yn1_2)object2, (String)object3);
                object = this.getArguments();
                if (object != null) {
                    int n3;
                    object2 = this.t;
                    object3 = null;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                        object2 = null;
                    }
                    object2.getClass();
                    object4 = "STORE_ID";
                    boolean bl3 = object.containsKey((String)object4);
                    if (bl3 && !(bl3 = og1_1.c())) {
                        ((yw2_0)object2).s = object4 = object.getString((String)object4, null);
                        if (object4 != null) {
                            bl3 = false;
                            object5 = null;
                            object6 = "luxe";
                            n3 = kotlin.text.b.i((String)object4, (String)object6, false);
                            if (n3 == 0 && (object4 = ((yw2_0)object2).s) != null) {
                                object5 = (StoreMetaData)g62_0.c.b.get(object4);
                                if (object5 == null) {
                                    object5 = md3_0.c((jD3)object2);
                                    object6 = new aw2_1(null, (yw2_0)object2, (String)object4);
                                    n3 = 3;
                                    Ae3.d((i90_0)object5, null, null, (Function2)object6, n3);
                                } else {
                                    object4 = ((yw2_0)object2).e;
                                    object6 = DataCallback.Companion;
                                    object5 = ((DataCallback$Companion)object6).onSuccess(object5);
                                    ((LiveData)object4).k(object5);
                                }
                            }
                        }
                    }
                    if (bl3 = object.containsKey((String)(object4 = "brand_id"))) {
                        ((yw2_0)object2).t = object4 = object.getString((String)object4, null);
                    }
                    if (bl3 = object.containsKey((String)(object4 = "brand_name"))) {
                        ((yw2_0)object2).u = object3 = object.getString((String)object4, null);
                    }
                    if ((n3 = object.containsKey((String)(object3 = "STORE_THEME"))) != 0) {
                        object4 = ld3_2.STORE_AJIO.getStoreId();
                        ((yw2_0)object2).w = object = object.getString((String)object3, (String)object4);
                    }
                }
                this.fb();
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.F0 = false;
        this.fb();
        Object object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n3 = 0;
            object = null;
        }
        if ((object = object.W0()) != null) {
            int n4 = 8;
            object.setVisibility(n4);
        }
        og1_1.g(this.w0, false);
        object = this.x0;
        Intrinsics.checkNotNullParameter(object, "storeName");
        od3_2.a = object;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        jo_22.E((String)object);
        n3 = og1_1.c();
        if (n3 != 0) {
            n3 = R$layout.fragment_search_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.fragment_search_refresh;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDestroy() {
        super.onDestroy();
        boolean bl2 = this.Va();
        if (bl2) {
            boolean bl3;
            Stack stack = SV2.a;
            stack = SV2.a;
            if (stack != null && !(bl3 = stack.isEmpty()) && (bl3 = this.k)) {
                stack.pop();
                bl2 = false;
                stack = null;
                this.k = false;
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.y0.d();
        this.hideProgress();
    }

    public final void onResume() {
        Object object;
        int n3;
        super.onResume();
        Object object2 = this.t;
        String string2 = "searchViewModel";
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        object2 = ((yw2_0)object2).w;
        this.Oa((String)object2);
        object2 = this.getActivity();
        if (object2 != null) {
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            object = ((yw2_0)object).w;
            tm3_0.e((FragmentActivity)object2, (String)object);
        }
        if ((object2 = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        object2.getClass();
        object = md3_0.c((jD3)object2);
        cw2_1 cw2_12 = new cw2_1((yw2_0)object2, null);
        n3 = 3;
        Ae3.d((i90_0)object, null, null, cw2_12, n3);
        object2 = this.t;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        object2 = ((yw2_0)object2).u;
        object = "screen_type";
        if (object2 != null && (n3 = ((String)object2).length()) > 0) {
            object2 = "brand search screen";
            string2 = E1.a((String)object, (String)object2);
            object3 = AnalyticsManager.Companion;
            vb0_0.a((AnalyticsManager$Companion)object3, (String)object2, (Bundle)string2);
        } else {
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            n3 = (int)(((yw2_0)object3).b() ? 1 : 0);
            if (n3 != 0) {
                object2 = "elastic search screen";
                string2 = E1.a((String)object, (String)object2);
                object3 = AnalyticsManager.Companion;
                vb0_0.a((AnalyticsManager$Companion)object3, (String)object2, (Bundle)string2);
            } else {
                object2 = AnalyticsManager.Companion;
                string2 = "search screen";
                km_1.a((AnalyticsManager$Companion)object2, string2);
            }
        }
        Bundle bundle = new Bundle();
        object2 = this.z0.getSV_ZERO_SEARCH_TERM();
        bundle.putString((String)object2, "");
        object2 = AnalyticsManager.Companion;
        String string3 = bv_0.a((AnalyticsManager$Companion)object2);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        this.z0.newPushCustomScreenView("search screen", "search screen", string3, bundle, string4);
    }

    public final void onStart() {
        super.onStart();
        Object object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            object = null;
        }
        if ((object = object.W0()) != null) {
            int n3 = 8;
            object.setVisibility(n3);
        }
    }

    public final void onStop() {
        String string2;
        Object object;
        Object object2;
        int n3;
        super.onStop();
        boolean bl2 = this.Z;
        if (bl2 && (n3 = ((ArrayList)(object2 = this.r0)).size()) > 0) {
            object2 = ((ArrayList)object2).iterator();
            while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object = (KV2)object2.next();
                string2 = ((KV2)object).a;
                Intrinsics.checkNotNullParameter(string2, "priceValue");
                object = ((KV2)object).b;
                Object object3 = "productCode";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Object object4 = this.t;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                    object4 = null;
                }
                object4.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = md3_0.c((jD3)object4);
                object4 = new gw2_1(string2, (String)object, null);
                n3 = 3;
                Ae3.d((i90_0)object3, null, null, (Function2)object4, n3);
            }
        }
        object2 = new Message();
        ((Message)object2).what = n3 = 1004;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage((Message)object2);
        object2 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        object = "search screen";
        ((NewEEcommerceEventsRevamp)object2).setPreviousScreenData((String)object, (String)object);
        object2 = this.getActivity();
        if (object2 != null) {
            object = object2.getSystemService("input_method");
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            object = (InputMethodManager)object;
            string2 = object2.getCurrentFocus();
            if (string2 == null) {
                string2 = new View((Context)object2);
            }
            object2 = string2.getWindowToken();
            string2 = null;
            object.hideSoftInputFromWindow((IBinder)object2, 0);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block126: {
            block137: {
                block133: {
                    block134: {
                        block136: {
                            block135: {
                                block123: {
                                    block131: {
                                        block132: {
                                            block130: {
                                                block128: {
                                                    block129: {
                                                        block127: {
                                                            block125: {
                                                                block124: {
                                                                    var3_3 = this;
                                                                    var4_4 = var1_1;
                                                                    var5_5 = 4;
                                                                    var6_6 = 5.6E-45f;
                                                                    var7_7 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                    var9_9 = 2;
                                                                    var10_10 = 1;
                                                                    Intrinsics.checkNotNullParameter(var1_1, "view");
                                                                    super.onViewCreated(var1_1, var2_2);
                                                                    var11_11 /* !! */  = this.p;
                                                                    if (var11_11 /* !! */  == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
                                                                        var12_12 = 0;
                                                                        var11_11 /* !! */  = null;
                                                                    }
                                                                    var11_11 /* !! */ .hideToolbarLayout();
                                                                    var11_11 /* !! */  = var3_3.q;
                                                                    if (var11_11 /* !! */  == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("tabListener");
                                                                        var12_12 = 0;
                                                                        var11_11 /* !! */  = null;
                                                                    }
                                                                    var11_11 /* !! */ .t();
                                                                    var12_12 = R$id.searchList;
                                                                    var3_3.A = var11_11 /* !! */  = (RecyclerView)var4_4.findViewById(var12_12);
                                                                    var12_12 = R$id.search_history_categories_layout;
                                                                    var11_11 /* !! */  = (LinearLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.x = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.recent_history_container;
                                                                    var11_11 /* !! */  = (LinearLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.h = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.recent_option;
                                                                    var11_11 /* !! */  = (TextView)var4_4.findViewById(var12_12);
                                                                    var3_3.G = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.rv_search_history;
                                                                    var3_3.B = var11_11 /* !! */  = (RecyclerView)var4_4.findViewById(var12_12);
                                                                    var12_12 = R$id.rv_search_trending_categories;
                                                                    var11_11 /* !! */  = (RecyclerView)var4_4.findViewById(var12_12);
                                                                    var12_12 = R$id.rv_trending_categories_new;
                                                                    var3_3.C = var11_11 /* !! */  = (RecyclerView)var4_4.findViewById(var12_12);
                                                                    var12_12 = R$id.trending_categories_parent;
                                                                    var11_11 /* !! */  = (LinearLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.y = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.tv_trending_categories;
                                                                    var11_11 /* !! */  = (TextView)var4_4.findViewById(var12_12);
                                                                    var3_3.z = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.search_container;
                                                                    var11_11 /* !! */  = var4_4.findViewById(var12_12);
                                                                    var3_3.K = var11_11 /* !! */ ;
                                                                    if (var11_11 /* !! */  == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("searchContainer");
                                                                        var12_12 = 0;
                                                                        var11_11 /* !! */  = null;
                                                                    }
                                                                    var13_13 = R$string.acc_page_header_search_products;
                                                                    var14_14 = hv3_0.K(var13_13);
                                                                    var11_11 /* !! */ .setContentDescription((CharSequence)var14_14);
                                                                    var14_14 = Looper.getMainLooper();
                                                                    var11_11 /* !! */  = new Handler((Looper)var14_14);
                                                                    var14_14 = new co0_2(var3_3, var10_10);
                                                                    var15_15 = 300L;
                                                                    var11_11 /* !! */ .postDelayed((Runnable)var14_14, var15_15);
                                                                    var12_12 = R$id.searchEditContainer;
                                                                    var11_11 /* !! */  = var4_4.findViewById(var12_12);
                                                                    var3_3.M = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.layout_click_photo;
                                                                    var11_11 /* !! */  = (LinearLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.P = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.layout_select_photo;
                                                                    var11_11 /* !! */  = (LinearLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.Q = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.searchInfoContainer;
                                                                    var11_11 /* !! */  = (ConstraintLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.I = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.searchSuggestionContainer;
                                                                    var11_11 /* !! */  = var4_4.findViewById(var12_12);
                                                                    var3_3.J = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.search_history_categories_scroll;
                                                                    var11_11 /* !! */  = (NestedScrollView)var4_4.findViewById(var12_12);
                                                                    var3_3.E0 = var11_11 /* !! */ ;
                                                                    var11_11 /* !! */  = var3_3.I;
                                                                    var14_14 = "searchInfoContainer";
                                                                    if (var11_11 /* !! */  == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                                                                        var12_12 = 0;
                                                                        var11_11 /* !! */  = null;
                                                                    }
                                                                    var11_11 /* !! */ .setVisibility(0);
                                                                    var11_11 /* !! */  = var3_3.J;
                                                                    if (var11_11 /* !! */  == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionContainer");
                                                                        var12_12 = 0;
                                                                        var11_11 /* !! */  = null;
                                                                    }
                                                                    var17_16 = 8;
                                                                    var11_11 /* !! */ .setVisibility(var17_16);
                                                                    var12_12 = R$id.searchShimmerParent;
                                                                    var11_11 /* !! */  = (ShimmerFrameLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.E = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.searchCmsShimmerParent;
                                                                    var11_11 /* !! */  = (FrameLayout)var4_4.findViewById(var12_12);
                                                                    var3_3.F = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.recent_search_tv;
                                                                    var11_11 /* !! */  = (TextView)var4_4.findViewById(var12_12);
                                                                    var3_3.D = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.cancel_img;
                                                                    var11_11 /* !! */  = (ImageView)var4_4.findViewById(var12_12);
                                                                    var3_3.L = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.searchETV;
                                                                    var11_11 /* !! */  = (EditText)var4_4.findViewById(var12_12);
                                                                    var3_3.H = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.search_image;
                                                                    var11_11 /* !! */  = (ImageView)var4_4.findViewById(var12_12);
                                                                    var3_3.S = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.clear_button;
                                                                    var11_11 /* !! */  = (ImageView)var4_4.findViewById(var12_12);
                                                                    var3_3.T = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.iv_camera;
                                                                    var11_11 /* !! */  = (ImageView)var4_4.findViewById(var12_12);
                                                                    var3_3.N = var11_11 /* !! */ ;
                                                                    var12_12 = R$id.imageSearchContainer;
                                                                    var11_11 /* !! */  = var4_4.findViewById(var12_12);
                                                                    var3_3.O = var11_11 /* !! */ ;
                                                                    var11_11 /* !! */  = "<u>";
                                                                    var18_17 = var3_3.w0;
                                                                    var19_18 = var3_3.t;
                                                                    var20_19 = "searchViewModel";
                                                                    if (var19_18 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                        var21_20 = 0;
                                                                        var19_18 = null;
                                                                    }
                                                                    var19_18 = var19_18.t;
                                                                    if (var18_17 == 0 && (var22_21 = KU2.d) != null && (var18_17 = var22_21.intValue()) == var10_10 && (var19_18 == null || (var18_17 = var19_18.length()) == 0) || (var18_17 = var3_3.w0) != 0 && (var22_21 = KU2.c) != null && (var18_17 = var22_21.intValue()) == var10_10) {
                                                                        block122: {
                                                                            var18_17 = (int)og1_1.c();
                                                                            var19_18 = "Edit";
                                                                            if (var18_17 != 0) {
                                                                                try {
                                                                                    var22_21 = var3_3.G;
                                                                                    if (var22_21 == null) break block122;
                                                                                }
                                                                                catch (Throwable v0) {
                                                                                    var11_11 /* !! */  = var3_3.G;
                                                                                    if (var11_11 /* !! */  != null) {
                                                                                        var11_11 /* !! */ .setText((CharSequence)var19_18);
                                                                                    }
                                                                                    break block122;
                                                                                }
                                                                                var23_22 /* !! */  = Locale.getDefault();
                                                                                var24_23 = "getDefault(...)";
                                                                                Intrinsics.checkNotNullExpressionValue(var23_22 /* !! */ , (String)var24_23);
                                                                                var23_22 /* !! */  = var19_18.toUpperCase((Locale)var23_22 /* !! */ );
                                                                                var24_23 = "toUpperCase(...)";
                                                                                Intrinsics.checkNotNullExpressionValue(var23_22 /* !! */ , (String)var24_23);
                                                                                var24_23 = new StringBuilder((String)var11_11 /* !! */ );
                                                                                var24_23.append((String)var23_22 /* !! */ );
                                                                                var11_11 /* !! */  = "</u>";
                                                                                var24_23.append((String)var11_11 /* !! */ );
                                                                                var11_11 /* !! */  = var24_23.toString();
                                                                                var11_11 /* !! */  = hv3_0.f((String)var11_11 /* !! */ );
                                                                                var22_21.setText((CharSequence)var11_11 /* !! */ );
                                                                            }
                                                                            var11_11 /* !! */  = var3_3.G;
                                                                            if (var11_11 /* !! */  != null) {
                                                                                var11_11 /* !! */ .setText((CharSequence)var19_18);
                                                                            }
                                                                        }
                                                                        if ((var11_11 /* !! */  = var3_3.G) != null) {
                                                                            var22_21 = new eV(var3_3, var5_5);
                                                                            var11_11 /* !! */ .setOnClickListener((View.OnClickListener)var22_21);
                                                                        }
                                                                    }
                                                                    if ((var11_11 /* !! */  = var3_3.t) == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                        var12_12 = 0;
                                                                        var11_11 /* !! */  = null;
                                                                    }
                                                                    var12_12 = (int)var11_11 /* !! */ .b();
                                                                    var22_21 = "searchETVRefresh";
                                                                    if (var12_12 == 0) ** GOTO lbl-1000
                                                                    var11_11 /* !! */  = var3_3.t;
                                                                    if (var11_11 /* !! */  == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                        var12_12 = 0;
                                                                        var11_11 /* !! */  = null;
                                                                    }
                                                                    if ((var11_11 /* !! */  = var11_11 /* !! */ .u) != null && (var12_12 = var11_11 /* !! */ .length()) > 0) {
                                                                        var11_11 /* !! */  = var3_3.H;
                                                                        if (var11_11 /* !! */  == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                            var12_12 = 0;
                                                                            var11_11 /* !! */  = null;
                                                                        }
                                                                        if ((var19_18 = var3_3.t) == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                            var21_20 = 0;
                                                                            var19_18 = null;
                                                                        }
                                                                        var19_18 = var19_18.u;
                                                                        var24_23 = "Search in ";
                                                                        var23_22 /* !! */  = new StringBuilder((String)var24_23);
                                                                        var23_22 /* !! */ .append((String)var19_18);
                                                                        var19_18 = var23_22 /* !! */ .toString();
                                                                        var11_11 /* !! */ .setHint((CharSequence)var19_18);
                                                                    } else lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        if ((var11_11 /* !! */  = var3_3.t) == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                            var12_12 = 0;
                                                                            var11_11 /* !! */  = null;
                                                                        }
                                                                        if ((var11_11 /* !! */  = var11_11 /* !! */ .s) == null) {
                                                                            var12_12 = R$string.search_by_product;
                                                                            var11_11 /* !! */  = hv3_0.K(var12_12);
                                                                            var19_18 = var3_3.H;
                                                                            if (var19_18 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                                var21_20 = 0;
                                                                                var19_18 = null;
                                                                            }
                                                                            var19_18.setHint((CharSequence)var11_11 /* !! */ );
                                                                        } else {
                                                                            var11_11 /* !! */  = var3_3.t;
                                                                            if (var11_11 /* !! */  == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                                var12_12 = 0;
                                                                                var11_11 /* !! */  = null;
                                                                            }
                                                                            if ((var11_11 /* !! */  = var11_11 /* !! */ .v) != null) {
                                                                                var11_11 /* !! */  = var3_3.H;
                                                                                if (var11_11 /* !! */  == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                                    var12_12 = 0;
                                                                                    var11_11 /* !! */  = null;
                                                                                }
                                                                                var19_18 = StringCompanionObject.INSTANCE;
                                                                                var21_20 = R$string.search_store;
                                                                                var19_18 = var3_3.getString(var21_20);
                                                                                Intrinsics.checkNotNullExpressionValue(var19_18, "getString(...)");
                                                                                var23_22 /* !! */  = var3_3.t;
                                                                                if (var23_22 /* !! */  == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                                    var25_24 = 0;
                                                                                    var26_25 = 0.0f;
                                                                                    var23_22 /* !! */  = null;
                                                                                }
                                                                                if ((var23_22 /* !! */  = var23_22 /* !! */ .v) != null) {
                                                                                    var23_22 /* !! */  = var23_22 /* !! */ .storeTitle;
                                                                                } else {
                                                                                    var25_24 = 0;
                                                                                    var26_25 = 0.0f;
                                                                                    var23_22 /* !! */  = null;
                                                                                }
                                                                                var24_23 = new Object[var10_10];
                                                                                var24_23[0] = var23_22 /* !! */ ;
                                                                                var23_22 /* !! */  = Arrays.copyOf(var24_23, var10_10);
                                                                                var19_18 = String.format((String)var19_18, (Object[])var23_22 /* !! */ );
                                                                                var23_22 /* !! */  = "format(...)";
                                                                                Intrinsics.checkNotNullExpressionValue(var19_18, (String)var23_22 /* !! */ );
                                                                                var11_11 /* !! */ .setHint((CharSequence)var19_18);
                                                                            }
                                                                        }
                                                                    }
                                                                    var11_11 /* !! */  = z40_0.Companion;
                                                                    var19_18 = AJIOApplication.Companion;
                                                                    var23_22 /* !! */  = Q.a((AJIOApplication$a)var19_18, (z40$a)var11_11 /* !! */ ).a;
                                                                    var25_24 = var23_22 /* !! */ .a("autoSuggestionNewUIEnabled");
                                                                    var24_23 = "cancelImageRefresh";
                                                                    if (var25_24 != 0 && (var25_24 = og1_1.c()) == 0) {
                                                                        var23_22 /* !! */  = var3_3.L;
                                                                        if (var23_22 /* !! */  == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var24_23);
                                                                            var25_24 = 0;
                                                                            var26_25 = 0.0f;
                                                                            var23_22 /* !! */  = null;
                                                                        }
                                                                        var27_26 = R$drawable.ic_arrow_back_android;
                                                                        var23_22 /* !! */ .setImageResource(var27_26);
                                                                        var23_22 /* !! */  = new b();
                                                                        var28_28 = var3_3.I;
                                                                        if (var28_28 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                                                                            var27_26 = 0;
                                                                            var28_28 = null;
                                                                        }
                                                                        var23_22 /* !! */ .e((ConstraintLayout)var28_28);
                                                                        var27_26 = R$id.searchList;
                                                                        var29_29 = this.getResources();
                                                                        var30_30 = R$dimen.dp500;
                                                                        var6_6 = var29_29.getDimension(var30_30);
                                                                        var5_5 = (int)var6_6;
                                                                        var31_31 = var23_22 /* !! */ .j((int)var27_26).e;
                                                                        var31_31.b0 = var5_5;
                                                                        var29_29 = var3_3.I;
                                                                        if (var29_29 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                                                                            var5_5 = 0;
                                                                            var6_6 = 0.0f;
                                                                            var29_29 = null;
                                                                        }
                                                                        var23_22 /* !! */ .b((ConstraintLayout)var29_29);
                                                                        var29_29 = this.requireActivity().getWindow();
                                                                        var30_30 = 16;
                                                                        var29_29.setSoftInputMode(var30_30);
                                                                    } else {
                                                                        var5_5 = (int)og1_1.c();
                                                                        if (var5_5 == 0) {
                                                                            var29_29 = var3_3.L;
                                                                            if (var29_29 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var24_23);
                                                                                var5_5 = 0;
                                                                                var6_6 = 0.0f;
                                                                                var29_29 = null;
                                                                            }
                                                                            var30_30 = R$drawable.ic_cancel_cart_refresh;
                                                                            var29_29.setImageResource(var30_30);
                                                                            var29_29 = new b();
                                                                            var31_31 = var3_3.I;
                                                                            if (var31_31 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                                                                                var30_30 = 0;
                                                                                var31_31 = null;
                                                                            }
                                                                            var29_29.e((ConstraintLayout)var31_31);
                                                                            var30_30 = R$id.searchList;
                                                                            var23_22 /* !! */  = this.getResources();
                                                                            var27_27 = R$dimen.dp300;
                                                                            var26_25 = var23_22 /* !! */ .getDimension(var27_27);
                                                                            var29_29.j((int)var30_30).e.b0 = var25_24 = (int)var26_25;
                                                                            var31_31 = var3_3.I;
                                                                            if (var31_31 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                                                                                var30_30 = 0;
                                                                                var31_31 = null;
                                                                            }
                                                                            var29_29.b((ConstraintLayout)var31_31);
                                                                        }
                                                                    }
                                                                    var29_29 = Q.a((AJIOApplication$a)var19_18, (z40$a)var11_11 /* !! */ ).a;
                                                                    var31_31 = "clearBtnEnabled";
                                                                    var5_5 = (int)var29_29.a((String)var31_31);
                                                                    if (var5_5 != 0 && (var5_5 = (int)og1_1.c()) == 0 && (var29_29 = var3_3.T) != null) {
                                                                        var31_31 = new r22(var3_3, var10_10);
                                                                        var29_29.setOnClickListener((View.OnClickListener)var31_31);
                                                                    }
                                                                    if ((var5_5 = (int)(var29_29 = Q.a((AJIOApplication$a)var19_18, (z40$a)var11_11 /* !! */ ).a).a((String)(var31_31 = "recentSearchNewUIEnabled"))) == 0) break block124;
                                                                    var5_5 = (int)var3_3.w0;
                                                                    var14_14 = var3_3.t;
                                                                    if (var14_14 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                        var13_13 = 0;
                                                                        var14_14 = null;
                                                                    }
                                                                    var14_14 = var14_14.t;
                                                                    if (var5_5 == 0 && (var29_29 = KU2.d) != null && (var5_5 = var29_29.intValue()) == var10_10 && (var14_14 == null || (var5_5 = var14_14.length()) == 0) || (var5_5 = (int)var3_3.w0) != 0 && (var29_29 = KU2.c) != null && (var5_5 = var29_29.intValue()) == var10_10) break block125;
                                                                }
                                                                if ((var5_5 = (int)(var29_29 = Q.a((AJIOApplication$a)var19_18, (z40$a)var11_11 /* !! */ ).a).a((String)var31_31)) == 0 && (var5_5 = (int)og1_1.c()) != 0) {
                                                                    var29_29 = var3_3.h;
                                                                    if (var29_29 != null) {
                                                                        var29_29 = var29_29.getLayoutParams();
                                                                    } else {
                                                                        var5_5 = 0;
                                                                        var6_6 = 0.0f;
                                                                        var29_29 = null;
                                                                    }
                                                                    Intrinsics.checkNotNull(var29_29, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                                                    var29_29 = (LinearLayout.LayoutParams)var29_29;
                                                                    var29_29.setMarginStart(0);
                                                                    var29_29.setMarginEnd(0);
                                                                    var31_31 = var3_3.h;
                                                                    if (var31_31 != null) {
                                                                        var31_31.setLayoutParams((ViewGroup.LayoutParams)var29_29);
                                                                    }
                                                                    if ((var29_29 = var3_3.h) != null) {
                                                                        var29_29.requestLayout();
                                                                    }
                                                                    var1_1.requestLayout();
                                                                }
                                                            }
                                                            if ((var29_29 = var3_3.H) == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var29_29 = null;
                                                            }
                                                            var31_31 = new kb_0(var3_3, var9_9);
                                                            var29_29.post((Runnable)var31_31);
                                                            var29_29 = var3_3.H;
                                                            if (var29_29 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var29_29 = null;
                                                            }
                                                            var13_13 = 3;
                                                            var31_31 = new fa_0(var3_3, var13_13);
                                                            var29_29.setOnClickListener((View.OnClickListener)var31_31);
                                                            var29_29 = var3_3.H;
                                                            if (var29_29 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var29_29 = null;
                                                            }
                                                            if (var29_29 == null) break block126;
                                                            var31_31 = new pm3_0((EditText)var29_29);
                                                            var29_29 = new hv2_0(var3_3);
                                                            var14_14 = new iv2_0((hv2_0)var29_29);
                                                            var29_29 = new x62_0((pm3_0)var31_31, (iv2_0)var14_14);
                                                            var31_31 = TimeUnit.MILLISECONDS;
                                                            var14_14 = qt2_2.b;
                                                            x03_0.b(var31_31, "unit is null");
                                                            x03_0.b(var14_14, "scheduler is null");
                                                            var23_22 /* !! */  = new ObservableDebounceTimed((x62_0)var29_29, (TimeUnit)var31_31, (Scheduler)var14_14);
                                                            var29_29 = new Object();
                                                            var31_31 = new we0_2(var29_29);
                                                            var29_29 = Functions.c;
                                                            var14_14 = Functions.b;
                                                            x03_0.b(var29_29, "onNext is null");
                                                            x03_0.b(var14_14, "onComplete is null");
                                                            var32_32 = var14_14;
                                                            var28_28 = new v62_0((ObservableDebounceTimed)var23_22 /* !! */ , (Functions$c)var29_29, (we0_2)var31_31, (Functions$b)var14_14, (Functions$b)var14_14);
                                                            var31_31 = qt2_2.c;
                                                            var31_31 = var28_28.g((Scheduler)var31_31);
                                                            var23_22 /* !! */  = ti_2.a();
                                                            var31_31 = var31_31.e((HandlerScheduler)var23_22 /* !! */ );
                                                            var23_22 /* !! */  = new kv2_2(var3_3);
                                                            var28_28 = new xe0_0(var23_22 /* !! */ );
                                                            var23_22 /* !! */  = Functions.d;
                                                            x03_0.b(var23_22 /* !! */ , "onError is null");
                                                            var8_8 /* !! */  = new EditText((xe0_0)var28_28, (Functions$e)var23_22 /* !! */ , (Functions$b)var14_14, (Functions$c)var29_29);
                                                            var31_31.c((e62_0)var8_8 /* !! */ );
                                                            var3_3.y0.b((yr0_2)var8_8 /* !! */ );
                                                            var29_29 = var3_3.L;
                                                            if (var29_29 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var24_23);
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var29_29 = null;
                                                            }
                                                            var8_8 /* !! */  = new EditText(var3_3, var9_9);
                                                            var29_29.setOnClickListener((View.OnClickListener)var8_8 /* !! */ );
                                                            var29_29 = var3_3.S;
                                                            if (var29_29 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException("searchImage");
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var29_29 = null;
                                                            }
                                                            var8_8 /* !! */  = new EditText(var3_3, var10_10);
                                                            var29_29.setOnClickListener((View.OnClickListener)var8_8 /* !! */ );
                                                            var29_29 = var3_3.H;
                                                            if (var29_29 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var29_29 = null;
                                                            }
                                                            var8_8 /* !! */  = new EditText(var3_3);
                                                            var29_29.setOnEditorActionListener((TextView.OnEditorActionListener)var8_8 /* !! */ );
                                                            var5_5 = (int)this.Va();
                                                            if (var5_5 != 0 && (var29_29 = SV2.a) != null && (var7_7 = var29_29.isEmpty()) == 0 && (var7_7 = SV2.b) != 0) {
                                                                var29_29 = (String)var29_29.lastElement();
                                                                var8_8 /* !! */  = var3_3.H;
                                                                if (var8_8 /* !! */  != null) {
                                                                    var8_8 /* !! */ .setText((CharSequence)var29_29);
                                                                    var8_8 /* !! */  = var3_3.H;
                                                                    if (var8_8 /* !! */  == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var22_21);
                                                                        var7_7 = 0;
                                                                        var8_8 /* !! */  = null;
                                                                    }
                                                                    var5_5 = var29_29.length();
                                                                    var8_8 /* !! */ .setSelection(var5_5);
                                                                }
                                                            }
                                                            var8_8 /* !! */  = var2_2;
                                                            var3_3.H0 = var29_29 = new tt2_2(var2_2);
                                                            var5_5 = (int)og1_1.c();
                                                            var8_8 /* !! */  = "getViewLifecycleOwner(...)";
                                                            if (var5_5 != 0) {
                                                                var5_5 = R$id.search_cancel;
                                                                var29_29 = var4_4.findViewById(var5_5);
                                                                var3_3.R = var29_29;
                                                                if (var29_29 != null) {
                                                                    var29_29.setVisibility(var17_16);
                                                                }
                                                                if ((var29_29 = var3_3.R) != null) {
                                                                    var31_31 = new fv2_0(var3_3);
                                                                    var29_29.setOnClickListener((View.OnClickListener)var31_31);
                                                                }
                                                                var31_31 = this.getViewLifecycleOwner();
                                                                Intrinsics.checkNotNullExpressionValue(var31_31, (String)var8_8 /* !! */ );
                                                                var8_8 /* !! */  = var3_3.t;
                                                                if (var8_8 /* !! */  == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                    var7_7 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                var3_3.u0 = var29_29 = new kg3_1((View)var4_4, var3_3, (mu1_1)var31_31, (yw2_0)var8_8 /* !! */ );
                                                            } else {
                                                                var31_31 = this.getViewLifecycleOwner();
                                                                Intrinsics.checkNotNullExpressionValue(var31_31, (String)var8_8 /* !! */ );
                                                                var8_8 /* !! */  = var3_3.t;
                                                                if (var8_8 /* !! */  == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                    var7_7 = 0;
                                                                    var8_8 /* !! */  = null;
                                                                }
                                                                var3_3.v0 = var29_29 = new hg3_0((View)var4_4, var3_3, (mu1_1)var31_31, (yw2_0)var8_8 /* !! */ );
                                                            }
                                                            var4_4 = var3_3.t;
                                                            if (var4_4 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                                var33_33 = 0;
                                                                var4_4 = null;
                                                            }
                                                            if ((var33_33 = var4_4.b()) == 0) break block127;
                                                            var4_4 = var3_3.O;
                                                            if (var4_4 != null) {
                                                                var4_4.setVisibility(var17_16);
                                                            }
                                                            var33_33 = 0;
                                                            var4_4 = null;
                                                            var3_3.O = null;
                                                            var29_29 = var3_3.N;
                                                            if (var29_29 != null) {
                                                                var29_29.setVisibility(var17_16);
                                                            }
                                                            var3_3.N = null;
                                                            break block128;
                                                        }
                                                        var4_4 = h40_0.a;
                                                        var33_33 = h40_0.i1();
                                                        if (var33_33 == 0) break block129;
                                                        var33_33 = var3_3.w0;
                                                        var29_29 = var3_3.t;
                                                        if (var29_29 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                            var5_5 = 0;
                                                            var6_6 = 0.0f;
                                                            var29_29 = null;
                                                        }
                                                        var29_29 = var29_29.t;
                                                        if ((var33_33 == 0 && (var4_4 = KU2.d) != null && (var33_33 = var4_4.intValue()) == var10_10 && (var29_29 == null || (var33_33 = var29_29.length()) == 0) || (var33_33 = var3_3.w0) != 0 && (var4_4 = KU2.c) != null && (var33_33 = var4_4.intValue()) == var10_10) && (var4_4 = var3_3.O) != null) {
                                                            var5_5 = 0;
                                                            var6_6 = 0.0f;
                                                            var29_29 = null;
                                                            var4_4.setVisibility(0);
                                                        } else {
                                                            var5_5 = 0;
                                                            var6_6 = 0.0f;
                                                            var29_29 = null;
                                                        }
                                                        var4_4 = var3_3.N;
                                                        if (var4_4 != null) {
                                                            var4_4.setVisibility(0);
                                                        }
                                                        var33_33 = 0;
                                                        var4_4 = null;
                                                        break block128;
                                                    }
                                                    var33_33 = var3_3.w0;
                                                    var29_29 = var3_3.t;
                                                    if (var29_29 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                        var5_5 = 0;
                                                        var6_6 = 0.0f;
                                                        var29_29 = null;
                                                    }
                                                    var29_29 = var29_29.t;
                                                    if (var33_33 == 0 && (var4_4 = KU2.d) != null && (var33_33 = var4_4.intValue()) == var10_10 && (var29_29 == null || (var33_33 = var29_29.length()) == 0)) ** GOTO lbl535
                                                    var33_33 = var3_3.w0;
                                                    if (var33_33 == 0 || (var4_4 = KU2.c) == null) {
                                                        while (true) {
                                                            var33_33 = 0;
                                                            var4_4 = null;
                                                            break;
                                                        }
                                                    } else {
                                                        if ((var33_33 = var4_4.intValue()) != var10_10) ** continue;
lbl535:
                                                        // 2 sources

                                                        if ((var4_4 = var3_3.O) != null) {
                                                            var4_4.setVisibility(var17_16);
                                                        }
                                                        var33_33 = 0;
                                                        var4_4 = null;
                                                        var3_3.O = null;
                                                    }
                                                    var29_29 = var3_3.N;
                                                    if (var29_29 != null) {
                                                        var29_29.setVisibility(var17_16);
                                                    }
                                                    var3_3.N = null;
                                                }
                                                var29_29 = var3_3.N;
                                                if (var29_29 != null) {
                                                    var8_8 /* !! */  = new EditText(var3_3, var9_9);
                                                    var29_29.setOnClickListener((View.OnClickListener)var8_8 /* !! */ );
                                                }
                                                if ((var29_29 = var3_3.P) != null) {
                                                    var8_8 /* !! */  = new EditText(var3_3, var9_9);
                                                    var29_29.setOnClickListener((View.OnClickListener)var8_8 /* !! */ );
                                                }
                                                if ((var29_29 = var3_3.Q) != null) {
                                                    var30_30 = 4;
                                                    var8_8 /* !! */  = new EditText(var3_3, var30_30);
                                                    var29_29.setOnClickListener((View.OnClickListener)var8_8 /* !! */ );
                                                }
                                                var8_8 /* !! */  = this.requireActivity();
                                                var30_30 = 0;
                                                var31_31 = null;
                                                var29_29 = new LinearLayoutManager((Context)var8_8 /* !! */ , 0, false);
                                                var8_8 /* !! */  = var3_3.B;
                                                if (var8_8 /* !! */  != null) {
                                                    var8_8 /* !! */ .setLayoutManager((RecyclerView$o)var29_29);
                                                }
                                                var3_3.t0 = var29_29 = new lv2_0(var3_3);
                                                var29_29 = var3_3.A;
                                                var8_8 /* !! */  = "searchList";
                                                if (var29_29 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                                                    var5_5 = 0;
                                                    var29_29 = null;
                                                    var6_6 = 0.0f;
                                                }
                                                if ((var31_31 = var3_3.t0) == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionAdapter");
                                                    var30_30 = 0;
                                                    var31_31 = null;
                                                }
                                                var29_29.setAdapter((RecyclerView$f)var31_31);
                                                var29_29 = var3_3.A;
                                                if (var29_29 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                                                    var5_5 = 0;
                                                    var29_29 = null;
                                                    var6_6 = 0.0f;
                                                }
                                                var30_30 = R$drawable.recycler_view_divider_refresh;
                                                RecyclerViewUtil.setDivider((RecyclerView)var29_29, var30_30);
                                                var29_29 = var3_3.A;
                                                if (var29_29 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                                                    var5_5 = 0;
                                                    var29_29 = null;
                                                    var6_6 = 0.0f;
                                                }
                                                var31_31 = this.requireActivity();
                                                var13_13 = 0;
                                                var14_14 = null;
                                                var8_8 /* !! */  = new EditText((Context)var31_31, var10_10, false);
                                                var29_29.setLayoutManager((RecyclerView$o)var8_8 /* !! */ );
                                                this.eb();
                                                var29_29 = var3_3.t;
                                                if (var29_29 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                                    var5_5 = 0;
                                                    var29_29 = null;
                                                    var6_6 = 0.0f;
                                                }
                                                var29_29.getClass();
                                                var8_8 /* !! */  = od3_2.a;
                                                var30_30 = var8_8 /* !! */ .length();
                                                if (var30_30 == 0) {
                                                    var8_8 /* !! */  = od3_2.a();
                                                }
                                                var31_31 = ld3_2.STORE_AJIO.getStoreId();
                                                var7_7 = Intrinsics.areEqual(var8_8 /* !! */ , var31_31);
                                                var31_31 = "";
                                                if (var7_7 == 0) break block130;
                                                var8_8 /* !! */  = KU2.d;
                                                if (var8_8 /* !! */  != null && (var7_7 = var8_8 /* !! */ .intValue()) == var9_9) {
                                                    var8_8 /* !! */  = KU2.d;
                                                    if (var8_8 /* !! */  != null && (var7_7 = var8_8 /* !! */ .intValue()) == var9_9 && (var8_8 /* !! */  = KU2.b) != null && (var8_8 /* !! */  = var8_8 /* !! */ .getPageUrlAjio()) != null) {
                                                        var31_31 = var8_8 /* !! */ ;
                                                    }
                                                    var29_29.A = var31_31;
lbl618:
                                                    // 3 sources

                                                    while (true) {
                                                        var5_5 = 1;
                                                        var6_6 = 1.4E-45f;
                                                        break block123;
                                                        break;
                                                    }
                                                }
                                                break block131;
                                            }
                                            var7_7 = od3_2.c();
                                            if (var7_7 == 0) break block132;
                                            var8_8 /* !! */  = KU2.c;
                                            if (var8_8 /* !! */  == null || (var7_7 = var8_8 /* !! */ .intValue()) != var9_9) break block131;
                                            var8_8 /* !! */  = KU2.c;
                                            if (var8_8 /* !! */  != null && (var7_7 = var8_8 /* !! */ .intValue()) == var9_9 && (var8_8 /* !! */  = KU2.b) != null && (var8_8 /* !! */  = var8_8 /* !! */ .getPageUrlLuxe()) != null) {
                                                var31_31 = var8_8 /* !! */ ;
                                            }
                                            var29_29.A = var31_31;
                                            ** GOTO lbl618
                                        }
                                        var7_7 = od3_2.b();
                                        if (var7_7 != 0) {
                                            var8_8 /* !! */  = KU2.b;
                                            if (var8_8 /* !! */  != null && (var8_8 /* !! */  = var8_8 /* !! */ .getPageUrlAjio()) != null) {
                                                var31_31 = var8_8 /* !! */ ;
                                            }
                                            var29_29.A = var31_31;
                                            ** continue;
                                        }
                                    }
                                    var5_5 = 0;
                                    var6_6 = 0.0f;
                                    var29_29 = null;
                                }
                                var8_8 /* !! */  = var3_3.t;
                                if (var8_8 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                    var7_7 = 0;
                                    var8_8 /* !! */  = null;
                                }
                                var8_8 /* !! */  = var8_8 /* !! */ .A;
                                var34_34 = "trendingCategoriesParent";
                                if (var5_5 == 0) break block133;
                                var31_31 = var3_3.y;
                                if (var31_31 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var34_34);
                                    var30_30 = 0;
                                    var31_31 = null;
                                }
                                ai0_2.B((View)var31_31);
                                var34_34 = var3_3.z;
                                if (var34_34 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("tvTrendingCategories");
                                    var9_9 = 0;
                                    var34_34 = null;
                                }
                                ai0_2.i((View)var34_34);
                                var34_34 = var3_3.t;
                                if (var34_34 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_19);
                                    var9_9 = 0;
                                    var34_34 = null;
                                }
                                var31_31 = var3_3.u;
                                var14_14 = "ajiohomeViewModel";
                                if (var31_31 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                                    var20_19 = null;
                                } else {
                                    var20_19 = var31_31;
                                }
                                var31_31 = (UserInformation)var3_3.w.getValue();
                                var30_30 = (int)var31_31.isUserOnline();
                                var34_34.getClass();
                                var35_35 = "pageUrl";
                                Intrinsics.checkNotNullParameter(var8_8 /* !! */ , var35_35);
                                Intrinsics.checkNotNullParameter(var20_19, (String)var14_14);
                                if (var5_5 == 0) break block134;
                                var20_19.getClass();
                                Intrinsics.checkNotNullParameter(var8_8 /* !! */ , "<set-?>");
                                var20_19.r = var8_8 /* !! */ ;
                                var29_29 = var34_34.I;
                                var32_32 = ((jo_2)var29_29.getValue()).f();
                                var34_34 = h40_0.a;
                                var36_36 = h40_0.B0();
                                var37_37 = 0xEFFFFA;
                                var28_28 = new HomeReq((String)var8_8 /* !! */ , null, (String)var32_32, null, null, null, null, null, null, null, false, false, false, null, false, false, null, false, false, false, var36_36, false, false, null, var37_37, null);
                                var8_8 /* !! */  = Q.a((AJIOApplication$a)var19_18, (z40$a)var11_11 /* !! */ ).a;
                                var34_34 = "enable_locale";
                                var7_7 = (int)var8_8 /* !! */ .a((String)var34_34);
                                if (var7_7 != 0 && (var29_29 = ((jo_2)var29_29.getValue()).i()) != null) {
                                    var8_8 /* !! */  = var29_29.getCity();
                                    var28_28.setCity((String)var8_8 /* !! */ );
                                    var8_8 /* !! */  = var29_29.getState();
                                    var28_28.setState((String)var8_8 /* !! */ );
                                    var8_8 /* !! */  = var29_29.getZone();
                                    var28_28.setZone((String)var8_8 /* !! */ );
                                    var29_29 = var29_29.getPincode();
                                    var28_28.setPincode((String)var29_29);
                                }
                                var5_5 = (var5_5 = (int)og1_1.c()) != 0 ? (int)CMSConfigInitializer.isSTLEnabledForLuxe() : (int)CMSConfigInitializer.isSTLEnabledForAjio();
                                var28_28.setSTLEnabled((boolean)var5_5);
                                og1_1.c();
                                var28_28.setRecentlyViewedEnabled((boolean)var10_10);
                                var29_29 = var30_30 != 0 ? "LOGGED_IN" : "NON_LOGGED_IN";
                                var28_28.setLoggedIn((String)var29_29);
                                var29_29 = new HashMap();
                                var8_8 /* !! */  = new EditText();
                                var34_34 = od3_2.a();
                                var11_11 /* !! */  = CustomerStoreType.a;
                                var11_11 /* !! */  = ScreenType.SCREEN_HOME;
                                var34_34 = CustomerStoreType.a((String)var34_34, (ScreenType)var11_11 /* !! */ );
                                if (var34_34 != null && (var12_12 = var34_34.length()) != 0) {
                                    var29_29.put("userGroup", var34_34);
                                    var11_11 /* !! */  = "USER-CLUSTER-IDS";
                                    var8_8 /* !! */ .put(var11_11 /* !! */ , var34_34);
                                }
                                var9_9 = (int)h40_0.i1();
                                var28_28.setImageSearchEnabled((boolean)var9_9);
                                var9_9 = og1_1.c();
                                if (var9_9 == 0) break block135;
                                var9_9 = og1_1.c();
                                if (var9_9 == 0 || (var9_9 = KU2.f) == 0) lbl-1000:
                                // 3 sources

                                {
                                    while (true) {
                                        var10_10 = 0;
                                        var38_38 = null;
                                        ** GOTO lbl747
                                        break;
                                    }
                                }
                                break block136;
                            }
                            var9_9 = og1_1.c();
                            if (var9_9 != 0 || (var9_9 = KU2.e) == 0) ** GOTO lbl-1000
                            var34_34 = od3_2.a;
                            var12_12 = var34_34.length();
                            if (var12_12 == 0) {
                                var34_34 = od3_2.a();
                            }
                            if ((var12_12 = (int)s20.a) == 0 && (var12_12 = (int)Intrinsics.areEqual(var11_11 /* !! */  = od3_2.a(), var14_14 = (var31_31 = ld3_2.STORE_AJIOGRAM).getStoreId())) == 0 && (var9_9 = Intrinsics.areEqual(var34_34, var11_11 /* !! */  = var31_31.getStoreId())) == 0) ** break;
                            ** while (true)
                        }
                        var28_28.setTrendingCategoryEnabled((boolean)var10_10);
                        var34_34 = od3_2.a();
                        var28_28.setStore((String)var34_34);
                        var9_9 = CMSConfigInitializer.isProductWidgetEnabled();
                        var28_28.setProductWidgetEnabled((boolean)var9_9);
                        var34_34 = CMSRequestType.REQUEST_TYPE_HOME;
                        var28_28.setRequestType((CMSRequestType)var34_34);
                        var34_34 = w61_0.a();
                        var10_10 = var34_34.length();
                        if (var10_10 > 0) {
                            var38_38 = "experiments";
                            var29_29.put(var38_38, var34_34);
                        }
                        var34_34 = UrlHelper.Companion.getInstance();
                        var38_38 = new Object[]{};
                        var11_11 /* !! */  = "homepage";
                        var31_31 = "home_cms";
                        var24_23 = var34_34.getApiUrl((String)var11_11 /* !! */ , (String)var31_31, (Object[])var38_38);
                        var9_9 = hv3_0.F();
                        var38_38 = hv3_0.a;
                        var38_38.getClass();
                        var10_10 = hv3_0.E();
                        var23_22 /* !! */  = new ScreenInfo(var9_9, var10_10);
                        var20_19.fetchHomeData((ScreenInfo)var23_22 /* !! */ , (String)var24_23, (HomeReq)var28_28, (Map)var29_29, (Map)var8_8 /* !! */ );
                    }
                    if ((var29_29 = var3_3.E) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("searchShimmerParent");
                        var5_5 = 0;
                        var29_29 = null;
                        var6_6 = 0.0f;
                    }
                    if ((var8_8 /* !! */  = var3_3.F) == null) {
                        var8_8 /* !! */  = "searchCmsShimmerParent";
                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                        var30_30 = 0;
                        var31_31 = null;
                    } else {
                        var31_31 = var8_8 /* !! */ ;
                    }
                    hv3_0.r0((ShimmerFrameLayout)var29_29, (View)var31_31);
                    break block137;
                }
                var29_29 = var3_3.y;
                if (var29_29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var34_34);
                    var30_30 = 0;
                    var31_31 = null;
                } else {
                    var31_31 = var29_29;
                }
                ai0_2.i((View)var31_31);
            }
            var4_4 = var3_3.E0;
            if (var4_4 != null) {
                var29_29 = new yq0_2(var3_3);
                var4_4.setOnScrollChangeListener((NestedScrollView$d)var29_29);
            }
            return;
        }
        var4_4 = new NullPointerException("view == null");
        throw var4_4;
    }

    public final void r3() {
        this.Ra();
        bv2_0.Companion.getClass();
        bv2_0.b2 = false;
        NewCustomEventsRevamp newCustomEventsRevamp = this.z0;
        String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
        String string3 = av_0.a(AnalyticsManager.Companion);
        String string4 = this.A0;
        String string5 = this.B0;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "upload image icon interactions", "Click a photo", "event_upload_image_icon_interactions", string3, "home landing screen", string4, null, string5, false, null, 1536, null);
    }

    public final void showProgress() {
        j3_0 j3_02 = this.n;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.startLoader();
    }

    public final void v4(SuggestionSearchModel suggestionSearchModel, int n3) {
        Intrinsics.checkNotNullParameter(suggestionSearchModel, "suggestionSearchModel");
        yw2_0 yw2_02 = this.t;
        if (yw2_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
            yw2_02 = null;
        }
        yw2_02.B = false;
        bv2_0.Companion.getClass();
        bv2_0.b2 = false;
        bv2_0.a2 = kv2_0.PLP_HISTORY;
        this.Ua(n3, suggestionSearchModel, 1);
    }

    public final void wa() {
        this.hb(true);
    }
}

