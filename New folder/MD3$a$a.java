/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class MD3$a$a
implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference a;

    public MD3$a$a(MD3$a a2) {
        WeakReference<MD3$a> weakReference;
        this.a = weakReference = new WeakReference<MD3$a>(a2);
    }

    public final boolean onPreDraw() {
        ArrayList arrayList;
        boolean bl2;
        int n3 = 2;
        Log.isLoggable((String)"ViewTarget", (int)n3);
        MD3$a mD3$a = (MD3$a)this.a.get();
        if (mD3$a != null && !(bl2 = (arrayList = mD3$a.b).isEmpty())) {
            View view = mD3$a.a;
            int n4 = view.getPaddingLeft();
            int n7 = view.getPaddingRight() + n4;
            Object object = view.getLayoutParams();
            int n8 = 0;
            Object object2 = null;
            if (object != null) {
                n4 = object.width;
            } else {
                n4 = 0;
                object = null;
            }
            int n10 = view.getWidth();
            n4 = mD3$a.a(n10, n4, n7);
            n7 = view.getPaddingTop();
            n10 = view.getPaddingBottom() + n7;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                n8 = layoutParams.height;
            }
            n7 = view.getHeight();
            n7 = mD3$a.a(n7, n8, n10);
            n8 = -1 << -1;
            if (!(n4 <= 0 && n4 != n8 || n7 <= 0 && n7 != n8)) {
                object2 = new ArrayList(arrayList);
                object2 = ((ArrayList)object2).iterator();
                while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    K63 k63 = (K63)object2.next();
                    k63.b(n4, n7);
                }
                n4 = (view = view.getViewTreeObserver()).isAlive() ? 1 : 0;
                if (n4 != 0) {
                    object = mD3$a.c;
                    view.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
                }
                bl2 = false;
                view = null;
                mD3$a.c = null;
                arrayList.clear();
            }
        }
        return true;
    }
}

