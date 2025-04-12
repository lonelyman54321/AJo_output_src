/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aX1
 */
public final class ax1_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ax1_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                pl2_1 pl2_12 = (pl2_1)this.b;
                Intrinsics.checkNotNullParameter(pl2_12, "this$0");
                pl2_12.Qa();
                return Unit.a;
            }
            case 0: 
        }
        Object object = (ex1_0)this.b;
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
}

