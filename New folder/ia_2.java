/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ia
 */
public final class ia_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ia_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (zt3_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object2 = ((Fragment)object2).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
                object = new op2_2((Application)object2);
                return object;
            }
            case 4: {
                int n4;
                object2 = (p83_0)object2;
                if (object2 != null) {
                    n4 = ((p83_0)object2).size();
                } else {
                    n4 = 0;
                    object = null;
                }
                return n4;
            }
            case 3: {
                object2 = (qz1_2)object2;
                Intrinsics.checkNotNullParameter(object2, "$viewModel");
                object = Boolean.TRUE;
                ((qz1_2)object2).o.setValue(object);
                object = md3_0.c((jD3)object2);
                rz1_2 rz1_22 = new rz1_2((qz1_2)object2, null);
                Ae3.d((i90_0)object, null, null, rz1_22, 3);
                return Unit.a;
            }
            case 2: {
                Object object3 = fq0_2.Companion;
                object2 = (fq0_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((Fragment)object2).requireActivity();
                Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object3 = object.getViewModelStore();
                object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
                String string2 = "factory";
                object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
                String string3 = "defaultCreationExtras";
                object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
                object2 = r81_0.class;
                object3 = "modelClass";
                object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object2, "<this>");
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (r81_0)((pD3)object).a((yn1_2)object2, (String)object3);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 1: {
                return (uf_1)object2;
            }
            case 0: 
        }
        object2 = (ma_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = new ka_2((ma_2)object2);
        return object;
    }
}

