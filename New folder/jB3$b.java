/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.widget.TextView
 */
import android.os.CountDownTimer;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

public final class jB3$b
extends CountDownTimer {
    public final /* synthetic */ jb3_0 a;

    public jB3$b(jb3_0 jb3_02) {
        this.a = jb3_02;
        super(60000L, 1000L);
    }

    public final void onFinish() {
        Object object = this.a;
        Object object2 = object.d;
        TextView textView = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resendOtpBtn");
            object2 = null;
        }
        int n3 = 0;
        object2.setVisibility(0);
        object2 = object.e;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resendOtpTimerTv");
            object2 = null;
        }
        n3 = 8;
        object2.setVisibility(n3);
        object2 = object.b;
        if (object2 == null) {
            object2 = "otpSendIn";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            textView = object2;
        }
        textView.setVisibility(n3);
        object = object.k;
    }

    public final void onTick(long l2) {
        TextView textView = this.a.e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resendOtpTimerTv");
            textView = null;
        }
        long l3 = 1000;
        String string2 = String.valueOf(l2 / l3);
        textView.setText((CharSequence)string2);
    }
}

