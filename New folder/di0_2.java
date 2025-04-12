/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Facet$Companion;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from DI0
 */
public final class di0_2
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (Map.Entry)object;
        object2 = (Map.Entry)object2;
        return Facet$Companion.a((Map.Entry)object, (Map.Entry)object2);
    }
}

