/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.plp.ProgressRequestBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from iv2
 */
public final class iv2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ bv2_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ pj2_2 d;

    public iv2_1(bv2_0 bv2_02, String string2, ProgressRequestBody progressRequestBody, f80_0 f80_02) {
        this.b = bv2_02;
        this.c = string2;
        this.d = progressRequestBody;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bv2_0 bv2_02 = this.b;
        ProgressRequestBody progressRequestBody = (ProgressRequestBody)this.d;
        String string2 = this.c;
        object = new iv2_1(bv2_02, string2, progressRequestBody, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (iv2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((iv2_1)object).invokeSuspend(object2);
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
            object = this.b.b;
            this.a = n4;
            String string2 = this.c;
            pj2_2 pj2_22 = this.d;
            object = ((NewPlpRepo)object).uploadImage(string2, pj2_22, this);
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

