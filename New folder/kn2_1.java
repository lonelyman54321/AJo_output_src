/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Order.OptedPaymentModeOrder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KN2
 */
public final class kn2_1
extends vw_0 {
    public boolean a;
    public final ImageView b;
    public final AjioTextView c;
    public final AjioTextView d;
    public final AjioTextView e;

    public kn2_1(View object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.refund_breakup_mode_iv;
        this.b = object2 = (ImageView)object.findViewById(n3);
        n3 = R$id.refund_breakup_mode_tv;
        object2 = (AjioTextView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.refund_breakup_mode_amount;
        object2 = (AjioTextView)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.refund_breakup_mode_mask_tv;
        object = (AjioTextView)object.findViewById(n3);
        this.e = object;
    }

    public final void w(Object object, Object object2) {
        int n3 = object instanceof OptedPaymentModeOrder;
        if (n3 == 0) {
            return;
        }
        n3 = this.a;
        AjioTextView ajioTextView = this.c;
        AjioTextView ajioTextView2 = this.e;
        ImageView imageView = this.b;
        if (n3 != 0) {
            object2 = ((OptedPaymentModeOrder)(object = (OptedPaymentModeOrder)object)).getAmount();
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                object2 = this.d;
                if (object2 != null) {
                    Object object3 = ((OptedPaymentModeOrder)object).getAmount();
                    object3 = object3 != null ? je3_2.d((String)object3) : null;
                    object3 = qz2_0.w((Double)object3);
                    object2.setText((CharSequence)object3);
                    ai0_2.B((View)object2);
                }
                if (ajioTextView != null) {
                    object2 = ((OptedPaymentModeOrder)object).getModeOfPaymentName();
                    ajioTextView.setText((CharSequence)object2);
                }
                if ((object2 = ((OptedPaymentModeOrder)object).getMaskedDigits()) != null && (n3 = ((String)object2).length()) != 0) {
                    if (ajioTextView2 != null) {
                        ai0_2.B((View)ajioTextView2);
                    }
                    if (ajioTextView2 != null) {
                        object2 = ((OptedPaymentModeOrder)object).getMaskedDigits();
                        ajioTextView2.setText((CharSequence)object2);
                    }
                } else if (ajioTextView2 != null) {
                    ai0_2.i((View)ajioTextView2);
                }
                if ((object2 = ((OptedPaymentModeOrder)object).getLogo()) != null && (n3 = ((String)object2).length()) != 0) {
                    if (imageView != null) {
                        boolean bl2;
                        object2 = new da$a();
                        ((da$a)object2).k = bl2 = true;
                        ((da$a)object2).g = bl2;
                        ((da$a)object2).n = object = ((OptedPaymentModeOrder)object).getLogo();
                        ((da$a)object2).u = imageView;
                        ((da$a)object2).a();
                        ai0_2.B((View)imageView);
                    }
                } else if (imageView != null) {
                    ai0_2.i((View)imageView);
                }
            } else if (ajioTextView != null) {
                ai0_2.i((View)ajioTextView);
            }
        } else {
            if (ajioTextView != null) {
                object2 = object;
                object2 = ((OptedPaymentModeOrder)object).getModeOfPaymentName();
                ajioTextView.setText((CharSequence)object2);
            }
            if ((object2 = ((OptedPaymentModeOrder)(object = (OptedPaymentModeOrder)object)).getMaskedDigits()) != null && (n3 = ((String)object2).length()) != 0) {
                if (ajioTextView2 != null) {
                    ai0_2.B((View)ajioTextView2);
                }
                if (ajioTextView2 != null) {
                    object2 = ((OptedPaymentModeOrder)object).getMaskedDigits();
                    ajioTextView2.setText((CharSequence)object2);
                }
            } else if (ajioTextView2 != null) {
                ai0_2.i((View)ajioTextView2);
            }
            if ((object2 = ((OptedPaymentModeOrder)object).getLogo()) != null && (n3 = ((String)object2).length()) != 0) {
                if (imageView != null) {
                    object2 = com.bumptech.glide.a.e(this.itemView.getContext());
                    object = String.valueOf(((OptedPaymentModeOrder)object).getLogo());
                    object = ((RequestManager)object2).p((String)object);
                    n3 = R$drawable.bank_transfer;
                    object = (rj2_0)((uw_0)object).x(n3);
                    ((rj2_0)object).Q(imageView);
                }
                if (imageView != null) {
                    ai0_2.B((View)imageView);
                }
            } else if (imageView != null) {
                ai0_2.i((View)imageView);
            }
        }
    }
}

