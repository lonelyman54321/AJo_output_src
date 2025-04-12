/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

public final class Sz1$b
extends CountDownTimer {
    public final /* synthetic */ sz1_2 a;

    public Sz1$b(sz1_2 sz1_22, long l2) {
        this.a = sz1_22;
        super(l2, 1000L);
    }

    public final void onFinish() {
        Object object = this.a;
        ImageView imageView = ((sz1_2)object).p;
        sz1_2 sz1_22 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorIv");
            imageView = null;
        }
        int n3 = 0;
        imageView.setVisibility(0);
        imageView = ((sz1_2)object).q;
        String string2 = "errorTv";
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            imageView = null;
        }
        imageView.setVisibility(0);
        imageView = ((sz1_2)object).q;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            imageView = null;
        }
        int n4 = R$string.otp_detect_error;
        String string3 = hv3_0.K(n4);
        imageView.setText((CharSequence)string3);
        imageView = ((sz1_2)object).q;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            imageView = null;
        }
        ai0_2.a((View)imageView);
        imageView = ((sz1_2)object).r;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resendOtpTv");
            imageView = null;
        }
        imageView.setVisibility(0);
        imageView = ((sz1_2)object).j;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timerTv");
            imageView = null;
        }
        n3 = 8;
        imageView.setVisibility(n3);
        object = ((sz1_2)object).k;
        if (object == null) {
            object = "checkingMsgTv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            sz1_22 = object;
        }
        sz1_22.setVisibility(n3);
    }

    public final void onTick(long l2) {
        TextView textView = this.a.j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timerTv");
            textView = null;
        }
        long l3 = 1000;
        String string2 = UX.b(l2 / l3, "s");
        zn0_1.b(new Object[0], 0, string2, "format(...)", textView);
    }
}

