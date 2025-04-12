/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.TextAppearanceSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.view.animation.DecelerateInterpolator
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$x;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdp.data.BrickBrandSizes;
import com.ril.ajio.pdp.data.SizeChartAttribute;
import com.ril.ajio.pdprefresh.data.HowToMeasureProducts;
import com.ril.ajio.pdprefresh.data.InstructionCategory;
import com.ril.ajio.pdprefresh.data.PDPSizeChartBricks;
import com.ril.ajio.pdprefresh.data.PDPSizeGuideToggleData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomResponse;
import com.ril.ajio.services.data.user.LocationData;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class O63
implements View.OnClickListener,
oq2_0,
Animation.AnimationListener {
    public View A;
    public TabLayout B;
    public RecyclerView C;
    public ImageView D;
    public CardView E;
    public final Animation F;
    public final Animation G;
    public LinearLayout H;
    public SwitchCompat I;
    public AjioTextView J;
    public final h63_0 K;
    public boolean L;
    public String M;
    public int N;
    public final ArrayList O;
    public final boolean P;
    public final NewCustomEventsRevamp Q;
    public final String R;
    public final String S;
    public boolean T;
    public final yi2_1 a;
    public final c92 b;
    public final sj2_0 c;
    public final zi2_1 d;
    public final View e;
    public final LinearLayout f;
    public final boolean g;
    public final RecyclerView h;
    public TextView i;
    public List j;
    public AjioButton k;
    public LinearLayout l;
    public ImageView m;
    public AjioTextView n;
    public final Context o;
    public L12 p;
    public TextView q;
    public LinearLayout r;
    public RelativeLayout s;
    public TextView t;
    public TextView u;
    public TextView v;
    public RecyclerView w;
    public TextView x;
    public LinearLayout y;
    public ImageButton z;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public O63(yi2_1 object, c92 object2, sj2_0 sj2_02, zi2_1 object3, View object4, LinearLayout linearLayout, boolean bl2, RecyclerView recyclerView) {
        int n3;
        boolean bl3;
        block8: {
            block7: {
                void var8_9;
                void var7_8;
                void var6_7;
                Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
                Intrinsics.checkNotNullParameter(object2, "onSizeClickListener");
                Intrinsics.checkNotNullParameter(sj2_02, "pdpuiDelegateListener");
                Intrinsics.checkNotNullParameter(object3, "pdpInfoSetter");
                String string2 = "parentView";
                Intrinsics.checkNotNullParameter(object4, string2);
                this.a = object;
                this.b = object2;
                this.c = sj2_02;
                this.d = object3;
                this.e = object4;
                this.f = var6_7;
                this.g = var7_8;
                this.h = var8_9;
                object = object4.getContext();
                Intrinsics.checkNotNullExpressionValue(object, "getContext(...)");
                this.o = object;
                this.K = object = new h63_0();
                this.M = "in";
                object = new ArrayList();
                this.O = object;
                object = od3_2.a();
                object2 = ld3_2.STORE_AJIO.getStoreId();
                bl3 = ((String)object).equals(object2);
                object2 = "pdp_size_measure_image_instruction";
                n3 = 0;
                sj2_02 = null;
                if (bl3) {
                    object = h40_0.a;
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b((String)object2);
                    object3 = new Gson();
                    Class<PDPSizeChartBricks> clazz = PDPSizeChartBricks.class;
                    try {
                        object = ((Gson)object3).fromJson((String)object, clazz);
                        if ((object = (PDPSizeChartBricks)object) == null || (object = ((PDPSizeChartBricks)object).isEnable()) == null) break block7;
                        bl3 = (Boolean)object;
                        break block8;
                    }
                    catch (Exception exception) {}
                }
            }
            bl3 = false;
            object = null;
        }
        if (bl3) {
            object = h40_0.a;
            object = z40_0.Companion;
            object3 = AJIOApplication.Companion;
            object = Q.a((AJIOApplication$a)object3, (z40$a)object).a.b((String)object2);
            object2 = this.a.x5();
            bl3 = r32.a((Product)object2, (String)object);
            if (bl3) {
                n3 = 1;
            }
        }
        this.P = n3;
        object = AnalyticsManager.Companion;
        this.Q = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.R = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.S = object = cv_0.a((AnalyticsManager$Companion)object);
        object = this.o;
        int n4 = R$anim.pdp_size_slide_in;
        object = AnimationUtils.loadAnimation((Context)object, (int)n4);
        this.F = object;
        object2 = this.o;
        n3 = R$anim.pdp_size_slide_out;
        object2 = AnimationUtils.loadAnimation((Context)object2, (int)n3);
        this.G = object2;
        if (object2 != null) {
            object2.setAnimationListener((Animation.AnimationListener)this);
        }
        if (object != null) {
            object.setAnimationListener((Animation.AnimationListener)this);
        }
    }

    public static final void b(O63 o63, RecyclerView object, ArrayList object2) {
        int n3 = gv_1.b;
        if (n3 != 0) {
            o63.getClass();
        } else {
            int n4;
            Object object3;
            CharSequence charSequence;
            float f5;
            int n8;
            int n10;
            boolean bl2;
            Object object4;
            int n14;
            su_2 su_22;
            Object object5;
            Object object6;
            block21: {
                object6 = o63.j;
                object5 = null;
                su_22 = null;
                n14 = -1;
                if (object6 != null && (n3 = object6.isEmpty()) == 0) {
                    object6 = o63.w;
                    Object object7 = "recyclerView";
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n3 = 0;
                        object6 = null;
                    }
                    n3 = ig2_2.a((RecyclerView)object6);
                    object4 = o63.w;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        bl2 = false;
                        object4 = null;
                    }
                    if (object4 != null) {
                        object7 = ((RecyclerView)object4).getLayoutManager();
                    } else {
                        n10 = 0;
                        object7 = null;
                    }
                    object4 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager";
                    Intrinsics.checkNotNull(object7, (String)object4);
                    object7 = (LinearLayoutManager)object7;
                    n10 = ((LinearLayoutManager)object7).findLastCompletelyVisibleItemPosition();
                    if (n3 != n14 && n10 != n14 && (object4 = o63.j) != null) {
                        boolean n7;
                        object4 = ((Iterable)object4).iterator();
                        n8 = 0;
                        f5 = 0.0f;
                        charSequence = null;
                        while (n7 = object4.hasNext()) {
                            object3 = object4.next();
                            n4 = n8 + 1;
                            if (n8 >= 0) {
                                n7 = ((ProductOptionVariant)(object3 = (ProductOptionVariant)object3)).isStockAvailable();
                                if (n7 || n8 < n3 || n8 > n10) {
                                    n8 = n4;
                                    continue;
                                }
                                break block21;
                            }
                            xx_2.n();
                            throw null;
                        }
                    }
                }
                n8 = -1;
                f5 = 0.0f / 0.0f;
            }
            if (n8 != n14 && (n3 = (object = ((RecyclerView)object).findViewHolderForAdapterPosition(n8)) instanceof t32_0) != 0) {
                object = (t32_0)object;
                object2 = (ProductOptionVariant)object2.get(n8);
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, "productOptionVariant");
                object6 = ((t32_0)object).b;
                n14 = (int)(object6.c7() ? 1 : 0);
                n10 = 1;
                if (n14 != 0 && (n14 = (int)(((t32_0)object).d ? 1 : 0)) != 0 && (n14 = (int)(object6.K5() ? 1 : 0)) == 0) {
                    Object object7 = ((t32_0)object).h;
                    if (object7 != null) {
                        ai0_2.B((View)object7);
                    }
                    if ((object7 = ((t32_0)object).i) != null) {
                        ai0_2.B((View)object7);
                    }
                    if ((object7 = ((t32_0)object).f) != null) {
                        object7.setTag(object2);
                    }
                    if ((object7 = object6.z7()) != null && (object4 = ((ProductOptionVariant)object2).getValue()) != null && !(bl2 = gv_1.b)) {
                        float f6;
                        int n7;
                        float f7;
                        int n15;
                        object2 = ((ProductOptionVariant)object2).getValue();
                        Intrinsics.checkNotNull(object2);
                        object6 = object6.y();
                        Intrinsics.checkNotNullParameter(object7, "context");
                        Intrinsics.checkNotNullParameter(object2, "size");
                        Intrinsics.checkNotNullParameter(object6, "lifeCycleOwner");
                        object4 = new Balloon$a((Context)object7);
                        f5 = -1 << -1;
                        ((Balloon$a)object4).a = n15 = on_2.b(f5, n10);
                        ((Balloon$a)object4).c = n8 = on_2.b(f5, n10);
                        charSequence = new StringBuilder("Click to view similar \nproduct available in size ");
                        charSequence.append((String)object2);
                        object2 = charSequence.toString();
                        charSequence = "value";
                        Intrinsics.checkNotNullParameter(object2, (String)charSequence);
                        ((Balloon$a)object4).u = object2;
                        int n16 = R$color.white;
                        object3 = "<this>";
                        Intrinsics.checkNotNullParameter(object7, (String)object3);
                        ((Balloon$a)object4).v = n16 = t70.getColor((Context)object7, n16);
                        ((Balloon$a)object4).x = n10;
                        n16 = R$drawable.ic_close_similar_to;
                        Intrinsics.checkNotNullParameter(object7, (String)object3);
                        object2 = xn.a((Context)object7, n16);
                        if (object2 != null) {
                            object2 = object2.mutate();
                        } else {
                            n16 = 0;
                            object2 = null;
                            f7 = 0.0f;
                        }
                        ((Balloon$a)object4).z = object2;
                        object2 = qc1_2.END;
                        Intrinsics.checkNotNullParameter(object2, (String)charSequence);
                        ((Balloon$a)object4).A = object2;
                        f7 = 12;
                        ((Balloon$a)object4).B = n4 = on_2.b(f7, n10);
                        n4 = R$dimen.padding_8dp;
                        Intrinsics.checkNotNullParameter(object7, (String)object3);
                        ((Balloon$a)object4).d = n7 = object7.getResources().getDimensionPixelSize(n4);
                        Intrinsics.checkNotNullParameter(object7, (String)object3);
                        Resources resources = object7.getResources();
                        ((Balloon$a)object4).f = n4 = resources.getDimensionPixelSize(n4);
                        ((Balloon$a)object4).C = n4 = on_2.b(f7, n10);
                        ((Balloon$a)object4).w = 12.0f;
                        xp_2 xp_22 = xp_2.ALIGN_ANCHOR;
                        Intrinsics.checkNotNullParameter((Object)xp_22, (String)charSequence);
                        ((Balloon$a)object4).n = xp_22;
                        ((Balloon$a)object4).l = n4 = on_2.b(10, n10);
                        ((Balloon$a)object4).m = f6 = 0.5f;
                        ((Balloon$a)object4).d = n4 = on_2.b(f7, n10);
                        ((Balloon$a)object4).e = n4 = on_2.b(f7, n10);
                        ((Balloon$a)object4).f = n4 = on_2.b(f7, n10);
                        ((Balloon$a)object4).g = n16 = on_2.b(f7, n10);
                        ((Balloon$a)object4).L = object6;
                        n16 = R$color.color_202020;
                        Intrinsics.checkNotNullParameter(object7, (String)object3);
                        ((Balloon$a)object4).s = n16 = t70.getColor((Context)object7, n16);
                        object2 = vu_2.OVERSHOOT;
                        Intrinsics.checkNotNullParameter(object2, (String)charSequence);
                        ((Balloon$a)object4).O = object2;
                        object6 = vu_2.CIRCULAR;
                        if (object2 == object6) {
                            ((Balloon$a)object4).V = false;
                        }
                        ((Balloon$a)object4).I = false;
                        ((Balloon$a)object4).V = false;
                        object2 = new Balloon((Context)object7, (Balloon$a)object4, null);
                        object6 = new fv_2(object2, 0);
                        Intrinsics.checkNotNullParameter(object6, "block");
                        object5 = new xu_2((fv_2)object6);
                        object6 = ((Balloon)object2).c.g;
                        su_22 = new su_2((xu_2)object5, (Balloon)object2);
                        object6.setOnClickListener((View.OnClickListener)su_22);
                        gv_1.a = object2;
                        gv_1.b = n10;
                        object6 = ((t32_0)object).f;
                        if (object6 != null) {
                            object5 = new s32_0((t32_0)object, (Balloon)object2);
                            long l2 = 500L;
                            object6.postDelayed((Runnable)object5, l2);
                        }
                    }
                }
                o63.T = n10;
            }
        }
    }

    public static SpannableString n(String string2, String string3, String string4, String string5) {
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        int n3 = 7;
        object = mz3_0.t(object, n3);
        String string6 = "";
        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string6, (Typeface)object);
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object2 = mz3_0.t(aJIOApplication, n3);
        object = new AjioCustomTypefaceSpan(string6, (Typeface)object2);
        object2 = "message1";
        n3 = (int)(string5.equals(object2) ? 1 : 0);
        int n4 = 2;
        int n7 = 0;
        int n8 = 33;
        if (n3 != 0) {
            if (string3 != null) {
                string6 = string3;
            }
            int n10 = StringsKt.O(string2, string6, 0, false, n4);
            if (string3 != null) {
                n7 = string3.length();
            }
            if (n10 >= 0 && (n7 += n10) > 0) {
                spannableString.setSpan((Object)ajioCustomTypefaceSpan, n10, n7, n8);
            }
        } else {
            object2 = "message2";
            int n14 = string5.equals(object2);
            if (n14 != 0) {
                int n15;
                string5 = string3 == null ? string6 : string3;
                n14 = StringsKt.O(string2, string5, 0, false, n4);
                if (string3 != null) {
                    n15 = string3.length();
                } else {
                    n15 = 0;
                    string3 = null;
                }
                if (n14 >= 0 && (n15 += n14) > 0) {
                    spannableString.setSpan((Object)ajioCustomTypefaceSpan, n14, n15, n8);
                }
                if (string4 != null) {
                    string6 = string4;
                }
                int n16 = StringsKt.O(string2, string6, 0, false, n4);
                if (string4 != null) {
                    n7 = string4.length();
                }
                if (n16 >= 0 && (n7 += n16) > 0) {
                    spannableString.setSpan(object, n16, n7, n8);
                }
            }
        }
        return spannableString;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void p(O63 o63, LinearLayoutManager linearLayoutManager, ArrayList arrayList, boolean bl2, boolean bl3, boolean bl4, int n3) {
        boolean bl5;
        int n4;
        boolean bl6;
        void var6_8;
        int n7 = var6_8 & 8;
        if (n7 != 0) {
            bl6 = false;
        }
        if ((n4 = var6_8 & 0x10) != 0) {
            bl5 = false;
        }
        o63.o(linearLayoutManager, arrayList, bl6, bl5);
    }

    public final void a() {
        AJIOApplication.Companion.getClass();
        el3.b((Context)AJIOApplication$a.a());
        int n3 = 25;
        mz3_0.d(n3);
        Object object = this.j;
        if (object != null) {
            n3 = Intrinsics.compare(object.size(), 0);
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 > 0) {
            object = this.j;
            if (object != null && (object = (ProductOptionVariant)object.get(0)) != null) {
                object = ((ProductOptionVariant)object).getValue();
            } else {
                n3 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            int n4 = ((String)object).length();
            int n7 = 1;
            n4 -= n7;
            int n8 = 0;
            boolean bl2 = false;
            while (n8 <= n4) {
                int n10 = !bl2 ? n8 : n4;
                n10 = ((String)object).charAt(n10);
                int n14 = 32;
                n10 = Intrinsics.compare(n10, n14);
                n10 = n10 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n10 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n10 == 0) break;
                n4 += -1;
            }
            object = ((String)object).subSequence(n8, n4 += n7);
            object.toString();
        }
    }

    public final void c() {
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            Animation animation = this.G;
            linearLayout.startAnimation(animation);
        }
        if ((linearLayout = this.z) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        this.L = false;
    }

    public final void d() {
        Object object = this.a.x5();
        if (object != null) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            boolean bl2 = ((ao0_0)object).a("pdp_customer_pincode_edd");
            int n3 = 0;
            Object[] objectArray = null;
            String string2 = "Using pincode ";
            sj2_0 sj2_02 = this.c;
            if (bl2) {
                tj2_2.Companion.getClass();
                object = tj2$a_0.a().a;
                bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2) {
                    object = tj2$a_0.a().a;
                    sj2_02.n6((String)object);
                } else {
                    boolean bl3;
                    Object object2 = AJIOApplication$a.a();
                    object = new jo_2((Context)object2);
                    if ((object = ((jo_2)object).i()) != null && !(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((LocationData)object).getPincode())))) {
                        object2 = yn3_0.a;
                        String string3 = ((LocationData)object).getPincode();
                        String string4 = " from locale info";
                        string2 = cP.a(string2, string3, string4);
                        objectArray = new Object[]{};
                        ((yn3$a)object2).a(string2, objectArray);
                        object = ((LocationData)object).getPincode();
                        sj2_02.n6((String)object);
                    } else {
                        object = this.d;
                        object.e3();
                    }
                }
            } else {
                Object object3 = AJIOApplication$a.a();
                object = new jo_2((Context)object3);
                object = ((jo_2)object).i();
                tj2_2.Companion.getClass();
                object3 = tj2$a_0.a().a;
                boolean bl4 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl4) {
                    object = yn3_0.a;
                    object3 = tj2$a_0.a().a;
                    String string5 = " from prior edd/user entered";
                    string2 = cP.a(string2, (String)object3, string5);
                    objectArray = new Object[]{};
                    ((yn3$a)object).a(string2, objectArray);
                    object = tj2$a_0.a().a;
                    sj2_02.n6((String)object);
                } else if (object != null && (objectArray = ((LocationData)object).getPincode()) != null && (n3 = objectArray.length()) > 0) {
                    object = ((LocationData)object).getPincode();
                    sj2_02.n6((String)object);
                } else {
                    sj2_02.X2();
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void e(String[] var1_1) {
        block18: {
            block13: {
                block17: {
                    block14: {
                        block16: {
                            block15: {
                                var2_2 = this;
                                var3_3 = 1;
                                var4_4 = null;
                                var5_5 /* !! */  = var1_1[0];
                                var6_6 /* !! */  = "";
                                if (var5_5 /* !! */  == null || (var7_7 = var5_5 /* !! */ .length()) == 0) break block13;
                                var5_5 /* !! */  = String.valueOf(var1_1[0]);
                                var9_11 = var5_5 /* !! */ .length();
                                if (var9_11 <= 0) break block14;
                                var10_12 = new String[]{"|"};
                                var11_13 = 6;
                                var5_5 /* !! */  = StringsKt.a0((CharSequence)var5_5 /* !! */ , (String[])var10_12, false, 0, var11_13);
                                var10_12 = var5_5 /* !! */ ;
                                var10_12 = (Collection)var5_5 /* !! */ ;
                                var12_14 = this.a;
                                var13_15 = "\"";
                                var14_16 = "toLowerCase(...)";
                                var15_17 = "-";
                                if (var10_12 == null || (var16_18 = var10_12.isEmpty()) != 0 || (var16_18 = (var17_19 /* !! */  = (CharSequence)var5_5 /* !! */ .get(0)).length()) <= 0) ** GOTO lbl-1000
                                var17_19 /* !! */  = var5_5 /* !! */ .get(0);
                                var18_20 = var17_19 /* !! */ ;
                                var18_20 = (String)var17_19 /* !! */ ;
                                var16_18 = (int)StringsKt.F(var18_20, var15_17, false);
                                if (var16_18 != 0) {
                                    var19_21 = StringsKt.j0(StringsKt.f0((String)var18_20, var15_17), var13_15);
                                    var20_22 = var19_21.length();
                                    ** if (var20_22 <= 0) goto lbl-1000
lbl-1000:
                                    // 1 sources

                                    {
                                        var21_23 = Locale.ROOT;
                                        var22_24 = var18_20.toLowerCase((Locale)var21_23);
                                        Intrinsics.checkNotNullExpressionValue((Object)var22_24, (String)var14_16);
                                        var21_23 = var19_21.toLowerCase((Locale)var21_23);
                                        Intrinsics.checkNotNullExpressionValue((Object)var21_23, (String)var14_16);
                                        var23_26 = StringsKt.O((CharSequence)var22_24, (String)var21_23, (int)0, (boolean)false, (int)var11_13);
                                        var24_27 = var19_21.length() + var23_26;
                                        var19_21 = new SpannableString((CharSequence)var18_20);
                                        var18_20 = var12_14.o5();
                                        var25_28 = ld3_2.STORE_AJIOGRAM;
                                        var26_29 = var25_28.getStoreId();
                                        var11_13 = (int)Intrinsics.areEqual((Object)var18_20, (Object)var26_29);
                                        var11_13 = var11_13 != 0 ? -1 : -16777216;
                                        var27_30 = new int[]{};
                                        var8_9 = var6_6 /* !! */ ;
                                        var6_6 /* !! */  = (TextAppearanceSpan)new int[var3_3][];
                                        var6_6 /* !! */ [0] = (Object)var27_30;
                                        var26_29 = (Object)new int[]{var11_13};
                                        var18_20 = new ColorStateList((int[][])var6_6 /* !! */ , (int[])var26_29);
                                        var28_31 = -1;
                                        var29_32 = 0;
                                        var30_33 = 1;
                                        var6_6 /* !! */  = new TextAppearanceSpan(null, (int)var30_33, (int)var28_31, (ColorStateList)var18_20, null);
                                        var11_13 = 33;
                                        var19_21.setSpan((Object)var6_6 /* !! */ , (int)var23_26, (int)var24_27, (int)var11_13);
                                        var18_20 = var19_21;
                                        ** GOTO lbl61
                                    }
                                }
                                break block15;
lbl-1000:
                                // 2 sources

                                {
                                    var8_9 = var6_6 /* !! */ ;
                                    var18_20 = var6_6 /* !! */ ;
                                }
                                break block16;
                            }
                            var8_9 = var6_6 /* !! */ ;
                        }
                        if (var10_12 != null && (var23_26 = var10_12.isEmpty()) == 0 && (var23_26 = var5_5 /* !! */ .size()) > var3_3 && (var23_26 = (var22_24 = (CharSequence)var5_5 /* !! */ .get(var3_3)).length()) > 0) {
                            var22_24 = var5_5 /* !! */ .get(var3_3);
                            var6_6 /* !! */  = var22_24;
                            var6_6 /* !! */  = (String)var22_24;
                            var5_5 /* !! */  = new CharSequence[2];
                            var5_5 /* !! */ [0] = var18_20;
                            var22_24 = " | ";
                            var5_5 /* !! */ [var3_3] = var22_24;
                            var18_20 = TextUtils.concat((CharSequence[])var5_5 /* !! */ );
                            var23_26 = (int)StringsKt.F((CharSequence)var6_6 /* !! */ , var15_17, false);
                            if (var23_26 != 0 && (var7_7 = (var22_24 = StringsKt.j0(StringsKt.f0((String)var6_6 /* !! */ , var15_17), var13_15)).length()) > 0) {
                                var5_5 /* !! */  = Locale.ROOT;
                                var21_23 = var6_6 /* !! */ .toLowerCase((Locale)var5_5 /* !! */ );
                                Intrinsics.checkNotNullExpressionValue(var21_23, var14_16);
                                var5_5 /* !! */  = var22_24.toLowerCase((Locale)var5_5 /* !! */ );
                                Intrinsics.checkNotNullExpressionValue(var5_5 /* !! */ , var14_16);
                                var9_11 = 6;
                                var7_7 = StringsKt.O((CharSequence)var21_23, (String)var5_5 /* !! */ , 0, false, var9_11);
                                var23_26 = var22_24.length() + var7_7;
                                var21_23 = var12_14.o5();
                                var10_12 = ld3_2.STORE_AJIOGRAM.getStoreId();
                                var24_27 = (int)Intrinsics.areEqual(var21_23, var10_12);
                                var16_18 = var24_27 != 0 ? -1 : -16777216;
                                var10_12 = (TextAppearanceSpan)new int[0];
                                var26_29 = new int[var3_3][];
                                var26_29[0] = var10_12;
                                var10_12 = (TextAppearanceSpan)new int[]{var16_18};
                                var21_23 = new ColorStateList((int[][])var26_29, (int[])var10_12);
                                var30_33 = -1;
                                var29_32 = 1;
                                var10_12 = new TextAppearanceSpan(null, var29_32, var30_33, (ColorStateList)var21_23, null);
                                var21_23 = new SpannableString((CharSequence)var6_6 /* !! */ );
                                var31_34 = 33;
                                var21_23.setSpan((Object)var10_12, var7_7, var23_26, var31_34);
                                var6_6 /* !! */  = var21_23;
                            }
lbl97:
                            // 4 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var6_6 /* !! */  = var8_9;
                        ** while (true)
                        var23_26 = 2;
                        var22_24 = new CharSequence[var23_26];
                        var22_24[0] = var18_20;
                        var22_24[var3_3] = var6_6 /* !! */ ;
                        var6_6 /* !! */  = TextUtils.concat((CharSequence[])var22_24);
                        break block17;
                    }
                    var8_10 = var6_6 /* !! */ ;
                }
                var22_24 = var2_2.i;
                if (var22_24 != null) {
                    var3_3 = 4;
                    var22_24.setVisibility(var3_3);
                }
                if ((var23_26 = var2_2.P) != 0 && (var22_24 = var2_2.i) != null) {
                    var3_3 = 8;
                    var22_24.setVisibility(var3_3);
                }
                if ((var22_24 = var2_2.i) != null) {
                    var22_24.setText((CharSequence)var6_6 /* !! */ );
                }
                if ((var22_24 = var2_2.i) != null) {
                    var32_35 = new O63$a(var2_2, (CharSequence)var6_6 /* !! */ );
                    var22_24.addOnLayoutChangeListener((View.OnLayoutChangeListener)var32_35);
                }
                break block18;
            }
            var8_8 = var6_6 /* !! */ ;
            var22_25 = var2_2.i;
            if (var22_25 != null) {
                var3_3 = 8;
                var22_25.setVisibility(var3_3);
            }
            var22_25 = var2_2.q;
            var32_36 = var8_8;
            if (var22_25 != null) {
                var22_25.setText((CharSequence)var8_8);
            }
            if ((var22_25 = var2_2.q) != null) {
                var22_25.setContentDescription((CharSequence)var32_36);
            }
            var22_25 = var2_2.q;
            Intrinsics.checkNotNull(var22_25);
            var32_36 = new int[]{0};
            var4_4 = "width";
            var22_25 = ObjectAnimator.ofInt((Object)var22_25, (String)var4_4, (int[])var32_36);
            var33_37 = 500L;
            var22_25.setDuration(var33_37);
            var32_36 = new DecelerateInterpolator();
            var22_25.setInterpolator((TimeInterpolator)var32_36);
            var22_25.start();
            Intrinsics.checkNotNull(var22_25);
            var32_36 = new r63_0(var2_2);
            var22_25.addListener((Animator.AnimatorListener)var32_36);
        }
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        Object object = this.Q;
        Object object2 = ((NewCustomEventsRevamp)object).getPRODUCT_NAME();
        yi2_1 yi2_12 = this.a;
        Object object3 = yi2_12.x5();
        Object object4 = "";
        if (object3 == null || (object3 = ((Product)object3).getName()) == null) {
            object3 = object4;
        }
        bundle.putString((String)object2, (String)object3);
        object2 = ((NewCustomEventsRevamp)object).getPRODUCT_ID();
        object3 = yi2_12.x5();
        if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
            object3 = object4;
        }
        bundle.putString((String)object2, (String)object3);
        object = ((NewCustomEventsRevamp)object).getPRODUCT_BRAND();
        object2 = yi2_12.x5();
        if (object2 != null && (object2 = ((Product)object2).getBrandName()) != null) {
            object4 = object2;
        }
        bundle.putString((String)object, (String)object4);
        return bundle;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean g() {
        Object[] objectArray;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        int n3 = 1;
        int n4 = 0;
        Iterator iterator = h40_0.a;
        iterator = z40_0.Companion;
        iterator = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)((Object)iterator)).a.b("sizeGuidToggleData");
        Object object9 = this.a.x5();
        Intrinsics.checkNotNullParameter(iterator, "firebaseToggleCombinations");
        String string2 = "toLowerCase(...)";
        if (object9 != null && (object8 = ((Product)object9).getBrickCategory()) != null) {
            object7 = Locale.ROOT;
            object8 = ((String)object8).toLowerCase((Locale)object7);
            Intrinsics.checkNotNullExpressionValue(object8, string2);
            object7 = object8;
        } else {
            object7 = null;
        }
        if (object9 != null && (object8 = ((Product)object9).getBrickName()) != null) {
            object6 = Locale.ROOT;
            object8 = ((String)object8).toLowerCase((Locale)object6);
            Intrinsics.checkNotNullExpressionValue(object8, string2);
            object6 = object8;
        } else {
            object6 = null;
        }
        if (object9 != null && (object8 = ((Product)object9).getBrickSubCategory()) != null) {
            object5 = Locale.ROOT;
            object8 = ((String)object8).toLowerCase((Locale)object5);
            Intrinsics.checkNotNullExpressionValue(object8, string2);
            object5 = object8;
        } else {
            object5 = null;
        }
        int n7 = 8;
        object8 = object4;
        object4 = new HowToMeasureProducts((String)object7, (String)object6, (String)object5, null, n7, null);
        if (object9 != null && (object7 = ((Product)object9).getBrickCategory()) != null) {
            object6 = Locale.ROOT;
            object7 = ((String)object7).toLowerCase((Locale)object6);
            Intrinsics.checkNotNullExpressionValue(object7, string2);
            object3 = object7;
        } else {
            object3 = null;
        }
        if (object9 != null && (object7 = ((Product)object9).getBrickName()) != null) {
            object6 = Locale.ROOT;
            object7 = ((String)object7).toLowerCase((Locale)object6);
            Intrinsics.checkNotNullExpressionValue(object7, string2);
            object2 = object7;
        } else {
            object2 = null;
        }
        String string3 = "";
        int n8 = 8;
        object8 = new HowToMeasureProducts((String)object3, (String)object2, string3, null, n8, null);
        if (object9 != null && (object6 = ((Product)object9).getBrickCategory()) != null) {
            object5 = Locale.ROOT;
            object6 = ((String)object6).toLowerCase((Locale)object5);
            Intrinsics.checkNotNullExpressionValue(object6, string2);
            object = object6;
        } else {
            object = null;
        }
        if (object9 != null && (object9 = ((Product)object9).getBrickSubCategory()) != null) {
            object6 = Locale.ROOT;
            object9 = ((String)object9).toLowerCase((Locale)object6);
            Intrinsics.checkNotNullExpressionValue(object9, string2);
            objectArray = object9;
        } else {
            objectArray = null;
        }
        String string4 = "";
        int n10 = 8;
        object7 = new HowToMeasureProducts((String)object, string4, (String)objectArray, null, n10, null);
        int n14 = 3;
        object9 = new HowToMeasureProducts[n14];
        object9[0] = object4;
        object9[n3] = object8;
        int n15 = 2;
        object9[n15] = object7;
        object9 = p03_0.f((Object[])object9);
        object4 = PDPSizeGuideToggleData.class;
        iterator = (PDPSizeGuideToggleData)Z90.a((Class)object4, (String)((Object)iterator));
        if (iterator == null) return n4 != 0;
        object4 = ((PDPSizeGuideToggleData)((Object)iterator)).getSizeGuidToggleProducts();
        n15 = ((ArrayList)object4).size();
        if (n15 <= 0) return n4 != 0;
        n15 = (iterator = ((PDPSizeGuideToggleData)((Object)iterator)).getSizeGuidToggleProducts()) instanceof Collection;
        if (n15 != 0 && (n15 = (int)(((Collection)((Object)iterator)).isEmpty() ? 1 : 0)) != 0) {
            return 0 != 0;
        }
        iterator = ((Iterable)((Object)iterator)).iterator();
        do {
            if ((n15 = (int)(iterator.hasNext() ? 1 : 0)) == 0) return 0 != 0;
            object8 = object4 = iterator.next();
            object8 = (HowToMeasureProducts)object4;
            if ((object4 = ((HowToMeasureProducts)object8).getBrickCategory()) != null) {
                object7 = Locale.ROOT;
                object4 = ((String)object4).toLowerCase((Locale)object7);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                object7 = object4;
            } else {
                object7 = null;
            }
            object4 = ((HowToMeasureProducts)object8).getBrickName();
            if (object4 != null) {
                object6 = Locale.ROOT;
                object4 = ((String)object4).toLowerCase((Locale)object6);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                object6 = object4;
            } else {
                object6 = null;
            }
            object4 = ((HowToMeasureProducts)object8).getBrickSubCategory();
            if (object4 != null) {
                object5 = Locale.ROOT;
                object4 = ((String)object4).toLowerCase((Locale)object5);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                object5 = object4;
                continue;
            }
            object5 = null;
        } while ((n15 = (int)(object9.contains(object4 = HowToMeasureProducts.copy$default((HowToMeasureProducts)object8, (String)object7, (String)object6, (String)object5, null, n7 = 8, null)) ? 1 : 0)) == 0);
        return n3 != 0;
    }

    public final boolean h() {
        View view = this.e;
        int n3 = view.getVisibility();
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    public final void i() {
        TabLayout tabLayout = this.B;
        if (tabLayout != null) {
            O63$b o63$b = new O63$b(this);
            tabLayout.addOnTabSelectedListener(o63$b);
        }
    }

    public final void j(String string2) {
        Bundle bundle = new Bundle();
        Object object = this.Q;
        Object object2 = ((NewCustomEventsRevamp)object).getPRODUCT_ID();
        yi2_1 yi2_12 = this.a;
        Object object3 = yi2_12.x5();
        String string3 = null;
        object3 = object3 != null ? ((Product)object3).getCode() : null;
        bundle.putString((String)object2, (String)object3);
        object2 = ((NewCustomEventsRevamp)object).getPRODUCT_NAME();
        object3 = yi2_12.x5();
        if (object3 != null) {
            string3 = ((Product)object3).getName();
        }
        bundle.putString((String)object2, string3);
        object = ((NewCustomEventsRevamp)object).getPRODUCT_BRICK();
        object2 = yi2_12.x5();
        if (object2 == null || (object2 = ((Product)object2).getBrickCategory()) == null) {
            object2 = "";
        }
        bundle.putString((String)object, (String)object2);
        object = this.Q;
        object2 = ((NewCustomEventsRevamp)object).getEC_PRODUCT_DETAILS_INTERACTIONS();
        String string4 = this.S;
        object3 = string2;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, "fit tag impression", string2, "product_details_interactions", "pdp screen", "pdp screen", null, bundle, string4, false, null, 1600, null);
    }

    public final void k(String string2) {
        NewCustomEventsRevamp newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Bundle bundle = new Bundle();
        Object object = this.a;
        Object object2 = object.x5();
        String string3 = null;
        object2 = object2 != null ? ((Product)object2).getCode() : null;
        String string4 = "product_id";
        bundle.putString(string4, (String)object2);
        object2 = object.x5();
        object2 = object2 != null ? ((Product)object2).getName() : null;
        string4 = "product_name";
        bundle.putString(string4, (String)object2);
        object2 = object.x5();
        object2 = object2 != null ? ((Product)object2).getBrickCategory() : null;
        string4 = "product_category";
        bundle.putString(string4, (String)object2);
        object = object.x5();
        if (object != null) {
            string3 = ((Product)object).getBrickName();
        }
        bundle.putString("product_brick", string3);
        newCustomEventsRevamp.newPDPInteractionsCustomEvent("recommended size", string2, "pdp screen/size chart screen", bundle);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void l(Product var1_1, ProductUserSizeRecomResponse var2_2) {
        block59: {
            block55: {
                block48: {
                    block56: {
                        block58: {
                            block57: {
                                block49: {
                                    block50: {
                                        block54: {
                                            block53: {
                                                block47: {
                                                    block52: {
                                                        block51: {
                                                            block46: {
                                                                var3_3 = this;
                                                                var4_4 = 1;
                                                                var5_5 = null;
                                                                var6_6 = R$id.size_chart;
                                                                var7_7 = this.e;
                                                                var8_8 = (AjioButton)var7_7.findViewById(var6_6);
                                                                this.k = var8_8;
                                                                var9_9 = "sizeChartButton";
                                                                var10_10 = null;
                                                                if (var8_8 == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                                                    var6_6 = 0;
                                                                    var8_8 = null;
                                                                }
                                                                var8_8.setOnClickListener((View.OnClickListener)var3_3);
                                                                var6_6 = R$id.pdp_size_tool_tip;
                                                                var8_8 = var7_7.findViewById(var6_6);
                                                                Intrinsics.checkNotNullExpressionValue(var8_8, "findViewById(...)");
                                                                var8_8 = (AjioTextView)var8_8;
                                                                var11_11 = var3_3.a;
                                                                var12_12 /* !! */  = var11_11.S0();
                                                                var13_13 /* !! */  = la0_0.SIZE_RECOMMENDATION;
                                                                var14_14 = 8;
                                                                if (var12_12 /* !! */  != var13_13 /* !! */  || var2_2 == null) break block48;
                                                                var12_12 /* !! */  = var11_11.l7();
                                                                var15_15 = var12_12 /* !! */ .equals("BRAND");
                                                                var13_13 /* !! */  = mz3_0.a;
                                                                var16_17 = "message2";
                                                                var17_18 = "message1";
                                                                var18_19 = "optString(...)";
                                                                var19_20 = " ";
                                                                var20_21 = "UNI";
                                                                var21_22 = "";
                                                                if (var15_15 != var4_4 && (var15_15 = var11_11.N0()) == 0) break block49;
                                                                var12_12 /* !! */  = var2_2.getBrandSizeAttribute();
                                                                if (var12_12 /* !! */  == null || (var15_15 = var12_12 /* !! */ .length()) == 0) break block50;
                                                                var15_15 = (int)mz3_0.E();
                                                                if (var15_15 == 0) break block51;
                                                                var12_12 /* !! */  = var2_2.getBrandSizeAttribute();
                                                                var14_14 = (int)var11_11.N0();
                                                                if (var14_14 == 0) ** GOTO lbl49
                                                                var22_23 = var11_11.G1();
                                                                if (var22_23 != null) {
                                                                    var22_23 = var22_23.getBrandValue();
                                                                } else {
                                                                    while (true) {
                                                                        var14_14 = 0;
                                                                        var22_23 = null;
                                                                        break block46;
                                                                        break;
                                                                    }
lbl49:
                                                                    // 1 sources

                                                                    if ((var22_23 = var11_11.G1()) == null) ** continue;
                                                                    var22_23 = var22_23.getValue();
                                                                }
                                                            }
                                                            if (var22_23 != null && !(var23_27 = var22_23.equals((Object)var12_12 /* !! */ ))) {
                                                                var13_13 /* !! */  = h40_0.a;
                                                                var13_13 /* !! */  = h40_0.C0().optString(var16_17);
                                                                Intrinsics.checkNotNullExpressionValue((Object)var13_13 /* !! */ , var18_19);
                                                                var13_13 /* !! */  = mz3_0.k((String)var13_13 /* !! */ , (String)var22_23, (String)var12_12 /* !! */ );
                                                            } else {
                                                                var22_23 = h40_0.a;
                                                                var22_23 = h40_0.C0().optString(var17_18);
                                                                Intrinsics.checkNotNullExpressionValue(var22_23, var18_19);
                                                                var13_13 /* !! */  = mz3_0.j((mz3_0)var13_13 /* !! */ , (String)var22_23, (String)var12_12 /* !! */ );
                                                                var16_17 = var17_18;
                                                            }
                                                            break block52;
                                                        }
                                                        var12_12 /* !! */  = var2_2.getBrandSizeFormatAttribute();
                                                        if (var12_12 /* !! */  != null && (var15_15 = var12_12 /* !! */ .length()) != 0 && (var15_15 = (int)(var12_12 /* !! */  = var2_2.getBrandSizeFormatAttribute()).equals(var20_21)) == 0) {
                                                            var12_12 /* !! */  = var2_2.getBrandSizeFormatAttribute();
                                                            var13_13 /* !! */  = var2_2.getBrandSizeAttribute();
                                                            var12_12 /* !! */  = n1.a((String)var12_12 /* !! */ , var19_20, (String)var13_13 /* !! */ );
                                                        } else {
                                                            var12_12 /* !! */  = var2_2.getBrandSizeAttribute();
                                                        }
                                                        var24_28 = R$string.pdp_size_recom_text;
                                                        var22_24 = new Object[var4_4];
                                                        var22_24[0] = var12_12 /* !! */ ;
                                                        var13_13 /* !! */  = hv3_0.L(var24_28, var22_24);
                                                        var16_17 = var21_22;
                                                    }
                                                    var14_14 = (int)mz3_0.E();
                                                    if (var14_14 == 0) break block53;
                                                    var14_14 = (int)var11_11.N0();
                                                    if (var14_14 == 0) ** GOTO lbl88
                                                    if ((var11_11 = var11_11.G1()) != null) {
                                                        var11_11 = var11_11.getBrandValue();
                                                    } else {
                                                        while (true) {
                                                            var11_11 = null;
                                                            break block47;
                                                            break;
                                                        }
lbl88:
                                                        // 1 sources

                                                        if ((var11_11 = var11_11.G1()) == null) ** continue;
                                                        var11_11 = var11_11.getValue();
                                                    }
                                                }
                                                var11_11 = O63.n((String)var13_13 /* !! */ , (String)var12_12 /* !! */ , (String)var11_11, var16_17);
                                                break block54;
                                            }
                                            var11_11 = var3_3.m((String)var13_13 /* !! */ , (String)var12_12 /* !! */ );
                                        }
                                        var8_8.setText((CharSequence)var11_11);
                                        var11_11 = LinkMovementMethod.getInstance();
                                        var8_8.setMovementMethod((MovementMethod)var11_11);
                                        var8_8.setVisibility(0);
                                        var6_6 = (int)mz3_0.E();
                                        if (var6_6 != 0) {
                                            var8_8 = var2_2.getBrandSizeAttribute();
                                            var11_11 = "getBrandSizeAttribute(...)";
                                            Intrinsics.checkNotNullExpressionValue(var8_8, (String)var11_11);
                                            var3_3.k((String)var8_8);
                                        }
                                        break block55;
                                    }
                                    var8_8.setVisibility(var14_14);
                                    break block55;
                                }
                                var12_12 /* !! */  = var2_2.getUniversalSizeAttribute();
                                if (var12_12 /* !! */  == null || (var15_15 = var12_12 /* !! */ .length()) == 0) break block56;
                                var15_15 = (int)mz3_0.E();
                                if (var15_15 == 0) break block57;
                                var12_12 /* !! */  = var2_2.getUniversalSizeAttribute();
                                var22_25 = var11_11.G1();
                                if (var22_25 != null) {
                                    var22_25 = var22_25.getValue();
                                } else {
                                    var14_14 = 0;
                                    var22_25 = null;
                                }
                                if (var22_25 == null) ** GOTO lbl-1000
                                var22_25 = var11_11.G1();
                                if (var22_25 != null) {
                                    var22_25 = var22_25.getValue();
                                } else {
                                    var14_14 = 0;
                                    var22_25 = null;
                                }
                                var14_14 = (int)kotlin.text.b.i((String)var22_25, (String)var12_12 /* !! */ , false);
                                if (var14_14 == 0) {
                                    var13_13 /* !! */  = h40_0.a;
                                    var13_13 /* !! */  = h40_0.C0().optString(var16_17);
                                    Intrinsics.checkNotNullExpressionValue((Object)var13_13 /* !! */ , var18_19);
                                    var22_25 = var11_11.G1();
                                    if (var22_25 != null) {
                                        var22_25 = var22_25.getValue();
                                    } else {
                                        var14_14 = 0;
                                        var22_25 = null;
                                    }
                                    var13_13 /* !! */  = mz3_0.k((String)var13_13 /* !! */ , (String)var22_25, (String)var12_12 /* !! */ );
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var22_25 = h40_0.a;
                                    var22_25 = h40_0.C0().optString(var17_18);
                                    Intrinsics.checkNotNullExpressionValue(var22_25, var18_19);
                                    var13_13 /* !! */  = mz3_0.j((mz3_0)var13_13 /* !! */ , (String)var22_25, (String)var12_12 /* !! */ );
                                    var16_17 = var17_18;
                                }
                                break block58;
                            }
                            var12_12 /* !! */  = var2_2.getUniversalSizeFormatAttribute();
                            if (var12_12 /* !! */  != null && (var15_15 = var12_12 /* !! */ .length()) != 0 && (var15_15 = (int)(var12_12 /* !! */  = var2_2.getUniversalSizeFormatAttribute()).equals(var20_21)) == 0) {
                                var12_12 /* !! */  = var2_2.getUniversalSizeFormatAttribute();
                                var13_13 /* !! */  = var2_2.getUniversalSizeAttribute();
                                var12_12 /* !! */  = n1.a((String)var12_12 /* !! */ , var19_20, (String)var13_13 /* !! */ );
                            } else {
                                var12_12 /* !! */  = var2_2.getUniversalSizeAttribute();
                            }
                            var24_29 = R$string.pdp_size_recom_text;
                            var22_26 = new Object[var4_4];
                            var22_26[0] = var12_12 /* !! */ ;
                            var13_13 /* !! */  = hv3_0.L(var24_29, var22_26);
                            var16_17 = var21_22;
                        }
                        var14_14 = (int)mz3_0.E();
                        if (var14_14 != 0) {
                            var11_11 = (var11_11 = var11_11.G1()) != null ? var11_11.getValue() : null;
                            var11_11 = O63.n((String)var13_13 /* !! */ , (String)var12_12 /* !! */ , (String)var11_11, var16_17);
                        } else {
                            var11_11 = var3_3.m((String)var13_13 /* !! */ , (String)var12_12 /* !! */ );
                        }
                        var8_8.setText((CharSequence)var11_11);
                        var11_11 = LinkMovementMethod.getInstance();
                        var8_8.setMovementMethod((MovementMethod)var11_11);
                        var8_8.setVisibility(0);
                        var6_6 = (int)mz3_0.E();
                        if (var6_6 != 0) {
                            var8_8 = var2_2.getUniversalSizeAttribute();
                            var11_11 = "getUniversalSizeAttribute(...)";
                            Intrinsics.checkNotNullExpressionValue(var8_8, (String)var11_11);
                            var3_3.k((String)var8_8);
                        }
                        break block55;
                    }
                    var8_8.setVisibility(var14_14);
                    break block55;
                }
                var12_12 /* !! */  = var11_11.S0();
                if (var12_12 /* !! */  == (var13_13 /* !! */  = la0_0.USER_VOICE)) {
                    var8_8.setVisibility(0);
                    var11_11 = var2_2 != null ? var2_2.getUserVoiceMessage() : null;
                    var8_8.setText((CharSequence)var11_11);
                } else {
                    var12_12 /* !! */  = var11_11.S0();
                    if (var12_12 /* !! */  == (var13_13 /* !! */  = la0_0.BRAND_VOICE)) {
                        if (var2_2 != null && (var12_12 /* !! */  = var2_2.getBrandVoiceMessage()) != null && (var15_16 = var12_12 /* !! */ .length()) > 0) {
                            var8_8.setVisibility(0);
                            var11_11 = var11_11.G1();
                            if (var11_11 != null) {
                                var11_11 = var2_2.getBrandVoiceMessage();
                                var8_8.setText((CharSequence)var11_11);
                            } else {
                                var8_8.setVisibility(var14_14);
                            }
                        } else {
                            var8_8.setVisibility(var14_14);
                        }
                    } else {
                        var8_8.setVisibility(var14_14);
                    }
                }
            }
            if (var1_1 == null) break block59;
            var6_6 = (int)hv3_0.Y();
            if (var6_6 == 0 || (var6_6 = (int)(var8_8 = var3_3.c).l8()) == 0 || (var8_8 = var1_1.getFnlColorVariantData()) == null) ** GOTO lbl-1000
            var8_8 = var1_1.getFnlColorVariantData();
            if (var8_8 != null) {
                var8_8 = var8_8.getSizeGuideDesktop();
            } else {
                var6_6 = 0;
                var8_8 = null;
            }
            if (var8_8 == null) ** GOTO lbl-1000
            var8_8 = var1_1.getFnlColorVariantData();
            if (var8_8 != null && (var8_8 = var8_8.getSizeGuideDesktop()) != null) {
                var6_6 = var8_8.length();
                if (var6_6 <= 0) {
                    var4_4 = 0;
                    var25_30 = null;
                }
                var25_30 = (boolean)var4_4;
            } else {
                var4_4 = 0;
                var25_30 = null;
            }
            Intrinsics.checkNotNull(var25_30);
            var4_4 = (int)var25_30.booleanValue();
            if (var4_4 != 0) {
                var25_30 = var3_3.k;
                if (var25_30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                    var4_4 = 0;
                    var25_30 = null;
                }
                ai0_2.B((View)var25_30);
            } else lbl-1000:
            // 3 sources

            {
                if ((var25_30 = var3_3.k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                    var4_4 = 0;
                    var25_30 = null;
                }
                ai0_2.i((View)var25_30);
            }
        }
        if ((var4_4 = var7_7 instanceof RelativeLayout) != 0) {
            var25_30 = var3_3.k;
            if (var25_30 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                var4_4 = 0;
                var25_30 = null;
            }
            var5_5 = "Size chart from popup";
            var25_30.setContentDescription((CharSequence)var5_5);
        }
        if ((var25_30 = var3_3.y) == null) {
            var25_30 = "addToBag";
            Intrinsics.throwUninitializedPropertyAccessException((String)var25_30);
        } else {
            var10_10 = var25_30;
        }
        ai0_2.a((View)var10_10);
    }

    public final SpannableString m(String string2, String object) {
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        Object object2 = Ft2.a(object, " based");
        int n3 = 0;
        int n4 = 2;
        int n7 = StringsKt.O(string2, (String)object2, 0, false, n4);
        if (object != null) {
            n3 = object.length();
        }
        n3 += n7;
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        n4 = 8;
        object2 = mz3_0.t((AJIOApplication)object2, n4);
        String string3 = "";
        object = new AjioCustomTypefaceSpan(string3, (Typeface)object2);
        if (n7 > 0 && n3 > 0) {
            int n8 = 18;
            spannableString.setSpan(object, n7, n3, n8);
            string3 = this.o;
            int n10 = R$color.text_color_size_ui;
            n4 = t70.getColor((Context)string3, n10);
            object = new ForegroundColorSpan(n4);
            spannableString.setSpan(object, n7, n3, n8);
        }
        return spannableString;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void o(LinearLayoutManager var1_1, ArrayList var2_2, boolean var3_3, boolean var4_4) {
        block166: {
            block165: {
                block164: {
                    block163: {
                        var5_5 = this;
                        var6_6 = var2_2;
                        var7_7 = null;
                        var8_8 = 1;
                        this.j = var2_2;
                        Intrinsics.checkNotNull(var1_1);
                        var9_9 = R$id.size_info_layout;
                        var10_10 = this.e;
                        var11_11 = (LinearLayout)var10_10.findViewById(var9_9);
                        this.l = var11_11;
                        var9_9 = R$id.size_info_tv;
                        var11_11 = (AjioTextView)var10_10.findViewById(var9_9);
                        this.n = var11_11;
                        var9_9 = R$id.select_size_triangle;
                        var11_11 = (ImageView)var10_10.findViewById(var9_9);
                        this.m = var11_11;
                        var11_11 = this.n;
                        if (var11_11 != null) {
                            hv3_0.h0((AjioTextView)var11_11);
                            var11_11 = Unit.a;
                        }
                        var9_9 = R$id.pdp_size_info_tv_header;
                        var11_11 = (TextView)var10_10.findViewById(var9_9);
                        var5_5.q = var11_11;
                        var9_9 = R$id.pdp_size_info_tv_header_temp;
                        var11_11 = (TextView)var10_10.findViewById(var9_9);
                        var5_5.i = var11_11;
                        var12_12 = var5_5.a;
                        var11_11 = var12_12.G1();
                        var13_13 = "sizeInfoTriangle";
                        var14_14 = 8;
                        if (var11_11 == null) break block163;
                        var11_11 = var12_12.G1();
                        if (var11_11 != null) {
                            var11_11 = var11_11.getValue();
                        } else {
                            var9_9 = 0;
                            var11_11 = null;
                        }
                        if (var11_11 != null) break block164;
                    }
                    if ((var9_9 = (int)var12_12.S5()) != 0) break block165;
                }
                var11_11 = var12_12.P5();
                var15_15 = var5_5.l;
                if (var15_15 != null) {
                    var15_15.setVisibility(var14_14);
                    var15_15 = Unit.a;
                }
                if ((var15_15 = var5_5.m) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                    var16_16 = 0;
                    var15_15 = null;
                }
                var15_15.setVisibility(var14_14);
                break block166;
            }
            var11_11 = var12_12.G1();
            if (var11_11 != null) ** GOTO lbl-1000
            var11_11 = var12_12.G1();
            if (var11_11 != null) {
                var11_11 = var11_11.getValue();
            } else {
                var9_9 = 0;
                var11_11 = null;
            }
            if (var11_11 == null && (var9_9 = (int)var12_12.H7()) != 0) {
                var11_11 = var5_5.l;
                if (var11_11 != null) {
                    var11_11.setVisibility(0);
                    var11_11 = Unit.a;
                }
                if ((var11_11 = var5_5.m) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                    var9_9 = 0;
                    var11_11 = null;
                }
                var11_11.setVisibility(0);
            } else if ((var9_9 = (int)var12_12.c7()) != 0 && (var11_11 = var12_12.G1()) == null) {
                var11_11 = var12_12.G1();
                if (var11_11 != null) {
                    var11_11 = var11_11.getValue();
                } else {
                    var9_9 = 0;
                    var11_11 = null;
                }
                if (var11_11 == null) {
                    var11_11 = var5_5.q;
                    if (var11_11 != null) {
                        var11_11.setVisibility(var14_14);
                        var11_11 = Unit.a;
                    }
                    if ((var11_11 = var5_5.i) != null) {
                        var11_11.setVisibility(var14_14);
                        var11_11 = Unit.a;
                    }
                }
            }
            var9_9 = 0;
            var11_11 = null;
        }
        var13_13 = var12_12.e1();
        var16_16 = TextUtils.isEmpty((CharSequence)var13_13);
        if (var16_16 != 0) ** GOTO lbl-1000
        var15_15 = h40_0.a;
        var15_15 = z40_0.Companion;
        var15_15 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var15_15).a;
        var17_17 /* !! */  = "enable_fit_tag";
        var16_16 = var15_15.a((String)var17_17 /* !! */ );
        if (var16_16 == 0) ** GOTO lbl-1000
        var15_15 = var12_12.R6();
        if (var15_15 != null) {
            var15_15 = var15_15.getSubRatings();
        } else {
            var16_16 = 0;
            var15_15 = null;
        }
        if (var15_15 != null && (var16_16 = var15_15.isEmpty()) == 0) {
            var5_5.j((String)var13_13);
            if (var11_11 != null && (var18_18 = ((Object)var11_11).length) != 0) {
                var5_5.e((String[])var11_11);
            } else {
                var11_11 = var5_5.q;
                if (var11_11 != null) {
                    var11_11.setVisibility(var14_14);
                    var11_11 = Unit.a;
                }
            }
        } else if (var11_11 != null && (var18_18 = ((Object)var11_11).length) != 0) {
            var13_13 = var11_11[0];
            var18_18 = (int)mz3_0.R((String)var13_13);
            if (var18_18 != 0) {
                var13_13 = var11_11[0];
                Intrinsics.checkNotNull(var13_13);
            } else {
                var13_13 = "";
            }
            var15_15 = var5_5.d;
            var15_15.B6((String)var13_13);
            var5_5.e((String[])var11_11);
            var18_18 = ((Object)var11_11).length;
            if (var18_18 > var8_8 && (var18_18 = (int)mz3_0.R((String)(var13_13 = var11_11[var8_8]))) != 0 && (var11_11 = (var18_18 = ((Object)var11_11).length) > (var19_19 = 2) ? var11_11[var19_19] : var11_11[var8_8]) != null) {
                var13_13 = var15_15.M8();
                var18_18 = (int)var13_13.contains(var11_11);
                if (var18_18 == 0) {
                    var15_15.X((String)var11_11);
                    var5_5.r((String)var11_11);
                }
                var11_11 = Unit.a;
            }
        } else {
            var11_11 = var5_5.q;
            if (var11_11 != null) {
                var11_11.setVisibility(var14_14);
                var11_11 = Unit.a;
            }
        }
        var9_9 = R$id.close_button;
        var11_11 = (ImageButton)var10_10.findViewById(var9_9);
        var5_5.z = var11_11;
        var13_13 = "closeButton";
        if (var11_11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
            var9_9 = 0;
            var11_11 = null;
        }
        var11_11.setOnClickListener((View.OnClickListener)var5_5);
        var9_9 = R$id.size_top_divider;
        var11_11 = var10_10.findViewById(var9_9);
        var5_5.A = var11_11;
        var9_9 = R$id.add_to_cart_layout;
        var11_11 = (LinearLayout)var10_10.findViewById(var9_9);
        var5_5.y = var11_11;
        var9_9 = R$id.tl_size_unit;
        var11_11 = (TabLayout)var10_10.findViewById(var9_9);
        var5_5.B = var11_11;
        var9_9 = R$id.rv_size_instructions;
        var11_11 = (RecyclerView)var10_10.findViewById(var9_9);
        var5_5.C = var11_11;
        var9_9 = R$id.iv_size_instructions;
        var11_11 = (ImageView)var10_10.findViewById(var9_9);
        var5_5.D = var11_11;
        var9_9 = R$id.cv_size_toggle_container;
        var11_11 = (CardView)var10_10.findViewById(var9_9);
        var5_5.E = var11_11;
        var9_9 = (int)var5_5.g;
        var15_15 = "addToBag";
        if (var9_9 != 0) {
            var11_11 = var5_5.y;
            if (var11_11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                var9_9 = 0;
                var11_11 = null;
            }
            var11_11.setVisibility(0);
            var11_11 = var5_5.y;
            if (var11_11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                var9_9 = 0;
                var11_11 = null;
            }
            var11_11.setOnClickListener((View.OnClickListener)var5_5);
            var11_11 = var5_5.A;
            if (var11_11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("divider");
                var9_9 = 0;
                var11_11 = null;
            }
            var11_11.setVisibility(var14_14);
        } else {
            var11_11 = var5_5.y;
            if (var11_11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                var9_9 = 0;
                var11_11 = null;
            }
            var11_11.setVisibility(var14_14);
            var11_11 = var5_5.z;
            if (var11_11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var9_9 = 0;
                var11_11 = null;
            }
            var11_11.setVisibility(var14_14);
            var11_11 = var5_5.C;
            if (var11_11 != null) {
                var11_11.setVisibility(var14_14);
                var11_11 = Unit.a;
            }
            if ((var11_11 = var5_5.D) != null) {
                var11_11.setVisibility(var14_14);
                var11_11 = Unit.a;
            }
            if ((var11_11 = var5_5.E) != null) {
                var11_11.setVisibility(var14_14);
                var11_11 = Unit.a;
            }
            var5_5.L = false;
        }
        var9_9 = R$id.pdp_size_container_parent;
        var11_11 = (LinearLayout)var10_10.findViewById(var9_9);
        var5_5.r = var11_11;
        var9_9 = R$id.pdp_size_container;
        var11_11 = (RelativeLayout)var10_10.findViewById(var9_9);
        var5_5.s = var11_11;
        var9_9 = R$id.pdp_size_text;
        var11_11 = (TextView)var10_10.findViewById(var9_9);
        var5_5.t = var11_11;
        var20_20 = "selectedSizeText";
        if (var11_11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
            var9_9 = 0;
            var11_11 = null;
        }
        ai0_2.t((View)var11_11);
        var9_9 = R$id.pdp_size_info_tv_text;
        var11_11 = (TextView)var10_10.findViewById(var9_9);
        var5_5.u = var11_11;
        var9_9 = R$id.pdp_size_info_unit;
        var11_11 = (TextView)var10_10.findViewById(var9_9);
        var5_5.v = var11_11;
        var9_9 = R$id.x_item_left;
        var11_11 = (TextView)var10_10.findViewById(var9_9);
        var5_5.x = var11_11;
        var9_9 = R$id.brand_selection_container;
        var11_11 = (LinearLayout)var10_10.findViewById(var9_9);
        var5_5.H = var11_11;
        var9_9 = R$id.brand_sizing_tv;
        var11_11 = (AjioTextView)var10_10.findViewById(var9_9);
        var5_5.J = var11_11;
        var9_9 = R$id.brandSize_switch;
        var11_11 = (SwitchCompat)var10_10.findViewById(var9_9);
        var5_5.I = var11_11;
        var11_11 = var5_5.C;
        if (var11_11 != null) {
            AJIOApplication.Companion.getClass();
            var15_15 = AJIOApplication$a.a();
            var13_13 = new LinearLayoutManager((Context)var15_15, 0, false);
            var11_11.setLayoutManager((RecyclerView$o)var13_13);
            var11_11 = Unit.a;
        }
        var11_11 = var5_5.C;
        var13_13 = var5_5.K;
        if (var11_11 != null) {
            var11_11.setAdapter((RecyclerView$f)var13_13);
            var11_11 = Unit.a;
        }
        var21_21 /* !! */  = new Object();
        tj2_2.Companion.getClass();
        var11_11 = tj2$a_0.a();
        var15_15 = var12_12.x5();
        if (var15_15 != null) {
            var15_15 = var15_15.getBrickName();
        } else {
            var16_16 = 0;
            var15_15 = null;
        }
        var17_17 /* !! */  = var12_12.x5();
        if (var17_17 /* !! */  != null) {
            var17_17 /* !! */  = var17_17 /* !! */ .getBrickCategory();
        } else {
            var19_19 = 0;
            var17_17 /* !! */  = null;
        }
        var11_11.getClass();
        var11_11 = tj2_2.a((String)var15_15, (String)var17_17 /* !! */ );
        if (var11_11 != null && (var11_11 = var11_11.getColors()) != null) {
            var15_15 = new ArrayList();
            var11_11 = var11_11.iterator();
            while ((var19_19 = (int)var11_11.hasNext()) != 0) {
                var17_17 /* !! */  = (String)var11_11.next();
                var23_23 = "--";
                var22_22 /* !! */  = new g63_0((String)var17_17 /* !! */ , (String)var23_23, (String)var23_23, (String)var23_23);
                var15_15.add(var22_22 /* !! */ );
            }
            var13_13.getClass();
            Intrinsics.checkNotNullParameter(var15_15, "list");
            var11_11 = var13_13.a;
            var11_11.clear();
            var11_11.addAll(var15_15);
            var13_13.notifyDataSetChanged();
            var11_11 = Unit.a;
        }
        this.i();
        var11_11 = "pdpSizeContainer";
        var23_23 = "format(...)";
        if (var6_6 != null && (var18_18 = var2_2.isEmpty() ^ var8_8) != 0) {
            var13_13 = var2_2.iterator();
            var16_16 = 0;
            var15_15 = null;
            while ((var19_19 = (int)var13_13.hasNext()) != 0 && (var19_19 = (int)(var17_17 /* !! */  = (ProductOptionVariant)var13_13.next()).isStockAvailable()) == 0) {
                var16_16 += var8_8;
            }
            var18_18 = R$id.product_detail_size_rv;
            var5_5.w = var13_13 = (RecyclerView)var10_10.findViewById(var18_18);
            var24_24 = "recyclerView";
            if (var13_13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                var17_17 /* !! */  = var1_1;
                var18_18 = 0;
                var13_13 = null;
            } else {
                var17_17 /* !! */  = var1_1;
            }
            var13_13.setLayoutManager((RecyclerView$o)var17_17 /* !! */ );
            var13_13 = var5_5.s;
            if (var13_13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                var18_18 = 0;
                var13_13 = null;
            }
            var13_13.setVisibility(0);
            var11_11 = var5_5.w;
            if (var11_11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                var9_9 = 0;
                var11_11 = null;
            }
            var13_13 = new u63_0(var5_5, (ArrayList)var6_6);
            var11_11.addOnScrollListener((RecyclerView$s)var13_13);
            var11_11 = var5_5.w;
            if (var11_11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                var9_9 = 0;
                var11_11 = null;
            }
            var11_11 = var11_11.getContext();
            var13_13 = new v63_0(var5_5, (ArrayList)var6_6, (Context)var11_11);
            if (var16_16 >= 0) {
                var13_13.setTargetPosition(var16_16);
                var11_11 = var5_5.w;
                if (var11_11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                    var9_9 = 0;
                    var11_11 = null;
                }
                if ((var11_11 = var11_11.getLayoutManager()) != null) {
                    var11_11.startSmoothScroll((RecyclerView$x)var13_13);
                    var11_11 = Unit.a;
                }
            }
            var25_25 = var10_10 instanceof RelativeLayout;
            var11_11 = var5_5.p;
            if (var11_11 == null) {
                var10_10 = var5_5.b;
                var15_15 = var5_5.a;
                var11_11 = var17_17 /* !! */ ;
                var6_6 = var2_2;
                var13_13 = this;
                var26_26 = var17_17 /* !! */ ;
                var19_19 = var25_25;
                var27_27 = var25_25;
                var25_25 = (int)var3_3;
                var28_28 = var23_23;
                var29_29 = var4_4;
                var17_17 /* !! */  = new L12((c92)var10_10, (ArrayList)var2_2, this, (yi2_1)var15_15, (boolean)var19_19, var3_3, (vb2_1)var21_21 /* !! */ , (boolean)var4_4);
                var5_5.p = var17_17 /* !! */ ;
                var11_11 = var5_5.w;
                if (var11_11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var24_24);
                    var9_9 = 0;
                    var11_11 = null;
                }
                var10_10 = var5_5.p;
                var11_11.setAdapter((RecyclerView$f)var10_10);
                var11_11 = Unit.a;
            } else {
                var27_27 = var25_25;
                var28_28 = var23_23;
                var11_11.notifyDataSetChanged();
                var11_11 = Unit.a;
            }
            var11_11 = var12_12.G1();
            var10_10 = " from popup";
            var6_6 = "%s\u00a0";
            var13_13 = "selectedSizeTv";
            var15_15 = "xItemLeftTv";
            var17_17 /* !! */  = "selectedSizeUnit";
            if (var11_11 != null) {
                var11_11 = var5_5.u;
                if (var11_11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                    var9_9 = 0;
                    var11_11 = null;
                }
                var11_11.setVisibility(0);
                this.d();
                var11_11 = StringCompanionObject.INSTANCE;
                var9_9 = R$string.size_info;
                var11_11 = hv3_0.K(var9_9);
                var22_22 /* !! */  = var12_12.G1();
                if (var22_22 /* !! */  != null) {
                    var22_22 /* !! */  = var22_22 /* !! */ .getValue();
                } else {
                    var25_25 = 0;
                    var22_22 /* !! */  = null;
                }
                var21_21 /* !! */  = new Object[var8_8];
                var21_21 /* !! */ [0] = var22_22 /* !! */ ;
                var11_11 = xh2_0.a((Object[])var21_21 /* !! */ , var8_8, (String)var11_11, var28_28);
                var22_22 /* !! */  = var12_12.x7();
                if (var22_22 /* !! */  != null && (var25_25 = var22_22 /* !! */ .length()) != 0) {
                    var22_22 /* !! */  = var5_5.t;
                    if (var22_22 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var25_25 = 0;
                        var22_22 /* !! */  = null;
                    }
                    var21_21 /* !! */  = var12_12.x7();
                    var22_22 /* !! */ .setText((CharSequence)var21_21 /* !! */ );
                } else {
                    var22_22 /* !! */  = var5_5.t;
                    if (var22_22 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var25_25 = 0;
                        var22_22 /* !! */  = null;
                    }
                    var30_30 = R$string.size;
                    var21_21 /* !! */  = hv3_0.K(var30_30);
                    var22_22 /* !! */ .setText((CharSequence)var21_21 /* !! */ );
                }
                if (var27_27 != 0) {
                    var22_22 /* !! */  = var5_5.t;
                    if (var22_22 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var25_25 = 0;
                        var22_22 /* !! */  = null;
                    }
                    if ((var21_21 /* !! */  = var5_5.t) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var30_30 = 0;
                        var21_21 /* !! */  = null;
                    }
                    var21_21 /* !! */  = var21_21 /* !! */ .getText();
                    var23_23 = new StringBuilder();
                    var23_23.append(var21_21 /* !! */ );
                    var23_23.append((String)var10_10);
                    var21_21 /* !! */  = var23_23.toString();
                    var22_22 /* !! */ .setContentDescription((CharSequence)var21_21 /* !! */ );
                }
                if ((var25_25 = (int)hv3_0.Y()) != 0) {
                    var22_22 /* !! */  = var12_12.s3();
                    var25_25 = (int)mz3_0.R((String)var22_22 /* !! */ );
                    if (var25_25 != 0) {
                        var22_22 /* !! */  = var5_5.v;
                        if (var22_22 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_17 /* !! */ );
                            var25_25 = 0;
                            var22_22 /* !! */  = null;
                        }
                        var21_21 /* !! */  = var12_12.s3();
                        var23_23 = new Object[var8_8];
                        var23_23[0] = var21_21 /* !! */ ;
                        zn0_1.b((Object[])var23_23, var8_8, (String)var6_6, var28_28, (TextView)var22_22 /* !! */ );
                        var6_6 = var5_5.v;
                        if (var6_6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_17 /* !! */ );
                            var31_31 = 0;
                            var6_6 = null;
                        }
                        var6_6.setVisibility(0);
                    } else {
                        var6_6 = var5_5.v;
                        if (var6_6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_17 /* !! */ );
                            var31_31 = 0;
                            var6_6 = null;
                        }
                        var25_25 = 8;
                        var6_6.setVisibility(var25_25);
                    }
                } else {
                    var22_22 /* !! */  = var12_12.t3();
                    var25_25 = (int)mz3_0.R((String)var22_22 /* !! */ );
                    if (var25_25 != 0) {
                        var22_22 /* !! */  = var5_5.v;
                        if (var22_22 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_17 /* !! */ );
                            var25_25 = 0;
                            var22_22 /* !! */  = null;
                        }
                        var21_21 /* !! */  = var12_12.t3();
                        var23_23 = new Object[var8_8];
                        var23_23[0] = var21_21 /* !! */ ;
                        zn0_1.b((Object[])var23_23, var8_8, (String)var6_6, var28_28, (TextView)var22_22 /* !! */ );
                        var6_6 = var5_5.v;
                        if (var6_6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_17 /* !! */ );
                            var31_31 = 0;
                            var6_6 = null;
                        }
                        var6_6.setVisibility(0);
                    } else {
                        var6_6 = var5_5.v;
                        if (var6_6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var17_17 /* !! */ );
                            var31_31 = 0;
                            var6_6 = null;
                        }
                        var25_25 = 8;
                        var6_6.setVisibility(var25_25);
                    }
                }
                var31_31 = (int)TextUtils.isEmpty((CharSequence)var11_11);
                if (var31_31 == 0) {
                    var6_6 = var5_5.u;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                        var31_31 = 0;
                        var6_6 = null;
                    }
                    var22_22 /* !! */  = new Object[var8_8];
                    var22_22 /* !! */ [0] = var11_11;
                    var11_11 = "(%s)";
                    zn0_1.b(var22_22 /* !! */ , var8_8, (String)var11_11, var28_28, (TextView)var6_6);
                }
                var11_11 = z40_0.Companion;
                var11_11 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var11_11).a;
                var6_6 = "pdp_product_unit_display_control";
                var9_9 = (int)var11_11.a((String)var6_6);
                if (var9_9 != 0) {
                    var9_9 = (int)var12_12.K5();
                    if (var9_9 != 0) {
                        var11_11 = var5_5.x;
                        if (var11_11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                            var9_9 = 0;
                            var11_11 = null;
                        }
                        var31_31 = 8;
                        var11_11.setVisibility(var31_31);
lbl517:
                        // 2 sources

                        while (true) {
                            var2_2 = var10_10;
                            var32_32 = var13_13;
                            var33_33 = var17_17 /* !! */ ;
                            var34_34 = var20_20;
                            break;
                        }
                    } else {
                        var11_11 = var12_12.G1();
                        if (var11_11 != null) {
                            var9_9 = var11_11.getStockLevel();
                            var11_11 = var9_9;
                        } else {
                            var9_9 = 0;
                            var11_11 = null;
                        }
                        Intrinsics.checkNotNull(var11_11);
                        var31_31 = var11_11.intValue();
                        var22_22 /* !! */  = "_";
                        var21_21 /* !! */  = "PDP_";
                        if (var31_31 <= 0 && (var29_29 = var12_12.K5()) == 0) {
                            var11_11 = var5_5.x;
                            if (var11_11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                var9_9 = 0;
                                var11_11 = null;
                            }
                            var31_31 = R$string.sorry_ooo_product;
                            var11_11.setText(var31_31);
                            var11_11 = var5_5.x;
                            if (var11_11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                var9_9 = 0;
                                var11_11 = null;
                            }
                            var11_11.setVisibility(0);
                            var11_11 = AnalyticsManager.Companion;
                            var6_6 = var11_11.getInstance().getGtmEvents();
                            var15_15 = var12_12.G1();
                            if (var15_15 != null) {
                                var15_15 = var15_15.getCode();
                            } else {
                                var16_16 = 0;
                                var15_15 = null;
                            }
                            var29_29 = R$string.sorry_ooo_product;
                            var23_23 = hv3_0.K(var29_29);
                            var15_15 = UX.c((String)var21_21 /* !! */ , (String)var15_15, (String)var22_22 /* !! */ , (String)var23_23);
                            var22_22 /* !! */  = "LastFewUnitsLeft";
                            ak0_0.a((AnalyticsManager$Companion)var11_11, (GTMEvents)var6_6, (String)var22_22 /* !! */ , (String)var15_15);
                            ** continue;
                        }
                        var23_23 = "outofstock";
                        var24_24 = "Out Of Stock";
                        var7_7 = "productName";
                        var1_1 = "In Stock";
                        var26_26 = "Product_Brick";
                        var2_2 = var10_10;
                        var10_10 = "Product_Vertical";
                        if (var8_8 <= var31_31 && var31_31 < (var8_8 = 3)) {
                            var6_6 = var5_5.x;
                            if (var6_6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                var31_31 = 0;
                                var6_6 = null;
                            }
                            var8_8 = R$string.hurry_x_product;
                            var35_35 = hv3_0.K(var8_8);
                            var33_33 = var17_17 /* !! */ ;
                            var34_34 = var20_20;
                            var36_36 = 1;
                            var17_17 /* !! */  = new Object[var36_36];
                            var32_32 = var13_13;
                            var18_18 = 0;
                            var13_13 = null;
                            var17_17 /* !! */ [0] = var11_11;
                            zn0_1.b(var17_17 /* !! */ , var36_36, var35_35, var28_28, (TextView)var6_6);
                            var11_11 = var5_5.x;
                            if (var11_11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                var9_9 = 0;
                                var11_11 = null;
                            }
                            var11_11.setVisibility(0);
                            var11_11 = new Bundle();
                            var6_6 = var12_12.x5();
                            if (var6_6 != null) {
                                var13_13 = var6_6.getVerticalColor();
                                var11_11.putString((String)var10_10, (String)var13_13);
                                var10_10 = var6_6.getBrickCategory();
                                var11_11.putString((String)var26_26, (String)var10_10);
                                var10_10 = var6_6.getName();
                                var11_11.putString(var7_7, (String)var10_10);
                                var37_37 = (int)var12_12.S5();
                                var26_26 = var37_37 == 0 ? var24_24 : var1_1;
                                var11_11.putString((String)var23_23, (String)var26_26);
                            }
                            var10_10 = AnalyticsManager.Companion;
                            var38_39 = var10_10.getInstance().getGtmEvents();
                            var6_6 = var12_12.G1();
                            if (var6_6 != null) {
                                var6_6 = var6_6.getCode();
                            } else {
                                var31_31 = 0;
                                var6_6 = null;
                            }
                            var18_18 = R$string.hurry_few_product;
                            var13_13 = hv3_0.K(var18_18);
                            var39_40 = UX.c((String)var21_21 /* !! */ , (String)var6_6, (String)var22_22 /* !! */ , (String)var13_13);
                            var40_41 = av_0.a((AnalyticsManager$Companion)var10_10);
                            var41_42 = ne_0.b((Bundle)var11_11);
                            var42_43 = "LastFewUnitsLeft";
                            var43_44 = null;
                            var44_45 = 16;
                            var45_47 = null;
                            GTMEvents.pushButtonTapEvent$default((GTMEvents)var38_39, var42_43, var39_40, var40_41, (AnalyticsData)var41_42, null, var44_45, null);
                        } else {
                            var32_32 = var13_13;
                            var33_33 = var17_17 /* !! */ ;
                            var34_34 = var20_20;
                            var9_9 = 10;
                            if (var31_31 < var9_9) {
                                var11_11 = var5_5.x;
                                if (var11_11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                    var9_9 = 0;
                                    var11_11 = null;
                                }
                                var31_31 = R$string.hurry_few_product;
                                var11_11.setText(var31_31);
                                var11_11 = var5_5.x;
                                if (var11_11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                    var9_9 = 0;
                                    var11_11 = null;
                                }
                                var31_31 = 0;
                                var11_11.setVisibility(0);
                                var11_11 = new Bundle();
                                var6_6 = var12_12.x5();
                                if (var6_6 != null) {
                                    var13_13 = var6_6.getVerticalColor();
                                    var11_11.putString((String)var10_10, (String)var13_13);
                                    var10_10 = var6_6.getBrickCategory();
                                    var11_11.putString((String)var26_26, (String)var10_10);
                                    var10_10 = var6_6.getName();
                                    var11_11.putString(var7_7, (String)var10_10);
                                    var37_37 = (int)var12_12.S5();
                                    var26_26 = var37_37 == 0 ? var24_24 : var1_1;
                                    var11_11.putString((String)var23_23, (String)var26_26);
                                }
                                var10_10 = AnalyticsManager.Companion;
                                var38_39 = var10_10.getInstance().getGtmEvents();
                                var6_6 = var12_12.G1();
                                if (var6_6 != null) {
                                    var6_6 = var6_6.getCode();
                                } else {
                                    var31_31 = 0;
                                    var6_6 = null;
                                }
                                var18_18 = R$string.hurry_few_product;
                                var13_13 = hv3_0.K(var18_18);
                                var39_40 = UX.c((String)var21_21 /* !! */ , (String)var6_6, (String)var22_22 /* !! */ , (String)var13_13);
                                var40_41 = av_0.a((AnalyticsManager$Companion)var10_10);
                                var41_42 = ne_0.b((Bundle)var11_11);
                                var42_43 = "LastFewUnitsLeft";
                                var43_44 = null;
                                var44_46 = 16;
                                var45_47 = null;
                                GTMEvents.pushButtonTapEvent$default((GTMEvents)var38_39, var42_43, var39_40, var40_41, (AnalyticsData)var41_42, null, var44_46, null);
                            } else {
                                var11_11 = var5_5.x;
                                if (var11_11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                    var9_9 = 0;
                                    var11_11 = null;
                                }
                                var37_37 = 8;
                                var11_11.setVisibility(var37_37);
                            }
                        }
                    }
                } else {
                    var2_2 = var10_10;
                    var32_32 = var13_13;
                    var33_33 = var17_17 /* !! */ ;
                    var34_34 = var20_20;
                    var37_37 = 8;
                    var11_11 = var5_5.x;
                    if (var11_11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                        var9_9 = 0;
                        var11_11 = null;
                    }
                    var11_11.setVisibility(var37_37);
                }
            } else {
                var2_2 = var10_10;
                var32_32 = var13_13;
                var33_33 = var17_17 /* !! */ ;
                var34_34 = var20_20;
                var37_37 = 8;
                var11_11 = var5_5.u;
                if (var11_11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                    var9_9 = 0;
                    var11_11 = null;
                }
                var11_11.setVisibility(var37_37);
                var11_11 = var5_5.x;
                if (var11_11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                    var9_9 = 0;
                    var11_11 = null;
                }
                var11_11.setVisibility(var37_37);
                var9_9 = (int)var12_12.c9();
                if (var9_9 != 0) {
                    var9_9 = R$string.luxe_select_size;
lbl713:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var9_9 = R$string.select_size;
                ** continue;
                var11_11 = hv3_0.K(var9_9);
                var37_37 = (int)hv3_0.Y();
                if (var37_37 != 0) {
                    var10_10 = var12_12.s3();
                    var37_37 = (int)mz3_0.R((String)var10_10);
                    if (var37_37 != 0) {
                        var10_10 = var5_5.v;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                            var37_37 = 0;
                            var10_10 = null;
                        }
                        var13_13 = StringCompanionObject.INSTANCE;
                        var13_13 = var12_12.s3();
                        var16_16 = 1;
                        var17_17 /* !! */  = new Object[var16_16];
                        var25_25 = 0;
                        var22_22 /* !! */  = null;
                        var17_17 /* !! */ [0] = var13_13;
                        zn0_1.b(var17_17 /* !! */ , var16_16, (String)var6_6, var28_28, (TextView)var10_10);
                        var10_10 = var5_5.v;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                            var37_37 = 0;
                            var10_10 = null;
                        }
                        var10_10.setVisibility(0);
                    } else {
                        var10_10 = var5_5.v;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                            var37_37 = 0;
                            var10_10 = null;
                        }
                        var31_31 = 8;
                        var10_10.setVisibility(var31_31);
                    }
                } else {
                    var10_10 = var12_12.t3();
                    var37_37 = (int)mz3_0.R((String)var10_10);
                    if (var37_37 != 0) {
                        var10_10 = var5_5.v;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                            var37_37 = 0;
                            var10_10 = null;
                        }
                        var13_13 = StringCompanionObject.INSTANCE;
                        var13_13 = var12_12.t3();
                        var16_16 = 1;
                        var17_17 /* !! */  = new Object[var16_16];
                        var25_25 = 0;
                        var22_22 /* !! */  = null;
                        var17_17 /* !! */ [0] = var13_13;
                        zn0_1.b(var17_17 /* !! */ , var16_16, (String)var6_6, var28_28, (TextView)var10_10);
                        var10_10 = var5_5.v;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                            var37_37 = 0;
                            var10_10 = null;
                        }
                        var10_10.setVisibility(0);
                    } else {
                        var10_10 = var5_5.v;
                        if (var10_10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                            var37_37 = 0;
                            var10_10 = null;
                        }
                        var31_31 = 8;
                        var10_10.setVisibility(var31_31);
                    }
                }
                var10_10 = var12_12.x7();
                if (var10_10 != null && (var37_37 = var10_10.length()) != 0) {
                    var11_11 = var5_5.t;
                    if (var11_11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var34_34);
                        var9_9 = 0;
                        var11_11 = null;
                    }
                    var37_37 = R$string.fs_filter_select;
                    var6_6 = var12_12.x7();
                    var15_15 = new Object[1];
                    var18_18 = 0;
                    var13_13 = null;
                    var15_15[0] = var6_6;
                    var10_10 = hv3_0.L(var37_37, (Object[])var15_15);
                    var11_11.setText((CharSequence)var10_10);
                } else {
                    var10_10 = var5_5.t;
                    if (var10_10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var34_34);
                        var37_37 = 0;
                        var10_10 = null;
                    }
                    var10_10.setText((CharSequence)var11_11);
                }
            }
            var11_11 = new StringBuilder();
            var10_10 = var5_5.t;
            if (var10_10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var34_34);
                var37_37 = 0;
                var10_10 = null;
            }
            if ((var37_37 = var10_10.getVisibility()) == 0) {
                var10_10 = var5_5.t;
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var34_34);
                    var37_37 = 0;
                    var10_10 = null;
                }
                var10_10 = var10_10.getText();
                var11_11.append((CharSequence)var10_10);
            }
            if ((var10_10 = var5_5.u) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var32_32);
                var37_37 = 0;
                var10_10 = null;
            }
            var37_37 = var10_10.getVisibility();
            var6_6 = ",";
            if (var37_37 == 0) {
                var11_11.append((String)var6_6);
                var10_10 = var5_5.u;
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var32_32);
                    var37_37 = 0;
                    var10_10 = null;
                }
                var10_10 = var10_10.getText();
                var11_11.append((CharSequence)var10_10);
            }
            if ((var10_10 = var5_5.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var37_37 = 0;
                var10_10 = null;
            }
            if ((var37_37 = var10_10.getVisibility()) == 0) {
                var11_11.append((String)var6_6);
                var10_10 = var5_5.v;
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                    var37_37 = 0;
                    var10_10 = null;
                }
                var10_10 = var10_10.getText();
                var11_11.append((CharSequence)var10_10);
            }
            if (var27_27 != 0) {
                var10_10 = var5_5.r;
                if (var10_10 != null) {
                    var6_6 = new StringBuilder();
                    var6_6.append(var11_11);
                    var11_11 = var2_2;
                    var6_6.append((String)var2_2);
                    var11_11 = var6_6.toString();
                    var10_10.setContentDescription((CharSequence)var11_11);
                }
            } else {
                var10_10 = var5_5.r;
                if (var10_10 != null) {
                    var11_11 = var11_11.toString();
                    var10_10.setContentDescription((CharSequence)var11_11);
                }
            }
        } else {
            var28_28 = var23_23;
            var31_31 = 8;
            var10_10.setVisibility(var31_31);
            var10_10 = var5_5.s;
            if (var10_10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
                var37_38 = false;
                var10_10 = null;
            }
            var10_10.setVisibility(var31_31);
        }
        var9_9 = (int)var12_12.E0();
        var10_10 = var5_5.Q;
        if (var9_9 != 0 && (var9_9 = (int)this.g()) != 0) {
            var11_11 = var5_5.H;
            if (var11_11 != null) {
                var31_31 = 0;
                var6_6 = null;
                var11_11.setVisibility(0);
                var11_11 = Unit.a;
            }
            if ((var11_11 = var5_5.I) != null) {
                var31_31 = (int)var12_12.N0();
                var11_11.setChecked((boolean)var31_31);
                var11_11 = Unit.a;
            }
            if ((var11_11 = var5_5.J) != null) {
                var6_6 = StringCompanionObject.INSTANCE;
                cp_1.Companion.getClass();
                cp$a.e().getClass();
                var6_6 = z40_0.Companion;
                var6_6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var6_6).a.b("brand_size_disply_label_pdp");
                var13_13 = var12_12.x5();
                if (var13_13 != null) {
                    var26_26 = var13_13.getBrandName();
                    var18_18 = 1;
                } else {
                    var18_18 = 1;
                    var26_26 = null;
                }
                var15_15 = new Object[var18_18];
                var19_19 = 0;
                var17_17 /* !! */  = null;
                var15_15[0] = var26_26;
                n40_0.a((Object[])var15_15, var18_18, (String)var6_6, var28_28, (AjioTextView)var11_11);
                var11_11 = Unit.a;
            }
            if ((var11_11 = var5_5.I) != null) {
                var6_6 = new n63_0(var5_5);
                var11_11.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)var6_6);
                var11_11 = Unit.a;
            }
            var38_39 = var10_10.getEC_PRODUCT_DETAILS_INTERACTIONS();
            var41_42 = av_0.a(AnalyticsManager.Companion);
            var45_47 = this.f();
            var42_43 = "brand toggle";
            var39_40 = "visible";
            var40_41 = "event_size_guide_interactions";
            var43_44 = "pdp screen";
            var11_11 = var5_5.R;
            var6_6 = var5_5.S;
            var46_48 = 1536;
            var34_34 = var10_10;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var10_10, (String)var38_39, var42_43, var39_40, var40_41, (String)var41_42, var43_44, (String)var11_11, var45_47, (String)var6_6, false, null, var46_48, null);
        } else {
            var11_11 = var5_5.H;
            if (var11_11 != null) {
                var31_31 = 8;
                var11_11.setVisibility(var31_31);
                var11_11 = Unit.a;
            }
            var38_39 = var10_10.getEC_PRODUCT_DETAILS_INTERACTIONS();
            var41_42 = av_0.a(AnalyticsManager.Companion);
            var45_47 = this.f();
            var42_43 = "brand toggle";
            var39_40 = "not visible";
            var40_41 = "event_size_guide_interactions";
            var43_44 = "pdp screen";
            var11_11 = var5_5.R;
            var6_6 = var5_5.S;
            var46_49 = 1536;
            var34_34 = var10_10;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var10_10, (String)var38_39, var42_43, var39_40, var40_41, (String)var41_42, var43_44, (String)var11_11, var45_47, (String)var6_6, false, null, var46_49, null);
        }
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Animation animation2 = this.G;
        if (animation == animation2) {
            animation = this.e;
            int n3 = 8;
            animation.setVisibility(n3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View var1_1) {
        block36: {
            block39: {
                block38: {
                    block37: {
                        block32: {
                            block31: {
                                block30: {
                                    var2_2 = this;
                                    var3_3 = false;
                                    var4_4 = null;
                                    var5_7 = 1;
                                    var6_8 = 0;
                                    var7_9 = null;
                                    if (var1_1 != null) {
                                        var8_10 = var1_1.getId();
                                        var9_11 = var8_10;
                                    } else {
                                        var8_10 = 0;
                                        var9_11 = null;
                                    }
                                    var10_12 = R$id.size_chart;
                                    var11_13 = var2_2.c;
                                    var12_14 = var2_2.a;
                                    if (var9_11 == null || (var13_15 = var9_11.intValue()) != var10_12) break block36;
                                    var14_16 = var2_2.Q;
                                    var15_17 = var14_16.getEC_PRODUCT_DETAILS_INTERACTIONS();
                                    var4_4 = AnalyticsManager.Companion;
                                    var16_18 = av_0.a((AnalyticsManager$Companion)var4_4);
                                    var17_19 = var12_14.x5();
                                    var18_22 = 0.0;
                                    if (var17_19 != null) {
                                        try {
                                            var4_4 = var17_19.getPrice();
                                            if (var4_4 == null) break block30;
                                            var4_4 = var4_4.getValue();
                                            break block31;
                                        }
                                        catch (NumberFormatException var4_5) {
                                            break block32;
                                        }
                                    }
                                }
                                var3_3 = false;
                                var4_4 = null;
                            }
                            if (var4_4 == null || var17_19 == null || (var4_4 = var17_19.getPrice()) == null || (var4_4 = var4_4.getValue()) == null) break block37;
                            var20_23 = Double.parseDouble((String)var4_4);
                            break block38;
                        }
                        var22_24 = yn3_0.a;
                        var22_24.e(var4_5);
                    }
                    var20_23 = var18_22;
                }
                var3_3 = var20_23 == var18_22 ? 0 : (var20_23 < var18_22 ? -1 : 1);
                if (var3_3) {
                    block35: {
                        block34: {
                            block33: {
                                try {
                                    Intrinsics.checkNotNull(var17_19);
                                    var4_4 = var17_19.getWasPriceData();
                                    if (var4_4 == null) break block33;
                                    var4_4 = var4_4.getValue();
                                    break block34;
                                }
                                catch (NumberFormatException var4_6) {
                                    break block35;
                                }
                            }
                            var3_3 = false;
                            var4_4 = null;
                        }
                        if (var4_4 != null) {
                            var4_4 = var17_19.getWasPriceData();
                            if (var4_4 != null && (var4_4 = var4_4.getValue()) != null) {
                                var23_26 = Double.parseDouble((String)var4_4);
                                var4_4 = var23_26;
                            } else {
                                var3_3 = false;
                                var4_4 = null;
                            }
                            Intrinsics.checkNotNull(var4_4);
                            var18_22 = var4_4.doubleValue() - var20_23;
                        }
                        break block39;
                    }
                    var22_24 = yn3_0.a;
                    var22_24.e(var4_6);
                }
            }
            var3_3 = hv3_0.Y();
            var22_24 = "";
            if (!var3_3) ** GOTO lbl-1000
            if (var17_19 != null) {
                var4_4 = var17_19.getSelectedSizeVariant();
            } else {
                var3_3 = false;
                var4_4 = null;
            }
            if (var4_4 != null) {
                var4_4 = Y63.c((ProductOptionVariant)var4_4);
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = var22_24;
            }
            var25_27 /* !! */  = new Bundle();
            var26_28 = var14_16.getPRODUCT_NAME();
            if (var17_19 == null || (var27_29 = var17_19.getName()) == null) {
                var27_29 = var22_24;
            }
            var25_27 /* !! */ .putString((String)var26_28, (String)var27_29);
            var26_28 = var14_16.getPRODUCT_ID();
            if (var17_19 == null || (var27_29 = var17_19.getCode()) == null) {
                var27_29 = var22_24;
            }
            var25_27 /* !! */ .putString((String)var26_28, (String)var27_29);
            var26_28 = var14_16.getPRODUCT_BRAND();
            if (var17_19 == null || (var27_29 = var17_19.getBrandName()) == null) {
                var27_29 = var22_24;
            }
            var25_27 /* !! */ .putString((String)var26_28, (String)var27_29);
            var26_28 = var14_16.getPRODUCT_PRICE();
            if (var17_19 == null || (var27_29 = var17_19.getPrice()) == null || (var27_29 = var27_29.getValue()) == null) {
                var27_29 = var22_24;
            }
            var25_27 /* !! */ .putString((String)var26_28, (String)var27_29);
            var26_28 = var14_16.getPRODUCT_COLOR();
            Intrinsics.checkNotNull(var17_19);
            var27_29 = hv3_0.n((Product)var17_19);
            var25_27 /* !! */ .putString((String)var26_28, (String)var27_29);
            var26_28 = var14_16.getPRODUCT_SIZE();
            var25_27 /* !! */ .putString((String)var26_28, (String)var4_4);
            var4_4 = var14_16.getPRODUCT_DISCOUNT();
            var25_27 /* !! */ .putDouble((String)var4_4, var18_22);
            var4_4 = var14_16.getPRODUCT_CATEGORY();
            var9_11 = var17_19.getBrickCategory();
            if (var9_11 == null) {
                var9_11 = var22_24;
            }
            var25_27 /* !! */ .putString((String)var4_4, (String)var9_11);
            var4_4 = var14_16.getPRODUCT_BRICK();
            var9_11 = var17_19.getBrickCategory();
            if (var9_11 == null) {
                var9_11 = var22_24;
            }
            var25_27 /* !! */ .putString((String)var4_4, (String)var9_11);
            var4_4 = var14_16.getPRODUCT_TAG();
            var9_11 = hv3_0.a;
            var28_30 = var17_19.getFnlColorVariantData();
            var9_11.getClass();
            var9_11 = hv3_0.A(var28_30);
            var8_10 = (int)TextUtils.isEmpty((CharSequence)var9_11);
            if (var8_10 == 0) {
                var17_19 = var17_19.getFnlColorVariantData();
                var22_24 = hv3_0.A((ProductFnlColorVariantData)var17_19);
            }
            var25_27 /* !! */ .putString((String)var4_4, (String)var22_24);
            var26_28 = "size chart clicked";
            var27_29 = "";
            var29_32 = "size_chart_clicked";
            var17_19 = var2_2.R;
            var9_11 = var2_2.S;
            var30_33 = 1536;
            var28_30 = var25_27 /* !! */ ;
            var25_27 /* !! */  = "pdp screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var14_16, var15_17, (String)var26_28, (String)var27_29, var29_32, var16_18, (String)var25_27 /* !! */ , (String)var17_19, (Bundle)var28_30, (String)var9_11, false, null, var30_33, null);
            var4_4 = new Bundle();
            var5_7 = (int)var12_14.N0();
            var9_11 = "product_size";
            if (var5_7 != 0) {
                var17_19 = var12_14.G1();
                if (var17_19 != null) {
                    var7_9 = var17_19.getBrickBrandSize();
                }
                var4_4.putString((String)var9_11, (String)var7_9);
            } else {
                var17_19 = var12_14.R5();
                var4_4.putString((String)var9_11, (String)var17_19);
            }
            var17_19 = AnalyticsManager.Companion;
            var7_9 = var17_19.getInstance();
            var12_14 = var7_9.getGtmEvents();
            var15_17 = av_0.a((AnalyticsManager$Companion)var17_19);
            var26_28 = ne_0.b((Bundle)var4_4);
            var14_16 = "Size Selection";
            var27_29 = null;
            var22_24 = "Size Selection";
            var31_34 = 16;
            var16_18 = null;
            GTMEvents.pushButtonTapEvent$default((GTMEvents)var12_14, (String)var22_24, var14_16, var15_17, (AnalyticsData)var26_28, null, var31_34, null);
            var11_13.a7();
            return;
        }
        var6_8 = R$id.add_to_cart_layout;
        var28_31 = var2_2.h;
        var22_25 = var2_2.d;
        if (var9_11 != null && (var32_35 = var9_11.intValue()) == var6_8) {
            var7_9 = var12_14.G1();
            if (var7_9 == null) {
                var7_9 = StringCompanionObject.INSTANCE;
                var6_8 = R$string.acc_error_message;
                var7_9 = hv3_0.K(var6_8);
                var8_10 = R$string.select_the_size;
                var9_11 = hv3_0.K(var8_10);
                var28_31 = new Object[var5_7];
                var28_31[0] = var9_11;
                var4_4 = xh2_0.a(var28_31, var5_7, (String)var7_9, "format(...)");
                var5_7 = R$string.select_the_size;
                var17_20 = hv3_0.K(var5_7);
                var22_25.ia(var17_20, (String)var4_4);
                return;
            }
            var4_4 = cp_1.Companion;
            var3_3 = km_1.b((cp$a)var4_4);
            if (var3_3 && var28_31 != null) {
                ai0_2.B((View)var28_31);
            }
            var11_13.c6();
            return;
        }
        var5_7 = R$id.close_button;
        if (var9_11 == null) {
            return;
        }
        var6_8 = var9_11.intValue();
        if (var6_8 != var5_7) return;
        var17_21 = cp_1.Companion;
        var5_7 = (int)km_1.b(var17_21);
        if (var5_7 != 0 && var28_31 != null) {
            ai0_2.B((View)var28_31);
        }
        var2_2.L = false;
        var22_25.I0();
        this.c();
    }

    public final void q(ArrayList arrayList) {
        boolean bl2;
        O63 o63 = this;
        Object object = arrayList;
        Object object2 = null;
        int n3 = 1;
        Object object3 = "sizeList";
        Intrinsics.checkNotNullParameter(arrayList, (String)object3);
        this.j = arrayList;
        if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
            int n4;
            String string2;
            Object object4;
            float f5;
            Object[] objectArray;
            int n7;
            Object object5;
            Object object6;
            Object object7;
            object = this.p;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((L12)object).h = n3;
                object = this.p;
                Intrinsics.checkNotNull(object);
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            object = o63.z;
            int n8 = 0;
            object3 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("closeButton");
                bl2 = false;
                object = null;
            }
            object.setVisibility(0);
            bl2 = o63.P;
            yi2_1 yi2_12 = o63.a;
            if (bl2) {
                float f6;
                object7 = o63.C;
                if (object7 != null) {
                    object7.setVisibility(0);
                }
                if ((object7 = o63.E) != null) {
                    object7.setVisibility(0);
                }
                tj2_2.Companion.getClass();
                object7 = tj2$a_0.a();
                object6 = yi2_12.x5();
                object6 = object6 != null ? ((Product)object6).getBrickName() : null;
                object5 = yi2_12.x5();
                if (object5 != null) {
                    object5 = ((Product)object5).getBrickCategory();
                } else {
                    n7 = 0;
                    object5 = null;
                    f6 = 0.0f;
                }
                object7.getClass();
                object7 = tj2_2.a((String)object6, (String)object5);
                if (object7 != null && (object6 = o63.D) != null) {
                    f6 = el3.b(o63.o);
                    objectArray = Resources.getSystem().getDisplayMetrics();
                    f5 = objectArray.density;
                    double d2 = (int)(f6 /= f5);
                    double d5 = 0.7;
                    object4 = object6.getLayoutParams();
                    string2 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
                    Intrinsics.checkNotNull(object4, string2);
                    object4 = (LinearLayout.LayoutParams)object4;
                    object4.height = n7 = mz3_0.d((int)(d2 *= d5));
                    object6.setLayoutParams(object4);
                    object6.setVisibility(0);
                    object5 = new da$a();
                    ((da$a)object5).k = n3;
                    ((da$a)object5).g = n3;
                    ((da$a)object5).n = object7 = ((InstructionCategory)object7).getImageUrl();
                    ((da$a)object5).u = object6;
                    ((da$a)object5).a();
                }
            }
            o63.L = n3;
            object7 = o63.e;
            object7.setVisibility(0);
            object6 = o63.f;
            if (object6 != null) {
                object6.setVisibility(0);
            }
            object5 = o63.l;
            int n10 = 8;
            f5 = 1.1E-44f;
            if (object5 != null) {
                object5.setVisibility(n10);
            }
            if ((object5 = o63.m) == null) {
                object5 = "sizeInfoTriangle";
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            } else {
                object3 = object5;
            }
            object3.setVisibility(n10);
            n8 = R$id.parent_layout;
            object3 = (LinearLayout)object7.findViewById(n8);
            if (object3 != null) {
                ai0_2.a((View)object3);
            }
            if ((n4 = km_1.b((cp$a)(object7 = cp_1.Companion))) != 0 && (object7 = o63.h) != null) {
                ai0_2.i((View)object7);
            }
            if (object3 != null) {
                object7 = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_action_popup;
                object7 = hv3_0.K(n4);
                n7 = R$string.luxe_choose_size;
                object5 = hv3_0.K(n7);
                objectArray = new Object[n3];
                objectArray[0] = object5;
                object2 = "format(...)";
                zw_0.a(objectArray, n3, (String)object7, (String)object2, (LinearLayout)object3);
            }
            if (object6 != null) {
                object2 = o63.F;
                object6.startAnimation(object2);
            }
            object5 = o63.Q;
            objectArray = ((NewCustomEventsRevamp)object5).getEC_PRODUCT_DETAILS_INTERACTIONS();
            object2 = new Bundle();
            String string3 = ((NewCustomEventsRevamp)object5).getPRODUCT_NAME();
            object3 = yi2_12.x5();
            object7 = "";
            if (object3 == null || (object3 = ((Product)object3).getName()) == null) {
                object3 = object7;
            }
            object2.putString(string3, (String)object3);
            string3 = ((NewCustomEventsRevamp)object5).getPRODUCT_ID();
            object3 = yi2_12.x5();
            if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
                object3 = object7;
            }
            object2.putString(string3, (String)object3);
            string3 = ((NewCustomEventsRevamp)object5).getPRODUCT_BRAND();
            object3 = yi2_12.x5();
            if (object3 == null || (object3 = ((Product)object3).getBrandName()) == null) {
                object3 = object7;
            }
            object2.putString(string3, (String)object3);
            string3 = ((NewCustomEventsRevamp)object5).getPRODUCT_SIZE();
            object3 = yi2_12.x5();
            if (object3 == null || (object3 = ((Product)object3).getSelectedSize()) == null) {
                object3 = object7;
            }
            object2.putString(string3, (String)object3);
            object4 = "select size view";
            string2 = "";
            String string4 = "event_size_guide_interactions";
            String string5 = "pdp screen";
            String string6 = o63.R;
            string3 = o63.S;
            int n14 = 1600;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)objectArray, (String)object4, string2, string4, string5, string6, null, (Bundle)object2, string3, false, null, n14, null);
            if (bl2) {
                Product product = yi2_12.x5();
                Y63.g(product);
                Object object8 = product != null && (object = product.getImages()) != null && (object = (ProductImage)CollectionsKt.firstOrNull((List)object)) != null && (object = ((ProductImage)object).getUrl()) != null ? object : object7;
                object = AnalyticsManager.Companion.getInstance();
                NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager)object).getNewEEcommerceEventsRevamp();
                Object object9 = product != null && (object = product.getBrickCategory()) != null ? object : object7;
                Object object10 = product != null && (object = product.getCode()) != null ? object : object7;
                String string7 = "size selection halfcut screen";
                object = o63.R;
                String string8 = "1";
                newEEcommerceEventsRevamp.pushEECustomForDisplaySize(string7, (String)object, (String)object9, (String)object8, string8, false, (String)object10, product);
            }
        }
    }

    public final void r(String string2) {
        Bundle bundle = new Bundle();
        Object object = this.a;
        Object object2 = object.x5();
        String string3 = null;
        object2 = object2 != null ? ((Product)object2).getCode() : null;
        String string4 = "product_id";
        bundle.putString(string4, (String)object2);
        object2 = object.x5();
        object2 = object2 != null ? ((Product)object2).getName() : null;
        string4 = "product_name";
        bundle.putString(string4, (String)object2);
        object = object.x5();
        if (object != null) {
            string3 = ((Product)object).getBrandName();
        }
        bundle.putString("product_brand", string3);
        bundle.putString("product_size", string2);
        object = this.Q;
        object2 = ((NewCustomEventsRevamp)object).getEC_PRODUCT_DETAILS_INTERACTIONS();
        String string5 = this.S;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, "Tool tip impression", "visible ", "product_details_interactions", "pdp screen", "pdp screen", null, bundle, string5, false, null, 1600, null);
    }

    public final void s(int n3, ArrayList arrayList) {
        Object object;
        int n4;
        tj2_2.Companion.getClass();
        List list = tj2$a_0.a();
        Object object2 = this.a;
        Object object3 = object2.x5();
        if (object3 != null) {
            object3 = ((Product)object3).getBrickName();
        } else {
            boolean n42 = false;
            object3 = null;
        }
        object2 = object2.x5();
        object2 = object2 != null ? ((Product)object2).getBrickCategory() : null;
        list.getClass();
        list = tj2_2.a((String)object3, (String)object2);
        list = list != null ? ((InstructionCategory)((Object)list)).getColors() : null;
        this.N = n3;
        object2 = this.O;
        boolean bl2 = ((ArrayList)object2).isEmpty();
        if (bl2 && arrayList != null) {
            ((ArrayList)object2).addAll(arrayList);
        }
        object2 = new Object();
        if (arrayList != null && (n4 = arrayList.size()) > n3) {
            int n7;
            object = arrayList.get(n3);
            Intrinsics.checkNotNullExpressionValue(object, "get(...)");
            object = ((BrickBrandSizes)object).getSizeChartAttributes().iterator();
            arrayList = null;
            boolean bl3 = false;
            object3 = null;
            while ((n7 = object.hasNext()) != 0) {
                int n8;
                Object object4 = object.next();
                void var10_14 = n8 + true;
                if (n8 >= 0) {
                    Object object5;
                    String string2;
                    Object object6;
                    int n10;
                    object4 = (SizeChartAttribute)object4;
                    if (list != null) {
                        n10 = list.size();
                    } else {
                        tj2_2.Companion.getClass();
                        tj2$a_0.a().getClass();
                        object6 = "#72BADA";
                        string2 = "#B27171";
                        object5 = xx_2.i("#EA8774", object6, string2);
                        n10 = object5.size();
                    }
                    if (n8 < n10) {
                        object5 = this.M;
                        object6 = "in";
                        boolean bl4 = Intrinsics.areEqual(object5, object6);
                        string2 = "";
                        String string3 = " ";
                        if (bl4) {
                            object5 = ((SizeChartAttribute)object4).getAttributeValue();
                            object6 = this.M;
                            object5 = n1.a((String)object5, string3, (String)object6);
                        } else {
                            object6 = "cm";
                            n10 = (int)(Intrinsics.areEqual(object5, object6) ? 1 : 0);
                            if (n10 != 0) {
                                object5 = ((SizeChartAttribute)object4).getConvertedAttributeValue();
                                object6 = this.M;
                                object5 = n1.a((String)object5, string3, (String)object6);
                            } else {
                                object5 = string2;
                            }
                        }
                        if (list != null) {
                            object3 = (String)list.get(n8);
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        string3 = ((SizeChartAttribute)object4).getAttributeName();
                        object4 = ((SizeChartAttribute)object4).getAttributeName();
                        String string4 = "_";
                        int n14 = 6;
                        n7 = StringsKt.O((CharSequence)object4, string4, 0, false, n14);
                        object4 = string3.substring(0, n7);
                        string3 = "substring(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, string3);
                        object6 = new g63_0((String)object3, (String)object4, (String)object5, string2);
                        ((ArrayList)object2).add(object6);
                    }
                    n8 = var10_14;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        if ((n3 = ((ArrayList)object2).isEmpty() ^ 1) != 0) {
            object = this.K;
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "list");
            arrayList = ((h63_0)object).a;
            arrayList.clear();
            arrayList.addAll(object2);
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }
}

