/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.FetchWalletsRequest;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from so2
 */
public final class so2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ oo2_1 d;
    public final /* synthetic */ TenantResponse e;
    public final /* synthetic */ PaymentInstruments f;
    public final /* synthetic */ ArrayList g;

    public so2_2(boolean bl2, oo2_1 oo2_12, TenantResponse tenantResponse, PaymentInstruments paymentInstruments, ArrayList arrayList, f80_0 f80_02) {
        this.c = bl2;
        this.d = oo2_12;
        this.e = tenantResponse;
        this.f = paymentInstruments;
        this.g = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        PaymentInstruments paymentInstruments = this.f;
        ArrayList arrayList = this.g;
        boolean bl2 = this.c;
        oo2_1 oo2_12 = this.d;
        TenantResponse tenantResponse = this.e;
        so2_2 so2_22 = new so2_2(bl2, oo2_12, tenantResponse, paymentInstruments, arrayList, f80_02);
        so2_22.b = object;
        return so2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (so2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((so2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block10: {
            Object object2;
            int n3;
            j90_0 j90_02;
            block11: {
                int n4;
                int n7;
                Object object3;
                block12: {
                    block6: {
                        block7: {
                            block8: {
                                block9: {
                                    j90_02 = j90_0.COROUTINE_SUSPENDED;
                                    int n8 = this.a;
                                    object3 = this.d;
                                    n3 = 3;
                                    n7 = 2;
                                    n4 = 1;
                                    if (n8 == 0) break block6;
                                    if (n8 == n4) break block7;
                                    if (n8 == n7) break block8;
                                    if (n8 != n3) break block9;
                                    vl2_2.b(object);
                                    break block10;
                                }
                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object;
                            }
                            object2 = (fs0_2)this.b;
                            vl2_2.b(object);
                            break block11;
                        }
                        object2 = (fs0_2)this.b;
                        vl2_2.b(object);
                        break block12;
                    }
                    vl2_2.b(object);
                    object2 = object = this.b;
                    object2 = (fs0_2)object;
                    boolean bl2 = this.c;
                    if (bl2) {
                        long l2 = ((Number)((oo2_1)object3).d.getValue()).longValue();
                        this.b = object2;
                        this.a = n4;
                        object = bo0_2.a(l2, this);
                        if (object == j90_02) {
                            return j90_02;
                        }
                    }
                }
                object = new FetchWalletsRequest();
                Object object4 = this.e;
                if (object4 != null) {
                    object4 = ((TenantResponse)object4).getAccessToken();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                ((FetchWalletsRequest)object).setAccessToken((String)object4);
                object4 = this.f;
                Object[] objectArray = ((PaymentInstruments)object4).getPaymentInstrumentWalletChecksum();
                ((FetchWalletsRequest)object).setPaymentInstrumentWalletChecksum((String)objectArray);
                objectArray = ((PaymentInstruments)object4).getCustomer();
                ((FetchWalletsRequest)object).setCustomer((Customer)objectArray);
                objectArray = ((PaymentInstruments)object4).getOrder();
                ((FetchWalletsRequest)object).setOrder((Order)objectArray);
                objectArray = ((PaymentInstruments)object4).getPaymentChannelInformation();
                ((FetchWalletsRequest)object).setPaymentChannelInformation((PaymentChannelInformation)objectArray);
                objectArray = ((PaymentInstruments)object4).getRequestChecksum();
                ((FetchWalletsRequest)object).setRequestChecksum((String)objectArray);
                objectArray = ((PaymentInstruments)object4).getTenant();
                ((FetchWalletsRequest)object).setTenant((Tenant)objectArray);
                object4 = ((PaymentInstruments)object4).getTransactionToken();
                ((FetchWalletsRequest)object).setTransactionToken((String)object4);
                object4 = this.g;
                ((FetchWalletsRequest)object).setInternalWallets((ArrayList)object4);
                object4 = UrlHelper.Companion.getInstance();
                objectArray = new Object[]{};
                String string2 = "payment";
                String string3 = "fetch_wallets";
                object4 = ((UrlHelper)object4).getApiUrl(string2, string3, objectArray);
                object3 = ((oo2_1)object3).a;
                this.b = object2;
                this.a = n7;
                String string4 = "FETCH_WALLETS";
                object = object3.fetchInternalWallets((String)object4, (FetchWalletsRequest)object, string4, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            this.b = null;
            this.a = n3;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

