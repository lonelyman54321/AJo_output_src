/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.XmlResourceParser
 *  android.util.SparseArray
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

public final class D50 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public final SparseArray d;
    public final SparseArray e;

    public D50(Context context, ConstraintLayout constraintLayout, int n3) {
        int n4;
        Object object;
        int n7;
        this.b = n7 = -1;
        this.c = n7;
        this.d = object = new SparseArray();
        this.e = object = new SparseArray();
        this.a = constraintLayout;
        constraintLayout = context.getResources().getXml(n3);
        n3 = constraintLayout.getEventType();
        object = null;
        while (n3 != (n4 = 1)) {
            block26: {
                Object object2;
                block27: {
                    Object object3;
                    block28: {
                        int n8;
                        int n10;
                        int n14;
                        block25: {
                            n14 = 2;
                            if (n3 != n14) break block26;
                            object2 = constraintLayout.getName();
                            int n15 = ((String)object2).hashCode();
                            n10 = 4;
                            n8 = 3;
                            switch (n15) {
                                default: {
                                    break;
                                }
                                case 1901439077: {
                                    object3 = "Variant";
                                    n3 = ((String)object2).equals(object3) ? 1 : 0;
                                    if (n3 == 0) break;
                                    n4 = 3;
                                    break block25;
                                }
                                case 1657696882: {
                                    object3 = "layoutDescription";
                                    n3 = ((String)object2).equals(object3) ? 1 : 0;
                                    if (n3 == 0) break;
                                    n4 = 0;
                                    object3 = null;
                                    break block25;
                                }
                                case 1382829617: {
                                    String string2 = "StateSet";
                                    n3 = ((String)object2).equals(string2) ? 1 : 0;
                                    if (n3 == 0) break;
                                    break block25;
                                }
                                case 80204913: {
                                    object3 = "State";
                                    n3 = ((String)object2).equals(object3) ? 1 : 0;
                                    if (n3 == 0) break;
                                    n4 = 2;
                                    break block25;
                                }
                                case -1349929691: {
                                    object3 = "ConstraintSet";
                                    n3 = ((String)object2).equals(object3) ? 1 : 0;
                                    if (n3 == 0) break;
                                    n4 = 4;
                                    break block25;
                                }
                            }
                            n4 = -1;
                        }
                        if (n4 == n14) break block27;
                        if (n4 == n8) break block28;
                        if (n4 != n10) break block26;
                        this.a(context, (XmlResourceParser)constraintLayout);
                        break block26;
                    }
                    object2 = new D50$b(context, (XmlResourceParser)constraintLayout);
                    if (object == null) break block26;
                    object3 = object.b;
                    ((ArrayList)object3).add(object2);
                    break block26;
                }
                object2 = new D50$a(context, (XmlResourceParser)constraintLayout);
                object = this.d;
                n4 = ((D50$a)object2).a;
                object.put(n4, object2);
                object = object2;
            }
            try {
                n3 = constraintLayout.next();
                continue;
            }
            catch (IOException | XmlPullParserException throwable) {}
            break;
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        b b2 = new b();
        int n3 = xmlResourceParser.getAttributeCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            int n4;
            String string3 = xmlResourceParser.getAttributeName(i3);
            String string4 = xmlResourceParser.getAttributeValue(i3);
            if (string3 == null || string4 == null || (n4 = (string2 = "id").equals(string3)) == 0) continue;
            String string5 = "/";
            n3 = string4.contains(string5) ? 1 : 0;
            i3 = 1;
            n4 = -1;
            if (n3 != 0) {
                n3 = string4.indexOf(47) + i3;
                string5 = string4.substring(n3);
                Resources resources = context.getResources();
                String string6 = context.getPackageName();
                n3 = resources.getIdentifier(string5, string2, string6);
            } else {
                n3 = -1;
            }
            if (n3 == n4 && (n4 = string4.length()) > i3) {
                string5 = string4.substring(i3);
                n3 = Integer.parseInt(string5);
            }
            b2.m(context, xmlResourceParser);
            context = this.e;
            context.put(n3, (Object)b2);
            break;
        }
    }

    public final void b(float f5, float f6, int n3) {
        int n4;
        int n7 = this.b;
        Object object = this.d;
        ConstraintLayout constraintLayout = this.a;
        int n8 = -1;
        if (n7 == n3) {
            b b2;
            D50$a d50$a;
            block14: {
                int n10;
                Object object2;
                d50$a = n3 == n8 ? (D50$a)object.valueAt(0) : (D50$a)object.get(n7);
                n7 = this.c;
                if (n7 != n8 && (n7 = (int)(((D50$b)(object2 = (D50$b)((ArrayList)(object = d50$a.b)).get(n7))).a(f5, f6) ? 1 : 0)) != 0) {
                    return;
                }
                for (n4 = 0; n4 < (n10 = ((ArrayList)(object2 = d50$a.b)).size()); ++n4) {
                    n7 = ((D50$b)(object2 = (D50$b)((ArrayList)object2).get(n4))).a(f5, f6) ? 1 : 0;
                    if (n7 == 0) {
                        continue;
                    }
                    break block14;
                }
                n4 = -1;
            }
            int n14 = this.c;
            if (n14 == n4) {
                return;
            }
            Object object3 = d50$a.b;
            if (n4 == n8) {
                f6 = 0.0f;
                b2 = null;
            } else {
                b2 = ((D50$b)((ArrayList)object3).get((int)n4)).f;
            }
            if (n4 != n8) {
                object3 = (D50$b)((ArrayList)object3).get(n4);
                n14 = ((D50$b)object3).e;
            }
            if (b2 == null) {
                return;
            }
            this.c = n4;
            b2.b(constraintLayout);
        } else {
            D50$a d50$a;
            block15: {
                Object object4;
                int n15;
                this.b = n3;
                d50$a = (D50$a)object.get(n3);
                while (n4 < (n15 = ((ArrayList)(object4 = d50$a.b)).size())) {
                    n7 = ((D50$b)(object4 = (D50$b)((ArrayList)object4).get(n4))).a(f5, f6) ? 1 : 0;
                    if (n7 == 0) {
                        ++n4;
                        continue;
                    }
                    break block15;
                }
                n4 = -1;
            }
            Object object5 = d50$a.b;
            b b3 = n4 == n8 ? d50$a.d : ((D50$b)((ArrayList)object5).get((int)n4)).f;
            if (n4 != n8) {
                object5 = (D50$b)((ArrayList)object5).get(n4);
                int n16 = ((D50$b)object5).e;
            }
            if (b3 == null) {
                return;
            }
            this.c = n4;
            b3.b(constraintLayout);
        }
    }
}

