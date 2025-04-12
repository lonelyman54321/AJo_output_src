/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.services.data.Product.ImageUploadResponseModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ev2
 */
public final class ev2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ bv2_0 b;
    public final /* synthetic */ String c;

    public ev2_2(bv2_0 bv2_02, String string2, f80_0 f80_02) {
        this.b = bv2_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bv2_0 bv2_02 = this.b;
        String string2 = this.c;
        object = new ev2_2(bv2_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ev2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ev2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        bv2_0 bv2_02 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = bv2_02.b;
            this.a = n4;
            String string2 = this.c;
            object = ((NewPlpRepo)object).getImageUploadUrl(string2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (ImageUploadResponseModel)object;
        bv2_02.p.k(object);
        return Unit.a;
    }
}

