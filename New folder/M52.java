/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.KeyEvent
 *  android.view.inputmethod.CompletionInfo
 *  android.view.inputmethod.CorrectionInfo
 *  android.view.inputmethod.ExtractedText
 *  android.view.inputmethod.ExtractedTextRequest
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputContentInfo
 */
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.functions.Function1;

public class M52
implements L52 {
    public final Function1 a;
    public InputConnection b;

    public M52(InputConnection inputConnection, Th1 th1) {
        this.a = th1;
        this.b = inputConnection;
    }

    public final void a() {
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            this.b(inputConnection);
            inputConnection = null;
            this.b = null;
        }
    }

    public void b(InputConnection inputConnection) {
    }

    public final boolean beginBatchEdit() {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.beginBatchEdit();
        } else {
            bl2 = false;
            inputConnection = null;
        }
        return bl2;
    }

    public final boolean clearMetaKeyStates(int n3) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(inputConnection.clearMetaKeyStates(n3) ? 1 : 0) : 0;
        return n3 != 0;
    }

    public final void closeConnection() {
        Object object = this.b;
        if (object != null) {
            this.a();
            object = this.a;
            object.invoke(this);
        }
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.commitCompletion(completionInfo);
        } else {
            bl2 = false;
            completionInfo = null;
        }
        return bl2;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int n3, Bundle bundle) {
        return false;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.commitCorrection(correctionInfo);
        } else {
            bl2 = false;
            correctionInfo = null;
        }
        return bl2;
    }

    public final boolean commitText(CharSequence charSequence, int n3) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.commitText(charSequence, n3);
        } else {
            bl2 = false;
            charSequence = null;
        }
        return bl2;
    }

    public final boolean deleteSurroundingText(int n3, int n4) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(inputConnection.deleteSurroundingText(n3, n4) ? 1 : 0) : 0;
        return n3 != 0;
    }

    public boolean deleteSurroundingTextInCodePoints(int n3, int n4) {
        return false;
    }

    public final boolean endBatchEdit() {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.endBatchEdit();
        } else {
            bl2 = false;
            inputConnection = null;
        }
        return bl2;
    }

    public final boolean finishComposingText() {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.finishComposingText();
        } else {
            bl2 = false;
            inputConnection = null;
        }
        return bl2;
    }

    public final int getCursorCapsMode(int n3) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? inputConnection.getCursorCapsMode(n3) : 0;
        return n3;
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest object, int n3) {
        InputConnection inputConnection = this.b;
        object = inputConnection != null ? inputConnection.getExtractedText(object, n3) : null;
        return object;
    }

    public Handler getHandler() {
        return null;
    }

    public final CharSequence getSelectedText(int n3) {
        CharSequence charSequence;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            charSequence = inputConnection.getSelectedText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        return charSequence;
    }

    public final CharSequence getTextAfterCursor(int n3, int n4) {
        CharSequence charSequence;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            charSequence = inputConnection.getTextAfterCursor(n3, n4);
        } else {
            n3 = 0;
            charSequence = null;
        }
        return charSequence;
    }

    public final CharSequence getTextBeforeCursor(int n3, int n4) {
        CharSequence charSequence;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            charSequence = inputConnection.getTextBeforeCursor(n3, n4);
        } else {
            n3 = 0;
            charSequence = null;
        }
        return charSequence;
    }

    public final boolean performContextMenuAction(int n3) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(inputConnection.performContextMenuAction(n3) ? 1 : 0) : 0;
        return n3 != 0;
    }

    public final boolean performEditorAction(int n3) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(inputConnection.performEditorAction(n3) ? 1 : 0) : 0;
        return n3 != 0;
    }

    public final boolean performPrivateCommand(String string2, Bundle bundle) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.performPrivateCommand(string2, bundle);
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public final boolean reportFullscreenMode(boolean bl2) {
        InputConnection inputConnection = this.b;
        bl2 = inputConnection != null ? inputConnection.reportFullscreenMode(bl2) : false;
        return bl2;
    }

    public final boolean requestCursorUpdates(int n3) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(inputConnection.requestCursorUpdates(n3) ? 1 : 0) : 0;
        return n3 != 0;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.sendKeyEvent(keyEvent);
        } else {
            bl2 = false;
            keyEvent = null;
        }
        return bl2;
    }

    public final boolean setComposingRegion(int n3, int n4) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(inputConnection.setComposingRegion(n3, n4) ? 1 : 0) : 0;
        return n3 != 0;
    }

    public final boolean setComposingText(CharSequence charSequence, int n3) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = inputConnection.setComposingText(charSequence, n3);
        } else {
            bl2 = false;
            charSequence = null;
        }
        return bl2;
    }

    public final boolean setSelection(int n3, int n4) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(inputConnection.setSelection(n3, n4) ? 1 : 0) : 0;
        return n3 != 0;
    }
}

