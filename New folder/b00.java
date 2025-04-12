/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import androidx.lifecycle.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class b00
implements Function0 {
    public final /* synthetic */ e00 a;

    public /* synthetic */ b00(e00 e002) {
        this.a = e002;
    }

    public final Object invoke() {
        Object object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((e00)object2).j;
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        Object object4 = object3.getViewModelStore();
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        boolean bl2 = object3 instanceof f;
        if (bl2) {
            object = object3;
            object = ((f)object3).getDefaultViewModelProviderFactory();
        } else {
            object = tn0_0.a;
        }
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object3 = bl2 ? ((f)object3).getDefaultViewModelCreationExtras() : Wd0$a.b;
        Intrinsics.checkNotNullParameter(object4, "store");
        Intrinsics.checkNotNullParameter(object, "factory");
        Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
        object2 = r43_0.class;
        String string2 = "modelClass";
        object3 = rl3_0.b((rd3_0)object4, (E$b)object, (Wd0)object3, object2, string2);
        object2 = ef0_0.a(object2, string2, string2, "<this>");
        object4 = object2.getQualifiedName();
        if (object4 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object4);
            return (r43_0)((pD3)object3).a((yn1_2)object2, (String)object4);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object3 = new IllegalArgumentException((String)object2);
        throw object3;
    }
}

