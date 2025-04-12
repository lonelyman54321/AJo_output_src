/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.insets.ImmutableInsets;
import com.google.accompanist.insets.Insets;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from di1
 */
public final class di1_0 {
    public static Insets a(Insets insets, int n3, int n4, int n7, int n8) {
        insets = new ImmutableInsets(n3, n4, n7, n8);
        return insets;
    }

    public static Insets b(Insets insets, Insets insets2) {
        Intrinsics.checkNotNullParameter(insets2, "other");
        int n3 = insets.getLeft();
        int n4 = insets2.getLeft();
        n3 -= n4;
        n4 = insets.getTop();
        int n7 = insets2.getTop();
        n4 -= n7;
        n7 = insets.getRight();
        int n8 = insets2.getRight();
        n7 -= n8;
        n8 = insets.getBottom();
        int n10 = insets2.getBottom();
        return insets.copy(n3, n4, n7, n8 -= n10);
    }

    public static Insets c(Insets insets, Insets insets2) {
        Intrinsics.checkNotNullParameter(insets2, "other");
        int n3 = insets.getLeft();
        int n4 = insets2.getLeft() + n3;
        n3 = insets.getTop();
        int n7 = insets2.getTop() + n3;
        n3 = insets.getRight();
        int n8 = insets2.getRight() + n3;
        n3 = insets.getBottom();
        int n10 = insets2.getBottom() + n3;
        return insets.copy(n4, n7, n8, n10);
    }

    public static /* synthetic */ Insets d(Insets object, int n3, int n4, int n7, int n8, int n10, Object object2) {
        if (object2 == null) {
            int n14 = n10 & 1;
            if (n14 != 0) {
                n3 = object.getLeft();
            }
            if ((n14 = n10 & 2) != 0) {
                n4 = object.getTop();
            }
            if ((n14 = n10 & 4) != 0) {
                n7 = object.getRight();
            }
            if ((n10 &= 8) != 0) {
                n8 = object.getBottom();
            }
            return object.copy(n3, n4, n7, n8);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        throw object;
    }
}

