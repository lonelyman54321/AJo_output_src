/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.NextStepsSection;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RN2
 */
public final class rn2_2
extends vw_0 {
    public final HN2 a;
    public final AjioTextView b;
    public final AjioTextView c;
    public final AjioTextView d;
    public final AjioTextView e;
    public final AjioButton f;
    public final RecyclerView g;
    public final AjioTextView h;
    public final AjioButton i;
    public final AjioButton j;
    public Consignment k;
    public CartOrder l;
    public final String m;

    public rn2_2(View object, HN2 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object2;
        int n3 = R$id.tvTitle;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.b = object2 = (AjioTextView)object2;
        n3 = R$id.tvDescription;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.c = object2 = (AjioTextView)object2;
        n3 = R$id.tvSubStatusHeader;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.d = object2 = (AjioTextView)object2;
        n3 = R$id.tvReturnExchangeDate;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.e = object2 = (AjioTextView)object2;
        n3 = R$id.btnReturnExchange;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.f = object2 = (AjioButton)object2;
        n3 = R$id.recycler_view;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.g = object2 = (RecyclerView)object2;
        n3 = R$id.tvNudeReturnExchangeDate;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.h = object2 = (AjioTextView)object2;
        n3 = R$id.btnReturn;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.i = object2 = (AjioButton)object2;
        n3 = R$id.btnExchange;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioButton)object;
        this.j = object;
        this.m = "https://www.ajio.com/return-refund-policy";
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(Object object, Object object2) {
        AjioButton ajioButton;
        AjioButton ajioButton2;
        Object object3;
        block17: {
            AjioTextView ajioTextView;
            Object object4;
            block18: {
                int n3;
                int n4;
                int n7;
                int n8;
                Object object5;
                block19: {
                    block20: {
                        block21: {
                            String string2;
                            block23: {
                                block22: {
                                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData");
                                    object = (pa2_0)object;
                                    object2 = ((pa2_0)object).d;
                                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.Consignment");
                                    this.k = object2 = (Consignment)object2;
                                    object5 = ((pa2_0)object).c;
                                    this.l = object5;
                                    object5 = null;
                                    string2 = "consignment";
                                    if (object2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n8 = 0;
                                        object2 = null;
                                    }
                                    if ((object2 = ((Consignment)object2).getEntries()) == null || (object2 = (CartEntry)CollectionsKt.firstOrNull((List)object2)) == null || (object2 = ((CartEntry)object2).getOrderEntry()) == null || (object2 = ((CartEntry)object2).getCtaMessage()) == null) {
                                        object2 = "";
                                    }
                                    object = ((pa2_0)object).b;
                                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.NextStepsSection");
                                    object = (NextStepsSection)object;
                                    object4 = ((NextStepsSection)object).getTitle();
                                    ai0_2.z(this.b, (String)object4);
                                    object4 = this.c;
                                    object3 = ((NextStepsSection)object).getDescription();
                                    ai0_2.A((TextView)object4, (String)object3);
                                    object4 = this.d;
                                    object3 = ((NextStepsSection)object).getSubStatusHeader();
                                    ai0_2.z((TextView)object4, (String)object3);
                                    object3 = this.itemView.getContext();
                                    n7 = 1;
                                    n4 = 0;
                                    object4 = new LinearLayoutManager((Context)object3, n7, false);
                                    object3 = this.g;
                                    ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object4);
                                    object4 = ((NextStepsSection)object).getSubStatusMessageList();
                                    if (object4 != null) {
                                        object = ((NextStepsSection)object).getSubStatusMessageList();
                                        object4 = new RecyclerView$f();
                                        ((sf3_1)object4).a = object;
                                        ((RecyclerView)object3).setAdapter((RecyclerView$f)object4);
                                    }
                                    if ((object = this.k) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object = null;
                                    }
                                    n3 = ((Consignment)object).isReturnableExchangeable();
                                    object4 = this.h;
                                    object3 = this.j;
                                    ajioButton2 = this.i;
                                    ajioTextView = this.e;
                                    ajioButton = this.f;
                                    if (n3 == 0) break block18;
                                    ai0_2.B((View)ajioTextView);
                                    ai0_2.B((View)ajioButton);
                                    n3 = h40_0.l1();
                                    if (n3 == 0) break block19;
                                    ai0_2.i((View)ajioTextView);
                                    ai0_2.i((View)ajioButton);
                                    ai0_2.B((View)object4);
                                    object = this.k;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object = null;
                                    }
                                    if ((object = (Collection)((Consignment)object).getEntries()) == null || (n3 = (int)(object.isEmpty() ? 1 : 0)) != 0) break block20;
                                    object = this.k;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object = null;
                                    }
                                    if ((n3 = (object = ((Consignment)object).getEntries()).size()) <= 0) break block21;
                                    object = this.k;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object = null;
                                    }
                                    if ((n3 = (int)(((CartEntry)(object = ((CartEntry)((Consignment)object).getEntries().get(0)).getOrderEntry())).isReturnable() ? 1 : 0)) == 0) break block22;
                                    object = this.k;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object = null;
                                    }
                                    if ((n3 = (int)(((CartEntry)(object = ((CartEntry)((Consignment)object).getEntries().get(0)).getOrderEntry())).isExchangeable() ? 1 : 0)) == 0) break block22;
                                    ai0_2.B((View)ajioButton2);
                                    ai0_2.B((View)object3);
                                    break block19;
                                }
                                if ((object = this.k) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n3 = 0;
                                    object = null;
                                }
                                if ((n3 = (int)(((CartEntry)(object = ((CartEntry)((Consignment)object).getEntries().get(0)).getOrderEntry())).isReturnable() ? 1 : 0)) != 0) break block23;
                                object = this.k;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n3 = 0;
                                    object = null;
                                }
                                if ((n3 = (int)(((CartEntry)(object = ((CartEntry)((Consignment)object).getEntries().get(0)).getOrderEntry())).isExchangeable() ? 1 : 0)) == 0) break block23;
                                ai0_2.i((View)ajioButton2);
                                ai0_2.B((View)object3);
                                break block19;
                            }
                            if ((object = this.k) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n3 = 0;
                                object = null;
                            }
                            if ((n3 = (int)(((CartEntry)(object = ((CartEntry)((Consignment)object).getEntries().get(0)).getOrderEntry())).isReturnable() ? 1 : 0)) != 0) {
                                object = this.k;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                } else {
                                    object5 = object;
                                }
                                object = ((CartEntry)((Consignment)object5).getEntries().get(0)).getOrderEntry();
                                n3 = (int)(((CartEntry)object).isExchangeable() ? 1 : 0);
                                if (n3 == 0) {
                                    ai0_2.B((View)ajioButton2);
                                    ai0_2.i((View)object3);
                                }
                            }
                            break block19;
                        }
                        ai0_2.B((View)ajioButton);
                        break block19;
                    }
                    ai0_2.B((View)ajioButton);
                }
                object = hv3_0.K(R$string.return_policy);
                object2 = n1.a((String)object2, " ", (String)object);
                object5 = new SpannableString((CharSequence)object2);
                n8 = object5.length();
                n3 = ((String)object).length();
                n3 = n8 - n3;
                qn2_0 qn2_02 = new qn2_0(this);
                n4 = 34;
                object5.setSpan((Object)qn2_02, n3, n8, n4);
                int n10 = hv3_0.m(R$color.accent_color_4);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n10);
                object5.setSpan((Object)foregroundColorSpan, n3, n8, n4);
                StyleSpan styleSpan = new StyleSpan(n7);
                object5.setSpan((Object)styleSpan, n3, n8, n4);
                n3 = (int)(h40_0.l1() ? 1 : 0);
                if (n3 != 0) {
                    object = TextView.BufferType.SPANNABLE;
                    object4.setText((CharSequence)object5, (TextView.BufferType)object);
                    object = LinkMovementMethod.getInstance();
                    object4.setMovementMethod((MovementMethod)object);
                    ai0_2.B((View)object4);
                    break block17;
                } else {
                    object = TextView.BufferType.SPANNABLE;
                    ajioTextView.setText((CharSequence)object5, (TextView.BufferType)object);
                    object = LinkMovementMethod.getInstance();
                    ajioTextView.setMovementMethod((MovementMethod)object);
                    ai0_2.B((View)ajioTextView);
                }
                break block17;
            }
            ai0_2.i((View)ajioTextView);
            ai0_2.i((View)object4);
        }
        object = new z11_0(this, 2);
        ajioButton.setOnClickListener((View.OnClickListener)object);
        object = new on2_0(this);
        ajioButton2.setOnClickListener((View.OnClickListener)object);
        object = new pn2_0(this);
        object3.setOnClickListener((View.OnClickListener)object);
    }

    public final void x(String string2) {
        Object object = "journeyType";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        HN2 hN2 = this.a;
        if (hN2 != null) {
            Object object2;
            object = this.k;
            Object object3 = "consignment";
            Object object4 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object = null;
            }
            if ((object2 = this.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object2 = null;
            }
            object2 = ((Consignment)object2).getCode();
            Object object5 = this.l;
            object5 = object5 != null ? ((CartOrder)object5).getCode() : null;
            Object object6 = this.k;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object4 = object6;
            }
            int n3 = ((Consignment)object4).getShipmentPosition();
            object6 = n3;
            object3 = object;
            object4 = object2;
            object2 = object5;
            object5 = object6;
            object6 = string2;
            hN2.Ma((Consignment)object, (String)object4, (String)object2, (Integer)object5, string2);
        }
    }
}

