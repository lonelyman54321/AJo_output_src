/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from FX1
 */
public final class fx1_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public fx1_0(wx1_1 wx1_12, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = bl5;
        this.g = bl6;
        this.h = bl7;
        this.i = bl8;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.h;
        boolean bl3 = this.i;
        wx1_1 wx1_12 = this.b;
        boolean bl4 = this.c;
        boolean bl5 = this.d;
        boolean bl6 = this.e;
        boolean bl7 = this.f;
        boolean bl8 = this.g;
        object = new fx1_0(wx1_12, bl4, bl5, bl6, bl7, bl8, bl2, bl3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fx1_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fx1_0)object).invokeSuspend(object2);
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
            boolean bl2 = this.g;
            boolean bl3 = this.h;
            boolean bl4 = this.c;
            boolean bl5 = this.d;
            boolean bl6 = this.e;
            boolean bl7 = this.f;
            Object object3 = ((CartApiRepo)object2).getCartAndCheckStockData("bag screen", bl4, bl5, bl6, bl7, bl2, bl3);
            object2 = new FX1$a((wx1_1)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object3, (gx0_2)object2);
            boolean bl8 = this.i;
            object3 = new FX1$b((wx1_1)object, bl8);
            this.a = n4;
            object = at0_12.collect((fs0_2)object3, this);
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

