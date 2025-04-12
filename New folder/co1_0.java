/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Renamed from co1
 */
public final class co1_0 {
    public static final HashMap b;
    public final HashMap a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        HashMap<String, Object> hashMap;
        b = hashMap = new HashMap<String, Object>();
        String string2 = "KeyAttribute";
        Object object = sn1_0.class;
        try {
            object = ((Class)object).getConstructor(null);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return;
        }
        hashMap.put(string2, object);
        string2 = "KeyPosition";
        object = no1_0.class;
        object = ((Class)object).getConstructor(null);
        hashMap.put(string2, object);
        string2 = "KeyCycle";
        object = vn1_1.class;
        object = ((Class)object).getConstructor(null);
        hashMap.put(string2, object);
        string2 = "KeyTimeCycle";
        object = po1_0.class;
        object = ((Class)object).getConstructor(null);
        hashMap.put(string2, object);
        string2 = "KeyTrigger";
        object = qo1_1.class;
        object = ((Class)object).getConstructor(null);
        hashMap.put(string2, object);
    }

    public co1_0() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public co1_0(Context var1_1, XmlResourceParser var2_2) {
        super();
        var3_3 = new HashMap();
        this.a = var3_3;
        var4_4 = var2_2.getEventType();
        var5_5 = 0;
        var6_6 = null;
        while (var4_4 != (var7_7 = 1)) {
            block44: {
                block42: {
                    block46: {
                        block47: {
                            block48: {
                                block49: {
                                    block50: {
                                        block43: {
                                            block45: {
                                                var8_8 = 3;
                                                var9_9 = 2;
                                                if (var4_4 == var9_9) break block45;
                                                if (var4_4 != var8_8) ** GOTO lbl143
                                                var3_3 = "KeyFrameSet";
                                                var10_10 = var2_2.getName();
                                                var4_4 = (int)var3_3.equals(var10_10);
                                                if (var4_4 != 0) {
                                                    return;
                                                }
                                                ** GOTO lbl143
                                            }
                                            var3_3 = var2_2.getName();
                                            var11_11 = co1_0.b;
                                            var12_12 = var11_11.containsKey(var3_3);
                                            if (var12_12 == 0) break block42;
                                            var5_5 = var3_3.hashCode();
                                            var12_12 = 4;
                                            switch (var5_5) {
                                                default: {
                                                    break;
                                                }
                                                case 1308496505: {
                                                    var6_6 = "KeyTrigger";
                                                    var5_5 = (int)var3_3.equals(var6_6);
                                                    if (var5_5 == 0) break;
                                                    var5_5 = 4;
                                                    break block43;
                                                }
                                                case 1153397896: {
                                                    var6_6 = "KeyPosition";
                                                    var5_5 = (int)var3_3.equals(var6_6);
                                                    if (var5_5 == 0) break;
                                                    var5_5 = 1;
                                                    break block43;
                                                }
                                                case 540053991: {
                                                    var6_6 = "KeyCycle";
                                                    var5_5 = (int)var3_3.equals(var6_6);
                                                    if (var5_5 == 0) break;
                                                    var5_5 = 2;
                                                    break block43;
                                                }
                                                case -298435811: {
                                                    var6_6 = "KeyAttribute";
                                                    var5_5 = (int)var3_3.equals(var6_6);
                                                    if (var5_5 == 0) break;
                                                    var5_5 = 0;
                                                    var6_6 = null;
                                                    break block43;
                                                }
                                                case -300573030: {
                                                    var6_6 = "KeyTimeCycle";
                                                    var5_5 = (int)var3_3.equals(var6_6);
                                                    if (var5_5 == 0) break;
                                                    var5_5 = 3;
                                                    break block43;
                                                }
                                            }
                                            var5_5 = -1;
                                        }
                                        if (var5_5 == 0) break block46;
                                        if (var5_5 == var7_7) break block47;
                                        if (var5_5 == var9_9) break block48;
                                        if (var5_5 == var8_8) break block49;
                                        if (var5_5 != var12_12) break block50;
                                        var3_3 = new qo1_1();
                                        ** GOTO lbl114
                                    }
                                    super();
                                    var6_6 = "Key ";
                                    var2_2.append((String)var6_6);
                                    var2_2.append((String)var3_3);
                                    var3_3 = " not found";
                                    var2_2.append((String)var3_3);
                                    var2_2 = var2_2.toString();
                                    super((String)var2_2);
                                    throw var1_1 /* !! */ ;
                                }
                                var3_3 = new po1_0();
                                ** GOTO lbl114
                            }
                            var3_3 = new vn1_1();
                            ** GOTO lbl114
                        }
                        var3_3 = new no1_0();
                        ** GOTO lbl114
                    }
                    var3_3 = new sn1_0();
lbl114:
                    // 5 sources

                    var6_6 = Xml.asAttributeSet((XmlPullParser)var2_2);
                    var3_3.e(var1_1 /* !! */ , (AttributeSet)var6_6);
                    this.b((Pn1)var3_3);
                    var6_6 = var3_3;
                    ** GOTO lbl143
                }
                var10_10 = "CustomAttribute";
                var7_7 = (int)var3_3.equalsIgnoreCase(var10_10);
                if (var7_7 == 0) break block44;
                if (var6_6 == null) ** GOTO lbl143
                var3_3 = var6_6.d;
                if (var3_3 == null) ** GOTO lbl143
                androidx.constraintlayout.widget.a.d(var1_1 /* !! */ , (XmlResourceParser)var2_2, (HashMap)var3_3);
                ** GOTO lbl143
            }
            var10_10 = "CustomMethod";
            var4_4 = (int)var3_3.equalsIgnoreCase(var10_10);
            if (var4_4 == 0 || var6_6 == null) ** GOTO lbl143
            var3_3 = var6_6.d;
            if (var3_3 == null) ** GOTO lbl143
            try {
                androidx.constraintlayout.widget.a.d(var1_1 /* !! */ , (XmlResourceParser)var2_2, (HashMap)var3_3);
lbl143:
                // 9 sources

                var4_4 = var2_2.next();
                continue;
            }
            catch (IOException | XmlPullParserException v0) {}
            break;
        }
    }

    public final void a(fQ1 fQ12) {
        Object object;
        int n3 = fQ12.c;
        Object object2 = n3;
        Object object3 = this.a;
        if ((object2 = (ArrayList)((HashMap)object3).get(object2)) != null) {
            object = fQ12.w;
            ((ArrayList)object).addAll(object2);
        }
        n3 = -1;
        object2 = n3;
        if ((object2 = (ArrayList)((HashMap)object3).get(object2)) != null) {
            boolean bl2;
            object2 = ((ArrayList)object2).iterator();
            while (bl2 = object2.hasNext()) {
                boolean bl3;
                object3 = (Pn1)object2.next();
                object = ((ConstraintLayout$LayoutParams)fQ12.b.getLayoutParams()).Y;
                String string2 = ((Pn1)object3).c;
                if (string2 != null && object != null) {
                    bl3 = ((String)object).matches(string2);
                } else {
                    bl3 = false;
                    object = null;
                }
                if (!bl3) continue;
                fQ12.a((Pn1)object3);
            }
        }
    }

    public final void b(Pn1 pn1) {
        HashMap hashMap = this.a;
        Serializable serializable = Integer.valueOf(pn1.b);
        int n3 = hashMap.containsKey(serializable);
        if (n3 == 0) {
            n3 = pn1.b;
            serializable = Integer.valueOf(n3);
            ArrayList arrayList = new ArrayList();
            hashMap.put(serializable, arrayList);
        }
        n3 = pn1.b;
        serializable = Integer.valueOf(n3);
        if ((serializable = (ArrayList)hashMap.get(serializable)) != null) {
            ((ArrayList)serializable).add(pn1);
        }
    }
}

