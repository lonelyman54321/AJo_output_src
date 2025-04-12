/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Aq3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ aq3_0 c;

    public Aq3$b(aq3_0 aq3_02) {
        this.c = aq3_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c.getArguments();
        if (object == null) {
            object = null;
        } else {
            String string2 = "type";
            object = object.getSerializable(string2);
        }
        if (object != null) {
            return (zn2)((Object)object);
        }
        object = new NullPointerException("null cannot be cast to non-null type com.chuckerteam.chucker.internal.ui.transaction.PayloadType");
        throw object;
    }
}

