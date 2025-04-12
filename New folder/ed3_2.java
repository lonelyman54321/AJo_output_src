/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.customviews.widgets.ScrollViewCallbacks;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.StoreLPRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.databinding.FragmentStoreLandingPageBinding;
import com.ril.ajio.home.landingpage.activity.CustomVideoPlayerActivity;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.Platform;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.sis.StoreMetaData;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.view.BaseActivity;
import io.reactivex.Scheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from ed3
 */
public final class ed3_2
extends u61_0
implements r82_0,
ScrollViewCallbacks,
View.OnClickListener,
FragmentTitlesInterface {
    public static final ed3$a Companion;
    public final ed3$d A;
    public final ed3$c B;
    public j3_0 f;
    public A71 g;
    public fo3 h;
    public vh3_2 i;
    public uc3_2 j;
    public MenuItem k;
    public MenuItem l;
    public TextView m;
    public NavigationParent n;
    public final hh3_2 o;
    public OnFragmentInteractionListener p;
    public e00 q;
    public final ArrayList r;
    public FragmentStoreLandingPageBinding s;
    public final hh3_2 t;
    public final hh3_2 u;
    public final hh3_2 v;
    public final hh3_2 w;
    public Boolean x;
    public BaseResponse y;
    public String z;

    static {
        ed3$a ed3$a;
        Companion = ed3$a = new Object();
    }

    public ed3_2() {
        Object object = new ad3_2(this);
        this.o = object = yr1_2.b((Function0)object);
        object = new ArrayList();
        this.r = object;
        object = new G22(this, 1);
        this.t = object = yr1_2.b((Function0)object);
        object = new bd3_2(this);
        this.u = object = yr1_2.b((Function0)object);
        object = new cd3_2(this);
        this.v = object = yr1_2.b((Function0)object);
        object = new dd3_2(this);
        this.w = object = yr1_2.b((Function0)object);
        this.z = "";
        this.A = object = new Object();
        this.B = object = new Object();
    }

    public final void La(hp1_2 hp1_22) {
        int n3;
        ed3_2 ed3_22 = this;
        hp1_2 hp1_23 = hp1_22;
        Intrinsics.checkNotNullParameter(hp1_22, "landingItemInfo");
        Object object = this.j;
        Object object2 = "mStoreLPViewModel";
        int n4 = 0;
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        hp1_23.j = object = ((uc3_2)object).c;
        object = ed3_22.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        String string2 = hp1_23.a;
        Intrinsics.checkNotNull(string2);
        object.getClass();
        Intrinsics.checkNotNullParameter(string2, "pageType");
        object = "OPEN_PLAY_STORE";
        n3 = Intrinsics.areEqual(object, string2);
        if (n3 != 0) {
            n3 = 5;
            ed3_22.Sa(hp1_23, n3);
        } else {
            object = "OPEN_ORDER_DETAIL";
            n3 = (int)(Intrinsics.areEqual(object, string2) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(object = "OPEN_ORDER_LIST", string2) ? 1 : 0)) == 0) {
                object = ed3_22.j;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object3 = object;
                }
                object3.getClass();
                object = hp1_23.f;
                if (object == null) {
                    object = "";
                }
                object2 = "/";
                object = nn_2.a((String)object, (String)object2);
                n4 = hp1_23.e;
                ((StringBuilder)object).append(n4);
                object = ((StringBuilder)object).toString();
                n4 = (int)(hp1_23.i ? 1 : 0);
                string2 = hp1_23.h;
                if (n4 != 0) {
                    object3 = "/ViewAll";
                    object = Ft2.a((String)object, (String)object3);
                    n4 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                    if (n4 == 0) {
                        object = n1.a((String)object, (String)object2, string2);
                    }
                    object2 = AnalyticsManager.Companion;
                    object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    object2 = av_0.a((AnalyticsManager$Companion)object2);
                    string2 = hp1_23.b;
                    ((GTMEvents)object3).pushButtonTapEvent((String)object, string2, (String)object2);
                } else {
                    String string3;
                    TextUtils.isEmpty((CharSequence)string2);
                    String string4 = hp1_23.c;
                    n3 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0);
                    if (n3 == 0) {
                        Intrinsics.checkNotNull(string4);
                        n3 = 0;
                        object = null;
                        n4 = 6;
                        int n7 = StringsKt.R(string4, (String)object2, 0, n4);
                        int n8 = -1;
                        if (n7 != n8) {
                            string2 = "?";
                            n8 = (int)(StringsKt.F(string4, string2, false) ? 1 : 0);
                            string3 = "substring(...)";
                            if (n8 != 0) {
                                int n10 = StringsKt.R(string4, (String)object2, 0, n4) + 1;
                                n3 = StringsKt.O(string4, string2, 0, false, n4);
                                object = string4.substring(n10, n3);
                                Intrinsics.checkNotNullExpressionValue(object, string3);
                            } else {
                                n3 = StringsKt.R(string4, (String)object2, 0, n4) + 1;
                                object = string4.substring(n3);
                                Intrinsics.checkNotNullExpressionValue(object, string3);
                            }
                            TextUtils.isEmpty((CharSequence)object);
                        }
                    }
                    object = AnalyticsManager.Companion;
                    NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
                    object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
                    string3 = ((NewEEcommerceEventsRevamp)object2).getEE_SELECT_PROMOTION();
                    Intrinsics.checkNotNull(string4);
                    String string5 = av_0.a((AnalyticsManager$Companion)object);
                    String string6 = bv_0.a((AnalyticsManager$Companion)object);
                    String string7 = cv_0.a((AnalyticsManager$Companion)object);
                    String string8 = "home landing screen";
                    int n14 = 4032;
                    NewEEcommerceEventsRevamp.pushEESelectPromotion$default(newEEcommerceEventsRevamp, string3, string4, string5, string6, string8, string7, false, false, null, null, null, false, n14, null);
                }
                n3 = 3;
                ed3_22.Sa(hp1_23, n3);
            }
        }
    }

    public final void Pa(BaseResponse baseResponse) {
        block37: {
            String string2;
            String string3;
            long l2;
            String string4;
            String string5;
            Object object;
            Object object2;
            Object object3;
            boolean bl2;
            Object object4;
            Object object5;
            Object object6;
            boolean bl3;
            ed3_2 ed3_22;
            block38: {
                Object object7;
                Object object8;
                boolean bl4;
                boolean bl5;
                block40: {
                    block39: {
                        ed3_22 = this;
                        bl3 = false;
                        object6 = null;
                        object5 = baseResponse.getResponseStatusType();
                        if (object5 == (object4 = ResponseStatusType.API_LOADING) || !(bl5 = this.isAdded())) break block37;
                        object5 = this.s;
                        object4 = "binding";
                        bl2 = false;
                        object3 = null;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            bl5 = false;
                            object5 = null;
                        }
                        object5 = ((FragmentStoreLandingPageBinding)object5).fslpShimmer.shimmerParent;
                        object2 = ed3_22.s;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            bl4 = false;
                            object2 = null;
                        }
                        object2 = ((FragmentStoreLandingPageBinding)object2).homeCmsShimmerParent;
                        hv3_0.t0((ShimmerFrameLayout)((Object)object5), (View)object2);
                        object5 = yn3_0.a;
                        object2 = baseResponse.getResponseStatusType();
                        object = new StringBuilder("cms callback: ");
                        ((StringBuilder)object).append(object2);
                        object2 = ((StringBuilder)object).toString();
                        object = new Object[]{};
                        ((yn3$a)object5).a((String)object2, (Object[])object);
                        object5 = baseResponse.getResponseStatusType();
                        object2 = ResponseStatusType.API_SUCCESS;
                        object = ed3_22.r;
                        string5 = "fslpNewHeader";
                        string4 = "pageErrorHomePageLyt";
                        l2 = 500L;
                        string3 = "fslpNewSearchCardView";
                        string2 = "commonCmsViewDelegate";
                        if (object5 != object2) break block38;
                        object5 = (HomeData)baseResponse.getData();
                        if (object5 == null) break block37;
                        bl4 = xv_0.d();
                        object8 = ed3_22.w;
                        if (bl4) break block39;
                        object2 = h40_0.a;
                        bl4 = h40_0.Z0();
                        if (!bl4) break block40;
                    }
                    object2 = ((BannerAdViewModel)((hh3_2)object8).getValue()).getHomePageBannerAdsMap();
                    object7 = ((BannerAdViewModel)((hh3_2)object8).getValue()).getHomePageExternalAdsMap();
                    xv_0.e((HomeData)object5, (HashMap)object2, (HashMap)object7);
                }
                ((BannerAdViewModel)((hh3_2)object8).getValue()).resetAdsMap();
                ed3_22.x = null;
                yx0_0.a = ((HomeData)object5).getPageTitle();
                object2 = ed3_22.j;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStoreLPViewModel");
                    bl4 = false;
                    object2 = null;
                }
                if ((object8 = ((HomeData)object5).getPageTitle()) == null) {
                    object8 = "";
                }
                object7 = ed3_22.z;
                object2.getClass();
                Intrinsics.checkNotNullParameter(object8, "pageTitle");
                Intrinsics.checkNotNullParameter(object7, "current_exp");
                object2 = new Bundle();
                String string6 = "page_type";
                object2.putString(string6, (String)object8);
                boolean bl6 = true;
                object2.putBoolean("served_from_cms", bl6);
                object8 = AnalyticsManager.Companion;
                AnalyticsManager analyticsManager = ((AnalyticsManager$Companion)object8).getInstance();
                analyticsManager.getNewEEcommerceEventsRevamp().addCohortLInkData((Bundle)object2, (String)object7);
                object3 = ((AnalyticsManager$Companion)object8).getInstance().getGtmEvents();
                object8 = "landing screen";
                ((GTMEvents)object3).pushOpenScreenEvent((String)object8, (Bundle)object2);
                object3 = ((HomeData)object5).getHomeRowData();
                if (object3 != null && !(bl2 = object3.isEmpty())) {
                    object3 = ed3_22.s;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        bl2 = false;
                        object3 = null;
                    }
                    object3 = ((FragmentStoreLandingPageBinding)object3).fslpNewSearch.fslpNewSearchCardView;
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    ai0_2.B((View)object3);
                    object3 = ed3_22.s;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        bl2 = false;
                        object3 = null;
                    }
                    if ((object3 = ((FragmentStoreLandingPageBinding)object3).fslpNewHeader) != null) {
                        ai0_2.B((View)object3);
                    }
                    if ((object3 = ed3_22.s) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        bl2 = false;
                        object3 = null;
                    }
                    if ((object4 = ((FragmentStoreLandingPageBinding)object3).homeListSisRV) != null) {
                        ai0_2.B((View)object4);
                    }
                    ((ArrayList)object).clear();
                    object5 = ((HomeData)object5).getHomeRowData();
                    Intrinsics.checkNotNull(object5);
                    object5 = (Collection)object5;
                    ((ArrayList)object).addAll(object5);
                    object5 = ed3_22.q;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl5 = false;
                        object5 = null;
                    }
                    ((e00)object5).q((ArrayList)object);
                    object5 = ed3_22.q;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl5 = false;
                        object5 = null;
                    }
                    if ((object5 = ((e00)object5).v) != null) {
                        ((RecyclerView$f)object5).notifyDataSetChanged();
                    }
                    if ((object5 = ed3_22.q) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl5 = false;
                        object5 = null;
                    }
                    ((e00)object5).e();
                    object5 = ed3_22.q;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl2 = false;
                        object3 = null;
                    } else {
                        object3 = object5;
                    }
                    object3.getClass();
                    bl5 = hv3_0.U();
                    if (bl5) {
                        object5 = ((e00)object3).f();
                        bl5 = ((oz_2)object5).h;
                        if (bl5 && (object5 = ((e00)object3).b) != null) {
                            object4 = cp_1.Companion;
                            object4.getClass();
                            int n3 = cp$a.y();
                            if (n3 != 0) {
                                n3 = 5;
                                object4 = ((ky1_0)object5).c.getWishList(0, n3, bl6);
                                object3 = new uy1_2((ky1_0)object5);
                                object2 = new vy1_1((uy1_2)object3);
                                object3 = new wy1_2(object5, 0);
                                object6 = new xy1_0((Function1)object3);
                                object6 = ((g53_0)object4).f((o60_0)object2, (o60_0)object6);
                                object5 = ((ky1_0)object5).G;
                                ((t30_0)object5).b((yr0_2)object6);
                            }
                        }
                    }
                    bl3 = ih3_1.a;
                    object6 = (UserInformation)ed3_22.t.getValue();
                    bl3 = ((UserInformation)object6).isUserOnline();
                    ih3_1.a(bl3);
                } else {
                    object5 = Looper.getMainLooper();
                    object6 = new Handler((Looper)object5);
                    object5 = new yc3_1(ed3_22);
                    object6.postDelayed((Runnable)object5, l2);
                    object6 = ed3_22.s;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        bl3 = false;
                        object6 = null;
                    }
                    object6 = ((FragmentStoreLandingPageBinding)object6).errorContainer.pageErrorHomePageLyt;
                    Intrinsics.checkNotNullExpressionValue(object6, string4);
                    ai0_2.B((View)object6);
                    object6 = ed3_22.s;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        bl3 = false;
                        object6 = null;
                    }
                    object6 = ((FragmentStoreLandingPageBinding)object6).fslpNewHeader;
                    Intrinsics.checkNotNullExpressionValue(object6, string5);
                    ai0_2.B((View)object6);
                    object6 = ed3_22.s;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        bl2 = false;
                        object3 = null;
                    } else {
                        object3 = object6;
                    }
                    object6 = ((FragmentStoreLandingPageBinding)object3).fslpNewSearch.fslpNewSearchCardView;
                    Intrinsics.checkNotNullExpressionValue(object6, string3);
                    ai0_2.B((View)object6);
                }
                break block37;
            }
            ((ArrayList)object).clear();
            object6 = ed3_22.q;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl3 = false;
                object6 = null;
            }
            if ((object6 = ((e00)object6).v) != null) {
                ((RecyclerView$f)object6).notifyDataSetChanged();
            }
            object5 = Looper.getMainLooper();
            object6 = new Handler((Looper)object5);
            object5 = new zc3_0(ed3_22);
            object6.postDelayed((Runnable)object5, l2);
            object6 = ed3_22.s;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl3 = false;
                object6 = null;
            }
            object6 = ((FragmentStoreLandingPageBinding)object6).errorContainer.pageErrorHomePageLyt;
            Intrinsics.checkNotNullExpressionValue(object6, string4);
            ai0_2.B((View)object6);
            object6 = ed3_22.s;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl3 = false;
                object6 = null;
            }
            object6 = ((FragmentStoreLandingPageBinding)object6).fslpNewHeader;
            Intrinsics.checkNotNullExpressionValue(object6, string5);
            ai0_2.B((View)object6);
            object6 = ed3_22.s;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl2 = false;
                object3 = null;
            } else {
                object3 = object6;
            }
            object6 = ((FragmentStoreLandingPageBinding)object3).fslpNewSearch.fslpNewSearchCardView;
            Intrinsics.checkNotNullExpressionValue(object6, string3);
            ai0_2.B((View)object6);
            object6 = baseResponse.getResponseStatusType();
            object5 = ResponseStatusType.API_FAILURE;
            if (object6 == object5) {
                object4 = ApiErrorRepo.INSTANCE;
                object2 = "HOME_CMS";
                boolean bl7 = true;
                string5 = "landing screen";
                string4 = "Forward";
                object3 = baseResponse;
                ((ApiErrorRepo)object4).logApiErrorKMM(baseResponse, (String)object2, bl7, string5, string4);
            } else {
                object6 = baseResponse.getResponseStatusType();
                if (object6 == (object5 = ResponseStatusType.API_EXCEPTION) && (object3 = baseResponse.getThrowable()) != null) {
                    object4 = ApiErrorRepo.INSTANCE;
                    object2 = "HOME_CMS";
                    boolean bl8 = true;
                    string5 = "landing screen";
                    string4 = "Forward";
                    ((ApiErrorRepo)object4).logApiException((Throwable)object3, (String)object2, bl8, string5, string4);
                }
            }
        }
    }

    public final void Qa(tt2_2 tt2_22) {
        int n3;
        int n4;
        int n7;
        ed3_2 ed3_22 = this;
        Object object = this.s;
        Object object2 = "binding";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        object = ((FragmentStoreLandingPageBinding)object).homeCmsShimmerParent;
        Object object3 = "homeCmsShimmerParent";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        ai0_2.B((View)object);
        object = ed3_22.s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        object = ((FragmentStoreLandingPageBinding)object).fslpShimmer.shimmerParent;
        object3 = ed3_22.s;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object3 = null;
        }
        object3 = ((FragmentStoreLandingPageBinding)object3).homeCmsShimmerParent;
        hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)object3);
        object = ed3_22.s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        object = ((FragmentStoreLandingPageBinding)object).errorContainer.pageErrorHomePageLyt;
        object3 = "pageErrorHomePageLyt";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        ai0_2.i((View)object);
        object = ed3_22.s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        object = ((FragmentStoreLandingPageBinding)object).homeListSisRV;
        Object object4 = this.getContext();
        object3 = new WrapperLinearLayoutManager((Context)object4);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
        object = ed3_22.q;
        object3 = "commonCmsViewDelegate";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n7 = 0;
            object = null;
        }
        object4 = ed3_22.j;
        Object object5 = "mStoreLPViewModel";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object4 = null;
        }
        object4 = ((uc3_2)object4).b;
        ((e00)object).g = object4;
        object = ed3_22.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n7 = 0;
            object = null;
        }
        if ((object3 = ed3_22.s) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object3 = null;
        }
        object3 = ((FragmentStoreLandingPageBinding)object3).homeListSisRV;
        Intrinsics.checkNotNullExpressionValue(object3, "homeListSisRV");
        object4 = tt2_22;
        ((e00)object).p((RecyclerView)object3, tt2_22);
        object = ed3_22.s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        object = ((FragmentStoreLandingPageBinding)object).homeListSisRV;
        object2 = new Object();
        ((bb3_1)object2).a = object;
        ((bb3_1)object2).d = n4 = -1;
        ((bb3_1)object2).h = n3 = 40;
        if (object != null) {
            object4 = new ab3_1((bb3_1)object2);
            ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object4);
        }
        ((bb3_1)object2).h = n7 = 70;
        object = ed3_22.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n7 = 0;
            object = null;
        }
        if ((object = ((uc3_2)object).b) != null && (n7 = ((String)object).length()) > 0) {
            int n8;
            object2 = ed3_22.j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n8 = 0;
                object2 = null;
            }
            Object object6 = ((uc3_2)object2).b;
            object2 = ed3_22.o;
            Object object7 = ((jo_2)((hh3_2)object2).getValue()).f();
            object4 = h40_0.a;
            boolean bl2 = h40_0.B0();
            boolean bl3 = h40_0.Z0();
            HashMap<Object, Object> hashMap = null;
            int n10 = 0;
            HashMap<Object, Object> hashMap2 = null;
            Object object8 = null;
            Object object9 = null;
            Object object10 = null;
            String string2 = null;
            String string3 = null;
            String string4 = null;
            int n14 = 0xCFFFFA;
            Object object11 = object;
            object = new HomeReq((String)object6, null, (String)object7, null, null, null, null, null, null, null, false, false, false, null, false, false, null, false, false, false, bl2, bl3, false, null, n14, null);
            object4 = z40_0.Companion;
            object11 = AJIOApplication.Companion;
            object6 = Q.a((AJIOApplication$a)object11, (z40$a)object4).a;
            Object object12 = "enable_locale";
            boolean bl4 = ((ao0_0)object6).a((String)object12);
            if (bl4 && (object2 = ((jo_2)((hh3_2)object2).getValue()).i()) != null) {
                object6 = ((LocationData)object2).getCity();
                ((HomeReq)object).setCity((String)object6);
                object6 = ((LocationData)object2).getState();
                ((HomeReq)object).setState((String)object6);
                object6 = ((LocationData)object2).getZone();
                ((HomeReq)object).setZone((String)object6);
                object2 = ((LocationData)object2).getPincode();
                ((HomeReq)object).setPincode((String)object2);
            }
            n8 = 1;
            ((HomeReq)object).setSTLEnabled(n8 != 0);
            ((HomeReq)object).setRecentlyViewedEnabled(n8 != 0);
            object6 = (UserInformation)ed3_22.t.getValue();
            bl4 = ((UserInformation)object6).isUserOnline();
            object6 = bl4 ? "LOGGED_IN" : "NON_LOGGED_IN";
            ((HomeReq)object).setLoggedIn((String)object6);
            hashMap = new HashMap<Object, Object>();
            object6 = CustomerStoreType.a;
            object6 = ed3_22.j;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl4 = false;
                object6 = null;
            }
            object6 = ((uc3_2)object6).c;
            object12 = ScreenType.SCREEN_HOME;
            object6 = CustomerStoreType.a((String)object6, (ScreenType)((Object)object12));
            object12 = "";
            object7 = object6 == null ? object12 : object6;
            ed3_22.z = object7;
            object7 = "userGroup";
            if (object6 != null && (n10 = ((String)object6).length()) != 0) {
                hashMap.put(object7, object6);
            }
            if ((n10 = ((String)(object6 = w61_0.a())).length()) > 0) {
                hashMap2 = "experiments";
                hashMap.put(hashMap2, object6);
            }
            if ((object6 = ed3_22.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl4 = false;
                object6 = null;
            }
            object6 = ((uc3_2)object6).c;
            ((HomeReq)object).setStore((String)object6);
            bl4 = CMSConfigInitializer.isProductWidgetEnabled();
            ((HomeReq)object).setProductWidgetEnabled(bl4);
            object6 = eb_2.f();
            hashMap2 = Boolean.TRUE;
            bl4 = Intrinsics.areEqual(object6, hashMap2);
            ((HomeReq)object).setVideoEnableOnCMS(bl4);
            bl4 = Intrinsics.areEqual(eb_2.g(), hashMap2);
            ((HomeReq)object).setVideoEnableOnSTL(bl4);
            object11.getClass();
            object11 = AJIOApplication$a.a();
            object4.getClass();
            object4 = z40$a.a((Context)object11).a;
            object11 = "apiVersion";
            object4 = ((ao0_0)object4).b((String)object11);
            ((HomeReq)object).setApiVersion((String)object4);
            object4 = UrlHelper.Companion;
            boolean n15 = ((UrlHelper$Companion)object4).getISPREVIEW();
            bl4 = false;
            object6 = null;
            if (n15) {
                boolean bl5;
                int n16;
                object4 = ch_2.a();
                if (object4 != null && (n16 = ((String)object4).length()) != 0) {
                    ((HomeReq)object).setTimeStamp((String)object4);
                }
                object4 = ch_2.l;
                ((HomeReq)object).setStore((String)object4);
                object4 = ed3_22.j;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n3 = 0;
                    object4 = null;
                }
                ((uc3_2)object4).c = object11 = ch_2.l;
                object4 = this.getParentFragment();
                if (object4 != null && (bl5 = object4 instanceof tm2_2)) {
                    object4 = ((tm2_2)object4).getChildFragmentManager();
                    n3 = ((FragmentManager)object4).J();
                } else {
                    n3 = 1;
                }
                int n17 = ch_2.f;
                if (n3 == n8) {
                    if (n17 != n4) {
                        object3 = n17;
                        ((HomeReq)object).setPageID((Integer)object3);
                        ((HomeReq)object).setPageUrl(null);
                    } else {
                        object3 = ch_2.g;
                        if (object3 != null && (n4 = ((String)object3).length()) > 0) {
                            object3 = ch_2.g;
                            ((HomeReq)object).setPageUrl((String)object3);
                        }
                    }
                    object3 = ch_2.i;
                    ((HomeReq)object).setLoggedIn((String)object3);
                    object3 = ch_2.h;
                    ((HomeReq)object).setUserType((String)object3);
                    object3 = Platform.INSTANCE;
                    object4 = ch_2.k;
                    ((Platform)object3).setClientVersion((String)object4);
                    object3 = ch_2.j;
                    if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                        object3 = ch_2.j;
                        Intrinsics.checkNotNull(object3);
                        hashMap.put(object7, object3);
                        object3 = ch_2.m;
                        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                            object3 = ch_2.m;
                            Intrinsics.checkNotNull(object3);
                            object4 = "userSubGroup";
                            hashMap.put(object4, object3);
                        }
                    }
                }
                n4 = CMSConfigInitializer.getPreviewAdBufferTime();
                n3 = rj_0.a();
                if (n3 <= n4) {
                    bl4 = true;
                }
                ch_2.n = bl4;
                object3 = CMSConfigInitializer.getPreviewUrlForHome();
            } else {
                object3 = ((UrlHelper$Companion)object4).getInstance();
                object4 = new Object[]{};
                object11 = "homepage";
                object6 = "home_cms";
                object3 = ((UrlHelper)object3).getApiUrl((String)object11, (String)object6, (Object[])object4);
            }
            hashMap2 = new HashMap<Object, Object>();
            cp_1.Companion.getClass();
            object4 = cp$a.e();
            object11 = ((HomeReq)object).getStore();
            object4.getClass();
            object2 = cp_1.a((String)object11, (String)object3, n8 != 0);
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                object4 = "Cookie";
                hashMap2.put(object4, object2);
            }
            if ((n8 = (int)(xv_0.g() ? 1 : 0)) != 0) {
                object8 = object2 = ed3_22.w.getValue();
                object8 = (BannerAdViewModel)object2;
                object2 = h40_0.I();
                n8 = (int)(object2.has((String)(object4 = "adSpotId")) ? 1 : 0);
                if (n8 != 0) {
                    object2 = h40_0.I().getString((String)object4);
                    Intrinsics.checkNotNull(object2);
                    object9 = object2;
                } else {
                    object9 = object12;
                }
                object2 = ((HomeReq)object).getPageUrl();
                object10 = object2 == null ? object12 : object2;
                string2 = ((HomeReq)object).getStore();
                string3 = ((HomeReq)object).getLoggedIn();
                string4 = ((HomeReq)object).getUserType();
                ((BannerAdViewModel)object8).callBannerAdsHomeApi((String)object9, (String)object10, string2, string3, string4, false);
            } else {
                ed3_22.x = object2 = Boolean.FALSE;
            }
            object2 = ed3_22.j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                object8 = null;
            } else {
                object8 = object2;
            }
            n8 = hv3_0.F();
            hv3_0.a.getClass();
            n3 = hv3_0.E();
            object6 = new ScreenInfo(n8, n3);
            object8.getClass();
            Intrinsics.checkNotNullParameter(object6, "screenInfo");
            Intrinsics.checkNotNullParameter(object3, "url");
            Intrinsics.checkNotNullParameter(object, "homeReq");
            object2 = md3_0.c((jD3)object8);
            object4 = new sc3_2((uc3_2)object8);
            object9 = null;
            object11 = object5;
            object12 = object3;
            object7 = object;
            object5 = new tc3_2((ScreenInfo)object6, (String)object3, (HomeReq)object, hashMap, hashMap2, (uc3_2)object8, null);
            n7 = 2;
            Ae3.d((i90_0)object2, (CoroutineContext)object4, null, (Function2)object5, n7);
        }
    }

    public final void Ra() {
        int n3;
        Object object = this.j;
        Object object2 = "mStoreLPViewModel";
        boolean bl2 = false;
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        object = ((uc3_2)object).d;
        Object object4 = "toolbarListener";
        if (object != null) {
            int n4;
            Object object5;
            boolean bl3;
            Object object6;
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object = ((uc3_2)object).d) != null) {
                object = ((StoreInfo)object).smallerLogo;
            } else {
                n3 = 0;
                object = null;
            }
            String string2 = "binding";
            if (object != null) {
                int n7;
                object6 = new da$a();
                ((da$a)object6).l = bl3 = true;
                ((da$a)object6).g = bl3;
                ((da$a)object6).a = n7 = 17170445;
                ((da$a)object6).b = n7;
                ((da$a)object6).c = n7;
                ((da$a)object6).s = bl3;
                n7 = R$string.acc_icon_product_placeholder;
                object5 = hv3_0.K(n7);
                ((da$a)object6).b((String)object5);
                object5 = this.s;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object5 = null;
                }
                object5 = object5.fslpIvStoreLogo;
                ((da$a)object6).n = object;
                ((da$a)object6).u = object5;
                ((da$a)object6).i = bl3;
                ((da$a)object6).a();
            }
            if ((object = this.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object = ((uc3_2)object).d) != null) {
                object = ((StoreInfo)object).headerIconColor;
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                n4 = Color.parseColor((String)object);
                Object object7 = this.s;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object7 = null;
                }
                object7 = object7.fslpIvBack;
                object5 = PorterDuff.Mode.SRC_IN;
                object7.setColorFilter(n4, object5);
                object6 = this.s;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object6 = null;
                }
                object6 = ((FragmentStoreLandingPageBinding)object6).fslpNewSearch.llpsIvCatMenu;
                n3 = Color.parseColor((String)object);
                object6.setColorFilter(n3, object5);
            }
            if ((object = this.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object = ((uc3_2)object).d) != null) {
                object = ((StoreInfo)object).getColorTheme();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                n3 = Color.parseColor((String)object);
                object6 = this.s;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object6 = null;
                }
                ((FragmentStoreLandingPageBinding)object6).fslpAppBar.setBackgroundColor(n3);
                object6 = this.s;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object6 = null;
                }
                ((FragmentStoreLandingPageBinding)object6).fslpNewSearch.llpsCatColLayout.setBackgroundColor(n3);
                object6 = this.s;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object6 = null;
                }
                ((FragmentStoreLandingPageBinding)object6).fslpNewSearch.llpsTransView.setBackgroundColor(n3);
                object6 = this.s;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object6 = null;
                }
                object6 = ((FragmentStoreLandingPageBinding)object6).fslpNewSearch.llpsLayoutMenu;
                object6.setBackgroundColor(n3);
            }
            if ((object = this.s) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object = ((FragmentStoreLandingPageBinding)object).fslpNewSearch.llpsIvCatMenu;
            int n8 = R$drawable.ic_revamp_hamburger_menu_sis;
            object.setImageResource(n8);
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            if ((object4 = this.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object4;
            }
            object2 = ((uc3_2)object3).d;
            object.R0((StoreInfo)object2);
        } else {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            object.Z1();
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            if ((object = object.getToolbar()) != null) {
                AjioCustomToolbar$DisplayMode ajioCustomToolbar$DisplayMode = AjioCustomToolbar$DisplayMode.TITLE;
                ((AjioCustomToolbar)object).setDisplayMode(ajioCustomToolbar$DisplayMode);
            }
            if ((object = this.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            object = ((uc3_2)object).e;
            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
            String string3 = "";
            if (bl4) {
                object = string3;
            }
            if ((n3 = TextUtils.isEmpty((CharSequence)object)) == 0) {
                object = this.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n3 = 0;
                    object = null;
                }
                if ((object = object.getToolbar()) != null) {
                    object4 = this.j;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object4;
                    }
                    object2 = ((uc3_2)object3).e;
                    bl2 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl2) {
                        string3 = object2;
                    }
                    ((AjioCustomToolbar)object).setTitle(string3);
                }
            } else {
                object = this.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                object = object3.getToolbar();
                if (object != null) {
                    ((AjioCustomToolbar)object).setTitle(string3);
                }
            }
        }
    }

    public final void Sa(hp1_2 hp1_22, int n3) {
        int n4 = 3;
        if (n3 != n4) {
            int n7 = 5;
            if (n3 == n7) {
                hp1_22 = this.requireContext();
                String string2 = "requireContext(...)";
                Intrinsics.checkNotNullExpressionValue(hp1_22, string2);
                mz3_0.I((Context)hp1_22);
            }
        } else {
            kj0_1 kj0_12 = kj0_1.g();
            FragmentActivity fragmentActivity = this.getActivity();
            String string3 = hp1_22.a;
            String string4 = hp1_22.j;
            String string5 = hp1_22.b;
            String string6 = hp1_22.d;
            String string7 = hp1_22.c;
            kj0_12.getClass();
            kj0_1.m(fragmentActivity, string3, string5, string6, string7, string4, null);
        }
    }

    public final String getAjioTitle() {
        return null;
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.SIS;
    }

    public final String getProductListDetail() {
        return null;
    }

    public final String getProductListTitle() {
        return null;
    }

    public final String getToolbarTitle() {
        return "STORES";
    }

    public final Boolean hasBackButton() {
        return Boolean.FALSE;
    }

    public final void m(String object) {
        Object object2 = this.getActivity();
        Class<CustomVideoPlayerActivity> clazz = CustomVideoPlayerActivity.class;
        Intent intent = new Intent((Context)object2, clazz);
        object2 = "VIDEO_URL";
        intent.putExtra((String)object2, (String)object);
        object = this.getActivity();
        if (object != null) {
            object.startActivity(intent);
        }
        if ((object = this.getActivity()) != null) {
            int n3 = R$anim.slide_in_bottom;
            int n4 = R$anim.slide_out_top;
            object.overridePendingTransition(n3, n4);
        }
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.s;
        mu1_1 mu1_12 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        object = ((FragmentStoreLandingPageBinding)object).fslpNewHeader;
        Object object2 = this.j;
        Object object3 = "mStoreLPViewModel";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        object2 = ((uc3_2)object2).c;
        Object object4 = hv3_0.K(R$string.acc_page_header_store_landing);
        Object object5 = new StringBuilder();
        ((StringBuilder)object5).append((String)object2);
        ((StringBuilder)object5).append(",");
        ((StringBuilder)object5).append((String)object4);
        object2 = ((StringBuilder)object5).toString();
        object.setContentDescription((CharSequence)object2);
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        int n3 = 2;
        object2 = new St1(this, n3);
        long l2 = 300L;
        object.postDelayed((Runnable)object2, l2);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((uc3_2)object).k;
        object2 = this.getViewLifecycleOwner();
        int n4 = 1;
        object4 = new zf2_1(this, n4);
        object5 = new ed3$e((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, (F62)object5);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((uc3_2)object).l;
        object2 = this.getViewLifecycleOwner();
        n4 = 2;
        object4 = new b91_0(this, n4);
        object5 = new ed3$e((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, (F62)object5);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((uc3_2)object).j;
        object2 = this.getViewLifecycleOwner();
        object3 = new qq0_0(this, 1);
        object4 = new ed3$e((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.getViewLifecycleOwner();
        object2 = "getViewLifecycleOwner(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object3 = new ed3$b(this, null);
        ((iu1_0)object).c((Function2)object3);
        object = ((BannerAdViewModel)this.w.getValue()).getBannerAdsHome();
        mu1_12 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(mu1_12, (String)object2);
        object2 = new oc0_1(this, 2);
        object3 = new ed3$e((Function1)object2);
        ((R53)object).e(mu1_12, (F62)object3);
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        int n7;
        if (object != null && n4 == (n7 = -1)) {
            int n8 = 5;
            boolean bl2 = true;
            if (n3 != n8) {
                n8 = 15;
                if (n3 == n8) {
                    Object object2;
                    if (n4 != n7) {
                        return;
                    }
                    Object object3 = object.getExtras();
                    if (object3 != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = object3.getString((String)(object2 = "CORE_CATEGORY_ID")))) ? 1 : 0)) == 0) {
                        Intrinsics.checkNotNull(object3);
                        object2 = this.j;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mStoreLPViewModel");
                            n4 = 0;
                            object2 = null;
                        }
                        if ((n3 = (int)(kotlin.text.b.i((String)object3, (String)(object2 = ((uc3_2)object2).b), bl2) ? 1 : 0)) != 0) {
                            return;
                        }
                    }
                    if ((object3 = this.p) != null) {
                        n4 = 0;
                        object2 = null;
                        object = object.getExtras();
                        String string2 = "category_detail_link";
                        object3.onFragmentInteraction(string2, 0, (Bundle)object);
                    }
                }
            } else {
                Object object4 = object.getData();
                if (object4 != null) {
                    object4 = kj0_1.g();
                    Object object5 = this.getActivity();
                    ((kj0_1)object4).o((Activity)object5, (Intent)object, bl2);
                    object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object5 = "Noti_click";
                    object = "NotificationCenter";
                    ((GTMEvents)object4).pushButtonTapEvent(object5, (String)object);
                }
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.f = object2 = (j3_0)object;
            bl2 = object instanceof OnFragmentInteractionListener;
            if (bl2) {
                object2 = object;
                this.p = object2 = (OnFragmentInteractionListener)object;
                bl2 = object instanceof A71;
                if (bl2) {
                    object2 = object;
                    this.g = object2 = (A71)object;
                    bl2 = object instanceof fo3;
                    if (bl2) {
                        object2 = object;
                        this.h = object2 = (fo3)object;
                        boolean bl3 = object instanceof vh3_2;
                        if (bl3) {
                            object = (vh3_2)object;
                            this.i = object;
                            if (object2 == null) {
                                object = "toolbarListener";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                                bl2 = false;
                                object2 = null;
                            }
                            object2.q();
                            return;
                        }
                        object = pn_2.b(object, " must implement TabListener");
                        object2 = new ClassCastException((String)object);
                        throw object2;
                    }
                    object = pn_2.b(object, " must implement ToolbarListener");
                    object2 = new ClassCastException((String)object);
                    throw object2;
                }
                object = pn_2.b(object, " must implement HomeListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement OnFragmentInteractionListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        Object object2 = "clickedView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.row_search_component_layout;
        Object object3 = "activityFragmentListener";
        boolean bl2 = false;
        Object object4 = null;
        if (n3 != n4 && n3 != (n4 = R$id.row_search_component_tv_search) && n3 != (n4 = R$id.row_search_component_imv_search) && n3 != (n4 = R$id.llpsTvSearch) && n3 != (n4 = R$id.llpsIvSearch)) {
            n4 = R$id.llpsIvCatMenu;
            if (n3 != n4 && n3 != (n4 = R$id.llpsLayoutMenu)) {
                n4 = R$id.fslpIvBack;
                if (n3 == n4) {
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object4 = object;
                    }
                    object4.N();
                }
            } else {
                object = this.getActivity();
                n3 = object instanceof BaseActivity;
                if (n3 != 0) {
                    object = this.getActivity();
                    object2 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
                    Intrinsics.checkNotNull(object, (String)object2);
                    object = (BaseActivity)object;
                    ((BaseActivity)object).G2();
                }
            }
        } else {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
                n3 = 0;
                object = null;
            }
            object.M0();
            vv2_2.Companion.getClass();
            object = new vv2_2();
            object2 = new Bundle();
            Object object5 = this.j;
            String string2 = "mStoreLPViewModel";
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object5 = null;
            }
            object5 = ((uc3_2)object5).c;
            String string3 = "STORE_ID";
            object2.putString(string3, (String)object5);
            object5 = this.j;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object5 = null;
            }
            object5 = ((uc3_2)object5).c;
            string2 = "STORE_THEME";
            object2.putString(string2, (String)object5);
            ((Fragment)object).setArguments((Bundle)object2);
            object2 = this.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n4 = 0;
                object2 = null;
            }
            if ((object5 = this.f) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object4 = object5;
            }
            object3 = object4.y();
            bl2 = true;
            object5 = "search_tag";
            j3$a.a((j3_0)object2, (Fragment)object3, (Fragment)object, bl2, (String)object5);
        }
    }

    public final void onCreate(Bundle bundle) {
        Object object = this;
        super.onCreate(bundle);
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
        Object object7 = tf2_2.class;
        Object object8 = "modelClass";
        object3 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object5, object7, (String)object8);
        object4 = "<this>";
        object5 = sw0_0.a(object7, (String)object4, object7, (String)object8, (String)object8);
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object7 = object5.getQualifiedName();
        Object object9 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string4.concat((String)object7);
            object3 = (tf2_2)((pD3)object3).a((yn1_2)object5, (String)object7);
            object3 = kd3_2.a();
            object5 = new StoreLPRepo();
            object7 = this.requireActivity().getApplication();
            ((kd3_2)object3).a = object5;
            ((kd3_2)object3).b = object7;
            Intrinsics.checkNotNull(object3);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object3, string2);
            object5 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object7 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object5, (String)object6);
            Intrinsics.checkNotNullParameter(object3, string2);
            Intrinsics.checkNotNullParameter(object7, string3);
            Object object10 = uc3_2.class;
            object5 = im_1.a((rd3_0)object5, (kd3_2)object3, (Wd0)object7, object10, (String)object8);
            object7 = sw0_0.a(object10, (String)object4, object10, (String)object8, (String)object8);
            Intrinsics.checkNotNullParameter(object7, (String)object4);
            object10 = object7.getQualifiedName();
            if (object10 != null) {
                object10 = string4.concat((String)object10);
                this.j = object5 = (uc3_2)((pD3)object5).a((yn1_2)object7, (String)object10);
                object7 = this.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object7, "getApplication(...)");
                object5 = new UserRepo((Application)object7);
                object7 = this.requireActivity().getApplication();
                ((kd3_2)object3).a = object5;
                ((kd3_2)object3).b = object7;
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object5 = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object7 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object10 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object5, (String)object6);
                Intrinsics.checkNotNullParameter(object7, string2);
                Intrinsics.checkNotNullParameter(object10, string3);
                Object object11 = hq_2.class;
                object5 = rl3_0.b((rd3_0)object5, (E$b)object7, (Wd0)object10, object11, (String)object8);
                object7 = sw0_0.a(object11, (String)object4, object11, (String)object8, (String)object8);
                Intrinsics.checkNotNullParameter(object7, (String)object4);
                object10 = object7.getQualifiedName();
                if (object10 != null) {
                    object10 = string4.concat((String)object10);
                    object5 = (hq_2)((pD3)object5).a((yn1_2)object7, (String)object10);
                    Intrinsics.checkNotNullParameter(this, (String)object2);
                    Intrinsics.checkNotNullParameter(object3, string2);
                    object5 = this.getViewModelStore();
                    Intrinsics.checkNotNullParameter(this, (String)object2);
                    object2 = this.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullParameter(object5, (String)object6);
                    Intrinsics.checkNotNullParameter(object3, string2);
                    Intrinsics.checkNotNullParameter(object2, string3);
                    object6 = hy3_0.class;
                    object2 = im_1.a((rd3_0)object5, (kd3_2)object3, (Wd0)object2, (Class)object6, (String)object8);
                    object3 = sw0_0.a((Class)object6, (String)object4, (Class)object6, (String)object8, (String)object8);
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object4 = object3.getQualifiedName();
                    if (object4 != null) {
                        object4 = string4.concat((String)object4);
                        object2 = (hy3_0)((pD3)object2).a((yn1_2)object3, (String)object4);
                        object3 = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(object3, "requireActivity(...)");
                        object4 = object2 = this.u.getValue();
                        object4 = (ky1_0)object2;
                        object2 = this.i;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
                            object2 = null;
                        }
                        object5 = object2;
                        Object object12 = object2 = ((ed3_2)object).v.getValue();
                        object12 = (F12)object2;
                        object7 = ((ed3_2)object).A;
                        object11 = ((ed3_2)object).B;
                        object2 = object9;
                        object8 = this;
                        Object object13 = object9;
                        object9 = this;
                        object = object12;
                        ((e00)object2)((FragmentActivity)object3, (ky1_0)object4, (vh3_2)object5, null, null, null, (OnGAEventHandlerListener)object7, this, this, false, (F12)object12, null, (OnGACuratedWidgetEventHandlerListener)object11, null, null, null, null, null, 513088);
                        object2 = this;
                        object3 = object13;
                        this.q = object13;
                        ((e00)object13).i();
                        this.setHasOptionsMenu(true);
                        ((UserInformation)this.t.getValue()).getUserEmailId();
                        return;
                    }
                    object2 = this;
                    object4 = object9.toString();
                    object3 = new IllegalArgumentException((String)object4);
                    throw object3;
                }
                object2 = this;
                object4 = object9.toString();
                object3 = new IllegalArgumentException((String)object4);
                throw object3;
            }
            object2 = this;
            object4 = object9.toString();
            object3 = new IllegalArgumentException((String)object4);
            throw object3;
        }
        object2 = this;
        object4 = object9.toString();
        object3 = new IllegalArgumentException((String)object4);
        throw object3;
    }

    public final void onCreateOptionsMenu(Menu object, MenuInflater menuInflater) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "inflater");
        super.onCreateOptionsMenu((Menu)object, menuInflater);
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && (n3 = (fragmentActivity = this.requireActivity()).isFinishing()) == 0) {
            Object object2;
            int n4;
            n3 = R$menu.action_bar_menu;
            menuInflater.inflate(n3, (Menu)object);
            int n7 = R$id.search;
            menuInflater = object.findItem(n7);
            this.k = menuInflater;
            n7 = R$id.notification_menu;
            menuInflater = object.findItem(n7);
            this.l = menuInflater;
            n3 = 0;
            fragmentActivity = null;
            if (menuInflater != null) {
                menuInflater = menuInflater.getActionView();
            } else {
                n7 = 0;
                menuInflater = null;
            }
            if (menuInflater != null) {
                n4 = R$id.noti_icon;
                object2 = (ImageView)menuInflater.findViewById(n4);
            }
            if (menuInflater != null) {
                n3 = R$id.notification_count;
                fragmentActivity = (Button)menuInflater.findViewById(n3);
            }
            object2 = z40_0.Companion;
            Application application = this.requireActivity().getApplication();
            String string2 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(application, string2);
            object2.getClass();
            object2 = z40$a.a((Context)application).a;
            n4 = (int)(((ao0_0)object2).a("newnotificationCenterEnable") ? 1 : 0);
            application = null;
            boolean bl2 = true;
            if (n4 != 0) {
                int n8;
                object = this.l;
                if (object != null) {
                    object.setEnabled(bl2);
                }
                if ((object = this.l) != null) {
                    object.setVisible(bl2);
                }
                if ((n8 = ((sw_0)(object = (jo_2)this.o.getValue())).getPreference((String)(object2 = "Notification_Count"), 0)) > 0) {
                    if (fragmentActivity != null) {
                        object = String.valueOf(n8);
                        fragmentActivity.setText((CharSequence)object);
                    }
                    if (fragmentActivity != null) {
                        fragmentActivity.setVisibility(0);
                    }
                } else if (fragmentActivity != null) {
                    n8 = 8;
                    fragmentActivity.setVisibility(n8);
                }
            } else {
                n3 = R$id.notification_menu;
                fragmentActivity = object.findItem(n3);
                fragmentActivity.setVisible(false);
                n3 = R$id.notification_menu;
                object = object.findItem(n3);
                object.setEnabled(false);
            }
            if (menuInflater != null) {
                object = new vc3_2(this);
                menuInflater.setOnClickListener((View.OnClickListener)object);
            }
            if ((object = this.k) != null) {
                n7 = R$drawable.ic_search_transparent;
                object.setIcon(n7);
            }
            if ((object = this.k) != null) {
                object.setVisible(bl2);
            }
            if ((object = this.k) != null) {
                object.setEnabled(false);
            }
            this.Ra();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_store_landing_page;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        eb_2.c.clear();
        eb_2.e.clear();
        eb_2.b = null;
        eb_2.f = null;
    }

    public final void onDestroyView() {
        Object object;
        fo3 fo32 = this.h;
        Object object2 = null;
        if (fo32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            fo32 = null;
        }
        if ((object = this.j) == null) {
            object = "mStoreLPViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2 = ((uc3_2)object2).d;
        fo32.R0((StoreInfo)object2);
        fo32 = new Message();
        ((Message)fo32).what = 1004;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage((Message)fo32);
        super.onDestroyView();
    }

    public final void onPause() {
        super.onPause();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 <= n4) {
            Object object = xl1_1.STOP;
            Intent intent = new Intent("media_stop_notification");
            String string2 = "action_type";
            intent.putExtra(string2, (Serializable)object);
            object = Xv1.a(this.requireContext());
            ((Xv1)object).c(intent);
        }
    }

    public final void onResume() {
        super.onResume();
        Object object = this.h;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            object = null;
        }
        object.hideToolbarLayout();
        object = this.s;
        if (object == null) {
            object = "binding";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object = ((FragmentStoreLandingPageBinding)object2).fslpSearchbarContainer;
        Intrinsics.checkNotNullExpressionValue(object, "fslpSearchbarContainer");
        ai0_2.i((View)object);
        this.Ra();
    }

    public final void onScrollChanged(int n3, boolean bl2, boolean bl3) {
    }

    public final void onStop() {
        super.onStop();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4) {
            Object object = xl1_1.STOP;
            Intent intent = new Intent("media_stop_notification");
            String string2 = "action_type";
            intent.putExtra(string2, (Serializable)object);
            object = Xv1.a(this.requireContext());
            ((Xv1)object).c(intent);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        Object object;
        Object[] objectArray;
        int n4;
        Object object2;
        ed3_2 ed3_22 = this;
        Object object3 = view;
        Object object4 = null;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object object5 = FragmentStoreLandingPageBinding.bind(view);
        this.s = object5;
        object5 = this.getActivity();
        if (object5 != null) {
            object5.invalidateOptionsMenu();
        }
        object5 = ed3_22.j;
        Object object6 = "mStoreLPViewModel";
        Object object7 = null;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            object5 = null;
        }
        Object object8 = this.getArguments();
        object5.getClass();
        if (object8 != null) {
            object2 = "STORE_PAGE_ID";
            n4 = object8.containsKey((String)object2);
            if (n4 != 0) {
                object2 = object8.getString((String)object2);
                ((uc3_2)object5).b = object2;
            }
            if ((n4 = object8.containsKey((String)(object2 = "STORE_ID"))) != 0) {
                object8 = object8.getString((String)object2);
                ((uc3_2)object5).c = object8;
                if (object8 != null) {
                    object2 = (StoreMetaData)g62_0.c.b.get(object8);
                    if (object2 == null) {
                        object8 = ((uc3_2)object5).a.getStoreInfo((String)object8);
                        n4 = 3;
                        object2 = new jb_2(object5, n4);
                        objectArray = new ng2_0(object2);
                        object2 = new rc3_2((uc3_2)object5);
                        object = new pg2_1(object2);
                        object8 = ((g53_0)object8).f((o60_0)objectArray, (o60_0)object);
                        object5 = ((uc3_2)object5).f;
                        ((t30_0)object5).b((yr0_2)object8);
                    } else {
                        object5 = ((uc3_2)object5).k;
                        object8 = DataCallback.Companion.onSuccess(object2);
                        ((LiveData)object5).k(object8);
                    }
                }
            }
        }
        if ((object5 = ed3_22.q) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commonCmsViewDelegate");
            object5 = null;
        }
        if ((object8 = ed3_22.j) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n3 = 0;
            object8 = null;
        }
        object8 = ((uc3_2)object8).c;
        ((e00)object5).z = object8;
        object5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object8 = ed3_22.j;
        if (object8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n3 = 0;
            object8 = null;
        }
        object8 = ((uc3_2)object8).c;
        objectArray = "landing screen/sis-";
        object2 = new StringBuilder((String)objectArray);
        ((StringBuilder)object2).append((String)object8);
        object8 = ((StringBuilder)object2).toString();
        ((GTMEvents)object5).setScreenName((String)object8);
        object5 = ed3_22.h;
        object8 = "toolbarListener";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            object5 = null;
        }
        object5.h1(false);
        object5 = ed3_22.h;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            object5 = null;
        }
        n3 = R$drawable.ic_menu_black_24px;
        object5.showUpButton(false, 0, n3, null);
        object5 = ed3_22.i;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            object5 = null;
        }
        object5.t();
        object8 = bundle;
        object5 = new tt2_2(bundle);
        if (object3 != null) {
            n3 = R$id.fslp_progress;
            object8 = (AjioProgressView)object3.findViewById(n3);
            object8 = ed3_22.j;
            if (object8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n3 = 0;
                object8 = null;
            }
            if ((n3 = (int)(w61_0.b((String)(object8 = ((uc3_2)object8).b)) ? 1 : 0)) != 0) {
                ed3_22.Qa((tt2_2)object5);
            }
            if ((object8 = ed3_22.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n3 = 0;
                object8 = null;
            }
            if ((object8 = ((uc3_2)object8).c) != null && (n3 = ((String)object8).length()) != 0) {
                object8 = ed3_22.j;
                if (object8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n3 = 0;
                    object8 = null;
                }
                if ((object2 = ed3_22.j) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object2 = null;
                }
                object6 = ((uc3_2)object2).c;
                Intrinsics.checkNotNull(object6);
                object2 = Locale.ROOT;
                String string2 = ((String)object6).toUpperCase((Locale)object2);
                Intrinsics.checkNotNullExpressionValue(string2, "toUpperCase(...)");
                object8.getClass();
                Intrinsics.checkNotNullParameter(string2, "store");
                object = ((uc3_2)object8).j;
                objectArray = ((uc3_2)object8).i;
                boolean bl2 = true;
                int n8 = 16;
                object6 = CategoryNavigationRepo.getCMSCategoryNavigation$default((CategoryNavigationRepo)objectArray, (zr1_1)object, false, string2, bl2, false, n8, null);
                object2 = qt2_2.c;
                object6 = ((g53_0)object6).h((Scheduler)object2);
                object2 = ti_2.a();
                object6 = ((g53_0)object6).e((Scheduler)object2);
                object2 = new A22(object8, n7);
                objectArray = new rg2_0(object2);
                object2 = new B22(object8, n7);
                object = new tg2_0(object2);
                object6 = ((g53_0)object6).f((o60_0)objectArray, (o60_0)object);
                object8 = ((uc3_2)object8).f;
                ((t30_0)object8).b((yr0_2)object6);
            }
            int n10 = R$id.row_search_component_layout;
            object3.findViewById(n10).setOnClickListener((View.OnClickListener)ed3_22);
            n10 = R$id.row_search_component_tv_search;
            object6 = (TextView)object3.findViewById(n10);
            ed3_22.m = object6;
            if (object6 != null) {
                n3 = R$string.search_within_store_;
                object8 = ed3_22.getString(n3);
                object6.setText((CharSequence)object8);
            }
            if ((object6 = ed3_22.m) != null) {
                object6.setOnClickListener((View.OnClickListener)ed3_22);
            }
            if ((object3 = (ImageView)object3.findViewById(n10 = R$id.row_search_component_imv_search)) != null) {
                object3.setOnClickListener((View.OnClickListener)ed3_22);
            }
            object3 = h40_0.a;
            object3 = h40_0.H0(od3_2.a());
            object6 = "binding";
            if (object3 != null) {
                object8 = ed3_22.s;
                if (object8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n3 = 0;
                    object8 = null;
                }
                object8 = ((FragmentStoreLandingPageBinding)object8).errorContainer.pageErrorHomePageLyt;
                object2 = StringCompanionObject.INSTANCE;
                object2 = ed3_22.s;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object2 = null;
                }
                object2 = ((FragmentStoreLandingPageBinding)object2).errorContainer.pageErrorHomePageLyt.getContext();
                n4 = R$string.acc_error_popup;
                object2 = object2.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object2, "getString(...)");
                objectArray = new Object[n7];
                objectArray[0] = object3;
                an_1.a(objectArray, n7, (String)object2, "format(...)", (ConstraintLayout)((Object)object8));
                object4 = ed3_22.s;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object4 = null;
                }
                object4 = ((FragmentStoreLandingPageBinding)object4).errorContainer.errorTitle;
                object4.setText((CharSequence)object3);
            }
            if ((object3 = h40_0.G0(od3_2.a())) != null) {
                object4 = ed3_22.s;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object4 = null;
                }
                object4 = ((FragmentStoreLandingPageBinding)object4).errorContainer.errorDesc;
                object4.setText((CharSequence)object3);
            }
            if ((object3 = h40_0.F0(od3_2.a())) != null) {
                object4 = ed3_22.s;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object4 = null;
                }
                object4 = ((FragmentStoreLandingPageBinding)object4).errorContainer.refreshButton;
                object4.setText((CharSequence)object3);
            }
            if ((object3 = ed3_22.s) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                object3 = null;
            }
            object3 = object3.errorContainer.refreshButton;
            n7 = 2;
            object4 = new fg1_0(n7, ed3_22, object5);
            object3.setOnClickListener((View.OnClickListener)object4);
            object3 = ed3_22.s;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                object3 = null;
            }
            object3 = object3.fslpNewSearch;
            object3.llpsIvCatMenu.setOnClickListener((View.OnClickListener)ed3_22);
            object3.llpsLayoutMenu.setOnClickListener((View.OnClickListener)ed3_22);
            object4 = ed3_22.s;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            } else {
                object7 = object4;
            }
            ((FragmentStoreLandingPageBinding)object7).fslpIvBack.setOnClickListener(ed3_22);
            object4 = object3.llpsIvSearch;
            object4.setOnClickListener((View.OnClickListener)ed3_22);
            object3 = object3.llpsTvSearch;
            object3.setOnClickListener((View.OnClickListener)ed3_22);
        }
    }
}

