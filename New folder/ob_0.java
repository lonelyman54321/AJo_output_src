/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ob
 */
public final class ob_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (q22_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Object object3 = object.getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                E$b e$b = object.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = object.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object3, "store");
                Intrinsics.checkNotNullParameter(e$b, "factory");
                object2 = li_2.a((Wd0)object2, "defaultCreationExtras", (rd3_0)object3, e$b, (Wd0)object2);
                object = K43.class;
                object3 = "modelClass";
                object = do_0.a((Class)object, (String)object3, (Class)object, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object, "<this>");
                object3 = object.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (K43)((pD3)object2).a((yn1_2)object, (String)object3);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 0: 
        }
        Intrinsics.checkNotNullExpressionValue(wb_0.c, "userInformation");
        ue3_1 ue3_12 = (ue3_1)this.b;
        g00 g002 = new g00(ue3_12);
        return g002;
    }
}

