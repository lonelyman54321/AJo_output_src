/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.CursorAnchorInfo
 *  android.view.inputmethod.ExtractedText
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/*
 * Renamed from Rh1
 */
public final class rh1_0
implements Ph1 {
    public final View a;
    public final rq1_2 b;
    public final c93 c;

    public rh1_0(View view) {
        this.a = view;
        Object object = et1_2.NONE;
        Rh1$a rh1$a = new Rh1$a(this);
        object = yr1_2.a(object, rh1$a);
        this.b = object;
        super(view);
        this.c = object;
    }

    public final void a(int n3, ExtractedText extractedText) {
        InputMethodManager inputMethodManager = (InputMethodManager)this.b.getValue();
        View view = this.a;
        inputMethodManager.updateExtractedText(view, n3, extractedText);
    }

    public final void b(int n3, int n4, int n7, int n8) {
        Object object;
        Object object2 = object = this.b.getValue();
        object2 = (InputMethodManager)object;
        View view = this.a;
        object2.updateSelection(view, n3, n4, n7, n8);
    }

    public final void c() {
        InputMethodManager inputMethodManager = (InputMethodManager)this.b.getValue();
        View view = this.a;
        inputMethodManager.restartInput(view);
    }

    public final void d(CursorAnchorInfo cursorAnchorInfo) {
        InputMethodManager inputMethodManager = (InputMethodManager)this.b.getValue();
        View view = this.a;
        inputMethodManager.updateCursorAnchorInfo(view, cursorAnchorInfo);
    }

    public final void e() {
        this.c.a.b();
    }

    public final void f() {
        this.c.a.a();
    }

    public final boolean isActive() {
        InputMethodManager inputMethodManager = (InputMethodManager)this.b.getValue();
        View view = this.a;
        return inputMethodManager.isActive(view);
    }
}

