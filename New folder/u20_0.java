/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from U20
 */
public final class u20_0
extends Lambda
implements Function0 {
    public final /* synthetic */ ComposeViewAdapter c;

    public u20_0(ComposeViewAdapter composeViewAdapter) {
        this.c = composeViewAdapter;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        boolean bl2;
        Object object = this.c;
        boolean bl3 = false;
        Object var3_3 = null;
        object = object.getChildAt(0);
        Object object2 = "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView";
        Intrinsics.checkNotNull(object, (String)object2);
        object = ((ComposeView)((Object)object)).getChildAt(0);
        boolean bl4 = object instanceof fd3_0;
        object = bl4 ? (fd3_0)object : null;
        if (object != null) {
            object.r();
        }
        object = A83.c;
        // MONITORENTER : object
        object2 = A83.j;
        object2 = ((AtomicReference)object2).get();
        object2 = (f01_0)object2;
        object2 = ((RR1)object2).h;
        if (object2 != null && (bl4 = ((ft2_0)object2).c()) == (bl2 = true)) {
            bl3 = true;
        }
        if (!bl3) return Unit.a;
        A83.a();
        return Unit.a;
    }
}

