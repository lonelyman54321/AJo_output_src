/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class a00
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a00(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return m.d((Context)this.b);
            }
            case 1: {
                Object object = (pj0_2)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((pj0_2)object).f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    n3 = 0;
                    object = null;
                }
                object.v1();
                return Unit.a;
            }
            case 0: 
        }
        Object object = (e00)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((e00)object).i;
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        object2 = (Fragment)object2;
        Object object3 = new c00(object, 0);
        object = new pw_2((Function0)object3);
        object3 = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object, string3);
        rd3_0 rd3_02 = object2.getViewModelStore();
        String string4 = "store";
        object2 = oh2_0.a((Fragment)object2, (String)object3, rd3_02, string4);
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object3 = ZC2.class;
        string3 = "modelClass";
        object2 = on_2.c(rd3_02, (pw_2)object, (Wd0)object2, object3, string3);
        object = ef0_0.a(object3, string3, string3, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (ZC2)((pD3)object2).a((yn1_2)object, (String)object3);
        }
        object = "Local and anonymous classes can not be ViewModels".toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

