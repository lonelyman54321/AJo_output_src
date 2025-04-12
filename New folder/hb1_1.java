/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.videomodule.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hB1
 */
public final class hb1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hb1_1(Object object, int n3) {
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
        ((Sj3)this.d).onStop();
        return Unit.a;
    }
}

