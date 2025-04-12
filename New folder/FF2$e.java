/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class FF2$e
extends Lambda
implements Function0 {
    public final /* synthetic */ FF2 c;

    public FF2$e(FF2 fF2) {
        this.c = fF2;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        Object object = this.c;
        Object object2 = ((FF2)object).b;
        // MONITORENTER : object2
        Object object3 = ((FF2)object).A();
        Object object4 = ((FF2)object).r;
        object4 = ((kb3_2)object4).getValue();
        object4 = (FF2$d)((Object)object4);
        FF2$d fF2$d = FF2$d.ShuttingDown;
        int n3 = ((Enum)object4).compareTo(fF2$d);
        if (n3 > 0) {
            // MONITOREXIT : object2
            if (object3 == null) return Unit.a;
            object = tl2_2.b;
            object = Unit.a;
            object3.resumeWith(object);
            return Unit.a;
        }
        object3 = "Recomposer shutdown; frame clock awaiter will never resume";
        object = ((FF2)object).d;
        object = xc0_2.a((String)object3, (Throwable)object);
        throw object;
    }
}

