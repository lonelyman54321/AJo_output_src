/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class N7
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ N7(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = object;
                object3 = (Throwable)object;
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, string2);
                object = ((op2_2)object2).o;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object3);
                object2 = apiErrorRepo.handleApiException((Throwable)object3, "PAYMENT_AbortTransaction", true, "single page checkout", "Forward");
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        object2 = (AjioHomeActivity)object2;
        Intrinsics.checkNotNullParameter(object2, string2);
        if (bl2) {
            ((AppCompatActivity)object2).invalidateOptionsMenu();
        }
        return Unit.a;
    }
}

