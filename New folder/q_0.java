/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q
 */
public final class q_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (ft1_2)this.b;
                String string2 = "$lazyRowState";
                Intrinsics.checkNotNullParameter(object, string2);
                object = (Js1)CollectionsKt.T(((ft1_2)object).j().i());
                if (object != null) {
                    n3 = object.getIndex();
                    object = n3;
                } else {
                    n3 = 0;
                    object = null;
                }
                return object;
            }
            case 0: 
        }
        Object object = (s_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = new Object();
        Object object3 = new pw_2((Function0)object2);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object3, string3);
        rd3_0 rd3_02 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object3, string3);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object = y_0.class;
        string3 = "modelClass";
        object2 = on_2.c(rd3_02, (pw_2)object3, (Wd0)object2, (Class)object, string3);
        object = ef0_0.a((Class)object, string3, string3, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (y_0)((pD3)object2).a((yn1_2)object, (String)object3);
        }
        object = "Local and anonymous classes can not be ViewModels".toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

