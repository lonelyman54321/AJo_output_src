/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cv0
 */
public final class cv0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cv0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = nv2_2.Companion;
                object = (nv2_2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object2 = ((Fragment)object).requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(object2, "requireParentFragment(...)");
                int n4 = 1;
                Object object3 = new ux1_0(object, n4);
                object = new pw_2((Function0)object3);
                object3 = "owner";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                String string2 = "factory";
                Intrinsics.checkNotNullParameter(object, string2);
                rd3_0 rd3_02 = object2.getViewModelStore();
                String string3 = "store";
                object2 = oh2_0.a((Fragment)object2, (String)object3, rd3_02, string3);
                Intrinsics.checkNotNullParameter(object, string2);
                Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
                object3 = F12.class;
                string2 = "modelClass";
                object = on_2.c(rd3_02, (pw_2)object, (Wd0)object2, object3, string2);
                object2 = ef0_0.a(object3, string2, string2, "<this>");
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (F12)((pD3)object).a((yn1_2)object2, (String)object3);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 0: 
        }
        object = (Function0)object;
        Intrinsics.checkNotNullParameter(object, "$onCloseClick");
        object.invoke();
        return Unit.a;
    }
}

