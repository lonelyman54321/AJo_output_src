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

public final class Wk
implements ComposeAnimation {
    public final gr3 a;
    public final Set b;

    public Wk(gr3 object) {
        this.a = object;
        object = ComposeAnimationType.ANIMATED_VISIBILITY;
        object = ml_1.a("Enter");
        ml_1 ml_12 = ml_1.a("Exit");
        Object[] objectArray = new ml_1[]{object, ml_12};
        this.b = object = p03_0.f(objectArray);
    }
}

