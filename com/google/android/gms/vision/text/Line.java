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
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzao;
import com.google.android.gms.vision.text.Element;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.zzc;
import java.util.ArrayList;
import java.util.List;

public class Line
implements Text {
    private zzah zza;
    private List zzb;

    public Line(zzah zzah2) {
        this.zza = zzah2;
    }

    public float getAngle() {
        return this.zza.zzb.zze;
    }

    public Rect getBoundingBox() {
        return zzc.zza(this);
    }

    public List getComponents() {
        zzao[] object = this.zza.zza;
        int n3 = object.length;
        if (n3 == 0) {
            ArrayList arrayList = new ArrayList(0);
            return arrayList;
        }
        List list = this.zzb;
        if (list == null) {
            ArrayList arrayList;
            zzao[] zzaoArray = this.zza.zza;
            int n4 = zzaoArray.length;
            this.zzb = arrayList = new ArrayList(n4);
            for (zzao zzao2 : this.zza.zza) {
                List list2 = this.zzb;
                Element element = new Element(zzao2);
                list2.add(element);
            }
        }
        return this.zzb;
    }

    public Point[] getCornerPoints() {
        return zzc.zza(this.zza.zzb);
    }

    public String getLanguage() {
        return this.zza.zzd;
    }

    public String getValue() {
        return this.zza.zzc;
    }

    public boolean isVertical() {
        return this.zza.zze;
    }
}

