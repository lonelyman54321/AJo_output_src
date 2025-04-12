/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.RtoResponseData;

public interface HN2 {
    public void D8(RtoResponseData var1);

    public void Ma(Consignment var1, String var2, String var3, Integer var4, String var5);

    public void O0(String var1, ReturnRefundLinksEnum var2);

    public void T5();

    public void b9(String var1, String var2);

    public void t5(ReturnRequest var1, boolean var2);

    public void t6(ReturnRequest var1, CartOrder var2, boolean var3);

    public void z3();
}

