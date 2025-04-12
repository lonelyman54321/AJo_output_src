/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sV2
 */
public final class sv2_0
implements F62 {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ sv2_0(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        vv2_2 vv2_22 = this.a;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Intrinsics.checkNotNullParameter(object, "productsListDataCallback");
        cp$a cp$a = cp_1.Companion;
        boolean bl2 = nn_2.b(cp$a, (DataCallback)object);
        if (bl2) {
            bl2 = true;
            vv2_22.cb((DataCallback)object, bl2);
        }
    }
}

