/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hT1
 */
public final class ht1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ gt1_0 c;

    public ht1_1(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = (Pair)this.c.j.getValue();
        if (object == null || (object = (List)((Pair)object).a) == null) {
            object = new ArrayList();
        }
        return object;
    }
}

