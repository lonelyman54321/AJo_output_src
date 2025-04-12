/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate;
import kotlin.jvm.internal.Intrinsics;

public final class Px0$b
extends TextInputLayout$AccessibilityDelegate {
    public final TextInputLayout a;
    public final String b;

    public Px0$b(TextInputLayout textInputLayout, String string2) {
        Intrinsics.checkNotNullParameter((Object)textInputLayout, "layout");
        super(textInputLayout);
        this.a = textInputLayout;
        this.b = string2;
    }

    public final void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        Intrinsics.checkNotNullParameter(object, "host");
        String string2 = "info";
        Intrinsics.checkNotNullParameter(c2, string2);
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = this.a.getEditText();
        if (object != null) {
            cp_1.Companion.getClass();
            object = cp$a.B(this.b);
            c2.s((CharSequence)object);
        }
    }
}

