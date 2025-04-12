/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tY1
 */
public final class ty1_1
implements o60_0,
bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ty1_1() {
        this.a = 2;
        this.b = "AJIO_STATUS";
    }

    public /* synthetic */ ty1_1(int n3, Function1 function1) {
        this.a = n3;
        this.b = function1;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = object = this.b;
                object3 = (String)object;
                Intrinsics.checkNotNullParameter(object3, "$screenName");
                Intrinsics.checkNotNullParameter(object2, "throwable");
                object = yn3_0.a;
                String string2 = ((Throwable)object2).getLocalizedMessage();
                string2 = kp1_0.c("error is :", string2);
                Object[] objectArray = new Object[]{};
                ((yn3$a)object).f(string2, objectArray);
                return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "ajioCashWalletToBankTransferStatus", true, (String)object3, "Forward");
            }
            case 1: 
        }
        return (DataCallback)oj_0.a((Function1)this.b, "$tmp0", object, "p0", object);
    }
}

