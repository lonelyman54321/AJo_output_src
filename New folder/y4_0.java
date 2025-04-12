/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.AddressRepo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Y4
 */
public final class y4_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ h5_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ HashMap f;
    public final /* synthetic */ HashMap g;

    public y4_0(h5_0 h5_02, String string2, String string3, HashMap hashMap, HashMap hashMap2, f80_0 f80_02) {
        this.b = h5_02;
        this.c = string2;
        this.d = "CreateAddress";
        this.e = string3;
        this.f = hashMap;
        this.g = hashMap2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.e;
        h5_0 h5_02 = this.b;
        HashMap hashMap = this.f;
        HashMap hashMap2 = this.g;
        object = new y4_0(h5_02, string2, string3, hashMap, hashMap2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (y4_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((y4_0)object).invokeSuspend(object2);
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
            HashMap hashMap2 = this.g;
            Object object4 = ((AddressRepo)object2).createAddressNew((String)object3, string2, string3, hashMap, hashMap2);
            object2 = new Y4$a((h5_0)object, null);
            object3 = new at0_1((es0_2)object4, (gx0_2)object2);
            object4 = new Y4$b((h5_0)object);
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

