/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
import android.os.CountDownTimer;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionStatusRequest;

/*
 * Renamed from fq2
 */
public final class fq2_2
extends CountDownTimer {
    public long a;
    public final /* synthetic */ g b;

    public fq2_2(long l2, g g3) {
        this.b = g3;
        super(l2, 1000L);
    }

    public final void onFinish() {
        g g3 = this.b;
        Object object = g3.c;
        if (object != null) {
            object.a();
        }
        object = g3.Va();
        TenantResponse tenantResponse = g3.Wa().E;
        float f5 = g3.Wa().o;
        ((op2_2)object).c("TimeOut", tenantResponse, f5);
    }

    public final void onTick(long l2) {
        l2 = this.a;
        int n3 = 1000;
        long l3 = n3;
        this.a = l2 += l3;
        l3 = 5000L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            this.a = l2 = 0L;
            Object object2 = this.b;
            TenantResponse tenantResponse = ((g)object2).Wa().E;
            if (tenantResponse != null) {
                oo2_0.a.getClass();
                TransactionStatusRequest transactionStatusRequest = oo2_0.s(tenantResponse);
                n82_0 n82_02 = ((g)object2).c;
                if (n82_02 != null) {
                    n82_02.a();
                }
                object2 = ((g)object2).Va();
                ((op2_2)object2).l(transactionStatusRequest, tenantResponse);
            }
        }
    }
}

