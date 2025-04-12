/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.entity.SearchEntry;
import kotlin.Unit;

/*
 * Renamed from PU2
 */
public final class pu2_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ SearchEntry b;

    public pu2_0(es0_2 es0_22, SearchEntry searchEntry) {
        this.a = es0_22;
        this.b = searchEntry;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        SearchEntry searchEntry = this.b;
        PU2$a pU2$a = new PU2$a((fs0_2)object, searchEntry);
        if ((object = this.a.collect(pU2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

