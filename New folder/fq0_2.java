/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.view.WindowInsetsController
 */
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.navigation.e;
import androidx.navigation.i;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsRequest$Builder;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.sis.SisStoreList;
import com.ril.ajio.services.data.user.GPSLocationData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.UserApi;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from fQ0
 */
public final class fq0_2
extends y51_0
implements oc3_2,
fy0_1,
yv0_1,
zm_2,
ChangeLocationListener {
    public static final fq0$a_1 Companion;
    public static final String J;
    public ey0_1 A;
    public final hh3_2 B;
    public final hh3_2 C;
    public final D D;
    public final hh3_2 E;
    public final D F;
    public CartAddressListBottomSheet G;
    public fo_1 H;
    public ff0_2 I;
    public FragmentActivity g;
    public OnFragmentInteractionListener h;
    public j3_0 i;
    public fo3 j;
    public vh3_2 k;
    public lz1_1 l;
    public A71 m;
    public yT1 n;
    public yT1 o;
    public Fragment p;
    public dr0_0 q;
    public boolean r;
    public boolean s;
    public final D t;
    public final hh3_2 u;
    public Function0 v;
    public Function0 w;
    public Function0 x;
    public ArrayList y;
    public oq2_1 z;

    static {
        Object object = new Object();
        Companion = object;
        object = fq0_2.class.getName();
        Intrinsics.checkNotNullExpressionValue(object, "getName(...)");
        J = object;
    }

    public fq0_2() {
        Object object = Reflection.getOrCreateKotlinClass(f23_0.class);
        Object object2 = new fq0$c_0(this);
        Lambda lambda = new fq0$d_0(this);
        Lambda lambda2 = new fq0$e_0(this);
        this.t = object = LW0.a(this, (yn1_2)object, object2, lambda, lambda2);
        object = new dq0_1(0);
        this.u = object = yr1_2.b((Function0)object);
        object = new ia_2(this, 2);
        this.B = object = yr1_2.b((Function0)object);
        object = new eq0_2(this);
        this.C = object = yr1_2.b((Function0)object);
        object = Reflection.getOrCreateKotlinClass(lq2_0.class);
        super(this);
        super(this);
        super(this);
        this.D = object = LW0.a(this, (yn1_2)object, object2, lambda, lambda2);
        object = new pa0_2(this, 1);
        this.E = object = yr1_2.b((Function0)object);
        object = new fQ0$i(this);
        object2 = et1_2.NONE;
        super((fQ0$i)object);
        object = yr1_2.a((et1_2)((Object)object2), lambda);
        object2 = Reflection.getOrCreateKotlinClass(wx1_1.class);
        super((rq1_2)object);
        super((rq1_2)object);
        fQ0$m fQ0$m = new fQ0$m(this, (rq1_2)object);
        this.F = object = LW0.a(this, (yn1_2)object2, lambda, lambda2, fQ0$m);
    }

    public static /* synthetic */ void Ya(fq0_2 fq0_22, Component component, boolean bl2, String string2, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            component = null;
        }
        if ((n3 &= 2) != 0) {
            bl2 = false;
        }
        fq0_22.Xa(component, bl2, string2);
    }

    public final void M9(String object) {
        String string2 = "addressId";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = h40_0.Q1();
        if (bl2 && (object = this.G) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
    }

    public final void N7() {
        lm_2 lm_22 = new lm_2();
        Intrinsics.checkNotNullParameter(this, "cartAddressCallBackListener");
        lm_22.S = this;
        Object object = this.a;
        Object object2 = ((jo_2)object).l();
        object2 = object2 != null ? object2.getAddressType() : null;
        AddressType addressType = AddressType.Pincode;
        if (object2 == addressType) {
            if ((object = ((jo_2)object).m()) == null) {
                object = "";
            }
            object2 = "preFillPinCode";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            lm_22.R = object;
        }
        object = this.requireActivity().getSupportFragmentManager();
        lm_22.show((FragmentManager)object, "CartAddAddressBottomSheet");
    }

    public final lq2_0 Pa() {
        return (lq2_0)this.D.getValue();
    }

    public final void Q5() {
        Object object;
        Object object2 = this.j;
        if (object2 != null) {
            object2.hideToolbarLayout();
        }
        if ((object2 = this.k) != null) {
            object = null;
            object2.showTabLayout(false);
        }
        if ((object2 = this.n) != null) {
            String string2;
            boolean bl2;
            object2 = ((e)object2).h();
            object = null;
            if (object2 != null) {
                object2 = ((i)object2).h;
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null && (bl2 = Intrinsics.areEqual(object2, string2 = "switch-store-route"))) {
                object2 = h40_0.a;
                bl2 = h40_0.c();
                if (!bl2) {
                    object2 = this.n;
                    if (object2 == null) {
                        object2 = "bottomNavHostController";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object = object2;
                    }
                    ((e)object).q();
                }
            }
        }
    }

    public final f23_0 Qa() {
        return (f23_0)this.t.getValue();
    }

    public final void Ra() {
        HashMap hashMap = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        Object object = p90.a((Context)AJIOApplication$a.a());
        hashMap.put("client_version", object);
        hashMap.put("returnDefault", "true");
        object = this.Sa();
        Object object2 = "<get-userInformation>(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = ServiceUtil.getToken((UserInformation)object);
        if (object != null) {
            object2 = (h5_0)this.E.getValue();
            String string2 = this.Sa().getUserId();
            String string3 = "getUserId(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            ((h5_0)object2).d((String)object, string2, hashMap);
        }
    }

    public final void S9(double d2, double d5) {
        dr0_0 dr0_02 = this.q;
        if (dr0_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
            dr0_02 = null;
        }
        dr0_02.getClass();
        dr0_02.n = d5;
        int n3 = dr0_02.o;
        int n4 = 103;
        if (n3 == n4) {
            Object object;
            Object object2 = d2;
            d2 = dr0_02.n;
            Double d7 = d2;
            int n7 = 4;
            Object object3 = object;
            object = new GPSLocationData((Double)object2, d7, null, n7, null);
            Intrinsics.checkNotNullParameter(object, "GPSLocationData");
            Object object4 = dr0_02.a;
            object4.getClass();
            Intrinsics.checkNotNullParameter(object, "gpsLocationData");
            Object object5 = UrlHelper.Companion.getInstance();
            Object object6 = new Object[]{};
            object3 = "homepage";
            object2 = "fetch_pincode";
            object5 = ((UrlHelper)object5).getApiUrl((String)object3, (String)object2, object6);
            object4 = ((UserApi)((xr0_2)object4).e.getValue()).getGpsData((String)object5, "BackGround_GET_GPS_DATA", (GPSLocationData)object);
            object5 = qt2_2.c;
            object4 = ((g53_0)object4).h((Scheduler)object5);
            object5 = ti_2.a();
            object4 = ((g53_0)object4).e((Scheduler)object5);
            object5 = new Object();
            object = new yq0_2(object5);
            object5 = new s53_0((q63_0)object4, (bx0_2)object);
            object4 = new Object();
            object = new u53_0((q63_0)object5, (bx0_2)object4);
            Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
            object4 = new br0_1(dr0_02, 0);
            object5 = new cr0_1((br0_1)object4);
            n4 = 1;
            object4 = new bb_1(dr0_02, n4);
            object6 = new hf0_0(object4);
            object4 = ((g53_0)object).f((o60_0)object5, (o60_0)object6);
            object5 = dr0_02.G0;
            ((t30_0)object5).b((yr0_2)object4);
        }
    }

    public final UserInformation Sa() {
        return (UserInformation)this.u.getValue();
    }

    public final void T2() {
        boolean bl2;
        Object object = new fo_1();
        this.H = object;
        ((fo_1)object).h = bl2 = true;
        Object object2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        ((fo_1)object).i = this;
        object = this.H;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.H) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void Ta(Function0 object) {
        String string2 = "executingFunction";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.s;
        if (bl2) {
            object = this.getActivity();
            if (object != null) {
                ((ComponentActivity)object).onBackPressed();
            }
        } else {
            object.invoke();
        }
    }

    public final void Ua(boolean bl2, Product object, Function0 function0, Function0 object2) {
        Intrinsics.checkNotNullParameter(function0, "successExecutingFunction");
        Object object3 = "failureExecutingFunction";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.w = function0;
        this.x = object2;
        int n3 = 3;
        object2 = "productCode";
        int n4 = 53;
        Object object4 = "source - closet";
        String string2 = "fleekViewModel";
        Object object5 = null;
        if (bl2) {
            Object object6 = this.Sa();
            bl2 = ((UserInformation)object6).isUserOnline();
            if (!bl2) {
                object6 = this.q;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object5 = object6;
                }
                ((dr0_0)object5).A0.b = object;
                object6 = this.l;
                if (object6 != null) {
                    object6.z0(n4, (String)object4);
                }
            } else {
                object6 = this.getArguments();
                n4 = 103;
                if (object6 != null && (bl2 = (object6 = this.requireArguments()).containsKey((String)(object4 = "PLP_TYPE")))) {
                    object6 = this.requireArguments();
                    n4 = object6.getInt((String)object4, n4);
                }
                if ((object6 = this.i) != null) {
                    object6.startLoader();
                }
                if ((object6 = this.q) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object6 = null;
                }
                ((dr0_0)object6).A0.b = object;
                object6 = this.q;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object6 = null;
                }
                if (object == null || (object = ((Product)object).getFnlColorVariantData()) == null || (object = ((ProductFnlColorVariantData)object).getColorGroup()) == null) {
                    object = "";
                }
                object6.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = md3_0.c((jD3)object6);
                object4 = new ER0(n4, null, (dr0_0)object6, (String)object);
                Ae3.d((i90_0)object2, null, null, (Function2)object4, n3);
            }
        } else {
            Object object7 = this.Sa();
            bl2 = ((UserInformation)object7).isUserOnline();
            if (!bl2) {
                object7 = this.q;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object5 = object7;
                }
                ((dr0_0)object5).A0.c = object;
                object7 = this.l;
                if (object7 != null) {
                    object7.z0(n4, (String)object4);
                }
            } else if (object != null && (object7 = ((Product)object).getFnlColorVariantData()) != null && (object7 = ((ProductFnlColorVariantData)object7).getColorGroup()) != null && (n4 = ((String)object7).length()) > 0) {
                object3 = this.i;
                if (object3 != null) {
                    object3.startLoader();
                }
                if ((object3 = this.q) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object3 = null;
                }
                object3 = ((dr0_0)object3).A0;
                ((BH3)object3).c = object;
                object = this.q;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object = null;
                }
                object.getClass();
                Intrinsics.checkNotNullParameter(object7, (String)object2);
                object2 = md3_0.c((jD3)object);
                object3 = new or0_0((dr0_0)object, (String)object7, null);
                Ae3.d((i90_0)object2, null, null, (Function2)object3, n3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Va() {
        Exception exception2;
        Object object;
        block5: {
            Object object2;
            ArrayList arrayList;
            block4: {
                boolean bl2;
                arrayList = hu1_2.a;
                int n3 = 0;
                object = null;
                arrayList = arrayList != null ? ((SisStoreList)((Object)arrayList)).getStores() : null;
                object2 = hu1_2.a;
                Object object3 = object2 != null ? (object2 = ((SisStoreList)object2).getHeaderTitle()) : null;
                object2 = hu1_2.a;
                if (object2 != null) {
                    object = ((SisStoreList)object2).getSubText();
                }
                String string2 = object;
                object = this.p;
                if (object == null) return;
                n3 = ((Fragment)object).isAdded();
                if (n3 != (bl2 = true)) return;
                n3 = this.isAdded();
                if (n3 == 0) return;
                if (arrayList == null) return;
                n3 = arrayList.isEmpty();
                if (n3 != 0) {
                    return;
                }
                try {
                    object = this.B;
                    object = ((hh3_2)object).getValue();
                    object = (r81_0)object;
                    object = ((r81_0)object).a;
                    ((LiveData)object).k(arrayList);
                    arrayList = nc3_2.Companion;
                    arrayList.getClass();
                    boolean bl3 = true;
                    arrayList = Nc3$a.a((String)object3, string2, null, null, bl3, false);
                    n3 = 1789;
                    ((Fragment)((Object)arrayList)).setTargetFragment(this, n3);
                    object = "storeChooserListener";
                    Intrinsics.checkNotNullParameter(this, (String)object);
                    ((nc3_2)((Object)arrayList)).h = this;
                    object = this.p;
                    if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) break block4;
                }
                catch (Exception exception2) {
                    break block5;
                }
                object = this.requireParentFragment();
                object = ((Fragment)object).getChildFragmentManager();
                object2 = "getChildFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            }
            object2 = "StoreChooserBSFragment";
            ((DialogFragment)((Object)arrayList)).show((FragmentManager)object, (String)object2);
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(exception2);
    }

    public final void Wa(String object, boolean bl2) {
        pj0_2.Companion.getClass();
        pj0_2 pj0_22 = new pj0_2();
        Bundle bundle = new Bundle();
        String string2 = "IsFromDeepLink";
        bundle.putBoolean(string2, bl2);
        Object object2 = "POSTID";
        bundle.putString((String)object2, (String)object);
        pj0_22.setArguments(bundle);
        object = this.getActivity();
        boolean bl3 = object instanceof AjioHomeActivity;
        if (bl3) {
            object = this.g;
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
            object = (AjioHomeActivity)object;
            object2 = this.p;
            boolean bl4 = true;
            string2 = "feed_detail_tag";
            j3$a.a((j3_0)object, (Fragment)object2, pj0_22, bl4, string2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Xa(Component var1_1, boolean var2_2, String var3_3) {
        block13: {
            var4_4 = true;
            if (var2_2 != var4_4) break block13;
            try {
                this.Wa(var3_3, var4_4);
                ** GOTO lbl35
            }
            catch (Exception v0) {
                ** continue;
            }
        }
        if (var1_1 == null) ** GOTO lbl35
        var5_5 = var1_1.getSubcomponent();
        if (var5_5 == null) ** GOTO lbl35
        var5_5 = CollectionsKt.firstOrNull((List)var5_5);
        var5_5 = (Subcomponent)var5_5;
        if (var5_5 == null) ** GOTO lbl35
        var5_5 = var5_5.getResources();
        if (var5_5 == null) ** GOTO lbl35
        var5_5 = (Collection)var5_5;
        var2_2 = var5_5.isEmpty() ^ var4_4;
        if (var2_2 != var4_4) ** GOTO lbl35
        var5_5 = this.Qa();
        var5_5 = var5_5.b;
        var5_5.setValue(var1_1);
        var1_1 = null;
        this.Wa(var3_3, false);
lbl35:
        // 8 sources

    }

    public final void Za(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "brandId");
        Intrinsics.checkNotNullParameter(string3, "brandName");
        Object object = this.getActivity();
        boolean bl2 = object instanceof AjioHomeActivity;
        if (bl2) {
            od3_2.a = "";
            AJIOApplication.Companion.getClass();
            Object object2 = AJIOApplication$a.a();
            object = new jo_2((Context)object2);
            object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
            ((jo_2)object).E((String)object2);
            object = this.g;
            object2 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (AjioHomeActivity)object;
            boolean bl3 = true;
            ((AjioHomeActivity)object).M1(string2, string3, bl3);
        }
    }

    public final void ab(String object, p83_0 object2, int n3, String string2) {
        Object object3;
        boolean bl2 = true;
        String string3 = null;
        Object object4 = "key";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Object object5 = "BRAND_THUMBNAIL";
        boolean bl3 = Intrinsics.areEqual(object, object5);
        if (bl3) {
            if (object2 != null) {
                object5 = new ArrayList();
                object2 = ((p83_0)object2).listIterator();
                while (true) {
                    object3 = object2;
                    object3 = (ob3_2)object2;
                    boolean bl4 = ((ob3_2)object3).hasNext();
                    if (!bl4) break;
                    Object object6 = object3 = ((ob3_2)object3).next();
                    object6 = (Subcomponent)object3;
                    if (object6 != null) {
                        object6 = ((Subcomponent)object6).isPinned();
                        Boolean bl5 = Boolean.FALSE;
                        bl4 = Intrinsics.areEqual(object6, bl5);
                    } else {
                        bl4 = false;
                        object6 = null;
                    }
                    if (!bl4) continue;
                    ((ArrayList)object5).add(object3);
                }
                object2 = object5;
            } else {
                object2 = null;
            }
        }
        object5 = this.Qa().a;
        if (object2 != null) {
            object2 = (Iterable)object2;
            object3 = new p83_0();
            CollectionsKt.h0((Iterable)object2, (Collection)object3);
        } else {
            object3 = null;
        }
        object5.put(object, object3);
        vd3_2.Companion.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object2 = new vd3_2();
        Object object7 = n3;
        object4 = new Pair("page_pos", object7);
        object5 = "KEY_PAGE";
        object7 = new Pair(object5, object);
        object = new Pair[2];
        object[0] = object4;
        object[bl2] = object7;
        object = DE.b((Pair[])object);
        ((Fragment)object2).setArguments((Bundle)object);
        object = this.getActivity();
        int n4 = object instanceof AjioHomeActivity;
        if (n4 != 0) {
            object = this.g;
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
            object = (AjioHomeActivity)object;
            object7 = this.p;
            string3 = "stories_tag";
            j3$a.a((j3_0)object, (Fragment)object7, (Fragment)object2, bl2, string3);
            if (string2 != null) {
                object = E1.a("screen_type", "story screen");
                object2 = sq0_1.a;
                Intrinsics.checkNotNullParameter(string2, "screenName");
                Intrinsics.checkNotNullParameter(object, "bundle");
                object2 = sq0_1.d;
                object7 = new rq0_1(string2, (Bundle)object, null);
                n4 = 3;
                Ae3.d((i90_0)object2, null, null, (Function2)object7, n4);
            }
        }
    }

    public final void b8(double d2, double d5) {
        ff0_2 ff0_22;
        this.I = ff0_22 = new ff0_2();
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ff0_22.j = this;
        ff0_22 = this.I;
        if (ff0_22 != null) {
            string2 = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, string2);
            ff0_22.i = this;
        }
        if ((ff0_22 = this.I) != null) {
            ff0_22.l = d2;
            ff0_22.m = d5;
        }
        if (ff0_22 != null) {
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string3 = "CartLocationBottomSheet";
            ff0_22.show(fragmentManager, string3);
        }
    }

    public final void bb() {
        this.Qa().a.clear();
        this.Qa().c.clear();
        Object object = this.q;
        String string2 = "fleekViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        vJ0$b vJ0$b = vJ0$b.a;
        ((dr0_0)object).M(vJ0$b);
        object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ((dr0_0)object).U();
        object = pp0_0.a;
        object = new qg3_2(2, null);
        Ae3.d(pp0_0.b, null, null, (Function2)object, 3);
    }

    public final void cb() {
        Object object = this.getActivity();
        boolean bl2 = object instanceof AjioHomeActivity;
        object = bl2 ? (AjioHomeActivity)object : null;
        if (object != null) {
            Object object2;
            object = this.p;
            if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                q9_0.Companion.getClass();
                object2 = q9_0.Q2;
                object = ((FragmentManager)object).E((String)object2);
            } else {
                object = null;
            }
            bl2 = object instanceof q9_0;
            object = bl2 ? (q9_0)object : null;
            if (object != null) {
                object2 = this.q;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                    bl2 = false;
                    object2 = null;
                }
                Boolean bl3 = Boolean.FALSE;
                ((dr0_0)object2).l.setValue(bl3);
                AjioHomeActivity.Companion.getClass();
                object2 = AjioHomeActivity.D1;
                if (object2 != null && !(bl2 = object2.isEmpty())) {
                    object2 = AjioHomeActivity.D1;
                    if (object2 != null) {
                        ((AbstractCollection)object2).clear();
                    }
                    ((q9_0)object).I2 = null;
                }
            }
        }
    }

    public final boolean d1(int n3, int n4) {
        int n7 = 53;
        int n8 = -1;
        Object object = "fleekViewModel";
        if (n3 == n7 && n4 == n8) {
            Object object2;
            Object object3 = this.getArguments();
            n4 = 103;
            if (object3 != null && (n3 = (int)((object3 = this.requireArguments()).containsKey((String)(object2 = "PLP_TYPE")) ? 1 : 0)) != 0) {
                object3 = this.requireArguments();
                n4 = object3.getInt((String)object2, n4);
            }
            if ((object3 = this.q) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n3 = 0;
                object3 = null;
            }
            if ((object3 = ((dr0_0)object3).A0.b) != null && (object3 = ((Product)object3).getFnlColorVariantData()) != null && (object3 = ((ProductFnlColorVariantData)object3).getColorGroup()) != null && (n7 = ((String)object3).length()) > 0) {
                object2 = this.i;
                if (object2 != null) {
                    object2.startLoader();
                }
                if ((object2 = this.q) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n7 = 0;
                    object2 = null;
                }
                object2.getClass();
                Intrinsics.checkNotNullParameter(object3, "productCode");
                aW aW2 = md3_0.c((jD3)object2);
                object = new ER0(n4, null, (dr0_0)object2, (String)object3);
                n3 = 3;
                Ae3.d(aW2, null, null, (Function2)object, n3);
            }
        } else {
            n7 = 68;
            if (n3 == n7) {
                if (n4 == n8) {
                    Function0 function0 = this.v;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    xp0_1 xp0_12 = new Object();
                    this.v = xp0_12;
                }
            } else {
                n4 = 1818;
                n7 = 0;
                Object var7_11 = null;
                if (n3 == n4) {
                    dr0_0 dr0_02 = this.q;
                    if (dr0_02 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        n3 = 0;
                        dr0_02 = null;
                    }
                    dr0_02.H0 = false;
                    dr0_02 = this.q;
                    if (dr0_02 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        n3 = 0;
                        dr0_02 = null;
                    }
                    zr1_1 zr1_12 = dr0_02.p;
                    zr1_12.k(null);
                    dr0_02.q = null;
                } else {
                    n4 = 55;
                    if (n3 == n4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void db() {
        String[] stringArray;
        int n3 = this.isAdded();
        if (n3 == 0) return;
        n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4 && (stringArray = this.y) != null) {
            n3 = (int)(stringArray.isEmpty() ? 1 : 0);
            n4 = 1;
            if ((n3 ^= n4) == n4) {
                stringArray = this.y;
                Intrinsics.checkNotNull(stringArray);
                n3 = stringArray.size();
                stringArray = new String[n3];
                ArrayList arrayList = this.y;
                Intrinsics.checkNotNull(arrayList);
                stringArray = arrayList.toArray(stringArray);
                n4 = 1987;
                this.requestPermissions(stringArray, n4);
                return;
            }
        }
        if ((stringArray = this.z) != null) {
            stringArray.dismissAllowingStateLoss();
        }
        this.eb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void eb() {
        SecurityException securityException2;
        block3: {
            Object object;
            block2: {
                try {
                    object = this.A;
                    if (object == null) return;
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 23;
                    if (n3 < n4 || (object = this.y) == null) break block2;
                    n3 = ((ArrayList)object).size();
                    if (n3 != 0) return;
                }
                catch (SecurityException securityException2) {
                    break block3;
                }
            }
            if ((object = this.A) == null) return;
            Object object2 = ((ey0_1)object).b;
            if (object2 == null) return;
            if ((object2 = object2.getLastLocation()) == null) return;
            cy0_2 cy0_22 = new cy0_2(object, 0);
            object = new me_1(cy0_22);
            ((Task)object2).addOnSuccessListener((OnSuccessListener)object);
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(securityException2);
    }

    public final void fb(CartDeliveryAddress cartDeliveryAddress) {
        if (cartDeliveryAddress != null) {
            Object object = this.q;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                object = null;
            }
            object = ((dr0_0)object).I0;
            ((h83_0)object).setValue(cartDeliveryAddress);
        }
    }

    public final void loadCartBasedOnSelectedAddress(String string2, String object) {
        object = this.H;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.G) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.I) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        object = new CartDeliveryAddress();
        AddressType addressType = AddressType.Pincode;
        ((CartDeliveryAddress)object).setAddressType(addressType);
        ((CartDeliveryAddress)object).setPostalCode(string2);
        jo_2 jo_22 = this.a;
        jo_22.putPreference("SHOULD_PINCODE_REFRESH_HOME_PAGE", true);
        jo_22.F((CartDeliveryAddress)object);
        jo_22.G(string2);
        this.fb((CartDeliveryAddress)object);
        this.bb();
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = -1;
        switch (n3) {
            default: {
                break;
            }
            case 1986: {
                this.db();
                break;
            }
            case 1985: {
                if (n4 == n7) break;
                hv3_0.a.getClass();
                String string2 = "android.permission.POST_NOTIFICATIONS";
                hv3_0.R(string2);
                break;
            }
            case 1984: {
                if (n4 != n7) break;
                this.eb();
            }
        }
        super.onActivityResult(n3, n4, intent);
    }

    public final void onAttach(Context object) {
        Object[] objectArray;
        String string2;
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object[] objectArray2 = this.getActivity();
        this.g = objectArray2;
        try {
            objectArray2 = (OnFragmentInteractionListener)objectArray2;
            this.h = objectArray2;
        }
        catch (ClassCastException classCastException) {
            yn3_0.a.e(classCastException);
            objectArray2 = this.g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(objectArray2);
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            objectArray2 = stringBuilder.toString();
            ClassCastException classCastException2 = new ClassCastException((String)objectArray2);
            throw classCastException2;
        }
        boolean bl2 = object instanceof j3_0;
        Object var4_6 = null;
        if (bl2) {
            objectArray2 = object;
            objectArray2 = (j3_0)object;
            this.i = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            string2 = "must implement ActivityFragmentListener";
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl2 = object instanceof vh3_2;
        if (bl2) {
            objectArray2 = object;
            objectArray2 = (vh3_2)object;
            this.k = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            string2 = "must implement TabListener";
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl2 = object instanceof fo3;
        if (bl2) {
            objectArray2 = object;
            objectArray2 = (fo3)object;
            this.j = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            string2 = "must implement ToolbarListener";
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl2 = object instanceof lz1_1;
        string2 = "must implement LoginListener";
        if (bl2) {
            objectArray2 = object;
            objectArray2 = (lz1_1)object;
            this.l = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl2 = object instanceof A71;
        if (bl2) {
            object = (A71)object;
            this.m = object;
        } else {
            object = yn3_0.a;
            objectArray2 = new Object[]{};
            ((yn3$a)object).d(string2, objectArray2);
        }
    }

    public final void onChangeLocationClick() {
        CartAddressListBottomSheet cartAddressListBottomSheet;
        this.G = cartAddressListBottomSheet = new CartAddressListBottomSheet();
        Object object = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(this, (String)object);
        cartAddressListBottomSheet.u = this;
        cartAddressListBottomSheet = this.G;
        if (cartAddressListBottomSheet != null) {
            object = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartLocationBottomSheet";
            cartAddressListBottomSheet.show((FragmentManager)object, string2);
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, (E$b)object2, (Wd0)object);
        object2 = dr0_0.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = "<this>";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object2 = Reflection.getOrCreateKotlinClass(object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            boolean bl2;
            int n3;
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object4).concat((String)object3);
            this.q = object = (dr0_0)((pD3)object).a((yn1_2)object2, (String)object3);
            object = this.getArguments();
            object2 = null;
            if (object != null) {
                object3 = "deep-link-url";
                boolean bl3 = object.containsKey((String)object3);
                string2 = "fleekViewModel";
                if (bl3) {
                    object4 = this.q;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl3 = false;
                        object4 = null;
                    }
                    ((dr0_0)object4).M = object3 = object.getString((String)object3);
                    object3 = this.q;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object3 = null;
                    }
                    if ((object3 = ((dr0_0)object3).M) != null && (n3 = ((String)object3).length()) != 0) {
                        object3 = this.q;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object3 = null;
                        }
                        object3 = ((dr0_0)object3).w0;
                        bl3 = true;
                        String string3 = "fleek_onboarding";
                        ((sw_0)object3).putPreference(string3, bl3);
                    }
                }
                if (bl3 = object.containsKey((String)(object3 = "deep-link-extra-bundle"))) {
                    object4 = this.q;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl3 = false;
                        object4 = null;
                    }
                    object.getBundle((String)object3);
                    object4.getClass();
                }
                if (bl3 = object.containsKey((String)(object3 = "deep-link-should-show-coachmark"))) {
                    object4 = this.q;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl3 = false;
                        object4 = null;
                    }
                    n3 = (int)(object.getBoolean((String)object3) ? 1 : 0);
                    ((dr0_0)object4).B0 = n3;
                }
                if (bl3 = object.containsKey((String)(object3 = "should_open_home"))) {
                    n3 = (int)(object.getBoolean((String)object3) ? 1 : 0);
                    this.r = n3;
                }
                if (bl3 = object.containsKey((String)(object3 = "is_via_internal_deeplink"))) {
                    this.s = bl2 = object.getBoolean((String)object3);
                }
            }
            if ((n3 = (object = this.getActivity()) instanceof AjioHomeActivity) != 0) {
                object = (AjioHomeActivity)object;
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                object2 = ((AjioHomeActivity)object).T0;
            }
            this.p = object2;
            object = new qp0_0(this);
            gp0_1.b((Function0)object, this);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fleek_compose_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] object2) {
        String string2 = "permissions";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "grantResults");
        object = new ArrayList();
        int n4 = 1987;
        if (n3 == n4) {
            object2 = Looper.getMainLooper();
            Object object3 = new Handler((Looper)object2);
            object2 = new bq0_2;
            ((bq0_2)object2)(this);
            long l2 = 500L;
            object3.postDelayed((Runnable)object2, l2);
            object3 = this.y;
            if (object3 != null) {
                int n7;
                Object object4;
                boolean bl2;
                object3 = ((ArrayList)object3).iterator();
                object2 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                while (true) {
                    n4 = (int)(object3.hasNext() ? 1 : 0);
                    bl2 = true;
                    if (n4 == 0) break;
                    object2 = object3.next();
                    Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                    object2 = (String)object2;
                    object4 = hv3_0.a;
                    object4.getClass();
                    boolean bl3 = hv3_0.R((String)object2);
                    if (!bl3) {
                        ((ArrayList)object).add(object2);
                    }
                    if ((n4 = (int)(Intrinsics.areEqual(object2, object4 = "android.permission.POST_NOTIFICATIONS") ? 1 : 0)) == 0) continue;
                    object2 = this.getActivity();
                    hv3_0.a((FragmentActivity)object2, bl2);
                }
                object3 = new Gson();
                object3 = ((Gson)object3).toJson(object);
                Intrinsics.checkNotNull(object3);
                object2 = this.a;
                object2.getClass();
                Intrinsics.checkNotNullParameter(object3, "permissionsRejectedString");
                object4 = "permissions_not_granted";
                ((sw_0)object2).putPreference((String)object4, (String)object3);
                n3 = ((ArrayList)object).size();
                if (n3 == 0 || (n3 = Build.VERSION.SDK_INT) < (n7 = 23)) {
                    object3 = this.y;
                    if (object3 != null) {
                        ((ArrayList)object3).clear();
                    }
                    if ((object3 = this.getContext()) != null) {
                        object = new GoogleApiClient$Builder((Context)object3);
                        object3 = LocationServices.API;
                        object3 = ((GoogleApiClient$Builder)object).addApi((Api)object3).build();
                        Intrinsics.checkNotNullExpressionValue(object3, "build(...)");
                        ((GoogleApiClient)object3).connect();
                        object = LocationRequest.create();
                        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
                        n4 = 100;
                        ((LocationRequest)object).setPriority(n4);
                        ((LocationRequest)object).setInterval(10000L);
                        long l3 = 5000L;
                        ((LocationRequest)object).setFastestInterval(l3);
                        object2 = new LocationSettingsRequest$Builder();
                        object = ((LocationSettingsRequest$Builder)object2).addLocationRequest((LocationRequest)object);
                        Intrinsics.checkNotNullExpressionValue(object, "addLocationRequest(...)");
                        ((LocationSettingsRequest$Builder)object).setAlwaysShow(bl2);
                        object2 = LocationServices.SettingsApi;
                        object = ((LocationSettingsRequest$Builder)object).build();
                        object3 = object2.checkLocationSettings((GoogleApiClient)object3, (LocationSettingsRequest)object);
                        Intrinsics.checkNotNullExpressionValue(object3, "checkLocationSettings(...)");
                        object = new gq0_1(this);
                        ((PendingResult)object3).setResultCallback((ResultCallback)object);
                    }
                }
            }
        }
    }

    public final void onResume() {
        Object object;
        Object object2;
        super.onResume();
        View view = null;
        og1_1.g(false, false);
        boolean bl2 = true;
        og1_1.g(false, bl2);
        int n3 = s20.a;
        if (n3 != 0) {
            s20.a = bl2;
        } else {
            od3_2.a = "";
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            object = new jo_2((Context)object2);
            object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
            ((jo_2)object).E((String)object2);
        }
        n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4 && (object2 = this.getActivity()) != null && (object2 = object2.getWindow()) != null) {
            object2.clearFlags(0x4000000);
            object2.addFlags(-1 << -1);
            int n7 = Color.parseColor((String)"#FF060C10");
            object2.setStatusBarColor(n7);
            View view2 = object2.getDecorView();
            int n8 = 8192;
            view2.setSystemUiVisibility(n8);
            n7 = 30;
            if (n3 >= n7) {
                object = G31.a((Window)object2);
                if (object != null) {
                    lp0_0.b((WindowInsetsController)object);
                }
            } else {
                object2 = object2.getDecorView();
                n7 = 26;
                if (n3 >= n7) {
                    n8 = 8208;
                }
                object2.setSystemUiVisibility(n8);
            }
        }
        if ((object = this.j) != null) {
            object.hideToolbarLayout();
        }
        if ((object = this.k) != null) {
            object.showTabLayout(false);
        }
        if ((view = this.getView()) != null) {
            view.setFocusableInTouchMode(bl2);
            view.requestFocus();
            aq0_1 aq0_12 = new aq0_1(this);
            view.setOnKeyListener((View.OnKeyListener)aq0_12);
        }
        this.Q5();
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.fleek_compose;
        object = (ComposeView)object.findViewById(n3);
        n3 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            bl2 = false;
            object = null;
        }
        Object object3 = new jq0_2(this);
        int n4 = -2015698767;
        boolean bl3 = true;
        Object object4 = new u10(n4, object3, bl3);
        ((ComposeView)((Object)object)).setContent((Function2)object4);
        object = new yp0_2(this, 0);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(object, "callback");
        object3 = nu1_0.a(this);
        object4 = new ep0_1(this, (yp0_2)object, null);
        Ae3.d((i90_0)object3, null, null, (Function2)object4, 3);
        object = ((h5_0)this.E.getValue()).f;
        object2 = this.getViewLifecycleOwner();
        object3 = new cq0_2(this, 0);
        object4 = new fq0$b_0((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        bl2 = h40_0.Q1();
        if (bl2) {
            object = this.a.l();
            object2 = this.Sa();
            n3 = (int)(object2.isUserOnline() ? 1 : 0);
            if (n3 != 0) {
                AJIOApplication.Companion.getClass();
                object2 = AJIOApplication$a.a();
                n3 = (int)(object2.d ? 1 : 0);
                if (n3 != 0) {
                    this.Ra();
                    object = AJIOApplication$a.a();
                    n3 = 0;
                    object2 = null;
                    ((AJIOApplication)object).d = false;
                } else if (object != null) {
                    this.fb((CartDeliveryAddress)object);
                } else {
                    this.Ra();
                }
            } else if (object != null) {
                object2 = ((CartDeliveryAddress)object).getPostalCode();
                if (object2 != null && (n3 = object2.length()) != 0) {
                    object2 = AddressType.Pincode;
                    ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
                    this.fb((CartDeliveryAddress)object);
                } else {
                    object2 = ((CartDeliveryAddress)object).getAddressType();
                    if (object2 == null) {
                        object2 = AddressType.None;
                        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
                    }
                    this.fb((CartDeliveryAddress)object);
                }
            } else {
                object = new CartDeliveryAddress();
                object2 = ((CartDeliveryAddress)object).getAddressType();
                if (object2 == null) {
                    object2 = AddressType.None;
                    ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
                }
                this.fb((CartDeliveryAddress)object);
            }
        }
    }

    public final void q4(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "pinCode");
        Object object2 = new fo_1();
        this.H = object2;
        ((fo_1)object2).h = bl2 = true;
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ((fo_1)object2).i = this;
        object2 = this.H;
        if (object2 != null) {
            ((fo_1)object2).Ra((String)object);
        }
        if ((object = this.H) != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.H) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void z8(CartDeliveryAddress cartDeliveryAddress) {
        int n3;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        Object object = this.H;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.G) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        object = AddressType.Address;
        cartDeliveryAddress.setAddressType((AddressType)((Object)object));
        object = cartDeliveryAddress.getFormattedAddress();
        if (object == null || (n3 = ((String)object).length()) == 0) {
            object = ai0_2.g(cartDeliveryAddress);
            cartDeliveryAddress.setFormattedAddress((String)object);
        }
        jo_2 jo_22 = this.a;
        jo_22.putPreference("SHOULD_PINCODE_REFRESH_HOME_PAGE", true);
        jo_22.F(cartDeliveryAddress);
        object = cartDeliveryAddress.getPostalCode();
        jo_22.G((String)object);
        this.fb(cartDeliveryAddress);
        this.bb();
    }
}

