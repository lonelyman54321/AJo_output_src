/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Ch
 */
public final class ch_0
extends WK2$d {
    public final /* synthetic */ bl_2 a;
    public final /* synthetic */ jk2_1 b;

    public ch_0(CancellableContinuationImpl cancellableContinuationImpl, jk2_1 jk2_12) {
        this.a = cancellableContinuationImpl;
        this.b = jk2_12;
    }

    public final void onFontRetrievalFailed(int n3) {
        StringBuilder stringBuilder = new StringBuilder("Unable to load font ");
        jk2_1 jk2_12 = this.b;
        stringBuilder.append(jk2_12);
        stringBuilder.append(" (reason=");
        stringBuilder.append(n3);
        stringBuilder.append(')');
        String string2 = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        this.a.e(illegalStateException);
    }

    public final void onFontRetrieved(Typeface typeface) {
        this.a.resumeWith(typeface);
    }
}

