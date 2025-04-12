/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import androidx.lifecycle.E$d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class pD3 {
    public final rd3_0 a;
    public final E$b b;
    public final Wd0 c;

    public pD3(rd3_0 rd3_02, E$b e$b, Wd0 wd0) {
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        Intrinsics.checkNotNullParameter(wd0, "extras");
        this.a = rd3_02;
        this.b = e$b;
        this.c = wd0;
    }

    public final jD3 a(yn1_2 object, String object2) {
        Object object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string2 = "key";
        Intrinsics.checkNotNullParameter(object2, string2);
        Object object4 = this.a;
        object4.getClass();
        Intrinsics.checkNotNullParameter(object2, string2);
        object4 = ((rd3_0)object4).a;
        Object object5 = (jD3)((LinkedHashMap)object4).get(object2);
        boolean bl2 = object.isInstance(object5);
        Object object6 = this.b;
        if (bl2) {
            boolean bl3 = object6 instanceof E$d;
            if (bl3) {
                object6 = (E$d)object6;
                Intrinsics.checkNotNull(object5);
                ((E$d)object6).a((jD3)object5);
            }
            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return object5;
        }
        Object object7 = this.c;
        object5 = new or1_2((Wd0)object7);
        object7 = qD3.a;
        ((or1_2)object5).b((Wd0$b)object7, object2);
        object7 = "factory";
        Intrinsics.checkNotNullParameter(object6, (String)object7);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = "extras";
        Intrinsics.checkNotNullParameter(object5, (String)object3);
        try {
            object = object6.create((yn1_2)object, (Wd0)object5);
        }
        catch (AbstractMethodError abstractMethodError) {
            object3 = rn1_2.a((yn1_2)object);
            try {
                object = object6.create((Class)object3, (Wd0)object5);
            }
            catch (AbstractMethodError abstractMethodError2) {
                object = rn1_2.a((yn1_2)object);
                object = object6.create((Class)object);
            }
        }
        Intrinsics.checkNotNullParameter(object2, string2);
        object3 = "viewModel";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object2 = (jD3)object4.put(object2, object);
        if (object2 != null) {
            ((jD3)object2).clear$lifecycle_viewmodel_release();
        }
        return object;
    }
}

