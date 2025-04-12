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

/*
 * Renamed from qk
 */
public final class qk_0
implements ComposeAnimation,
rr3 {
    public static final boolean c;
    public final gr3 a;
    public final Set b;

    static {
        ComposeAnimationType[] composeAnimationTypeArray = ComposeAnimationType.values();
        int n3 = composeAnimationTypeArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            String string3 = composeAnimationTypeArray[i3].name();
            boolean bl3 = Intrinsics.areEqual(string3, string2 = "ANIMATED_CONTENT");
            if (!bl3) continue;
            bl2 = true;
            break;
        }
        c = bl2;
    }

    public qk_0(gr3 gr32, Set set) {
        this.a = gr32;
        this.b = set;
        gr32 = ComposeAnimationType.ANIMATED_CONTENT;
    }

    public final gr3 a() {
        return this.a;
    }
}

