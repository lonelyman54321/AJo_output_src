/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pw
 */
public final class pw_2
implements E$b {
    public final Function0 a;

    public pw_2(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "creator");
        this.a = function0;
    }

    public final jD3 create(Class object) {
        Intrinsics.checkNotNullParameter(object, "modelClass");
        object = this.a.invoke();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of com.ril.ajio.viewmodel.BaseViewModelFactory.create");
        return (jD3)object;
    }

    public final /* synthetic */ jD3 create(Class clazz, Wd0 wd0) {
        wd0 = (or1_2)wd0;
        return oD3.b(this, clazz, (or1_2)wd0);
    }

    public final /* synthetic */ jD3 create(yn1_2 yn1_22, Wd0 wd0) {
        wd0 = (or1_2)wd0;
        return oD3.a(this, yn1_22, (or1_2)wd0);
    }
}

