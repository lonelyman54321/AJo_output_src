/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputConnectionWrapper
 *  android.widget.TextView
 */
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

public final class Qy0
extends InputConnectionWrapper {
    public final TextView a;
    public final Qy0$a b;

    public Qy0(TextView object, InputConnection inputConnection, EditorInfo editorInfo) {
        Qy0$a qy0$a;
        super(inputConnection, false);
        this.a = object;
        this.b = qy0$a;
        boolean bl2 = EmojiCompat.c();
        if (bl2) {
            object = EmojiCompat.a();
            ((EmojiCompat)object).i(editorInfo);
        }
    }

    public final boolean deleteSurroundingText(int n3, int n4) {
        Editable editable = this.a.getEditableText();
        this.b.getClass();
        boolean bl2 = false;
        boolean bl3 = Qy0$a.a((InputConnection)this, editable, n3, n4, false);
        if (bl3 || (n3 = (int)(super.deleteSurroundingText(n3, n4) ? 1 : 0)) != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean deleteSurroundingTextInCodePoints(int n3, int n4) {
        Editable editable = this.a.getEditableText();
        Qy0$a qy0$a = this.b;
        qy0$a.getClass();
        boolean bl2 = true;
        boolean bl3 = Qy0$a.a((InputConnection)this, editable, n3, n4, bl2);
        if (!bl3 && (n3 = (int)(super.deleteSurroundingTextInCodePoints(n3, n4) ? 1 : 0)) == 0) {
            bl2 = false;
            qy0$a = null;
        }
        return bl2;
    }
}

