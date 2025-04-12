/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ir2
 */
public final class ir2_2
extends rw_2 {
    public final dv_0 b;
    public final co2_0 c;
    public final OnCheckoutClickListener d;
    public final PEToggleButton e;
    public final AjioCustomExpandablePanel f;
    public final AjioTextView g;
    public final LinearLayout h;
    public final AjioTextView i;
    public final AjioTextView j;
    public final uh_1 k;

    public ir2_2(View object, dv_0 object2, co2_0 object3, OnCheckoutClickListener object4) {
        Intrinsics.checkNotNullParameter(object, "v");
        Intrinsics.checkNotNullParameter(object3, "paymentInfoProvider");
        Intrinsics.checkNotNullParameter(object4, "onCheckoutClickListener");
        super((View)object);
        this.b = object2;
        this.c = object3;
        this.d = object4;
        int n3 = R$id.cod_toggle_expand;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.e = object2 = (PEToggleButton)object2;
        int n4 = R$id.expandable_payment_cod;
        object4 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = (AjioCustomExpandablePanel)((Object)object4);
        this.f = object4;
        int n7 = R$id.proceed_btn_tv;
        Object object5 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
        object5 = (AjioTextView)object5;
        int n8 = R$id.cod_info;
        Object object6 = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
        object6 = (AjioTextView)object6;
        this.g = object6;
        int n10 = R$id.id_cod_extra_fee_view;
        object3 = (LinearLayout)object.findViewById(n10);
        this.h = object3;
        n10 = R$id.id_cod_extra_fee_text;
        this.i = object3 = (AjioTextView)object.findViewById(n10);
        n10 = R$id.id_cod_extra_fee_whats;
        object = (AjioTextView)object.findViewById(n10);
        this.j = object;
        super();
        object.a = object3 = new eo2_0();
        this.k = object;
        super(this, 1);
        object5.setOnClickListener((View.OnClickListener)object);
        ai0_2.t((View)object4);
        super(this);
        object2.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
        ((PEToggleButton)object2).setSpanText();
    }
}

