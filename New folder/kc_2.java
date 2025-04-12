/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kC
 */
public final class kc_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kc_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (xp2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = new rp2_1((xp2_2)object);
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
                object = hy3_0.class;
                string2 = "modelClass";
                object2 = on_2.c(rd3_02, (pw_2)object3, (Wd0)object2, (Class)object, string2);
                object = ef0_0.a((Class)object, string2, string2, "<this>");
                object3 = object.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (hy3_0)((pD3)object2).a((yn1_2)object, (String)object3);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 0: 
        }
        yT1 yT12 = (yT1)this.b;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        yT12.q();
        return Unit.a;
    }
}

