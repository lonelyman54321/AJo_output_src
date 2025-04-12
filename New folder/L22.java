/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class L22
implements Function0 {
    public final /* synthetic */ q22_0 a;

    public /* synthetic */ L22(q22_0 q22_02) {
        this.a = q22_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = new G22((Fragment)object, 0);
        Object object3 = new pw_2((Function0)object2);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        rd3_0 rd3_02 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object3, string2);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object = F12.class;
        string2 = "modelClass";
        object2 = on_2.c(rd3_02, (pw_2)object3, (Wd0)object2, (Class)object, string2);
        object = ef0_0.a((Class)object, string2, string2, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (F12)((pD3)object2).a((yn1_2)object, (String)object3);
        }
        object = "Local and anonymous classes can not be ViewModels".toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

