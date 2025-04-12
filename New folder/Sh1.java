/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.inputmethod.CursorAnchorInfo
 *  android.view.inputmethod.ExtractedText
 *  android.view.inputmethod.InputMethodManager
 */
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

public final class Sh1
implements Qh1 {
    public final View a;
    public final rq1_2 b;

    public Sh1(View view) {
        this.a = view;
        Object object = et1_2.NONE;
        sh1$a_0 sh1$a_0 = new sh1$a_0(this);
        object = yr1_2.a(object, sh1$a_0);
        this.b = object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            super(view);
            ((c93$b)object).b = view;
        }
    }

    public final void a(int n3, ExtractedText extractedText) {
        InputMethodManager inputMethodManager = this.f();
        View view = this.a;
        inputMethodManager.updateExtractedText(view, n3, extractedText);
    }

    public final void b(int n3, int n4, int n7, int n8) {
        InputMethodManager inputMethodManager = this.f();
        View view = this.a;
        inputMethodManager.updateSelection(view, n3, n4, n7, n8);
    }

    public final void c() {
        InputMethodManager inputMethodManager = this.f();
        View view = this.a;
        inputMethodManager.restartInput(view);
    }

    public final void d(CursorAnchorInfo cursorAnchorInfo) {
        InputMethodManager inputMethodManager = this.f();
        View view = this.a;
        inputMethodManager.updateCursorAnchorInfo(view, cursorAnchorInfo);
    }

    public final void e() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            lm lm4 = lm.a;
            InputMethodManager inputMethodManager = this.f();
            View view = this.a;
            lm4.a(inputMethodManager, view);
        }
    }

    public final InputMethodManager f() {
        return (InputMethodManager)this.b.getValue();
    }

    public final boolean isActive() {
        InputMethodManager inputMethodManager = this.f();
        View view = this.a;
        return inputMethodManager.isActive(view);
    }
}

