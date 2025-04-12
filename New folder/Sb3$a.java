/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class Sb3$a {
    public final int a;
    public final ArrayList b;
    public final int c;

    public Sb3$a(Context context, XmlResourceParser xmlResourceParser) {
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
            String string2 = context.getResources().getResourceTypeName(n7);
            Resources resources = context.getResources();
            resources.getResourceName(n7);
            String string3 = "layout";
            string3.equals(string2);
        }
        xmlResourceParser.recycle();
    }
}

