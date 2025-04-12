/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Zk$a
 */
public final class zk$a_0
extends Lambda
implements Function0 {
    public final /* synthetic */ gr3 c;

    public zk$a_0(gr3 gr32) {
        this.c = gr32;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Xz0 xz0;
        Object object = this.c;
        Object object2 = ((gr3)object).a.a();
        if (object2 == (xz0 = Xz0.PostExit) && (object = ((gr3)object).d.getValue()) == xz0) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

