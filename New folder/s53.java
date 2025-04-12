/*
 * Decompiled with CFR 0.152.
 */
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.b$q;
import com.google.accompanist.insets.SimpleImeAnimationController;
import kotlin.jvm.functions.Function1;

public final class s53
implements b$q {
    public final /* synthetic */ SimpleImeAnimationController a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ s53(SimpleImeAnimationController simpleImeAnimationController, Function1 function1) {
        this.a = simpleImeAnimationController;
        this.b = function1;
    }

    public final void a(b b2, boolean bl2, float f5, float f6) {
        SimpleImeAnimationController simpleImeAnimationController = this.a;
        Function1 function1 = this.b;
        SimpleImeAnimationController.a(simpleImeAnimationController, function1, b2, bl2, f5, f6);
    }
}

