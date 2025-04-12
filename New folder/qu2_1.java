/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QU2
 */
public final class qu2_1
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Object c;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object3 = (f80_0)object3;
        qu2_1 qu2_12 = new qg3_2(3, (f80_0)object3);
        qu2_12.b = object;
        qu2_12.c = object2;
        object = Unit.a;
        return qu2_12.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((AppDataBase)this.c).searchDao();
            String string2 = od3_2.a();
            object2 = object2.loadAllSearchEntries(string2);
            string2 = "loadAllSearchEntries(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            this.a = n4;
            object = ms0_1.i(this, (es0_2)object2, (fs0_2)object);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

