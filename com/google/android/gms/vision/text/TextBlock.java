/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.util.SparseArray
 */
package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.vision.text.Line;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.zza;
import com.google.android.gms.vision.text.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextBlock
implements Text {
    private zzah[] zza;
    private Point[] zzb;
    private List zzc;
    private String zzd;
    private Rect zze;

    public TextBlock(SparseArray sparseArray) {
        zzah[] zzahArray;
        int n3;
        zzah[] zzahArray2 = new zzah[sparseArray.size()];
        this.zza = zzahArray2;
        zzahArray2 = null;
        for (int i3 = 0; i3 < (n3 = (zzahArray = this.zza).length); ++i3) {
            zzah zzah2;
            zzahArray[i3] = zzah2 = (zzah)sparseArray.valueAt(i3);
        }
    }

    public Rect getBoundingBox() {
        Rect rect = this.zze;
        if (rect == null) {
            this.zze = rect = com.google.android.gms.vision.text.zzc.zza(this);
        }
        return this.zze;
    }

    public List getComponents() {
        zzah[] object = this.zza;
        int n3 = object.length;
        if (n3 == 0) {
            ArrayList arrayList = new ArrayList(0);
            return arrayList;
        }
        List list = this.zzc;
        if (list == null) {
            ArrayList arrayList;
            zzah[] zzahArray = this.zza;
            int n4 = zzahArray.length;
            this.zzc = arrayList = new ArrayList(n4);
            for (zzah zzah2 : this.zza) {
                List list2 = this.zzc;
                Line line = new Line(zzah2);
                list2.add(line);
            }
        }
        return this.zzc;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Point[] getCornerPoints() {
        zzah zzah2;
        int n3;
        int n4;
        double d2;
        int n7;
        zzab zzab2;
        Point point;
        int n8;
        int n10;
        TextBlock textBlock;
        int n14;
        int n15;
        float f5;
        int n16;
        Object object;
        block8: {
            block7: {
                object = this;
                n16 = 4;
                f5 = 5.6E-45f;
                n15 = 0;
                Point[] pointArray = this.zzb;
                if (pointArray != null) break block7;
                zzah[] zzahArray = this.zza;
                n14 = zzahArray.length;
                if (n14 != 0) break block8;
                Point[] pointArray2 = new Point[]{};
                this.zzb = pointArray2;
            }
            textBlock = object;
            return textBlock.zzb;
        }
        n14 = -1 << -1;
        int n17 = -1 << -1;
        int n18 = -1 >>> 1;
        int n19 = -1 >>> 1;
        Point point2 = null;
        for (int i3 = 0; i3 < (n8 = ((zzah[])(point = ((TextBlock)object).zza)).length); i3 += n10) {
            Point point3;
            zzab2 = point[i3].zzb;
            point = point[0].zzb;
            n7 = -point.zza;
            int n20 = -point.zzb;
            float f6 = point.zze;
            double d5 = Math.sin(Math.toRadians(f6));
            float f7 = point.zze;
            d2 = Math.cos(Math.toRadians(f7));
            point = new Point[n16];
            n16 = zzab2.zza;
            n4 = zzab2.zzb;
            point[0] = point3 = new Point(n16, n4);
            point3.offset(n7, n20);
            object = point[0];
            n16 = ((Point)object).x;
            double d7 = (double)n16 * d2;
            int n21 = ((Point)object).y;
            double d9 = d2;
            double d12 = (double)n21 * d5 + d7;
            n15 = (int)d12;
            d2 = (double)(-n16) * d5;
            d5 = (double)n21 * d9 + d2;
            n10 = (int)d5;
            ((Point)object).x = n15;
            ((Point)object).y = n10;
            n3 = zzab2.zzc + n15;
            object = new Point(n3, n10);
            point[1] = object;
            n3 = zzab2.zzc + n15;
            n16 = zzab2.zzd + n10;
            object = new Point(n3, n16);
            point[2] = object;
            n3 = zzab2.zzd;
            object = new Point(n15, n10 += n3);
            n10 = 3;
            point[n10] = object;
            object = null;
            for (n4 = 0; n4 < (n10 = 4); n4 += n10) {
                zzah2 = point[n4];
                n3 = ((Point)zzah2).x;
                n18 = Math.min(n18, n3);
                n3 = ((Point)zzah2).x;
                n14 = Math.max(n14, n3);
                n3 = ((Point)zzah2).y;
                n19 = Math.min(n19, n3);
                n10 = ((Point)zzah2).y;
                n17 = Math.max(n17, n10);
                n10 = 1;
            }
            n10 = 1;
            n16 = 4;
            f5 = 5.6E-45f;
            n15 = 0;
            object = this;
        }
        zzah2 = point[0];
        object = zzah2.zzb;
        n10 = ((zzab)object).zza;
        n3 = ((zzab)object).zzb;
        f5 = ((zzab)object).zze;
        double d13 = Math.sin(Math.toRadians(f5));
        d2 = Math.cos(Math.toRadians(((zzab)object).zze));
        object = new Point(n18, n19);
        point2 = new Point(n14, n19);
        Point point4 = new Point(n14, n17);
        point = new Point(n18, n17);
        n17 = 4;
        Point[] pointArray = new Point[n17];
        n8 = 0;
        zzab2 = null;
        pointArray[0] = object;
        pointArray[1] = point2;
        pointArray[2] = point4;
        n4 = 3;
        pointArray[n4] = point;
        while (true) {
            if (n8 >= n17) {
                textBlock = this;
                this.zzb = pointArray;
                return textBlock.zzb;
            }
            object = pointArray[n8];
            n19 = ((Point)object).x;
            double d14 = (double)n19 * d2;
            n7 = ((Point)object).y;
            double d15 = (double)n7 * d13;
            n17 = (int)(d14 - d15);
            double d16 = (double)n19 * d13;
            d14 = (double)n7 * d2 + d16;
            n18 = (int)d14;
            ((Point)object).x = n17;
            ((Point)object).y = n18;
            object.offset(n10, n3);
            n4 = 1;
            n8 += n4;
            n17 = 4;
        }
    }

    public String getLanguage() {
        boolean bl2;
        Object object = this.zzd;
        if (object != null) {
            return object;
        }
        object = new HashMap();
        for (zzah zzah2 : this.zza) {
            Object object2 = zzah2.zzd;
            int n3 = (int)(((HashMap)object).containsKey(object2) ? 1 : 0);
            if (n3 != 0) {
                object2 = zzah2.zzd;
                object2 = (Integer)((HashMap)object).get(object2);
                n3 = (Integer)object2;
            } else {
                n3 = 0;
                object2 = null;
            }
            String string2 = zzah2.zzd;
            object2 = ++n3;
            ((HashMap)object).put(string2, object2);
        }
        object = ((HashMap)object).entrySet();
        zza zza2 = new zza(this);
        this.zzd = object = (String)((Map.Entry)Collections.max(object, zza2)).getKey();
        if (object == null || (bl2 = ((String)object).isEmpty())) {
            this.zzd = object = "und";
        }
        return this.zzd;
    }

    public String getValue() {
        Object object = this.zza;
        int n3 = ((zzah[])object).length;
        if (n3 == 0) {
            return "";
        }
        int n4 = 0;
        Object object2 = null;
        object = object[0].zzc;
        StringBuilder stringBuilder = new StringBuilder((String)object);
        for (int i3 = 1; i3 < (n4 = ((zzah[])(object2 = this.zza)).length); ++i3) {
            stringBuilder.append("\n");
            object2 = this.zza[i3].zzc;
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }
}

