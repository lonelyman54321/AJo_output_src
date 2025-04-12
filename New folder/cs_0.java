/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CS
 */
public final class cs_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                object3 = (g)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n4) {
                    Object object4;
                    Object object5;
                    int n7;
                    object2 = ((g)object3).Wa();
                    n3 = 0;
                    Object object6 = null;
                    ((kj2_1)object2).v = false;
                    n4 = ((DataCallback)object).getStatus();
                    if (!n4) {
                        object = ((g)object3).c;
                        if (object != null) {
                            object.E3(false);
                        }
                    } else {
                        n7 = ((DataCallback)object).getStatus();
                        if (n7 == (n4 = 1) && (object = ((g)object3).c) != null) {
                            object.E3(n4 != 0);
                        }
                    }
                    if ((n7 = ((HashSet)(object = ((g)object3).Wa().w)).size()) <= 0 && (n7 = (int)(((m80_0)(object = ((g)object3).Wa().e)).e() ? 1 : 0)) == 0) {
                        ((g)object3).d = false;
                    } else {
                        object = go2_0.a;
                        object = ((g)object3).Wa().s;
                        n7 = (int)(go2_0.a((PaymentInstruments)object) ? 1 : 0);
                        if (n7 == 0) {
                            object = ((g)object3).c;
                            if (object != null) {
                                object.a();
                            }
                            object = ((g)object3).Va();
                            object2 = ((g)object3).Wa().s;
                            object6 = ((g)object3).Wa().E;
                            object5 = ((g)object3).Wa().w;
                            object.getClass();
                            Intrinsics.checkNotNullParameter(object5, "internalWalletSelectedViews");
                            object4 = hj_1.INTERNAL_WALLET;
                            op2_2.d((op2_2)object, (PaymentInstruments)object2, (TenantResponse)object6, object4, (HashSet)object5);
                        }
                    }
                    object = ((g)object3).Va();
                    object2 = ((g)object3).Wa().s;
                    object.getClass();
                    object = go2_0.a;
                    if (object2 != null) {
                        boolean bl2;
                        oo2_0.a.getClass();
                        object = oo2_0.c("INTERNAL_WALLET", (PaymentInstruments)object2);
                        n4 = 0;
                        object2 = null;
                        if (object != null) {
                            object3 = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo();
                        } else {
                            bl2 = false;
                            object3 = null;
                        }
                        if (object3 != null && !(bl2 = object3.isEmpty())) {
                            object3 = new Bundle();
                            if (object != null && (object = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) != null) {
                                object = object.iterator();
                                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                    float f5;
                                    String string2;
                                    float f6;
                                    int n8;
                                    object6 = (PaymentInstrumentInfo)object.next();
                                    if (object6 != null) {
                                        object5 = ((PaymentInstrumentInfo)object6).getType();
                                    } else {
                                        n8 = 0;
                                        object5 = null;
                                        f6 = 0.0f;
                                    }
                                    n8 = Intrinsics.areEqual("AJIO_CASH_WALLET", object5);
                                    object4 = "viewed";
                                    if (n8 != 0) {
                                        float f7;
                                        object5 = ((PaymentInstrumentInfo)object6).getAmount();
                                        if (object5 != null) {
                                            f6 = ((Float)object5).floatValue();
                                        } else {
                                            n8 = 0;
                                            f6 = 0.0f;
                                            object5 = null;
                                        }
                                        n8 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                                        if (n8 > 0) {
                                            object3.putString("ajio_wallet", (String)object4);
                                            object6 = String.valueOf(((PaymentInstrumentInfo)object6).getAvailableAmount());
                                            object5 = "ajio_wallet_cm";
                                            object3.putString((String)object5, (String)object6);
                                            continue;
                                        }
                                    }
                                    if (object6 != null) {
                                        object5 = ((PaymentInstrumentInfo)object6).getType();
                                    } else {
                                        n8 = 0;
                                        object5 = null;
                                        f6 = 0.0f;
                                    }
                                    if ((n8 = Intrinsics.areEqual(string2 = "RELIANCE_ONE_WALLET", object5)) == 0) continue;
                                    object5 = ((PaymentInstrumentInfo)object6).getAmount();
                                    if (object5 != null) {
                                        f6 = ((Float)object5).floatValue();
                                    } else {
                                        n8 = 0;
                                        f6 = 0.0f;
                                        object5 = null;
                                    }
                                    if ((n8 = (int)((f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) <= 0) continue;
                                    object3.putString("rone", (String)object4);
                                    object6 = String.valueOf(((PaymentInstrumentInfo)object6).getAmount());
                                    object5 = "rone_cm";
                                    object3.putString((String)object5, (String)object6);
                                }
                            }
                        }
                    }
                } else {
                    ((g)object3).Qa();
                }
                return Unit.a;
            }
            case 0: 
        }
        object3 = (ps_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        ((ps_0)object3).d.k(object);
        return Unit.a;
    }
}

