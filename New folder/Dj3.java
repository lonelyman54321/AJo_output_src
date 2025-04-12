/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 */
import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

public final class Dj3 {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] alignmentArray = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int n3 = alignmentArray.length;
        Layout.Alignment alignment2 = alignment;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            Layout.Alignment alignment3 = alignmentArray[i3];
            String string3 = alignment3.name();
            boolean bl2 = Intrinsics.areEqual(string3, string2 = "ALIGN_LEFT");
            if (bl2) {
                alignment = alignment3;
                continue;
            }
            string3 = alignment3.name();
            bl2 = Intrinsics.areEqual(string3, string2 = "ALIGN_RIGHT");
            if (!bl2) continue;
            alignment2 = alignment3;
        }
        a = alignment;
        b = alignment2;
    }
}

