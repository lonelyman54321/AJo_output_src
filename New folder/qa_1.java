/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.services.data.Cart.CartCount;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qa
 */
public final class qa_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                zr1_1 zr1_12 = (zr1_1)this.b;
                object = (BottomNavigationData)object;
                return HomeRepo.E(zr1_12, (BottomNavigationData)object);
            }
            case 1: {
                object = (DataCallback)object;
                String string2 = "$onSuccessCartCount";
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, string2);
                n3 = ((DataCallback)object).getStatus();
                if (n3 == 0) {
                    int n4;
                    if ((object = (CartCount)((DataCallback)object).getData()) != null) {
                        n4 = ((CartCount)object).getCartCount();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    object = n4;
                    function1.invoke(object);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        lq_2 lq_22 = (lq_2)this.b;
        Intrinsics.checkNotNullParameter(lq_22, "$subCategory");
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        String string3 = lq_22.a.getInactiveAltText();
        if (string3 == null && (string3 = lq_22.a.getName()) == null) {
            string3 = "category";
        }
        RY2.e((UY2)object, string3);
        return Unit.a;
    }
}

