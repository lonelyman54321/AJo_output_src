/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dh0
 */
public final class dh0_1
implements Function0 {
    public final /* synthetic */ d a;

    public /* synthetic */ dh0_1(d d2) {
        this.a = d2;
    }

    public final Object invoke() {
        Object object = d.Companion;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        Object object3 = object2.getViewModelStore();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        E$b e$b = ((i51_0)object2).getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = object2.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, e$b, (Wd0)object);
        object2 = yh0_0.class;
        object3 = "modelClass";
        object2 = do_0.a((Class)object2, (String)object3, (Class)object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (yh0_0)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

