/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dT
 */
public final class dt_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dt_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = 2;
        Object object = this.b;
        Object object2 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object3 = PeWebViewActivity.Companion;
                object = (PeWebViewActivity)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = new ua0_1(object, n3);
                Object object4 = new pw_2((Function0)object2);
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object3 = "factory";
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                rd3_0 rd3_02 = object.getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = object.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(rd3_02, "store");
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
                object2 = op2_2.class;
                object3 = "modelClass";
                object4 = on_2.c(rd3_02, (pw_2)object4, (Wd0)object, object2, (String)object3);
                object = ef0_0.a(object2, (String)object3, (String)object3, "<this>");
                object2 = object.getQualifiedName();
                if (object2 != null) {
                    object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
                    return (op2_2)((pD3)object4).a((yn1_2)object, (String)object2);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object4 = new IllegalArgumentException((String)object);
                throw object4;
            }
            case 1: {
                object = (NewProductDetailsFragment)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object, "getApplication(...)");
                object2 = new hy3_0((Application)object, null, n3, null);
                return object2;
            }
            case 0: 
        }
        object = (gt_2)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        return UserInformation.getInstance((Context)((Fragment)object).requireActivity().getApplication());
    }
}

