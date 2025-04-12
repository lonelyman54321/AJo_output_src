/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lq2$a
 */
public final class lq2$a_0 {
    public static lq2_1 a(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        WeakReference<Fragment> weakReference = new WeakReference<Fragment>(fragment);
        lq2_1 lq2_12 = new lq2_1(weakReference);
        return lq2_12;
    }
}

