/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class iA0
extends Lambda
implements Function1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    public iA0(Function0 function0, boolean bl2) {
        this.c = bl2;
        this.d = function0;
        super(1);
    }

    public final Object invoke(Object object) {
        Boolean bl2;
        object = (a11_0)object;
        boolean bl3 = this.c;
        if (!bl3 && (bl3 = (bl2 = (Boolean)this.d.invoke()).booleanValue())) {
            bl3 = true;
        } else {
            bl3 = false;
            bl2 = null;
        }
        object.r(bl3);
        return Unit.a;
    }
}

