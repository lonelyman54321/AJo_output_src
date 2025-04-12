/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.widget.ToggleButton
 */
import android.content.Intent;
import android.os.Bundle;
import android.widget.ToggleButton;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import java.util.ArrayList;

/*
 * Renamed from DV
 */
public interface dv_0 {
    public void D0(PayNowRequest var1, PaymentInstrumentInfo var2);

    public void Ea(boolean var1);

    public void Ga();

    public void I2(UPI var1, PayNowRequest var2);

    public void I3(int var1, ArrayList var2);

    public void J1(PayNowRequest var1);

    public void J7();

    public void Ka(PriceValidation var1, Boolean var2);

    public void L2();

    public void M5(Intent var1);

    public void M7();

    public void R1(int var1, String var2);

    public void Z3(PayNowRequest var1);

    public void a();

    public void b(OfferDetails var1);

    public void b0(ArrayList var1, ArrayList var2, ArrayList var3);

    public void c();

    public void d6(String var1);

    public void g(String var1, String var2, String var3, Bundle var4, String var5);

    public void g9(UPI var1);

    public void h5();

    public void hideProgressView();

    public void i4(PriceValidation var1);

    public void j(PaymentInstrumentInfo var1);

    public void k(ToggleButton var1, int var2);

    public void l5();

    public void o3();

    public void p(String var1, boolean var2);

    public void q8();

    public void r(LpStoredCardBalance var1);

    public void r4();

    public void r9();

    public void s(PaymentInstrumentInfo var1);

    public void showLoyaltyInfoFragment();

    public void v1(PayNowRequest var1);

    public void x1(String var1, String var2, String var3, String var4);

    public void y8(UpiAppInfo var1);
}

