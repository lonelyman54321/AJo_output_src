/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.insets.ImmutableWindowInsets;
import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jG3
 */
public final class jg3_2 {
    public static WindowInsets a(WindowInsets windowInsets, WindowInsets$Type windowInsets$Type, WindowInsets$Type windowInsets$Type2, WindowInsets$Type windowInsets$Type3, WindowInsets$Type windowInsets$Type4, WindowInsets$Type windowInsets$Type5) {
        Intrinsics.checkNotNullParameter(windowInsets$Type, "navigationBars");
        Intrinsics.checkNotNullParameter(windowInsets$Type2, "statusBars");
        Intrinsics.checkNotNullParameter(windowInsets$Type3, "systemGestures");
        Intrinsics.checkNotNullParameter(windowInsets$Type4, "ime");
        Intrinsics.checkNotNullParameter(windowInsets$Type5, "displayCutout");
        windowInsets = new ImmutableWindowInsets(windowInsets$Type3, windowInsets$Type, windowInsets$Type2, windowInsets$Type4, windowInsets$Type5);
        return windowInsets;
    }

    public static /* synthetic */ WindowInsets b(WindowInsets object, WindowInsets$Type windowInsets$Type, WindowInsets$Type object2, WindowInsets$Type windowInsets$Type2, WindowInsets$Type object3, WindowInsets$Type windowInsets$Type3, int n3, Object object4) {
        if (object4 == null) {
            int n4 = n3 & 1;
            if (n4 != 0) {
                windowInsets$Type = object.getNavigationBars();
            }
            if ((n4 = n3 & 2) != 0) {
                object2 = object.getStatusBars();
            }
            object4 = object2;
            int n7 = n3 & 4;
            if (n7 != 0) {
                windowInsets$Type2 = object.getSystemGestures();
            }
            WindowInsets$Type windowInsets$Type4 = windowInsets$Type2;
            n7 = n3 & 8;
            if (n7 != 0) {
                object3 = object.getIme();
            }
            WindowInsets$Type windowInsets$Type5 = object3;
            n7 = n3 & 0x10;
            if (n7 != 0) {
                windowInsets$Type3 = object.getDisplayCutout();
            }
            WindowInsets$Type windowInsets$Type6 = windowInsets$Type3;
            object2 = object;
            windowInsets$Type2 = windowInsets$Type;
            object3 = object4;
            windowInsets$Type3 = windowInsets$Type4;
            object4 = windowInsets$Type6;
            return object.copy(windowInsets$Type, (WindowInsets$Type)object3, windowInsets$Type4, windowInsets$Type5, windowInsets$Type6);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        throw object;
    }
}

