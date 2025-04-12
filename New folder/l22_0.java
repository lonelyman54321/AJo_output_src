/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from l22
 */
public final class l22_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ NewProductDetailsFragment b;

    public l22_0(NewProductDetailsFragment newProductDetailsFragment, f80_0 f80_02) {
        this.b = newProductDetailsFragment;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        NewProductDetailsFragment newProductDetailsFragment = this.b;
        object = new l22_0(newProductDetailsFragment, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (l22_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((l22_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.a;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 != bl3) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = bl3;
            long l2 = 1000L;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = h40_0.a;
        object = h40_0.t();
        String string2 = "bannerName";
        boolean bl4 = object.has(string2);
        object = bl4 ? object.optString(string2) : null;
        this.b.A4((String)object, bl3);
        return Unit.a;
    }
}

