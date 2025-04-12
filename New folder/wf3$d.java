/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class wf3$d
extends Lambda
implements Function2 {
    public final /* synthetic */ wf3 c;

    public wf3$d(wf3 wf32) {
        this.c = wf32;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (xp1_0)object;
        object2 = (wf3)object2;
        object2 = ((xp1_0)object).A;
        Object object3 = this.c;
        if (object2 == null) {
            yf3_1 yf3_12 = ((wf3)object3).a;
            ((xp1_0)object).A = object2 = new jq1_2((xp1_0)object, yf3_12);
        }
        ((wf3)object3).b = object2;
        ((wf3)object3).a().d();
        object = ((wf3)object3).a();
        object2 = ((jq1_2)object).c;
        object3 = ((wf3)object3).a;
        if (object2 != object3) {
            ((jq1_2)object).c = object3;
            object2 = null;
            ((jq1_2)object).e(false);
            int n3 = 7;
            object = ((jq1_2)object).a;
            xp1_0.Z((xp1_0)object, false, n3);
        }
        return Unit.a;
    }
}

