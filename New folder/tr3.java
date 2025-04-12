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

public final class tr3
implements ComposeAnimation,
rr3 {
    public final gr3 a;
    public final Set b;

    public tr3(gr3 gr32, Set set) {
        this.a = gr32;
        this.b = set;
        gr32 = ComposeAnimationType.TRANSITION_ANIMATION;
    }

    public final gr3 a() {
        return this.a;
    }
}

