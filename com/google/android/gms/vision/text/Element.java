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
import com.google.android.gms.internal.vision.zzao;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.zzc;
import java.util.ArrayList;
import java.util.List;

public class Element
implements Text {
    private zzao zza;

    public Element(zzao zzao2) {
        this.zza = zzao2;
    }

    public Rect getBoundingBox() {
        return zzc.zza(this);
    }

    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public Point[] getCornerPoints() {
        return zzc.zza(this.zza.zza);
    }

    public String getLanguage() {
        return this.zza.zzc;
    }

    public String getValue() {
        return this.zza.zzb;
    }
}

