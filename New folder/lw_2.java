/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.entity.ProductExperience;
import kotlin.Unit;

/*
 * Renamed from lW
 */
public final class lw_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ ProductExperience b;

    public lw_2(es0_2 es0_22, ProductExperience productExperience) {
        this.a = es0_22;
        this.b = productExperience;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        ProductExperience productExperience = this.b;
        lW$a lW$a = new lW$a((fs0_2)object, productExperience);
        if ((object = this.a.collect(lW$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

