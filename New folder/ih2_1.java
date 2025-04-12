/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.R$dimen;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.databinding.ItemRowAjiogramProductsPdpBinding;
import com.ril.ajio.pdprefresh.data.AjiogramInterventions;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobSupport;
import org.json.JSONObject;

/*
 * Renamed from Ih2
 */
public final class ih2_1
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final zh2_0 c;
    public final OnGAEventHandlerListener d;
    public final AjiogramInterventions e;
    public boolean f;
    public final ItemRowAjiogramProductsPdpBinding g;
    public ch2_2 h;
    public mb3_2 i;
    public AjiogramInterventions j;
    public int k;
    public final long l;
    public final int m;

    public ih2_1(View object, yi2_1 yi2_12, zh2_0 zh2_02, OnGAEventHandlerListener onGAEventHandlerListener, AjiogramInterventions ajiogramInterventions) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(zh2_02, "onAjiogramWidgetClickListener");
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        this.c = zh2_02;
        this.d = onGAEventHandlerListener;
        this.e = ajiogramInterventions;
        this.l = 50;
        this.m = 5;
        Intrinsics.checkNotNullParameter(object, "itemView");
        object = ItemRowAjiogramProductsPdpBinding.bind(object);
        this.g = object;
    }

    /*
     * Unable to fully structure code
     */
    public static final j90_0 w(ih2_1 var0, f80_0 var1_1) {
        block4: {
            block5: {
                var0.getClass();
                var2_2 = var1_1 instanceof gh2_2;
                if (!var2_2) ** GOTO lbl-1000
                var3_3 = var1_1;
                var3_3 = (gh2_2)var1_1;
                var4_4 = var3_3.d;
                var5_5 = -1 << -1;
                var6_6 = var4_4 & var5_5;
                if (var6_6 != 0) {
                    var3_3.d = var4_4 -= var5_5;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = new gh2_2((ih2_1)var0, (f80_0)var1_1);
                }
                var1_1 = var3_3.b;
                var7_7 = j90_0.COROUTINE_SUSPENDED;
                var5_5 = var3_3.d;
                var6_6 = 1;
                if (var5_5 == 0) break block4;
                if (var5_5 != var6_6) break block5;
                var0 = var3_3.a;
                vl2_2.b(var1_1);
                ** GOTO lbl39
            }
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
        }
        vl2_2.b(var1_1);
        var1_1 = new Ref$ObjectRef();
        var1_1.element = var0;
        var0 = var1_1;
        while (true) {
            var1_1 = ir0_2.a;
            var1_1 = bg1_1.a;
            var8_8 = new hh2_2((Ref$ObjectRef)var0, null);
            var3_3.a = var0;
            var3_3.d = var6_6;
            if ((var1_1 = Ae3.g(var3_3, (CoroutineContext)var1_1, var8_8)) == var7_7) {
                return var7_7;
            }
lbl39:
            // 3 sources

            var0.element = var1_1 = (ih2_1)var0.element;
        }
    }

    public final void A() {
        Object object = this.i;
        if (object != null) {
            ((JobSupport)object).d(null);
        }
        this.i = null;
        object = this.g;
        if (object != null && (object = ((ItemRowAjiogramProductsPdpBinding)object).rvAjiogramProducts) != null) {
            ((RecyclerView)object).stopScroll();
        }
    }

    public final void x(int n3, List object) {
        Object object2 = new ArrayList();
        int n4 = this.k;
        int n7 = 1;
        if (n3 >= n4) {
            if (n4 <= n3) {
                while (true) {
                    int n8;
                    if (n4 < (n8 = object.size())) {
                        boolean bl2;
                        Iterator iterator = ((Iterable)object.get(n4)).iterator();
                        int n10 = 0;
                        while (bl2 = iterator.hasNext()) {
                            Object object3 = iterator.next();
                            int n14 = n10 + 1;
                            if (n10 >= 0) {
                                object3 = (Product)object3;
                                List list = (List)object.get(n4);
                                int n15 = list.size() * n4 + n10;
                                ((Product)object3).setPosition(n15);
                                ((Product)object3).setGaFiredInCurrentSession(n7 != 0);
                                ((ArrayList)object2).add(object3);
                                n10 = n14;
                                continue;
                            }
                            xx_2.n();
                            throw null;
                        }
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
            this.k = n3 += n7;
        }
        if ((n3 = object2.isEmpty() ^ n7) != 0) {
            Object object4 = this.b.Y6();
            object = new Message();
            ((Message)object).what = n4 = 1001;
            JSONObject jSONObject = new JSONObject();
            String string2 = "productImpression";
            jSONObject.put(string2, object2);
            jSONObject.put("listName", object4);
            jSONObject.put("sizeText", (Object)"NA");
            jSONObject.put("isPLP", false);
            object2 = "pdp screen";
            jSONObject.put("screenName", object2);
            jSONObject.put("screenType", object2);
            ((Message)object).obj = jSONObject;
            object4 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object);
            object = this.d;
            ((AnalyticsGAEventHandler)((Object)object4)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void y(List var1_1) {
        block33: {
            block30: {
                block29: {
                    block32: {
                        block31: {
                            var2_2 = this.e;
                            this.j = var2_2;
                            var3_4 = this.g;
                            if (var3_4 == null) return;
                            var4_5 = var3_4.tvButton;
                            var5_6 = 0;
                            var6_7 = null;
                            if (var2_2 != null) {
                                var7_8 = var2_2.getPdp_widget_cta();
                            } else {
                                var8_9 = 0;
                                var7_8 = null;
                            }
                            var4_5.setText((CharSequence)var7_8);
                            var4_5 = var3_4.tvTitle;
                            if (var2_2 != null) {
                                var6_7 = var2_2.getPdp_widget_title();
                            }
                            var4_5.setText((CharSequence)var6_7);
                            var4_5 = "tvTitle";
                            if (var2_2 != null && (var6_7 = var2_2.getPdp_widget_title()) != null && (var5_6 = var6_7.length()) > 0) {
                                var6_7 = var3_4.tvTitle;
                                var7_8 = var2_2.getPdp_widget_title();
                                var6_7.setText((CharSequence)var7_8);
                                var6_7 = var3_4.tvTitle;
                                Intrinsics.checkNotNullExpressionValue(var6_7, (String)var4_5);
                                ai0_2.B((View)var6_7);
                            } else {
                                var6_7 = var3_4.tvTitle;
                                Intrinsics.checkNotNullExpressionValue(var6_7, (String)var4_5);
                                ai0_2.i((View)var6_7);
                            }
                            var6_7 = "tvButton";
                            if (var2_2 != null && (var7_8 = var2_2.getPdp_widget_cta()) != null && (var8_9 = var7_8.length()) > 0) {
                                var7_8 = var3_4.tvButton;
                                var9_10 = var2_2.getPdp_widget_cta();
                                var7_8.setText((CharSequence)var9_10);
                                var7_8 = var3_4.tvButton;
                                Intrinsics.checkNotNullExpressionValue(var7_8, (String)var6_7);
                                ai0_2.B((View)var7_8);
                            } else {
                                var7_8 = var3_4.tvButton;
                                Intrinsics.checkNotNullExpressionValue(var7_8, (String)var6_7);
                                ai0_2.i((View)var7_8);
                            }
                            if (var2_2 != null && (var7_8 = var2_2.getTag_image()) != null && (var8_9 = var7_8.length()) > 0) {
                                var7_8 = var3_4.tvButton;
                                var9_10 = var2_2.getPdp_widget_cta();
                                var7_8.setText((CharSequence)var9_10);
                                var7_8 = var3_4.tvButton;
                                Intrinsics.checkNotNullExpressionValue(var7_8, (String)var6_7);
                                ai0_2.B((View)var7_8);
                            } else {
                                var7_8 = var3_4.tvButton;
                                Intrinsics.checkNotNullExpressionValue(var7_8, (String)var6_7);
                                ai0_2.i((View)var7_8);
                            }
                            var8_9 = 1;
                            var9_10 = null;
                            var10_11 = "ivButton";
                            var11_12 = "ivTitle";
                            if (var2_2 != null && (var12_13 /* !! */  = var2_2.getTag_image()) != null && (var13_14 = var12_13 /* !! */ .length()) > 0) {
                                var12_13 /* !! */  = var3_4.ivTitle;
                                Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , var11_12);
                                ai0_2.B((View)var12_13 /* !! */ );
                                var12_13 /* !! */  = var3_4.ivButton;
                                Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , var10_11);
                                ai0_2.B((View)var12_13 /* !! */ );
                                cp_1.Companion.getClass();
                                var12_13 /* !! */  = cp$a.e();
                                var14_15 /* !! */  = var2_2.getTag_image();
                                var12_13 /* !! */ .getClass();
                                if (var14_15 /* !! */  != null && (var13_14 = (int)StringsKt.F((CharSequence)var14_15 /* !! */ , var12_13 /* !! */  = ".gif", false)) == var8_9) {
                                    var12_13 /* !! */  = da_2.Companion;
                                    var14_15 /* !! */  = var3_4.ivTitle;
                                    Intrinsics.checkNotNullExpressionValue(var14_15 /* !! */ , var11_12);
                                    var15_16 = var2_2.getTag_image();
                                    var12_13 /* !! */ .getClass();
                                    da$b.c((ImageView)var14_15 /* !! */ , var15_16);
                                    var12_13 /* !! */  = var3_4.ivButton;
                                    Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , var10_11);
                                    var14_15 /* !! */  = var2_2.getTag_image();
                                    da$b.c((ImageView)var12_13 /* !! */ , (String)var14_15 /* !! */ );
                                } else {
                                    var12_13 /* !! */  = da_2.Companion;
                                    var14_15 /* !! */  = var3_4.ivTitle;
                                    Intrinsics.checkNotNullExpressionValue(var14_15 /* !! */ , var11_12);
                                    var15_17 = var2_2.getTag_image();
                                    var12_13 /* !! */ .getClass();
                                    da$b.d((ImageView)var14_15 /* !! */ , var15_17);
                                    var12_13 /* !! */  = var3_4.ivButton;
                                    Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , var10_11);
                                    var14_15 /* !! */  = var2_2.getTag_image();
                                    da$b.d((ImageView)var12_13 /* !! */ , (String)var14_15 /* !! */ );
                                }
                            } else {
                                var12_13 /* !! */  = var3_4.ivTitle;
                                Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , var11_12);
                                ai0_2.i((View)var12_13 /* !! */ );
                                var12_13 /* !! */  = var3_4.ivButton;
                                Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , var10_11);
                                ai0_2.i((View)var12_13 /* !! */ );
                            }
                            var12_13 /* !! */  = var3_4.layoutTitle;
                            Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , "layoutTitle");
                            var14_15 /* !! */  = var3_4.tvTitle;
                            Intrinsics.checkNotNullExpressionValue(var14_15 /* !! */ , (String)var4_5);
                            var16_18 = var14_15 /* !! */ .getVisibility();
                            if (var16_18 == 0) ** GOTO lbl-1000
                            var4_5 = var3_4.ivTitle;
                            Intrinsics.checkNotNullExpressionValue(var4_5, var11_12);
                            var16_18 = var4_5.getVisibility();
                            if (var16_18 == 0) lbl-1000:
                            // 2 sources

                            {
                                var16_18 = 1;
                            } else {
                                var16_18 = 0;
                                var4_5 = null;
                            }
                            var17_19 = 8;
                            if (var16_18 != 0) {
                                var16_18 = 0;
                                var4_5 = null;
                            } else {
                                var16_18 = 8;
                            }
                            var12_13 /* !! */ .setVisibility(var16_18);
                            var4_5 = var3_4.layoutButton;
                            Intrinsics.checkNotNullExpressionValue(var4_5, "layoutButton");
                            var12_13 /* !! */  = var3_4.tvButton;
                            Intrinsics.checkNotNullExpressionValue(var12_13 /* !! */ , (String)var6_7);
                            var5_6 = var12_13 /* !! */ .getVisibility();
                            if (var5_6 == 0) break block31;
                            var6_7 = var3_4.ivButton;
                            Intrinsics.checkNotNullExpressionValue(var6_7, var10_11);
                            var5_6 = var6_7.getVisibility();
                            if (var5_6 != 0) break block32;
                        }
                        var17_19 = 0;
                        var11_12 = null;
                    }
                    var4_5.setVisibility(var17_19);
                    if (var2_2 != null) {
                        try {
                            var4_5 = var2_2.getTag_text_color();
                            if (var4_5 == null) break block29;
                            var16_18 = Color.parseColor((String)var4_5);
                            var6_7 = var3_4.tvButton;
                            var6_7.setTextColor(var16_18);
                        }
                        catch (Exception var2_3) {
                            break block30;
                        }
                    }
                }
                if (var2_2 != null && (var2_2 = var2_2.getTag_bg_color()) != null) {
                    var18_20 = Color.parseColor((String)var2_2);
                    var4_5 = var3_4.layoutButton;
                    var2_2 = ColorStateList.valueOf((int)var18_20);
                    var4_5.setBackgroundTintList((ColorStateList)var2_2);
                }
                break block33;
            }
            var2_3.getMessage();
        }
        var2_2 = var3_4.layoutButton;
        var4_5 = new dh2_2(this);
        var2_2.setOnClickListener((View.OnClickListener)var4_5);
        var2_2 = "rvAjiogramProducts";
        if (var1_1 != null) {
            var4_5 = var1_1;
            var4_5 = (Collection)var1_1;
            var16_18 = var4_5.isEmpty() ^ var8_9;
            if (var16_18 == var8_9) {
                var4_5 = var3_4.rvAjiogramProducts;
                var7_8 = var4_5.getContext();
                var6_7 = new LinearLayoutManager((Context)var7_8, 0, false);
                var4_5.setLayoutManager((RecyclerView$o)var6_7);
                var4_5 = var3_4.rvAjiogramProducts;
                var8_9 = hv3_0.q(R$dimen.margin_8);
                var6_7 = new t91(var8_9);
                var4_5.addItemDecoration((RecyclerView$n)var6_7);
                var6_7 = new eh2_1(this, (List)var1_1);
                var7_8 = this.c;
                this.h = var4_5 = new ch2_2((List)var1_1, (zh2_0)var7_8, (eh2_1)var6_7);
                var6_7 = var3_4.rvAjiogramProducts;
                var6_7.setAdapter((RecyclerView$f)var4_5);
                var4_5 = var3_4.rvAjiogramProducts;
                Intrinsics.checkNotNullExpressionValue(var4_5, (String)var2_2);
                ai0_2.B((View)var4_5);
                var3_4.rvAjiogramProducts.clearOnScrollListeners();
                var2_2 = var3_4.rvAjiogramProducts;
                var4_5 = new Ih2$a(this, (List)var1_1);
                var2_2.addOnScrollListener((RecyclerView$s)var4_5);
                var1_1 = var3_4.rvAjiogramProducts;
                var2_2 = new fh2_2(this);
                var1_1.setCustomTouchListener((Function1)var2_2);
                this.z();
                return;
            }
        }
        this.A();
        var1_1 = var3_4.rvAjiogramProducts;
        Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
        ai0_2.i((View)var1_1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z() {
        int n3;
        Object object = this.j;
        boolean bl2 = false;
        mb3_2 mb3_22 = null;
        if (object != null) {
            object = ((AjiogramInterventions)object).getPdp_widget_autoscroll_enabled();
            Boolean bl3 = Boolean.TRUE;
            n3 = Intrinsics.areEqual(object, bl3);
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 != 0) {
            object = this.h;
            if (object != null) {
                object = ((ch2_2)object).a;
                n3 = object.size();
            } else {
                n3 = 0;
                object = null;
            }
            int n4 = 2;
            if (n3 > n4) {
                object = this.i;
                if (object != null && (n3 = (int)(((JobSupport)object).isActive() ? 1 : 0)) == (n4 = 1)) {
                    bl2 = true;
                }
                if (bl2) return;
                object = this.b.k2();
                bl2 = false;
                mb3_22 = null;
                if (object != null) {
                    object = nu1_0.a((mu1_1)object);
                    Ih2$b ih2$b = new Ih2$b(this, null);
                    int n7 = 3;
                    mb3_22 = Ae3.d((i90_0)object, null, null, ih2$b, n7);
                }
                this.i = mb3_22;
                return;
            }
        }
        this.A();
    }
}

