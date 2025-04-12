/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qG0
 */
public final class qg0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = ld3_1.Companion;
                object = (ld3_1)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                int n4 = 1;
                object2 = new sa1_1(object, n4);
                Object object3 = new pw_2((Function0)object2);
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                String string2 = "factory";
                Intrinsics.checkNotNullParameter(object3, string2);
                rd3_0 rd3_02 = object.getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = object.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(rd3_02, "store");
                Intrinsics.checkNotNullParameter(object3, string2);
                Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
                object2 = e43_0.class;
                string2 = "modelClass";
                object = on_2.c(rd3_02, (pw_2)object3, (Wd0)object, object2, string2);
                object2 = ef0_0.a(object2, string2, string2, "<this>");
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (e43_0)((pD3)object).a((yn1_2)object2, (String)object3);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 0: 
        }
        object = (Function0)object;
        Intrinsics.checkNotNullParameter(object, "$onViewAllClick");
        object.invoke();
        return Unit.a;
    }
}

