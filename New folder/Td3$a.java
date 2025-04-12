/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import java.io.IOException;

public final class Td3$a
implements vs0$b {
    public final hG2 a;
    public final vC0 b;

    public Td3$a(hG2 hG22, vC0 vC02) {
        this.a = hG22;
        this.b = vC02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        hG2 hG22 = this.a;
        synchronized (hG22) {
            int n3;
            byte[] byArray = hG22.a;
            hG22.c = n3 = byArray.length;
            return;
        }
    }

    public final void b(ny_0 ny_02, Bitmap bitmap) {
        IOException iOException = this.b.b;
        if (iOException != null) {
            if (bitmap != null) {
                ny_02.d(bitmap);
            }
            throw iOException;
        }
    }
}

