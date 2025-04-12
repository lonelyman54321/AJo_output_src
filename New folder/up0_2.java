/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.lifecycle.E$b;
import com.ril.ajio.devsettings.DevSettingsActivity;
import com.ril.ajio.devsettings.DevSettingsActivity$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from up0
 */
public final class up0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ up0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (q22_0)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
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
                object2 = xw0_2.class;
                object3 = "modelClass";
                object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object2, "<this>");
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (xw0_2)((pD3)object).a((yn1_2)object2, (String)object3);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 0: 
        }
        DevSettingsActivity$a devSettingsActivity$a = DevSettingsActivity.Companion;
        object = (DevSettingsActivity)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        object2 = new jo_2((Context)object);
        return object2;
    }
}

