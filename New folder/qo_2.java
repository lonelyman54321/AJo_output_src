/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qO
 */
public final class qo_2
implements Function0 {
    public final /* synthetic */ uo_2 a;

    public /* synthetic */ qo_2(uo_2 uo_22) {
        this.a = uo_22;
    }

    public final Object invoke() {
        Object object = uo_2.Companion;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        Object object3 = object2.getViewModelStore();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        E$b e$b = object2.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = object2.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, e$b, (Wd0)object);
        object2 = bu2_0.class;
        object3 = "modelClass";
        object2 = do_0.a((Class)object2, (String)object3, (Class)object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (bu2_0)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

