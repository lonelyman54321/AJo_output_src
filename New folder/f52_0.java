/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.entity.Notifications;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from f52
 */
public final class f52_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Notifications b;
    public final /* synthetic */ g52 c;
    public final /* synthetic */ List d;

    public f52_0(Notifications notifications, g52 g522, ArrayList arrayList, f80_0 f80_02) {
        this.b = notifications;
        this.c = g522;
        this.d = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Notifications notifications = this.b;
        ArrayList arrayList = (ArrayList)this.d;
        g52 g522 = this.c;
        object = new f52_0(notifications, g522, arrayList, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (f52_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((f52_0)object).invokeSuspend(object2);
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
            object = DatabaseCreator.INSTANCE.getDBInstance();
            Object object2 = (ArrayList)this.d;
            Notifications notifications = this.b;
            g52 g522 = this.c;
            Object object3 = new f52$c((es0_2)object, notifications, g522, (ArrayList)object2);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
            int n7 = 3;
            notifications = null;
            object3 = new qg3_2(n7, null);
            object2 = new at0_1((es0_2)object, (gx0_2)object3);
            object = f52$b_0.a;
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

