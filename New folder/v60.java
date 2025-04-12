/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.autofill.AutofillId
 *  android.view.contentcapture.ContentCaptureSession
 */
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

public final class v60 {
    public final Object a;
    public final View b;

    public v60(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final AutofillId a(long l2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            ContentCaptureSession contentCaptureSession = t60_0.a(this.a);
            Zs zs = FC3.a(this.b);
            Objects.requireNonNull(zs);
            zs = g2.a(zs.a);
            return v60$b.a(contentCaptureSession, (AutofillId)zs, l2);
        }
        return null;
    }
}

