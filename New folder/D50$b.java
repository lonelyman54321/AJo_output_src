/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.Xml
 *  android.view.LayoutInflater
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;
import org.xmlpull.v1.XmlPullParser;

public final class D50$b {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final b f;

    public D50$b(Context context, XmlResourceParser xmlResourceParser) {
        float f5;
        this.a = f5 = 0.0f / 0.0f;
        this.b = f5;
        this.c = f5;
        this.d = f5;
        f5 = 0.0f / 0.0f;
        this.e = -1;
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        int[] nArray = R$styleable.Variant;
        xmlResourceParser = context.obtainStyledAttributes((AttributeSet)xmlResourceParser, nArray);
        int n3 = xmlResourceParser.getIndexCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            float f6;
            float f7;
            int n4;
            int n7 = xmlResourceParser.getIndex(i3);
            if (n7 == (n4 = R$styleable.Variant_constraints)) {
                n4 = this.e;
                this.e = n7 = xmlResourceParser.getResourceId(n7, n4);
                Object object = context.getResources().getResourceTypeName(n7);
                context.getResources().getResourceName(n7);
                String string2 = "layout";
                n4 = string2.equals(object) ? 1 : 0;
                if (n4 == 0) continue;
                this.f = object = new b();
                string2 = LayoutInflater.from((Context)context);
                ConstraintLayout constraintLayout = (ConstraintLayout)string2.inflate(n7, null);
                ((b)object).e(constraintLayout);
                continue;
            }
            n4 = R$styleable.Variant_region_heightLessThan;
            if (n7 == n4) {
                f7 = this.d;
                this.d = f6 = xmlResourceParser.getDimension(n7, f7);
                continue;
            }
            n4 = R$styleable.Variant_region_heightMoreThan;
            if (n7 == n4) {
                f7 = this.b;
                this.b = f6 = xmlResourceParser.getDimension(n7, f7);
                continue;
            }
            n4 = R$styleable.Variant_region_widthLessThan;
            if (n7 == n4) {
                f7 = this.c;
                this.c = f6 = xmlResourceParser.getDimension(n7, f7);
                continue;
            }
            n4 = R$styleable.Variant_region_widthMoreThan;
            if (n7 != n4) continue;
            f7 = this.a;
            this.a = f6 = xmlResourceParser.getDimension(n7, f7);
        }
        xmlResourceParser.recycle();
    }

    public final boolean a(float f5, float f6) {
        float f7;
        float f8;
        float f11 = this.a;
        boolean bl2 = Float.isNaN(f11);
        if (!bl2 && (f8 = f5 == f11 ? 0 : (f5 < f11 ? -1 : 1)) < 0) {
            return false;
        }
        f11 = this.b;
        bl2 = Float.isNaN(f11);
        if (!bl2 && (f8 = f6 == f11 ? 0 : (f6 < f11 ? -1 : 1)) < 0) {
            return false;
        }
        f11 = this.c;
        bl2 = Float.isNaN(f11);
        if (!bl2 && (f7 = f5 == f11 ? 0 : (f5 > f11 ? 1 : -1)) > 0) {
            return false;
        }
        f5 = this.d;
        f8 = (float)Float.isNaN(f5);
        return f8 != false || (f7 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1)) <= 0;
    }
}

