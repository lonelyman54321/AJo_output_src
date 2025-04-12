/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.tooling.ComposeAnimation
 *  androidx.compose.animation.tooling.ComposeAnimationType
 */
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class Xg1
implements ComposeAnimation {
    public static final boolean c;
    public final vg1_0 a;
    public final Set b;

    static {
        ComposeAnimationType[] composeAnimationTypeArray = ComposeAnimationType.values();
        int n3 = composeAnimationTypeArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            String string3 = composeAnimationTypeArray[i3].name();
            boolean bl3 = Intrinsics.areEqual(string3, string2 = "INFINITE_TRANSITION");
            if (!bl3) continue;
            bl2 = true;
            break;
        }
        c = bl2;
    }

    public Xg1(vg1_0 vg1_02) {
        this.a = vg1_02;
        Object object = ComposeAnimationType.INFINITE_TRANSITION;
        object = O03.b(0);
        this.b = object;
        vg1_02.getClass();
    }
}

