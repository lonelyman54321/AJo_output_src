/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Yl3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Yl3 c;
    public final /* synthetic */ Sl$b d;
    public final /* synthetic */ Xw3 e;

    public Yl3$b(Yl3 yl3, Sl$b sl$b, Xw3 xw3) {
        this.c = yl3;
        this.d = sl$b;
        this.e = xw3;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        Object object = (Gu1)this.d.a;
        Xw3 xw3 = this.e;
        Yl3 yl3 = this.c;
        yl3.getClass();
        boolean bl2 = object instanceof Gu1$b;
        if (!bl2) {
            boolean bl3 = object instanceof Gu1$a;
            if (!bl3) return Unit.a;
            object.getClass();
            return Unit.a;
        }
        object.getClass();
        try {
            object = (Gu1$b)object;
            object = ((Gu1$b)object).a;
            xw3.a((String)object);
            return Unit.a;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Unit.a;
        }
    }
}

