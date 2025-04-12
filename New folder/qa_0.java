/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QA
 */
public final class qa_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = (String)this.b;
                object = (dl2_2)object;
                return RtbRepo.c(string2, (dl2_2)object);
            }
            case 2: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (op2_2)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((op2_2)object3).l;
                object3 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ((ApiErrorRepo)object3).handleApiException((Throwable)object2, "PAYMENT_PayNowByIW", true, "single page checkout", "Forward");
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 1: {
                object = (String)object;
                ou0_0 ou0_02 = (ou0_0)this.b;
                Intrinsics.checkNotNullParameter(ou0_02, "$focusRequester2");
                String string3 = "it";
                Intrinsics.checkNotNullParameter(object, string3);
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2) {
                    ou0_02.b();
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Subcomponent)object;
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        Intrinsics.checkNotNullParameter(object, "it");
        function1.invoke(object);
        return Unit.a;
    }
}

