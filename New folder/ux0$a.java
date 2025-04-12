/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.os.CountDownTimer
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 *  android.widget.TextView
 */
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ux0$a
extends CountDownTimer {
    public final /* synthetic */ ux0_0 a;

    public ux0$a(ux0_0 ux0_02) {
        this.a = ux0_02;
        super(60000L, 1000L);
    }

    public final void onFinish() {
        Object object = this.a;
        TextView textView = ((ux0_0)object).r;
        ux0_0 ux0_02 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTv");
            textView = null;
        }
        textView.setVisibility(0);
        object = ((ux0_0)object).s;
        if (object == null) {
            object = "mResendOtpTimerTv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            ux0_02 = object;
        }
        ux0_02.setVisibility(8);
    }

    public final void onTick(long l2) {
        int n3 = R$string.resend_otp_time;
        int n4 = 1000;
        long l3 = n4;
        String string2 = String.valueOf(l2 /= l3);
        Object object = new Object[]{string2};
        String string3 = hv3_0.L(n3, object);
        string2 = new SpannableString((CharSequence)string3);
        String string4 = String.valueOf(l2);
        int n7 = StringsKt.O(string3, string4, 0, false, 6);
        int n8 = string3.length();
        object = "#d39f47";
        int n10 = Color.parseColor((String)object);
        string3 = new ForegroundColorSpan(n10);
        n10 = 18;
        string2.setSpan((Object)string3, n7, n8, n10);
        string4 = this.a.s;
        if (string4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTimerTv");
            n7 = 0;
            string4 = null;
        }
        string4.setText((CharSequence)string2);
    }
}

