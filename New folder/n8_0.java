/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from n8
 */
public final class n8_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (qz1_2)object;
                Intrinsics.checkNotNullParameter(object, "$viewModel");
                object.getClass();
                LinkedHashMap<Boolean, Object> linkedHashMap = new LinkedHashMap<Boolean, Object>();
                Boolean bl2 = Boolean.FALSE;
                linkedHashMap.put(bl2, null);
                ((qz1_2)object).j.setValue(linkedHashMap);
                return Unit.a;
            }
            case 1: {
                object = (Media)object;
                if (object == null || (object = ((Media)object).getUrl()) == null) {
                    object = "";
                }
                return object;
            }
            case 0: 
        }
        Object object2 = q9_0.Companion;
        object = (q9_0)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = new Y8((Fragment)object, 0);
        Object object3 = new pw_2((Function0)object2);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        rd3_0 rd3_02 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object3, string2);
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = b52_0.class;
        string2 = "modelClass";
        object = on_2.c(rd3_02, (pw_2)object3, (Wd0)object, object2, string2);
        object2 = ef0_0.a(object2, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (b52_0)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

