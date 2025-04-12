/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.KeyEvent$DispatcherState
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView$i;
import androidx.appcompat.widget.SearchView$m;
import java.lang.reflect.Method;

public class SearchView$SearchAutoComplete
extends AppCompatAutoCompleteTextView {
    public int a;
    public SearchView b;
    public boolean c;
    public final Runnable d;

    public SearchView$SearchAutoComplete(Context context) {
        this(context, null);
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.autoCompleteTextViewStyle;
        this(context, attributeSet, n3);
    }

    public SearchView$SearchAutoComplete(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        int n4;
        super(this);
        this.d = object;
        this.a = n4 = this.getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        int n3;
        Configuration configuration = this.getResources().getConfiguration();
        int n4 = configuration.screenWidthDp;
        int n7 = configuration.screenHeightDp;
        int n8 = 960;
        if (n4 >= n8 && n7 >= (n8 = 720) && (n3 = configuration.orientation) == (n8 = 2)) {
            return 256;
        }
        n3 = 600;
        if (n4 < n3 && (n4 < (n3 = 640) || n7 < (n3 = 480))) {
            return 160;
        }
        return 192;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        int n3 = 1;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 29;
        if (n4 >= n7) {
            SearchView$i.b(this, n3);
            n3 = (int)(this.enoughToFilter() ? 1 : 0);
            if (n3 == 0) return;
            this.showDropDown();
            return;
        }
        Object object = SearchView.Q;
        object.getClass();
        SearchView$m.a();
        object = ((SearchView$m)object).c;
        if (object == null) return;
        try {
            Object[] objectArray = new Object[n3];
            Boolean bl2 = Boolean.TRUE;
            objectArray[0] = bl2;
            ((Method)object).invoke((Object)this, objectArray);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final boolean enoughToFilter() {
        int n3 = this.a;
        n3 = n3 > 0 && !(n3 = (int)(super.enoughToFilter() ? 1 : 0)) ? 0 : 1;
        return n3 != 0;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo = super.onCreateInputConnection(editorInfo);
        boolean bl2 = this.c;
        if (bl2) {
            Runnable runnable2 = this.d;
            this.removeCallbacks(runnable2);
            this.post(runnable2);
        }
        return editorInfo;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        float f5 = this.getSearchViewTextMinWidthDp();
        int n3 = (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)displayMetrics);
        this.setMinWidth(n3);
    }

    public final void onFocusChanged(boolean bl2, int n3, Rect rect) {
        super.onFocusChanged(bl2, n3, rect);
        SearchView searchView = this.b;
        n3 = (int)(searchView.z ? 1 : 0);
        searchView.q(n3 != 0);
        Object object = searchView.N;
        searchView.post((Runnable)object);
        object = searchView.a;
        n3 = (int)(object.hasFocus() ? 1 : 0);
        if (n3 != 0) {
            searchView.f();
        }
    }

    public final boolean onKeyPreIme(int n3, KeyEvent keyEvent) {
        int n4 = 4;
        if (n3 == n4) {
            n4 = keyEvent.getAction();
            int n7 = 1;
            if (!n4 && !(n4 = keyEvent.getRepeatCount())) {
                KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                if (dispatcherState != null) {
                    dispatcherState.startTracking(keyEvent, (Object)this);
                }
                return n7;
            }
            n4 = keyEvent.getAction();
            if (n4 == n7) {
                KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                if (dispatcherState != null) {
                    dispatcherState.handleUpEvent(keyEvent);
                }
                if ((n4 = keyEvent.isTracking()) && !(n4 = keyEvent.isCanceled())) {
                    this.b.clearFocus();
                    this.setImeVisibility(false);
                    return n7;
                }
            }
        }
        return super.onKeyPreIme(n3, keyEvent);
    }

    public final void onWindowFocusChanged(boolean n3) {
        SearchView searchView;
        super.onWindowFocusChanged(n3 != 0);
        if (n3 != 0 && (n3 = (searchView = this.b).hasFocus()) != 0 && (n3 = this.getVisibility()) == 0) {
            this.c = true;
            searchView = this.getContext();
            searchView = searchView.getResources().getConfiguration();
            n3 = ((Configuration)searchView).orientation;
            int n4 = 2;
            if (n3 == n4) {
                this.a();
            }
        }
    }

    public final void performCompletion() {
    }

    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean bl2) {
        InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
        Runnable runnable2 = this.d;
        if (!bl2) {
            this.c = false;
            this.removeCallbacks(runnable2);
            IBinder iBinder = this.getWindowToken();
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            return;
        }
        bl2 = inputMethodManager.isActive((View)this);
        if (bl2) {
            this.c = false;
            this.removeCallbacks(runnable2);
            inputMethodManager.showSoftInput((View)this, 0);
            return;
        }
        this.c = true;
    }

    public void setSearchView(SearchView searchView) {
        this.b = searchView;
    }

    public void setThreshold(int n3) {
        super.setThreshold(n3);
        this.a = n3;
    }
}

