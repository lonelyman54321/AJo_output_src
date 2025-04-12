/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity$b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q40
 */
public final class q40_0
implements o60_0,
vv1$a,
IB0$b {
    public final /* synthetic */ Object a;

    public /* synthetic */ q40_0(Object object) {
        this.a = object;
    }

    public /* synthetic */ q40_0(oe$a oe$a, fj0 fj02) {
        this.a = fj02;
    }

    public void accept(Object object) {
        object = (Throwable)object;
        object = (ConfigEditActivity$b)this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ConfigEditActivity$b)object).a;
        if (object != null) {
            gr0_2.dispose((AtomicReference)object);
        }
    }

    public void invoke(Object object) {
        object = (oe)object;
        fj0 fj02 = (fj0)this.a;
        object.b(fj02);
    }
}

