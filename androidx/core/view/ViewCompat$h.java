/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 */
package androidx.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public final class ViewCompat$h {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n3, int n4) {
        view.saveAttributeDataForStyleable(context, nArray, attributeSet, typedArray, n3, n4);
    }
}

