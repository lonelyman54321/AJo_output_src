/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout
 *  android.text.TextUtils
 */
import android.text.Layout;
import android.text.TextUtils;
import java.io.Serializable;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Cp1
 */
public final class cp1_0 {
    public final Layout a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;

    public cp1_0(Layout object) {
        Object object2;
        int n3;
        this.a = object;
        int n4 = 0;
        int n7 = 0;
        ArrayList<Object> arrayList = null;
        do {
            int n8;
            char c2;
            if ((n7 = StringsKt.N((CharSequence)(object2 = this.a.getText()), c2 = '\n', n7, false, n8 = 4)) < 0) {
                arrayList = this.a.getText();
                n7 = arrayList.length();
            } else {
                ++n7;
            }
            object2 = n7;
            object.add(object2);
        } while (n7 < (n3 = (object2 = this.a.getText()).length()));
        this.b = object;
        int n10 = object.size();
        arrayList = new ArrayList<Object>(n10);
        while (n4 < n10) {
            n3 = 0;
            object2 = null;
            arrayList.add(null);
            ++n4;
        }
        this.c = arrayList;
        object = new boolean[this.b.size()];
        this.d = (boolean[])object;
        this.b.size();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Bidi a(int n3) {
        void var12_20;
        void var12_17;
        int n4;
        Object object;
        ArrayList arrayList;
        block11: {
            int n7;
            block10: {
                int n8;
                void var10_12;
                int n10;
                boolean[] blArray = this.d;
                n7 = blArray[n3];
                arrayList = this.c;
                if (n7 != 0) {
                    return (Bidi)arrayList.get(n3);
                }
                object = this.b;
                int n14 = 0;
                if (n3 == 0) {
                    n4 = 0;
                    Object var8_8 = null;
                } else {
                    n4 = n3 + -1;
                    Number number = (Number)((ArrayList)object).get(n4);
                    n4 = number.intValue();
                }
                object = (Number)((ArrayList)object).get(n3);
                n7 = ((Number)object).intValue();
                int n15 = n7 - n4;
                char[] cArray = this.e;
                if (cArray == null || (n10 = cArray.length) < n15) {
                    char[] cArray2 = new char[n15];
                }
                var12_17 = var10_12;
                Layout layout2 = this.a;
                CharSequence charSequence = layout2.getText();
                TextUtils.getChars((CharSequence)charSequence, (int)n4, (int)n7, (char[])var12_17, (int)0);
                n7 = Bidi.requiresBidi((char[])var12_17, 0, n15) ? 1 : 0;
                n4 = 1;
                if (n7 == 0) break block10;
                n7 = this.e(n3);
                n7 = layout2.getLineForOffset(n7);
                int n16 = (n7 = layout2.getParagraphDirection(n7)) == (n8 = -1) ? 1 : 0;
                Object object2 = object;
                charSequence = var12_17;
                object = new Bidi((char[])var12_17, 0, null, 0, n15, n16);
                n14 = ((Bidi)object).getRunCount();
                if (n14 != n4) break block11;
            }
            n7 = 0;
            object = null;
        }
        arrayList.set(n3, object);
        blArray[n3] = n4;
        if (object != null) {
            char[] cArray = this.e;
            if (var12_17 == cArray) {
                Object var12_18 = null;
            } else {
                char[] cArray3 = cArray;
            }
        }
        this.e = var12_20;
        return object;
    }

    public final float b(int n3, boolean bl2) {
        Layout layout2 = this.a;
        int n4 = layout2.getLineForOffset(n3);
        if (n3 > (n4 = layout2.getLineEnd(n4))) {
            n3 = n4;
        }
        float f5 = bl2 ? layout2.getPrimaryHorizontal(n3) : layout2.getSecondaryHorizontal(n3);
        return f5;
    }

    public final float c(int n3, boolean bl2, boolean n4) {
        CharSequence charSequence;
        int n7;
        cp1_0 cp1_02 = this;
        int n8 = n3;
        int n10 = n4;
        if (n4 == 0) {
            return this.b(n3, bl2);
        }
        Layout layout2 = this.a;
        int n14 = te3_0.b(layout2, n3, n4 != 0);
        int n15 = layout2.getLineStart(n14);
        int n16 = layout2.getLineEnd(n14);
        if (n3 != n15 && n3 != n16) {
            return this.b(n3, bl2);
        }
        if (n8 != 0 && n8 != (n7 = (charSequence = layout2.getText()).length())) {
            n10 = cp1_02.d(n8, n10 != 0);
            n7 = cp1_02.e(n10);
            n7 = layout2.getLineForOffset(n7);
            n7 = layout2.getParagraphDirection(n7);
            int n17 = -1;
            int n18 = 1;
            if (n7 == n17) {
                n7 = 1;
            } else {
                n7 = 0;
                charSequence = null;
            }
            n16 = cp1_02.f(n16, n15);
            int n19 = cp1_02.e(n10);
            int n20 = n15 - n19;
            n19 = n16 - n19;
            Object object = cp1_02.a(n10);
            if (object != null) {
                object = ((Bidi)object).createLineBidi(n20, n19);
            } else {
                n10 = 0;
                object = null;
            }
            if (object != null && (n19 = ((Bidi)object).getRunCount()) != n18) {
                int n21;
                Object[] objectArray;
                block24: {
                    int n22;
                    n19 = ((Bidi)object).getRunCount();
                    objectArray = new Cp1$a[n19];
                    for (n22 = 0; n22 < n19; ++n22) {
                        int n24 = ((Bidi)object).getRunStart(n22) + n15;
                        n17 = ((Bidi)object).getRunLimit(n22) + n15;
                        int n25 = ((Bidi)object).getRunLevel(n22);
                        n21 = n25 % 2;
                        n21 = n21 == n18 ? 1 : 0;
                        Cp1$a cp1$a = new Cp1$a(n24, n17, n21 != 0);
                        objectArray[n22] = cp1$a;
                        n17 = -1;
                    }
                    n21 = ((Bidi)object).getRunCount();
                    byte[] byArray = new byte[n21];
                    for (n22 = 0; n22 < n21; ++n22) {
                        byte by2;
                        byArray[n22] = by2 = (byte)((Bidi)object).getRunLevel(n22);
                    }
                    n22 = 0;
                    Bidi.reorderVisually(byArray, 0, objectArray, 0, n19);
                    object = "<this>";
                    if (n8 == n15) {
                        block23: {
                            for (n15 = 0; n15 < n19; ++n15) {
                                Object object2 = objectArray[n15];
                                n16 = ((Cp1$a)object2).a;
                                if (n16 != n8) continue;
                                n17 = n15;
                                break block23;
                            }
                            n17 = -1;
                        }
                        Object object3 = objectArray[n17];
                        n21 = !bl2 && n7 != (n8 = (int)(((Cp1$a)object3).c ? 1 : 0)) ? n7 : (n7 == 0 ? 1 : 0);
                        if (n17 == 0 && n21 != 0) {
                            return layout2.getLineLeft(n14);
                        }
                        Intrinsics.checkNotNullParameter(objectArray, (String)object);
                        if (n17 == (n19 -= n18) && n21 == 0) {
                            return layout2.getLineRight(n14);
                        }
                        if (n21 != 0) {
                            n8 = ((Cp1$a)objectArray[n17 -= n18]).a;
                            return layout2.getPrimaryHorizontal(n8);
                        }
                        n8 = ((Cp1$a)objectArray[n17 += n18]).a;
                        return layout2.getPrimaryHorizontal(n8);
                    }
                    if (n8 > n16) {
                        n8 = cp1_02.f(n8, n15);
                    }
                    for (n15 = 0; n15 < n19; ++n15) {
                        Object object4 = objectArray[n15];
                        n16 = ((Cp1$a)object4).b;
                        if (n16 != n8) continue;
                        n17 = n15;
                        break block24;
                    }
                    n17 = -1;
                }
                Object object5 = objectArray[n17];
                n21 = !bl2 && n7 != (n8 = (int)(((Cp1$a)object5).c ? 1 : 0)) ? (n7 == 0 ? 1 : 0) : n7;
                if (n17 == 0 && n21 != 0) {
                    return layout2.getLineLeft(n14);
                }
                Intrinsics.checkNotNullParameter(objectArray, (String)object);
                if (n17 == (n19 -= n18) && n21 == 0) {
                    return layout2.getLineRight(n14);
                }
                if (n21 != 0) {
                    n8 = ((Cp1$a)objectArray[n17 -= n18]).b;
                    return layout2.getPrimaryHorizontal(n8);
                }
                n8 = ((Cp1$a)objectArray[n17 += n18]).b;
                return layout2.getPrimaryHorizontal(n8);
            }
            boolean bl3 = false;
            n10 = layout2.isRtlCharAt(n15) ? 1 : 0;
            if (bl2 || n7 == n10) {
                if (n7 == 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    charSequence = null;
                }
            }
            int n26 = n8 == n15 ? n7 : (n7 == 0 ? 1 : 0);
            float f5 = n26 != 0 ? layout2.getLineLeft(n14) : layout2.getLineRight(n14);
            return f5;
        }
        return this.b(n3, bl2);
    }

    public final int d(int n3, boolean bl2) {
        int n4;
        Serializable serializable = this.b;
        Integer n7 = n3;
        int n8 = xx_2.e((List)((Object)serializable), n7);
        n8 = n8 < 0 ? -(n8 + 1) : ++n8;
        if (bl2 && n8 > 0 && n3 == (n4 = ((Number)(serializable = (Number)((ArrayList)serializable).get((bl2 = n8 + -1) ? 1 : 0))).intValue())) {
            return bl2 ? 1 : 0;
        }
        return n8;
    }

    public final int e(int n3) {
        if (n3 == 0) {
            n3 = 0;
            Object var2_2 = null;
        } else {
            ArrayList arrayList = this.b;
            Number number = (Number)arrayList.get(n3 += -1);
            n3 = number.intValue();
        }
        return n3;
    }

    public final int f(int n3, int n4) {
        while (n3 > n4) {
            CharSequence charSequence = this.a.getText();
            int n7 = n3 + -1;
            char c2 = charSequence.charAt(n7);
            if (c2 != (n7 = 32) && c2 != (n7 = 10) && c2 != (n7 = 5760) && ((n7 = Intrinsics.compare(c2, 8192)) < 0 || (n7 = Intrinsics.compare(c2, 8202)) > 0 || c2 == (n7 = 8199)) && c2 != (n7 = 8287) && c2 != (n7 = 12288)) break;
            n3 += -1;
        }
        return n3;
    }
}

