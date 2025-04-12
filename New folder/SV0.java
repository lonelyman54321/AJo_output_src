/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public final class SV0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ SV0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void run() {
        Fragment fragment = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                fragment = (ld3_1)fragment;
                Intrinsics.checkNotNullParameter(fragment, "this$0");
                ((ld3_1)fragment).Wa();
                return;
            }
            case 0: 
        }
        Fragment.Na(fragment);
    }
}

