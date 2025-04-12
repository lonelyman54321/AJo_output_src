/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.tooling.ComposeAnimation
 *  androidx.compose.animation.tooling.ComposeAnimationType
 */
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import kotlin.jvm.internal.Intrinsics;

public final class pw3
implements ComposeAnimation {
    public static final boolean a;

    static {
        ComposeAnimationType[] composeAnimationTypeArray = ComposeAnimationType.values();
        int n3 = composeAnimationTypeArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            String string3 = composeAnimationTypeArray[i3].name();
            boolean bl3 = Intrinsics.areEqual(string3, string2 = "UNSUPPORTED");
            if (!bl3) continue;
            bl2 = true;
            break;
        }
        a = bl2;
    }
}

