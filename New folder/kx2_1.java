/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.instreamads.wrapper.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from kX2
 */
public final class kx2_1
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kx2_1(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                return ((i)this.d).c.P();
            }
            case 0: 
        }
        gx2_0 gx2_02 = (gx2_0)this.d;
        gr3 gr32 = gx2_02.e;
        long l2 = gr32 != null ? gr32.g() : 0L;
        gx2_02.f = l2;
        return Unit.a;
    }
}

