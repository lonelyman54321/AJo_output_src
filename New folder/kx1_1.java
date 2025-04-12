/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from KX1
 */
public final class kx1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ String c;

    public kx1_1(wx1_1 wx1_12, String string2, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wx1_1 wx1_12 = this.b;
        String string2 = this.c;
        object = new kx1_1(wx1_12, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kx1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kx1_1)object).invokeSuspend(object2);
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
            Object object2 = ((wx1_1)object).c;
            ArrayList arrayList = ((wx1_1)object).T0;
            Object object3 = this.c;
            String string2 = "bag screen";
            object2 = ((CartApiRepo)object2).loadEddOOSSimilarCart(string2, arrayList, (String)object3);
            KX1$a kX1$a = new KX1$a((wx1_1)object, null);
            object3 = new at0_1((es0_2)object2, kX1$a);
            object2 = new KX1$b((wx1_1)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
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

