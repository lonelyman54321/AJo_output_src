/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.AddressRepo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Z4
 */
public final class z4_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ h5_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ HashMap f;
    public final /* synthetic */ String g;

    public z4_0(h5_0 h5_02, f80_0 f80_02, String string2, String string3, String string4, HashMap hashMap) {
        this.b = h5_02;
        this.c = string2;
        this.d = "DeleteAddress";
        this.e = string3;
        this.f = hashMap;
        this.g = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.e;
        h5_0 h5_02 = this.b;
        HashMap hashMap = this.f;
        String string4 = this.g;
        object = new z4_0(h5_02, f80_02, string2, string3, string4, hashMap);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (z4_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((z4_0)object).invokeSuspend(object2);
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
            Object object2 = ((h5_0)object).a;
            String string2 = this.d;
            String string3 = this.e;
            Object object3 = this.c;
            HashMap hashMap = this.f;
            String string4 = this.g;
            Object object4 = ((AddressRepo)object2).deleteAddressNew((String)object3, string2, string3, hashMap, string4);
            object2 = new Z4$a((h5_0)object, null);
            object3 = new at0_1((es0_2)object4, (gx0_2)object2);
            object4 = new Z4$b((h5_0)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object4, this);
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

