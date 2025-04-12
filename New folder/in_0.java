/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Payment.InternalWalletAmount;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from IN
 */
public final class in_0 {
    public static final in_0 a;

    static {
        in_0 in_02;
        a = in_02 = new Object();
    }

    public static void a(HashSet hashSet, Cart cart) {
        int n3;
        ArrayList<Object> arrayList = null;
        if (hashSet != null && (n3 = hashSet.isEmpty()) == 0) {
            Object object;
            if (cart != null && (object = cart.getInternalWallets()) != null) {
                n3 = ((ArrayList)object).size();
            } else {
                n3 = 0;
                object = null;
            }
            if (n3 > 0 && cart != null && (object = cart.getInternalWallets()) != null) {
                boolean bl2;
                object = object.iterator();
                ArrayList<Object> arrayList2 = null;
                while (bl2 = object.hasNext()) {
                    String string2;
                    boolean bl3;
                    Object object2;
                    PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)object.next();
                    if (paymentInstrumentInfo != null) {
                        object2 = paymentInstrumentInfo.getCode();
                    } else {
                        bl3 = false;
                        object2 = null;
                    }
                    if (!(bl3 = CollectionsKt.F(hashSet, object2))) continue;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<Object>();
                    }
                    if (paymentInstrumentInfo == null || (string2 = paymentInstrumentInfo.getName()) == null) {
                        string2 = "";
                    }
                    InternalWalletUtil internalWalletUtil = InternalWalletUtil.a;
                    internalWalletUtil.getClass();
                    float f5 = InternalWalletUtil.b(paymentInstrumentInfo, hashSet);
                    object2 = new InternalWalletAmount(string2, f5);
                    arrayList2.add(object2);
                }
                arrayList = arrayList2;
            }
        }
        if (cart != null) {
            cart.setInternalWalletAmountList(arrayList);
        }
    }
}

