/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.View
 */
import android.os.Build;
import android.view.ActionMode;
import android.view.View;

/*
 * Renamed from mj
 */
public final class mj_0
implements zm3 {
    public final View a;
    public ActionMode b;
    public final Bj3 c;
    public Cm3 d;

    public mj_0(View object) {
        this.a = object;
        mj$a_0 mj$a_0 = new mj$a_0(this);
        super(mj$a_0);
        this.c = object;
        object = Cm3.Hidden;
        this.d = object;
    }

    public final void a(aG2 object, Sk3$c object2, Sk3$e sk3$e, Sk3$d sk3$d, Sk3$f sk3$f) {
        Bj3 bj3 = this.c;
        bj3.b = object;
        bj3.c = object2;
        bj3.e = sk3$d;
        bj3.d = sk3$e;
        bj3.f = sk3$f;
        object = this.b;
        if (object == null) {
            object = Cm3.Shown;
            this.d = object;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 23;
            sk3$e = this.a;
            if (n3 >= n4) {
                object = Bm3.a;
                object2 = new BS0(bj3);
                int n7 = 1;
                object = ((Bm3)object).b((View)sk3$e, (ActionMode.Callback)object2, n7);
            } else {
                object = new sz2(bj3);
                object = sk3$e.startActionMode((ActionMode.Callback)object);
            }
            this.b = object;
        } else {
            object.invalidate();
        }
    }

    public final Cm3 getStatus() {
        return this.d;
    }

    public final void hide() {
        Cm3 cm3;
        this.d = cm3 = Cm3.Hidden;
        cm3 = this.b;
        if (cm3 != null) {
            cm3.finish();
        }
        this.b = null;
    }
}

