/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.graphics.Rect
 */
package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.vision.text.Text;

final class zzc {
    public static Rect zza(Text rect) {
        rect = rect.getCornerPoints();
        int n3 = ((Point[])rect).length;
        int n4 = -1 >>> 1;
        int n7 = -1 >>> 1;
        int n8 = -1 << -1;
        int n10 = -1 << -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            Rect rect2 = rect[i3];
            int n14 = rect2.x;
            n4 = Math.min(n4, n14);
            n14 = rect2.x;
            n8 = Math.max(n8, n14);
            n14 = rect2.y;
            n7 = Math.min(n7, n14);
            int n15 = rect2.y;
            n10 = Math.max(n10, n15);
        }
        rect = new Rect(n4, n7, n8, n10);
        return rect;
    }

    public static Point[] zza(zzab zzab2) {
        Point point;
        Point point2;
        Point[] pointArray = new Point[4];
        double d2 = Math.sin(Math.toRadians(zzab2.zze));
        double d5 = Math.cos(Math.toRadians(zzab2.zze));
        int n3 = zzab2.zza;
        int n4 = zzab2.zzb;
        pointArray[0] = point2 = new Point(n3, n4);
        double d7 = zzab2.zza;
        int n7 = zzab2.zzc;
        n4 = (int)((double)n7 * d5 + d7);
        double d9 = zzab2.zzb;
        int n8 = (int)((double)n7 * d2 + d9);
        point2 = new Point(n4, n8);
        n4 = 1;
        pointArray[n4] = point2;
        Point point3 = pointArray[n4];
        double d12 = point3.x;
        int n10 = zzab2.zzd;
        double d13 = (double)n10 * d2;
        int n14 = (int)(d12 - d13);
        double d14 = point3.y;
        n10 = (int)((double)n10 * d5 + d14);
        point2 = new Point(n14, n10);
        n10 = 2;
        pointArray[n10] = point2;
        Point point4 = pointArray[0];
        int n15 = point4.x;
        zzab2 = pointArray[n10];
        int n16 = ((Point)zzab2).x;
        point2 = pointArray[n4];
        n3 = point2.x;
        n16 = n16 - n3 + n15;
        int n17 = point4.y;
        n10 = ((Point)zzab2).y;
        n15 = point2.y;
        n10 = n10 - n15 + n17;
        pointArray[3] = point = new Point(n16, n10);
        return pointArray;
    }
}

