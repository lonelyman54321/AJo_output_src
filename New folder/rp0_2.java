/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.ril.ajio.payment.fragment.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rP0
 */
public final class rp0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = (d)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                int n4 = 1;
                Object object3 = new vp0_2(object2, n4);
                Object object4 = new pw_2((Function0)object3);
                object3 = "owner";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                String string2 = "factory";
                Intrinsics.checkNotNullParameter(object4, string2);
                rd3_0 rd3_02 = object2.getViewModelStore();
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = object2.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(rd3_02, "store");
                Intrinsics.checkNotNullParameter(object4, string2);
                Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
                object2 = op2_2.class;
                string2 = "modelClass";
                object3 = on_2.c(rd3_02, (pw_2)object4, (Wd0)object3, (Class)object2, string2);
                object2 = ef0_0.a((Class)object2, string2, string2, "<this>");
                object4 = object2.getQualifiedName();
                if (object4 != null) {
                    object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object4);
                    return (op2_2)((pD3)object3).a((yn1_2)object2, (String)object4);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object3 = new IllegalArgumentException((String)object2);
                throw object3;
            }
            case 0: 
        }
        Object object5 = object = this.b;
        object5 = (SystemUiController)object;
        Intrinsics.checkNotNullParameter(object5, "$systemUiController");
        long l2 = nz_1.a;
        jh3_2.h((SystemUiController)object5, l2, false, false, null, 12, null);
        return Unit.a;
    }
}

