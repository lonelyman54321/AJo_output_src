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

public final class Hw3$b
extends CountDownTimer {
    public final /* synthetic */ hw3_0 a;

    public Hw3$b(hw3_0 hw3_02) {
        this.a = hw3_02;
        super(60000L, 1000L);
    }

    public final void onFinish() {
        hw3_0 hw3_02 = this.a;
        TextView textView = hw3_02.d;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(0);
        hw3_02 = hw3_02.e;
        Intrinsics.checkNotNull(hw3_02);
        hw3_02.setVisibility(8);
    }

    public final void onTick(long l2) {
        int n3 = R$string.resend_otp_time;
        long l3 = 1000;
        String string2 = String.valueOf(l2 /= l3);
        Object[] objectArray = new Object[]{string2};
        String string3 = hv3_0.L(n3, objectArray);
        string2 = new SpannableString((CharSequence)string3);
        String string4 = String.valueOf(l2);
        int n4 = StringsKt.O(string3, string4, 0, false, 6);
        int n7 = string3.length();
        int n8 = Color.parseColor((String)"#202020");
        string3 = new ForegroundColorSpan(n8);
        string2.setSpan((Object)string3, n4, n7, 18);
        string4 = this.a.e;
        Intrinsics.checkNotNull(string4);
        string4.setText((CharSequence)string2);
    }
}

