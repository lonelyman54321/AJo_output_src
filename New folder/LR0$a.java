/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import kotlin.Unit;

public final class LR0$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public LR0$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (kk2_1)object;
        boolean bl2 = object instanceof KK2$c;
        dr0_0 dr0_02 = this.a;
        if (bl2) {
            object = (BrandPageModel)((KK2$c)object).a;
            if (object != null) {
                object2 = dr0_02.I;
                ff2$c_0 ff2$c_0 = new ff2$c_0((BrandPageModel)object);
                ((h83_0)object2).setValue(ff2$c_0);
            }
            dr0_02.k0 = false;
        } else {
            bl2 = object instanceof KK2$a;
            if (bl2) {
                object2 = dr0_02.I;
                object = ((KK2$a)object).b;
                if (object == null) {
                    object = "";
                }
                ff2$a_0 ff2$a_0 = new ff2$a_0((String)object);
                ((h83_0)object2).setValue(ff2$a_0);
                dr0_02.k0 = false;
            }
        }
        return Unit.a;
    }
}

