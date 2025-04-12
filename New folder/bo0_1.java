/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bo0
 */
public final class bo0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bo0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (ie0_1)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((Hj)object).getApplication();
                object2 = new jo_2((Context)object);
                return object2;
            }
            case 0: 
        }
        Object object3 = eo0_2.Companion;
        object = (eo0_2)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((Fragment)object).requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object3 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
        String string3 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
        object2 = os1_2.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (os1_2)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

