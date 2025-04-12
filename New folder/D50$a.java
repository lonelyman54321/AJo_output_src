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
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class D50$a {
    public final int a;
    public final ArrayList b;
    public final int c;
    public final b d;

    public D50$a(Context context, XmlResourceParser xmlResourceParser) {
        Object object = new ArrayList();
        this.b = object;
        this.c = -1;
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        object = R$styleable.State;
        xmlResourceParser = context.obtainStyledAttributes((AttributeSet)xmlResourceParser, (int[])object);
        int n3 = xmlResourceParser.getIndexCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7 = xmlResourceParser.getIndex(i3);
            if (n7 == (n4 = R$styleable.State_android_id)) {
                n4 = this.a;
                this.a = n7 = xmlResourceParser.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.State_constraints;
            if (n7 != n4) continue;
            n4 = this.c;
            this.c = n7 = xmlResourceParser.getResourceId(n7, n4);
            Object object2 = context.getResources().getResourceTypeName(n7);
            context.getResources().getResourceName(n7);
            String string2 = "layout";
            n4 = string2.equals(object2) ? 1 : 0;
            if (n4 == 0) continue;
            this.d = object2 = new b();
            string2 = LayoutInflater.from((Context)context);
            ConstraintLayout constraintLayout = (ConstraintLayout)string2.inflate(n7, null);
            ((b)object2).e(constraintLayout);
        }
        xmlResourceParser.recycle();
    }
}

