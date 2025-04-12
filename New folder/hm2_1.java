/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.TextView
 */
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Product.EddResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HM2
 */
public final class hm2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hm2_1() {
        this.a = 1;
        this.b = "single page checkout";
    }

    public /* synthetic */ hm2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (hy3_0)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((hy3_0)object3).n;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "MyAccountsStaticLink", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 1: {
                Object object4;
                Object object5 = object;
                object5 = (dl2_2)object;
                Object object6 = object4 = this.b;
                object6 = (String)object4;
                Intrinsics.checkNotNullParameter(object6, "$screenName");
                Intrinsics.checkNotNullParameter(object5, "shippingEddResp");
                object = (EddResult)((dl2_2)object5).b;
                object4 = ((dl2_2)object5).a;
                n3 = (int)(((cl2_2)object4).d() ? 1 : 0);
                if (n3 != 0 && object != null) {
                    object4 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object4).onSuccess(object);
                } else {
                    object4 = ApiErrorRepo.INSTANCE;
                    String string2 = "ShippingEddCheck";
                    boolean bl2 = true;
                    String string3 = "Forward";
                    object = ((ApiErrorRepo)object4).handleApiError((dl2_2)object5, string2, bl2, (String)object6, string3);
                }
                return object;
            }
            case 0: 
        }
        object = (Context)object;
        String string4 = (String)this.b;
        Intrinsics.checkNotNullParameter(string4, "$htmlText");
        Intrinsics.checkNotNullParameter(object, "context");
        TextView textView = new TextView((Context)object);
        object = D91.a(63, string4);
        textView.setText((CharSequence)object);
        return textView;
    }
}

