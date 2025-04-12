/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Facet$Companion;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from EI0
 */
public final class ei0_2
implements Comparator {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ ei0_2(di0_2 di0_22) {
        this.a = di0_22;
    }

    public final int compare(Object object, Object object2) {
        return Facet$Companion.b((di0_2)this.a, object, object2);
    }
}

