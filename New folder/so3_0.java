/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window$Callback
 */
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.d;

/*
 * Renamed from so3
 */
public final class so3_0
implements View.OnClickListener {
    public final o2_0 a;
    public final /* synthetic */ d b;

    public so3_0(d object) {
        o2_0 o2_02;
        this.b = object;
        Context context = ((d)object).a.getContext();
        object = ((d)object).i;
        this.a = o2_02 = new o2_0(context, (CharSequence)object);
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.b;
        Window.Callback callback2 = object.l;
        if (callback2 != null && (bl2 = object.m)) {
            bl2 = false;
            object = null;
            o2_0 o2_02 = this.a;
            callback2.onMenuItemSelected(0, (MenuItem)o2_02);
        }
    }
}

