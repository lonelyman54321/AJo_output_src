/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.Offers.BankOffer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from AT
 */
public final class at_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ at_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = "this$0";
        Object object4 = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (DataCallback)object;
                object4 = (NewProductDetailsFragment)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object3 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n8 != 0) {
                    ((NewProductDetailsFragment)object4).m1 = n4;
                    n8 = ((DataCallback)object).getStatus();
                    if (n8 == 0) {
                        object = (BankOffer)((DataCallback)object).getData();
                        object3 = h40_0.a;
                        n8 = (int)(h40_0.A1() ? 1 : 0);
                        if (n8 != 0) {
                            if (object != null && (object3 = ((BankOffer)object).getAllBankOffer()) != null && (n8 = object3.isEmpty() ^ n4) == n4 && (object3 = ((NewProductDetailsFragment)object4).l1) != null && (object3 = ((BankOffer)object3).getAllBankOffer()) != null && (n8 = object3.isEmpty() ^ n4) == n4) {
                                if ((object = ((BankOffer)object).getAllBankOffer()) != null && (object2 = ((NewProductDetailsFragment)object4).l1) != null && (object2 = ((BankOffer)object2).getAllBankOffer()) != null) {
                                    ((ArrayList)object2).addAll(object);
                                }
                            } else {
                                object3 = ((NewProductDetailsFragment)object4).l1;
                                if (object3 != null) {
                                    object2 = ((BankOffer)object3).getAllBankOffer();
                                }
                                if ((object2 == null || (n3 = object2.isEmpty()) != 0) && object != null && (object2 = ((BankOffer)object).getAllBankOffer()) != null && (n3 = object2.isEmpty() ^ n4) == n4) {
                                    ((NewProductDetailsFragment)object4).l1 = object;
                                }
                            }
                        } else {
                            ((NewProductDetailsFragment)object4).l1 = object;
                        }
                        if ((object = ((NewProductDetailsFragment)object4).L) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                            ((RecyclerView$f)object).notifyDataSetChanged();
                        }
                    } else {
                        object = StringCompanionObject.INSTANCE;
                        int n10 = R$string.acc_error_message;
                        object = hv3_0.K(n10);
                        object2 = hv3_0.K(R$string.something_wrong_msg);
                        object3 = new Object[n4];
                        n7 = 0;
                        object3[0] = object2;
                        object = xh2_0.a((Object[])object3, n4, (String)object, "format(...)");
                        n3 = R$string.something_wrong_msg;
                        object2 = hv3_0.K(n3);
                        ((NewProductDetailsFragment)object4).showNotification((String)object2, (String)object);
                    }
                }
                return Unit.a;
            }
            case 1: {
                object4 = (zr1_1)object4;
                object = (BottomNavigationData)object;
                return HomeRepo.Z((zr1_1)object4, (BottomNavigationData)object);
            }
            case 0: 
        }
        object = (Boolean)object;
        object4 = (CheckoutFragment)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object = ((CheckoutFragment)object4).o;
        if (object != null) {
            object = ((CheckoutFragment)object4).d;
            if (object == null) {
                object = "recyclerView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object = new wT((CheckoutFragment)object4);
            object2.post((Runnable)object);
        }
        return Unit.a;
    }
}

