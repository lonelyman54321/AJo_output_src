/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from o21
 */
public final class o21_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ o21_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                pA1 pA12 = (pA1)this.b;
                Intrinsics.checkNotNullParameter(pA12, "this$0");
                pA12 = pA12.requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(pA12, "getApplicationContext(...)");
                jo_2 jo_22 = new jo_2((Context)pA12);
                return jo_22;
            }
            case 0: 
        }
        Object object = (t21_0)this.b;
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
}

