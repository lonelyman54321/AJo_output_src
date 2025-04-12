/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I7
 */
public final class i7_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = 0;
        Object object = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object3 = (qz1_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                return ((UserRepo)((qz1_2)object3).p0.getValue()).getUserInformation();
            }
            case 1: {
                object3 = (p83_0)object3;
                if (object3 != null) {
                    n3 = ((p83_0)object3).size();
                }
                return n3;
            }
            case 0: 
        }
        Object object4 = AjioHomeActivity.Companion;
        object3 = (AjioHomeActivity)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = new P7(object3, 0);
        object = new pw_2((Function0)object2);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object4 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        rd3_0 rd3_02 = object3.getViewModelStore();
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object3 = h91.class;
        object4 = "modelClass";
        object = on_2.c(rd3_02, (pw_2)object, (Wd0)object2, object3, (String)object4);
        object2 = ef0_0.a(object3, (String)object4, (String)object4, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (h91)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

