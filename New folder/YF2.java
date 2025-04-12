/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.inputmethod.CompletionInfo
 *  android.view.inputmethod.CorrectionInfo
 *  android.view.inputmethod.ExtractedText
 *  android.view.inputmethod.ExtractedTextRequest
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputContentInfo
 */
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

public final class YF2
implements InputConnection {
    public final Dl3 a;
    public final boolean b;
    public int c;
    public ql3_0 d;
    public int e;
    public boolean f;
    public final ArrayList g;
    public boolean h;

    public YF2(ql3_0 arrayList, Dl3 dl3, boolean bl2) {
        this.a = dl3;
        this.b = bl2;
        this.d = arrayList;
        this.g = arrayList = new ArrayList();
        this.h = true;
    }

    public final void b(mx0 mx02) {
        int n3;
        this.c = n3 = this.c + 1;
        try {
            ArrayList arrayList = this.g;
            arrayList.add(mx02);
            return;
        }
        finally {
            this.c();
        }
    }

    public final boolean beginBatchEdit() {
        int n3 = this.h;
        if (n3 != 0) {
            n3 = this.c;
            int n4 = 1;
            this.c = n3 += n4;
            return n4 != 0;
        }
        return n3 != 0;
    }

    public final boolean c() {
        ArrayList arrayList;
        boolean bl2;
        int n3;
        this.c = n3 = this.c + -1;
        boolean bl3 = true;
        if (n3 == 0 && (bl2 = (arrayList = this.g).isEmpty() ^ bl3)) {
            ArrayList arrayList2 = CollectionsKt.m0(arrayList);
            Dl3 dl3 = this.a;
            dl3.b(arrayList2);
            arrayList.clear();
        }
        if ((n3 = this.c) <= 0) {
            bl3 = false;
        }
        return bl3;
    }

    public final boolean clearMetaKeyStates(int n3) {
        n3 = (int)(this.h ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        this.a.a(this);
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean bl2 = this.h;
        if (bl2) {
            bl2 = false;
        }
        return bl2;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int n3, Bundle bundle) {
        boolean bl2 = this.h;
        if (bl2) {
            bl2 = false;
        }
        return bl2;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean bl2 = this.h;
        if (bl2) {
            bl2 = this.b;
        }
        return bl2;
    }

    public final boolean commitText(CharSequence charSequence, int n3) {
        boolean bl2 = this.h;
        if (bl2) {
            charSequence = String.valueOf(charSequence);
            bz_0 bz_02 = new bz_0((String)charSequence, n3);
            this.b(bz_02);
        }
        return bl2;
    }

    public final void d(int n3) {
        KeyEvent keyEvent = new KeyEvent(0, n3);
        this.sendKeyEvent(keyEvent);
        keyEvent = new KeyEvent(1, n3);
        this.sendKeyEvent(keyEvent);
    }

    public final boolean deleteSurroundingText(int n3, int n4) {
        boolean bl2 = this.h;
        if (bl2) {
            jo0_0 jo0_02 = new jo0_0(n3, n4);
            this.b(jo0_02);
            return true;
        }
        return bl2;
    }

    public final boolean deleteSurroundingTextInCodePoints(int n3, int n4) {
        boolean bl2 = this.h;
        if (bl2) {
            Ko0 ko0 = new Ko0(n3, n4);
            this.b(ko0);
            return true;
        }
        return bl2;
    }

    public final boolean endBatchEdit() {
        return this.c();
    }

    public final boolean finishComposingText() {
        boolean bl2 = this.h;
        if (bl2) {
            tn0_1 tn0_12 = new Object();
            this.b(tn0_12);
            bl2 = true;
        }
        return bl2;
    }

    public final int getCursorCapsMode(int n3) {
        ql3_0 ql3_02 = this.d;
        String string2 = ql3_02.a.a;
        int n4 = mm3.e(ql3_02.b);
        return TextUtils.getCapsMode((CharSequence)string2, (int)n4, (int)n3);
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int n3) {
        int n4 = 1;
        int n7 = 0;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        this.f = n4;
        if (n4 != 0) {
            if (extractedTextRequest != null) {
                n7 = extractedTextRequest.token;
            }
            this.e = n7;
        }
        return Zh1.a(this.d);
    }

    public final Handler getHandler() {
        return null;
    }

    public final CharSequence getSelectedText(int n3) {
        Object object = this.d;
        long l2 = ((ql3_0)object).b;
        n3 = (int)(mm3.b(l2) ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            object = null;
        } else {
            object = tp1_0.b((ql3_0)this.d).a;
        }
        return object;
    }

    public final CharSequence getTextAfterCursor(int n3, int n4) {
        return tp1_0.c((ql3_0)this.d, (int)n3).a;
    }

    public final CharSequence getTextBeforeCursor(int n3, int n4) {
        return tp1_0.d((ql3_0)this.d, (int)n3).a;
    }

    public final boolean performContextMenuAction(int n3) {
        boolean bl2 = this.h;
        if (bl2) {
            bl2 = false;
            switch (n3) {
                default: {
                    break;
                }
                case 0x1020022: {
                    n3 = 279;
                    this.d(n3);
                    break;
                }
                case 0x1020021: {
                    n3 = 278;
                    this.d(n3);
                    break;
                }
                case 0x1020020: {
                    n3 = 277;
                    this.d(n3);
                    break;
                }
                case 16908319: {
                    String string2 = this.d.a.a;
                    int n4 = string2.length();
                    N03 n03 = new N03(0, n4);
                    this.b(n03);
                }
            }
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean performEditorAction(int var1_1) {
        block8: {
            var2_2 = this.h;
            if (!var2_2) break block8;
            var2_2 = true;
            if (var1_1 == 0) ** GOTO lbl-1000
            switch (var1_1) {
                default: lbl-1000:
                // 2 sources

                {
                    var1_1 = 1;
                    break;
                }
                case 7: {
                    var1_1 = 5;
                    break;
                }
                case 6: {
                    var1_1 = 7;
                    break;
                }
                case 5: {
                    var1_1 = 6;
                    break;
                }
                case 4: {
                    var1_1 = 4;
                    break;
                }
                case 3: {
                    var1_1 = 3;
                    break;
                }
                case 2: {
                    var1_1 = 2;
                }
            }
            var3_3 = this.a;
            var3_3.c(var1_1);
        }
        return var2_2;
    }

    public final boolean performPrivateCommand(String string2, Bundle bundle) {
        boolean bl2 = this.h;
        if (bl2) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean reportFullscreenMode(boolean bl2) {
        return false;
    }

    public final boolean requestCursorUpdates(int n3) {
        int n4 = this.h;
        if (n4 != 0) {
            boolean bl2;
            int n7;
            int n8;
            int n10;
            n4 = n3 & 1;
            boolean bl3 = false;
            boolean bl4 = true;
            boolean bl5 = n4 != 0;
            n4 = n3 & 2;
            boolean bl6 = n4 != 0;
            n4 = Build.VERSION.SDK_INT;
            int n14 = 33;
            float f5 = 4.6E-44f;
            if (n4 >= n14) {
                float f6;
                n14 = n3 & 0x10;
                if (n14 != 0) {
                    n14 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    n14 = 0;
                    f5 = 0.0f;
                }
                n10 = n3 & 8;
                if (n10 != 0) {
                    n10 = 1;
                    f6 = Float.MIN_VALUE;
                } else {
                    n10 = 0;
                    f6 = 0.0f;
                }
                n8 = n3 & 4;
                n8 = n8 != 0 ? 1 : 0;
                n7 = 34;
                if (n4 >= n7 && (n3 &= 0x20) != 0) {
                    bl3 = true;
                }
                if (n14 == 0 && n10 == 0 && n8 == 0 && !bl3) {
                    if (n4 >= n7) {
                        n10 = 1;
                        f6 = Float.MIN_VALUE;
                        n8 = 1;
                        n7 = 1;
                        bl2 = true;
                    } else {
                        bl2 = bl3;
                        n10 = 1;
                        f6 = Float.MIN_VALUE;
                        n8 = 1;
                        n7 = 1;
                    }
                } else {
                    bl2 = bl3;
                    n7 = n8;
                    n8 = n10;
                    n10 = n14;
                    f6 = f5;
                }
            } else {
                n10 = 1;
                float f7 = Float.MIN_VALUE;
                n8 = 1;
                n7 = 0;
                bl2 = false;
            }
            this.a.e(bl5, bl6, n10 != 0, n8 != 0, n7 != 0, bl2);
            return bl4;
        }
        return n4 != 0;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean bl2 = this.h;
        if (bl2) {
            this.a.d(keyEvent);
            return true;
        }
        return bl2;
    }

    public final boolean setComposingRegion(int n3, int n4) {
        boolean bl2 = this.h;
        if (bl2) {
            L03 l03 = new L03(n3, n4);
            this.b(l03);
        }
        return bl2;
    }

    public final boolean setComposingText(CharSequence charSequence, int n3) {
        boolean bl2 = this.h;
        if (bl2) {
            charSequence = String.valueOf(charSequence);
            M03 m03 = new M03((String)charSequence, n3);
            this.b(m03);
        }
        return bl2;
    }

    public final boolean setSelection(int n3, int n4) {
        boolean bl2 = this.h;
        if (bl2) {
            N03 n03 = new N03(n3, n4);
            this.b(n03);
            return true;
        }
        return bl2;
    }
}

