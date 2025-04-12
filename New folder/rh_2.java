/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.cart.ConvenienceFeeConfig;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from rH
 */
public final class rh_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public ImageView i;
    public PriceSplitUp j;
    public m80_0 k;
    public n82_0 l;
    public final hh3_2 m;
    public float n;
    public float o;

    public rh_2() {
        Object object = new ph_2(this, 0);
        this.m = object = yr1_2.b((Function0)object);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.id_cod_choose_other_paymode;
        if (n3 == n4) {
            object = this.l;
            if (object != null) {
                object.r1();
            }
        } else {
            n4 = R$id.id_cod_confirm_order;
            if (n3 == n4 && (n3 = (object = this.getParentFragment()) instanceof g) != 0) {
                object = this.getParentFragment();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.payment.fragment.PeCheckoutFragment");
                object = (g)object;
                object2 = Boolean.FALSE;
                boolean bl2 = true;
                ((g)object).Sa((Boolean)object2, bl2);
            }
        }
        this.dismissAllowingStateLoss();
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        qh_2 qh_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)qh_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.cod_fee_luxe_layout;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.cod_fee_ajio_layout;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        float f5;
        float f6;
        float f7;
        int n4 = 1;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        int n7 = R$id.id_cod_sub_text;
        object2 = (TextView)object.findViewById(n7);
        this.a = object2;
        n7 = R$id.id_item_total;
        object2 = (TextView)object.findViewById(n7);
        this.b = object2;
        n7 = R$id.id_amount_payable;
        object2 = (TextView)object.findViewById(n7);
        this.f = object2;
        n7 = R$id.id_cod_choose_other_paymode;
        object2 = (TextView)object.findViewById(n7);
        this.g = object2;
        n7 = R$id.id_cod_confirm_order;
        object2 = (TextView)object.findViewById(n7);
        this.h = object2;
        n7 = R$id.id_cod_close_dialog;
        object2 = (ImageView)object.findViewById(n7);
        this.i = object2;
        n7 = R$id.id_cash_on_delivery_fee;
        object2 = (TextView)object.findViewById(n7);
        this.c = object2;
        n7 = R$id.id_cash_on_delivery_fee_strike;
        object2 = (TextView)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.id_cash_on_delivery_fee_free;
        object = (TextView)object.findViewById(n7);
        this.d = object;
        object = this.i;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.g) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.h) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = (PriceSplitUp)((io2_1)this.m.getValue()).b.d()) != null) {
            this.j = object;
        }
        if ((object = this.j) != null && (object = ((PriceSplitUp)object).getConvenienceFee()) != null && (object = ((ConvenienceFeePriceSplitUp)object).getCOD()) != null) {
            this.n = f7 = ((ConvenienceFeePriceSplitUp$AmountData)object).getAmount();
        }
        if ((object = this.j) != null && (object = ((PriceSplitUp)object).getConvenienceFee()) != null && (object = ((ConvenienceFeePriceSplitUp)object).getCOD()) != null) {
            this.o = f7 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
        }
        if ((n7 = (int)((f6 = (f7 = this.n) - (f5 = this.o)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0) {
            object2 = this.e;
            if (object2 != null) {
                object = qz2_0.u(f7);
                object2.setText((CharSequence)object);
            }
            if ((object = this.e) != null) {
                n3 = object.getPaintFlags();
                object2 = this.e;
                if (object2 != null) {
                    object2.setPaintFlags(n3 |= 0x10);
                }
            }
            if ((object = this.e) != null) {
                ai0_2.B((View)object);
            }
        }
        object = this.k;
        n7 = 0;
        f5 = 0.0f;
        object2 = null;
        if (object != null && (object = ((m80_0)object).b) != null) {
            object = ((ConvenienceFeeConfig)object).getCodPopUpTopDescFree();
        } else {
            n3 = 0;
            object = null;
            f7 = 0.0f;
        }
        float f8 = this.o;
        Object object3 = null;
        float f11 = f8 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 > 0) {
            string2 = qz2_0.u(f8);
            object3 = this.c;
            if (object3 != null) {
                object3.setText((CharSequence)string2);
            }
            if ((object3 = this.c) != null) {
                ai0_2.B((View)object3);
            }
            if ((object3 = this.k) != null) {
                object3 = ((m80_0)object3).b;
                if (object3 != null) {
                    object2 = ((ConvenienceFeeConfig)object3).getCodPopUpTopDesc();
                }
                if (object2 != null) {
                    object = StringCompanionObject.INSTANCE;
                    object = new Object[n4];
                    f12 = 0.0f;
                    object3 = null;
                    object[0] = string2;
                    string2 = "format(...)";
                    object = xh2_0.a((Object[])object, n4, (String)object2, string2);
                }
            }
        } else {
            object2 = this.g;
            if (object2 != null) {
                ai0_2.i((View)object2);
            }
            if ((object2 = this.d) != null) {
                ai0_2.B((View)object2);
            }
            if ((object2 = this.c) != null) {
                ai0_2.i((View)object2);
            }
        }
        if ((object2 = this.a) != null) {
            object = hv3_0.f((String)object);
            object2.setText((CharSequence)object);
        }
        if ((object = this.j) != null && (object = ((PriceSplitUp)object).getItemTotal()) != null) {
            f7 = ((Number)object).floatValue();
            object2 = this.b;
            if (object2 != null) {
                object = qz2_0.u(f7);
                object2.setText((CharSequence)object);
            }
        }
        if ((object = this.j) != null && (object = ((PriceSplitUp)object).getNetPayableAmount()) != null) {
            f7 = ((Number)object).floatValue();
            object2 = this.f;
            if (object2 != null) {
                object = qz2_0.u(f7);
                object2.setText((CharSequence)object);
            }
        }
        if ((object = this.j) != null && (object = ((PriceSplitUp)object).getConvenienceFee()) != null) {
            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object = mz3_0.f((ConvenienceFeePriceSplitUp)object);
            String string3 = "COD convenience fee screen";
            ((GTMEvents)object2).pushOpenScreenEvent(string3, (Bundle)object);
        }
    }
}

