/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPDPRepo;
import com.ril.ajio.services.query.QueryProductDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from d12
 */
public final class d12_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ e12_0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;

    public d12_0(String string2, String[] stringArray, e12_0 e12_02, boolean bl2, String string3, f80_0 f80_02) {
        this.b = string2;
        this.c = stringArray;
        this.d = e12_02;
        this.e = bl2;
        this.f = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.e;
        String string2 = this.f;
        String string3 = this.b;
        String[] stringArray = this.c;
        e12_0 e12_02 = this.d;
        object = new d12_0(string3, stringArray, e12_02, bl2, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d12_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d12_0)object).invokeSuspend(object2);
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
            object = new QueryProductDetails();
            Object object2 = this.b;
            ((QueryProductDetails)object).setProductCode((String)object2);
            object2 = this.c;
            ((QueryProductDetails)object).setOptions((String[])object2);
            object2 = this.d;
            Object object3 = ((e12_0)object2).f;
            boolean bl2 = ((e12_0)object2).s().isUserOnline();
            String string2 = this.f;
            boolean bl3 = this.e;
            object = ((NewPDPRepo)object3).getProductDetails((QueryProductDetails)object, bl3, bl2, string2);
            bl2 = false;
            object3 = new d12$a((e12_0)object2, null);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object3);
            object = new d12$b((e12_0)object2);
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
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

