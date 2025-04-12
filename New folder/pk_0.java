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
 * Renamed from pk
 */
public final class pk_0
implements ComposeAnimation {
    public static final boolean e;
    public final to3 a;
    public final Gl b;
    public final Lj c;
    public final Set d;

    static {
        ComposeAnimationType[] composeAnimationTypeArray = ComposeAnimationType.values();
        int n3 = composeAnimationTypeArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            String string3 = composeAnimationTypeArray[i3].name();
            boolean bl3 = Intrinsics.areEqual(string3, string2 = "ANIMATE_X_AS_STATE");
            if (!bl3) continue;
            bl2 = true;
            break;
        }
        e = bl2;
    }

    public pk_0(Lj lj, Gl object, to3 object2) {
        this.a = object2;
        this.b = object;
        this.c = lj;
        object = ComposeAnimationType.ANIMATE_X_AS_STATE;
        object = lj.d();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Any");
        object2 = object.getClass().getEnumConstants();
        if (object2 == null || (object2 = tp_2.O(object2)) == null) {
            object2 = O03.b(object);
        }
        this.d = object2;
        lj.getClass();
    }
}

