/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.insets.WindowInsets$Type;

/*
 * Renamed from kG3
 */
public final class kg3_2 {
    public static int a(WindowInsets$Type insets) {
        boolean bl2 = insets.getAnimationInProgress();
        insets = bl2 ? insets.getAnimatedInsets() : insets.getLayoutInsets();
        return insets.getBottom();
    }

    public static int b(WindowInsets$Type insets) {
        boolean bl2 = insets.getAnimationInProgress();
        insets = bl2 ? insets.getAnimatedInsets() : insets.getLayoutInsets();
        return insets.getLeft();
    }

    public static int c(WindowInsets$Type insets) {
        boolean bl2 = insets.getAnimationInProgress();
        insets = bl2 ? insets.getAnimatedInsets() : insets.getLayoutInsets();
        return insets.getRight();
    }

    public static int d(WindowInsets$Type insets) {
        boolean bl2 = insets.getAnimationInProgress();
        insets = bl2 ? insets.getAnimatedInsets() : insets.getLayoutInsets();
        return insets.getTop();
    }
}

