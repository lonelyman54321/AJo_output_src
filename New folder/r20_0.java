/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from R20
 */
public final class r20_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ComposeViewAdapter c;

    public r20_0(ComposeViewAdapter composeViewAdapter) {
        this.c = composeViewAdapter;
        super(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        boolean bl2;
        object = (M11)object;
        Object object2 = ((M11)object).b;
        String string2 = "remember";
        boolean bl3 = Intrinsics.areEqual(object2, string2);
        ComposeViewAdapter composeViewAdapter = this.c;
        if (bl3 || !(bl3 = ComposeViewAdapter.b(composeViewAdapter, (M11)object))) {
            object = ((M11)object).g;
            bl3 = object instanceof Collection;
            if (bl3) {
                object2 = object;
                object2 = (Collection)object;
                bl3 = object2.isEmpty();
                if (bl3) {
                    bl2 = false;
                    return bl2;
                }
            }
            object = ((Iterable)object).iterator();
            while (bl3 = object.hasNext()) {
                object2 = (M11)object.next();
                String string3 = ((M11)object2).b;
                boolean bl4 = Intrinsics.areEqual(string3, string2);
                if (!bl4 || !(bl3 = ComposeViewAdapter.b(composeViewAdapter, (M11)object2))) continue;
                break;
            }
        }
        bl2 = true;
        return bl2;
    }
}

