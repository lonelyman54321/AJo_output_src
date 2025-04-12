/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from mq1
 */
public final class mq1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ jq1_2 c;

    public mq1_1(jq1_2 jq1_22) {
        this.c = jq1_22;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        int n3;
        object = (Map.Entry)object;
        Object k2 = object.getKey();
        object = (wf3$a_0)object.getValue();
        jq1_2 jq1_22 = this.c;
        WR1 wR1 = jq1_22.m;
        int n4 = wR1.j(k2);
        if (n4 >= 0 && n4 < (n3 = jq1_22.e)) {
            bl2 = false;
            object = null;
        } else {
            object.dispose();
            bl2 = true;
        }
        return bl2;
    }
}

