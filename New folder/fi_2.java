/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.webkit.WebView
 */
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebView;

/*
 * Renamed from fI
 */
public final class fi_2
extends WebView {
    public final Point a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public fi_2(Context context, int n3, int n4, int n7, int n8) {
        super(context);
        super();
        this.a = context;
        this.d = n3;
        this.b = n4;
        this.e = n7;
        this.c = n8;
        this.setHorizontalScrollBarEnabled(false);
        this.setVerticalScrollBarEnabled(false);
        this.setHorizontalFadingEdgeEnabled(false);
        this.setVerticalFadingEdgeEnabled(false);
        this.setOverScrollMode(2);
        this.setBackgroundColor(0);
        this.setId(188293);
    }

    public final void a() {
        DisplayMetrics displayMetrics;
        int n3 = 1120403456;
        float f5 = 100.0f;
        int n4 = 1;
        float f6 = Float.MIN_VALUE;
        Point point = this.a;
        int n7 = this.d;
        if (n7 != 0) {
            float f7 = n7;
            DisplayMetrics displayMetrics2 = this.getResources().getDisplayMetrics();
            f7 = TypedValue.applyDimension((int)n4, (float)f7, (DisplayMetrics)displayMetrics2);
            point.x = n7 = (int)f7;
        } else {
            displayMetrics = this.getResources().getDisplayMetrics();
            n7 = displayMetrics.widthPixels;
            int n8 = this.e;
            float f8 = (float)(n7 * n8) / f5;
            point.x = n7 = (int)f8;
        }
        n7 = this.b;
        if (n7 != 0) {
            f5 = n7;
            displayMetrics = this.getResources().getDisplayMetrics();
            f5 = TypedValue.applyDimension((int)n4, (float)f5, (DisplayMetrics)displayMetrics);
            point.y = n3 = (int)f5;
        } else {
            DisplayMetrics displayMetrics3 = this.getResources().getDisplayMetrics();
            n4 = displayMetrics3.heightPixels;
            n7 = this.c;
            f6 = (float)(n4 *= n7) / f5;
            point.y = n3 = (int)f6;
        }
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        this.a();
        Point point = this.a;
        n4 = point.x;
        n3 = point.y;
        this.setMeasuredDimension(n4, n3);
    }
}

