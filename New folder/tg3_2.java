/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionMode
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 */
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.d;

/*
 * Renamed from tg3
 */
public final class tg3_2
extends ActionMode {
    public final Context a;
    public final P2 b;

    public tg3_2(Context context, P2 p2) {
        this.a = context;
        this.b = p2;
    }

    public final void finish() {
        this.b.a();
    }

    public final View getCustomView() {
        return this.b.b();
    }

    public final Menu getMenu() {
        d d2 = this.b.c();
        Context context = this.a;
        go1_0 go1_02 = new go1_0(context, d2);
        return go1_02;
    }

    public final MenuInflater getMenuInflater() {
        return this.b.d();
    }

    public final CharSequence getSubtitle() {
        return this.b.e();
    }

    public final Object getTag() {
        return this.b.a;
    }

    public final CharSequence getTitle() {
        return this.b.f();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    public final void invalidate() {
        this.b.g();
    }

    public final boolean isTitleOptional() {
        return this.b.h();
    }

    public final void setCustomView(View view) {
        this.b.i(view);
    }

    public final void setSubtitle(int n3) {
        this.b.j(n3);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.k(charSequence);
    }

    public final void setTag(Object object) {
        this.b.a = object;
    }

    public final void setTitle(int n3) {
        this.b.l(n3);
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    public final void setTitleOptionalHint(boolean bl2) {
        this.b.n(bl2);
    }
}

