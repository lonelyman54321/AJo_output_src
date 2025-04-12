/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.os.Bundle
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.Window$Callback
 */
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.g;

public class on
extends i10_0
implements Rm {
    private g mDelegate;
    private final zn1$a_0 mKeyDispatcher;

    public on(Context context) {
        this(context, 0);
    }

    public on(Context context, int n3) {
        int n4 = on.getThemeResId(context, n3);
        super(context, n4);
        Object object = new nn(this);
        this.mKeyDispatcher = object;
        object = this.getDelegate();
        int n7 = on.getThemeResId(context, n3);
        ((g)object).y(n7);
        ((g)object).m();
    }

    public on(Context object, boolean bl2, DialogInterface.OnCancelListener onCancelListener) {
        super((Context)object);
        super(this);
        this.mKeyDispatcher = object;
        this.setCancelable(bl2);
        this.setOnCancelListener(onCancelListener);
    }

    private static int getThemeResId(Context context, int n3) {
        if (n3 == 0) {
            TypedValue typedValue = new TypedValue();
            context = context.getTheme();
            int n4 = R$attr.dialogTheme;
            boolean bl2 = true;
            context.resolveAttribute(n4, typedValue, bl2);
            n3 = typedValue.resourceId;
        }
        return n3;
    }

    private void initViewTreeOwners() {
        VD3.b(this.getWindow().getDecorView(), this);
        ZD3.b(this.getWindow().getDecorView(), this);
        YD3.a(this.getWindow().getDecorView(), this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.getDelegate().a(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        this.getDelegate().n();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        return zn1_0.b(this.mKeyDispatcher, view, (Window.Callback)this, keyEvent);
    }

    public View findViewById(int n3) {
        return this.getDelegate().c(n3);
    }

    public g getDelegate() {
        Object object = this.mDelegate;
        if (object == null) {
            object = g.a;
            Context context = this.getContext();
            Window window = this.getWindow();
            this.mDelegate = object = new AppCompatDelegateImpl(context, window, this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return this.getDelegate().h();
    }

    public void invalidateOptionsMenu() {
        this.getDelegate().j();
    }

    public void onCreate(Bundle bundle) {
        this.getDelegate().i();
        super.onCreate(bundle);
        this.getDelegate().m();
    }

    public void onStop() {
        super.onStop();
        this.getDelegate().r();
    }

    public void onSupportActionModeFinished(P2 p2) {
    }

    public void onSupportActionModeStarted(P2 p2) {
    }

    public P2 onWindowStartingSupportActionMode(P2$a p2$a) {
        return null;
    }

    public void setContentView(int n3) {
        this.initViewTreeOwners();
        this.getDelegate().u(n3);
    }

    public void setContentView(View view) {
        this.initViewTreeOwners();
        this.getDelegate().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().w(view, layoutParams);
    }

    public void setTitle(int n3) {
        super.setTitle(n3);
        g g3 = this.getDelegate();
        String string2 = this.getContext().getString(n3);
        g3.z(string2);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.getDelegate().z(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int n3) {
        return this.getDelegate().t(n3);
    }
}

