/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CcApiRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from UZ1
 */
public final class uz1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public uz1_2(qz1_2 qz1_22, String string2, String string3, f80_0 f80_02) {
        this.b = qz1_22;
        this.c = string2;
        this.d = "0";
        this.e = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.b;
        String string2 = this.c;
        String string3 = this.e;
        object = new uz1_2(qz1_22, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (uz1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((uz1_2)object).invokeSuspend(object2);
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
            Object object2 = (CcApiRepo)((qz1_2)object).r0.getValue();
            Object object3 = this.e;
            Object object4 = this.c;
            String string2 = this.d;
            object2 = ((CcApiRepo)object2).getCCItemDetailsQA((String)object4, string2, (String)object3);
            object3 = new UZ1$a((qz1_2)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new UZ1$b((qz1_2)object);
            this.a = n4;
            object = ((at0_1)object4).collect((fs0_2)object2, this);
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

