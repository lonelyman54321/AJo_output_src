/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pH
 */
public final class ph_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ph_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = ld3_1.Companion;
                object2 = (ld3_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((ld3_1)object2).Qa().h.e;
                object3 = ((Fragment)object2).getViewLifecycleOwner();
                Function1 function1 = new L(object2, 3);
                Ld3$d ld3$d = new Ld3$d(function1);
                ((LiveData)object).e((mu1_1)object3, ld3$d);
                object = ((ld3_1)object2).Qa().h.g;
                object3 = ((Fragment)object2).getViewLifecycleOwner();
                function1 = new fd3_1(object2, 0);
                object2 = new Ld3$d(function1);
                ((LiveData)object).e((mu1_1)object3, (F62)object2);
                return Unit.a;
            }
            case 0: 
        }
        object2 = (rh_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((Fragment)object2).requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object4 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object4, "store", (E$b)object2, string2);
        String string3 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string3, (rd3_0)object4, (E$b)object2, (Wd0)object);
        object2 = io2_1.class;
        object4 = "modelClass";
        object2 = do_0.a((Class)object2, (String)object4, (Class)object2, (String)object4, (String)object4);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object4 = object2.getQualifiedName();
        if (object4 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object4);
            return (io2_1)((pD3)object).a((yn1_2)object2, (String)object4);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

