/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Spannable
 *  android.text.style.MetricAffectingSpan
 */
package androidx.core.text;

import android.os.Build;
import android.text.Spannable;
import android.text.style.MetricAffectingSpan;

public final class PrecomputedTextCompat
implements Spannable {
    public final char charAt(int n3) {
        throw null;
    }

    public final int getSpanEnd(Object object) {
        throw null;
    }

    public final int getSpanFlags(Object object) {
        throw null;
    }

    public final int getSpanStart(Object object) {
        throw null;
    }

    public final Object[] getSpans(int n3, int n4, Class clazz) {
        n3 = Build.VERSION.SDK_INT;
        n4 = 29;
        if (n3 >= n4) {
            throw null;
        }
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int n3, int n4, Class clazz) {
        throw null;
    }

    public final void removeSpan(Object object) {
        int n3 = object instanceof MetricAffectingSpan;
        if (n3 == 0) {
            n3 = Build.VERSION.SDK_INT;
            int n4 = 29;
            if (n3 >= n4) {
                throw null;
            }
            throw null;
        }
        object = new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        throw object;
    }

    public final void setSpan(Object object, int n3, int n4, int n7) {
        int n8 = object instanceof MetricAffectingSpan;
        if (n8 == 0) {
            n8 = Build.VERSION.SDK_INT;
            n3 = 29;
            if (n8 >= n3) {
                throw null;
            }
            throw null;
        }
        object = new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        throw object;
    }

    public final CharSequence subSequence(int n3, int n4) {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

