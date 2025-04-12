/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from iJ
 */
public final class ij_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ij_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (fx3_0)object2;
                object = ((fx3_0)object2).f;
                n3 = 6;
                char c2 = '#';
                Object var5_5 = null;
                int n4 = StringsKt.N((CharSequence)object, c2, 0, false, n3) + 1;
                if (n4 == 0) {
                    object = "";
                } else {
                    object = ((fx3_0)object2).f.substring(n4);
                    object2 = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                }
                return object;
            }
            case 2: {
                object2 = (nf3_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object2 = ((Fragment)object2).requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(object2, "getApplicationContext(...)");
                object = new jo_2((Context)object2);
                return object;
            }
            case 1: {
                object2 = (de0_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((Fragment)object2).requireActivity();
                Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Object object3 = object.getViewModelStore();
                object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
                String string2 = "factory";
                object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
                String string3 = "defaultCreationExtras";
                object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
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
            case 0: 
        }
        object = ((jJ)object2).f;
        object2 = "Content-Type";
        object = ((m41_0)object).a((String)object2);
        if (object != null) {
            object2 = jn1_0.d;
            object = JN1$a.b((String)object);
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }
}

