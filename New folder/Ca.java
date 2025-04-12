/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Ca
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Ca(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Iterator iterator = (ft1_2)this.b;
                Intrinsics.checkNotNullParameter(iterator, "$lazyListState");
                float f5 = 40.0f;
                iterator = x20_0.g((ft1_2)((Object)iterator), f5);
                int n4 = yx_2.o((Iterable)((Object)iterator), 10);
                ArrayList<Integer> arrayList = new ArrayList<Integer>(n4);
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    n4 = ((Js1)iterator.next()).getIndex();
                    Integer n7 = n4;
                    arrayList.add(n7);
                }
                return arrayList;
            }
            case 1: {
                Object object = (io0_1)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((Fragment)object).requireActivity();
                Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
                object = "owner";
                Intrinsics.checkNotNullParameter(object2, (String)object);
                Object object3 = object2.getViewModelStore();
                object = cX1.a((FragmentActivity)object2, (String)object, (FragmentActivity)object2, (String)object);
                String string2 = "factory";
                object2 = dX1.a((FragmentActivity)object2, (rd3_0)object3, "store", (E$b)object, string2);
                String string3 = "defaultCreationExtras";
                object2 = li_2.a((Wd0)object2, string3, (rd3_0)object3, (E$b)object, (Wd0)object2);
                object = io2_1.class;
                object3 = "modelClass";
                object = do_0.a(object, (String)object3, object, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object, "<this>");
                object3 = object.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (io2_1)((pD3)object2).a((yn1_2)object, (String)object3);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 0: 
        }
        ia_0 ia_02 = (ia_0)this.b;
        Intrinsics.checkNotNullParameter(ia_02, "this$0");
        ia_02.ob();
        return Unit.a;
    }
}

