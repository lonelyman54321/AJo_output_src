/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewStructure
 *  android.view.autofill.AutofillId
 *  android.view.contentcapture.ContentCaptureSession
 */
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

public final class v60$b {
    public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long l2) {
        return contentCaptureSession.newAutofillId(autofillId, l2);
    }

    public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
        return contentCaptureSession.newViewStructure(view);
    }

    public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long l2) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, l2);
    }

    public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
        contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
    }

    public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] lArray) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, lArray);
    }
}

