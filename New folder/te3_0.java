/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout
 */
import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from te3
 */
public final class te3_0 {
    public static final void a(StringBuilder stringBuilder, int n3) {
        Intrinsics.checkNotNullParameter(stringBuilder, "builder");
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = "?";
            stringBuilder.append(string2);
            int n4 = n3 + -1;
            if (i3 >= n4) continue;
            string2 = ",";
            stringBuilder.append(string2);
        }
    }

    public static final int b(Layout layout2, int n3, boolean bl2) {
        if (n3 <= 0) {
            return 0;
        }
        CharSequence charSequence = layout2.getText();
        int n4 = charSequence.length();
        if (n3 >= n4) {
            return layout2.getLineCount() + -1;
        }
        n4 = layout2.getLineForOffset(n3);
        int n7 = layout2.getLineStart(n4);
        int n8 = layout2.getLineEnd(n4);
        if (n7 != n3 && n8 != n3) {
            return n4;
        }
        if (n7 == n3) {
            if (bl2) {
                n4 += -1;
            }
        } else if (!bl2) {
            ++n4;
        }
        return n4;
    }
}

