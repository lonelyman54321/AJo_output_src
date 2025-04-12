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
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ld2
 */
public final class ld2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (ms2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((Fragment)object).requireActivity();
                Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
                object = "owner";
                Intrinsics.checkNotNullParameter(object2, (String)object);
                Object object3 = object2.getViewModelStore();
                object = cX1.a((FragmentActivity)object2, (String)object, (FragmentActivity)object2, (String)object);
                String string2 = "factory";
                object2 = dX1.a((FragmentActivity)object2, (rd3_0)object3, "store", (E$b)object, string2);
                String string3 = "defaultCreationExtras";
                object2 = li_2.a((Wd0)object2, string3, (rd3_0)object3, (E$b)object, (Wd0)object2);
                object = io2_1.class;
                object3 = "modelClass";
                object = do_0.a(object, (String)object3, object, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object, "<this>");
                object3 = object.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (io2_1)((pD3)object2).a((yn1_2)object, (String)object3);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 1: {
                Application application = (Application)this.b;
                Intrinsics.checkNotNullParameter(application, "$application");
                z40_0.Companion.getClass();
                return z40$a.a((Context)application).a.a("enable_RBI_consent_screen");
            }
            case 0: 
        }
        qz1_2 qz1_22 = (qz1_2)this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        qz1_2.e(qz1_22);
        return Unit.a;
    }
}

