/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;

/*
 * Renamed from zU1
 */
public final class zu1_1 {
    public final op2_2 a;
    public final kj2_1 b;
    public PaymentInstrumentInfo c;
    public vs1_2 d;

    public zu1_1(op2_2 object, mu1_1 mu1_12, kj2_1 object2) {
        this.a = object;
        this.b = object2;
        if (object != null && mu1_12 != null) {
            object = ((op2_2)object).s;
            int n3 = 1;
            object2 = new zc0_1(this, n3);
            zU1$a zU1$a = new zU1$a((zc0_1)object2);
            ((LiveData)object).e(mu1_12, zU1$a);
        }
    }
}

