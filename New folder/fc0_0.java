/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.ProductPromotion;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.StringsKt;

/*
 * Renamed from Fc0
 */
public final class fc0_0
extends RecyclerView$f {
    public final ArrayList a;
    public final t82_0 b;
    public final yi2_1 c;
    public final o62_0 d;
    public final t30_0 e;

    public fc0_0(ArrayList object, NewProductDetailsFragment newProductDetailsFragment, NewProductDetailsFragment newProductDetailsFragment2, o62_0 o62_02) {
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(newProductDetailsFragment2, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(o62_02, "offersDismissCallBack");
        this.a = object;
        this.b = newProductDetailsFragment;
        this.c = newProductDetailsFragment2;
        this.d = o62_02;
        this.e = object = new t30_0();
    }

    public final int getItemCount() {
        int n3;
        boolean bl2;
        ArrayList arrayList = this.a;
        if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        void var13_20;
        AjioTextView ajioTextView;
        block32: {
            int n4;
            int n7;
            int n8;
            int n10;
            int n14;
            Object object;
            int n15;
            block33: {
                block31: {
                    float f5;
                    Object object2;
                    t62_0 t62_02;
                    n15 = 1;
                    object = recyclerView$B;
                    object = (Fc0$a)recyclerView$B;
                    Intrinsics.checkNotNullParameter(object, "holder");
                    Serializable serializable = this.a;
                    Intrinsics.checkNotNull(serializable);
                    n14 = n3;
                    serializable = ((ArrayList)serializable).get(n3);
                    Intrinsics.checkNotNullExpressionValue(serializable, "get(...)");
                    serializable = (ProductPromotion)serializable;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(serializable, "item");
                    Object object3 = ((RecyclerView$B)object).itemView;
                    n10 = R$id.offer_price;
                    object3 = (AjioTextView)object3.findViewById(n10);
                    Object object4 = ((RecyclerView$B)object).itemView;
                    int n16 = R$id.offer_code;
                    object4 = (AjioTextView)object4.findViewById(n16);
                    View view = ((RecyclerView$B)object).itemView;
                    n8 = R$id.offer_desc;
                    ajioTextView = (AjioTextView)view.findViewById(n8);
                    View view2 = ((RecyclerView$B)object).itemView;
                    n7 = R$id.terms_conditions;
                    AjioTextView ajioTextView2 = (AjioTextView)view2.findViewById(n7);
                    View view3 = ((RecyclerView$B)object).itemView;
                    int n17 = R$id.timer_text;
                    AjioTextView ajioTextView3 = (AjioTextView)view3.findViewById(n17);
                    Intrinsics.checkNotNull(ajioTextView3);
                    long l2 = k7.p();
                    Long l3 = k7.s(((ProductPromotion)serializable).getEndTime());
                    long l4 = k7.t(((ProductPromotion)serializable).getTimerShowDuration());
                    Boolean bl2 = ((ProductPromotion)serializable).getShowEndTimer();
                    Object object5 = l4;
                    Object object6 = l2;
                    int n18 = hv3_0.i0(bl2, (Long)object5, l3, (Long)object6);
                    object6 = ((Fc0$a)object).b;
                    if (n18 != 0 && (n18 = object6.u7()) == 0) {
                        long l7;
                        long l8;
                        long l12;
                        long l14;
                        object5 = new Ref$LongRef();
                        if (l3 == null || (l14 = (l12 = (l8 = l3.longValue()) - (l7 = 0L)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) {
                            Intrinsics.checkNotNull(l3);
                            l8 = l3;
                            long l15 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
                            if (l15 > 0) {
                                ((Ref$LongRef)object5).element = l8 = l3 - l2;
                            }
                        }
                        t62_02 = t62_0.d(TimeUnit.MILLISECONDS);
                        object2 = qt2_2.b;
                        t62_02 = t62_02.g((Scheduler)object2);
                        object2 = ti_2.a();
                        t62_02 = t62_02.e((HandlerScheduler)object2);
                        object2 = new ec0_2((Ref$LongRef)object5, ajioTextView3, (Fc0$a)object);
                        t62_02.c((e62_0)object2);
                    }
                    tr2_2 tr2_22 = tr2_2.a;
                    n7 = (int)(tr2_2.j(object6.c9()) ? 1 : 0);
                    n17 = 0;
                    t62_02 = null;
                    int n19 = 0;
                    float f6 = 0.0f;
                    object2 = null;
                    int n20 = 8;
                    if ((n7 != 0 || (n7 = (int)(tr2_2.m() ? 1 : 0)) != 0) && (n7 = (int)(object6.u7() ? 1 : 0)) == 0 && (n7 = (int)(object6.S5() ? 1 : 0)) != 0) {
                        f5 = ((ProductPromotion)serializable).getMaxSavingPrice();
                        float f7 = f5 - 0.0f;
                        n7 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                        if (n7 > 0) {
                            object3.setVisibility(0);
                            String string2 = tr2_2.d().s;
                            f6 = ((ProductPromotion)serializable).getMaxSavingPrice();
                            n19 = ok1_1.b(f6);
                            object2 = qz2_0.o(String.valueOf(n19));
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append(string2);
                            ((StringBuilder)object5).append(" ");
                            ((StringBuilder)object5).append((String)object2);
                            String string3 = ((StringBuilder)object5).toString();
                            object3.setText((CharSequence)string3);
                        } else {
                            object3.setVisibility(n20);
                        }
                    } else {
                        f5 = ((ProductPromotion)serializable).getMaxSavingPrice();
                        float f8 = f5 - 0.0f;
                        n7 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                        if (n7 > 0) {
                            object3.setVisibility(0);
                            f5 = ((ProductPromotion)serializable).getMaxSavingPrice();
                            n7 = ok1_1.b(f5);
                            String string4 = qz2_0.o(String.valueOf(n7));
                            object5 = "Offer Price ";
                            object2 = new StringBuilder((String)object5);
                            ((StringBuilder)object2).append(string4);
                            String string5 = ((StringBuilder)object2).toString();
                            object3.setText((CharSequence)string5);
                        } else {
                            object3.setVisibility(n20);
                        }
                    }
                    object3 = ((ProductPromotion)serializable).getCode();
                    object4.setText((CharSequence)object3);
                    object3 = ((ProductPromotion)serializable).getTermsLink();
                    if (object3 != null && (n14 = ((String)object3).length()) > 0 && (n14 = (int)(object6.u7() ? 1 : 0)) == 0) {
                        ajioTextView2.setVisibility(0);
                        object3 = new bc0_0((Fc0$a)object, (ProductPromotion)serializable);
                        ajioTextView2.setOnClickListener((View.OnClickListener)object3);
                    } else {
                        ajioTextView2.setVisibility(n20);
                    }
                    n14 = (int)(object6.u7() ? 1 : 0);
                    if (n14 != 0) {
                        ajioTextView.setVisibility(n20);
                        return;
                    }
                    object3 = hv3_0.a;
                    object4 = ((ProductPromotion)serializable).getDescription();
                    n8 = 0;
                    Object var13_16 = null;
                    n7 = 32;
                    f5 = 4.5E-44f;
                    if (object4 == null) {
                        n10 = 0;
                        object4 = null;
                    } else {
                        n19 = ((String)object4).length() - n15;
                        n20 = 0;
                        l3 = null;
                        n18 = 0;
                        object5 = null;
                        while (n20 <= n19) {
                            int n21 = n18 == 0 ? n20 : n19;
                            if ((n21 = Intrinsics.compare(((String)object4).charAt(n21), n7)) <= 0) {
                                n21 = 1;
                            } else {
                                n21 = 0;
                                object6 = null;
                            }
                            if (n18 == 0) {
                                if (n21 == 0) {
                                    n18 = 1;
                                    continue;
                                }
                                n20 += n15;
                                continue;
                            }
                            if (n21 == 0) break;
                            n19 += -1;
                        }
                        object4 = com.jio.jioads.adinterfaces.a.a(n19, n15, n20, (String)object4);
                    }
                    object3.getClass();
                    object3 = hv3_0.I((String)object4);
                    ajioTextView.setText((CharSequence)object3);
                    ajioTextView.setClickable(n15 != 0);
                    object3 = ((ProductPromotion)serializable).getDetailsURL();
                    n14 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                    if (n14 == 0) {
                        cc0_0 cc0_02 = new cc0_0((Fc0$a)object, (ProductPromotion)serializable);
                        ajioTextView.setOnClickListener(cc0_02);
                        return;
                    }
                    object3 = ((ProductPromotion)serializable).getDescription();
                    if (object3 == null) break block31;
                    n10 = ((String)object3).length() - n15;
                    n19 = 0;
                    f6 = 0.0f;
                    object2 = null;
                    n20 = 0;
                    l3 = null;
                    while (n19 <= n10) {
                        n18 = n20 == 0 ? n19 : n10;
                        if ((n18 = Intrinsics.compare(((String)object3).charAt(n18), n7)) <= 0) {
                            n18 = 1;
                        } else {
                            n18 = 0;
                            object5 = null;
                        }
                        if (n20 == 0) {
                            if (n18 == 0) {
                                n20 = 1;
                                continue;
                            }
                            n19 += n15;
                            continue;
                        }
                        if (n18 == 0) break;
                        n10 += -1;
                    }
                    if ((object3 = com.jio.jioads.adinterfaces.a.a(n10, n15, n19, (String)object3)) == null || (n14 = (int)(StringsKt.F((CharSequence)object3, (CharSequence)(object4 = hv3_0.K(n10 = R$string.pdp_bundleoffer_description)), false) ? 1 : 0)) != n15) break block31;
                    object = ((ProductPromotion)serializable).getDescription();
                    if (object == null) break block32;
                    n4 = ((String)object).length() - n15;
                    n14 = 0;
                    object3 = null;
                    n10 = 0;
                    object4 = null;
                    break block33;
                }
                dc0_0 dc0_02 = new dc0_0((Fc0$a)object);
                ajioTextView.setMovementMethod((MovementMethod)dc0_02);
                return;
            }
            while (n14 <= n4) {
                n8 = n10 == 0 ? n14 : n4;
                if ((n8 = Intrinsics.compare(((String)object).charAt(n8), n7)) <= 0) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    Object var13_18 = null;
                }
                if (n10 == 0) {
                    if (n8 == 0) {
                        n10 = 1;
                        continue;
                    }
                    n14 += n15;
                    continue;
                }
                if (n8 == 0) break;
                n4 += -1;
            }
            String string6 = com.jio.jioads.adinterfaces.a.a(n4, n15, n14, (String)object);
        }
        SpannableString spannableString = new SpannableString((CharSequence)var13_20);
        ajioTextView.setText((CharSequence)spannableString);
        spannableString = LinkMovementMethod.getInstance();
        ajioTextView.setMovementMethod((MovementMethod)spannableString);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Fc0$a fc0$a;
        Intrinsics.checkNotNullParameter(object, "parent");
        Object object2 = LayoutInflater.from((Context)object.getContext());
        int n4 = R$layout.offer_popup_item;
        View view = object2.inflate(n4, object, false);
        Intrinsics.checkNotNullExpressionValue(view, "inflate(...)");
        t30_0 t30_02 = this.e;
        Object object3 = object = this.b;
        object3 = (NewProductDetailsFragment)object;
        Object object4 = object = this.c;
        object4 = (NewProductDetailsFragment)object;
        o62_0 o62_02 = this.d;
        object2 = fc0$a;
        fc0$a = new Fc0$a(view, (NewProductDetailsFragment)object3, (NewProductDetailsFragment)object4, t30_02, o62_02);
        return fc0$a;
    }
}

