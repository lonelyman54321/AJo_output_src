/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import androidx.lifecycle.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YZ
 */
public final class yz_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yz_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (pj0_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = pj0_2.Companion;
                ((pj0_2)object2).Va();
                return Unit.a;
            }
            case 0: 
        }
        object2 = (e00)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = ((e00)object2).j;
        object3 = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = object2.getViewModelStore();
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = object2 instanceof f;
        if (bl2) {
            object = object2;
            object = ((f)object2).getDefaultViewModelProviderFactory();
        } else {
            object = tn0_0.a;
        }
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = bl2 ? ((f)object2).getDefaultViewModelCreationExtras() : Wd0$a.b;
        Intrinsics.checkNotNullParameter(object4, "store");
        Intrinsics.checkNotNullParameter(object, "factory");
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object3 = oz_2.class;
        String string2 = "modelClass";
        object2 = rl3_0.b((rd3_0)object4, (E$b)object, (Wd0)object2, object3, string2);
        object3 = ef0_0.a(object3, string2, string2, "<this>");
        object4 = object3.getQualifiedName();
        if (object4 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object4);
            return (oz_2)((pD3)object2).a((yn1_2)object3, (String)object4);
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object2 = new IllegalArgumentException((String)object3);
        throw object2;
    }
}

