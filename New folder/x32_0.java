/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Sort;
import com.ril.ajio.services.query.ProductListQuery;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from x32
 */
public class x32_0
extends BottomSheetDialogFragment
implements d92 {
    public static final x32$a Companion;
    public boolean a;
    public jv2_0 b;
    public LinearLayout c;
    public RecyclerView d;
    public View e;
    public final hh3_2 f;

    static {
        x32$a x32$a;
        Companion = x32$a = new Object();
    }

    public x32_0() {
        Object object = new vr0_2(this, 2);
        this.f = object = yr1_2.b((Function0)object);
    }

    /*
     * Unable to fully structure code
     */
    public final void D3(Sort var1_1) {
        block18: {
            block20: {
                block19: {
                    var2_2 = var1_1;
                    if (var1_1 == null) {
                        this.dismiss();
                        return;
                    }
                    var3_3 = this.Oa();
                    if (var3_3 == null) break block18;
                    var4_4 = "sort";
                    Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
                    var3_3 = var3_3.d;
                    var3_3.getClass();
                    Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
                    var3_3.e1 = true;
                    var5_5 = var3_3.B;
                    var6_6 = null;
                    if (!var5_5) break block19;
                    var4_4 = var3_3.P;
                    if (var4_4 != null) {
                        var4_4.setCurrentPage(0);
                    }
                    if ((var4_4 = var3_3.P) != null) {
                        var4_4.setSelectedSort((Sort)var2_2);
                    }
                    var4_4 = var3_3.P;
                    Intrinsics.checkNotNull(var4_4);
                    var3_3.n((ProductListQuery)var4_4);
                    break block20;
                }
                var4_4 = var3_3.P;
                if (var4_4 != null) {
                    var4_4 = var4_4.getQueryText();
                } else {
                    var5_5 = false;
                    var4_4 = null;
                }
                if (var4_4 == null || (var4_4 = var3_3.z) == null || (var4_4 = var4_4.getCode()) == null || !(var5_5 = var4_4.length())) ** GOTO lbl-1000
                var4_4 = var3_3.P;
                if (var4_4 != null && (var4_4 = var4_4.getQueryText()) != null) {
                    var7_7 = var3_3.z;
                    var7_7 = var7_7 != null ? var7_7.getCode() : null;
                    Intrinsics.checkNotNull(var7_7);
                    var5_5 = StringsKt.F((CharSequence)var4_4, (CharSequence)var7_7, false);
                    var4_4 = var5_5;
                } else {
                    var5_5 = false;
                    var4_4 = null;
                }
                Intrinsics.checkNotNull(var4_4);
                var5_5 = var4_4.booleanValue();
                if (var5_5) {
                    var4_4 = var3_3.P;
                    if (var4_4 != null) {
                        var7_7 = var4_4.getQueryText();
                        if (var7_7 != null) {
                            var8_8 = var3_3.z;
                            var8_8 = var8_8 != null ? var8_8.getCode() : null;
                            Intrinsics.checkNotNull(var8_8);
                            var9_9 = var1_1.getCode();
                            Intrinsics.checkNotNull(var9_9);
                            var7_7 = kotlin.text.b.n((String)var7_7, (String)var8_8, (String)var9_9, false);
                        } else {
                            var7_7 = null;
                        }
                        var4_4.setQueryText((String)var7_7);
                    }
                } else if ((var4_4 = var3_3.P) != null) {
                    var4_4.setSelectedSort((Sort)var2_2);
                }
                if ((var4_4 = var3_3.P) != null) {
                    var4_4.setCurrentPage(0);
                }
                var4_4 = var3_3.P;
                Intrinsics.checkNotNull(var4_4);
                var7_7 = Boolean.TRUE;
                var3_3.h((ProductListQuery)var4_4, (Boolean)var7_7);
            }
            var4_4 = AnalyticsManager.Companion;
            var7_7 = var4_4.getInstance().getGtmEvents();
            var8_8 = var1_1.getName();
            var9_9 = o72_0.a;
            var10_10 = "Sort";
            var7_7.pushButtonTapEvent(var10_10, var8_8, (String)var9_9);
            var7_7 = new HashMap();
            var9_9 = "Completed";
            var7_7.put("State", var9_9);
            var8_8 = var3_3.M;
            if (var8_8 != null) {
                var6_6 = var8_8.getFreeTextSearch();
            }
            var7_7.put("Name", var6_6);
            var8_8 = var1_1.getName();
            var7_7.put("Type", var8_8);
            var6_6 = var4_4.getInstance().getCt();
            var8_8 = new AnalyticsData$Builder();
            var7_7 = var8_8.eventMap((HashMap)var7_7).build();
            var6_6.productSort((AnalyticsData)var7_7);
            var6_6 = new Bundle();
            var8_8 = var1_1.getName();
            var6_6.putString("sort_name", (String)var8_8);
            var7_7 = FirebaseEvents.Companion.getInstance();
            var8_8 = "sort_applied";
            var7_7.sendEvent((String)var8_8, (Bundle)var6_6);
            var11_11 = new Bundle();
            var7_7 = var3_3.h1;
            var11_11.putString("plp_source", (String)var7_7);
            var6_6 = "plp_source_details";
            var7_7 = var3_3.i1;
            var11_11.putString((String)var6_6, (String)var7_7);
            var9_9 = var3_3.g1;
            var10_10 = var9_9.getEC_PRODUCT_LIST_INTERACTIONS();
            var2_2 = var1_1.getName();
            var12_12 = String.valueOf(var2_2);
            var13_13 = o72_0.a;
            var14_14 = bv_0.a((AnalyticsManager$Companion)var4_4);
            var15_15 = cv_0.a((AnalyticsManager$Companion)var4_4);
            var16_16 = 1536;
            var17_17 = "sort applied";
            var18_18 = "plp_sort_apply";
            var19_19 = "plp screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var9_9, var10_10, var17_17, var12_12, var18_18, var13_13, var19_19, var14_14, var11_11, var15_15, false, null, var16_16, null);
        }
        if ((var2_2 = this.Oa()) == null) ** GOTO lbl-1000
        var2_2 = this.Oa();
        Intrinsics.checkNotNull(var2_2);
        var2_2 = var2_2.d;
        var20_20 = var2_2.e1;
        if (var20_20) {
            var2_2 = this.Oa();
            Intrinsics.checkNotNull(var2_2);
            var2_2.d.e1 = false;
            var2_2 = this;
            var3_3 = this.b;
            if (var3_3 != null) {
                var3_3.P2();
            }
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = this;
        }
        this.dismiss();
    }

    public final F12 Oa() {
        return (F12)this.f.getValue();
    }

    public void Pa(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.main_lyt;
        Object object2 = (LinearLayout)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.plp_sort_cancel_layout;
        object2 = object.findViewById(n3);
        this.e = object2;
        n3 = R$id.plp_sort_view_rv;
        object = (RecyclerView)object.findViewById(n3);
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.d = object;
        object2 = "recyclerView";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        FragmentActivity fragmentActivity = this.requireActivity();
        int n4 = 1;
        Object object4 = new LinearLayoutManager((Context)fragmentActivity, n4, false);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object4);
        object = this.Oa();
        object = object != null ? ((F12)object).d() : null;
        if (object != null) {
            object = this.d;
            if (object != null) {
                object3 = object;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            }
            object2 = this.Oa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d();
            Intrinsics.checkNotNull(object2);
            object2 = ImmutableList.copyOf((Collection)object2);
            object4 = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            object = new u32_0((ImmutableList)object2, this);
            ((RecyclerView)object3).setAdapter((RecyclerView$f)object);
        }
    }

    public final void onCreate(Bundle object) {
        String string2;
        super.onCreate((Bundle)object);
        object = this.getParentFragment();
        int n3 = object instanceof jv2_0;
        if (n3 != 0) {
            object = this.getParentFragment();
            string2 = "null cannot be cast to non-null type com.ril.ajio.plp.PlpFilterSortListener";
            Intrinsics.checkNotNull(object, string2);
            object = (jv2_0)object;
            this.b = object;
        }
        if ((object = this.getArguments()) != null && (n3 = (object = this.requireArguments()).containsKey(string2 = "PLP_TYPE")) != 0) {
            int n4;
            int n7;
            object = this.getArguments();
            if (object != null) {
                n3 = object.getInt(string2);
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            string2 = null;
            if (object != null && (n7 = ((Integer)object).intValue()) == (n4 = 101)) {
                this.a = false;
            } else if (object != null && (n3 = ((Integer)object).intValue()) == (n7 = 103)) {
                n3 = 1;
                this.a = n3;
            } else {
                this.a = false;
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        v32 v322 = new v32((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)v322);
        return object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.plp_sort_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2 = this.a;
        String string2 = "onGetLayoutInflater(...)";
        if (bl2) {
            bundle = super.onGetLayoutInflater(bundle);
            Intrinsics.checkNotNullExpressionValue(bundle, string2);
            string2 = this.requireContext();
            int n3 = R$style.FleekTheme;
            d80 d802 = new d80((Context)string2, n3);
            bundle = bundle.cloneInContext((Context)d802);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        bundle = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(bundle, string2);
        return bundle;
    }

    public final void onViewCreated(View view, Bundle object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        super.onViewCreated(view, (Bundle)object);
        this.Pa(view);
        object = Looper.getMainLooper();
        view = new Handler((Looper)object);
        int n3 = 1;
        object = new hv0_0(this, n3);
        long l2 = 300L;
        view.postDelayed((Runnable)object, l2);
        view = this.e;
        if (view != null) {
            n3 = 1;
            object = new ds0_0(this, n3);
            view.setOnClickListener((View.OnClickListener)object);
        }
    }
}

