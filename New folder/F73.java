/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.videomodule.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class F73
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ F73(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                ((s)this.d).t();
                return Unit.a;
            }
            case 0: 
        }
        ((D73)this.d).dismiss();
        return Boolean.TRUE;
    }
}

