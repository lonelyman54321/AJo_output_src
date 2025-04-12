/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.Menu
 *  android.view.MenuItem
 */
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Bj3 {
    public final Function0 a;
    public aG2 b;
    public Function0 c;
    public Function0 d;
    public Function0 e;
    public Function0 f;

    public Bj3(mj$a_0 mj$a_0) {
        aG2 aG22 = aG2.e;
        this.a = mj$a_0;
        this.b = aG22;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public static void a(Menu menu2, cO1 cO12) {
        int n3 = cO12.getId();
        int n4 = cO12.getOrder();
        int n7 = cO12.getTitleResource();
        menu2.add(0, n3, n4, n7).setShowAsAction(1);
    }

    public static void b(Menu menu2, cO1 cO12, Function0 function0) {
        int n3;
        int n4;
        MenuItem menuItem;
        if (function0 != null && (menuItem = menu2.findItem(n4 = cO12.getId())) == null) {
            Bj3.a(menu2, cO12);
        } else if (function0 == null && (function0 = menu2.findItem(n3 = cO12.getId())) != null) {
            int n7 = cO12.getId();
            menu2.removeItem(n7);
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem object) {
        block13: {
            block10: {
                int n3;
                cO1 cO12;
                int n4;
                block12: {
                    block11: {
                        block9: {
                            Intrinsics.checkNotNull(object);
                            n4 = object.getItemId();
                            cO12 = cO1.Copy;
                            n3 = cO12.getId();
                            if (n4 != n3) break block9;
                            object = this.c;
                            if (object != null) {
                                object.invoke();
                            }
                            break block10;
                        }
                        cO12 = cO1.Paste;
                        n3 = cO12.getId();
                        if (n4 != n3) break block11;
                        object = this.d;
                        if (object != null) {
                            object.invoke();
                        }
                        break block10;
                    }
                    cO12 = cO1.Cut;
                    n3 = cO12.getId();
                    if (n4 != n3) break block12;
                    object = this.e;
                    if (object != null) {
                        object.invoke();
                    }
                    break block10;
                }
                cO12 = cO1.SelectAll;
                n3 = cO12.getId();
                if (n4 != n3) break block13;
                object = this.f;
                if (object != null) {
                    object.invoke();
                }
            }
            if (actionMode != null) {
                actionMode.finish();
            }
            return true;
        }
        return false;
    }

    public final void d(ActionMode object, Menu object2) {
        if (object2 != null) {
            if (object != null) {
                object = this.c;
                if (object != null) {
                    object = cO1.Copy;
                    Bj3.a(object2, (cO1)((Object)object));
                }
                if ((object = this.d) != null) {
                    object = cO1.Paste;
                    Bj3.a(object2, (cO1)((Object)object));
                }
                if ((object = this.e) != null) {
                    object = cO1.Cut;
                    Bj3.a(object2, (cO1)((Object)object));
                }
                if ((object = this.f) != null) {
                    object = cO1.SelectAll;
                    Bj3.a(object2, (cO1)((Object)object));
                }
                return;
            }
            object2 = "onCreateActionMode requires a non-null mode".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "onCreateActionMode requires a non-null menu".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final boolean e(ActionMode object, Menu menu2) {
        if (object != null && menu2 != null) {
            object = cO1.Copy;
            Function0 function0 = this.c;
            Bj3.b(menu2, (cO1)((Object)object), function0);
            object = cO1.Paste;
            function0 = this.d;
            Bj3.b(menu2, (cO1)((Object)object), function0);
            object = cO1.Cut;
            function0 = this.e;
            Bj3.b(menu2, (cO1)((Object)object), function0);
            object = cO1.SelectAll;
            function0 = this.f;
            Bj3.b(menu2, (cO1)((Object)object), function0);
            return true;
        }
        return false;
    }
}

