/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.widget.TextView
 */
import android.os.CountDownTimer;
import android.widget.TextView;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class dA1$b
extends CountDownTimer {
    public final /* synthetic */ da1_1 a;

    public dA1$b(da1_1 da1_12, long l2) {
        this.a = da1_12;
        super(l2, 1000L);
    }

    public final void onFinish() {
        da1_1 da1_12 = this.a;
        TextView textView = da1_12.i;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(8);
        textView = da1_12.j;
        Intrinsics.checkNotNull(textView);
        textView.setEnabled(true);
        da1_12 = da1_12.j;
        Intrinsics.checkNotNull(da1_12);
        da1_12.setAlpha(1.0f);
    }

    public final void onTick(long l2) {
        int n3 = 1;
        TextView textView = this.a.i;
        Intrinsics.checkNotNull(textView);
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.otp_expiresin);
        long l3 = 1000;
        String string2 = String.valueOf(l2 / l3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        zn0_1.b(objectArray, n3, (String)object, "format(...)", textView);
    }
}

