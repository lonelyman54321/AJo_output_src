/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.text.modifiers.b$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class dx$b
extends Lambda
implements Function1 {
    public final /* synthetic */ tr1_0 c;

    public dx$b(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (b$a)object;
        boolean bl2 = ((b$a)object).c;
        object = bl2 ? ((b$a)object).b : ((b$a)object).a;
        this.c.setValue(object);
        return Unit.a;
    }
}

