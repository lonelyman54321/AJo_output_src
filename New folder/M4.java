/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.internal.Intrinsics;

public final class M4
implements F62 {
    public final /* synthetic */ s4_0 a;

    public /* synthetic */ M4(s4_0 s4_02) {
        this.a = s4_02;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        s4_0 s4_02 = this.a;
        Intrinsics.checkNotNullParameter(s4_02, "this$0");
        s4_02.Qa((DataCallback)object);
    }
}

