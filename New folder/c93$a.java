/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class c93$a
extends c93$c {
    public final View a;

    public c93$a(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager)view.getContext().getSystemService("input_method");
            view = view.getWindowToken();
            inputMethodManager.hideSoftInputFromWindow((IBinder)view, 0);
        }
    }

    public void b() {
        boolean bl2;
        View view;
        Object object = this.a;
        if (object == null) {
            return;
        }
        int n3 = object.isInEditMode();
        if (n3 == 0 && (n3 = object.onCheckIsTextEditor()) == 0) {
            view = object.getRootView().findFocus();
        } else {
            object.requestFocus();
            view = object;
        }
        if (view == null) {
            object = object.getRootView();
            n3 = 0x1020002;
            view = object.findViewById(n3);
        }
        if (view != null && (bl2 = view.hasWindowFocus())) {
            int n4 = 2;
            object = new J41(view, n4);
            view.post((Runnable)object);
        }
    }
}

