/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class aS2$a
extends Lambda
implements Function0 {
    public final /* synthetic */ as2_1 c;

    public aS2$a(as2_1 as2_12) {
        this.c = as2_12;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object object2 = ((as2_1)object).a;
        Object object3 = ((as2_1)object).d;
        if (object3 != null) {
            return object2.a((ES2)object, object3);
        }
        object2 = "Value should be initialized".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

