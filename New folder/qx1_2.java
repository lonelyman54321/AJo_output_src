/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from QX1
 */
public final class qx1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wx1_1 c;

    public qx1_2(ArrayList arrayList, wx1_1 wx1_12, f80_0 f80_02) {
        this.b = arrayList;
        this.c = wx1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = this.b;
        wx1_1 wx1_12 = this.c;
        object = new qx1_2(arrayList, wx1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qx1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qx1_2)object).invokeSuspend(object2);
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
            object = CartDaoHelper.INSTANCE.getAllCartEntity();
            Object object2 = this.b;
            wx1_1 wx1_12 = this.c;
            Object object3 = new QX1$c((es0_2)object, (ArrayList)object2, wx1_12);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
            int n7 = 3;
            wx1_12 = null;
            object3 = new qg3_2(n7, null);
            object2 = new at0_1((es0_2)object, (gx0_2)object3);
            object = QX1$b.a;
            this.a = n4;
            object = ((at0_1)object2).collect((fs0_2)object, this);
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

