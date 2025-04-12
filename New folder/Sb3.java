/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class Sb3 {
    public final int a;
    public final SparseArray b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Sb3(Context var1_1, XmlResourceParser var2_2) {
        super();
        this.a = var3_3 = -1;
        var4_4 = new SparseArray();
        this.b = var4_4;
        var4_4 = Xml.asAttributeSet((XmlPullParser)var2_2);
        var5_5 /* !! */  = R$styleable.StateSet;
        var4_4 = var1_1.obtainStyledAttributes((AttributeSet)var4_4, var5_5 /* !! */ );
        var6_6 = var4_4.getIndexCount();
        var8_8 = null;
        for (var7_7 = 0; var7_7 < var6_6; ++var7_7) {
            var9_9 = var4_4.getIndex(var7_7);
            if (var9_9 != (var10_10 = R$styleable.StateSet_defaultState)) continue;
            var10_10 = this.a;
            this.a = var9_9 = var4_4.getResourceId(var9_9, var10_10);
        }
        var4_4.recycle();
        var11_11 = var2_2.getEventType();
        var6_6 = 0;
        var5_5 /* !! */  = null;
        while (var11_11 != (var7_7 = 1)) {
            block26: {
                block27: {
                    var12_12 = "StateSet";
                    var10_10 = 3;
                    var13_13 = 2;
                    if (var11_11 == var13_13) break block27;
                    if (var11_11 != var10_10) ** GOTO lbl90
                    var4_4 = var2_2.getName();
                    var11_11 = (int)var12_12.equals(var4_4);
                    if (var11_11 != 0) {
                        break;
                    }
                    ** GOTO lbl90
                }
                var4_4 = var2_2.getName();
                var14_14 = var4_4.hashCode();
                switch (var14_14) {
                    default: {
                        break;
                    }
                    case 1901439077: {
                        var8_8 = "Variant";
                        var11_11 = (int)var4_4.equals(var8_8);
                        if (var11_11 == 0) break;
                        var7_7 = 3;
                        break block26;
                    }
                    case 1382829617: {
                        var11_11 = (int)var4_4.equals(var12_12);
                        if (var11_11 == 0) break;
                        break block26;
                    }
                    case 1301459538: {
                        var8_8 = "LayoutDescription";
                        var11_11 = (int)var4_4.equals(var8_8);
                        if (var11_11 == 0) break;
                        var7_7 = 0;
                        var8_8 = null;
                        break block26;
                    }
                    case 80204913: {
                        var8_8 = "State";
                        var11_11 = (int)var4_4.equals(var8_8);
                        if (var11_11 == 0) break;
                        var7_7 = 2;
                        break block26;
                    }
                }
                var7_7 = -1;
            }
            if (var7_7 == var13_13) ** GOTO lbl82
            if (var7_7 != var10_10) ** GOTO lbl90
            var4_4 = new Sb3$b(var1_1, var2_2);
            if (var5_5 /* !! */  == null) ** GOTO lbl90
            var8_8 = var5_5 /* !! */ .b;
            var8_8.add(var4_4);
            ** GOTO lbl90
lbl82:
            // 1 sources

            var5_5 /* !! */  = (int[])new Sb3$a;
            super(var1_1, var2_2);
            var4_4 = this.b;
            var7_7 = var5_5 /* !! */ .a;
            try {
                var4_4.put(var7_7, (Object)var5_5 /* !! */ );
lbl90:
                // 6 sources

                var11_11 = var2_2.next();
                continue;
            }
            catch (IOException | XmlPullParserException v0) {}
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(int n3) {
        Object object;
        int n4;
        int n7;
        block8: {
            int n8;
            n7 = -1;
            float f5 = n7;
            Object object2 = this.b;
            if (n7 == n3) {
                Object object3;
                block7: {
                    int n10;
                    object3 = n3 == n7 ? (Sb3$a)object2.valueAt(0) : (Sb3$a)object2.get(n7);
                    if (object3 == null) return n7;
                    for (n4 = 0; n4 < (n10 = ((ArrayList)(object2 = ((Sb3$a)object3).b)).size()); ++n4) {
                        boolean bl2 = ((Sb3$b)(object2 = (Sb3$b)((ArrayList)object2).get(n4))).a(f5, f5);
                        if (!bl2) {
                            continue;
                        }
                        break block7;
                    }
                    n4 = -1;
                }
                if (n7 == n4) return n7;
                if (n4 == n7) {
                    n3 = ((Sb3$a)object3).c;
                    return n3;
                }
                object3 = (Sb3$b)((Sb3$a)object3).b.get(n4);
                return ((Sb3$b)object3).e;
            }
            object = (Sb3$a)object2.get(n3);
            if (object == null) return n7;
            while (n4 < (n8 = ((ArrayList)(object2 = ((Sb3$a)object).b)).size())) {
                boolean bl3 = ((Sb3$b)(object2 = (Sb3$b)((ArrayList)object2).get(n4))).a(f5, f5);
                if (!bl3) {
                    ++n4;
                    continue;
                }
                break block8;
            }
            n4 = -1;
        }
        if (n4 == n7) {
            return ((Sb3$a)object).c;
        }
        object = (Sb3$b)((Sb3$a)object).b.get(n4);
        return ((Sb3$b)object).e;
    }
}

