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
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.home.AjioHomeActivity$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class W7
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ W7(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (Function0)object2;
                Intrinsics.checkNotNullParameter(object2, "$onCtaButtonClicked");
                object2.invoke();
                return Unit.a;
            }
            case 1: {
                object2 = (vp_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((Fragment)object2).getParentFragment();
                if (object == null) return null;
                if ((object = ((Fragment)object).getParentFragment()) == null) return null;
                Application application = ((Fragment)object2).requireActivity().getApplication();
                Object object3 = new up_0(application, (vp_1)object2);
                object2 = new pw_2((Function0)object3);
                String string2 = "owner";
                Intrinsics.checkNotNullParameter(object, string2);
                object3 = "factory";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                rd3_0 rd3_02 = object.getViewModelStore();
                String string3 = "store";
                object = oh2_0.a((Fragment)object, string2, rd3_02, string3);
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
                Class<F12> clazz = F12.class;
                object3 = "modelClass";
                object = on_2.c(rd3_02, (pw_2)object2, (Wd0)object, clazz, (String)object3);
                object2 = ef0_0.a(clazz, (String)object3, (String)object3, "<this>");
                String string4 = object2.getQualifiedName();
                if (string4 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                    String string5 = ((String)object3).concat(string4);
                    return (F12)((pD3)object).a((yn1_2)object2, string5);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 0: 
        }
        AjioHomeActivity$a ajioHomeActivity$a = AjioHomeActivity.Companion;
        object2 = (AjioHomeActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object2 = object2.getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
        return new G61((Context)object2);
    }
}

