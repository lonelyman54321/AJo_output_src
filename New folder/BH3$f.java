/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class BH3$f
implements fs0_2 {
    public final /* synthetic */ BH3 a;
    public final /* synthetic */ String b;

    public BH3$f(BH3 bH3, String string2) {
        this.a = bH3;
        this.b = string2;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        BH3 bH3 = this.a;
        bH3.getClass();
        iw_1.a.getClass();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "code");
        Object object3 = DatabaseCreator.INSTANCE.getDBInstance();
        Object object4 = new mw_1((es0_2)object3, string2);
        object3 = ir0_2.a;
        object3 = ms0_1.m((es0_2)object4, (CoroutineContext)object3);
        object4 = new eh3_1(bH3, (DataCallback)object, null);
        at0_1 at0_12 = new at0_1((es0_2)object3, (gx0_2)object4);
        object3 = new fh3_0(string2, bH3, (DataCallback)object);
        object = at0_12.collect((fs0_2)object3, (f80_0)object2);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object != object2) {
            object = Unit.a;
        }
        if (object != object2) {
            object = Unit.a;
        }
        if (object != object2) {
            object = Unit.a;
        }
        return object;
    }
}

