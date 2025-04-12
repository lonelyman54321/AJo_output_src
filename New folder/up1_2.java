/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.payment.fragment.d;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uP1
 */
public final class up1_2
extends CountDownTimer {
    public final /* synthetic */ d a;

    public up1_2(d d2) {
        this.a = d2;
        super(60000L, 1000L);
    }

    public final void onFinish() {
        d d2 = this.a;
        TextView textView = d2.l;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resendLbl");
            textView = null;
        }
        int n3 = 8;
        textView.setVisibility(n3);
        textView = d2.k;
        String string2 = "timerTv";
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            textView = null;
        }
        String string3 = "Resend";
        textView.setText((CharSequence)string3);
        textView = d2.k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            textView2 = textView;
        }
        textView2.setOnClickListener((View.OnClickListener)d2);
    }

    public final void onTick(long l2) {
        Object object = this.a;
        TextView textView = ((d)object).k;
        String string2 = "timerTv";
        d d2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            textView = null;
        }
        textView.setOnClickListener(null);
        object = ((d)object).k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            d2 = object;
        }
        long l3 = 1000;
        object = new StringBuilder();
        ((StringBuilder)object).append(l2 /= l3);
        ((StringBuilder)object).append("s");
        String string3 = ((StringBuilder)object).toString();
        d2.setText(string3);
    }
}

