/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 */
package androidx.media3.ui;

import android.text.Layout;

public final class WebViewSubtitleOutput$b {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Layout.Alignment alignment;
        int n7 = Layout.Alignment.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            alignment = Layout.Alignment.ALIGN_NORMAL;
            n4 = alignment.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
            n4 = alignment.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            alignment = Layout.Alignment.ALIGN_CENTER;
            n4 = alignment.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

