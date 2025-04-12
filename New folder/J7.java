/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.ContextWrapper
 */
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.E$b;
import com.ril.ajio.data.repo.CcApiRepo;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class J7
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContextWrapper b;

    public /* synthetic */ J7(ContextWrapper contextWrapper, int n3) {
        this.a = n3;
        this.b = contextWrapper;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Application)object;
                Intrinsics.checkNotNullParameter(object, "$application");
                CcApiRepo ccApiRepo = new CcApiRepo((Context)object);
                return ccApiRepo;
            }
            case 0: 
        }
        Object object2 = AjioHomeActivity.Companion;
        object = (AjioHomeActivity)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        E$b e$b = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, e$b, (Wd0)object);
        object2 = bu2_0.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (bu2_0)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

