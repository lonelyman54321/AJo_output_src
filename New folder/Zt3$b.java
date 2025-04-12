/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
import android.os.CountDownTimer;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionStatusRequest;
import kotlin.jvm.internal.Intrinsics;

public final class Zt3$b
extends CountDownTimer {
    public long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ zt3_0 c;

    public Zt3$b(long l2, zt3_0 zt3_02) {
        this.b = l2;
        this.c = zt3_02;
        super(l2, 1000L);
    }

    public final void onFinish() {
        boolean bl2;
        zt3_0 zt3_02 = this.c;
        Object object = zt3_02.f;
        if (object != null && (bl2 = zt3_02.isAdded()) && !(bl2 = zt3_02.isRemoving())) {
            object = zt3_02.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("upistatusTimer");
                bl2 = false;
                object = null;
            }
            object.setText("Time Out!");
            object = "errors interactions";
            String string2 = "service error";
            String string3 = "TimeOut";
            String string4 = "service_error";
            String string5 = "single page checkout \u2013 payment failure";
            oT.b((String)object, string2, string3, string4, string5);
            zt3_02.Oa(string3);
        }
    }

    public final void onTick(long l2) {
        Object object;
        String string2;
        StringBuilder stringBuilder;
        long l3 = this.a;
        long l4 = 1000;
        this.a = l3 += l4;
        l3 = l2 / l4;
        int n3 = 60;
        l4 = n3;
        long l7 = l3 / l4;
        long l8 = (l3 %= l4) - (l4 = (long)10);
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(l7);
            string2 = ":0";
            stringBuilder.append(string2);
            stringBuilder.append(l3);
            object = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(l7);
            string2 = ":";
            stringBuilder.append(string2);
            stringBuilder.append(l3);
            object = stringBuilder.toString();
        }
        zt3_0 zt3_02 = this.c;
        stringBuilder = zt3_02.c;
        string2 = null;
        if (stringBuilder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upistatusTimer");
            n3 = 0;
            stringBuilder = null;
        }
        stringBuilder.setText((CharSequence)object);
        l7 = this.b;
        l2 = l7 - l2;
        int n4 = 100;
        long l12 = n4;
        l2 = l2 * l12 / l7;
        int n7 = (int)l2;
        Object object3 = zt3_02.d;
        if (object3 == null) {
            object3 = "progressBar";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            string2 = object3;
        }
        string2.setProgress(n7);
        l2 = this.a;
        l4 = 5000L;
        n4 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
        if (n4 == 0) {
            this.a = l2 = 0L;
            object3 = zt3_02.f;
            if (object3 != null && (object3 = zt3_02.Ra().E) != null) {
                oo2_0.a.getClass();
                TransactionStatusRequest transactionStatusRequest = oo2_0.s((TenantResponse)object3);
                object = zt3_02.Qa();
                ((op2_2)object).l(transactionStatusRequest, (TenantResponse)object3);
            }
        }
    }
}

