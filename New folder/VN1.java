/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.text.format.Formatter
 *  android.util.DisplayMetrics
 *  android.util.Log
 */
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class VN1 {
    public final int a;
    public final int b;
    public final int c;

    public VN1(VN1$a object) {
        int n3;
        Context context = ((VN1$a)object).a;
        ActivityManager activityManager = ((VN1$a)object).b;
        int n4 = activityManager.isLowRamDevice();
        n4 = n4 != 0 ? 0x200000 : 0x400000;
        this.c = n4;
        int n7 = activityManager.getMemoryClass();
        float f5 = 1.469368E-39f;
        int n8 = activityManager.isLowRamDevice();
        float f6 = n7 *= 0x100000;
        if (n8 != 0) {
            n8 = 1051260355;
            f5 = 0.33f;
        } else {
            n8 = 1053609165;
            f5 = 0.4f;
        }
        n7 = Math.round(f6 *= f5);
        DisplayMetrics displayMetrics = ((VN1$a)object).c.a;
        int n10 = displayMetrics.widthPixels;
        n8 = displayMetrics.heightPixels;
        f5 = n10 * n8 * 4;
        float f7 = ((VN1$a)object).d;
        float f8 = f5 * f7;
        n10 = Math.round(f8);
        float f11 = 2.0f;
        n8 = Math.round(f5 *= f11);
        int n14 = n7 - n4;
        int n15 = n8 + n10;
        if (n15 <= n14) {
            this.b = n8;
            this.a = n10;
        } else {
            f5 = n14;
            f8 = f7 + f11;
            this.b = n10 = Math.round(f11 *= (f5 /= f8));
            this.a = n3 = Math.round(f5 *= f7);
        }
        object = "MemorySizeCalculator";
        n8 = 3;
        f5 = 4.2E-45f;
        n3 = Log.isLoggable((String)object, (int)n8);
        if (n3 != 0) {
            long l2 = this.b;
            Formatter.formatFileSize((Context)context, (long)l2);
            n3 = this.a;
            l2 = n3;
            Formatter.formatFileSize((Context)context, (long)l2);
            l2 = n4;
            Formatter.formatFileSize((Context)context, (long)l2);
            long l3 = n7;
            Formatter.formatFileSize((Context)context, (long)l3);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}

