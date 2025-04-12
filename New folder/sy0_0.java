/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Spannable
 *  android.text.method.KeyListener
 *  android.text.method.MetaKeyKeyListener
 *  android.view.KeyEvent
 *  android.view.View
 */
import android.text.Editable;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.e;

/*
 * Renamed from Sy0
 */
public final class sy0_0
implements KeyListener {
    public final KeyListener a;
    public final Sy0$a b;

    public sy0_0(KeyListener keyListener) {
        Sy0$a sy0$a;
        this.a = keyListener;
        this.b = sy0$a;
    }

    public final void clearMetaKeyState(View view, Editable editable, int n3) {
        this.a.clearMetaKeyState(view, editable, n3);
    }

    public final int getInputType() {
        return this.a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int n3, KeyEvent keyEvent) {
        boolean bl2;
        Sy0$a sy0$a = this.b;
        sy0$a.getClass();
        int n4 = 67;
        boolean bl3 = false;
        boolean bl4 = true;
        if (n3 != n4) {
            n4 = 112;
            if (n3 != n4) {
                n4 = 0;
                sy0$a = null;
            } else {
                n4 = e.a(editable, keyEvent, bl4) ? 1 : 0;
            }
        } else {
            n4 = e.a(editable, keyEvent, false) ? 1 : 0;
        }
        if (n4 != 0) {
            MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)editable);
            n4 = 1;
        } else {
            n4 = 0;
            sy0$a = null;
        }
        if (n4 != 0 || (bl2 = (sy0$a = this.a).onKeyDown(view, editable, n3, keyEvent))) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int n3, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, n3, keyEvent);
    }
}

