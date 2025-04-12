/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.view.View
 *  android.view.WindowInsetsController
 *  android.view.inputmethod.InputMethodManager
 */
import android.os.Build;
import android.os.IBinder;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c93$b
extends c93$a {
    public View b;
    public WindowInsetsController c;

    public final void a() {
        Object object = this.c;
        View view = this.b;
        if (object == null) {
            object = view != null ? d93.a(view) : null;
        }
        if (object != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            h93 h932 = new h93(atomicBoolean);
            f93.a(object, h932);
            boolean bl2 = atomicBoolean.get();
            if (!bl2 && view != null) {
                atomicBoolean = view.getContext();
                String string2 = "input_method";
                atomicBoolean = (InputMethodManager)atomicBoolean.getSystemService(string2);
                view = view.getWindowToken();
                atomicBoolean.hideSoftInputFromWindow((IBinder)view, 0);
            }
            g93_0.a(object, h932);
            int n3 = e93.a();
            J31.a(object, n3);
        } else {
            super.a();
        }
    }

    public final void b() {
        WindowInsetsController windowInsetsController;
        int n3;
        int n4;
        View view = this.b;
        if (view != null && (n4 = Build.VERSION.SDK_INT) < (n3 = 33)) {
            windowInsetsController = view.getContext();
            String string2 = "input_method";
            windowInsetsController = (InputMethodManager)windowInsetsController.getSystemService(string2);
            windowInsetsController.isActive();
        }
        if ((windowInsetsController = this.c) == null) {
            if (view != null) {
                windowInsetsController = d93.a(view);
            } else {
                n4 = 0;
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            int n7 = e93.a();
            K31.a(windowInsetsController, n7);
        }
        super.b();
    }
}

