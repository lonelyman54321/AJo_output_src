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

public final class Dx0$b
extends CountDownTimer {
    public final /* synthetic */ dx0_1 a;

    public Dx0$b(dx0_1 dx0_12) {
        this.a = dx0_12;
        super(60000L, 1000L);
    }

    public final void onFinish() {
        Object object = this.a;
        TextView textView = ((dx0_1)object).k;
        dx0_1 dx0_12 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTv");
            textView = null;
        }
        textView.setVisibility(0);
        object = ((dx0_1)object).l;
        if (object == null) {
            object = "mResendOtpTimerTv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            dx0_12 = object;
        }
        dx0_12.setVisibility(8);
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
        string4 = this.a.l;
        if (string4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTimerTv");
            n7 = 0;
            string4 = null;
        }
        string4.setText((CharSequence)string2);
    }
}

